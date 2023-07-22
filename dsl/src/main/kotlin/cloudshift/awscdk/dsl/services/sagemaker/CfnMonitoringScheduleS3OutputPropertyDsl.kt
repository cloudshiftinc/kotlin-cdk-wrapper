@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@CdkDslMarker
public class CfnMonitoringScheduleS3OutputPropertyDsl {
  private val cdkBuilder: CfnMonitoringSchedule.S3OutputProperty.Builder =
      CfnMonitoringSchedule.S3OutputProperty.builder()

  /**
   * @param localPath The local path to the S3 storage location where SageMaker saves the results of
   * a monitoring job. 
   * LocalPath is an absolute path for the output data.
   */
  public fun localPath(localPath: String) {
    cdkBuilder.localPath(localPath)
  }

  /**
   * @param s3UploadMode Whether to upload the results of the monitoring job continuously or after
   * the job completes.
   */
  public fun s3UploadMode(s3UploadMode: String) {
    cdkBuilder.s3UploadMode(s3UploadMode)
  }

  /**
   * @param s3Uri A URI that identifies the S3 storage location where SageMaker saves the results of
   * a monitoring job. 
   */
  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnMonitoringSchedule.S3OutputProperty = cdkBuilder.build()
}
