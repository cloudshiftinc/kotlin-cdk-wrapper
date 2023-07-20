@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardNegativeValueConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.NegativeValueConfigurationProperty.Builder =
      CfnDashboard.NegativeValueConfigurationProperty.builder()

  public fun displayMode(displayMode: String) {
    cdkBuilder.displayMode(displayMode)
  }

  public fun build(): CfnDashboard.NegativeValueConfigurationProperty = cdkBuilder.build()
}
