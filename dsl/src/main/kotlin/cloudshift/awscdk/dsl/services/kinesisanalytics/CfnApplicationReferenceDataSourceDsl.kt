@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource
import software.constructs.Construct

/**
 * Adds a reference data source to an existing application.
 *
 * Amazon Kinesis Analytics reads reference data (that is, an Amazon S3 object) and creates an
 * in-application table within your application. In the request, you provide the source (S3 bucket name
 * and object key name), name of the in-application table to create, and the necessary mapping
 * information that describes how data in Amazon S3 object maps to columns in the resulting
 * in-application table.
 *
 * For conceptual information, see [Configuring Application
 * Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html) . For the
 * limits on data sources you can add to your application, see
 * [Limits](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html) .
 *
 * This operation requires permissions to perform the `kinesisanalytics:AddApplicationOutput`
 * action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * CfnApplicationReferenceDataSource cfnApplicationReferenceDataSource =
 * CfnApplicationReferenceDataSource.Builder.create(this, "MyCfnApplicationReferenceDataSource")
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
public class CfnApplicationReferenceDataSourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplicationReferenceDataSource.Builder =
      CfnApplicationReferenceDataSource.Builder.create(scope, id)

  /**
   * Name of an existing application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-applicationname)
   * @param applicationName Name of an existing application. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * The reference data source can be an object in your Amazon S3 bucket.
   *
   * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
   * that is created. You provide an S3 bucket, object key name, and the resulting in-application table
   * that is created. You must also provide an IAM role with the necessary permissions that Amazon
   * Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource)
   * @param referenceDataSource The reference data source can be an object in your Amazon S3 bucket.
   * 
   */
  public fun referenceDataSource(referenceDataSource: IResolvable) {
    cdkBuilder.referenceDataSource(referenceDataSource)
  }

  /**
   * The reference data source can be an object in your Amazon S3 bucket.
   *
   * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
   * that is created. You provide an S3 bucket, object key name, and the resulting in-application table
   * that is created. You must also provide an IAM role with the necessary permissions that Amazon
   * Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource)
   * @param referenceDataSource The reference data source can be an object in your Amazon S3 bucket.
   * 
   */
  public
      fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSource.ReferenceDataSourceProperty) {
    cdkBuilder.referenceDataSource(referenceDataSource)
  }

  public fun build(): CfnApplicationReferenceDataSource = cdkBuilder.build()
}
