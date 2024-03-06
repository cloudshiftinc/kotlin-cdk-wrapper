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
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.GaugeWidget
import software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.LegendPosition
import software.amazon.awscdk.services.cloudwatch.YAxisProps

/**
 * A dashboard gauge widget that displays metrics.
 *
 * Example:
 * ```
 * Dashboard dashboard;
 * Alarm errorAlarm;
 * Metric gaugeMetric;
 * dashboard.addWidgets(GaugeWidget.Builder.create()
 * .metrics(List.of(gaugeMetric))
 * .leftYAxis(YAxisProps.builder()
 * .min(0)
 * .max(1000)
 * .build())
 * .build());
 * ```
 */
@CdkDslMarker
public class GaugeWidgetDsl {
    private val cdkBuilder: GaugeWidget.Builder = GaugeWidget.Builder.create()

    private val _annotations: MutableList<HorizontalAnnotation> = mutableListOf()

    private val _metrics: MutableList<IMetric> = mutableListOf()

    /**
     * Annotations for the left Y axis.
     *
     * Default: - No annotations
     *
     * @param annotations Annotations for the left Y axis.
     */
    public fun annotations(annotations: HorizontalAnnotationDsl.() -> Unit) {
        _annotations.add(HorizontalAnnotationDsl().apply(annotations).build())
    }

    /**
     * Annotations for the left Y axis.
     *
     * Default: - No annotations
     *
     * @param annotations Annotations for the left Y axis.
     */
    public fun annotations(annotations: Collection<HorizontalAnnotation>) {
        _annotations.addAll(annotations)
    }

    /**
     * The end of the time range to use for each widget independently from those of the dashboard.
     *
     * If you specify a value for end, you must also specify a value for start. Specify an absolute
     * time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
     *
     * Default: When the dashboard loads, the end date will be the current time.
     *
     * @param end The end of the time range to use for each widget independently from those of the
     *   dashboard.
     */
    public fun end(end: String) {
        cdkBuilder.end(end)
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
     * Left Y axis.
     *
     * Default: - None
     *
     * @param leftYAxis Left Y axis.
     */
    public fun leftYAxis(leftYAxis: YAxisPropsDsl.() -> Unit = {}) {
        val builder = YAxisPropsDsl()
        builder.apply(leftYAxis)
        cdkBuilder.leftYAxis(builder.build())
    }

    /**
     * Left Y axis.
     *
     * Default: - None
     *
     * @param leftYAxis Left Y axis.
     */
    public fun leftYAxis(leftYAxis: YAxisProps) {
        cdkBuilder.leftYAxis(leftYAxis)
    }

    /**
     * Position of the legend.
     *
     * Default: - bottom
     *
     * @param legendPosition Position of the legend.
     */
    public fun legendPosition(legendPosition: LegendPosition) {
        cdkBuilder.legendPosition(legendPosition)
    }

    /**
     * Whether the graph should show live data.
     *
     * Default: false
     *
     * @param liveData Whether the graph should show live data.
     */
    public fun liveData(liveData: Boolean) {
        cdkBuilder.liveData(liveData)
    }

    /**
     * Metrics to display on left Y axis.
     *
     * Default: - No metrics
     *
     * @param metrics Metrics to display on left Y axis.
     */
    public fun metrics(vararg metrics: IMetric) {
        _metrics.addAll(listOf(*metrics))
    }

    /**
     * Metrics to display on left Y axis.
     *
     * Default: - No metrics
     *
     * @param metrics Metrics to display on left Y axis.
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
     * Whether to show the value from the entire time range. Only applicable for Bar and Pie charts.
     *
     * If false, values will be from the most recent period of your chosen time range; if true,
     * shows the value from the entire time range.
     *
     * Default: false
     *
     * @param setPeriodToTimeRange Whether to show the value from the entire time range. Only
     *   applicable for Bar and Pie charts.
     */
    public fun setPeriodToTimeRange(setPeriodToTimeRange: Boolean) {
        cdkBuilder.setPeriodToTimeRange(setPeriodToTimeRange)
    }

    /**
     * The start of the time range to use for each widget independently from those of the dashboard.
     *
     * You can specify start without specifying end to specify a relative time range that ends with
     * the current time. In this case, the value of start must begin with -P, and you can use M, H,
     * D, W and M as abbreviations for minutes, hours, days, weeks and months. For example, -PT8H
     * shows the last 8 hours and -P3M shows the last three months. You can also use start along
     * with an end field, to specify an absolute time range. When specifying an absolute time range,
     * use the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
     *
     * Default: When the dashboard loads, the start time will be the default time range.
     *
     * @param start The start of the time range to use for each widget independently from those of
     *   the dashboard.
     */
    public fun start(start: String) {
        cdkBuilder.start(start)
    }

    /**
     * The default statistic to be displayed for each metric.
     *
     * This default can be overridden within the definition of each individual metric
     *
     * Default: - The statistic for each metric is used
     *
     * @param statistic The default statistic to be displayed for each metric.
     */
    public fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
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

    public fun build(): GaugeWidget {
        if (_annotations.isNotEmpty()) cdkBuilder.annotations(_annotations)
        if (_metrics.isNotEmpty()) cdkBuilder.metrics(_metrics)
        return cdkBuilder.build()
    }
}
