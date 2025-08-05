@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * A dashboard widget that displays metrics.
 *
 * Example:
 *
 * ```
 * Dashboard dashboard;
 * dashboard.addWidgets(TableWidget.Builder.create()
 * // ...
 * .layout(TableLayout.VERTICAL)
 * .build());
 * ```
 */
public open class TableWidget(
  cdkObject: software.amazon.awscdk.services.cloudwatch.TableWidget,
) : ConcreteWidget(cdkObject) {
  public constructor(props: TableWidgetProps) :
      this(software.amazon.awscdk.services.cloudwatch.TableWidget(props.let(TableWidgetProps.Companion::unwrap))
  )

  public constructor(props: TableWidgetProps.Builder.() -> Unit) : this(TableWidgetProps(props)
  )

  /**
   * Add another metric.
   *
   * @param metric the metric to add. 
   */
  public open fun addMetric(metric: IMetric) {
    unwrap(this).addMetric(metric.let(IMetric.Companion::unwrap))
  }

  /**
   * Return the widget JSON for use in the dashboard.
   */
  public override fun toJson(): List<Any> = unwrap(this).toJson()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.TableWidget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS account ID where the metrics are located.
     *
     * This enables cross-account functionality for CloudWatch dashboards.
     * Before using this feature, ensure that proper cross-account sharing is configured
     * between the monitoring account and source account.
     *
     * For more information, see:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html
     *
     * Default: - Current account
     *
     * @param accountId The AWS account ID where the metrics are located. 
     */
    public fun accountId(accountId: String)

    /**
     * The end of the time range to use for each widget independently from those of the dashboard.
     *
     * If you specify a value for end, you must also specify a value for start.
     * Specify an absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
     *
     * Default: When the dashboard loads, the end date will be the current time.
     *
     * @param end The end of the time range to use for each widget independently from those of the
     * dashboard. 
     */
    public fun end(end: String)

    /**
     * Whether to show as many digits as can fit, before rounding.
     *
     * Default: false
     *
     * @param fullPrecision Whether to show as many digits as can fit, before rounding. 
     */
    public fun fullPrecision(fullPrecision: Boolean)

    /**
     * Height of the widget.
     *
     * Default: - 6 for Alarm and Graph widgets.
     * 3 for single value widgets where most recent value of a metric is displayed.
     *
     * @param height Height of the widget. 
     */
    public fun height(height: Number)

    /**
     * Table layout.
     *
     * Default: - TableLayout.HORIZONTAL
     *
     * @param layout Table layout. 
     */
    public fun layout(layout: TableLayout)

    /**
     * Whether the graph should show live data.
     *
     * Default: false
     *
     * @param liveData Whether the graph should show live data. 
     */
    public fun liveData(liveData: Boolean)

    /**
     * Metrics to display in the table.
     *
     * Default: - No metrics
     *
     * @param metrics Metrics to display in the table. 
     */
    public fun metrics(metrics: List<IMetric>)

    /**
     * Metrics to display in the table.
     *
     * Default: - No metrics
     *
     * @param metrics Metrics to display in the table. 
     */
    public fun metrics(vararg metrics: IMetric)

    /**
     * The default period for all metrics in this widget.
     *
     * The period is the length of time represented by one data point on the graph.
     * This default can be overridden within each metric definition.
     *
     * Default: cdk.Duration.seconds(300)
     *
     * @param period The default period for all metrics in this widget. 
     */
    public fun period(period: Duration)

    /**
     * Whether to show the value from the entire time range. Only applicable for Bar and Pie charts.
     *
     * If false, values will be from the most recent period of your chosen time range;
     * if true, shows the value from the entire time range.
     *
     * Default: false
     *
     * @param setPeriodToTimeRange Whether to show the value from the entire time range. Only
     * applicable for Bar and Pie charts. 
     */
    public fun periodToTimeRange(setPeriodToTimeRange: Boolean)

    /**
     * The region the metrics of this graph should be taken from.
     *
     * Default: - Current region
     *
     * @param region The region the metrics of this graph should be taken from. 
     */
    public fun region(region: String)

    /**
     * Show the metrics units in the label column.
     *
     * Default: - false
     *
     * @param showUnitsInLabel Show the metrics units in the label column. 
     */
    public fun showUnitsInLabel(showUnitsInLabel: Boolean)

    /**
     * The start of the time range to use for each widget independently from those of the dashboard.
     *
     * You can specify start without specifying end to specify a relative time range that ends with
     * the current time.
     * In this case, the value of start must begin with -P, and you can use M, H, D, W and M as
     * abbreviations for
     * minutes, hours, days, weeks and months. For example, -PT8H shows the last 8 hours and -P3M
     * shows the last three months.
     * You can also use start along with an end field, to specify an absolute time range.
     * When specifying an absolute time range, use the ISO 8601 format. For example,
     * 2018-12-17T06:00:00.000Z.
     *
     * Default: When the dashboard loads, the start time will be the default time range.
     *
     * @param start The start of the time range to use for each widget independently from those of
     * the dashboard. 
     */
    public fun start(start: String)

    /**
     * The default statistic to be displayed for each metric.
     *
     * This default can be overridden within the definition of each individual metric
     *
     * Default: - The statistic for each metric is used
     *
     * @param statistic The default statistic to be displayed for each metric. 
     */
    public fun statistic(statistic: String)

    /**
     * Properties for displaying summary columns.
     *
     * Default: - no summary columns are shown
     *
     * @param summary Properties for displaying summary columns. 
     */
    public fun summary(summary: TableSummaryProps)

    /**
     * Properties for displaying summary columns.
     *
     * Default: - no summary columns are shown
     *
     * @param summary Properties for displaying summary columns. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d1d3f693913c56730dceb4021b15b0595474b4852c19a105346bcd972a979a4")
    public fun summary(summary: TableSummaryProps.Builder.() -> Unit)

    /**
     * Thresholds for highlighting table cells.
     *
     * Default: - No thresholds
     *
     * @param thresholds Thresholds for highlighting table cells. 
     */
    public fun thresholds(thresholds: List<TableThreshold>)

    /**
     * Thresholds for highlighting table cells.
     *
     * Default: - No thresholds
     *
     * @param thresholds Thresholds for highlighting table cells. 
     */
    public fun thresholds(vararg thresholds: TableThreshold)

    /**
     * Title for the graph.
     *
     * Default: - None
     *
     * @param title Title for the graph. 
     */
    public fun title(title: String)

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     *
     * @param width Width of the widget, in a grid of 24 units wide. 
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.TableWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.TableWidget.Builder.create()

    /**
     * The AWS account ID where the metrics are located.
     *
     * This enables cross-account functionality for CloudWatch dashboards.
     * Before using this feature, ensure that proper cross-account sharing is configured
     * between the monitoring account and source account.
     *
     * For more information, see:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html
     *
     * Default: - Current account
     *
     * @param accountId The AWS account ID where the metrics are located. 
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * The end of the time range to use for each widget independently from those of the dashboard.
     *
     * If you specify a value for end, you must also specify a value for start.
     * Specify an absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
     *
     * Default: When the dashboard loads, the end date will be the current time.
     *
     * @param end The end of the time range to use for each widget independently from those of the
     * dashboard. 
     */
    override fun end(end: String) {
      cdkBuilder.end(end)
    }

    /**
     * Whether to show as many digits as can fit, before rounding.
     *
     * Default: false
     *
     * @param fullPrecision Whether to show as many digits as can fit, before rounding. 
     */
    override fun fullPrecision(fullPrecision: Boolean) {
      cdkBuilder.fullPrecision(fullPrecision)
    }

    /**
     * Height of the widget.
     *
     * Default: - 6 for Alarm and Graph widgets.
     * 3 for single value widgets where most recent value of a metric is displayed.
     *
     * @param height Height of the widget. 
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * Table layout.
     *
     * Default: - TableLayout.HORIZONTAL
     *
     * @param layout Table layout. 
     */
    override fun layout(layout: TableLayout) {
      cdkBuilder.layout(layout.let(TableLayout.Companion::unwrap))
    }

    /**
     * Whether the graph should show live data.
     *
     * Default: false
     *
     * @param liveData Whether the graph should show live data. 
     */
    override fun liveData(liveData: Boolean) {
      cdkBuilder.liveData(liveData)
    }

    /**
     * Metrics to display in the table.
     *
     * Default: - No metrics
     *
     * @param metrics Metrics to display in the table. 
     */
    override fun metrics(metrics: List<IMetric>) {
      cdkBuilder.metrics(metrics.map(IMetric.Companion::unwrap))
    }

    /**
     * Metrics to display in the table.
     *
     * Default: - No metrics
     *
     * @param metrics Metrics to display in the table. 
     */
    override fun metrics(vararg metrics: IMetric): Unit = metrics(metrics.toList())

    /**
     * The default period for all metrics in this widget.
     *
     * The period is the length of time represented by one data point on the graph.
     * This default can be overridden within each metric definition.
     *
     * Default: cdk.Duration.seconds(300)
     *
     * @param period The default period for all metrics in this widget. 
     */
    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration.Companion::unwrap))
    }

    /**
     * Whether to show the value from the entire time range. Only applicable for Bar and Pie charts.
     *
     * If false, values will be from the most recent period of your chosen time range;
     * if true, shows the value from the entire time range.
     *
     * Default: false
     *
     * @param setPeriodToTimeRange Whether to show the value from the entire time range. Only
     * applicable for Bar and Pie charts. 
     */
    override fun periodToTimeRange(setPeriodToTimeRange: Boolean) {
      cdkBuilder.setPeriodToTimeRange(setPeriodToTimeRange)
    }

    /**
     * The region the metrics of this graph should be taken from.
     *
     * Default: - Current region
     *
     * @param region The region the metrics of this graph should be taken from. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * Show the metrics units in the label column.
     *
     * Default: - false
     *
     * @param showUnitsInLabel Show the metrics units in the label column. 
     */
    override fun showUnitsInLabel(showUnitsInLabel: Boolean) {
      cdkBuilder.showUnitsInLabel(showUnitsInLabel)
    }

    /**
     * The start of the time range to use for each widget independently from those of the dashboard.
     *
     * You can specify start without specifying end to specify a relative time range that ends with
     * the current time.
     * In this case, the value of start must begin with -P, and you can use M, H, D, W and M as
     * abbreviations for
     * minutes, hours, days, weeks and months. For example, -PT8H shows the last 8 hours and -P3M
     * shows the last three months.
     * You can also use start along with an end field, to specify an absolute time range.
     * When specifying an absolute time range, use the ISO 8601 format. For example,
     * 2018-12-17T06:00:00.000Z.
     *
     * Default: When the dashboard loads, the start time will be the default time range.
     *
     * @param start The start of the time range to use for each widget independently from those of
     * the dashboard. 
     */
    override fun start(start: String) {
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
    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    /**
     * Properties for displaying summary columns.
     *
     * Default: - no summary columns are shown
     *
     * @param summary Properties for displaying summary columns. 
     */
    override fun summary(summary: TableSummaryProps) {
      cdkBuilder.summary(summary.let(TableSummaryProps.Companion::unwrap))
    }

    /**
     * Properties for displaying summary columns.
     *
     * Default: - no summary columns are shown
     *
     * @param summary Properties for displaying summary columns. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d1d3f693913c56730dceb4021b15b0595474b4852c19a105346bcd972a979a4")
    override fun summary(summary: TableSummaryProps.Builder.() -> Unit): Unit =
        summary(TableSummaryProps(summary))

    /**
     * Thresholds for highlighting table cells.
     *
     * Default: - No thresholds
     *
     * @param thresholds Thresholds for highlighting table cells. 
     */
    override fun thresholds(thresholds: List<TableThreshold>) {
      cdkBuilder.thresholds(thresholds.map(TableThreshold.Companion::unwrap))
    }

    /**
     * Thresholds for highlighting table cells.
     *
     * Default: - No thresholds
     *
     * @param thresholds Thresholds for highlighting table cells. 
     */
    override fun thresholds(vararg thresholds: TableThreshold): Unit =
        thresholds(thresholds.toList())

    /**
     * Title for the graph.
     *
     * Default: - None
     *
     * @param title Title for the graph. 
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     *
     * @param width Width of the widget, in a grid of 24 units wide. 
     */
    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.TableWidget = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TableWidget {
      val builderImpl = BuilderImpl()
      return TableWidget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.TableWidget):
        TableWidget = TableWidget(cdkObject)

    internal fun unwrap(wrapped: TableWidget):
        software.amazon.awscdk.services.cloudwatch.TableWidget = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudwatch.TableWidget
  }
}
