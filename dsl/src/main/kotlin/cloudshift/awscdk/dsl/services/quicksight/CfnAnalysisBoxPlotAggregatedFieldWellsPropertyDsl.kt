@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisBoxPlotAggregatedFieldWellsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.BoxPlotAggregatedFieldWellsProperty.Builder =
      CfnAnalysis.BoxPlotAggregatedFieldWellsProperty.builder()

  private val _groupBy: MutableList<Any> = mutableListOf()

  private val _values: MutableList<Any> = mutableListOf()

  /**
   * @param groupBy The group by field well of a box plot chart.
   * Values are grouped based on group by fields.
   */
  public fun groupBy(vararg groupBy: Any) {
    _groupBy.addAll(listOf(*groupBy))
  }

  /**
   * @param groupBy The group by field well of a box plot chart.
   * Values are grouped based on group by fields.
   */
  public fun groupBy(groupBy: Collection<Any>) {
    _groupBy.addAll(groupBy)
  }

  /**
   * @param groupBy The group by field well of a box plot chart.
   * Values are grouped based on group by fields.
   */
  public fun groupBy(groupBy: IResolvable) {
    cdkBuilder.groupBy(groupBy)
  }

  /**
   * @param values The value field well of a box plot chart.
   * Values are aggregated based on group by fields.
   */
  public fun values(vararg values: Any) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The value field well of a box plot chart.
   * Values are aggregated based on group by fields.
   */
  public fun values(values: Collection<Any>) {
    _values.addAll(values)
  }

  /**
   * @param values The value field well of a box plot chart.
   * Values are aggregated based on group by fields.
   */
  public fun values(values: IResolvable) {
    cdkBuilder.values(values)
  }

  public fun build(): CfnAnalysis.BoxPlotAggregatedFieldWellsProperty {
    if(_groupBy.isNotEmpty()) cdkBuilder.groupBy(_groupBy)
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
