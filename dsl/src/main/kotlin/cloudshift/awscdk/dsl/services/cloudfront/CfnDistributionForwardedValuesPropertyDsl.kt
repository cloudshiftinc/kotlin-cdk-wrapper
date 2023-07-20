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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDistributionForwardedValuesPropertyDsl {
    private val cdkBuilder: CfnDistribution.ForwardedValuesProperty.Builder =
        CfnDistribution.ForwardedValuesProperty.builder()

    private val _headers: MutableList<String> = mutableListOf()

    private val _queryStringCacheKeys: MutableList<String> = mutableListOf()

    public fun cookies(cookies: IResolvable) {
        cdkBuilder.cookies(cookies)
    }

    public fun cookies(cookies: CfnDistribution.CookiesProperty) {
        cdkBuilder.cookies(cookies)
    }

    public fun headers(vararg headers: String) {
        _headers.addAll(listOf(*headers))
    }

    public fun headers(headers: Collection<String>) {
        _headers.addAll(headers)
    }

    public fun queryString(queryString: Boolean) {
        cdkBuilder.queryString(queryString)
    }

    public fun queryString(queryString: IResolvable) {
        cdkBuilder.queryString(queryString)
    }

    public fun queryStringCacheKeys(vararg queryStringCacheKeys: String) {
        _queryStringCacheKeys.addAll(listOf(*queryStringCacheKeys))
    }

    public fun queryStringCacheKeys(queryStringCacheKeys: Collection<String>) {
        _queryStringCacheKeys.addAll(queryStringCacheKeys)
    }

    public fun build(): CfnDistribution.ForwardedValuesProperty {
        if (_headers.isNotEmpty()) cdkBuilder.headers(_headers)
        if (_queryStringCacheKeys.isNotEmpty()) cdkBuilder.queryStringCacheKeys(_queryStringCacheKeys)
        return cdkBuilder.build()
    }
}
