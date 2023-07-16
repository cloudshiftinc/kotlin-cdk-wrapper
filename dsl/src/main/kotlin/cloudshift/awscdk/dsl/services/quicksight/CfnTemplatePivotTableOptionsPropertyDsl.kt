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

  public fun cellStyle(cellStyle: IResolvable) {
    cdkBuilder.cellStyle(cellStyle)
  }

  public fun cellStyle(cellStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.cellStyle(cellStyle)
  }

  public fun collapsedRowDimensionsVisibility(collapsedRowDimensionsVisibility: String) {
    cdkBuilder.collapsedRowDimensionsVisibility(collapsedRowDimensionsVisibility)
  }

  public fun columnHeaderStyle(columnHeaderStyle: IResolvable) {
    cdkBuilder.columnHeaderStyle(columnHeaderStyle)
  }

  public fun columnHeaderStyle(columnHeaderStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.columnHeaderStyle(columnHeaderStyle)
  }

  public fun columnNamesVisibility(columnNamesVisibility: String) {
    cdkBuilder.columnNamesVisibility(columnNamesVisibility)
  }

  public fun metricPlacement(metricPlacement: String) {
    cdkBuilder.metricPlacement(metricPlacement)
  }

  public fun rowAlternateColorOptions(rowAlternateColorOptions: IResolvable) {
    cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
  }

  public
      fun rowAlternateColorOptions(rowAlternateColorOptions: CfnTemplate.RowAlternateColorOptionsProperty) {
    cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
  }

  public fun rowFieldNamesStyle(rowFieldNamesStyle: IResolvable) {
    cdkBuilder.rowFieldNamesStyle(rowFieldNamesStyle)
  }

  public fun rowFieldNamesStyle(rowFieldNamesStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.rowFieldNamesStyle(rowFieldNamesStyle)
  }

  public fun rowHeaderStyle(rowHeaderStyle: IResolvable) {
    cdkBuilder.rowHeaderStyle(rowHeaderStyle)
  }

  public fun rowHeaderStyle(rowHeaderStyle: CfnTemplate.TableCellStyleProperty) {
    cdkBuilder.rowHeaderStyle(rowHeaderStyle)
  }

  public fun singleMetricVisibility(singleMetricVisibility: String) {
    cdkBuilder.singleMetricVisibility(singleMetricVisibility)
  }

  public fun toggleButtonsVisibility(toggleButtonsVisibility: String) {
    cdkBuilder.toggleButtonsVisibility(toggleButtonsVisibility)
  }

  public fun build(): CfnTemplate.PivotTableOptionsProperty = cdkBuilder.build()
}
