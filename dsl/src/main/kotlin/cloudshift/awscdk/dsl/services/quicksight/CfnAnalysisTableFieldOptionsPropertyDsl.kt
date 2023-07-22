@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableFieldOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TableFieldOptionsProperty.Builder =
      CfnAnalysis.TableFieldOptionsProperty.builder()

  private val _order: MutableList<String> = mutableListOf()

  private val _selectedFieldOptions: MutableList<Any> = mutableListOf()

  /**
   * @param order The order of field IDs of the field options for a table visual.
   */
  public fun order(vararg order: String) {
    _order.addAll(listOf(*order))
  }

  /**
   * @param order The order of field IDs of the field options for a table visual.
   */
  public fun order(order: Collection<String>) {
    _order.addAll(order)
  }

  /**
   * @param selectedFieldOptions The selected field options for the table field options.
   */
  public fun selectedFieldOptions(vararg selectedFieldOptions: Any) {
    _selectedFieldOptions.addAll(listOf(*selectedFieldOptions))
  }

  /**
   * @param selectedFieldOptions The selected field options for the table field options.
   */
  public fun selectedFieldOptions(selectedFieldOptions: Collection<Any>) {
    _selectedFieldOptions.addAll(selectedFieldOptions)
  }

  /**
   * @param selectedFieldOptions The selected field options for the table field options.
   */
  public fun selectedFieldOptions(selectedFieldOptions: IResolvable) {
    cdkBuilder.selectedFieldOptions(selectedFieldOptions)
  }

  public fun build(): CfnAnalysis.TableFieldOptionsProperty {
    if(_order.isNotEmpty()) cdkBuilder.order(_order)
    if(_selectedFieldOptions.isNotEmpty()) cdkBuilder.selectedFieldOptions(_selectedFieldOptions)
    return cdkBuilder.build()
  }
}
