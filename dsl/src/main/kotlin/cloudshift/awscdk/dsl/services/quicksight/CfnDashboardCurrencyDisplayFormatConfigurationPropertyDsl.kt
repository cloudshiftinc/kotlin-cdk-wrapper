@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardCurrencyDisplayFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.CurrencyDisplayFormatConfigurationProperty.Builder =
      CfnDashboard.CurrencyDisplayFormatConfigurationProperty.builder()

  public fun decimalPlacesConfiguration(decimalPlacesConfiguration: IResolvable) {
    cdkBuilder.decimalPlacesConfiguration(decimalPlacesConfiguration)
  }

  public
      fun decimalPlacesConfiguration(decimalPlacesConfiguration: CfnDashboard.DecimalPlacesConfigurationProperty) {
    cdkBuilder.decimalPlacesConfiguration(decimalPlacesConfiguration)
  }

  public fun negativeValueConfiguration(negativeValueConfiguration: IResolvable) {
    cdkBuilder.negativeValueConfiguration(negativeValueConfiguration)
  }

  public
      fun negativeValueConfiguration(negativeValueConfiguration: CfnDashboard.NegativeValueConfigurationProperty) {
    cdkBuilder.negativeValueConfiguration(negativeValueConfiguration)
  }

  public fun nullValueFormatConfiguration(nullValueFormatConfiguration: IResolvable) {
    cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
  }

  public
      fun nullValueFormatConfiguration(nullValueFormatConfiguration: CfnDashboard.NullValueFormatConfigurationProperty) {
    cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
  }

  public fun numberScale(numberScale: String) {
    cdkBuilder.numberScale(numberScale)
  }

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun separatorConfiguration(separatorConfiguration: IResolvable) {
    cdkBuilder.separatorConfiguration(separatorConfiguration)
  }

  public
      fun separatorConfiguration(separatorConfiguration: CfnDashboard.NumericSeparatorConfigurationProperty) {
    cdkBuilder.separatorConfiguration(separatorConfiguration)
  }

  public fun suffix(suffix: String) {
    cdkBuilder.suffix(suffix)
  }

  public fun symbol(symbol: String) {
    cdkBuilder.symbol(symbol)
  }

  public fun build(): CfnDashboard.CurrencyDisplayFormatConfigurationProperty = cdkBuilder.build()
}
