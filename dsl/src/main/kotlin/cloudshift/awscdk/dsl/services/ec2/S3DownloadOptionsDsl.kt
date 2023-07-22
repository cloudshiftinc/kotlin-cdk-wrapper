@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.S3DownloadOptions
import software.amazon.awscdk.services.s3.IBucket

/**
 * Options when downloading files from S3.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.s3.assets.Asset;
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
@CdkDslMarker
public class S3DownloadOptionsDsl {
  private val cdkBuilder: S3DownloadOptions.Builder = S3DownloadOptions.builder()

  /**
   * @param bucket Name of the S3 bucket to download from. 
   */
  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param bucketKey The key of the file to download. 
   */
  public fun bucketKey(bucketKey: String) {
    cdkBuilder.bucketKey(bucketKey)
  }

  /**
   * @param localFile The name of the local file.
   */
  public fun localFile(localFile: String) {
    cdkBuilder.localFile(localFile)
  }

  /**
   * @param region The region of the S3 Bucket (needed for access via VPC Gateway).
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): S3DownloadOptions = cdkBuilder.build()
}
