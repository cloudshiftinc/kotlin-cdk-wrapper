@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateReferenceLineLabelConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.ReferenceLineLabelConfigurationProperty.Builder =
      CfnTemplate.ReferenceLineLabelConfigurationProperty.builder()

  /**
   * @param customLabelConfiguration The custom label configuration of the label in a reference
   * line.
   */
  public fun customLabelConfiguration(customLabelConfiguration: IResolvable) {
    cdkBuilder.customLabelConfiguration(customLabelConfiguration)
  }

  /**
   * @param customLabelConfiguration The custom label configuration of the label in a reference
   * line.
   */
  public
      fun customLabelConfiguration(customLabelConfiguration: CfnTemplate.ReferenceLineCustomLabelConfigurationProperty) {
    cdkBuilder.customLabelConfiguration(customLabelConfiguration)
  }

  /**
   * @param fontColor The font color configuration of the label in a reference line.
   */
  public fun fontColor(fontColor: String) {
    cdkBuilder.fontColor(fontColor)
  }

  /**
   * @param fontConfiguration The font configuration of the label in a reference line.
   */
  public fun fontConfiguration(fontConfiguration: IResolvable) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  /**
   * @param fontConfiguration The font configuration of the label in a reference line.
   */
  public fun fontConfiguration(fontConfiguration: CfnTemplate.FontConfigurationProperty) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  /**
   * @param horizontalPosition The horizontal position configuration of the label in a reference
   * line. Choose one of the following options:.
   * * `LEFT`
   * * `CENTER`
   * * `RIGHT`
   */
  public fun horizontalPosition(horizontalPosition: String) {
    cdkBuilder.horizontalPosition(horizontalPosition)
  }

  /**
   * @param valueLabelConfiguration The value label configuration of the label in a reference line.
   */
  public fun valueLabelConfiguration(valueLabelConfiguration: IResolvable) {
    cdkBuilder.valueLabelConfiguration(valueLabelConfiguration)
  }

  /**
   * @param valueLabelConfiguration The value label configuration of the label in a reference line.
   */
  public
      fun valueLabelConfiguration(valueLabelConfiguration: CfnTemplate.ReferenceLineValueLabelConfigurationProperty) {
    cdkBuilder.valueLabelConfiguration(valueLabelConfiguration)
  }

  /**
   * @param verticalPosition The vertical position configuration of the label in a reference line.
   * Choose one of the following options:.
   * * `ABOVE`
   * * `BELOW`
   */
  public fun verticalPosition(verticalPosition: String) {
    cdkBuilder.verticalPosition(verticalPosition)
  }

  public fun build(): CfnTemplate.ReferenceLineLabelConfigurationProperty = cdkBuilder.build()
}
