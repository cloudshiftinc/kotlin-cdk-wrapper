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

/**
 * Properties for a SingleValueWidget.
 *
 * Example:
 *
 * ```
 * Dashboard dashboard;
 * dashboard.addWidgets(SingleValueWidget.Builder.create()
 * .metrics(List.of())
 * .period(Duration.minutes(15))
 * .build());
 * ```
 */
public interface SingleValueWidgetProps : MetricWidgetProps {
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
   * Metrics to display.
   */
  public fun metrics(): List<IMetric>

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
   * Whether to show the value from the entire time range.
   *
   * Default: false
   */
  public fun setPeriodToTimeRange(): Boolean? = unwrap(this).getSetPeriodToTimeRange()

  /**
   * Whether to show a graph below the value illustrating the value for the whole time range.
   *
   * Cannot be used in combination with `setPeriodToTimeRange`
   *
   * Default: false
   */
  public fun sparkline(): Boolean? = unwrap(this).getSparkline()

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
   * A builder for [SingleValueWidgetProps]
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
     * @param metrics Metrics to display. 
     */
    public fun metrics(metrics: List<IMetric>)

    /**
     * @param metrics Metrics to display. 
     */
    public fun metrics(vararg metrics: IMetric)

    /**
     * @param period The default period for all metrics in this widget.
     * The period is the length of time represented by one data point on the graph.
     * This default can be overridden within each metric definition.
     */
    public fun period(period: Duration)

    /**
     * @param setPeriodToTimeRange Whether to show the value from the entire time range.
     */
    public fun periodToTimeRange(setPeriodToTimeRange: Boolean)

    /**
     * @param region The region the metrics of this graph should be taken from.
     */
    public fun region(region: String)

    /**
     * @param sparkline Whether to show a graph below the value illustrating the value for the whole
     * time range.
     * Cannot be used in combination with `setPeriodToTimeRange`
     */
    public fun sparkline(sparkline: Boolean)

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
     * @param title Title for the graph.
     */
    public fun title(title: String)

    /**
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps.builder()

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
     * @param metrics Metrics to display. 
     */
    override fun metrics(metrics: List<IMetric>) {
      cdkBuilder.metrics(metrics.map(IMetric::unwrap))
    }

    /**
     * @param metrics Metrics to display. 
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
     * @param setPeriodToTimeRange Whether to show the value from the entire time range.
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
     * @param sparkline Whether to show a graph below the value illustrating the value for the whole
     * time range.
     * Cannot be used in combination with `setPeriodToTimeRange`
     */
    override fun sparkline(sparkline: Boolean) {
      cdkBuilder.sparkline(sparkline)
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

    public fun build(): software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps,
  ) : CdkObject(cdkObject), SingleValueWidgetProps {
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
     * Metrics to display.
     */
    override fun metrics(): List<IMetric> = unwrap(this).getMetrics().map(IMetric::wrap)

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
     * Whether to show the value from the entire time range.
     *
     * Default: false
     */
    override fun setPeriodToTimeRange(): Boolean? = unwrap(this).getSetPeriodToTimeRange()

    /**
     * Whether to show a graph below the value illustrating the value for the whole time range.
     *
     * Cannot be used in combination with `setPeriodToTimeRange`
     *
     * Default: false
     */
    override fun sparkline(): Boolean? = unwrap(this).getSparkline()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): SingleValueWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps):
        SingleValueWidgetProps = CdkObjectWrappers.wrap(cdkObject) as SingleValueWidgetProps

    internal fun unwrap(wrapped: SingleValueWidgetProps):
        software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps
  }
}
