@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotevents

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAlarmModel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotevents.*;
 * CfnAlarmModelProps cfnAlarmModelProps = CfnAlarmModelProps.builder()
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
public interface CfnAlarmModelProps {
  /**
   * Contains the configuration information of alarm state changes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmcapabilities)
   */
  public fun alarmCapabilities(): Any? = unwrap(this).getAlarmCapabilities()

  /**
   * Contains information about one or more alarm actions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmeventactions)
   */
  public fun alarmEventActions(): Any? = unwrap(this).getAlarmEventActions()

  /**
   * The description of the alarm model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmmodeldescription)
   */
  public fun alarmModelDescription(): String? = unwrap(this).getAlarmModelDescription()

  /**
   * The name of the alarm model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmmodelname)
   */
  public fun alarmModelName(): String? = unwrap(this).getAlarmModelName()

  /**
   * Defines when your alarm is invoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmrule)
   */
  public fun alarmRule(): Any

  /**
   * An input attribute used as a key to create an alarm.
   *
   * AWS IoT Events routes
   * [inputs](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Input.html) associated with
   * this key to the alarm.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-key)
   */
  public fun key(): String? = unwrap(this).getKey()

  /**
   * The ARN of the IAM role that allows the alarm to perform actions and access AWS resources.
   *
   * For more information, see [Amazon Resource Names
   * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
   * General Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-rolearn)
   */
  public fun roleArn(): String

  /**
   * A non-negative integer that reflects the severity level of the alarm.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-severity)
   */
  public fun severity(): Number? = unwrap(this).getSeverity()

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
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAlarmModelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alarmCapabilities Contains the configuration information of alarm state changes.
     */
    public fun alarmCapabilities(alarmCapabilities: IResolvable)

    /**
     * @param alarmCapabilities Contains the configuration information of alarm state changes.
     */
    public fun alarmCapabilities(alarmCapabilities: CfnAlarmModel.AlarmCapabilitiesProperty)

    /**
     * @param alarmCapabilities Contains the configuration information of alarm state changes.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("56aea342eb20da55a80e25fdc85956e67957fd9332e9edcfa0e1e0a17c3b8324")
    public
        fun alarmCapabilities(alarmCapabilities: CfnAlarmModel.AlarmCapabilitiesProperty.Builder.() -> Unit)

    /**
     * @param alarmEventActions Contains information about one or more alarm actions.
     */
    public fun alarmEventActions(alarmEventActions: IResolvable)

    /**
     * @param alarmEventActions Contains information about one or more alarm actions.
     */
    public fun alarmEventActions(alarmEventActions: CfnAlarmModel.AlarmEventActionsProperty)

    /**
     * @param alarmEventActions Contains information about one or more alarm actions.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5d5bd0ff6ad73e9ab6cd080526153b60fe5fd74116a8d59378ba0dc9c6e39f4")
    public
        fun alarmEventActions(alarmEventActions: CfnAlarmModel.AlarmEventActionsProperty.Builder.() -> Unit)

    /**
     * @param alarmModelDescription The description of the alarm model.
     */
    public fun alarmModelDescription(alarmModelDescription: String)

    /**
     * @param alarmModelName The name of the alarm model.
     */
    public fun alarmModelName(alarmModelName: String)

    /**
     * @param alarmRule Defines when your alarm is invoked. 
     */
    public fun alarmRule(alarmRule: IResolvable)

    /**
     * @param alarmRule Defines when your alarm is invoked. 
     */
    public fun alarmRule(alarmRule: CfnAlarmModel.AlarmRuleProperty)

    /**
     * @param alarmRule Defines when your alarm is invoked. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5c90df443b113f28ec118813c4afbf018b9c672338d1fade8aa76dfc24ef5b6")
    public fun alarmRule(alarmRule: CfnAlarmModel.AlarmRuleProperty.Builder.() -> Unit)

    /**
     * @param key An input attribute used as a key to create an alarm.
     * AWS IoT Events routes
     * [inputs](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Input.html) associated
     * with this key to the alarm.
     */
    public fun key(key: String)

    /**
     * @param roleArn The ARN of the IAM role that allows the alarm to perform actions and access
     * AWS resources. 
     * For more information, see [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
     * General Reference* .
     */
    public fun roleArn(roleArn: String)

    /**
     * @param severity A non-negative integer that reflects the severity level of the alarm.
     */
    public fun severity(severity: Number)

    /**
     * @param tags A list of key-value pairs that contain metadata for the alarm model.
     * The tags help you manage the alarm model. For more information, see [Tagging your AWS IoT
     * Events
     * resources](https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html)
     * in the *AWS IoT Events Developer Guide* .
     *
     * You can create up to 50 tags for one alarm model.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs that contain metadata for the alarm model.
     * The tags help you manage the alarm model. For more information, see [Tagging your AWS IoT
     * Events
     * resources](https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html)
     * in the *AWS IoT Events Developer Guide* .
     *
     * You can create up to 50 tags for one alarm model.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotevents.CfnAlarmModelProps.Builder =
        software.amazon.awscdk.services.iotevents.CfnAlarmModelProps.builder()

    /**
     * @param alarmCapabilities Contains the configuration information of alarm state changes.
     */
    override fun alarmCapabilities(alarmCapabilities: IResolvable) {
      cdkBuilder.alarmCapabilities(alarmCapabilities.let(IResolvable::unwrap))
    }

    /**
     * @param alarmCapabilities Contains the configuration information of alarm state changes.
     */
    override fun alarmCapabilities(alarmCapabilities: CfnAlarmModel.AlarmCapabilitiesProperty) {
      cdkBuilder.alarmCapabilities(alarmCapabilities.let(CfnAlarmModel.AlarmCapabilitiesProperty::unwrap))
    }

    /**
     * @param alarmCapabilities Contains the configuration information of alarm state changes.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("56aea342eb20da55a80e25fdc85956e67957fd9332e9edcfa0e1e0a17c3b8324")
    override
        fun alarmCapabilities(alarmCapabilities: CfnAlarmModel.AlarmCapabilitiesProperty.Builder.() -> Unit):
        Unit = alarmCapabilities(CfnAlarmModel.AlarmCapabilitiesProperty(alarmCapabilities))

    /**
     * @param alarmEventActions Contains information about one or more alarm actions.
     */
    override fun alarmEventActions(alarmEventActions: IResolvable) {
      cdkBuilder.alarmEventActions(alarmEventActions.let(IResolvable::unwrap))
    }

    /**
     * @param alarmEventActions Contains information about one or more alarm actions.
     */
    override fun alarmEventActions(alarmEventActions: CfnAlarmModel.AlarmEventActionsProperty) {
      cdkBuilder.alarmEventActions(alarmEventActions.let(CfnAlarmModel.AlarmEventActionsProperty::unwrap))
    }

    /**
     * @param alarmEventActions Contains information about one or more alarm actions.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5d5bd0ff6ad73e9ab6cd080526153b60fe5fd74116a8d59378ba0dc9c6e39f4")
    override
        fun alarmEventActions(alarmEventActions: CfnAlarmModel.AlarmEventActionsProperty.Builder.() -> Unit):
        Unit = alarmEventActions(CfnAlarmModel.AlarmEventActionsProperty(alarmEventActions))

    /**
     * @param alarmModelDescription The description of the alarm model.
     */
    override fun alarmModelDescription(alarmModelDescription: String) {
      cdkBuilder.alarmModelDescription(alarmModelDescription)
    }

    /**
     * @param alarmModelName The name of the alarm model.
     */
    override fun alarmModelName(alarmModelName: String) {
      cdkBuilder.alarmModelName(alarmModelName)
    }

    /**
     * @param alarmRule Defines when your alarm is invoked. 
     */
    override fun alarmRule(alarmRule: IResolvable) {
      cdkBuilder.alarmRule(alarmRule.let(IResolvable::unwrap))
    }

    /**
     * @param alarmRule Defines when your alarm is invoked. 
     */
    override fun alarmRule(alarmRule: CfnAlarmModel.AlarmRuleProperty) {
      cdkBuilder.alarmRule(alarmRule.let(CfnAlarmModel.AlarmRuleProperty::unwrap))
    }

    /**
     * @param alarmRule Defines when your alarm is invoked. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5c90df443b113f28ec118813c4afbf018b9c672338d1fade8aa76dfc24ef5b6")
    override fun alarmRule(alarmRule: CfnAlarmModel.AlarmRuleProperty.Builder.() -> Unit): Unit =
        alarmRule(CfnAlarmModel.AlarmRuleProperty(alarmRule))

    /**
     * @param key An input attribute used as a key to create an alarm.
     * AWS IoT Events routes
     * [inputs](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Input.html) associated
     * with this key to the alarm.
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param roleArn The ARN of the IAM role that allows the alarm to perform actions and access
     * AWS resources. 
     * For more information, see [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
     * General Reference* .
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param severity A non-negative integer that reflects the severity level of the alarm.
     */
    override fun severity(severity: Number) {
      cdkBuilder.severity(severity)
    }

    /**
     * @param tags A list of key-value pairs that contain metadata for the alarm model.
     * The tags help you manage the alarm model. For more information, see [Tagging your AWS IoT
     * Events
     * resources](https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html)
     * in the *AWS IoT Events Developer Guide* .
     *
     * You can create up to 50 tags for one alarm model.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of key-value pairs that contain metadata for the alarm model.
     * The tags help you manage the alarm model. For more information, see [Tagging your AWS IoT
     * Events
     * resources](https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html)
     * in the *AWS IoT Events Developer Guide* .
     *
     * You can create up to 50 tags for one alarm model.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModelProps,
  ) : CdkObject(cdkObject), CfnAlarmModelProps {
    /**
     * Contains the configuration information of alarm state changes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmcapabilities)
     */
    override fun alarmCapabilities(): Any? = unwrap(this).getAlarmCapabilities()

    /**
     * Contains information about one or more alarm actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmeventactions)
     */
    override fun alarmEventActions(): Any? = unwrap(this).getAlarmEventActions()

    /**
     * The description of the alarm model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmmodeldescription)
     */
    override fun alarmModelDescription(): String? = unwrap(this).getAlarmModelDescription()

    /**
     * The name of the alarm model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmmodelname)
     */
    override fun alarmModelName(): String? = unwrap(this).getAlarmModelName()

    /**
     * Defines when your alarm is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmrule)
     */
    override fun alarmRule(): Any = unwrap(this).getAlarmRule()

    /**
     * An input attribute used as a key to create an alarm.
     *
     * AWS IoT Events routes
     * [inputs](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Input.html) associated
     * with this key to the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-key)
     */
    override fun key(): String? = unwrap(this).getKey()

    /**
     * The ARN of the IAM role that allows the alarm to perform actions and access AWS resources.
     *
     * For more information, see [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
     * General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * A non-negative integer that reflects the severity level of the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-severity)
     */
    override fun severity(): Number? = unwrap(this).getSeverity()

    /**
     * A list of key-value pairs that contain metadata for the alarm model.
     *
     * The tags help you manage the alarm model. For more information, see [Tagging your AWS IoT
     * Events
     * resources](https://docs.aws.amazon.com/iotevents/latest/developerguide/tagging-iotevents.html)
     * in the *AWS IoT Events Developer Guide* .
     *
     * You can create up to 50 tags for one alarm model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAlarmModelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModelProps):
        CfnAlarmModelProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAlarmModelProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAlarmModelProps):
        software.amazon.awscdk.services.iotevents.CfnAlarmModelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotevents.CfnAlarmModelProps
  }
}
