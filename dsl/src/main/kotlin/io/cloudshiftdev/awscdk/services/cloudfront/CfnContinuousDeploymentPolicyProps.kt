package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
        CfnContinuousDeploymentPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContinuousDeploymentPolicyProps):
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps
  }
}
