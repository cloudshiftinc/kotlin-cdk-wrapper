@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePivotTableFieldCollapseStateOptionPropertyDsl {
  private val cdkBuilder: CfnTemplate.PivotTableFieldCollapseStateOptionProperty.Builder =
      CfnTemplate.PivotTableFieldCollapseStateOptionProperty.builder()

  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  public fun target(target: IResolvable) {
    cdkBuilder.target(target)
  }

  public fun target(target: CfnTemplate.PivotTableFieldCollapseStateTargetProperty) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnTemplate.PivotTableFieldCollapseStateOptionProperty = cdkBuilder.build()
}
