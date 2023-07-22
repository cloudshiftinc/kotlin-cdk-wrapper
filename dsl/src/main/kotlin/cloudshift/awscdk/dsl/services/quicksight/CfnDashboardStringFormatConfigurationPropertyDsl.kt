@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardStringFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.StringFormatConfigurationProperty.Builder =
      CfnDashboard.StringFormatConfigurationProperty.builder()

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
   * @param numericFormatConfiguration The formatting configuration for numeric strings.
   */
  public fun numericFormatConfiguration(numericFormatConfiguration: IResolvable) {
    cdkBuilder.numericFormatConfiguration(numericFormatConfiguration)
  }

  /**
   * @param numericFormatConfiguration The formatting configuration for numeric strings.
   */
  public
      fun numericFormatConfiguration(numericFormatConfiguration: CfnDashboard.NumericFormatConfigurationProperty) {
    cdkBuilder.numericFormatConfiguration(numericFormatConfiguration)
  }

  public fun build(): CfnDashboard.StringFormatConfigurationProperty = cdkBuilder.build()
}
