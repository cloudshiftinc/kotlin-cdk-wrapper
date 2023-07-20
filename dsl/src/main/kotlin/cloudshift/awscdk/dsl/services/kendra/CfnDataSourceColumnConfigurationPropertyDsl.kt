@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceColumnConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.ColumnConfigurationProperty.Builder =
      CfnDataSource.ColumnConfigurationProperty.builder()

  private val _changeDetectingColumns: MutableList<String> = mutableListOf()

  private val _fieldMappings: MutableList<Any> = mutableListOf()

  public fun changeDetectingColumns(vararg changeDetectingColumns: String) {
    _changeDetectingColumns.addAll(listOf(*changeDetectingColumns))
  }

  public fun changeDetectingColumns(changeDetectingColumns: Collection<String>) {
    _changeDetectingColumns.addAll(changeDetectingColumns)
  }

  public fun documentDataColumnName(documentDataColumnName: String) {
    cdkBuilder.documentDataColumnName(documentDataColumnName)
  }

  public fun documentIdColumnName(documentIdColumnName: String) {
    cdkBuilder.documentIdColumnName(documentIdColumnName)
  }

  public fun documentTitleColumnName(documentTitleColumnName: String) {
    cdkBuilder.documentTitleColumnName(documentTitleColumnName)
  }

  public fun fieldMappings(vararg fieldMappings: Any) {
    _fieldMappings.addAll(listOf(*fieldMappings))
  }

  public fun fieldMappings(fieldMappings: Collection<Any>) {
    _fieldMappings.addAll(fieldMappings)
  }

  public fun fieldMappings(fieldMappings: IResolvable) {
    cdkBuilder.fieldMappings(fieldMappings)
  }

  public fun build(): CfnDataSource.ColumnConfigurationProperty {
    if(_changeDetectingColumns.isNotEmpty())
        cdkBuilder.changeDetectingColumns(_changeDetectingColumns)
    if(_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
    return cdkBuilder.build()
  }
}
