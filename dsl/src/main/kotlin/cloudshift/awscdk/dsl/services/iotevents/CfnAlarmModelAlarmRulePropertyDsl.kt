@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@CdkDslMarker
public class CfnAlarmModelAlarmRulePropertyDsl {
  private val cdkBuilder: CfnAlarmModel.AlarmRuleProperty.Builder =
      CfnAlarmModel.AlarmRuleProperty.builder()

  /**
   * @param simpleRule A rule that compares an input property value to a threshold value with a
   * comparison operator.
   */
  public fun simpleRule(simpleRule: IResolvable) {
    cdkBuilder.simpleRule(simpleRule)
  }

  /**
   * @param simpleRule A rule that compares an input property value to a threshold value with a
   * comparison operator.
   */
  public fun simpleRule(simpleRule: CfnAlarmModel.SimpleRuleProperty) {
    cdkBuilder.simpleRule(simpleRule)
  }

  public fun build(): CfnAlarmModel.AlarmRuleProperty = cdkBuilder.build()
}
