package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

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
    private val cdkBuilder: software.amazon.awscdk.services.batch.Device.Builder =
        software.amazon.awscdk.services.batch.Device.builder()

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
      cdkBuilder.permissions(permissions.map(DevicePermission::unwrap))
    }

    /**
     * @param permissions The explicit permissions to provide to the container for the device.
     * By default, the container has permissions for read, write, and mknod for the device.
     */
    override fun permissions(vararg permissions: DevicePermission): Unit =
        permissions(permissions.toList())

    public fun build(): software.amazon.awscdk.services.batch.Device = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.Device,
  ) : Device {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Device {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.Device): Device =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Device): software.amazon.awscdk.services.batch.Device = (wrapped as
        Wrapper).cdkObject
  }
}
