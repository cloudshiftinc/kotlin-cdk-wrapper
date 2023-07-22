@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssm.CfnResourceDataSync

@CdkDslMarker
public class CfnResourceDataSyncS3DestinationPropertyDsl {
  private val cdkBuilder: CfnResourceDataSync.S3DestinationProperty.Builder =
      CfnResourceDataSync.S3DestinationProperty.builder()

  /**
   * @param bucketName The name of the S3 bucket where the aggregated data is stored. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param bucketPrefix An Amazon S3 prefix for the bucket.
   */
  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  /**
   * @param bucketRegion The AWS Region with the S3 bucket targeted by the resource data sync. 
   */
  public fun bucketRegion(bucketRegion: String) {
    cdkBuilder.bucketRegion(bucketRegion)
  }

  /**
   * @param kmsKeyArn The ARN of an encryption key for a destination in Amazon S3.
   * Must belong to the same Region as the destination S3 bucket.
   */
  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  /**
   * @param syncFormat A supported sync format. 
   * The following format is currently supported: JsonSerDe
   */
  public fun syncFormat(syncFormat: String) {
    cdkBuilder.syncFormat(syncFormat)
  }

  public fun build(): CfnResourceDataSync.S3DestinationProperty = cdkBuilder.build()
}
