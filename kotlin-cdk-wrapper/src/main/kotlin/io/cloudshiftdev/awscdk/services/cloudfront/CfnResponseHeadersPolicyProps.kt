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
 * Properties for defining a `CfnResponseHeadersPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnResponseHeadersPolicyProps cfnResponseHeadersPolicyProps =
 * CfnResponseHeadersPolicyProps.builder()
 * .responseHeadersPolicyConfig(ResponseHeadersPolicyConfigProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .corsConfig(CorsConfigProperty.builder()
 * .accessControlAllowCredentials(false)
 * .accessControlAllowHeaders(AccessControlAllowHeadersProperty.builder()
 * .items(List.of("items"))
 * .build())
 * .accessControlAllowMethods(AccessControlAllowMethodsProperty.builder()
 * .items(List.of("items"))
 * .build())
 * .accessControlAllowOrigins(AccessControlAllowOriginsProperty.builder()
 * .items(List.of("items"))
 * .build())
 * .originOverride(false)
 * // the properties below are optional
 * .accessControlExposeHeaders(AccessControlExposeHeadersProperty.builder()
 * .items(List.of("items"))
 * .build())
 * .accessControlMaxAgeSec(123)
 * .build())
 * .customHeadersConfig(CustomHeadersConfigProperty.builder()
 * .items(List.of(CustomHeaderProperty.builder()
 * .header("header")
 * .override(false)
 * .value("value")
 * .build()))
 * .build())
 * .removeHeadersConfig(RemoveHeadersConfigProperty.builder()
 * .items(List.of(RemoveHeaderProperty.builder()
 * .header("header")
 * .build()))
 * .build())
 * .securityHeadersConfig(SecurityHeadersConfigProperty.builder()
 * .contentSecurityPolicy(ContentSecurityPolicyProperty.builder()
 * .contentSecurityPolicy("contentSecurityPolicy")
 * .override(false)
 * .build())
 * .contentTypeOptions(ContentTypeOptionsProperty.builder()
 * .override(false)
 * .build())
 * .frameOptions(FrameOptionsProperty.builder()
 * .frameOption("frameOption")
 * .override(false)
 * .build())
 * .referrerPolicy(ReferrerPolicyProperty.builder()
 * .override(false)
 * .referrerPolicy("referrerPolicy")
 * .build())
 * .strictTransportSecurity(StrictTransportSecurityProperty.builder()
 * .accessControlMaxAgeSec(123)
 * .override(false)
 * // the properties below are optional
 * .includeSubdomains(false)
 * .preload(false)
 * .build())
 * .xssProtection(XSSProtectionProperty.builder()
 * .override(false)
 * .protection(false)
 * // the properties below are optional
 * .modeBlock(false)
 * .reportUri("reportUri")
 * .build())
 * .build())
 * .serverTimingHeadersConfig(ServerTimingHeadersConfigProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .samplingRate(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-responseheaderspolicy.html)
 */
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
        CfnResponseHeadersPolicyProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnResponseHeadersPolicyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResponseHeadersPolicyProps):
        software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicyProps
  }
}
