@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDecimalValueWhenUnsetConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.DecimalValueWhenUnsetConfigurationProperty.Builder =
      CfnDashboard.DecimalValueWhenUnsetConfigurationProperty.builder()

  public fun customValue(customValue: Number) {
    cdkBuilder.customValue(customValue)
  }

  public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
    cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
  }

  public fun build(): CfnDashboard.DecimalValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
