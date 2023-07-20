@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnWirelessGateway

@CdkDslMarker
public class CfnWirelessGatewayLoRaWANGatewayPropertyDsl {
  private val cdkBuilder: CfnWirelessGateway.LoRaWANGatewayProperty.Builder =
      CfnWirelessGateway.LoRaWANGatewayProperty.builder()

  public fun gatewayEui(gatewayEui: String) {
    cdkBuilder.gatewayEui(gatewayEui)
  }

  public fun rfRegion(rfRegion: String) {
    cdkBuilder.rfRegion(rfRegion)
  }

  public fun build(): CfnWirelessGateway.LoRaWANGatewayProperty = cdkBuilder.build()
}
