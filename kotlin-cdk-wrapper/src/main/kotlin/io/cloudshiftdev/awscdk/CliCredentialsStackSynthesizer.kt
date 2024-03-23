@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

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
 * import io.cloudshiftdev.awscdk.*;
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
public open class CliCredentialsStackSynthesizer(
  cdkObject: software.amazon.awscdk.CliCredentialsStackSynthesizer,
) : StackSynthesizer(cdkObject), IReusableStackSynthesizer, IBoundStackSynthesizer {
  public constructor() : this(software.amazon.awscdk.CliCredentialsStackSynthesizer()
  )

  public constructor(props: CliCredentialsStackSynthesizerProps) :
      this(software.amazon.awscdk.CliCredentialsStackSynthesizer(props.let(CliCredentialsStackSynthesizerProps::unwrap))
  )

  public constructor(props: CliCredentialsStackSynthesizerProps.Builder.() -> Unit) :
      this(CliCredentialsStackSynthesizerProps(props)
  )

  /**
   * Register a Docker Image Asset.
   *
   * Returns the parameters that can be used to refer to the asset inside the template.
   *
   * The synthesizer must rely on some out-of-band mechanism to make sure the given files
   * are actually placed in the returned location before the deployment happens. This can
   * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
   * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
   * mechanism.
   *
   * @param asset 
   */
  public override fun addDockerImageAsset(asset: DockerImageAssetSource): DockerImageAssetLocation =
      unwrap(this).addDockerImageAsset(asset.let(DockerImageAssetSource::unwrap)).let(DockerImageAssetLocation::wrap)

  /**
   * Register a Docker Image Asset.
   *
   * Returns the parameters that can be used to refer to the asset inside the template.
   *
   * The synthesizer must rely on some out-of-band mechanism to make sure the given files
   * are actually placed in the returned location before the deployment happens. This can
   * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
   * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
   * mechanism.
   *
   * @param asset 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("60e85405255a4559d9d101644bfe36735011455aae5a7b2c0ff140d999863ded")
  public override fun addDockerImageAsset(asset: DockerImageAssetSource.Builder.() -> Unit):
      DockerImageAssetLocation = addDockerImageAsset(DockerImageAssetSource(asset))

  /**
   * Register a File Asset.
   *
   * Returns the parameters that can be used to refer to the asset inside the template.
   *
   * The synthesizer must rely on some out-of-band mechanism to make sure the given files
   * are actually placed in the returned location before the deployment happens. This can
   * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
   * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
   * mechanism.
   *
   * @param asset 
   */
  public override fun addFileAsset(asset: FileAssetSource): FileAssetLocation =
      unwrap(this).addFileAsset(asset.let(FileAssetSource::unwrap)).let(FileAssetLocation::wrap)

  /**
   * Register a File Asset.
   *
   * Returns the parameters that can be used to refer to the asset inside the template.
   *
   * The synthesizer must rely on some out-of-band mechanism to make sure the given files
   * are actually placed in the returned location before the deployment happens. This can
   * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
   * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
   * mechanism.
   *
   * @param asset 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8c4a8252dd3ca6f0e54c1277f4347dc34084a3d362bd2ed69cb738a218590d6")
  public override fun addFileAsset(asset: FileAssetSource.Builder.() -> Unit): FileAssetLocation =
      addFileAsset(FileAssetSource(asset))

  /**
   * Bind to the stack this environment is going to be used on.
   *
   * Must be called before any of the other methods are called.
   *
   * @param stack 
   */
  public override fun bind(stack: Stack) {
    unwrap(this).bind(stack.let(Stack::unwrap))
  }

  /**
   * The qualifier used to bootstrap this stack.
   */
  public override fun bootstrapQualifier(): String? = unwrap(this).getBootstrapQualifier()

  /**
   * Produce a bound Stack Synthesizer for the given stack.
   *
   * This method may be called more than once on the same object.
   *
   * @param stack 
   */
  public override fun reusableBind(stack: Stack): IBoundStackSynthesizer =
      unwrap(this).reusableBind(stack.let(Stack::unwrap)).let(IBoundStackSynthesizer::wrap)

  /**
   * Synthesize the associated stack to the session.
   *
   * @param session 
   */
  public override fun synthesize(session: ISynthesisSession) {
    unwrap(this).synthesize(session.let(ISynthesisSession::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CliCredentialsStackSynthesizer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * bucketPrefix to use while storing S3 Assets.
     *
     * Default: - DefaultStackSynthesizer.DEFAULT_FILE_ASSET_PREFIX
     *
     * @param bucketPrefix bucketPrefix to use while storing S3 Assets. 
     */
    public fun bucketPrefix(bucketPrefix: String)

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
    public fun dockerTagPrefix(dockerTagPrefix: String)

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
    public fun fileAssetsBucketName(fileAssetsBucketName: String)

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
    public fun imageAssetsRepositoryName(imageAssetsRepositoryName: String)

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
    public fun qualifier(qualifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CliCredentialsStackSynthesizer.Builder =
        software.amazon.awscdk.CliCredentialsStackSynthesizer.Builder.create()

    /**
     * bucketPrefix to use while storing S3 Assets.
     *
     * Default: - DefaultStackSynthesizer.DEFAULT_FILE_ASSET_PREFIX
     *
     * @param bucketPrefix bucketPrefix to use while storing S3 Assets. 
     */
    override fun bucketPrefix(bucketPrefix: String) {
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
    override fun dockerTagPrefix(dockerTagPrefix: String) {
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
    override fun fileAssetsBucketName(fileAssetsBucketName: String) {
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
    override fun imageAssetsRepositoryName(imageAssetsRepositoryName: String) {
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
    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    public fun build(): software.amazon.awscdk.CliCredentialsStackSynthesizer = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CliCredentialsStackSynthesizer {
      val builderImpl = BuilderImpl()
      return CliCredentialsStackSynthesizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CliCredentialsStackSynthesizer):
        CliCredentialsStackSynthesizer = CliCredentialsStackSynthesizer(cdkObject)

    internal fun unwrap(wrapped: CliCredentialsStackSynthesizer):
        software.amazon.awscdk.CliCredentialsStackSynthesizer = wrapped.cdkObject as
        software.amazon.awscdk.CliCredentialsStackSynthesizer
  }
}
