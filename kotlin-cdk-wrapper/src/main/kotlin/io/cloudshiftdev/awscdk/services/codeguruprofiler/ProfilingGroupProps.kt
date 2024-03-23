@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codeguruprofiler

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for creating a new Profiling Group.
 *
 * Example:
 *
 * ```
 * ProfilingGroup profilingGroup = ProfilingGroup.Builder.create(this, "MyProfilingGroup")
 * .computePlatform(ComputePlatform.AWS_LAMBDA)
 * .build();
 * ```
 */
public interface ProfilingGroupProps {
  /**
   * The compute platform of the profiling group.
   *
   * Default: ComputePlatform.DEFAULT
   */
  public fun computePlatform(): ComputePlatform? =
      unwrap(this).getComputePlatform()?.let(ComputePlatform::wrap)

  /**
   * A name for the profiling group.
   *
   * Default: - automatically generated name.
   */
  public fun profilingGroupName(): String? = unwrap(this).getProfilingGroupName()

  /**
   * A builder for [ProfilingGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param computePlatform The compute platform of the profiling group.
     */
    public fun computePlatform(computePlatform: ComputePlatform)

    /**
     * @param profilingGroupName A name for the profiling group.
     */
    public fun profilingGroupName(profilingGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps.Builder =
        software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps.builder()

    /**
     * @param computePlatform The compute platform of the profiling group.
     */
    override fun computePlatform(computePlatform: ComputePlatform) {
      cdkBuilder.computePlatform(computePlatform.let(ComputePlatform::unwrap))
    }

    /**
     * @param profilingGroupName A name for the profiling group.
     */
    override fun profilingGroupName(profilingGroupName: String) {
      cdkBuilder.profilingGroupName(profilingGroupName)
    }

    public fun build(): software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps,
  ) : CdkObject(cdkObject), ProfilingGroupProps {
    /**
     * The compute platform of the profiling group.
     *
     * Default: ComputePlatform.DEFAULT
     */
    override fun computePlatform(): ComputePlatform? =
        unwrap(this).getComputePlatform()?.let(ComputePlatform::wrap)

    /**
     * A name for the profiling group.
     *
     * Default: - automatically generated name.
     */
    override fun profilingGroupName(): String? = unwrap(this).getProfilingGroupName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProfilingGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps):
        ProfilingGroupProps = CdkObjectWrappers.wrap(cdkObject) as? ProfilingGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProfilingGroupProps):
        software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps
  }
}
