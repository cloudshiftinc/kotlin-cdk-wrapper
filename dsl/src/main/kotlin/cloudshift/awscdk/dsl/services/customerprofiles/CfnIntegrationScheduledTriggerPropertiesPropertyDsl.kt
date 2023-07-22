@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/**
 * Specifies the configuration details of a scheduled-trigger flow that you define.
 *
 * Currently, these settings only apply to the scheduled-trigger type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * ScheduledTriggerPropertiesProperty scheduledTriggerPropertiesProperty =
 * ScheduledTriggerPropertiesProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * // the properties below are optional
 * .dataPullMode("dataPullMode")
 * .firstExecutionFrom(123)
 * .scheduleEndTime(123)
 * .scheduleOffset(123)
 * .scheduleStartTime(123)
 * .timezone("timezone")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-scheduledtriggerproperties.html)
 */
@CdkDslMarker
public class CfnIntegrationScheduledTriggerPropertiesPropertyDsl {
  private val cdkBuilder: CfnIntegration.ScheduledTriggerPropertiesProperty.Builder =
      CfnIntegration.ScheduledTriggerPropertiesProperty.builder()

  /**
   * @param dataPullMode Specifies whether a scheduled flow has an incremental data transfer or a
   * complete data transfer for each flow run.
   */
  public fun dataPullMode(dataPullMode: String) {
    cdkBuilder.dataPullMode(dataPullMode)
  }

  /**
   * @param firstExecutionFrom Specifies the date range for the records to import from the connector
   * in the first flow run.
   */
  public fun firstExecutionFrom(firstExecutionFrom: Number) {
    cdkBuilder.firstExecutionFrom(firstExecutionFrom)
  }

  /**
   * @param scheduleEndTime Specifies the scheduled end time for a scheduled-trigger flow.
   */
  public fun scheduleEndTime(scheduleEndTime: Number) {
    cdkBuilder.scheduleEndTime(scheduleEndTime)
  }

  /**
   * @param scheduleExpression The scheduling expression that determines the rate at which the
   * schedule will run, for example rate (5 minutes). 
   */
  public fun scheduleExpression(scheduleExpression: String) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  /**
   * @param scheduleOffset Specifies the optional offset that is added to the time interval for a
   * schedule-triggered flow.
   */
  public fun scheduleOffset(scheduleOffset: Number) {
    cdkBuilder.scheduleOffset(scheduleOffset)
  }

  /**
   * @param scheduleStartTime Specifies the scheduled start time for a scheduled-trigger flow.
   */
  public fun scheduleStartTime(scheduleStartTime: Number) {
    cdkBuilder.scheduleStartTime(scheduleStartTime)
  }

  /**
   * @param timezone Specifies the time zone used when referring to the date and time of a
   * scheduled-triggered flow, such as America/New_York.
   */
  public fun timezone(timezone: String) {
    cdkBuilder.timezone(timezone)
  }

  public fun build(): CfnIntegration.ScheduledTriggerPropertiesProperty = cdkBuilder.build()
}
