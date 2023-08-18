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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnDistribution

/**
 * This field is deprecated.
 *
 * We recommend that you use a cache policy or an origin request policy instead of this field.
 *
 * If you want to include cookies in the cache key, use a cache policy. For more information, see
 * [Creating cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
 * in the *Amazon CloudFront Developer Guide* .
 *
 * If you want to send cookies to the origin but not include them in the cache key, use an origin
 * request policy. For more information, see
 * [Creating origin request policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
 * in the *Amazon CloudFront Developer Guide* .
 *
 * A complex type that specifies whether you want CloudFront to forward cookies to the origin and,
 * if so, which ones. For more information about forwarding cookies to the origin, see
 * [How CloudFront Forwards, Caches, and Logs Cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html)
 * in the *Amazon CloudFront Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CookiesProperty cookiesProperty = CookiesProperty.builder()
 * .forward("forward")
 * // the properties below are optional
 * .whitelistedNames(List.of("whitelistedNames"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html)
 */
@CdkDslMarker
public class CfnDistributionCookiesPropertyDsl {
    private val cdkBuilder: CfnDistribution.CookiesProperty.Builder =
        CfnDistribution.CookiesProperty.builder()

    private val _whitelistedNames: MutableList<String> = mutableListOf()

    /**
     * @param forward This field is deprecated. We recommend that you use a cache policy or an
     *   origin request policy instead of this field.
     *
     * If you want to include cookies in the cache key, use a cache policy. For more information,
     * see
     * [Creating cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to send cookies to the origin but not include them in the cache key, use origin
     * request policy. For more information, see
     * [Creating origin request policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Specifies which cookies to forward to the origin for this cache behavior: all, none, or the
     * list of cookies specified in the `WhitelistedNames` complex type.
     *
     * Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an
     * Amazon S3 origin, specify none for the `Forward` element.
     */
    public fun forward(forward: String) {
        cdkBuilder.forward(forward)
    }

    /**
     * @param whitelistedNames This field is deprecated. We recommend that you use a cache policy or
     *   an origin request policy instead of this field.
     *
     * If you want to include cookies in the cache key, use a cache policy. For more information,
     * see
     * [Creating cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to send cookies to the origin but not include them in the cache key, use an
     * origin request policy. For more information, see
     * [Creating origin request policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Required if you specify `whitelist` for the value of `Forward` . A complex type that
     * specifies how many different cookies you want CloudFront to forward to the origin for this
     * cache behavior and, if you want to forward selected cookies, the names of those cookies.
     *
     * If you specify `all` or `none` for the value of `Forward` , omit `WhitelistedNames` . If you
     * change the value of `Forward` from `whitelist` to `all` or `none` and you don't delete the
     * `WhitelistedNames` element and its child elements, CloudFront deletes them automatically.
     *
     * For the current limit on the number of cookie names that you can whitelist for each cache
     * behavior, see
     * [CloudFront Limits](https://docs.aws.amazon.com/general/latest/gr/xrefaws_service_limits.html#limits_cloudfront)
     * in the *AWS General Reference* .
     */
    public fun whitelistedNames(vararg whitelistedNames: String) {
        _whitelistedNames.addAll(listOf(*whitelistedNames))
    }

    /**
     * @param whitelistedNames This field is deprecated. We recommend that you use a cache policy or
     *   an origin request policy instead of this field.
     *
     * If you want to include cookies in the cache key, use a cache policy. For more information,
     * see
     * [Creating cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to send cookies to the origin but not include them in the cache key, use an
     * origin request policy. For more information, see
     * [Creating origin request policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Required if you specify `whitelist` for the value of `Forward` . A complex type that
     * specifies how many different cookies you want CloudFront to forward to the origin for this
     * cache behavior and, if you want to forward selected cookies, the names of those cookies.
     *
     * If you specify `all` or `none` for the value of `Forward` , omit `WhitelistedNames` . If you
     * change the value of `Forward` from `whitelist` to `all` or `none` and you don't delete the
     * `WhitelistedNames` element and its child elements, CloudFront deletes them automatically.
     *
     * For the current limit on the number of cookie names that you can whitelist for each cache
     * behavior, see
     * [CloudFront Limits](https://docs.aws.amazon.com/general/latest/gr/xrefaws_service_limits.html#limits_cloudfront)
     * in the *AWS General Reference* .
     */
    public fun whitelistedNames(whitelistedNames: Collection<String>) {
        _whitelistedNames.addAll(whitelistedNames)
    }

    public fun build(): CfnDistribution.CookiesProperty {
        if (_whitelistedNames.isNotEmpty()) cdkBuilder.whitelistedNames(_whitelistedNames)
        return cdkBuilder.build()
    }
}
