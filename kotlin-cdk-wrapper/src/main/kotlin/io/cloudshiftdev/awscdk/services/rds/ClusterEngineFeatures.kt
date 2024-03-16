@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Represents Database Engine features.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * ClusterEngineFeatures clusterEngineFeatures = ClusterEngineFeatures.builder()
 * .s3Export("s3Export")
 * .s3Import("s3Import")
 * .build();
 * ```
 */
public interface ClusterEngineFeatures {
  /**
   * Feature name for the DB instance that the IAM role to export to S3 bucket is to be associated
   * with.
   *
   * Default: - no s3Export feature name
   */
  public fun s3Export(): String? = unwrap(this).getS3Export()

  /**
   * Feature name for the DB instance that the IAM role to access the S3 bucket for import is to be
   * associated with.
   *
   * Default: - no s3Import feature name
   */
  public fun s3Import(): String? = unwrap(this).getS3Import()

  /**
   * A builder for [ClusterEngineFeatures]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param s3Export Feature name for the DB instance that the IAM role to export to S3 bucket is
     * to be associated with.
     */
    public fun s3Export(s3Export: String)

    /**
     * @param s3Import Feature name for the DB instance that the IAM role to access the S3 bucket
     * for import is to be associated with.
     */
    public fun s3Import(s3Import: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ClusterEngineFeatures.Builder =
        software.amazon.awscdk.services.rds.ClusterEngineFeatures.builder()

    /**
     * @param s3Export Feature name for the DB instance that the IAM role to export to S3 bucket is
     * to be associated with.
     */
    override fun s3Export(s3Export: String) {
      cdkBuilder.s3Export(s3Export)
    }

    /**
     * @param s3Import Feature name for the DB instance that the IAM role to access the S3 bucket
     * for import is to be associated with.
     */
    override fun s3Import(s3Import: String) {
      cdkBuilder.s3Import(s3Import)
    }

    public fun build(): software.amazon.awscdk.services.rds.ClusterEngineFeatures =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.ClusterEngineFeatures,
  ) : CdkObject(cdkObject), ClusterEngineFeatures {
    /**
     * Feature name for the DB instance that the IAM role to export to S3 bucket is to be associated
     * with.
     *
     * Default: - no s3Export feature name
     */
    override fun s3Export(): String? = unwrap(this).getS3Export()

    /**
     * Feature name for the DB instance that the IAM role to access the S3 bucket for import is to
     * be associated with.
     *
     * Default: - no s3Import feature name
     */
    override fun s3Import(): String? = unwrap(this).getS3Import()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterEngineFeatures {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ClusterEngineFeatures):
        ClusterEngineFeatures = CdkObjectWrappers.wrap(cdkObject) as ClusterEngineFeatures

    internal fun unwrap(wrapped: ClusterEngineFeatures):
        software.amazon.awscdk.services.rds.ClusterEngineFeatures = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.ClusterEngineFeatures
  }
}
