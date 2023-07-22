@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisCustomNarrativeOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.CustomNarrativeOptionsProperty.Builder =
      CfnAnalysis.CustomNarrativeOptionsProperty.builder()

  /**
   * @param narrative The string input of custom narrative. 
   */
  public fun narrative(narrative: String) {
    cdkBuilder.narrative(narrative)
  }

  public fun build(): CfnAnalysis.CustomNarrativeOptionsProperty = cdkBuilder.build()
}
