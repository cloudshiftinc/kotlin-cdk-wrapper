@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPivotTableFieldCollapseStateOptionPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotTableFieldCollapseStateOptionProperty.Builder =
      CfnAnalysis.PivotTableFieldCollapseStateOptionProperty.builder()

  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  public fun target(target: IResolvable) {
    cdkBuilder.target(target)
  }

  public fun target(target: CfnAnalysis.PivotTableFieldCollapseStateTargetProperty) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnAnalysis.PivotTableFieldCollapseStateOptionProperty = cdkBuilder.build()
}
