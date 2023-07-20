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

@CdkDslMarker
public class CfnDashboardPivotTableConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTableConfigurationProperty.Builder =
        CfnDashboard.PivotTableConfigurationProperty.builder()

    public fun fieldOptions(fieldOptions: IResolvable) {
        cdkBuilder.fieldOptions(fieldOptions)
    }

    public fun fieldOptions(fieldOptions: CfnDashboard.PivotTableFieldOptionsProperty) {
        cdkBuilder.fieldOptions(fieldOptions)
    }

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnDashboard.PivotTableFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun paginatedReportOptions(paginatedReportOptions: IResolvable) {
        cdkBuilder.paginatedReportOptions(paginatedReportOptions)
    }

    public fun paginatedReportOptions(paginatedReportOptions: CfnDashboard.PivotTablePaginatedReportOptionsProperty) {
        cdkBuilder.paginatedReportOptions(paginatedReportOptions)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnDashboard.PivotTableSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun tableOptions(tableOptions: IResolvable) {
        cdkBuilder.tableOptions(tableOptions)
    }

    public fun tableOptions(tableOptions: CfnDashboard.PivotTableOptionsProperty) {
        cdkBuilder.tableOptions(tableOptions)
    }

    public fun totalOptions(totalOptions: IResolvable) {
        cdkBuilder.totalOptions(totalOptions)
    }

    public fun totalOptions(totalOptions: CfnDashboard.PivotTableTotalOptionsProperty) {
        cdkBuilder.totalOptions(totalOptions)
    }

    public fun build(): CfnDashboard.PivotTableConfigurationProperty = cdkBuilder.build()
}
