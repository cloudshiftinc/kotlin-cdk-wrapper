@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisComboChartAggregatedFieldWellsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ComboChartAggregatedFieldWellsProperty.Builder =
      CfnAnalysis.ComboChartAggregatedFieldWellsProperty.builder()

  private val _barValues: MutableList<Any> = mutableListOf()

  private val _category: MutableList<Any> = mutableListOf()

  private val _colors: MutableList<Any> = mutableListOf()

  private val _lineValues: MutableList<Any> = mutableListOf()

  public fun barValues(vararg barValues: Any) {
    _barValues.addAll(listOf(*barValues))
  }

  public fun barValues(barValues: Collection<Any>) {
    _barValues.addAll(barValues)
  }

  public fun barValues(barValues: IResolvable) {
    cdkBuilder.barValues(barValues)
  }

  public fun category(vararg category: Any) {
    _category.addAll(listOf(*category))
  }

  public fun category(category: Collection<Any>) {
    _category.addAll(category)
  }

  public fun category(category: IResolvable) {
    cdkBuilder.category(category)
  }

  public fun colors(vararg colors: Any) {
    _colors.addAll(listOf(*colors))
  }

  public fun colors(colors: Collection<Any>) {
    _colors.addAll(colors)
  }

  public fun colors(colors: IResolvable) {
    cdkBuilder.colors(colors)
  }

  public fun lineValues(vararg lineValues: Any) {
    _lineValues.addAll(listOf(*lineValues))
  }

  public fun lineValues(lineValues: Collection<Any>) {
    _lineValues.addAll(lineValues)
  }

  public fun lineValues(lineValues: IResolvable) {
    cdkBuilder.lineValues(lineValues)
  }

  public fun build(): CfnAnalysis.ComboChartAggregatedFieldWellsProperty {
    if(_barValues.isNotEmpty()) cdkBuilder.barValues(_barValues)
    if(_category.isNotEmpty()) cdkBuilder.category(_category)
    if(_colors.isNotEmpty()) cdkBuilder.colors(_colors)
    if(_lineValues.isNotEmpty()) cdkBuilder.lineValues(_lineValues)
    return cdkBuilder.build()
  }
}
