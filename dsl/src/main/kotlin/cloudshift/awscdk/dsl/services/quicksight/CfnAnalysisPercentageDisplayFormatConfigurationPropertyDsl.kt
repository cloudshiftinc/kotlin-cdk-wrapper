@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPercentageDisplayFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PercentageDisplayFormatConfigurationProperty.Builder =
      CfnAnalysis.PercentageDisplayFormatConfigurationProperty.builder()

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
      fun decimalPlacesConfiguration(decimalPlacesConfiguration: CfnAnalysis.DecimalPlacesConfigurationProperty) {
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
      fun negativeValueConfiguration(negativeValueConfiguration: CfnAnalysis.NegativeValueConfigurationProperty) {
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
      fun nullValueFormatConfiguration(nullValueFormatConfiguration: CfnAnalysis.NullValueFormatConfigurationProperty) {
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
      fun separatorConfiguration(separatorConfiguration: CfnAnalysis.NumericSeparatorConfigurationProperty) {
    cdkBuilder.separatorConfiguration(separatorConfiguration)
  }

  /**
   * @param suffix Determines the suffix value of the percentage format.
   */
  public fun suffix(suffix: String) {
    cdkBuilder.suffix(suffix)
  }

  public fun build(): CfnAnalysis.PercentageDisplayFormatConfigurationProperty = cdkBuilder.build()
}
