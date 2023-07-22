@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardCustomNarrativeOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.CustomNarrativeOptionsProperty.Builder =
      CfnDashboard.CustomNarrativeOptionsProperty.builder()

  /**
   * @param narrative The string input of custom narrative. 
   */
  public fun narrative(narrative: String) {
    cdkBuilder.narrative(narrative)
  }

  public fun build(): CfnDashboard.CustomNarrativeOptionsProperty = cdkBuilder.build()
}
