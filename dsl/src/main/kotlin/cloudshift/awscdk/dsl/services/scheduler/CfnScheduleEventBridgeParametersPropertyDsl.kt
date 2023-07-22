@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.scheduler.CfnSchedule

/**
 * The templated target type for the EventBridge
 * [`PutEvents`](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html) API
 * operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.scheduler.*;
 * EventBridgeParametersProperty eventBridgeParametersProperty =
 * EventBridgeParametersProperty.builder()
 * .detailType("detailType")
 * .source("source")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-eventbridgeparameters.html)
 */
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
