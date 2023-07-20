@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnRule

@CdkDslMarker
public class CfnRulePlacementConstraintPropertyDsl {
  private val cdkBuilder: CfnRule.PlacementConstraintProperty.Builder =
      CfnRule.PlacementConstraintProperty.builder()

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnRule.PlacementConstraintProperty = cdkBuilder.build()
}
