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
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy
import software.constructs.Construct

/**
 * A cache policy.
 *
 * When it's attached to a cache behavior, the cache policy determines the following:
 * * The values that CloudFront includes in the cache key. These values can include HTTP headers,
 *   cookies, and URL query strings. CloudFront uses the cache key to find an object in its cache
 *   that it can return to the viewer.
 * * The default, minimum, and maximum time to live (TTL) values that you want objects to stay in
 *   the CloudFront cache.
 *
 * The headers, cookies, and query strings that are included in the cache key are also included in
 * requests that CloudFront sends to the origin. CloudFront sends a request when it can't find a
 * valid object in its cache that matches the request's cache key. If you want to send values to the
 * origin but *not* include them in the cache key, use `OriginRequestPolicy` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnCachePolicy cfnCachePolicy = CfnCachePolicy.Builder.create(this, "MyCfnCachePolicy")
 * .cachePolicyConfig(CachePolicyConfigProperty.builder()
 * .defaultTtl(123)
 * .maxTtl(123)
 * .minTtl(123)
 * .name("name")
 * .parametersInCacheKeyAndForwardedToOrigin(ParametersInCacheKeyAndForwardedToOriginProperty.builder()
 * .cookiesConfig(CookiesConfigProperty.builder()
 * .cookieBehavior("cookieBehavior")
 * // the properties below are optional
 * .cookies(List.of("cookies"))
 * .build())
 * .enableAcceptEncodingGzip(false)
 * .headersConfig(HeadersConfigProperty.builder()
 * .headerBehavior("headerBehavior")
 * // the properties below are optional
 * .headers(List.of("headers"))
 * .build())
 * .queryStringsConfig(QueryStringsConfigProperty.builder()
 * .queryStringBehavior("queryStringBehavior")
 * // the properties below are optional
 * .queryStrings(List.of("queryStrings"))
 * .build())
 * // the properties below are optional
 * .enableAcceptEncodingBrotli(false)
 * .build())
 * // the properties below are optional
 * .comment("comment")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cachepolicy.html)
 */
@CdkDslMarker
public class CfnCachePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCachePolicy.Builder = CfnCachePolicy.Builder.create(scope, id)

    /**
     * The cache policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cachepolicy.html#cfn-cloudfront-cachepolicy-cachepolicyconfig)
     *
     * @param cachePolicyConfig The cache policy configuration.
     */
    public fun cachePolicyConfig(cachePolicyConfig: IResolvable) {
        cdkBuilder.cachePolicyConfig(cachePolicyConfig)
    }

    /**
     * The cache policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cachepolicy.html#cfn-cloudfront-cachepolicy-cachepolicyconfig)
     *
     * @param cachePolicyConfig The cache policy configuration.
     */
    public fun cachePolicyConfig(cachePolicyConfig: CfnCachePolicy.CachePolicyConfigProperty) {
        cdkBuilder.cachePolicyConfig(cachePolicyConfig)
    }

    public fun build(): CfnCachePolicy = cdkBuilder.build()
}
