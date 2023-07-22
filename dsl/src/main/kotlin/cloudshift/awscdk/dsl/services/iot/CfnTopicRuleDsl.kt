@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule
import software.constructs.Construct

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
 * import software.amazon.awscdk.services.iot.*;
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
@CdkDslMarker
public class CfnTopicRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTopicRule.Builder = CfnTopicRule.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The name of the rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-rulename)
   * @param ruleName The name of the rule. 
   */
  public fun ruleName(ruleName: String) {
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
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
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
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The rule payload.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-topicrulepayload)
   * @param topicRulePayload The rule payload. 
   */
  public fun topicRulePayload(topicRulePayload: IResolvable) {
    cdkBuilder.topicRulePayload(topicRulePayload)
  }

  /**
   * The rule payload.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-topicrulepayload)
   * @param topicRulePayload The rule payload. 
   */
  public fun topicRulePayload(topicRulePayload: CfnTopicRule.TopicRulePayloadProperty) {
    cdkBuilder.topicRulePayload(topicRulePayload)
  }

  public fun build(): CfnTopicRule {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
