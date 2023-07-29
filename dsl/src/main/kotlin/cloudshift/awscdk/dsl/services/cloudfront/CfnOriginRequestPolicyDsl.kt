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
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy
import software.constructs.Construct

/**
 * An origin request policy.
 *
 * When it's attached to a cache behavior, the origin request policy determines the values that
 * CloudFront includes in requests that it sends to the origin. Each request that CloudFront sends
 * to the origin includes the following:
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
 * CfnOriginRequestPolicy cfnOriginRequestPolicy = CfnOriginRequestPolicy.Builder.create(this,
 * "MyCfnOriginRequestPolicy")
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
@CdkDslMarker
public class CfnOriginRequestPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnOriginRequestPolicy.Builder =
        CfnOriginRequestPolicy.Builder.create(scope, id)

    /**
     * The origin request policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originrequestpolicy.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig)
     *
     * @param originRequestPolicyConfig The origin request policy configuration.
     */
    public fun originRequestPolicyConfig(originRequestPolicyConfig: IResolvable) {
        cdkBuilder.originRequestPolicyConfig(originRequestPolicyConfig)
    }

    /**
     * The origin request policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originrequestpolicy.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig)
     *
     * @param originRequestPolicyConfig The origin request policy configuration.
     */
    public fun originRequestPolicyConfig(
        originRequestPolicyConfig: CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty
    ) {
        cdkBuilder.originRequestPolicyConfig(originRequestPolicyConfig)
    }

    public fun build(): CfnOriginRequestPolicy = cdkBuilder.build()
}
