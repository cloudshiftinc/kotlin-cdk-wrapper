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
 * Properties for defining a `CfnOriginRequestPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnOriginRequestPolicyProps cfnOriginRequestPolicyProps = CfnOriginRequestPolicyProps.builder()
 * .originRequestPolicyConfig(OriginRequestPolicyConfigProperty.builder()
 * .cookiesConfig(CookiesConfigProperty.builder()
 * .cookieBehavior("cookieBehavior")
 * // the properties below are optional
 * .cookies(List.of("cookies"))
 * .build())
 * .headersConfig(HeadersConfigProperty.builder()
 * .headerBehavior("headerBehavior")
 * // the properties below are optional
 * .headers(List.of("headers"))
 * .build())
 * .name("name")
 * .queryStringsConfig(QueryStringsConfigProperty.builder()
 * .queryStringBehavior("queryStringBehavior")
 * // the properties below are optional
 * .queryStrings(List.of("queryStrings"))
 * .build())
 * // the properties below are optional
 * .comment("comment")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originrequestpolicy.html)
 */
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
        CfnOriginRequestPolicyProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnOriginRequestPolicyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOriginRequestPolicyProps):
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps
  }
}
