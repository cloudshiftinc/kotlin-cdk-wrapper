@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleKinesisActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.KinesisActionProperty.Builder =
      CfnTopicRule.KinesisActionProperty.builder()

  public fun partitionKey(partitionKey: String) {
    cdkBuilder.partitionKey(partitionKey)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun streamName(streamName: String) {
    cdkBuilder.streamName(streamName)
  }

  public fun build(): CfnTopicRule.KinesisActionProperty = cdkBuilder.build()
}
