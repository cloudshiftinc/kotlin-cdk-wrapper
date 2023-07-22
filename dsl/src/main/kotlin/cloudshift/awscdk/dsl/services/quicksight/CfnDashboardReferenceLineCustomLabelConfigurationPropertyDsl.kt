@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardReferenceLineCustomLabelConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ReferenceLineCustomLabelConfigurationProperty.Builder =
      CfnDashboard.ReferenceLineCustomLabelConfigurationProperty.builder()

  /**
   * @param customLabel The string text of the custom label. 
   */
  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
  }

  public fun build(): CfnDashboard.ReferenceLineCustomLabelConfigurationProperty =
      cdkBuilder.build()
}
