@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The label configuration of a reference line.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ReferenceLineLabelConfigurationProperty referenceLineLabelConfigurationProperty =
 * ReferenceLineLabelConfigurationProperty.builder()
 * .customLabelConfiguration(ReferenceLineCustomLabelConfigurationProperty.builder()
 * .customLabel("customLabel")
 * .build())
 * .fontColor("fontColor")
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .horizontalPosition("horizontalPosition")
 * .valueLabelConfiguration(ReferenceLineValueLabelConfigurationProperty.builder()
 * .formatConfiguration(NumericFormatConfigurationProperty.builder()
 * .currencyDisplayFormatConfiguration(CurrencyDisplayFormatConfigurationProperty.builder()
 * .decimalPlacesConfiguration(DecimalPlacesConfigurationProperty.builder()
 * .decimalPlaces(123)
 * .build())
 * .negativeValueConfiguration(NegativeValueConfigurationProperty.builder()
 * .displayMode("displayMode")
 * .build())
 * .nullValueFormatConfiguration(NullValueFormatConfigurationProperty.builder()
 * .nullString("nullString")
 * .build())
 * .numberScale("numberScale")
 * .prefix("prefix")
 * .separatorConfiguration(NumericSeparatorConfigurationProperty.builder()
 * .decimalSeparator("decimalSeparator")
 * .thousandsSeparator(ThousandSeparatorOptionsProperty.builder()
 * .symbol("symbol")
 * .visibility("visibility")
 * .build())
 * .build())
 * .suffix("suffix")
 * .symbol("symbol")
 * .build())
 * .numberDisplayFormatConfiguration(NumberDisplayFormatConfigurationProperty.builder()
 * .decimalPlacesConfiguration(DecimalPlacesConfigurationProperty.builder()
 * .decimalPlaces(123)
 * .build())
 * .negativeValueConfiguration(NegativeValueConfigurationProperty.builder()
 * .displayMode("displayMode")
 * .build())
 * .nullValueFormatConfiguration(NullValueFormatConfigurationProperty.builder()
 * .nullString("nullString")
 * .build())
 * .numberScale("numberScale")
 * .prefix("prefix")
 * .separatorConfiguration(NumericSeparatorConfigurationProperty.builder()
 * .decimalSeparator("decimalSeparator")
 * .thousandsSeparator(ThousandSeparatorOptionsProperty.builder()
 * .symbol("symbol")
 * .visibility("visibility")
 * .build())
 * .build())
 * .suffix("suffix")
 * .build())
 * .percentageDisplayFormatConfiguration(PercentageDisplayFormatConfigurationProperty.builder()
 * .decimalPlacesConfiguration(DecimalPlacesConfigurationProperty.builder()
 * .decimalPlaces(123)
 * .build())
 * .negativeValueConfiguration(NegativeValueConfigurationProperty.builder()
 * .displayMode("displayMode")
 * .build())
 * .nullValueFormatConfiguration(NullValueFormatConfigurationProperty.builder()
 * .nullString("nullString")
 * .build())
 * .prefix("prefix")
 * .separatorConfiguration(NumericSeparatorConfigurationProperty.builder()
 * .decimalSeparator("decimalSeparator")
 * .thousandsSeparator(ThousandSeparatorOptionsProperty.builder()
 * .symbol("symbol")
 * .visibility("visibility")
 * .build())
 * .build())
 * .suffix("suffix")
 * .build())
 * .build())
 * .relativePosition("relativePosition")
 * .build())
 * .verticalPosition("verticalPosition")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-referencelinelabelconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisReferenceLineLabelConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ReferenceLineLabelConfigurationProperty.Builder =
      CfnAnalysis.ReferenceLineLabelConfigurationProperty.builder()

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
      fun customLabelConfiguration(customLabelConfiguration: CfnAnalysis.ReferenceLineCustomLabelConfigurationProperty) {
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
  public fun fontConfiguration(fontConfiguration: CfnAnalysis.FontConfigurationProperty) {
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
      fun valueLabelConfiguration(valueLabelConfiguration: CfnAnalysis.ReferenceLineValueLabelConfigurationProperty) {
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

  public fun build(): CfnAnalysis.ReferenceLineLabelConfigurationProperty = cdkBuilder.build()
}
