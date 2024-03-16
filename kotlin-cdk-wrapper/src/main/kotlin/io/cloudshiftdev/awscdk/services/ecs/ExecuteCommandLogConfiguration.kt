@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

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
public interface ExecuteCommandLogConfiguration {
  /**
   * Whether or not to enable encryption on the CloudWatch logs.
   *
   * Default: - encryption will be disabled.
   */
  public fun cloudWatchEncryptionEnabled(): Boolean? = unwrap(this).getCloudWatchEncryptionEnabled()

  /**
   * The name of the CloudWatch log group to send logs to.
   *
   * The CloudWatch log group must already be created.
   *
   * Default: - none
   */
  public fun cloudWatchLogGroup(): ILogGroup? =
      unwrap(this).getCloudWatchLogGroup()?.let(ILogGroup::wrap)

  /**
   * The name of the S3 bucket to send logs to.
   *
   * The S3 bucket must already be created.
   *
   * Default: - none
   */
  public fun s3Bucket(): IBucket? = unwrap(this).getS3Bucket()?.let(IBucket::wrap)

  /**
   * Whether or not to enable encryption on the S3 bucket.
   *
   * Default: - encryption will be disabled.
   */
  public fun s3EncryptionEnabled(): Boolean? = unwrap(this).getS3EncryptionEnabled()

  /**
   * An optional folder in the S3 bucket to place logs in.
   *
   * Default: - none
   */
  public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

  /**
   * A builder for [ExecuteCommandLogConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cloudWatchEncryptionEnabled Whether or not to enable encryption on the CloudWatch
     * logs.
     */
    public fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: Boolean)

    /**
     * @param cloudWatchLogGroup The name of the CloudWatch log group to send logs to.
     * The CloudWatch log group must already be created.
     */
    public fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup)

    /**
     * @param s3Bucket The name of the S3 bucket to send logs to.
     * The S3 bucket must already be created.
     */
    public fun s3Bucket(s3Bucket: IBucket)

    /**
     * @param s3EncryptionEnabled Whether or not to enable encryption on the S3 bucket.
     */
    public fun s3EncryptionEnabled(s3EncryptionEnabled: Boolean)

    /**
     * @param s3KeyPrefix An optional folder in the S3 bucket to place logs in.
     */
    public fun s3KeyPrefix(s3KeyPrefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration.Builder =
        software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration.builder()

    /**
     * @param cloudWatchEncryptionEnabled Whether or not to enable encryption on the CloudWatch
     * logs.
     */
    override fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: Boolean) {
      cdkBuilder.cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled)
    }

    /**
     * @param cloudWatchLogGroup The name of the CloudWatch log group to send logs to.
     * The CloudWatch log group must already be created.
     */
    override fun cloudWatchLogGroup(cloudWatchLogGroup: ILogGroup) {
      cdkBuilder.cloudWatchLogGroup(cloudWatchLogGroup.let(ILogGroup::unwrap))
    }

    /**
     * @param s3Bucket The name of the S3 bucket to send logs to.
     * The S3 bucket must already be created.
     */
    override fun s3Bucket(s3Bucket: IBucket) {
      cdkBuilder.s3Bucket(s3Bucket.let(IBucket::unwrap))
    }

    /**
     * @param s3EncryptionEnabled Whether or not to enable encryption on the S3 bucket.
     */
    override fun s3EncryptionEnabled(s3EncryptionEnabled: Boolean) {
      cdkBuilder.s3EncryptionEnabled(s3EncryptionEnabled)
    }

    /**
     * @param s3KeyPrefix An optional folder in the S3 bucket to place logs in.
     */
    override fun s3KeyPrefix(s3KeyPrefix: String) {
      cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration,
  ) : CdkObject(cdkObject), ExecuteCommandLogConfiguration {
    /**
     * Whether or not to enable encryption on the CloudWatch logs.
     *
     * Default: - encryption will be disabled.
     */
    override fun cloudWatchEncryptionEnabled(): Boolean? =
        unwrap(this).getCloudWatchEncryptionEnabled()

    /**
     * The name of the CloudWatch log group to send logs to.
     *
     * The CloudWatch log group must already be created.
     *
     * Default: - none
     */
    override fun cloudWatchLogGroup(): ILogGroup? =
        unwrap(this).getCloudWatchLogGroup()?.let(ILogGroup::wrap)

    /**
     * The name of the S3 bucket to send logs to.
     *
     * The S3 bucket must already be created.
     *
     * Default: - none
     */
    override fun s3Bucket(): IBucket? = unwrap(this).getS3Bucket()?.let(IBucket::wrap)

    /**
     * Whether or not to enable encryption on the S3 bucket.
     *
     * Default: - encryption will be disabled.
     */
    override fun s3EncryptionEnabled(): Boolean? = unwrap(this).getS3EncryptionEnabled()

    /**
     * An optional folder in the S3 bucket to place logs in.
     *
     * Default: - none
     */
    override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExecuteCommandLogConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration):
        ExecuteCommandLogConfiguration = CdkObjectWrappers.wrap(cdkObject) as
        ExecuteCommandLogConfiguration

    internal fun unwrap(wrapped: ExecuteCommandLogConfiguration):
        software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration
  }
}
