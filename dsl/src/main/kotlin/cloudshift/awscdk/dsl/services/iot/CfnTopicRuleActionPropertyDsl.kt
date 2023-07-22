@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.ActionProperty.Builder =
      CfnTopicRule.ActionProperty.builder()

  /**
   * @param cloudwatchAlarm Change the state of a CloudWatch alarm.
   */
  public fun cloudwatchAlarm(cloudwatchAlarm: IResolvable) {
    cdkBuilder.cloudwatchAlarm(cloudwatchAlarm)
  }

  /**
   * @param cloudwatchAlarm Change the state of a CloudWatch alarm.
   */
  public fun cloudwatchAlarm(cloudwatchAlarm: CfnTopicRule.CloudwatchAlarmActionProperty) {
    cdkBuilder.cloudwatchAlarm(cloudwatchAlarm)
  }

  /**
   * @param cloudwatchLogs Sends data to CloudWatch.
   */
  public fun cloudwatchLogs(cloudwatchLogs: IResolvable) {
    cdkBuilder.cloudwatchLogs(cloudwatchLogs)
  }

  /**
   * @param cloudwatchLogs Sends data to CloudWatch.
   */
  public fun cloudwatchLogs(cloudwatchLogs: CfnTopicRule.CloudwatchLogsActionProperty) {
    cdkBuilder.cloudwatchLogs(cloudwatchLogs)
  }

  /**
   * @param cloudwatchMetric Capture a CloudWatch metric.
   */
  public fun cloudwatchMetric(cloudwatchMetric: IResolvable) {
    cdkBuilder.cloudwatchMetric(cloudwatchMetric)
  }

  /**
   * @param cloudwatchMetric Capture a CloudWatch metric.
   */
  public fun cloudwatchMetric(cloudwatchMetric: CfnTopicRule.CloudwatchMetricActionProperty) {
    cdkBuilder.cloudwatchMetric(cloudwatchMetric)
  }

  /**
   * @param dynamoDBv2 Write to a DynamoDB table.
   * This is a new version of the DynamoDB action. It allows you to write each attribute in an MQTT
   * message payload into a separate DynamoDB column.
   */
  public fun dynamoDBv2(dynamoDBv2: IResolvable) {
    cdkBuilder.dynamoDBv2(dynamoDBv2)
  }

  /**
   * @param dynamoDBv2 Write to a DynamoDB table.
   * This is a new version of the DynamoDB action. It allows you to write each attribute in an MQTT
   * message payload into a separate DynamoDB column.
   */
  public fun dynamoDBv2(dynamoDBv2: CfnTopicRule.DynamoDBv2ActionProperty) {
    cdkBuilder.dynamoDBv2(dynamoDBv2)
  }

  /**
   * @param dynamoDb Write to a DynamoDB table.
   */
  public fun dynamoDb(dynamoDb: IResolvable) {
    cdkBuilder.dynamoDb(dynamoDb)
  }

  /**
   * @param dynamoDb Write to a DynamoDB table.
   */
  public fun dynamoDb(dynamoDb: CfnTopicRule.DynamoDBActionProperty) {
    cdkBuilder.dynamoDb(dynamoDb)
  }

  /**
   * @param elasticsearch Write data to an Amazon OpenSearch Service domain.
   *
   * The `Elasticsearch` action can only be used by existing rule actions. To create a new rule
   * action or to update an existing rule action, use the `OpenSearch` rule action instead. For more
   * information, see
   * [OpenSearchAction](https://docs.aws.amazon.com//iot/latest/apireference/API_OpenSearchAction.html)
   * .
   */
  public fun elasticsearch(elasticsearch: IResolvable) {
    cdkBuilder.elasticsearch(elasticsearch)
  }

  /**
   * @param elasticsearch Write data to an Amazon OpenSearch Service domain.
   *
   * The `Elasticsearch` action can only be used by existing rule actions. To create a new rule
   * action or to update an existing rule action, use the `OpenSearch` rule action instead. For more
   * information, see
   * [OpenSearchAction](https://docs.aws.amazon.com//iot/latest/apireference/API_OpenSearchAction.html)
   * .
   */
  public fun elasticsearch(elasticsearch: CfnTopicRule.ElasticsearchActionProperty) {
    cdkBuilder.elasticsearch(elasticsearch)
  }

  /**
   * @param firehose Write to an Amazon Kinesis Firehose stream.
   */
  public fun firehose(firehose: IResolvable) {
    cdkBuilder.firehose(firehose)
  }

  /**
   * @param firehose Write to an Amazon Kinesis Firehose stream.
   */
  public fun firehose(firehose: CfnTopicRule.FirehoseActionProperty) {
    cdkBuilder.firehose(firehose)
  }

  /**
   * @param http Send data to an HTTPS endpoint.
   */
  public fun http(http: IResolvable) {
    cdkBuilder.http(http)
  }

  /**
   * @param http Send data to an HTTPS endpoint.
   */
  public fun http(http: CfnTopicRule.HttpActionProperty) {
    cdkBuilder.http(http)
  }

  /**
   * @param iotAnalytics Sends message data to an AWS IoT Analytics channel.
   */
  public fun iotAnalytics(iotAnalytics: IResolvable) {
    cdkBuilder.iotAnalytics(iotAnalytics)
  }

  /**
   * @param iotAnalytics Sends message data to an AWS IoT Analytics channel.
   */
  public fun iotAnalytics(iotAnalytics: CfnTopicRule.IotAnalyticsActionProperty) {
    cdkBuilder.iotAnalytics(iotAnalytics)
  }

  /**
   * @param iotEvents Sends an input to an AWS IoT Events detector.
   */
  public fun iotEvents(iotEvents: IResolvable) {
    cdkBuilder.iotEvents(iotEvents)
  }

  /**
   * @param iotEvents Sends an input to an AWS IoT Events detector.
   */
  public fun iotEvents(iotEvents: CfnTopicRule.IotEventsActionProperty) {
    cdkBuilder.iotEvents(iotEvents)
  }

  /**
   * @param iotSiteWise Sends data from the MQTT message that triggered the rule to AWS IoT SiteWise
   * asset properties.
   */
  public fun iotSiteWise(iotSiteWise: IResolvable) {
    cdkBuilder.iotSiteWise(iotSiteWise)
  }

  /**
   * @param iotSiteWise Sends data from the MQTT message that triggered the rule to AWS IoT SiteWise
   * asset properties.
   */
  public fun iotSiteWise(iotSiteWise: CfnTopicRule.IotSiteWiseActionProperty) {
    cdkBuilder.iotSiteWise(iotSiteWise)
  }

  /**
   * @param kafka Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or
   * self-managed Apache Kafka cluster.
   */
  public fun kafka(kafka: IResolvable) {
    cdkBuilder.kafka(kafka)
  }

  /**
   * @param kafka Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or
   * self-managed Apache Kafka cluster.
   */
  public fun kafka(kafka: CfnTopicRule.KafkaActionProperty) {
    cdkBuilder.kafka(kafka)
  }

  /**
   * @param kinesis Write data to an Amazon Kinesis stream.
   */
  public fun kinesis(kinesis: IResolvable) {
    cdkBuilder.kinesis(kinesis)
  }

  /**
   * @param kinesis Write data to an Amazon Kinesis stream.
   */
  public fun kinesis(kinesis: CfnTopicRule.KinesisActionProperty) {
    cdkBuilder.kinesis(kinesis)
  }

  /**
   * @param lambda Invoke a Lambda function.
   */
  public fun lambda(lambda: IResolvable) {
    cdkBuilder.lambda(lambda)
  }

  /**
   * @param lambda Invoke a Lambda function.
   */
  public fun lambda(lambda: CfnTopicRule.LambdaActionProperty) {
    cdkBuilder.lambda(lambda)
  }

  /**
   * @param location Sends device location data to [Amazon Location
   * Service](https://docs.aws.amazon.com//location/latest/developerguide/welcome.html) .
   */
  public fun location(location: IResolvable) {
    cdkBuilder.location(location)
  }

  /**
   * @param location Sends device location data to [Amazon Location
   * Service](https://docs.aws.amazon.com//location/latest/developerguide/welcome.html) .
   */
  public fun location(location: CfnTopicRule.LocationActionProperty) {
    cdkBuilder.location(location)
  }

  /**
   * @param openSearch Write data to an Amazon OpenSearch Service domain.
   */
  public fun openSearch(openSearch: IResolvable) {
    cdkBuilder.openSearch(openSearch)
  }

  /**
   * @param openSearch Write data to an Amazon OpenSearch Service domain.
   */
  public fun openSearch(openSearch: CfnTopicRule.OpenSearchActionProperty) {
    cdkBuilder.openSearch(openSearch)
  }

  /**
   * @param republish Publish to another MQTT topic.
   */
  public fun republish(republish: IResolvable) {
    cdkBuilder.republish(republish)
  }

  /**
   * @param republish Publish to another MQTT topic.
   */
  public fun republish(republish: CfnTopicRule.RepublishActionProperty) {
    cdkBuilder.republish(republish)
  }

  /**
   * @param s3 Write to an Amazon S3 bucket.
   */
  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  /**
   * @param s3 Write to an Amazon S3 bucket.
   */
  public fun s3(s3: CfnTopicRule.S3ActionProperty) {
    cdkBuilder.s3(s3)
  }

  /**
   * @param sns Publish to an Amazon SNS topic.
   */
  public fun sns(sns: IResolvable) {
    cdkBuilder.sns(sns)
  }

  /**
   * @param sns Publish to an Amazon SNS topic.
   */
  public fun sns(sns: CfnTopicRule.SnsActionProperty) {
    cdkBuilder.sns(sns)
  }

  /**
   * @param sqs Publish to an Amazon SQS queue.
   */
  public fun sqs(sqs: IResolvable) {
    cdkBuilder.sqs(sqs)
  }

  /**
   * @param sqs Publish to an Amazon SQS queue.
   */
  public fun sqs(sqs: CfnTopicRule.SqsActionProperty) {
    cdkBuilder.sqs(sqs)
  }

  /**
   * @param stepFunctions Starts execution of a Step Functions state machine.
   */
  public fun stepFunctions(stepFunctions: IResolvable) {
    cdkBuilder.stepFunctions(stepFunctions)
  }

  /**
   * @param stepFunctions Starts execution of a Step Functions state machine.
   */
  public fun stepFunctions(stepFunctions: CfnTopicRule.StepFunctionsActionProperty) {
    cdkBuilder.stepFunctions(stepFunctions)
  }

  /**
   * @param timestream Writes attributes from an MQTT message.
   */
  public fun timestream(timestream: IResolvable) {
    cdkBuilder.timestream(timestream)
  }

  /**
   * @param timestream Writes attributes from an MQTT message.
   */
  public fun timestream(timestream: CfnTopicRule.TimestreamActionProperty) {
    cdkBuilder.timestream(timestream)
  }

  public fun build(): CfnTopicRule.ActionProperty = cdkBuilder.build()
}
