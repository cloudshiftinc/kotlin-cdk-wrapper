@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisStringFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.StringFormatConfigurationProperty.Builder =
      CfnAnalysis.StringFormatConfigurationProperty.builder()

  public fun nullValueFormatConfiguration(nullValueFormatConfiguration: IResolvable) {
    cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
  }

  public
      fun nullValueFormatConfiguration(nullValueFormatConfiguration: CfnAnalysis.NullValueFormatConfigurationProperty) {
    cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
  }

  public fun numericFormatConfiguration(numericFormatConfiguration: IResolvable) {
    cdkBuilder.numericFormatConfiguration(numericFormatConfiguration)
  }

  public
      fun numericFormatConfiguration(numericFormatConfiguration: CfnAnalysis.NumericFormatConfigurationProperty) {
    cdkBuilder.numericFormatConfiguration(numericFormatConfiguration)
  }

  public fun build(): CfnAnalysis.StringFormatConfigurationProperty = cdkBuilder.build()
}
