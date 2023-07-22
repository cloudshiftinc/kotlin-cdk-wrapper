@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice

/**
 * ABP device object for create APIs for v1.1.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * AbpV11Property abpV11Property = AbpV11Property.builder()
 * .devAddr("devAddr")
 * .sessionKeys(SessionKeysAbpV11Property.builder()
 * .appSKey("appSKey")
 * .fNwkSIntKey("fNwkSIntKey")
 * .nwkSEncKey("nwkSEncKey")
 * .sNwkSIntKey("sNwkSIntKey")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-abpv11.html)
 */
@CdkDslMarker
public class CfnWirelessDeviceAbpV11PropertyDsl {
  private val cdkBuilder: CfnWirelessDevice.AbpV11Property.Builder =
      CfnWirelessDevice.AbpV11Property.builder()

  /**
   * @param devAddr The DevAddr value. 
   */
  public fun devAddr(devAddr: String) {
    cdkBuilder.devAddr(devAddr)
  }

  /**
   * @param sessionKeys Session keys for ABP v1.1. 
   */
  public fun sessionKeys(sessionKeys: IResolvable) {
    cdkBuilder.sessionKeys(sessionKeys)
  }

  /**
   * @param sessionKeys Session keys for ABP v1.1. 
   */
  public fun sessionKeys(sessionKeys: CfnWirelessDevice.SessionKeysAbpV11Property) {
    cdkBuilder.sessionKeys(sessionKeys)
  }

  public fun build(): CfnWirelessDevice.AbpV11Property = cdkBuilder.build()
}
