@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Deprecated
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public interface IMetric {
  public fun toMetricConfig(): MetricConfig

  @Deprecated(message = "deprecated in CDK")
  public fun warnings(): List<String> = unwrap(this).getWarnings() ?: emptyList()

  public fun warningsV2(): Map<String, String> = unwrap(this).getWarningsV2() ?: emptyMap()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.IMetric,
  ) : CdkObject(cdkObject), IMetric {
    override fun toMetricConfig(): MetricConfig =
        unwrap(this).toMetricConfig().let(MetricConfig::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun warnings(): List<String> = unwrap(this).getWarnings() ?: emptyList()

    override fun warningsV2(): Map<String, String> = unwrap(this).getWarningsV2() ?: emptyMap()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.IMetric): IMetric =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IMetric): software.amazon.awscdk.services.cloudwatch.IMetric =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.IMetric
  }
}
