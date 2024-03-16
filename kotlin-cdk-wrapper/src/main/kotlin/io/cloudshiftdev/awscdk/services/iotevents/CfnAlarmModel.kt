@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotevents

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.iotevents.*;
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
public open class CfnAlarmModel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Contains the configuration information of alarm state changes.
   */
  public open fun alarmCapabilities(): Any? = unwrap(this).getAlarmCapabilities()

  /**
   * Contains the configuration information of alarm state changes.
   */
  public open fun alarmCapabilities(`value`: IResolvable) {
    unwrap(this).setAlarmCapabilities(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains the configuration information of alarm state changes.
   */
  public open fun alarmCapabilities(`value`: AlarmCapabilitiesProperty) {
    unwrap(this).setAlarmCapabilities(`value`.let(AlarmCapabilitiesProperty::unwrap))
  }

  /**
   * Contains the configuration information of alarm state changes.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ef26fbaa45250126c0f25b78b2ef45b27e661406663c43bc3d7cfaeedc987dc7")
  public open fun alarmCapabilities(`value`: AlarmCapabilitiesProperty.Builder.() -> Unit): Unit =
      alarmCapabilities(AlarmCapabilitiesProperty(`value`))

  /**
   * Contains information about one or more alarm actions.
   */
  public open fun alarmEventActions(): Any? = unwrap(this).getAlarmEventActions()

  /**
   * Contains information about one or more alarm actions.
   */
  public open fun alarmEventActions(`value`: IResolvable) {
    unwrap(this).setAlarmEventActions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains information about one or more alarm actions.
   */
  public open fun alarmEventActions(`value`: AlarmEventActionsProperty) {
    unwrap(this).setAlarmEventActions(`value`.let(AlarmEventActionsProperty::unwrap))
  }

  /**
   * Contains information about one or more alarm actions.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a246d81ab335d15dfc8997503cbc26762b2cf66f66c5aa35ceb90eec3ca07a12")
  public open fun alarmEventActions(`value`: AlarmEventActionsProperty.Builder.() -> Unit): Unit =
      alarmEventActions(AlarmEventActionsProperty(`value`))

  /**
   * The description of the alarm model.
   */
  public open fun alarmModelDescription(): String? = unwrap(this).getAlarmModelDescription()

  /**
   * The description of the alarm model.
   */
  public open fun alarmModelDescription(`value`: String) {
    unwrap(this).setAlarmModelDescription(`value`)
  }

  /**
   * The name of the alarm model.
   */
  public open fun alarmModelName(): String? = unwrap(this).getAlarmModelName()

  /**
   * The name of the alarm model.
   */
  public open fun alarmModelName(`value`: String) {
    unwrap(this).setAlarmModelName(`value`)
  }

  /**
   * Defines when your alarm is invoked.
   */
  public open fun alarmRule(): Any = unwrap(this).getAlarmRule()

  /**
   * Defines when your alarm is invoked.
   */
  public open fun alarmRule(`value`: IResolvable) {
    unwrap(this).setAlarmRule(`value`.let(IResolvable::unwrap))
  }

  /**
   * Defines when your alarm is invoked.
   */
  public open fun alarmRule(`value`: AlarmRuleProperty) {
    unwrap(this).setAlarmRule(`value`.let(AlarmRuleProperty::unwrap))
  }

  /**
   * Defines when your alarm is invoked.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3c1a346111d052385a72f46a079b1d174e777312c7816eff9cbf6de0157bb10c")
  public open fun alarmRule(`value`: AlarmRuleProperty.Builder.() -> Unit): Unit =
      alarmRule(AlarmRuleProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * An input attribute used as a key to create an alarm.
   */
  public open fun key(): String? = unwrap(this).getKey()

  /**
   * An input attribute used as a key to create an alarm.
   */
  public open fun key(`value`: String) {
    unwrap(this).setKey(`value`)
  }

  /**
   * The ARN of the IAM role that allows the alarm to perform actions and access AWS resources.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The ARN of the IAM role that allows the alarm to perform actions and access AWS resources.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A non-negative integer that reflects the severity level of the alarm.
   */
  public open fun severity(): Number? = unwrap(this).getSeverity()

  /**
   * A non-negative integer that reflects the severity level of the alarm.
   */
  public open fun severity(`value`: Number) {
    unwrap(this).setSeverity(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of key-value pairs that contain metadata for the alarm model.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of key-value pairs that contain metadata for the alarm model.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of key-value pairs that contain metadata for the alarm model.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotevents.CfnAlarmModel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Contains the configuration information of alarm state changes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmcapabilities)
     * @param alarmCapabilities Contains the configuration information of alarm state changes. 
     */
    public fun alarmCapabilities(alarmCapabilities: IResolvable)

    /**
     * Contains the configuration information of alarm state changes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmcapabilities)
     * @param alarmCapabilities Contains the configuration information of alarm state changes. 
     */
    public fun alarmCapabilities(alarmCapabilities: AlarmCapabilitiesProperty)

    /**
     * Contains the configuration information of alarm state changes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmcapabilities)
     * @param alarmCapabilities Contains the configuration information of alarm state changes. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28dade2c5a535f2b0837588b6fcb591e268f5ef44dfc6e23313751c738c75d71")
    public fun alarmCapabilities(alarmCapabilities: AlarmCapabilitiesProperty.Builder.() -> Unit)

    /**
     * Contains information about one or more alarm actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmeventactions)
     * @param alarmEventActions Contains information about one or more alarm actions. 
     */
    public fun alarmEventActions(alarmEventActions: IResolvable)

    /**
     * Contains information about one or more alarm actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmeventactions)
     * @param alarmEventActions Contains information about one or more alarm actions. 
     */
    public fun alarmEventActions(alarmEventActions: AlarmEventActionsProperty)

    /**
     * Contains information about one or more alarm actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmeventactions)
     * @param alarmEventActions Contains information about one or more alarm actions. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f17992d3d7cb1606f8e1af18815b53e1fff29da3e14a0eae4875754ca4b305b")
    public fun alarmEventActions(alarmEventActions: AlarmEventActionsProperty.Builder.() -> Unit)

    /**
     * The description of the alarm model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmmodeldescription)
     * @param alarmModelDescription The description of the alarm model. 
     */
    public fun alarmModelDescription(alarmModelDescription: String)

    /**
     * The name of the alarm model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmmodelname)
     * @param alarmModelName The name of the alarm model. 
     */
    public fun alarmModelName(alarmModelName: String)

    /**
     * Defines when your alarm is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmrule)
     * @param alarmRule Defines when your alarm is invoked. 
     */
    public fun alarmRule(alarmRule: IResolvable)

    /**
     * Defines when your alarm is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmrule)
     * @param alarmRule Defines when your alarm is invoked. 
     */
    public fun alarmRule(alarmRule: AlarmRuleProperty)

    /**
     * Defines when your alarm is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmrule)
     * @param alarmRule Defines when your alarm is invoked. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a85073d3ac9e10ee8e6551c1e38e91853eed1bf9fe7f23c79712d0296a202c71")
    public fun alarmRule(alarmRule: AlarmRuleProperty.Builder.() -> Unit)

    /**
     * An input attribute used as a key to create an alarm.
     *
     * AWS IoT Events routes
     * [inputs](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Input.html) associated
     * with this key to the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-key)
     * @param key An input attribute used as a key to create an alarm. 
     */
    public fun key(key: String)

    /**
     * The ARN of the IAM role that allows the alarm to perform actions and access AWS resources.
     *
     * For more information, see [Amazon Resource Names
     * (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the *AWS
     * General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-rolearn)
     * @param roleArn The ARN of the IAM role that allows the alarm to perform actions and access
     * AWS resources. 
     */
    public fun roleArn(roleArn: String)

    /**
     * A non-negative integer that reflects the severity level of the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-severity)
     * @param severity A non-negative integer that reflects the severity level of the alarm. 
     */
    public fun severity(severity: Number)

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
     * @param tags A list of key-value pairs that contain metadata for the alarm model. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags A list of key-value pairs that contain metadata for the alarm model. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotevents.CfnAlarmModel.Builder =
        software.amazon.awscdk.services.iotevents.CfnAlarmModel.Builder.create(scope, id)

    /**
     * Contains the configuration information of alarm state changes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmcapabilities)
     * @param alarmCapabilities Contains the configuration information of alarm state changes. 
     */
    override fun alarmCapabilities(alarmCapabilities: IResolvable) {
      cdkBuilder.alarmCapabilities(alarmCapabilities.let(IResolvable::unwrap))
    }

    /**
     * Contains the configuration information of alarm state changes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmcapabilities)
     * @param alarmCapabilities Contains the configuration information of alarm state changes. 
     */
    override fun alarmCapabilities(alarmCapabilities: AlarmCapabilitiesProperty) {
      cdkBuilder.alarmCapabilities(alarmCapabilities.let(AlarmCapabilitiesProperty::unwrap))
    }

    /**
     * Contains the configuration information of alarm state changes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmcapabilities)
     * @param alarmCapabilities Contains the configuration information of alarm state changes. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28dade2c5a535f2b0837588b6fcb591e268f5ef44dfc6e23313751c738c75d71")
    override fun alarmCapabilities(alarmCapabilities: AlarmCapabilitiesProperty.Builder.() -> Unit):
        Unit = alarmCapabilities(AlarmCapabilitiesProperty(alarmCapabilities))

    /**
     * Contains information about one or more alarm actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmeventactions)
     * @param alarmEventActions Contains information about one or more alarm actions. 
     */
    override fun alarmEventActions(alarmEventActions: IResolvable) {
      cdkBuilder.alarmEventActions(alarmEventActions.let(IResolvable::unwrap))
    }

    /**
     * Contains information about one or more alarm actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmeventactions)
     * @param alarmEventActions Contains information about one or more alarm actions. 
     */
    override fun alarmEventActions(alarmEventActions: AlarmEventActionsProperty) {
      cdkBuilder.alarmEventActions(alarmEventActions.let(AlarmEventActionsProperty::unwrap))
    }

    /**
     * Contains information about one or more alarm actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmeventactions)
     * @param alarmEventActions Contains information about one or more alarm actions. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f17992d3d7cb1606f8e1af18815b53e1fff29da3e14a0eae4875754ca4b305b")
    override fun alarmEventActions(alarmEventActions: AlarmEventActionsProperty.Builder.() -> Unit):
        Unit = alarmEventActions(AlarmEventActionsProperty(alarmEventActions))

    /**
     * The description of the alarm model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmmodeldescription)
     * @param alarmModelDescription The description of the alarm model. 
     */
    override fun alarmModelDescription(alarmModelDescription: String) {
      cdkBuilder.alarmModelDescription(alarmModelDescription)
    }

    /**
     * The name of the alarm model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmmodelname)
     * @param alarmModelName The name of the alarm model. 
     */
    override fun alarmModelName(alarmModelName: String) {
      cdkBuilder.alarmModelName(alarmModelName)
    }

    /**
     * Defines when your alarm is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmrule)
     * @param alarmRule Defines when your alarm is invoked. 
     */
    override fun alarmRule(alarmRule: IResolvable) {
      cdkBuilder.alarmRule(alarmRule.let(IResolvable::unwrap))
    }

    /**
     * Defines when your alarm is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmrule)
     * @param alarmRule Defines when your alarm is invoked. 
     */
    override fun alarmRule(alarmRule: AlarmRuleProperty) {
      cdkBuilder.alarmRule(alarmRule.let(AlarmRuleProperty::unwrap))
    }

    /**
     * Defines when your alarm is invoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-alarmrule)
     * @param alarmRule Defines when your alarm is invoked. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a85073d3ac9e10ee8e6551c1e38e91853eed1bf9fe7f23c79712d0296a202c71")
    override fun alarmRule(alarmRule: AlarmRuleProperty.Builder.() -> Unit): Unit =
        alarmRule(AlarmRuleProperty(alarmRule))

    /**
     * An input attribute used as a key to create an alarm.
     *
     * AWS IoT Events routes
     * [inputs](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Input.html) associated
     * with this key to the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-key)
     * @param key An input attribute used as a key to create an alarm. 
     */
    override fun key(key: String) {
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
     * @param roleArn The ARN of the IAM role that allows the alarm to perform actions and access
     * AWS resources. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * A non-negative integer that reflects the severity level of the alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html#cfn-iotevents-alarmmodel-severity)
     * @param severity A non-negative integer that reflects the severity level of the alarm. 
     */
    override fun severity(severity: Number) {
      cdkBuilder.severity(severity)
    }

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
     * @param tags A list of key-value pairs that contain metadata for the alarm model. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
     * @param tags A list of key-value pairs that contain metadata for the alarm model. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotevents.CfnAlarmModel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAlarmModel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAlarmModel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel):
        CfnAlarmModel = CfnAlarmModel(cdkObject)

    internal fun unwrap(wrapped: CfnAlarmModel):
        software.amazon.awscdk.services.iotevents.CfnAlarmModel = wrapped.cdkObject
  }

  /**
   * Information required to publish the MQTT message through the AWS IoT message broker.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * IotTopicPublishProperty iotTopicPublishProperty = IotTopicPublishProperty.builder()
   * .mqttTopic("mqttTopic")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iottopicpublish.html)
   */
  public interface IotTopicPublishProperty {
    /**
     * The MQTT topic of the message.
     *
     * You can use a string expression that includes variables ( `$variable.&lt;variable-name&gt;` )
     * and input values ( `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ) as the topic string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iottopicpublish.html#cfn-iotevents-alarmmodel-iottopicpublish-mqtttopic)
     */
    public fun mqttTopic(): String

    /**
     * You can configure the action payload when you publish a message to an AWS IoT Core topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iottopicpublish.html#cfn-iotevents-alarmmodel-iottopicpublish-payload)
     */
    public fun payload(): Any? = unwrap(this).getPayload()

    /**
     * A builder for [IotTopicPublishProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mqttTopic The MQTT topic of the message. 
       * You can use a string expression that includes variables ( `$variable.&lt;variable-name&gt;`
       * ) and input values ( `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ) as the topic string.
       */
      public fun mqttTopic(mqttTopic: String)

      /**
       * @param payload You can configure the action payload when you publish a message to an AWS
       * IoT Core topic.
       */
      public fun payload(payload: IResolvable)

      /**
       * @param payload You can configure the action payload when you publish a message to an AWS
       * IoT Core topic.
       */
      public fun payload(payload: PayloadProperty)

      /**
       * @param payload You can configure the action payload when you publish a message to an AWS
       * IoT Core topic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("09a8a1ff7169e3c1479b8bc646cacc37c60f2b4669f76f34a144bc80ce570150")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotTopicPublishProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotTopicPublishProperty.builder()

      /**
       * @param mqttTopic The MQTT topic of the message. 
       * You can use a string expression that includes variables ( `$variable.&lt;variable-name&gt;`
       * ) and input values ( `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ) as the topic string.
       */
      override fun mqttTopic(mqttTopic: String) {
        cdkBuilder.mqttTopic(mqttTopic)
      }

      /**
       * @param payload You can configure the action payload when you publish a message to an AWS
       * IoT Core topic.
       */
      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you publish a message to an AWS
       * IoT Core topic.
       */
      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you publish a message to an AWS
       * IoT Core topic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("09a8a1ff7169e3c1479b8bc646cacc37c60f2b4669f76f34a144bc80ce570150")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotTopicPublishProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotTopicPublishProperty,
    ) : CdkObject(cdkObject), IotTopicPublishProperty {
      /**
       * The MQTT topic of the message.
       *
       * You can use a string expression that includes variables ( `$variable.&lt;variable-name&gt;`
       * ) and input values ( `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ) as the topic string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iottopicpublish.html#cfn-iotevents-alarmmodel-iottopicpublish-mqtttopic)
       */
      override fun mqttTopic(): String = unwrap(this).getMqttTopic()

      /**
       * You can configure the action payload when you publish a message to an AWS IoT Core topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iottopicpublish.html#cfn-iotevents-alarmmodel-iottopicpublish-payload)
       */
      override fun payload(): Any? = unwrap(this).getPayload()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IotTopicPublishProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotTopicPublishProperty):
          IotTopicPublishProperty = CdkObjectWrappers.wrap(cdkObject) as IotTopicPublishProperty

      internal fun unwrap(wrapped: IotTopicPublishProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotTopicPublishProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotTopicPublishProperty
    }
  }

  /**
   * A structure that contains an asset property value.
   *
   * For more information, see
   * [Variant](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_Variant.html) in the
   * *AWS IoT SiteWise API Reference* .
   *
   * You must use expressions for all parameters in `AssetPropertyVariant` . The expressions accept
   * literals, operators, functions, references, and substitution templates.
   *
   * **Examples** - For literal values, the expressions must contain single quotes. For example, the
   * value for the `integerValue` parameter can be `'100'` .
   *
   * * For references, you must specify either variables or parameters. For example, the value for
   * the `booleanValue` parameter can be `$variable.offline` .
   * * For a substitution template, you must use `${}` , and the template must be in single quotes.
   * A substitution template can also contain a combination of literals, operators, functions,
   * references, and substitution templates.
   *
   * In the following example, the value for the `doubleValue` parameter uses a substitution
   * template.
   *
   * `'${$input.TemperatureInput.sensorData.temperature * 6 / 5 + 32}'`
   *
   * For more information, see
   * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
   * in the *AWS IoT Events Developer Guide* .
   *
   * You must specify one of the following value types, depending on the `dataType` of the specified
   * asset property. For more information, see
   * [AssetProperty](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_AssetProperty.html)
   * in the *AWS IoT SiteWise API Reference* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * AssetPropertyVariantProperty assetPropertyVariantProperty =
   * AssetPropertyVariantProperty.builder()
   * .booleanValue("booleanValue")
   * .doubleValue("doubleValue")
   * .integerValue("integerValue")
   * .stringValue("stringValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvariant.html)
   */
  public interface AssetPropertyVariantProperty {
    /**
     * The asset property value is a Boolean value that must be `'TRUE'` or `'FALSE'` .
     *
     * You must use an expression, and the evaluated result should be a Boolean value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvariant.html#cfn-iotevents-alarmmodel-assetpropertyvariant-booleanvalue)
     */
    public fun booleanValue(): String? = unwrap(this).getBooleanValue()

    /**
     * The asset property value is a double.
     *
     * You must use an expression, and the evaluated result should be a double.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvariant.html#cfn-iotevents-alarmmodel-assetpropertyvariant-doublevalue)
     */
    public fun doubleValue(): String? = unwrap(this).getDoubleValue()

    /**
     * The asset property value is an integer.
     *
     * You must use an expression, and the evaluated result should be an integer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvariant.html#cfn-iotevents-alarmmodel-assetpropertyvariant-integervalue)
     */
    public fun integerValue(): String? = unwrap(this).getIntegerValue()

    /**
     * The asset property value is a string.
     *
     * You must use an expression, and the evaluated result should be a string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvariant.html#cfn-iotevents-alarmmodel-assetpropertyvariant-stringvalue)
     */
    public fun stringValue(): String? = unwrap(this).getStringValue()

    /**
     * A builder for [AssetPropertyVariantProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param booleanValue The asset property value is a Boolean value that must be `'TRUE'` or
       * `'FALSE'` .
       * You must use an expression, and the evaluated result should be a Boolean value.
       */
      public fun booleanValue(booleanValue: String)

      /**
       * @param doubleValue The asset property value is a double.
       * You must use an expression, and the evaluated result should be a double.
       */
      public fun doubleValue(doubleValue: String)

      /**
       * @param integerValue The asset property value is an integer.
       * You must use an expression, and the evaluated result should be an integer.
       */
      public fun integerValue(integerValue: String)

      /**
       * @param stringValue The asset property value is a string.
       * You must use an expression, and the evaluated result should be a string.
       */
      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyVariantProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyVariantProperty.builder()

      /**
       * @param booleanValue The asset property value is a Boolean value that must be `'TRUE'` or
       * `'FALSE'` .
       * You must use an expression, and the evaluated result should be a Boolean value.
       */
      override fun booleanValue(booleanValue: String) {
        cdkBuilder.booleanValue(booleanValue)
      }

      /**
       * @param doubleValue The asset property value is a double.
       * You must use an expression, and the evaluated result should be a double.
       */
      override fun doubleValue(doubleValue: String) {
        cdkBuilder.doubleValue(doubleValue)
      }

      /**
       * @param integerValue The asset property value is an integer.
       * You must use an expression, and the evaluated result should be an integer.
       */
      override fun integerValue(integerValue: String) {
        cdkBuilder.integerValue(integerValue)
      }

      /**
       * @param stringValue The asset property value is a string.
       * You must use an expression, and the evaluated result should be a string.
       */
      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyVariantProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyVariantProperty,
    ) : CdkObject(cdkObject), AssetPropertyVariantProperty {
      /**
       * The asset property value is a Boolean value that must be `'TRUE'` or `'FALSE'` .
       *
       * You must use an expression, and the evaluated result should be a Boolean value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvariant.html#cfn-iotevents-alarmmodel-assetpropertyvariant-booleanvalue)
       */
      override fun booleanValue(): String? = unwrap(this).getBooleanValue()

      /**
       * The asset property value is a double.
       *
       * You must use an expression, and the evaluated result should be a double.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvariant.html#cfn-iotevents-alarmmodel-assetpropertyvariant-doublevalue)
       */
      override fun doubleValue(): String? = unwrap(this).getDoubleValue()

      /**
       * The asset property value is an integer.
       *
       * You must use an expression, and the evaluated result should be an integer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvariant.html#cfn-iotevents-alarmmodel-assetpropertyvariant-integervalue)
       */
      override fun integerValue(): String? = unwrap(this).getIntegerValue()

      /**
       * The asset property value is a string.
       *
       * You must use an expression, and the evaluated result should be a string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvariant.html#cfn-iotevents-alarmmodel-assetpropertyvariant-stringvalue)
       */
      override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyVariantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyVariantProperty):
          AssetPropertyVariantProperty = CdkObjectWrappers.wrap(cdkObject) as
          AssetPropertyVariantProperty

      internal fun unwrap(wrapped: AssetPropertyVariantProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyVariantProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyVariantProperty
    }
  }

  /**
   * A rule that compares an input property value to a threshold value with a comparison operator.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * SimpleRuleProperty simpleRuleProperty = SimpleRuleProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .inputProperty("inputProperty")
   * .threshold("threshold")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-simplerule.html)
   */
  public interface SimpleRuleProperty {
    /**
     * The comparison operator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-simplerule.html#cfn-iotevents-alarmmodel-simplerule-comparisonoperator)
     */
    public fun comparisonOperator(): String

    /**
     * The value on the left side of the comparison operator.
     *
     * You can specify an AWS IoT Events input attribute as an input property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-simplerule.html#cfn-iotevents-alarmmodel-simplerule-inputproperty)
     */
    public fun inputProperty(): String

    /**
     * The value on the right side of the comparison operator.
     *
     * You can enter a number or specify an AWS IoT Events input attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-simplerule.html#cfn-iotevents-alarmmodel-simplerule-threshold)
     */
    public fun threshold(): String

    /**
     * A builder for [SimpleRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparisonOperator The comparison operator. 
       */
      public fun comparisonOperator(comparisonOperator: String)

      /**
       * @param inputProperty The value on the left side of the comparison operator. 
       * You can specify an AWS IoT Events input attribute as an input property.
       */
      public fun inputProperty(inputProperty: String)

      /**
       * @param threshold The value on the right side of the comparison operator. 
       * You can enter a number or specify an AWS IoT Events input attribute.
       */
      public fun threshold(threshold: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SimpleRuleProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SimpleRuleProperty.builder()

      /**
       * @param comparisonOperator The comparison operator. 
       */
      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      /**
       * @param inputProperty The value on the left side of the comparison operator. 
       * You can specify an AWS IoT Events input attribute as an input property.
       */
      override fun inputProperty(inputProperty: String) {
        cdkBuilder.inputProperty(inputProperty)
      }

      /**
       * @param threshold The value on the right side of the comparison operator. 
       * You can enter a number or specify an AWS IoT Events input attribute.
       */
      override fun threshold(threshold: String) {
        cdkBuilder.threshold(threshold)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.SimpleRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SimpleRuleProperty,
    ) : CdkObject(cdkObject), SimpleRuleProperty {
      /**
       * The comparison operator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-simplerule.html#cfn-iotevents-alarmmodel-simplerule-comparisonoperator)
       */
      override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

      /**
       * The value on the left side of the comparison operator.
       *
       * You can specify an AWS IoT Events input attribute as an input property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-simplerule.html#cfn-iotevents-alarmmodel-simplerule-inputproperty)
       */
      override fun inputProperty(): String = unwrap(this).getInputProperty()

      /**
       * The value on the right side of the comparison operator.
       *
       * You can enter a number or specify an AWS IoT Events input attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-simplerule.html#cfn-iotevents-alarmmodel-simplerule-threshold)
       */
      override fun threshold(): String = unwrap(this).getThreshold()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SimpleRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.SimpleRuleProperty):
          SimpleRuleProperty = CdkObjectWrappers.wrap(cdkObject) as SimpleRuleProperty

      internal fun unwrap(wrapped: SimpleRuleProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SimpleRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SimpleRuleProperty
    }
  }

  /**
   * Defines when your alarm is invoked.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * AlarmRuleProperty alarmRuleProperty = AlarmRuleProperty.builder()
   * .simpleRule(SimpleRuleProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .inputProperty("inputProperty")
   * .threshold("threshold")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmrule.html)
   */
  public interface AlarmRuleProperty {
    /**
     * A rule that compares an input property value to a threshold value with a comparison operator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmrule.html#cfn-iotevents-alarmmodel-alarmrule-simplerule)
     */
    public fun simpleRule(): Any? = unwrap(this).getSimpleRule()

    /**
     * A builder for [AlarmRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param simpleRule A rule that compares an input property value to a threshold value with a
       * comparison operator.
       */
      public fun simpleRule(simpleRule: IResolvable)

      /**
       * @param simpleRule A rule that compares an input property value to a threshold value with a
       * comparison operator.
       */
      public fun simpleRule(simpleRule: SimpleRuleProperty)

      /**
       * @param simpleRule A rule that compares an input property value to a threshold value with a
       * comparison operator.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de36c93fe2de0a3000fae2c93cec62a0f5c9cb2fae0ba5c11ce2486fcbfa1b37")
      public fun simpleRule(simpleRule: SimpleRuleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmRuleProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmRuleProperty.builder()

      /**
       * @param simpleRule A rule that compares an input property value to a threshold value with a
       * comparison operator.
       */
      override fun simpleRule(simpleRule: IResolvable) {
        cdkBuilder.simpleRule(simpleRule.let(IResolvable::unwrap))
      }

      /**
       * @param simpleRule A rule that compares an input property value to a threshold value with a
       * comparison operator.
       */
      override fun simpleRule(simpleRule: SimpleRuleProperty) {
        cdkBuilder.simpleRule(simpleRule.let(SimpleRuleProperty::unwrap))
      }

      /**
       * @param simpleRule A rule that compares an input property value to a threshold value with a
       * comparison operator.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de36c93fe2de0a3000fae2c93cec62a0f5c9cb2fae0ba5c11ce2486fcbfa1b37")
      override fun simpleRule(simpleRule: SimpleRuleProperty.Builder.() -> Unit): Unit =
          simpleRule(SimpleRuleProperty(simpleRule))

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmRuleProperty,
    ) : CdkObject(cdkObject), AlarmRuleProperty {
      /**
       * A rule that compares an input property value to a threshold value with a comparison
       * operator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmrule.html#cfn-iotevents-alarmmodel-alarmrule-simplerule)
       */
      override fun simpleRule(): Any? = unwrap(this).getSimpleRule()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmRuleProperty):
          AlarmRuleProperty = CdkObjectWrappers.wrap(cdkObject) as AlarmRuleProperty

      internal fun unwrap(wrapped: AlarmRuleProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmRuleProperty
    }
  }

  /**
   * Information needed to configure the payload.
   *
   * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
   * payload contains all attribute-value pairs that have the information about the detector model
   * instance and the event triggered the action. To configure the action payload, you can use
   * `contentExpression` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * PayloadProperty payloadProperty = PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-payload.html)
   */
  public interface PayloadProperty {
    /**
     * The content of the payload.
     *
     * You can use a string expression that includes quoted strings ( `'&lt;string&gt;'` ),
     * variables ( `$variable.&lt;variable-name&gt;` ), input values (
     * `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ), string concatenations, and quoted strings
     * that contain `${}` as the content. The recommended maximum size of a content expression is 1 KB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-payload.html#cfn-iotevents-alarmmodel-payload-contentexpression)
     */
    public fun contentExpression(): String

    /**
     * The value of the payload type can be either `STRING` or `JSON` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-payload.html#cfn-iotevents-alarmmodel-payload-type)
     */
    public fun type(): String

    /**
     * A builder for [PayloadProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contentExpression The content of the payload. 
       * You can use a string expression that includes quoted strings ( `'&lt;string&gt;'` ),
       * variables ( `$variable.&lt;variable-name&gt;` ), input values (
       * `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ), string concatenations, and quoted strings
       * that contain `${}` as the content. The recommended maximum size of a content expression is 1
       * KB.
       */
      public fun contentExpression(contentExpression: String)

      /**
       * @param type The value of the payload type can be either `STRING` or `JSON` . 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.PayloadProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.PayloadProperty.builder()

      /**
       * @param contentExpression The content of the payload. 
       * You can use a string expression that includes quoted strings ( `'&lt;string&gt;'` ),
       * variables ( `$variable.&lt;variable-name&gt;` ), input values (
       * `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ), string concatenations, and quoted strings
       * that contain `${}` as the content. The recommended maximum size of a content expression is 1
       * KB.
       */
      override fun contentExpression(contentExpression: String) {
        cdkBuilder.contentExpression(contentExpression)
      }

      /**
       * @param type The value of the payload type can be either `STRING` or `JSON` . 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.PayloadProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.PayloadProperty,
    ) : CdkObject(cdkObject), PayloadProperty {
      /**
       * The content of the payload.
       *
       * You can use a string expression that includes quoted strings ( `'&lt;string&gt;'` ),
       * variables ( `$variable.&lt;variable-name&gt;` ), input values (
       * `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ), string concatenations, and quoted strings
       * that contain `${}` as the content. The recommended maximum size of a content expression is 1
       * KB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-payload.html#cfn-iotevents-alarmmodel-payload-contentexpression)
       */
      override fun contentExpression(): String = unwrap(this).getContentExpression()

      /**
       * The value of the payload type can be either `STRING` or `JSON` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-payload.html#cfn-iotevents-alarmmodel-payload-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.PayloadProperty):
          PayloadProperty = CdkObjectWrappers.wrap(cdkObject) as PayloadProperty

      internal fun unwrap(wrapped: PayloadProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.PayloadProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.PayloadProperty
    }
  }

  /**
   * Sends an AWS IoT Events input, passing in information about the detector model instance and the
   * event that triggered the action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * IotEventsProperty iotEventsProperty = IotEventsProperty.builder()
   * .inputName("inputName")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotevents.html)
   */
  public interface IotEventsProperty {
    /**
     * The name of the AWS IoT Events input where the data is sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotevents.html#cfn-iotevents-alarmmodel-iotevents-inputname)
     */
    public fun inputName(): String

    /**
     * You can configure the action payload when you send a message to an AWS IoT Events input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotevents.html#cfn-iotevents-alarmmodel-iotevents-payload)
     */
    public fun payload(): Any? = unwrap(this).getPayload()

    /**
     * A builder for [IotEventsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputName The name of the AWS IoT Events input where the data is sent. 
       */
      public fun inputName(inputName: String)

      /**
       * @param payload You can configure the action payload when you send a message to an AWS IoT
       * Events input.
       */
      public fun payload(payload: IResolvable)

      /**
       * @param payload You can configure the action payload when you send a message to an AWS IoT
       * Events input.
       */
      public fun payload(payload: PayloadProperty)

      /**
       * @param payload You can configure the action payload when you send a message to an AWS IoT
       * Events input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a906aff9bfed17a9996ebc2534cfc0b5419c3478d888ba8ae7d86b4fa20e339e")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotEventsProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotEventsProperty.builder()

      /**
       * @param inputName The name of the AWS IoT Events input where the data is sent. 
       */
      override fun inputName(inputName: String) {
        cdkBuilder.inputName(inputName)
      }

      /**
       * @param payload You can configure the action payload when you send a message to an AWS IoT
       * Events input.
       */
      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message to an AWS IoT
       * Events input.
       */
      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message to an AWS IoT
       * Events input.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a906aff9bfed17a9996ebc2534cfc0b5419c3478d888ba8ae7d86b4fa20e339e")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotEventsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotEventsProperty,
    ) : CdkObject(cdkObject), IotEventsProperty {
      /**
       * The name of the AWS IoT Events input where the data is sent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotevents.html#cfn-iotevents-alarmmodel-iotevents-inputname)
       */
      override fun inputName(): String = unwrap(this).getInputName()

      /**
       * You can configure the action payload when you send a message to an AWS IoT Events input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotevents.html#cfn-iotevents-alarmmodel-iotevents-payload)
       */
      override fun payload(): Any? = unwrap(this).getPayload()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IotEventsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotEventsProperty):
          IotEventsProperty = CdkObjectWrappers.wrap(cdkObject) as IotEventsProperty

      internal fun unwrap(wrapped: IotEventsProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotEventsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotEventsProperty
    }
  }

  /**
   * Defines an action to write to the Amazon DynamoDB table that you created.
   *
   * The default action payload contains all the information about the detector model instance and
   * the event that triggered the action. You can customize the
   * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A separate
   * column of the DynamoDB table receives one attribute-value pair in the payload that you specify.
   *
   * You must use expressions for all parameters in `DynamoDBv2Action` . The expressions accept
   * literals, operators, functions, references, and substitution templates.
   *
   * **Examples** - For literal values, the expressions must contain single quotes. For example, the
   * value for the `tableName` parameter can be `'GreenhouseTemperatureTable'` .
   *
   * * For references, you must specify either variables or input values. For example, the value for
   * the `tableName` parameter can be `$variable.ddbtableName` .
   * * For a substitution template, you must use `${}` , and the template must be in single quotes.
   * A substitution template can also contain a combination of literals, operators, functions,
   * references, and substitution templates.
   *
   * In the following example, the value for the `contentExpression` parameter in `Payload` uses a
   * substitution template.
   *
   * `'{\"sensorID\": \"${$input.GreenhouseInput.sensor_id}\", \"temperature\":
   * \"${$input.GreenhouseInput.temperature * 9 / 5 + 32}\"}'`
   *
   * * For a string concatenation, you must use `+` . A string concatenation can also contain a
   * combination of literals, operators, functions, references, and substitution templates.
   *
   * In the following example, the value for the `tableName` parameter uses a string concatenation.
   *
   * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
   *
   * For more information, see
   * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
   * in the *AWS IoT Events Developer Guide* .
   *
   * The value for the `type` parameter in `Payload` must be `JSON` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * DynamoDBv2Property dynamoDBv2Property = DynamoDBv2Property.builder()
   * .tableName("tableName")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodbv2.html)
   */
  public interface DynamoDBv2Property {
    /**
     * Information needed to configure the payload.
     *
     * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
     * payload contains all attribute-value pairs that have the information about the detector model
     * instance and the event triggered the action. To configure the action payload, you can use
     * `contentExpression` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodbv2.html#cfn-iotevents-alarmmodel-dynamodbv2-payload)
     */
    public fun payload(): Any? = unwrap(this).getPayload()

    /**
     * The name of the DynamoDB table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodbv2.html#cfn-iotevents-alarmmodel-dynamodbv2-tablename)
     */
    public fun tableName(): String

    /**
     * A builder for [DynamoDBv2Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      public fun payload(payload: IResolvable)

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      public fun payload(payload: PayloadProperty)

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("189d1432ed7e21cc4c695b6568e65a4972db7a288296442c88e3c0403a7a8a0d")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)

      /**
       * @param tableName The name of the DynamoDB table. 
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBv2Property.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBv2Property.builder()

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("189d1432ed7e21cc4c695b6568e65a4972db7a288296442c88e3c0403a7a8a0d")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      /**
       * @param tableName The name of the DynamoDB table. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBv2Property
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBv2Property,
    ) : CdkObject(cdkObject), DynamoDBv2Property {
      /**
       * Information needed to configure the payload.
       *
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodbv2.html#cfn-iotevents-alarmmodel-dynamodbv2-payload)
       */
      override fun payload(): Any? = unwrap(this).getPayload()

      /**
       * The name of the DynamoDB table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodbv2.html#cfn-iotevents-alarmmodel-dynamodbv2-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBv2Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBv2Property):
          DynamoDBv2Property = CdkObjectWrappers.wrap(cdkObject) as DynamoDBv2Property

      internal fun unwrap(wrapped: DynamoDBv2Property):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBv2Property = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBv2Property
    }
  }

  /**
   * Sends information about the detector model instance and the event that triggered the action to
   * an Amazon SQS queue.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * SqsProperty sqsProperty = SqsProperty.builder()
   * .queueUrl("queueUrl")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .useBase64(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-sqs.html)
   */
  public interface SqsProperty {
    /**
     * You can configure the action payload when you send a message to an Amazon SQS queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-sqs.html#cfn-iotevents-alarmmodel-sqs-payload)
     */
    public fun payload(): Any? = unwrap(this).getPayload()

    /**
     * The URL of the SQS queue where the data is written.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-sqs.html#cfn-iotevents-alarmmodel-sqs-queueurl)
     */
    public fun queueUrl(): String

    /**
     * Set this to TRUE if you want the data to be base-64 encoded before it is written to the
     * queue.
     *
     * Otherwise, set this to FALSE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-sqs.html#cfn-iotevents-alarmmodel-sqs-usebase64)
     */
    public fun useBase64(): Any? = unwrap(this).getUseBase64()

    /**
     * A builder for [SqsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * SQS queue.
       */
      public fun payload(payload: IResolvable)

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * SQS queue.
       */
      public fun payload(payload: PayloadProperty)

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * SQS queue.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb380390b28918407d9c43bca759f2f834e6b8173ee883656d7c1864bdf6bbd1")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)

      /**
       * @param queueUrl The URL of the SQS queue where the data is written. 
       */
      public fun queueUrl(queueUrl: String)

      /**
       * @param useBase64 Set this to TRUE if you want the data to be base-64 encoded before it is
       * written to the queue.
       * Otherwise, set this to FALSE.
       */
      public fun useBase64(useBase64: Boolean)

      /**
       * @param useBase64 Set this to TRUE if you want the data to be base-64 encoded before it is
       * written to the queue.
       * Otherwise, set this to FALSE.
       */
      public fun useBase64(useBase64: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SqsProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SqsProperty.builder()

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * SQS queue.
       */
      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * SQS queue.
       */
      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * SQS queue.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb380390b28918407d9c43bca759f2f834e6b8173ee883656d7c1864bdf6bbd1")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      /**
       * @param queueUrl The URL of the SQS queue where the data is written. 
       */
      override fun queueUrl(queueUrl: String) {
        cdkBuilder.queueUrl(queueUrl)
      }

      /**
       * @param useBase64 Set this to TRUE if you want the data to be base-64 encoded before it is
       * written to the queue.
       * Otherwise, set this to FALSE.
       */
      override fun useBase64(useBase64: Boolean) {
        cdkBuilder.useBase64(useBase64)
      }

      /**
       * @param useBase64 Set this to TRUE if you want the data to be base-64 encoded before it is
       * written to the queue.
       * Otherwise, set this to FALSE.
       */
      override fun useBase64(useBase64: IResolvable) {
        cdkBuilder.useBase64(useBase64.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.SqsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.SqsProperty,
    ) : CdkObject(cdkObject), SqsProperty {
      /**
       * You can configure the action payload when you send a message to an Amazon SQS queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-sqs.html#cfn-iotevents-alarmmodel-sqs-payload)
       */
      override fun payload(): Any? = unwrap(this).getPayload()

      /**
       * The URL of the SQS queue where the data is written.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-sqs.html#cfn-iotevents-alarmmodel-sqs-queueurl)
       */
      override fun queueUrl(): String = unwrap(this).getQueueUrl()

      /**
       * Set this to TRUE if you want the data to be base-64 encoded before it is written to the
       * queue.
       *
       * Otherwise, set this to FALSE.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-sqs.html#cfn-iotevents-alarmmodel-sqs-usebase64)
       */
      override fun useBase64(): Any? = unwrap(this).getUseBase64()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SqsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.SqsProperty):
          SqsProperty = CdkObjectWrappers.wrap(cdkObject) as SqsProperty

      internal fun unwrap(wrapped: SqsProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SqsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SqsProperty
    }
  }

  /**
   * Specifies one of the following actions to receive notifications when the alarm state changes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * AlarmActionProperty alarmActionProperty = AlarmActionProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html)
   */
  public interface AlarmActionProperty {
    /**
     * Defines an action to write to the Amazon DynamoDB table that you created.
     *
     * The default action payload contains all the information about the detector model instance and
     * the event that triggered the action. You can customize the
     * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
     * separate column of the DynamoDB table receives one attribute-value pair in the payload that you
     * specify.
     *
     * You must use expressions for all parameters in `DynamoDBv2Action` . The expressions accept
     * literals, operators, functions, references, and substitution templates.
     *
     * **Examples** - For literal values, the expressions must contain single quotes. For example,
     * the value for the `tableName` parameter can be `'GreenhouseTemperatureTable'` .
     *
     * * For references, you must specify either variables or input values. For example, the value
     * for the `tableName` parameter can be `$variable.ddbtableName` .
     * * For a substitution template, you must use `${}` , and the template must be in single
     * quotes. A substitution template can also contain a combination of literals, operators,
     * functions, references, and substitution templates.
     *
     * In the following example, the value for the `contentExpression` parameter in `Payload` uses a
     * substitution template.
     *
     * `'{\"sensorID\": \"${$input.GreenhouseInput.sensor_id}\", \"temperature\":
     * \"${$input.GreenhouseInput.temperature * 9 / 5 + 32}\"}'`
     *
     * * For a string concatenation, you must use `+` . A string concatenation can also contain a
     * combination of literals, operators, functions, references, and substitution templates.
     *
     * In the following example, the value for the `tableName` parameter uses a string
     * concatenation.
     *
     * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
     *
     * For more information, see
     * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
     * in the *AWS IoT Events Developer Guide* .
     *
     * The value for the `type` parameter in `Payload` must be `JSON` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-dynamodbv2)
     */
    public fun dynamoDBv2(): Any? = unwrap(this).getDynamoDBv2()

    /**
     * Defines an action to write to the Amazon DynamoDB table that you created.
     *
     * The standard action payload contains all the information about the detector model instance
     * and the event that triggered the action. You can customize the
     * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . One
     * column of the DynamoDB table receives all attribute-value pairs in the payload that you specify.
     *
     * You must use expressions for all parameters in `DynamoDBAction` . The expressions accept
     * literals, operators, functions, references, and substitution templates.
     *
     * **Examples** - For literal values, the expressions must contain single quotes. For example,
     * the value for the `hashKeyType` parameter can be `'STRING'` .
     *
     * * For references, you must specify either variables or input values. For example, the value
     * for the `hashKeyField` parameter can be `$input.GreenhouseInput.name` .
     * * For a substitution template, you must use `${}` , and the template must be in single
     * quotes. A substitution template can also contain a combination of literals, operators,
     * functions, references, and substitution templates.
     *
     * In the following example, the value for the `hashKeyValue` parameter uses a substitution
     * template.
     *
     * `'${$input.GreenhouseInput.temperature * 6 / 5 + 32} in Fahrenheit'`
     *
     * * For a string concatenation, you must use `+` . A string concatenation can also contain a
     * combination of literals, operators, functions, references, and substitution templates.
     *
     * In the following example, the value for the `tableName` parameter uses a string
     * concatenation.
     *
     * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
     *
     * For more information, see
     * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
     * in the *AWS IoT Events Developer Guide* .
     *
     * If the defined payload type is a string, `DynamoDBAction` writes non-JSON data to the
     * DynamoDB table as binary data. The DynamoDB console displays the data as Base64-encoded text.
     * The value for the `payloadField` parameter is `&lt;payload-field&gt;_raw` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-dynamodb)
     */
    public fun dynamoDb(): Any? = unwrap(this).getDynamoDb()

    /**
     * Sends information about the detector model instance and the event that triggered the action
     * to an Amazon Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-firehose)
     */
    public fun firehose(): Any? = unwrap(this).getFirehose()

    /**
     * Sends an AWS IoT Events input, passing in information about the detector model instance and
     * the event that triggered the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-iotevents)
     */
    public fun iotEvents(): Any? = unwrap(this).getIotEvents()

    /**
     * Sends information about the detector model instance and the event that triggered the action
     * to a specified asset property in AWS IoT SiteWise .
     *
     * You must use expressions for all parameters in `IotSiteWiseAction` . The expressions accept
     * literals, operators, functions, references, and substitutions templates.
     *
     * **Examples** - For literal values, the expressions must contain single quotes. For example,
     * the value for the `propertyAlias` parameter can be `'/company/windfarm/3/turbine/7/temperature'`
     * .
     *
     * * For references, you must specify either variables or input values. For example, the value
     * for the `assetId` parameter can be `$input.TurbineInput.assetId1` .
     * * For a substitution template, you must use `${}` , and the template must be in single
     * quotes. A substitution template can also contain a combination of literals, operators,
     * functions, references, and substitution templates.
     *
     * In the following example, the value for the `propertyAlias` parameter uses a substitution
     * template.
     *
     * `'company/windfarm/${$input.TemperatureInput.sensorData.windfarmID}/turbine/
     * ${$input.TemperatureInput.sensorData.turbineID}/temperature'`
     *
     * You must specify either `propertyAlias` or both `assetId` and `propertyId` to identify the
     * target asset property in AWS IoT SiteWise .
     *
     * For more information, see
     * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
     * in the *AWS IoT Events Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-iotsitewise)
     */
    public fun iotSiteWise(): Any? = unwrap(this).getIotSiteWise()

    /**
     * Information required to publish the MQTT message through the AWS IoT message broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-iottopicpublish)
     */
    public fun iotTopicPublish(): Any? = unwrap(this).getIotTopicPublish()

    /**
     * Calls a Lambda function, passing in information about the detector model instance and the
     * event that triggered the action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-lambda)
     */
    public fun lambda(): Any? = unwrap(this).getLambda()

    /**
     * Information required to publish the Amazon SNS message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-sns)
     */
    public fun sns(): Any? = unwrap(this).getSns()

    /**
     * Sends information about the detector model instance and the event that triggered the action
     * to an Amazon SQS queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-sqs)
     */
    public fun sqs(): Any? = unwrap(this).getSqs()

    /**
     * A builder for [AlarmActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dynamoDBv2 Defines an action to write to the Amazon DynamoDB table that you created.
       * The default action payload contains all the information about the detector model instance
       * and the event that triggered the action. You can customize the
       * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
       * separate column of the DynamoDB table receives one attribute-value pair in the payload that
       * you specify.
       *
       * You must use expressions for all parameters in `DynamoDBv2Action` . The expressions accept
       * literals, operators, functions, references, and substitution templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `tableName` parameter can be `'GreenhouseTemperatureTable'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `tableName` parameter can be `$variable.ddbtableName` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `contentExpression` parameter in `Payload` uses
       * a substitution template.
       *
       * `'{\"sensorID\": \"${$input.GreenhouseInput.sensor_id}\", \"temperature\":
       * \"${$input.GreenhouseInput.temperature * 9 / 5 + 32}\"}'`
       *
       * * For a string concatenation, you must use `+` . A string concatenation can also contain a
       * combination of literals, operators, functions, references, and substitution templates.
       *
       * In the following example, the value for the `tableName` parameter uses a string
       * concatenation.
       *
       * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       *
       * The value for the `type` parameter in `Payload` must be `JSON` .
       */
      public fun dynamoDBv2(dynamoDBv2: IResolvable)

      /**
       * @param dynamoDBv2 Defines an action to write to the Amazon DynamoDB table that you created.
       * The default action payload contains all the information about the detector model instance
       * and the event that triggered the action. You can customize the
       * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
       * separate column of the DynamoDB table receives one attribute-value pair in the payload that
       * you specify.
       *
       * You must use expressions for all parameters in `DynamoDBv2Action` . The expressions accept
       * literals, operators, functions, references, and substitution templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `tableName` parameter can be `'GreenhouseTemperatureTable'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `tableName` parameter can be `$variable.ddbtableName` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `contentExpression` parameter in `Payload` uses
       * a substitution template.
       *
       * `'{\"sensorID\": \"${$input.GreenhouseInput.sensor_id}\", \"temperature\":
       * \"${$input.GreenhouseInput.temperature * 9 / 5 + 32}\"}'`
       *
       * * For a string concatenation, you must use `+` . A string concatenation can also contain a
       * combination of literals, operators, functions, references, and substitution templates.
       *
       * In the following example, the value for the `tableName` parameter uses a string
       * concatenation.
       *
       * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       *
       * The value for the `type` parameter in `Payload` must be `JSON` .
       */
      public fun dynamoDBv2(dynamoDBv2: DynamoDBv2Property)

      /**
       * @param dynamoDBv2 Defines an action to write to the Amazon DynamoDB table that you created.
       * The default action payload contains all the information about the detector model instance
       * and the event that triggered the action. You can customize the
       * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
       * separate column of the DynamoDB table receives one attribute-value pair in the payload that
       * you specify.
       *
       * You must use expressions for all parameters in `DynamoDBv2Action` . The expressions accept
       * literals, operators, functions, references, and substitution templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `tableName` parameter can be `'GreenhouseTemperatureTable'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `tableName` parameter can be `$variable.ddbtableName` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `contentExpression` parameter in `Payload` uses
       * a substitution template.
       *
       * `'{\"sensorID\": \"${$input.GreenhouseInput.sensor_id}\", \"temperature\":
       * \"${$input.GreenhouseInput.temperature * 9 / 5 + 32}\"}'`
       *
       * * For a string concatenation, you must use `+` . A string concatenation can also contain a
       * combination of literals, operators, functions, references, and substitution templates.
       *
       * In the following example, the value for the `tableName` parameter uses a string
       * concatenation.
       *
       * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       *
       * The value for the `type` parameter in `Payload` must be `JSON` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6d188816317dc2bba3407a999b47df7b7d18f6dde1f044d746d59ad2929c6146")
      public fun dynamoDBv2(dynamoDBv2: DynamoDBv2Property.Builder.() -> Unit)

      /**
       * @param dynamoDb Defines an action to write to the Amazon DynamoDB table that you created.
       * The standard action payload contains all the information about the detector model instance
       * and the event that triggered the action. You can customize the
       * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . One
       * column of the DynamoDB table receives all attribute-value pairs in the payload that you
       * specify.
       *
       * You must use expressions for all parameters in `DynamoDBAction` . The expressions accept
       * literals, operators, functions, references, and substitution templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `hashKeyType` parameter can be `'STRING'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `hashKeyField` parameter can be `$input.GreenhouseInput.name` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `hashKeyValue` parameter uses a substitution
       * template.
       *
       * `'${$input.GreenhouseInput.temperature * 6 / 5 + 32} in Fahrenheit'`
       *
       * * For a string concatenation, you must use `+` . A string concatenation can also contain a
       * combination of literals, operators, functions, references, and substitution templates.
       *
       * In the following example, the value for the `tableName` parameter uses a string
       * concatenation.
       *
       * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       *
       * If the defined payload type is a string, `DynamoDBAction` writes non-JSON data to the
       * DynamoDB table as binary data. The DynamoDB console displays the data as Base64-encoded text.
       * The value for the `payloadField` parameter is `&lt;payload-field&gt;_raw` .
       */
      public fun dynamoDb(dynamoDb: IResolvable)

      /**
       * @param dynamoDb Defines an action to write to the Amazon DynamoDB table that you created.
       * The standard action payload contains all the information about the detector model instance
       * and the event that triggered the action. You can customize the
       * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . One
       * column of the DynamoDB table receives all attribute-value pairs in the payload that you
       * specify.
       *
       * You must use expressions for all parameters in `DynamoDBAction` . The expressions accept
       * literals, operators, functions, references, and substitution templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `hashKeyType` parameter can be `'STRING'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `hashKeyField` parameter can be `$input.GreenhouseInput.name` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `hashKeyValue` parameter uses a substitution
       * template.
       *
       * `'${$input.GreenhouseInput.temperature * 6 / 5 + 32} in Fahrenheit'`
       *
       * * For a string concatenation, you must use `+` . A string concatenation can also contain a
       * combination of literals, operators, functions, references, and substitution templates.
       *
       * In the following example, the value for the `tableName` parameter uses a string
       * concatenation.
       *
       * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       *
       * If the defined payload type is a string, `DynamoDBAction` writes non-JSON data to the
       * DynamoDB table as binary data. The DynamoDB console displays the data as Base64-encoded text.
       * The value for the `payloadField` parameter is `&lt;payload-field&gt;_raw` .
       */
      public fun dynamoDb(dynamoDb: DynamoDBProperty)

      /**
       * @param dynamoDb Defines an action to write to the Amazon DynamoDB table that you created.
       * The standard action payload contains all the information about the detector model instance
       * and the event that triggered the action. You can customize the
       * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . One
       * column of the DynamoDB table receives all attribute-value pairs in the payload that you
       * specify.
       *
       * You must use expressions for all parameters in `DynamoDBAction` . The expressions accept
       * literals, operators, functions, references, and substitution templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `hashKeyType` parameter can be `'STRING'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `hashKeyField` parameter can be `$input.GreenhouseInput.name` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `hashKeyValue` parameter uses a substitution
       * template.
       *
       * `'${$input.GreenhouseInput.temperature * 6 / 5 + 32} in Fahrenheit'`
       *
       * * For a string concatenation, you must use `+` . A string concatenation can also contain a
       * combination of literals, operators, functions, references, and substitution templates.
       *
       * In the following example, the value for the `tableName` parameter uses a string
       * concatenation.
       *
       * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       *
       * If the defined payload type is a string, `DynamoDBAction` writes non-JSON data to the
       * DynamoDB table as binary data. The DynamoDB console displays the data as Base64-encoded text.
       * The value for the `payloadField` parameter is `&lt;payload-field&gt;_raw` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e78f99f854660adca9866689f88c4f478977630c74e0778ebd321dd8c61e61c")
      public fun dynamoDb(dynamoDb: DynamoDBProperty.Builder.() -> Unit)

      /**
       * @param firehose Sends information about the detector model instance and the event that
       * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
       */
      public fun firehose(firehose: IResolvable)

      /**
       * @param firehose Sends information about the detector model instance and the event that
       * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
       */
      public fun firehose(firehose: FirehoseProperty)

      /**
       * @param firehose Sends information about the detector model instance and the event that
       * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("829773b971a8bf944d36ee1bf480aea8bb67d937013f1cd4dea2a3dfbdbff12f")
      public fun firehose(firehose: FirehoseProperty.Builder.() -> Unit)

      /**
       * @param iotEvents Sends an AWS IoT Events input, passing in information about the detector
       * model instance and the event that triggered the action.
       */
      public fun iotEvents(iotEvents: IResolvable)

      /**
       * @param iotEvents Sends an AWS IoT Events input, passing in information about the detector
       * model instance and the event that triggered the action.
       */
      public fun iotEvents(iotEvents: IotEventsProperty)

      /**
       * @param iotEvents Sends an AWS IoT Events input, passing in information about the detector
       * model instance and the event that triggered the action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58f8a68f00e5e88e84857886e566e33911847d03ca8a5b44d8b4b1a51775dcee")
      public fun iotEvents(iotEvents: IotEventsProperty.Builder.() -> Unit)

      /**
       * @param iotSiteWise Sends information about the detector model instance and the event that
       * triggered the action to a specified asset property in AWS IoT SiteWise .
       * You must use expressions for all parameters in `IotSiteWiseAction` . The expressions accept
       * literals, operators, functions, references, and substitutions templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `propertyAlias` parameter can be
       * `'/company/windfarm/3/turbine/7/temperature'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `assetId` parameter can be `$input.TurbineInput.assetId1` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `propertyAlias` parameter uses a substitution
       * template.
       *
       * `'company/windfarm/${$input.TemperatureInput.sensorData.windfarmID}/turbine/
       * ${$input.TemperatureInput.sensorData.turbineID}/temperature'`
       *
       * You must specify either `propertyAlias` or both `assetId` and `propertyId` to identify the
       * target asset property in AWS IoT SiteWise .
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       */
      public fun iotSiteWise(iotSiteWise: IResolvable)

      /**
       * @param iotSiteWise Sends information about the detector model instance and the event that
       * triggered the action to a specified asset property in AWS IoT SiteWise .
       * You must use expressions for all parameters in `IotSiteWiseAction` . The expressions accept
       * literals, operators, functions, references, and substitutions templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `propertyAlias` parameter can be
       * `'/company/windfarm/3/turbine/7/temperature'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `assetId` parameter can be `$input.TurbineInput.assetId1` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `propertyAlias` parameter uses a substitution
       * template.
       *
       * `'company/windfarm/${$input.TemperatureInput.sensorData.windfarmID}/turbine/
       * ${$input.TemperatureInput.sensorData.turbineID}/temperature'`
       *
       * You must specify either `propertyAlias` or both `assetId` and `propertyId` to identify the
       * target asset property in AWS IoT SiteWise .
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       */
      public fun iotSiteWise(iotSiteWise: IotSiteWiseProperty)

      /**
       * @param iotSiteWise Sends information about the detector model instance and the event that
       * triggered the action to a specified asset property in AWS IoT SiteWise .
       * You must use expressions for all parameters in `IotSiteWiseAction` . The expressions accept
       * literals, operators, functions, references, and substitutions templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `propertyAlias` parameter can be
       * `'/company/windfarm/3/turbine/7/temperature'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `assetId` parameter can be `$input.TurbineInput.assetId1` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `propertyAlias` parameter uses a substitution
       * template.
       *
       * `'company/windfarm/${$input.TemperatureInput.sensorData.windfarmID}/turbine/
       * ${$input.TemperatureInput.sensorData.turbineID}/temperature'`
       *
       * You must specify either `propertyAlias` or both `assetId` and `propertyId` to identify the
       * target asset property in AWS IoT SiteWise .
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eba33acab845cb824153697c8ded76a604d7c7941288e5b9027205162ae7beb7")
      public fun iotSiteWise(iotSiteWise: IotSiteWiseProperty.Builder.() -> Unit)

      /**
       * @param iotTopicPublish Information required to publish the MQTT message through the AWS IoT
       * message broker.
       */
      public fun iotTopicPublish(iotTopicPublish: IResolvable)

      /**
       * @param iotTopicPublish Information required to publish the MQTT message through the AWS IoT
       * message broker.
       */
      public fun iotTopicPublish(iotTopicPublish: IotTopicPublishProperty)

      /**
       * @param iotTopicPublish Information required to publish the MQTT message through the AWS IoT
       * message broker.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eb9bf5bd4cedcb9d89548b63ccbc6a98e99671d994e3f06088431680b1f6b965")
      public fun iotTopicPublish(iotTopicPublish: IotTopicPublishProperty.Builder.() -> Unit)

      /**
       * @param lambda Calls a Lambda function, passing in information about the detector model
       * instance and the event that triggered the action.
       */
      public fun lambda(lambda: IResolvable)

      /**
       * @param lambda Calls a Lambda function, passing in information about the detector model
       * instance and the event that triggered the action.
       */
      public fun lambda(lambda: LambdaProperty)

      /**
       * @param lambda Calls a Lambda function, passing in information about the detector model
       * instance and the event that triggered the action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5adf283344549e7ebcdbcbaf5dd26d7b6562feae7110819f076a607e873162bd")
      public fun lambda(lambda: LambdaProperty.Builder.() -> Unit)

      /**
       * @param sns Information required to publish the Amazon SNS message.
       */
      public fun sns(sns: IResolvable)

      /**
       * @param sns Information required to publish the Amazon SNS message.
       */
      public fun sns(sns: SnsProperty)

      /**
       * @param sns Information required to publish the Amazon SNS message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f522bb88cc761157565415502439d4395c223e6c9654cf0f6ada3c919fdf97e")
      public fun sns(sns: SnsProperty.Builder.() -> Unit)

      /**
       * @param sqs Sends information about the detector model instance and the event that triggered
       * the action to an Amazon SQS queue.
       */
      public fun sqs(sqs: IResolvable)

      /**
       * @param sqs Sends information about the detector model instance and the event that triggered
       * the action to an Amazon SQS queue.
       */
      public fun sqs(sqs: SqsProperty)

      /**
       * @param sqs Sends information about the detector model instance and the event that triggered
       * the action to an Amazon SQS queue.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95c0b3dab9e6522270f5f8c293f53035c523144c63e76e6cad208a6f093220bd")
      public fun sqs(sqs: SqsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmActionProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmActionProperty.builder()

      /**
       * @param dynamoDBv2 Defines an action to write to the Amazon DynamoDB table that you created.
       * The default action payload contains all the information about the detector model instance
       * and the event that triggered the action. You can customize the
       * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
       * separate column of the DynamoDB table receives one attribute-value pair in the payload that
       * you specify.
       *
       * You must use expressions for all parameters in `DynamoDBv2Action` . The expressions accept
       * literals, operators, functions, references, and substitution templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `tableName` parameter can be `'GreenhouseTemperatureTable'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `tableName` parameter can be `$variable.ddbtableName` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `contentExpression` parameter in `Payload` uses
       * a substitution template.
       *
       * `'{\"sensorID\": \"${$input.GreenhouseInput.sensor_id}\", \"temperature\":
       * \"${$input.GreenhouseInput.temperature * 9 / 5 + 32}\"}'`
       *
       * * For a string concatenation, you must use `+` . A string concatenation can also contain a
       * combination of literals, operators, functions, references, and substitution templates.
       *
       * In the following example, the value for the `tableName` parameter uses a string
       * concatenation.
       *
       * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       *
       * The value for the `type` parameter in `Payload` must be `JSON` .
       */
      override fun dynamoDBv2(dynamoDBv2: IResolvable) {
        cdkBuilder.dynamoDBv2(dynamoDBv2.let(IResolvable::unwrap))
      }

      /**
       * @param dynamoDBv2 Defines an action to write to the Amazon DynamoDB table that you created.
       * The default action payload contains all the information about the detector model instance
       * and the event that triggered the action. You can customize the
       * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
       * separate column of the DynamoDB table receives one attribute-value pair in the payload that
       * you specify.
       *
       * You must use expressions for all parameters in `DynamoDBv2Action` . The expressions accept
       * literals, operators, functions, references, and substitution templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `tableName` parameter can be `'GreenhouseTemperatureTable'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `tableName` parameter can be `$variable.ddbtableName` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `contentExpression` parameter in `Payload` uses
       * a substitution template.
       *
       * `'{\"sensorID\": \"${$input.GreenhouseInput.sensor_id}\", \"temperature\":
       * \"${$input.GreenhouseInput.temperature * 9 / 5 + 32}\"}'`
       *
       * * For a string concatenation, you must use `+` . A string concatenation can also contain a
       * combination of literals, operators, functions, references, and substitution templates.
       *
       * In the following example, the value for the `tableName` parameter uses a string
       * concatenation.
       *
       * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       *
       * The value for the `type` parameter in `Payload` must be `JSON` .
       */
      override fun dynamoDBv2(dynamoDBv2: DynamoDBv2Property) {
        cdkBuilder.dynamoDBv2(dynamoDBv2.let(DynamoDBv2Property::unwrap))
      }

      /**
       * @param dynamoDBv2 Defines an action to write to the Amazon DynamoDB table that you created.
       * The default action payload contains all the information about the detector model instance
       * and the event that triggered the action. You can customize the
       * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
       * separate column of the DynamoDB table receives one attribute-value pair in the payload that
       * you specify.
       *
       * You must use expressions for all parameters in `DynamoDBv2Action` . The expressions accept
       * literals, operators, functions, references, and substitution templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `tableName` parameter can be `'GreenhouseTemperatureTable'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `tableName` parameter can be `$variable.ddbtableName` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `contentExpression` parameter in `Payload` uses
       * a substitution template.
       *
       * `'{\"sensorID\": \"${$input.GreenhouseInput.sensor_id}\", \"temperature\":
       * \"${$input.GreenhouseInput.temperature * 9 / 5 + 32}\"}'`
       *
       * * For a string concatenation, you must use `+` . A string concatenation can also contain a
       * combination of literals, operators, functions, references, and substitution templates.
       *
       * In the following example, the value for the `tableName` parameter uses a string
       * concatenation.
       *
       * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       *
       * The value for the `type` parameter in `Payload` must be `JSON` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6d188816317dc2bba3407a999b47df7b7d18f6dde1f044d746d59ad2929c6146")
      override fun dynamoDBv2(dynamoDBv2: DynamoDBv2Property.Builder.() -> Unit): Unit =
          dynamoDBv2(DynamoDBv2Property(dynamoDBv2))

      /**
       * @param dynamoDb Defines an action to write to the Amazon DynamoDB table that you created.
       * The standard action payload contains all the information about the detector model instance
       * and the event that triggered the action. You can customize the
       * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . One
       * column of the DynamoDB table receives all attribute-value pairs in the payload that you
       * specify.
       *
       * You must use expressions for all parameters in `DynamoDBAction` . The expressions accept
       * literals, operators, functions, references, and substitution templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `hashKeyType` parameter can be `'STRING'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `hashKeyField` parameter can be `$input.GreenhouseInput.name` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `hashKeyValue` parameter uses a substitution
       * template.
       *
       * `'${$input.GreenhouseInput.temperature * 6 / 5 + 32} in Fahrenheit'`
       *
       * * For a string concatenation, you must use `+` . A string concatenation can also contain a
       * combination of literals, operators, functions, references, and substitution templates.
       *
       * In the following example, the value for the `tableName` parameter uses a string
       * concatenation.
       *
       * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       *
       * If the defined payload type is a string, `DynamoDBAction` writes non-JSON data to the
       * DynamoDB table as binary data. The DynamoDB console displays the data as Base64-encoded text.
       * The value for the `payloadField` parameter is `&lt;payload-field&gt;_raw` .
       */
      override fun dynamoDb(dynamoDb: IResolvable) {
        cdkBuilder.dynamoDb(dynamoDb.let(IResolvable::unwrap))
      }

      /**
       * @param dynamoDb Defines an action to write to the Amazon DynamoDB table that you created.
       * The standard action payload contains all the information about the detector model instance
       * and the event that triggered the action. You can customize the
       * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . One
       * column of the DynamoDB table receives all attribute-value pairs in the payload that you
       * specify.
       *
       * You must use expressions for all parameters in `DynamoDBAction` . The expressions accept
       * literals, operators, functions, references, and substitution templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `hashKeyType` parameter can be `'STRING'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `hashKeyField` parameter can be `$input.GreenhouseInput.name` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `hashKeyValue` parameter uses a substitution
       * template.
       *
       * `'${$input.GreenhouseInput.temperature * 6 / 5 + 32} in Fahrenheit'`
       *
       * * For a string concatenation, you must use `+` . A string concatenation can also contain a
       * combination of literals, operators, functions, references, and substitution templates.
       *
       * In the following example, the value for the `tableName` parameter uses a string
       * concatenation.
       *
       * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       *
       * If the defined payload type is a string, `DynamoDBAction` writes non-JSON data to the
       * DynamoDB table as binary data. The DynamoDB console displays the data as Base64-encoded text.
       * The value for the `payloadField` parameter is `&lt;payload-field&gt;_raw` .
       */
      override fun dynamoDb(dynamoDb: DynamoDBProperty) {
        cdkBuilder.dynamoDb(dynamoDb.let(DynamoDBProperty::unwrap))
      }

      /**
       * @param dynamoDb Defines an action to write to the Amazon DynamoDB table that you created.
       * The standard action payload contains all the information about the detector model instance
       * and the event that triggered the action. You can customize the
       * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . One
       * column of the DynamoDB table receives all attribute-value pairs in the payload that you
       * specify.
       *
       * You must use expressions for all parameters in `DynamoDBAction` . The expressions accept
       * literals, operators, functions, references, and substitution templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `hashKeyType` parameter can be `'STRING'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `hashKeyField` parameter can be `$input.GreenhouseInput.name` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `hashKeyValue` parameter uses a substitution
       * template.
       *
       * `'${$input.GreenhouseInput.temperature * 6 / 5 + 32} in Fahrenheit'`
       *
       * * For a string concatenation, you must use `+` . A string concatenation can also contain a
       * combination of literals, operators, functions, references, and substitution templates.
       *
       * In the following example, the value for the `tableName` parameter uses a string
       * concatenation.
       *
       * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       *
       * If the defined payload type is a string, `DynamoDBAction` writes non-JSON data to the
       * DynamoDB table as binary data. The DynamoDB console displays the data as Base64-encoded text.
       * The value for the `payloadField` parameter is `&lt;payload-field&gt;_raw` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e78f99f854660adca9866689f88c4f478977630c74e0778ebd321dd8c61e61c")
      override fun dynamoDb(dynamoDb: DynamoDBProperty.Builder.() -> Unit): Unit =
          dynamoDb(DynamoDBProperty(dynamoDb))

      /**
       * @param firehose Sends information about the detector model instance and the event that
       * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
       */
      override fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose.let(IResolvable::unwrap))
      }

      /**
       * @param firehose Sends information about the detector model instance and the event that
       * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
       */
      override fun firehose(firehose: FirehoseProperty) {
        cdkBuilder.firehose(firehose.let(FirehoseProperty::unwrap))
      }

      /**
       * @param firehose Sends information about the detector model instance and the event that
       * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("829773b971a8bf944d36ee1bf480aea8bb67d937013f1cd4dea2a3dfbdbff12f")
      override fun firehose(firehose: FirehoseProperty.Builder.() -> Unit): Unit =
          firehose(FirehoseProperty(firehose))

      /**
       * @param iotEvents Sends an AWS IoT Events input, passing in information about the detector
       * model instance and the event that triggered the action.
       */
      override fun iotEvents(iotEvents: IResolvable) {
        cdkBuilder.iotEvents(iotEvents.let(IResolvable::unwrap))
      }

      /**
       * @param iotEvents Sends an AWS IoT Events input, passing in information about the detector
       * model instance and the event that triggered the action.
       */
      override fun iotEvents(iotEvents: IotEventsProperty) {
        cdkBuilder.iotEvents(iotEvents.let(IotEventsProperty::unwrap))
      }

      /**
       * @param iotEvents Sends an AWS IoT Events input, passing in information about the detector
       * model instance and the event that triggered the action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58f8a68f00e5e88e84857886e566e33911847d03ca8a5b44d8b4b1a51775dcee")
      override fun iotEvents(iotEvents: IotEventsProperty.Builder.() -> Unit): Unit =
          iotEvents(IotEventsProperty(iotEvents))

      /**
       * @param iotSiteWise Sends information about the detector model instance and the event that
       * triggered the action to a specified asset property in AWS IoT SiteWise .
       * You must use expressions for all parameters in `IotSiteWiseAction` . The expressions accept
       * literals, operators, functions, references, and substitutions templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `propertyAlias` parameter can be
       * `'/company/windfarm/3/turbine/7/temperature'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `assetId` parameter can be `$input.TurbineInput.assetId1` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `propertyAlias` parameter uses a substitution
       * template.
       *
       * `'company/windfarm/${$input.TemperatureInput.sensorData.windfarmID}/turbine/
       * ${$input.TemperatureInput.sensorData.turbineID}/temperature'`
       *
       * You must specify either `propertyAlias` or both `assetId` and `propertyId` to identify the
       * target asset property in AWS IoT SiteWise .
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       */
      override fun iotSiteWise(iotSiteWise: IResolvable) {
        cdkBuilder.iotSiteWise(iotSiteWise.let(IResolvable::unwrap))
      }

      /**
       * @param iotSiteWise Sends information about the detector model instance and the event that
       * triggered the action to a specified asset property in AWS IoT SiteWise .
       * You must use expressions for all parameters in `IotSiteWiseAction` . The expressions accept
       * literals, operators, functions, references, and substitutions templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `propertyAlias` parameter can be
       * `'/company/windfarm/3/turbine/7/temperature'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `assetId` parameter can be `$input.TurbineInput.assetId1` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `propertyAlias` parameter uses a substitution
       * template.
       *
       * `'company/windfarm/${$input.TemperatureInput.sensorData.windfarmID}/turbine/
       * ${$input.TemperatureInput.sensorData.turbineID}/temperature'`
       *
       * You must specify either `propertyAlias` or both `assetId` and `propertyId` to identify the
       * target asset property in AWS IoT SiteWise .
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       */
      override fun iotSiteWise(iotSiteWise: IotSiteWiseProperty) {
        cdkBuilder.iotSiteWise(iotSiteWise.let(IotSiteWiseProperty::unwrap))
      }

      /**
       * @param iotSiteWise Sends information about the detector model instance and the event that
       * triggered the action to a specified asset property in AWS IoT SiteWise .
       * You must use expressions for all parameters in `IotSiteWiseAction` . The expressions accept
       * literals, operators, functions, references, and substitutions templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `propertyAlias` parameter can be
       * `'/company/windfarm/3/turbine/7/temperature'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `assetId` parameter can be `$input.TurbineInput.assetId1` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `propertyAlias` parameter uses a substitution
       * template.
       *
       * `'company/windfarm/${$input.TemperatureInput.sensorData.windfarmID}/turbine/
       * ${$input.TemperatureInput.sensorData.turbineID}/temperature'`
       *
       * You must specify either `propertyAlias` or both `assetId` and `propertyId` to identify the
       * target asset property in AWS IoT SiteWise .
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eba33acab845cb824153697c8ded76a604d7c7941288e5b9027205162ae7beb7")
      override fun iotSiteWise(iotSiteWise: IotSiteWiseProperty.Builder.() -> Unit): Unit =
          iotSiteWise(IotSiteWiseProperty(iotSiteWise))

      /**
       * @param iotTopicPublish Information required to publish the MQTT message through the AWS IoT
       * message broker.
       */
      override fun iotTopicPublish(iotTopicPublish: IResolvable) {
        cdkBuilder.iotTopicPublish(iotTopicPublish.let(IResolvable::unwrap))
      }

      /**
       * @param iotTopicPublish Information required to publish the MQTT message through the AWS IoT
       * message broker.
       */
      override fun iotTopicPublish(iotTopicPublish: IotTopicPublishProperty) {
        cdkBuilder.iotTopicPublish(iotTopicPublish.let(IotTopicPublishProperty::unwrap))
      }

      /**
       * @param iotTopicPublish Information required to publish the MQTT message through the AWS IoT
       * message broker.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eb9bf5bd4cedcb9d89548b63ccbc6a98e99671d994e3f06088431680b1f6b965")
      override fun iotTopicPublish(iotTopicPublish: IotTopicPublishProperty.Builder.() -> Unit):
          Unit = iotTopicPublish(IotTopicPublishProperty(iotTopicPublish))

      /**
       * @param lambda Calls a Lambda function, passing in information about the detector model
       * instance and the event that triggered the action.
       */
      override fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda.let(IResolvable::unwrap))
      }

      /**
       * @param lambda Calls a Lambda function, passing in information about the detector model
       * instance and the event that triggered the action.
       */
      override fun lambda(lambda: LambdaProperty) {
        cdkBuilder.lambda(lambda.let(LambdaProperty::unwrap))
      }

      /**
       * @param lambda Calls a Lambda function, passing in information about the detector model
       * instance and the event that triggered the action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5adf283344549e7ebcdbcbaf5dd26d7b6562feae7110819f076a607e873162bd")
      override fun lambda(lambda: LambdaProperty.Builder.() -> Unit): Unit =
          lambda(LambdaProperty(lambda))

      /**
       * @param sns Information required to publish the Amazon SNS message.
       */
      override fun sns(sns: IResolvable) {
        cdkBuilder.sns(sns.let(IResolvable::unwrap))
      }

      /**
       * @param sns Information required to publish the Amazon SNS message.
       */
      override fun sns(sns: SnsProperty) {
        cdkBuilder.sns(sns.let(SnsProperty::unwrap))
      }

      /**
       * @param sns Information required to publish the Amazon SNS message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f522bb88cc761157565415502439d4395c223e6c9654cf0f6ada3c919fdf97e")
      override fun sns(sns: SnsProperty.Builder.() -> Unit): Unit = sns(SnsProperty(sns))

      /**
       * @param sqs Sends information about the detector model instance and the event that triggered
       * the action to an Amazon SQS queue.
       */
      override fun sqs(sqs: IResolvable) {
        cdkBuilder.sqs(sqs.let(IResolvable::unwrap))
      }

      /**
       * @param sqs Sends information about the detector model instance and the event that triggered
       * the action to an Amazon SQS queue.
       */
      override fun sqs(sqs: SqsProperty) {
        cdkBuilder.sqs(sqs.let(SqsProperty::unwrap))
      }

      /**
       * @param sqs Sends information about the detector model instance and the event that triggered
       * the action to an Amazon SQS queue.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95c0b3dab9e6522270f5f8c293f53035c523144c63e76e6cad208a6f093220bd")
      override fun sqs(sqs: SqsProperty.Builder.() -> Unit): Unit = sqs(SqsProperty(sqs))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmActionProperty,
    ) : CdkObject(cdkObject), AlarmActionProperty {
      /**
       * Defines an action to write to the Amazon DynamoDB table that you created.
       *
       * The default action payload contains all the information about the detector model instance
       * and the event that triggered the action. You can customize the
       * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
       * separate column of the DynamoDB table receives one attribute-value pair in the payload that
       * you specify.
       *
       * You must use expressions for all parameters in `DynamoDBv2Action` . The expressions accept
       * literals, operators, functions, references, and substitution templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `tableName` parameter can be `'GreenhouseTemperatureTable'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `tableName` parameter can be `$variable.ddbtableName` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `contentExpression` parameter in `Payload` uses
       * a substitution template.
       *
       * `'{\"sensorID\": \"${$input.GreenhouseInput.sensor_id}\", \"temperature\":
       * \"${$input.GreenhouseInput.temperature * 9 / 5 + 32}\"}'`
       *
       * * For a string concatenation, you must use `+` . A string concatenation can also contain a
       * combination of literals, operators, functions, references, and substitution templates.
       *
       * In the following example, the value for the `tableName` parameter uses a string
       * concatenation.
       *
       * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       *
       * The value for the `type` parameter in `Payload` must be `JSON` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-dynamodbv2)
       */
      override fun dynamoDBv2(): Any? = unwrap(this).getDynamoDBv2()

      /**
       * Defines an action to write to the Amazon DynamoDB table that you created.
       *
       * The standard action payload contains all the information about the detector model instance
       * and the event that triggered the action. You can customize the
       * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . One
       * column of the DynamoDB table receives all attribute-value pairs in the payload that you
       * specify.
       *
       * You must use expressions for all parameters in `DynamoDBAction` . The expressions accept
       * literals, operators, functions, references, and substitution templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `hashKeyType` parameter can be `'STRING'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `hashKeyField` parameter can be `$input.GreenhouseInput.name` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `hashKeyValue` parameter uses a substitution
       * template.
       *
       * `'${$input.GreenhouseInput.temperature * 6 / 5 + 32} in Fahrenheit'`
       *
       * * For a string concatenation, you must use `+` . A string concatenation can also contain a
       * combination of literals, operators, functions, references, and substitution templates.
       *
       * In the following example, the value for the `tableName` parameter uses a string
       * concatenation.
       *
       * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       *
       * If the defined payload type is a string, `DynamoDBAction` writes non-JSON data to the
       * DynamoDB table as binary data. The DynamoDB console displays the data as Base64-encoded text.
       * The value for the `payloadField` parameter is `&lt;payload-field&gt;_raw` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-dynamodb)
       */
      override fun dynamoDb(): Any? = unwrap(this).getDynamoDb()

      /**
       * Sends information about the detector model instance and the event that triggered the action
       * to an Amazon Kinesis Data Firehose delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-firehose)
       */
      override fun firehose(): Any? = unwrap(this).getFirehose()

      /**
       * Sends an AWS IoT Events input, passing in information about the detector model instance and
       * the event that triggered the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-iotevents)
       */
      override fun iotEvents(): Any? = unwrap(this).getIotEvents()

      /**
       * Sends information about the detector model instance and the event that triggered the action
       * to a specified asset property in AWS IoT SiteWise .
       *
       * You must use expressions for all parameters in `IotSiteWiseAction` . The expressions accept
       * literals, operators, functions, references, and substitutions templates.
       *
       * **Examples** - For literal values, the expressions must contain single quotes. For example,
       * the value for the `propertyAlias` parameter can be
       * `'/company/windfarm/3/turbine/7/temperature'` .
       *
       * * For references, you must specify either variables or input values. For example, the value
       * for the `assetId` parameter can be `$input.TurbineInput.assetId1` .
       * * For a substitution template, you must use `${}` , and the template must be in single
       * quotes. A substitution template can also contain a combination of literals, operators,
       * functions, references, and substitution templates.
       *
       * In the following example, the value for the `propertyAlias` parameter uses a substitution
       * template.
       *
       * `'company/windfarm/${$input.TemperatureInput.sensorData.windfarmID}/turbine/
       * ${$input.TemperatureInput.sensorData.turbineID}/temperature'`
       *
       * You must specify either `propertyAlias` or both `assetId` and `propertyId` to identify the
       * target asset property in AWS IoT SiteWise .
       *
       * For more information, see
       * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
       * in the *AWS IoT Events Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-iotsitewise)
       */
      override fun iotSiteWise(): Any? = unwrap(this).getIotSiteWise()

      /**
       * Information required to publish the MQTT message through the AWS IoT message broker.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-iottopicpublish)
       */
      override fun iotTopicPublish(): Any? = unwrap(this).getIotTopicPublish()

      /**
       * Calls a Lambda function, passing in information about the detector model instance and the
       * event that triggered the action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-lambda)
       */
      override fun lambda(): Any? = unwrap(this).getLambda()

      /**
       * Information required to publish the Amazon SNS message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-sns)
       */
      override fun sns(): Any? = unwrap(this).getSns()

      /**
       * Sends information about the detector model instance and the event that triggered the action
       * to an Amazon SQS queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html#cfn-iotevents-alarmmodel-alarmaction-sqs)
       */
      override fun sqs(): Any? = unwrap(this).getSqs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmActionProperty):
          AlarmActionProperty = CdkObjectWrappers.wrap(cdkObject) as AlarmActionProperty

      internal fun unwrap(wrapped: AlarmActionProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmActionProperty
    }
  }

  /**
   * Sends information about the detector model instance and the event that triggered the action to
   * a specified asset property in AWS IoT SiteWise .
   *
   * You must use expressions for all parameters in `IotSiteWiseAction` . The expressions accept
   * literals, operators, functions, references, and substitutions templates.
   *
   * **Examples** - For literal values, the expressions must contain single quotes. For example, the
   * value for the `propertyAlias` parameter can be `'/company/windfarm/3/turbine/7/temperature'` .
   *
   * * For references, you must specify either variables or input values. For example, the value for
   * the `assetId` parameter can be `$input.TurbineInput.assetId1` .
   * * For a substitution template, you must use `${}` , and the template must be in single quotes.
   * A substitution template can also contain a combination of literals, operators, functions,
   * references, and substitution templates.
   *
   * In the following example, the value for the `propertyAlias` parameter uses a substitution
   * template.
   *
   * `'company/windfarm/${$input.TemperatureInput.sensorData.windfarmID}/turbine/
   * ${$input.TemperatureInput.sensorData.turbineID}/temperature'`
   *
   * You must specify either `propertyAlias` or both `assetId` and `propertyId` to identify the
   * target asset property in AWS IoT SiteWise .
   *
   * For more information, see
   * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
   * in the *AWS IoT Events Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * IotSiteWiseProperty iotSiteWiseProperty = IotSiteWiseProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotsitewise.html)
   */
  public interface IotSiteWiseProperty {
    /**
     * The ID of the asset that has the specified property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotsitewise.html#cfn-iotevents-alarmmodel-iotsitewise-assetid)
     */
    public fun assetId(): String? = unwrap(this).getAssetId()

    /**
     * A unique identifier for this entry.
     *
     * You can use the entry ID to track which data entry causes an error in case of failure. The
     * default is a new unique identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotsitewise.html#cfn-iotevents-alarmmodel-iotsitewise-entryid)
     */
    public fun entryId(): String? = unwrap(this).getEntryId()

    /**
     * The alias of the asset property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotsitewise.html#cfn-iotevents-alarmmodel-iotsitewise-propertyalias)
     */
    public fun propertyAlias(): String? = unwrap(this).getPropertyAlias()

    /**
     * The ID of the asset property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotsitewise.html#cfn-iotevents-alarmmodel-iotsitewise-propertyid)
     */
    public fun propertyId(): String? = unwrap(this).getPropertyId()

    /**
     * The value to send to the asset property.
     *
     * This value contains timestamp, quality, and value (TQV) information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotsitewise.html#cfn-iotevents-alarmmodel-iotsitewise-propertyvalue)
     */
    public fun propertyValue(): Any? = unwrap(this).getPropertyValue()

    /**
     * A builder for [IotSiteWiseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param assetId The ID of the asset that has the specified property.
       */
      public fun assetId(assetId: String)

      /**
       * @param entryId A unique identifier for this entry.
       * You can use the entry ID to track which data entry causes an error in case of failure. The
       * default is a new unique identifier.
       */
      public fun entryId(entryId: String)

      /**
       * @param propertyAlias The alias of the asset property.
       */
      public fun propertyAlias(propertyAlias: String)

      /**
       * @param propertyId The ID of the asset property.
       */
      public fun propertyId(propertyId: String)

      /**
       * @param propertyValue The value to send to the asset property.
       * This value contains timestamp, quality, and value (TQV) information.
       */
      public fun propertyValue(propertyValue: IResolvable)

      /**
       * @param propertyValue The value to send to the asset property.
       * This value contains timestamp, quality, and value (TQV) information.
       */
      public fun propertyValue(propertyValue: AssetPropertyValueProperty)

      /**
       * @param propertyValue The value to send to the asset property.
       * This value contains timestamp, quality, and value (TQV) information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47b0e44681950e9c0630a17a035b5170e8152a7dfefc8df1c97b2699e6f33d06")
      public fun propertyValue(propertyValue: AssetPropertyValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotSiteWiseProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotSiteWiseProperty.builder()

      /**
       * @param assetId The ID of the asset that has the specified property.
       */
      override fun assetId(assetId: String) {
        cdkBuilder.assetId(assetId)
      }

      /**
       * @param entryId A unique identifier for this entry.
       * You can use the entry ID to track which data entry causes an error in case of failure. The
       * default is a new unique identifier.
       */
      override fun entryId(entryId: String) {
        cdkBuilder.entryId(entryId)
      }

      /**
       * @param propertyAlias The alias of the asset property.
       */
      override fun propertyAlias(propertyAlias: String) {
        cdkBuilder.propertyAlias(propertyAlias)
      }

      /**
       * @param propertyId The ID of the asset property.
       */
      override fun propertyId(propertyId: String) {
        cdkBuilder.propertyId(propertyId)
      }

      /**
       * @param propertyValue The value to send to the asset property.
       * This value contains timestamp, quality, and value (TQV) information.
       */
      override fun propertyValue(propertyValue: IResolvable) {
        cdkBuilder.propertyValue(propertyValue.let(IResolvable::unwrap))
      }

      /**
       * @param propertyValue The value to send to the asset property.
       * This value contains timestamp, quality, and value (TQV) information.
       */
      override fun propertyValue(propertyValue: AssetPropertyValueProperty) {
        cdkBuilder.propertyValue(propertyValue.let(AssetPropertyValueProperty::unwrap))
      }

      /**
       * @param propertyValue The value to send to the asset property.
       * This value contains timestamp, quality, and value (TQV) information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47b0e44681950e9c0630a17a035b5170e8152a7dfefc8df1c97b2699e6f33d06")
      override fun propertyValue(propertyValue: AssetPropertyValueProperty.Builder.() -> Unit): Unit
          = propertyValue(AssetPropertyValueProperty(propertyValue))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotSiteWiseProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotSiteWiseProperty,
    ) : CdkObject(cdkObject), IotSiteWiseProperty {
      /**
       * The ID of the asset that has the specified property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotsitewise.html#cfn-iotevents-alarmmodel-iotsitewise-assetid)
       */
      override fun assetId(): String? = unwrap(this).getAssetId()

      /**
       * A unique identifier for this entry.
       *
       * You can use the entry ID to track which data entry causes an error in case of failure. The
       * default is a new unique identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotsitewise.html#cfn-iotevents-alarmmodel-iotsitewise-entryid)
       */
      override fun entryId(): String? = unwrap(this).getEntryId()

      /**
       * The alias of the asset property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotsitewise.html#cfn-iotevents-alarmmodel-iotsitewise-propertyalias)
       */
      override fun propertyAlias(): String? = unwrap(this).getPropertyAlias()

      /**
       * The ID of the asset property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotsitewise.html#cfn-iotevents-alarmmodel-iotsitewise-propertyid)
       */
      override fun propertyId(): String? = unwrap(this).getPropertyId()

      /**
       * The value to send to the asset property.
       *
       * This value contains timestamp, quality, and value (TQV) information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotsitewise.html#cfn-iotevents-alarmmodel-iotsitewise-propertyvalue)
       */
      override fun propertyValue(): Any? = unwrap(this).getPropertyValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IotSiteWiseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotSiteWiseProperty):
          IotSiteWiseProperty = CdkObjectWrappers.wrap(cdkObject) as IotSiteWiseProperty

      internal fun unwrap(wrapped: IotSiteWiseProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotSiteWiseProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.IotSiteWiseProperty
    }
  }

  /**
   * Calls a Lambda function, passing in information about the detector model instance and the event
   * that triggered the action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * LambdaProperty lambdaProperty = LambdaProperty.builder()
   * .functionArn("functionArn")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-lambda.html)
   */
  public interface LambdaProperty {
    /**
     * The ARN of the Lambda function that is executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-lambda.html#cfn-iotevents-alarmmodel-lambda-functionarn)
     */
    public fun functionArn(): String

    /**
     * You can configure the action payload when you send a message to a Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-lambda.html#cfn-iotevents-alarmmodel-lambda-payload)
     */
    public fun payload(): Any? = unwrap(this).getPayload()

    /**
     * A builder for [LambdaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param functionArn The ARN of the Lambda function that is executed. 
       */
      public fun functionArn(functionArn: String)

      /**
       * @param payload You can configure the action payload when you send a message to a Lambda
       * function.
       */
      public fun payload(payload: IResolvable)

      /**
       * @param payload You can configure the action payload when you send a message to a Lambda
       * function.
       */
      public fun payload(payload: PayloadProperty)

      /**
       * @param payload You can configure the action payload when you send a message to a Lambda
       * function.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0aafc5896db3657ca3d677b4554976515fdf55eb8a17a120f94b3de437abf2a7")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.LambdaProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.LambdaProperty.builder()

      /**
       * @param functionArn The ARN of the Lambda function that is executed. 
       */
      override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      /**
       * @param payload You can configure the action payload when you send a message to a Lambda
       * function.
       */
      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message to a Lambda
       * function.
       */
      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message to a Lambda
       * function.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0aafc5896db3657ca3d677b4554976515fdf55eb8a17a120f94b3de437abf2a7")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.LambdaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.LambdaProperty,
    ) : CdkObject(cdkObject), LambdaProperty {
      /**
       * The ARN of the Lambda function that is executed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-lambda.html#cfn-iotevents-alarmmodel-lambda-functionarn)
       */
      override fun functionArn(): String = unwrap(this).getFunctionArn()

      /**
       * You can configure the action payload when you send a message to a Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-lambda.html#cfn-iotevents-alarmmodel-lambda-payload)
       */
      override fun payload(): Any? = unwrap(this).getPayload()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.LambdaProperty):
          LambdaProperty = CdkObjectWrappers.wrap(cdkObject) as LambdaProperty

      internal fun unwrap(wrapped: LambdaProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.LambdaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.LambdaProperty
    }
  }

  /**
   * A structure that contains timestamp information. For more information, see
   * [TimeInNanos](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_TimeInNanos.html)
   * in the *AWS IoT SiteWise API Reference* .
   *
   * You must use expressions for all parameters in `AssetPropertyTimestamp` . The expressions
   * accept literals, operators, functions, references, and substitution templates.
   *
   * **Examples** - For literal values, the expressions must contain single quotes. For example, the
   * value for the `timeInSeconds` parameter can be `'1586400675'` .
   *
   * * For references, you must specify either variables or input values. For example, the value for
   * the `offsetInNanos` parameter can be `$variable.time` .
   * * For a substitution template, you must use `${}` , and the template must be in single quotes.
   * A substitution template can also contain a combination of literals, operators, functions,
   * references, and substitution templates.
   *
   * In the following example, the value for the `timeInSeconds` parameter uses a substitution
   * template.
   *
   * `'${$input.TemperatureInput.sensorData.timestamp / 1000}'`
   *
   * For more information, see
   * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
   * in the *AWS IoT Events Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * AssetPropertyTimestampProperty assetPropertyTimestampProperty =
   * AssetPropertyTimestampProperty.builder()
   * .timeInSeconds("timeInSeconds")
   * // the properties below are optional
   * .offsetInNanos("offsetInNanos")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertytimestamp.html)
   */
  public interface AssetPropertyTimestampProperty {
    /**
     * The nanosecond offset converted from `timeInSeconds` .
     *
     * The valid range is between 0-999999999.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertytimestamp.html#cfn-iotevents-alarmmodel-assetpropertytimestamp-offsetinnanos)
     */
    public fun offsetInNanos(): String? = unwrap(this).getOffsetInNanos()

    /**
     * The timestamp, in seconds, in the Unix epoch format.
     *
     * The valid range is between 1-31556889864403199.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertytimestamp.html#cfn-iotevents-alarmmodel-assetpropertytimestamp-timeinseconds)
     */
    public fun timeInSeconds(): String

    /**
     * A builder for [AssetPropertyTimestampProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param offsetInNanos The nanosecond offset converted from `timeInSeconds` .
       * The valid range is between 0-999999999.
       */
      public fun offsetInNanos(offsetInNanos: String)

      /**
       * @param timeInSeconds The timestamp, in seconds, in the Unix epoch format. 
       * The valid range is between 1-31556889864403199.
       */
      public fun timeInSeconds(timeInSeconds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyTimestampProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyTimestampProperty.builder()

      /**
       * @param offsetInNanos The nanosecond offset converted from `timeInSeconds` .
       * The valid range is between 0-999999999.
       */
      override fun offsetInNanos(offsetInNanos: String) {
        cdkBuilder.offsetInNanos(offsetInNanos)
      }

      /**
       * @param timeInSeconds The timestamp, in seconds, in the Unix epoch format. 
       * The valid range is between 1-31556889864403199.
       */
      override fun timeInSeconds(timeInSeconds: String) {
        cdkBuilder.timeInSeconds(timeInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyTimestampProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyTimestampProperty,
    ) : CdkObject(cdkObject), AssetPropertyTimestampProperty {
      /**
       * The nanosecond offset converted from `timeInSeconds` .
       *
       * The valid range is between 0-999999999.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertytimestamp.html#cfn-iotevents-alarmmodel-assetpropertytimestamp-offsetinnanos)
       */
      override fun offsetInNanos(): String? = unwrap(this).getOffsetInNanos()

      /**
       * The timestamp, in seconds, in the Unix epoch format.
       *
       * The valid range is between 1-31556889864403199.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertytimestamp.html#cfn-iotevents-alarmmodel-assetpropertytimestamp-timeinseconds)
       */
      override fun timeInSeconds(): String = unwrap(this).getTimeInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyTimestampProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyTimestampProperty):
          AssetPropertyTimestampProperty = CdkObjectWrappers.wrap(cdkObject) as
          AssetPropertyTimestampProperty

      internal fun unwrap(wrapped: AssetPropertyTimestampProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyTimestampProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyTimestampProperty
    }
  }

  /**
   * Contains information about one or more alarm actions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * AlarmEventActionsProperty alarmEventActionsProperty = AlarmEventActionsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmeventactions.html)
   */
  public interface AlarmEventActionsProperty {
    /**
     * Specifies one or more supported actions to receive notifications when the alarm state
     * changes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmeventactions.html#cfn-iotevents-alarmmodel-alarmeventactions-alarmactions)
     */
    public fun alarmActions(): Any? = unwrap(this).getAlarmActions()

    /**
     * A builder for [AlarmEventActionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarmActions Specifies one or more supported actions to receive notifications when
       * the alarm state changes.
       */
      public fun alarmActions(alarmActions: IResolvable)

      /**
       * @param alarmActions Specifies one or more supported actions to receive notifications when
       * the alarm state changes.
       */
      public fun alarmActions(alarmActions: List<Any>)

      /**
       * @param alarmActions Specifies one or more supported actions to receive notifications when
       * the alarm state changes.
       */
      public fun alarmActions(vararg alarmActions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmEventActionsProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmEventActionsProperty.builder()

      /**
       * @param alarmActions Specifies one or more supported actions to receive notifications when
       * the alarm state changes.
       */
      override fun alarmActions(alarmActions: IResolvable) {
        cdkBuilder.alarmActions(alarmActions.let(IResolvable::unwrap))
      }

      /**
       * @param alarmActions Specifies one or more supported actions to receive notifications when
       * the alarm state changes.
       */
      override fun alarmActions(alarmActions: List<Any>) {
        cdkBuilder.alarmActions(alarmActions)
      }

      /**
       * @param alarmActions Specifies one or more supported actions to receive notifications when
       * the alarm state changes.
       */
      override fun alarmActions(vararg alarmActions: Any): Unit =
          alarmActions(alarmActions.toList())

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmEventActionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmEventActionsProperty,
    ) : CdkObject(cdkObject), AlarmEventActionsProperty {
      /**
       * Specifies one or more supported actions to receive notifications when the alarm state
       * changes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmeventactions.html#cfn-iotevents-alarmmodel-alarmeventactions-alarmactions)
       */
      override fun alarmActions(): Any? = unwrap(this).getAlarmActions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmEventActionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmEventActionsProperty):
          AlarmEventActionsProperty = CdkObjectWrappers.wrap(cdkObject) as AlarmEventActionsProperty

      internal fun unwrap(wrapped: AlarmEventActionsProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmEventActionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmEventActionsProperty
    }
  }

  /**
   * A structure that contains value information. For more information, see
   * [AssetPropertyValue](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_AssetPropertyValue.html)
   * in the *AWS IoT SiteWise API Reference* .
   *
   * You must use expressions for all parameters in `AssetPropertyValue` . The expressions accept
   * literals, operators, functions, references, and substitution templates.
   *
   * **Examples** - For literal values, the expressions must contain single quotes. For example, the
   * value for the `quality` parameter can be `'GOOD'` .
   *
   * * For references, you must specify either variables or input values. For example, the value for
   * the `quality` parameter can be `$input.TemperatureInput.sensorData.quality` .
   *
   * For more information, see
   * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
   * in the *AWS IoT Events Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * AssetPropertyValueProperty assetPropertyValueProperty = AssetPropertyValueProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvalue.html)
   */
  public interface AssetPropertyValueProperty {
    /**
     * The quality of the asset property value.
     *
     * The value must be `'GOOD'` , `'BAD'` , or `'UNCERTAIN'` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvalue.html#cfn-iotevents-alarmmodel-assetpropertyvalue-quality)
     */
    public fun quality(): String? = unwrap(this).getQuality()

    /**
     * The timestamp associated with the asset property value.
     *
     * The default is the current event time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvalue.html#cfn-iotevents-alarmmodel-assetpropertyvalue-timestamp)
     */
    public fun timestamp(): Any? = unwrap(this).getTimestamp()

    /**
     * The value to send to an asset property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvalue.html#cfn-iotevents-alarmmodel-assetpropertyvalue-value)
     */
    public fun `value`(): Any

    /**
     * A builder for [AssetPropertyValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param quality The quality of the asset property value.
       * The value must be `'GOOD'` , `'BAD'` , or `'UNCERTAIN'` .
       */
      public fun quality(quality: String)

      /**
       * @param timestamp The timestamp associated with the asset property value.
       * The default is the current event time.
       */
      public fun timestamp(timestamp: IResolvable)

      /**
       * @param timestamp The timestamp associated with the asset property value.
       * The default is the current event time.
       */
      public fun timestamp(timestamp: AssetPropertyTimestampProperty)

      /**
       * @param timestamp The timestamp associated with the asset property value.
       * The default is the current event time.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df2f5e64893fb161017d38a6e681afa0e6e7cfc70be3ce67ecee2b116fc52626")
      public fun timestamp(timestamp: AssetPropertyTimestampProperty.Builder.() -> Unit)

      /**
       * @param value The value to send to an asset property. 
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value The value to send to an asset property. 
       */
      public fun `value`(`value`: AssetPropertyVariantProperty)

      /**
       * @param value The value to send to an asset property. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbea76610d5420e612fb890cc7ec42e476b80403773daff5c2473bc525c98c77")
      public fun `value`(`value`: AssetPropertyVariantProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyValueProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyValueProperty.builder()

      /**
       * @param quality The quality of the asset property value.
       * The value must be `'GOOD'` , `'BAD'` , or `'UNCERTAIN'` .
       */
      override fun quality(quality: String) {
        cdkBuilder.quality(quality)
      }

      /**
       * @param timestamp The timestamp associated with the asset property value.
       * The default is the current event time.
       */
      override fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp.let(IResolvable::unwrap))
      }

      /**
       * @param timestamp The timestamp associated with the asset property value.
       * The default is the current event time.
       */
      override fun timestamp(timestamp: AssetPropertyTimestampProperty) {
        cdkBuilder.timestamp(timestamp.let(AssetPropertyTimestampProperty::unwrap))
      }

      /**
       * @param timestamp The timestamp associated with the asset property value.
       * The default is the current event time.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df2f5e64893fb161017d38a6e681afa0e6e7cfc70be3ce67ecee2b116fc52626")
      override fun timestamp(timestamp: AssetPropertyTimestampProperty.Builder.() -> Unit): Unit =
          timestamp(AssetPropertyTimestampProperty(timestamp))

      /**
       * @param value The value to send to an asset property. 
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      /**
       * @param value The value to send to an asset property. 
       */
      override fun `value`(`value`: AssetPropertyVariantProperty) {
        cdkBuilder.`value`(`value`.let(AssetPropertyVariantProperty::unwrap))
      }

      /**
       * @param value The value to send to an asset property. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cbea76610d5420e612fb890cc7ec42e476b80403773daff5c2473bc525c98c77")
      override fun `value`(`value`: AssetPropertyVariantProperty.Builder.() -> Unit): Unit =
          `value`(AssetPropertyVariantProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyValueProperty,
    ) : CdkObject(cdkObject), AssetPropertyValueProperty {
      /**
       * The quality of the asset property value.
       *
       * The value must be `'GOOD'` , `'BAD'` , or `'UNCERTAIN'` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvalue.html#cfn-iotevents-alarmmodel-assetpropertyvalue-quality)
       */
      override fun quality(): String? = unwrap(this).getQuality()

      /**
       * The timestamp associated with the asset property value.
       *
       * The default is the current event time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvalue.html#cfn-iotevents-alarmmodel-assetpropertyvalue-timestamp)
       */
      override fun timestamp(): Any? = unwrap(this).getTimestamp()

      /**
       * The value to send to an asset property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvalue.html#cfn-iotevents-alarmmodel-assetpropertyvalue-value)
       */
      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyValueProperty):
          AssetPropertyValueProperty = CdkObjectWrappers.wrap(cdkObject) as
          AssetPropertyValueProperty

      internal fun unwrap(wrapped: AssetPropertyValueProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyValueProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AssetPropertyValueProperty
    }
  }

  /**
   * Information required to publish the Amazon SNS message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * SnsProperty snsProperty = SnsProperty.builder()
   * .targetArn("targetArn")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-sns.html)
   */
  public interface SnsProperty {
    /**
     * You can configure the action payload when you send a message as an Amazon SNS push
     * notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-sns.html#cfn-iotevents-alarmmodel-sns-payload)
     */
    public fun payload(): Any? = unwrap(this).getPayload()

    /**
     * The ARN of the Amazon SNS target where the message is sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-sns.html#cfn-iotevents-alarmmodel-sns-targetarn)
     */
    public fun targetArn(): String

    /**
     * A builder for [SnsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param payload You can configure the action payload when you send a message as an Amazon
       * SNS push notification.
       */
      public fun payload(payload: IResolvable)

      /**
       * @param payload You can configure the action payload when you send a message as an Amazon
       * SNS push notification.
       */
      public fun payload(payload: PayloadProperty)

      /**
       * @param payload You can configure the action payload when you send a message as an Amazon
       * SNS push notification.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6c028e5e6ef49dc9a532dccd28461e6ca6ef718968ffaf554d5be8a0f10580c9")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)

      /**
       * @param targetArn The ARN of the Amazon SNS target where the message is sent. 
       */
      public fun targetArn(targetArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SnsProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SnsProperty.builder()

      /**
       * @param payload You can configure the action payload when you send a message as an Amazon
       * SNS push notification.
       */
      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message as an Amazon
       * SNS push notification.
       */
      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message as an Amazon
       * SNS push notification.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6c028e5e6ef49dc9a532dccd28461e6ca6ef718968ffaf554d5be8a0f10580c9")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      /**
       * @param targetArn The ARN of the Amazon SNS target where the message is sent. 
       */
      override fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.SnsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.SnsProperty,
    ) : CdkObject(cdkObject), SnsProperty {
      /**
       * You can configure the action payload when you send a message as an Amazon SNS push
       * notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-sns.html#cfn-iotevents-alarmmodel-sns-payload)
       */
      override fun payload(): Any? = unwrap(this).getPayload()

      /**
       * The ARN of the Amazon SNS target where the message is sent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-sns.html#cfn-iotevents-alarmmodel-sns-targetarn)
       */
      override fun targetArn(): String = unwrap(this).getTargetArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.SnsProperty):
          SnsProperty = CdkObjectWrappers.wrap(cdkObject) as SnsProperty

      internal fun unwrap(wrapped: SnsProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SnsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.SnsProperty
    }
  }

  /**
   * Contains the configuration information of alarm state changes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * AlarmCapabilitiesProperty alarmCapabilitiesProperty = AlarmCapabilitiesProperty.builder()
   * .acknowledgeFlow(AcknowledgeFlowProperty.builder()
   * .enabled(false)
   * .build())
   * .initializationConfiguration(InitializationConfigurationProperty.builder()
   * .disabledOnInitialization(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmcapabilities.html)
   */
  public interface AlarmCapabilitiesProperty {
    /**
     * Specifies whether to get notified for alarm state changes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmcapabilities.html#cfn-iotevents-alarmmodel-alarmcapabilities-acknowledgeflow)
     */
    public fun acknowledgeFlow(): Any? = unwrap(this).getAcknowledgeFlow()

    /**
     * Specifies the default alarm state.
     *
     * The configuration applies to all alarms that were created based on this alarm model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmcapabilities.html#cfn-iotevents-alarmmodel-alarmcapabilities-initializationconfiguration)
     */
    public fun initializationConfiguration(): Any? = unwrap(this).getInitializationConfiguration()

    /**
     * A builder for [AlarmCapabilitiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param acknowledgeFlow Specifies whether to get notified for alarm state changes.
       */
      public fun acknowledgeFlow(acknowledgeFlow: IResolvable)

      /**
       * @param acknowledgeFlow Specifies whether to get notified for alarm state changes.
       */
      public fun acknowledgeFlow(acknowledgeFlow: AcknowledgeFlowProperty)

      /**
       * @param acknowledgeFlow Specifies whether to get notified for alarm state changes.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bab2c9254d6a985d303ef2f39b186823a487f99df2e54f3ab959b7587ec44bce")
      public fun acknowledgeFlow(acknowledgeFlow: AcknowledgeFlowProperty.Builder.() -> Unit)

      /**
       * @param initializationConfiguration Specifies the default alarm state.
       * The configuration applies to all alarms that were created based on this alarm model.
       */
      public fun initializationConfiguration(initializationConfiguration: IResolvable)

      /**
       * @param initializationConfiguration Specifies the default alarm state.
       * The configuration applies to all alarms that were created based on this alarm model.
       */
      public
          fun initializationConfiguration(initializationConfiguration: InitializationConfigurationProperty)

      /**
       * @param initializationConfiguration Specifies the default alarm state.
       * The configuration applies to all alarms that were created based on this alarm model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32cf13c41f3c306a15d07256aec14aee334d44e7a5bf38a6b3ea805ee7770777")
      public
          fun initializationConfiguration(initializationConfiguration: InitializationConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmCapabilitiesProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmCapabilitiesProperty.builder()

      /**
       * @param acknowledgeFlow Specifies whether to get notified for alarm state changes.
       */
      override fun acknowledgeFlow(acknowledgeFlow: IResolvable) {
        cdkBuilder.acknowledgeFlow(acknowledgeFlow.let(IResolvable::unwrap))
      }

      /**
       * @param acknowledgeFlow Specifies whether to get notified for alarm state changes.
       */
      override fun acknowledgeFlow(acknowledgeFlow: AcknowledgeFlowProperty) {
        cdkBuilder.acknowledgeFlow(acknowledgeFlow.let(AcknowledgeFlowProperty::unwrap))
      }

      /**
       * @param acknowledgeFlow Specifies whether to get notified for alarm state changes.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bab2c9254d6a985d303ef2f39b186823a487f99df2e54f3ab959b7587ec44bce")
      override fun acknowledgeFlow(acknowledgeFlow: AcknowledgeFlowProperty.Builder.() -> Unit):
          Unit = acknowledgeFlow(AcknowledgeFlowProperty(acknowledgeFlow))

      /**
       * @param initializationConfiguration Specifies the default alarm state.
       * The configuration applies to all alarms that were created based on this alarm model.
       */
      override fun initializationConfiguration(initializationConfiguration: IResolvable) {
        cdkBuilder.initializationConfiguration(initializationConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param initializationConfiguration Specifies the default alarm state.
       * The configuration applies to all alarms that were created based on this alarm model.
       */
      override
          fun initializationConfiguration(initializationConfiguration: InitializationConfigurationProperty) {
        cdkBuilder.initializationConfiguration(initializationConfiguration.let(InitializationConfigurationProperty::unwrap))
      }

      /**
       * @param initializationConfiguration Specifies the default alarm state.
       * The configuration applies to all alarms that were created based on this alarm model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32cf13c41f3c306a15d07256aec14aee334d44e7a5bf38a6b3ea805ee7770777")
      override
          fun initializationConfiguration(initializationConfiguration: InitializationConfigurationProperty.Builder.() -> Unit):
          Unit =
          initializationConfiguration(InitializationConfigurationProperty(initializationConfiguration))

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmCapabilitiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmCapabilitiesProperty,
    ) : CdkObject(cdkObject), AlarmCapabilitiesProperty {
      /**
       * Specifies whether to get notified for alarm state changes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmcapabilities.html#cfn-iotevents-alarmmodel-alarmcapabilities-acknowledgeflow)
       */
      override fun acknowledgeFlow(): Any? = unwrap(this).getAcknowledgeFlow()

      /**
       * Specifies the default alarm state.
       *
       * The configuration applies to all alarms that were created based on this alarm model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmcapabilities.html#cfn-iotevents-alarmmodel-alarmcapabilities-initializationconfiguration)
       */
      override fun initializationConfiguration(): Any? =
          unwrap(this).getInitializationConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmCapabilitiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmCapabilitiesProperty):
          AlarmCapabilitiesProperty = CdkObjectWrappers.wrap(cdkObject) as AlarmCapabilitiesProperty

      internal fun unwrap(wrapped: AlarmCapabilitiesProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmCapabilitiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AlarmCapabilitiesProperty
    }
  }

  /**
   * Sends information about the detector model instance and the event that triggered the action to
   * an Amazon Kinesis Data Firehose delivery stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * FirehoseProperty firehoseProperty = FirehoseProperty.builder()
   * .deliveryStreamName("deliveryStreamName")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .separator("separator")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-firehose.html)
   */
  public interface FirehoseProperty {
    /**
     * The name of the Kinesis Data Firehose delivery stream where the data is written.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-firehose.html#cfn-iotevents-alarmmodel-firehose-deliverystreamname)
     */
    public fun deliveryStreamName(): String

    /**
     * You can configure the action payload when you send a message to an Amazon Data Firehose
     * delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-firehose.html#cfn-iotevents-alarmmodel-firehose-payload)
     */
    public fun payload(): Any? = unwrap(this).getPayload()

    /**
     * A character separator that is used to separate records written to the Kinesis Data Firehose
     * delivery stream.
     *
     * Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-firehose.html#cfn-iotevents-alarmmodel-firehose-separator)
     */
    public fun separator(): String? = unwrap(this).getSeparator()

    /**
     * A builder for [FirehoseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deliveryStreamName The name of the Kinesis Data Firehose delivery stream where the
       * data is written. 
       */
      public fun deliveryStreamName(deliveryStreamName: String)

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * Data Firehose delivery stream.
       */
      public fun payload(payload: IResolvable)

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * Data Firehose delivery stream.
       */
      public fun payload(payload: PayloadProperty)

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * Data Firehose delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5ed37dd3ac41489ee6fcc52b73c04f615773e187f6fda0f36151c9939ed489a")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)

      /**
       * @param separator A character separator that is used to separate records written to the
       * Kinesis Data Firehose delivery stream.
       * Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
       */
      public fun separator(separator: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.FirehoseProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.FirehoseProperty.builder()

      /**
       * @param deliveryStreamName The name of the Kinesis Data Firehose delivery stream where the
       * data is written. 
       */
      override fun deliveryStreamName(deliveryStreamName: String) {
        cdkBuilder.deliveryStreamName(deliveryStreamName)
      }

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * Data Firehose delivery stream.
       */
      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * Data Firehose delivery stream.
       */
      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      /**
       * @param payload You can configure the action payload when you send a message to an Amazon
       * Data Firehose delivery stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5ed37dd3ac41489ee6fcc52b73c04f615773e187f6fda0f36151c9939ed489a")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      /**
       * @param separator A character separator that is used to separate records written to the
       * Kinesis Data Firehose delivery stream.
       * Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
       */
      override fun separator(separator: String) {
        cdkBuilder.separator(separator)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.FirehoseProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.FirehoseProperty,
    ) : CdkObject(cdkObject), FirehoseProperty {
      /**
       * The name of the Kinesis Data Firehose delivery stream where the data is written.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-firehose.html#cfn-iotevents-alarmmodel-firehose-deliverystreamname)
       */
      override fun deliveryStreamName(): String = unwrap(this).getDeliveryStreamName()

      /**
       * You can configure the action payload when you send a message to an Amazon Data Firehose
       * delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-firehose.html#cfn-iotevents-alarmmodel-firehose-payload)
       */
      override fun payload(): Any? = unwrap(this).getPayload()

      /**
       * A character separator that is used to separate records written to the Kinesis Data Firehose
       * delivery stream.
       *
       * Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-firehose.html#cfn-iotevents-alarmmodel-firehose-separator)
       */
      override fun separator(): String? = unwrap(this).getSeparator()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.FirehoseProperty):
          FirehoseProperty = CdkObjectWrappers.wrap(cdkObject) as FirehoseProperty

      internal fun unwrap(wrapped: FirehoseProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.FirehoseProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.FirehoseProperty
    }
  }

  /**
   * Defines an action to write to the Amazon DynamoDB table that you created.
   *
   * The standard action payload contains all the information about the detector model instance and
   * the event that triggered the action. You can customize the
   * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . One column
   * of the DynamoDB table receives all attribute-value pairs in the payload that you specify.
   *
   * You must use expressions for all parameters in `DynamoDBAction` . The expressions accept
   * literals, operators, functions, references, and substitution templates.
   *
   * **Examples** - For literal values, the expressions must contain single quotes. For example, the
   * value for the `hashKeyType` parameter can be `'STRING'` .
   *
   * * For references, you must specify either variables or input values. For example, the value for
   * the `hashKeyField` parameter can be `$input.GreenhouseInput.name` .
   * * For a substitution template, you must use `${}` , and the template must be in single quotes.
   * A substitution template can also contain a combination of literals, operators, functions,
   * references, and substitution templates.
   *
   * In the following example, the value for the `hashKeyValue` parameter uses a substitution
   * template.
   *
   * `'${$input.GreenhouseInput.temperature * 6 / 5 + 32} in Fahrenheit'`
   *
   * * For a string concatenation, you must use `+` . A string concatenation can also contain a
   * combination of literals, operators, functions, references, and substitution templates.
   *
   * In the following example, the value for the `tableName` parameter uses a string concatenation.
   *
   * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
   *
   * For more information, see
   * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
   * in the *AWS IoT Events Developer Guide* .
   *
   * If the defined payload type is a string, `DynamoDBAction` writes non-JSON data to the DynamoDB
   * table as binary data. The DynamoDB console displays the data as Base64-encoded text. The value for
   * the `payloadField` parameter is `&lt;payload-field&gt;_raw` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * DynamoDBProperty dynamoDBProperty = DynamoDBProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html)
   */
  public interface DynamoDBProperty {
    /**
     * The name of the hash key (also called the partition key).
     *
     * The `hashKeyField` value must match the partition key of the target DynamoDB table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-hashkeyfield)
     */
    public fun hashKeyField(): String

    /**
     * The data type for the hash key (also called the partition key). You can specify the following
     * values:.
     *
     * * `'STRING'` - The hash key is a string.
     * * `'NUMBER'` - The hash key is a number.
     *
     * If you don't specify `hashKeyType` , the default value is `'STRING'` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-hashkeytype)
     */
    public fun hashKeyType(): String? = unwrap(this).getHashKeyType()

    /**
     * The value of the hash key (also called the partition key).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-hashkeyvalue)
     */
    public fun hashKeyValue(): String

    /**
     * The type of operation to perform. You can specify the following values:.
     *
     * * `'INSERT'` - Insert data as a new item into the DynamoDB table. This item uses the
     * specified hash key as a partition key. If you specified a range key, the item uses the range key
     * as a sort key.
     * * `'UPDATE'` - Update an existing item of the DynamoDB table with new data. This item's
     * partition key must match the specified hash key. If you specified a range key, the range key
     * must match the item's sort key.
     * * `'DELETE'` - Delete an existing item of the DynamoDB table. This item's partition key must
     * match the specified hash key. If you specified a range key, the range key must match the item's
     * sort key.
     *
     * If you don't specify this parameter, AWS IoT Events triggers the `'INSERT'` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-operation)
     */
    public fun operation(): String? = unwrap(this).getOperation()

    /**
     * Information needed to configure the payload.
     *
     * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
     * payload contains all attribute-value pairs that have the information about the detector model
     * instance and the event triggered the action. To configure the action payload, you can use
     * `contentExpression` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-payload)
     */
    public fun payload(): Any? = unwrap(this).getPayload()

    /**
     * The name of the DynamoDB column that receives the action payload.
     *
     * If you don't specify this parameter, the name of the DynamoDB column is `payload` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-payloadfield)
     */
    public fun payloadField(): String? = unwrap(this).getPayloadField()

    /**
     * The name of the range key (also called the sort key).
     *
     * The `rangeKeyField` value must match the sort key of the target DynamoDB table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-rangekeyfield)
     */
    public fun rangeKeyField(): String? = unwrap(this).getRangeKeyField()

    /**
     * The data type for the range key (also called the sort key), You can specify the following
     * values:.
     *
     * * `'STRING'` - The range key is a string.
     * * `'NUMBER'` - The range key is number.
     *
     * If you don't specify `rangeKeyField` , the default value is `'STRING'` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-rangekeytype)
     */
    public fun rangeKeyType(): String? = unwrap(this).getRangeKeyType()

    /**
     * The value of the range key (also called the sort key).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-rangekeyvalue)
     */
    public fun rangeKeyValue(): String? = unwrap(this).getRangeKeyValue()

    /**
     * The name of the DynamoDB table.
     *
     * The `tableName` value must match the table name of the target DynamoDB table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-tablename)
     */
    public fun tableName(): String

    /**
     * A builder for [DynamoDBProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hashKeyField The name of the hash key (also called the partition key). 
       * The `hashKeyField` value must match the partition key of the target DynamoDB table.
       */
      public fun hashKeyField(hashKeyField: String)

      /**
       * @param hashKeyType The data type for the hash key (also called the partition key). You can
       * specify the following values:.
       * * `'STRING'` - The hash key is a string.
       * * `'NUMBER'` - The hash key is a number.
       *
       * If you don't specify `hashKeyType` , the default value is `'STRING'` .
       */
      public fun hashKeyType(hashKeyType: String)

      /**
       * @param hashKeyValue The value of the hash key (also called the partition key). 
       */
      public fun hashKeyValue(hashKeyValue: String)

      /**
       * @param operation The type of operation to perform. You can specify the following values:.
       * * `'INSERT'` - Insert data as a new item into the DynamoDB table. This item uses the
       * specified hash key as a partition key. If you specified a range key, the item uses the range
       * key as a sort key.
       * * `'UPDATE'` - Update an existing item of the DynamoDB table with new data. This item's
       * partition key must match the specified hash key. If you specified a range key, the range key
       * must match the item's sort key.
       * * `'DELETE'` - Delete an existing item of the DynamoDB table. This item's partition key
       * must match the specified hash key. If you specified a range key, the range key must match the
       * item's sort key.
       *
       * If you don't specify this parameter, AWS IoT Events triggers the `'INSERT'` operation.
       */
      public fun operation(operation: String)

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      public fun payload(payload: IResolvable)

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      public fun payload(payload: PayloadProperty)

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a2ae3d762e15b2b323f83870caa364b4b49f1c19071d1fc282fe8299e80f0bc")
      public fun payload(payload: PayloadProperty.Builder.() -> Unit)

      /**
       * @param payloadField The name of the DynamoDB column that receives the action payload.
       * If you don't specify this parameter, the name of the DynamoDB column is `payload` .
       */
      public fun payloadField(payloadField: String)

      /**
       * @param rangeKeyField The name of the range key (also called the sort key).
       * The `rangeKeyField` value must match the sort key of the target DynamoDB table.
       */
      public fun rangeKeyField(rangeKeyField: String)

      /**
       * @param rangeKeyType The data type for the range key (also called the sort key), You can
       * specify the following values:.
       * * `'STRING'` - The range key is a string.
       * * `'NUMBER'` - The range key is number.
       *
       * If you don't specify `rangeKeyField` , the default value is `'STRING'` .
       */
      public fun rangeKeyType(rangeKeyType: String)

      /**
       * @param rangeKeyValue The value of the range key (also called the sort key).
       */
      public fun rangeKeyValue(rangeKeyValue: String)

      /**
       * @param tableName The name of the DynamoDB table. 
       * The `tableName` value must match the table name of the target DynamoDB table.
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBProperty.builder()

      /**
       * @param hashKeyField The name of the hash key (also called the partition key). 
       * The `hashKeyField` value must match the partition key of the target DynamoDB table.
       */
      override fun hashKeyField(hashKeyField: String) {
        cdkBuilder.hashKeyField(hashKeyField)
      }

      /**
       * @param hashKeyType The data type for the hash key (also called the partition key). You can
       * specify the following values:.
       * * `'STRING'` - The hash key is a string.
       * * `'NUMBER'` - The hash key is a number.
       *
       * If you don't specify `hashKeyType` , the default value is `'STRING'` .
       */
      override fun hashKeyType(hashKeyType: String) {
        cdkBuilder.hashKeyType(hashKeyType)
      }

      /**
       * @param hashKeyValue The value of the hash key (also called the partition key). 
       */
      override fun hashKeyValue(hashKeyValue: String) {
        cdkBuilder.hashKeyValue(hashKeyValue)
      }

      /**
       * @param operation The type of operation to perform. You can specify the following values:.
       * * `'INSERT'` - Insert data as a new item into the DynamoDB table. This item uses the
       * specified hash key as a partition key. If you specified a range key, the item uses the range
       * key as a sort key.
       * * `'UPDATE'` - Update an existing item of the DynamoDB table with new data. This item's
       * partition key must match the specified hash key. If you specified a range key, the range key
       * must match the item's sort key.
       * * `'DELETE'` - Delete an existing item of the DynamoDB table. This item's partition key
       * must match the specified hash key. If you specified a range key, the range key must match the
       * item's sort key.
       *
       * If you don't specify this parameter, AWS IoT Events triggers the `'INSERT'` operation.
       */
      override fun operation(operation: String) {
        cdkBuilder.operation(operation)
      }

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      override fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload.let(IResolvable::unwrap))
      }

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      override fun payload(payload: PayloadProperty) {
        cdkBuilder.payload(payload.let(PayloadProperty::unwrap))
      }

      /**
       * @param payload Information needed to configure the payload.
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a2ae3d762e15b2b323f83870caa364b4b49f1c19071d1fc282fe8299e80f0bc")
      override fun payload(payload: PayloadProperty.Builder.() -> Unit): Unit =
          payload(PayloadProperty(payload))

      /**
       * @param payloadField The name of the DynamoDB column that receives the action payload.
       * If you don't specify this parameter, the name of the DynamoDB column is `payload` .
       */
      override fun payloadField(payloadField: String) {
        cdkBuilder.payloadField(payloadField)
      }

      /**
       * @param rangeKeyField The name of the range key (also called the sort key).
       * The `rangeKeyField` value must match the sort key of the target DynamoDB table.
       */
      override fun rangeKeyField(rangeKeyField: String) {
        cdkBuilder.rangeKeyField(rangeKeyField)
      }

      /**
       * @param rangeKeyType The data type for the range key (also called the sort key), You can
       * specify the following values:.
       * * `'STRING'` - The range key is a string.
       * * `'NUMBER'` - The range key is number.
       *
       * If you don't specify `rangeKeyField` , the default value is `'STRING'` .
       */
      override fun rangeKeyType(rangeKeyType: String) {
        cdkBuilder.rangeKeyType(rangeKeyType)
      }

      /**
       * @param rangeKeyValue The value of the range key (also called the sort key).
       */
      override fun rangeKeyValue(rangeKeyValue: String) {
        cdkBuilder.rangeKeyValue(rangeKeyValue)
      }

      /**
       * @param tableName The name of the DynamoDB table. 
       * The `tableName` value must match the table name of the target DynamoDB table.
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBProperty,
    ) : CdkObject(cdkObject), DynamoDBProperty {
      /**
       * The name of the hash key (also called the partition key).
       *
       * The `hashKeyField` value must match the partition key of the target DynamoDB table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-hashkeyfield)
       */
      override fun hashKeyField(): String = unwrap(this).getHashKeyField()

      /**
       * The data type for the hash key (also called the partition key). You can specify the
       * following values:.
       *
       * * `'STRING'` - The hash key is a string.
       * * `'NUMBER'` - The hash key is a number.
       *
       * If you don't specify `hashKeyType` , the default value is `'STRING'` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-hashkeytype)
       */
      override fun hashKeyType(): String? = unwrap(this).getHashKeyType()

      /**
       * The value of the hash key (also called the partition key).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-hashkeyvalue)
       */
      override fun hashKeyValue(): String = unwrap(this).getHashKeyValue()

      /**
       * The type of operation to perform. You can specify the following values:.
       *
       * * `'INSERT'` - Insert data as a new item into the DynamoDB table. This item uses the
       * specified hash key as a partition key. If you specified a range key, the item uses the range
       * key as a sort key.
       * * `'UPDATE'` - Update an existing item of the DynamoDB table with new data. This item's
       * partition key must match the specified hash key. If you specified a range key, the range key
       * must match the item's sort key.
       * * `'DELETE'` - Delete an existing item of the DynamoDB table. This item's partition key
       * must match the specified hash key. If you specified a range key, the range key must match the
       * item's sort key.
       *
       * If you don't specify this parameter, AWS IoT Events triggers the `'INSERT'` operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-operation)
       */
      override fun operation(): String? = unwrap(this).getOperation()

      /**
       * Information needed to configure the payload.
       *
       * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
       * payload contains all attribute-value pairs that have the information about the detector model
       * instance and the event triggered the action. To configure the action payload, you can use
       * `contentExpression` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-payload)
       */
      override fun payload(): Any? = unwrap(this).getPayload()

      /**
       * The name of the DynamoDB column that receives the action payload.
       *
       * If you don't specify this parameter, the name of the DynamoDB column is `payload` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-payloadfield)
       */
      override fun payloadField(): String? = unwrap(this).getPayloadField()

      /**
       * The name of the range key (also called the sort key).
       *
       * The `rangeKeyField` value must match the sort key of the target DynamoDB table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-rangekeyfield)
       */
      override fun rangeKeyField(): String? = unwrap(this).getRangeKeyField()

      /**
       * The data type for the range key (also called the sort key), You can specify the following
       * values:.
       *
       * * `'STRING'` - The range key is a string.
       * * `'NUMBER'` - The range key is number.
       *
       * If you don't specify `rangeKeyField` , the default value is `'STRING'` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-rangekeytype)
       */
      override fun rangeKeyType(): String? = unwrap(this).getRangeKeyType()

      /**
       * The value of the range key (also called the sort key).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-rangekeyvalue)
       */
      override fun rangeKeyValue(): String? = unwrap(this).getRangeKeyValue()

      /**
       * The name of the DynamoDB table.
       *
       * The `tableName` value must match the table name of the target DynamoDB table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html#cfn-iotevents-alarmmodel-dynamodb-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBProperty):
          DynamoDBProperty = CdkObjectWrappers.wrap(cdkObject) as DynamoDBProperty

      internal fun unwrap(wrapped: DynamoDBProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.DynamoDBProperty
    }
  }

  /**
   * Specifies whether to get notified for alarm state changes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * AcknowledgeFlowProperty acknowledgeFlowProperty = AcknowledgeFlowProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-acknowledgeflow.html)
   */
  public interface AcknowledgeFlowProperty {
    /**
     * The value must be `TRUE` or `FALSE` .
     *
     * If `TRUE` , you receive a notification when the alarm state changes. You must choose to
     * acknowledge the notification before the alarm state can return to `NORMAL` . If `FALSE` , you
     * won't receive notifications. The alarm automatically changes to the `NORMAL` state when the
     * input property value returns to the specified range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-acknowledgeflow.html#cfn-iotevents-alarmmodel-acknowledgeflow-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [AcknowledgeFlowProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled The value must be `TRUE` or `FALSE` .
       * If `TRUE` , you receive a notification when the alarm state changes. You must choose to
       * acknowledge the notification before the alarm state can return to `NORMAL` . If `FALSE` , you
       * won't receive notifications. The alarm automatically changes to the `NORMAL` state when the
       * input property value returns to the specified range.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled The value must be `TRUE` or `FALSE` .
       * If `TRUE` , you receive a notification when the alarm state changes. You must choose to
       * acknowledge the notification before the alarm state can return to `NORMAL` . If `FALSE` , you
       * won't receive notifications. The alarm automatically changes to the `NORMAL` state when the
       * input property value returns to the specified range.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AcknowledgeFlowProperty.Builder =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AcknowledgeFlowProperty.builder()

      /**
       * @param enabled The value must be `TRUE` or `FALSE` .
       * If `TRUE` , you receive a notification when the alarm state changes. You must choose to
       * acknowledge the notification before the alarm state can return to `NORMAL` . If `FALSE` , you
       * won't receive notifications. The alarm automatically changes to the `NORMAL` state when the
       * input property value returns to the specified range.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled The value must be `TRUE` or `FALSE` .
       * If `TRUE` , you receive a notification when the alarm state changes. You must choose to
       * acknowledge the notification before the alarm state can return to `NORMAL` . If `FALSE` , you
       * won't receive notifications. The alarm automatically changes to the `NORMAL` state when the
       * input property value returns to the specified range.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AcknowledgeFlowProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AcknowledgeFlowProperty,
    ) : CdkObject(cdkObject), AcknowledgeFlowProperty {
      /**
       * The value must be `TRUE` or `FALSE` .
       *
       * If `TRUE` , you receive a notification when the alarm state changes. You must choose to
       * acknowledge the notification before the alarm state can return to `NORMAL` . If `FALSE` , you
       * won't receive notifications. The alarm automatically changes to the `NORMAL` state when the
       * input property value returns to the specified range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-acknowledgeflow.html#cfn-iotevents-alarmmodel-acknowledgeflow-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AcknowledgeFlowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.AcknowledgeFlowProperty):
          AcknowledgeFlowProperty = CdkObjectWrappers.wrap(cdkObject) as AcknowledgeFlowProperty

      internal fun unwrap(wrapped: AcknowledgeFlowProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AcknowledgeFlowProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.AcknowledgeFlowProperty
    }
  }

  /**
   * Specifies the default alarm state.
   *
   * The configuration applies to all alarms that were created based on this alarm model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotevents.*;
   * InitializationConfigurationProperty initializationConfigurationProperty =
   * InitializationConfigurationProperty.builder()
   * .disabledOnInitialization(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-initializationconfiguration.html)
   */
  public interface InitializationConfigurationProperty {
    /**
     * The value must be `TRUE` or `FALSE` .
     *
     * If `FALSE` , all alarm instances created based on the alarm model are activated. The default
     * value is `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-initializationconfiguration.html#cfn-iotevents-alarmmodel-initializationconfiguration-disabledoninitialization)
     */
    public fun disabledOnInitialization(): Any

    /**
     * A builder for [InitializationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param disabledOnInitialization The value must be `TRUE` or `FALSE` . 
       * If `FALSE` , all alarm instances created based on the alarm model are activated. The
       * default value is `TRUE` .
       */
      public fun disabledOnInitialization(disabledOnInitialization: Boolean)

      /**
       * @param disabledOnInitialization The value must be `TRUE` or `FALSE` . 
       * If `FALSE` , all alarm instances created based on the alarm model are activated. The
       * default value is `TRUE` .
       */
      public fun disabledOnInitialization(disabledOnInitialization: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.InitializationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.InitializationConfigurationProperty.builder()

      /**
       * @param disabledOnInitialization The value must be `TRUE` or `FALSE` . 
       * If `FALSE` , all alarm instances created based on the alarm model are activated. The
       * default value is `TRUE` .
       */
      override fun disabledOnInitialization(disabledOnInitialization: Boolean) {
        cdkBuilder.disabledOnInitialization(disabledOnInitialization)
      }

      /**
       * @param disabledOnInitialization The value must be `TRUE` or `FALSE` . 
       * If `FALSE` , all alarm instances created based on the alarm model are activated. The
       * default value is `TRUE` .
       */
      override fun disabledOnInitialization(disabledOnInitialization: IResolvable) {
        cdkBuilder.disabledOnInitialization(disabledOnInitialization.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.InitializationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.InitializationConfigurationProperty,
    ) : CdkObject(cdkObject), InitializationConfigurationProperty {
      /**
       * The value must be `TRUE` or `FALSE` .
       *
       * If `FALSE` , all alarm instances created based on the alarm model are activated. The
       * default value is `TRUE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-initializationconfiguration.html#cfn-iotevents-alarmmodel-initializationconfiguration-disabledoninitialization)
       */
      override fun disabledOnInitialization(): Any = unwrap(this).getDisabledOnInitialization()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InitializationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotevents.CfnAlarmModel.InitializationConfigurationProperty):
          InitializationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          InitializationConfigurationProperty

      internal fun unwrap(wrapped: InitializationConfigurationProperty):
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.InitializationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotevents.CfnAlarmModel.InitializationConfigurationProperty
    }
  }
}
