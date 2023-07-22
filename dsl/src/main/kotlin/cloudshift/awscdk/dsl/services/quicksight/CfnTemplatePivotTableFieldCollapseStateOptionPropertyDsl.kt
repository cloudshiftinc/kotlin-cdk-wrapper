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

  /**
   * @param state The state of the field target of a pivot table. Choose one of the following
   * options:.
   * * `COLLAPSED`
   * * `EXPANDED`
   */
  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  /**
   * @param target A tagged-union object that sets the collapse state. 
   */
  public fun target(target: IResolvable) {
    cdkBuilder.target(target)
  }

  /**
   * @param target A tagged-union object that sets the collapse state. 
   */
  public fun target(target: CfnTemplate.PivotTableFieldCollapseStateTargetProperty) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnTemplate.PivotTableFieldCollapseStateOptionProperty = cdkBuilder.build()
}
