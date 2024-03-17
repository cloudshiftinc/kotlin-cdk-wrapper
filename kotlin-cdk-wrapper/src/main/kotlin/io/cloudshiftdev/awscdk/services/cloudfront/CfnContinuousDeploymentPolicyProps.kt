@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnContinuousDeploymentPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnContinuousDeploymentPolicyProps cfnContinuousDeploymentPolicyProps =
 * CfnContinuousDeploymentPolicyProps.builder()
 * .continuousDeploymentPolicyConfig(ContinuousDeploymentPolicyConfigProperty.builder()
 * .enabled(false)
 * .stagingDistributionDnsNames(List.of("stagingDistributionDnsNames"))
 * // the properties below are optional
 * .singleHeaderPolicyConfig(SingleHeaderPolicyConfigProperty.builder()
 * .header("header")
 * .value("value")
 * .build())
 * .singleWeightPolicyConfig(SingleWeightPolicyConfigProperty.builder()
 * .weight(123)
 * // the properties below are optional
 * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
 * .idleTtl(123)
 * .maximumTtl(123)
 * .build())
 * .build())
 * .trafficConfig(TrafficConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .singleHeaderConfig(SingleHeaderConfigProperty.builder()
 * .header("header")
 * .value("value")
 * .build())
 * .singleWeightConfig(SingleWeightConfigProperty.builder()
 * .weight(123)
 * // the properties below are optional
 * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
 * .idleTtl(123)
 * .maximumTtl(123)
 * .build())
 * .build())
 * .build())
 * .type("type")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html)
 */
public interface CfnContinuousDeploymentPolicyProps {
  /**
   * Contains the configuration for a continuous deployment policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig)
   */
  public fun continuousDeploymentPolicyConfig(): Any

  /**
   * A builder for [CfnContinuousDeploymentPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous
     * deployment policy. 
     */
    public fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: IResolvable)

    /**
     * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous
     * deployment policy. 
     */
    public
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty)

    /**
     * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous
     * deployment policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("819d2076ae0e872b4d25846b0584f381602ec4d733c5327f8a61ae31e2819c9b")
    public
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps.builder()

    /**
     * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous
     * deployment policy. 
     */
    override fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: IResolvable) {
      cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig.let(IResolvable::unwrap))
    }

    /**
     * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous
     * deployment policy. 
     */
    override
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty) {
      cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig.let(CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty::unwrap))
    }

    /**
     * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous
     * deployment policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("819d2076ae0e872b4d25846b0584f381602ec4d733c5327f8a61ae31e2819c9b")
    override
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        continuousDeploymentPolicyConfig(CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty(continuousDeploymentPolicyConfig))

    public fun build():
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps,
  ) : CdkObject(cdkObject), CfnContinuousDeploymentPolicyProps {
    /**
     * Contains the configuration for a continuous deployment policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig)
     */
    override fun continuousDeploymentPolicyConfig(): Any =
        unwrap(this).getContinuousDeploymentPolicyConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContinuousDeploymentPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps):
        CfnContinuousDeploymentPolicyProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnContinuousDeploymentPolicyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContinuousDeploymentPolicyProps):
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps
  }
}
