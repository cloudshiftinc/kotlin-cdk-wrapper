@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * The traffic routing configuration if `CfnTrafficRoutingConfig.type` is
 * `CfnTrafficRoutingType.TIME_BASED_LINEAR`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnTrafficRoutingTimeBasedLinear cfnTrafficRoutingTimeBasedLinear =
 * CfnTrafficRoutingTimeBasedLinear.builder()
 * .bakeTimeMins(123)
 * .stepPercentage(123)
 * .build();
 * ```
 */
public interface CfnTrafficRoutingTimeBasedLinear {
  /**
   * The number of minutes between the first and second traffic shifts of a time-based linear
   * deployment.
   *
   * Default: 5
   */
  public fun bakeTimeMins(): Number? = unwrap(this).getBakeTimeMins()

  /**
   * The percentage of traffic that is shifted at the start of each increment of a time-based linear
   * deployment.
   *
   * The step percentage must be 14% or greater.
   *
   * Default: 15
   */
  public fun stepPercentage(): Number? = unwrap(this).getStepPercentage()

  /**
   * A builder for [CfnTrafficRoutingTimeBasedLinear]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bakeTimeMins The number of minutes between the first and second traffic shifts of a
     * time-based linear deployment.
     */
    public fun bakeTimeMins(bakeTimeMins: Number)

    /**
     * @param stepPercentage The percentage of traffic that is shifted at the start of each
     * increment of a time-based linear deployment.
     * The step percentage must be 14% or greater.
     */
    public fun stepPercentage(stepPercentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear.Builder =
        software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear.builder()

    /**
     * @param bakeTimeMins The number of minutes between the first and second traffic shifts of a
     * time-based linear deployment.
     */
    override fun bakeTimeMins(bakeTimeMins: Number) {
      cdkBuilder.bakeTimeMins(bakeTimeMins)
    }

    /**
     * @param stepPercentage The percentage of traffic that is shifted at the start of each
     * increment of a time-based linear deployment.
     * The step percentage must be 14% or greater.
     */
    override fun stepPercentage(stepPercentage: Number) {
      cdkBuilder.stepPercentage(stepPercentage)
    }

    public fun build(): software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear,
  ) : CdkObject(cdkObject), CfnTrafficRoutingTimeBasedLinear {
    /**
     * The number of minutes between the first and second traffic shifts of a time-based linear
     * deployment.
     *
     * Default: 5
     */
    override fun bakeTimeMins(): Number? = unwrap(this).getBakeTimeMins()

    /**
     * The percentage of traffic that is shifted at the start of each increment of a time-based
     * linear deployment.
     *
     * The step percentage must be 14% or greater.
     *
     * Default: 15
     */
    override fun stepPercentage(): Number? = unwrap(this).getStepPercentage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficRoutingTimeBasedLinear {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear):
        CfnTrafficRoutingTimeBasedLinear = CdkObjectWrappers.wrap(cdkObject) as
        CfnTrafficRoutingTimeBasedLinear

    internal fun unwrap(wrapped: CfnTrafficRoutingTimeBasedLinear):
        software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear
  }
}
