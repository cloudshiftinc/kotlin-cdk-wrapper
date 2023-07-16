@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.mediaconnect.CfnBridge

@CdkDslMarker
public class CfnBridgeEgressGatewayBridgePropertyDsl {
  private val cdkBuilder: CfnBridge.EgressGatewayBridgeProperty.Builder =
      CfnBridge.EgressGatewayBridgeProperty.builder()

  public fun maxBitrate(maxBitrate: Number) {
    cdkBuilder.maxBitrate(maxBitrate)
  }

  public fun build(): CfnBridge.EgressGatewayBridgeProperty = cdkBuilder.build()
}
