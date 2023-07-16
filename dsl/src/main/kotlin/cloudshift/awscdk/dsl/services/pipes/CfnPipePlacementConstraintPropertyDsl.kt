@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipePlacementConstraintPropertyDsl {
  private val cdkBuilder: CfnPipe.PlacementConstraintProperty.Builder =
      CfnPipe.PlacementConstraintProperty.builder()

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnPipe.PlacementConstraintProperty = cdkBuilder.build()
}
