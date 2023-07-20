@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleCloudwatchAlarmActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.CloudwatchAlarmActionProperty.Builder =
      CfnTopicRule.CloudwatchAlarmActionProperty.builder()

  public fun alarmName(alarmName: String) {
    cdkBuilder.alarmName(alarmName)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun stateReason(stateReason: String) {
    cdkBuilder.stateReason(stateReason)
  }

  public fun stateValue(stateValue: String) {
    cdkBuilder.stateValue(stateValue)
  }

  public fun build(): CfnTopicRule.CloudwatchAlarmActionProperty = cdkBuilder.build()
}
