@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleKafkaActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.KafkaActionProperty.Builder =
      CfnTopicRule.KafkaActionProperty.builder()

  public fun clientProperties(clientProperties: Map<String, String>) {
    cdkBuilder.clientProperties(clientProperties)
  }

  public fun clientProperties(clientProperties: IResolvable) {
    cdkBuilder.clientProperties(clientProperties)
  }

  public fun destinationArn(destinationArn: String) {
    cdkBuilder.destinationArn(destinationArn)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun partition(partition: String) {
    cdkBuilder.partition(partition)
  }

  public fun topic(topic: String) {
    cdkBuilder.topic(topic)
  }

  public fun build(): CfnTopicRule.KafkaActionProperty = cdkBuilder.build()
}
