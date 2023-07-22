@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest

@CdkDslMarker
public class CfnDecoderManifestNetworkInterfacesItemsPropertyDsl {
  private val cdkBuilder: CfnDecoderManifest.NetworkInterfacesItemsProperty.Builder =
      CfnDecoderManifest.NetworkInterfacesItemsProperty.builder()

  /**
   * @param canInterface (Optional) Information about a network interface specified by the
   * Controller Area Network (CAN) protocol.
   */
  public fun canInterface(canInterface: IResolvable) {
    cdkBuilder.canInterface(canInterface)
  }

  /**
   * @param canInterface (Optional) Information about a network interface specified by the
   * Controller Area Network (CAN) protocol.
   */
  public fun canInterface(canInterface: CfnDecoderManifest.CanInterfaceProperty) {
    cdkBuilder.canInterface(canInterface)
  }

  /**
   * @param interfaceId The ID of the network interface. 
   */
  public fun interfaceId(interfaceId: String) {
    cdkBuilder.interfaceId(interfaceId)
  }

  /**
   * @param obdInterface (Optional) Information about a network interface specified by the On-board
   * diagnostic (OBD) II protocol.
   */
  public fun obdInterface(obdInterface: IResolvable) {
    cdkBuilder.obdInterface(obdInterface)
  }

  /**
   * @param obdInterface (Optional) Information about a network interface specified by the On-board
   * diagnostic (OBD) II protocol.
   */
  public fun obdInterface(obdInterface: CfnDecoderManifest.ObdInterfaceProperty) {
    cdkBuilder.obdInterface(obdInterface)
  }

  /**
   * @param type The network protocol for the vehicle. 
   * For example, `CAN_SIGNAL` specifies a protocol that defines how data is communicated between
   * electronic control units (ECUs). `OBD_SIGNAL` specifies a protocol that defines how
   * self-diagnostic data is communicated between ECUs.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDecoderManifest.NetworkInterfacesItemsProperty = cdkBuilder.build()
}
