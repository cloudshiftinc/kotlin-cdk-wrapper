@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for the CliCredentialsStackSynthesizer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CliCredentialsStackSynthesizerProps cliCredentialsStackSynthesizerProps =
 * CliCredentialsStackSynthesizerProps.builder()
 * .bucketPrefix("bucketPrefix")
 * .dockerTagPrefix("dockerTagPrefix")
 * .fileAssetsBucketName("fileAssetsBucketName")
 * .imageAssetsRepositoryName("imageAssetsRepositoryName")
 * .qualifier("qualifier")
 * .build();
 * ```
 */
public interface CliCredentialsStackSynthesizerProps {
  /**
   * bucketPrefix to use while storing S3 Assets.
   *
   * Default: - DefaultStackSynthesizer.DEFAULT_FILE_ASSET_PREFIX
   */
  public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

  /**
   * A prefix to use while tagging and uploading Docker images to ECR.
   *
   * This does not add any separators - the source hash will be appended to
   * this string directly.
   *
   * Default: - DefaultStackSynthesizer.DEFAULT_DOCKER_ASSET_PREFIX
   */
  public fun dockerTagPrefix(): String? = unwrap(this).getDockerTagPrefix()

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
   */
  public fun fileAssetsBucketName(): String? = unwrap(this).getFileAssetsBucketName()

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
   */
  public fun imageAssetsRepositoryName(): String? = unwrap(this).getImageAssetsRepositoryName()

  /**
   * Qualifier to disambiguate multiple environments in the same account.
   *
   * You can use this and leave the other naming properties empty if you have deployed
   * the bootstrap environment with standard names but only different qualifiers.
   *
   * Default: - Value of context key '@aws-cdk/core:bootstrapQualifier' if set, otherwise
   * `DefaultStackSynthesizer.DEFAULT_QUALIFIER`
   */
  public fun qualifier(): String? = unwrap(this).getQualifier()

  /**
   * A builder for [CliCredentialsStackSynthesizerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucketPrefix bucketPrefix to use while storing S3 Assets.
     */
    public fun bucketPrefix(bucketPrefix: String)

    /**
     * @param dockerTagPrefix A prefix to use while tagging and uploading Docker images to ECR.
     * This does not add any separators - the source hash will be appended to
     * this string directly.
     */
    public fun dockerTagPrefix(dockerTagPrefix: String)

    /**
     * @param fileAssetsBucketName Name of the S3 bucket to hold file assets.
     * You must supply this if you have given a non-standard name to the staging bucket.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     */
    public fun fileAssetsBucketName(fileAssetsBucketName: String)

    /**
     * @param imageAssetsRepositoryName Name of the ECR repository to hold Docker Image assets.
     * You must supply this if you have given a non-standard name to the ECR repository.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     */
    public fun imageAssetsRepositoryName(imageAssetsRepositoryName: String)

    /**
     * @param qualifier Qualifier to disambiguate multiple environments in the same account.
     * You can use this and leave the other naming properties empty if you have deployed
     * the bootstrap environment with standard names but only different qualifiers.
     */
    public fun qualifier(qualifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CliCredentialsStackSynthesizerProps.Builder =
        software.amazon.awscdk.CliCredentialsStackSynthesizerProps.builder()

    /**
     * @param bucketPrefix bucketPrefix to use while storing S3 Assets.
     */
    override fun bucketPrefix(bucketPrefix: String) {
      cdkBuilder.bucketPrefix(bucketPrefix)
    }

    /**
     * @param dockerTagPrefix A prefix to use while tagging and uploading Docker images to ECR.
     * This does not add any separators - the source hash will be appended to
     * this string directly.
     */
    override fun dockerTagPrefix(dockerTagPrefix: String) {
      cdkBuilder.dockerTagPrefix(dockerTagPrefix)
    }

    /**
     * @param fileAssetsBucketName Name of the S3 bucket to hold file assets.
     * You must supply this if you have given a non-standard name to the staging bucket.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     */
    override fun fileAssetsBucketName(fileAssetsBucketName: String) {
      cdkBuilder.fileAssetsBucketName(fileAssetsBucketName)
    }

    /**
     * @param imageAssetsRepositoryName Name of the ECR repository to hold Docker Image assets.
     * You must supply this if you have given a non-standard name to the ECR repository.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     */
    override fun imageAssetsRepositoryName(imageAssetsRepositoryName: String) {
      cdkBuilder.imageAssetsRepositoryName(imageAssetsRepositoryName)
    }

    /**
     * @param qualifier Qualifier to disambiguate multiple environments in the same account.
     * You can use this and leave the other naming properties empty if you have deployed
     * the bootstrap environment with standard names but only different qualifiers.
     */
    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    public fun build(): software.amazon.awscdk.CliCredentialsStackSynthesizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CliCredentialsStackSynthesizerProps,
  ) : CdkObject(cdkObject), CliCredentialsStackSynthesizerProps {
    /**
     * bucketPrefix to use while storing S3 Assets.
     *
     * Default: - DefaultStackSynthesizer.DEFAULT_FILE_ASSET_PREFIX
     */
    override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    /**
     * A prefix to use while tagging and uploading Docker images to ECR.
     *
     * This does not add any separators - the source hash will be appended to
     * this string directly.
     *
     * Default: - DefaultStackSynthesizer.DEFAULT_DOCKER_ASSET_PREFIX
     */
    override fun dockerTagPrefix(): String? = unwrap(this).getDockerTagPrefix()

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
     */
    override fun fileAssetsBucketName(): String? = unwrap(this).getFileAssetsBucketName()

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
     */
    override fun imageAssetsRepositoryName(): String? = unwrap(this).getImageAssetsRepositoryName()

    /**
     * Qualifier to disambiguate multiple environments in the same account.
     *
     * You can use this and leave the other naming properties empty if you have deployed
     * the bootstrap environment with standard names but only different qualifiers.
     *
     * Default: - Value of context key '@aws-cdk/core:bootstrapQualifier' if set, otherwise
     * `DefaultStackSynthesizer.DEFAULT_QUALIFIER`
     */
    override fun qualifier(): String? = unwrap(this).getQualifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CliCredentialsStackSynthesizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CliCredentialsStackSynthesizerProps):
        CliCredentialsStackSynthesizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CliCredentialsStackSynthesizerProps):
        software.amazon.awscdk.CliCredentialsStackSynthesizerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CliCredentialsStackSynthesizerProps
  }
}
