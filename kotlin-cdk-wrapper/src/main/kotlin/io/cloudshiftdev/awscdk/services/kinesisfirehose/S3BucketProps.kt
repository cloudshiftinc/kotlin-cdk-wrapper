@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.TimeZone
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Props for defining an S3 destination of an Amazon Data Firehose delivery stream.
 *
 * Example:
 *
 * ```
 * Bucket bucket;
 * // Provide a Lambda function that will transform records before delivery, with custom
 * // buffering and retry configuration
 * Function lambdaFunction = Function.Builder.create(this, "Processor")
 * .runtime(Runtime.NODEJS_LATEST)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "process-records")))
 * .build();
 * LambdaFunctionProcessor lambdaProcessor = LambdaFunctionProcessor.Builder.create(lambdaFunction)
 * .bufferInterval(Duration.minutes(5))
 * .bufferSize(Size.mebibytes(5))
 * .retries(5)
 * .build();
 * S3Bucket s3Destination = S3Bucket.Builder.create(bucket)
 * .processor(lambdaProcessor)
 * .build();
 * DeliveryStream.Builder.create(this, "Delivery Stream")
 * .destination(s3Destination)
 * .build();
 * ```
 */
public interface S3BucketProps : CommonDestinationS3Props, CommonDestinationProps {
  /**
   * Specify a file extension.
   *
   * It will override the default file extension appended by Data Format Conversion or S3
   * compression features such as `.parquet` or `.gz`.
   *
   * File extension must start with a period (`.`) and can contain allowed characters:
   * `0-9a-z!-_.*'()`.
   *
   * Default: - The default file extension appended by Data Format Conversion or S3 compression
   * features
   *
   * [Documentation](https://docs.aws.amazon.com/firehose/latest/dev/create-destination.html#create-destination-s3)
   */
  public fun fileExtension(): String? = unwrap(this).getFileExtension()

  /**
   * The time zone you prefer.
   *
   * Default: - UTC
   *
   * [Documentation](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html#timestamp-namespace)
   */
  public fun timeZone(): TimeZone? = unwrap(this).getTimeZone()?.let(TimeZone::wrap)

  /**
   * A builder for [S3BucketProps]
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param fileExtension Specify a file extension.
     * It will override the default file extension appended by Data Format Conversion or S3
     * compression features such as `.parquet` or `.gz`.
     *
     * File extension must start with a period (`.`) and can contain allowed characters:
     * `0-9a-z!-_.*'()`.
     */
    public fun fileExtension(fileExtension: String)

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
    @JvmName("35b950f7699640871dbe913a9f75dcc636396ca602be5ce8235db4d26ce90fd9")
    public fun s3Backup(s3Backup: DestinationS3BackupProps.Builder.() -> Unit)

    /**
     * @param timeZone The time zone you prefer.
     */
    public fun timeZone(timeZone: TimeZone)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesisfirehose.S3BucketProps.Builder =
        software.amazon.awscdk.services.kinesisfirehose.S3BucketProps.builder()

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
     * @param fileExtension Specify a file extension.
     * It will override the default file extension appended by Data Format Conversion or S3
     * compression features such as `.parquet` or `.gz`.
     *
     * File extension must start with a period (`.`) and can contain allowed characters:
     * `0-9a-z!-_.*'()`.
     */
    override fun fileExtension(fileExtension: String) {
      cdkBuilder.fileExtension(fileExtension)
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
    @JvmName("35b950f7699640871dbe913a9f75dcc636396ca602be5ce8235db4d26ce90fd9")
    override fun s3Backup(s3Backup: DestinationS3BackupProps.Builder.() -> Unit): Unit =
        s3Backup(DestinationS3BackupProps(s3Backup))

    /**
     * @param timeZone The time zone you prefer.
     */
    override fun timeZone(timeZone: TimeZone) {
      cdkBuilder.timeZone(timeZone.let(TimeZone.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.S3BucketProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.S3BucketProps,
  ) : CdkObject(cdkObject),
      S3BucketProps {
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
     * Specify a file extension.
     *
     * It will override the default file extension appended by Data Format Conversion or S3
     * compression features such as `.parquet` or `.gz`.
     *
     * File extension must start with a period (`.`) and can contain allowed characters:
     * `0-9a-z!-_.*'()`.
     *
     * Default: - The default file extension appended by Data Format Conversion or S3 compression
     * features
     *
     * [Documentation](https://docs.aws.amazon.com/firehose/latest/dev/create-destination.html#create-destination-s3)
     */
    override fun fileExtension(): String? = unwrap(this).getFileExtension()

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

    /**
     * The time zone you prefer.
     *
     * Default: - UTC
     *
     * [Documentation](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html#timestamp-namespace)
     */
    override fun timeZone(): TimeZone? = unwrap(this).getTimeZone()?.let(TimeZone::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3BucketProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.S3BucketProps):
        S3BucketProps = CdkObjectWrappers.wrap(cdkObject) as? S3BucketProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3BucketProps):
        software.amazon.awscdk.services.kinesisfirehose.S3BucketProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesisfirehose.S3BucketProps
  }
}
