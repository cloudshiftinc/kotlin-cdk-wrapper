@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource

/**
 * The ReferenceSchema property type specifies the format of the data in the reference source for a
 * SQL-based Amazon Kinesis Data Analytics application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * ReferenceSchemaProperty referenceSchemaProperty = ReferenceSchemaProperty.builder()
 * .recordColumns(List.of(RecordColumnProperty.builder()
 * .name("name")
 * .sqlType("sqlType")
 * // the properties below are optional
 * .mapping("mapping")
 * .build()))
 * .recordFormat(RecordFormatProperty.builder()
 * .recordFormatType("recordFormatType")
 * // the properties below are optional
 * .mappingParameters(MappingParametersProperty.builder()
 * .csvMappingParameters(CSVMappingParametersProperty.builder()
 * .recordColumnDelimiter("recordColumnDelimiter")
 * .recordRowDelimiter("recordRowDelimiter")
 * .build())
 * .jsonMappingParameters(JSONMappingParametersProperty.builder()
 * .recordRowPath("recordRowPath")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .recordEncoding("recordEncoding")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html)
 */
@CdkDslMarker
public class CfnApplicationReferenceDataSourceReferenceSchemaPropertyDsl {
  private val cdkBuilder: CfnApplicationReferenceDataSource.ReferenceSchemaProperty.Builder =
      CfnApplicationReferenceDataSource.ReferenceSchemaProperty.builder()

  private val _recordColumns: MutableList<Any> = mutableListOf()

  /**
   * @param recordColumns A list of RecordColumn objects. 
   */
  public fun recordColumns(vararg recordColumns: Any) {
    _recordColumns.addAll(listOf(*recordColumns))
  }

  /**
   * @param recordColumns A list of RecordColumn objects. 
   */
  public fun recordColumns(recordColumns: Collection<Any>) {
    _recordColumns.addAll(recordColumns)
  }

  /**
   * @param recordColumns A list of RecordColumn objects. 
   */
  public fun recordColumns(recordColumns: IResolvable) {
    cdkBuilder.recordColumns(recordColumns)
  }

  /**
   * @param recordEncoding Specifies the encoding of the records in the reference source.
   * For example, UTF-8.
   */
  public fun recordEncoding(recordEncoding: String) {
    cdkBuilder.recordEncoding(recordEncoding)
  }

  /**
   * @param recordFormat Specifies the format of the records on the reference source. 
   */
  public fun recordFormat(recordFormat: IResolvable) {
    cdkBuilder.recordFormat(recordFormat)
  }

  /**
   * @param recordFormat Specifies the format of the records on the reference source. 
   */
  public fun recordFormat(recordFormat: CfnApplicationReferenceDataSource.RecordFormatProperty) {
    cdkBuilder.recordFormat(recordFormat)
  }

  public fun build(): CfnApplicationReferenceDataSource.ReferenceSchemaProperty {
    if(_recordColumns.isNotEmpty()) cdkBuilder.recordColumns(_recordColumns)
    return cdkBuilder.build()
  }
}
