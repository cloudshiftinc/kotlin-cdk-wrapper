@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Configuration properties for DefaultStackSynthesizer.
 *
 * Example:
 *
 * ```
 * MyStack.Builder.create(app, "MyStack")
 * .synthesizer(DefaultStackSynthesizer.Builder.create()
 * .fileAssetsBucketName("my-orgs-asset-bucket")
 * .build())
 * .build();
 * ```
 */
public interface DefaultStackSynthesizerProps {
  /**
   * Bootstrap stack version SSM parameter.
   *
   * The placeholder `${Qualifier}` will be replaced with the value of qualifier.
   *
   * Default: DefaultStackSynthesizer.DEFAULT_BOOTSTRAP_STACK_VERSION_SSM_PARAMETER
   */
  public fun bootstrapStackVersionSsmParameter(): String? =
      unwrap(this).getBootstrapStackVersionSsmParameter()

  /**
   * bucketPrefix to use while storing S3 Assets.
   *
   * Default: - DefaultStackSynthesizer.DEFAULT_FILE_ASSET_PREFIX
   */
  public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

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
   */
  public fun cloudFormationExecutionRole(): String? = unwrap(this).getCloudFormationExecutionRole()

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
   */
  public fun deployRoleArn(): String? = unwrap(this).getDeployRoleArn()

  /**
   * External ID to use when assuming role for cloudformation deployments.
   *
   * Default: - No external ID
   */
  public fun deployRoleExternalId(): String? = unwrap(this).getDeployRoleExternalId()

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
   * External ID to use when assuming role for file asset publishing.
   *
   * Default: - No external ID
   */
  public fun fileAssetPublishingExternalId(): String? =
      unwrap(this).getFileAssetPublishingExternalId()

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
   */
  public fun fileAssetPublishingRoleArn(): String? = unwrap(this).getFileAssetPublishingRoleArn()

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
   * Whether to add a Rule to the stack template verifying the bootstrap stack version.
   *
   * This generally should be left set to `true`, unless you explicitly
   * want to be able to deploy to an unbootstrapped environment.
   *
   * Default: true
   */
  public fun generateBootstrapVersionRule(): Boolean? =
      unwrap(this).getGenerateBootstrapVersionRule()

  /**
   * External ID to use when assuming role for image asset publishing.
   *
   * Default: - No external ID
   */
  public fun imageAssetPublishingExternalId(): String? =
      unwrap(this).getImageAssetPublishingExternalId()

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
   */
  public fun imageAssetPublishingRoleArn(): String? = unwrap(this).getImageAssetPublishingRoleArn()

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
   * The role to use to look up values from the target AWS account during synthesis.
   *
   * Default: - None
   */
  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  /**
   * External ID to use when assuming lookup role.
   *
   * Default: - No external ID
   */
  public fun lookupRoleExternalId(): String? = unwrap(this).getLookupRoleExternalId()

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
   * Use the bootstrapped lookup role for (read-only) stack operations.
   *
   * Use the lookup role when performing a `cdk diff`. If set to `false`, the
   * `deploy role` credentials will be used to perform a `cdk diff`.
   *
   * Requires bootstrap stack version 8.
   *
   * Default: true
   */
  public fun useLookupRoleForStackOperations(): Boolean? =
      unwrap(this).getUseLookupRoleForStackOperations()

  /**
   * A builder for [DefaultStackSynthesizerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bootstrapStackVersionSsmParameter Bootstrap stack version SSM parameter.
     * The placeholder `${Qualifier}` will be replaced with the value of qualifier.
     */
    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String)

    /**
     * @param bucketPrefix bucketPrefix to use while storing S3 Assets.
     */
    public fun bucketPrefix(bucketPrefix: String)

    /**
     * @param cloudFormationExecutionRole The role CloudFormation will assume when deploying the
     * Stack.
     * You must supply this if you have given a non-standard name to the execution role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     */
    public fun cloudFormationExecutionRole(cloudFormationExecutionRole: String)

    /**
     * @param deployRoleArn The role to assume to initiate a deployment in this environment.
     * You must supply this if you have given a non-standard name to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     */
    public fun deployRoleArn(deployRoleArn: String)

    /**
     * @param deployRoleExternalId External ID to use when assuming role for cloudformation
     * deployments.
     */
    public fun deployRoleExternalId(deployRoleExternalId: String)

    /**
     * @param dockerTagPrefix A prefix to use while tagging and uploading Docker images to ECR.
     * This does not add any separators - the source hash will be appended to
     * this string directly.
     */
    public fun dockerTagPrefix(dockerTagPrefix: String)

    /**
     * @param fileAssetPublishingExternalId External ID to use when assuming role for file asset
     * publishing.
     */
    public fun fileAssetPublishingExternalId(fileAssetPublishingExternalId: String)

    /**
     * @param fileAssetPublishingRoleArn The role to use to publish file assets to the S3 bucket in
     * this environment.
     * You must supply this if you have given a non-standard name to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     */
    public fun fileAssetPublishingRoleArn(fileAssetPublishingRoleArn: String)

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
     * @param generateBootstrapVersionRule Whether to add a Rule to the stack template verifying the
     * bootstrap stack version.
     * This generally should be left set to `true`, unless you explicitly
     * want to be able to deploy to an unbootstrapped environment.
     */
    public fun generateBootstrapVersionRule(generateBootstrapVersionRule: Boolean)

    /**
     * @param imageAssetPublishingExternalId External ID to use when assuming role for image asset
     * publishing.
     */
    public fun imageAssetPublishingExternalId(imageAssetPublishingExternalId: String)

    /**
     * @param imageAssetPublishingRoleArn The role to use to publish image assets to the ECR
     * repository in this environment.
     * You must supply this if you have given a non-standard name to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     */
    public fun imageAssetPublishingRoleArn(imageAssetPublishingRoleArn: String)

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
     * @param lookupRoleArn The role to use to look up values from the target AWS account during
     * synthesis.
     */
    public fun lookupRoleArn(lookupRoleArn: String)

    /**
     * @param lookupRoleExternalId External ID to use when assuming lookup role.
     */
    public fun lookupRoleExternalId(lookupRoleExternalId: String)

    /**
     * @param qualifier Qualifier to disambiguate multiple environments in the same account.
     * You can use this and leave the other naming properties empty if you have deployed
     * the bootstrap environment with standard names but only different qualifiers.
     */
    public fun qualifier(qualifier: String)

    /**
     * @param useLookupRoleForStackOperations Use the bootstrapped lookup role for (read-only) stack
     * operations.
     * Use the lookup role when performing a `cdk diff`. If set to `false`, the
     * `deploy role` credentials will be used to perform a `cdk diff`.
     *
     * Requires bootstrap stack version 8.
     */
    public fun useLookupRoleForStackOperations(useLookupRoleForStackOperations: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.DefaultStackSynthesizerProps.Builder =
        software.amazon.awscdk.DefaultStackSynthesizerProps.builder()

    /**
     * @param bootstrapStackVersionSsmParameter Bootstrap stack version SSM parameter.
     * The placeholder `${Qualifier}` will be replaced with the value of qualifier.
     */
    override fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
      cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    /**
     * @param bucketPrefix bucketPrefix to use while storing S3 Assets.
     */
    override fun bucketPrefix(bucketPrefix: String) {
      cdkBuilder.bucketPrefix(bucketPrefix)
    }

    /**
     * @param cloudFormationExecutionRole The role CloudFormation will assume when deploying the
     * Stack.
     * You must supply this if you have given a non-standard name to the execution role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     */
    override fun cloudFormationExecutionRole(cloudFormationExecutionRole: String) {
      cdkBuilder.cloudFormationExecutionRole(cloudFormationExecutionRole)
    }

    /**
     * @param deployRoleArn The role to assume to initiate a deployment in this environment.
     * You must supply this if you have given a non-standard name to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     */
    override fun deployRoleArn(deployRoleArn: String) {
      cdkBuilder.deployRoleArn(deployRoleArn)
    }

    /**
     * @param deployRoleExternalId External ID to use when assuming role for cloudformation
     * deployments.
     */
    override fun deployRoleExternalId(deployRoleExternalId: String) {
      cdkBuilder.deployRoleExternalId(deployRoleExternalId)
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
     * @param fileAssetPublishingExternalId External ID to use when assuming role for file asset
     * publishing.
     */
    override fun fileAssetPublishingExternalId(fileAssetPublishingExternalId: String) {
      cdkBuilder.fileAssetPublishingExternalId(fileAssetPublishingExternalId)
    }

    /**
     * @param fileAssetPublishingRoleArn The role to use to publish file assets to the S3 bucket in
     * this environment.
     * You must supply this if you have given a non-standard name to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     */
    override fun fileAssetPublishingRoleArn(fileAssetPublishingRoleArn: String) {
      cdkBuilder.fileAssetPublishingRoleArn(fileAssetPublishingRoleArn)
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
     * @param generateBootstrapVersionRule Whether to add a Rule to the stack template verifying the
     * bootstrap stack version.
     * This generally should be left set to `true`, unless you explicitly
     * want to be able to deploy to an unbootstrapped environment.
     */
    override fun generateBootstrapVersionRule(generateBootstrapVersionRule: Boolean) {
      cdkBuilder.generateBootstrapVersionRule(generateBootstrapVersionRule)
    }

    /**
     * @param imageAssetPublishingExternalId External ID to use when assuming role for image asset
     * publishing.
     */
    override fun imageAssetPublishingExternalId(imageAssetPublishingExternalId: String) {
      cdkBuilder.imageAssetPublishingExternalId(imageAssetPublishingExternalId)
    }

    /**
     * @param imageAssetPublishingRoleArn The role to use to publish image assets to the ECR
     * repository in this environment.
     * You must supply this if you have given a non-standard name to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will
     * be replaced with the values of qualifier and the stack's account and region,
     * respectively.
     */
    override fun imageAssetPublishingRoleArn(imageAssetPublishingRoleArn: String) {
      cdkBuilder.imageAssetPublishingRoleArn(imageAssetPublishingRoleArn)
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
     * @param lookupRoleArn The role to use to look up values from the target AWS account during
     * synthesis.
     */
    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    /**
     * @param lookupRoleExternalId External ID to use when assuming lookup role.
     */
    override fun lookupRoleExternalId(lookupRoleExternalId: String) {
      cdkBuilder.lookupRoleExternalId(lookupRoleExternalId)
    }

    /**
     * @param qualifier Qualifier to disambiguate multiple environments in the same account.
     * You can use this and leave the other naming properties empty if you have deployed
     * the bootstrap environment with standard names but only different qualifiers.
     */
    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    /**
     * @param useLookupRoleForStackOperations Use the bootstrapped lookup role for (read-only) stack
     * operations.
     * Use the lookup role when performing a `cdk diff`. If set to `false`, the
     * `deploy role` credentials will be used to perform a `cdk diff`.
     *
     * Requires bootstrap stack version 8.
     */
    override fun useLookupRoleForStackOperations(useLookupRoleForStackOperations: Boolean) {
      cdkBuilder.useLookupRoleForStackOperations(useLookupRoleForStackOperations)
    }

    public fun build(): software.amazon.awscdk.DefaultStackSynthesizerProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.DefaultStackSynthesizerProps,
  ) : CdkObject(cdkObject), DefaultStackSynthesizerProps {
    /**
     * Bootstrap stack version SSM parameter.
     *
     * The placeholder `${Qualifier}` will be replaced with the value of qualifier.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_BOOTSTRAP_STACK_VERSION_SSM_PARAMETER
     */
    override fun bootstrapStackVersionSsmParameter(): String? =
        unwrap(this).getBootstrapStackVersionSsmParameter()

    /**
     * bucketPrefix to use while storing S3 Assets.
     *
     * Default: - DefaultStackSynthesizer.DEFAULT_FILE_ASSET_PREFIX
     */
    override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

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
     */
    override fun cloudFormationExecutionRole(): String? =
        unwrap(this).getCloudFormationExecutionRole()

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
     */
    override fun deployRoleArn(): String? = unwrap(this).getDeployRoleArn()

    /**
     * External ID to use when assuming role for cloudformation deployments.
     *
     * Default: - No external ID
     */
    override fun deployRoleExternalId(): String? = unwrap(this).getDeployRoleExternalId()

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
     * External ID to use when assuming role for file asset publishing.
     *
     * Default: - No external ID
     */
    override fun fileAssetPublishingExternalId(): String? =
        unwrap(this).getFileAssetPublishingExternalId()

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
     */
    override fun fileAssetPublishingRoleArn(): String? =
        unwrap(this).getFileAssetPublishingRoleArn()

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
     * Whether to add a Rule to the stack template verifying the bootstrap stack version.
     *
     * This generally should be left set to `true`, unless you explicitly
     * want to be able to deploy to an unbootstrapped environment.
     *
     * Default: true
     */
    override fun generateBootstrapVersionRule(): Boolean? =
        unwrap(this).getGenerateBootstrapVersionRule()

    /**
     * External ID to use when assuming role for image asset publishing.
     *
     * Default: - No external ID
     */
    override fun imageAssetPublishingExternalId(): String? =
        unwrap(this).getImageAssetPublishingExternalId()

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
     */
    override fun imageAssetPublishingRoleArn(): String? =
        unwrap(this).getImageAssetPublishingRoleArn()

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
     * The role to use to look up values from the target AWS account during synthesis.
     *
     * Default: - None
     */
    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    /**
     * External ID to use when assuming lookup role.
     *
     * Default: - No external ID
     */
    override fun lookupRoleExternalId(): String? = unwrap(this).getLookupRoleExternalId()

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

    /**
     * Use the bootstrapped lookup role for (read-only) stack operations.
     *
     * Use the lookup role when performing a `cdk diff`. If set to `false`, the
     * `deploy role` credentials will be used to perform a `cdk diff`.
     *
     * Requires bootstrap stack version 8.
     *
     * Default: true
     */
    override fun useLookupRoleForStackOperations(): Boolean? =
        unwrap(this).getUseLookupRoleForStackOperations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DefaultStackSynthesizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.DefaultStackSynthesizerProps):
        DefaultStackSynthesizerProps = CdkObjectWrappers.wrap(cdkObject) as
        DefaultStackSynthesizerProps

    internal fun unwrap(wrapped: DefaultStackSynthesizerProps):
        software.amazon.awscdk.DefaultStackSynthesizerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.DefaultStackSynthesizerProps
  }
}
