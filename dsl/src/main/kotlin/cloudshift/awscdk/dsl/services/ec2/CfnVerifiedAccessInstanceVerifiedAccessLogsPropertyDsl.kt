@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance

/**
 * Describes the options for Verified Access logs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * VerifiedAccessLogsProperty verifiedAccessLogsProperty = VerifiedAccessLogsProperty.builder()
 * .cloudWatchLogs(CloudWatchLogsProperty.builder()
 * .enabled(false)
 * .logGroup("logGroup")
 * .build())
 * .includeTrustContext(false)
 * .kinesisDataFirehose(KinesisDataFirehoseProperty.builder()
 * .deliveryStream("deliveryStream")
 * .enabled(false)
 * .build())
 * .logVersion("logVersion")
 * .s3(S3Property.builder()
 * .bucketName("bucketName")
 * .bucketOwner("bucketOwner")
 * .enabled(false)
 * .prefix("prefix")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-verifiedaccesslogs.html)
 */
@CdkDslMarker
public class CfnVerifiedAccessInstanceVerifiedAccessLogsPropertyDsl {
  private val cdkBuilder: CfnVerifiedAccessInstance.VerifiedAccessLogsProperty.Builder =
      CfnVerifiedAccessInstance.VerifiedAccessLogsProperty.builder()

  /**
   * @param cloudWatchLogs CloudWatch Logs logging destination.
   */
  public fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
    cdkBuilder.cloudWatchLogs(cloudWatchLogs)
  }

  /**
   * @param cloudWatchLogs CloudWatch Logs logging destination.
   */
  public fun cloudWatchLogs(cloudWatchLogs: CfnVerifiedAccessInstance.CloudWatchLogsProperty) {
    cdkBuilder.cloudWatchLogs(cloudWatchLogs)
  }

  /**
   * @param includeTrustContext Include trust data sent by trust providers into the logs.
   */
  public fun includeTrustContext(includeTrustContext: Boolean) {
    cdkBuilder.includeTrustContext(includeTrustContext)
  }

  /**
   * @param includeTrustContext Include trust data sent by trust providers into the logs.
   */
  public fun includeTrustContext(includeTrustContext: IResolvable) {
    cdkBuilder.includeTrustContext(includeTrustContext)
  }

  /**
   * @param kinesisDataFirehose Kinesis logging destination.
   */
  public fun kinesisDataFirehose(kinesisDataFirehose: IResolvable) {
    cdkBuilder.kinesisDataFirehose(kinesisDataFirehose)
  }

  /**
   * @param kinesisDataFirehose Kinesis logging destination.
   */
  public
      fun kinesisDataFirehose(kinesisDataFirehose: CfnVerifiedAccessInstance.KinesisDataFirehoseProperty) {
    cdkBuilder.kinesisDataFirehose(kinesisDataFirehose)
  }

  /**
   * @param logVersion The logging version to use.
   * Valid values: `ocsf-0.1` | `ocsf-1.0.0-rc.2`
   */
  public fun logVersion(logVersion: String) {
    cdkBuilder.logVersion(logVersion)
  }

  /**
   * @param s3 Amazon S3 logging options.
   */
  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  /**
   * @param s3 Amazon S3 logging options.
   */
  public fun s3(s3: CfnVerifiedAccessInstance.S3Property) {
    cdkBuilder.s3(s3)
  }

  public fun build(): CfnVerifiedAccessInstance.VerifiedAccessLogsProperty = cdkBuilder.build()
}
