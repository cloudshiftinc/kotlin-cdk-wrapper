@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisRadarChartAggregatedFieldWellsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.RadarChartAggregatedFieldWellsProperty.Builder =
      CfnAnalysis.RadarChartAggregatedFieldWellsProperty.builder()

  private val _category: MutableList<Any> = mutableListOf()

  private val _color: MutableList<Any> = mutableListOf()

  private val _values: MutableList<Any> = mutableListOf()

  public fun category(vararg category: Any) {
    _category.addAll(listOf(*category))
  }

  public fun category(category: Collection<Any>) {
    _category.addAll(category)
  }

  public fun category(category: IResolvable) {
    cdkBuilder.category(category)
  }

  public fun color(vararg color: Any) {
    _color.addAll(listOf(*color))
  }

  public fun color(color: Collection<Any>) {
    _color.addAll(color)
  }

  public fun color(color: IResolvable) {
    cdkBuilder.color(color)
  }

  public fun values(vararg values: Any) {
    _values.addAll(listOf(*values))
  }

  public fun values(values: Collection<Any>) {
    _values.addAll(values)
  }

  public fun values(values: IResolvable) {
    cdkBuilder.values(values)
  }

  public fun build(): CfnAnalysis.RadarChartAggregatedFieldWellsProperty {
    if(_category.isNotEmpty()) cdkBuilder.category(_category)
    if(_color.isNotEmpty()) cdkBuilder.color(_color)
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
