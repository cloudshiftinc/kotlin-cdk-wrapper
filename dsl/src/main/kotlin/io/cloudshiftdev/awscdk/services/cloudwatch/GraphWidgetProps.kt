package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface GraphWidgetProps : MetricWidgetProps {
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
   * Metrics to display on left Y axis.
   *
   * Default: - No metrics
   */
  public fun left(): List<IMetric> = unwrap(this).getLeft()?.map(IMetric::wrap) ?: emptyList()

  /**
   * Annotations for the left Y axis.
   *
   * Default: - No annotations
   */
  public fun leftAnnotations(): List<HorizontalAnnotation> =
      unwrap(this).getLeftAnnotations()?.map(HorizontalAnnotation::wrap) ?: emptyList()

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
   * The default period for all metrics in this widget.
   *
   * The period is the length of time represented by one data point on the graph.
   * This default can be overridden within each metric definition.
   *
   * Default: cdk.Duration.seconds(300)
   */
  public fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

  /**
   * Metrics to display on right Y axis.
   *
   * Default: - No metrics
   */
  public fun right(): List<IMetric> = unwrap(this).getRight()?.map(IMetric::wrap) ?: emptyList()

  /**
   * Annotations for the right Y axis.
   *
   * Default: - No annotations
   */
  public fun rightAnnotations(): List<HorizontalAnnotation> =
      unwrap(this).getRightAnnotations()?.map(HorizontalAnnotation::wrap) ?: emptyList()

  /**
   * Right Y axis.
   *
   * Default: - None
   */
  public fun rightYAxis(): YAxisProps? = unwrap(this).getRightYAxis()?.let(YAxisProps::wrap)

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
   * Whether the graph should be shown as stacked lines.
   *
   * Default: false
   */
  public fun stacked(): Boolean? = unwrap(this).getStacked()

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
   * Annotations for the X axis.
   *
   * Default: - No annotations
   */
  public fun verticalAnnotations(): List<VerticalAnnotation> =
      unwrap(this).getVerticalAnnotations()?.map(VerticalAnnotation::wrap) ?: emptyList()

  /**
   * Display this metric.
   *
   * Default: TimeSeries
   */
  public fun view(): GraphWidgetView? = unwrap(this).getView()?.let(GraphWidgetView::wrap)

  /**
   * A builder for [GraphWidgetProps]
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
     * @param height Height of the widget.
     */
    public fun height(height: Number)

    /**
     * @param left Metrics to display on left Y axis.
     */
    public fun left(left: List<IMetric>)

    /**
     * @param left Metrics to display on left Y axis.
     */
    public fun left(vararg left: IMetric)

    /**
     * @param leftAnnotations Annotations for the left Y axis.
     */
    public fun leftAnnotations(leftAnnotations: List<HorizontalAnnotation>)

    /**
     * @param leftAnnotations Annotations for the left Y axis.
     */
    public fun leftAnnotations(vararg leftAnnotations: HorizontalAnnotation)

    /**
     * @param leftYAxis Left Y axis.
     */
    public fun leftYAxis(leftYAxis: YAxisProps)

    /**
     * @param leftYAxis Left Y axis.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e84dfccb1c274353d893bc130703bda6986106d638e9111dc7666768835289a7")
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
     * @param right Metrics to display on right Y axis.
     */
    public fun right(right: List<IMetric>)

    /**
     * @param right Metrics to display on right Y axis.
     */
    public fun right(vararg right: IMetric)

    /**
     * @param rightAnnotations Annotations for the right Y axis.
     */
    public fun rightAnnotations(rightAnnotations: List<HorizontalAnnotation>)

    /**
     * @param rightAnnotations Annotations for the right Y axis.
     */
    public fun rightAnnotations(vararg rightAnnotations: HorizontalAnnotation)

    /**
     * @param rightYAxis Right Y axis.
     */
    public fun rightYAxis(rightYAxis: YAxisProps)

    /**
     * @param rightYAxis Right Y axis.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c999ebdf3b6a0aebe290caad08460c69c24858ce9c5601d3cb8880b87e3008b")
    public fun rightYAxis(rightYAxis: YAxisProps.Builder.() -> Unit)

    /**
     * @param stacked Whether the graph should be shown as stacked lines.
     */
    public fun stacked(stacked: Boolean)

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
     * @param verticalAnnotations Annotations for the X axis.
     */
    public fun verticalAnnotations(verticalAnnotations: List<VerticalAnnotation>)

    /**
     * @param verticalAnnotations Annotations for the X axis.
     */
    public fun verticalAnnotations(vararg verticalAnnotations: VerticalAnnotation)

    /**
     * @param view Display this metric.
     */
    public fun view(view: GraphWidgetView)

    /**
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.GraphWidgetProps.builder()

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
     * @param left Metrics to display on left Y axis.
     */
    override fun left(left: List<IMetric>) {
      cdkBuilder.left(left.map(IMetric::unwrap))
    }

    /**
     * @param left Metrics to display on left Y axis.
     */
    override fun left(vararg left: IMetric): Unit = left(left.toList())

    /**
     * @param leftAnnotations Annotations for the left Y axis.
     */
    override fun leftAnnotations(leftAnnotations: List<HorizontalAnnotation>) {
      cdkBuilder.leftAnnotations(leftAnnotations.map(HorizontalAnnotation::unwrap))
    }

    /**
     * @param leftAnnotations Annotations for the left Y axis.
     */
    override fun leftAnnotations(vararg leftAnnotations: HorizontalAnnotation): Unit =
        leftAnnotations(leftAnnotations.toList())

    /**
     * @param leftYAxis Left Y axis.
     */
    override fun leftYAxis(leftYAxis: YAxisProps) {
      cdkBuilder.leftYAxis(leftYAxis.let(YAxisProps::unwrap))
    }

    /**
     * @param leftYAxis Left Y axis.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e84dfccb1c274353d893bc130703bda6986106d638e9111dc7666768835289a7")
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
     * @param right Metrics to display on right Y axis.
     */
    override fun right(right: List<IMetric>) {
      cdkBuilder.right(right.map(IMetric::unwrap))
    }

    /**
     * @param right Metrics to display on right Y axis.
     */
    override fun right(vararg right: IMetric): Unit = right(right.toList())

    /**
     * @param rightAnnotations Annotations for the right Y axis.
     */
    override fun rightAnnotations(rightAnnotations: List<HorizontalAnnotation>) {
      cdkBuilder.rightAnnotations(rightAnnotations.map(HorizontalAnnotation::unwrap))
    }

    /**
     * @param rightAnnotations Annotations for the right Y axis.
     */
    override fun rightAnnotations(vararg rightAnnotations: HorizontalAnnotation): Unit =
        rightAnnotations(rightAnnotations.toList())

    /**
     * @param rightYAxis Right Y axis.
     */
    override fun rightYAxis(rightYAxis: YAxisProps) {
      cdkBuilder.rightYAxis(rightYAxis.let(YAxisProps::unwrap))
    }

    /**
     * @param rightYAxis Right Y axis.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c999ebdf3b6a0aebe290caad08460c69c24858ce9c5601d3cb8880b87e3008b")
    override fun rightYAxis(rightYAxis: YAxisProps.Builder.() -> Unit): Unit =
        rightYAxis(YAxisProps(rightYAxis))

    /**
     * @param stacked Whether the graph should be shown as stacked lines.
     */
    override fun stacked(stacked: Boolean) {
      cdkBuilder.stacked(stacked)
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
     * @param verticalAnnotations Annotations for the X axis.
     */
    override fun verticalAnnotations(verticalAnnotations: List<VerticalAnnotation>) {
      cdkBuilder.verticalAnnotations(verticalAnnotations.map(VerticalAnnotation::unwrap))
    }

    /**
     * @param verticalAnnotations Annotations for the X axis.
     */
    override fun verticalAnnotations(vararg verticalAnnotations: VerticalAnnotation): Unit =
        verticalAnnotations(verticalAnnotations.toList())

    /**
     * @param view Display this metric.
     */
    override fun view(view: GraphWidgetView) {
      cdkBuilder.view(view.let(GraphWidgetView::unwrap))
    }

    /**
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.GraphWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.GraphWidgetProps,
  ) : CdkObject(cdkObject), GraphWidgetProps {
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
     * Metrics to display on left Y axis.
     *
     * Default: - No metrics
     */
    override fun left(): List<IMetric> = unwrap(this).getLeft()?.map(IMetric::wrap) ?: emptyList()

    /**
     * Annotations for the left Y axis.
     *
     * Default: - No annotations
     */
    override fun leftAnnotations(): List<HorizontalAnnotation> =
        unwrap(this).getLeftAnnotations()?.map(HorizontalAnnotation::wrap) ?: emptyList()

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
     * Metrics to display on right Y axis.
     *
     * Default: - No metrics
     */
    override fun right(): List<IMetric> = unwrap(this).getRight()?.map(IMetric::wrap) ?: emptyList()

    /**
     * Annotations for the right Y axis.
     *
     * Default: - No annotations
     */
    override fun rightAnnotations(): List<HorizontalAnnotation> =
        unwrap(this).getRightAnnotations()?.map(HorizontalAnnotation::wrap) ?: emptyList()

    /**
     * Right Y axis.
     *
     * Default: - None
     */
    override fun rightYAxis(): YAxisProps? = unwrap(this).getRightYAxis()?.let(YAxisProps::wrap)

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
     * Whether the graph should be shown as stacked lines.
     *
     * Default: false
     */
    override fun stacked(): Boolean? = unwrap(this).getStacked()

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
     * Annotations for the X axis.
     *
     * Default: - No annotations
     */
    override fun verticalAnnotations(): List<VerticalAnnotation> =
        unwrap(this).getVerticalAnnotations()?.map(VerticalAnnotation::wrap) ?: emptyList()

    /**
     * Display this metric.
     *
     * Default: TimeSeries
     */
    override fun view(): GraphWidgetView? = unwrap(this).getView()?.let(GraphWidgetView::wrap)

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     */
    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GraphWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.GraphWidgetProps):
        GraphWidgetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GraphWidgetProps):
        software.amazon.awscdk.services.cloudwatch.GraphWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.GraphWidgetProps
  }
}
