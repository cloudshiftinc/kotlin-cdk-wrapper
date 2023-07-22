@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource
import software.constructs.Construct

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
