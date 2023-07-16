@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@CdkDslMarker
public class CfnConnectorFirehoseLogDeliveryPropertyDsl {
  private val cdkBuilder: CfnConnector.FirehoseLogDeliveryProperty.Builder =
      CfnConnector.FirehoseLogDeliveryProperty.builder()

  public fun deliveryStream(deliveryStream: String) {
    cdkBuilder.deliveryStream(deliveryStream)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnConnector.FirehoseLogDeliveryProperty = cdkBuilder.build()
}
