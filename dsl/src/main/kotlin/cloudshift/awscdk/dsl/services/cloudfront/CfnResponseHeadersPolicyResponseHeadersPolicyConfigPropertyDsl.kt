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

/**
 * A response headers policy configuration.
 *
 * A response headers policy configuration contains metadata about the response headers policy, and
 * configurations for sets of HTTP response headers.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * ResponseHeadersPolicyConfigProperty responseHeadersPolicyConfigProperty =
 * ResponseHeadersPolicyConfigProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html)
 */
@CdkDslMarker
public class CfnResponseHeadersPolicyResponseHeadersPolicyConfigPropertyDsl {
    private val cdkBuilder: CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty.Builder =
        CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty.builder()

    /**
     * @param comment A comment to describe the response headers policy. The comment cannot be
     *   longer than 128 characters.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param corsConfig A configuration for a set of HTTP response headers that are used for
     *   cross-origin resource sharing (CORS).
     */
    public fun corsConfig(corsConfig: IResolvable) {
        cdkBuilder.corsConfig(corsConfig)
    }

    /**
     * @param corsConfig A configuration for a set of HTTP response headers that are used for
     *   cross-origin resource sharing (CORS).
     */
    public fun corsConfig(corsConfig: CfnResponseHeadersPolicy.CorsConfigProperty) {
        cdkBuilder.corsConfig(corsConfig)
    }

    /** @param customHeadersConfig A configuration for a set of custom HTTP response headers. */
    public fun customHeadersConfig(customHeadersConfig: IResolvable) {
        cdkBuilder.customHeadersConfig(customHeadersConfig)
    }

    /** @param customHeadersConfig A configuration for a set of custom HTTP response headers. */
    public fun customHeadersConfig(
        customHeadersConfig: CfnResponseHeadersPolicy.CustomHeadersConfigProperty
    ) {
        cdkBuilder.customHeadersConfig(customHeadersConfig)
    }

    /**
     * @param name A name to identify the response headers policy. The name must be unique for
     *   response headers policies in this AWS account .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param removeHeadersConfig A configuration for a set of HTTP headers to remove from the HTTP
     *   response.
     */
    public fun removeHeadersConfig(removeHeadersConfig: IResolvable) {
        cdkBuilder.removeHeadersConfig(removeHeadersConfig)
    }

    /**
     * @param removeHeadersConfig A configuration for a set of HTTP headers to remove from the HTTP
     *   response.
     */
    public fun removeHeadersConfig(
        removeHeadersConfig: CfnResponseHeadersPolicy.RemoveHeadersConfigProperty
    ) {
        cdkBuilder.removeHeadersConfig(removeHeadersConfig)
    }

    /**
     * @param securityHeadersConfig A configuration for a set of security-related HTTP response
     *   headers.
     */
    public fun securityHeadersConfig(securityHeadersConfig: IResolvable) {
        cdkBuilder.securityHeadersConfig(securityHeadersConfig)
    }

    /**
     * @param securityHeadersConfig A configuration for a set of security-related HTTP response
     *   headers.
     */
    public fun securityHeadersConfig(
        securityHeadersConfig: CfnResponseHeadersPolicy.SecurityHeadersConfigProperty
    ) {
        cdkBuilder.securityHeadersConfig(securityHeadersConfig)
    }

    /**
     * @param serverTimingHeadersConfig A configuration for enabling the `Server-Timing` header in
     *   HTTP responses sent from CloudFront.
     */
    public fun serverTimingHeadersConfig(serverTimingHeadersConfig: IResolvable) {
        cdkBuilder.serverTimingHeadersConfig(serverTimingHeadersConfig)
    }

    /**
     * @param serverTimingHeadersConfig A configuration for enabling the `Server-Timing` header in
     *   HTTP responses sent from CloudFront.
     */
    public fun serverTimingHeadersConfig(
        serverTimingHeadersConfig: CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty
    ) {
        cdkBuilder.serverTimingHeadersConfig(serverTimingHeadersConfig)
    }

    public fun build(): CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty =
        cdkBuilder.build()
}
