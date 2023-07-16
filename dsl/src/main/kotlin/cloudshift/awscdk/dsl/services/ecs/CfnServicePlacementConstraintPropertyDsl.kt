@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnService

@CdkDslMarker
public class CfnServicePlacementConstraintPropertyDsl {
  private val cdkBuilder: CfnService.PlacementConstraintProperty.Builder =
      CfnService.PlacementConstraintProperty.builder()

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnService.PlacementConstraintProperty = cdkBuilder.build()
}
