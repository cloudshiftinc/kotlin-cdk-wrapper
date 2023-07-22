@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFontConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FontConfigurationProperty.Builder =
      CfnAnalysis.FontConfigurationProperty.builder()

  /**
   * @param fontColor Determines the color of the text.
   */
  public fun fontColor(fontColor: String) {
    cdkBuilder.fontColor(fontColor)
  }

  /**
   * @param fontDecoration Determines the appearance of decorative lines on the text.
   */
  public fun fontDecoration(fontDecoration: String) {
    cdkBuilder.fontDecoration(fontDecoration)
  }

  /**
   * @param fontSize The option that determines the text display size.
   */
  public fun fontSize(fontSize: IResolvable) {
    cdkBuilder.fontSize(fontSize)
  }

  /**
   * @param fontSize The option that determines the text display size.
   */
  public fun fontSize(fontSize: CfnAnalysis.FontSizeProperty) {
    cdkBuilder.fontSize(fontSize)
  }

  /**
   * @param fontStyle Determines the text display face that is inherited by the given font family.
   */
  public fun fontStyle(fontStyle: String) {
    cdkBuilder.fontStyle(fontStyle)
  }

  /**
   * @param fontWeight The option that determines the text display weight, or boldness.
   */
  public fun fontWeight(fontWeight: IResolvable) {
    cdkBuilder.fontWeight(fontWeight)
  }

  /**
   * @param fontWeight The option that determines the text display weight, or boldness.
   */
  public fun fontWeight(fontWeight: CfnAnalysis.FontWeightProperty) {
    cdkBuilder.fontWeight(fontWeight)
  }

  public fun build(): CfnAnalysis.FontConfigurationProperty = cdkBuilder.build()
}
