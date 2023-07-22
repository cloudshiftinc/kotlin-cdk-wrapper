@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisHistogramAggregatedFieldWellsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.HistogramAggregatedFieldWellsProperty.Builder =
      CfnAnalysis.HistogramAggregatedFieldWellsProperty.builder()

  private val _values: MutableList<Any> = mutableListOf()

  /**
   * @param values The value field wells of a histogram.
   * Values are aggregated by `COUNT` or `DISTINCT_COUNT` .
   */
  public fun values(vararg values: Any) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The value field wells of a histogram.
   * Values are aggregated by `COUNT` or `DISTINCT_COUNT` .
   */
  public fun values(values: Collection<Any>) {
    _values.addAll(values)
  }

  /**
   * @param values The value field wells of a histogram.
   * Values are aggregated by `COUNT` or `DISTINCT_COUNT` .
   */
  public fun values(values: IResolvable) {
    cdkBuilder.values(values)
  }

  public fun build(): CfnAnalysis.HistogramAggregatedFieldWellsProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
