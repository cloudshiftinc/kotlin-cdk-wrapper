@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardLocalNavigationConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.LocalNavigationConfigurationProperty.Builder =
      CfnDashboard.LocalNavigationConfigurationProperty.builder()

  public fun targetSheetId(targetSheetId: String) {
    cdkBuilder.targetSheetId(targetSheetId)
  }

  public fun build(): CfnDashboard.LocalNavigationConfigurationProperty = cdkBuilder.build()
}
