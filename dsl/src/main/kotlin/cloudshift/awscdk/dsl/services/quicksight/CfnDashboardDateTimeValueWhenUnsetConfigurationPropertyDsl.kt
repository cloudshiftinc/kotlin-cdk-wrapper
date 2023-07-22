@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDateTimeValueWhenUnsetConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.DateTimeValueWhenUnsetConfigurationProperty.Builder =
      CfnDashboard.DateTimeValueWhenUnsetConfigurationProperty.builder()

  /**
   * @param customValue A custom value that's used when the value of a parameter isn't set.
   */
  public fun customValue(customValue: String) {
    cdkBuilder.customValue(customValue)
  }

  /**
   * @param valueWhenUnsetOption The built-in options for default values. The value can be one of
   * the following:.
   * * `RECOMMENDED` : The recommended value.
   * * `NULL` : The `NULL` value.
   */
  public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
    cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
  }

  public fun build(): CfnDashboard.DateTimeValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
