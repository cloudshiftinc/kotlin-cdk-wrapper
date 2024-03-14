package io.cloudshiftdev.awscdk.services.ecs

public enum class IpcMode(
  private val cdkObject: software.amazon.awscdk.services.ecs.IpcMode,
) {
  NONE(software.amazon.awscdk.services.ecs.IpcMode.NONE),
  HOST(software.amazon.awscdk.services.ecs.IpcMode.HOST),
  TASK(software.amazon.awscdk.services.ecs.IpcMode.TASK),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.IpcMode): IpcMode = when
        (cdkObject) {
      software.amazon.awscdk.services.ecs.IpcMode.NONE -> IpcMode.NONE
      software.amazon.awscdk.services.ecs.IpcMode.HOST -> IpcMode.HOST
      software.amazon.awscdk.services.ecs.IpcMode.TASK -> IpcMode.TASK
    }

    internal fun unwrap(wrapped: IpcMode): software.amazon.awscdk.services.ecs.IpcMode =
        wrapped.cdkObject
  }
}
