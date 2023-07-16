@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisWaterfallChartAggregatedFieldWellsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.WaterfallChartAggregatedFieldWellsProperty.Builder =
      CfnAnalysis.WaterfallChartAggregatedFieldWellsProperty.builder()

  private val _breakdowns: MutableList<Any> = mutableListOf()

  private val _categories: MutableList<Any> = mutableListOf()

  private val _values: MutableList<Any> = mutableListOf()

  public fun breakdowns(vararg breakdowns: Any) {
    _breakdowns.addAll(listOf(*breakdowns))
  }

  public fun breakdowns(breakdowns: Collection<Any>) {
    _breakdowns.addAll(breakdowns)
  }

  public fun breakdowns(breakdowns: IResolvable) {
    cdkBuilder.breakdowns(breakdowns)
  }

  public fun categories(vararg categories: Any) {
    _categories.addAll(listOf(*categories))
  }

  public fun categories(categories: Collection<Any>) {
    _categories.addAll(categories)
  }

  public fun categories(categories: IResolvable) {
    cdkBuilder.categories(categories)
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

  public fun build(): CfnAnalysis.WaterfallChartAggregatedFieldWellsProperty {
    if(_breakdowns.isNotEmpty()) cdkBuilder.breakdowns(_breakdowns)
    if(_categories.isNotEmpty()) cdkBuilder.categories(_categories)
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
