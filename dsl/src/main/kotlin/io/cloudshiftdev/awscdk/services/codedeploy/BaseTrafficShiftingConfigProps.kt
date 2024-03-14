package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.Unit

public interface BaseTrafficShiftingConfigProps {
  public fun interval(): Duration

  public fun percentage(): Number

  public interface Builder {
    public fun interval(interval: Duration)

    public fun percentage(percentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.BaseTrafficShiftingConfigProps.Builder =
        software.amazon.awscdk.services.codedeploy.BaseTrafficShiftingConfigProps.builder()

    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    override fun percentage(percentage: Number) {
      cdkBuilder.percentage(percentage)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.BaseTrafficShiftingConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.codedeploy.BaseTrafficShiftingConfigProps,
  ) : BaseTrafficShiftingConfigProps {
    override fun interval(): Duration = unwrap(this).getInterval().let(Duration::wrap)

    override fun percentage(): Number = unwrap(this).getPercentage()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BaseTrafficShiftingConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.BaseTrafficShiftingConfigProps):
        BaseTrafficShiftingConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseTrafficShiftingConfigProps):
        software.amazon.awscdk.services.codedeploy.BaseTrafficShiftingConfigProps = (wrapped as
        Wrapper).cdkObject
  }
}
