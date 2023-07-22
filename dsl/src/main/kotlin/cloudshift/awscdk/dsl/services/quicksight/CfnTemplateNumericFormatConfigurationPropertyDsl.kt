@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateNumericFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.NumericFormatConfigurationProperty.Builder =
      CfnTemplate.NumericFormatConfigurationProperty.builder()

  /**
   * @param currencyDisplayFormatConfiguration The options that determine the currency display
   * format configuration.
   */
  public fun currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration: IResolvable) {
    cdkBuilder.currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration)
  }

  /**
   * @param currencyDisplayFormatConfiguration The options that determine the currency display
   * format configuration.
   */
  public
      fun currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration: CfnTemplate.CurrencyDisplayFormatConfigurationProperty) {
    cdkBuilder.currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration)
  }

  /**
   * @param numberDisplayFormatConfiguration The options that determine the number display format
   * configuration.
   */
  public fun numberDisplayFormatConfiguration(numberDisplayFormatConfiguration: IResolvable) {
    cdkBuilder.numberDisplayFormatConfiguration(numberDisplayFormatConfiguration)
  }

  /**
   * @param numberDisplayFormatConfiguration The options that determine the number display format
   * configuration.
   */
  public
      fun numberDisplayFormatConfiguration(numberDisplayFormatConfiguration: CfnTemplate.NumberDisplayFormatConfigurationProperty) {
    cdkBuilder.numberDisplayFormatConfiguration(numberDisplayFormatConfiguration)
  }

  /**
   * @param percentageDisplayFormatConfiguration The options that determine the percentage display
   * format configuration.
   */
  public
      fun percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration: IResolvable) {
    cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
  }

  /**
   * @param percentageDisplayFormatConfiguration The options that determine the percentage display
   * format configuration.
   */
  public
      fun percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration: CfnTemplate.PercentageDisplayFormatConfigurationProperty) {
    cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
  }

  public fun build(): CfnTemplate.NumericFormatConfigurationProperty = cdkBuilder.build()
}
