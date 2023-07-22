@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceProps

/**
 * Properties for defining a `CfnApplicationReferenceDataSource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * CfnApplicationReferenceDataSourceProps cfnApplicationReferenceDataSourceProps =
 * CfnApplicationReferenceDataSourceProps.builder()
 * .applicationName("applicationName")
 * .referenceDataSource(ReferenceDataSourceProperty.builder()
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
 * .referenceRoleArn("referenceRoleArn")
 * .build())
 * .tableName("tableName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html)
 */
@CdkDslMarker
public class CfnApplicationReferenceDataSourcePropsDsl {
  private val cdkBuilder: CfnApplicationReferenceDataSourceProps.Builder =
      CfnApplicationReferenceDataSourceProps.builder()

  /**
   * @param applicationName Name of an existing application. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * @param referenceDataSource The reference data source can be an object in your Amazon S3 bucket.
   * 
   * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
   * that is created. You provide an S3 bucket, object key name, and the resulting in-application table
   * that is created. You must also provide an IAM role with the necessary permissions that Amazon
   * Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
   */
  public fun referenceDataSource(referenceDataSource: IResolvable) {
    cdkBuilder.referenceDataSource(referenceDataSource)
  }

  /**
   * @param referenceDataSource The reference data source can be an object in your Amazon S3 bucket.
   * 
   * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
   * that is created. You provide an S3 bucket, object key name, and the resulting in-application table
   * that is created. You must also provide an IAM role with the necessary permissions that Amazon
   * Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
   */
  public
      fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSource.ReferenceDataSourceProperty) {
    cdkBuilder.referenceDataSource(referenceDataSource)
  }

  public fun build(): CfnApplicationReferenceDataSourceProps = cdkBuilder.build()
}
