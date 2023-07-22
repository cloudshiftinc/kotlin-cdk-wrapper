@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice

@CdkDslMarker
public class CfnWirelessDeviceAbpV10xPropertyDsl {
  private val cdkBuilder: CfnWirelessDevice.AbpV10xProperty.Builder =
      CfnWirelessDevice.AbpV10xProperty.builder()

  /**
   * @param devAddr The DevAddr value. 
   */
  public fun devAddr(devAddr: String) {
    cdkBuilder.devAddr(devAddr)
  }

  /**
   * @param sessionKeys Session keys for ABP v1.0.x. 
   */
  public fun sessionKeys(sessionKeys: IResolvable) {
    cdkBuilder.sessionKeys(sessionKeys)
  }

  /**
   * @param sessionKeys Session keys for ABP v1.0.x. 
   */
  public fun sessionKeys(sessionKeys: CfnWirelessDevice.SessionKeysAbpV10xProperty) {
    cdkBuilder.sessionKeys(sessionKeys)
  }

  public fun build(): CfnWirelessDevice.AbpV10xProperty = cdkBuilder.build()
}
