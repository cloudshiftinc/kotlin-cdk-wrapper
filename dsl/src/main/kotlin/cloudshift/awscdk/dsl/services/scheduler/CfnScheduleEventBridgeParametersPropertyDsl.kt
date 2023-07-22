@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.scheduler.CfnSchedule

@CdkDslMarker
public class CfnScheduleEventBridgeParametersPropertyDsl {
  private val cdkBuilder: CfnSchedule.EventBridgeParametersProperty.Builder =
      CfnSchedule.EventBridgeParametersProperty.builder()

  /**
   * @param detailType A free-form string, with a maximum of 128 characters, used to decide what
   * fields to expect in the event detail. 
   */
  public fun detailType(detailType: String) {
    cdkBuilder.detailType(detailType)
  }

  /**
   * @param source The source of the event. 
   */
  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  public fun build(): CfnSchedule.EventBridgeParametersProperty = cdkBuilder.build()
}
