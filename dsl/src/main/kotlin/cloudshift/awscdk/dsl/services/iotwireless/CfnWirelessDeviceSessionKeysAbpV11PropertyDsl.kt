@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice

@CdkDslMarker
public class CfnWirelessDeviceSessionKeysAbpV11PropertyDsl {
  private val cdkBuilder: CfnWirelessDevice.SessionKeysAbpV11Property.Builder =
      CfnWirelessDevice.SessionKeysAbpV11Property.builder()

  public fun appSKey(appSKey: String) {
    cdkBuilder.appSKey(appSKey)
  }

  public fun fNwkSIntKey(fNwkSIntKey: String) {
    cdkBuilder.fNwkSIntKey(fNwkSIntKey)
  }

  public fun nwkSEncKey(nwkSEncKey: String) {
    cdkBuilder.nwkSEncKey(nwkSEncKey)
  }

  public fun sNwkSIntKey(sNwkSIntKey: String) {
    cdkBuilder.sNwkSIntKey(sNwkSIntKey)
  }

  public fun build(): CfnWirelessDevice.SessionKeysAbpV11Property = cdkBuilder.build()
}
