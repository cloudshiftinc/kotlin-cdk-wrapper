@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSheetLayoutElementMaximizationOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.SheetLayoutElementMaximizationOptionProperty.Builder =
      CfnDashboard.SheetLayoutElementMaximizationOptionProperty.builder()

  /**
   * @param availabilityStatus The status of the sheet layout maximization options of a dashbaord.
   */
  public fun availabilityStatus(availabilityStatus: String) {
    cdkBuilder.availabilityStatus(availabilityStatus)
  }

  public fun build(): CfnDashboard.SheetLayoutElementMaximizationOptionProperty = cdkBuilder.build()
}
