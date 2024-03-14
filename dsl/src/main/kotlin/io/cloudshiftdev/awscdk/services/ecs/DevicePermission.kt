package io.cloudshiftdev.awscdk.services.ecs

public enum class DevicePermission(
  private val cdkObject: software.amazon.awscdk.services.ecs.DevicePermission,
) {
  READ(software.amazon.awscdk.services.ecs.DevicePermission.READ),
  WRITE(software.amazon.awscdk.services.ecs.DevicePermission.WRITE),
  MKNOD(software.amazon.awscdk.services.ecs.DevicePermission.MKNOD),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.DevicePermission):
        DevicePermission = when (cdkObject) {
      software.amazon.awscdk.services.ecs.DevicePermission.READ -> DevicePermission.READ
      software.amazon.awscdk.services.ecs.DevicePermission.WRITE -> DevicePermission.WRITE
      software.amazon.awscdk.services.ecs.DevicePermission.MKNOD -> DevicePermission.MKNOD
    }

    internal fun unwrap(wrapped: DevicePermission):
        software.amazon.awscdk.services.ecs.DevicePermission = wrapped.cdkObject
  }
}
