@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisMinimumLabelTypePropertyDsl {
  private val cdkBuilder: CfnAnalysis.MinimumLabelTypeProperty.Builder =
      CfnAnalysis.MinimumLabelTypeProperty.builder()

  /**
   * @param visibility The visibility of the minimum label.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnAnalysis.MinimumLabelTypeProperty = cdkBuilder.build()
}
