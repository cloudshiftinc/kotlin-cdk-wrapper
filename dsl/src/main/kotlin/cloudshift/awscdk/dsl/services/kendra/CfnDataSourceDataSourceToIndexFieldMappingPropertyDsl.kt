@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Maps a column or attribute in the data source to an index field.
 *
 * You must first create the fields in the index using the
 * [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * DataSourceToIndexFieldMappingProperty dataSourceToIndexFieldMappingProperty =
 * DataSourceToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-datasourcetoindexfieldmapping.html)
 */
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
