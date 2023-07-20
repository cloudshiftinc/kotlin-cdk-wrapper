@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePercentageDisplayFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.PercentageDisplayFormatConfigurationProperty.Builder =
      CfnTemplate.PercentageDisplayFormatConfigurationProperty.builder()

  public fun decimalPlacesConfiguration(decimalPlacesConfiguration: IResolvable) {
    cdkBuilder.decimalPlacesConfiguration(decimalPlacesConfiguration)
  }

  public
      fun decimalPlacesConfiguration(decimalPlacesConfiguration: CfnTemplate.DecimalPlacesConfigurationProperty) {
    cdkBuilder.decimalPlacesConfiguration(decimalPlacesConfiguration)
  }

  public fun negativeValueConfiguration(negativeValueConfiguration: IResolvable) {
    cdkBuilder.negativeValueConfiguration(negativeValueConfiguration)
  }

  public
      fun negativeValueConfiguration(negativeValueConfiguration: CfnTemplate.NegativeValueConfigurationProperty) {
    cdkBuilder.negativeValueConfiguration(negativeValueConfiguration)
  }

  public fun nullValueFormatConfiguration(nullValueFormatConfiguration: IResolvable) {
    cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
  }

  public
      fun nullValueFormatConfiguration(nullValueFormatConfiguration: CfnTemplate.NullValueFormatConfigurationProperty) {
    cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
  }

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun separatorConfiguration(separatorConfiguration: IResolvable) {
    cdkBuilder.separatorConfiguration(separatorConfiguration)
  }

  public
      fun separatorConfiguration(separatorConfiguration: CfnTemplate.NumericSeparatorConfigurationProperty) {
    cdkBuilder.separatorConfiguration(separatorConfiguration)
  }

  public fun suffix(suffix: String) {
    cdkBuilder.suffix(suffix)
  }

  public fun build(): CfnTemplate.PercentageDisplayFormatConfigurationProperty = cdkBuilder.build()
}
