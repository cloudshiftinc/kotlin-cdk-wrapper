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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardPredefinedHierarchyPropertyDsl {
    private val cdkBuilder: CfnDashboard.PredefinedHierarchyProperty.Builder =
        CfnDashboard.PredefinedHierarchyProperty.builder()

    private val _columns: MutableList<Any> = mutableListOf()

    private val _drillDownFilters: MutableList<Any> = mutableListOf()

    public fun columns(vararg columns: Any) {
        _columns.addAll(listOf(*columns))
    }

    public fun columns(columns: Collection<Any>) {
        _columns.addAll(columns)
    }

    public fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns)
    }

    public fun drillDownFilters(vararg drillDownFilters: Any) {
        _drillDownFilters.addAll(listOf(*drillDownFilters))
    }

    public fun drillDownFilters(drillDownFilters: Collection<Any>) {
        _drillDownFilters.addAll(drillDownFilters)
    }

    public fun drillDownFilters(drillDownFilters: IResolvable) {
        cdkBuilder.drillDownFilters(drillDownFilters)
    }

    public fun hierarchyId(hierarchyId: String) {
        cdkBuilder.hierarchyId(hierarchyId)
    }

    public fun build(): CfnDashboard.PredefinedHierarchyProperty {
        if (_columns.isNotEmpty()) cdkBuilder.columns(_columns)
        if (_drillDownFilters.isNotEmpty()) cdkBuilder.drillDownFilters(_drillDownFilters)
        return cdkBuilder.build()
    }
}
