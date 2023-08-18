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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.cloudwatch.MetricConfig
import software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig
import software.amazon.awscdk.services.cloudwatch.MetricStatConfig

/**
 * Properties of a rendered metric.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.cloudwatch.*;
 * Metric metric;
 * Object renderingProperties;
 * Object value;
 * MetricConfig metricConfig = MetricConfig.builder()
 * .mathExpression(MetricExpressionConfig.builder()
 * .expression("expression")
 * .period(123)
 * .usingMetrics(Map.of(
 * "usingMetricsKey", metric))
 * // the properties below are optional
 * .searchAccount("searchAccount")
 * .searchRegion("searchRegion")
 * .build())
 * .metricStat(MetricStatConfig.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * .period(Duration.minutes(30))
 * .statistic("statistic")
 * // the properties below are optional
 * .account("account")
 * .dimensions(List.of(Dimension.builder()
 * .name("name")
 * .value(value)
 * .build()))
 * .region("region")
 * .unitFilter(Unit.SECONDS)
 * .build())
 * .renderingProperties(Map.of(
 * "renderingPropertiesKey", renderingProperties))
 * .build();
 * ```
 */
@CdkDslMarker
public class MetricConfigDsl {
    private val cdkBuilder: MetricConfig.Builder = MetricConfig.builder()

    /**
     * @param mathExpression In case the metric is a math expression, the details of the math
     *   expression.
     */
    public fun mathExpression(mathExpression: MetricExpressionConfigDsl.() -> Unit = {}) {
        val builder = MetricExpressionConfigDsl()
        builder.apply(mathExpression)
        cdkBuilder.mathExpression(builder.build())
    }

    /**
     * @param mathExpression In case the metric is a math expression, the details of the math
     *   expression.
     */
    public fun mathExpression(mathExpression: MetricExpressionConfig) {
        cdkBuilder.mathExpression(mathExpression)
    }

    /** @param metricStat In case the metric represents a query, the details of the query. */
    public fun metricStat(metricStat: MetricStatConfigDsl.() -> Unit = {}) {
        val builder = MetricStatConfigDsl()
        builder.apply(metricStat)
        cdkBuilder.metricStat(builder.build())
    }

    /** @param metricStat In case the metric represents a query, the details of the query. */
    public fun metricStat(metricStat: MetricStatConfig) {
        cdkBuilder.metricStat(metricStat)
    }

    /**
     * @param renderingProperties Additional properties which will be rendered if the metric is used
     *   in a dashboard. Examples are 'label' and 'color', but any key in here will be added to
     *   dashboard graphs.
     */
    public fun renderingProperties(renderingProperties: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(renderingProperties)
        cdkBuilder.renderingProperties(builder.map)
    }

    /**
     * @param renderingProperties Additional properties which will be rendered if the metric is used
     *   in a dashboard. Examples are 'label' and 'color', but any key in here will be added to
     *   dashboard graphs.
     */
    public fun renderingProperties(renderingProperties: Map<String, Any>) {
        cdkBuilder.renderingProperties(renderingProperties)
    }

    public fun build(): MetricConfig = cdkBuilder.build()
}
