@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2

/**
 * For a SQL-based Kinesis Data Analytics application, describes the format of the data in the
 * streaming source, and how each data element maps to corresponding columns created in the
 * in-application stream.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referenceschema.html)
 */
@CdkDslMarker
public class CfnApplicationReferenceDataSourceV2ReferenceSchemaPropertyDsl {
  private val cdkBuilder: CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.Builder =
      CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.builder()

  private val _recordColumns: MutableList<Any> = mutableListOf()

  /**
   * @param recordColumns A list of `RecordColumn` objects. 
   */
  public fun recordColumns(vararg recordColumns: Any) {
    _recordColumns.addAll(listOf(*recordColumns))
  }

  /**
   * @param recordColumns A list of `RecordColumn` objects. 
   */
  public fun recordColumns(recordColumns: Collection<Any>) {
    _recordColumns.addAll(recordColumns)
  }

  /**
   * @param recordColumns A list of `RecordColumn` objects. 
   */
  public fun recordColumns(recordColumns: IResolvable) {
    cdkBuilder.recordColumns(recordColumns)
  }

  /**
   * @param recordEncoding Specifies the encoding of the records in the streaming source.
   * For example, UTF-8.
   */
  public fun recordEncoding(recordEncoding: String) {
    cdkBuilder.recordEncoding(recordEncoding)
  }

  /**
   * @param recordFormat Specifies the format of the records on the streaming source. 
   */
  public fun recordFormat(recordFormat: IResolvable) {
    cdkBuilder.recordFormat(recordFormat)
  }

  /**
   * @param recordFormat Specifies the format of the records on the streaming source. 
   */
  public fun recordFormat(recordFormat: CfnApplicationReferenceDataSourceV2.RecordFormatProperty) {
    cdkBuilder.recordFormat(recordFormat)
  }

  public fun build(): CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty {
    if(_recordColumns.isNotEmpty()) cdkBuilder.recordColumns(_recordColumns)
    return cdkBuilder.build()
  }
}
