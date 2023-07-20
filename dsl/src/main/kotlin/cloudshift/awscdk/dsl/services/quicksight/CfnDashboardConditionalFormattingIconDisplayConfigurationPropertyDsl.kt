@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardConditionalFormattingIconDisplayConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ConditionalFormattingIconDisplayConfigurationProperty.Builder
      = CfnDashboard.ConditionalFormattingIconDisplayConfigurationProperty.builder()

  public fun iconDisplayOption(iconDisplayOption: String) {
    cdkBuilder.iconDisplayOption(iconDisplayOption)
  }

  public fun build(): CfnDashboard.ConditionalFormattingIconDisplayConfigurationProperty =
      cdkBuilder.build()
}
