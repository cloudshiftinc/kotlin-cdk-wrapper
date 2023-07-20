@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinition

@CdkDslMarker
public class CfnDeviceDefinitionDeviceDefinitionVersionPropertyDsl {
  private val cdkBuilder: CfnDeviceDefinition.DeviceDefinitionVersionProperty.Builder =
      CfnDeviceDefinition.DeviceDefinitionVersionProperty.builder()

  private val _devices: MutableList<Any> = mutableListOf()

  public fun devices(vararg devices: Any) {
    _devices.addAll(listOf(*devices))
  }

  public fun devices(devices: Collection<Any>) {
    _devices.addAll(devices)
  }

  public fun devices(devices: IResolvable) {
    cdkBuilder.devices(devices)
  }

  public fun build(): CfnDeviceDefinition.DeviceDefinitionVersionProperty {
    if(_devices.isNotEmpty()) cdkBuilder.devices(_devices)
    return cdkBuilder.build()
  }
}
