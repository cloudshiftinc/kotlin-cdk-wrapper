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
public class CfnDashboardTreeMapSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.TreeMapSortConfigurationProperty.Builder =
        CfnDashboard.TreeMapSortConfigurationProperty.builder()

    private val _treeMapSort: MutableList<Any> = mutableListOf()

    public fun treeMapGroupItemsLimitConfiguration(treeMapGroupItemsLimitConfiguration: IResolvable) {
        cdkBuilder.treeMapGroupItemsLimitConfiguration(treeMapGroupItemsLimitConfiguration)
    }

    public fun treeMapGroupItemsLimitConfiguration(treeMapGroupItemsLimitConfiguration: CfnDashboard.ItemsLimitConfigurationProperty) {
        cdkBuilder.treeMapGroupItemsLimitConfiguration(treeMapGroupItemsLimitConfiguration)
    }

    public fun treeMapSort(vararg treeMapSort: Any) {
        _treeMapSort.addAll(listOf(*treeMapSort))
    }

    public fun treeMapSort(treeMapSort: Collection<Any>) {
        _treeMapSort.addAll(treeMapSort)
    }

    public fun treeMapSort(treeMapSort: IResolvable) {
        cdkBuilder.treeMapSort(treeMapSort)
    }

    public fun build(): CfnDashboard.TreeMapSortConfigurationProperty {
        if (_treeMapSort.isNotEmpty()) cdkBuilder.treeMapSort(_treeMapSort)
        return cdkBuilder.build()
    }
}
