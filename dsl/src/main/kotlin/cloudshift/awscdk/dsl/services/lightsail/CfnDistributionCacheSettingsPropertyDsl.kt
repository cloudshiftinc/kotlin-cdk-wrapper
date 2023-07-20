@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnDistribution
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDistributionCacheSettingsPropertyDsl {
    private val cdkBuilder: CfnDistribution.CacheSettingsProperty.Builder =
        CfnDistribution.CacheSettingsProperty.builder()

    public fun allowedHttpMethods(allowedHttpMethods: String) {
        cdkBuilder.allowedHttpMethods(allowedHttpMethods)
    }

    public fun cachedHttpMethods(cachedHttpMethods: String) {
        cdkBuilder.cachedHttpMethods(cachedHttpMethods)
    }

    public fun defaultTtl(defaultTtl: Number) {
        cdkBuilder.defaultTtl(defaultTtl)
    }

    public fun forwardedCookies(forwardedCookies: IResolvable) {
        cdkBuilder.forwardedCookies(forwardedCookies)
    }

    public fun forwardedCookies(forwardedCookies: CfnDistribution.CookieObjectProperty) {
        cdkBuilder.forwardedCookies(forwardedCookies)
    }

    public fun forwardedHeaders(forwardedHeaders: IResolvable) {
        cdkBuilder.forwardedHeaders(forwardedHeaders)
    }

    public fun forwardedHeaders(forwardedHeaders: CfnDistribution.HeaderObjectProperty) {
        cdkBuilder.forwardedHeaders(forwardedHeaders)
    }

    public fun forwardedQueryStrings(forwardedQueryStrings: IResolvable) {
        cdkBuilder.forwardedQueryStrings(forwardedQueryStrings)
    }

    public fun forwardedQueryStrings(forwardedQueryStrings: CfnDistribution.QueryStringObjectProperty) {
        cdkBuilder.forwardedQueryStrings(forwardedQueryStrings)
    }

    public fun maximumTtl(maximumTtl: Number) {
        cdkBuilder.maximumTtl(maximumTtl)
    }

    public fun minimumTtl(minimumTtl: Number) {
        cdkBuilder.minimumTtl(minimumTtl)
    }

    public fun build(): CfnDistribution.CacheSettingsProperty = cdkBuilder.build()
}
