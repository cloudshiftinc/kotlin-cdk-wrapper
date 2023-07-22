@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleIotEventsActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.IotEventsActionProperty.Builder =
      CfnTopicRule.IotEventsActionProperty.builder()

  /**
   * @param batchMode Whether to process the event actions as a batch. The default value is `false`
   * .
   * When `batchMode` is `true` , you can't specify a `messageId` .
   *
   * When `batchMode` is `true` and the rule SQL statement evaluates to an Array, each Array element
   * is treated as a separate message when Events by calling
   * [`BatchPutMessage`](https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html)
   * . The resulting array can't have more than 10 messages.
   */
  public fun batchMode(batchMode: Boolean) {
    cdkBuilder.batchMode(batchMode)
  }

  /**
   * @param batchMode Whether to process the event actions as a batch. The default value is `false`
   * .
   * When `batchMode` is `true` , you can't specify a `messageId` .
   *
   * When `batchMode` is `true` and the rule SQL statement evaluates to an Array, each Array element
   * is treated as a separate message when Events by calling
   * [`BatchPutMessage`](https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html)
   * . The resulting array can't have more than 10 messages.
   */
  public fun batchMode(batchMode: IResolvable) {
    cdkBuilder.batchMode(batchMode)
  }

  /**
   * @param inputName The name of the AWS IoT Events input. 
   */
  public fun inputName(inputName: String) {
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
  public fun messageId(messageId: String) {
    cdkBuilder.messageId(messageId)
  }

  /**
   * @param roleArn The ARN of the role that grants AWS IoT permission to send an input to an AWS
   * IoT Events detector. 
   * ("Action":"iotevents:BatchPutMessage").
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnTopicRule.IotEventsActionProperty = cdkBuilder.build()
}
