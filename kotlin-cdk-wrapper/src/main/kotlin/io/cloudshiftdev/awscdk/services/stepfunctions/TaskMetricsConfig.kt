@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface TaskMetricsConfig {
  public fun metricDimensions(): Map<String, Any> = unwrap(this).getMetricDimensions() ?: emptyMap()

  public fun metricPrefixPlural(): String? = unwrap(this).getMetricPrefixPlural()

  public fun metricPrefixSingular(): String? = unwrap(this).getMetricPrefixSingular()

  @CdkDslMarker
  public interface Builder {
    public fun metricDimensions(metricDimensions: Map<String, Any>)

    public fun metricPrefixPlural(metricPrefixPlural: String)

    public fun metricPrefixSingular(metricPrefixSingular: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig.Builder
        = software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig.builder()

    override fun metricDimensions(metricDimensions: Map<String, Any>) {
      cdkBuilder.metricDimensions(metricDimensions)
    }

    override fun metricPrefixPlural(metricPrefixPlural: String) {
      cdkBuilder.metricPrefixPlural(metricPrefixPlural)
    }

    override fun metricPrefixSingular(metricPrefixSingular: String) {
      cdkBuilder.metricPrefixSingular(metricPrefixSingular)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig,
  ) : CdkObject(cdkObject), TaskMetricsConfig {
    override fun metricDimensions(): Map<String, Any> = unwrap(this).getMetricDimensions() ?:
        emptyMap()

    override fun metricPrefixPlural(): String? = unwrap(this).getMetricPrefixPlural()

    override fun metricPrefixSingular(): String? = unwrap(this).getMetricPrefixSingular()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TaskMetricsConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig):
        TaskMetricsConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TaskMetricsConfig):
        software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig
  }
}
