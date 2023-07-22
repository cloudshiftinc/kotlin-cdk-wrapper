@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisScatterPlotUnaggregatedFieldWellsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ScatterPlotUnaggregatedFieldWellsProperty.Builder =
      CfnAnalysis.ScatterPlotUnaggregatedFieldWellsProperty.builder()

  private val _category: MutableList<Any> = mutableListOf()

  private val _label: MutableList<Any> = mutableListOf()

  private val _size: MutableList<Any> = mutableListOf()

  private val _xAxis: MutableList<Any> = mutableListOf()

  private val _yAxis: MutableList<Any> = mutableListOf()

  /**
   * @param category The category field well of a scatter plot.
   */
  public fun category(vararg category: Any) {
    _category.addAll(listOf(*category))
  }

  /**
   * @param category The category field well of a scatter plot.
   */
  public fun category(category: Collection<Any>) {
    _category.addAll(category)
  }

  /**
   * @param category The category field well of a scatter plot.
   */
  public fun category(category: IResolvable) {
    cdkBuilder.category(category)
  }

  /**
   * @param label The label field well of a scatter plot.
   */
  public fun label(vararg label: Any) {
    _label.addAll(listOf(*label))
  }

  /**
   * @param label The label field well of a scatter plot.
   */
  public fun label(label: Collection<Any>) {
    _label.addAll(label)
  }

  /**
   * @param label The label field well of a scatter plot.
   */
  public fun label(label: IResolvable) {
    cdkBuilder.label(label)
  }

  /**
   * @param size The size field well of a scatter plot.
   */
  public fun size(vararg size: Any) {
    _size.addAll(listOf(*size))
  }

  /**
   * @param size The size field well of a scatter plot.
   */
  public fun size(size: Collection<Any>) {
    _size.addAll(size)
  }

  /**
   * @param size The size field well of a scatter plot.
   */
  public fun size(size: IResolvable) {
    cdkBuilder.size(size)
  }

  /**
   * @param xAxis The x-axis field well of a scatter plot.
   * The x-axis is a dimension field and cannot be aggregated.
   */
  public fun xAxis(vararg xAxis: Any) {
    _xAxis.addAll(listOf(*xAxis))
  }

  /**
   * @param xAxis The x-axis field well of a scatter plot.
   * The x-axis is a dimension field and cannot be aggregated.
   */
  public fun xAxis(xAxis: Collection<Any>) {
    _xAxis.addAll(xAxis)
  }

  /**
   * @param xAxis The x-axis field well of a scatter plot.
   * The x-axis is a dimension field and cannot be aggregated.
   */
  public fun xAxis(xAxis: IResolvable) {
    cdkBuilder.xAxis(xAxis)
  }

  /**
   * @param yAxis The y-axis field well of a scatter plot.
   * The y-axis is a dimension field and cannot be aggregated.
   */
  public fun yAxis(vararg yAxis: Any) {
    _yAxis.addAll(listOf(*yAxis))
  }

  /**
   * @param yAxis The y-axis field well of a scatter plot.
   * The y-axis is a dimension field and cannot be aggregated.
   */
  public fun yAxis(yAxis: Collection<Any>) {
    _yAxis.addAll(yAxis)
  }

  /**
   * @param yAxis The y-axis field well of a scatter plot.
   * The y-axis is a dimension field and cannot be aggregated.
   */
  public fun yAxis(yAxis: IResolvable) {
    cdkBuilder.yAxis(yAxis)
  }

  public fun build(): CfnAnalysis.ScatterPlotUnaggregatedFieldWellsProperty {
    if(_category.isNotEmpty()) cdkBuilder.category(_category)
    if(_label.isNotEmpty()) cdkBuilder.label(_label)
    if(_size.isNotEmpty()) cdkBuilder.size(_size)
    if(_xAxis.isNotEmpty()) cdkBuilder.xAxis(_xAxis)
    if(_yAxis.isNotEmpty()) cdkBuilder.yAxis(_yAxis)
    return cdkBuilder.build()
  }
}
