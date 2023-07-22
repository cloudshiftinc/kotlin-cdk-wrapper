@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.s3.IBucket

/**
 * The log configuration for the results of the execute command actions.
 *
 * The logs can be sent to CloudWatch Logs and/ or an Amazon S3 bucket.
 * For more information, see [ExecuteCommandLogConfiguration]
 * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandlogconfiguration.html
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * Key kmsKey = new Key(this, "KmsKey");
 * // Pass the KMS key in the `encryptionKey` field to associate the key to the log group
 * LogGroup logGroup = LogGroup.Builder.create(this, "LogGroup")
 * .encryptionKey(kmsKey)
 * .build();
 * // Pass the KMS key in the `encryptionKey` field to associate the key to the S3 bucket
 * Bucket execBucket = Bucket.Builder.create(this, "EcsExecBucket")
 * .encryptionKey(kmsKey)
 * .build();
 * Cluster cluster = Cluster.Builder.create(this, "Cluster")
 * .vpc(vpc)
 * .executeCommandConfiguration(ExecuteCommandConfiguration.builder()
 * .kmsKey(kmsKey)
 * .logConfiguration(ExecuteCommandLogConfiguration.builder()
 * .cloudWatchLogGroup(logGroup)
 * .cloudWatchEncryptionEnabled(true)
 * .s3Bucket(execBucket)
 * .s3EncryptionEnabled(true)
 * .s3KeyPrefix("exec-command-output")
 * .build())
 * .logging(ExecuteCommandLogging.OVERRIDE)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ExecuteCommandLogConfigurationDsl {
  private val cdkBuilder: ExecuteCommandLogConfiguration.Builder =
      ExecuteCommandLogConfiguration.builder()

  /**
   * @param cloudWatchEncryptionEnabled Whether or not to enable encryption on the CloudWatch logs.
   */
  public fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: Boolean) {
    cdkBuilder.cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled)
  }

  /**
   * @param cloudWatchLogGroup The name of the CloudWatch log group to send logs to.
   * The CloudWatch log group must already be created.
   */
  public fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup) {
    cdkBuilder.cloudWatchLogGroup(cloudWatchLogGroup)
  }

  /**
   * @param s3Bucket The name of the S3 bucket to send logs to.
   * The S3 bucket must already be created.
   */
  public fun s3Bucket(s3Bucket: IBucket) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  /**
   * @param s3EncryptionEnabled Whether or not to enable encryption on the S3 bucket.
   */
  public fun s3EncryptionEnabled(s3EncryptionEnabled: Boolean) {
    cdkBuilder.s3EncryptionEnabled(s3EncryptionEnabled)
  }

  /**
   * @param s3KeyPrefix An optional folder in the S3 bucket to place logs in.
   */
  public fun s3KeyPrefix(s3KeyPrefix: String) {
    cdkBuilder.s3KeyPrefix(s3KeyPrefix)
  }

  public fun build(): ExecuteCommandLogConfiguration = cdkBuilder.build()
}
