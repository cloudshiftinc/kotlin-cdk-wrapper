@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::IoT::TopicRule` resource to declare an AWS IoT rule.
 *
 * For information about working with AWS IoT rules, see [Rules for AWS
 * IoT](https://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html) in the *AWS IoT Developer
 * Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnTopicRule cfnTopicRule = CfnTopicRule.Builder.create(this, "MyCfnTopicRule")
 * .topicRulePayload(TopicRulePayloadProperty.builder()
 * .actions(List.of(ActionProperty.builder()
 * .cloudwatchAlarm(CloudwatchAlarmActionProperty.builder()
 * .alarmName("alarmName")
 * .roleArn("roleArn")
 * .stateReason("stateReason")
 * .stateValue("stateValue")
 * .build())
 * .cloudwatchLogs(CloudwatchLogsActionProperty.builder()
 * .logGroupName("logGroupName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .batchMode(false)
 * .build())
 * .cloudwatchMetric(CloudwatchMetricActionProperty.builder()
 * .metricName("metricName")
 * .metricNamespace("metricNamespace")
 * .metricUnit("metricUnit")
 * .metricValue("metricValue")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .metricTimestamp("metricTimestamp")
 * .build())
 * .dynamoDb(DynamoDBActionProperty.builder()
 * .hashKeyField("hashKeyField")
 * .hashKeyValue("hashKeyValue")
 * .roleArn("roleArn")
 * .tableName("tableName")
 * // the properties below are optional
 * .hashKeyType("hashKeyType")
 * .payloadField("payloadField")
 * .rangeKeyField("rangeKeyField")
 * .rangeKeyType("rangeKeyType")
 * .rangeKeyValue("rangeKeyValue")
 * .build())
 * .dynamoDBv2(DynamoDBv2ActionProperty.builder()
 * .putItem(PutItemInputProperty.builder()
 * .tableName("tableName")
 * .build())
 * .roleArn("roleArn")
 * .build())
 * .elasticsearch(ElasticsearchActionProperty.builder()
 * .endpoint("endpoint")
 * .id("id")
 * .index("index")
 * .roleArn("roleArn")
 * .type("type")
 * .build())
 * .firehose(FirehoseActionProperty.builder()
 * .deliveryStreamName("deliveryStreamName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .batchMode(false)
 * .separator("separator")
 * .build())
 * .http(HttpActionProperty.builder()
 * .url("url")
 * // the properties below are optional
 * .auth(HttpAuthorizationProperty.builder()
 * .sigv4(SigV4AuthorizationProperty.builder()
 * .roleArn("roleArn")
 * .serviceName("serviceName")
 * .signingRegion("signingRegion")
 * .build())
 * .build())
 * .confirmationUrl("confirmationUrl")
 * .headers(List.of(HttpActionHeaderProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .iotAnalytics(IotAnalyticsActionProperty.builder()
 * .channelName("channelName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .batchMode(false)
 * .build())
 * .iotEvents(IotEventsActionProperty.builder()
 * .inputName("inputName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .batchMode(false)
 * .messageId("messageId")
 * .build())
 * .iotSiteWise(IotSiteWiseActionProperty.builder()
 * .putAssetPropertyValueEntries(List.of(PutAssetPropertyValueEntryProperty.builder()
 * .propertyValues(List.of(AssetPropertyValueProperty.builder()
 * .timestamp(AssetPropertyTimestampProperty.builder()
 * .timeInSeconds("timeInSeconds")
 * // the properties below are optional
 * .offsetInNanos("offsetInNanos")
 * .build())
 * .value(AssetPropertyVariantProperty.builder()
 * .booleanValue("booleanValue")
 * .doubleValue("doubleValue")
 * .integerValue("integerValue")
 * .stringValue("stringValue")
 * .build())
 * // the properties below are optional
 * .quality("quality")
 * .build()))
 * // the properties below are optional
 * .assetId("assetId")
 * .entryId("entryId")
 * .propertyAlias("propertyAlias")
 * .propertyId("propertyId")
 * .build()))
 * .roleArn("roleArn")
 * .build())
 * .kafka(KafkaActionProperty.builder()
 * .clientProperties(Map.of(
 * "clientPropertiesKey", "clientProperties"))
 * .destinationArn("destinationArn")
 * .topic("topic")
 * // the properties below are optional
 * .headers(List.of(KafkaActionHeaderProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .key("key")
 * .partition("partition")
 * .build())
 * .kinesis(KinesisActionProperty.builder()
 * .roleArn("roleArn")
 * .streamName("streamName")
 * // the properties below are optional
 * .partitionKey("partitionKey")
 * .build())
 * .lambda(LambdaActionProperty.builder()
 * .functionArn("functionArn")
 * .build())
 * .location(LocationActionProperty.builder()
 * .deviceId("deviceId")
 * .latitude("latitude")
 * .longitude("longitude")
 * .roleArn("roleArn")
 * .trackerName("trackerName")
 * // the properties below are optional
 * .timestamp(TimestampProperty.builder()
 * .value("value")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .build())
 * .openSearch(OpenSearchActionProperty.builder()
 * .endpoint("endpoint")
 * .id("id")
 * .index("index")
 * .roleArn("roleArn")
 * .type("type")
 * .build())
 * .republish(RepublishActionProperty.builder()
 * .roleArn("roleArn")
 * .topic("topic")
 * // the properties below are optional
 * .headers(RepublishActionHeadersProperty.builder()
 * .contentType("contentType")
 * .correlationData("correlationData")
 * .messageExpiry("messageExpiry")
 * .payloadFormatIndicator("payloadFormatIndicator")
 * .responseTopic("responseTopic")
 * .userProperties(List.of(UserPropertyProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .qos(123)
 * .build())
 * .s3(S3ActionProperty.builder()
 * .bucketName("bucketName")
 * .key("key")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .cannedAcl("cannedAcl")
 * .build())
 * .sns(SnsActionProperty.builder()
 * .roleArn("roleArn")
 * .targetArn("targetArn")
 * // the properties below are optional
 * .messageFormat("messageFormat")
 * .build())
 * .sqs(SqsActionProperty.builder()
 * .queueUrl("queueUrl")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .useBase64(false)
 * .build())
 * .stepFunctions(StepFunctionsActionProperty.builder()
 * .roleArn("roleArn")
 * .stateMachineName("stateMachineName")
 * // the properties below are optional
 * .executionNamePrefix("executionNamePrefix")
 * .build())
 * .timestream(TimestreamActionProperty.builder()
 * .databaseName("databaseName")
 * .dimensions(List.of(TimestreamDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .roleArn("roleArn")
 * .tableName("tableName")
 * // the properties below are optional
 * .timestamp(TimestreamTimestampProperty.builder()
 * .unit("unit")
 * .value("value")
 * .build())
 * .build())
 * .build()))
 * .sql("sql")
 * // the properties below are optional
 * .awsIotSqlVersion("awsIotSqlVersion")
 * .description("description")
 * .errorAction(ActionProperty.builder()
 * .cloudwatchAlarm(CloudwatchAlarmActionProperty.builder()
 * .alarmName("alarmName")
 * .roleArn("roleArn")
 * .stateReason("stateReason")
 * .stateValue("stateValue")
 * .build())
 * .cloudwatchLogs(CloudwatchLogsActionProperty.builder()
 * .logGroupName("logGroupName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .batchMode(false)
 * .build())
 * .cloudwatchMetric(CloudwatchMetricActionProperty.builder()
 * .metricName("metricName")
 * .metricNamespace("metricNamespace")
 * .metricUnit("metricUnit")
 * .metricValue("metricValue")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .metricTimestamp("metricTimestamp")
 * .build())
 * .dynamoDb(DynamoDBActionProperty.builder()
 * .hashKeyField("hashKeyField")
 * .hashKeyValue("hashKeyValue")
 * .roleArn("roleArn")
 * .tableName("tableName")
 * // the properties below are optional
 * .hashKeyType("hashKeyType")
 * .payloadField("payloadField")
 * .rangeKeyField("rangeKeyField")
 * .rangeKeyType("rangeKeyType")
 * .rangeKeyValue("rangeKeyValue")
 * .build())
 * .dynamoDBv2(DynamoDBv2ActionProperty.builder()
 * .putItem(PutItemInputProperty.builder()
 * .tableName("tableName")
 * .build())
 * .roleArn("roleArn")
 * .build())
 * .elasticsearch(ElasticsearchActionProperty.builder()
 * .endpoint("endpoint")
 * .id("id")
 * .index("index")
 * .roleArn("roleArn")
 * .type("type")
 * .build())
 * .firehose(FirehoseActionProperty.builder()
 * .deliveryStreamName("deliveryStreamName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .batchMode(false)
 * .separator("separator")
 * .build())
 * .http(HttpActionProperty.builder()
 * .url("url")
 * // the properties below are optional
 * .auth(HttpAuthorizationProperty.builder()
 * .sigv4(SigV4AuthorizationProperty.builder()
 * .roleArn("roleArn")
 * .serviceName("serviceName")
 * .signingRegion("signingRegion")
 * .build())
 * .build())
 * .confirmationUrl("confirmationUrl")
 * .headers(List.of(HttpActionHeaderProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .iotAnalytics(IotAnalyticsActionProperty.builder()
 * .channelName("channelName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .batchMode(false)
 * .build())
 * .iotEvents(IotEventsActionProperty.builder()
 * .inputName("inputName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .batchMode(false)
 * .messageId("messageId")
 * .build())
 * .iotSiteWise(IotSiteWiseActionProperty.builder()
 * .putAssetPropertyValueEntries(List.of(PutAssetPropertyValueEntryProperty.builder()
 * .propertyValues(List.of(AssetPropertyValueProperty.builder()
 * .timestamp(AssetPropertyTimestampProperty.builder()
 * .timeInSeconds("timeInSeconds")
 * // the properties below are optional
 * .offsetInNanos("offsetInNanos")
 * .build())
 * .value(AssetPropertyVariantProperty.builder()
 * .booleanValue("booleanValue")
 * .doubleValue("doubleValue")
 * .integerValue("integerValue")
 * .stringValue("stringValue")
 * .build())
 * // the properties below are optional
 * .quality("quality")
 * .build()))
 * // the properties below are optional
 * .assetId("assetId")
 * .entryId("entryId")
 * .propertyAlias("propertyAlias")
 * .propertyId("propertyId")
 * .build()))
 * .roleArn("roleArn")
 * .build())
 * .kafka(KafkaActionProperty.builder()
 * .clientProperties(Map.of(
 * "clientPropertiesKey", "clientProperties"))
 * .destinationArn("destinationArn")
 * .topic("topic")
 * // the properties below are optional
 * .headers(List.of(KafkaActionHeaderProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .key("key")
 * .partition("partition")
 * .build())
 * .kinesis(KinesisActionProperty.builder()
 * .roleArn("roleArn")
 * .streamName("streamName")
 * // the properties below are optional
 * .partitionKey("partitionKey")
 * .build())
 * .lambda(LambdaActionProperty.builder()
 * .functionArn("functionArn")
 * .build())
 * .location(LocationActionProperty.builder()
 * .deviceId("deviceId")
 * .latitude("latitude")
 * .longitude("longitude")
 * .roleArn("roleArn")
 * .trackerName("trackerName")
 * // the properties below are optional
 * .timestamp(TimestampProperty.builder()
 * .value("value")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .build())
 * .openSearch(OpenSearchActionProperty.builder()
 * .endpoint("endpoint")
 * .id("id")
 * .index("index")
 * .roleArn("roleArn")
 * .type("type")
 * .build())
 * .republish(RepublishActionProperty.builder()
 * .roleArn("roleArn")
 * .topic("topic")
 * // the properties below are optional
 * .headers(RepublishActionHeadersProperty.builder()
 * .contentType("contentType")
 * .correlationData("correlationData")
 * .messageExpiry("messageExpiry")
 * .payloadFormatIndicator("payloadFormatIndicator")
 * .responseTopic("responseTopic")
 * .userProperties(List.of(UserPropertyProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .qos(123)
 * .build())
 * .s3(S3ActionProperty.builder()
 * .bucketName("bucketName")
 * .key("key")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .cannedAcl("cannedAcl")
 * .build())
 * .sns(SnsActionProperty.builder()
 * .roleArn("roleArn")
 * .targetArn("targetArn")
 * // the properties below are optional
 * .messageFormat("messageFormat")
 * .build())
 * .sqs(SqsActionProperty.builder()
 * .queueUrl("queueUrl")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .useBase64(false)
 * .build())
 * .stepFunctions(StepFunctionsActionProperty.builder()
 * .roleArn("roleArn")
 * .stateMachineName("stateMachineName")
 * // the properties below are optional
 * .executionNamePrefix("executionNamePrefix")
 * .build())
 * .timestream(TimestreamActionProperty.builder()
 * .databaseName("databaseName")
 * .dimensions(List.of(TimestreamDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .roleArn("roleArn")
 * .tableName("tableName")
 * // the properties below are optional
 * .timestamp(TimestreamTimestampProperty.builder()
 * .unit("unit")
 * .value("value")
 * .build())
 * .build())
 * .build())
 * .ruleDisabled(false)
 * .build())
 * // the properties below are optional
 * .ruleName("ruleName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html)
 */
public open class CfnTopicRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTopicRuleProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnTopicRule(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTopicRuleProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTopicRuleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTopicRuleProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the AWS IoT rule, such as
   * `arn:aws:iot:us-east-2:123456789012:rule/MyIoTRule` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the rule.
   */
  public open fun ruleName(): String? = unwrap(this).getRuleName()

  /**
   * The name of the rule.
   */
  public open fun ruleName(`value`: String) {
    unwrap(this).setRuleName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata which can be used to manage the topic rule.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata which can be used to manage the topic rule.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata which can be used to manage the topic rule.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The rule payload.
   */
  public open fun topicRulePayload(): Any = unwrap(this).getTopicRulePayload()

  /**
   * The rule payload.
   */
  public open fun topicRulePayload(`value`: IResolvable) {
    unwrap(this).setTopicRulePayload(`value`.let(IResolvable::unwrap))
  }

  /**
   * The rule payload.
   */
  public open fun topicRulePayload(`value`: TopicRulePayloadProperty) {
    unwrap(this).setTopicRulePayload(`value`.let(TopicRulePayloadProperty::unwrap))
  }

  /**
   * The rule payload.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc4cd64f48f8d034f0017e45c5bdf05dfa22a293616bbd9ae8dcd77818bf7c62")
  public open fun topicRulePayload(`value`: TopicRulePayloadProperty.Builder.() -> Unit): Unit =
      topicRulePayload(TopicRulePayloadProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnTopicRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the rule.
     *
     * *Pattern* : `[a-zA-Z0-9:_-]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-rulename)
     * @param ruleName The name of the rule. 
     */
    public fun ruleName(ruleName: String)

    /**
     * Metadata which can be used to manage the topic rule.
     *
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-tags)
     * @param tags Metadata which can be used to manage the topic rule. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata which can be used to manage the topic rule.
     *
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-tags)
     * @param tags Metadata which can be used to manage the topic rule. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The rule payload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-topicrulepayload)
     * @param topicRulePayload The rule payload. 
     */
    public fun topicRulePayload(topicRulePayload: IResolvable)

    /**
     * The rule payload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-topicrulepayload)
     * @param topicRulePayload The rule payload. 
     */
    public fun topicRulePayload(topicRulePayload: TopicRulePayloadProperty)

    /**
     * The rule payload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-topicrulepayload)
     * @param topicRulePayload The rule payload. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7dc3ff15a9ef1552dc17aebf5e85e502e2b37ca8a82238895047768f6b136511")
    public fun topicRulePayload(topicRulePayload: TopicRulePayloadProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnTopicRule.Builder =
        software.amazon.awscdk.services.iot.CfnTopicRule.Builder.create(scope, id)

    /**
     * The name of the rule.
     *
     * *Pattern* : `[a-zA-Z0-9:_-]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-rulename)
     * @param ruleName The name of the rule. 
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * Metadata which can be used to manage the topic rule.
     *
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-tags)
     * @param tags Metadata which can be used to manage the topic rule. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata which can be used to manage the topic rule.
     *
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-tags)
     * @param tags Metadata which can be used to manage the topic rule. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The rule payload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-topicrulepayload)
     * @param topicRulePayload The rule payload. 
     */
    override fun topicRulePayload(topicRulePayload: IResolvable) {
      cdkBuilder.topicRulePayload(topicRulePayload.let(IResolvable::unwrap))
    }

    /**
     * The rule payload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-topicrulepayload)
     * @param topicRulePayload The rule payload. 
     */
    override fun topicRulePayload(topicRulePayload: TopicRulePayloadProperty) {
      cdkBuilder.topicRulePayload(topicRulePayload.let(TopicRulePayloadProperty::unwrap))
    }

    /**
     * The rule payload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-topicrulepayload)
     * @param topicRulePayload The rule payload. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7dc3ff15a9ef1552dc17aebf5e85e502e2b37ca8a82238895047768f6b136511")
    override fun topicRulePayload(topicRulePayload: TopicRulePayloadProperty.Builder.() -> Unit):
        Unit = topicRulePayload(TopicRulePayloadProperty(topicRulePayload))

    public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnTopicRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTopicRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTopicRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule): CfnTopicRule =
        CfnTopicRule(cdkObject)

    internal fun unwrap(wrapped: CfnTopicRule): software.amazon.awscdk.services.iot.CfnTopicRule =
        wrapped.cdkObject
  }

  /**
   * Metadata attributes of the time series that are written in each measure record.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * TimestreamDimensionProperty timestreamDimensionProperty = TimestreamDimensionProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamdimension.html)
   */
  public interface TimestreamDimensionProperty {
    /**
     * The metadata dimension name.
     *
     * This is the name of the column in the Amazon Timestream database table record.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamdimension.html#cfn-iot-topicrule-timestreamdimension-name)
     */
    public fun name(): String

    /**
     * The value to write in this column of the database record.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamdimension.html#cfn-iot-topicrule-timestreamdimension-value)
     */
    public fun `value`(): String

    /**
     * A builder for [TimestreamDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The metadata dimension name. 
       * This is the name of the column in the Amazon Timestream database table record.
       */
      public fun name(name: String)

      /**
       * @param value The value to write in this column of the database record. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty.builder()

      /**
       * @param name The metadata dimension name. 
       * This is the name of the column in the Amazon Timestream database table record.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value to write in this column of the database record. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty,
    ) : CdkObject(cdkObject), TimestreamDimensionProperty {
      /**
       * The metadata dimension name.
       *
       * This is the name of the column in the Amazon Timestream database table record.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamdimension.html#cfn-iot-topicrule-timestreamdimension-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The value to write in this column of the database record.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamdimension.html#cfn-iot-topicrule-timestreamdimension-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimestreamDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty):
          TimestreamDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TimestreamDimensionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestreamDimensionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamDimensionProperty
    }
  }

  /**
   * Specifies a Kafka header using key-value pairs when you create a Rule’s Kafka Action.
   *
   * You can use these headers to route data from IoT clients to downstream Kafka clusters without
   * modifying your message payload.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * KafkaActionHeaderProperty kafkaActionHeaderProperty = KafkaActionHeaderProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaactionheader.html)
   */
  public interface KafkaActionHeaderProperty {
    /**
     * The key of the Kafka header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaactionheader.html#cfn-iot-topicrule-kafkaactionheader-key)
     */
    public fun key(): String

    /**
     * The value of the Kafka header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaactionheader.html#cfn-iot-topicrule-kafkaactionheader-value)
     */
    public fun `value`(): String

    /**
     * A builder for [KafkaActionHeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key of the Kafka header. 
       */
      public fun key(key: String)

      /**
       * @param value The value of the Kafka header. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty.builder()

      /**
       * @param key The key of the Kafka header. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of the Kafka header. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty,
    ) : CdkObject(cdkObject), KafkaActionHeaderProperty {
      /**
       * The key of the Kafka header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaactionheader.html#cfn-iot-topicrule-kafkaactionheader-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value of the Kafka header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaactionheader.html#cfn-iot-topicrule-kafkaactionheader-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KafkaActionHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty):
          KafkaActionHeaderProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KafkaActionHeaderProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaActionHeaderProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionHeaderProperty
    }
  }

  /**
   * Describes the actions associated with a rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * ActionProperty actionProperty = ActionProperty.builder()
   * .cloudwatchAlarm(CloudwatchAlarmActionProperty.builder()
   * .alarmName("alarmName")
   * .roleArn("roleArn")
   * .stateReason("stateReason")
   * .stateValue("stateValue")
   * .build())
   * .cloudwatchLogs(CloudwatchLogsActionProperty.builder()
   * .logGroupName("logGroupName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .batchMode(false)
   * .build())
   * .cloudwatchMetric(CloudwatchMetricActionProperty.builder()
   * .metricName("metricName")
   * .metricNamespace("metricNamespace")
   * .metricUnit("metricUnit")
   * .metricValue("metricValue")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .metricTimestamp("metricTimestamp")
   * .build())
   * .dynamoDb(DynamoDBActionProperty.builder()
   * .hashKeyField("hashKeyField")
   * .hashKeyValue("hashKeyValue")
   * .roleArn("roleArn")
   * .tableName("tableName")
   * // the properties below are optional
   * .hashKeyType("hashKeyType")
   * .payloadField("payloadField")
   * .rangeKeyField("rangeKeyField")
   * .rangeKeyType("rangeKeyType")
   * .rangeKeyValue("rangeKeyValue")
   * .build())
   * .dynamoDBv2(DynamoDBv2ActionProperty.builder()
   * .putItem(PutItemInputProperty.builder()
   * .tableName("tableName")
   * .build())
   * .roleArn("roleArn")
   * .build())
   * .elasticsearch(ElasticsearchActionProperty.builder()
   * .endpoint("endpoint")
   * .id("id")
   * .index("index")
   * .roleArn("roleArn")
   * .type("type")
   * .build())
   * .firehose(FirehoseActionProperty.builder()
   * .deliveryStreamName("deliveryStreamName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .batchMode(false)
   * .separator("separator")
   * .build())
   * .http(HttpActionProperty.builder()
   * .url("url")
   * // the properties below are optional
   * .auth(HttpAuthorizationProperty.builder()
   * .sigv4(SigV4AuthorizationProperty.builder()
   * .roleArn("roleArn")
   * .serviceName("serviceName")
   * .signingRegion("signingRegion")
   * .build())
   * .build())
   * .confirmationUrl("confirmationUrl")
   * .headers(List.of(HttpActionHeaderProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build())
   * .iotAnalytics(IotAnalyticsActionProperty.builder()
   * .channelName("channelName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .batchMode(false)
   * .build())
   * .iotEvents(IotEventsActionProperty.builder()
   * .inputName("inputName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .batchMode(false)
   * .messageId("messageId")
   * .build())
   * .iotSiteWise(IotSiteWiseActionProperty.builder()
   * .putAssetPropertyValueEntries(List.of(PutAssetPropertyValueEntryProperty.builder()
   * .propertyValues(List.of(AssetPropertyValueProperty.builder()
   * .timestamp(AssetPropertyTimestampProperty.builder()
   * .timeInSeconds("timeInSeconds")
   * // the properties below are optional
   * .offsetInNanos("offsetInNanos")
   * .build())
   * .value(AssetPropertyVariantProperty.builder()
   * .booleanValue("booleanValue")
   * .doubleValue("doubleValue")
   * .integerValue("integerValue")
   * .stringValue("stringValue")
   * .build())
   * // the properties below are optional
   * .quality("quality")
   * .build()))
   * // the properties below are optional
   * .assetId("assetId")
   * .entryId("entryId")
   * .propertyAlias("propertyAlias")
   * .propertyId("propertyId")
   * .build()))
   * .roleArn("roleArn")
   * .build())
   * .kafka(KafkaActionProperty.builder()
   * .clientProperties(Map.of(
   * "clientPropertiesKey", "clientProperties"))
   * .destinationArn("destinationArn")
   * .topic("topic")
   * // the properties below are optional
   * .headers(List.of(KafkaActionHeaderProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .key("key")
   * .partition("partition")
   * .build())
   * .kinesis(KinesisActionProperty.builder()
   * .roleArn("roleArn")
   * .streamName("streamName")
   * // the properties below are optional
   * .partitionKey("partitionKey")
   * .build())
   * .lambda(LambdaActionProperty.builder()
   * .functionArn("functionArn")
   * .build())
   * .location(LocationActionProperty.builder()
   * .deviceId("deviceId")
   * .latitude("latitude")
   * .longitude("longitude")
   * .roleArn("roleArn")
   * .trackerName("trackerName")
   * // the properties below are optional
   * .timestamp(TimestampProperty.builder()
   * .value("value")
   * // the properties below are optional
   * .unit("unit")
   * .build())
   * .build())
   * .openSearch(OpenSearchActionProperty.builder()
   * .endpoint("endpoint")
   * .id("id")
   * .index("index")
   * .roleArn("roleArn")
   * .type("type")
   * .build())
   * .republish(RepublishActionProperty.builder()
   * .roleArn("roleArn")
   * .topic("topic")
   * // the properties below are optional
   * .headers(RepublishActionHeadersProperty.builder()
   * .contentType("contentType")
   * .correlationData("correlationData")
   * .messageExpiry("messageExpiry")
   * .payloadFormatIndicator("payloadFormatIndicator")
   * .responseTopic("responseTopic")
   * .userProperties(List.of(UserPropertyProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build())
   * .qos(123)
   * .build())
   * .s3(S3ActionProperty.builder()
   * .bucketName("bucketName")
   * .key("key")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .cannedAcl("cannedAcl")
   * .build())
   * .sns(SnsActionProperty.builder()
   * .roleArn("roleArn")
   * .targetArn("targetArn")
   * // the properties below are optional
   * .messageFormat("messageFormat")
   * .build())
   * .sqs(SqsActionProperty.builder()
   * .queueUrl("queueUrl")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .useBase64(false)
   * .build())
   * .stepFunctions(StepFunctionsActionProperty.builder()
   * .roleArn("roleArn")
   * .stateMachineName("stateMachineName")
   * // the properties below are optional
   * .executionNamePrefix("executionNamePrefix")
   * .build())
   * .timestream(TimestreamActionProperty.builder()
   * .databaseName("databaseName")
   * .dimensions(List.of(TimestreamDimensionProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .roleArn("roleArn")
   * .tableName("tableName")
   * // the properties below are optional
   * .timestamp(TimestreamTimestampProperty.builder()
   * .unit("unit")
   * .value("value")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html)
   */
  public interface ActionProperty {
    /**
     * Change the state of a CloudWatch alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-cloudwatchalarm)
     */
    public fun cloudwatchAlarm(): Any? = unwrap(this).getCloudwatchAlarm()

    /**
     * Sends data to CloudWatch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-cloudwatchlogs)
     */
    public fun cloudwatchLogs(): Any? = unwrap(this).getCloudwatchLogs()

    /**
     * Capture a CloudWatch metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-cloudwatchmetric)
     */
    public fun cloudwatchMetric(): Any? = unwrap(this).getCloudwatchMetric()

    /**
     * Write to a DynamoDB table.
     *
     * This is a new version of the DynamoDB action. It allows you to write each attribute in an
     * MQTT message payload into a separate DynamoDB column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-dynamodbv2)
     */
    public fun dynamoDBv2(): Any? = unwrap(this).getDynamoDBv2()

    /**
     * Write to a DynamoDB table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-dynamodb)
     */
    public fun dynamoDb(): Any? = unwrap(this).getDynamoDb()

    /**
     * Write data to an Amazon OpenSearch Service domain.
     *
     *
     * The `Elasticsearch` action can only be used by existing rule actions. To create a new rule
     * action or to update an existing rule action, use the `OpenSearch` rule action instead. For more
     * information, see
     * [OpenSearchAction](https://docs.aws.amazon.com//iot/latest/apireference/API_OpenSearchAction.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-elasticsearch)
     */
    public fun elasticsearch(): Any? = unwrap(this).getElasticsearch()

    /**
     * Write to an Amazon Kinesis Firehose stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-firehose)
     */
    public fun firehose(): Any? = unwrap(this).getFirehose()

    /**
     * Send data to an HTTPS endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-http)
     */
    public fun http(): Any? = unwrap(this).getHttp()

    /**
     * Sends message data to an AWS IoT Analytics channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-iotanalytics)
     */
    public fun iotAnalytics(): Any? = unwrap(this).getIotAnalytics()

    /**
     * Sends an input to an AWS IoT Events detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-iotevents)
     */
    public fun iotEvents(): Any? = unwrap(this).getIotEvents()

    /**
     * Sends data from the MQTT message that triggered the rule to AWS IoT SiteWise asset
     * properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-iotsitewise)
     */
    public fun iotSiteWise(): Any? = unwrap(this).getIotSiteWise()

    /**
     * Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or self-managed
     * Apache Kafka cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-kafka)
     */
    public fun kafka(): Any? = unwrap(this).getKafka()

    /**
     * Write data to an Amazon Kinesis stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-kinesis)
     */
    public fun kinesis(): Any? = unwrap(this).getKinesis()

    /**
     * Invoke a Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-lambda)
     */
    public fun lambda(): Any? = unwrap(this).getLambda()

    /**
     * Sends device location data to [Amazon Location
     * Service](https://docs.aws.amazon.com//location/latest/developerguide/welcome.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-location)
     */
    public fun location(): Any? = unwrap(this).getLocation()

    /**
     * Write data to an Amazon OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-opensearch)
     */
    public fun openSearch(): Any? = unwrap(this).getOpenSearch()

    /**
     * Publish to another MQTT topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-republish)
     */
    public fun republish(): Any? = unwrap(this).getRepublish()

    /**
     * Write to an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * Publish to an Amazon SNS topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-sns)
     */
    public fun sns(): Any? = unwrap(this).getSns()

    /**
     * Publish to an Amazon SQS queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-sqs)
     */
    public fun sqs(): Any? = unwrap(this).getSqs()

    /**
     * Starts execution of a Step Functions state machine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-stepfunctions)
     */
    public fun stepFunctions(): Any? = unwrap(this).getStepFunctions()

    /**
     * Writes attributes from an MQTT message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-timestream)
     */
    public fun timestream(): Any? = unwrap(this).getTimestream()

    /**
     * A builder for [ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudwatchAlarm Change the state of a CloudWatch alarm.
       */
      public fun cloudwatchAlarm(cloudwatchAlarm: IResolvable)

      /**
       * @param cloudwatchAlarm Change the state of a CloudWatch alarm.
       */
      public fun cloudwatchAlarm(cloudwatchAlarm: CloudwatchAlarmActionProperty)

      /**
       * @param cloudwatchAlarm Change the state of a CloudWatch alarm.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e592d3b9ec58e1e6a0c9604f03fce76e7192a5c832a56e0e896e5aeb025c5136")
      public fun cloudwatchAlarm(cloudwatchAlarm: CloudwatchAlarmActionProperty.Builder.() -> Unit)

      /**
       * @param cloudwatchLogs Sends data to CloudWatch.
       */
      public fun cloudwatchLogs(cloudwatchLogs: IResolvable)

      /**
       * @param cloudwatchLogs Sends data to CloudWatch.
       */
      public fun cloudwatchLogs(cloudwatchLogs: CloudwatchLogsActionProperty)

      /**
       * @param cloudwatchLogs Sends data to CloudWatch.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37203c2772fa460a8ea92b7903e38c1647bc9fcbe895603b7eb3a2a0c43dfa79")
      public fun cloudwatchLogs(cloudwatchLogs: CloudwatchLogsActionProperty.Builder.() -> Unit)

      /**
       * @param cloudwatchMetric Capture a CloudWatch metric.
       */
      public fun cloudwatchMetric(cloudwatchMetric: IResolvable)

      /**
       * @param cloudwatchMetric Capture a CloudWatch metric.
       */
      public fun cloudwatchMetric(cloudwatchMetric: CloudwatchMetricActionProperty)

      /**
       * @param cloudwatchMetric Capture a CloudWatch metric.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7cfa986986a53792b0900a5171b0568c06d1edd655a035e2f19aad202470c2a")
      public
          fun cloudwatchMetric(cloudwatchMetric: CloudwatchMetricActionProperty.Builder.() -> Unit)

      /**
       * @param dynamoDBv2 Write to a DynamoDB table.
       * This is a new version of the DynamoDB action. It allows you to write each attribute in an
       * MQTT message payload into a separate DynamoDB column.
       */
      public fun dynamoDBv2(dynamoDBv2: IResolvable)

      /**
       * @param dynamoDBv2 Write to a DynamoDB table.
       * This is a new version of the DynamoDB action. It allows you to write each attribute in an
       * MQTT message payload into a separate DynamoDB column.
       */
      public fun dynamoDBv2(dynamoDBv2: DynamoDBv2ActionProperty)

      /**
       * @param dynamoDBv2 Write to a DynamoDB table.
       * This is a new version of the DynamoDB action. It allows you to write each attribute in an
       * MQTT message payload into a separate DynamoDB column.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59e5c496cd867f4091324ec238030b2fb9ec9fc654ed368a653fc003d437c9a5")
      public fun dynamoDBv2(dynamoDBv2: DynamoDBv2ActionProperty.Builder.() -> Unit)

      /**
       * @param dynamoDb Write to a DynamoDB table.
       */
      public fun dynamoDb(dynamoDb: IResolvable)

      /**
       * @param dynamoDb Write to a DynamoDB table.
       */
      public fun dynamoDb(dynamoDb: DynamoDBActionProperty)

      /**
       * @param dynamoDb Write to a DynamoDB table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5be34cb6b6922328cc7edc8d1c4eebff91fc9f9fd2b7cb01f0f79d390cc9ce5")
      public fun dynamoDb(dynamoDb: DynamoDBActionProperty.Builder.() -> Unit)

      /**
       * @param elasticsearch Write data to an Amazon OpenSearch Service domain.
       *
       * The `Elasticsearch` action can only be used by existing rule actions. To create a new rule
       * action or to update an existing rule action, use the `OpenSearch` rule action instead. For
       * more information, see
       * [OpenSearchAction](https://docs.aws.amazon.com//iot/latest/apireference/API_OpenSearchAction.html)
       * .
       */
      public fun elasticsearch(elasticsearch: IResolvable)

      /**
       * @param elasticsearch Write data to an Amazon OpenSearch Service domain.
       *
       * The `Elasticsearch` action can only be used by existing rule actions. To create a new rule
       * action or to update an existing rule action, use the `OpenSearch` rule action instead. For
       * more information, see
       * [OpenSearchAction](https://docs.aws.amazon.com//iot/latest/apireference/API_OpenSearchAction.html)
       * .
       */
      public fun elasticsearch(elasticsearch: ElasticsearchActionProperty)

      /**
       * @param elasticsearch Write data to an Amazon OpenSearch Service domain.
       *
       * The `Elasticsearch` action can only be used by existing rule actions. To create a new rule
       * action or to update an existing rule action, use the `OpenSearch` rule action instead. For
       * more information, see
       * [OpenSearchAction](https://docs.aws.amazon.com//iot/latest/apireference/API_OpenSearchAction.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa7cc1ae368a49a852adba0360258b23811f6fedded9a3d4748262f4eb4bfd3f")
      public fun elasticsearch(elasticsearch: ElasticsearchActionProperty.Builder.() -> Unit)

      /**
       * @param firehose Write to an Amazon Kinesis Firehose stream.
       */
      public fun firehose(firehose: IResolvable)

      /**
       * @param firehose Write to an Amazon Kinesis Firehose stream.
       */
      public fun firehose(firehose: FirehoseActionProperty)

      /**
       * @param firehose Write to an Amazon Kinesis Firehose stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf0e7fd3ce39622fd99c5ea349382388654df4b23aa29717914502b8f97096c5")
      public fun firehose(firehose: FirehoseActionProperty.Builder.() -> Unit)

      /**
       * @param http Send data to an HTTPS endpoint.
       */
      public fun http(http: IResolvable)

      /**
       * @param http Send data to an HTTPS endpoint.
       */
      public fun http(http: HttpActionProperty)

      /**
       * @param http Send data to an HTTPS endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdd0498a7b686ba06564c740ce89e23f940a59ace7c38c049d76591918aadf43")
      public fun http(http: HttpActionProperty.Builder.() -> Unit)

      /**
       * @param iotAnalytics Sends message data to an AWS IoT Analytics channel.
       */
      public fun iotAnalytics(iotAnalytics: IResolvable)

      /**
       * @param iotAnalytics Sends message data to an AWS IoT Analytics channel.
       */
      public fun iotAnalytics(iotAnalytics: IotAnalyticsActionProperty)

      /**
       * @param iotAnalytics Sends message data to an AWS IoT Analytics channel.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("457c63ef720d0825a43120a82e6d8743fa21e8392302a073ddf53384a50201f7")
      public fun iotAnalytics(iotAnalytics: IotAnalyticsActionProperty.Builder.() -> Unit)

      /**
       * @param iotEvents Sends an input to an AWS IoT Events detector.
       */
      public fun iotEvents(iotEvents: IResolvable)

      /**
       * @param iotEvents Sends an input to an AWS IoT Events detector.
       */
      public fun iotEvents(iotEvents: IotEventsActionProperty)

      /**
       * @param iotEvents Sends an input to an AWS IoT Events detector.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a42cc3ccec03511269f99cb9dc4b2de9d9669b9ca612f5d231c217cdc01d770")
      public fun iotEvents(iotEvents: IotEventsActionProperty.Builder.() -> Unit)

      /**
       * @param iotSiteWise Sends data from the MQTT message that triggered the rule to AWS IoT
       * SiteWise asset properties.
       */
      public fun iotSiteWise(iotSiteWise: IResolvable)

      /**
       * @param iotSiteWise Sends data from the MQTT message that triggered the rule to AWS IoT
       * SiteWise asset properties.
       */
      public fun iotSiteWise(iotSiteWise: IotSiteWiseActionProperty)

      /**
       * @param iotSiteWise Sends data from the MQTT message that triggered the rule to AWS IoT
       * SiteWise asset properties.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c67675f0ded26c01b390afff37e4fbbe386d71d0bc05069dfe0909718ff796b")
      public fun iotSiteWise(iotSiteWise: IotSiteWiseActionProperty.Builder.() -> Unit)

      /**
       * @param kafka Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or
       * self-managed Apache Kafka cluster.
       */
      public fun kafka(kafka: IResolvable)

      /**
       * @param kafka Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or
       * self-managed Apache Kafka cluster.
       */
      public fun kafka(kafka: KafkaActionProperty)

      /**
       * @param kafka Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or
       * self-managed Apache Kafka cluster.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95bd0041398399948a6a91cc4beb5c27a2b10c383f2ccc058316107110812a17")
      public fun kafka(kafka: KafkaActionProperty.Builder.() -> Unit)

      /**
       * @param kinesis Write data to an Amazon Kinesis stream.
       */
      public fun kinesis(kinesis: IResolvable)

      /**
       * @param kinesis Write data to an Amazon Kinesis stream.
       */
      public fun kinesis(kinesis: KinesisActionProperty)

      /**
       * @param kinesis Write data to an Amazon Kinesis stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7829c2788742161736c7f4f276d2c9ca4a8eb7adc4f0983c9b15a000b1af250e")
      public fun kinesis(kinesis: KinesisActionProperty.Builder.() -> Unit)

      /**
       * @param lambda Invoke a Lambda function.
       */
      public fun lambda(lambda: IResolvable)

      /**
       * @param lambda Invoke a Lambda function.
       */
      public fun lambda(lambda: LambdaActionProperty)

      /**
       * @param lambda Invoke a Lambda function.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cb07553eb70f94d4d0741a88ca3bf21fbdb63c177f55b6d47112f90ea9de592")
      public fun lambda(lambda: LambdaActionProperty.Builder.() -> Unit)

      /**
       * @param location Sends device location data to [Amazon Location
       * Service](https://docs.aws.amazon.com//location/latest/developerguide/welcome.html) .
       */
      public fun location(location: IResolvable)

      /**
       * @param location Sends device location data to [Amazon Location
       * Service](https://docs.aws.amazon.com//location/latest/developerguide/welcome.html) .
       */
      public fun location(location: LocationActionProperty)

      /**
       * @param location Sends device location data to [Amazon Location
       * Service](https://docs.aws.amazon.com//location/latest/developerguide/welcome.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40860c30d9f2428b1ebab0ef4f21b8fc9a5b0ad8ed070f880cc170ac5e542dcc")
      public fun location(location: LocationActionProperty.Builder.() -> Unit)

      /**
       * @param openSearch Write data to an Amazon OpenSearch Service domain.
       */
      public fun openSearch(openSearch: IResolvable)

      /**
       * @param openSearch Write data to an Amazon OpenSearch Service domain.
       */
      public fun openSearch(openSearch: OpenSearchActionProperty)

      /**
       * @param openSearch Write data to an Amazon OpenSearch Service domain.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ff32f288dfb924554d6db1aacfcaa2e6b841f8bceae2eb25250c046ba5a2bcd0")
      public fun openSearch(openSearch: OpenSearchActionProperty.Builder.() -> Unit)

      /**
       * @param republish Publish to another MQTT topic.
       */
      public fun republish(republish: IResolvable)

      /**
       * @param republish Publish to another MQTT topic.
       */
      public fun republish(republish: RepublishActionProperty)

      /**
       * @param republish Publish to another MQTT topic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cff4c9f4f165e6ebf8a1d92707200697b7936100cf640c266bfed5c64224cbc7")
      public fun republish(republish: RepublishActionProperty.Builder.() -> Unit)

      /**
       * @param s3 Write to an Amazon S3 bucket.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Write to an Amazon S3 bucket.
       */
      public fun s3(s3: S3ActionProperty)

      /**
       * @param s3 Write to an Amazon S3 bucket.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("070c5e2e998b45e02dc2bc514fafd0dce57030732a785f0655bf84f88530e751")
      public fun s3(s3: S3ActionProperty.Builder.() -> Unit)

      /**
       * @param sns Publish to an Amazon SNS topic.
       */
      public fun sns(sns: IResolvable)

      /**
       * @param sns Publish to an Amazon SNS topic.
       */
      public fun sns(sns: SnsActionProperty)

      /**
       * @param sns Publish to an Amazon SNS topic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e336860db8f9171bd843c395083b15e06f348ab6ee03e7aadbb37d2b1f5c7c50")
      public fun sns(sns: SnsActionProperty.Builder.() -> Unit)

      /**
       * @param sqs Publish to an Amazon SQS queue.
       */
      public fun sqs(sqs: IResolvable)

      /**
       * @param sqs Publish to an Amazon SQS queue.
       */
      public fun sqs(sqs: SqsActionProperty)

      /**
       * @param sqs Publish to an Amazon SQS queue.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57ea076cdbbf86399719493cb0eaff62871072cc1f057effda768eae4871d465")
      public fun sqs(sqs: SqsActionProperty.Builder.() -> Unit)

      /**
       * @param stepFunctions Starts execution of a Step Functions state machine.
       */
      public fun stepFunctions(stepFunctions: IResolvable)

      /**
       * @param stepFunctions Starts execution of a Step Functions state machine.
       */
      public fun stepFunctions(stepFunctions: StepFunctionsActionProperty)

      /**
       * @param stepFunctions Starts execution of a Step Functions state machine.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("661d098ed0c8cb1e4cc86437072deacf3e3c1f01ef261b1d6f2b9cab7d110c3a")
      public fun stepFunctions(stepFunctions: StepFunctionsActionProperty.Builder.() -> Unit)

      /**
       * @param timestream Writes attributes from an MQTT message.
       */
      public fun timestream(timestream: IResolvable)

      /**
       * @param timestream Writes attributes from an MQTT message.
       */
      public fun timestream(timestream: TimestreamActionProperty)

      /**
       * @param timestream Writes attributes from an MQTT message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4706a162d3bb7a739fa4cf959252e7009c2f91e0d18e6ea13b7c4f1d153f8a83")
      public fun timestream(timestream: TimestreamActionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty.builder()

      /**
       * @param cloudwatchAlarm Change the state of a CloudWatch alarm.
       */
      override fun cloudwatchAlarm(cloudwatchAlarm: IResolvable) {
        cdkBuilder.cloudwatchAlarm(cloudwatchAlarm.let(IResolvable::unwrap))
      }

      /**
       * @param cloudwatchAlarm Change the state of a CloudWatch alarm.
       */
      override fun cloudwatchAlarm(cloudwatchAlarm: CloudwatchAlarmActionProperty) {
        cdkBuilder.cloudwatchAlarm(cloudwatchAlarm.let(CloudwatchAlarmActionProperty::unwrap))
      }

      /**
       * @param cloudwatchAlarm Change the state of a CloudWatch alarm.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e592d3b9ec58e1e6a0c9604f03fce76e7192a5c832a56e0e896e5aeb025c5136")
      override
          fun cloudwatchAlarm(cloudwatchAlarm: CloudwatchAlarmActionProperty.Builder.() -> Unit):
          Unit = cloudwatchAlarm(CloudwatchAlarmActionProperty(cloudwatchAlarm))

      /**
       * @param cloudwatchLogs Sends data to CloudWatch.
       */
      override fun cloudwatchLogs(cloudwatchLogs: IResolvable) {
        cdkBuilder.cloudwatchLogs(cloudwatchLogs.let(IResolvable::unwrap))
      }

      /**
       * @param cloudwatchLogs Sends data to CloudWatch.
       */
      override fun cloudwatchLogs(cloudwatchLogs: CloudwatchLogsActionProperty) {
        cdkBuilder.cloudwatchLogs(cloudwatchLogs.let(CloudwatchLogsActionProperty::unwrap))
      }

      /**
       * @param cloudwatchLogs Sends data to CloudWatch.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37203c2772fa460a8ea92b7903e38c1647bc9fcbe895603b7eb3a2a0c43dfa79")
      override fun cloudwatchLogs(cloudwatchLogs: CloudwatchLogsActionProperty.Builder.() -> Unit):
          Unit = cloudwatchLogs(CloudwatchLogsActionProperty(cloudwatchLogs))

      /**
       * @param cloudwatchMetric Capture a CloudWatch metric.
       */
      override fun cloudwatchMetric(cloudwatchMetric: IResolvable) {
        cdkBuilder.cloudwatchMetric(cloudwatchMetric.let(IResolvable::unwrap))
      }

      /**
       * @param cloudwatchMetric Capture a CloudWatch metric.
       */
      override fun cloudwatchMetric(cloudwatchMetric: CloudwatchMetricActionProperty) {
        cdkBuilder.cloudwatchMetric(cloudwatchMetric.let(CloudwatchMetricActionProperty::unwrap))
      }

      /**
       * @param cloudwatchMetric Capture a CloudWatch metric.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a7cfa986986a53792b0900a5171b0568c06d1edd655a035e2f19aad202470c2a")
      override
          fun cloudwatchMetric(cloudwatchMetric: CloudwatchMetricActionProperty.Builder.() -> Unit):
          Unit = cloudwatchMetric(CloudwatchMetricActionProperty(cloudwatchMetric))

      /**
       * @param dynamoDBv2 Write to a DynamoDB table.
       * This is a new version of the DynamoDB action. It allows you to write each attribute in an
       * MQTT message payload into a separate DynamoDB column.
       */
      override fun dynamoDBv2(dynamoDBv2: IResolvable) {
        cdkBuilder.dynamoDBv2(dynamoDBv2.let(IResolvable::unwrap))
      }

      /**
       * @param dynamoDBv2 Write to a DynamoDB table.
       * This is a new version of the DynamoDB action. It allows you to write each attribute in an
       * MQTT message payload into a separate DynamoDB column.
       */
      override fun dynamoDBv2(dynamoDBv2: DynamoDBv2ActionProperty) {
        cdkBuilder.dynamoDBv2(dynamoDBv2.let(DynamoDBv2ActionProperty::unwrap))
      }

      /**
       * @param dynamoDBv2 Write to a DynamoDB table.
       * This is a new version of the DynamoDB action. It allows you to write each attribute in an
       * MQTT message payload into a separate DynamoDB column.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59e5c496cd867f4091324ec238030b2fb9ec9fc654ed368a653fc003d437c9a5")
      override fun dynamoDBv2(dynamoDBv2: DynamoDBv2ActionProperty.Builder.() -> Unit): Unit =
          dynamoDBv2(DynamoDBv2ActionProperty(dynamoDBv2))

      /**
       * @param dynamoDb Write to a DynamoDB table.
       */
      override fun dynamoDb(dynamoDb: IResolvable) {
        cdkBuilder.dynamoDb(dynamoDb.let(IResolvable::unwrap))
      }

      /**
       * @param dynamoDb Write to a DynamoDB table.
       */
      override fun dynamoDb(dynamoDb: DynamoDBActionProperty) {
        cdkBuilder.dynamoDb(dynamoDb.let(DynamoDBActionProperty::unwrap))
      }

      /**
       * @param dynamoDb Write to a DynamoDB table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5be34cb6b6922328cc7edc8d1c4eebff91fc9f9fd2b7cb01f0f79d390cc9ce5")
      override fun dynamoDb(dynamoDb: DynamoDBActionProperty.Builder.() -> Unit): Unit =
          dynamoDb(DynamoDBActionProperty(dynamoDb))

      /**
       * @param elasticsearch Write data to an Amazon OpenSearch Service domain.
       *
       * The `Elasticsearch` action can only be used by existing rule actions. To create a new rule
       * action or to update an existing rule action, use the `OpenSearch` rule action instead. For
       * more information, see
       * [OpenSearchAction](https://docs.aws.amazon.com//iot/latest/apireference/API_OpenSearchAction.html)
       * .
       */
      override fun elasticsearch(elasticsearch: IResolvable) {
        cdkBuilder.elasticsearch(elasticsearch.let(IResolvable::unwrap))
      }

      /**
       * @param elasticsearch Write data to an Amazon OpenSearch Service domain.
       *
       * The `Elasticsearch` action can only be used by existing rule actions. To create a new rule
       * action or to update an existing rule action, use the `OpenSearch` rule action instead. For
       * more information, see
       * [OpenSearchAction](https://docs.aws.amazon.com//iot/latest/apireference/API_OpenSearchAction.html)
       * .
       */
      override fun elasticsearch(elasticsearch: ElasticsearchActionProperty) {
        cdkBuilder.elasticsearch(elasticsearch.let(ElasticsearchActionProperty::unwrap))
      }

      /**
       * @param elasticsearch Write data to an Amazon OpenSearch Service domain.
       *
       * The `Elasticsearch` action can only be used by existing rule actions. To create a new rule
       * action or to update an existing rule action, use the `OpenSearch` rule action instead. For
       * more information, see
       * [OpenSearchAction](https://docs.aws.amazon.com//iot/latest/apireference/API_OpenSearchAction.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa7cc1ae368a49a852adba0360258b23811f6fedded9a3d4748262f4eb4bfd3f")
      override fun elasticsearch(elasticsearch: ElasticsearchActionProperty.Builder.() -> Unit):
          Unit = elasticsearch(ElasticsearchActionProperty(elasticsearch))

      /**
       * @param firehose Write to an Amazon Kinesis Firehose stream.
       */
      override fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose.let(IResolvable::unwrap))
      }

      /**
       * @param firehose Write to an Amazon Kinesis Firehose stream.
       */
      override fun firehose(firehose: FirehoseActionProperty) {
        cdkBuilder.firehose(firehose.let(FirehoseActionProperty::unwrap))
      }

      /**
       * @param firehose Write to an Amazon Kinesis Firehose stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf0e7fd3ce39622fd99c5ea349382388654df4b23aa29717914502b8f97096c5")
      override fun firehose(firehose: FirehoseActionProperty.Builder.() -> Unit): Unit =
          firehose(FirehoseActionProperty(firehose))

      /**
       * @param http Send data to an HTTPS endpoint.
       */
      override fun http(http: IResolvable) {
        cdkBuilder.http(http.let(IResolvable::unwrap))
      }

      /**
       * @param http Send data to an HTTPS endpoint.
       */
      override fun http(http: HttpActionProperty) {
        cdkBuilder.http(http.let(HttpActionProperty::unwrap))
      }

      /**
       * @param http Send data to an HTTPS endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdd0498a7b686ba06564c740ce89e23f940a59ace7c38c049d76591918aadf43")
      override fun http(http: HttpActionProperty.Builder.() -> Unit): Unit =
          http(HttpActionProperty(http))

      /**
       * @param iotAnalytics Sends message data to an AWS IoT Analytics channel.
       */
      override fun iotAnalytics(iotAnalytics: IResolvable) {
        cdkBuilder.iotAnalytics(iotAnalytics.let(IResolvable::unwrap))
      }

      /**
       * @param iotAnalytics Sends message data to an AWS IoT Analytics channel.
       */
      override fun iotAnalytics(iotAnalytics: IotAnalyticsActionProperty) {
        cdkBuilder.iotAnalytics(iotAnalytics.let(IotAnalyticsActionProperty::unwrap))
      }

      /**
       * @param iotAnalytics Sends message data to an AWS IoT Analytics channel.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("457c63ef720d0825a43120a82e6d8743fa21e8392302a073ddf53384a50201f7")
      override fun iotAnalytics(iotAnalytics: IotAnalyticsActionProperty.Builder.() -> Unit): Unit =
          iotAnalytics(IotAnalyticsActionProperty(iotAnalytics))

      /**
       * @param iotEvents Sends an input to an AWS IoT Events detector.
       */
      override fun iotEvents(iotEvents: IResolvable) {
        cdkBuilder.iotEvents(iotEvents.let(IResolvable::unwrap))
      }

      /**
       * @param iotEvents Sends an input to an AWS IoT Events detector.
       */
      override fun iotEvents(iotEvents: IotEventsActionProperty) {
        cdkBuilder.iotEvents(iotEvents.let(IotEventsActionProperty::unwrap))
      }

      /**
       * @param iotEvents Sends an input to an AWS IoT Events detector.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a42cc3ccec03511269f99cb9dc4b2de9d9669b9ca612f5d231c217cdc01d770")
      override fun iotEvents(iotEvents: IotEventsActionProperty.Builder.() -> Unit): Unit =
          iotEvents(IotEventsActionProperty(iotEvents))

      /**
       * @param iotSiteWise Sends data from the MQTT message that triggered the rule to AWS IoT
       * SiteWise asset properties.
       */
      override fun iotSiteWise(iotSiteWise: IResolvable) {
        cdkBuilder.iotSiteWise(iotSiteWise.let(IResolvable::unwrap))
      }

      /**
       * @param iotSiteWise Sends data from the MQTT message that triggered the rule to AWS IoT
       * SiteWise asset properties.
       */
      override fun iotSiteWise(iotSiteWise: IotSiteWiseActionProperty) {
        cdkBuilder.iotSiteWise(iotSiteWise.let(IotSiteWiseActionProperty::unwrap))
      }

      /**
       * @param iotSiteWise Sends data from the MQTT message that triggered the rule to AWS IoT
       * SiteWise asset properties.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c67675f0ded26c01b390afff37e4fbbe386d71d0bc05069dfe0909718ff796b")
      override fun iotSiteWise(iotSiteWise: IotSiteWiseActionProperty.Builder.() -> Unit): Unit =
          iotSiteWise(IotSiteWiseActionProperty(iotSiteWise))

      /**
       * @param kafka Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or
       * self-managed Apache Kafka cluster.
       */
      override fun kafka(kafka: IResolvable) {
        cdkBuilder.kafka(kafka.let(IResolvable::unwrap))
      }

      /**
       * @param kafka Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or
       * self-managed Apache Kafka cluster.
       */
      override fun kafka(kafka: KafkaActionProperty) {
        cdkBuilder.kafka(kafka.let(KafkaActionProperty::unwrap))
      }

      /**
       * @param kafka Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or
       * self-managed Apache Kafka cluster.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95bd0041398399948a6a91cc4beb5c27a2b10c383f2ccc058316107110812a17")
      override fun kafka(kafka: KafkaActionProperty.Builder.() -> Unit): Unit =
          kafka(KafkaActionProperty(kafka))

      /**
       * @param kinesis Write data to an Amazon Kinesis stream.
       */
      override fun kinesis(kinesis: IResolvable) {
        cdkBuilder.kinesis(kinesis.let(IResolvable::unwrap))
      }

      /**
       * @param kinesis Write data to an Amazon Kinesis stream.
       */
      override fun kinesis(kinesis: KinesisActionProperty) {
        cdkBuilder.kinesis(kinesis.let(KinesisActionProperty::unwrap))
      }

      /**
       * @param kinesis Write data to an Amazon Kinesis stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7829c2788742161736c7f4f276d2c9ca4a8eb7adc4f0983c9b15a000b1af250e")
      override fun kinesis(kinesis: KinesisActionProperty.Builder.() -> Unit): Unit =
          kinesis(KinesisActionProperty(kinesis))

      /**
       * @param lambda Invoke a Lambda function.
       */
      override fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda.let(IResolvable::unwrap))
      }

      /**
       * @param lambda Invoke a Lambda function.
       */
      override fun lambda(lambda: LambdaActionProperty) {
        cdkBuilder.lambda(lambda.let(LambdaActionProperty::unwrap))
      }

      /**
       * @param lambda Invoke a Lambda function.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cb07553eb70f94d4d0741a88ca3bf21fbdb63c177f55b6d47112f90ea9de592")
      override fun lambda(lambda: LambdaActionProperty.Builder.() -> Unit): Unit =
          lambda(LambdaActionProperty(lambda))

      /**
       * @param location Sends device location data to [Amazon Location
       * Service](https://docs.aws.amazon.com//location/latest/developerguide/welcome.html) .
       */
      override fun location(location: IResolvable) {
        cdkBuilder.location(location.let(IResolvable::unwrap))
      }

      /**
       * @param location Sends device location data to [Amazon Location
       * Service](https://docs.aws.amazon.com//location/latest/developerguide/welcome.html) .
       */
      override fun location(location: LocationActionProperty) {
        cdkBuilder.location(location.let(LocationActionProperty::unwrap))
      }

      /**
       * @param location Sends device location data to [Amazon Location
       * Service](https://docs.aws.amazon.com//location/latest/developerguide/welcome.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("40860c30d9f2428b1ebab0ef4f21b8fc9a5b0ad8ed070f880cc170ac5e542dcc")
      override fun location(location: LocationActionProperty.Builder.() -> Unit): Unit =
          location(LocationActionProperty(location))

      /**
       * @param openSearch Write data to an Amazon OpenSearch Service domain.
       */
      override fun openSearch(openSearch: IResolvable) {
        cdkBuilder.openSearch(openSearch.let(IResolvable::unwrap))
      }

      /**
       * @param openSearch Write data to an Amazon OpenSearch Service domain.
       */
      override fun openSearch(openSearch: OpenSearchActionProperty) {
        cdkBuilder.openSearch(openSearch.let(OpenSearchActionProperty::unwrap))
      }

      /**
       * @param openSearch Write data to an Amazon OpenSearch Service domain.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ff32f288dfb924554d6db1aacfcaa2e6b841f8bceae2eb25250c046ba5a2bcd0")
      override fun openSearch(openSearch: OpenSearchActionProperty.Builder.() -> Unit): Unit =
          openSearch(OpenSearchActionProperty(openSearch))

      /**
       * @param republish Publish to another MQTT topic.
       */
      override fun republish(republish: IResolvable) {
        cdkBuilder.republish(republish.let(IResolvable::unwrap))
      }

      /**
       * @param republish Publish to another MQTT topic.
       */
      override fun republish(republish: RepublishActionProperty) {
        cdkBuilder.republish(republish.let(RepublishActionProperty::unwrap))
      }

      /**
       * @param republish Publish to another MQTT topic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cff4c9f4f165e6ebf8a1d92707200697b7936100cf640c266bfed5c64224cbc7")
      override fun republish(republish: RepublishActionProperty.Builder.() -> Unit): Unit =
          republish(RepublishActionProperty(republish))

      /**
       * @param s3 Write to an Amazon S3 bucket.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      /**
       * @param s3 Write to an Amazon S3 bucket.
       */
      override fun s3(s3: S3ActionProperty) {
        cdkBuilder.s3(s3.let(S3ActionProperty::unwrap))
      }

      /**
       * @param s3 Write to an Amazon S3 bucket.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("070c5e2e998b45e02dc2bc514fafd0dce57030732a785f0655bf84f88530e751")
      override fun s3(s3: S3ActionProperty.Builder.() -> Unit): Unit = s3(S3ActionProperty(s3))

      /**
       * @param sns Publish to an Amazon SNS topic.
       */
      override fun sns(sns: IResolvable) {
        cdkBuilder.sns(sns.let(IResolvable::unwrap))
      }

      /**
       * @param sns Publish to an Amazon SNS topic.
       */
      override fun sns(sns: SnsActionProperty) {
        cdkBuilder.sns(sns.let(SnsActionProperty::unwrap))
      }

      /**
       * @param sns Publish to an Amazon SNS topic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e336860db8f9171bd843c395083b15e06f348ab6ee03e7aadbb37d2b1f5c7c50")
      override fun sns(sns: SnsActionProperty.Builder.() -> Unit): Unit =
          sns(SnsActionProperty(sns))

      /**
       * @param sqs Publish to an Amazon SQS queue.
       */
      override fun sqs(sqs: IResolvable) {
        cdkBuilder.sqs(sqs.let(IResolvable::unwrap))
      }

      /**
       * @param sqs Publish to an Amazon SQS queue.
       */
      override fun sqs(sqs: SqsActionProperty) {
        cdkBuilder.sqs(sqs.let(SqsActionProperty::unwrap))
      }

      /**
       * @param sqs Publish to an Amazon SQS queue.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57ea076cdbbf86399719493cb0eaff62871072cc1f057effda768eae4871d465")
      override fun sqs(sqs: SqsActionProperty.Builder.() -> Unit): Unit =
          sqs(SqsActionProperty(sqs))

      /**
       * @param stepFunctions Starts execution of a Step Functions state machine.
       */
      override fun stepFunctions(stepFunctions: IResolvable) {
        cdkBuilder.stepFunctions(stepFunctions.let(IResolvable::unwrap))
      }

      /**
       * @param stepFunctions Starts execution of a Step Functions state machine.
       */
      override fun stepFunctions(stepFunctions: StepFunctionsActionProperty) {
        cdkBuilder.stepFunctions(stepFunctions.let(StepFunctionsActionProperty::unwrap))
      }

      /**
       * @param stepFunctions Starts execution of a Step Functions state machine.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("661d098ed0c8cb1e4cc86437072deacf3e3c1f01ef261b1d6f2b9cab7d110c3a")
      override fun stepFunctions(stepFunctions: StepFunctionsActionProperty.Builder.() -> Unit):
          Unit = stepFunctions(StepFunctionsActionProperty(stepFunctions))

      /**
       * @param timestream Writes attributes from an MQTT message.
       */
      override fun timestream(timestream: IResolvable) {
        cdkBuilder.timestream(timestream.let(IResolvable::unwrap))
      }

      /**
       * @param timestream Writes attributes from an MQTT message.
       */
      override fun timestream(timestream: TimestreamActionProperty) {
        cdkBuilder.timestream(timestream.let(TimestreamActionProperty::unwrap))
      }

      /**
       * @param timestream Writes attributes from an MQTT message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4706a162d3bb7a739fa4cf959252e7009c2f91e0d18e6ea13b7c4f1d153f8a83")
      override fun timestream(timestream: TimestreamActionProperty.Builder.() -> Unit): Unit =
          timestream(TimestreamActionProperty(timestream))

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
      /**
       * Change the state of a CloudWatch alarm.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-cloudwatchalarm)
       */
      override fun cloudwatchAlarm(): Any? = unwrap(this).getCloudwatchAlarm()

      /**
       * Sends data to CloudWatch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-cloudwatchlogs)
       */
      override fun cloudwatchLogs(): Any? = unwrap(this).getCloudwatchLogs()

      /**
       * Capture a CloudWatch metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-cloudwatchmetric)
       */
      override fun cloudwatchMetric(): Any? = unwrap(this).getCloudwatchMetric()

      /**
       * Write to a DynamoDB table.
       *
       * This is a new version of the DynamoDB action. It allows you to write each attribute in an
       * MQTT message payload into a separate DynamoDB column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-dynamodbv2)
       */
      override fun dynamoDBv2(): Any? = unwrap(this).getDynamoDBv2()

      /**
       * Write to a DynamoDB table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-dynamodb)
       */
      override fun dynamoDb(): Any? = unwrap(this).getDynamoDb()

      /**
       * Write data to an Amazon OpenSearch Service domain.
       *
       *
       * The `Elasticsearch` action can only be used by existing rule actions. To create a new rule
       * action or to update an existing rule action, use the `OpenSearch` rule action instead. For
       * more information, see
       * [OpenSearchAction](https://docs.aws.amazon.com//iot/latest/apireference/API_OpenSearchAction.html)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-elasticsearch)
       */
      override fun elasticsearch(): Any? = unwrap(this).getElasticsearch()

      /**
       * Write to an Amazon Kinesis Firehose stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-firehose)
       */
      override fun firehose(): Any? = unwrap(this).getFirehose()

      /**
       * Send data to an HTTPS endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-http)
       */
      override fun http(): Any? = unwrap(this).getHttp()

      /**
       * Sends message data to an AWS IoT Analytics channel.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-iotanalytics)
       */
      override fun iotAnalytics(): Any? = unwrap(this).getIotAnalytics()

      /**
       * Sends an input to an AWS IoT Events detector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-iotevents)
       */
      override fun iotEvents(): Any? = unwrap(this).getIotEvents()

      /**
       * Sends data from the MQTT message that triggered the rule to AWS IoT SiteWise asset
       * properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-iotsitewise)
       */
      override fun iotSiteWise(): Any? = unwrap(this).getIotSiteWise()

      /**
       * Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or self-managed
       * Apache Kafka cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-kafka)
       */
      override fun kafka(): Any? = unwrap(this).getKafka()

      /**
       * Write data to an Amazon Kinesis stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-kinesis)
       */
      override fun kinesis(): Any? = unwrap(this).getKinesis()

      /**
       * Invoke a Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-lambda)
       */
      override fun lambda(): Any? = unwrap(this).getLambda()

      /**
       * Sends device location data to [Amazon Location
       * Service](https://docs.aws.amazon.com//location/latest/developerguide/welcome.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-location)
       */
      override fun location(): Any? = unwrap(this).getLocation()

      /**
       * Write data to an Amazon OpenSearch Service domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-opensearch)
       */
      override fun openSearch(): Any? = unwrap(this).getOpenSearch()

      /**
       * Publish to another MQTT topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-republish)
       */
      override fun republish(): Any? = unwrap(this).getRepublish()

      /**
       * Write to an Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()

      /**
       * Publish to an Amazon SNS topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-sns)
       */
      override fun sns(): Any? = unwrap(this).getSns()

      /**
       * Publish to an Amazon SQS queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-sqs)
       */
      override fun sqs(): Any? = unwrap(this).getSqs()

      /**
       * Starts execution of a Step Functions state machine.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-stepfunctions)
       */
      override fun stepFunctions(): Any? = unwrap(this).getStepFunctions()

      /**
       * Writes attributes from an MQTT message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html#cfn-iot-topicrule-action-timestream)
       */
      override fun timestream(): Any? = unwrap(this).getTimestream()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty):
          ActionProperty = CdkObjectWrappers.wrap(cdkObject) as? ActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnTopicRule.ActionProperty
    }
  }

  /**
   * Describes an action to write data to an Amazon Kinesis stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * KinesisActionProperty kinesisActionProperty = KinesisActionProperty.builder()
   * .roleArn("roleArn")
   * .streamName("streamName")
   * // the properties below are optional
   * .partitionKey("partitionKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html)
   */
  public interface KinesisActionProperty {
    /**
     * The partition key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-partitionkey)
     */
    public fun partitionKey(): String? = unwrap(this).getPartitionKey()

    /**
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * The name of the Amazon Kinesis stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-streamname)
     */
    public fun streamName(): String

    /**
     * A builder for [KinesisActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param partitionKey The partition key.
       */
      public fun partitionKey(partitionKey: String)

      /**
       * @param roleArn The ARN of the IAM role that grants access to the Amazon Kinesis stream. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param streamName The name of the Amazon Kinesis stream. 
       */
      public fun streamName(streamName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.builder()

      /**
       * @param partitionKey The partition key.
       */
      override fun partitionKey(partitionKey: String) {
        cdkBuilder.partitionKey(partitionKey)
      }

      /**
       * @param roleArn The ARN of the IAM role that grants access to the Amazon Kinesis stream. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param streamName The name of the Amazon Kinesis stream. 
       */
      override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty,
    ) : CdkObject(cdkObject), KinesisActionProperty {
      /**
       * The partition key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-partitionkey)
       */
      override fun partitionKey(): String? = unwrap(this).getPartitionKey()

      /**
       * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The name of the Amazon Kinesis stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html#cfn-iot-topicrule-kinesisaction-streamname)
       */
      override fun streamName(): String = unwrap(this).getStreamName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty):
          KinesisActionProperty = CdkObjectWrappers.wrap(cdkObject) as? KinesisActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty
    }
  }

  /**
   * Specifies MQTT Version 5.0 headers information. For more information, see
   * [MQTT](https://docs.aws.amazon.com//iot/latest/developerguide/mqtt.html) in the IoT Core Developer
   * Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * RepublishActionHeadersProperty republishActionHeadersProperty =
   * RepublishActionHeadersProperty.builder()
   * .contentType("contentType")
   * .correlationData("correlationData")
   * .messageExpiry("messageExpiry")
   * .payloadFormatIndicator("payloadFormatIndicator")
   * .responseTopic("responseTopic")
   * .userProperties(List.of(UserPropertyProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishactionheaders.html)
   */
  public interface RepublishActionHeadersProperty {
    /**
     * A UTF-8 encoded string that describes the content of the publishing message.
     *
     * For more information, see [Content
     * Type](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901118)
     * in the MQTT Version 5.0 specification.
     *
     * Supports [substitution
     * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishactionheaders.html#cfn-iot-topicrule-republishactionheaders-contenttype)
     */
    public fun contentType(): String? = unwrap(this).getContentType()

    /**
     * The base64-encoded binary data used by the sender of the request message to identify which
     * request the response message is for.
     *
     * For more information, see [Correlation
     * Data](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901115)
     * in the MQTT Version 5.0 specification.
     *
     * Supports [substitution
     * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
     * .
     *
     *
     * This binary data must be base64-encoded.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishactionheaders.html#cfn-iot-topicrule-republishactionheaders-correlationdata)
     */
    public fun correlationData(): String? = unwrap(this).getCorrelationData()

    /**
     * A user-defined integer value that represents the message expiry interval at the broker.
     *
     * If the messages haven't been sent to the subscribers within that interval, the message
     * expires and is removed. The value of `messageExpiry` represents the number of seconds before it
     * expires. For more information about the limits of `messageExpiry` , see [Message broker and
     * protocol limits and
     * quotas](https://docs.aws.amazon.com//general/latest/gr/iot-core.html#limits_iot) in the IoT Core
     * Reference Guide.
     *
     * Supports [substitution
     * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishactionheaders.html#cfn-iot-topicrule-republishactionheaders-messageexpiry)
     */
    public fun messageExpiry(): String? = unwrap(this).getMessageExpiry()

    /**
     * An `Enum` string value that indicates whether the payload is formatted as UTF-8.
     *
     * Valid values are `UNSPECIFIED_BYTES` and `UTF8_DATA` .
     *
     * For more information, see [Payload Format
     * Indicator](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901111)
     * from the MQTT Version 5.0 specification.
     *
     * Supports [substitution
     * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishactionheaders.html#cfn-iot-topicrule-republishactionheaders-payloadformatindicator)
     */
    public fun payloadFormatIndicator(): String? = unwrap(this).getPayloadFormatIndicator()

    /**
     * A UTF-8 encoded string that's used as the topic name for a response message.
     *
     * The response topic is used to describe the topic to which the receiver should publish as part
     * of the request-response flow. The topic must not contain wildcard characters.
     *
     * For more information, see [Response
     * Topic](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901114)
     * in the MQTT Version 5.0 specification.
     *
     * Supports [substitution
     * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishactionheaders.html#cfn-iot-topicrule-republishactionheaders-responsetopic)
     */
    public fun responseTopic(): String? = unwrap(this).getResponseTopic()

    /**
     * An array of key-value pairs that you define in the MQTT5 header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishactionheaders.html#cfn-iot-topicrule-republishactionheaders-userproperties)
     */
    public fun userProperties(): Any? = unwrap(this).getUserProperties()

    /**
     * A builder for [RepublishActionHeadersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contentType A UTF-8 encoded string that describes the content of the publishing
       * message.
       * For more information, see [Content
       * Type](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901118)
       * in the MQTT Version 5.0 specification.
       *
       * Supports [substitution
       * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
       * .
       */
      public fun contentType(contentType: String)

      /**
       * @param correlationData The base64-encoded binary data used by the sender of the request
       * message to identify which request the response message is for.
       * For more information, see [Correlation
       * Data](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901115)
       * in the MQTT Version 5.0 specification.
       *
       * Supports [substitution
       * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
       * .
       *
       *
       * This binary data must be base64-encoded.
       */
      public fun correlationData(correlationData: String)

      /**
       * @param messageExpiry A user-defined integer value that represents the message expiry
       * interval at the broker.
       * If the messages haven't been sent to the subscribers within that interval, the message
       * expires and is removed. The value of `messageExpiry` represents the number of seconds before
       * it expires. For more information about the limits of `messageExpiry` , see [Message broker and
       * protocol limits and
       * quotas](https://docs.aws.amazon.com//general/latest/gr/iot-core.html#limits_iot) in the IoT
       * Core Reference Guide.
       *
       * Supports [substitution
       * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
       * .
       */
      public fun messageExpiry(messageExpiry: String)

      /**
       * @param payloadFormatIndicator An `Enum` string value that indicates whether the payload is
       * formatted as UTF-8.
       * Valid values are `UNSPECIFIED_BYTES` and `UTF8_DATA` .
       *
       * For more information, see [Payload Format
       * Indicator](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901111)
       * from the MQTT Version 5.0 specification.
       *
       * Supports [substitution
       * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
       * .
       */
      public fun payloadFormatIndicator(payloadFormatIndicator: String)

      /**
       * @param responseTopic A UTF-8 encoded string that's used as the topic name for a response
       * message.
       * The response topic is used to describe the topic to which the receiver should publish as
       * part of the request-response flow. The topic must not contain wildcard characters.
       *
       * For more information, see [Response
       * Topic](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901114)
       * in the MQTT Version 5.0 specification.
       *
       * Supports [substitution
       * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
       * .
       */
      public fun responseTopic(responseTopic: String)

      /**
       * @param userProperties An array of key-value pairs that you define in the MQTT5 header.
       */
      public fun userProperties(userProperties: IResolvable)

      /**
       * @param userProperties An array of key-value pairs that you define in the MQTT5 header.
       */
      public fun userProperties(userProperties: List<Any>)

      /**
       * @param userProperties An array of key-value pairs that you define in the MQTT5 header.
       */
      public fun userProperties(vararg userProperties: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty.builder()

      /**
       * @param contentType A UTF-8 encoded string that describes the content of the publishing
       * message.
       * For more information, see [Content
       * Type](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901118)
       * in the MQTT Version 5.0 specification.
       *
       * Supports [substitution
       * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
       * .
       */
      override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      /**
       * @param correlationData The base64-encoded binary data used by the sender of the request
       * message to identify which request the response message is for.
       * For more information, see [Correlation
       * Data](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901115)
       * in the MQTT Version 5.0 specification.
       *
       * Supports [substitution
       * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
       * .
       *
       *
       * This binary data must be base64-encoded.
       */
      override fun correlationData(correlationData: String) {
        cdkBuilder.correlationData(correlationData)
      }

      /**
       * @param messageExpiry A user-defined integer value that represents the message expiry
       * interval at the broker.
       * If the messages haven't been sent to the subscribers within that interval, the message
       * expires and is removed. The value of `messageExpiry` represents the number of seconds before
       * it expires. For more information about the limits of `messageExpiry` , see [Message broker and
       * protocol limits and
       * quotas](https://docs.aws.amazon.com//general/latest/gr/iot-core.html#limits_iot) in the IoT
       * Core Reference Guide.
       *
       * Supports [substitution
       * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
       * .
       */
      override fun messageExpiry(messageExpiry: String) {
        cdkBuilder.messageExpiry(messageExpiry)
      }

      /**
       * @param payloadFormatIndicator An `Enum` string value that indicates whether the payload is
       * formatted as UTF-8.
       * Valid values are `UNSPECIFIED_BYTES` and `UTF8_DATA` .
       *
       * For more information, see [Payload Format
       * Indicator](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901111)
       * from the MQTT Version 5.0 specification.
       *
       * Supports [substitution
       * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
       * .
       */
      override fun payloadFormatIndicator(payloadFormatIndicator: String) {
        cdkBuilder.payloadFormatIndicator(payloadFormatIndicator)
      }

      /**
       * @param responseTopic A UTF-8 encoded string that's used as the topic name for a response
       * message.
       * The response topic is used to describe the topic to which the receiver should publish as
       * part of the request-response flow. The topic must not contain wildcard characters.
       *
       * For more information, see [Response
       * Topic](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901114)
       * in the MQTT Version 5.0 specification.
       *
       * Supports [substitution
       * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
       * .
       */
      override fun responseTopic(responseTopic: String) {
        cdkBuilder.responseTopic(responseTopic)
      }

      /**
       * @param userProperties An array of key-value pairs that you define in the MQTT5 header.
       */
      override fun userProperties(userProperties: IResolvable) {
        cdkBuilder.userProperties(userProperties.let(IResolvable::unwrap))
      }

      /**
       * @param userProperties An array of key-value pairs that you define in the MQTT5 header.
       */
      override fun userProperties(userProperties: List<Any>) {
        cdkBuilder.userProperties(userProperties)
      }

      /**
       * @param userProperties An array of key-value pairs that you define in the MQTT5 header.
       */
      override fun userProperties(vararg userProperties: Any): Unit =
          userProperties(userProperties.toList())

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty,
    ) : CdkObject(cdkObject), RepublishActionHeadersProperty {
      /**
       * A UTF-8 encoded string that describes the content of the publishing message.
       *
       * For more information, see [Content
       * Type](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901118)
       * in the MQTT Version 5.0 specification.
       *
       * Supports [substitution
       * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishactionheaders.html#cfn-iot-topicrule-republishactionheaders-contenttype)
       */
      override fun contentType(): String? = unwrap(this).getContentType()

      /**
       * The base64-encoded binary data used by the sender of the request message to identify which
       * request the response message is for.
       *
       * For more information, see [Correlation
       * Data](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901115)
       * in the MQTT Version 5.0 specification.
       *
       * Supports [substitution
       * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
       * .
       *
       *
       * This binary data must be base64-encoded.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishactionheaders.html#cfn-iot-topicrule-republishactionheaders-correlationdata)
       */
      override fun correlationData(): String? = unwrap(this).getCorrelationData()

      /**
       * A user-defined integer value that represents the message expiry interval at the broker.
       *
       * If the messages haven't been sent to the subscribers within that interval, the message
       * expires and is removed. The value of `messageExpiry` represents the number of seconds before
       * it expires. For more information about the limits of `messageExpiry` , see [Message broker and
       * protocol limits and
       * quotas](https://docs.aws.amazon.com//general/latest/gr/iot-core.html#limits_iot) in the IoT
       * Core Reference Guide.
       *
       * Supports [substitution
       * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishactionheaders.html#cfn-iot-topicrule-republishactionheaders-messageexpiry)
       */
      override fun messageExpiry(): String? = unwrap(this).getMessageExpiry()

      /**
       * An `Enum` string value that indicates whether the payload is formatted as UTF-8.
       *
       * Valid values are `UNSPECIFIED_BYTES` and `UTF8_DATA` .
       *
       * For more information, see [Payload Format
       * Indicator](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901111)
       * from the MQTT Version 5.0 specification.
       *
       * Supports [substitution
       * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishactionheaders.html#cfn-iot-topicrule-republishactionheaders-payloadformatindicator)
       */
      override fun payloadFormatIndicator(): String? = unwrap(this).getPayloadFormatIndicator()

      /**
       * A UTF-8 encoded string that's used as the topic name for a response message.
       *
       * The response topic is used to describe the topic to which the receiver should publish as
       * part of the request-response flow. The topic must not contain wildcard characters.
       *
       * For more information, see [Response
       * Topic](https://docs.aws.amazon.com/https://docs.oasis-open.org/mqtt/mqtt/v5.0/os/mqtt-v5.0-os.html#_Toc3901114)
       * in the MQTT Version 5.0 specification.
       *
       * Supports [substitution
       * templates](https://docs.aws.amazon.com//iot/latest/developerguide/iot-substitution-templates.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishactionheaders.html#cfn-iot-topicrule-republishactionheaders-responsetopic)
       */
      override fun responseTopic(): String? = unwrap(this).getResponseTopic()

      /**
       * An array of key-value pairs that you define in the MQTT5 header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishactionheaders.html#cfn-iot-topicrule-republishactionheaders-userproperties)
       */
      override fun userProperties(): Any? = unwrap(this).getUserProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RepublishActionHeadersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty):
          RepublishActionHeadersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RepublishActionHeadersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepublishActionHeadersProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionHeadersProperty
    }
  }

  /**
   * The input for the DynamoActionVS action that specifies the DynamoDB table to which the message
   * data will be written.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * PutItemInputProperty putItemInputProperty = PutItemInputProperty.builder()
   * .tableName("tableName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html)
   */
  public interface PutItemInputProperty {
    /**
     * The table where the message data will be written.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html#cfn-iot-topicrule-putiteminput-tablename)
     */
    public fun tableName(): String

    /**
     * A builder for [PutItemInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param tableName The table where the message data will be written. 
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty.builder()

      /**
       * @param tableName The table where the message data will be written. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty,
    ) : CdkObject(cdkObject), PutItemInputProperty {
      /**
       * The table where the message data will be written.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html#cfn-iot-topicrule-putiteminput-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PutItemInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty):
          PutItemInputProperty = CdkObjectWrappers.wrap(cdkObject) as? PutItemInputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PutItemInputProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.PutItemInputProperty
    }
  }

  /**
   * Describes a rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * TopicRulePayloadProperty topicRulePayloadProperty = TopicRulePayloadProperty.builder()
   * .actions(List.of(ActionProperty.builder()
   * .cloudwatchAlarm(CloudwatchAlarmActionProperty.builder()
   * .alarmName("alarmName")
   * .roleArn("roleArn")
   * .stateReason("stateReason")
   * .stateValue("stateValue")
   * .build())
   * .cloudwatchLogs(CloudwatchLogsActionProperty.builder()
   * .logGroupName("logGroupName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .batchMode(false)
   * .build())
   * .cloudwatchMetric(CloudwatchMetricActionProperty.builder()
   * .metricName("metricName")
   * .metricNamespace("metricNamespace")
   * .metricUnit("metricUnit")
   * .metricValue("metricValue")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .metricTimestamp("metricTimestamp")
   * .build())
   * .dynamoDb(DynamoDBActionProperty.builder()
   * .hashKeyField("hashKeyField")
   * .hashKeyValue("hashKeyValue")
   * .roleArn("roleArn")
   * .tableName("tableName")
   * // the properties below are optional
   * .hashKeyType("hashKeyType")
   * .payloadField("payloadField")
   * .rangeKeyField("rangeKeyField")
   * .rangeKeyType("rangeKeyType")
   * .rangeKeyValue("rangeKeyValue")
   * .build())
   * .dynamoDBv2(DynamoDBv2ActionProperty.builder()
   * .putItem(PutItemInputProperty.builder()
   * .tableName("tableName")
   * .build())
   * .roleArn("roleArn")
   * .build())
   * .elasticsearch(ElasticsearchActionProperty.builder()
   * .endpoint("endpoint")
   * .id("id")
   * .index("index")
   * .roleArn("roleArn")
   * .type("type")
   * .build())
   * .firehose(FirehoseActionProperty.builder()
   * .deliveryStreamName("deliveryStreamName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .batchMode(false)
   * .separator("separator")
   * .build())
   * .http(HttpActionProperty.builder()
   * .url("url")
   * // the properties below are optional
   * .auth(HttpAuthorizationProperty.builder()
   * .sigv4(SigV4AuthorizationProperty.builder()
   * .roleArn("roleArn")
   * .serviceName("serviceName")
   * .signingRegion("signingRegion")
   * .build())
   * .build())
   * .confirmationUrl("confirmationUrl")
   * .headers(List.of(HttpActionHeaderProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build())
   * .iotAnalytics(IotAnalyticsActionProperty.builder()
   * .channelName("channelName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .batchMode(false)
   * .build())
   * .iotEvents(IotEventsActionProperty.builder()
   * .inputName("inputName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .batchMode(false)
   * .messageId("messageId")
   * .build())
   * .iotSiteWise(IotSiteWiseActionProperty.builder()
   * .putAssetPropertyValueEntries(List.of(PutAssetPropertyValueEntryProperty.builder()
   * .propertyValues(List.of(AssetPropertyValueProperty.builder()
   * .timestamp(AssetPropertyTimestampProperty.builder()
   * .timeInSeconds("timeInSeconds")
   * // the properties below are optional
   * .offsetInNanos("offsetInNanos")
   * .build())
   * .value(AssetPropertyVariantProperty.builder()
   * .booleanValue("booleanValue")
   * .doubleValue("doubleValue")
   * .integerValue("integerValue")
   * .stringValue("stringValue")
   * .build())
   * // the properties below are optional
   * .quality("quality")
   * .build()))
   * // the properties below are optional
   * .assetId("assetId")
   * .entryId("entryId")
   * .propertyAlias("propertyAlias")
   * .propertyId("propertyId")
   * .build()))
   * .roleArn("roleArn")
   * .build())
   * .kafka(KafkaActionProperty.builder()
   * .clientProperties(Map.of(
   * "clientPropertiesKey", "clientProperties"))
   * .destinationArn("destinationArn")
   * .topic("topic")
   * // the properties below are optional
   * .headers(List.of(KafkaActionHeaderProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .key("key")
   * .partition("partition")
   * .build())
   * .kinesis(KinesisActionProperty.builder()
   * .roleArn("roleArn")
   * .streamName("streamName")
   * // the properties below are optional
   * .partitionKey("partitionKey")
   * .build())
   * .lambda(LambdaActionProperty.builder()
   * .functionArn("functionArn")
   * .build())
   * .location(LocationActionProperty.builder()
   * .deviceId("deviceId")
   * .latitude("latitude")
   * .longitude("longitude")
   * .roleArn("roleArn")
   * .trackerName("trackerName")
   * // the properties below are optional
   * .timestamp(TimestampProperty.builder()
   * .value("value")
   * // the properties below are optional
   * .unit("unit")
   * .build())
   * .build())
   * .openSearch(OpenSearchActionProperty.builder()
   * .endpoint("endpoint")
   * .id("id")
   * .index("index")
   * .roleArn("roleArn")
   * .type("type")
   * .build())
   * .republish(RepublishActionProperty.builder()
   * .roleArn("roleArn")
   * .topic("topic")
   * // the properties below are optional
   * .headers(RepublishActionHeadersProperty.builder()
   * .contentType("contentType")
   * .correlationData("correlationData")
   * .messageExpiry("messageExpiry")
   * .payloadFormatIndicator("payloadFormatIndicator")
   * .responseTopic("responseTopic")
   * .userProperties(List.of(UserPropertyProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build())
   * .qos(123)
   * .build())
   * .s3(S3ActionProperty.builder()
   * .bucketName("bucketName")
   * .key("key")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .cannedAcl("cannedAcl")
   * .build())
   * .sns(SnsActionProperty.builder()
   * .roleArn("roleArn")
   * .targetArn("targetArn")
   * // the properties below are optional
   * .messageFormat("messageFormat")
   * .build())
   * .sqs(SqsActionProperty.builder()
   * .queueUrl("queueUrl")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .useBase64(false)
   * .build())
   * .stepFunctions(StepFunctionsActionProperty.builder()
   * .roleArn("roleArn")
   * .stateMachineName("stateMachineName")
   * // the properties below are optional
   * .executionNamePrefix("executionNamePrefix")
   * .build())
   * .timestream(TimestreamActionProperty.builder()
   * .databaseName("databaseName")
   * .dimensions(List.of(TimestreamDimensionProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .roleArn("roleArn")
   * .tableName("tableName")
   * // the properties below are optional
   * .timestamp(TimestreamTimestampProperty.builder()
   * .unit("unit")
   * .value("value")
   * .build())
   * .build())
   * .build()))
   * .sql("sql")
   * // the properties below are optional
   * .awsIotSqlVersion("awsIotSqlVersion")
   * .description("description")
   * .errorAction(ActionProperty.builder()
   * .cloudwatchAlarm(CloudwatchAlarmActionProperty.builder()
   * .alarmName("alarmName")
   * .roleArn("roleArn")
   * .stateReason("stateReason")
   * .stateValue("stateValue")
   * .build())
   * .cloudwatchLogs(CloudwatchLogsActionProperty.builder()
   * .logGroupName("logGroupName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .batchMode(false)
   * .build())
   * .cloudwatchMetric(CloudwatchMetricActionProperty.builder()
   * .metricName("metricName")
   * .metricNamespace("metricNamespace")
   * .metricUnit("metricUnit")
   * .metricValue("metricValue")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .metricTimestamp("metricTimestamp")
   * .build())
   * .dynamoDb(DynamoDBActionProperty.builder()
   * .hashKeyField("hashKeyField")
   * .hashKeyValue("hashKeyValue")
   * .roleArn("roleArn")
   * .tableName("tableName")
   * // the properties below are optional
   * .hashKeyType("hashKeyType")
   * .payloadField("payloadField")
   * .rangeKeyField("rangeKeyField")
   * .rangeKeyType("rangeKeyType")
   * .rangeKeyValue("rangeKeyValue")
   * .build())
   * .dynamoDBv2(DynamoDBv2ActionProperty.builder()
   * .putItem(PutItemInputProperty.builder()
   * .tableName("tableName")
   * .build())
   * .roleArn("roleArn")
   * .build())
   * .elasticsearch(ElasticsearchActionProperty.builder()
   * .endpoint("endpoint")
   * .id("id")
   * .index("index")
   * .roleArn("roleArn")
   * .type("type")
   * .build())
   * .firehose(FirehoseActionProperty.builder()
   * .deliveryStreamName("deliveryStreamName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .batchMode(false)
   * .separator("separator")
   * .build())
   * .http(HttpActionProperty.builder()
   * .url("url")
   * // the properties below are optional
   * .auth(HttpAuthorizationProperty.builder()
   * .sigv4(SigV4AuthorizationProperty.builder()
   * .roleArn("roleArn")
   * .serviceName("serviceName")
   * .signingRegion("signingRegion")
   * .build())
   * .build())
   * .confirmationUrl("confirmationUrl")
   * .headers(List.of(HttpActionHeaderProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build())
   * .iotAnalytics(IotAnalyticsActionProperty.builder()
   * .channelName("channelName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .batchMode(false)
   * .build())
   * .iotEvents(IotEventsActionProperty.builder()
   * .inputName("inputName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .batchMode(false)
   * .messageId("messageId")
   * .build())
   * .iotSiteWise(IotSiteWiseActionProperty.builder()
   * .putAssetPropertyValueEntries(List.of(PutAssetPropertyValueEntryProperty.builder()
   * .propertyValues(List.of(AssetPropertyValueProperty.builder()
   * .timestamp(AssetPropertyTimestampProperty.builder()
   * .timeInSeconds("timeInSeconds")
   * // the properties below are optional
   * .offsetInNanos("offsetInNanos")
   * .build())
   * .value(AssetPropertyVariantProperty.builder()
   * .booleanValue("booleanValue")
   * .doubleValue("doubleValue")
   * .integerValue("integerValue")
   * .stringValue("stringValue")
   * .build())
   * // the properties below are optional
   * .quality("quality")
   * .build()))
   * // the properties below are optional
   * .assetId("assetId")
   * .entryId("entryId")
   * .propertyAlias("propertyAlias")
   * .propertyId("propertyId")
   * .build()))
   * .roleArn("roleArn")
   * .build())
   * .kafka(KafkaActionProperty.builder()
   * .clientProperties(Map.of(
   * "clientPropertiesKey", "clientProperties"))
   * .destinationArn("destinationArn")
   * .topic("topic")
   * // the properties below are optional
   * .headers(List.of(KafkaActionHeaderProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .key("key")
   * .partition("partition")
   * .build())
   * .kinesis(KinesisActionProperty.builder()
   * .roleArn("roleArn")
   * .streamName("streamName")
   * // the properties below are optional
   * .partitionKey("partitionKey")
   * .build())
   * .lambda(LambdaActionProperty.builder()
   * .functionArn("functionArn")
   * .build())
   * .location(LocationActionProperty.builder()
   * .deviceId("deviceId")
   * .latitude("latitude")
   * .longitude("longitude")
   * .roleArn("roleArn")
   * .trackerName("trackerName")
   * // the properties below are optional
   * .timestamp(TimestampProperty.builder()
   * .value("value")
   * // the properties below are optional
   * .unit("unit")
   * .build())
   * .build())
   * .openSearch(OpenSearchActionProperty.builder()
   * .endpoint("endpoint")
   * .id("id")
   * .index("index")
   * .roleArn("roleArn")
   * .type("type")
   * .build())
   * .republish(RepublishActionProperty.builder()
   * .roleArn("roleArn")
   * .topic("topic")
   * // the properties below are optional
   * .headers(RepublishActionHeadersProperty.builder()
   * .contentType("contentType")
   * .correlationData("correlationData")
   * .messageExpiry("messageExpiry")
   * .payloadFormatIndicator("payloadFormatIndicator")
   * .responseTopic("responseTopic")
   * .userProperties(List.of(UserPropertyProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build())
   * .qos(123)
   * .build())
   * .s3(S3ActionProperty.builder()
   * .bucketName("bucketName")
   * .key("key")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .cannedAcl("cannedAcl")
   * .build())
   * .sns(SnsActionProperty.builder()
   * .roleArn("roleArn")
   * .targetArn("targetArn")
   * // the properties below are optional
   * .messageFormat("messageFormat")
   * .build())
   * .sqs(SqsActionProperty.builder()
   * .queueUrl("queueUrl")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .useBase64(false)
   * .build())
   * .stepFunctions(StepFunctionsActionProperty.builder()
   * .roleArn("roleArn")
   * .stateMachineName("stateMachineName")
   * // the properties below are optional
   * .executionNamePrefix("executionNamePrefix")
   * .build())
   * .timestream(TimestreamActionProperty.builder()
   * .databaseName("databaseName")
   * .dimensions(List.of(TimestreamDimensionProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .roleArn("roleArn")
   * .tableName("tableName")
   * // the properties below are optional
   * .timestamp(TimestreamTimestampProperty.builder()
   * .unit("unit")
   * .value("value")
   * .build())
   * .build())
   * .build())
   * .ruleDisabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html)
   */
  public interface TopicRulePayloadProperty {
    /**
     * The actions associated with the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-actions)
     */
    public fun actions(): Any

    /**
     * The version of the SQL rules engine to use when evaluating the rule.
     *
     * The default value is 2015-10-08.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-awsiotsqlversion)
     */
    public fun awsIotSqlVersion(): String? = unwrap(this).getAwsIotSqlVersion()

    /**
     * The description of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The action to take when an error occurs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-erroraction)
     */
    public fun errorAction(): Any? = unwrap(this).getErrorAction()

    /**
     * Specifies whether the rule is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-ruledisabled)
     */
    public fun ruleDisabled(): Any? = unwrap(this).getRuleDisabled()

    /**
     * The SQL statement used to query the topic.
     *
     * For more information, see [AWS IoT SQL
     * Reference](https://docs.aws.amazon.com/iot/latest/developerguide/iot-sql-reference.html) in the
     * *AWS IoT Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-sql)
     */
    public fun sql(): String

    /**
     * A builder for [TopicRulePayloadProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions The actions associated with the rule. 
       */
      public fun actions(actions: IResolvable)

      /**
       * @param actions The actions associated with the rule. 
       */
      public fun actions(actions: List<Any>)

      /**
       * @param actions The actions associated with the rule. 
       */
      public fun actions(vararg actions: Any)

      /**
       * @param awsIotSqlVersion The version of the SQL rules engine to use when evaluating the
       * rule.
       * The default value is 2015-10-08.
       */
      public fun awsIotSqlVersion(awsIotSqlVersion: String)

      /**
       * @param description The description of the rule.
       */
      public fun description(description: String)

      /**
       * @param errorAction The action to take when an error occurs.
       */
      public fun errorAction(errorAction: IResolvable)

      /**
       * @param errorAction The action to take when an error occurs.
       */
      public fun errorAction(errorAction: ActionProperty)

      /**
       * @param errorAction The action to take when an error occurs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6a7feef4f5e9d29bedaf3b8042ef7b2e98dd59465b5b31492cf2bd7ab98cab6")
      public fun errorAction(errorAction: ActionProperty.Builder.() -> Unit)

      /**
       * @param ruleDisabled Specifies whether the rule is disabled.
       */
      public fun ruleDisabled(ruleDisabled: Boolean)

      /**
       * @param ruleDisabled Specifies whether the rule is disabled.
       */
      public fun ruleDisabled(ruleDisabled: IResolvable)

      /**
       * @param sql The SQL statement used to query the topic. 
       * For more information, see [AWS IoT SQL
       * Reference](https://docs.aws.amazon.com/iot/latest/developerguide/iot-sql-reference.html) in
       * the *AWS IoT Developer Guide* .
       */
      public fun sql(sql: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty.builder()

      /**
       * @param actions The actions associated with the rule. 
       */
      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      /**
       * @param actions The actions associated with the rule. 
       */
      override fun actions(actions: List<Any>) {
        cdkBuilder.actions(actions)
      }

      /**
       * @param actions The actions associated with the rule. 
       */
      override fun actions(vararg actions: Any): Unit = actions(actions.toList())

      /**
       * @param awsIotSqlVersion The version of the SQL rules engine to use when evaluating the
       * rule.
       * The default value is 2015-10-08.
       */
      override fun awsIotSqlVersion(awsIotSqlVersion: String) {
        cdkBuilder.awsIotSqlVersion(awsIotSqlVersion)
      }

      /**
       * @param description The description of the rule.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param errorAction The action to take when an error occurs.
       */
      override fun errorAction(errorAction: IResolvable) {
        cdkBuilder.errorAction(errorAction.let(IResolvable::unwrap))
      }

      /**
       * @param errorAction The action to take when an error occurs.
       */
      override fun errorAction(errorAction: ActionProperty) {
        cdkBuilder.errorAction(errorAction.let(ActionProperty::unwrap))
      }

      /**
       * @param errorAction The action to take when an error occurs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6a7feef4f5e9d29bedaf3b8042ef7b2e98dd59465b5b31492cf2bd7ab98cab6")
      override fun errorAction(errorAction: ActionProperty.Builder.() -> Unit): Unit =
          errorAction(ActionProperty(errorAction))

      /**
       * @param ruleDisabled Specifies whether the rule is disabled.
       */
      override fun ruleDisabled(ruleDisabled: Boolean) {
        cdkBuilder.ruleDisabled(ruleDisabled)
      }

      /**
       * @param ruleDisabled Specifies whether the rule is disabled.
       */
      override fun ruleDisabled(ruleDisabled: IResolvable) {
        cdkBuilder.ruleDisabled(ruleDisabled.let(IResolvable::unwrap))
      }

      /**
       * @param sql The SQL statement used to query the topic. 
       * For more information, see [AWS IoT SQL
       * Reference](https://docs.aws.amazon.com/iot/latest/developerguide/iot-sql-reference.html) in
       * the *AWS IoT Developer Guide* .
       */
      override fun sql(sql: String) {
        cdkBuilder.sql(sql)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty,
    ) : CdkObject(cdkObject), TopicRulePayloadProperty {
      /**
       * The actions associated with the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-actions)
       */
      override fun actions(): Any = unwrap(this).getActions()

      /**
       * The version of the SQL rules engine to use when evaluating the rule.
       *
       * The default value is 2015-10-08.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-awsiotsqlversion)
       */
      override fun awsIotSqlVersion(): String? = unwrap(this).getAwsIotSqlVersion()

      /**
       * The description of the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The action to take when an error occurs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-erroraction)
       */
      override fun errorAction(): Any? = unwrap(this).getErrorAction()

      /**
       * Specifies whether the rule is disabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-ruledisabled)
       */
      override fun ruleDisabled(): Any? = unwrap(this).getRuleDisabled()

      /**
       * The SQL statement used to query the topic.
       *
       * For more information, see [AWS IoT SQL
       * Reference](https://docs.aws.amazon.com/iot/latest/developerguide/iot-sql-reference.html) in
       * the *AWS IoT Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-sql)
       */
      override fun sql(): String = unwrap(this).getSql()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicRulePayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty):
          TopicRulePayloadProperty = CdkObjectWrappers.wrap(cdkObject) as? TopicRulePayloadProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicRulePayloadProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.TopicRulePayloadProperty
    }
  }

  /**
   * Describes an action that writes data to an Amazon Kinesis Firehose stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * FirehoseActionProperty firehoseActionProperty = FirehoseActionProperty.builder()
   * .deliveryStreamName("deliveryStreamName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .batchMode(false)
   * .separator("separator")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html)
   */
  public interface FirehoseActionProperty {
    /**
     * Whether to deliver the Kinesis Data Firehose stream as a batch by using
     * [`PutRecordBatch`](https://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html)
     * . The default value is `false` .
     *
     * When `batchMode` is `true` and the rule's SQL statement evaluates to an Array, each Array
     * element forms one record in the
     * [`PutRecordBatch`](https://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html)
     * request. The resulting array can't have more than 500 records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-batchmode)
     */
    public fun batchMode(): Any? = unwrap(this).getBatchMode()

    /**
     * The delivery stream name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-deliverystreamname)
     */
    public fun deliveryStreamName(): String

    /**
     * The IAM role that grants access to the Amazon Kinesis Firehose stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * A character separator that will be used to separate records written to the Firehose stream.
     *
     * Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-separator)
     */
    public fun separator(): String? = unwrap(this).getSeparator()

    /**
     * A builder for [FirehoseActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchMode Whether to deliver the Kinesis Data Firehose stream as a batch by using
       * [`PutRecordBatch`](https://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html)
       * . The default value is `false` .
       * When `batchMode` is `true` and the rule's SQL statement evaluates to an Array, each Array
       * element forms one record in the
       * [`PutRecordBatch`](https://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html)
       * request. The resulting array can't have more than 500 records.
       */
      public fun batchMode(batchMode: Boolean)

      /**
       * @param batchMode Whether to deliver the Kinesis Data Firehose stream as a batch by using
       * [`PutRecordBatch`](https://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html)
       * . The default value is `false` .
       * When `batchMode` is `true` and the rule's SQL statement evaluates to an Array, each Array
       * element forms one record in the
       * [`PutRecordBatch`](https://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html)
       * request. The resulting array can't have more than 500 records.
       */
      public fun batchMode(batchMode: IResolvable)

      /**
       * @param deliveryStreamName The delivery stream name. 
       */
      public fun deliveryStreamName(deliveryStreamName: String)

      /**
       * @param roleArn The IAM role that grants access to the Amazon Kinesis Firehose stream. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param separator A character separator that will be used to separate records written to the
       * Firehose stream.
       * Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
       */
      public fun separator(separator: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.builder()

      /**
       * @param batchMode Whether to deliver the Kinesis Data Firehose stream as a batch by using
       * [`PutRecordBatch`](https://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html)
       * . The default value is `false` .
       * When `batchMode` is `true` and the rule's SQL statement evaluates to an Array, each Array
       * element forms one record in the
       * [`PutRecordBatch`](https://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html)
       * request. The resulting array can't have more than 500 records.
       */
      override fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
      }

      /**
       * @param batchMode Whether to deliver the Kinesis Data Firehose stream as a batch by using
       * [`PutRecordBatch`](https://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html)
       * . The default value is `false` .
       * When `batchMode` is `true` and the rule's SQL statement evaluates to an Array, each Array
       * element forms one record in the
       * [`PutRecordBatch`](https://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html)
       * request. The resulting array can't have more than 500 records.
       */
      override fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode.let(IResolvable::unwrap))
      }

      /**
       * @param deliveryStreamName The delivery stream name. 
       */
      override fun deliveryStreamName(deliveryStreamName: String) {
        cdkBuilder.deliveryStreamName(deliveryStreamName)
      }

      /**
       * @param roleArn The IAM role that grants access to the Amazon Kinesis Firehose stream. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param separator A character separator that will be used to separate records written to the
       * Firehose stream.
       * Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
       */
      override fun separator(separator: String) {
        cdkBuilder.separator(separator)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty,
    ) : CdkObject(cdkObject), FirehoseActionProperty {
      /**
       * Whether to deliver the Kinesis Data Firehose stream as a batch by using
       * [`PutRecordBatch`](https://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html)
       * . The default value is `false` .
       *
       * When `batchMode` is `true` and the rule's SQL statement evaluates to an Array, each Array
       * element forms one record in the
       * [`PutRecordBatch`](https://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html)
       * request. The resulting array can't have more than 500 records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-batchmode)
       */
      override fun batchMode(): Any? = unwrap(this).getBatchMode()

      /**
       * The delivery stream name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-deliverystreamname)
       */
      override fun deliveryStreamName(): String = unwrap(this).getDeliveryStreamName()

      /**
       * The IAM role that grants access to the Amazon Kinesis Firehose stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * A character separator that will be used to separate records written to the Firehose stream.
       *
       * Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html#cfn-iot-topicrule-firehoseaction-separator)
       */
      override fun separator(): String? = unwrap(this).getSeparator()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty):
          FirehoseActionProperty = CdkObjectWrappers.wrap(cdkObject) as? FirehoseActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirehoseActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty
    }
  }

  /**
   * Describes an action to publish data to an Amazon SQS queue.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * SqsActionProperty sqsActionProperty = SqsActionProperty.builder()
   * .queueUrl("queueUrl")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .useBase64(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html)
   */
  public interface SqsActionProperty {
    /**
     * The URL of the Amazon SQS queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-queueurl)
     */
    public fun queueUrl(): String

    /**
     * The ARN of the IAM role that grants access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * Specifies whether to use Base64 encoding.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-usebase64)
     */
    public fun useBase64(): Any? = unwrap(this).getUseBase64()

    /**
     * A builder for [SqsActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param queueUrl The URL of the Amazon SQS queue. 
       */
      public fun queueUrl(queueUrl: String)

      /**
       * @param roleArn The ARN of the IAM role that grants access. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param useBase64 Specifies whether to use Base64 encoding.
       */
      public fun useBase64(useBase64: Boolean)

      /**
       * @param useBase64 Specifies whether to use Base64 encoding.
       */
      public fun useBase64(useBase64: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty.builder()

      /**
       * @param queueUrl The URL of the Amazon SQS queue. 
       */
      override fun queueUrl(queueUrl: String) {
        cdkBuilder.queueUrl(queueUrl)
      }

      /**
       * @param roleArn The ARN of the IAM role that grants access. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param useBase64 Specifies whether to use Base64 encoding.
       */
      override fun useBase64(useBase64: Boolean) {
        cdkBuilder.useBase64(useBase64)
      }

      /**
       * @param useBase64 Specifies whether to use Base64 encoding.
       */
      override fun useBase64(useBase64: IResolvable) {
        cdkBuilder.useBase64(useBase64.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty,
    ) : CdkObject(cdkObject), SqsActionProperty {
      /**
       * The URL of the Amazon SQS queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-queueurl)
       */
      override fun queueUrl(): String = unwrap(this).getQueueUrl()

      /**
       * The ARN of the IAM role that grants access.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * Specifies whether to use Base64 encoding.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html#cfn-iot-topicrule-sqsaction-usebase64)
       */
      override fun useBase64(): Any? = unwrap(this).getUseBase64()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SqsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty):
          SqsActionProperty = CdkObjectWrappers.wrap(cdkObject) as? SqsActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnTopicRule.SqsActionProperty
    }
  }

  /**
   * Describes an action that writes data to an Amazon OpenSearch Service domain.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * OpenSearchActionProperty openSearchActionProperty = OpenSearchActionProperty.builder()
   * .endpoint("endpoint")
   * .id("id")
   * .index("index")
   * .roleArn("roleArn")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-opensearchaction.html)
   */
  public interface OpenSearchActionProperty {
    /**
     * The endpoint of your OpenSearch domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-opensearchaction.html#cfn-iot-topicrule-opensearchaction-endpoint)
     */
    public fun endpoint(): String

    /**
     * The unique identifier for the document you are storing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-opensearchaction.html#cfn-iot-topicrule-opensearchaction-id)
     */
    public fun id(): String

    /**
     * The OpenSearch index where you want to store your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-opensearchaction.html#cfn-iot-topicrule-opensearchaction-index)
     */
    public fun index(): String

    /**
     * The IAM role ARN that has access to OpenSearch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-opensearchaction.html#cfn-iot-topicrule-opensearchaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * The type of document you are storing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-opensearchaction.html#cfn-iot-topicrule-opensearchaction-type)
     */
    public fun type(): String

    /**
     * A builder for [OpenSearchActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpoint The endpoint of your OpenSearch domain. 
       */
      public fun endpoint(endpoint: String)

      /**
       * @param id The unique identifier for the document you are storing. 
       */
      public fun id(id: String)

      /**
       * @param index The OpenSearch index where you want to store your data. 
       */
      public fun index(index: String)

      /**
       * @param roleArn The IAM role ARN that has access to OpenSearch. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param type The type of document you are storing. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty.builder()

      /**
       * @param endpoint The endpoint of your OpenSearch domain. 
       */
      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      /**
       * @param id The unique identifier for the document you are storing. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param index The OpenSearch index where you want to store your data. 
       */
      override fun index(index: String) {
        cdkBuilder.index(index)
      }

      /**
       * @param roleArn The IAM role ARN that has access to OpenSearch. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param type The type of document you are storing. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty,
    ) : CdkObject(cdkObject), OpenSearchActionProperty {
      /**
       * The endpoint of your OpenSearch domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-opensearchaction.html#cfn-iot-topicrule-opensearchaction-endpoint)
       */
      override fun endpoint(): String = unwrap(this).getEndpoint()

      /**
       * The unique identifier for the document you are storing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-opensearchaction.html#cfn-iot-topicrule-opensearchaction-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The OpenSearch index where you want to store your data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-opensearchaction.html#cfn-iot-topicrule-opensearchaction-index)
       */
      override fun index(): String = unwrap(this).getIndex()

      /**
       * The IAM role ARN that has access to OpenSearch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-opensearchaction.html#cfn-iot-topicrule-opensearchaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The type of document you are storing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-opensearchaction.html#cfn-iot-topicrule-opensearchaction-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OpenSearchActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty):
          OpenSearchActionProperty = CdkObjectWrappers.wrap(cdkObject) as? OpenSearchActionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenSearchActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.OpenSearchActionProperty
    }
  }

  /**
   * Describes an action to write to a DynamoDB table.
   *
   * This DynamoDB action writes each attribute in the message payload into it's own column in the
   * DynamoDB table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * DynamoDBv2ActionProperty dynamoDBv2ActionProperty = DynamoDBv2ActionProperty.builder()
   * .putItem(PutItemInputProperty.builder()
   * .tableName("tableName")
   * .build())
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html)
   */
  public interface DynamoDBv2ActionProperty {
    /**
     * Specifies the DynamoDB table to which the message data will be written. For example:.
     *
     * `{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table"
     * } } }`
     *
     * Each attribute in the message payload will be written to a separate column in the DynamoDB
     * database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html#cfn-iot-topicrule-dynamodbv2action-putitem)
     */
    public fun putItem(): Any? = unwrap(this).getPutItem()

    /**
     * The ARN of the IAM role that grants access to the DynamoDB table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html#cfn-iot-topicrule-dynamodbv2action-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * A builder for [DynamoDBv2ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param putItem Specifies the DynamoDB table to which the message data will be written. For
       * example:.
       * `{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName":
       * "my-table" } } }`
       *
       * Each attribute in the message payload will be written to a separate column in the DynamoDB
       * database.
       */
      public fun putItem(putItem: IResolvable)

      /**
       * @param putItem Specifies the DynamoDB table to which the message data will be written. For
       * example:.
       * `{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName":
       * "my-table" } } }`
       *
       * Each attribute in the message payload will be written to a separate column in the DynamoDB
       * database.
       */
      public fun putItem(putItem: PutItemInputProperty)

      /**
       * @param putItem Specifies the DynamoDB table to which the message data will be written. For
       * example:.
       * `{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName":
       * "my-table" } } }`
       *
       * Each attribute in the message payload will be written to a separate column in the DynamoDB
       * database.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("617e1a58adc917f0156f89c39c5b6b961587d2e600c94285ba7a7cb84c4d68a1")
      public fun putItem(putItem: PutItemInputProperty.Builder.() -> Unit)

      /**
       * @param roleArn The ARN of the IAM role that grants access to the DynamoDB table.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty.builder()

      /**
       * @param putItem Specifies the DynamoDB table to which the message data will be written. For
       * example:.
       * `{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName":
       * "my-table" } } }`
       *
       * Each attribute in the message payload will be written to a separate column in the DynamoDB
       * database.
       */
      override fun putItem(putItem: IResolvable) {
        cdkBuilder.putItem(putItem.let(IResolvable::unwrap))
      }

      /**
       * @param putItem Specifies the DynamoDB table to which the message data will be written. For
       * example:.
       * `{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName":
       * "my-table" } } }`
       *
       * Each attribute in the message payload will be written to a separate column in the DynamoDB
       * database.
       */
      override fun putItem(putItem: PutItemInputProperty) {
        cdkBuilder.putItem(putItem.let(PutItemInputProperty::unwrap))
      }

      /**
       * @param putItem Specifies the DynamoDB table to which the message data will be written. For
       * example:.
       * `{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName":
       * "my-table" } } }`
       *
       * Each attribute in the message payload will be written to a separate column in the DynamoDB
       * database.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("617e1a58adc917f0156f89c39c5b6b961587d2e600c94285ba7a7cb84c4d68a1")
      override fun putItem(putItem: PutItemInputProperty.Builder.() -> Unit): Unit =
          putItem(PutItemInputProperty(putItem))

      /**
       * @param roleArn The ARN of the IAM role that grants access to the DynamoDB table.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty,
    ) : CdkObject(cdkObject), DynamoDBv2ActionProperty {
      /**
       * Specifies the DynamoDB table to which the message data will be written. For example:.
       *
       * `{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName":
       * "my-table" } } }`
       *
       * Each attribute in the message payload will be written to a separate column in the DynamoDB
       * database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html#cfn-iot-topicrule-dynamodbv2action-putitem)
       */
      override fun putItem(): Any? = unwrap(this).getPutItem()

      /**
       * The ARN of the IAM role that grants access to the DynamoDB table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html#cfn-iot-topicrule-dynamodbv2action-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBv2ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty):
          DynamoDBv2ActionProperty = CdkObjectWrappers.wrap(cdkObject) as? DynamoDBv2ActionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBv2ActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBv2ActionProperty
    }
  }

  /**
   * Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or self-managed
   * Apache Kafka cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * KafkaActionProperty kafkaActionProperty = KafkaActionProperty.builder()
   * .clientProperties(Map.of(
   * "clientPropertiesKey", "clientProperties"))
   * .destinationArn("destinationArn")
   * .topic("topic")
   * // the properties below are optional
   * .headers(List.of(KafkaActionHeaderProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .key("key")
   * .partition("partition")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaaction.html)
   */
  public interface KafkaActionProperty {
    /**
     * Properties of the Apache Kafka producer client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaaction.html#cfn-iot-topicrule-kafkaaction-clientproperties)
     */
    public fun clientProperties(): Any

    /**
     * The ARN of Kafka action's VPC `TopicRuleDestination` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaaction.html#cfn-iot-topicrule-kafkaaction-destinationarn)
     */
    public fun destinationArn(): String

    /**
     * The list of Kafka headers that you specify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaaction.html#cfn-iot-topicrule-kafkaaction-headers)
     */
    public fun headers(): Any? = unwrap(this).getHeaders()

    /**
     * The Kafka message key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaaction.html#cfn-iot-topicrule-kafkaaction-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The Kafka message partition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaaction.html#cfn-iot-topicrule-kafkaaction-partition)
     */
    public fun partition(): String? = unwrap(this).getPartition()

    /**
     * The Kafka topic for messages to be sent to the Kafka broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaaction.html#cfn-iot-topicrule-kafkaaction-topic)
     */
    public fun topic(): String

    /**
     * A builder for [KafkaActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientProperties Properties of the Apache Kafka producer client. 
       */
      public fun clientProperties(clientProperties: IResolvable)

      /**
       * @param clientProperties Properties of the Apache Kafka producer client. 
       */
      public fun clientProperties(clientProperties: Map<String, String>)

      /**
       * @param destinationArn The ARN of Kafka action's VPC `TopicRuleDestination` . 
       */
      public fun destinationArn(destinationArn: String)

      /**
       * @param headers The list of Kafka headers that you specify.
       */
      public fun headers(headers: IResolvable)

      /**
       * @param headers The list of Kafka headers that you specify.
       */
      public fun headers(headers: List<Any>)

      /**
       * @param headers The list of Kafka headers that you specify.
       */
      public fun headers(vararg headers: Any)

      /**
       * @param key The Kafka message key.
       */
      public fun key(key: String)

      /**
       * @param partition The Kafka message partition.
       */
      public fun partition(partition: String)

      /**
       * @param topic The Kafka topic for messages to be sent to the Kafka broker. 
       */
      public fun topic(topic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty.builder()

      /**
       * @param clientProperties Properties of the Apache Kafka producer client. 
       */
      override fun clientProperties(clientProperties: IResolvable) {
        cdkBuilder.clientProperties(clientProperties.let(IResolvable::unwrap))
      }

      /**
       * @param clientProperties Properties of the Apache Kafka producer client. 
       */
      override fun clientProperties(clientProperties: Map<String, String>) {
        cdkBuilder.clientProperties(clientProperties)
      }

      /**
       * @param destinationArn The ARN of Kafka action's VPC `TopicRuleDestination` . 
       */
      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      /**
       * @param headers The list of Kafka headers that you specify.
       */
      override fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers.let(IResolvable::unwrap))
      }

      /**
       * @param headers The list of Kafka headers that you specify.
       */
      override fun headers(headers: List<Any>) {
        cdkBuilder.headers(headers)
      }

      /**
       * @param headers The list of Kafka headers that you specify.
       */
      override fun headers(vararg headers: Any): Unit = headers(headers.toList())

      /**
       * @param key The Kafka message key.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param partition The Kafka message partition.
       */
      override fun partition(partition: String) {
        cdkBuilder.partition(partition)
      }

      /**
       * @param topic The Kafka topic for messages to be sent to the Kafka broker. 
       */
      override fun topic(topic: String) {
        cdkBuilder.topic(topic)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty,
    ) : CdkObject(cdkObject), KafkaActionProperty {
      /**
       * Properties of the Apache Kafka producer client.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaaction.html#cfn-iot-topicrule-kafkaaction-clientproperties)
       */
      override fun clientProperties(): Any = unwrap(this).getClientProperties()

      /**
       * The ARN of Kafka action's VPC `TopicRuleDestination` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaaction.html#cfn-iot-topicrule-kafkaaction-destinationarn)
       */
      override fun destinationArn(): String = unwrap(this).getDestinationArn()

      /**
       * The list of Kafka headers that you specify.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaaction.html#cfn-iot-topicrule-kafkaaction-headers)
       */
      override fun headers(): Any? = unwrap(this).getHeaders()

      /**
       * The Kafka message key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaaction.html#cfn-iot-topicrule-kafkaaction-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The Kafka message partition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaaction.html#cfn-iot-topicrule-kafkaaction-partition)
       */
      override fun partition(): String? = unwrap(this).getPartition()

      /**
       * The Kafka topic for messages to be sent to the Kafka broker.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaaction.html#cfn-iot-topicrule-kafkaaction-topic)
       */
      override fun topic(): String = unwrap(this).getTopic()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KafkaActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty):
          KafkaActionProperty = CdkObjectWrappers.wrap(cdkObject) as? KafkaActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty
    }
  }

  /**
   * Describes an action that updates a CloudWatch log.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * CloudwatchLogsActionProperty cloudwatchLogsActionProperty =
   * CloudwatchLogsActionProperty.builder()
   * .logGroupName("logGroupName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .batchMode(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchlogsaction.html)
   */
  public interface CloudwatchLogsActionProperty {
    /**
     * Indicates whether batches of log records will be extracted and uploaded into CloudWatch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchlogsaction.html#cfn-iot-topicrule-cloudwatchlogsaction-batchmode)
     */
    public fun batchMode(): Any? = unwrap(this).getBatchMode()

    /**
     * The CloudWatch log name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchlogsaction.html#cfn-iot-topicrule-cloudwatchlogsaction-loggroupname)
     */
    public fun logGroupName(): String

    /**
     * The IAM role that allows access to the CloudWatch log.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchlogsaction.html#cfn-iot-topicrule-cloudwatchlogsaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [CloudwatchLogsActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchMode Indicates whether batches of log records will be extracted and uploaded
       * into CloudWatch.
       */
      public fun batchMode(batchMode: Boolean)

      /**
       * @param batchMode Indicates whether batches of log records will be extracted and uploaded
       * into CloudWatch.
       */
      public fun batchMode(batchMode: IResolvable)

      /**
       * @param logGroupName The CloudWatch log name. 
       */
      public fun logGroupName(logGroupName: String)

      /**
       * @param roleArn The IAM role that allows access to the CloudWatch log. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty.builder()

      /**
       * @param batchMode Indicates whether batches of log records will be extracted and uploaded
       * into CloudWatch.
       */
      override fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
      }

      /**
       * @param batchMode Indicates whether batches of log records will be extracted and uploaded
       * into CloudWatch.
       */
      override fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode.let(IResolvable::unwrap))
      }

      /**
       * @param logGroupName The CloudWatch log name. 
       */
      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      /**
       * @param roleArn The IAM role that allows access to the CloudWatch log. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty,
    ) : CdkObject(cdkObject), CloudwatchLogsActionProperty {
      /**
       * Indicates whether batches of log records will be extracted and uploaded into CloudWatch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchlogsaction.html#cfn-iot-topicrule-cloudwatchlogsaction-batchmode)
       */
      override fun batchMode(): Any? = unwrap(this).getBatchMode()

      /**
       * The CloudWatch log name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchlogsaction.html#cfn-iot-topicrule-cloudwatchlogsaction-loggroupname)
       */
      override fun logGroupName(): String = unwrap(this).getLogGroupName()

      /**
       * The IAM role that allows access to the CloudWatch log.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchlogsaction.html#cfn-iot-topicrule-cloudwatchlogsaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudwatchLogsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty):
          CloudwatchLogsActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudwatchLogsActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudwatchLogsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty
    }
  }

  /**
   * An asset property value entry containing the following information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * PutAssetPropertyValueEntryProperty putAssetPropertyValueEntryProperty =
   * PutAssetPropertyValueEntryProperty.builder()
   * .propertyValues(List.of(AssetPropertyValueProperty.builder()
   * .timestamp(AssetPropertyTimestampProperty.builder()
   * .timeInSeconds("timeInSeconds")
   * // the properties below are optional
   * .offsetInNanos("offsetInNanos")
   * .build())
   * .value(AssetPropertyVariantProperty.builder()
   * .booleanValue("booleanValue")
   * .doubleValue("doubleValue")
   * .integerValue("integerValue")
   * .stringValue("stringValue")
   * .build())
   * // the properties below are optional
   * .quality("quality")
   * .build()))
   * // the properties below are optional
   * .assetId("assetId")
   * .entryId("entryId")
   * .propertyAlias("propertyAlias")
   * .propertyId("propertyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html)
   */
  public interface PutAssetPropertyValueEntryProperty {
    /**
     * The ID of the AWS IoT SiteWise asset.
     *
     * You must specify either a `propertyAlias` or both an `aliasId` and a `propertyId` . Accepts
     * substitution templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-assetid)
     */
    public fun assetId(): String? = unwrap(this).getAssetId()

    /**
     * Optional.
     *
     * A unique identifier for this entry that you can define to better track which message caused
     * an error in case of failure. Accepts substitution templates. Defaults to a new UUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-entryid)
     */
    public fun entryId(): String? = unwrap(this).getEntryId()

    /**
     * The name of the property alias associated with your asset property.
     *
     * You must specify either a `propertyAlias` or both an `aliasId` and a `propertyId` . Accepts
     * substitution templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyalias)
     */
    public fun propertyAlias(): String? = unwrap(this).getPropertyAlias()

    /**
     * The ID of the asset's property.
     *
     * You must specify either a `propertyAlias` or both an `aliasId` and a `propertyId` . Accepts
     * substitution templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyid)
     */
    public fun propertyId(): String? = unwrap(this).getPropertyId()

    /**
     * A list of property values to insert that each contain timestamp, quality, and value (TQV)
     * information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyvalues)
     */
    public fun propertyValues(): Any

    /**
     * A builder for [PutAssetPropertyValueEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param assetId The ID of the AWS IoT SiteWise asset.
       * You must specify either a `propertyAlias` or both an `aliasId` and a `propertyId` . Accepts
       * substitution templates.
       */
      public fun assetId(assetId: String)

      /**
       * @param entryId Optional.
       * A unique identifier for this entry that you can define to better track which message caused
       * an error in case of failure. Accepts substitution templates. Defaults to a new UUID.
       */
      public fun entryId(entryId: String)

      /**
       * @param propertyAlias The name of the property alias associated with your asset property.
       * You must specify either a `propertyAlias` or both an `aliasId` and a `propertyId` . Accepts
       * substitution templates.
       */
      public fun propertyAlias(propertyAlias: String)

      /**
       * @param propertyId The ID of the asset's property.
       * You must specify either a `propertyAlias` or both an `aliasId` and a `propertyId` . Accepts
       * substitution templates.
       */
      public fun propertyId(propertyId: String)

      /**
       * @param propertyValues A list of property values to insert that each contain timestamp,
       * quality, and value (TQV) information. 
       */
      public fun propertyValues(propertyValues: IResolvable)

      /**
       * @param propertyValues A list of property values to insert that each contain timestamp,
       * quality, and value (TQV) information. 
       */
      public fun propertyValues(propertyValues: List<Any>)

      /**
       * @param propertyValues A list of property values to insert that each contain timestamp,
       * quality, and value (TQV) information. 
       */
      public fun propertyValues(vararg propertyValues: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty.builder()

      /**
       * @param assetId The ID of the AWS IoT SiteWise asset.
       * You must specify either a `propertyAlias` or both an `aliasId` and a `propertyId` . Accepts
       * substitution templates.
       */
      override fun assetId(assetId: String) {
        cdkBuilder.assetId(assetId)
      }

      /**
       * @param entryId Optional.
       * A unique identifier for this entry that you can define to better track which message caused
       * an error in case of failure. Accepts substitution templates. Defaults to a new UUID.
       */
      override fun entryId(entryId: String) {
        cdkBuilder.entryId(entryId)
      }

      /**
       * @param propertyAlias The name of the property alias associated with your asset property.
       * You must specify either a `propertyAlias` or both an `aliasId` and a `propertyId` . Accepts
       * substitution templates.
       */
      override fun propertyAlias(propertyAlias: String) {
        cdkBuilder.propertyAlias(propertyAlias)
      }

      /**
       * @param propertyId The ID of the asset's property.
       * You must specify either a `propertyAlias` or both an `aliasId` and a `propertyId` . Accepts
       * substitution templates.
       */
      override fun propertyId(propertyId: String) {
        cdkBuilder.propertyId(propertyId)
      }

      /**
       * @param propertyValues A list of property values to insert that each contain timestamp,
       * quality, and value (TQV) information. 
       */
      override fun propertyValues(propertyValues: IResolvable) {
        cdkBuilder.propertyValues(propertyValues.let(IResolvable::unwrap))
      }

      /**
       * @param propertyValues A list of property values to insert that each contain timestamp,
       * quality, and value (TQV) information. 
       */
      override fun propertyValues(propertyValues: List<Any>) {
        cdkBuilder.propertyValues(propertyValues)
      }

      /**
       * @param propertyValues A list of property values to insert that each contain timestamp,
       * quality, and value (TQV) information. 
       */
      override fun propertyValues(vararg propertyValues: Any): Unit =
          propertyValues(propertyValues.toList())

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty,
    ) : CdkObject(cdkObject), PutAssetPropertyValueEntryProperty {
      /**
       * The ID of the AWS IoT SiteWise asset.
       *
       * You must specify either a `propertyAlias` or both an `aliasId` and a `propertyId` . Accepts
       * substitution templates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-assetid)
       */
      override fun assetId(): String? = unwrap(this).getAssetId()

      /**
       * Optional.
       *
       * A unique identifier for this entry that you can define to better track which message caused
       * an error in case of failure. Accepts substitution templates. Defaults to a new UUID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-entryid)
       */
      override fun entryId(): String? = unwrap(this).getEntryId()

      /**
       * The name of the property alias associated with your asset property.
       *
       * You must specify either a `propertyAlias` or both an `aliasId` and a `propertyId` . Accepts
       * substitution templates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyalias)
       */
      override fun propertyAlias(): String? = unwrap(this).getPropertyAlias()

      /**
       * The ID of the asset's property.
       *
       * You must specify either a `propertyAlias` or both an `aliasId` and a `propertyId` . Accepts
       * substitution templates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyid)
       */
      override fun propertyId(): String? = unwrap(this).getPropertyId()

      /**
       * A list of property values to insert that each contain timestamp, quality, and value (TQV)
       * information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putassetpropertyvalueentry.html#cfn-iot-topicrule-putassetpropertyvalueentry-propertyvalues)
       */
      override fun propertyValues(): Any = unwrap(this).getPropertyValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PutAssetPropertyValueEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty):
          PutAssetPropertyValueEntryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PutAssetPropertyValueEntryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PutAssetPropertyValueEntryProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.PutAssetPropertyValueEntryProperty
    }
  }

  /**
   * An asset property timestamp entry containing the following information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * AssetPropertyTimestampProperty assetPropertyTimestampProperty =
   * AssetPropertyTimestampProperty.builder()
   * .timeInSeconds("timeInSeconds")
   * // the properties below are optional
   * .offsetInNanos("offsetInNanos")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html)
   */
  public interface AssetPropertyTimestampProperty {
    /**
     * Optional.
     *
     * A string that contains the nanosecond time offset. Accepts substitution templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html#cfn-iot-topicrule-assetpropertytimestamp-offsetinnanos)
     */
    public fun offsetInNanos(): String? = unwrap(this).getOffsetInNanos()

    /**
     * A string that contains the time in seconds since epoch.
     *
     * Accepts substitution templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html#cfn-iot-topicrule-assetpropertytimestamp-timeinseconds)
     */
    public fun timeInSeconds(): String

    /**
     * A builder for [AssetPropertyTimestampProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param offsetInNanos Optional.
       * A string that contains the nanosecond time offset. Accepts substitution templates.
       */
      public fun offsetInNanos(offsetInNanos: String)

      /**
       * @param timeInSeconds A string that contains the time in seconds since epoch. 
       * Accepts substitution templates.
       */
      public fun timeInSeconds(timeInSeconds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty.builder()

      /**
       * @param offsetInNanos Optional.
       * A string that contains the nanosecond time offset. Accepts substitution templates.
       */
      override fun offsetInNanos(offsetInNanos: String) {
        cdkBuilder.offsetInNanos(offsetInNanos)
      }

      /**
       * @param timeInSeconds A string that contains the time in seconds since epoch. 
       * Accepts substitution templates.
       */
      override fun timeInSeconds(timeInSeconds: String) {
        cdkBuilder.timeInSeconds(timeInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty,
    ) : CdkObject(cdkObject), AssetPropertyTimestampProperty {
      /**
       * Optional.
       *
       * A string that contains the nanosecond time offset. Accepts substitution templates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html#cfn-iot-topicrule-assetpropertytimestamp-offsetinnanos)
       */
      override fun offsetInNanos(): String? = unwrap(this).getOffsetInNanos()

      /**
       * A string that contains the time in seconds since epoch.
       *
       * Accepts substitution templates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertytimestamp.html#cfn-iot-topicrule-assetpropertytimestamp-timeinseconds)
       */
      override fun timeInSeconds(): String = unwrap(this).getTimeInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyTimestampProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty):
          AssetPropertyTimestampProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AssetPropertyTimestampProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyTimestampProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyTimestampProperty
    }
  }

  /**
   * Describes an action that updates a CloudWatch alarm.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * CloudwatchAlarmActionProperty cloudwatchAlarmActionProperty =
   * CloudwatchAlarmActionProperty.builder()
   * .alarmName("alarmName")
   * .roleArn("roleArn")
   * .stateReason("stateReason")
   * .stateValue("stateValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html)
   */
  public interface CloudwatchAlarmActionProperty {
    /**
     * The CloudWatch alarm name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-alarmname)
     */
    public fun alarmName(): String

    /**
     * The IAM role that allows access to the CloudWatch alarm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * The reason for the alarm change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statereason)
     */
    public fun stateReason(): String

    /**
     * The value of the alarm state.
     *
     * Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statevalue)
     */
    public fun stateValue(): String

    /**
     * A builder for [CloudwatchAlarmActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarmName The CloudWatch alarm name. 
       */
      public fun alarmName(alarmName: String)

      /**
       * @param roleArn The IAM role that allows access to the CloudWatch alarm. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param stateReason The reason for the alarm change. 
       */
      public fun stateReason(stateReason: String)

      /**
       * @param stateValue The value of the alarm state. 
       * Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
       */
      public fun stateValue(stateValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.builder()

      /**
       * @param alarmName The CloudWatch alarm name. 
       */
      override fun alarmName(alarmName: String) {
        cdkBuilder.alarmName(alarmName)
      }

      /**
       * @param roleArn The IAM role that allows access to the CloudWatch alarm. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param stateReason The reason for the alarm change. 
       */
      override fun stateReason(stateReason: String) {
        cdkBuilder.stateReason(stateReason)
      }

      /**
       * @param stateValue The value of the alarm state. 
       * Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
       */
      override fun stateValue(stateValue: String) {
        cdkBuilder.stateValue(stateValue)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty,
    ) : CdkObject(cdkObject), CloudwatchAlarmActionProperty {
      /**
       * The CloudWatch alarm name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-alarmname)
       */
      override fun alarmName(): String = unwrap(this).getAlarmName()

      /**
       * The IAM role that allows access to the CloudWatch alarm.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The reason for the alarm change.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statereason)
       */
      override fun stateReason(): String = unwrap(this).getStateReason()

      /**
       * The value of the alarm state.
       *
       * Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html#cfn-iot-topicrule-cloudwatchalarmaction-statevalue)
       */
      override fun stateValue(): String = unwrap(this).getStateValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudwatchAlarmActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty):
          CloudwatchAlarmActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudwatchAlarmActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudwatchAlarmActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty
    }
  }

  /**
   * Describes an action to republish to another topic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * RepublishActionProperty republishActionProperty = RepublishActionProperty.builder()
   * .roleArn("roleArn")
   * .topic("topic")
   * // the properties below are optional
   * .headers(RepublishActionHeadersProperty.builder()
   * .contentType("contentType")
   * .correlationData("correlationData")
   * .messageExpiry("messageExpiry")
   * .payloadFormatIndicator("payloadFormatIndicator")
   * .responseTopic("responseTopic")
   * .userProperties(List.of(UserPropertyProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build())
   * .qos(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html)
   */
  public interface RepublishActionProperty {
    /**
     * MQTT Version 5.0 headers information. For more information, see
     * [MQTT](https://docs.aws.amazon.com//iot/latest/developerguide/mqtt.html) in the IoT Core
     * Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-headers)
     */
    public fun headers(): Any? = unwrap(this).getHeaders()

    /**
     * The Quality of Service (QoS) level to use when republishing messages.
     *
     * The default value is 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-qos)
     */
    public fun qos(): Number? = unwrap(this).getQos()

    /**
     * The ARN of the IAM role that grants access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * The name of the MQTT topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-topic)
     */
    public fun topic(): String

    /**
     * A builder for [RepublishActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param headers MQTT Version 5.0 headers information. For more information, see
       * [MQTT](https://docs.aws.amazon.com//iot/latest/developerguide/mqtt.html) in the IoT Core
       * Developer Guide.
       */
      public fun headers(headers: IResolvable)

      /**
       * @param headers MQTT Version 5.0 headers information. For more information, see
       * [MQTT](https://docs.aws.amazon.com//iot/latest/developerguide/mqtt.html) in the IoT Core
       * Developer Guide.
       */
      public fun headers(headers: RepublishActionHeadersProperty)

      /**
       * @param headers MQTT Version 5.0 headers information. For more information, see
       * [MQTT](https://docs.aws.amazon.com//iot/latest/developerguide/mqtt.html) in the IoT Core
       * Developer Guide.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8509a5f5d564844fd60f047bc4e233b3c06ba3e5ce62199852b89ecc6e93d827")
      public fun headers(headers: RepublishActionHeadersProperty.Builder.() -> Unit)

      /**
       * @param qos The Quality of Service (QoS) level to use when republishing messages.
       * The default value is 0.
       */
      public fun qos(qos: Number)

      /**
       * @param roleArn The ARN of the IAM role that grants access. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param topic The name of the MQTT topic. 
       */
      public fun topic(topic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty.builder()

      /**
       * @param headers MQTT Version 5.0 headers information. For more information, see
       * [MQTT](https://docs.aws.amazon.com//iot/latest/developerguide/mqtt.html) in the IoT Core
       * Developer Guide.
       */
      override fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers.let(IResolvable::unwrap))
      }

      /**
       * @param headers MQTT Version 5.0 headers information. For more information, see
       * [MQTT](https://docs.aws.amazon.com//iot/latest/developerguide/mqtt.html) in the IoT Core
       * Developer Guide.
       */
      override fun headers(headers: RepublishActionHeadersProperty) {
        cdkBuilder.headers(headers.let(RepublishActionHeadersProperty::unwrap))
      }

      /**
       * @param headers MQTT Version 5.0 headers information. For more information, see
       * [MQTT](https://docs.aws.amazon.com//iot/latest/developerguide/mqtt.html) in the IoT Core
       * Developer Guide.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8509a5f5d564844fd60f047bc4e233b3c06ba3e5ce62199852b89ecc6e93d827")
      override fun headers(headers: RepublishActionHeadersProperty.Builder.() -> Unit): Unit =
          headers(RepublishActionHeadersProperty(headers))

      /**
       * @param qos The Quality of Service (QoS) level to use when republishing messages.
       * The default value is 0.
       */
      override fun qos(qos: Number) {
        cdkBuilder.qos(qos)
      }

      /**
       * @param roleArn The ARN of the IAM role that grants access. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param topic The name of the MQTT topic. 
       */
      override fun topic(topic: String) {
        cdkBuilder.topic(topic)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty,
    ) : CdkObject(cdkObject), RepublishActionProperty {
      /**
       * MQTT Version 5.0 headers information. For more information, see
       * [MQTT](https://docs.aws.amazon.com//iot/latest/developerguide/mqtt.html) in the IoT Core
       * Developer Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-headers)
       */
      override fun headers(): Any? = unwrap(this).getHeaders()

      /**
       * The Quality of Service (QoS) level to use when republishing messages.
       *
       * The default value is 0.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-qos)
       */
      override fun qos(): Number? = unwrap(this).getQos()

      /**
       * The ARN of the IAM role that grants access.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The name of the MQTT topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-topic)
       */
      override fun topic(): String = unwrap(this).getTopic()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RepublishActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty):
          RepublishActionProperty = CdkObjectWrappers.wrap(cdkObject) as? RepublishActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepublishActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.RepublishActionProperty
    }
  }

  /**
   * Describes an action to write to a DynamoDB table.
   *
   * The `tableName` , `hashKeyField` , and `rangeKeyField` values must match the values used when
   * you created the table.
   *
   * The `hashKeyValue` and `rangeKeyvalue` fields use a substitution template syntax. These
   * templates provide data at runtime. The syntax is as follows: ${ *sql-expression* }.
   *
   * You can specify any valid expression in a WHERE or SELECT clause, including JSON properties,
   * comparisons, calculations, and functions. For example, the following field uses the third level of
   * the topic:
   *
   * `"hashKeyValue": "${topic(3)}"`
   *
   * The following field uses the timestamp:
   *
   * `"rangeKeyValue": "${timestamp()}"`
   *
   * For more information, see [DynamoDBv2
   * Action](https://docs.aws.amazon.com/iot/latest/developerguide/iot-rule-actions.html) in the *AWS
   * IoT Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * DynamoDBActionProperty dynamoDBActionProperty = DynamoDBActionProperty.builder()
   * .hashKeyField("hashKeyField")
   * .hashKeyValue("hashKeyValue")
   * .roleArn("roleArn")
   * .tableName("tableName")
   * // the properties below are optional
   * .hashKeyType("hashKeyType")
   * .payloadField("payloadField")
   * .rangeKeyField("rangeKeyField")
   * .rangeKeyType("rangeKeyType")
   * .rangeKeyValue("rangeKeyValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html)
   */
  public interface DynamoDBActionProperty {
    /**
     * The hash key name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyfield)
     */
    public fun hashKeyField(): String

    /**
     * The hash key type.
     *
     * Valid values are "STRING" or "NUMBER"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeytype)
     */
    public fun hashKeyType(): String? = unwrap(this).getHashKeyType()

    /**
     * The hash key value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyvalue)
     */
    public fun hashKeyValue(): String

    /**
     * The action payload.
     *
     * This name can be customized.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-payloadfield)
     */
    public fun payloadField(): String? = unwrap(this).getPayloadField()

    /**
     * The range key name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyfield)
     */
    public fun rangeKeyField(): String? = unwrap(this).getRangeKeyField()

    /**
     * The range key type.
     *
     * Valid values are "STRING" or "NUMBER"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeytype)
     */
    public fun rangeKeyType(): String? = unwrap(this).getRangeKeyType()

    /**
     * The range key value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyvalue)
     */
    public fun rangeKeyValue(): String? = unwrap(this).getRangeKeyValue()

    /**
     * The ARN of the IAM role that grants access to the DynamoDB table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * The name of the DynamoDB table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-tablename)
     */
    public fun tableName(): String

    /**
     * A builder for [DynamoDBActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hashKeyField The hash key name. 
       */
      public fun hashKeyField(hashKeyField: String)

      /**
       * @param hashKeyType The hash key type.
       * Valid values are "STRING" or "NUMBER"
       */
      public fun hashKeyType(hashKeyType: String)

      /**
       * @param hashKeyValue The hash key value. 
       */
      public fun hashKeyValue(hashKeyValue: String)

      /**
       * @param payloadField The action payload.
       * This name can be customized.
       */
      public fun payloadField(payloadField: String)

      /**
       * @param rangeKeyField The range key name.
       */
      public fun rangeKeyField(rangeKeyField: String)

      /**
       * @param rangeKeyType The range key type.
       * Valid values are "STRING" or "NUMBER"
       */
      public fun rangeKeyType(rangeKeyType: String)

      /**
       * @param rangeKeyValue The range key value.
       */
      public fun rangeKeyValue(rangeKeyValue: String)

      /**
       * @param roleArn The ARN of the IAM role that grants access to the DynamoDB table. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param tableName The name of the DynamoDB table. 
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty.builder()

      /**
       * @param hashKeyField The hash key name. 
       */
      override fun hashKeyField(hashKeyField: String) {
        cdkBuilder.hashKeyField(hashKeyField)
      }

      /**
       * @param hashKeyType The hash key type.
       * Valid values are "STRING" or "NUMBER"
       */
      override fun hashKeyType(hashKeyType: String) {
        cdkBuilder.hashKeyType(hashKeyType)
      }

      /**
       * @param hashKeyValue The hash key value. 
       */
      override fun hashKeyValue(hashKeyValue: String) {
        cdkBuilder.hashKeyValue(hashKeyValue)
      }

      /**
       * @param payloadField The action payload.
       * This name can be customized.
       */
      override fun payloadField(payloadField: String) {
        cdkBuilder.payloadField(payloadField)
      }

      /**
       * @param rangeKeyField The range key name.
       */
      override fun rangeKeyField(rangeKeyField: String) {
        cdkBuilder.rangeKeyField(rangeKeyField)
      }

      /**
       * @param rangeKeyType The range key type.
       * Valid values are "STRING" or "NUMBER"
       */
      override fun rangeKeyType(rangeKeyType: String) {
        cdkBuilder.rangeKeyType(rangeKeyType)
      }

      /**
       * @param rangeKeyValue The range key value.
       */
      override fun rangeKeyValue(rangeKeyValue: String) {
        cdkBuilder.rangeKeyValue(rangeKeyValue)
      }

      /**
       * @param roleArn The ARN of the IAM role that grants access to the DynamoDB table. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param tableName The name of the DynamoDB table. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty,
    ) : CdkObject(cdkObject), DynamoDBActionProperty {
      /**
       * The hash key name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyfield)
       */
      override fun hashKeyField(): String = unwrap(this).getHashKeyField()

      /**
       * The hash key type.
       *
       * Valid values are "STRING" or "NUMBER"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeytype)
       */
      override fun hashKeyType(): String? = unwrap(this).getHashKeyType()

      /**
       * The hash key value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-hashkeyvalue)
       */
      override fun hashKeyValue(): String = unwrap(this).getHashKeyValue()

      /**
       * The action payload.
       *
       * This name can be customized.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-payloadfield)
       */
      override fun payloadField(): String? = unwrap(this).getPayloadField()

      /**
       * The range key name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyfield)
       */
      override fun rangeKeyField(): String? = unwrap(this).getRangeKeyField()

      /**
       * The range key type.
       *
       * Valid values are "STRING" or "NUMBER"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeytype)
       */
      override fun rangeKeyType(): String? = unwrap(this).getRangeKeyType()

      /**
       * The range key value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rangekeyvalue)
       */
      override fun rangeKeyValue(): String? = unwrap(this).getRangeKeyValue()

      /**
       * The ARN of the IAM role that grants access to the DynamoDB table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The name of the DynamoDB table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html#cfn-iot-topicrule-dynamodbaction-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty):
          DynamoDBActionProperty = CdkObjectWrappers.wrap(cdkObject) as? DynamoDBActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.DynamoDBActionProperty
    }
  }

  /**
   * For more information, see [Signature Version 4 signing
   * process](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * SigV4AuthorizationProperty sigV4AuthorizationProperty = SigV4AuthorizationProperty.builder()
   * .roleArn("roleArn")
   * .serviceName("serviceName")
   * .signingRegion("signingRegion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sigv4authorization.html)
   */
  public interface SigV4AuthorizationProperty {
    /**
     * The ARN of the signing role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sigv4authorization.html#cfn-iot-topicrule-sigv4authorization-rolearn)
     */
    public fun roleArn(): String

    /**
     * The service name to use while signing with Sig V4.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sigv4authorization.html#cfn-iot-topicrule-sigv4authorization-servicename)
     */
    public fun serviceName(): String

    /**
     * The signing region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sigv4authorization.html#cfn-iot-topicrule-sigv4authorization-signingregion)
     */
    public fun signingRegion(): String

    /**
     * A builder for [SigV4AuthorizationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param roleArn The ARN of the signing role. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param serviceName The service name to use while signing with Sig V4. 
       */
      public fun serviceName(serviceName: String)

      /**
       * @param signingRegion The signing region. 
       */
      public fun signingRegion(signingRegion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty.builder()

      /**
       * @param roleArn The ARN of the signing role. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param serviceName The service name to use while signing with Sig V4. 
       */
      override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      /**
       * @param signingRegion The signing region. 
       */
      override fun signingRegion(signingRegion: String) {
        cdkBuilder.signingRegion(signingRegion)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty,
    ) : CdkObject(cdkObject), SigV4AuthorizationProperty {
      /**
       * The ARN of the signing role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sigv4authorization.html#cfn-iot-topicrule-sigv4authorization-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The service name to use while signing with Sig V4.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sigv4authorization.html#cfn-iot-topicrule-sigv4authorization-servicename)
       */
      override fun serviceName(): String = unwrap(this).getServiceName()

      /**
       * The signing region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sigv4authorization.html#cfn-iot-topicrule-sigv4authorization-signingregion)
       */
      override fun signingRegion(): String = unwrap(this).getSigningRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SigV4AuthorizationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty):
          SigV4AuthorizationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SigV4AuthorizationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SigV4AuthorizationProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty
    }
  }

  /**
   * Send data to an HTTPS endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * HttpActionProperty httpActionProperty = HttpActionProperty.builder()
   * .url("url")
   * // the properties below are optional
   * .auth(HttpAuthorizationProperty.builder()
   * .sigv4(SigV4AuthorizationProperty.builder()
   * .roleArn("roleArn")
   * .serviceName("serviceName")
   * .signingRegion("signingRegion")
   * .build())
   * .build())
   * .confirmationUrl("confirmationUrl")
   * .headers(List.of(HttpActionHeaderProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html)
   */
  public interface HttpActionProperty {
    /**
     * The authentication method to use when sending data to an HTTPS endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-auth)
     */
    public fun auth(): Any? = unwrap(this).getAuth()

    /**
     * The URL to which AWS IoT sends a confirmation message.
     *
     * The value of the confirmation URL must be a prefix of the endpoint URL. If you do not specify
     * a confirmation URL AWS IoT uses the endpoint URL as the confirmation URL. If you use
     * substitution templates in the confirmationUrl, you must create and enable topic rule
     * destinations that match each possible value of the substitution template before traffic is
     * allowed to your endpoint URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-confirmationurl)
     */
    public fun confirmationUrl(): String? = unwrap(this).getConfirmationUrl()

    /**
     * The HTTP headers to send with the message data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-headers)
     */
    public fun headers(): Any? = unwrap(this).getHeaders()

    /**
     * The endpoint URL.
     *
     * If substitution templates are used in the URL, you must also specify a `confirmationUrl` . If
     * this is a new destination, a new `TopicRuleDestination` is created if possible.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-url)
     */
    public fun url(): String

    /**
     * A builder for [HttpActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param auth The authentication method to use when sending data to an HTTPS endpoint.
       */
      public fun auth(auth: IResolvable)

      /**
       * @param auth The authentication method to use when sending data to an HTTPS endpoint.
       */
      public fun auth(auth: HttpAuthorizationProperty)

      /**
       * @param auth The authentication method to use when sending data to an HTTPS endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe1895bf141ae6e75841bc4fb2d18f1438b51afa1677a87e878f530a0d045f1d")
      public fun auth(auth: HttpAuthorizationProperty.Builder.() -> Unit)

      /**
       * @param confirmationUrl The URL to which AWS IoT sends a confirmation message.
       * The value of the confirmation URL must be a prefix of the endpoint URL. If you do not
       * specify a confirmation URL AWS IoT uses the endpoint URL as the confirmation URL. If you use
       * substitution templates in the confirmationUrl, you must create and enable topic rule
       * destinations that match each possible value of the substitution template before traffic is
       * allowed to your endpoint URL.
       */
      public fun confirmationUrl(confirmationUrl: String)

      /**
       * @param headers The HTTP headers to send with the message data.
       */
      public fun headers(headers: IResolvable)

      /**
       * @param headers The HTTP headers to send with the message data.
       */
      public fun headers(headers: List<Any>)

      /**
       * @param headers The HTTP headers to send with the message data.
       */
      public fun headers(vararg headers: Any)

      /**
       * @param url The endpoint URL. 
       * If substitution templates are used in the URL, you must also specify a `confirmationUrl` .
       * If this is a new destination, a new `TopicRuleDestination` is created if possible.
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty.builder()

      /**
       * @param auth The authentication method to use when sending data to an HTTPS endpoint.
       */
      override fun auth(auth: IResolvable) {
        cdkBuilder.auth(auth.let(IResolvable::unwrap))
      }

      /**
       * @param auth The authentication method to use when sending data to an HTTPS endpoint.
       */
      override fun auth(auth: HttpAuthorizationProperty) {
        cdkBuilder.auth(auth.let(HttpAuthorizationProperty::unwrap))
      }

      /**
       * @param auth The authentication method to use when sending data to an HTTPS endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe1895bf141ae6e75841bc4fb2d18f1438b51afa1677a87e878f530a0d045f1d")
      override fun auth(auth: HttpAuthorizationProperty.Builder.() -> Unit): Unit =
          auth(HttpAuthorizationProperty(auth))

      /**
       * @param confirmationUrl The URL to which AWS IoT sends a confirmation message.
       * The value of the confirmation URL must be a prefix of the endpoint URL. If you do not
       * specify a confirmation URL AWS IoT uses the endpoint URL as the confirmation URL. If you use
       * substitution templates in the confirmationUrl, you must create and enable topic rule
       * destinations that match each possible value of the substitution template before traffic is
       * allowed to your endpoint URL.
       */
      override fun confirmationUrl(confirmationUrl: String) {
        cdkBuilder.confirmationUrl(confirmationUrl)
      }

      /**
       * @param headers The HTTP headers to send with the message data.
       */
      override fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers.let(IResolvable::unwrap))
      }

      /**
       * @param headers The HTTP headers to send with the message data.
       */
      override fun headers(headers: List<Any>) {
        cdkBuilder.headers(headers)
      }

      /**
       * @param headers The HTTP headers to send with the message data.
       */
      override fun headers(vararg headers: Any): Unit = headers(headers.toList())

      /**
       * @param url The endpoint URL. 
       * If substitution templates are used in the URL, you must also specify a `confirmationUrl` .
       * If this is a new destination, a new `TopicRuleDestination` is created if possible.
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty,
    ) : CdkObject(cdkObject), HttpActionProperty {
      /**
       * The authentication method to use when sending data to an HTTPS endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-auth)
       */
      override fun auth(): Any? = unwrap(this).getAuth()

      /**
       * The URL to which AWS IoT sends a confirmation message.
       *
       * The value of the confirmation URL must be a prefix of the endpoint URL. If you do not
       * specify a confirmation URL AWS IoT uses the endpoint URL as the confirmation URL. If you use
       * substitution templates in the confirmationUrl, you must create and enable topic rule
       * destinations that match each possible value of the substitution template before traffic is
       * allowed to your endpoint URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-confirmationurl)
       */
      override fun confirmationUrl(): String? = unwrap(this).getConfirmationUrl()

      /**
       * The HTTP headers to send with the message data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-headers)
       */
      override fun headers(): Any? = unwrap(this).getHeaders()

      /**
       * The endpoint URL.
       *
       * If substitution templates are used in the URL, you must also specify a `confirmationUrl` .
       * If this is a new destination, a new `TopicRuleDestination` is created if possible.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html#cfn-iot-topicrule-httpaction-url)
       */
      override fun url(): String = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty):
          HttpActionProperty = CdkObjectWrappers.wrap(cdkObject) as? HttpActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionProperty
    }
  }

  /**
   * Describes an action to send data from an MQTT message that triggered the rule to AWS IoT
   * SiteWise asset properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * IotSiteWiseActionProperty iotSiteWiseActionProperty = IotSiteWiseActionProperty.builder()
   * .putAssetPropertyValueEntries(List.of(PutAssetPropertyValueEntryProperty.builder()
   * .propertyValues(List.of(AssetPropertyValueProperty.builder()
   * .timestamp(AssetPropertyTimestampProperty.builder()
   * .timeInSeconds("timeInSeconds")
   * // the properties below are optional
   * .offsetInNanos("offsetInNanos")
   * .build())
   * .value(AssetPropertyVariantProperty.builder()
   * .booleanValue("booleanValue")
   * .doubleValue("doubleValue")
   * .integerValue("integerValue")
   * .stringValue("stringValue")
   * .build())
   * // the properties below are optional
   * .quality("quality")
   * .build()))
   * // the properties below are optional
   * .assetId("assetId")
   * .entryId("entryId")
   * .propertyAlias("propertyAlias")
   * .propertyId("propertyId")
   * .build()))
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html)
   */
  public interface IotSiteWiseActionProperty {
    /**
     * A list of asset property value entries.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html#cfn-iot-topicrule-iotsitewiseaction-putassetpropertyvalueentries)
     */
    public fun putAssetPropertyValueEntries(): Any

    /**
     * The ARN of the role that grants AWS IoT permission to send an asset property value to AWS IoT
     * SiteWise.
     *
     * ( `"Action": "iotsitewise:BatchPutAssetPropertyValue"` ). The trust policy can restrict
     * access to specific asset hierarchy paths.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html#cfn-iot-topicrule-iotsitewiseaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [IotSiteWiseActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param putAssetPropertyValueEntries A list of asset property value entries. 
       */
      public fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: IResolvable)

      /**
       * @param putAssetPropertyValueEntries A list of asset property value entries. 
       */
      public fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: List<Any>)

      /**
       * @param putAssetPropertyValueEntries A list of asset property value entries. 
       */
      public fun putAssetPropertyValueEntries(vararg putAssetPropertyValueEntries: Any)

      /**
       * @param roleArn The ARN of the role that grants AWS IoT permission to send an asset property
       * value to AWS IoT SiteWise. 
       * ( `"Action": "iotsitewise:BatchPutAssetPropertyValue"` ). The trust policy can restrict
       * access to specific asset hierarchy paths.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty.builder()

      /**
       * @param putAssetPropertyValueEntries A list of asset property value entries. 
       */
      override fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: IResolvable) {
        cdkBuilder.putAssetPropertyValueEntries(putAssetPropertyValueEntries.let(IResolvable::unwrap))
      }

      /**
       * @param putAssetPropertyValueEntries A list of asset property value entries. 
       */
      override fun putAssetPropertyValueEntries(putAssetPropertyValueEntries: List<Any>) {
        cdkBuilder.putAssetPropertyValueEntries(putAssetPropertyValueEntries)
      }

      /**
       * @param putAssetPropertyValueEntries A list of asset property value entries. 
       */
      override fun putAssetPropertyValueEntries(vararg putAssetPropertyValueEntries: Any): Unit =
          putAssetPropertyValueEntries(putAssetPropertyValueEntries.toList())

      /**
       * @param roleArn The ARN of the role that grants AWS IoT permission to send an asset property
       * value to AWS IoT SiteWise. 
       * ( `"Action": "iotsitewise:BatchPutAssetPropertyValue"` ). The trust policy can restrict
       * access to specific asset hierarchy paths.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty,
    ) : CdkObject(cdkObject), IotSiteWiseActionProperty {
      /**
       * A list of asset property value entries.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html#cfn-iot-topicrule-iotsitewiseaction-putassetpropertyvalueentries)
       */
      override fun putAssetPropertyValueEntries(): Any =
          unwrap(this).getPutAssetPropertyValueEntries()

      /**
       * The ARN of the role that grants AWS IoT permission to send an asset property value to AWS
       * IoT SiteWise.
       *
       * ( `"Action": "iotsitewise:BatchPutAssetPropertyValue"` ). The trust policy can restrict
       * access to specific asset hierarchy paths.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html#cfn-iot-topicrule-iotsitewiseaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IotSiteWiseActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty):
          IotSiteWiseActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IotSiteWiseActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotSiteWiseActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.IotSiteWiseActionProperty
    }
  }

  /**
   * An asset property value entry containing the following information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * AssetPropertyValueProperty assetPropertyValueProperty = AssetPropertyValueProperty.builder()
   * .timestamp(AssetPropertyTimestampProperty.builder()
   * .timeInSeconds("timeInSeconds")
   * // the properties below are optional
   * .offsetInNanos("offsetInNanos")
   * .build())
   * .value(AssetPropertyVariantProperty.builder()
   * .booleanValue("booleanValue")
   * .doubleValue("doubleValue")
   * .integerValue("integerValue")
   * .stringValue("stringValue")
   * .build())
   * // the properties below are optional
   * .quality("quality")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvalue.html)
   */
  public interface AssetPropertyValueProperty {
    /**
     * Optional.
     *
     * A string that describes the quality of the value. Accepts substitution templates. Must be
     * `GOOD` , `BAD` , or `UNCERTAIN` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvalue.html#cfn-iot-topicrule-assetpropertyvalue-quality)
     */
    public fun quality(): String? = unwrap(this).getQuality()

    /**
     * The asset property value timestamp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvalue.html#cfn-iot-topicrule-assetpropertyvalue-timestamp)
     */
    public fun timestamp(): Any

    /**
     * The value of the asset property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvalue.html#cfn-iot-topicrule-assetpropertyvalue-value)
     */
    public fun `value`(): Any

    /**
     * A builder for [AssetPropertyValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param quality Optional.
       * A string that describes the quality of the value. Accepts substitution templates. Must be
       * `GOOD` , `BAD` , or `UNCERTAIN` .
       */
      public fun quality(quality: String)

      /**
       * @param timestamp The asset property value timestamp. 
       */
      public fun timestamp(timestamp: IResolvable)

      /**
       * @param timestamp The asset property value timestamp. 
       */
      public fun timestamp(timestamp: AssetPropertyTimestampProperty)

      /**
       * @param timestamp The asset property value timestamp. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe07339b680ef5ffed57cc0c78abbc32650de3539ddbd5dae20830ebdc53cefc")
      public fun timestamp(timestamp: AssetPropertyTimestampProperty.Builder.() -> Unit)

      /**
       * @param value The value of the asset property. 
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value The value of the asset property. 
       */
      public fun `value`(`value`: AssetPropertyVariantProperty)

      /**
       * @param value The value of the asset property. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bc81754749f6a006f434cdbdacbaee93a5a433ffebfb388b8cd34c86c41bcc8")
      public fun `value`(`value`: AssetPropertyVariantProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty.builder()

      /**
       * @param quality Optional.
       * A string that describes the quality of the value. Accepts substitution templates. Must be
       * `GOOD` , `BAD` , or `UNCERTAIN` .
       */
      override fun quality(quality: String) {
        cdkBuilder.quality(quality)
      }

      /**
       * @param timestamp The asset property value timestamp. 
       */
      override fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp.let(IResolvable::unwrap))
      }

      /**
       * @param timestamp The asset property value timestamp. 
       */
      override fun timestamp(timestamp: AssetPropertyTimestampProperty) {
        cdkBuilder.timestamp(timestamp.let(AssetPropertyTimestampProperty::unwrap))
      }

      /**
       * @param timestamp The asset property value timestamp. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe07339b680ef5ffed57cc0c78abbc32650de3539ddbd5dae20830ebdc53cefc")
      override fun timestamp(timestamp: AssetPropertyTimestampProperty.Builder.() -> Unit): Unit =
          timestamp(AssetPropertyTimestampProperty(timestamp))

      /**
       * @param value The value of the asset property. 
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable::unwrap))
      }

      /**
       * @param value The value of the asset property. 
       */
      override fun `value`(`value`: AssetPropertyVariantProperty) {
        cdkBuilder.`value`(`value`.let(AssetPropertyVariantProperty::unwrap))
      }

      /**
       * @param value The value of the asset property. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bc81754749f6a006f434cdbdacbaee93a5a433ffebfb388b8cd34c86c41bcc8")
      override fun `value`(`value`: AssetPropertyVariantProperty.Builder.() -> Unit): Unit =
          `value`(AssetPropertyVariantProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty,
    ) : CdkObject(cdkObject), AssetPropertyValueProperty {
      /**
       * Optional.
       *
       * A string that describes the quality of the value. Accepts substitution templates. Must be
       * `GOOD` , `BAD` , or `UNCERTAIN` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvalue.html#cfn-iot-topicrule-assetpropertyvalue-quality)
       */
      override fun quality(): String? = unwrap(this).getQuality()

      /**
       * The asset property value timestamp.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvalue.html#cfn-iot-topicrule-assetpropertyvalue-timestamp)
       */
      override fun timestamp(): Any = unwrap(this).getTimestamp()

      /**
       * The value of the asset property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvalue.html#cfn-iot-topicrule-assetpropertyvalue-value)
       */
      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty):
          AssetPropertyValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AssetPropertyValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyValueProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyValueProperty
    }
  }

  /**
   * Starts execution of a Step Functions state machine.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * StepFunctionsActionProperty stepFunctionsActionProperty = StepFunctionsActionProperty.builder()
   * .roleArn("roleArn")
   * .stateMachineName("stateMachineName")
   * // the properties below are optional
   * .executionNamePrefix("executionNamePrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html)
   */
  public interface StepFunctionsActionProperty {
    /**
     * (Optional) A name will be given to the state machine execution consisting of this prefix
     * followed by a UUID.
     *
     * Step Functions automatically creates a unique name for each state machine execution if one is
     * not provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html#cfn-iot-topicrule-stepfunctionsaction-executionnameprefix)
     */
    public fun executionNamePrefix(): String? = unwrap(this).getExecutionNamePrefix()

    /**
     * The ARN of the role that grants IoT permission to start execution of a state machine
     * ("Action":"states:StartExecution").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html#cfn-iot-topicrule-stepfunctionsaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * The name of the Step Functions state machine whose execution will be started.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html#cfn-iot-topicrule-stepfunctionsaction-statemachinename)
     */
    public fun stateMachineName(): String

    /**
     * A builder for [StepFunctionsActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param executionNamePrefix (Optional) A name will be given to the state machine execution
       * consisting of this prefix followed by a UUID.
       * Step Functions automatically creates a unique name for each state machine execution if one
       * is not provided.
       */
      public fun executionNamePrefix(executionNamePrefix: String)

      /**
       * @param roleArn The ARN of the role that grants IoT permission to start execution of a state
       * machine ("Action":"states:StartExecution"). 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param stateMachineName The name of the Step Functions state machine whose execution will
       * be started. 
       */
      public fun stateMachineName(stateMachineName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty.builder()

      /**
       * @param executionNamePrefix (Optional) A name will be given to the state machine execution
       * consisting of this prefix followed by a UUID.
       * Step Functions automatically creates a unique name for each state machine execution if one
       * is not provided.
       */
      override fun executionNamePrefix(executionNamePrefix: String) {
        cdkBuilder.executionNamePrefix(executionNamePrefix)
      }

      /**
       * @param roleArn The ARN of the role that grants IoT permission to start execution of a state
       * machine ("Action":"states:StartExecution"). 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param stateMachineName The name of the Step Functions state machine whose execution will
       * be started. 
       */
      override fun stateMachineName(stateMachineName: String) {
        cdkBuilder.stateMachineName(stateMachineName)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty,
    ) : CdkObject(cdkObject), StepFunctionsActionProperty {
      /**
       * (Optional) A name will be given to the state machine execution consisting of this prefix
       * followed by a UUID.
       *
       * Step Functions automatically creates a unique name for each state machine execution if one
       * is not provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html#cfn-iot-topicrule-stepfunctionsaction-executionnameprefix)
       */
      override fun executionNamePrefix(): String? = unwrap(this).getExecutionNamePrefix()

      /**
       * The ARN of the role that grants IoT permission to start execution of a state machine
       * ("Action":"states:StartExecution").
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html#cfn-iot-topicrule-stepfunctionsaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The name of the Step Functions state machine whose execution will be started.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html#cfn-iot-topicrule-stepfunctionsaction-statemachinename)
       */
      override fun stateMachineName(): String = unwrap(this).getStateMachineName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StepFunctionsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty):
          StepFunctionsActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StepFunctionsActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StepFunctionsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.StepFunctionsActionProperty
    }
  }

  /**
   * The authorization method used to send messages.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * HttpAuthorizationProperty httpAuthorizationProperty = HttpAuthorizationProperty.builder()
   * .sigv4(SigV4AuthorizationProperty.builder()
   * .roleArn("roleArn")
   * .serviceName("serviceName")
   * .signingRegion("signingRegion")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpauthorization.html)
   */
  public interface HttpAuthorizationProperty {
    /**
     * Use Sig V4 authorization.
     *
     * For more information, see [Signature Version 4 Signing
     * Process](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpauthorization.html#cfn-iot-topicrule-httpauthorization-sigv4)
     */
    public fun sigv4(): Any? = unwrap(this).getSigv4()

    /**
     * A builder for [HttpAuthorizationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sigv4 Use Sig V4 authorization.
       * For more information, see [Signature Version 4 Signing
       * Process](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) .
       */
      public fun sigv4(sigv4: IResolvable)

      /**
       * @param sigv4 Use Sig V4 authorization.
       * For more information, see [Signature Version 4 Signing
       * Process](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) .
       */
      public fun sigv4(sigv4: SigV4AuthorizationProperty)

      /**
       * @param sigv4 Use Sig V4 authorization.
       * For more information, see [Signature Version 4 Signing
       * Process](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e279999b2f49cd3bcdd0ef07fb0e9971e7dca036f7344431f823ed7f5b7355fd")
      public fun sigv4(sigv4: SigV4AuthorizationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty.builder()

      /**
       * @param sigv4 Use Sig V4 authorization.
       * For more information, see [Signature Version 4 Signing
       * Process](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) .
       */
      override fun sigv4(sigv4: IResolvable) {
        cdkBuilder.sigv4(sigv4.let(IResolvable::unwrap))
      }

      /**
       * @param sigv4 Use Sig V4 authorization.
       * For more information, see [Signature Version 4 Signing
       * Process](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) .
       */
      override fun sigv4(sigv4: SigV4AuthorizationProperty) {
        cdkBuilder.sigv4(sigv4.let(SigV4AuthorizationProperty::unwrap))
      }

      /**
       * @param sigv4 Use Sig V4 authorization.
       * For more information, see [Signature Version 4 Signing
       * Process](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e279999b2f49cd3bcdd0ef07fb0e9971e7dca036f7344431f823ed7f5b7355fd")
      override fun sigv4(sigv4: SigV4AuthorizationProperty.Builder.() -> Unit): Unit =
          sigv4(SigV4AuthorizationProperty(sigv4))

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty,
    ) : CdkObject(cdkObject), HttpAuthorizationProperty {
      /**
       * Use Sig V4 authorization.
       *
       * For more information, see [Signature Version 4 Signing
       * Process](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpauthorization.html#cfn-iot-topicrule-httpauthorization-sigv4)
       */
      override fun sigv4(): Any? = unwrap(this).getSigv4()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpAuthorizationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty):
          HttpAuthorizationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HttpAuthorizationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpAuthorizationProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpAuthorizationProperty
    }
  }

  /**
   * Sends an input to an AWS IoT Events detector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * IotEventsActionProperty iotEventsActionProperty = IotEventsActionProperty.builder()
   * .inputName("inputName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .batchMode(false)
   * .messageId("messageId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-ioteventsaction.html)
   */
  public interface IotEventsActionProperty {
    /**
     * Whether to process the event actions as a batch. The default value is `false` .
     *
     * When `batchMode` is `true` , you can't specify a `messageId` .
     *
     * When `batchMode` is `true` and the rule SQL statement evaluates to an Array, each Array
     * element is treated as a separate message when Events by calling
     * [`BatchPutMessage`](https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html)
     * . The resulting array can't have more than 10 messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-ioteventsaction.html#cfn-iot-topicrule-ioteventsaction-batchmode)
     */
    public fun batchMode(): Any? = unwrap(this).getBatchMode()

    /**
     * The name of the AWS IoT Events input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-ioteventsaction.html#cfn-iot-topicrule-ioteventsaction-inputname)
     */
    public fun inputName(): String

    /**
     * The ID of the message. The default `messageId` is a new UUID value.
     *
     * When `batchMode` is `true` , you can't specify a `messageId` --a new UUID value will be
     * assigned.
     *
     * Assign a value to this property to ensure that only one input (message) with a given
     * `messageId` will be processed by an AWS IoT Events detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-ioteventsaction.html#cfn-iot-topicrule-ioteventsaction-messageid)
     */
    public fun messageId(): String? = unwrap(this).getMessageId()

    /**
     * The ARN of the role that grants AWS IoT permission to send an input to an AWS IoT Events
     * detector.
     *
     * ("Action":"iotevents:BatchPutMessage").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-ioteventsaction.html#cfn-iot-topicrule-ioteventsaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [IotEventsActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchMode Whether to process the event actions as a batch. The default value is
       * `false` .
       * When `batchMode` is `true` , you can't specify a `messageId` .
       *
       * When `batchMode` is `true` and the rule SQL statement evaluates to an Array, each Array
       * element is treated as a separate message when Events by calling
       * [`BatchPutMessage`](https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html)
       * . The resulting array can't have more than 10 messages.
       */
      public fun batchMode(batchMode: Boolean)

      /**
       * @param batchMode Whether to process the event actions as a batch. The default value is
       * `false` .
       * When `batchMode` is `true` , you can't specify a `messageId` .
       *
       * When `batchMode` is `true` and the rule SQL statement evaluates to an Array, each Array
       * element is treated as a separate message when Events by calling
       * [`BatchPutMessage`](https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html)
       * . The resulting array can't have more than 10 messages.
       */
      public fun batchMode(batchMode: IResolvable)

      /**
       * @param inputName The name of the AWS IoT Events input. 
       */
      public fun inputName(inputName: String)

      /**
       * @param messageId The ID of the message. The default `messageId` is a new UUID value.
       * When `batchMode` is `true` , you can't specify a `messageId` --a new UUID value will be
       * assigned.
       *
       * Assign a value to this property to ensure that only one input (message) with a given
       * `messageId` will be processed by an AWS IoT Events detector.
       */
      public fun messageId(messageId: String)

      /**
       * @param roleArn The ARN of the role that grants AWS IoT permission to send an input to an
       * AWS IoT Events detector. 
       * ("Action":"iotevents:BatchPutMessage").
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty.builder()

      /**
       * @param batchMode Whether to process the event actions as a batch. The default value is
       * `false` .
       * When `batchMode` is `true` , you can't specify a `messageId` .
       *
       * When `batchMode` is `true` and the rule SQL statement evaluates to an Array, each Array
       * element is treated as a separate message when Events by calling
       * [`BatchPutMessage`](https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html)
       * . The resulting array can't have more than 10 messages.
       */
      override fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
      }

      /**
       * @param batchMode Whether to process the event actions as a batch. The default value is
       * `false` .
       * When `batchMode` is `true` , you can't specify a `messageId` .
       *
       * When `batchMode` is `true` and the rule SQL statement evaluates to an Array, each Array
       * element is treated as a separate message when Events by calling
       * [`BatchPutMessage`](https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html)
       * . The resulting array can't have more than 10 messages.
       */
      override fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode.let(IResolvable::unwrap))
      }

      /**
       * @param inputName The name of the AWS IoT Events input. 
       */
      override fun inputName(inputName: String) {
        cdkBuilder.inputName(inputName)
      }

      /**
       * @param messageId The ID of the message. The default `messageId` is a new UUID value.
       * When `batchMode` is `true` , you can't specify a `messageId` --a new UUID value will be
       * assigned.
       *
       * Assign a value to this property to ensure that only one input (message) with a given
       * `messageId` will be processed by an AWS IoT Events detector.
       */
      override fun messageId(messageId: String) {
        cdkBuilder.messageId(messageId)
      }

      /**
       * @param roleArn The ARN of the role that grants AWS IoT permission to send an input to an
       * AWS IoT Events detector. 
       * ("Action":"iotevents:BatchPutMessage").
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty,
    ) : CdkObject(cdkObject), IotEventsActionProperty {
      /**
       * Whether to process the event actions as a batch. The default value is `false` .
       *
       * When `batchMode` is `true` , you can't specify a `messageId` .
       *
       * When `batchMode` is `true` and the rule SQL statement evaluates to an Array, each Array
       * element is treated as a separate message when Events by calling
       * [`BatchPutMessage`](https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html)
       * . The resulting array can't have more than 10 messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-ioteventsaction.html#cfn-iot-topicrule-ioteventsaction-batchmode)
       */
      override fun batchMode(): Any? = unwrap(this).getBatchMode()

      /**
       * The name of the AWS IoT Events input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-ioteventsaction.html#cfn-iot-topicrule-ioteventsaction-inputname)
       */
      override fun inputName(): String = unwrap(this).getInputName()

      /**
       * The ID of the message. The default `messageId` is a new UUID value.
       *
       * When `batchMode` is `true` , you can't specify a `messageId` --a new UUID value will be
       * assigned.
       *
       * Assign a value to this property to ensure that only one input (message) with a given
       * `messageId` will be processed by an AWS IoT Events detector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-ioteventsaction.html#cfn-iot-topicrule-ioteventsaction-messageid)
       */
      override fun messageId(): String? = unwrap(this).getMessageId()

      /**
       * The ARN of the role that grants AWS IoT permission to send an input to an AWS IoT Events
       * detector.
       *
       * ("Action":"iotevents:BatchPutMessage").
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-ioteventsaction.html#cfn-iot-topicrule-ioteventsaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IotEventsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty):
          IotEventsActionProperty = CdkObjectWrappers.wrap(cdkObject) as? IotEventsActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotEventsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty
    }
  }

  /**
   * Sends message data to an AWS IoT Analytics channel.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * IotAnalyticsActionProperty iotAnalyticsActionProperty = IotAnalyticsActionProperty.builder()
   * .channelName("channelName")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .batchMode(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html)
   */
  public interface IotAnalyticsActionProperty {
    /**
     * Whether to process the action as a batch. The default value is `false` .
     *
     * When `batchMode` is `true` and the rule SQL statement evaluates to an Array, each Array
     * element is delivered as a separate message when passed by
     * [`BatchPutMessage`](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html)
     * The resulting array can't have more than 100 messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html#cfn-iot-topicrule-iotanalyticsaction-batchmode)
     */
    public fun batchMode(): Any? = unwrap(this).getBatchMode()

    /**
     * The name of the IoT Analytics channel to which message data will be sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html#cfn-iot-topicrule-iotanalyticsaction-channelname)
     */
    public fun channelName(): String

    /**
     * The ARN of the role which has a policy that grants IoT Analytics permission to send message
     * data via IoT Analytics (iotanalytics:BatchPutMessage).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html#cfn-iot-topicrule-iotanalyticsaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [IotAnalyticsActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchMode Whether to process the action as a batch. The default value is `false` .
       * When `batchMode` is `true` and the rule SQL statement evaluates to an Array, each Array
       * element is delivered as a separate message when passed by
       * [`BatchPutMessage`](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html)
       * The resulting array can't have more than 100 messages.
       */
      public fun batchMode(batchMode: Boolean)

      /**
       * @param batchMode Whether to process the action as a batch. The default value is `false` .
       * When `batchMode` is `true` and the rule SQL statement evaluates to an Array, each Array
       * element is delivered as a separate message when passed by
       * [`BatchPutMessage`](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html)
       * The resulting array can't have more than 100 messages.
       */
      public fun batchMode(batchMode: IResolvable)

      /**
       * @param channelName The name of the IoT Analytics channel to which message data will be
       * sent. 
       */
      public fun channelName(channelName: String)

      /**
       * @param roleArn The ARN of the role which has a policy that grants IoT Analytics permission
       * to send message data via IoT Analytics (iotanalytics:BatchPutMessage). 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty.builder()

      /**
       * @param batchMode Whether to process the action as a batch. The default value is `false` .
       * When `batchMode` is `true` and the rule SQL statement evaluates to an Array, each Array
       * element is delivered as a separate message when passed by
       * [`BatchPutMessage`](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html)
       * The resulting array can't have more than 100 messages.
       */
      override fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
      }

      /**
       * @param batchMode Whether to process the action as a batch. The default value is `false` .
       * When `batchMode` is `true` and the rule SQL statement evaluates to an Array, each Array
       * element is delivered as a separate message when passed by
       * [`BatchPutMessage`](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html)
       * The resulting array can't have more than 100 messages.
       */
      override fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode.let(IResolvable::unwrap))
      }

      /**
       * @param channelName The name of the IoT Analytics channel to which message data will be
       * sent. 
       */
      override fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
      }

      /**
       * @param roleArn The ARN of the role which has a policy that grants IoT Analytics permission
       * to send message data via IoT Analytics (iotanalytics:BatchPutMessage). 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty,
    ) : CdkObject(cdkObject), IotAnalyticsActionProperty {
      /**
       * Whether to process the action as a batch. The default value is `false` .
       *
       * When `batchMode` is `true` and the rule SQL statement evaluates to an Array, each Array
       * element is delivered as a separate message when passed by
       * [`BatchPutMessage`](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html)
       * The resulting array can't have more than 100 messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html#cfn-iot-topicrule-iotanalyticsaction-batchmode)
       */
      override fun batchMode(): Any? = unwrap(this).getBatchMode()

      /**
       * The name of the IoT Analytics channel to which message data will be sent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html#cfn-iot-topicrule-iotanalyticsaction-channelname)
       */
      override fun channelName(): String = unwrap(this).getChannelName()

      /**
       * The ARN of the role which has a policy that grants IoT Analytics permission to send message
       * data via IoT Analytics (iotanalytics:BatchPutMessage).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html#cfn-iot-topicrule-iotanalyticsaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IotAnalyticsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty):
          IotAnalyticsActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IotAnalyticsActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotAnalyticsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty
    }
  }

  /**
   * The value to use for the entry's timestamp.
   *
   * If blank, the time that the entry was processed is used.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * TimestreamTimestampProperty timestreamTimestampProperty = TimestreamTimestampProperty.builder()
   * .unit("unit")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamtimestamp.html)
   */
  public interface TimestreamTimestampProperty {
    /**
     * The precision of the timestamp value that results from the expression described in `value` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamtimestamp.html#cfn-iot-topicrule-timestreamtimestamp-unit)
     */
    public fun unit(): String

    /**
     * An expression that returns a long epoch time value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamtimestamp.html#cfn-iot-topicrule-timestreamtimestamp-value)
     */
    public fun `value`(): String

    /**
     * A builder for [TimestreamTimestampProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unit The precision of the timestamp value that results from the expression described
       * in `value` . 
       */
      public fun unit(unit: String)

      /**
       * @param value An expression that returns a long epoch time value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty.builder()

      /**
       * @param unit The precision of the timestamp value that results from the expression described
       * in `value` . 
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param value An expression that returns a long epoch time value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty,
    ) : CdkObject(cdkObject), TimestreamTimestampProperty {
      /**
       * The precision of the timestamp value that results from the expression described in `value`
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamtimestamp.html#cfn-iot-topicrule-timestreamtimestamp-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()

      /**
       * An expression that returns a long epoch time value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamtimestamp.html#cfn-iot-topicrule-timestreamtimestamp-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimestreamTimestampProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty):
          TimestreamTimestampProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TimestreamTimestampProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestreamTimestampProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty
    }
  }

  /**
   * Contains an asset property value (of a single type).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * AssetPropertyVariantProperty assetPropertyVariantProperty =
   * AssetPropertyVariantProperty.builder()
   * .booleanValue("booleanValue")
   * .doubleValue("doubleValue")
   * .integerValue("integerValue")
   * .stringValue("stringValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html)
   */
  public interface AssetPropertyVariantProperty {
    /**
     * Optional.
     *
     * A string that contains the boolean value ( `true` or `false` ) of the value entry. Accepts
     * substitution templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-booleanvalue)
     */
    public fun booleanValue(): String? = unwrap(this).getBooleanValue()

    /**
     * Optional.
     *
     * A string that contains the double value of the value entry. Accepts substitution templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-doublevalue)
     */
    public fun doubleValue(): String? = unwrap(this).getDoubleValue()

    /**
     * Optional.
     *
     * A string that contains the integer value of the value entry. Accepts substitution templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-integervalue)
     */
    public fun integerValue(): String? = unwrap(this).getIntegerValue()

    /**
     * Optional.
     *
     * The string value of the value entry. Accepts substitution templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-stringvalue)
     */
    public fun stringValue(): String? = unwrap(this).getStringValue()

    /**
     * A builder for [AssetPropertyVariantProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param booleanValue Optional.
       * A string that contains the boolean value ( `true` or `false` ) of the value entry. Accepts
       * substitution templates.
       */
      public fun booleanValue(booleanValue: String)

      /**
       * @param doubleValue Optional.
       * A string that contains the double value of the value entry. Accepts substitution templates.
       */
      public fun doubleValue(doubleValue: String)

      /**
       * @param integerValue Optional.
       * A string that contains the integer value of the value entry. Accepts substitution
       * templates.
       */
      public fun integerValue(integerValue: String)

      /**
       * @param stringValue Optional.
       * The string value of the value entry. Accepts substitution templates.
       */
      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty.builder()

      /**
       * @param booleanValue Optional.
       * A string that contains the boolean value ( `true` or `false` ) of the value entry. Accepts
       * substitution templates.
       */
      override fun booleanValue(booleanValue: String) {
        cdkBuilder.booleanValue(booleanValue)
      }

      /**
       * @param doubleValue Optional.
       * A string that contains the double value of the value entry. Accepts substitution templates.
       */
      override fun doubleValue(doubleValue: String) {
        cdkBuilder.doubleValue(doubleValue)
      }

      /**
       * @param integerValue Optional.
       * A string that contains the integer value of the value entry. Accepts substitution
       * templates.
       */
      override fun integerValue(integerValue: String) {
        cdkBuilder.integerValue(integerValue)
      }

      /**
       * @param stringValue Optional.
       * The string value of the value entry. Accepts substitution templates.
       */
      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty,
    ) : CdkObject(cdkObject), AssetPropertyVariantProperty {
      /**
       * Optional.
       *
       * A string that contains the boolean value ( `true` or `false` ) of the value entry. Accepts
       * substitution templates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-booleanvalue)
       */
      override fun booleanValue(): String? = unwrap(this).getBooleanValue()

      /**
       * Optional.
       *
       * A string that contains the double value of the value entry. Accepts substitution templates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-doublevalue)
       */
      override fun doubleValue(): String? = unwrap(this).getDoubleValue()

      /**
       * Optional.
       *
       * A string that contains the integer value of the value entry. Accepts substitution
       * templates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-integervalue)
       */
      override fun integerValue(): String? = unwrap(this).getIntegerValue()

      /**
       * Optional.
       *
       * The string value of the value entry. Accepts substitution templates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-assetpropertyvariant.html#cfn-iot-topicrule-assetpropertyvariant-stringvalue)
       */
      override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyVariantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty):
          AssetPropertyVariantProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AssetPropertyVariantProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyVariantProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.AssetPropertyVariantProperty
    }
  }

  /**
   * A key-value pair that you define in the header.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * UserPropertyProperty userPropertyProperty = UserPropertyProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-userproperty.html)
   */
  public interface UserPropertyProperty {
    /**
     * A key to be specified in `UserProperty` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-userproperty.html#cfn-iot-topicrule-userproperty-key)
     */
    public fun key(): String

    /**
     * A value to be specified in `UserProperty` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-userproperty.html#cfn-iot-topicrule-userproperty-value)
     */
    public fun `value`(): String

    /**
     * A builder for [UserPropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key A key to be specified in `UserProperty` . 
       */
      public fun key(key: String)

      /**
       * @param value A value to be specified in `UserProperty` . 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty.builder()

      /**
       * @param key A key to be specified in `UserProperty` . 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value A value to be specified in `UserProperty` . 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty,
    ) : CdkObject(cdkObject), UserPropertyProperty {
      /**
       * A key to be specified in `UserProperty` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-userproperty.html#cfn-iot-topicrule-userproperty-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * A value to be specified in `UserProperty` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-userproperty.html#cfn-iot-topicrule-userproperty-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty):
          UserPropertyProperty = CdkObjectWrappers.wrap(cdkObject) as? UserPropertyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserPropertyProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.UserPropertyProperty
    }
  }

  /**
   * The HTTP action header.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * HttpActionHeaderProperty httpActionHeaderProperty = HttpActionHeaderProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpactionheader.html)
   */
  public interface HttpActionHeaderProperty {
    /**
     * The HTTP header key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpactionheader.html#cfn-iot-topicrule-httpactionheader-key)
     */
    public fun key(): String

    /**
     * The HTTP header value.
     *
     * Substitution templates are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpactionheader.html#cfn-iot-topicrule-httpactionheader-value)
     */
    public fun `value`(): String

    /**
     * A builder for [HttpActionHeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The HTTP header key. 
       */
      public fun key(key: String)

      /**
       * @param value The HTTP header value. 
       * Substitution templates are supported.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty.builder()

      /**
       * @param key The HTTP header key. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The HTTP header value. 
       * Substitution templates are supported.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty,
    ) : CdkObject(cdkObject), HttpActionHeaderProperty {
      /**
       * The HTTP header key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpactionheader.html#cfn-iot-topicrule-httpactionheader-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The HTTP header value.
       *
       * Substitution templates are supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpactionheader.html#cfn-iot-topicrule-httpactionheader-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpActionHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty):
          HttpActionHeaderProperty = CdkObjectWrappers.wrap(cdkObject) as? HttpActionHeaderProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpActionHeaderProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.HttpActionHeaderProperty
    }
  }

  /**
   * Describes an action to publish to an Amazon SNS topic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * SnsActionProperty snsActionProperty = SnsActionProperty.builder()
   * .roleArn("roleArn")
   * .targetArn("targetArn")
   * // the properties below are optional
   * .messageFormat("messageFormat")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html)
   */
  public interface SnsActionProperty {
    /**
     * (Optional) The message format of the message to publish.
     *
     * Accepted values are "JSON" and "RAW". The default value of the attribute is "RAW". SNS uses
     * this setting to determine if the payload should be parsed and relevant platform-specific bits of
     * the payload should be extracted. For more information, see [Amazon SNS Message and JSON
     * Formats](https://docs.aws.amazon.com/sns/latest/dg/json-formats.html) in the *Amazon Simple
     * Notification Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-messageformat)
     */
    public fun messageFormat(): String? = unwrap(this).getMessageFormat()

    /**
     * The ARN of the IAM role that grants access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * The ARN of the SNS topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-targetarn)
     */
    public fun targetArn(): String

    /**
     * A builder for [SnsActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param messageFormat (Optional) The message format of the message to publish.
       * Accepted values are "JSON" and "RAW". The default value of the attribute is "RAW". SNS uses
       * this setting to determine if the payload should be parsed and relevant platform-specific bits
       * of the payload should be extracted. For more information, see [Amazon SNS Message and JSON
       * Formats](https://docs.aws.amazon.com/sns/latest/dg/json-formats.html) in the *Amazon Simple
       * Notification Service Developer Guide* .
       */
      public fun messageFormat(messageFormat: String)

      /**
       * @param roleArn The ARN of the IAM role that grants access. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param targetArn The ARN of the SNS topic. 
       */
      public fun targetArn(targetArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty.builder()

      /**
       * @param messageFormat (Optional) The message format of the message to publish.
       * Accepted values are "JSON" and "RAW". The default value of the attribute is "RAW". SNS uses
       * this setting to determine if the payload should be parsed and relevant platform-specific bits
       * of the payload should be extracted. For more information, see [Amazon SNS Message and JSON
       * Formats](https://docs.aws.amazon.com/sns/latest/dg/json-formats.html) in the *Amazon Simple
       * Notification Service Developer Guide* .
       */
      override fun messageFormat(messageFormat: String) {
        cdkBuilder.messageFormat(messageFormat)
      }

      /**
       * @param roleArn The ARN of the IAM role that grants access. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param targetArn The ARN of the SNS topic. 
       */
      override fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty,
    ) : CdkObject(cdkObject), SnsActionProperty {
      /**
       * (Optional) The message format of the message to publish.
       *
       * Accepted values are "JSON" and "RAW". The default value of the attribute is "RAW". SNS uses
       * this setting to determine if the payload should be parsed and relevant platform-specific bits
       * of the payload should be extracted. For more information, see [Amazon SNS Message and JSON
       * Formats](https://docs.aws.amazon.com/sns/latest/dg/json-formats.html) in the *Amazon Simple
       * Notification Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-messageformat)
       */
      override fun messageFormat(): String? = unwrap(this).getMessageFormat()

      /**
       * The ARN of the IAM role that grants access.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The ARN of the SNS topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html#cfn-iot-topicrule-snsaction-targetarn)
       */
      override fun targetArn(): String = unwrap(this).getTargetArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty):
          SnsActionProperty = CdkObjectWrappers.wrap(cdkObject) as? SnsActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnsActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnTopicRule.SnsActionProperty
    }
  }

  /**
   * Describes an action to send device location updates from an MQTT message to an Amazon Location
   * tracker resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * LocationActionProperty locationActionProperty = LocationActionProperty.builder()
   * .deviceId("deviceId")
   * .latitude("latitude")
   * .longitude("longitude")
   * .roleArn("roleArn")
   * .trackerName("trackerName")
   * // the properties below are optional
   * .timestamp(TimestampProperty.builder()
   * .value("value")
   * // the properties below are optional
   * .unit("unit")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-locationaction.html)
   */
  public interface LocationActionProperty {
    /**
     * The unique ID of the device providing the location data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-locationaction.html#cfn-iot-topicrule-locationaction-deviceid)
     */
    public fun deviceId(): String

    /**
     * A string that evaluates to a double value that represents the latitude of the device's
     * location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-locationaction.html#cfn-iot-topicrule-locationaction-latitude)
     */
    public fun latitude(): String

    /**
     * A string that evaluates to a double value that represents the longitude of the device's
     * location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-locationaction.html#cfn-iot-topicrule-locationaction-longitude)
     */
    public fun longitude(): String

    /**
     * The IAM role that grants permission to write to the Amazon Location resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-locationaction.html#cfn-iot-topicrule-locationaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * The time that the location data was sampled.
     *
     * The default value is the time the MQTT message was processed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-locationaction.html#cfn-iot-topicrule-locationaction-timestamp)
     */
    public fun timestamp(): Any? = unwrap(this).getTimestamp()

    /**
     * The name of the tracker resource in Amazon Location in which the location is updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-locationaction.html#cfn-iot-topicrule-locationaction-trackername)
     */
    public fun trackerName(): String

    /**
     * A builder for [LocationActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deviceId The unique ID of the device providing the location data. 
       */
      public fun deviceId(deviceId: String)

      /**
       * @param latitude A string that evaluates to a double value that represents the latitude of
       * the device's location. 
       */
      public fun latitude(latitude: String)

      /**
       * @param longitude A string that evaluates to a double value that represents the longitude of
       * the device's location. 
       */
      public fun longitude(longitude: String)

      /**
       * @param roleArn The IAM role that grants permission to write to the Amazon Location
       * resource. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param timestamp The time that the location data was sampled.
       * The default value is the time the MQTT message was processed.
       */
      public fun timestamp(timestamp: IResolvable)

      /**
       * @param timestamp The time that the location data was sampled.
       * The default value is the time the MQTT message was processed.
       */
      public fun timestamp(timestamp: TimestampProperty)

      /**
       * @param timestamp The time that the location data was sampled.
       * The default value is the time the MQTT message was processed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82cdab211b27fd2b48d7d3ca9c417d32fd12c724ef5c66ee4e70518fb7204e6e")
      public fun timestamp(timestamp: TimestampProperty.Builder.() -> Unit)

      /**
       * @param trackerName The name of the tracker resource in Amazon Location in which the
       * location is updated. 
       */
      public fun trackerName(trackerName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty.builder()

      /**
       * @param deviceId The unique ID of the device providing the location data. 
       */
      override fun deviceId(deviceId: String) {
        cdkBuilder.deviceId(deviceId)
      }

      /**
       * @param latitude A string that evaluates to a double value that represents the latitude of
       * the device's location. 
       */
      override fun latitude(latitude: String) {
        cdkBuilder.latitude(latitude)
      }

      /**
       * @param longitude A string that evaluates to a double value that represents the longitude of
       * the device's location. 
       */
      override fun longitude(longitude: String) {
        cdkBuilder.longitude(longitude)
      }

      /**
       * @param roleArn The IAM role that grants permission to write to the Amazon Location
       * resource. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param timestamp The time that the location data was sampled.
       * The default value is the time the MQTT message was processed.
       */
      override fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp.let(IResolvable::unwrap))
      }

      /**
       * @param timestamp The time that the location data was sampled.
       * The default value is the time the MQTT message was processed.
       */
      override fun timestamp(timestamp: TimestampProperty) {
        cdkBuilder.timestamp(timestamp.let(TimestampProperty::unwrap))
      }

      /**
       * @param timestamp The time that the location data was sampled.
       * The default value is the time the MQTT message was processed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82cdab211b27fd2b48d7d3ca9c417d32fd12c724ef5c66ee4e70518fb7204e6e")
      override fun timestamp(timestamp: TimestampProperty.Builder.() -> Unit): Unit =
          timestamp(TimestampProperty(timestamp))

      /**
       * @param trackerName The name of the tracker resource in Amazon Location in which the
       * location is updated. 
       */
      override fun trackerName(trackerName: String) {
        cdkBuilder.trackerName(trackerName)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty,
    ) : CdkObject(cdkObject), LocationActionProperty {
      /**
       * The unique ID of the device providing the location data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-locationaction.html#cfn-iot-topicrule-locationaction-deviceid)
       */
      override fun deviceId(): String = unwrap(this).getDeviceId()

      /**
       * A string that evaluates to a double value that represents the latitude of the device's
       * location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-locationaction.html#cfn-iot-topicrule-locationaction-latitude)
       */
      override fun latitude(): String = unwrap(this).getLatitude()

      /**
       * A string that evaluates to a double value that represents the longitude of the device's
       * location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-locationaction.html#cfn-iot-topicrule-locationaction-longitude)
       */
      override fun longitude(): String = unwrap(this).getLongitude()

      /**
       * The IAM role that grants permission to write to the Amazon Location resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-locationaction.html#cfn-iot-topicrule-locationaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The time that the location data was sampled.
       *
       * The default value is the time the MQTT message was processed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-locationaction.html#cfn-iot-topicrule-locationaction-timestamp)
       */
      override fun timestamp(): Any? = unwrap(this).getTimestamp()

      /**
       * The name of the tracker resource in Amazon Location in which the location is updated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-locationaction.html#cfn-iot-topicrule-locationaction-trackername)
       */
      override fun trackerName(): String = unwrap(this).getTrackerName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocationActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty):
          LocationActionProperty = CdkObjectWrappers.wrap(cdkObject) as? LocationActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.LocationActionProperty
    }
  }

  /**
   * Describes an action to write data to an Amazon S3 bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * S3ActionProperty s3ActionProperty = S3ActionProperty.builder()
   * .bucketName("bucketName")
   * .key("key")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .cannedAcl("cannedAcl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html)
   */
  public interface S3ActionProperty {
    /**
     * The Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-bucketname)
     */
    public fun bucketName(): String

    /**
     * The Amazon S3 canned ACL that controls access to the object identified by the object key.
     *
     * For more information, see [S3 canned
     * ACLs](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-cannedacl)
     */
    public fun cannedAcl(): String? = unwrap(this).getCannedAcl()

    /**
     * The object key.
     *
     * For more information, see [Actions, resources, and condition keys for Amazon
     * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/list_amazons3.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-key)
     */
    public fun key(): String

    /**
     * The ARN of the IAM role that grants access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [S3ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The Amazon S3 bucket. 
       */
      public fun bucketName(bucketName: String)

      /**
       * @param cannedAcl The Amazon S3 canned ACL that controls access to the object identified by
       * the object key.
       * For more information, see [S3 canned
       * ACLs](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) .
       */
      public fun cannedAcl(cannedAcl: String)

      /**
       * @param key The object key. 
       * For more information, see [Actions, resources, and condition keys for Amazon
       * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/list_amazons3.html) .
       */
      public fun key(key: String)

      /**
       * @param roleArn The ARN of the IAM role that grants access. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty.builder()

      /**
       * @param bucketName The Amazon S3 bucket. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param cannedAcl The Amazon S3 canned ACL that controls access to the object identified by
       * the object key.
       * For more information, see [S3 canned
       * ACLs](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) .
       */
      override fun cannedAcl(cannedAcl: String) {
        cdkBuilder.cannedAcl(cannedAcl)
      }

      /**
       * @param key The object key. 
       * For more information, see [Actions, resources, and condition keys for Amazon
       * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/list_amazons3.html) .
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param roleArn The ARN of the IAM role that grants access. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty,
    ) : CdkObject(cdkObject), S3ActionProperty {
      /**
       * The Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * The Amazon S3 canned ACL that controls access to the object identified by the object key.
       *
       * For more information, see [S3 canned
       * ACLs](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-cannedacl)
       */
      override fun cannedAcl(): String? = unwrap(this).getCannedAcl()

      /**
       * The object key.
       *
       * For more information, see [Actions, resources, and condition keys for Amazon
       * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/list_amazons3.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The ARN of the IAM role that grants access.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty):
          S3ActionProperty = CdkObjectWrappers.wrap(cdkObject) as? S3ActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnTopicRule.S3ActionProperty
    }
  }

  /**
   * Describes how to interpret an application-defined timestamp value from an MQTT message payload
   * and the precision of that value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * TimestampProperty timestampProperty = TimestampProperty.builder()
   * .value("value")
   * // the properties below are optional
   * .unit("unit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestamp.html)
   */
  public interface TimestampProperty {
    /**
     * The precision of the timestamp value that results from the expression described in `value` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestamp.html#cfn-iot-topicrule-timestamp-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * An expression that returns a long epoch time value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestamp.html#cfn-iot-topicrule-timestamp-value)
     */
    public fun `value`(): String

    /**
     * A builder for [TimestampProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unit The precision of the timestamp value that results from the expression described
       * in `value` .
       */
      public fun unit(unit: String)

      /**
       * @param value An expression that returns a long epoch time value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty.builder()

      /**
       * @param unit The precision of the timestamp value that results from the expression described
       * in `value` .
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param value An expression that returns a long epoch time value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty,
    ) : CdkObject(cdkObject), TimestampProperty {
      /**
       * The precision of the timestamp value that results from the expression described in `value`
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestamp.html#cfn-iot-topicrule-timestamp-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()

      /**
       * An expression that returns a long epoch time value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestamp.html#cfn-iot-topicrule-timestamp-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimestampProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty):
          TimestampProperty = CdkObjectWrappers.wrap(cdkObject) as? TimestampProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestampProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnTopicRule.TimestampProperty
    }
  }

  /**
   * Describes an action that captures a CloudWatch metric.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * CloudwatchMetricActionProperty cloudwatchMetricActionProperty =
   * CloudwatchMetricActionProperty.builder()
   * .metricName("metricName")
   * .metricNamespace("metricNamespace")
   * .metricUnit("metricUnit")
   * .metricValue("metricValue")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .metricTimestamp("metricTimestamp")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html)
   */
  public interface CloudwatchMetricActionProperty {
    /**
     * The CloudWatch metric name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricname)
     */
    public fun metricName(): String

    /**
     * The CloudWatch metric namespace name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricnamespace)
     */
    public fun metricNamespace(): String

    /**
     * An optional [Unix
     * timestamp](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metrictimestamp)
     */
    public fun metricTimestamp(): String? = unwrap(this).getMetricTimestamp()

    /**
     * The [metric
     * unit](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
     * supported by CloudWatch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricunit)
     */
    public fun metricUnit(): String

    /**
     * The CloudWatch metric value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricvalue)
     */
    public fun metricValue(): String

    /**
     * The IAM role that allows access to the CloudWatch metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [CloudwatchMetricActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metricName The CloudWatch metric name. 
       */
      public fun metricName(metricName: String)

      /**
       * @param metricNamespace The CloudWatch metric namespace name. 
       */
      public fun metricNamespace(metricNamespace: String)

      /**
       * @param metricTimestamp An optional [Unix
       * timestamp](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp)
       * .
       */
      public fun metricTimestamp(metricTimestamp: String)

      /**
       * @param metricUnit The [metric
       * unit](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
       * supported by CloudWatch. 
       */
      public fun metricUnit(metricUnit: String)

      /**
       * @param metricValue The CloudWatch metric value. 
       */
      public fun metricValue(metricValue: String)

      /**
       * @param roleArn The IAM role that allows access to the CloudWatch metric. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty.builder()

      /**
       * @param metricName The CloudWatch metric name. 
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param metricNamespace The CloudWatch metric namespace name. 
       */
      override fun metricNamespace(metricNamespace: String) {
        cdkBuilder.metricNamespace(metricNamespace)
      }

      /**
       * @param metricTimestamp An optional [Unix
       * timestamp](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp)
       * .
       */
      override fun metricTimestamp(metricTimestamp: String) {
        cdkBuilder.metricTimestamp(metricTimestamp)
      }

      /**
       * @param metricUnit The [metric
       * unit](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
       * supported by CloudWatch. 
       */
      override fun metricUnit(metricUnit: String) {
        cdkBuilder.metricUnit(metricUnit)
      }

      /**
       * @param metricValue The CloudWatch metric value. 
       */
      override fun metricValue(metricValue: String) {
        cdkBuilder.metricValue(metricValue)
      }

      /**
       * @param roleArn The IAM role that allows access to the CloudWatch metric. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty,
    ) : CdkObject(cdkObject), CloudwatchMetricActionProperty {
      /**
       * The CloudWatch metric name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricname)
       */
      override fun metricName(): String = unwrap(this).getMetricName()

      /**
       * The CloudWatch metric namespace name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricnamespace)
       */
      override fun metricNamespace(): String = unwrap(this).getMetricNamespace()

      /**
       * An optional [Unix
       * timestamp](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metrictimestamp)
       */
      override fun metricTimestamp(): String? = unwrap(this).getMetricTimestamp()

      /**
       * The [metric
       * unit](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit)
       * supported by CloudWatch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricunit)
       */
      override fun metricUnit(): String = unwrap(this).getMetricUnit()

      /**
       * The CloudWatch metric value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-metricvalue)
       */
      override fun metricValue(): String = unwrap(this).getMetricValue()

      /**
       * The IAM role that allows access to the CloudWatch metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html#cfn-iot-topicrule-cloudwatchmetricaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudwatchMetricActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty):
          CloudwatchMetricActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudwatchMetricActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudwatchMetricActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchMetricActionProperty
    }
  }

  /**
   * Describes an action that writes records into an Amazon Timestream table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * TimestreamActionProperty timestreamActionProperty = TimestreamActionProperty.builder()
   * .databaseName("databaseName")
   * .dimensions(List.of(TimestreamDimensionProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .roleArn("roleArn")
   * .tableName("tableName")
   * // the properties below are optional
   * .timestamp(TimestreamTimestampProperty.builder()
   * .unit("unit")
   * .value("value")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamaction.html)
   */
  public interface TimestreamActionProperty {
    /**
     * The name of an Amazon Timestream database that has the table to write records into.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamaction.html#cfn-iot-topicrule-timestreamaction-databasename)
     */
    public fun databaseName(): String

    /**
     * Metadata attributes of the time series that are written in each measure record.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamaction.html#cfn-iot-topicrule-timestreamaction-dimensions)
     */
    public fun dimensions(): Any

    /**
     * The Amazon Resource Name (ARN) of the role that grants AWS IoT permission to write to the
     * Timestream database table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamaction.html#cfn-iot-topicrule-timestreamaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * The table where the message data will be written.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamaction.html#cfn-iot-topicrule-timestreamaction-tablename)
     */
    public fun tableName(): String

    /**
     * The value to use for the entry's timestamp.
     *
     * If blank, the time that the entry was processed is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamaction.html#cfn-iot-topicrule-timestreamaction-timestamp)
     */
    public fun timestamp(): Any? = unwrap(this).getTimestamp()

    /**
     * A builder for [TimestreamActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param databaseName The name of an Amazon Timestream database that has the table to write
       * records into. 
       */
      public fun databaseName(databaseName: String)

      /**
       * @param dimensions Metadata attributes of the time series that are written in each measure
       * record. 
       */
      public fun dimensions(dimensions: IResolvable)

      /**
       * @param dimensions Metadata attributes of the time series that are written in each measure
       * record. 
       */
      public fun dimensions(dimensions: List<Any>)

      /**
       * @param dimensions Metadata attributes of the time series that are written in each measure
       * record. 
       */
      public fun dimensions(vararg dimensions: Any)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role that grants AWS IoT permission to
       * write to the Timestream database table. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param tableName The table where the message data will be written. 
       */
      public fun tableName(tableName: String)

      /**
       * @param timestamp The value to use for the entry's timestamp.
       * If blank, the time that the entry was processed is used.
       */
      public fun timestamp(timestamp: IResolvable)

      /**
       * @param timestamp The value to use for the entry's timestamp.
       * If blank, the time that the entry was processed is used.
       */
      public fun timestamp(timestamp: TimestreamTimestampProperty)

      /**
       * @param timestamp The value to use for the entry's timestamp.
       * If blank, the time that the entry was processed is used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0d60eeb5a833c96c0d04ddc520b572e847b707ad1b16fb1d0b9670ae5edd658")
      public fun timestamp(timestamp: TimestreamTimestampProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty.builder()

      /**
       * @param databaseName The name of an Amazon Timestream database that has the table to write
       * records into. 
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param dimensions Metadata attributes of the time series that are written in each measure
       * record. 
       */
      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      /**
       * @param dimensions Metadata attributes of the time series that are written in each measure
       * record. 
       */
      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      /**
       * @param dimensions Metadata attributes of the time series that are written in each measure
       * record. 
       */
      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role that grants AWS IoT permission to
       * write to the Timestream database table. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param tableName The table where the message data will be written. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      /**
       * @param timestamp The value to use for the entry's timestamp.
       * If blank, the time that the entry was processed is used.
       */
      override fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp.let(IResolvable::unwrap))
      }

      /**
       * @param timestamp The value to use for the entry's timestamp.
       * If blank, the time that the entry was processed is used.
       */
      override fun timestamp(timestamp: TimestreamTimestampProperty) {
        cdkBuilder.timestamp(timestamp.let(TimestreamTimestampProperty::unwrap))
      }

      /**
       * @param timestamp The value to use for the entry's timestamp.
       * If blank, the time that the entry was processed is used.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0d60eeb5a833c96c0d04ddc520b572e847b707ad1b16fb1d0b9670ae5edd658")
      override fun timestamp(timestamp: TimestreamTimestampProperty.Builder.() -> Unit): Unit =
          timestamp(TimestreamTimestampProperty(timestamp))

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty,
    ) : CdkObject(cdkObject), TimestreamActionProperty {
      /**
       * The name of an Amazon Timestream database that has the table to write records into.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamaction.html#cfn-iot-topicrule-timestreamaction-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * Metadata attributes of the time series that are written in each measure record.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamaction.html#cfn-iot-topicrule-timestreamaction-dimensions)
       */
      override fun dimensions(): Any = unwrap(this).getDimensions()

      /**
       * The Amazon Resource Name (ARN) of the role that grants AWS IoT permission to write to the
       * Timestream database table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamaction.html#cfn-iot-topicrule-timestreamaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The table where the message data will be written.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamaction.html#cfn-iot-topicrule-timestreamaction-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()

      /**
       * The value to use for the entry's timestamp.
       *
       * If blank, the time that the entry was processed is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamaction.html#cfn-iot-topicrule-timestreamaction-timestamp)
       */
      override fun timestamp(): Any? = unwrap(this).getTimestamp()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimestreamActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty):
          TimestreamActionProperty = CdkObjectWrappers.wrap(cdkObject) as? TimestreamActionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestreamActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty
    }
  }

  /**
   * Describes an action to invoke a Lambda function.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * LambdaActionProperty lambdaActionProperty = LambdaActionProperty.builder()
   * .functionArn("functionArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html)
   */
  public interface LambdaActionProperty {
    /**
     * The ARN of the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html#cfn-iot-topicrule-lambdaaction-functionarn)
     */
    public fun functionArn(): String? = unwrap(this).getFunctionArn()

    /**
     * A builder for [LambdaActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param functionArn The ARN of the Lambda function.
       */
      public fun functionArn(functionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty.builder()

      /**
       * @param functionArn The ARN of the Lambda function.
       */
      override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty,
    ) : CdkObject(cdkObject), LambdaActionProperty {
      /**
       * The ARN of the Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html#cfn-iot-topicrule-lambdaaction-functionarn)
       */
      override fun functionArn(): String? = unwrap(this).getFunctionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty):
          LambdaActionProperty = CdkObjectWrappers.wrap(cdkObject) as? LambdaActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.LambdaActionProperty
    }
  }

  /**
   * Describes an action that writes data to an Amazon OpenSearch Service domain.
   *
   *
   * The `Elasticsearch` action can only be used by existing rule actions. To create a new rule
   * action or to update an existing rule action, use the `OpenSearch` rule action instead. For more
   * information, see
   * [OpenSearchAction](https://docs.aws.amazon.com//iot/latest/apireference/API_OpenSearchAction.html)
   * .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * ElasticsearchActionProperty elasticsearchActionProperty = ElasticsearchActionProperty.builder()
   * .endpoint("endpoint")
   * .id("id")
   * .index("index")
   * .roleArn("roleArn")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html)
   */
  public interface ElasticsearchActionProperty {
    /**
     * The endpoint of your OpenSearch domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-endpoint)
     */
    public fun endpoint(): String

    /**
     * The unique identifier for the document you are storing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-id)
     */
    public fun id(): String

    /**
     * The index where you want to store your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-index)
     */
    public fun index(): String

    /**
     * The IAM role ARN that has access to OpenSearch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * The type of document you are storing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-type)
     */
    public fun type(): String

    /**
     * A builder for [ElasticsearchActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpoint The endpoint of your OpenSearch domain. 
       */
      public fun endpoint(endpoint: String)

      /**
       * @param id The unique identifier for the document you are storing. 
       */
      public fun id(id: String)

      /**
       * @param index The index where you want to store your data. 
       */
      public fun index(index: String)

      /**
       * @param roleArn The IAM role ARN that has access to OpenSearch. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param type The type of document you are storing. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.Builder =
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty.builder()

      /**
       * @param endpoint The endpoint of your OpenSearch domain. 
       */
      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      /**
       * @param id The unique identifier for the document you are storing. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param index The index where you want to store your data. 
       */
      override fun index(index: String) {
        cdkBuilder.index(index)
      }

      /**
       * @param roleArn The IAM role ARN that has access to OpenSearch. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param type The type of document you are storing. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty,
    ) : CdkObject(cdkObject), ElasticsearchActionProperty {
      /**
       * The endpoint of your OpenSearch domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-endpoint)
       */
      override fun endpoint(): String = unwrap(this).getEndpoint()

      /**
       * The unique identifier for the document you are storing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The index where you want to store your data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-index)
       */
      override fun index(): String = unwrap(this).getIndex()

      /**
       * The IAM role ARN that has access to OpenSearch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The type of document you are storing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html#cfn-iot-topicrule-elasticsearchaction-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ElasticsearchActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty):
          ElasticsearchActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ElasticsearchActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticsearchActionProperty):
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRule.ElasticsearchActionProperty
    }
  }
}
