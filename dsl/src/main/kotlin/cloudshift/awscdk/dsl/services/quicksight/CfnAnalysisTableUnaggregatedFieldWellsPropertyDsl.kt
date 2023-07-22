@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableUnaggregatedFieldWellsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TableUnaggregatedFieldWellsProperty.Builder =
      CfnAnalysis.TableUnaggregatedFieldWellsProperty.builder()

  private val _values: MutableList<Any> = mutableListOf()

  /**
   * @param values The values field well for a pivot table.
   * Values are unaggregated for an unaggregated table.
   */
  public fun values(vararg values: Any) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The values field well for a pivot table.
   * Values are unaggregated for an unaggregated table.
   */
  public fun values(values: Collection<Any>) {
    _values.addAll(values)
  }

  /**
   * @param values The values field well for a pivot table.
   * Values are unaggregated for an unaggregated table.
   */
  public fun values(values: IResolvable) {
    cdkBuilder.values(values)
  }

  public fun build(): CfnAnalysis.TableUnaggregatedFieldWellsProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
