@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePivotTableConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.PivotTableConfigurationProperty.Builder =
      CfnTemplate.PivotTableConfigurationProperty.builder()

  public fun fieldOptions(fieldOptions: IResolvable) {
    cdkBuilder.fieldOptions(fieldOptions)
  }

  public fun fieldOptions(fieldOptions: CfnTemplate.PivotTableFieldOptionsProperty) {
    cdkBuilder.fieldOptions(fieldOptions)
  }

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnTemplate.PivotTableFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun paginatedReportOptions(paginatedReportOptions: IResolvable) {
    cdkBuilder.paginatedReportOptions(paginatedReportOptions)
  }

  public
      fun paginatedReportOptions(paginatedReportOptions: CfnTemplate.PivotTablePaginatedReportOptionsProperty) {
    cdkBuilder.paginatedReportOptions(paginatedReportOptions)
  }

  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun sortConfiguration(sortConfiguration: CfnTemplate.PivotTableSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun tableOptions(tableOptions: IResolvable) {
    cdkBuilder.tableOptions(tableOptions)
  }

  public fun tableOptions(tableOptions: CfnTemplate.PivotTableOptionsProperty) {
    cdkBuilder.tableOptions(tableOptions)
  }

  public fun totalOptions(totalOptions: IResolvable) {
    cdkBuilder.totalOptions(totalOptions)
  }

  public fun totalOptions(totalOptions: CfnTemplate.PivotTableTotalOptionsProperty) {
    cdkBuilder.totalOptions(totalOptions)
  }

  public fun build(): CfnTemplate.PivotTableConfigurationProperty = cdkBuilder.build()
}
