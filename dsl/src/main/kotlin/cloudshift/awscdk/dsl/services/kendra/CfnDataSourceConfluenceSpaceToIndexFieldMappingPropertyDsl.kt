@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Maps attributes or field names of Confluence spaces to Amazon Kendra index field names.
 *
 * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For more
 * information, see [Mapping data source
 * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
 * source field names must exist in your Confluence custom metadata.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * ConfluenceSpaceToIndexFieldMappingProperty confluenceSpaceToIndexFieldMappingProperty =
 * ConfluenceSpaceToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencespacetoindexfieldmapping.html)
 */
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
