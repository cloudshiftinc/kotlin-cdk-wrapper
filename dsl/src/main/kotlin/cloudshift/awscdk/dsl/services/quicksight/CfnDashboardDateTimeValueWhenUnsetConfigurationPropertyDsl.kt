@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDateTimeValueWhenUnsetConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.DateTimeValueWhenUnsetConfigurationProperty.Builder =
      CfnDashboard.DateTimeValueWhenUnsetConfigurationProperty.builder()

  public fun customValue(customValue: String) {
    cdkBuilder.customValue(customValue)
  }

  public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
    cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
  }

  public fun build(): CfnDashboard.DateTimeValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
