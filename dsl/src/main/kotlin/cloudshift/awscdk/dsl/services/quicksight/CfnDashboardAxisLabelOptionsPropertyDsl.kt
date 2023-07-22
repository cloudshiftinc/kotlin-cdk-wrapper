@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardAxisLabelOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.AxisLabelOptionsProperty.Builder =
      CfnDashboard.AxisLabelOptionsProperty.builder()

  /**
   * @param applyTo The options that indicate which field the label belongs to.
   */
  public fun applyTo(applyTo: IResolvable) {
    cdkBuilder.applyTo(applyTo)
  }

  /**
   * @param applyTo The options that indicate which field the label belongs to.
   */
  public fun applyTo(applyTo: CfnDashboard.AxisLabelReferenceOptionsProperty) {
    cdkBuilder.applyTo(applyTo)
  }

  /**
   * @param customLabel The text for the axis label.
   */
  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
  }

  /**
   * @param fontConfiguration The font configuration of the axis label.
   */
  public fun fontConfiguration(fontConfiguration: IResolvable) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  /**
   * @param fontConfiguration The font configuration of the axis label.
   */
  public fun fontConfiguration(fontConfiguration: CfnDashboard.FontConfigurationProperty) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  public fun build(): CfnDashboard.AxisLabelOptionsProperty = cdkBuilder.build()
}
