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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps

/**
 * Properties for a SingleValueWidget.
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
public class SingleValueWidgetPropsDsl {
    private val cdkBuilder: SingleValueWidgetProps.Builder = SingleValueWidgetProps.builder()

    private val _metrics: MutableList<IMetric> = mutableListOf()

    /**
     * @param end The end of the time range to use for each widget independently from those of the
     *   dashboard. If you specify a value for end, you must also specify a value for start. Specify
     *   an absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
     */
    public fun end(end: String) {
        cdkBuilder.end(end)
    }

    /** @param fullPrecision Whether to show as many digits as can fit, before rounding. */
    public fun fullPrecision(fullPrecision: Boolean) {
        cdkBuilder.fullPrecision(fullPrecision)
    }

    /** @param height Height of the widget. */
    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    /** @param metrics Metrics to display. */
    public fun metrics(vararg metrics: IMetric) {
        _metrics.addAll(listOf(*metrics))
    }

    /** @param metrics Metrics to display. */
    public fun metrics(metrics: Collection<IMetric>) {
        _metrics.addAll(metrics)
    }

    /**
     * @param period The default period for all metrics in this widget. The period is the length of
     *   time represented by one data point on the graph. This default can be overridden within each
     *   metric definition.
     */
    public fun period(period: Duration) {
        cdkBuilder.period(period)
    }

    /** @param region The region the metrics of this graph should be taken from. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /** @param setPeriodToTimeRange Whether to show the value from the entire time range. */
    public fun setPeriodToTimeRange(setPeriodToTimeRange: Boolean) {
        cdkBuilder.setPeriodToTimeRange(setPeriodToTimeRange)
    }

    /**
     * @param sparkline Whether to show a graph below the value illustrating the value for the whole
     *   time range. Cannot be used in combination with `setPeriodToTimeRange`
     */
    public fun sparkline(sparkline: Boolean) {
        cdkBuilder.sparkline(sparkline)
    }

    /**
     * @param start The start of the time range to use for each widget independently from those of
     *   the dashboard. You can specify start without specifying end to specify a relative time
     *   range that ends with the current time. In this case, the value of start must begin with -P,
     *   and you can use M, H, D, W and M as abbreviations for minutes, hours, days, weeks and
     *   months. For example, -PT8H shows the last 8 hours and -P3M shows the last three months. You
     *   can also use start along with an end field, to specify an absolute time range. When
     *   specifying an absolute time range, use the ISO 8601 format. For example,
     *   2018-12-17T06:00:00.000Z.
     */
    public fun start(start: String) {
        cdkBuilder.start(start)
    }

    /** @param title Title for the graph. */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    /** @param width Width of the widget, in a grid of 24 units wide. */
    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): SingleValueWidgetProps {
        if (_metrics.isNotEmpty()) cdkBuilder.metrics(_metrics)
        return cdkBuilder.build()
    }
}
