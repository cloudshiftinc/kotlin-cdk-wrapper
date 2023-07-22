@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource

@CdkDslMarker
public class CfnApplicationReferenceDataSourceS3ReferenceDataSourcePropertyDsl {
  private val cdkBuilder: CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder =
      CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.builder()

  /**
   * @param bucketArn Amazon Resource Name (ARN) of the S3 bucket. 
   */
  public fun bucketArn(bucketArn: String) {
    cdkBuilder.bucketArn(bucketArn)
  }

  /**
   * @param fileKey Object key name containing reference data. 
   */
  public fun fileKey(fileKey: String) {
    cdkBuilder.fileKey(fileKey)
  }

  /**
   * @param referenceRoleArn ARN of the IAM role that the service can assume to read data on your
   * behalf. 
   * This role must have permission for the `s3:GetObject` action on the object and trust policy
   * that allows Amazon Kinesis Analytics service principal to assume this role.
   */
  public fun referenceRoleArn(referenceRoleArn: String) {
    cdkBuilder.referenceRoleArn(referenceRoleArn)
  }

  public fun build(): CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty =
      cdkBuilder.build()
}
