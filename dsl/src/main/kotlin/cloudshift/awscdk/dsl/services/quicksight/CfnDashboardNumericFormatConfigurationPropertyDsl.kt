@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardNumericFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.NumericFormatConfigurationProperty.Builder =
      CfnDashboard.NumericFormatConfigurationProperty.builder()

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
      fun currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration: CfnDashboard.CurrencyDisplayFormatConfigurationProperty) {
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
      fun numberDisplayFormatConfiguration(numberDisplayFormatConfiguration: CfnDashboard.NumberDisplayFormatConfigurationProperty) {
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
      fun percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration: CfnDashboard.PercentageDisplayFormatConfigurationProperty) {
    cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
  }

  public fun build(): CfnDashboard.NumericFormatConfigurationProperty = cdkBuilder.build()
}
