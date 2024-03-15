@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface MetricDefinition {
  public fun name(): String

  public fun regex(): String

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun regex(regex: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun regex(regex: String) {
      cdkBuilder.regex(regex)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition,
  ) : CdkObject(cdkObject), MetricDefinition {
    override fun name(): String = unwrap(this).getName()

    override fun regex(): String = unwrap(this).getRegex()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MetricDefinition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition):
        MetricDefinition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetricDefinition):
        software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition
  }
}
