@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

/**
 * Options when downloading files from S3.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.s3.assets.Asset;
 * Instance instance;
 * Asset asset = Asset.Builder.create(this, "Asset")
 * .path("./configure.sh")
 * .build();
 * String localPath = instance.userData.addS3DownloadCommand(S3DownloadOptions.builder()
 * .bucket(asset.getBucket())
 * .bucketKey(asset.getS3ObjectKey())
 * .region("us-east-1")
 * .build());
 * instance.userData.addExecuteFileCommand(ExecuteFileOptions.builder()
 * .filePath(localPath)
 * .arguments("--verbose -y")
 * .build());
 * asset.grantRead(instance.getRole());
 * ```
 */
public interface S3DownloadOptions {
  /**
   * Name of the S3 bucket to download from.
   */
  public fun bucket(): IBucket

  /**
   * The key of the file to download.
   */
  public fun bucketKey(): String

  /**
   * The name of the local file.
   *
   * Default: Linux   - /tmp/bucketKey
   * Windows - %TEMP%/bucketKey
   */
  public fun localFile(): String? = unwrap(this).getLocalFile()

  /**
   * The region of the S3 Bucket (needed for access via VPC Gateway).
   *
   * Default: none
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * A builder for [S3DownloadOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket Name of the S3 bucket to download from. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param bucketKey The key of the file to download. 
     */
    public fun bucketKey(bucketKey: String)

    /**
     * @param localFile The name of the local file.
     */
    public fun localFile(localFile: String)

    /**
     * @param region The region of the S3 Bucket (needed for access via VPC Gateway).
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.S3DownloadOptions.Builder =
        software.amazon.awscdk.services.ec2.S3DownloadOptions.builder()

    /**
     * @param bucket Name of the S3 bucket to download from. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    /**
     * @param bucketKey The key of the file to download. 
     */
    override fun bucketKey(bucketKey: String) {
      cdkBuilder.bucketKey(bucketKey)
    }

    /**
     * @param localFile The name of the local file.
     */
    override fun localFile(localFile: String) {
      cdkBuilder.localFile(localFile)
    }

    /**
     * @param region The region of the S3 Bucket (needed for access via VPC Gateway).
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.services.ec2.S3DownloadOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.S3DownloadOptions,
  ) : CdkObject(cdkObject), S3DownloadOptions {
    /**
     * Name of the S3 bucket to download from.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * The key of the file to download.
     */
    override fun bucketKey(): String = unwrap(this).getBucketKey()

    /**
     * The name of the local file.
     *
     * Default: Linux   - /tmp/bucketKey
     * Windows - %TEMP%/bucketKey
     */
    override fun localFile(): String? = unwrap(this).getLocalFile()

    /**
     * The region of the S3 Bucket (needed for access via VPC Gateway).
     *
     * Default: none
     */
    override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3DownloadOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.S3DownloadOptions):
        S3DownloadOptions = CdkObjectWrappers.wrap(cdkObject) as S3DownloadOptions

    internal fun unwrap(wrapped: S3DownloadOptions):
        software.amazon.awscdk.services.ec2.S3DownloadOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.S3DownloadOptions
  }
}
