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
 * dashboard.addWidgets(GraphWidget.Builder.create()
 * // ...
 * .legendPosition(LegendPosition.RIGHT)
 * .build());
 * ```
 */
public open class GraphWidget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.GraphWidget,
) : ConcreteWidget(cdkObject) {
  /**
   * Add another metric to the left Y axis of the GraphWidget.
   *
   * @param metric the metric to add. 
   */
  public open fun addLeftMetric(metric: IMetric) {
    unwrap(this).addLeftMetric(metric.let(IMetric::unwrap))
  }

  /**
   * Add another metric to the right Y axis of the GraphWidget.
   *
   * @param metric the metric to add. 
   */
  public open fun addRightMetric(metric: IMetric) {
    unwrap(this).addRightMetric(metric.let(IMetric::unwrap))
  }

  /**
   * Return the widget JSON for use in the dashboard.
   */
  public override fun toJson(): List<Any> = unwrap(this).toJson()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.GraphWidget].
   */
  @CdkDslMarker
  public interface Builder {
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
     * Metrics to display on left Y axis.
     *
     * Default: - No metrics
     *
     * @param left Metrics to display on left Y axis. 
     */
    public fun left(left: List<IMetric>)

    /**
     * Metrics to display on left Y axis.
     *
     * Default: - No metrics
     *
     * @param left Metrics to display on left Y axis. 
     */
    public fun left(vararg left: IMetric)

    /**
     * Annotations for the left Y axis.
     *
     * Default: - No annotations
     *
     * @param leftAnnotations Annotations for the left Y axis. 
     */
    public fun leftAnnotations(leftAnnotations: List<HorizontalAnnotation>)

    /**
     * Annotations for the left Y axis.
     *
     * Default: - No annotations
     *
     * @param leftAnnotations Annotations for the left Y axis. 
     */
    public fun leftAnnotations(vararg leftAnnotations: HorizontalAnnotation)

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
    @JvmName("de98d0f558956685b3826a295ae66d1a1fb7ed3966fdfee85417fb1fc772a647")
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
     * Metrics to display on right Y axis.
     *
     * Default: - No metrics
     *
     * @param right Metrics to display on right Y axis. 
     */
    public fun right(right: List<IMetric>)

    /**
     * Metrics to display on right Y axis.
     *
     * Default: - No metrics
     *
     * @param right Metrics to display on right Y axis. 
     */
    public fun right(vararg right: IMetric)

    /**
     * Annotations for the right Y axis.
     *
     * Default: - No annotations
     *
     * @param rightAnnotations Annotations for the right Y axis. 
     */
    public fun rightAnnotations(rightAnnotations: List<HorizontalAnnotation>)

    /**
     * Annotations for the right Y axis.
     *
     * Default: - No annotations
     *
     * @param rightAnnotations Annotations for the right Y axis. 
     */
    public fun rightAnnotations(vararg rightAnnotations: HorizontalAnnotation)

    /**
     * Right Y axis.
     *
     * Default: - None
     *
     * @param rightYAxis Right Y axis. 
     */
    public fun rightYAxis(rightYAxis: YAxisProps)

    /**
     * Right Y axis.
     *
     * Default: - None
     *
     * @param rightYAxis Right Y axis. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4295955974761de35843a74a556d469a3ef060f5547b581339c5e4d9e3c62e7")
    public fun rightYAxis(rightYAxis: YAxisProps.Builder.() -> Unit)

    /**
     * Whether the graph should be shown as stacked lines.
     *
     * Default: false
     *
     * @param stacked Whether the graph should be shown as stacked lines. 
     */
    public fun stacked(stacked: Boolean)

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
     * Annotations for the X axis.
     *
     * Default: - No annotations
     *
     * @param verticalAnnotations Annotations for the X axis. 
     */
    public fun verticalAnnotations(verticalAnnotations: List<VerticalAnnotation>)

    /**
     * Annotations for the X axis.
     *
     * Default: - No annotations
     *
     * @param verticalAnnotations Annotations for the X axis. 
     */
    public fun verticalAnnotations(vararg verticalAnnotations: VerticalAnnotation)

    /**
     * Display this metric.
     *
     * Default: TimeSeries
     *
     * @param view Display this metric. 
     */
    public fun view(view: GraphWidgetView)

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
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.GraphWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.GraphWidget.Builder.create()

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
     * Metrics to display on left Y axis.
     *
     * Default: - No metrics
     *
     * @param left Metrics to display on left Y axis. 
     */
    override fun left(left: List<IMetric>) {
      cdkBuilder.left(left.map(IMetric::unwrap))
    }

    /**
     * Metrics to display on left Y axis.
     *
     * Default: - No metrics
     *
     * @param left Metrics to display on left Y axis. 
     */
    override fun left(vararg left: IMetric): Unit = left(left.toList())

    /**
     * Annotations for the left Y axis.
     *
     * Default: - No annotations
     *
     * @param leftAnnotations Annotations for the left Y axis. 
     */
    override fun leftAnnotations(leftAnnotations: List<HorizontalAnnotation>) {
      cdkBuilder.leftAnnotations(leftAnnotations.map(HorizontalAnnotation::unwrap))
    }

    /**
     * Annotations for the left Y axis.
     *
     * Default: - No annotations
     *
     * @param leftAnnotations Annotations for the left Y axis. 
     */
    override fun leftAnnotations(vararg leftAnnotations: HorizontalAnnotation): Unit =
        leftAnnotations(leftAnnotations.toList())

    /**
     * Left Y axis.
     *
     * Default: - None
     *
     * @param leftYAxis Left Y axis. 
     */
    override fun leftYAxis(leftYAxis: YAxisProps) {
      cdkBuilder.leftYAxis(leftYAxis.let(YAxisProps::unwrap))
    }

    /**
     * Left Y axis.
     *
     * Default: - None
     *
     * @param leftYAxis Left Y axis. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de98d0f558956685b3826a295ae66d1a1fb7ed3966fdfee85417fb1fc772a647")
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
      cdkBuilder.legendPosition(legendPosition.let(LegendPosition::unwrap))
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
      cdkBuilder.period(period.let(Duration::unwrap))
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
     * Metrics to display on right Y axis.
     *
     * Default: - No metrics
     *
     * @param right Metrics to display on right Y axis. 
     */
    override fun right(right: List<IMetric>) {
      cdkBuilder.right(right.map(IMetric::unwrap))
    }

    /**
     * Metrics to display on right Y axis.
     *
     * Default: - No metrics
     *
     * @param right Metrics to display on right Y axis. 
     */
    override fun right(vararg right: IMetric): Unit = right(right.toList())

    /**
     * Annotations for the right Y axis.
     *
     * Default: - No annotations
     *
     * @param rightAnnotations Annotations for the right Y axis. 
     */
    override fun rightAnnotations(rightAnnotations: List<HorizontalAnnotation>) {
      cdkBuilder.rightAnnotations(rightAnnotations.map(HorizontalAnnotation::unwrap))
    }

    /**
     * Annotations for the right Y axis.
     *
     * Default: - No annotations
     *
     * @param rightAnnotations Annotations for the right Y axis. 
     */
    override fun rightAnnotations(vararg rightAnnotations: HorizontalAnnotation): Unit =
        rightAnnotations(rightAnnotations.toList())

    /**
     * Right Y axis.
     *
     * Default: - None
     *
     * @param rightYAxis Right Y axis. 
     */
    override fun rightYAxis(rightYAxis: YAxisProps) {
      cdkBuilder.rightYAxis(rightYAxis.let(YAxisProps::unwrap))
    }

    /**
     * Right Y axis.
     *
     * Default: - None
     *
     * @param rightYAxis Right Y axis. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4295955974761de35843a74a556d469a3ef060f5547b581339c5e4d9e3c62e7")
    override fun rightYAxis(rightYAxis: YAxisProps.Builder.() -> Unit): Unit =
        rightYAxis(YAxisProps(rightYAxis))

    /**
     * Whether the graph should be shown as stacked lines.
     *
     * Default: false
     *
     * @param stacked Whether the graph should be shown as stacked lines. 
     */
    override fun stacked(stacked: Boolean) {
      cdkBuilder.stacked(stacked)
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
     * Annotations for the X axis.
     *
     * Default: - No annotations
     *
     * @param verticalAnnotations Annotations for the X axis. 
     */
    override fun verticalAnnotations(verticalAnnotations: List<VerticalAnnotation>) {
      cdkBuilder.verticalAnnotations(verticalAnnotations.map(VerticalAnnotation::unwrap))
    }

    /**
     * Annotations for the X axis.
     *
     * Default: - No annotations
     *
     * @param verticalAnnotations Annotations for the X axis. 
     */
    override fun verticalAnnotations(vararg verticalAnnotations: VerticalAnnotation): Unit =
        verticalAnnotations(verticalAnnotations.toList())

    /**
     * Display this metric.
     *
     * Default: TimeSeries
     *
     * @param view Display this metric. 
     */
    override fun view(view: GraphWidgetView) {
      cdkBuilder.view(view.let(GraphWidgetView::unwrap))
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

    public fun build(): software.amazon.awscdk.services.cloudwatch.GraphWidget = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GraphWidget {
      val builderImpl = BuilderImpl()
      return GraphWidget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.GraphWidget):
        GraphWidget = GraphWidget(cdkObject)

    internal fun unwrap(wrapped: GraphWidget):
        software.amazon.awscdk.services.cloudwatch.GraphWidget = wrapped.cdkObject
  }
}
