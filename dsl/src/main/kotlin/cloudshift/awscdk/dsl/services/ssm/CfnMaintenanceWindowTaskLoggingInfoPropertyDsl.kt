@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@CdkDslMarker
public class CfnMaintenanceWindowTaskLoggingInfoPropertyDsl {
  private val cdkBuilder: CfnMaintenanceWindowTask.LoggingInfoProperty.Builder =
      CfnMaintenanceWindowTask.LoggingInfoProperty.builder()

  /**
   * @param region The AWS Region where the S3 bucket is located. 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param s3Bucket The name of an S3 bucket where execution logs are stored. 
   */
  public fun s3Bucket(s3Bucket: String) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  /**
   * @param s3Prefix The Amazon S3 bucket subfolder.
   */
  public fun s3Prefix(s3Prefix: String) {
    cdkBuilder.s3Prefix(s3Prefix)
  }

  public fun build(): CfnMaintenanceWindowTask.LoggingInfoProperty = cdkBuilder.build()
}
