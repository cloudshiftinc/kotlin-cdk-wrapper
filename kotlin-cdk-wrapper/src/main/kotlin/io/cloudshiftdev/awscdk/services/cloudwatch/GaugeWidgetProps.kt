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
 * Properties for a GaugeWidget.
 *
 * Example:
 *
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
public interface GaugeWidgetProps : MetricWidgetProps {
  /**
   * Annotations for the left Y axis.
   *
   * Default: - No annotations
   */
  public fun annotations(): List<HorizontalAnnotation> =
      unwrap(this).getAnnotations()?.map(HorizontalAnnotation::wrap) ?: emptyList()

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
   * Left Y axis.
   *
   * Default: - None
   */
  public fun leftYAxis(): YAxisProps? = unwrap(this).getLeftYAxis()?.let(YAxisProps::wrap)

  /**
   * Position of the legend.
   *
   * Default: - bottom
   */
  public fun legendPosition(): LegendPosition? =
      unwrap(this).getLegendPosition()?.let(LegendPosition::wrap)

  /**
   * Whether the graph should show live data.
   *
   * Default: false
   */
  public fun liveData(): Boolean? = unwrap(this).getLiveData()

  /**
   * Metrics to display on left Y axis.
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
   * A builder for [GaugeWidgetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param annotations Annotations for the left Y axis.
     */
    public fun annotations(annotations: List<HorizontalAnnotation>)

    /**
     * @param annotations Annotations for the left Y axis.
     */
    public fun annotations(vararg annotations: HorizontalAnnotation)

    /**
     * @param end The end of the time range to use for each widget independently from those of the
     * dashboard.
     * If you specify a value for end, you must also specify a value for start.
     * Specify an absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
     */
    public fun end(end: String)

    /**
     * @param height Height of the widget.
     */
    public fun height(height: Number)

    /**
     * @param leftYAxis Left Y axis.
     */
    public fun leftYAxis(leftYAxis: YAxisProps)

    /**
     * @param leftYAxis Left Y axis.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d90cd2f33f01b72a99f5849cd8ea0b62f456c38520983609ad71e7f48b87966")
    public fun leftYAxis(leftYAxis: YAxisProps.Builder.() -> Unit)

    /**
     * @param legendPosition Position of the legend.
     */
    public fun legendPosition(legendPosition: LegendPosition)

    /**
     * @param liveData Whether the graph should show live data.
     */
    public fun liveData(liveData: Boolean)

    /**
     * @param metrics Metrics to display on left Y axis.
     */
    public fun metrics(metrics: List<IMetric>)

    /**
     * @param metrics Metrics to display on left Y axis.
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
     * @param title Title for the graph.
     */
    public fun title(title: String)

    /**
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps.builder()

    /**
     * @param annotations Annotations for the left Y axis.
     */
    override fun annotations(annotations: List<HorizontalAnnotation>) {
      cdkBuilder.annotations(annotations.map(HorizontalAnnotation::unwrap))
    }

    /**
     * @param annotations Annotations for the left Y axis.
     */
    override fun annotations(vararg annotations: HorizontalAnnotation): Unit =
        annotations(annotations.toList())

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
     * @param height Height of the widget.
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * @param leftYAxis Left Y axis.
     */
    override fun leftYAxis(leftYAxis: YAxisProps) {
      cdkBuilder.leftYAxis(leftYAxis.let(YAxisProps::unwrap))
    }

    /**
     * @param leftYAxis Left Y axis.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d90cd2f33f01b72a99f5849cd8ea0b62f456c38520983609ad71e7f48b87966")
    override fun leftYAxis(leftYAxis: YAxisProps.Builder.() -> Unit): Unit =
        leftYAxis(YAxisProps(leftYAxis))

    /**
     * @param legendPosition Position of the legend.
     */
    override fun legendPosition(legendPosition: LegendPosition) {
      cdkBuilder.legendPosition(legendPosition.let(LegendPosition::unwrap))
    }

    /**
     * @param liveData Whether the graph should show live data.
     */
    override fun liveData(liveData: Boolean) {
      cdkBuilder.liveData(liveData)
    }

    /**
     * @param metrics Metrics to display on left Y axis.
     */
    override fun metrics(metrics: List<IMetric>) {
      cdkBuilder.metrics(metrics.map(IMetric::unwrap))
    }

    /**
     * @param metrics Metrics to display on left Y axis.
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

    public fun build(): software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps,
  ) : CdkObject(cdkObject), GaugeWidgetProps {
    /**
     * Annotations for the left Y axis.
     *
     * Default: - No annotations
     */
    override fun annotations(): List<HorizontalAnnotation> =
        unwrap(this).getAnnotations()?.map(HorizontalAnnotation::wrap) ?: emptyList()

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
     * Height of the widget.
     *
     * Default: - 6 for Alarm and Graph widgets.
     * 3 for single value widgets where most recent value of a metric is displayed.
     */
    override fun height(): Number? = unwrap(this).getHeight()

    /**
     * Left Y axis.
     *
     * Default: - None
     */
    override fun leftYAxis(): YAxisProps? = unwrap(this).getLeftYAxis()?.let(YAxisProps::wrap)

    /**
     * Position of the legend.
     *
     * Default: - bottom
     */
    override fun legendPosition(): LegendPosition? =
        unwrap(this).getLegendPosition()?.let(LegendPosition::wrap)

    /**
     * Whether the graph should show live data.
     *
     * Default: false
     */
    override fun liveData(): Boolean? = unwrap(this).getLiveData()

    /**
     * Metrics to display on left Y axis.
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
    public operator fun invoke(block: Builder.() -> Unit = {}): GaugeWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps):
        GaugeWidgetProps = CdkObjectWrappers.wrap(cdkObject) as GaugeWidgetProps

    internal fun unwrap(wrapped: GaugeWidgetProps):
        software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps
  }
}
