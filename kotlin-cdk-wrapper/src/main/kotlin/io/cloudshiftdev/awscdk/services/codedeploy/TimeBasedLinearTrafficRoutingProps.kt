@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Construction properties for `TimeBasedLinearTrafficRouting`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.codedeploy.*;
 * TimeBasedLinearTrafficRoutingProps timeBasedLinearTrafficRoutingProps =
 * TimeBasedLinearTrafficRoutingProps.builder()
 * .interval(Duration.minutes(30))
 * .percentage(123)
 * .build();
 * ```
 */
public interface TimeBasedLinearTrafficRoutingProps : BaseTrafficShiftingConfigProps {
  /**
   * A builder for [TimeBasedLinearTrafficRoutingProps]
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
        software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps.Builder =
        software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps.builder()

    /**
     * @param interval The amount of time between traffic shifts. 
     */
    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    /**
     * @param percentage The percentage to increase traffic on each traffic shift. 
     */
    override fun percentage(percentage: Number) {
      cdkBuilder.percentage(percentage)
    }

    public fun build():
        software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps,
  ) : CdkObject(cdkObject), TimeBasedLinearTrafficRoutingProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): TimeBasedLinearTrafficRoutingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps):
        TimeBasedLinearTrafficRoutingProps = CdkObjectWrappers.wrap(cdkObject) as
        TimeBasedLinearTrafficRoutingProps

    internal fun unwrap(wrapped: TimeBasedLinearTrafficRoutingProps):
        software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps
  }
}
