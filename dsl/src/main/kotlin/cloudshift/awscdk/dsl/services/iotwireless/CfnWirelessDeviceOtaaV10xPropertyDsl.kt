@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice

@CdkDslMarker
public class CfnWirelessDeviceOtaaV10xPropertyDsl {
  private val cdkBuilder: CfnWirelessDevice.OtaaV10xProperty.Builder =
      CfnWirelessDevice.OtaaV10xProperty.builder()

  public fun appEui(appEui: String) {
    cdkBuilder.appEui(appEui)
  }

  public fun appKey(appKey: String) {
    cdkBuilder.appKey(appKey)
  }

  public fun build(): CfnWirelessDevice.OtaaV10xProperty = cdkBuilder.build()
}
