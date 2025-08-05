@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.TimeZone
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.s3.IBucket as CloudshiftdevAwscdkServicesS3IBucket
import software.amazon.awscdk.services.s3.IBucket as AmazonAwscdkServicesS3IBucket

/**
 * An S3 bucket destination for data from an Amazon Data Firehose delivery stream.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * Bucket bucket = new Bucket(this, "MyBucket");
 * DeliveryStream stream = DeliveryStream.Builder.create(this, "MyStream")
 * .destination(new S3Bucket(bucket))
 * .build();
 * TopicRule topicRule = TopicRule.Builder.create(this, "TopicRule")
 * .sql(IotSql.fromStringAsVer20160323("SELECT * FROM 'device/+/data'"))
 * .actions(List.of(
 * FirehosePutRecordAction.Builder.create(stream)
 * .batchMode(true)
 * .recordSeparator(FirehoseRecordSeparator.NEWLINE)
 * .build()))
 * .build();
 * ```
 */
public open class S3Bucket(
  cdkObject: software.amazon.awscdk.services.kinesisfirehose.S3Bucket,
) : CdkObject(cdkObject),
    IDestination {
  public constructor(bucket: CloudshiftdevAwscdkServicesS3IBucket) :
      this(software.amazon.awscdk.services.kinesisfirehose.S3Bucket(bucket.let(CloudshiftdevAwscdkServicesS3IBucket.Companion::unwrap))
  )

  public constructor(bucket: CloudshiftdevAwscdkServicesS3IBucket, props: S3BucketProps) :
      this(software.amazon.awscdk.services.kinesisfirehose.S3Bucket(bucket.let(CloudshiftdevAwscdkServicesS3IBucket.Companion::unwrap),
      props.let(S3BucketProps.Companion::unwrap))
  )

  public constructor(bucket: CloudshiftdevAwscdkServicesS3IBucket,
      props: S3BucketProps.Builder.() -> Unit) : this(bucket, S3BucketProps(props)
  )

  /**
   * Binds this destination to the Amazon Data Firehose delivery stream.
   *
   * Implementers should use this method to bind resources to the stack and initialize values using
   * the provided stream.
   *
   * @param scope 
   * @param _options 
   */
  public override fun bind(scope: Construct, options: DestinationBindOptions): DestinationConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      options.let(DestinationBindOptions.Companion::unwrap)).let(DestinationConfig::wrap)

  /**
   * Binds this destination to the Amazon Data Firehose delivery stream.
   *
   * Implementers should use this method to bind resources to the stack and initialize values using
   * the provided stream.
   *
   * @param scope 
   * @param _options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5dca4bf968b267ecaeaeefaa40b64a5dce716ac1e5339251727f13f209597a70")
  public override fun bind(scope: Construct, options: DestinationBindOptions.Builder.() -> Unit):
      DestinationConfig = bind(scope, DestinationBindOptions(options))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kinesisfirehose.S3Bucket].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The length of time that Firehose buffers incoming data before delivering it to the S3 bucket.
     *
     * Minimum: Duration.seconds(0)
     * Maximum: Duration.seconds(900)
     *
     * Default: Duration.seconds(300)
     *
     * @param bufferingInterval The length of time that Firehose buffers incoming data before
     * delivering it to the S3 bucket. 
     */
    public fun bufferingInterval(bufferingInterval: Duration)

    /**
     * The size of the buffer that Amazon Data Firehose uses for incoming data before delivering it
     * to the S3 bucket.
     *
     * Minimum: Size.mebibytes(1)
     * Maximum: Size.mebibytes(128)
     *
     * Default: Size.mebibytes(5)
     *
     * @param bufferingSize The size of the buffer that Amazon Data Firehose uses for incoming data
     * before delivering it to the S3 bucket. 
     */
    public fun bufferingSize(bufferingSize: Size)

    /**
     * The type of compression that Amazon Data Firehose uses to compress the data that it delivers
     * to the Amazon S3 bucket.
     *
     * The compression formats SNAPPY or ZIP cannot be specified for Amazon Redshift
     * destinations because they are not supported by the Amazon Redshift COPY operation
     * that reads from the S3 bucket.
     *
     * Default: - UNCOMPRESSED
     *
     * @param compression The type of compression that Amazon Data Firehose uses to compress the
     * data that it delivers to the Amazon S3 bucket. 
     */
    public fun compression(compression: Compression)

    /**
     * A prefix that Amazon Data Firehose evaluates and adds to records before writing them to S3.
     *
     * This prefix appears immediately following the bucket name.
     *
     * Default: "YYYY/MM/DD/HH"
     *
     * [Documentation](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html)
     * @param dataOutputPrefix A prefix that Amazon Data Firehose evaluates and adds to records
     * before writing them to S3. 
     */
    public fun dataOutputPrefix(dataOutputPrefix: String)

    /**
     * The AWS KMS key used to encrypt the data that it delivers to your Amazon S3 bucket.
     *
     * Default: - Data is not encrypted.
     *
     * @param encryptionKey The AWS KMS key used to encrypt the data that it delivers to your Amazon
     * S3 bucket. 
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * A prefix that Amazon Data Firehose evaluates and adds to failed records before writing them
     * to S3.
     *
     * This prefix appears immediately following the bucket name.
     *
     * Default: "YYYY/MM/DD/HH"
     *
     * [Documentation](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html)
     * @param errorOutputPrefix A prefix that Amazon Data Firehose evaluates and adds to failed
     * records before writing them to S3. 
     */
    public fun errorOutputPrefix(errorOutputPrefix: String)

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
     * @param fileExtension Specify a file extension. 
     */
    public fun fileExtension(fileExtension: String)

    /**
     * Configuration that determines whether to log errors during data transformation or delivery
     * failures, and specifies the CloudWatch log group for storing error logs.
     *
     * Default: - errors will be logged and a log group will be created for you.
     *
     * @param loggingConfig Configuration that determines whether to log errors during data
     * transformation or delivery failures, and specifies the CloudWatch log group for storing error
     * logs. 
     */
    public fun loggingConfig(loggingConfig: ILoggingConfig)

    /**
     * The data transformation that should be performed on the data before writing to the
     * destination.
     *
     * Default: - no data transformation will occur.
     *
     * @param processor The data transformation that should be performed on the data before writing
     * to the destination. 
     */
    public fun processor(processor: IDataProcessor)

    /**
     * The IAM role associated with this destination.
     *
     * Assumed by Amazon Data Firehose to invoke processors and write to destinations
     *
     * Default: - a role will be created with default permissions.
     *
     * @param role The IAM role associated with this destination. 
     */
    public fun role(role: IRole)

    /**
     * The configuration for backing up source records to S3.
     *
     * Default: - source records will not be backed up to S3.
     *
     * @param s3Backup The configuration for backing up source records to S3. 
     */
    public fun s3Backup(s3Backup: DestinationS3BackupProps)

    /**
     * The configuration for backing up source records to S3.
     *
     * Default: - source records will not be backed up to S3.
     *
     * @param s3Backup The configuration for backing up source records to S3. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09f40cfd214ce6802e64741baeb549c8b232bb5f802d8b6f32d9598551553146")
    public fun s3Backup(s3Backup: DestinationS3BackupProps.Builder.() -> Unit)

    /**
     * The time zone you prefer.
     *
     * Default: - UTC
     *
     * [Documentation](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html#timestamp-namespace)
     * @param timeZone The time zone you prefer. 
     */
    public fun timeZone(timeZone: TimeZone)
  }

  private class BuilderImpl(
    bucket: AmazonAwscdkServicesS3IBucket,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesisfirehose.S3Bucket.Builder =
        software.amazon.awscdk.services.kinesisfirehose.S3Bucket.Builder.create(bucket)

    /**
     * The length of time that Firehose buffers incoming data before delivering it to the S3 bucket.
     *
     * Minimum: Duration.seconds(0)
     * Maximum: Duration.seconds(900)
     *
     * Default: Duration.seconds(300)
     *
     * @param bufferingInterval The length of time that Firehose buffers incoming data before
     * delivering it to the S3 bucket. 
     */
    override fun bufferingInterval(bufferingInterval: Duration) {
      cdkBuilder.bufferingInterval(bufferingInterval.let(Duration.Companion::unwrap))
    }

    /**
     * The size of the buffer that Amazon Data Firehose uses for incoming data before delivering it
     * to the S3 bucket.
     *
     * Minimum: Size.mebibytes(1)
     * Maximum: Size.mebibytes(128)
     *
     * Default: Size.mebibytes(5)
     *
     * @param bufferingSize The size of the buffer that Amazon Data Firehose uses for incoming data
     * before delivering it to the S3 bucket. 
     */
    override fun bufferingSize(bufferingSize: Size) {
      cdkBuilder.bufferingSize(bufferingSize.let(Size.Companion::unwrap))
    }

    /**
     * The type of compression that Amazon Data Firehose uses to compress the data that it delivers
     * to the Amazon S3 bucket.
     *
     * The compression formats SNAPPY or ZIP cannot be specified for Amazon Redshift
     * destinations because they are not supported by the Amazon Redshift COPY operation
     * that reads from the S3 bucket.
     *
     * Default: - UNCOMPRESSED
     *
     * @param compression The type of compression that Amazon Data Firehose uses to compress the
     * data that it delivers to the Amazon S3 bucket. 
     */
    override fun compression(compression: Compression) {
      cdkBuilder.compression(compression.let(Compression.Companion::unwrap))
    }

    /**
     * A prefix that Amazon Data Firehose evaluates and adds to records before writing them to S3.
     *
     * This prefix appears immediately following the bucket name.
     *
     * Default: "YYYY/MM/DD/HH"
     *
     * [Documentation](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html)
     * @param dataOutputPrefix A prefix that Amazon Data Firehose evaluates and adds to records
     * before writing them to S3. 
     */
    override fun dataOutputPrefix(dataOutputPrefix: String) {
      cdkBuilder.dataOutputPrefix(dataOutputPrefix)
    }

    /**
     * The AWS KMS key used to encrypt the data that it delivers to your Amazon S3 bucket.
     *
     * Default: - Data is not encrypted.
     *
     * @param encryptionKey The AWS KMS key used to encrypt the data that it delivers to your Amazon
     * S3 bucket. 
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * A prefix that Amazon Data Firehose evaluates and adds to failed records before writing them
     * to S3.
     *
     * This prefix appears immediately following the bucket name.
     *
     * Default: "YYYY/MM/DD/HH"
     *
     * [Documentation](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html)
     * @param errorOutputPrefix A prefix that Amazon Data Firehose evaluates and adds to failed
     * records before writing them to S3. 
     */
    override fun errorOutputPrefix(errorOutputPrefix: String) {
      cdkBuilder.errorOutputPrefix(errorOutputPrefix)
    }

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
     * @param fileExtension Specify a file extension. 
     */
    override fun fileExtension(fileExtension: String) {
      cdkBuilder.fileExtension(fileExtension)
    }

    /**
     * Configuration that determines whether to log errors during data transformation or delivery
     * failures, and specifies the CloudWatch log group for storing error logs.
     *
     * Default: - errors will be logged and a log group will be created for you.
     *
     * @param loggingConfig Configuration that determines whether to log errors during data
     * transformation or delivery failures, and specifies the CloudWatch log group for storing error
     * logs. 
     */
    override fun loggingConfig(loggingConfig: ILoggingConfig) {
      cdkBuilder.loggingConfig(loggingConfig.let(ILoggingConfig.Companion::unwrap))
    }

    /**
     * The data transformation that should be performed on the data before writing to the
     * destination.
     *
     * Default: - no data transformation will occur.
     *
     * @param processor The data transformation that should be performed on the data before writing
     * to the destination. 
     */
    override fun processor(processor: IDataProcessor) {
      cdkBuilder.processor(processor.let(IDataProcessor.Companion::unwrap))
    }

    /**
     * The IAM role associated with this destination.
     *
     * Assumed by Amazon Data Firehose to invoke processors and write to destinations
     *
     * Default: - a role will be created with default permissions.
     *
     * @param role The IAM role associated with this destination. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * The configuration for backing up source records to S3.
     *
     * Default: - source records will not be backed up to S3.
     *
     * @param s3Backup The configuration for backing up source records to S3. 
     */
    override fun s3Backup(s3Backup: DestinationS3BackupProps) {
      cdkBuilder.s3Backup(s3Backup.let(DestinationS3BackupProps.Companion::unwrap))
    }

    /**
     * The configuration for backing up source records to S3.
     *
     * Default: - source records will not be backed up to S3.
     *
     * @param s3Backup The configuration for backing up source records to S3. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09f40cfd214ce6802e64741baeb549c8b232bb5f802d8b6f32d9598551553146")
    override fun s3Backup(s3Backup: DestinationS3BackupProps.Builder.() -> Unit): Unit =
        s3Backup(DestinationS3BackupProps(s3Backup))

    /**
     * The time zone you prefer.
     *
     * Default: - UTC
     *
     * [Documentation](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html#timestamp-namespace)
     * @param timeZone The time zone you prefer. 
     */
    override fun timeZone(timeZone: TimeZone) {
      cdkBuilder.timeZone(timeZone.let(TimeZone.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.S3Bucket =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(bucket: CloudshiftdevAwscdkServicesS3IBucket,
        block: Builder.() -> Unit = {}): S3Bucket {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesS3IBucket.unwrap(bucket))
      return S3Bucket(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.S3Bucket): S3Bucket
        = S3Bucket(cdkObject)

    internal fun unwrap(wrapped: S3Bucket): software.amazon.awscdk.services.kinesisfirehose.S3Bucket
        = wrapped.cdkObject as software.amazon.awscdk.services.kinesisfirehose.S3Bucket
  }
}
