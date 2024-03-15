@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface BaseMountPoint {
  public fun containerPath(): String

  public fun readOnly(): Boolean

  @CdkDslMarker
  public interface Builder {
    public fun containerPath(containerPath: String)

    public fun readOnly(readOnly: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.BaseMountPoint.Builder =
        software.amazon.awscdk.services.ecs.BaseMountPoint.builder()

    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    override fun readOnly(readOnly: Boolean) {
      cdkBuilder.readOnly(readOnly)
    }

    public fun build(): software.amazon.awscdk.services.ecs.BaseMountPoint = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.BaseMountPoint,
  ) : CdkObject(cdkObject), BaseMountPoint {
    override fun containerPath(): String = unwrap(this).getContainerPath()

    override fun readOnly(): Boolean = unwrap(this).getReadOnly()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseMountPoint {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.BaseMountPoint): BaseMountPoint
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseMountPoint): software.amazon.awscdk.services.ecs.BaseMountPoint
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.BaseMountPoint
  }
}
