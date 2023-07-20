@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardStringFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.StringFormatConfigurationProperty.Builder =
      CfnDashboard.StringFormatConfigurationProperty.builder()

  public fun nullValueFormatConfiguration(nullValueFormatConfiguration: IResolvable) {
    cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
  }

  public
      fun nullValueFormatConfiguration(nullValueFormatConfiguration: CfnDashboard.NullValueFormatConfigurationProperty) {
    cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
  }

  public fun numericFormatConfiguration(numericFormatConfiguration: IResolvable) {
    cdkBuilder.numericFormatConfiguration(numericFormatConfiguration)
  }

  public
      fun numericFormatConfiguration(numericFormatConfiguration: CfnDashboard.NumericFormatConfigurationProperty) {
    cdkBuilder.numericFormatConfiguration(numericFormatConfiguration)
  }

  public fun build(): CfnDashboard.StringFormatConfigurationProperty = cdkBuilder.build()
}
