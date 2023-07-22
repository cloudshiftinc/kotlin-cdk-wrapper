@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleCloudwatchAlarmActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.CloudwatchAlarmActionProperty.Builder =
      CfnTopicRule.CloudwatchAlarmActionProperty.builder()

  /**
   * @param alarmName The CloudWatch alarm name. 
   */
  public fun alarmName(alarmName: String) {
    cdkBuilder.alarmName(alarmName)
  }

  /**
   * @param roleArn The IAM role that allows access to the CloudWatch alarm. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param stateReason The reason for the alarm change. 
   */
  public fun stateReason(stateReason: String) {
    cdkBuilder.stateReason(stateReason)
  }

  /**
   * @param stateValue The value of the alarm state. 
   * Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
   */
  public fun stateValue(stateValue: String) {
    cdkBuilder.stateValue(stateValue)
  }

  public fun build(): CfnTopicRule.CloudwatchAlarmActionProperty = cdkBuilder.build()
}
