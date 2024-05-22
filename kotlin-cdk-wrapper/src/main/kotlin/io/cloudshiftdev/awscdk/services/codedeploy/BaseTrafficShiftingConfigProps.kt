@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Common properties of traffic shifting routing configurations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.codedeploy.*;
 * BaseTrafficShiftingConfigProps baseTrafficShiftingConfigProps =
 * BaseTrafficShiftingConfigProps.builder()
 * .interval(Duration.minutes(30))
 * .percentage(123)
 * .build();
 * ```
 */
public interface BaseTrafficShiftingConfigProps {
  /**
   * The amount of time between traffic shifts.
   */
  public fun interval(): Duration

  /**
   * The percentage to increase traffic on each traffic shift.
   */
  public fun percentage(): Number

  /**
   * A builder for [BaseTrafficShiftingConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param interval The amount of time between traffic shifts. 
     */
    public fun interval(interval: Duration)

    /**
     * @param percentage The percentage to increase traffic on each traffic shift. 
     */
    public fun percentage(percentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.BaseTrafficShiftingConfigProps.Builder =
        software.amazon.awscdk.services.codedeploy.BaseTrafficShiftingConfigProps.builder()

    /**
     * @param interval The amount of time between traffic shifts. 
     */
    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration.Companion::unwrap))
    }

    /**
     * @param percentage The percentage to increase traffic on each traffic shift. 
     */
    override fun percentage(percentage: Number) {
      cdkBuilder.percentage(percentage)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.BaseTrafficShiftingConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codedeploy.BaseTrafficShiftingConfigProps,
  ) : CdkObject(cdkObject), BaseTrafficShiftingConfigProps {
    /**
     * The amount of time between traffic shifts.
     */
    override fun interval(): Duration = unwrap(this).getInterval().let(Duration::wrap)

    /**
     * The percentage to increase traffic on each traffic shift.
     */
    override fun percentage(): Number = unwrap(this).getPercentage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseTrafficShiftingConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.BaseTrafficShiftingConfigProps):
        BaseTrafficShiftingConfigProps = CdkObjectWrappers.wrap(cdkObject) as?
        BaseTrafficShiftingConfigProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseTrafficShiftingConfigProps):
        software.amazon.awscdk.services.codedeploy.BaseTrafficShiftingConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.BaseTrafficShiftingConfigProps
  }
}
