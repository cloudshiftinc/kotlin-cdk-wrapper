@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPanelTitleOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.PanelTitleOptionsProperty.Builder =
      CfnDashboard.PanelTitleOptionsProperty.builder()

  public fun fontConfiguration(fontConfiguration: IResolvable) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  public fun fontConfiguration(fontConfiguration: CfnDashboard.FontConfigurationProperty) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  public fun horizontalTextAlignment(horizontalTextAlignment: String) {
    cdkBuilder.horizontalTextAlignment(horizontalTextAlignment)
  }

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.PanelTitleOptionsProperty = cdkBuilder.build()
}
