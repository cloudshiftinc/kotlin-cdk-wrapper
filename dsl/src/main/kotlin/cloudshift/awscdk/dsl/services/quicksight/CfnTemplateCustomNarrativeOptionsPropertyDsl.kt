@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateCustomNarrativeOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.CustomNarrativeOptionsProperty.Builder =
      CfnTemplate.CustomNarrativeOptionsProperty.builder()

  /**
   * @param narrative The string input of custom narrative. 
   */
  public fun narrative(narrative: String) {
    cdkBuilder.narrative(narrative)
  }

  public fun build(): CfnTemplate.CustomNarrativeOptionsProperty = cdkBuilder.build()
}
