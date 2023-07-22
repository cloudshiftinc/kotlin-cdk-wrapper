@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * Formatting configuration for string fields.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * StringFormatConfigurationProperty stringFormatConfigurationProperty =
 * StringFormatConfigurationProperty.builder()
 * .nullValueFormatConfiguration(NullValueFormatConfigurationProperty.builder()
 * .nullString("nullString")
 * .build())
 * .numericFormatConfiguration(NumericFormatConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-stringformatconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateStringFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.StringFormatConfigurationProperty.Builder =
      CfnTemplate.StringFormatConfigurationProperty.builder()

  /**
   * @param nullValueFormatConfiguration The options that determine the null value format
   * configuration.
   */
  public fun nullValueFormatConfiguration(nullValueFormatConfiguration: IResolvable) {
    cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
  }

  /**
   * @param nullValueFormatConfiguration The options that determine the null value format
   * configuration.
   */
  public
      fun nullValueFormatConfiguration(nullValueFormatConfiguration: CfnTemplate.NullValueFormatConfigurationProperty) {
    cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
  }

  /**
   * @param numericFormatConfiguration The formatting configuration for numeric strings.
   */
  public fun numericFormatConfiguration(numericFormatConfiguration: IResolvable) {
    cdkBuilder.numericFormatConfiguration(numericFormatConfiguration)
  }

  /**
   * @param numericFormatConfiguration The formatting configuration for numeric strings.
   */
  public
      fun numericFormatConfiguration(numericFormatConfiguration: CfnTemplate.NumericFormatConfigurationProperty) {
    cdkBuilder.numericFormatConfiguration(numericFormatConfiguration)
  }

  public fun build(): CfnTemplate.StringFormatConfigurationProperty = cdkBuilder.build()
}
