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
public class CfnDashboardBoxPlotSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.BoxPlotSortConfigurationProperty.Builder =
        CfnDashboard.BoxPlotSortConfigurationProperty.builder()

    private val _categorySort: MutableList<Any> = mutableListOf()

    public fun categorySort(vararg categorySort: Any) {
        _categorySort.addAll(listOf(*categorySort))
    }

    public fun categorySort(categorySort: Collection<Any>) {
        _categorySort.addAll(categorySort)
    }

    public fun categorySort(categorySort: IResolvable) {
        cdkBuilder.categorySort(categorySort)
    }

    public fun paginationConfiguration(paginationConfiguration: IResolvable) {
        cdkBuilder.paginationConfiguration(paginationConfiguration)
    }

    public fun paginationConfiguration(paginationConfiguration: CfnDashboard.PaginationConfigurationProperty) {
        cdkBuilder.paginationConfiguration(paginationConfiguration)
    }

    public fun build(): CfnDashboard.BoxPlotSortConfigurationProperty {
        if (_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
        return cdkBuilder.build()
    }
}
