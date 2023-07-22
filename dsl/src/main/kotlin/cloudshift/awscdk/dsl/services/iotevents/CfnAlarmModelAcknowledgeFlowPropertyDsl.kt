@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

/**
 * Specifies whether to get notified for alarm state changes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * AcknowledgeFlowProperty acknowledgeFlowProperty = AcknowledgeFlowProperty.builder()
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-acknowledgeflow.html)
 */
@CdkDslMarker
public class CfnAlarmModelAcknowledgeFlowPropertyDsl {
  private val cdkBuilder: CfnAlarmModel.AcknowledgeFlowProperty.Builder =
      CfnAlarmModel.AcknowledgeFlowProperty.builder()

  /**
   * @param enabled The value must be `TRUE` or `FALSE` .
   * If `TRUE` , you receive a notification when the alarm state changes. You must choose to
   * acknowledge the notification before the alarm state can return to `NORMAL` . If `FALSE` , you
   * won't receive notifications. The alarm automatically changes to the `NORMAL` state when the input
   * property value returns to the specified range.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled The value must be `TRUE` or `FALSE` .
   * If `TRUE` , you receive a notification when the alarm state changes. You must choose to
   * acknowledge the notification before the alarm state can return to `NORMAL` . If `FALSE` , you
   * won't receive notifications. The alarm automatically changes to the `NORMAL` state when the input
   * property value returns to the specified range.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnAlarmModel.AcknowledgeFlowProperty = cdkBuilder.build()
}
