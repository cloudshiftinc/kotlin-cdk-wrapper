@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelActionPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.ActionProperty.Builder =
      CfnDetectorModel.ActionProperty.builder()

  /**
   * @param clearTimer Information needed to clear the timer.
   */
  public fun clearTimer(clearTimer: IResolvable) {
    cdkBuilder.clearTimer(clearTimer)
  }

  /**
   * @param clearTimer Information needed to clear the timer.
   */
  public fun clearTimer(clearTimer: CfnDetectorModel.ClearTimerProperty) {
    cdkBuilder.clearTimer(clearTimer)
  }

  /**
   * @param dynamoDBv2 Writes to the DynamoDB table that you created.
   * The default action payload contains all attribute-value pairs that have the information about
   * the detector model instance and the event that triggered the action. You can customize the
   * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A separate
   * column of the DynamoDB table receives one attribute-value pair in the payload that you specify.
   * For more information, see
   * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
   * in *AWS IoT Events Developer Guide* .
   */
  public fun dynamoDBv2(dynamoDBv2: IResolvable) {
    cdkBuilder.dynamoDBv2(dynamoDBv2)
  }

  /**
   * @param dynamoDBv2 Writes to the DynamoDB table that you created.
   * The default action payload contains all attribute-value pairs that have the information about
   * the detector model instance and the event that triggered the action. You can customize the
   * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A separate
   * column of the DynamoDB table receives one attribute-value pair in the payload that you specify.
   * For more information, see
   * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
   * in *AWS IoT Events Developer Guide* .
   */
  public fun dynamoDBv2(dynamoDBv2: CfnDetectorModel.DynamoDBv2Property) {
    cdkBuilder.dynamoDBv2(dynamoDBv2)
  }

  /**
   * @param dynamoDb Writes to the DynamoDB table that you created.
   * The default action payload contains all attribute-value pairs that have the information about
   * the detector model instance and the event that triggered the action. You can customize the
   * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . One column
   * of the DynamoDB table receives all attribute-value pairs in the payload that you specify. For more
   * information, see
   * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
   * in *AWS IoT Events Developer Guide* .
   */
  public fun dynamoDb(dynamoDb: IResolvable) {
    cdkBuilder.dynamoDb(dynamoDb)
  }

  /**
   * @param dynamoDb Writes to the DynamoDB table that you created.
   * The default action payload contains all attribute-value pairs that have the information about
   * the detector model instance and the event that triggered the action. You can customize the
   * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . One column
   * of the DynamoDB table receives all attribute-value pairs in the payload that you specify. For more
   * information, see
   * [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html)
   * in *AWS IoT Events Developer Guide* .
   */
  public fun dynamoDb(dynamoDb: CfnDetectorModel.DynamoDBProperty) {
    cdkBuilder.dynamoDb(dynamoDb)
  }

  /**
   * @param firehose Sends information about the detector model instance and the event that
   * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
   */
  public fun firehose(firehose: IResolvable) {
    cdkBuilder.firehose(firehose)
  }

  /**
   * @param firehose Sends information about the detector model instance and the event that
   * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
   */
  public fun firehose(firehose: CfnDetectorModel.FirehoseProperty) {
    cdkBuilder.firehose(firehose)
  }

  /**
   * @param iotEvents Sends AWS IoT Events input, which passes information about the detector model
   * instance and the event that triggered the action.
   */
  public fun iotEvents(iotEvents: IResolvable) {
    cdkBuilder.iotEvents(iotEvents)
  }

  /**
   * @param iotEvents Sends AWS IoT Events input, which passes information about the detector model
   * instance and the event that triggered the action.
   */
  public fun iotEvents(iotEvents: CfnDetectorModel.IotEventsProperty) {
    cdkBuilder.iotEvents(iotEvents)
  }

  /**
   * @param iotSiteWise Sends information about the detector model instance and the event that
   * triggered the action to an asset property in AWS IoT SiteWise .
   */
  public fun iotSiteWise(iotSiteWise: IResolvable) {
    cdkBuilder.iotSiteWise(iotSiteWise)
  }

  /**
   * @param iotSiteWise Sends information about the detector model instance and the event that
   * triggered the action to an asset property in AWS IoT SiteWise .
   */
  public fun iotSiteWise(iotSiteWise: CfnDetectorModel.IotSiteWiseProperty) {
    cdkBuilder.iotSiteWise(iotSiteWise)
  }

  /**
   * @param iotTopicPublish Publishes an MQTT message with the given topic to the AWS IoT message
   * broker.
   */
  public fun iotTopicPublish(iotTopicPublish: IResolvable) {
    cdkBuilder.iotTopicPublish(iotTopicPublish)
  }

  /**
   * @param iotTopicPublish Publishes an MQTT message with the given topic to the AWS IoT message
   * broker.
   */
  public fun iotTopicPublish(iotTopicPublish: CfnDetectorModel.IotTopicPublishProperty) {
    cdkBuilder.iotTopicPublish(iotTopicPublish)
  }

  /**
   * @param lambda Calls a Lambda function, passing in information about the detector model instance
   * and the event that triggered the action.
   */
  public fun lambda(lambda: IResolvable) {
    cdkBuilder.lambda(lambda)
  }

  /**
   * @param lambda Calls a Lambda function, passing in information about the detector model instance
   * and the event that triggered the action.
   */
  public fun lambda(lambda: CfnDetectorModel.LambdaProperty) {
    cdkBuilder.lambda(lambda)
  }

  /**
   * @param resetTimer Information needed to reset the timer.
   */
  public fun resetTimer(resetTimer: IResolvable) {
    cdkBuilder.resetTimer(resetTimer)
  }

  /**
   * @param resetTimer Information needed to reset the timer.
   */
  public fun resetTimer(resetTimer: CfnDetectorModel.ResetTimerProperty) {
    cdkBuilder.resetTimer(resetTimer)
  }

  /**
   * @param setTimer Information needed to set the timer.
   */
  public fun setTimer(setTimer: IResolvable) {
    cdkBuilder.setTimer(setTimer)
  }

  /**
   * @param setTimer Information needed to set the timer.
   */
  public fun setTimer(setTimer: CfnDetectorModel.SetTimerProperty) {
    cdkBuilder.setTimer(setTimer)
  }

  /**
   * @param setVariable Sets a variable to a specified value.
   */
  public fun setVariable(setVariable: IResolvable) {
    cdkBuilder.setVariable(setVariable)
  }

  /**
   * @param setVariable Sets a variable to a specified value.
   */
  public fun setVariable(setVariable: CfnDetectorModel.SetVariableProperty) {
    cdkBuilder.setVariable(setVariable)
  }

  /**
   * @param sns Sends an Amazon SNS message.
   */
  public fun sns(sns: IResolvable) {
    cdkBuilder.sns(sns)
  }

  /**
   * @param sns Sends an Amazon SNS message.
   */
  public fun sns(sns: CfnDetectorModel.SnsProperty) {
    cdkBuilder.sns(sns)
  }

  /**
   * @param sqs Sends an Amazon SNS message.
   */
  public fun sqs(sqs: IResolvable) {
    cdkBuilder.sqs(sqs)
  }

  /**
   * @param sqs Sends an Amazon SNS message.
   */
  public fun sqs(sqs: CfnDetectorModel.SqsProperty) {
    cdkBuilder.sqs(sqs)
  }

  public fun build(): CfnDetectorModel.ActionProperty = cdkBuilder.build()
}
