@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@CdkDslMarker
public class CfnAlarmModelIotTopicPublishPropertyDsl {
  private val cdkBuilder: CfnAlarmModel.IotTopicPublishProperty.Builder =
      CfnAlarmModel.IotTopicPublishProperty.builder()

  public fun mqttTopic(mqttTopic: String) {
    cdkBuilder.mqttTopic(mqttTopic)
  }

  public fun payload(payload: IResolvable) {
    cdkBuilder.payload(payload)
  }

  public fun payload(payload: CfnAlarmModel.PayloadProperty) {
    cdkBuilder.payload(payload)
  }

  public fun build(): CfnAlarmModel.IotTopicPublishProperty = cdkBuilder.build()
}
