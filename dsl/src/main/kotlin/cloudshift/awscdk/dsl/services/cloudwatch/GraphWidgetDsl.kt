@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.GraphWidget
import software.amazon.awscdk.services.cloudwatch.GraphWidgetView
import software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.LegendPosition
import software.amazon.awscdk.services.cloudwatch.YAxisProps

@CdkDslMarker
public class GraphWidgetDsl {
  private val cdkBuilder: GraphWidget.Builder = GraphWidget.Builder.create()

  private val _left: MutableList<IMetric> = mutableListOf()

  private val _leftAnnotations: MutableList<HorizontalAnnotation> = mutableListOf()

  private val _right: MutableList<IMetric> = mutableListOf()

  private val _rightAnnotations: MutableList<HorizontalAnnotation> = mutableListOf()

  /**
   * Height of the widget.
   *
   * Default: - 6 for Alarm and Graph widgets.
   * 3 for single value widgets where most recent value of a metric is displayed.
   *
   * @param height Height of the widget. 
   */
  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  /**
   * Metrics to display on left Y axis.
   *
   * Default: - No metrics
   *
   * @param left Metrics to display on left Y axis. 
   */
  public fun left(vararg left: IMetric) {
    _left.addAll(listOf(*left))
  }

  /**
   * Metrics to display on left Y axis.
   *
   * Default: - No metrics
   *
   * @param left Metrics to display on left Y axis. 
   */
  public fun left(left: Collection<IMetric>) {
    _left.addAll(left)
  }

  /**
   * Annotations for the left Y axis.
   *
   * Default: - No annotations
   *
   * @param leftAnnotations Annotations for the left Y axis. 
   */
  public fun leftAnnotations(leftAnnotations: HorizontalAnnotationDsl.() -> Unit) {
    _leftAnnotations.add(HorizontalAnnotationDsl().apply(leftAnnotations).build())
  }

  /**
   * Annotations for the left Y axis.
   *
   * Default: - No annotations
   *
   * @param leftAnnotations Annotations for the left Y axis. 
   */
  public fun leftAnnotations(leftAnnotations: Collection<HorizontalAnnotation>) {
    _leftAnnotations.addAll(leftAnnotations)
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
   * The default period for all metrics in this widget.
   *
   * The period is the length of time represented by one data point on the graph.
   * This default can be overridden within each metric definition.
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
   * Metrics to display on right Y axis.
   *
   * Default: - No metrics
   *
   * @param right Metrics to display on right Y axis. 
   */
  public fun right(vararg right: IMetric) {
    _right.addAll(listOf(*right))
  }

  /**
   * Metrics to display on right Y axis.
   *
   * Default: - No metrics
   *
   * @param right Metrics to display on right Y axis. 
   */
  public fun right(right: Collection<IMetric>) {
    _right.addAll(right)
  }

  /**
   * Annotations for the right Y axis.
   *
   * Default: - No annotations
   *
   * @param rightAnnotations Annotations for the right Y axis. 
   */
  public fun rightAnnotations(rightAnnotations: HorizontalAnnotationDsl.() -> Unit) {
    _rightAnnotations.add(HorizontalAnnotationDsl().apply(rightAnnotations).build())
  }

  /**
   * Annotations for the right Y axis.
   *
   * Default: - No annotations
   *
   * @param rightAnnotations Annotations for the right Y axis. 
   */
  public fun rightAnnotations(rightAnnotations: Collection<HorizontalAnnotation>) {
    _rightAnnotations.addAll(rightAnnotations)
  }

  /**
   * Right Y axis.
   *
   * Default: - None
   *
   * @param rightYAxis Right Y axis. 
   */
  public fun rightYAxis(rightYAxis: YAxisPropsDsl.() -> Unit = {}) {
    val builder = YAxisPropsDsl()
    builder.apply(rightYAxis)
    cdkBuilder.rightYAxis(builder.build())
  }

  /**
   * Right Y axis.
   *
   * Default: - None
   *
   * @param rightYAxis Right Y axis. 
   */
  public fun rightYAxis(rightYAxis: YAxisProps) {
    cdkBuilder.rightYAxis(rightYAxis)
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
  public fun setPeriodToTimeRange(setPeriodToTimeRange: Boolean) {
    cdkBuilder.setPeriodToTimeRange(setPeriodToTimeRange)
  }

  /**
   * Whether the graph should be shown as stacked lines.
   *
   * Default: false
   *
   * @param stacked Whether the graph should be shown as stacked lines. 
   */
  public fun stacked(stacked: Boolean) {
    cdkBuilder.stacked(stacked)
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
   * Display this metric.
   *
   * Default: TimeSeries
   *
   * @param view Display this metric. 
   */
  public fun view(view: GraphWidgetView) {
    cdkBuilder.view(view)
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

  public fun build(): GraphWidget {
    if(_left.isNotEmpty()) cdkBuilder.left(_left)
    if(_leftAnnotations.isNotEmpty()) cdkBuilder.leftAnnotations(_leftAnnotations)
    if(_right.isNotEmpty()) cdkBuilder.right(_right)
    if(_rightAnnotations.isNotEmpty()) cdkBuilder.rightAnnotations(_rightAnnotations)
    return cdkBuilder.build()
  }
}
