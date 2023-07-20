@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelIotTopicPublishPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.IotTopicPublishProperty.Builder =
      CfnDetectorModel.IotTopicPublishProperty.builder()

  public fun mqttTopic(mqttTopic: String) {
    cdkBuilder.mqttTopic(mqttTopic)
  }

  public fun payload(payload: IResolvable) {
    cdkBuilder.payload(payload)
  }

  public fun payload(payload: CfnDetectorModel.PayloadProperty) {
    cdkBuilder.payload(payload)
  }

  public fun build(): CfnDetectorModel.IotTopicPublishProperty = cdkBuilder.build()
}
