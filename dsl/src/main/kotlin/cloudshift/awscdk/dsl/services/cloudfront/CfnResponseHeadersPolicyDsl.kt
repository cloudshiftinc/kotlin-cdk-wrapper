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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy
import software.constructs.Construct

/**
 * A response headers policy.
 *
 * A response headers policy contains information about a set of HTTP response headers.
 *
 * After you create a response headers policy, you can use its ID to attach it to one or more cache
 * behaviors in a CloudFront distribution. When it's attached to a cache behavior, the response
 * headers policy affects the HTTP headers that CloudFront includes in HTTP responses to requests
 * that match the cache behavior. CloudFront adds or removes response headers according to the
 * configuration of the response headers policy.
 *
 * For more information, see
 * [Adding or removing HTTP headers in CloudFront responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/modifying-response-headers.html)
 * in the *Amazon CloudFront Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnResponseHeadersPolicy cfnResponseHeadersPolicy = CfnResponseHeadersPolicy.Builder.create(this,
 * "MyCfnResponseHeadersPolicy")
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
public class CfnResponseHeadersPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResponseHeadersPolicy.Builder =
        CfnResponseHeadersPolicy.Builder.create(scope, id)

    /**
     * A response headers policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-responseheaderspolicy.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig)
     *
     * @param responseHeadersPolicyConfig A response headers policy configuration.
     */
    public fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: IResolvable) {
        cdkBuilder.responseHeadersPolicyConfig(responseHeadersPolicyConfig)
    }

    /**
     * A response headers policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-responseheaderspolicy.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig)
     *
     * @param responseHeadersPolicyConfig A response headers policy configuration.
     */
    public fun responseHeadersPolicyConfig(
        responseHeadersPolicyConfig: CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty
    ) {
        cdkBuilder.responseHeadersPolicyConfig(responseHeadersPolicyConfig)
    }

    public fun build(): CfnResponseHeadersPolicy = cdkBuilder.build()
}
