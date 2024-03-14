package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class DefaultStackSynthesizer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.DefaultStackSynthesizer,
) : StackSynthesizer(cdkObject), IReusableStackSynthesizer, IBoundStackSynthesizer {
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
  @Suppress("INAPPLICABLE_JVM_NAME")
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
  @Suppress("INAPPLICABLE_JVM_NAME")
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
   * Returns the ARN of the CFN execution Role.
   */
  public open fun cloudFormationExecutionRoleArn(): String =
      unwrap(this).getCloudFormationExecutionRoleArn()

  /**
   * Returns the ARN of the deploy Role.
   */
  public open fun deployRoleArn(): String = unwrap(this).getDeployRoleArn()

  /**
   * The role used to lookup for this stack.
   */
  public override fun lookupRole(): String? = unwrap(this).getLookupRole()

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
   * A fluent builder for [io.cloudshiftdev.awscdk.DefaultStackSynthesizer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Bootstrap stack version SSM parameter.
     *
     * The placeholder `${Qualifier}` will be replaced with the value of qualifier.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_BOOTSTRAP_STACK_VERSION_SSM_PARAMETER
     *
     * @param bootstrapStackVersionSsmParameter Bootstrap stack version SSM parameter. 
     */
    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String)

    /**
     * bucketPrefix to use while storing S3 Assets.
     *
     * Default: - DefaultStackSynthesizer.DEFAULT_FILE_ASSET_PREFIX
     *
     * @param bucketPrefix bucketPrefix to use while storing S3 Assets. 
     */
    public fun bucketPrefix(bucketPrefix: String)

    /**
     * The role CloudFormation will assume when deploying the Stack.
     *
     * You must supply this if you have given a non-standard name to the execution role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_CLOUDFORMATION_ROLE_ARN
     *
     * @param cloudFormationExecutionRole The role CloudFormation will assume when deploying the
     * Stack. 
     */
    public fun cloudFormationExecutionRole(cloudFormationExecutionRole: String)

    /**
     * The role to assume to initiate a deployment in this environment.
     *
     * You must supply this if you have given a non-standard name to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_DEPLOY_ROLE_ARN
     *
     * @param deployRoleArn The role to assume to initiate a deployment in this environment. 
     */
    public fun deployRoleArn(deployRoleArn: String)

    /**
     * External ID to use when assuming role for cloudformation deployments.
     *
     * Default: - No external ID
     *
     * @param deployRoleExternalId External ID to use when assuming role for cloudformation
     * deployments. 
     */
    public fun deployRoleExternalId(deployRoleExternalId: String)

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
     * External ID to use when assuming role for file asset publishing.
     *
     * Default: - No external ID
     *
     * @param fileAssetPublishingExternalId External ID to use when assuming role for file asset
     * publishing. 
     */
    public fun fileAssetPublishingExternalId(fileAssetPublishingExternalId: String)

    /**
     * The role to use to publish file assets to the S3 bucket in this environment.
     *
     * You must supply this if you have given a non-standard name to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_FILE_ASSET_PUBLISHING_ROLE_ARN
     *
     * @param fileAssetPublishingRoleArn The role to use to publish file assets to the S3 bucket in
     * this environment. 
     */
    public fun fileAssetPublishingRoleArn(fileAssetPublishingRoleArn: String)

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
     * Whether to add a Rule to the stack template verifying the bootstrap stack version.
     *
     * This generally should be left set to `true`, unless you explicitly
     * want to be able to deploy to an unbootstrapped environment.
     *
     * Default: true
     *
     * @param generateBootstrapVersionRule Whether to add a Rule to the stack template verifying the
     * bootstrap stack version. 
     */
    public fun generateBootstrapVersionRule(generateBootstrapVersionRule: Boolean)

    /**
     * External ID to use when assuming role for image asset publishing.
     *
     * Default: - No external ID
     *
     * @param imageAssetPublishingExternalId External ID to use when assuming role for image asset
     * publishing. 
     */
    public fun imageAssetPublishingExternalId(imageAssetPublishingExternalId: String)

    /**
     * The role to use to publish image assets to the ECR repository in this environment.
     *
     * You must supply this if you have given a non-standard name to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_IMAGE_ASSET_PUBLISHING_ROLE_ARN
     *
     * @param imageAssetPublishingRoleArn The role to use to publish image assets to the ECR
     * repository in this environment. 
     */
    public fun imageAssetPublishingRoleArn(imageAssetPublishingRoleArn: String)

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
     * The role to use to look up values from the target AWS account during synthesis.
     *
     * Default: - None
     *
     * @param lookupRoleArn The role to use to look up values from the target AWS account during
     * synthesis. 
     */
    public fun lookupRoleArn(lookupRoleArn: String)

    /**
     * External ID to use when assuming lookup role.
     *
     * Default: - No external ID
     *
     * @param lookupRoleExternalId External ID to use when assuming lookup role. 
     */
    public fun lookupRoleExternalId(lookupRoleExternalId: String)

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

    /**
     * Use the bootstrapped lookup role for (read-only) stack operations.
     *
     * Use the lookup role when performing a `cdk diff`. If set to `false`, the
     * `deploy role` credentials will be used to perform a `cdk diff`.
     *
     * Requires bootstrap stack version 8.
     *
     * Default: true
     *
     * @param useLookupRoleForStackOperations Use the bootstrapped lookup role for (read-only) stack
     * operations. 
     */
    public fun useLookupRoleForStackOperations(useLookupRoleForStackOperations: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.DefaultStackSynthesizer.Builder =
        software.amazon.awscdk.DefaultStackSynthesizer.Builder.create()

    /**
     * Bootstrap stack version SSM parameter.
     *
     * The placeholder `${Qualifier}` will be replaced with the value of qualifier.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_BOOTSTRAP_STACK_VERSION_SSM_PARAMETER
     *
     * @param bootstrapStackVersionSsmParameter Bootstrap stack version SSM parameter. 
     */
    override fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
      cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

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
     * The role CloudFormation will assume when deploying the Stack.
     *
     * You must supply this if you have given a non-standard name to the execution role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_CLOUDFORMATION_ROLE_ARN
     *
     * @param cloudFormationExecutionRole The role CloudFormation will assume when deploying the
     * Stack. 
     */
    override fun cloudFormationExecutionRole(cloudFormationExecutionRole: String) {
      cdkBuilder.cloudFormationExecutionRole(cloudFormationExecutionRole)
    }

    /**
     * The role to assume to initiate a deployment in this environment.
     *
     * You must supply this if you have given a non-standard name to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_DEPLOY_ROLE_ARN
     *
     * @param deployRoleArn The role to assume to initiate a deployment in this environment. 
     */
    override fun deployRoleArn(deployRoleArn: String) {
      cdkBuilder.deployRoleArn(deployRoleArn)
    }

    /**
     * External ID to use when assuming role for cloudformation deployments.
     *
     * Default: - No external ID
     *
     * @param deployRoleExternalId External ID to use when assuming role for cloudformation
     * deployments. 
     */
    override fun deployRoleExternalId(deployRoleExternalId: String) {
      cdkBuilder.deployRoleExternalId(deployRoleExternalId)
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
     * External ID to use when assuming role for file asset publishing.
     *
     * Default: - No external ID
     *
     * @param fileAssetPublishingExternalId External ID to use when assuming role for file asset
     * publishing. 
     */
    override fun fileAssetPublishingExternalId(fileAssetPublishingExternalId: String) {
      cdkBuilder.fileAssetPublishingExternalId(fileAssetPublishingExternalId)
    }

    /**
     * The role to use to publish file assets to the S3 bucket in this environment.
     *
     * You must supply this if you have given a non-standard name to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_FILE_ASSET_PUBLISHING_ROLE_ARN
     *
     * @param fileAssetPublishingRoleArn The role to use to publish file assets to the S3 bucket in
     * this environment. 
     */
    override fun fileAssetPublishingRoleArn(fileAssetPublishingRoleArn: String) {
      cdkBuilder.fileAssetPublishingRoleArn(fileAssetPublishingRoleArn)
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
     * Whether to add a Rule to the stack template verifying the bootstrap stack version.
     *
     * This generally should be left set to `true`, unless you explicitly
     * want to be able to deploy to an unbootstrapped environment.
     *
     * Default: true
     *
     * @param generateBootstrapVersionRule Whether to add a Rule to the stack template verifying the
     * bootstrap stack version. 
     */
    override fun generateBootstrapVersionRule(generateBootstrapVersionRule: Boolean) {
      cdkBuilder.generateBootstrapVersionRule(generateBootstrapVersionRule)
    }

    /**
     * External ID to use when assuming role for image asset publishing.
     *
     * Default: - No external ID
     *
     * @param imageAssetPublishingExternalId External ID to use when assuming role for image asset
     * publishing. 
     */
    override fun imageAssetPublishingExternalId(imageAssetPublishingExternalId: String) {
      cdkBuilder.imageAssetPublishingExternalId(imageAssetPublishingExternalId)
    }

    /**
     * The role to use to publish image assets to the ECR repository in this environment.
     *
     * You must supply this if you have given a non-standard name to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_IMAGE_ASSET_PUBLISHING_ROLE_ARN
     *
     * @param imageAssetPublishingRoleArn The role to use to publish image assets to the ECR
     * repository in this environment. 
     */
    override fun imageAssetPublishingRoleArn(imageAssetPublishingRoleArn: String) {
      cdkBuilder.imageAssetPublishingRoleArn(imageAssetPublishingRoleArn)
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
     * The role to use to look up values from the target AWS account during synthesis.
     *
     * Default: - None
     *
     * @param lookupRoleArn The role to use to look up values from the target AWS account during
     * synthesis. 
     */
    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    /**
     * External ID to use when assuming lookup role.
     *
     * Default: - No external ID
     *
     * @param lookupRoleExternalId External ID to use when assuming lookup role. 
     */
    override fun lookupRoleExternalId(lookupRoleExternalId: String) {
      cdkBuilder.lookupRoleExternalId(lookupRoleExternalId)
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

    /**
     * Use the bootstrapped lookup role for (read-only) stack operations.
     *
     * Use the lookup role when performing a `cdk diff`. If set to `false`, the
     * `deploy role` credentials will be used to perform a `cdk diff`.
     *
     * Requires bootstrap stack version 8.
     *
     * Default: true
     *
     * @param useLookupRoleForStackOperations Use the bootstrapped lookup role for (read-only) stack
     * operations. 
     */
    override fun useLookupRoleForStackOperations(useLookupRoleForStackOperations: Boolean) {
      cdkBuilder.useLookupRoleForStackOperations(useLookupRoleForStackOperations)
    }

    public fun build(): software.amazon.awscdk.DefaultStackSynthesizer = cdkBuilder.build()
  }

  public companion object {
    public val DEFAULT_BOOTSTRAP_STACK_VERSION_SSM_PARAMETER: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_BOOTSTRAP_STACK_VERSION_SSM_PARAMETER

    public val DEFAULT_CLOUDFORMATION_ROLE_ARN: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_CLOUDFORMATION_ROLE_ARN

    public val DEFAULT_DEPLOY_ROLE_ARN: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_DEPLOY_ROLE_ARN

    public val DEFAULT_DOCKER_ASSET_PREFIX: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_DOCKER_ASSET_PREFIX

    public val DEFAULT_FILE_ASSET_KEY_ARN_EXPORT_NAME: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_FILE_ASSET_KEY_ARN_EXPORT_NAME

    public val DEFAULT_FILE_ASSET_PREFIX: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_FILE_ASSET_PREFIX

    public val DEFAULT_FILE_ASSET_PUBLISHING_ROLE_ARN: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_FILE_ASSET_PUBLISHING_ROLE_ARN

    public val DEFAULT_FILE_ASSETS_BUCKET_NAME: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_FILE_ASSETS_BUCKET_NAME

    public val DEFAULT_IMAGE_ASSET_PUBLISHING_ROLE_ARN: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_IMAGE_ASSET_PUBLISHING_ROLE_ARN

    public val DEFAULT_IMAGE_ASSETS_REPOSITORY_NAME: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_IMAGE_ASSETS_REPOSITORY_NAME

    public val DEFAULT_LOOKUP_ROLE_ARN: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_LOOKUP_ROLE_ARN

    public val DEFAULT_QUALIFIER: String =
        software.amazon.awscdk.DefaultStackSynthesizer.DEFAULT_QUALIFIER

    public operator fun invoke(block: Builder.() -> Unit = {}): DefaultStackSynthesizer {
      val builderImpl = BuilderImpl()
      return DefaultStackSynthesizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.DefaultStackSynthesizer):
        DefaultStackSynthesizer = DefaultStackSynthesizer(cdkObject)

    internal fun unwrap(wrapped: DefaultStackSynthesizer):
        software.amazon.awscdk.DefaultStackSynthesizer = wrapped.cdkObject
  }
}
