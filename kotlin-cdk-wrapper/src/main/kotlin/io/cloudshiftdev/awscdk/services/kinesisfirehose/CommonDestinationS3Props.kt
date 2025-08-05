@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

/**
 * Common properties for defining a backup, intermediary, or final S3 destination for a Amazon Data
 * Firehose delivery stream.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * Compression compression;
 * Key key;
 * Size size;
 * CommonDestinationS3Props commonDestinationS3Props = CommonDestinationS3Props.builder()
 * .bufferingInterval(Duration.minutes(30))
 * .bufferingSize(size)
 * .compression(compression)
 * .dataOutputPrefix("dataOutputPrefix")
 * .encryptionKey(key)
 * .errorOutputPrefix("errorOutputPrefix")
 * .build();
 * ```
 */
public interface CommonDestinationS3Props {
  /**
   * The length of time that Firehose buffers incoming data before delivering it to the S3 bucket.
   *
   * Minimum: Duration.seconds(0)
   * Maximum: Duration.seconds(900)
   *
   * Default: Duration.seconds(300)
   */
  public fun bufferingInterval(): Duration? =
      unwrap(this).getBufferingInterval()?.let(Duration::wrap)

  /**
   * The size of the buffer that Amazon Data Firehose uses for incoming data before delivering it to
   * the S3 bucket.
   *
   * Minimum: Size.mebibytes(1)
   * Maximum: Size.mebibytes(128)
   *
   * Default: Size.mebibytes(5)
   */
  public fun bufferingSize(): Size? = unwrap(this).getBufferingSize()?.let(Size::wrap)

  /**
   * The type of compression that Amazon Data Firehose uses to compress the data that it delivers to
   * the Amazon S3 bucket.
   *
   * The compression formats SNAPPY or ZIP cannot be specified for Amazon Redshift
   * destinations because they are not supported by the Amazon Redshift COPY operation
   * that reads from the S3 bucket.
   *
   * Default: - UNCOMPRESSED
   */
  public fun compression(): Compression? = unwrap(this).getCompression()?.let(Compression::wrap)

  /**
   * A prefix that Amazon Data Firehose evaluates and adds to records before writing them to S3.
   *
   * This prefix appears immediately following the bucket name.
   *
   * Default: "YYYY/MM/DD/HH"
   *
   * [Documentation](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html)
   */
  public fun dataOutputPrefix(): String? = unwrap(this).getDataOutputPrefix()

  /**
   * The AWS KMS key used to encrypt the data that it delivers to your Amazon S3 bucket.
   *
   * Default: - Data is not encrypted.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * A prefix that Amazon Data Firehose evaluates and adds to failed records before writing them to
   * S3.
   *
   * This prefix appears immediately following the bucket name.
   *
   * Default: "YYYY/MM/DD/HH"
   *
   * [Documentation](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html)
   */
  public fun errorOutputPrefix(): String? = unwrap(this).getErrorOutputPrefix()

  /**
   * A builder for [CommonDestinationS3Props]
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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisfirehose.CommonDestinationS3Props.Builder =
        software.amazon.awscdk.services.kinesisfirehose.CommonDestinationS3Props.builder()

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

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.CommonDestinationS3Props =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.CommonDestinationS3Props,
  ) : CdkObject(cdkObject),
      CommonDestinationS3Props {
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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonDestinationS3Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.CommonDestinationS3Props):
        CommonDestinationS3Props = CdkObjectWrappers.wrap(cdkObject) as? CommonDestinationS3Props ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonDestinationS3Props):
        software.amazon.awscdk.services.kinesisfirehose.CommonDestinationS3Props = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisfirehose.CommonDestinationS3Props
  }
}
