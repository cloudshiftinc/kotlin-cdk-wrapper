@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Number
import kotlin.Unit

public open class TimeBasedCanaryTrafficRouting internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRouting,
) : TrafficRouting(cdkObject) {
  public override fun bind(_scope: Construct): TrafficRoutingConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap)).let(TrafficRoutingConfig::wrap)

  public open fun interval(): Duration = unwrap(this).getInterval().let(Duration::wrap)

  public open fun percentage(): Number = unwrap(this).getPercentage()

  @CdkDslMarker
  public interface Builder {
    public fun interval(interval: Duration)

    public fun percentage(percentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRouting.Builder =
        software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRouting.Builder.create()

    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    override fun percentage(percentage: Number) {
      cdkBuilder.percentage(percentage)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRouting =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TimeBasedCanaryTrafficRouting {
      val builderImpl = BuilderImpl()
      return TimeBasedCanaryTrafficRouting(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRouting):
        TimeBasedCanaryTrafficRouting = TimeBasedCanaryTrafficRouting(cdkObject)

    internal fun unwrap(wrapped: TimeBasedCanaryTrafficRouting):
        software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRouting = wrapped.cdkObject
  }
}
