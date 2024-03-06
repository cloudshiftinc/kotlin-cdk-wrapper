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
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.TableLayout
import software.amazon.awscdk.services.cloudwatch.TableSummaryProps
import software.amazon.awscdk.services.cloudwatch.TableThreshold
import software.amazon.awscdk.services.cloudwatch.TableWidget

/**
 * A dashboard widget that displays metrics.
 *
 * Example:
 * ```
 * Dashboard dashboard;
 * dashboard.addWidgets(TableWidget.Builder.create()
 * // ...
 * .layout(TableLayout.VERTICAL)
 * .build());
 * ```
 */
@CdkDslMarker
public class TableWidgetDsl {
    private val cdkBuilder: TableWidget.Builder = TableWidget.Builder.create()

    private val _metrics: MutableList<IMetric> = mutableListOf()

    private val _thresholds: MutableList<TableThreshold> = mutableListOf()

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
     * Table layout.
     *
     * Default: - TableLayout.HORIZONTAL
     *
     * @param layout Table layout.
     */
    public fun layout(layout: TableLayout) {
        cdkBuilder.layout(layout)
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
     * Metrics to display in the table.
     *
     * Default: - No metrics
     *
     * @param metrics Metrics to display in the table.
     */
    public fun metrics(vararg metrics: IMetric) {
        _metrics.addAll(listOf(*metrics))
    }

    /**
     * Metrics to display in the table.
     *
     * Default: - No metrics
     *
     * @param metrics Metrics to display in the table.
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
     * Show the metrics units in the label column.
     *
     * Default: - false
     *
     * @param showUnitsInLabel Show the metrics units in the label column.
     */
    public fun showUnitsInLabel(showUnitsInLabel: Boolean) {
        cdkBuilder.showUnitsInLabel(showUnitsInLabel)
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
     * Properties for displaying summary columns.
     *
     * Default: - no summary columns are shown
     *
     * @param summary Properties for displaying summary columns.
     */
    public fun summary(summary: TableSummaryPropsDsl.() -> Unit = {}) {
        val builder = TableSummaryPropsDsl()
        builder.apply(summary)
        cdkBuilder.summary(builder.build())
    }

    /**
     * Properties for displaying summary columns.
     *
     * Default: - no summary columns are shown
     *
     * @param summary Properties for displaying summary columns.
     */
    public fun summary(summary: TableSummaryProps) {
        cdkBuilder.summary(summary)
    }

    /**
     * Thresholds for highlighting table cells.
     *
     * Default: - No thresholds
     *
     * @param thresholds Thresholds for highlighting table cells.
     */
    public fun thresholds(vararg thresholds: TableThreshold) {
        _thresholds.addAll(listOf(*thresholds))
    }

    /**
     * Thresholds for highlighting table cells.
     *
     * Default: - No thresholds
     *
     * @param thresholds Thresholds for highlighting table cells.
     */
    public fun thresholds(thresholds: Collection<TableThreshold>) {
        _thresholds.addAll(thresholds)
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

    public fun build(): TableWidget {
        if (_metrics.isNotEmpty()) cdkBuilder.metrics(_metrics)
        if (_thresholds.isNotEmpty()) cdkBuilder.thresholds(_thresholds)
        return cdkBuilder.build()
    }
}
