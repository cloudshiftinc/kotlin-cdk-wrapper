@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.mediaconnect.CfnBridge

@CdkDslMarker
public class CfnBridgeIngressGatewayBridgePropertyDsl {
  private val cdkBuilder: CfnBridge.IngressGatewayBridgeProperty.Builder =
      CfnBridge.IngressGatewayBridgeProperty.builder()

  public fun maxBitrate(maxBitrate: Number) {
    cdkBuilder.maxBitrate(maxBitrate)
  }

  public fun maxOutputs(maxOutputs: Number) {
    cdkBuilder.maxOutputs(maxOutputs)
  }

  public fun build(): CfnBridge.IngressGatewayBridgeProperty = cdkBuilder.build()
}
