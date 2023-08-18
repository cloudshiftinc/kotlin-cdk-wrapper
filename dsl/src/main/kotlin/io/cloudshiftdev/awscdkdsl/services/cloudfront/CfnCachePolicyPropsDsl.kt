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
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy
import software.amazon.awscdk.services.cloudfront.CfnCachePolicyProps

/**
 * Properties for defining a `CfnCachePolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnCachePolicyProps cfnCachePolicyProps = CfnCachePolicyProps.builder()
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
public class CfnCachePolicyPropsDsl {
    private val cdkBuilder: CfnCachePolicyProps.Builder = CfnCachePolicyProps.builder()

    /** @param cachePolicyConfig The cache policy configuration. */
    public fun cachePolicyConfig(cachePolicyConfig: IResolvable) {
        cdkBuilder.cachePolicyConfig(cachePolicyConfig)
    }

    /** @param cachePolicyConfig The cache policy configuration. */
    public fun cachePolicyConfig(cachePolicyConfig: CfnCachePolicy.CachePolicyConfigProperty) {
        cdkBuilder.cachePolicyConfig(cachePolicyConfig)
    }

    public fun build(): CfnCachePolicyProps = cdkBuilder.build()
}
