package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.Unit

public interface TimeBasedCanaryTrafficRoutingProps : BaseTrafficShiftingConfigProps {
  public interface Builder {
    public fun interval(interval: Duration) {
    }

    public fun percentage(percentage: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRoutingProps.Builder =
        software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRoutingProps.builder()

    public override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    public override fun percentage(percentage: Number) {
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
    public override fun interval(): Duration = unwrap(this).getInterval().let(Duration::wrap)

    public override fun percentage(): Number = unwrap(this).getPercentage()
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
