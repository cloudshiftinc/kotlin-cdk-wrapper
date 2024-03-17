@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Deprecated
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Interface for metrics.
 */
public interface IMetric {
  /**
   * Inspect the details of the metric object.
   */
  public fun toMetricConfig(): MetricConfig

  /**
   * (deprecated) Any warnings related to this metric.
   *
   * Should be attached to the consuming construct.
   *
   * Default: - None
   *
   * * use warningsV2
   */
  @Deprecated(message = "deprecated in CDK")
  public fun warnings(): List<String> = unwrap(this).getWarnings() ?: emptyList()

  /**
   * Any warnings related to this metric.
   *
   * Should be attached to the consuming construct.
   *
   * Default: - None
   */
  public fun warningsV2(): Map<String, String> = unwrap(this).getWarningsV2() ?: emptyMap()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.IMetric,
  ) : CdkObject(cdkObject), IMetric {
    /**
     * Inspect the details of the metric object.
     */
    override fun toMetricConfig(): MetricConfig =
        unwrap(this).toMetricConfig().let(MetricConfig::wrap)

    /**
     * (deprecated) Any warnings related to this metric.
     *
     * Should be attached to the consuming construct.
     *
     * Default: - None
     *
     * * use warningsV2
     */
    @Deprecated(message = "deprecated in CDK")
    override fun warnings(): List<String> = unwrap(this).getWarnings() ?: emptyList()

    /**
     * Any warnings related to this metric.
     *
     * Should be attached to the consuming construct.
     *
     * Default: - None
     */
    override fun warningsV2(): Map<String, String> = unwrap(this).getWarningsV2() ?: emptyMap()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.IMetric): IMetric =
        CdkObjectWrappers.wrap(cdkObject) as? IMetric ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IMetric): software.amazon.awscdk.services.cloudwatch.IMetric =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.IMetric
  }
}
