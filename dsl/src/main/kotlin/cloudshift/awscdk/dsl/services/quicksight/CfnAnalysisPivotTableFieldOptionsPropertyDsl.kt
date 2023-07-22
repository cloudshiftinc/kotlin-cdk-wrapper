@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPivotTableFieldOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotTableFieldOptionsProperty.Builder =
      CfnAnalysis.PivotTableFieldOptionsProperty.builder()

  private val _collapseStateOptions: MutableList<Any> = mutableListOf()

  private val _dataPathOptions: MutableList<Any> = mutableListOf()

  private val _selectedFieldOptions: MutableList<Any> = mutableListOf()

  /**
   * @param collapseStateOptions The collapse state options for the pivot table field options.
   */
  public fun collapseStateOptions(vararg collapseStateOptions: Any) {
    _collapseStateOptions.addAll(listOf(*collapseStateOptions))
  }

  /**
   * @param collapseStateOptions The collapse state options for the pivot table field options.
   */
  public fun collapseStateOptions(collapseStateOptions: Collection<Any>) {
    _collapseStateOptions.addAll(collapseStateOptions)
  }

  /**
   * @param collapseStateOptions The collapse state options for the pivot table field options.
   */
  public fun collapseStateOptions(collapseStateOptions: IResolvable) {
    cdkBuilder.collapseStateOptions(collapseStateOptions)
  }

  /**
   * @param dataPathOptions The data path options for the pivot table field options.
   */
  public fun dataPathOptions(vararg dataPathOptions: Any) {
    _dataPathOptions.addAll(listOf(*dataPathOptions))
  }

  /**
   * @param dataPathOptions The data path options for the pivot table field options.
   */
  public fun dataPathOptions(dataPathOptions: Collection<Any>) {
    _dataPathOptions.addAll(dataPathOptions)
  }

  /**
   * @param dataPathOptions The data path options for the pivot table field options.
   */
  public fun dataPathOptions(dataPathOptions: IResolvable) {
    cdkBuilder.dataPathOptions(dataPathOptions)
  }

  /**
   * @param selectedFieldOptions The selected field options for the pivot table field options.
   */
  public fun selectedFieldOptions(vararg selectedFieldOptions: Any) {
    _selectedFieldOptions.addAll(listOf(*selectedFieldOptions))
  }

  /**
   * @param selectedFieldOptions The selected field options for the pivot table field options.
   */
  public fun selectedFieldOptions(selectedFieldOptions: Collection<Any>) {
    _selectedFieldOptions.addAll(selectedFieldOptions)
  }

  /**
   * @param selectedFieldOptions The selected field options for the pivot table field options.
   */
  public fun selectedFieldOptions(selectedFieldOptions: IResolvable) {
    cdkBuilder.selectedFieldOptions(selectedFieldOptions)
  }

  public fun build(): CfnAnalysis.PivotTableFieldOptionsProperty {
    if(_collapseStateOptions.isNotEmpty()) cdkBuilder.collapseStateOptions(_collapseStateOptions)
    if(_dataPathOptions.isNotEmpty()) cdkBuilder.dataPathOptions(_dataPathOptions)
    if(_selectedFieldOptions.isNotEmpty()) cdkBuilder.selectedFieldOptions(_selectedFieldOptions)
    return cdkBuilder.build()
  }
}
