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

@CdkDslMarker
public class CfnAnalysisPivotTableConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.PivotTableConfigurationProperty.Builder =
        CfnAnalysis.PivotTableConfigurationProperty.builder()

    public fun fieldOptions(fieldOptions: IResolvable) {
        cdkBuilder.fieldOptions(fieldOptions)
    }

    public fun fieldOptions(fieldOptions: CfnAnalysis.PivotTableFieldOptionsProperty) {
        cdkBuilder.fieldOptions(fieldOptions)
    }

    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun fieldWells(fieldWells: CfnAnalysis.PivotTableFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    public fun paginatedReportOptions(paginatedReportOptions: IResolvable) {
        cdkBuilder.paginatedReportOptions(paginatedReportOptions)
    }

    public fun paginatedReportOptions(paginatedReportOptions: CfnAnalysis.PivotTablePaginatedReportOptionsProperty) {
        cdkBuilder.paginatedReportOptions(paginatedReportOptions)
    }

    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun sortConfiguration(sortConfiguration: CfnAnalysis.PivotTableSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    public fun tableOptions(tableOptions: IResolvable) {
        cdkBuilder.tableOptions(tableOptions)
    }

    public fun tableOptions(tableOptions: CfnAnalysis.PivotTableOptionsProperty) {
        cdkBuilder.tableOptions(tableOptions)
    }

    public fun totalOptions(totalOptions: IResolvable) {
        cdkBuilder.totalOptions(totalOptions)
    }

    public fun totalOptions(totalOptions: CfnAnalysis.PivotTableTotalOptionsProperty) {
        cdkBuilder.totalOptions(totalOptions)
    }

    public fun build(): CfnAnalysis.PivotTableConfigurationProperty = cdkBuilder.build()
}
