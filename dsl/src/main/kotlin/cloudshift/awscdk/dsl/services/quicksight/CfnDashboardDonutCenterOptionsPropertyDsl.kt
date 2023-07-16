@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDonutCenterOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.DonutCenterOptionsProperty.Builder =
      CfnDashboard.DonutCenterOptionsProperty.builder()

  public fun labelVisibility(labelVisibility: String) {
    cdkBuilder.labelVisibility(labelVisibility)
  }

  public fun build(): CfnDashboard.DonutCenterOptionsProperty = cdkBuilder.build()
}
