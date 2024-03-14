package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.Unit

public interface TimeBasedLinearTrafficRoutingProps : BaseTrafficShiftingConfigProps {
  public interface Builder {
    public fun interval(interval: Duration) {
    }

    public fun percentage(percentage: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps.Builder =
        software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps.builder()

    public override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    public override fun percentage(percentage: Number) {
      cdkBuilder.percentage(percentage)
    }

    public fun build():
        software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps,
  ) : TimeBasedLinearTrafficRoutingProps {
    public override fun interval(): Duration = unwrap(this).getInterval().let(Duration::wrap)

    public override fun percentage(): Number = unwrap(this).getPercentage()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TimeBasedLinearTrafficRoutingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps):
        TimeBasedLinearTrafficRoutingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TimeBasedLinearTrafficRoutingProps):
        software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps = (wrapped as
        Wrapper).cdkObject
  }
}
