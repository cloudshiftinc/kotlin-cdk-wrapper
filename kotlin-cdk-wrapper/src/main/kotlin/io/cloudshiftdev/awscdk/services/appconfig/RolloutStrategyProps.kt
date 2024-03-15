@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface RolloutStrategyProps {
  public fun deploymentDuration(): Duration

  public fun finalBakeTime(): Duration? = unwrap(this).getFinalBakeTime()?.let(Duration::wrap)

  public fun growthFactor(): Number

  @CdkDslMarker
  public interface Builder {
    public fun deploymentDuration(deploymentDuration: Duration)

    public fun finalBakeTime(finalBakeTime: Duration)

    public fun growthFactor(growthFactor: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.RolloutStrategyProps.Builder =
        software.amazon.awscdk.services.appconfig.RolloutStrategyProps.builder()

    override fun deploymentDuration(deploymentDuration: Duration) {
      cdkBuilder.deploymentDuration(deploymentDuration.let(Duration::unwrap))
    }

    override fun finalBakeTime(finalBakeTime: Duration) {
      cdkBuilder.finalBakeTime(finalBakeTime.let(Duration::unwrap))
    }

    override fun growthFactor(growthFactor: Number) {
      cdkBuilder.growthFactor(growthFactor)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.RolloutStrategyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.RolloutStrategyProps,
  ) : CdkObject(cdkObject), RolloutStrategyProps {
    override fun deploymentDuration(): Duration =
        unwrap(this).getDeploymentDuration().let(Duration::wrap)

    override fun finalBakeTime(): Duration? = unwrap(this).getFinalBakeTime()?.let(Duration::wrap)

    override fun growthFactor(): Number = unwrap(this).getGrowthFactor()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RolloutStrategyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.RolloutStrategyProps):
        RolloutStrategyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RolloutStrategyProps):
        software.amazon.awscdk.services.appconfig.RolloutStrategyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.RolloutStrategyProps
  }
}
