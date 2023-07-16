@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@CdkDslMarker
public class CfnModelCardMetricDataItemsPropertyDsl {
  private val cdkBuilder: CfnModelCard.MetricDataItemsProperty.Builder =
      CfnModelCard.MetricDataItemsProperty.builder()

  private val _xAxisName: MutableList<String> = mutableListOf()

  private val _yAxisName: MutableList<String> = mutableListOf()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun notes(notes: String) {
    cdkBuilder.notes(notes)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun `value`(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.`value`(builder.map)
  }

  public fun `value`(`value`: Any) {
    cdkBuilder.`value`(`value`)
  }

  public fun xAxisName(vararg xAxisName: String) {
    _xAxisName.addAll(listOf(*xAxisName))
  }

  public fun xAxisName(xAxisName: Collection<String>) {
    _xAxisName.addAll(xAxisName)
  }

  public fun yAxisName(vararg yAxisName: String) {
    _yAxisName.addAll(listOf(*yAxisName))
  }

  public fun yAxisName(yAxisName: Collection<String>) {
    _yAxisName.addAll(yAxisName)
  }

  public fun build(): CfnModelCard.MetricDataItemsProperty {
    if(_xAxisName.isNotEmpty()) cdkBuilder.xAxisName(_xAxisName)
    if(_yAxisName.isNotEmpty()) cdkBuilder.yAxisName(_yAxisName)
    return cdkBuilder.build()
  }
}
