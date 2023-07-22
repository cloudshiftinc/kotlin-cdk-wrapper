@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardAdHocFilteringOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.AdHocFilteringOptionProperty.Builder =
      CfnDashboard.AdHocFilteringOptionProperty.builder()

  /**
   * @param availabilityStatus Availability status.
   */
  public fun availabilityStatus(availabilityStatus: String) {
    cdkBuilder.availabilityStatus(availabilityStatus)
  }

  public fun build(): CfnDashboard.AdHocFilteringOptionProperty = cdkBuilder.build()
}
