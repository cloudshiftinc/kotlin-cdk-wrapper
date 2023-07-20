@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.scheduler.CfnSchedule

@CdkDslMarker
public class CfnScheduleEventBridgeParametersPropertyDsl {
  private val cdkBuilder: CfnSchedule.EventBridgeParametersProperty.Builder =
      CfnSchedule.EventBridgeParametersProperty.builder()

  public fun detailType(detailType: String) {
    cdkBuilder.detailType(detailType)
  }

  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  public fun build(): CfnSchedule.EventBridgeParametersProperty = cdkBuilder.build()
}
