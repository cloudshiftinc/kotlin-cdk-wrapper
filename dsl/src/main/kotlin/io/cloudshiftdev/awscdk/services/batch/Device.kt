package io.cloudshiftdev.awscdk.services.batch

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface Device {
  public fun containerPath(): String? = unwrap(this).getContainerPath()

  public fun hostPath(): String

  public fun permissions(): List<DevicePermission> =
      unwrap(this).getPermissions()?.map(DevicePermission::wrap) ?: emptyList()

  public interface Builder {
    public fun containerPath(containerPath: String) {
    }

    public fun hostPath(hostPath: String) {
    }

    public fun permissions(permissions: List<DevicePermission>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.Device.Builder =
        software.amazon.awscdk.services.batch.Device.builder()

    public override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    public override fun hostPath(hostPath: String) {
      cdkBuilder.hostPath(hostPath)
    }

    public override fun permissions(permissions: List<DevicePermission>) {
      cdkBuilder.permissions(permissions.map(DevicePermission::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.Device = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.Device,
  ) : Device {
    public override fun containerPath(): String? = unwrap(this).getContainerPath()

    public override fun hostPath(): String = unwrap(this).getHostPath()

    public override fun permissions(): List<DevicePermission> =
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
