@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTopicRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnTopicRuleProps cfnTopicRuleProps = CfnTopicRuleProps.builder()
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
public interface CfnTopicRuleProps {
  /**
   * The name of the rule.
   *
   * *Pattern* : `[a-zA-Z0-9:_-]+`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-rulename)
   */
  public fun ruleName(): String? = unwrap(this).getRuleName()

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
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The rule payload.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-topicrulepayload)
   */
  public fun topicRulePayload(): Any

  /**
   * A builder for [CfnTopicRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ruleName The name of the rule.
     * *Pattern* : `[a-zA-Z0-9:_-]+`
     */
    public fun ruleName(ruleName: String)

    /**
     * @param tags Metadata which can be used to manage the topic rule.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata which can be used to manage the topic rule.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param topicRulePayload The rule payload. 
     */
    public fun topicRulePayload(topicRulePayload: IResolvable)

    /**
     * @param topicRulePayload The rule payload. 
     */
    public fun topicRulePayload(topicRulePayload: CfnTopicRule.TopicRulePayloadProperty)

    /**
     * @param topicRulePayload The rule payload. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71e77687a01c0ce01e94395df17c383b62abb102191d898cfb4e585d7acdad07")
    public
        fun topicRulePayload(topicRulePayload: CfnTopicRule.TopicRulePayloadProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnTopicRuleProps.Builder =
        software.amazon.awscdk.services.iot.CfnTopicRuleProps.builder()

    /**
     * @param ruleName The name of the rule.
     * *Pattern* : `[a-zA-Z0-9:_-]+`
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * @param tags Metadata which can be used to manage the topic rule.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata which can be used to manage the topic rule.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param topicRulePayload The rule payload. 
     */
    override fun topicRulePayload(topicRulePayload: IResolvable) {
      cdkBuilder.topicRulePayload(topicRulePayload.let(IResolvable::unwrap))
    }

    /**
     * @param topicRulePayload The rule payload. 
     */
    override fun topicRulePayload(topicRulePayload: CfnTopicRule.TopicRulePayloadProperty) {
      cdkBuilder.topicRulePayload(topicRulePayload.let(CfnTopicRule.TopicRulePayloadProperty::unwrap))
    }

    /**
     * @param topicRulePayload The rule payload. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71e77687a01c0ce01e94395df17c383b62abb102191d898cfb4e585d7acdad07")
    override
        fun topicRulePayload(topicRulePayload: CfnTopicRule.TopicRulePayloadProperty.Builder.() -> Unit):
        Unit = topicRulePayload(CfnTopicRule.TopicRulePayloadProperty(topicRulePayload))

    public fun build(): software.amazon.awscdk.services.iot.CfnTopicRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleProps,
  ) : CdkObject(cdkObject), CfnTopicRuleProps {
    /**
     * The name of the rule.
     *
     * *Pattern* : `[a-zA-Z0-9:_-]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-rulename)
     */
    override fun ruleName(): String? = unwrap(this).getRuleName()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The rule payload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-topicrulepayload)
     */
    override fun topicRulePayload(): Any = unwrap(this).getTopicRulePayload()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTopicRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleProps):
        CfnTopicRuleProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTopicRuleProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTopicRuleProps):
        software.amazon.awscdk.services.iot.CfnTopicRuleProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnTopicRuleProps
  }
}
