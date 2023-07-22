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

  /**
   * @param name The names of the metrics. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param notes Any notes to add to the metric.
   */
  public fun notes(notes: String) {
    cdkBuilder.notes(notes)
  }

  /**
   * @param type You must specify one of the following data types:. 
   * * Bar Chart `bar_char`
   * * Boolean `boolean`
   * * Linear Graph `linear_graph`
   * * Matrix `matrix`
   * * Number `number`
   * * String `string`
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param value The datatype of the metric. 
   * The metric's *value* must be compatible with the metric's *type* .
   */
  public fun `value`(`value`: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(`value`)
    cdkBuilder.`value`(builder.map)
  }

  /**
   * @param value The datatype of the metric. 
   * The metric's *value* must be compatible with the metric's *type* .
   */
  public fun `value`(`value`: Any) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param xAxisName The name of the x axis.
   */
  public fun xAxisName(vararg xAxisName: String) {
    _xAxisName.addAll(listOf(*xAxisName))
  }

  /**
   * @param xAxisName The name of the x axis.
   */
  public fun xAxisName(xAxisName: Collection<String>) {
    _xAxisName.addAll(xAxisName)
  }

  /**
   * @param yAxisName The name of the y axis.
   */
  public fun yAxisName(vararg yAxisName: String) {
    _yAxisName.addAll(listOf(*yAxisName))
  }

  /**
   * @param yAxisName The name of the y axis.
   */
  public fun yAxisName(yAxisName: Collection<String>) {
    _yAxisName.addAll(yAxisName)
  }

  public fun build(): CfnModelCard.MetricDataItemsProperty {
    if(_xAxisName.isNotEmpty()) cdkBuilder.xAxisName(_xAxisName)
    if(_yAxisName.isNotEmpty()) cdkBuilder.yAxisName(_yAxisName)
    return cdkBuilder.build()
  }
}
