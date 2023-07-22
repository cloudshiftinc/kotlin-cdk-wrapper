@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest

@CdkDslMarker
public class CfnDecoderManifestObdInterfacePropertyDsl {
  private val cdkBuilder: CfnDecoderManifest.ObdInterfaceProperty.Builder =
      CfnDecoderManifest.ObdInterfaceProperty.builder()

  /**
   * @param dtcRequestIntervalSeconds (Optional) The maximum number message requests per diagnostic
   * trouble code per second.
   */
  public fun dtcRequestIntervalSeconds(dtcRequestIntervalSeconds: String) {
    cdkBuilder.dtcRequestIntervalSeconds(dtcRequestIntervalSeconds)
  }

  /**
   * @param hasTransmissionEcu (Optional) Whether the vehicle has a transmission control module
   * (TCM).
   */
  public fun hasTransmissionEcu(hasTransmissionEcu: String) {
    cdkBuilder.hasTransmissionEcu(hasTransmissionEcu)
  }

  /**
   * @param name The name of the interface. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param obdStandard (Optional) The standard OBD II PID.
   */
  public fun obdStandard(obdStandard: String) {
    cdkBuilder.obdStandard(obdStandard)
  }

  /**
   * @param pidRequestIntervalSeconds (Optional) The maximum number message requests per second.
   */
  public fun pidRequestIntervalSeconds(pidRequestIntervalSeconds: String) {
    cdkBuilder.pidRequestIntervalSeconds(pidRequestIntervalSeconds)
  }

  /**
   * @param requestMessageId The ID of the message requesting vehicle data. 
   */
  public fun requestMessageId(requestMessageId: String) {
    cdkBuilder.requestMessageId(requestMessageId)
  }

  /**
   * @param useExtendedIds (Optional) Whether to use extended IDs in the message.
   */
  public fun useExtendedIds(useExtendedIds: String) {
    cdkBuilder.useExtendedIds(useExtendedIds)
  }

  public fun build(): CfnDecoderManifest.ObdInterfaceProperty = cdkBuilder.build()
}
