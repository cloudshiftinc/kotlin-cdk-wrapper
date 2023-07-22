@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel
import software.amazon.awscdk.services.iotevents.CfnAlarmModelProps

@CdkDslMarker
public class CfnAlarmModelPropsDsl {
  private val cdkBuilder: CfnAlarmModelProps.Builder = CfnAlarmModelProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param alarmCapabilities Contains the configuration information of alarm state changes.
   */
  public fun alarmCapabilities(alarmCapabilities: IResolvable) {
    cdkBuilder.alarmCapabilities(alarmCapabilities)
  }

  /**
   * @param alarmCapabilities Contains the configuration information of alarm state changes.
   */
  public fun alarmCapabilities(alarmCapabilities: CfnAlarmModel.AlarmCapabilitiesProperty) {
    cdkBuilder.alarmCapabilities(alarmCapabilities)
  }

  /**
   * @param alarmEventActions Contains information about one or more alarm actions.
   */
  public fun alarmEventActions(alarmEventActions: IResolvable) {
    cdkBuilder.alarmEventActions(alarmEventActions)
  }

  /**
   * @param alarmEventActions Contains information about one or more alarm actions.
   */
  public fun alarmEventActions(alarmEventActions: CfnAlarmModel.AlarmEventActionsProperty) {
    cdkBuilder.alarmEventActions(alarmEventActions)
  }

  /**
   * @param alarmModelDescription The description of the alarm model.
   */
  public fun alarmModelDescription(alarmModelDescription: String) {
    cdkBuilder.alarmModelDescription(alarmModelDescription)
  }

  /**
   * @param alarmModelName The name of the alarm model.
   */
  public fun alarmModelName(alarmModelName: String) {
    cdkBuilder.alarmModelName(alarmModelName)
  }

  /**
   * @param alarmRule Defines when your alarm is invoked. 
   */
  public fun alarmRule(alarmRule: IResolvable) {
    cdkBuilder.alarmRule(alarmRule)
  }

  /**
   * @param alarmRule Defines when your alarm is invoked. 
   */
  public fun alarmRule(alarmRule: CfnAlarmModel.AlarmRuleProperty) {
    cdkBuilder.alarmRule(alarmRule)
  }

  /**
   * @param key An input attribute used as a key to create an alarm.
   * AWS IoT Events routes
   * [inputs](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Input.html) associated with
   * this key to the alarm.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param roleArn The ARN of the IAM role that allows the alarm to perform actions and access AWS
   * resources. 
   * For more information, see [Amazon Resource Names
   * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
   * General Reference* .
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param severity A non-negative integer that reflects the severity level of the alarm.
   */
  public fun severity(severity: Number) {
    cdkBuilder.severity(severity)
  }

  /**
   * @param tags A list of key-value pairs that contain metadata for the alarm model.
   * The tags help you manage the alarm model. For more information, see [Tagging your AWS IoT
   * Events
   * resources](https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html) in
   * the *AWS IoT Events Developer Guide* .
   *
   * You can create up to 50 tags for one alarm model.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A list of key-value pairs that contain metadata for the alarm model.
   * The tags help you manage the alarm model. For more information, see [Tagging your AWS IoT
   * Events
   * resources](https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html) in
   * the *AWS IoT Events Developer Guide* .
   *
   * You can create up to 50 tags for one alarm model.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAlarmModelProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
