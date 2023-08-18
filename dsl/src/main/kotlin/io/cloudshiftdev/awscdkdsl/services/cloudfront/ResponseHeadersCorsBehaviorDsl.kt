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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior

/**
 * Configuration for a set of HTTP response headers that are used for cross-origin resource sharing
 * (CORS).
 *
 * CloudFront adds these headers to HTTP responses that it sends for CORS requests that match a
 * cache behavior associated with this response headers policy.
 *
 * Example:
 * ```
 * // Using an existing managed response headers policy
 * S3Origin bucketOrigin;
 * Distribution.Builder.create(this, "myDistManagedPolicy")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(bucketOrigin)
 * .responseHeadersPolicy(ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS)
 * .build())
 * .build();
 * // Creating a custom response headers policy -- all parameters optional
 * ResponseHeadersPolicy myResponseHeadersPolicy = ResponseHeadersPolicy.Builder.create(this,
 * "ResponseHeadersPolicy")
 * .responseHeadersPolicyName("MyPolicy")
 * .comment("A default policy")
 * .corsBehavior(ResponseHeadersCorsBehavior.builder()
 * .accessControlAllowCredentials(false)
 * .accessControlAllowHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
 * .accessControlAllowMethods(List.of("GET", "POST"))
 * .accessControlAllowOrigins(List.of("*"))
 * .accessControlExposeHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
 * .accessControlMaxAge(Duration.seconds(600))
 * .originOverride(true)
 * .build())
 * .customHeadersBehavior(ResponseCustomHeadersBehavior.builder()
 * .customHeaders(List.of(ResponseCustomHeader.builder().header("X-Amz-Date").value("some-value").override(true).build(),
 * ResponseCustomHeader.builder().header("X-Amz-Security-Token").value("some-value").override(false).build()))
 * .build())
 * .securityHeadersBehavior(ResponseSecurityHeadersBehavior.builder()
 * .contentSecurityPolicy(ResponseHeadersContentSecurityPolicy.builder().contentSecurityPolicy("default-src
 * https:;").override(true).build())
 * .contentTypeOptions(ResponseHeadersContentTypeOptions.builder().override(true).build())
 * .frameOptions(ResponseHeadersFrameOptions.builder().frameOption(HeadersFrameOption.DENY).override(true).build())
 * .referrerPolicy(ResponseHeadersReferrerPolicy.builder().referrerPolicy(HeadersReferrerPolicy.NO_REFERRER).override(true).build())
 * .strictTransportSecurity(ResponseHeadersStrictTransportSecurity.builder().accessControlMaxAge(Duration.seconds(600)).includeSubdomains(true).override(true).build())
 * .xssProtection(ResponseHeadersXSSProtection.builder().protection(true).modeBlock(true).reportUri("https://example.com/csp-report").override(true).build())
 * .build())
 * .removeHeaders(List.of("Server"))
 * .serverTimingSamplingRate(50)
 * .build();
 * Distribution.Builder.create(this, "myDistCustomPolicy")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(bucketOrigin)
 * .responseHeadersPolicy(myResponseHeadersPolicy)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ResponseHeadersCorsBehaviorDsl {
    private val cdkBuilder: ResponseHeadersCorsBehavior.Builder =
        ResponseHeadersCorsBehavior.builder()

    private val _accessControlAllowHeaders: MutableList<String> = mutableListOf()

    private val _accessControlAllowMethods: MutableList<String> = mutableListOf()

    private val _accessControlAllowOrigins: MutableList<String> = mutableListOf()

    private val _accessControlExposeHeaders: MutableList<String> = mutableListOf()

    /**
     * @param accessControlAllowCredentials A Boolean that CloudFront uses as the value for the
     *   Access-Control-Allow-Credentials HTTP response header.
     */
    public fun accessControlAllowCredentials(accessControlAllowCredentials: Boolean) {
        cdkBuilder.accessControlAllowCredentials(accessControlAllowCredentials)
    }

    /**
     * @param accessControlAllowHeaders A list of HTTP header names that CloudFront includes as
     *   values for the Access-Control-Allow-Headers HTTP response header. You can specify `['*']`
     *   to allow all headers.
     */
    public fun accessControlAllowHeaders(vararg accessControlAllowHeaders: String) {
        _accessControlAllowHeaders.addAll(listOf(*accessControlAllowHeaders))
    }

    /**
     * @param accessControlAllowHeaders A list of HTTP header names that CloudFront includes as
     *   values for the Access-Control-Allow-Headers HTTP response header. You can specify `['*']`
     *   to allow all headers.
     */
    public fun accessControlAllowHeaders(accessControlAllowHeaders: Collection<String>) {
        _accessControlAllowHeaders.addAll(accessControlAllowHeaders)
    }

    /**
     * @param accessControlAllowMethods A list of HTTP methods that CloudFront includes as values
     *   for the Access-Control-Allow-Methods HTTP response header.
     */
    public fun accessControlAllowMethods(vararg accessControlAllowMethods: String) {
        _accessControlAllowMethods.addAll(listOf(*accessControlAllowMethods))
    }

    /**
     * @param accessControlAllowMethods A list of HTTP methods that CloudFront includes as values
     *   for the Access-Control-Allow-Methods HTTP response header.
     */
    public fun accessControlAllowMethods(accessControlAllowMethods: Collection<String>) {
        _accessControlAllowMethods.addAll(accessControlAllowMethods)
    }

    /**
     * @param accessControlAllowOrigins A list of origins (domain names) that CloudFront can use as
     *   the value for the Access-Control-Allow-Origin HTTP response header. You can specify `['*']`
     *   to allow all origins.
     */
    public fun accessControlAllowOrigins(vararg accessControlAllowOrigins: String) {
        _accessControlAllowOrigins.addAll(listOf(*accessControlAllowOrigins))
    }

    /**
     * @param accessControlAllowOrigins A list of origins (domain names) that CloudFront can use as
     *   the value for the Access-Control-Allow-Origin HTTP response header. You can specify `['*']`
     *   to allow all origins.
     */
    public fun accessControlAllowOrigins(accessControlAllowOrigins: Collection<String>) {
        _accessControlAllowOrigins.addAll(accessControlAllowOrigins)
    }

    /**
     * @param accessControlExposeHeaders A list of HTTP headers that CloudFront includes as values
     *   for the Access-Control-Expose-Headers HTTP response header. You can specify `['*']` to
     *   expose all headers.
     */
    public fun accessControlExposeHeaders(vararg accessControlExposeHeaders: String) {
        _accessControlExposeHeaders.addAll(listOf(*accessControlExposeHeaders))
    }

    /**
     * @param accessControlExposeHeaders A list of HTTP headers that CloudFront includes as values
     *   for the Access-Control-Expose-Headers HTTP response header. You can specify `['*']` to
     *   expose all headers.
     */
    public fun accessControlExposeHeaders(accessControlExposeHeaders: Collection<String>) {
        _accessControlExposeHeaders.addAll(accessControlExposeHeaders)
    }

    /**
     * @param accessControlMaxAge A number that CloudFront uses as the value for the
     *   Access-Control-Max-Age HTTP response header.
     */
    public fun accessControlMaxAge(accessControlMaxAge: Duration) {
        cdkBuilder.accessControlMaxAge(accessControlMaxAge)
    }

    /**
     * @param originOverride A Boolean that determines whether CloudFront overrides HTTP response
     *   headers received from the origin with the ones specified in this response headers policy.
     */
    public fun originOverride(originOverride: Boolean) {
        cdkBuilder.originOverride(originOverride)
    }

    public fun build(): ResponseHeadersCorsBehavior {
        if (_accessControlAllowHeaders.isNotEmpty())
            cdkBuilder.accessControlAllowHeaders(_accessControlAllowHeaders)
        if (_accessControlAllowMethods.isNotEmpty())
            cdkBuilder.accessControlAllowMethods(_accessControlAllowMethods)
        if (_accessControlAllowOrigins.isNotEmpty())
            cdkBuilder.accessControlAllowOrigins(_accessControlAllowOrigins)
        if (_accessControlExposeHeaders.isNotEmpty())
            cdkBuilder.accessControlExposeHeaders(_accessControlExposeHeaders)
        return cdkBuilder.build()
    }
}
