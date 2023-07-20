@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelActionPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.ActionProperty.Builder =
      CfnDetectorModel.ActionProperty.builder()

  public fun clearTimer(clearTimer: IResolvable) {
    cdkBuilder.clearTimer(clearTimer)
  }

  public fun clearTimer(clearTimer: CfnDetectorModel.ClearTimerProperty) {
    cdkBuilder.clearTimer(clearTimer)
  }

  public fun dynamoDBv2(dynamoDBv2: IResolvable) {
    cdkBuilder.dynamoDBv2(dynamoDBv2)
  }

  public fun dynamoDBv2(dynamoDBv2: CfnDetectorModel.DynamoDBv2Property) {
    cdkBuilder.dynamoDBv2(dynamoDBv2)
  }

  public fun dynamoDb(dynamoDb: IResolvable) {
    cdkBuilder.dynamoDb(dynamoDb)
  }

  public fun dynamoDb(dynamoDb: CfnDetectorModel.DynamoDBProperty) {
    cdkBuilder.dynamoDb(dynamoDb)
  }

  public fun firehose(firehose: IResolvable) {
    cdkBuilder.firehose(firehose)
  }

  public fun firehose(firehose: CfnDetectorModel.FirehoseProperty) {
    cdkBuilder.firehose(firehose)
  }

  public fun iotEvents(iotEvents: IResolvable) {
    cdkBuilder.iotEvents(iotEvents)
  }

  public fun iotEvents(iotEvents: CfnDetectorModel.IotEventsProperty) {
    cdkBuilder.iotEvents(iotEvents)
  }

  public fun iotSiteWise(iotSiteWise: IResolvable) {
    cdkBuilder.iotSiteWise(iotSiteWise)
  }

  public fun iotSiteWise(iotSiteWise: CfnDetectorModel.IotSiteWiseProperty) {
    cdkBuilder.iotSiteWise(iotSiteWise)
  }

  public fun iotTopicPublish(iotTopicPublish: IResolvable) {
    cdkBuilder.iotTopicPublish(iotTopicPublish)
  }

  public fun iotTopicPublish(iotTopicPublish: CfnDetectorModel.IotTopicPublishProperty) {
    cdkBuilder.iotTopicPublish(iotTopicPublish)
  }

  public fun lambda(lambda: IResolvable) {
    cdkBuilder.lambda(lambda)
  }

  public fun lambda(lambda: CfnDetectorModel.LambdaProperty) {
    cdkBuilder.lambda(lambda)
  }

  public fun resetTimer(resetTimer: IResolvable) {
    cdkBuilder.resetTimer(resetTimer)
  }

  public fun resetTimer(resetTimer: CfnDetectorModel.ResetTimerProperty) {
    cdkBuilder.resetTimer(resetTimer)
  }

  public fun setTimer(setTimer: IResolvable) {
    cdkBuilder.setTimer(setTimer)
  }

  public fun setTimer(setTimer: CfnDetectorModel.SetTimerProperty) {
    cdkBuilder.setTimer(setTimer)
  }

  public fun setVariable(setVariable: IResolvable) {
    cdkBuilder.setVariable(setVariable)
  }

  public fun setVariable(setVariable: CfnDetectorModel.SetVariableProperty) {
    cdkBuilder.setVariable(setVariable)
  }

  public fun sns(sns: IResolvable) {
    cdkBuilder.sns(sns)
  }

  public fun sns(sns: CfnDetectorModel.SnsProperty) {
    cdkBuilder.sns(sns)
  }

  public fun sqs(sqs: IResolvable) {
    cdkBuilder.sqs(sqs)
  }

  public fun sqs(sqs: CfnDetectorModel.SqsProperty) {
    cdkBuilder.sqs(sqs)
  }

  public fun build(): CfnDetectorModel.ActionProperty = cdkBuilder.build()
}
