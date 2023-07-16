@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice

@CdkDslMarker
public class CfnWirelessDeviceSessionKeysAbpV10xPropertyDsl {
  private val cdkBuilder: CfnWirelessDevice.SessionKeysAbpV10xProperty.Builder =
      CfnWirelessDevice.SessionKeysAbpV10xProperty.builder()

  public fun appSKey(appSKey: String) {
    cdkBuilder.appSKey(appSKey)
  }

  public fun nwkSKey(nwkSKey: String) {
    cdkBuilder.nwkSKey(nwkSKey)
  }

  public fun build(): CfnWirelessDevice.SessionKeysAbpV10xProperty = cdkBuilder.build()
}
