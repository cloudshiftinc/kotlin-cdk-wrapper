@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance

@CdkDslMarker
public class CfnVerifiedAccessInstanceVerifiedAccessLogsPropertyDsl {
  private val cdkBuilder: CfnVerifiedAccessInstance.VerifiedAccessLogsProperty.Builder =
      CfnVerifiedAccessInstance.VerifiedAccessLogsProperty.builder()

  public fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
    cdkBuilder.cloudWatchLogs(cloudWatchLogs)
  }

  public fun cloudWatchLogs(cloudWatchLogs: CfnVerifiedAccessInstance.CloudWatchLogsProperty) {
    cdkBuilder.cloudWatchLogs(cloudWatchLogs)
  }

  public fun includeTrustContext(includeTrustContext: Boolean) {
    cdkBuilder.includeTrustContext(includeTrustContext)
  }

  public fun includeTrustContext(includeTrustContext: IResolvable) {
    cdkBuilder.includeTrustContext(includeTrustContext)
  }

  public fun kinesisDataFirehose(kinesisDataFirehose: IResolvable) {
    cdkBuilder.kinesisDataFirehose(kinesisDataFirehose)
  }

  public
      fun kinesisDataFirehose(kinesisDataFirehose: CfnVerifiedAccessInstance.KinesisDataFirehoseProperty) {
    cdkBuilder.kinesisDataFirehose(kinesisDataFirehose)
  }

  public fun logVersion(logVersion: String) {
    cdkBuilder.logVersion(logVersion)
  }

  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  public fun s3(s3: CfnVerifiedAccessInstance.S3Property) {
    cdkBuilder.s3(s3)
  }

  public fun build(): CfnVerifiedAccessInstance.VerifiedAccessLogsProperty = cdkBuilder.build()
}
