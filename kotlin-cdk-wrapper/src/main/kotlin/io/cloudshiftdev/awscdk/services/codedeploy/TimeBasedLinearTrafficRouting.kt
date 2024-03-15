@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Number
import kotlin.Unit

/**
 * Define a traffic routing config of type 'TimeBasedLinear'.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codedeploy.*;
 * TrafficRouting timeBasedLinearTrafficRouting = TimeBasedLinearTrafficRouting.allAtOnce();
 * ```
 */
public open class TimeBasedLinearTrafficRouting internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRouting,
) : TrafficRouting(cdkObject) {
  /**
   * Return a TrafficRoutingConfig of type `TimeBasedLinear`.
   *
   * @param _scope 
   */
  public override fun bind(scope: Construct): TrafficRoutingConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(TrafficRoutingConfig::wrap)

  /**
   * The amount of time between additional traffic shifts.
   */
  public open fun interval(): Duration = unwrap(this).getInterval().let(Duration::wrap)

  /**
   * The percentage to increase traffic on each traffic shift.
   */
  public open fun percentage(): Number = unwrap(this).getPercentage()

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codedeploy.TimeBasedLinearTrafficRouting].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The amount of time between traffic shifts.
     *
     * @param interval The amount of time between traffic shifts. 
     */
    public fun interval(interval: Duration)

    /**
     * The percentage to increase traffic on each traffic shift.
     *
     * @param percentage The percentage to increase traffic on each traffic shift. 
     */
    public fun percentage(percentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRouting.Builder =
        software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRouting.Builder.create()

    /**
     * The amount of time between traffic shifts.
     *
     * @param interval The amount of time between traffic shifts. 
     */
    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    /**
     * The percentage to increase traffic on each traffic shift.
     *
     * @param percentage The percentage to increase traffic on each traffic shift. 
     */
    override fun percentage(percentage: Number) {
      cdkBuilder.percentage(percentage)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRouting =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TimeBasedLinearTrafficRouting {
      val builderImpl = BuilderImpl()
      return TimeBasedLinearTrafficRouting(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRouting):
        TimeBasedLinearTrafficRouting = TimeBasedLinearTrafficRouting(cdkObject)

    internal fun unwrap(wrapped: TimeBasedLinearTrafficRouting):
        software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRouting = wrapped.cdkObject
  }
}
