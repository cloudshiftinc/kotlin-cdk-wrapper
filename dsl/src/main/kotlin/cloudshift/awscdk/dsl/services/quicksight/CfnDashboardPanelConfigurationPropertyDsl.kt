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

  /**
   * @param backgroundColor Sets the background color for each panel.
   */
  public fun backgroundColor(backgroundColor: String) {
    cdkBuilder.backgroundColor(backgroundColor)
  }

  /**
   * @param backgroundVisibility Determines whether or not a background for each small multiples
   * panel is rendered.
   */
  public fun backgroundVisibility(backgroundVisibility: String) {
    cdkBuilder.backgroundVisibility(backgroundVisibility)
  }

  /**
   * @param borderColor Sets the line color of panel borders.
   */
  public fun borderColor(borderColor: String) {
    cdkBuilder.borderColor(borderColor)
  }

  /**
   * @param borderStyle Sets the line style of panel borders.
   */
  public fun borderStyle(borderStyle: String) {
    cdkBuilder.borderStyle(borderStyle)
  }

  /**
   * @param borderThickness Sets the line thickness of panel borders.
   */
  public fun borderThickness(borderThickness: String) {
    cdkBuilder.borderThickness(borderThickness)
  }

  /**
   * @param borderVisibility Determines whether or not each panel displays a border.
   */
  public fun borderVisibility(borderVisibility: String) {
    cdkBuilder.borderVisibility(borderVisibility)
  }

  /**
   * @param gutterSpacing Sets the total amount of negative space to display between sibling panels.
   */
  public fun gutterSpacing(gutterSpacing: String) {
    cdkBuilder.gutterSpacing(gutterSpacing)
  }

  /**
   * @param gutterVisibility Determines whether or not negative space between sibling panels is
   * rendered.
   */
  public fun gutterVisibility(gutterVisibility: String) {
    cdkBuilder.gutterVisibility(gutterVisibility)
  }

  /**
   * @param title Configures the title display within each small multiples panel.
   */
  public fun title(title: IResolvable) {
    cdkBuilder.title(title)
  }

  /**
   * @param title Configures the title display within each small multiples panel.
   */
  public fun title(title: CfnDashboard.PanelTitleOptionsProperty) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnDashboard.PanelConfigurationProperty = cdkBuilder.build()
}
