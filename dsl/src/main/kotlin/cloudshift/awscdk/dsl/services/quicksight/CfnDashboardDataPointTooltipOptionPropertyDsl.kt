@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDataPointTooltipOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.DataPointTooltipOptionProperty.Builder =
      CfnDashboard.DataPointTooltipOptionProperty.builder()

  public fun availabilityStatus(availabilityStatus: String) {
    cdkBuilder.availabilityStatus(availabilityStatus)
  }

  public fun build(): CfnDashboard.DataPointTooltipOptionProperty = cdkBuilder.build()
}
