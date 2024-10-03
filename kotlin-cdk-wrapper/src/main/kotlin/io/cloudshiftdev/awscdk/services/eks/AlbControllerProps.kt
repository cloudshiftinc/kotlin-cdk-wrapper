@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for `AlbController`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * AlbControllerVersion albControllerVersion;
 * Cluster cluster;
 * Object policy;
 * AlbControllerProps albControllerProps = AlbControllerProps.builder()
 * .cluster(cluster)
 * .version(albControllerVersion)
 * // the properties below are optional
 * .policy(policy)
 * .repository("repository")
 * .build();
 * ```
 */
public interface AlbControllerProps : AlbControllerOptions {
  /**
   * [disable-awslint:ref-via-interface] Cluster to install the controller onto.
   */
  public fun cluster(): Cluster

  /**
   * A builder for [AlbControllerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cluster [disable-awslint:ref-via-interface] Cluster to install the controller onto. 
     */
    public fun cluster(cluster: Cluster)

    /**
     * @param policy The IAM policy to apply to the service account.
     * If you're using one of the built-in versions, this is not required since
     * CDK ships with the appropriate policies for those versions.
     *
     * However, if you are using a custom version, this is required (and validated).
     */
    public fun policy(policy: Any)

    /**
     * @param repository The repository to pull the controller image from.
     * Note that the default repository works for most regions, but not all.
     * If the repository is not applicable to your region, use a custom repository
     * according to the information here:
     * https://github.com/kubernetes-sigs/aws-load-balancer-controller/releases.
     */
    public fun repository(repository: String)

    /**
     * @param version Version of the controller. 
     */
    public fun version(version: AlbControllerVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AlbControllerProps.Builder =
        software.amazon.awscdk.services.eks.AlbControllerProps.builder()

    /**
     * @param cluster [disable-awslint:ref-via-interface] Cluster to install the controller onto. 
     */
    override fun cluster(cluster: Cluster) {
      cdkBuilder.cluster(cluster.let(Cluster.Companion::unwrap))
    }

    /**
     * @param policy The IAM policy to apply to the service account.
     * If you're using one of the built-in versions, this is not required since
     * CDK ships with the appropriate policies for those versions.
     *
     * However, if you are using a custom version, this is required (and validated).
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * @param repository The repository to pull the controller image from.
     * Note that the default repository works for most regions, but not all.
     * If the repository is not applicable to your region, use a custom repository
     * according to the information here:
     * https://github.com/kubernetes-sigs/aws-load-balancer-controller/releases.
     */
    override fun repository(repository: String) {
      cdkBuilder.repository(repository)
    }

    /**
     * @param version Version of the controller. 
     */
    override fun version(version: AlbControllerVersion) {
      cdkBuilder.version(version.let(AlbControllerVersion.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.AlbControllerProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.AlbControllerProps,
  ) : CdkObject(cdkObject),
      AlbControllerProps {
    /**
     * [disable-awslint:ref-via-interface] Cluster to install the controller onto.
     */
    override fun cluster(): Cluster = unwrap(this).getCluster().let(Cluster::wrap)

    /**
     * The IAM policy to apply to the service account.
     *
     * If you're using one of the built-in versions, this is not required since
     * CDK ships with the appropriate policies for those versions.
     *
     * However, if you are using a custom version, this is required (and validated).
     *
     * Default: - Corresponds to the predefined version.
     */
    override fun policy(): Any? = unwrap(this).getPolicy()

    /**
     * The repository to pull the controller image from.
     *
     * Note that the default repository works for most regions, but not all.
     * If the repository is not applicable to your region, use a custom repository
     * according to the information here:
     * https://github.com/kubernetes-sigs/aws-load-balancer-controller/releases.
     *
     * Default: '602401143452.dkr.ecr.us-west-2.amazonaws.com/amazon/aws-load-balancer-controller'
     */
    override fun repository(): String? = unwrap(this).getRepository()

    /**
     * Version of the controller.
     */
    override fun version(): AlbControllerVersion =
        unwrap(this).getVersion().let(AlbControllerVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlbControllerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AlbControllerProps):
        AlbControllerProps = CdkObjectWrappers.wrap(cdkObject) as? AlbControllerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlbControllerProps):
        software.amazon.awscdk.services.eks.AlbControllerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.AlbControllerProps
  }
}
