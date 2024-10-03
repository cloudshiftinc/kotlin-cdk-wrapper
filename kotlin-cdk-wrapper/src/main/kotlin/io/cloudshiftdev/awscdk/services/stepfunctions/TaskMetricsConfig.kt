@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Task Metrics.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Object metricDimensions;
 * TaskMetricsConfig taskMetricsConfig = TaskMetricsConfig.builder()
 * .metricDimensions(Map.of(
 * "metricDimensionsKey", metricDimensions))
 * .metricPrefixPlural("metricPrefixPlural")
 * .metricPrefixSingular("metricPrefixSingular")
 * .build();
 * ```
 */
public interface TaskMetricsConfig {
  /**
   * The dimensions to attach to metrics.
   *
   * Default: - No metrics
   */
  public fun metricDimensions(): Map<String, Any> = unwrap(this).getMetricDimensions() ?: emptyMap()

  /**
   * Prefix for plural metric names of activity actions.
   *
   * Default: - No such metrics
   */
  public fun metricPrefixPlural(): String? = unwrap(this).getMetricPrefixPlural()

  /**
   * Prefix for singular metric names of activity actions.
   *
   * Default: - No such metrics
   */
  public fun metricPrefixSingular(): String? = unwrap(this).getMetricPrefixSingular()

  /**
   * A builder for [TaskMetricsConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param metricDimensions The dimensions to attach to metrics.
     */
    public fun metricDimensions(metricDimensions: Map<String, Any>)

    /**
     * @param metricPrefixPlural Prefix for plural metric names of activity actions.
     */
    public fun metricPrefixPlural(metricPrefixPlural: String)

    /**
     * @param metricPrefixSingular Prefix for singular metric names of activity actions.
     */
    public fun metricPrefixSingular(metricPrefixSingular: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig.Builder
        = software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig.builder()

    /**
     * @param metricDimensions The dimensions to attach to metrics.
     */
    override fun metricDimensions(metricDimensions: Map<String, Any>) {
      cdkBuilder.metricDimensions(metricDimensions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param metricPrefixPlural Prefix for plural metric names of activity actions.
     */
    override fun metricPrefixPlural(metricPrefixPlural: String) {
      cdkBuilder.metricPrefixPlural(metricPrefixPlural)
    }

    /**
     * @param metricPrefixSingular Prefix for singular metric names of activity actions.
     */
    override fun metricPrefixSingular(metricPrefixSingular: String) {
      cdkBuilder.metricPrefixSingular(metricPrefixSingular)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig,
  ) : CdkObject(cdkObject),
      TaskMetricsConfig {
    /**
     * The dimensions to attach to metrics.
     *
     * Default: - No metrics
     */
    override fun metricDimensions(): Map<String, Any> = unwrap(this).getMetricDimensions() ?:
        emptyMap()

    /**
     * Prefix for plural metric names of activity actions.
     *
     * Default: - No such metrics
     */
    override fun metricPrefixPlural(): String? = unwrap(this).getMetricPrefixPlural()

    /**
     * Prefix for singular metric names of activity actions.
     *
     * Default: - No such metrics
     */
    override fun metricPrefixSingular(): String? = unwrap(this).getMetricPrefixSingular()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TaskMetricsConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig):
        TaskMetricsConfig = CdkObjectWrappers.wrap(cdkObject) as? TaskMetricsConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TaskMetricsConfig):
        software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig
  }
}
