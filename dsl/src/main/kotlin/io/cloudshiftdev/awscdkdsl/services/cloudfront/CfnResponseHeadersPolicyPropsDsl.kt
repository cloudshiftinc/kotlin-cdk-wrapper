@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicyProps

/**
 * Properties for defining a `CfnResponseHeadersPolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
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
@CdkDslMarker
public class CfnResponseHeadersPolicyPropsDsl {
    private val cdkBuilder: CfnResponseHeadersPolicyProps.Builder =
        CfnResponseHeadersPolicyProps.builder()

    /** @param responseHeadersPolicyConfig A response headers policy configuration. */
    public fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: IResolvable) {
        cdkBuilder.responseHeadersPolicyConfig(responseHeadersPolicyConfig)
    }

    /** @param responseHeadersPolicyConfig A response headers policy configuration. */
    public fun responseHeadersPolicyConfig(
        responseHeadersPolicyConfig: CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty
    ) {
        cdkBuilder.responseHeadersPolicyConfig(responseHeadersPolicyConfig)
    }

    public fun build(): CfnResponseHeadersPolicyProps = cdkBuilder.build()
}
