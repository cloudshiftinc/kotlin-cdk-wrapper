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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnDistribution

/**
 * `CacheSettings` is a property of the
 * [AWS::Lightsail::Distribution](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html)
 * resource. It describes the cache settings of an Amazon Lightsail content delivery network (CDN)
 * distribution.
 *
 * These settings apply only to your distribution’s `CacheBehaviors` that have a `Behavior` of
 * `cache` . This includes the `DefaultCacheBehavior` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * CacheSettingsProperty cacheSettingsProperty = CacheSettingsProperty.builder()
 * .allowedHttpMethods("allowedHttpMethods")
 * .cachedHttpMethods("cachedHttpMethods")
 * .defaultTtl(123)
 * .forwardedCookies(CookieObjectProperty.builder()
 * .cookiesAllowList(List.of("cookiesAllowList"))
 * .option("option")
 * .build())
 * .forwardedHeaders(HeaderObjectProperty.builder()
 * .headersAllowList(List.of("headersAllowList"))
 * .option("option")
 * .build())
 * .forwardedQueryStrings(QueryStringObjectProperty.builder()
 * .option(false)
 * .queryStringsAllowList(List.of("queryStringsAllowList"))
 * .build())
 * .maximumTtl(123)
 * .minimumTtl(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html)
 */
@CdkDslMarker
public class CfnDistributionCacheSettingsPropertyDsl {
    private val cdkBuilder: CfnDistribution.CacheSettingsProperty.Builder =
        CfnDistribution.CacheSettingsProperty.builder()

    /**
     * @param allowedHttpMethods The HTTP methods that are processed and forwarded to the
     *   distribution's origin. You can specify the following options:
     * * `GET,HEAD` - The distribution forwards the `GET` and `HEAD` methods.
     * * `GET,HEAD,OPTIONS` - The distribution forwards the `GET` , `HEAD` , and `OPTIONS` methods.
     * * `GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE` - The distribution forwards the `GET` , `HEAD` ,
     *   `OPTIONS` , `PUT` , `PATCH` , `POST` , and `DELETE` methods.
     *
     * If you specify `GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE` , you might need to restrict access
     * to your distribution's origin so users can't perform operations that you don't want them to.
     * For example, you might not want users to have permission to delete objects from your origin.
     */
    public fun allowedHttpMethods(allowedHttpMethods: String) {
        cdkBuilder.allowedHttpMethods(allowedHttpMethods)
    }

    /**
     * @param cachedHttpMethods The HTTP method responses that are cached by your distribution. You
     *   can specify the following options:
     * * `GET,HEAD` - The distribution caches responses to the `GET` and `HEAD` methods.
     * * `GET,HEAD,OPTIONS` - The distribution caches responses to the `GET` , `HEAD` , and
     *   `OPTIONS` methods.
     */
    public fun cachedHttpMethods(cachedHttpMethods: String) {
        cdkBuilder.cachedHttpMethods(cachedHttpMethods)
    }

    /**
     * @param defaultTtl The default amount of time that objects stay in the distribution's cache
     *   before the distribution forwards another request to the origin to determine whether the
     *   content has been updated.
     *
     * The value specified applies only when the origin does not add HTTP headers such as
     * `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects.
     */
    public fun defaultTtl(defaultTtl: Number) {
        cdkBuilder.defaultTtl(defaultTtl)
    }

    /**
     * @param forwardedCookies An object that describes the cookies that are forwarded to the
     *   origin. Your content is cached based on the cookies that are forwarded.
     */
    public fun forwardedCookies(forwardedCookies: IResolvable) {
        cdkBuilder.forwardedCookies(forwardedCookies)
    }

    /**
     * @param forwardedCookies An object that describes the cookies that are forwarded to the
     *   origin. Your content is cached based on the cookies that are forwarded.
     */
    public fun forwardedCookies(forwardedCookies: CfnDistribution.CookieObjectProperty) {
        cdkBuilder.forwardedCookies(forwardedCookies)
    }

    /**
     * @param forwardedHeaders An object that describes the headers that are forwarded to the
     *   origin. Your content is cached based on the headers that are forwarded.
     */
    public fun forwardedHeaders(forwardedHeaders: IResolvable) {
        cdkBuilder.forwardedHeaders(forwardedHeaders)
    }

    /**
     * @param forwardedHeaders An object that describes the headers that are forwarded to the
     *   origin. Your content is cached based on the headers that are forwarded.
     */
    public fun forwardedHeaders(forwardedHeaders: CfnDistribution.HeaderObjectProperty) {
        cdkBuilder.forwardedHeaders(forwardedHeaders)
    }

    /**
     * @param forwardedQueryStrings An object that describes the query strings that are forwarded to
     *   the origin. Your content is cached based on the query strings that are forwarded.
     */
    public fun forwardedQueryStrings(forwardedQueryStrings: IResolvable) {
        cdkBuilder.forwardedQueryStrings(forwardedQueryStrings)
    }

    /**
     * @param forwardedQueryStrings An object that describes the query strings that are forwarded to
     *   the origin. Your content is cached based on the query strings that are forwarded.
     */
    public fun forwardedQueryStrings(
        forwardedQueryStrings: CfnDistribution.QueryStringObjectProperty
    ) {
        cdkBuilder.forwardedQueryStrings(forwardedQueryStrings)
    }

    /**
     * @param maximumTtl The maximum amount of time that objects stay in the distribution's cache
     *   before the distribution forwards another request to the origin to determine whether the
     *   object has been updated. The value specified applies only when the origin adds HTTP headers
     *   such as `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects.
     */
    public fun maximumTtl(maximumTtl: Number) {
        cdkBuilder.maximumTtl(maximumTtl)
    }

    /**
     * @param minimumTtl The minimum amount of time that objects stay in the distribution's cache
     *   before the distribution forwards another request to the origin to determine whether the
     *   object has been updated. A value of `0` must be specified for `minimumTTL` if the
     *   distribution is configured to forward all headers to the origin.
     */
    public fun minimumTtl(minimumTtl: Number) {
        cdkBuilder.minimumTtl(minimumTtl)
    }

    public fun build(): CfnDistribution.CacheSettingsProperty = cdkBuilder.build()
}
