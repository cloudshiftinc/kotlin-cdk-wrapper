package io.cloudshiftdev.awscdk.services.ecs

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ScratchSpace {
  public fun containerPath(): String

  public fun name(): String

  public fun readOnly(): Boolean

  public fun sourcePath(): String

  public interface Builder {
    public fun containerPath(containerPath: String) {
    }

    public fun name(name: String) {
    }

    public fun readOnly(readOnly: Boolean) {
    }

    public fun sourcePath(sourcePath: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ScratchSpace.Builder =
        software.amazon.awscdk.services.ecs.ScratchSpace.builder()

    public override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun readOnly(readOnly: Boolean) {
      cdkBuilder.readOnly(readOnly)
    }

    public override fun sourcePath(sourcePath: String) {
      cdkBuilder.sourcePath(sourcePath)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ScratchSpace = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.ScratchSpace,
  ) : ScratchSpace {
    public override fun containerPath(): String = unwrap(this).getContainerPath()

    public override fun name(): String = unwrap(this).getName()

    public override fun readOnly(): Boolean = unwrap(this).getReadOnly()

    public override fun sourcePath(): String = unwrap(this).getSourcePath()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ScratchSpace {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ScratchSpace): ScratchSpace =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScratchSpace): software.amazon.awscdk.services.ecs.ScratchSpace =
        (wrapped as Wrapper).cdkObject
  }
}
