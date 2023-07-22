@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps

/**
 * Properties for defining a `CfnDeviceDefinitionVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * CfnDeviceDefinitionVersionProps cfnDeviceDefinitionVersionProps =
 * CfnDeviceDefinitionVersionProps.builder()
 * .deviceDefinitionId("deviceDefinitionId")
 * .devices(List.of(DeviceProperty.builder()
 * .certificateArn("certificateArn")
 * .id("id")
 * .thingArn("thingArn")
 * // the properties below are optional
 * .syncShadow(false)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
 */
@CdkDslMarker
public class CfnDeviceDefinitionVersionPropsDsl {
  private val cdkBuilder: CfnDeviceDefinitionVersionProps.Builder =
      CfnDeviceDefinitionVersionProps.builder()

  private val _devices: MutableList<Any> = mutableListOf()

  /**
   * @param deviceDefinitionId The ID of the device definition associated with this version. 
   * This value is a GUID.
   */
  public fun deviceDefinitionId(deviceDefinitionId: String) {
    cdkBuilder.deviceDefinitionId(deviceDefinitionId)
  }

  /**
   * @param devices The devices in this version. 
   */
  public fun devices(vararg devices: Any) {
    _devices.addAll(listOf(*devices))
  }

  /**
   * @param devices The devices in this version. 
   */
  public fun devices(devices: Collection<Any>) {
    _devices.addAll(devices)
  }

  /**
   * @param devices The devices in this version. 
   */
  public fun devices(devices: IResolvable) {
    cdkBuilder.devices(devices)
  }

  public fun build(): CfnDeviceDefinitionVersionProps {
    if(_devices.isNotEmpty()) cdkBuilder.devices(_devices)
    return cdkBuilder.build()
  }
}
