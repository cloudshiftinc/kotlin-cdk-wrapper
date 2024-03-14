package io.cloudshiftdev.awscdk.services.ecs

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ContainerMountPoint : BaseMountPoint {
  public interface Builder {
    public fun containerPath(containerPath: String) {
    }

    public fun readOnly(readOnly: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ContainerMountPoint.Builder =
        software.amazon.awscdk.services.ecs.ContainerMountPoint.builder()

    public override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    public override fun readOnly(readOnly: Boolean) {
      cdkBuilder.readOnly(readOnly)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ContainerMountPoint = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.ContainerMountPoint,
  ) : ContainerMountPoint {
    public override fun containerPath(): String = unwrap(this).getContainerPath()

    public override fun readOnly(): Boolean = unwrap(this).getReadOnly()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerMountPoint {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ContainerMountPoint):
        ContainerMountPoint = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerMountPoint):
        software.amazon.awscdk.services.ecs.ContainerMountPoint = (wrapped as Wrapper).cdkObject
  }
}
