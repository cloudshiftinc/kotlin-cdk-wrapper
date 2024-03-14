package io.cloudshiftdev.awscdk.services.ecs

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface BaseMountPoint {
  public fun containerPath(): String

  public fun readOnly(): Boolean

  public interface Builder {
    public fun containerPath(containerPath: String) {
    }

    public fun readOnly(readOnly: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.BaseMountPoint.Builder =
        software.amazon.awscdk.services.ecs.BaseMountPoint.builder()

    public override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    public override fun readOnly(readOnly: Boolean) {
      cdkBuilder.readOnly(readOnly)
    }

    public fun build(): software.amazon.awscdk.services.ecs.BaseMountPoint = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.BaseMountPoint,
  ) : BaseMountPoint {
    public override fun containerPath(): String = unwrap(this).getContainerPath()

    public override fun readOnly(): Boolean = unwrap(this).getReadOnly()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BaseMountPoint {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.BaseMountPoint): BaseMountPoint
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseMountPoint): software.amazon.awscdk.services.ecs.BaseMountPoint
        = (wrapped as Wrapper).cdkObject
  }
}
