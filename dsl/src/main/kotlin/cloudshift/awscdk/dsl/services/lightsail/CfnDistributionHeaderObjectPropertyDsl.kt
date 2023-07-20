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
import software.amazon.awscdk.services.lightsail.CfnDistribution
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDistributionHeaderObjectPropertyDsl {
    private val cdkBuilder: CfnDistribution.HeaderObjectProperty.Builder =
        CfnDistribution.HeaderObjectProperty.builder()

    private val _headersAllowList: MutableList<String> = mutableListOf()

    public fun headersAllowList(vararg headersAllowList: String) {
        _headersAllowList.addAll(listOf(*headersAllowList))
    }

    public fun headersAllowList(headersAllowList: Collection<String>) {
        _headersAllowList.addAll(headersAllowList)
    }

    public fun option(option: String) {
        cdkBuilder.option(option)
    }

    public fun build(): CfnDistribution.HeaderObjectProperty {
        if (_headersAllowList.isNotEmpty()) cdkBuilder.headersAllowList(_headersAllowList)
        return cdkBuilder.build()
    }
}
