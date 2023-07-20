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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalysisHeatMapSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.HeatMapSortConfigurationProperty.Builder =
        CfnAnalysis.HeatMapSortConfigurationProperty.builder()

    private val _heatMapColumnSort: MutableList<Any> = mutableListOf()

    private val _heatMapRowSort: MutableList<Any> = mutableListOf()

    public fun heatMapColumnItemsLimitConfiguration(heatMapColumnItemsLimitConfiguration: IResolvable) {
        cdkBuilder.heatMapColumnItemsLimitConfiguration(heatMapColumnItemsLimitConfiguration)
    }

    public fun heatMapColumnItemsLimitConfiguration(heatMapColumnItemsLimitConfiguration: CfnAnalysis.ItemsLimitConfigurationProperty) {
        cdkBuilder.heatMapColumnItemsLimitConfiguration(heatMapColumnItemsLimitConfiguration)
    }

    public fun heatMapColumnSort(vararg heatMapColumnSort: Any) {
        _heatMapColumnSort.addAll(listOf(*heatMapColumnSort))
    }

    public fun heatMapColumnSort(heatMapColumnSort: Collection<Any>) {
        _heatMapColumnSort.addAll(heatMapColumnSort)
    }

    public fun heatMapColumnSort(heatMapColumnSort: IResolvable) {
        cdkBuilder.heatMapColumnSort(heatMapColumnSort)
    }

    public fun heatMapRowItemsLimitConfiguration(heatMapRowItemsLimitConfiguration: IResolvable) {
        cdkBuilder.heatMapRowItemsLimitConfiguration(heatMapRowItemsLimitConfiguration)
    }

    public fun heatMapRowItemsLimitConfiguration(heatMapRowItemsLimitConfiguration: CfnAnalysis.ItemsLimitConfigurationProperty) {
        cdkBuilder.heatMapRowItemsLimitConfiguration(heatMapRowItemsLimitConfiguration)
    }

    public fun heatMapRowSort(vararg heatMapRowSort: Any) {
        _heatMapRowSort.addAll(listOf(*heatMapRowSort))
    }

    public fun heatMapRowSort(heatMapRowSort: Collection<Any>) {
        _heatMapRowSort.addAll(heatMapRowSort)
    }

    public fun heatMapRowSort(heatMapRowSort: IResolvable) {
        cdkBuilder.heatMapRowSort(heatMapRowSort)
    }

    public fun build(): CfnAnalysis.HeatMapSortConfigurationProperty {
        if (_heatMapColumnSort.isNotEmpty()) cdkBuilder.heatMapColumnSort(_heatMapColumnSort)
        if (_heatMapRowSort.isNotEmpty()) cdkBuilder.heatMapRowSort(_heatMapRowSort)
        return cdkBuilder.build()
    }
}
