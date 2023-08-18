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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy

/**
 * An origin request policy configuration.
 *
 * This configuration determines the values that CloudFront includes in requests that it sends to
 * the origin. Each request that CloudFront sends to the origin includes the following:
 * * The request body and the URL path (without the domain name) from the viewer request.
 * * The headers that CloudFront automatically includes in every origin request, including `Host` ,
 *   `User-Agent` , and `X-Amz-Cf-Id` .
 * * All HTTP headers, cookies, and URL query strings that are specified in the cache policy or the
 *   origin request policy. These can include items from the viewer request and, in the case of
 *   headers, additional ones that are added by CloudFront.
 *
 * CloudFront sends a request when it can't find an object in its cache that matches the request. If
 * you want to send values to the origin and also include them in the cache key, use `CachePolicy` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * OriginRequestPolicyConfigProperty originRequestPolicyConfigProperty =
 * OriginRequestPolicyConfigProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-originrequestpolicyconfig.html)
 */
@CdkDslMarker
public class CfnOriginRequestPolicyOriginRequestPolicyConfigPropertyDsl {
    private val cdkBuilder: CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.Builder =
        CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.builder()

    /**
     * @param comment A comment to describe the origin request policy. The comment cannot be longer
     *   than 128 characters.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /** @param cookiesConfig The cookies from viewer requests to include in origin requests. */
    public fun cookiesConfig(cookiesConfig: IResolvable) {
        cdkBuilder.cookiesConfig(cookiesConfig)
    }

    /** @param cookiesConfig The cookies from viewer requests to include in origin requests. */
    public fun cookiesConfig(cookiesConfig: CfnOriginRequestPolicy.CookiesConfigProperty) {
        cdkBuilder.cookiesConfig(cookiesConfig)
    }

    /**
     * @param headersConfig The HTTP headers to include in origin requests. These can include
     *   headers from viewer requests and additional headers added by CloudFront.
     */
    public fun headersConfig(headersConfig: IResolvable) {
        cdkBuilder.headersConfig(headersConfig)
    }

    /**
     * @param headersConfig The HTTP headers to include in origin requests. These can include
     *   headers from viewer requests and additional headers added by CloudFront.
     */
    public fun headersConfig(headersConfig: CfnOriginRequestPolicy.HeadersConfigProperty) {
        cdkBuilder.headersConfig(headersConfig)
    }

    /** @param name A unique name to identify the origin request policy. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param queryStringsConfig The URL query strings from viewer requests to include in origin
     *   requests.
     */
    public fun queryStringsConfig(queryStringsConfig: IResolvable) {
        cdkBuilder.queryStringsConfig(queryStringsConfig)
    }

    /**
     * @param queryStringsConfig The URL query strings from viewer requests to include in origin
     *   requests.
     */
    public fun queryStringsConfig(
        queryStringsConfig: CfnOriginRequestPolicy.QueryStringsConfigProperty
    ) {
        cdkBuilder.queryStringsConfig(queryStringsConfig)
    }

    public fun build(): CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty =
        cdkBuilder.build()
}
