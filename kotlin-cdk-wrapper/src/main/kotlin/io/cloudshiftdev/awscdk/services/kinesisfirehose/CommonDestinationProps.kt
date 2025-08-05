@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Generic properties for defining a delivery stream destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * Compression compression;
 * IDataProcessor dataProcessor;
 * Key key;
 * ILoggingConfig loggingConfig;
 * Role role;
 * Size size;
 * CommonDestinationProps commonDestinationProps = CommonDestinationProps.builder()
 * .loggingConfig(loggingConfig)
 * .processor(dataProcessor)
 * .role(role)
 * .s3Backup(DestinationS3BackupProps.builder()
 * .bucket(bucket)
 * .bufferingInterval(Duration.minutes(30))
 * .bufferingSize(size)
 * .compression(compression)
 * .dataOutputPrefix("dataOutputPrefix")
 * .encryptionKey(key)
 * .errorOutputPrefix("errorOutputPrefix")
 * .loggingConfig(loggingConfig)
 * .mode(BackupMode.ALL)
 * .build())
 * .build();
 * ```
 */
public interface CommonDestinationProps {
  /**
   * Configuration that determines whether to log errors during data transformation or delivery
   * failures, and specifies the CloudWatch log group for storing error logs.
   *
   * Default: - errors will be logged and a log group will be created for you.
   */
  public fun loggingConfig(): ILoggingConfig? =
      unwrap(this).getLoggingConfig()?.let(ILoggingConfig::wrap)

  /**
   * The data transformation that should be performed on the data before writing to the destination.
   *
   * Default: - no data transformation will occur.
   */
  public fun processor(): IDataProcessor? = unwrap(this).getProcessor()?.let(IDataProcessor::wrap)

  /**
   * The IAM role associated with this destination.
   *
   * Assumed by Amazon Data Firehose to invoke processors and write to destinations
   *
   * Default: - a role will be created with default permissions.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * The configuration for backing up source records to S3.
   *
   * Default: - source records will not be backed up to S3.
   */
  public fun s3Backup(): DestinationS3BackupProps? =
      unwrap(this).getS3Backup()?.let(DestinationS3BackupProps::wrap)

  /**
   * A builder for [CommonDestinationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param loggingConfig Configuration that determines whether to log errors during data
     * transformation or delivery failures, and specifies the CloudWatch log group for storing error
     * logs.
     */
    public fun loggingConfig(loggingConfig: ILoggingConfig)

    /**
     * @param processor The data transformation that should be performed on the data before writing
     * to the destination.
     */
    public fun processor(processor: IDataProcessor)

    /**
     * @param role The IAM role associated with this destination.
     * Assumed by Amazon Data Firehose to invoke processors and write to destinations
     */
    public fun role(role: IRole)

    /**
     * @param s3Backup The configuration for backing up source records to S3.
     */
    public fun s3Backup(s3Backup: DestinationS3BackupProps)

    /**
     * @param s3Backup The configuration for backing up source records to S3.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b59b1d807384c405594464d541188b3b2655bf74a2556f7984f2a1abe127c863")
    public fun s3Backup(s3Backup: DestinationS3BackupProps.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisfirehose.CommonDestinationProps.Builder =
        software.amazon.awscdk.services.kinesisfirehose.CommonDestinationProps.builder()

    /**
     * @param loggingConfig Configuration that determines whether to log errors during data
     * transformation or delivery failures, and specifies the CloudWatch log group for storing error
     * logs.
     */
    override fun loggingConfig(loggingConfig: ILoggingConfig) {
      cdkBuilder.loggingConfig(loggingConfig.let(ILoggingConfig.Companion::unwrap))
    }

    /**
     * @param processor The data transformation that should be performed on the data before writing
     * to the destination.
     */
    override fun processor(processor: IDataProcessor) {
      cdkBuilder.processor(processor.let(IDataProcessor.Companion::unwrap))
    }

    /**
     * @param role The IAM role associated with this destination.
     * Assumed by Amazon Data Firehose to invoke processors and write to destinations
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param s3Backup The configuration for backing up source records to S3.
     */
    override fun s3Backup(s3Backup: DestinationS3BackupProps) {
      cdkBuilder.s3Backup(s3Backup.let(DestinationS3BackupProps.Companion::unwrap))
    }

    /**
     * @param s3Backup The configuration for backing up source records to S3.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b59b1d807384c405594464d541188b3b2655bf74a2556f7984f2a1abe127c863")
    override fun s3Backup(s3Backup: DestinationS3BackupProps.Builder.() -> Unit): Unit =
        s3Backup(DestinationS3BackupProps(s3Backup))

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.CommonDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.CommonDestinationProps,
  ) : CdkObject(cdkObject),
      CommonDestinationProps {
    /**
     * Configuration that determines whether to log errors during data transformation or delivery
     * failures, and specifies the CloudWatch log group for storing error logs.
     *
     * Default: - errors will be logged and a log group will be created for you.
     */
    override fun loggingConfig(): ILoggingConfig? =
        unwrap(this).getLoggingConfig()?.let(ILoggingConfig::wrap)

    /**
     * The data transformation that should be performed on the data before writing to the
     * destination.
     *
     * Default: - no data transformation will occur.
     */
    override fun processor(): IDataProcessor? =
        unwrap(this).getProcessor()?.let(IDataProcessor::wrap)

    /**
     * The IAM role associated with this destination.
     *
     * Assumed by Amazon Data Firehose to invoke processors and write to destinations
     *
     * Default: - a role will be created with default permissions.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The configuration for backing up source records to S3.
     *
     * Default: - source records will not be backed up to S3.
     */
    override fun s3Backup(): DestinationS3BackupProps? =
        unwrap(this).getS3Backup()?.let(DestinationS3BackupProps::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CommonDestinationProps):
        CommonDestinationProps = CdkObjectWrappers.wrap(cdkObject) as? CommonDestinationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonDestinationProps):
        software.amazon.awscdk.services.kinesisfirehose.CommonDestinationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisfirehose.CommonDestinationProps
  }
}
