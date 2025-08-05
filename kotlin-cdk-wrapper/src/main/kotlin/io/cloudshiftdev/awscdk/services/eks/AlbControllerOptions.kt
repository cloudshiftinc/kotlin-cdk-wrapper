@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Options for `AlbController`.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.cdk.lambdalayer.kubectl.v33.KubectlV33Layer;
 * Cluster.Builder.create(this, "HelloEKS")
 * .version(KubernetesVersion.V1_33)
 * .albController(AlbControllerOptions.builder()
 * .version(AlbControllerVersion.V2_8_2)
 * .build())
 * .kubectlLayer(new KubectlV33Layer(this, "kubectl"))
 * .build();
 * ```
 */
public interface AlbControllerOptions {
  /**
   * Additional helm chart values for ALB controller.
   *
   * Default: - no additional helm chart values
   */
  public fun additionalHelmChartValues(): AlbControllerHelmChartOptions? =
      unwrap(this).getAdditionalHelmChartValues()?.let(AlbControllerHelmChartOptions::wrap)

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
  public fun policy(): Any? = unwrap(this).getPolicy()

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
  public fun repository(): String? = unwrap(this).getRepository()

  /**
   * Version of the controller.
   */
  public fun version(): AlbControllerVersion

  /**
   * A builder for [AlbControllerOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalHelmChartValues Additional helm chart values for ALB controller.
     */
    public fun additionalHelmChartValues(additionalHelmChartValues: AlbControllerHelmChartOptions)

    /**
     * @param additionalHelmChartValues Additional helm chart values for ALB controller.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b99cfb45717343677edd410c377f4be1c3e79611a4c5e02f22f7db2a6cf4563")
    public
        fun additionalHelmChartValues(additionalHelmChartValues: AlbControllerHelmChartOptions.Builder.() -> Unit)

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
    private val cdkBuilder: software.amazon.awscdk.services.eks.AlbControllerOptions.Builder =
        software.amazon.awscdk.services.eks.AlbControllerOptions.builder()

    /**
     * @param additionalHelmChartValues Additional helm chart values for ALB controller.
     */
    override
        fun additionalHelmChartValues(additionalHelmChartValues: AlbControllerHelmChartOptions) {
      cdkBuilder.additionalHelmChartValues(additionalHelmChartValues.let(AlbControllerHelmChartOptions.Companion::unwrap))
    }

    /**
     * @param additionalHelmChartValues Additional helm chart values for ALB controller.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b99cfb45717343677edd410c377f4be1c3e79611a4c5e02f22f7db2a6cf4563")
    override
        fun additionalHelmChartValues(additionalHelmChartValues: AlbControllerHelmChartOptions.Builder.() -> Unit):
        Unit = additionalHelmChartValues(AlbControllerHelmChartOptions(additionalHelmChartValues))

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

    public fun build(): software.amazon.awscdk.services.eks.AlbControllerOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.AlbControllerOptions,
  ) : CdkObject(cdkObject),
      AlbControllerOptions {
    /**
     * Additional helm chart values for ALB controller.
     *
     * Default: - no additional helm chart values
     */
    override fun additionalHelmChartValues(): AlbControllerHelmChartOptions? =
        unwrap(this).getAdditionalHelmChartValues()?.let(AlbControllerHelmChartOptions::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): AlbControllerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AlbControllerOptions):
        AlbControllerOptions = CdkObjectWrappers.wrap(cdkObject) as? AlbControllerOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlbControllerOptions):
        software.amazon.awscdk.services.eks.AlbControllerOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.AlbControllerOptions
  }
}
