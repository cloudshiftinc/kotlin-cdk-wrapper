@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface MountPoint : BaseMountPoint {
  public fun sourceVolume(): String

  @CdkDslMarker
  public interface Builder {
    public fun containerPath(containerPath: String)

    public fun readOnly(readOnly: Boolean)

    public fun sourceVolume(sourceVolume: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.MountPoint.Builder =
        software.amazon.awscdk.services.ecs.MountPoint.builder()

    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    override fun readOnly(readOnly: Boolean) {
      cdkBuilder.readOnly(readOnly)
    }

    override fun sourceVolume(sourceVolume: String) {
      cdkBuilder.sourceVolume(sourceVolume)
    }

    public fun build(): software.amazon.awscdk.services.ecs.MountPoint = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.MountPoint,
  ) : CdkObject(cdkObject), MountPoint {
    override fun containerPath(): String = unwrap(this).getContainerPath()

    override fun readOnly(): Boolean = unwrap(this).getReadOnly()

    override fun sourceVolume(): String = unwrap(this).getSourceVolume()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MountPoint {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.MountPoint): MountPoint =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MountPoint): software.amazon.awscdk.services.ecs.MountPoint =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.MountPoint
  }
}
