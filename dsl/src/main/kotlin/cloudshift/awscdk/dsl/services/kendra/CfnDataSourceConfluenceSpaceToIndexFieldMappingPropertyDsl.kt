@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceConfluenceSpaceToIndexFieldMappingPropertyDsl {
  private val cdkBuilder: CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty.Builder =
      CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty.builder()

  /**
   * @param dataSourceFieldName The name of the field in the data source. 
   */
  public fun dataSourceFieldName(dataSourceFieldName: String) {
    cdkBuilder.dataSourceFieldName(dataSourceFieldName)
  }

  /**
   * @param dateFieldFormat The format for date fields in the data source.
   * If the field specified in `DataSourceFieldName` is a date field you must specify the date
   * format. If the field is not a date field, an exception is thrown.
   */
  public fun dateFieldFormat(dateFieldFormat: String) {
    cdkBuilder.dateFieldFormat(dateFieldFormat)
  }

  /**
   * @param indexFieldName The name of the index field to map to the Confluence data source field. 
   * The index field type must match the Confluence field type.
   */
  public fun indexFieldName(indexFieldName: String) {
    cdkBuilder.indexFieldName(indexFieldName)
  }

  public fun build(): CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty = cdkBuilder.build()
}
