@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPanelConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.PanelConfigurationProperty.Builder =
      CfnDashboard.PanelConfigurationProperty.builder()

  public fun backgroundColor(backgroundColor: String) {
    cdkBuilder.backgroundColor(backgroundColor)
  }

  public fun backgroundVisibility(backgroundVisibility: String) {
    cdkBuilder.backgroundVisibility(backgroundVisibility)
  }

  public fun borderColor(borderColor: String) {
    cdkBuilder.borderColor(borderColor)
  }

  public fun borderStyle(borderStyle: String) {
    cdkBuilder.borderStyle(borderStyle)
  }

  public fun borderThickness(borderThickness: String) {
    cdkBuilder.borderThickness(borderThickness)
  }

  public fun borderVisibility(borderVisibility: String) {
    cdkBuilder.borderVisibility(borderVisibility)
  }

  public fun gutterSpacing(gutterSpacing: String) {
    cdkBuilder.gutterSpacing(gutterSpacing)
  }

  public fun gutterVisibility(gutterVisibility: String) {
    cdkBuilder.gutterVisibility(gutterVisibility)
  }

  public fun title(title: IResolvable) {
    cdkBuilder.title(title)
  }

  public fun title(title: CfnDashboard.PanelTitleOptionsProperty) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnDashboard.PanelConfigurationProperty = cdkBuilder.build()
}
