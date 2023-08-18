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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lightsail.CfnDistribution

/**
 * `HeaderObject` is a property of the
 * [CacheSettings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html)
 * property. It describes the request headers used by your distribution, which caches your content
 * based on the request headers.
 *
 * For the headers that you specify, your distribution caches separate versions of the specified
 * content based on the header values in viewer requests. For example, suppose that viewer requests
 * for logo.jpg contain a custom product header that has a value of either acme or apex. Also,
 * suppose that you configure your distribution to cache your content based on values in the product
 * header. Your distribution forwards the product header to the origin and caches the response from
 * the origin once for each header value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * HeaderObjectProperty headerObjectProperty = HeaderObjectProperty.builder()
 * .headersAllowList(List.of("headersAllowList"))
 * .option("option")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-headerobject.html)
 */
@CdkDslMarker
public class CfnDistributionHeaderObjectPropertyDsl {
    private val cdkBuilder: CfnDistribution.HeaderObjectProperty.Builder =
        CfnDistribution.HeaderObjectProperty.builder()

    private val _headersAllowList: MutableList<String> = mutableListOf()

    /** @param headersAllowList The specific headers to forward to your distribution's origin. */
    public fun headersAllowList(vararg headersAllowList: String) {
        _headersAllowList.addAll(listOf(*headersAllowList))
    }

    /** @param headersAllowList The specific headers to forward to your distribution's origin. */
    public fun headersAllowList(headersAllowList: Collection<String>) {
        _headersAllowList.addAll(headersAllowList)
    }

    /**
     * @param option The headers that you want your distribution to forward to your origin. Your
     *   distribution caches your content based on these headers.
     *
     * Use one of the following configurations for your distribution:
     * * *`all`* - Forwards all headers to your origin..
     * * *`none`* - Forwards only the default headers.
     * * *`allow-list`* - Forwards only the headers that you specify using the `HeadersAllowList`
     *   parameter.
     */
    public fun option(option: String) {
        cdkBuilder.option(option)
    }

    public fun build(): CfnDistribution.HeaderObjectProperty {
        if (_headersAllowList.isNotEmpty()) cdkBuilder.headersAllowList(_headersAllowList)
        return cdkBuilder.build()
    }
}
