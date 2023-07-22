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

  /**
   * @param changeDetectingColumns One to five columns that indicate when a document in the database
   * has changed. 
   */
  public fun changeDetectingColumns(vararg changeDetectingColumns: String) {
    _changeDetectingColumns.addAll(listOf(*changeDetectingColumns))
  }

  /**
   * @param changeDetectingColumns One to five columns that indicate when a document in the database
   * has changed. 
   */
  public fun changeDetectingColumns(changeDetectingColumns: Collection<String>) {
    _changeDetectingColumns.addAll(changeDetectingColumns)
  }

  /**
   * @param documentDataColumnName The column that contains the contents of the document. 
   */
  public fun documentDataColumnName(documentDataColumnName: String) {
    cdkBuilder.documentDataColumnName(documentDataColumnName)
  }

  /**
   * @param documentIdColumnName The column that provides the document's identifier. 
   */
  public fun documentIdColumnName(documentIdColumnName: String) {
    cdkBuilder.documentIdColumnName(documentIdColumnName)
  }

  /**
   * @param documentTitleColumnName The column that contains the title of the document.
   */
  public fun documentTitleColumnName(documentTitleColumnName: String) {
    cdkBuilder.documentTitleColumnName(documentTitleColumnName)
  }

  /**
   * @param fieldMappings An array of objects that map database column names to the corresponding
   * fields in an index.
   * You must first create the fields in the index using the
   * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation.
   */
  public fun fieldMappings(vararg fieldMappings: Any) {
    _fieldMappings.addAll(listOf(*fieldMappings))
  }

  /**
   * @param fieldMappings An array of objects that map database column names to the corresponding
   * fields in an index.
   * You must first create the fields in the index using the
   * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation.
   */
  public fun fieldMappings(fieldMappings: Collection<Any>) {
    _fieldMappings.addAll(fieldMappings)
  }

  /**
   * @param fieldMappings An array of objects that map database column names to the corresponding
   * fields in an index.
   * You must first create the fields in the index using the
   * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation.
   */
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
