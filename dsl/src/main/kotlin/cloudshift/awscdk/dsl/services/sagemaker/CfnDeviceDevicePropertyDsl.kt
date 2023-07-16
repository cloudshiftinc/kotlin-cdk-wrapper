@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnDevice

@CdkDslMarker
public class CfnDeviceDevicePropertyDsl {
  private val cdkBuilder: CfnDevice.DeviceProperty.Builder = CfnDevice.DeviceProperty.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun deviceName(deviceName: String) {
    cdkBuilder.deviceName(deviceName)
  }

  public fun iotThingName(iotThingName: String) {
    cdkBuilder.iotThingName(iotThingName)
  }

  public fun build(): CfnDevice.DeviceProperty = cdkBuilder.build()
}
