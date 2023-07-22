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
import software.constructs.Construct

@CdkDslMarker
public class CfnAlarmModelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAlarmModel.Builder = CfnAlarmModel.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Contains the configuration information of alarm state changes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmcapabilities)
   * @param alarmCapabilities Contains the configuration information of alarm state changes. 
   */
  public fun alarmCapabilities(alarmCapabilities: IResolvable) {
    cdkBuilder.alarmCapabilities(alarmCapabilities)
  }

  /**
   * Contains the configuration information of alarm state changes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmcapabilities)
   * @param alarmCapabilities Contains the configuration information of alarm state changes. 
   */
  public fun alarmCapabilities(alarmCapabilities: CfnAlarmModel.AlarmCapabilitiesProperty) {
    cdkBuilder.alarmCapabilities(alarmCapabilities)
  }

  /**
   * Contains information about one or more alarm actions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmeventactions)
   * @param alarmEventActions Contains information about one or more alarm actions. 
   */
  public fun alarmEventActions(alarmEventActions: IResolvable) {
    cdkBuilder.alarmEventActions(alarmEventActions)
  }

  /**
   * Contains information about one or more alarm actions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmeventactions)
   * @param alarmEventActions Contains information about one or more alarm actions. 
   */
  public fun alarmEventActions(alarmEventActions: CfnAlarmModel.AlarmEventActionsProperty) {
    cdkBuilder.alarmEventActions(alarmEventActions)
  }

  /**
   * The description of the alarm model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmmodeldescription)
   * @param alarmModelDescription The description of the alarm model. 
   */
  public fun alarmModelDescription(alarmModelDescription: String) {
    cdkBuilder.alarmModelDescription(alarmModelDescription)
  }

  /**
   * The name of the alarm model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmmodelname)
   * @param alarmModelName The name of the alarm model. 
   */
  public fun alarmModelName(alarmModelName: String) {
    cdkBuilder.alarmModelName(alarmModelName)
  }

  /**
   * Defines when your alarm is invoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmrule)
   * @param alarmRule Defines when your alarm is invoked. 
   */
  public fun alarmRule(alarmRule: IResolvable) {
    cdkBuilder.alarmRule(alarmRule)
  }

  /**
   * Defines when your alarm is invoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmrule)
   * @param alarmRule Defines when your alarm is invoked. 
   */
  public fun alarmRule(alarmRule: CfnAlarmModel.AlarmRuleProperty) {
    cdkBuilder.alarmRule(alarmRule)
  }

  /**
   * An input attribute used as a key to create an alarm.
   *
   * AWS IoT Events routes
   * [inputs](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Input.html) associated with
   * this key to the alarm.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-key)
   * @param key An input attribute used as a key to create an alarm. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * The ARN of the IAM role that allows the alarm to perform actions and access AWS resources.
   *
   * For more information, see [Amazon Resource Names
   * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
   * General Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-rolearn)
   * @param roleArn The ARN of the IAM role that allows the alarm to perform actions and access AWS
   * resources. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * A non-negative integer that reflects the severity level of the alarm.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-severity)
   * @param severity A non-negative integer that reflects the severity level of the alarm. 
   */
  public fun severity(severity: Number) {
    cdkBuilder.severity(severity)
  }

  /**
   * A list of key-value pairs that contain metadata for the alarm model.
   *
   * The tags help you manage the alarm model. For more information, see [Tagging your AWS IoT
   * Events
   * resources](https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html) in
   * the *AWS IoT Events Developer Guide* .
   *
   * You can create up to 50 tags for one alarm model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-tags)
   * @param tags A list of key-value pairs that contain metadata for the alarm model. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of key-value pairs that contain metadata for the alarm model.
   *
   * The tags help you manage the alarm model. For more information, see [Tagging your AWS IoT
   * Events
   * resources](https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html) in
   * the *AWS IoT Events Developer Guide* .
   *
   * You can create up to 50 tags for one alarm model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-tags)
   * @param tags A list of key-value pairs that contain metadata for the alarm model. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAlarmModel {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
