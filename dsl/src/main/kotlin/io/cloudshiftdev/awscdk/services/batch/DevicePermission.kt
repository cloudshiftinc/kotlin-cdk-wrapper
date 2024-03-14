package io.cloudshiftdev.awscdk.services.batch

public enum class DevicePermission(
  private val cdkObject: software.amazon.awscdk.services.batch.DevicePermission,
) {
  READ(software.amazon.awscdk.services.batch.DevicePermission.READ),
  WRITE(software.amazon.awscdk.services.batch.DevicePermission.WRITE),
  MKNOD(software.amazon.awscdk.services.batch.DevicePermission.MKNOD),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.DevicePermission):
        DevicePermission = when (cdkObject) {
      software.amazon.awscdk.services.batch.DevicePermission.READ -> DevicePermission.READ
      software.amazon.awscdk.services.batch.DevicePermission.WRITE -> DevicePermission.WRITE
      software.amazon.awscdk.services.batch.DevicePermission.MKNOD -> DevicePermission.MKNOD
    }

    internal fun unwrap(wrapped: DevicePermission):
        software.amazon.awscdk.services.batch.DevicePermission = wrapped.cdkObject
  }
}
