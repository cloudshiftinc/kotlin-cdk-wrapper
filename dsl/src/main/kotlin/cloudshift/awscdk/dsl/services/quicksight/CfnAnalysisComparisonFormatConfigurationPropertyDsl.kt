@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisComparisonFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ComparisonFormatConfigurationProperty.Builder =
      CfnAnalysis.ComparisonFormatConfigurationProperty.builder()

  public fun numberDisplayFormatConfiguration(numberDisplayFormatConfiguration: IResolvable) {
    cdkBuilder.numberDisplayFormatConfiguration(numberDisplayFormatConfiguration)
  }

  public
      fun numberDisplayFormatConfiguration(numberDisplayFormatConfiguration: CfnAnalysis.NumberDisplayFormatConfigurationProperty) {
    cdkBuilder.numberDisplayFormatConfiguration(numberDisplayFormatConfiguration)
  }

  public
      fun percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration: IResolvable) {
    cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
  }

  public
      fun percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration: CfnAnalysis.PercentageDisplayFormatConfigurationProperty) {
    cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
  }

  public fun build(): CfnAnalysis.ComparisonFormatConfigurationProperty = cdkBuilder.build()
}
