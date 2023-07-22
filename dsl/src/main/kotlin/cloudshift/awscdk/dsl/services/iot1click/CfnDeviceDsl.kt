@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot1click

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot1click.CfnDevice
import software.constructs.Construct

/**
 * The `AWS::IoT1Click::Device` resource controls the enabled state of an AWS IoT 1-Click compatible
 * device.
 *
 * For more information, see
 * [Device](https://docs.aws.amazon.com/iot-1-click/1.0/devices-apireference/devices-deviceid.html) in
 * the *AWS IoT 1-Click Devices API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot1click.*;
 * CfnDevice cfnDevice = CfnDevice.Builder.create(this, "MyCfnDevice")
 * .deviceId("deviceId")
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html)
 */
@CdkDslMarker
public class CfnDeviceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDevice.Builder = CfnDevice.Builder.create(scope, id)

  /**
   * The ID of the device, such as `G030PX0312744DWM` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-deviceid)
   * @param deviceId The ID of the device, such as `G030PX0312744DWM` . 
   */
  public fun deviceId(deviceId: String) {
    cdkBuilder.deviceId(deviceId)
  }

  /**
   * A Boolean value indicating whether the device is enabled ( `true` ) or not ( `false` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-enabled)
   * @param enabled A Boolean value indicating whether the device is enabled ( `true` ) or not (
   * `false` ). 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * A Boolean value indicating whether the device is enabled ( `true` ) or not ( `false` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-enabled)
   * @param enabled A Boolean value indicating whether the device is enabled ( `true` ) or not (
   * `false` ). 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnDevice = cdkBuilder.build()
}
