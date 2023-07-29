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

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.SingleValueWidget

/**
 * A dashboard widget that displays the most recent value for every metric.
 *
 * Example:
 * ```
 * Dashboard dashboard;
 * dashboard.addWidgets(SingleValueWidget.Builder.create()
 * .metrics(List.of())
 * .period(Duration.minutes(15))
 * .build());
 * ```
 */
@CdkDslMarker
public class SingleValueWidgetDsl {
    private val cdkBuilder: SingleValueWidget.Builder = SingleValueWidget.Builder.create()

    private val _metrics: MutableList<IMetric> = mutableListOf()

    /**
     * Whether to show as many digits as can fit, before rounding.
     *
     * Default: false
     *
     * @param fullPrecision Whether to show as many digits as can fit, before rounding.
     */
    public fun fullPrecision(fullPrecision: Boolean) {
        cdkBuilder.fullPrecision(fullPrecision)
    }

    /**
     * Height of the widget.
     *
     * Default: - 6 for Alarm and Graph widgets. 3 for single value widgets where most recent value
     * of a metric is displayed.
     *
     * @param height Height of the widget.
     */
    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    /**
     * Metrics to display.
     *
     * @param metrics Metrics to display.
     */
    public fun metrics(vararg metrics: IMetric) {
        _metrics.addAll(listOf(*metrics))
    }

    /**
     * Metrics to display.
     *
     * @param metrics Metrics to display.
     */
    public fun metrics(metrics: Collection<IMetric>) {
        _metrics.addAll(metrics)
    }

    /**
     * The default period for all metrics in this widget.
     *
     * The period is the length of time represented by one data point on the graph. This default can
     * be overridden within each metric definition.
     *
     * Default: cdk.Duration.seconds(300)
     *
     * @param period The default period for all metrics in this widget.
     */
    public fun period(period: Duration) {
        cdkBuilder.period(period)
    }

    /**
     * The region the metrics of this graph should be taken from.
     *
     * Default: - Current region
     *
     * @param region The region the metrics of this graph should be taken from.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * Whether to show the value from the entire time range.
     *
     * Default: false
     *
     * @param setPeriodToTimeRange Whether to show the value from the entire time range.
     */
    public fun setPeriodToTimeRange(setPeriodToTimeRange: Boolean) {
        cdkBuilder.setPeriodToTimeRange(setPeriodToTimeRange)
    }

    /**
     * Whether to show a graph below the value illustrating the value for the whole time range.
     *
     * Cannot be used in combination with `setPeriodToTimeRange`
     *
     * Default: false
     *
     * @param sparkline Whether to show a graph below the value illustrating the value for the whole
     *   time range.
     */
    public fun sparkline(sparkline: Boolean) {
        cdkBuilder.sparkline(sparkline)
    }

    /**
     * Title for the graph.
     *
     * Default: - None
     *
     * @param title Title for the graph.
     */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     *
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): SingleValueWidget {
        if (_metrics.isNotEmpty()) cdkBuilder.metrics(_metrics)
        return cdkBuilder.build()
    }
}
