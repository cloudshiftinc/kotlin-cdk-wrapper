@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.ActionProperty.Builder =
      CfnTopicRule.ActionProperty.builder()

  public fun cloudwatchAlarm(cloudwatchAlarm: IResolvable) {
    cdkBuilder.cloudwatchAlarm(cloudwatchAlarm)
  }

  public fun cloudwatchAlarm(cloudwatchAlarm: CfnTopicRule.CloudwatchAlarmActionProperty) {
    cdkBuilder.cloudwatchAlarm(cloudwatchAlarm)
  }

  public fun cloudwatchLogs(cloudwatchLogs: IResolvable) {
    cdkBuilder.cloudwatchLogs(cloudwatchLogs)
  }

  public fun cloudwatchLogs(cloudwatchLogs: CfnTopicRule.CloudwatchLogsActionProperty) {
    cdkBuilder.cloudwatchLogs(cloudwatchLogs)
  }

  public fun cloudwatchMetric(cloudwatchMetric: IResolvable) {
    cdkBuilder.cloudwatchMetric(cloudwatchMetric)
  }

  public fun cloudwatchMetric(cloudwatchMetric: CfnTopicRule.CloudwatchMetricActionProperty) {
    cdkBuilder.cloudwatchMetric(cloudwatchMetric)
  }

  public fun dynamoDBv2(dynamoDBv2: IResolvable) {
    cdkBuilder.dynamoDBv2(dynamoDBv2)
  }

  public fun dynamoDBv2(dynamoDBv2: CfnTopicRule.DynamoDBv2ActionProperty) {
    cdkBuilder.dynamoDBv2(dynamoDBv2)
  }

  public fun dynamoDb(dynamoDb: IResolvable) {
    cdkBuilder.dynamoDb(dynamoDb)
  }

  public fun dynamoDb(dynamoDb: CfnTopicRule.DynamoDBActionProperty) {
    cdkBuilder.dynamoDb(dynamoDb)
  }

  public fun elasticsearch(elasticsearch: IResolvable) {
    cdkBuilder.elasticsearch(elasticsearch)
  }

  public fun elasticsearch(elasticsearch: CfnTopicRule.ElasticsearchActionProperty) {
    cdkBuilder.elasticsearch(elasticsearch)
  }

  public fun firehose(firehose: IResolvable) {
    cdkBuilder.firehose(firehose)
  }

  public fun firehose(firehose: CfnTopicRule.FirehoseActionProperty) {
    cdkBuilder.firehose(firehose)
  }

  public fun http(http: IResolvable) {
    cdkBuilder.http(http)
  }

  public fun http(http: CfnTopicRule.HttpActionProperty) {
    cdkBuilder.http(http)
  }

  public fun iotAnalytics(iotAnalytics: IResolvable) {
    cdkBuilder.iotAnalytics(iotAnalytics)
  }

  public fun iotAnalytics(iotAnalytics: CfnTopicRule.IotAnalyticsActionProperty) {
    cdkBuilder.iotAnalytics(iotAnalytics)
  }

  public fun iotEvents(iotEvents: IResolvable) {
    cdkBuilder.iotEvents(iotEvents)
  }

  public fun iotEvents(iotEvents: CfnTopicRule.IotEventsActionProperty) {
    cdkBuilder.iotEvents(iotEvents)
  }

  public fun iotSiteWise(iotSiteWise: IResolvable) {
    cdkBuilder.iotSiteWise(iotSiteWise)
  }

  public fun iotSiteWise(iotSiteWise: CfnTopicRule.IotSiteWiseActionProperty) {
    cdkBuilder.iotSiteWise(iotSiteWise)
  }

  public fun kafka(kafka: IResolvable) {
    cdkBuilder.kafka(kafka)
  }

  public fun kafka(kafka: CfnTopicRule.KafkaActionProperty) {
    cdkBuilder.kafka(kafka)
  }

  public fun kinesis(kinesis: IResolvable) {
    cdkBuilder.kinesis(kinesis)
  }

  public fun kinesis(kinesis: CfnTopicRule.KinesisActionProperty) {
    cdkBuilder.kinesis(kinesis)
  }

  public fun lambda(lambda: IResolvable) {
    cdkBuilder.lambda(lambda)
  }

  public fun lambda(lambda: CfnTopicRule.LambdaActionProperty) {
    cdkBuilder.lambda(lambda)
  }

  public fun location(location: IResolvable) {
    cdkBuilder.location(location)
  }

  public fun location(location: CfnTopicRule.LocationActionProperty) {
    cdkBuilder.location(location)
  }

  public fun openSearch(openSearch: IResolvable) {
    cdkBuilder.openSearch(openSearch)
  }

  public fun openSearch(openSearch: CfnTopicRule.OpenSearchActionProperty) {
    cdkBuilder.openSearch(openSearch)
  }

  public fun republish(republish: IResolvable) {
    cdkBuilder.republish(republish)
  }

  public fun republish(republish: CfnTopicRule.RepublishActionProperty) {
    cdkBuilder.republish(republish)
  }

  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  public fun s3(s3: CfnTopicRule.S3ActionProperty) {
    cdkBuilder.s3(s3)
  }

  public fun sns(sns: IResolvable) {
    cdkBuilder.sns(sns)
  }

  public fun sns(sns: CfnTopicRule.SnsActionProperty) {
    cdkBuilder.sns(sns)
  }

  public fun sqs(sqs: IResolvable) {
    cdkBuilder.sqs(sqs)
  }

  public fun sqs(sqs: CfnTopicRule.SqsActionProperty) {
    cdkBuilder.sqs(sqs)
  }

  public fun stepFunctions(stepFunctions: IResolvable) {
    cdkBuilder.stepFunctions(stepFunctions)
  }

  public fun stepFunctions(stepFunctions: CfnTopicRule.StepFunctionsActionProperty) {
    cdkBuilder.stepFunctions(stepFunctions)
  }

  public fun timestream(timestream: IResolvable) {
    cdkBuilder.timestream(timestream)
  }

  public fun timestream(timestream: CfnTopicRule.TimestreamActionProperty) {
    cdkBuilder.timestream(timestream)
  }

  public fun build(): CfnTopicRule.ActionProperty = cdkBuilder.build()
}
