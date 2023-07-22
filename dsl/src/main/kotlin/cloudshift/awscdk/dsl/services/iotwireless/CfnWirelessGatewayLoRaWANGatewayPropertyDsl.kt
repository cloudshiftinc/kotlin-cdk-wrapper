@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnWirelessGateway

/**
 * LoRaWAN wireless gateway object.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * LoRaWANGatewayProperty loRaWANGatewayProperty = LoRaWANGatewayProperty.builder()
 * .gatewayEui("gatewayEui")
 * .rfRegion("rfRegion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessgateway-lorawangateway.html)
 */
@CdkDslMarker
public class CfnWirelessGatewayLoRaWANGatewayPropertyDsl {
  private val cdkBuilder: CfnWirelessGateway.LoRaWANGatewayProperty.Builder =
      CfnWirelessGateway.LoRaWANGatewayProperty.builder()

  /**
   * @param gatewayEui The gateway's EUI value. 
   */
  public fun gatewayEui(gatewayEui: String) {
    cdkBuilder.gatewayEui(gatewayEui)
  }

  /**
   * @param rfRegion The frequency band (RFRegion) value. 
   */
  public fun rfRegion(rfRegion: String) {
    cdkBuilder.rfRegion(rfRegion)
  }

  public fun build(): CfnWirelessGateway.LoRaWANGatewayProperty = cdkBuilder.build()
}
