package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.Unit

public interface RolloutStrategyProps {
  public fun deploymentDuration(): Duration

  public fun finalBakeTime(): Duration? = unwrap(this).getFinalBakeTime()?.let(Duration::wrap)

  public fun growthFactor(): Number

  public interface Builder {
    public fun deploymentDuration(deploymentDuration: Duration) {
    }

    public fun finalBakeTime(finalBakeTime: Duration) {
    }

    public fun growthFactor(growthFactor: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.RolloutStrategyProps.Builder =
        software.amazon.awscdk.services.appconfig.RolloutStrategyProps.builder()

    public override fun deploymentDuration(deploymentDuration: Duration) {
      cdkBuilder.deploymentDuration(deploymentDuration.let(Duration::unwrap))
    }

    public override fun finalBakeTime(finalBakeTime: Duration) {
      cdkBuilder.finalBakeTime(finalBakeTime.let(Duration::unwrap))
    }

    public override fun growthFactor(growthFactor: Number) {
      cdkBuilder.growthFactor(growthFactor)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.RolloutStrategyProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.RolloutStrategyProps,
  ) : RolloutStrategyProps {
    public override fun deploymentDuration(): Duration =
        unwrap(this).getDeploymentDuration().let(Duration::wrap)

    public override fun finalBakeTime(): Duration? =
        unwrap(this).getFinalBakeTime()?.let(Duration::wrap)

    public override fun growthFactor(): Number = unwrap(this).getGrowthFactor()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RolloutStrategyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.RolloutStrategyProps):
        RolloutStrategyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RolloutStrategyProps):
        software.amazon.awscdk.services.appconfig.RolloutStrategyProps = (wrapped as
        Wrapper).cdkObject
  }
}
