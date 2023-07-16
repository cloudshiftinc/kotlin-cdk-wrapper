@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.SingleValueWidget

@CdkDslMarker
public class SingleValueWidgetDsl {
  private val cdkBuilder: SingleValueWidget.Builder = SingleValueWidget.Builder.create()

  private val _metrics: MutableList<IMetric> = mutableListOf()

  public fun fullPrecision(fullPrecision: Boolean) {
    cdkBuilder.fullPrecision(fullPrecision)
  }

  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  public fun metrics(vararg metrics: IMetric) {
    _metrics.addAll(listOf(*metrics))
  }

  public fun metrics(metrics: Collection<IMetric>) {
    _metrics.addAll(metrics)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun setPeriodToTimeRange(setPeriodToTimeRange: Boolean) {
    cdkBuilder.setPeriodToTimeRange(setPeriodToTimeRange)
  }

  public fun sparkline(sparkline: Boolean) {
    cdkBuilder.sparkline(sparkline)
  }

  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun width(width: Number) {
    cdkBuilder.width(width)
  }

  public fun build(): SingleValueWidget {
    if(_metrics.isNotEmpty()) cdkBuilder.metrics(_metrics)
    return cdkBuilder.build()
  }
}
