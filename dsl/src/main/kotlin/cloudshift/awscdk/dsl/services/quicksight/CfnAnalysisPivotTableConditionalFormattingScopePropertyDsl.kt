@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPivotTableConditionalFormattingScopePropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotTableConditionalFormattingScopeProperty.Builder =
      CfnAnalysis.PivotTableConditionalFormattingScopeProperty.builder()

  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  public fun build(): CfnAnalysis.PivotTableConditionalFormattingScopeProperty = cdkBuilder.build()
}
