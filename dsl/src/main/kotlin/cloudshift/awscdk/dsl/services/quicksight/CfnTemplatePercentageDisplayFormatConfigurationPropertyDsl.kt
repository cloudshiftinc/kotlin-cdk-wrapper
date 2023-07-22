@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The options that determine the percentage display format configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PercentageDisplayFormatConfigurationProperty percentageDisplayFormatConfigurationProperty =
 * PercentageDisplayFormatConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-percentagedisplayformatconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplatePercentageDisplayFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.PercentageDisplayFormatConfigurationProperty.Builder =
      CfnTemplate.PercentageDisplayFormatConfigurationProperty.builder()

  /**
   * @param decimalPlacesConfiguration The option that determines the decimal places configuration.
   */
  public fun decimalPlacesConfiguration(decimalPlacesConfiguration: IResolvable) {
    cdkBuilder.decimalPlacesConfiguration(decimalPlacesConfiguration)
  }

  /**
   * @param decimalPlacesConfiguration The option that determines the decimal places configuration.
   */
  public
      fun decimalPlacesConfiguration(decimalPlacesConfiguration: CfnTemplate.DecimalPlacesConfigurationProperty) {
    cdkBuilder.decimalPlacesConfiguration(decimalPlacesConfiguration)
  }

  /**
   * @param negativeValueConfiguration The options that determine the negative value configuration.
   */
  public fun negativeValueConfiguration(negativeValueConfiguration: IResolvable) {
    cdkBuilder.negativeValueConfiguration(negativeValueConfiguration)
  }

  /**
   * @param negativeValueConfiguration The options that determine the negative value configuration.
   */
  public
      fun negativeValueConfiguration(negativeValueConfiguration: CfnTemplate.NegativeValueConfigurationProperty) {
    cdkBuilder.negativeValueConfiguration(negativeValueConfiguration)
  }

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
   * @param prefix Determines the prefix value of the percentage format.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param separatorConfiguration The options that determine the numeric separator configuration.
   */
  public fun separatorConfiguration(separatorConfiguration: IResolvable) {
    cdkBuilder.separatorConfiguration(separatorConfiguration)
  }

  /**
   * @param separatorConfiguration The options that determine the numeric separator configuration.
   */
  public
      fun separatorConfiguration(separatorConfiguration: CfnTemplate.NumericSeparatorConfigurationProperty) {
    cdkBuilder.separatorConfiguration(separatorConfiguration)
  }

  /**
   * @param suffix Determines the suffix value of the percentage format.
   */
  public fun suffix(suffix: String) {
    cdkBuilder.suffix(suffix)
  }

  public fun build(): CfnTemplate.PercentageDisplayFormatConfigurationProperty = cdkBuilder.build()
}
