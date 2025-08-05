@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining an S3 backup destination.
 *
 * S3 backup is available for all destinations, regardless of whether the final destination is S3 or
 * not.
 *
 * Example:
 *
 * ```
 * // Enable backup of all source records (to an S3 bucket created by CDK).
 * Bucket bucket;
 * // Explicitly provide an S3 bucket to which all source records will be backed up.
 * Bucket backupBucket;
 * DeliveryStream.Builder.create(this, "Delivery Stream Backup All")
 * .destination(
 * S3Bucket.Builder.create(bucket)
 * .s3Backup(DestinationS3BackupProps.builder()
 * .mode(BackupMode.ALL)
 * .build())
 * .build())
 * .build();
 * DeliveryStream.Builder.create(this, "Delivery Stream Backup All Explicit Bucket")
 * .destination(
 * S3Bucket.Builder.create(bucket)
 * .s3Backup(DestinationS3BackupProps.builder()
 * .bucket(backupBucket)
 * .build())
 * .build())
 * .build();
 * // Explicitly provide an S3 prefix under which all source records will be backed up.
 * // Explicitly provide an S3 prefix under which all source records will be backed up.
 * DeliveryStream.Builder.create(this, "Delivery Stream Backup All Explicit Prefix")
 * .destination(
 * S3Bucket.Builder.create(bucket)
 * .s3Backup(DestinationS3BackupProps.builder()
 * .mode(BackupMode.ALL)
 * .dataOutputPrefix("mybackup")
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface DestinationS3BackupProps : CommonDestinationS3Props {
  /**
   * The S3 bucket that will store data and failed records.
   *
   * Default: - If `mode` is set to `BackupMode.ALL` or `BackupMode.FAILED`, a bucket will be
   * created for you.
   */
  public fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

  /**
   * Configuration that determines whether to log errors during data transformation or delivery
   * failures, and specifies the CloudWatch log group for storing error logs.
   *
   * Default: - errors will be logged and a log group will be created for you.
   */
  public fun loggingConfig(): ILoggingConfig? =
      unwrap(this).getLoggingConfig()?.let(ILoggingConfig::wrap)

  /**
   * Indicates the mode by which incoming records should be backed up to S3, if any.
   *
   * If `bucket` is provided, this will be implicitly set to `BackupMode.ALL`.
   *
   * Default: - If `bucket` is provided, the default will be `BackupMode.ALL`. Otherwise,
   * source records are not backed up to S3.
   */
  public fun mode(): BackupMode? = unwrap(this).getMode()?.let(BackupMode::wrap)

  /**
   * A builder for [DestinationS3BackupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The S3 bucket that will store data and failed records.
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param bufferingInterval The length of time that Firehose buffers incoming data before
     * delivering it to the S3 bucket.
     * Minimum: Duration.seconds(0)
     * Maximum: Duration.seconds(900)
     */
    public fun bufferingInterval(bufferingInterval: Duration)

    /**
     * @param bufferingSize The size of the buffer that Amazon Data Firehose uses for incoming data
     * before delivering it to the S3 bucket.
     * Minimum: Size.mebibytes(1)
     * Maximum: Size.mebibytes(128)
     */
    public fun bufferingSize(bufferingSize: Size)

    /**
     * @param compression The type of compression that Amazon Data Firehose uses to compress the
     * data that it delivers to the Amazon S3 bucket.
     * The compression formats SNAPPY or ZIP cannot be specified for Amazon Redshift
     * destinations because they are not supported by the Amazon Redshift COPY operation
     * that reads from the S3 bucket.
     */
    public fun compression(compression: Compression)

    /**
     * @param dataOutputPrefix A prefix that Amazon Data Firehose evaluates and adds to records
     * before writing them to S3.
     * This prefix appears immediately following the bucket name.
     */
    public fun dataOutputPrefix(dataOutputPrefix: String)

    /**
     * @param encryptionKey The AWS KMS key used to encrypt the data that it delivers to your Amazon
     * S3 bucket.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param errorOutputPrefix A prefix that Amazon Data Firehose evaluates and adds to failed
     * records before writing them to S3.
     * This prefix appears immediately following the bucket name.
     */
    public fun errorOutputPrefix(errorOutputPrefix: String)

    /**
     * @param loggingConfig Configuration that determines whether to log errors during data
     * transformation or delivery failures, and specifies the CloudWatch log group for storing error
     * logs.
     */
    public fun loggingConfig(loggingConfig: ILoggingConfig)

    /**
     * @param mode Indicates the mode by which incoming records should be backed up to S3, if any.
     * If `bucket` is provided, this will be implicitly set to `BackupMode.ALL`.
     */
    public fun mode(mode: BackupMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisfirehose.DestinationS3BackupProps.Builder =
        software.amazon.awscdk.services.kinesisfirehose.DestinationS3BackupProps.builder()

    /**
     * @param bucket The S3 bucket that will store data and failed records.
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param bufferingInterval The length of time that Firehose buffers incoming data before
     * delivering it to the S3 bucket.
     * Minimum: Duration.seconds(0)
     * Maximum: Duration.seconds(900)
     */
    override fun bufferingInterval(bufferingInterval: Duration) {
      cdkBuilder.bufferingInterval(bufferingInterval.let(Duration.Companion::unwrap))
    }

    /**
     * @param bufferingSize The size of the buffer that Amazon Data Firehose uses for incoming data
     * before delivering it to the S3 bucket.
     * Minimum: Size.mebibytes(1)
     * Maximum: Size.mebibytes(128)
     */
    override fun bufferingSize(bufferingSize: Size) {
      cdkBuilder.bufferingSize(bufferingSize.let(Size.Companion::unwrap))
    }

    /**
     * @param compression The type of compression that Amazon Data Firehose uses to compress the
     * data that it delivers to the Amazon S3 bucket.
     * The compression formats SNAPPY or ZIP cannot be specified for Amazon Redshift
     * destinations because they are not supported by the Amazon Redshift COPY operation
     * that reads from the S3 bucket.
     */
    override fun compression(compression: Compression) {
      cdkBuilder.compression(compression.let(Compression.Companion::unwrap))
    }

    /**
     * @param dataOutputPrefix A prefix that Amazon Data Firehose evaluates and adds to records
     * before writing them to S3.
     * This prefix appears immediately following the bucket name.
     */
    override fun dataOutputPrefix(dataOutputPrefix: String) {
      cdkBuilder.dataOutputPrefix(dataOutputPrefix)
    }

    /**
     * @param encryptionKey The AWS KMS key used to encrypt the data that it delivers to your Amazon
     * S3 bucket.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param errorOutputPrefix A prefix that Amazon Data Firehose evaluates and adds to failed
     * records before writing them to S3.
     * This prefix appears immediately following the bucket name.
     */
    override fun errorOutputPrefix(errorOutputPrefix: String) {
      cdkBuilder.errorOutputPrefix(errorOutputPrefix)
    }

    /**
     * @param loggingConfig Configuration that determines whether to log errors during data
     * transformation or delivery failures, and specifies the CloudWatch log group for storing error
     * logs.
     */
    override fun loggingConfig(loggingConfig: ILoggingConfig) {
      cdkBuilder.loggingConfig(loggingConfig.let(ILoggingConfig.Companion::unwrap))
    }

    /**
     * @param mode Indicates the mode by which incoming records should be backed up to S3, if any.
     * If `bucket` is provided, this will be implicitly set to `BackupMode.ALL`.
     */
    override fun mode(mode: BackupMode) {
      cdkBuilder.mode(mode.let(BackupMode.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.DestinationS3BackupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.DestinationS3BackupProps,
  ) : CdkObject(cdkObject),
      DestinationS3BackupProps {
    /**
     * The S3 bucket that will store data and failed records.
     *
     * Default: - If `mode` is set to `BackupMode.ALL` or `BackupMode.FAILED`, a bucket will be
     * created for you.
     */
    override fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

    /**
     * The length of time that Firehose buffers incoming data before delivering it to the S3 bucket.
     *
     * Minimum: Duration.seconds(0)
     * Maximum: Duration.seconds(900)
     *
     * Default: Duration.seconds(300)
     */
    override fun bufferingInterval(): Duration? =
        unwrap(this).getBufferingInterval()?.let(Duration::wrap)

    /**
     * The size of the buffer that Amazon Data Firehose uses for incoming data before delivering it
     * to the S3 bucket.
     *
     * Minimum: Size.mebibytes(1)
     * Maximum: Size.mebibytes(128)
     *
     * Default: Size.mebibytes(5)
     */
    override fun bufferingSize(): Size? = unwrap(this).getBufferingSize()?.let(Size::wrap)

    /**
     * The type of compression that Amazon Data Firehose uses to compress the data that it delivers
     * to the Amazon S3 bucket.
     *
     * The compression formats SNAPPY or ZIP cannot be specified for Amazon Redshift
     * destinations because they are not supported by the Amazon Redshift COPY operation
     * that reads from the S3 bucket.
     *
     * Default: - UNCOMPRESSED
     */
    override fun compression(): Compression? = unwrap(this).getCompression()?.let(Compression::wrap)

    /**
     * A prefix that Amazon Data Firehose evaluates and adds to records before writing them to S3.
     *
     * This prefix appears immediately following the bucket name.
     *
     * Default: "YYYY/MM/DD/HH"
     *
     * [Documentation](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html)
     */
    override fun dataOutputPrefix(): String? = unwrap(this).getDataOutputPrefix()

    /**
     * The AWS KMS key used to encrypt the data that it delivers to your Amazon S3 bucket.
     *
     * Default: - Data is not encrypted.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * A prefix that Amazon Data Firehose evaluates and adds to failed records before writing them
     * to S3.
     *
     * This prefix appears immediately following the bucket name.
     *
     * Default: "YYYY/MM/DD/HH"
     *
     * [Documentation](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html)
     */
    override fun errorOutputPrefix(): String? = unwrap(this).getErrorOutputPrefix()

    /**
     * Configuration that determines whether to log errors during data transformation or delivery
     * failures, and specifies the CloudWatch log group for storing error logs.
     *
     * Default: - errors will be logged and a log group will be created for you.
     */
    override fun loggingConfig(): ILoggingConfig? =
        unwrap(this).getLoggingConfig()?.let(ILoggingConfig::wrap)

    /**
     * Indicates the mode by which incoming records should be backed up to S3, if any.
     *
     * If `bucket` is provided, this will be implicitly set to `BackupMode.ALL`.
     *
     * Default: - If `bucket` is provided, the default will be `BackupMode.ALL`. Otherwise,
     * source records are not backed up to S3.
     */
    override fun mode(): BackupMode? = unwrap(this).getMode()?.let(BackupMode::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DestinationS3BackupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.DestinationS3BackupProps):
        DestinationS3BackupProps = CdkObjectWrappers.wrap(cdkObject) as? DestinationS3BackupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DestinationS3BackupProps):
        software.amazon.awscdk.services.kinesisfirehose.DestinationS3BackupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisfirehose.DestinationS3BackupProps
  }
}
