@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface LinuxParametersProps {
  public fun initProcessEnabled(): Boolean? = unwrap(this).getInitProcessEnabled()

  public fun maxSwap(): Size? = unwrap(this).getMaxSwap()?.let(Size::wrap)

  public fun sharedMemorySize(): Size? = unwrap(this).getSharedMemorySize()?.let(Size::wrap)

  public fun swappiness(): Number? = unwrap(this).getSwappiness()

  @CdkDslMarker
  public interface Builder {
    public fun initProcessEnabled(initProcessEnabled: Boolean)

    public fun maxSwap(maxSwap: Size)

    public fun sharedMemorySize(sharedMemorySize: Size)

    public fun swappiness(swappiness: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.LinuxParametersProps.Builder =
        software.amazon.awscdk.services.batch.LinuxParametersProps.builder()

    override fun initProcessEnabled(initProcessEnabled: Boolean) {
      cdkBuilder.initProcessEnabled(initProcessEnabled)
    }

    override fun maxSwap(maxSwap: Size) {
      cdkBuilder.maxSwap(maxSwap.let(Size::unwrap))
    }

    override fun sharedMemorySize(sharedMemorySize: Size) {
      cdkBuilder.sharedMemorySize(sharedMemorySize.let(Size::unwrap))
    }

    override fun swappiness(swappiness: Number) {
      cdkBuilder.swappiness(swappiness)
    }

    public fun build(): software.amazon.awscdk.services.batch.LinuxParametersProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.LinuxParametersProps,
  ) : CdkObject(cdkObject), LinuxParametersProps {
    override fun initProcessEnabled(): Boolean? = unwrap(this).getInitProcessEnabled()

    override fun maxSwap(): Size? = unwrap(this).getMaxSwap()?.let(Size::wrap)

    override fun sharedMemorySize(): Size? = unwrap(this).getSharedMemorySize()?.let(Size::wrap)

    override fun swappiness(): Number? = unwrap(this).getSwappiness()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LinuxParametersProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.LinuxParametersProps):
        LinuxParametersProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LinuxParametersProps):
        software.amazon.awscdk.services.batch.LinuxParametersProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.LinuxParametersProps
  }
}
