package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnOriginRequestPolicyProps {
  /**
   * The origin request policy configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originrequestpolicy.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig)
   */
  public fun originRequestPolicyConfig(): Any

  /**
   * A builder for [CfnOriginRequestPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param originRequestPolicyConfig The origin request policy configuration. 
     */
    public fun originRequestPolicyConfig(originRequestPolicyConfig: IResolvable)

    /**
     * @param originRequestPolicyConfig The origin request policy configuration. 
     */
    public
        fun originRequestPolicyConfig(originRequestPolicyConfig: CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty)

    /**
     * @param originRequestPolicyConfig The origin request policy configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4982562ca569c3fdd76b6317d4458aa682e55ca7380b5c18d73f336307cf195a")
    public
        fun originRequestPolicyConfig(originRequestPolicyConfig: CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps.builder()

    /**
     * @param originRequestPolicyConfig The origin request policy configuration. 
     */
    override fun originRequestPolicyConfig(originRequestPolicyConfig: IResolvable) {
      cdkBuilder.originRequestPolicyConfig(originRequestPolicyConfig.let(IResolvable::unwrap))
    }

    /**
     * @param originRequestPolicyConfig The origin request policy configuration. 
     */
    override
        fun originRequestPolicyConfig(originRequestPolicyConfig: CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty) {
      cdkBuilder.originRequestPolicyConfig(originRequestPolicyConfig.let(CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty::unwrap))
    }

    /**
     * @param originRequestPolicyConfig The origin request policy configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4982562ca569c3fdd76b6317d4458aa682e55ca7380b5c18d73f336307cf195a")
    override
        fun originRequestPolicyConfig(originRequestPolicyConfig: CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        originRequestPolicyConfig(CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty(originRequestPolicyConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps,
  ) : CdkObject(cdkObject), CfnOriginRequestPolicyProps {
    /**
     * The origin request policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originrequestpolicy.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig)
     */
    override fun originRequestPolicyConfig(): Any = unwrap(this).getOriginRequestPolicyConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOriginRequestPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps):
        CfnOriginRequestPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOriginRequestPolicyProps):
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps
  }
}
