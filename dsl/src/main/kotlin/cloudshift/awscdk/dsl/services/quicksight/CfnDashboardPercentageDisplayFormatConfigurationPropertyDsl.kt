@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPercentageDisplayFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.PercentageDisplayFormatConfigurationProperty.Builder =
      CfnDashboard.PercentageDisplayFormatConfigurationProperty.builder()

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
      fun decimalPlacesConfiguration(decimalPlacesConfiguration: CfnDashboard.DecimalPlacesConfigurationProperty) {
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
      fun negativeValueConfiguration(negativeValueConfiguration: CfnDashboard.NegativeValueConfigurationProperty) {
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
      fun nullValueFormatConfiguration(nullValueFormatConfiguration: CfnDashboard.NullValueFormatConfigurationProperty) {
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
      fun separatorConfiguration(separatorConfiguration: CfnDashboard.NumericSeparatorConfigurationProperty) {
    cdkBuilder.separatorConfiguration(separatorConfiguration)
  }

  /**
   * @param suffix Determines the suffix value of the percentage format.
   */
  public fun suffix(suffix: String) {
    cdkBuilder.suffix(suffix)
  }

  public fun build(): CfnDashboard.PercentageDisplayFormatConfigurationProperty = cdkBuilder.build()
}
