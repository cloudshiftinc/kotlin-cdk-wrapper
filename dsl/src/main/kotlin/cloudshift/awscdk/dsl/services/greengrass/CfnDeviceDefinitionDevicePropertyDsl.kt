@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinition

@CdkDslMarker
public class CfnDeviceDefinitionDevicePropertyDsl {
  private val cdkBuilder: CfnDeviceDefinition.DeviceProperty.Builder =
      CfnDeviceDefinition.DeviceProperty.builder()

  /**
   * @param certificateArn The Amazon Resource Name (ARN) of the device certificate for the device. 
   * This X.509 certificate is used to authenticate the device with AWS IoT and AWS IoT Greengrass
   * services.
   */
  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  /**
   * @param id A descriptive or arbitrary ID for the device. 
   * This value must be unique within the device definition version. Maximum length is 128
   * characters with pattern `[a-zA-Z0-9:_-]+` .
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param syncShadow Indicates whether the device's local shadow is synced with the cloud
   * automatically.
   */
  public fun syncShadow(syncShadow: Boolean) {
    cdkBuilder.syncShadow(syncShadow)
  }

  /**
   * @param syncShadow Indicates whether the device's local shadow is synced with the cloud
   * automatically.
   */
  public fun syncShadow(syncShadow: IResolvable) {
    cdkBuilder.syncShadow(syncShadow)
  }

  /**
   * @param thingArn The ARN of the device, which is an AWS IoT device (thing). 
   */
  public fun thingArn(thingArn: String) {
    cdkBuilder.thingArn(thingArn)
  }

  public fun build(): CfnDeviceDefinition.DeviceProperty = cdkBuilder.build()
}
