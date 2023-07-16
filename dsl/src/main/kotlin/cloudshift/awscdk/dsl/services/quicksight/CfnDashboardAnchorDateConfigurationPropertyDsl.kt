@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardAnchorDateConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.AnchorDateConfigurationProperty.Builder =
      CfnDashboard.AnchorDateConfigurationProperty.builder()

  public fun anchorOption(anchorOption: String) {
    cdkBuilder.anchorOption(anchorOption)
  }

  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  public fun build(): CfnDashboard.AnchorDateConfigurationProperty = cdkBuilder.build()
}
