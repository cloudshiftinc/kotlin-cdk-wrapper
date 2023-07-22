@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPivotTotalOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.PivotTotalOptionsProperty.Builder =
      CfnDashboard.PivotTotalOptionsProperty.builder()

  /**
   * @param customLabel The custom label string for the total cells.
   */
  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
  }

  /**
   * @param metricHeaderCellStyle The cell styling options for the total of header cells.
   */
  public fun metricHeaderCellStyle(metricHeaderCellStyle: IResolvable) {
    cdkBuilder.metricHeaderCellStyle(metricHeaderCellStyle)
  }

  /**
   * @param metricHeaderCellStyle The cell styling options for the total of header cells.
   */
  public fun metricHeaderCellStyle(metricHeaderCellStyle: CfnDashboard.TableCellStyleProperty) {
    cdkBuilder.metricHeaderCellStyle(metricHeaderCellStyle)
  }

  /**
   * @param placement The placement (start, end) for the total cells.
   */
  public fun placement(placement: String) {
    cdkBuilder.placement(placement)
  }

  /**
   * @param scrollStatus The scroll status (pinned, scrolled) for the total cells.
   */
  public fun scrollStatus(scrollStatus: String) {
    cdkBuilder.scrollStatus(scrollStatus)
  }

  /**
   * @param totalCellStyle The cell styling options for the total cells.
   */
  public fun totalCellStyle(totalCellStyle: IResolvable) {
    cdkBuilder.totalCellStyle(totalCellStyle)
  }

  /**
   * @param totalCellStyle The cell styling options for the total cells.
   */
  public fun totalCellStyle(totalCellStyle: CfnDashboard.TableCellStyleProperty) {
    cdkBuilder.totalCellStyle(totalCellStyle)
  }

  /**
   * @param totalsVisibility The visibility configuration for the total cells.
   */
  public fun totalsVisibility(totalsVisibility: String) {
    cdkBuilder.totalsVisibility(totalsVisibility)
  }

  /**
   * @param valueCellStyle The cell styling options for the totals of value cells.
   */
  public fun valueCellStyle(valueCellStyle: IResolvable) {
    cdkBuilder.valueCellStyle(valueCellStyle)
  }

  /**
   * @param valueCellStyle The cell styling options for the totals of value cells.
   */
  public fun valueCellStyle(valueCellStyle: CfnDashboard.TableCellStyleProperty) {
    cdkBuilder.valueCellStyle(valueCellStyle)
  }

  public fun build(): CfnDashboard.PivotTotalOptionsProperty = cdkBuilder.build()
}
