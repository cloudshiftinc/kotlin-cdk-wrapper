@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisNumericFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.NumericFormatConfigurationProperty.Builder =
      CfnAnalysis.NumericFormatConfigurationProperty.builder()

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
      fun currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration: CfnAnalysis.CurrencyDisplayFormatConfigurationProperty) {
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
      fun numberDisplayFormatConfiguration(numberDisplayFormatConfiguration: CfnAnalysis.NumberDisplayFormatConfigurationProperty) {
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
      fun percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration: CfnAnalysis.PercentageDisplayFormatConfigurationProperty) {
    cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
  }

  public fun build(): CfnAnalysis.NumericFormatConfigurationProperty = cdkBuilder.build()
}
