@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CliCredentialsStackSynthesizer

@CdkDslMarker
public class CliCredentialsStackSynthesizerDsl {
  private val cdkBuilder: CliCredentialsStackSynthesizer.Builder =
      CliCredentialsStackSynthesizer.Builder.create()

  /**
   * bucketPrefix to use while storing S3 Assets.
   *
   * Default: - DefaultStackSynthesizer.DEFAULT_FILE_ASSET_PREFIX
   *
   * @param bucketPrefix bucketPrefix to use while storing S3 Assets. 
   */
  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  /**
   * A prefix to use while tagging and uploading Docker images to ECR.
   *
   * This does not add any separators - the source hash will be appended to
   * this string directly.
   *
   * Default: - DefaultStackSynthesizer.DEFAULT_DOCKER_ASSET_PREFIX
   *
   * @param dockerTagPrefix A prefix to use while tagging and uploading Docker images to ECR. 
   */
  public fun dockerTagPrefix(dockerTagPrefix: String) {
    cdkBuilder.dockerTagPrefix(dockerTagPrefix)
  }

  /**
   * Name of the S3 bucket to hold file assets.
   *
   * You must supply this if you have given a non-standard name to the staging bucket.
   *
   * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
   * be replaced with the values of qualifier and the stack's account and region,
   * respectively.
   *
   * Default: DefaultStackSynthesizer.DEFAULT_FILE_ASSETS_BUCKET_NAME
   *
   * @param fileAssetsBucketName Name of the S3 bucket to hold file assets. 
   */
  public fun fileAssetsBucketName(fileAssetsBucketName: String) {
    cdkBuilder.fileAssetsBucketName(fileAssetsBucketName)
  }

  /**
   * Name of the ECR repository to hold Docker Image assets.
   *
   * You must supply this if you have given a non-standard name to the ECR repository.
   *
   * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
   * be replaced with the values of qualifier and the stack's account and region,
   * respectively.
   *
   * Default: DefaultStackSynthesizer.DEFAULT_IMAGE_ASSETS_REPOSITORY_NAME
   *
   * @param imageAssetsRepositoryName Name of the ECR repository to hold Docker Image assets. 
   */
  public fun imageAssetsRepositoryName(imageAssetsRepositoryName: String) {
    cdkBuilder.imageAssetsRepositoryName(imageAssetsRepositoryName)
  }

  /**
   * Qualifier to disambiguate multiple environments in the same account.
   *
   * You can use this and leave the other naming properties empty if you have deployed
   * the bootstrap environment with standard names but only different qualifiers.
   *
   * Default: - Value of context key '@aws-cdk/core:bootstrapQualifier' if set, otherwise
   * `DefaultStackSynthesizer.DEFAULT_QUALIFIER`
   *
   * @param qualifier Qualifier to disambiguate multiple environments in the same account. 
   */
  public fun qualifier(qualifier: String) {
    cdkBuilder.qualifier(qualifier)
  }

  public fun build(): CliCredentialsStackSynthesizer = cdkBuilder.build()
}
