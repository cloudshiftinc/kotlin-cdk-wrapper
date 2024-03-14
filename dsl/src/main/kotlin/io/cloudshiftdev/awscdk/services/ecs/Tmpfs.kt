package io.cloudshiftdev.awscdk.services.ecs

import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface Tmpfs {
  public fun containerPath(): String

  public fun mountOptions(): List<TmpfsMountOption> =
      unwrap(this).getMountOptions()?.map(TmpfsMountOption::wrap) ?: emptyList()

  public fun size(): Number

  public interface Builder {
    public fun containerPath(containerPath: String)

    public fun mountOptions(mountOptions: List<TmpfsMountOption>)

    public fun size(size: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Tmpfs.Builder =
        software.amazon.awscdk.services.ecs.Tmpfs.builder()

    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    override fun mountOptions(mountOptions: List<TmpfsMountOption>) {
      cdkBuilder.mountOptions(mountOptions.map(TmpfsMountOption::unwrap))
    }

    override fun size(size: Number) {
      cdkBuilder.size(size)
    }

    public fun build(): software.amazon.awscdk.services.ecs.Tmpfs = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.Tmpfs,
  ) : Tmpfs {
    override fun containerPath(): String = unwrap(this).getContainerPath()

    override fun mountOptions(): List<TmpfsMountOption> =
        unwrap(this).getMountOptions()?.map(TmpfsMountOption::wrap) ?: emptyList()

    override fun size(): Number = unwrap(this).getSize()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Tmpfs {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Tmpfs): Tmpfs =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Tmpfs): software.amazon.awscdk.services.ecs.Tmpfs = (wrapped as
        Wrapper).cdkObject
  }
}
