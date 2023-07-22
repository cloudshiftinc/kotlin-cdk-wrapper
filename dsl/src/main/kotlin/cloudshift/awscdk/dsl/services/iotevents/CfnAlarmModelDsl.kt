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

/**
 * Represents an alarm model to monitor an AWS IoT Events input attribute.
 *
 * You can use the alarm to get notified when the value is outside a specified range. For more
 * information, see [Create an alarm
 * model](https://docs.aws.amazon.com/iotevents/latest/developerguide/create-alarms.html) in the *AWS
 * IoT Events Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * CfnAlarmModel cfnAlarmModel = CfnAlarmModel.Builder.create(this, "MyCfnAlarmModel")
 * .alarmRule(AlarmRuleProperty.builder()
 * .simpleRule(SimpleRuleProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .inputProperty("inputProperty")
 * .threshold("threshold")
 * .build())
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .alarmCapabilities(AlarmCapabilitiesProperty.builder()
 * .acknowledgeFlow(AcknowledgeFlowProperty.builder()
 * .enabled(false)
 * .build())
 * .initializationConfiguration(InitializationConfigurationProperty.builder()
 * .disabledOnInitialization(false)
 * .build())
 * .build())
 * .alarmEventActions(AlarmEventActionsProperty.builder()
 * .alarmActions(List.of(AlarmActionProperty.builder()
 * .dynamoDb(DynamoDBProperty.builder()
 * .hashKeyField("hashKeyField")
 * .hashKeyValue("hashKeyValue")
 * .tableName("tableName")
 * // the properties below are optional
 * .hashKeyType("hashKeyType")
 * .operation("operation")
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .payloadField("payloadField")
 * .rangeKeyField("rangeKeyField")
 * .rangeKeyType("rangeKeyType")
 * .rangeKeyValue("rangeKeyValue")
 * .build())
 * .dynamoDBv2(DynamoDBv2Property.builder()
 * .tableName("tableName")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .build())
 * .firehose(FirehoseProperty.builder()
 * .deliveryStreamName("deliveryStreamName")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .separator("separator")
 * .build())
 * .iotEvents(IotEventsProperty.builder()
 * .inputName("inputName")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .build())
 * .iotSiteWise(IotSiteWiseProperty.builder()
 * .assetId("assetId")
 * .entryId("entryId")
 * .propertyAlias("propertyAlias")
 * .propertyId("propertyId")
 * .propertyValue(AssetPropertyValueProperty.builder()
 * .value(AssetPropertyVariantProperty.builder()
 * .booleanValue("booleanValue")
 * .doubleValue("doubleValue")
 * .integerValue("integerValue")
 * .stringValue("stringValue")
 * .build())
 * // the properties below are optional
 * .quality("quality")
 * .timestamp(AssetPropertyTimestampProperty.builder()
 * .timeInSeconds("timeInSeconds")
 * // the properties below are optional
 * .offsetInNanos("offsetInNanos")
 * .build())
 * .build())
 * .build())
 * .iotTopicPublish(IotTopicPublishProperty.builder()
 * .mqttTopic("mqttTopic")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .build())
 * .lambda(LambdaProperty.builder()
 * .functionArn("functionArn")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .build())
 * .sns(SnsProperty.builder()
 * .targetArn("targetArn")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .build())
 * .sqs(SqsProperty.builder()
 * .queueUrl("queueUrl")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .useBase64(false)
 * .build())
 * .build()))
 * .build())
 * .alarmModelDescription("alarmModelDescription")
 * .alarmModelName("alarmModelName")
 * .key("key")
 * .severity(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html)
 */
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
