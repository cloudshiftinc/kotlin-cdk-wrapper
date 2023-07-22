@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.simspaceweaver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.simspaceweaver.CfnSimulation

@CdkDslMarker
public class CfnSimulationS3LocationPropertyDsl {
  private val cdkBuilder: CfnSimulation.S3LocationProperty.Builder =
      CfnSimulation.S3LocationProperty.builder()

  /**
   * @param bucketName The name of an Amazon S3 bucket. 
   * For more information about buckets, see [Creating, configuring, and working with Amazon S3
   * buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-buckets-s3.html) in the
   * *Amazon Simple Storage Service User Guide* .
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param objectKey The key name of an object in Amazon S3 . 
   * For more information about Amazon S3 objects and object keys, see [Uploading, downloading, and
   * working with objects in Amazon
   * S3](https://docs.aws.amazon.com/AmazonS3/latest/userguide/uploading-downloading-objects.html) in
   * the *Amazon Simple Storage Service User Guide* .
   */
  public fun objectKey(objectKey: String) {
    cdkBuilder.objectKey(objectKey)
  }

  public fun build(): CfnSimulation.S3LocationProperty = cdkBuilder.build()
}
