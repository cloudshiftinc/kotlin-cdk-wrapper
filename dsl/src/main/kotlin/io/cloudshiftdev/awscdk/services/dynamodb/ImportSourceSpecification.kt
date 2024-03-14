package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

public interface ImportSourceSpecification {
  public fun bucket(): IBucket

  public fun bucketOwner(): String? = unwrap(this).getBucketOwner()

  public fun compressionType(): InputCompressionType? =
      unwrap(this).getCompressionType()?.let(InputCompressionType::wrap)

  public fun inputFormat(): InputFormat

  public fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

  public interface Builder {
    public fun bucket(bucket: IBucket) {
    }

    public fun bucketOwner(bucketOwner: String) {
    }

    public fun compressionType(compressionType: InputCompressionType) {
    }

    public fun inputFormat(inputFormat: InputFormat) {
    }

    public fun keyPrefix(keyPrefix: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dynamodb.ImportSourceSpecification.Builder =
        software.amazon.awscdk.services.dynamodb.ImportSourceSpecification.builder()

    public override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    public override fun bucketOwner(bucketOwner: String) {
      cdkBuilder.bucketOwner(bucketOwner)
    }

    public override fun compressionType(compressionType: InputCompressionType) {
      cdkBuilder.compressionType(compressionType.let(InputCompressionType::unwrap))
    }

    public override fun inputFormat(inputFormat: InputFormat) {
      cdkBuilder.inputFormat(inputFormat.let(InputFormat::unwrap))
    }

    public override fun keyPrefix(keyPrefix: String) {
      cdkBuilder.keyPrefix(keyPrefix)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.ImportSourceSpecification =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.ImportSourceSpecification,
  ) : ImportSourceSpecification {
    public override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    public override fun bucketOwner(): String? = unwrap(this).getBucketOwner()

    public override fun compressionType(): InputCompressionType? =
        unwrap(this).getCompressionType()?.let(InputCompressionType::wrap)

    public override fun inputFormat(): InputFormat =
        unwrap(this).getInputFormat().let(InputFormat::wrap)

    public override fun keyPrefix(): String? = unwrap(this).getKeyPrefix()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ImportSourceSpecification {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.ImportSourceSpecification):
        ImportSourceSpecification = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ImportSourceSpecification):
        software.amazon.awscdk.services.dynamodb.ImportSourceSpecification = (wrapped as
        Wrapper).cdkObject
  }
}
