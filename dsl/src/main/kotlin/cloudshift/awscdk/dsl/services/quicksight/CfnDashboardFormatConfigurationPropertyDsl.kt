@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.FormatConfigurationProperty.Builder =
      CfnDashboard.FormatConfigurationProperty.builder()

  /**
   * @param dateTimeFormatConfiguration Formatting configuration for `DateTime` fields.
   */
  public fun dateTimeFormatConfiguration(dateTimeFormatConfiguration: IResolvable) {
    cdkBuilder.dateTimeFormatConfiguration(dateTimeFormatConfiguration)
  }

  /**
   * @param dateTimeFormatConfiguration Formatting configuration for `DateTime` fields.
   */
  public
      fun dateTimeFormatConfiguration(dateTimeFormatConfiguration: CfnDashboard.DateTimeFormatConfigurationProperty) {
    cdkBuilder.dateTimeFormatConfiguration(dateTimeFormatConfiguration)
  }

  /**
   * @param numberFormatConfiguration Formatting configuration for number fields.
   */
  public fun numberFormatConfiguration(numberFormatConfiguration: IResolvable) {
    cdkBuilder.numberFormatConfiguration(numberFormatConfiguration)
  }

  /**
   * @param numberFormatConfiguration Formatting configuration for number fields.
   */
  public
      fun numberFormatConfiguration(numberFormatConfiguration: CfnDashboard.NumberFormatConfigurationProperty) {
    cdkBuilder.numberFormatConfiguration(numberFormatConfiguration)
  }

  /**
   * @param stringFormatConfiguration Formatting configuration for string fields.
   */
  public fun stringFormatConfiguration(stringFormatConfiguration: IResolvable) {
    cdkBuilder.stringFormatConfiguration(stringFormatConfiguration)
  }

  /**
   * @param stringFormatConfiguration Formatting configuration for string fields.
   */
  public
      fun stringFormatConfiguration(stringFormatConfiguration: CfnDashboard.StringFormatConfigurationProperty) {
    cdkBuilder.stringFormatConfiguration(stringFormatConfiguration)
  }

  public fun build(): CfnDashboard.FormatConfigurationProperty = cdkBuilder.build()
}
