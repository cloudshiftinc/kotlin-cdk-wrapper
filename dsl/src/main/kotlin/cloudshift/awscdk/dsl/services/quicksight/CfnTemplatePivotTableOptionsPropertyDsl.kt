@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePivotTableOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.PivotTableOptionsProperty.Builder =
      CfnTemplate.PivotTableOptionsProperty.builder()

  /**
   * @param cellStyle The table cell style of cells.
   */
  public fun cellStyle(cellStyle: IResolvable) {
    cdkBuilder.cellStyle(cellStyle)
  }

  /**
   * @param cellStyle The table cell style of cells.
   */
  public fun cellStyle(cellStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.cellStyle(cellStyle)
  }

  /**
   * @param collapsedRowDimensionsVisibility The visibility setting of a pivot table's collapsed row
   * dimension fields.
   * If the value of this structure is `HIDDEN` , all collapsed columns in a pivot table are
   * automatically hidden. The default value is `VISIBLE` .
   */
  public fun collapsedRowDimensionsVisibility(collapsedRowDimensionsVisibility: String) {
    cdkBuilder.collapsedRowDimensionsVisibility(collapsedRowDimensionsVisibility)
  }

  /**
   * @param columnHeaderStyle The table cell style of the column header.
   */
  public fun columnHeaderStyle(columnHeaderStyle: IResolvable) {
    cdkBuilder.columnHeaderStyle(columnHeaderStyle)
  }

  /**
   * @param columnHeaderStyle The table cell style of the column header.
   */
  public fun columnHeaderStyle(columnHeaderStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.columnHeaderStyle(columnHeaderStyle)
  }

  /**
   * @param columnNamesVisibility The visibility of the column names.
   */
  public fun columnNamesVisibility(columnNamesVisibility: String) {
    cdkBuilder.columnNamesVisibility(columnNamesVisibility)
  }

  /**
   * @param metricPlacement The metric placement (row, column) options.
   */
  public fun metricPlacement(metricPlacement: String) {
    cdkBuilder.metricPlacement(metricPlacement)
  }

  /**
   * @param rowAlternateColorOptions The row alternate color options (widget status, row alternate
   * colors).
   */
  public fun rowAlternateColorOptions(rowAlternateColorOptions: IResolvable) {
    cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
  }

  /**
   * @param rowAlternateColorOptions The row alternate color options (widget status, row alternate
   * colors).
   */
  public
      fun rowAlternateColorOptions(rowAlternateColorOptions: CfnTemplate.RowAlternateColorOptionsProperty) {
    cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
  }

  /**
   * @param rowFieldNamesStyle The table cell style of row field names.
   */
  public fun rowFieldNamesStyle(rowFieldNamesStyle: IResolvable) {
    cdkBuilder.rowFieldNamesStyle(rowFieldNamesStyle)
  }

  /**
   * @param rowFieldNamesStyle The table cell style of row field names.
   */
  public fun rowFieldNamesStyle(rowFieldNamesStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.rowFieldNamesStyle(rowFieldNamesStyle)
  }

  /**
   * @param rowHeaderStyle The table cell style of the row headers.
   */
  public fun rowHeaderStyle(rowHeaderStyle: IResolvable) {
    cdkBuilder.rowHeaderStyle(rowHeaderStyle)
  }

  /**
   * @param rowHeaderStyle The table cell style of the row headers.
   */
  public fun rowHeaderStyle(rowHeaderStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.rowHeaderStyle(rowHeaderStyle)
  }

  /**
   * @param singleMetricVisibility The visibility of the single metric options.
   */
  public fun singleMetricVisibility(singleMetricVisibility: String) {
    cdkBuilder.singleMetricVisibility(singleMetricVisibility)
  }

  /**
   * @param toggleButtonsVisibility Determines the visibility of the pivot table.
   */
  public fun toggleButtonsVisibility(toggleButtonsVisibility: String) {
    cdkBuilder.toggleButtonsVisibility(toggleButtonsVisibility)
  }

  public fun build(): CfnTemplate.PivotTableOptionsProperty = cdkBuilder.build()
}
