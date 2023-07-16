@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDateAxisOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DateAxisOptionsProperty.Builder =
      CfnAnalysis.DateAxisOptionsProperty.builder()

  public fun missingDateVisibility(missingDateVisibility: String) {
    cdkBuilder.missingDateVisibility(missingDateVisibility)
  }

  public fun build(): CfnAnalysis.DateAxisOptionsProperty = cdkBuilder.build()
}
