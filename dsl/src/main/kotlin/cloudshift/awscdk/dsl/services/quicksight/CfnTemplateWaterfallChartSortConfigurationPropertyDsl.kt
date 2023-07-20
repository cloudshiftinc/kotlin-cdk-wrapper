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
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTemplateWaterfallChartSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.WaterfallChartSortConfigurationProperty.Builder =
        CfnTemplate.WaterfallChartSortConfigurationProperty.builder()

    private val _categorySort: MutableList<Any> = mutableListOf()

    public fun breakdownItemsLimit(breakdownItemsLimit: IResolvable) {
        cdkBuilder.breakdownItemsLimit(breakdownItemsLimit)
    }

    public fun breakdownItemsLimit(breakdownItemsLimit: CfnTemplate.ItemsLimitConfigurationProperty) {
        cdkBuilder.breakdownItemsLimit(breakdownItemsLimit)
    }

    public fun categorySort(vararg categorySort: Any) {
        _categorySort.addAll(listOf(*categorySort))
    }

    public fun categorySort(categorySort: Collection<Any>) {
        _categorySort.addAll(categorySort)
    }

    public fun categorySort(categorySort: IResolvable) {
        cdkBuilder.categorySort(categorySort)
    }

    public fun build(): CfnTemplate.WaterfallChartSortConfigurationProperty {
        if (_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
        return cdkBuilder.build()
    }
}
