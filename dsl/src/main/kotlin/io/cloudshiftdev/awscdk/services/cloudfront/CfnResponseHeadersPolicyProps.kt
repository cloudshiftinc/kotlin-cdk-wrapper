package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnResponseHeadersPolicyProps {
  /**
   * A response headers policy configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-responseheaderspolicy.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig)
   */
  public fun responseHeadersPolicyConfig(): Any

  /**
   * A builder for [CfnResponseHeadersPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param responseHeadersPolicyConfig A response headers policy configuration. 
     */
    public fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: IResolvable)

    /**
     * @param responseHeadersPolicyConfig A response headers policy configuration. 
     */
    public
        fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty)

    /**
     * @param responseHeadersPolicyConfig A response headers policy configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7af078db07b36f4d9b6f76ec9bdfbc899f1b34685f6d9ddcc8c3d0c429189066")
    public
        fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicyProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicyProps.builder()

    /**
     * @param responseHeadersPolicyConfig A response headers policy configuration. 
     */
    override fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: IResolvable) {
      cdkBuilder.responseHeadersPolicyConfig(responseHeadersPolicyConfig.let(IResolvable::unwrap))
    }

    /**
     * @param responseHeadersPolicyConfig A response headers policy configuration. 
     */
    override
        fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty) {
      cdkBuilder.responseHeadersPolicyConfig(responseHeadersPolicyConfig.let(CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty::unwrap))
    }

    /**
     * @param responseHeadersPolicyConfig A response headers policy configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7af078db07b36f4d9b6f76ec9bdfbc899f1b34685f6d9ddcc8c3d0c429189066")
    override
        fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        responseHeadersPolicyConfig(CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty(responseHeadersPolicyConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicyProps,
  ) : CdkObject(cdkObject), CfnResponseHeadersPolicyProps {
    /**
     * A response headers policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-responseheaderspolicy.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig)
     */
    override fun responseHeadersPolicyConfig(): Any = unwrap(this).getResponseHeadersPolicyConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResponseHeadersPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicyProps):
        CfnResponseHeadersPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResponseHeadersPolicyProps):
        software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicyProps
  }
}
