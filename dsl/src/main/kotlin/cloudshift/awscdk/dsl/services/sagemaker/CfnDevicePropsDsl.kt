@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDevice
import software.amazon.awscdk.services.sagemaker.CfnDeviceProps

@CdkDslMarker
public class CfnDevicePropsDsl {
  private val cdkBuilder: CfnDeviceProps.Builder = CfnDeviceProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param device Edge device you want to create.
   */
  public fun device(device: IResolvable) {
    cdkBuilder.device(device)
  }

  /**
   * @param device Edge device you want to create.
   */
  public fun device(device: CfnDevice.DeviceProperty) {
    cdkBuilder.device(device)
  }

  /**
   * @param deviceFleetName The name of the fleet the device belongs to. 
   */
  public fun deviceFleetName(deviceFleetName: String) {
    cdkBuilder.deviceFleetName(deviceFleetName)
  }

  /**
   * @param tags An array of key-value pairs that contain metadata to help you categorize and
   * organize your devices.
   * Each tag consists of a key and a value, both of which you define.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs that contain metadata to help you categorize and
   * organize your devices.
   * Each tag consists of a key and a value, both of which you define.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDeviceProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
