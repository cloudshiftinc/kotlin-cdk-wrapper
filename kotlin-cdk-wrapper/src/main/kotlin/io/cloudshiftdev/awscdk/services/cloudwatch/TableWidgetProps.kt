@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for a TableWidget.
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
public interface TableWidgetProps : MetricWidgetProps {
  /**
   * The end of the time range to use for each widget independently from those of the dashboard.
   *
   * If you specify a value for end, you must also specify a value for start.
   * Specify an absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
   *
   * Default: When the dashboard loads, the end date will be the current time.
   */
  public fun end(): String? = unwrap(this).getEnd()

  /**
   * Whether to show as many digits as can fit, before rounding.
   *
   * Default: false
   */
  public fun fullPrecision(): Boolean? = unwrap(this).getFullPrecision()

  /**
   * Table layout.
   *
   * Default: - TableLayout.HORIZONTAL
   */
  public fun layout(): TableLayout? = unwrap(this).getLayout()?.let(TableLayout::wrap)

  /**
   * Whether the graph should show live data.
   *
   * Default: false
   */
  public fun liveData(): Boolean? = unwrap(this).getLiveData()

  /**
   * Metrics to display in the table.
   *
   * Default: - No metrics
   */
  public fun metrics(): List<IMetric> = unwrap(this).getMetrics()?.map(IMetric::wrap) ?: emptyList()

  /**
   * The default period for all metrics in this widget.
   *
   * The period is the length of time represented by one data point on the graph.
   * This default can be overridden within each metric definition.
   *
   * Default: cdk.Duration.seconds(300)
   */
  public fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

  /**
   * Whether to show the value from the entire time range. Only applicable for Bar and Pie charts.
   *
   * If false, values will be from the most recent period of your chosen time range;
   * if true, shows the value from the entire time range.
   *
   * Default: false
   */
  public fun setPeriodToTimeRange(): Boolean? = unwrap(this).getSetPeriodToTimeRange()

  /**
   * Show the metrics units in the label column.
   *
   * Default: - false
   */
  public fun showUnitsInLabel(): Boolean? = unwrap(this).getShowUnitsInLabel()

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
   */
  public fun start(): String? = unwrap(this).getStart()

  /**
   * The default statistic to be displayed for each metric.
   *
   * This default can be overridden within the definition of each individual metric
   *
   * Default: - The statistic for each metric is used
   */
  public fun statistic(): String? = unwrap(this).getStatistic()

  /**
   * Properties for displaying summary columns.
   *
   * Default: - no summary columns are shown
   */
  public fun summary(): TableSummaryProps? = unwrap(this).getSummary()?.let(TableSummaryProps::wrap)

  /**
   * Thresholds for highlighting table cells.
   *
   * Default: - No thresholds
   */
  public fun thresholds(): List<TableThreshold> =
      unwrap(this).getThresholds()?.map(TableThreshold::wrap) ?: emptyList()

  /**
   * A builder for [TableWidgetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param end The end of the time range to use for each widget independently from those of the
     * dashboard.
     * If you specify a value for end, you must also specify a value for start.
     * Specify an absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
     */
    public fun end(end: String)

    /**
     * @param fullPrecision Whether to show as many digits as can fit, before rounding.
     */
    public fun fullPrecision(fullPrecision: Boolean)

    /**
     * @param height Height of the widget.
     */
    public fun height(height: Number)

    /**
     * @param layout Table layout.
     */
    public fun layout(layout: TableLayout)

    /**
     * @param liveData Whether the graph should show live data.
     */
    public fun liveData(liveData: Boolean)

    /**
     * @param metrics Metrics to display in the table.
     */
    public fun metrics(metrics: List<IMetric>)

    /**
     * @param metrics Metrics to display in the table.
     */
    public fun metrics(vararg metrics: IMetric)

    /**
     * @param period The default period for all metrics in this widget.
     * The period is the length of time represented by one data point on the graph.
     * This default can be overridden within each metric definition.
     */
    public fun period(period: Duration)

    /**
     * @param setPeriodToTimeRange Whether to show the value from the entire time range. Only
     * applicable for Bar and Pie charts.
     * If false, values will be from the most recent period of your chosen time range;
     * if true, shows the value from the entire time range.
     */
    public fun periodToTimeRange(setPeriodToTimeRange: Boolean)

    /**
     * @param region The region the metrics of this graph should be taken from.
     */
    public fun region(region: String)

    /**
     * @param showUnitsInLabel Show the metrics units in the label column.
     */
    public fun showUnitsInLabel(showUnitsInLabel: Boolean)

    /**
     * @param start The start of the time range to use for each widget independently from those of
     * the dashboard.
     * You can specify start without specifying end to specify a relative time range that ends with
     * the current time.
     * In this case, the value of start must begin with -P, and you can use M, H, D, W and M as
     * abbreviations for
     * minutes, hours, days, weeks and months. For example, -PT8H shows the last 8 hours and -P3M
     * shows the last three months.
     * You can also use start along with an end field, to specify an absolute time range.
     * When specifying an absolute time range, use the ISO 8601 format. For example,
     * 2018-12-17T06:00:00.000Z.
     */
    public fun start(start: String)

    /**
     * @param statistic The default statistic to be displayed for each metric.
     * This default can be overridden within the definition of each individual metric
     */
    public fun statistic(statistic: String)

    /**
     * @param summary Properties for displaying summary columns.
     */
    public fun summary(summary: TableSummaryProps)

    /**
     * @param summary Properties for displaying summary columns.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd5e39ab14c8093d42b55a5f0c5c694bccdb427d8e1b2432b86d21c676b20b69")
    public fun summary(summary: TableSummaryProps.Builder.() -> Unit)

    /**
     * @param thresholds Thresholds for highlighting table cells.
     */
    public fun thresholds(thresholds: List<TableThreshold>)

    /**
     * @param thresholds Thresholds for highlighting table cells.
     */
    public fun thresholds(vararg thresholds: TableThreshold)

    /**
     * @param title Title for the graph.
     */
    public fun title(title: String)

    /**
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.TableWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.TableWidgetProps.builder()

    /**
     * @param end The end of the time range to use for each widget independently from those of the
     * dashboard.
     * If you specify a value for end, you must also specify a value for start.
     * Specify an absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
     */
    override fun end(end: String) {
      cdkBuilder.end(end)
    }

    /**
     * @param fullPrecision Whether to show as many digits as can fit, before rounding.
     */
    override fun fullPrecision(fullPrecision: Boolean) {
      cdkBuilder.fullPrecision(fullPrecision)
    }

    /**
     * @param height Height of the widget.
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * @param layout Table layout.
     */
    override fun layout(layout: TableLayout) {
      cdkBuilder.layout(layout.let(TableLayout::unwrap))
    }

    /**
     * @param liveData Whether the graph should show live data.
     */
    override fun liveData(liveData: Boolean) {
      cdkBuilder.liveData(liveData)
    }

    /**
     * @param metrics Metrics to display in the table.
     */
    override fun metrics(metrics: List<IMetric>) {
      cdkBuilder.metrics(metrics.map(IMetric::unwrap))
    }

    /**
     * @param metrics Metrics to display in the table.
     */
    override fun metrics(vararg metrics: IMetric): Unit = metrics(metrics.toList())

    /**
     * @param period The default period for all metrics in this widget.
     * The period is the length of time represented by one data point on the graph.
     * This default can be overridden within each metric definition.
     */
    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration::unwrap))
    }

    /**
     * @param setPeriodToTimeRange Whether to show the value from the entire time range. Only
     * applicable for Bar and Pie charts.
     * If false, values will be from the most recent period of your chosen time range;
     * if true, shows the value from the entire time range.
     */
    override fun periodToTimeRange(setPeriodToTimeRange: Boolean) {
      cdkBuilder.setPeriodToTimeRange(setPeriodToTimeRange)
    }

    /**
     * @param region The region the metrics of this graph should be taken from.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param showUnitsInLabel Show the metrics units in the label column.
     */
    override fun showUnitsInLabel(showUnitsInLabel: Boolean) {
      cdkBuilder.showUnitsInLabel(showUnitsInLabel)
    }

    /**
     * @param start The start of the time range to use for each widget independently from those of
     * the dashboard.
     * You can specify start without specifying end to specify a relative time range that ends with
     * the current time.
     * In this case, the value of start must begin with -P, and you can use M, H, D, W and M as
     * abbreviations for
     * minutes, hours, days, weeks and months. For example, -PT8H shows the last 8 hours and -P3M
     * shows the last three months.
     * You can also use start along with an end field, to specify an absolute time range.
     * When specifying an absolute time range, use the ISO 8601 format. For example,
     * 2018-12-17T06:00:00.000Z.
     */
    override fun start(start: String) {
      cdkBuilder.start(start)
    }

    /**
     * @param statistic The default statistic to be displayed for each metric.
     * This default can be overridden within the definition of each individual metric
     */
    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    /**
     * @param summary Properties for displaying summary columns.
     */
    override fun summary(summary: TableSummaryProps) {
      cdkBuilder.summary(summary.let(TableSummaryProps::unwrap))
    }

    /**
     * @param summary Properties for displaying summary columns.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd5e39ab14c8093d42b55a5f0c5c694bccdb427d8e1b2432b86d21c676b20b69")
    override fun summary(summary: TableSummaryProps.Builder.() -> Unit): Unit =
        summary(TableSummaryProps(summary))

    /**
     * @param thresholds Thresholds for highlighting table cells.
     */
    override fun thresholds(thresholds: List<TableThreshold>) {
      cdkBuilder.thresholds(thresholds.map(TableThreshold::unwrap))
    }

    /**
     * @param thresholds Thresholds for highlighting table cells.
     */
    override fun thresholds(vararg thresholds: TableThreshold): Unit =
        thresholds(thresholds.toList())

    /**
     * @param title Title for the graph.
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    /**
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.TableWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.TableWidgetProps,
  ) : CdkObject(cdkObject), TableWidgetProps {
    /**
     * The end of the time range to use for each widget independently from those of the dashboard.
     *
     * If you specify a value for end, you must also specify a value for start.
     * Specify an absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
     *
     * Default: When the dashboard loads, the end date will be the current time.
     */
    override fun end(): String? = unwrap(this).getEnd()

    /**
     * Whether to show as many digits as can fit, before rounding.
     *
     * Default: false
     */
    override fun fullPrecision(): Boolean? = unwrap(this).getFullPrecision()

    /**
     * Height of the widget.
     *
     * Default: - 6 for Alarm and Graph widgets.
     * 3 for single value widgets where most recent value of a metric is displayed.
     */
    override fun height(): Number? = unwrap(this).getHeight()

    /**
     * Table layout.
     *
     * Default: - TableLayout.HORIZONTAL
     */
    override fun layout(): TableLayout? = unwrap(this).getLayout()?.let(TableLayout::wrap)

    /**
     * Whether the graph should show live data.
     *
     * Default: false
     */
    override fun liveData(): Boolean? = unwrap(this).getLiveData()

    /**
     * Metrics to display in the table.
     *
     * Default: - No metrics
     */
    override fun metrics(): List<IMetric> = unwrap(this).getMetrics()?.map(IMetric::wrap) ?:
        emptyList()

    /**
     * The default period for all metrics in this widget.
     *
     * The period is the length of time represented by one data point on the graph.
     * This default can be overridden within each metric definition.
     *
     * Default: cdk.Duration.seconds(300)
     */
    override fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

    /**
     * The region the metrics of this graph should be taken from.
     *
     * Default: - Current region
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * Whether to show the value from the entire time range. Only applicable for Bar and Pie charts.
     *
     * If false, values will be from the most recent period of your chosen time range;
     * if true, shows the value from the entire time range.
     *
     * Default: false
     */
    override fun setPeriodToTimeRange(): Boolean? = unwrap(this).getSetPeriodToTimeRange()

    /**
     * Show the metrics units in the label column.
     *
     * Default: - false
     */
    override fun showUnitsInLabel(): Boolean? = unwrap(this).getShowUnitsInLabel()

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
     */
    override fun start(): String? = unwrap(this).getStart()

    /**
     * The default statistic to be displayed for each metric.
     *
     * This default can be overridden within the definition of each individual metric
     *
     * Default: - The statistic for each metric is used
     */
    override fun statistic(): String? = unwrap(this).getStatistic()

    /**
     * Properties for displaying summary columns.
     *
     * Default: - no summary columns are shown
     */
    override fun summary(): TableSummaryProps? =
        unwrap(this).getSummary()?.let(TableSummaryProps::wrap)

    /**
     * Thresholds for highlighting table cells.
     *
     * Default: - No thresholds
     */
    override fun thresholds(): List<TableThreshold> =
        unwrap(this).getThresholds()?.map(TableThreshold::wrap) ?: emptyList()

    /**
     * Title for the graph.
     *
     * Default: - None
     */
    override fun title(): String? = unwrap(this).getTitle()

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     */
    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TableWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.TableWidgetProps):
        TableWidgetProps = CdkObjectWrappers.wrap(cdkObject) as? TableWidgetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TableWidgetProps):
        software.amazon.awscdk.services.cloudwatch.TableWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.TableWidgetProps
  }
}
