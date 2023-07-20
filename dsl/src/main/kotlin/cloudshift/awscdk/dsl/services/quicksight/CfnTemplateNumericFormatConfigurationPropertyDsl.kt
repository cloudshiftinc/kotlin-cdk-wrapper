@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateNumericFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.NumericFormatConfigurationProperty.Builder =
      CfnTemplate.NumericFormatConfigurationProperty.builder()

  public fun currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration: IResolvable) {
    cdkBuilder.currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration)
  }

  public
      fun currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration: CfnTemplate.CurrencyDisplayFormatConfigurationProperty) {
    cdkBuilder.currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration)
  }

  public fun numberDisplayFormatConfiguration(numberDisplayFormatConfiguration: IResolvable) {
    cdkBuilder.numberDisplayFormatConfiguration(numberDisplayFormatConfiguration)
  }

  public
      fun numberDisplayFormatConfiguration(numberDisplayFormatConfiguration: CfnTemplate.NumberDisplayFormatConfigurationProperty) {
    cdkBuilder.numberDisplayFormatConfiguration(numberDisplayFormatConfiguration)
  }

  public
      fun percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration: IResolvable) {
    cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
  }

  public
      fun percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration: CfnTemplate.PercentageDisplayFormatConfigurationProperty) {
    cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
  }

  public fun build(): CfnTemplate.NumericFormatConfigurationProperty = cdkBuilder.build()
}
