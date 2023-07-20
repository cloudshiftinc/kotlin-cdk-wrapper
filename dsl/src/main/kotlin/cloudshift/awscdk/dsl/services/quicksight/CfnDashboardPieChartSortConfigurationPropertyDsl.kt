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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardPieChartSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.PieChartSortConfigurationProperty.Builder =
        CfnDashboard.PieChartSortConfigurationProperty.builder()

    private val _categorySort: MutableList<Any> = mutableListOf()

    private val _smallMultiplesSort: MutableList<Any> = mutableListOf()

    public fun categoryItemsLimit(categoryItemsLimit: IResolvable) {
        cdkBuilder.categoryItemsLimit(categoryItemsLimit)
    }

    public fun categoryItemsLimit(categoryItemsLimit: CfnDashboard.ItemsLimitConfigurationProperty) {
        cdkBuilder.categoryItemsLimit(categoryItemsLimit)
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

    public fun smallMultiplesLimitConfiguration(smallMultiplesLimitConfiguration: IResolvable) {
        cdkBuilder.smallMultiplesLimitConfiguration(smallMultiplesLimitConfiguration)
    }

    public fun smallMultiplesLimitConfiguration(smallMultiplesLimitConfiguration: CfnDashboard.ItemsLimitConfigurationProperty) {
        cdkBuilder.smallMultiplesLimitConfiguration(smallMultiplesLimitConfiguration)
    }

    public fun smallMultiplesSort(vararg smallMultiplesSort: Any) {
        _smallMultiplesSort.addAll(listOf(*smallMultiplesSort))
    }

    public fun smallMultiplesSort(smallMultiplesSort: Collection<Any>) {
        _smallMultiplesSort.addAll(smallMultiplesSort)
    }

    public fun smallMultiplesSort(smallMultiplesSort: IResolvable) {
        cdkBuilder.smallMultiplesSort(smallMultiplesSort)
    }

    public fun build(): CfnDashboard.PieChartSortConfigurationProperty {
        if (_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
        if (_smallMultiplesSort.isNotEmpty()) cdkBuilder.smallMultiplesSort(_smallMultiplesSort)
        return cdkBuilder.build()
    }
}
