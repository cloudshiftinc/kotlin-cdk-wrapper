@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnCluster

/**
 * The log configuration for the results of the execute command actions.
 *
 * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * ExecuteCommandLogConfigurationProperty executeCommandLogConfigurationProperty =
 * ExecuteCommandLogConfigurationProperty.builder()
 * .cloudWatchEncryptionEnabled(false)
 * .cloudWatchLogGroupName("cloudWatchLogGroupName")
 * .s3BucketName("s3BucketName")
 * .s3EncryptionEnabled(false)
 * .s3KeyPrefix("s3KeyPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandlogconfiguration.html)
 */
@CdkDslMarker
public class CfnClusterExecuteCommandLogConfigurationPropertyDsl {
  private val cdkBuilder: CfnCluster.ExecuteCommandLogConfigurationProperty.Builder =
      CfnCluster.ExecuteCommandLogConfigurationProperty.builder()

  /**
   * @param cloudWatchEncryptionEnabled Determines whether to use encryption on the CloudWatch logs.
   * If not specified, encryption will be off.
   */
  public fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: Boolean) {
    cdkBuilder.cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled)
  }

  /**
   * @param cloudWatchEncryptionEnabled Determines whether to use encryption on the CloudWatch logs.
   * If not specified, encryption will be off.
   */
  public fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: IResolvable) {
    cdkBuilder.cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled)
  }

  /**
   * @param cloudWatchLogGroupName The name of the CloudWatch log group to send logs to.
   *
   * The CloudWatch log group must already be created.
   */
  public fun cloudWatchLogGroupName(cloudWatchLogGroupName: String) {
    cdkBuilder.cloudWatchLogGroupName(cloudWatchLogGroupName)
  }

  /**
   * @param s3BucketName The name of the S3 bucket to send logs to.
   *
   * The S3 bucket must already be created.
   */
  public fun s3BucketName(s3BucketName: String) {
    cdkBuilder.s3BucketName(s3BucketName)
  }

  /**
   * @param s3EncryptionEnabled Determines whether to use encryption on the S3 logs.
   * If not specified, encryption is not used.
   */
  public fun s3EncryptionEnabled(s3EncryptionEnabled: Boolean) {
    cdkBuilder.s3EncryptionEnabled(s3EncryptionEnabled)
  }

  /**
   * @param s3EncryptionEnabled Determines whether to use encryption on the S3 logs.
   * If not specified, encryption is not used.
   */
  public fun s3EncryptionEnabled(s3EncryptionEnabled: IResolvable) {
    cdkBuilder.s3EncryptionEnabled(s3EncryptionEnabled)
  }

  /**
   * @param s3KeyPrefix An optional folder in the S3 bucket to place logs in.
   */
  public fun s3KeyPrefix(s3KeyPrefix: String) {
    cdkBuilder.s3KeyPrefix(s3KeyPrefix)
  }

  public fun build(): CfnCluster.ExecuteCommandLogConfigurationProperty = cdkBuilder.build()
}
