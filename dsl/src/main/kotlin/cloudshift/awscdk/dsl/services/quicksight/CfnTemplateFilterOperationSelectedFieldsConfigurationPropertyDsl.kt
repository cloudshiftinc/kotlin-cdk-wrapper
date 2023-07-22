@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFilterOperationSelectedFieldsConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.FilterOperationSelectedFieldsConfigurationProperty.Builder =
      CfnTemplate.FilterOperationSelectedFieldsConfigurationProperty.builder()

  private val _selectedColumns: MutableList<Any> = mutableListOf()

  private val _selectedFields: MutableList<String> = mutableListOf()

  /**
   * @param selectedColumns The selected columns of a dataset.
   */
  public fun selectedColumns(vararg selectedColumns: Any) {
    _selectedColumns.addAll(listOf(*selectedColumns))
  }

  /**
   * @param selectedColumns The selected columns of a dataset.
   */
  public fun selectedColumns(selectedColumns: Collection<Any>) {
    _selectedColumns.addAll(selectedColumns)
  }

  /**
   * @param selectedColumns The selected columns of a dataset.
   */
  public fun selectedColumns(selectedColumns: IResolvable) {
    cdkBuilder.selectedColumns(selectedColumns)
  }

  /**
   * @param selectedFieldOptions A structure that contains the options that choose which fields are
   * filtered in the `CustomActionFilterOperation` .
   * Valid values are defined as follows:
   *
   * * `ALL_FIELDS` : Applies the filter operation to all fields.
   */
  public fun selectedFieldOptions(selectedFieldOptions: String) {
    cdkBuilder.selectedFieldOptions(selectedFieldOptions)
  }

  /**
   * @param selectedFields Chooses the fields that are filtered in `CustomActionFilterOperation` .
   */
  public fun selectedFields(vararg selectedFields: String) {
    _selectedFields.addAll(listOf(*selectedFields))
  }

  /**
   * @param selectedFields Chooses the fields that are filtered in `CustomActionFilterOperation` .
   */
  public fun selectedFields(selectedFields: Collection<String>) {
    _selectedFields.addAll(selectedFields)
  }

  public fun build(): CfnTemplate.FilterOperationSelectedFieldsConfigurationProperty {
    if(_selectedColumns.isNotEmpty()) cdkBuilder.selectedColumns(_selectedColumns)
    if(_selectedFields.isNotEmpty()) cdkBuilder.selectedFields(_selectedFields)
    return cdkBuilder.build()
  }
}
