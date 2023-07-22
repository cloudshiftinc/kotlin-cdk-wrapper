@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardComparisonFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ComparisonFormatConfigurationProperty.Builder =
      CfnDashboard.ComparisonFormatConfigurationProperty.builder()

  /**
   * @param numberDisplayFormatConfiguration The number display format.
   */
  public fun numberDisplayFormatConfiguration(numberDisplayFormatConfiguration: IResolvable) {
    cdkBuilder.numberDisplayFormatConfiguration(numberDisplayFormatConfiguration)
  }

  /**
   * @param numberDisplayFormatConfiguration The number display format.
   */
  public
      fun numberDisplayFormatConfiguration(numberDisplayFormatConfiguration: CfnDashboard.NumberDisplayFormatConfigurationProperty) {
    cdkBuilder.numberDisplayFormatConfiguration(numberDisplayFormatConfiguration)
  }

  /**
   * @param percentageDisplayFormatConfiguration The percentage display format.
   */
  public
      fun percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration: IResolvable) {
    cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
  }

  /**
   * @param percentageDisplayFormatConfiguration The percentage display format.
   */
  public
      fun percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration: CfnDashboard.PercentageDisplayFormatConfigurationProperty) {
    cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
  }

  public fun build(): CfnDashboard.ComparisonFormatConfigurationProperty = cdkBuilder.build()
}
