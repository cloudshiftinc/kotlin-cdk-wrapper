@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDataPointDrillUpDownOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.DataPointDrillUpDownOptionProperty.Builder =
      CfnDashboard.DataPointDrillUpDownOptionProperty.builder()

  public fun availabilityStatus(availabilityStatus: String) {
    cdkBuilder.availabilityStatus(availabilityStatus)
  }

  public fun build(): CfnDashboard.DataPointDrillUpDownOptionProperty = cdkBuilder.build()
}
