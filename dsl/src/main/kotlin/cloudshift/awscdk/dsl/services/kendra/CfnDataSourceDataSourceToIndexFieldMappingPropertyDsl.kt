@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceDataSourceToIndexFieldMappingPropertyDsl {
  private val cdkBuilder: CfnDataSource.DataSourceToIndexFieldMappingProperty.Builder =
      CfnDataSource.DataSourceToIndexFieldMappingProperty.builder()

  /**
   * @param dataSourceFieldName The name of the column or attribute in the data source. 
   */
  public fun dataSourceFieldName(dataSourceFieldName: String) {
    cdkBuilder.dataSourceFieldName(dataSourceFieldName)
  }

  /**
   * @param dateFieldFormat The type of data stored in the column or attribute.
   */
  public fun dateFieldFormat(dateFieldFormat: String) {
    cdkBuilder.dateFieldFormat(dateFieldFormat)
  }

  /**
   * @param indexFieldName The name of the field in the index. 
   */
  public fun indexFieldName(indexFieldName: String) {
    cdkBuilder.indexFieldName(indexFieldName)
  }

  public fun build(): CfnDataSource.DataSourceToIndexFieldMappingProperty = cdkBuilder.build()
}
