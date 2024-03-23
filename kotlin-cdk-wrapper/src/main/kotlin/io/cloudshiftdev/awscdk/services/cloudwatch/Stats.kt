@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String

/**
 * Factory functions for standard statistics strings.
 *
 * Example:
 *
 * ```
 * Dashboard dashboard;
 * Metric executionCountMetric;
 * Metric errorCountMetric;
 * dashboard.addWidgets(GraphWidget.Builder.create()
 * .title("Executions vs error rate")
 * .left(List.of(executionCountMetric))
 * .right(List.of(errorCountMetric.with(MetricOptions.builder()
 * .statistic(Stats.AVERAGE)
 * .label("Error rate")
 * .color(Color.GREEN)
 * .build())))
 * .build());
 * ```
 */
public abstract class Stats(
  cdkObject: software.amazon.awscdk.services.cloudwatch.Stats,
) : CdkObject(cdkObject) {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.Stats,
  ) : Stats(cdkObject)

  public companion object {
    public val AVERAGE: String = software.amazon.awscdk.services.cloudwatch.Stats.AVERAGE

    public val IQM: String = software.amazon.awscdk.services.cloudwatch.Stats.IQM

    public val MAXIMUM: String = software.amazon.awscdk.services.cloudwatch.Stats.MAXIMUM

    public val MINIMUM: String = software.amazon.awscdk.services.cloudwatch.Stats.MINIMUM

    public val SAMPLE_COUNT: String = software.amazon.awscdk.services.cloudwatch.Stats.SAMPLE_COUNT

    public val SUM: String = software.amazon.awscdk.services.cloudwatch.Stats.SUM

    public fun p(percentile: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.p(percentile)

    public fun percentile(percentile: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.percentile(percentile)

    public fun percentileRank(v1: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.percentileRank(v1)

    public fun percentileRank(v1: Number, v2: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.percentileRank(v1, v2)

    public fun pr(v1: Number): String = software.amazon.awscdk.services.cloudwatch.Stats.pr(v1)

    public fun pr(v1: Number, v2: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.pr(v1, v2)

    public fun tc(p1: Number): String = software.amazon.awscdk.services.cloudwatch.Stats.tc(p1)

    public fun tc(p1: Number, p2: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.tc(p1, p2)

    public fun tm(p1: Number): String = software.amazon.awscdk.services.cloudwatch.Stats.tm(p1)

    public fun tm(p1: Number, p2: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.tm(p1, p2)

    public fun trimmedCount(p1: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.trimmedCount(p1)

    public fun trimmedCount(p1: Number, p2: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.trimmedCount(p1, p2)

    public fun trimmedMean(p1: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.trimmedMean(p1)

    public fun trimmedMean(p1: Number, p2: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.trimmedMean(p1, p2)

    public fun trimmedSum(p1: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.trimmedSum(p1)

    public fun trimmedSum(p1: Number, p2: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.trimmedSum(p1, p2)

    public fun ts(p1: Number): String = software.amazon.awscdk.services.cloudwatch.Stats.ts(p1)

    public fun ts(p1: Number, p2: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.ts(p1, p2)

    public fun winsorizedMean(p1: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.winsorizedMean(p1)

    public fun winsorizedMean(p1: Number, p2: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.winsorizedMean(p1, p2)

    public fun wm(p1: Number): String = software.amazon.awscdk.services.cloudwatch.Stats.wm(p1)

    public fun wm(p1: Number, p2: Number): String =
        software.amazon.awscdk.services.cloudwatch.Stats.wm(p1, p2)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Stats): Stats =
        CdkObjectWrappers.wrap(cdkObject) as? Stats ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Stats): software.amazon.awscdk.services.cloudwatch.Stats = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.Stats
  }
}
