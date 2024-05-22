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
 * A dashboard gauge widget that displays metrics.
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
public open class GaugeWidget(
  cdkObject: software.amazon.awscdk.services.cloudwatch.GaugeWidget,
) : ConcreteWidget(cdkObject) {
  public constructor(props: GaugeWidgetProps) :
      this(software.amazon.awscdk.services.cloudwatch.GaugeWidget(props.let(GaugeWidgetProps.Companion::unwrap))
  )

  public constructor(props: GaugeWidgetProps.Builder.() -> Unit) : this(GaugeWidgetProps(props)
  )

  /**
   * Add another metric to the left Y axis of the GaugeWidget.
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.GaugeWidget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Annotations for the left Y axis.
     *
     * Default: - No annotations
     *
     * @param annotations Annotations for the left Y axis. 
     */
    public fun annotations(annotations: List<HorizontalAnnotation>)

    /**
     * Annotations for the left Y axis.
     *
     * Default: - No annotations
     *
     * @param annotations Annotations for the left Y axis. 
     */
    public fun annotations(vararg annotations: HorizontalAnnotation)

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
     * Height of the widget.
     *
     * Default: - 6 for Alarm and Graph widgets.
     * 3 for single value widgets where most recent value of a metric is displayed.
     *
     * @param height Height of the widget. 
     */
    public fun height(height: Number)

    /**
     * Left Y axis.
     *
     * Default: - None
     *
     * @param leftYAxis Left Y axis. 
     */
    public fun leftYAxis(leftYAxis: YAxisProps)

    /**
     * Left Y axis.
     *
     * Default: - None
     *
     * @param leftYAxis Left Y axis. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ea22e824d60340f70a8c7b8af9dca98342321dd5906ff9f481b308e4fe2abe1")
    public fun leftYAxis(leftYAxis: YAxisProps.Builder.() -> Unit)

    /**
     * Position of the legend.
     *
     * Default: - bottom
     *
     * @param legendPosition Position of the legend. 
     */
    public fun legendPosition(legendPosition: LegendPosition)

    /**
     * Whether the graph should show live data.
     *
     * Default: false
     *
     * @param liveData Whether the graph should show live data. 
     */
    public fun liveData(liveData: Boolean)

    /**
     * Metrics to display on left Y axis.
     *
     * Default: - No metrics
     *
     * @param metrics Metrics to display on left Y axis. 
     */
    public fun metrics(metrics: List<IMetric>)

    /**
     * Metrics to display on left Y axis.
     *
     * Default: - No metrics
     *
     * @param metrics Metrics to display on left Y axis. 
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
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.GaugeWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.GaugeWidget.Builder.create()

    /**
     * Annotations for the left Y axis.
     *
     * Default: - No annotations
     *
     * @param annotations Annotations for the left Y axis. 
     */
    override fun annotations(annotations: List<HorizontalAnnotation>) {
      cdkBuilder.annotations(annotations.map(HorizontalAnnotation.Companion::unwrap))
    }

    /**
     * Annotations for the left Y axis.
     *
     * Default: - No annotations
     *
     * @param annotations Annotations for the left Y axis. 
     */
    override fun annotations(vararg annotations: HorizontalAnnotation): Unit =
        annotations(annotations.toList())

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
     * Left Y axis.
     *
     * Default: - None
     *
     * @param leftYAxis Left Y axis. 
     */
    override fun leftYAxis(leftYAxis: YAxisProps) {
      cdkBuilder.leftYAxis(leftYAxis.let(YAxisProps.Companion::unwrap))
    }

    /**
     * Left Y axis.
     *
     * Default: - None
     *
     * @param leftYAxis Left Y axis. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ea22e824d60340f70a8c7b8af9dca98342321dd5906ff9f481b308e4fe2abe1")
    override fun leftYAxis(leftYAxis: YAxisProps.Builder.() -> Unit): Unit =
        leftYAxis(YAxisProps(leftYAxis))

    /**
     * Position of the legend.
     *
     * Default: - bottom
     *
     * @param legendPosition Position of the legend. 
     */
    override fun legendPosition(legendPosition: LegendPosition) {
      cdkBuilder.legendPosition(legendPosition.let(LegendPosition.Companion::unwrap))
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
     * Metrics to display on left Y axis.
     *
     * Default: - No metrics
     *
     * @param metrics Metrics to display on left Y axis. 
     */
    override fun metrics(metrics: List<IMetric>) {
      cdkBuilder.metrics(metrics.map(IMetric.Companion::unwrap))
    }

    /**
     * Metrics to display on left Y axis.
     *
     * Default: - No metrics
     *
     * @param metrics Metrics to display on left Y axis. 
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

    public fun build(): software.amazon.awscdk.services.cloudwatch.GaugeWidget = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GaugeWidget {
      val builderImpl = BuilderImpl()
      return GaugeWidget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.GaugeWidget):
        GaugeWidget = GaugeWidget(cdkObject)

    internal fun unwrap(wrapped: GaugeWidget):
        software.amazon.awscdk.services.cloudwatch.GaugeWidget = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudwatch.GaugeWidget
  }
}
