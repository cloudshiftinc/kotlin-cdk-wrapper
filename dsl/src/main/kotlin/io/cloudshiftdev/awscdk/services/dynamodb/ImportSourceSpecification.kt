package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

public interface ImportSourceSpecification {
  /**
   * The S3 bucket that is being imported from.
   */
  public fun bucket(): IBucket

  /**
   * The account number of the S3 bucket that is being imported from.
   *
   * Default: - no value
   */
  public fun bucketOwner(): String? = unwrap(this).getBucketOwner()

  /**
   * The compression type of the imported data.
   *
   * Default: InputCompressionType.NONE
   */
  public fun compressionType(): InputCompressionType? =
      unwrap(this).getCompressionType()?.let(InputCompressionType::wrap)

  /**
   * The format of the imported data.
   */
  public fun inputFormat(): InputFormat

  /**
   * The key prefix shared by all S3 Objects that are being imported.
   *
   * Default: - no value
   */
  public fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

  /**
   * A builder for [ImportSourceSpecification]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The S3 bucket that is being imported from. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param bucketOwner The account number of the S3 bucket that is being imported from.
     */
    public fun bucketOwner(bucketOwner: String)

    /**
     * @param compressionType The compression type of the imported data.
     */
    public fun compressionType(compressionType: InputCompressionType)

    /**
     * @param inputFormat The format of the imported data. 
     */
    public fun inputFormat(inputFormat: InputFormat)

    /**
     * @param keyPrefix The key prefix shared by all S3 Objects that are being imported.
     */
    public fun keyPrefix(keyPrefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dynamodb.ImportSourceSpecification.Builder =
        software.amazon.awscdk.services.dynamodb.ImportSourceSpecification.builder()

    /**
     * @param bucket The S3 bucket that is being imported from. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    /**
     * @param bucketOwner The account number of the S3 bucket that is being imported from.
     */
    override fun bucketOwner(bucketOwner: String) {
      cdkBuilder.bucketOwner(bucketOwner)
    }

    /**
     * @param compressionType The compression type of the imported data.
     */
    override fun compressionType(compressionType: InputCompressionType) {
      cdkBuilder.compressionType(compressionType.let(InputCompressionType::unwrap))
    }

    /**
     * @param inputFormat The format of the imported data. 
     */
    override fun inputFormat(inputFormat: InputFormat) {
      cdkBuilder.inputFormat(inputFormat.let(InputFormat::unwrap))
    }

    /**
     * @param keyPrefix The key prefix shared by all S3 Objects that are being imported.
     */
    override fun keyPrefix(keyPrefix: String) {
      cdkBuilder.keyPrefix(keyPrefix)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.ImportSourceSpecification =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.ImportSourceSpecification,
  ) : CdkObject(cdkObject), ImportSourceSpecification {
    /**
     * The S3 bucket that is being imported from.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * The account number of the S3 bucket that is being imported from.
     *
     * Default: - no value
     */
    override fun bucketOwner(): String? = unwrap(this).getBucketOwner()

    /**
     * The compression type of the imported data.
     *
     * Default: InputCompressionType.NONE
     */
    override fun compressionType(): InputCompressionType? =
        unwrap(this).getCompressionType()?.let(InputCompressionType::wrap)

    /**
     * The format of the imported data.
     */
    override fun inputFormat(): InputFormat = unwrap(this).getInputFormat().let(InputFormat::wrap)

    /**
     * The key prefix shared by all S3 Objects that are being imported.
     *
     * Default: - no value
     */
    override fun keyPrefix(): String? = unwrap(this).getKeyPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ImportSourceSpecification {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.ImportSourceSpecification):
        ImportSourceSpecification = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ImportSourceSpecification):
        software.amazon.awscdk.services.dynamodb.ImportSourceSpecification = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.ImportSourceSpecification
  }
}
