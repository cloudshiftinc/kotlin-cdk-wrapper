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

package io.cloudshiftdev.awscdkdsl.services.lightsail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnDistribution

/**
 * `QueryStringObject` is a property of the
 * [CacheSettings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html)
 * property. It describes the query string parameters that an Amazon Lightsail content delivery
 * network (CDN) distribution to bases caching on.
 *
 * For the query strings that you specify, your distribution caches separate versions of the
 * specified content based on the query string values in viewer requests.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * QueryStringObjectProperty queryStringObjectProperty = QueryStringObjectProperty.builder()
 * .option(false)
 * .queryStringsAllowList(List.of("queryStringsAllowList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-querystringobject.html)
 */
@CdkDslMarker
public class CfnDistributionQueryStringObjectPropertyDsl {
    private val cdkBuilder: CfnDistribution.QueryStringObjectProperty.Builder =
        CfnDistribution.QueryStringObjectProperty.builder()

    private val _queryStringsAllowList: MutableList<String> = mutableListOf()

    /**
     * @param option Indicates whether the distribution forwards and caches based on query strings.
     */
    public fun option(option: Boolean) {
        cdkBuilder.option(option)
    }

    /**
     * @param option Indicates whether the distribution forwards and caches based on query strings.
     */
    public fun option(option: IResolvable) {
        cdkBuilder.option(option)
    }

    /**
     * @param queryStringsAllowList The specific query strings that the distribution forwards to the
     *   origin. Your distribution caches content based on the specified query strings.
     *
     * If the `option` parameter is true, then your distribution forwards all query strings,
     * regardless of what you specify using the `QueryStringsAllowList` parameter.
     */
    public fun queryStringsAllowList(vararg queryStringsAllowList: String) {
        _queryStringsAllowList.addAll(listOf(*queryStringsAllowList))
    }

    /**
     * @param queryStringsAllowList The specific query strings that the distribution forwards to the
     *   origin. Your distribution caches content based on the specified query strings.
     *
     * If the `option` parameter is true, then your distribution forwards all query strings,
     * regardless of what you specify using the `QueryStringsAllowList` parameter.
     */
    public fun queryStringsAllowList(queryStringsAllowList: Collection<String>) {
        _queryStringsAllowList.addAll(queryStringsAllowList)
    }

    public fun build(): CfnDistribution.QueryStringObjectProperty {
        if (_queryStringsAllowList.isNotEmpty())
            cdkBuilder.queryStringsAllowList(_queryStringsAllowList)
        return cdkBuilder.build()
    }
}
