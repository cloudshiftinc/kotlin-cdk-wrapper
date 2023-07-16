@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@CdkDslMarker
public class CfnAlarmModelAlarmActionPropertyDsl {
  private val cdkBuilder: CfnAlarmModel.AlarmActionProperty.Builder =
      CfnAlarmModel.AlarmActionProperty.builder()

  public fun dynamoDBv2(dynamoDBv2: IResolvable) {
    cdkBuilder.dynamoDBv2(dynamoDBv2)
  }

  public fun dynamoDBv2(dynamoDBv2: CfnAlarmModel.DynamoDBv2Property) {
    cdkBuilder.dynamoDBv2(dynamoDBv2)
  }

  public fun dynamoDb(dynamoDb: IResolvable) {
    cdkBuilder.dynamoDb(dynamoDb)
  }

  public fun dynamoDb(dynamoDb: CfnAlarmModel.DynamoDBProperty) {
    cdkBuilder.dynamoDb(dynamoDb)
  }

  public fun firehose(firehose: IResolvable) {
    cdkBuilder.firehose(firehose)
  }

  public fun firehose(firehose: CfnAlarmModel.FirehoseProperty) {
    cdkBuilder.firehose(firehose)
  }

  public fun iotEvents(iotEvents: IResolvable) {
    cdkBuilder.iotEvents(iotEvents)
  }

  public fun iotEvents(iotEvents: CfnAlarmModel.IotEventsProperty) {
    cdkBuilder.iotEvents(iotEvents)
  }

  public fun iotSiteWise(iotSiteWise: IResolvable) {
    cdkBuilder.iotSiteWise(iotSiteWise)
  }

  public fun iotSiteWise(iotSiteWise: CfnAlarmModel.IotSiteWiseProperty) {
    cdkBuilder.iotSiteWise(iotSiteWise)
  }

  public fun iotTopicPublish(iotTopicPublish: IResolvable) {
    cdkBuilder.iotTopicPublish(iotTopicPublish)
  }

  public fun iotTopicPublish(iotTopicPublish: CfnAlarmModel.IotTopicPublishProperty) {
    cdkBuilder.iotTopicPublish(iotTopicPublish)
  }

  public fun lambda(lambda: IResolvable) {
    cdkBuilder.lambda(lambda)
  }

  public fun lambda(lambda: CfnAlarmModel.LambdaProperty) {
    cdkBuilder.lambda(lambda)
  }

  public fun sns(sns: IResolvable) {
    cdkBuilder.sns(sns)
  }

  public fun sns(sns: CfnAlarmModel.SnsProperty) {
    cdkBuilder.sns(sns)
  }

  public fun sqs(sqs: IResolvable) {
    cdkBuilder.sqs(sqs)
  }

  public fun sqs(sqs: CfnAlarmModel.SqsProperty) {
    cdkBuilder.sqs(sqs)
  }

  public fun build(): CfnAlarmModel.AlarmActionProperty = cdkBuilder.build()
}
