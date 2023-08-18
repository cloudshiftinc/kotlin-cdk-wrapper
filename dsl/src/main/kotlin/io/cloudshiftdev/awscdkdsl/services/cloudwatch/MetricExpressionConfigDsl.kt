@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.cloudwatch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig

/**
 * Properties for a concrete metric.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * Metric metric;
 * MetricExpressionConfig metricExpressionConfig = MetricExpressionConfig.builder()
 * .expression("expression")
 * .period(123)
 * .usingMetrics(Map.of(
 * "usingMetricsKey", metric))
 * // the properties below are optional
 * .searchAccount("searchAccount")
 * .searchRegion("searchRegion")
 * .build();
 * ```
 */
@CdkDslMarker
public class MetricExpressionConfigDsl {
    private val cdkBuilder: MetricExpressionConfig.Builder = MetricExpressionConfig.builder()

    /** @param expression Math expression for the metric. */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    /** @param period How many seconds to aggregate over. */
    public fun period(period: Number) {
        cdkBuilder.period(period)
    }

    /** @param searchAccount Account to evaluate search expressions within. */
    public fun searchAccount(searchAccount: String) {
        cdkBuilder.searchAccount(searchAccount)
    }

    /** @param searchRegion Region to evaluate search expressions within. */
    public fun searchRegion(searchRegion: String) {
        cdkBuilder.searchRegion(searchRegion)
    }

    /** @param usingMetrics Metrics used in the math expression. */
    public fun usingMetrics(usingMetrics: Map<String, IMetric>) {
        cdkBuilder.usingMetrics(usingMetrics)
    }

    public fun build(): MetricExpressionConfig = cdkBuilder.build()
}
