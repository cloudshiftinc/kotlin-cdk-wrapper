@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisNumberDisplayFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.NumberDisplayFormatConfigurationProperty.Builder =
      CfnAnalysis.NumberDisplayFormatConfigurationProperty.builder()

  public fun decimalPlacesConfiguration(decimalPlacesConfiguration: IResolvable) {
    cdkBuilder.decimalPlacesConfiguration(decimalPlacesConfiguration)
  }

  public
      fun decimalPlacesConfiguration(decimalPlacesConfiguration: CfnAnalysis.DecimalPlacesConfigurationProperty) {
    cdkBuilder.decimalPlacesConfiguration(decimalPlacesConfiguration)
  }

  public fun negativeValueConfiguration(negativeValueConfiguration: IResolvable) {
    cdkBuilder.negativeValueConfiguration(negativeValueConfiguration)
  }

  public
      fun negativeValueConfiguration(negativeValueConfiguration: CfnAnalysis.NegativeValueConfigurationProperty) {
    cdkBuilder.negativeValueConfiguration(negativeValueConfiguration)
  }

  public fun nullValueFormatConfiguration(nullValueFormatConfiguration: IResolvable) {
    cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
  }

  public
      fun nullValueFormatConfiguration(nullValueFormatConfiguration: CfnAnalysis.NullValueFormatConfigurationProperty) {
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
      fun separatorConfiguration(separatorConfiguration: CfnAnalysis.NumericSeparatorConfigurationProperty) {
    cdkBuilder.separatorConfiguration(separatorConfiguration)
  }

  public fun suffix(suffix: String) {
    cdkBuilder.suffix(suffix)
  }

  public fun build(): CfnAnalysis.NumberDisplayFormatConfigurationProperty = cdkBuilder.build()
}
