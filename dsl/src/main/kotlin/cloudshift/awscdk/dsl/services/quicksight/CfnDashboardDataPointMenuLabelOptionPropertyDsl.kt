@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDataPointMenuLabelOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.DataPointMenuLabelOptionProperty.Builder =
      CfnDashboard.DataPointMenuLabelOptionProperty.builder()

  /**
   * @param availabilityStatus The status of the data point menu options.
   */
  public fun availabilityStatus(availabilityStatus: String) {
    cdkBuilder.availabilityStatus(availabilityStatus)
  }

  public fun build(): CfnDashboard.DataPointMenuLabelOptionProperty = cdkBuilder.build()
}
