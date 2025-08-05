@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Helm chart options that can be set for AlbControllerChart To add any new supported values refer
 * https://github.com/kubernetes-sigs/aws-load-balancer-controller/blob/main/helm/aws-load-balancer-controller/values.yaml.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.cdk.lambdalayer.kubectl.v33.KubectlV33Layer;
 * Cluster.Builder.create(this, "HelloEKS")
 * .version(KubernetesVersion.V1_33)
 * .albController(AlbControllerOptions.builder()
 * .version(AlbControllerVersion.V2_8_2)
 * .additionalHelmChartValues(AlbControllerHelmChartOptions.builder()
 * .enableWafv2(false)
 * .build())
 * .build())
 * .kubectlLayer(new KubectlV33Layer(this, "kubectl"))
 * .build();
 * ```
 */
public interface AlbControllerHelmChartOptions {
  /**
   * Enable or disable AWS WAF on the ALB ingress controller.
   *
   * Default: - no value defined for this helm chart option, so it will not be set in the helm chart
   * values
   */
  public fun enableWaf(): Boolean? = unwrap(this).getEnableWaf()

  /**
   * Enable or disable AWS WAFv2 on the ALB ingress controller.
   *
   * Default: - no value defined for this helm chart option, so it will not be set in the helm chart
   * values
   */
  public fun enableWafv2(): Boolean? = unwrap(this).getEnableWafv2()

  /**
   * A builder for [AlbControllerHelmChartOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enableWaf Enable or disable AWS WAF on the ALB ingress controller.
     */
    public fun enableWaf(enableWaf: Boolean)

    /**
     * @param enableWafv2 Enable or disable AWS WAFv2 on the ALB ingress controller.
     */
    public fun enableWafv2(enableWafv2: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.eks.AlbControllerHelmChartOptions.Builder =
        software.amazon.awscdk.services.eks.AlbControllerHelmChartOptions.builder()

    /**
     * @param enableWaf Enable or disable AWS WAF on the ALB ingress controller.
     */
    override fun enableWaf(enableWaf: Boolean) {
      cdkBuilder.enableWaf(enableWaf)
    }

    /**
     * @param enableWafv2 Enable or disable AWS WAFv2 on the ALB ingress controller.
     */
    override fun enableWafv2(enableWafv2: Boolean) {
      cdkBuilder.enableWafv2(enableWafv2)
    }

    public fun build(): software.amazon.awscdk.services.eks.AlbControllerHelmChartOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.AlbControllerHelmChartOptions,
  ) : CdkObject(cdkObject),
      AlbControllerHelmChartOptions {
    /**
     * Enable or disable AWS WAF on the ALB ingress controller.
     *
     * Default: - no value defined for this helm chart option, so it will not be set in the helm
     * chart values
     */
    override fun enableWaf(): Boolean? = unwrap(this).getEnableWaf()

    /**
     * Enable or disable AWS WAFv2 on the ALB ingress controller.
     *
     * Default: - no value defined for this helm chart option, so it will not be set in the helm
     * chart values
     */
    override fun enableWafv2(): Boolean? = unwrap(this).getEnableWafv2()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlbControllerHelmChartOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AlbControllerHelmChartOptions):
        AlbControllerHelmChartOptions = CdkObjectWrappers.wrap(cdkObject) as?
        AlbControllerHelmChartOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlbControllerHelmChartOptions):
        software.amazon.awscdk.services.eks.AlbControllerHelmChartOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.AlbControllerHelmChartOptions
  }
}
