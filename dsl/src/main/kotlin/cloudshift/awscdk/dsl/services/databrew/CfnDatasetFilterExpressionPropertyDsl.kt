@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset

@CdkDslMarker
public class CfnDatasetFilterExpressionPropertyDsl {
  private val cdkBuilder: CfnDataset.FilterExpressionProperty.Builder =
      CfnDataset.FilterExpressionProperty.builder()

  private val _valuesMap: MutableList<Any> = mutableListOf()

  /**
   * @param expression The expression which includes condition names followed by substitution
   * variables, possibly grouped and combined with other conditions. 
   * For example, "(starts_with :prefix1 or starts_with :prefix2) and (ends_with :suffix1 or
   * ends_with :suffix2)". Substitution variables should start with ':' symbol.
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  /**
   * @param valuesMap The map of substitution variable names to their values used in this filter
   * expression. 
   */
  public fun valuesMap(vararg valuesMap: Any) {
    _valuesMap.addAll(listOf(*valuesMap))
  }

  /**
   * @param valuesMap The map of substitution variable names to their values used in this filter
   * expression. 
   */
  public fun valuesMap(valuesMap: Collection<Any>) {
    _valuesMap.addAll(valuesMap)
  }

  /**
   * @param valuesMap The map of substitution variable names to their values used in this filter
   * expression. 
   */
  public fun valuesMap(valuesMap: IResolvable) {
    cdkBuilder.valuesMap(valuesMap)
  }

  public fun build(): CfnDataset.FilterExpressionProperty {
    if(_valuesMap.isNotEmpty()) cdkBuilder.valuesMap(_valuesMap)
    return cdkBuilder.build()
  }
}
