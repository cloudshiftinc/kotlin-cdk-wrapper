package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface TimeBasedCanaryTrafficRoutingProps : BaseTrafficShiftingConfigProps {
  /**
   * A builder for [TimeBasedCanaryTrafficRoutingProps]
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
        software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRoutingProps.Builder =
        software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRoutingProps.builder()

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
        software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRoutingProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRoutingProps,
  ) : TimeBasedCanaryTrafficRoutingProps {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TimeBasedCanaryTrafficRoutingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRoutingProps):
        TimeBasedCanaryTrafficRoutingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TimeBasedCanaryTrafficRoutingProps):
        software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRoutingProps = (wrapped as
        Wrapper).cdkObject
  }
}
