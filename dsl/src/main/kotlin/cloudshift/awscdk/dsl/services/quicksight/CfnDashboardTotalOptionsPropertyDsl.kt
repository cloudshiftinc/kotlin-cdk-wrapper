@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTotalOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.TotalOptionsProperty.Builder =
      CfnDashboard.TotalOptionsProperty.builder()

  /**
   * @param customLabel The custom label string for the total cells.
   */
  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
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
   * @param totalCellStyle Cell styling options for the total cells.
   */
  public fun totalCellStyle(totalCellStyle: IResolvable) {
    cdkBuilder.totalCellStyle(totalCellStyle)
  }

  /**
   * @param totalCellStyle Cell styling options for the total cells.
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

  public fun build(): CfnDashboard.TotalOptionsProperty = cdkBuilder.build()
}
