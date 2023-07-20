@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.FormatConfigurationProperty.Builder =
      CfnDashboard.FormatConfigurationProperty.builder()

  public fun dateTimeFormatConfiguration(dateTimeFormatConfiguration: IResolvable) {
    cdkBuilder.dateTimeFormatConfiguration(dateTimeFormatConfiguration)
  }

  public
      fun dateTimeFormatConfiguration(dateTimeFormatConfiguration: CfnDashboard.DateTimeFormatConfigurationProperty) {
    cdkBuilder.dateTimeFormatConfiguration(dateTimeFormatConfiguration)
  }

  public fun numberFormatConfiguration(numberFormatConfiguration: IResolvable) {
    cdkBuilder.numberFormatConfiguration(numberFormatConfiguration)
  }

  public
      fun numberFormatConfiguration(numberFormatConfiguration: CfnDashboard.NumberFormatConfigurationProperty) {
    cdkBuilder.numberFormatConfiguration(numberFormatConfiguration)
  }

  public fun stringFormatConfiguration(stringFormatConfiguration: IResolvable) {
    cdkBuilder.stringFormatConfiguration(stringFormatConfiguration)
  }

  public
      fun stringFormatConfiguration(stringFormatConfiguration: CfnDashboard.StringFormatConfigurationProperty) {
    cdkBuilder.stringFormatConfiguration(stringFormatConfiguration)
  }

  public fun build(): CfnDashboard.FormatConfigurationProperty = cdkBuilder.build()
}
