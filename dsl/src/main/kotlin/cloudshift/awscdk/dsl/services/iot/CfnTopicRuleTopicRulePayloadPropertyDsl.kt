@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes a rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
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
@CdkDslMarker
public class CfnTopicRuleTopicRulePayloadPropertyDsl {
    private val cdkBuilder: CfnTopicRule.TopicRulePayloadProperty.Builder =
        CfnTopicRule.TopicRulePayloadProperty.builder()

    private val _actions: MutableList<Any> = mutableListOf()

    /** @param actions The actions associated with the rule. */
    public fun actions(vararg actions: Any) {
        _actions.addAll(listOf(*actions))
    }

    /** @param actions The actions associated with the rule. */
    public fun actions(actions: Collection<Any>) {
        _actions.addAll(actions)
    }

    /** @param actions The actions associated with the rule. */
    public fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions)
    }

    /**
     * @param awsIotSqlVersion The version of the SQL rules engine to use when evaluating the rule.
     *   The default value is 2015-10-08.
     */
    public fun awsIotSqlVersion(awsIotSqlVersion: String) {
        cdkBuilder.awsIotSqlVersion(awsIotSqlVersion)
    }

    /** @param description The description of the rule. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param errorAction The action to take when an error occurs. */
    public fun errorAction(errorAction: IResolvable) {
        cdkBuilder.errorAction(errorAction)
    }

    /** @param errorAction The action to take when an error occurs. */
    public fun errorAction(errorAction: CfnTopicRule.ActionProperty) {
        cdkBuilder.errorAction(errorAction)
    }

    /** @param ruleDisabled Specifies whether the rule is disabled. */
    public fun ruleDisabled(ruleDisabled: Boolean) {
        cdkBuilder.ruleDisabled(ruleDisabled)
    }

    /** @param ruleDisabled Specifies whether the rule is disabled. */
    public fun ruleDisabled(ruleDisabled: IResolvable) {
        cdkBuilder.ruleDisabled(ruleDisabled)
    }

    /**
     * @param sql The SQL statement used to query the topic. For more information, see
     *   [AWS IoT SQL Reference](https://docs.aws.amazon.com/iot/latest/developerguide/iot-sql-reference.html)
     *   in the *AWS IoT Developer Guide* .
     */
    public fun sql(sql: String) {
        cdkBuilder.sql(sql)
    }

    public fun build(): CfnTopicRule.TopicRulePayloadProperty {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        return cdkBuilder.build()
    }
}
