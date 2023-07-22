@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisAxisLabelOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.AxisLabelOptionsProperty.Builder =
      CfnAnalysis.AxisLabelOptionsProperty.builder()

  /**
   * @param applyTo The options that indicate which field the label belongs to.
   */
  public fun applyTo(applyTo: IResolvable) {
    cdkBuilder.applyTo(applyTo)
  }

  /**
   * @param applyTo The options that indicate which field the label belongs to.
   */
  public fun applyTo(applyTo: CfnAnalysis.AxisLabelReferenceOptionsProperty) {
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
  public fun fontConfiguration(fontConfiguration: CfnAnalysis.FontConfigurationProperty) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  public fun build(): CfnAnalysis.AxisLabelOptionsProperty = cdkBuilder.build()
}
