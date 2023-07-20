@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardArcConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ArcConfigurationProperty.Builder =
      CfnDashboard.ArcConfigurationProperty.builder()

  public fun arcAngle(arcAngle: Number) {
    cdkBuilder.arcAngle(arcAngle)
  }

  public fun arcThickness(arcThickness: String) {
    cdkBuilder.arcThickness(arcThickness)
  }

  public fun build(): CfnDashboard.ArcConfigurationProperty = cdkBuilder.build()
}
