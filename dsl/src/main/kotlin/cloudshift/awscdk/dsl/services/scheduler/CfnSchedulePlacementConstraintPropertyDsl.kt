@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.scheduler.CfnSchedule

@CdkDslMarker
public class CfnSchedulePlacementConstraintPropertyDsl {
  private val cdkBuilder: CfnSchedule.PlacementConstraintProperty.Builder =
      CfnSchedule.PlacementConstraintProperty.builder()

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnSchedule.PlacementConstraintProperty = cdkBuilder.build()
}
