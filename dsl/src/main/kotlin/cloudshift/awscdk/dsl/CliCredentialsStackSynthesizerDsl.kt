@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CliCredentialsStackSynthesizer

/**
 * A synthesizer that uses conventional asset locations, but not conventional deployment roles.
 *
 * Instead of assuming the bootstrapped deployment roles, all stack operations will be performed
 * using the CLI's current credentials.
 *
 * * This synthesizer does not support deploying to accounts to which the CLI does not have
 * credentials. It also does not support deploying using **CDK Pipelines**. For either of those
 * features, use `DefaultStackSynthesizer`.
 * * This synthesizer requires an S3 bucket and ECR repository with well-known names. To
 * not depend on those, use `LegacyStackSynthesizer`.
 *
 * Be aware that your CLI credentials must be valid for the duration of the
 * entire deployment. If you are using session credentials, make sure the
 * session lifetime is long enough.
 *
 * By default, expects the environment to have been bootstrapped with just the staging resources
 * of the Bootstrap Stack V2 (also known as "modern bootstrap stack"). You can override
 * the default names using the synthesizer's construction properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CliCredentialsStackSynthesizer cliCredentialsStackSynthesizer =
 * CliCredentialsStackSynthesizer.Builder.create()
 * .bucketPrefix("bucketPrefix")
 * .dockerTagPrefix("dockerTagPrefix")
 * .fileAssetsBucketName("fileAssetsBucketName")
 * .imageAssetsRepositoryName("imageAssetsRepositoryName")
 * .qualifier("qualifier")
 * .build();
 * ```
 */
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
