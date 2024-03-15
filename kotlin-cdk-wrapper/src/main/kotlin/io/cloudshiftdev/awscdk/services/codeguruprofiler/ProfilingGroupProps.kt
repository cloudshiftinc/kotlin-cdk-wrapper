@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codeguruprofiler

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ProfilingGroupProps {
  public fun computePlatform(): ComputePlatform? =
      unwrap(this).getComputePlatform()?.let(ComputePlatform::wrap)

  public fun profilingGroupName(): String? = unwrap(this).getProfilingGroupName()

  @CdkDslMarker
  public interface Builder {
    public fun computePlatform(computePlatform: ComputePlatform)

    public fun profilingGroupName(profilingGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps.Builder =
        software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps.builder()

    override fun computePlatform(computePlatform: ComputePlatform) {
      cdkBuilder.computePlatform(computePlatform.let(ComputePlatform::unwrap))
    }

    override fun profilingGroupName(profilingGroupName: String) {
      cdkBuilder.profilingGroupName(profilingGroupName)
    }

    public fun build(): software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps,
  ) : CdkObject(cdkObject), ProfilingGroupProps {
    override fun computePlatform(): ComputePlatform? =
        unwrap(this).getComputePlatform()?.let(ComputePlatform::wrap)

    override fun profilingGroupName(): String? = unwrap(this).getProfilingGroupName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProfilingGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps):
        ProfilingGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProfilingGroupProps):
        software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps
  }
}
