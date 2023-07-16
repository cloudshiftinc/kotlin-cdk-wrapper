@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisSectionAfterPageBreakPropertyDsl {
  private val cdkBuilder: CfnAnalysis.SectionAfterPageBreakProperty.Builder =
      CfnAnalysis.SectionAfterPageBreakProperty.builder()

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnAnalysis.SectionAfterPageBreakProperty = cdkBuilder.build()
}
