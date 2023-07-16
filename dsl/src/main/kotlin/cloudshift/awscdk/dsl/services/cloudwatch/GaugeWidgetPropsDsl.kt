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
import software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps
import software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.LegendPosition
import software.amazon.awscdk.services.cloudwatch.YAxisProps

@CdkDslMarker
public class GaugeWidgetPropsDsl {
  private val cdkBuilder: GaugeWidgetProps.Builder = GaugeWidgetProps.builder()

  private val _annotations: MutableList<HorizontalAnnotation> = mutableListOf()

  private val _metrics: MutableList<IMetric> = mutableListOf()

  public fun annotations(annotations: HorizontalAnnotationDsl.() -> Unit) {
    _annotations.add(HorizontalAnnotationDsl().apply(annotations).build())
  }

  public fun annotations(annotations: Collection<HorizontalAnnotation>) {
    _annotations.addAll(annotations)
  }

  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  public fun leftYAxis(block: YAxisPropsDsl.() -> Unit = {}) {
    val builder = YAxisPropsDsl()
    builder.apply(block)
    cdkBuilder.leftYAxis(builder.build())
  }

  public fun leftYAxis(leftYAxis: YAxisProps) {
    cdkBuilder.leftYAxis(leftYAxis)
  }

  public fun legendPosition(legendPosition: LegendPosition) {
    cdkBuilder.legendPosition(legendPosition)
  }

  public fun liveData(liveData: Boolean) {
    cdkBuilder.liveData(liveData)
  }

  public fun metrics(vararg metrics: IMetric) {
    _metrics.addAll(listOf(*metrics))
  }

  public fun metrics(metrics: Collection<IMetric>) {
    _metrics.addAll(metrics)
  }

  public fun period(period: Duration) {
    cdkBuilder.period(period)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun setPeriodToTimeRange(setPeriodToTimeRange: Boolean) {
    cdkBuilder.setPeriodToTimeRange(setPeriodToTimeRange)
  }

  public fun statistic(statistic: String) {
    cdkBuilder.statistic(statistic)
  }

  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun width(width: Number) {
    cdkBuilder.width(width)
  }

  public fun build(): GaugeWidgetProps {
    if(_annotations.isNotEmpty()) cdkBuilder.annotations(_annotations)
    if(_metrics.isNotEmpty()) cdkBuilder.metrics(_metrics)
    return cdkBuilder.build()
  }
}
