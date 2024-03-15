@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

/**
 * Configuration props for the AwsAuth construct.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * Cluster cluster;
 * AwsAuthProps awsAuthProps = AwsAuthProps.builder()
 * .cluster(cluster)
 * .build();
 * ```
 */
public interface AwsAuthProps {
  /**
   * The EKS cluster to apply this configuration to.
   *
   * [disable-awslint:ref-via-interface]
   */
  public fun cluster(): Cluster

  /**
   * A builder for [AwsAuthProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cluster The EKS cluster to apply this configuration to. 
     * [disable-awslint:ref-via-interface]
     */
    public fun cluster(cluster: Cluster)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AwsAuthProps.Builder =
        software.amazon.awscdk.services.eks.AwsAuthProps.builder()

    /**
     * @param cluster The EKS cluster to apply this configuration to. 
     * [disable-awslint:ref-via-interface]
     */
    override fun cluster(cluster: Cluster) {
      cdkBuilder.cluster(cluster.let(Cluster::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.AwsAuthProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.AwsAuthProps,
  ) : CdkObject(cdkObject), AwsAuthProps {
    /**
     * The EKS cluster to apply this configuration to.
     *
     * [disable-awslint:ref-via-interface]
     */
    override fun cluster(): Cluster = unwrap(this).getCluster().let(Cluster::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsAuthProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AwsAuthProps): AwsAuthProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsAuthProps): software.amazon.awscdk.services.eks.AwsAuthProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.eks.AwsAuthProps
  }
}
