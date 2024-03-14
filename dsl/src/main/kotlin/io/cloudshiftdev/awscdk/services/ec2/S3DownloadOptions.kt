package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

public interface S3DownloadOptions {
  public fun bucket(): IBucket

  public fun bucketKey(): String

  public fun localFile(): String? = unwrap(this).getLocalFile()

  public fun region(): String? = unwrap(this).getRegion()

  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun bucketKey(bucketKey: String)

    public fun localFile(localFile: String)

    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.S3DownloadOptions.Builder =
        software.amazon.awscdk.services.ec2.S3DownloadOptions.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun bucketKey(bucketKey: String) {
      cdkBuilder.bucketKey(bucketKey)
    }

    override fun localFile(localFile: String) {
      cdkBuilder.localFile(localFile)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.services.ec2.S3DownloadOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.S3DownloadOptions,
  ) : S3DownloadOptions {
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun bucketKey(): String = unwrap(this).getBucketKey()

    override fun localFile(): String? = unwrap(this).getLocalFile()

    override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): S3DownloadOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.S3DownloadOptions):
        S3DownloadOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3DownloadOptions):
        software.amazon.awscdk.services.ec2.S3DownloadOptions = (wrapped as Wrapper).cdkObject
  }
}
