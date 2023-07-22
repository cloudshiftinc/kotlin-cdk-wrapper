@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleKinesisActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.KinesisActionProperty.Builder =
      CfnTopicRule.KinesisActionProperty.builder()

  /**
   * @param partitionKey The partition key.
   */
  public fun partitionKey(partitionKey: String) {
    cdkBuilder.partitionKey(partitionKey)
  }

  /**
   * @param roleArn The ARN of the IAM role that grants access to the Amazon Kinesis stream. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param streamName The name of the Amazon Kinesis stream. 
   */
  public fun streamName(streamName: String) {
    cdkBuilder.streamName(streamName)
  }

  public fun build(): CfnTopicRule.KinesisActionProperty = cdkBuilder.build()
}
