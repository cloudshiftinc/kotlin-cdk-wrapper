@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for looking up an existing DatabaseCluster.
 *
 * Example:
 *
 * ```
 * Role myUserRole;
 * IDatabaseCluster clusterFromLookup = DatabaseCluster.fromLookup(this, "ClusterFromLookup",
 * DatabaseClusterLookupOptions.builder()
 * .clusterIdentifier("my-cluster-id")
 * .build());
 * // Grant a connection
 * clusterFromLookup.grantConnect(myUserRole, "my-user-id");
 * ```
 */
public interface DatabaseClusterLookupOptions {
  /**
   * The cluster identifier of the DatabaseCluster.
   */
  public fun clusterIdentifier(): String

  /**
   * A builder for [DatabaseClusterLookupOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clusterIdentifier The cluster identifier of the DatabaseCluster. 
     */
    public fun clusterIdentifier(clusterIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseClusterLookupOptions.Builder
        = software.amazon.awscdk.services.rds.DatabaseClusterLookupOptions.builder()

    /**
     * @param clusterIdentifier The cluster identifier of the DatabaseCluster. 
     */
    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.rds.DatabaseClusterLookupOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterLookupOptions,
  ) : CdkObject(cdkObject),
      DatabaseClusterLookupOptions {
    /**
     * The cluster identifier of the DatabaseCluster.
     */
    override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseClusterLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterLookupOptions):
        DatabaseClusterLookupOptions = CdkObjectWrappers.wrap(cdkObject) as?
        DatabaseClusterLookupOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseClusterLookupOptions):
        software.amazon.awscdk.services.rds.DatabaseClusterLookupOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.DatabaseClusterLookupOptions
  }
}
