@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardVisualMenuOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.VisualMenuOptionProperty.Builder =
      CfnDashboard.VisualMenuOptionProperty.builder()

  public fun availabilityStatus(availabilityStatus: String) {
    cdkBuilder.availabilityStatus(availabilityStatus)
  }

  public fun build(): CfnDashboard.VisualMenuOptionProperty = cdkBuilder.build()
}
