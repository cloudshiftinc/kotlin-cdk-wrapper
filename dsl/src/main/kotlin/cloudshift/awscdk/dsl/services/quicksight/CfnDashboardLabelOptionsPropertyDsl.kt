@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardLabelOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.LabelOptionsProperty.Builder =
      CfnDashboard.LabelOptionsProperty.builder()

  /**
   * @param customLabel The text for the label.
   */
  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
  }

  /**
   * @param fontConfiguration The font configuration of the label.
   */
  public fun fontConfiguration(fontConfiguration: IResolvable) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  /**
   * @param fontConfiguration The font configuration of the label.
   */
  public fun fontConfiguration(fontConfiguration: CfnDashboard.FontConfigurationProperty) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  /**
   * @param visibility Determines whether or not the label is visible.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.LabelOptionsProperty = cdkBuilder.build()
}
