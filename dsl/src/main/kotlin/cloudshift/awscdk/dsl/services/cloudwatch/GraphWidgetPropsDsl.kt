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
import software.amazon.awscdk.services.cloudwatch.GraphWidgetProps
import software.amazon.awscdk.services.cloudwatch.GraphWidgetView
import software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.LegendPosition
import software.amazon.awscdk.services.cloudwatch.YAxisProps

@CdkDslMarker
public class GraphWidgetPropsDsl {
  private val cdkBuilder: GraphWidgetProps.Builder = GraphWidgetProps.builder()

  private val _left: MutableList<IMetric> = mutableListOf()

  private val _leftAnnotations: MutableList<HorizontalAnnotation> = mutableListOf()

  private val _right: MutableList<IMetric> = mutableListOf()

  private val _rightAnnotations: MutableList<HorizontalAnnotation> = mutableListOf()

  /**
   * @param height Height of the widget.
   */
  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  /**
   * @param left Metrics to display on left Y axis.
   */
  public fun left(vararg left: IMetric) {
    _left.addAll(listOf(*left))
  }

  /**
   * @param left Metrics to display on left Y axis.
   */
  public fun left(left: Collection<IMetric>) {
    _left.addAll(left)
  }

  /**
   * @param leftAnnotations Annotations for the left Y axis.
   */
  public fun leftAnnotations(leftAnnotations: HorizontalAnnotationDsl.() -> Unit) {
    _leftAnnotations.add(HorizontalAnnotationDsl().apply(leftAnnotations).build())
  }

  /**
   * @param leftAnnotations Annotations for the left Y axis.
   */
  public fun leftAnnotations(leftAnnotations: Collection<HorizontalAnnotation>) {
    _leftAnnotations.addAll(leftAnnotations)
  }

  /**
   * @param leftYAxis Left Y axis.
   */
  public fun leftYAxis(leftYAxis: YAxisPropsDsl.() -> Unit = {}) {
    val builder = YAxisPropsDsl()
    builder.apply(leftYAxis)
    cdkBuilder.leftYAxis(builder.build())
  }

  /**
   * @param leftYAxis Left Y axis.
   */
  public fun leftYAxis(leftYAxis: YAxisProps) {
    cdkBuilder.leftYAxis(leftYAxis)
  }

  /**
   * @param legendPosition Position of the legend.
   */
  public fun legendPosition(legendPosition: LegendPosition) {
    cdkBuilder.legendPosition(legendPosition)
  }

  /**
   * @param liveData Whether the graph should show live data.
   */
  public fun liveData(liveData: Boolean) {
    cdkBuilder.liveData(liveData)
  }

  /**
   * @param period The default period for all metrics in this widget.
   * The period is the length of time represented by one data point on the graph.
   * This default can be overridden within each metric definition.
   */
  public fun period(period: Duration) {
    cdkBuilder.period(period)
  }

  /**
   * @param region The region the metrics of this graph should be taken from.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param right Metrics to display on right Y axis.
   */
  public fun right(vararg right: IMetric) {
    _right.addAll(listOf(*right))
  }

  /**
   * @param right Metrics to display on right Y axis.
   */
  public fun right(right: Collection<IMetric>) {
    _right.addAll(right)
  }

  /**
   * @param rightAnnotations Annotations for the right Y axis.
   */
  public fun rightAnnotations(rightAnnotations: HorizontalAnnotationDsl.() -> Unit) {
    _rightAnnotations.add(HorizontalAnnotationDsl().apply(rightAnnotations).build())
  }

  /**
   * @param rightAnnotations Annotations for the right Y axis.
   */
  public fun rightAnnotations(rightAnnotations: Collection<HorizontalAnnotation>) {
    _rightAnnotations.addAll(rightAnnotations)
  }

  /**
   * @param rightYAxis Right Y axis.
   */
  public fun rightYAxis(rightYAxis: YAxisPropsDsl.() -> Unit = {}) {
    val builder = YAxisPropsDsl()
    builder.apply(rightYAxis)
    cdkBuilder.rightYAxis(builder.build())
  }

  /**
   * @param rightYAxis Right Y axis.
   */
  public fun rightYAxis(rightYAxis: YAxisProps) {
    cdkBuilder.rightYAxis(rightYAxis)
  }

  /**
   * @param setPeriodToTimeRange Whether to show the value from the entire time range. Only
   * applicable for Bar and Pie charts.
   * If false, values will be from the most recent period of your chosen time range;
   * if true, shows the value from the entire time range.
   */
  public fun setPeriodToTimeRange(setPeriodToTimeRange: Boolean) {
    cdkBuilder.setPeriodToTimeRange(setPeriodToTimeRange)
  }

  /**
   * @param stacked Whether the graph should be shown as stacked lines.
   */
  public fun stacked(stacked: Boolean) {
    cdkBuilder.stacked(stacked)
  }

  /**
   * @param statistic The default statistic to be displayed for each metric.
   * This default can be overridden within the definition of each individual metric
   */
  public fun statistic(statistic: String) {
    cdkBuilder.statistic(statistic)
  }

  /**
   * @param title Title for the graph.
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  /**
   * @param view Display this metric.
   */
  public fun view(view: GraphWidgetView) {
    cdkBuilder.view(view)
  }

  /**
   * @param width Width of the widget, in a grid of 24 units wide.
   */
  public fun width(width: Number) {
    cdkBuilder.width(width)
  }

  public fun build(): GraphWidgetProps {
    if(_left.isNotEmpty()) cdkBuilder.left(_left)
    if(_leftAnnotations.isNotEmpty()) cdkBuilder.leftAnnotations(_leftAnnotations)
    if(_right.isNotEmpty()) cdkBuilder.right(_right)
    if(_rightAnnotations.isNotEmpty()) cdkBuilder.rightAnnotations(_rightAnnotations)
    return cdkBuilder.build()
  }
}
