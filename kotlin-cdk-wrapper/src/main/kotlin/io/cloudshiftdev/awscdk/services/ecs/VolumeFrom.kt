@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface VolumeFrom {
  public fun readOnly(): Boolean

  public fun sourceContainer(): String

  @CdkDslMarker
  public interface Builder {
    public fun readOnly(readOnly: Boolean)

    public fun sourceContainer(sourceContainer: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.VolumeFrom.Builder =
        software.amazon.awscdk.services.ecs.VolumeFrom.builder()

    override fun readOnly(readOnly: Boolean) {
      cdkBuilder.readOnly(readOnly)
    }

    override fun sourceContainer(sourceContainer: String) {
      cdkBuilder.sourceContainer(sourceContainer)
    }

    public fun build(): software.amazon.awscdk.services.ecs.VolumeFrom = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.VolumeFrom,
  ) : CdkObject(cdkObject), VolumeFrom {
    override fun readOnly(): Boolean = unwrap(this).getReadOnly()

    override fun sourceContainer(): String = unwrap(this).getSourceContainer()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VolumeFrom {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.VolumeFrom): VolumeFrom =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VolumeFrom): software.amazon.awscdk.services.ecs.VolumeFrom =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.VolumeFrom
  }
}
