@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2

/**
 * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
 * providing the source information (Amazon S3 bucket name and object key name), the resulting
 * in-application table name that is created, and the necessary schema to map the data elements in the
 * Amazon S3 object to the in-application table.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * ReferenceDataSourceProperty referenceDataSourceProperty = ReferenceDataSourceProperty.builder()
 * .referenceSchema(ReferenceSchemaProperty.builder()
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
 * .build())
 * // the properties below are optional
 * .s3ReferenceDataSource(S3ReferenceDataSourceProperty.builder()
 * .bucketArn("bucketArn")
 * .fileKey("fileKey")
 * .build())
 * .tableName("tableName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html)
 */
@CdkDslMarker
public class CfnApplicationReferenceDataSourceV2ReferenceDataSourcePropertyDsl {
  private val cdkBuilder: CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.Builder =
      CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.builder()

  /**
   * @param referenceSchema Describes the format of the data in the streaming source, and how each
   * data element maps to corresponding columns created in the in-application stream. 
   */
  public fun referenceSchema(referenceSchema: IResolvable) {
    cdkBuilder.referenceSchema(referenceSchema)
  }

  /**
   * @param referenceSchema Describes the format of the data in the streaming source, and how each
   * data element maps to corresponding columns created in the in-application stream. 
   */
  public
      fun referenceSchema(referenceSchema: CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty) {
    cdkBuilder.referenceSchema(referenceSchema)
  }

  /**
   * @param s3ReferenceDataSource Identifies the S3 bucket and object that contains the reference
   * data.
   * A Kinesis Data Analytics application loads reference data only once. If the data changes, you
   * call the
   * [UpdateApplication](https://docs.aws.amazon.com/kinesisanalytics/latest/apiv2/API_UpdateApplication.html)
   * operation to trigger reloading of data into your application.
   */
  public fun s3ReferenceDataSource(s3ReferenceDataSource: IResolvable) {
    cdkBuilder.s3ReferenceDataSource(s3ReferenceDataSource)
  }

  /**
   * @param s3ReferenceDataSource Identifies the S3 bucket and object that contains the reference
   * data.
   * A Kinesis Data Analytics application loads reference data only once. If the data changes, you
   * call the
   * [UpdateApplication](https://docs.aws.amazon.com/kinesisanalytics/latest/apiv2/API_UpdateApplication.html)
   * operation to trigger reloading of data into your application.
   */
  public
      fun s3ReferenceDataSource(s3ReferenceDataSource: CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty) {
    cdkBuilder.s3ReferenceDataSource(s3ReferenceDataSource)
  }

  /**
   * @param tableName The name of the in-application table to create.
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty =
      cdkBuilder.build()
}
