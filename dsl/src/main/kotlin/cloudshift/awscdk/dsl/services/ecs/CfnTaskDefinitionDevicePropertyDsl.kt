@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionDevicePropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.DeviceProperty.Builder =
      CfnTaskDefinition.DeviceProperty.builder()

  private val _permissions: MutableList<String> = mutableListOf()

  /**
   * @param containerPath The path inside the container at which to expose the host device.
   */
  public fun containerPath(containerPath: String) {
    cdkBuilder.containerPath(containerPath)
  }

  /**
   * @param hostPath The path for the device on the host container instance.
   */
  public fun hostPath(hostPath: String) {
    cdkBuilder.hostPath(hostPath)
  }

  /**
   * @param permissions The explicit permissions to provide to the container for the device.
   * By default, the container has permissions for `read` , `write` , and `mknod` for the device.
   */
  public fun permissions(vararg permissions: String) {
    _permissions.addAll(listOf(*permissions))
  }

  /**
   * @param permissions The explicit permissions to provide to the container for the device.
   * By default, the container has permissions for `read` , `write` , and `mknod` for the device.
   */
  public fun permissions(permissions: Collection<String>) {
    _permissions.addAll(permissions)
  }

  public fun build(): CfnTaskDefinition.DeviceProperty {
    if(_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
    return cdkBuilder.build()
  }
}
