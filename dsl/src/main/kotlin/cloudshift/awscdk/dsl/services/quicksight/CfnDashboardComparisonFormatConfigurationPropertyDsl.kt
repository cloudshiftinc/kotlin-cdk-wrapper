@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardComparisonFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ComparisonFormatConfigurationProperty.Builder =
      CfnDashboard.ComparisonFormatConfigurationProperty.builder()

  public fun numberDisplayFormatConfiguration(numberDisplayFormatConfiguration: IResolvable) {
    cdkBuilder.numberDisplayFormatConfiguration(numberDisplayFormatConfiguration)
  }

  public
      fun numberDisplayFormatConfiguration(numberDisplayFormatConfiguration: CfnDashboard.NumberDisplayFormatConfigurationProperty) {
    cdkBuilder.numberDisplayFormatConfiguration(numberDisplayFormatConfiguration)
  }

  public
      fun percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration: IResolvable) {
    cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
  }

  public
      fun percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration: CfnDashboard.PercentageDisplayFormatConfigurationProperty) {
    cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
  }

  public fun build(): CfnDashboard.ComparisonFormatConfigurationProperty = cdkBuilder.build()
}
