@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface LinuxParametersProps {
  public fun initProcessEnabled(): Boolean? = unwrap(this).getInitProcessEnabled()

  public fun maxSwap(): Size? = unwrap(this).getMaxSwap()?.let(Size::wrap)

  public fun sharedMemorySize(): Number? = unwrap(this).getSharedMemorySize()

  public fun swappiness(): Number? = unwrap(this).getSwappiness()

  @CdkDslMarker
  public interface Builder {
    public fun initProcessEnabled(initProcessEnabled: Boolean)

    public fun maxSwap(maxSwap: Size)

    public fun sharedMemorySize(sharedMemorySize: Number)

    public fun swappiness(swappiness: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.LinuxParametersProps.Builder =
        software.amazon.awscdk.services.ecs.LinuxParametersProps.builder()

    override fun initProcessEnabled(initProcessEnabled: Boolean) {
      cdkBuilder.initProcessEnabled(initProcessEnabled)
    }

    override fun maxSwap(maxSwap: Size) {
      cdkBuilder.maxSwap(maxSwap.let(Size::unwrap))
    }

    override fun sharedMemorySize(sharedMemorySize: Number) {
      cdkBuilder.sharedMemorySize(sharedMemorySize)
    }

    override fun swappiness(swappiness: Number) {
      cdkBuilder.swappiness(swappiness)
    }

    public fun build(): software.amazon.awscdk.services.ecs.LinuxParametersProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.LinuxParametersProps,
  ) : CdkObject(cdkObject), LinuxParametersProps {
    override fun initProcessEnabled(): Boolean? = unwrap(this).getInitProcessEnabled()

    override fun maxSwap(): Size? = unwrap(this).getMaxSwap()?.let(Size::wrap)

    override fun sharedMemorySize(): Number? = unwrap(this).getSharedMemorySize()

    override fun swappiness(): Number? = unwrap(this).getSwappiness()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LinuxParametersProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.LinuxParametersProps):
        LinuxParametersProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LinuxParametersProps):
        software.amazon.awscdk.services.ecs.LinuxParametersProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.LinuxParametersProps
  }
}
