@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroup

@CdkDslMarker
public class CfnMulticastGroupLoRaWANPropertyDsl {
  private val cdkBuilder: CfnMulticastGroup.LoRaWANProperty.Builder =
      CfnMulticastGroup.LoRaWANProperty.builder()

  /**
   * @param dlClass DlClass for LoRaWAN. 
   * Valid values are ClassB and ClassC.
   */
  public fun dlClass(dlClass: String) {
    cdkBuilder.dlClass(dlClass)
  }

  /**
   * @param numberOfDevicesInGroup Number of devices that are associated to the multicast group.
   */
  public fun numberOfDevicesInGroup(numberOfDevicesInGroup: Number) {
    cdkBuilder.numberOfDevicesInGroup(numberOfDevicesInGroup)
  }

  /**
   * @param numberOfDevicesRequested Number of devices that are requested to be associated with the
   * multicast group.
   */
  public fun numberOfDevicesRequested(numberOfDevicesRequested: Number) {
    cdkBuilder.numberOfDevicesRequested(numberOfDevicesRequested)
  }

  /**
   * @param rfRegion The frequency band (RFRegion) value. 
   */
  public fun rfRegion(rfRegion: String) {
    cdkBuilder.rfRegion(rfRegion)
  }

  public fun build(): CfnMulticastGroup.LoRaWANProperty = cdkBuilder.build()
}
