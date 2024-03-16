@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * The traffic routing configuration if `CfnTrafficRoutingConfig.type` is
 * `CfnTrafficRoutingType.TIME_BASED_CANARY`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnTrafficRoutingTimeBasedCanary cfnTrafficRoutingTimeBasedCanary =
 * CfnTrafficRoutingTimeBasedCanary.builder()
 * .bakeTimeMins(123)
 * .stepPercentage(123)
 * .build();
 * ```
 */
public interface CfnTrafficRoutingTimeBasedCanary {
  /**
   * The number of minutes between the first and second traffic shifts of a time-based canary
   * deployment.
   *
   * Default: 5
   */
  public fun bakeTimeMins(): Number? = unwrap(this).getBakeTimeMins()

  /**
   * The percentage of traffic to shift in the first increment of a time-based canary deployment.
   *
   * The step percentage must be 14% or greater.
   *
   * Default: 15
   */
  public fun stepPercentage(): Number? = unwrap(this).getStepPercentage()

  /**
   * A builder for [CfnTrafficRoutingTimeBasedCanary]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bakeTimeMins The number of minutes between the first and second traffic shifts of a
     * time-based canary deployment.
     */
    public fun bakeTimeMins(bakeTimeMins: Number)

    /**
     * @param stepPercentage The percentage of traffic to shift in the first increment of a
     * time-based canary deployment.
     * The step percentage must be 14% or greater.
     */
    public fun stepPercentage(stepPercentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary.Builder =
        software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary.builder()

    /**
     * @param bakeTimeMins The number of minutes between the first and second traffic shifts of a
     * time-based canary deployment.
     */
    override fun bakeTimeMins(bakeTimeMins: Number) {
      cdkBuilder.bakeTimeMins(bakeTimeMins)
    }

    /**
     * @param stepPercentage The percentage of traffic to shift in the first increment of a
     * time-based canary deployment.
     * The step percentage must be 14% or greater.
     */
    override fun stepPercentage(stepPercentage: Number) {
      cdkBuilder.stepPercentage(stepPercentage)
    }

    public fun build(): software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary,
  ) : CdkObject(cdkObject), CfnTrafficRoutingTimeBasedCanary {
    /**
     * The number of minutes between the first and second traffic shifts of a time-based canary
     * deployment.
     *
     * Default: 5
     */
    override fun bakeTimeMins(): Number? = unwrap(this).getBakeTimeMins()

    /**
     * The percentage of traffic to shift in the first increment of a time-based canary deployment.
     *
     * The step percentage must be 14% or greater.
     *
     * Default: 15
     */
    override fun stepPercentage(): Number? = unwrap(this).getStepPercentage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficRoutingTimeBasedCanary {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary):
        CfnTrafficRoutingTimeBasedCanary = CdkObjectWrappers.wrap(cdkObject) as
        CfnTrafficRoutingTimeBasedCanary

    internal fun unwrap(wrapped: CfnTrafficRoutingTimeBasedCanary):
        software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary
  }
}
