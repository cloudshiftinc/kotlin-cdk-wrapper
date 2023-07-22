@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice

@CdkDslMarker
public class CfnWirelessDeviceLoRaWANDevicePropertyDsl {
  private val cdkBuilder: CfnWirelessDevice.LoRaWANDeviceProperty.Builder =
      CfnWirelessDevice.LoRaWANDeviceProperty.builder()

  /**
   * @param abpV10X LoRaWAN object for create APIs.
   */
  public fun abpV10X(abpV10X: IResolvable) {
    cdkBuilder.abpV10X(abpV10X)
  }

  /**
   * @param abpV10X LoRaWAN object for create APIs.
   */
  public fun abpV10X(abpV10X: CfnWirelessDevice.AbpV10xProperty) {
    cdkBuilder.abpV10X(abpV10X)
  }

  /**
   * @param abpV11 ABP device object for create APIs for v1.1.
   */
  public fun abpV11(abpV11: IResolvable) {
    cdkBuilder.abpV11(abpV11)
  }

  /**
   * @param abpV11 ABP device object for create APIs for v1.1.
   */
  public fun abpV11(abpV11: CfnWirelessDevice.AbpV11Property) {
    cdkBuilder.abpV11(abpV11)
  }

  /**
   * @param devEui The DevEUI value.
   */
  public fun devEui(devEui: String) {
    cdkBuilder.devEui(devEui)
  }

  /**
   * @param deviceProfileId The ID of the device profile for the new wireless device.
   */
  public fun deviceProfileId(deviceProfileId: String) {
    cdkBuilder.deviceProfileId(deviceProfileId)
  }

  /**
   * @param otaaV10X OTAA device object for create APIs for v1.0.x.
   */
  public fun otaaV10X(otaaV10X: IResolvable) {
    cdkBuilder.otaaV10X(otaaV10X)
  }

  /**
   * @param otaaV10X OTAA device object for create APIs for v1.0.x.
   */
  public fun otaaV10X(otaaV10X: CfnWirelessDevice.OtaaV10xProperty) {
    cdkBuilder.otaaV10X(otaaV10X)
  }

  /**
   * @param otaaV11 OTAA device object for v1.1 for create APIs.
   */
  public fun otaaV11(otaaV11: IResolvable) {
    cdkBuilder.otaaV11(otaaV11)
  }

  /**
   * @param otaaV11 OTAA device object for v1.1 for create APIs.
   */
  public fun otaaV11(otaaV11: CfnWirelessDevice.OtaaV11Property) {
    cdkBuilder.otaaV11(otaaV11)
  }

  /**
   * @param serviceProfileId The ID of the service profile.
   */
  public fun serviceProfileId(serviceProfileId: String) {
    cdkBuilder.serviceProfileId(serviceProfileId)
  }

  public fun build(): CfnWirelessDevice.LoRaWANDeviceProperty = cdkBuilder.build()
}
