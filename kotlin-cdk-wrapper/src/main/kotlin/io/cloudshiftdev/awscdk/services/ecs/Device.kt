@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A container instance host device.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * Device device = Device.builder()
 * .hostPath("hostPath")
 * // the properties below are optional
 * .containerPath("containerPath")
 * .permissions(List.of(DevicePermission.READ))
 * .build();
 * ```
 */
public interface Device {
  /**
   * The path inside the container at which to expose the host device.
   *
   * Default: Same path as the host
   */
  public fun containerPath(): String? = unwrap(this).getContainerPath()

  /**
   * The path for the device on the host container instance.
   */
  public fun hostPath(): String

  /**
   * The explicit permissions to provide to the container for the device.
   *
   * By default, the container has permissions for read, write, and mknod for the device.
   *
   * Default: Readonly
   */
  public fun permissions(): List<DevicePermission> =
      unwrap(this).getPermissions()?.map(DevicePermission::wrap) ?: emptyList()

  /**
   * A builder for [Device]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerPath The path inside the container at which to expose the host device.
     */
    public fun containerPath(containerPath: String)

    /**
     * @param hostPath The path for the device on the host container instance. 
     */
    public fun hostPath(hostPath: String)

    /**
     * @param permissions The explicit permissions to provide to the container for the device.
     * By default, the container has permissions for read, write, and mknod for the device.
     */
    public fun permissions(permissions: List<DevicePermission>)

    /**
     * @param permissions The explicit permissions to provide to the container for the device.
     * By default, the container has permissions for read, write, and mknod for the device.
     */
    public fun permissions(vararg permissions: DevicePermission)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Device.Builder =
        software.amazon.awscdk.services.ecs.Device.builder()

    /**
     * @param containerPath The path inside the container at which to expose the host device.
     */
    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    /**
     * @param hostPath The path for the device on the host container instance. 
     */
    override fun hostPath(hostPath: String) {
      cdkBuilder.hostPath(hostPath)
    }

    /**
     * @param permissions The explicit permissions to provide to the container for the device.
     * By default, the container has permissions for read, write, and mknod for the device.
     */
    override fun permissions(permissions: List<DevicePermission>) {
      cdkBuilder.permissions(permissions.map(DevicePermission.Companion::unwrap))
    }

    /**
     * @param permissions The explicit permissions to provide to the container for the device.
     * By default, the container has permissions for read, write, and mknod for the device.
     */
    override fun permissions(vararg permissions: DevicePermission): Unit =
        permissions(permissions.toList())

    public fun build(): software.amazon.awscdk.services.ecs.Device = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.Device,
  ) : CdkObject(cdkObject), Device {
    /**
     * The path inside the container at which to expose the host device.
     *
     * Default: Same path as the host
     */
    override fun containerPath(): String? = unwrap(this).getContainerPath()

    /**
     * The path for the device on the host container instance.
     */
    override fun hostPath(): String = unwrap(this).getHostPath()

    /**
     * The explicit permissions to provide to the container for the device.
     *
     * By default, the container has permissions for read, write, and mknod for the device.
     *
     * Default: Readonly
     */
    override fun permissions(): List<DevicePermission> =
        unwrap(this).getPermissions()?.map(DevicePermission::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Device {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Device): Device =
        CdkObjectWrappers.wrap(cdkObject) as? Device ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Device): software.amazon.awscdk.services.ecs.Device = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.Device
  }
}
