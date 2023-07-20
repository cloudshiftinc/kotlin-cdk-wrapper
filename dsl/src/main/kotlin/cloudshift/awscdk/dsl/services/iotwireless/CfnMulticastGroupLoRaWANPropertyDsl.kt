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

  public fun dlClass(dlClass: String) {
    cdkBuilder.dlClass(dlClass)
  }

  public fun numberOfDevicesInGroup(numberOfDevicesInGroup: Number) {
    cdkBuilder.numberOfDevicesInGroup(numberOfDevicesInGroup)
  }

  public fun numberOfDevicesRequested(numberOfDevicesRequested: Number) {
    cdkBuilder.numberOfDevicesRequested(numberOfDevicesRequested)
  }

  public fun rfRegion(rfRegion: String) {
    cdkBuilder.rfRegion(rfRegion)
  }

  public fun build(): CfnMulticastGroup.LoRaWANProperty = cdkBuilder.build()
}
