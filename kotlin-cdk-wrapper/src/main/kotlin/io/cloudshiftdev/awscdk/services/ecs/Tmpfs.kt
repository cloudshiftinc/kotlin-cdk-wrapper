@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface Tmpfs {
  public fun containerPath(): String

  public fun mountOptions(): List<TmpfsMountOption> =
      unwrap(this).getMountOptions()?.map(TmpfsMountOption::wrap) ?: emptyList()

  public fun size(): Number

  @CdkDslMarker
  public interface Builder {
    public fun containerPath(containerPath: String)

    public fun mountOptions(mountOptions: List<TmpfsMountOption>)

    public fun mountOptions(vararg mountOptions: TmpfsMountOption)

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

    override fun mountOptions(vararg mountOptions: TmpfsMountOption): Unit =
        mountOptions(mountOptions.toList())

    override fun size(size: Number) {
      cdkBuilder.size(size)
    }

    public fun build(): software.amazon.awscdk.services.ecs.Tmpfs = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.Tmpfs,
  ) : CdkObject(cdkObject), Tmpfs {
    override fun containerPath(): String = unwrap(this).getContainerPath()

    override fun mountOptions(): List<TmpfsMountOption> =
        unwrap(this).getMountOptions()?.map(TmpfsMountOption::wrap) ?: emptyList()

    override fun size(): Number = unwrap(this).getSize()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Tmpfs {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Tmpfs): Tmpfs =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Tmpfs): software.amazon.awscdk.services.ecs.Tmpfs = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.Tmpfs
  }
}