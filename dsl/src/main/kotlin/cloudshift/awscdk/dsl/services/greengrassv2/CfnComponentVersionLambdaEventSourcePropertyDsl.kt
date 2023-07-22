@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

@CdkDslMarker
public class CfnComponentVersionLambdaEventSourcePropertyDsl {
  private val cdkBuilder: CfnComponentVersion.LambdaEventSourceProperty.Builder =
      CfnComponentVersion.LambdaEventSourceProperty.builder()

  /**
   * @param topic The topic to which to subscribe to receive event messages.
   */
  public fun topic(topic: String) {
    cdkBuilder.topic(topic)
  }

  /**
   * @param type The type of event source. Choose from the following options:.
   * * `PUB_SUB` – Subscribe to local publish/subscribe messages. This event source type doesn't
   * support MQTT wildcards ( `+` and `#` ) in the event source topic.
   * * `IOT_CORE` – Subscribe to AWS IoT Core MQTT messages. This event source type supports MQTT
   * wildcards ( `+` and `#` ) in the event source topic.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnComponentVersion.LambdaEventSourceProperty = cdkBuilder.build()
}
