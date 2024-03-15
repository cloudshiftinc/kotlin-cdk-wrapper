@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface StoppingCondition {
  public fun maxRuntime(): Duration? = unwrap(this).getMaxRuntime()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun maxRuntime(maxRuntime: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition.builder()

    override fun maxRuntime(maxRuntime: Duration) {
      cdkBuilder.maxRuntime(maxRuntime.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition,
  ) : CdkObject(cdkObject), StoppingCondition {
    override fun maxRuntime(): Duration? = unwrap(this).getMaxRuntime()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StoppingCondition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition):
        StoppingCondition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StoppingCondition):
        software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition
  }
}
