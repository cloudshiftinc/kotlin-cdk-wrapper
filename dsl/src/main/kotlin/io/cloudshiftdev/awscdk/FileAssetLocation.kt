package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit

public interface FileAssetLocation {
  public fun bucketName(): String

  public fun httpUrl(): String

  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public fun objectKey(): String

  public fun s3ObjectUrl(): String

  public fun s3ObjectUrlWithPlaceholders(): String? = unwrap(this).getS3ObjectUrlWithPlaceholders()

  public interface Builder {
    public fun bucketName(bucketName: String) {
    }

    public fun httpUrl(httpUrl: String) {
    }

    public fun kmsKeyArn(kmsKeyArn: String) {
    }

    public fun objectKey(objectKey: String) {
    }

    public fun s3ObjectUrl(s3ObjectUrl: String) {
    }

    public fun s3ObjectUrlWithPlaceholders(s3ObjectUrlWithPlaceholders: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.FileAssetLocation.Builder =
        software.amazon.awscdk.FileAssetLocation.builder()

    public override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    public override fun httpUrl(httpUrl: String) {
      cdkBuilder.httpUrl(httpUrl)
    }

    public override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public override fun objectKey(objectKey: String) {
      cdkBuilder.objectKey(objectKey)
    }

    public override fun s3ObjectUrl(s3ObjectUrl: String) {
      cdkBuilder.s3ObjectUrl(s3ObjectUrl)
    }

    public override fun s3ObjectUrlWithPlaceholders(s3ObjectUrlWithPlaceholders: String) {
      cdkBuilder.s3ObjectUrlWithPlaceholders(s3ObjectUrlWithPlaceholders)
    }

    public fun build(): software.amazon.awscdk.FileAssetLocation = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.FileAssetLocation,
  ) : FileAssetLocation {
    public override fun bucketName(): String = unwrap(this).getBucketName()

    public override fun httpUrl(): String = unwrap(this).getHttpUrl()

    public override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    public override fun objectKey(): String = unwrap(this).getObjectKey()

    public override fun s3ObjectUrl(): String = unwrap(this).getS3ObjectUrl()

    public override fun s3ObjectUrlWithPlaceholders(): String? =
        unwrap(this).getS3ObjectUrlWithPlaceholders()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FileAssetLocation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.FileAssetLocation): FileAssetLocation =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileAssetLocation): software.amazon.awscdk.FileAssetLocation =
        (wrapped as Wrapper).cdkObject
  }
}
