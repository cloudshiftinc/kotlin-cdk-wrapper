@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPivotTableConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotTableConfigurationProperty.Builder =
      CfnAnalysis.PivotTableConfigurationProperty.builder()

  /**
   * @param fieldOptions The field options for a pivot table visual.
   */
  public fun fieldOptions(fieldOptions: IResolvable) {
    cdkBuilder.fieldOptions(fieldOptions)
  }

  /**
   * @param fieldOptions The field options for a pivot table visual.
   */
  public fun fieldOptions(fieldOptions: CfnAnalysis.PivotTableFieldOptionsProperty) {
    cdkBuilder.fieldOptions(fieldOptions)
  }

  /**
   * @param fieldWells The field wells of the visual.
   */
  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param fieldWells The field wells of the visual.
   */
  public fun fieldWells(fieldWells: CfnAnalysis.PivotTableFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  /**
   * @param paginatedReportOptions The paginated report options for a pivot table visual.
   */
  public fun paginatedReportOptions(paginatedReportOptions: IResolvable) {
    cdkBuilder.paginatedReportOptions(paginatedReportOptions)
  }

  /**
   * @param paginatedReportOptions The paginated report options for a pivot table visual.
   */
  public
      fun paginatedReportOptions(paginatedReportOptions: CfnAnalysis.PivotTablePaginatedReportOptionsProperty) {
    cdkBuilder.paginatedReportOptions(paginatedReportOptions)
  }

  /**
   * @param sortConfiguration The sort configuration for a `PivotTableVisual` .
   */
  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param sortConfiguration The sort configuration for a `PivotTableVisual` .
   */
  public fun sortConfiguration(sortConfiguration: CfnAnalysis.PivotTableSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  /**
   * @param tableOptions The table options for a pivot table visual.
   */
  public fun tableOptions(tableOptions: IResolvable) {
    cdkBuilder.tableOptions(tableOptions)
  }

  /**
   * @param tableOptions The table options for a pivot table visual.
   */
  public fun tableOptions(tableOptions: CfnAnalysis.PivotTableOptionsProperty) {
    cdkBuilder.tableOptions(tableOptions)
  }

  /**
   * @param totalOptions The total options for a pivot table visual.
   */
  public fun totalOptions(totalOptions: IResolvable) {
    cdkBuilder.totalOptions(totalOptions)
  }

  /**
   * @param totalOptions The total options for a pivot table visual.
   */
  public fun totalOptions(totalOptions: CfnAnalysis.PivotTableTotalOptionsProperty) {
    cdkBuilder.totalOptions(totalOptions)
  }

  public fun build(): CfnAnalysis.PivotTableConfigurationProperty = cdkBuilder.build()
}
