@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisLoadingAnimationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.LoadingAnimationProperty.Builder =
      CfnAnalysis.LoadingAnimationProperty.builder()

  /**
   * @param visibility The visibility configuration of `LoadingAnimation` .
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnAnalysis.LoadingAnimationProperty = cdkBuilder.build()
}
