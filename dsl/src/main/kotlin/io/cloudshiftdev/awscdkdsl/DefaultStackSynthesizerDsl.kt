@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.DefaultStackSynthesizer

/**
 * Uses conventionally named roles and asset storage locations.
 *
 * This synthesizer:
 * * Supports cross-account deployments (the CLI can have credentials to one account, and you can
 *   still deploy to another account by assuming roles with well-known names in the other account).
 * * Supports the **CDK Pipelines** library.
 *
 * Requires the environment to have been bootstrapped with Bootstrap Stack V2 (also known as "modern
 * bootstrap stack"). The synthesizer adds a version check to the template, to make sure the
 * bootstrap stack is recent enough to support all features expected by this synthesizer.
 *
 * Example:
 * ```
 * App app;
 * Stage prodStage = Stage.Builder.create(app, "ProdStage")
 * .permissionsBoundary(PermissionsBoundary.fromName("cdk-${Qualifier}-PermissionsBoundary-${AWS::AccountId}-${AWS::Region}"))
 * .build();
 * Stack.Builder.create(prodStage, "ProdStack")
 * .synthesizer(DefaultStackSynthesizer.Builder.create()
 * .qualifier("custom")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class DefaultStackSynthesizerDsl {
    private val cdkBuilder: DefaultStackSynthesizer.Builder =
        DefaultStackSynthesizer.Builder.create()

    /**
     * Bootstrap stack version SSM parameter.
     *
     * The placeholder `${Qualifier}` will be replaced with the value of qualifier.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_BOOTSTRAP_STACK_VERSION_SSM_PARAMETER
     *
     * @param bootstrapStackVersionSsmParameter Bootstrap stack version SSM parameter.
     */
    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
        cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

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
     * The role CloudFormation will assume when deploying the Stack.
     *
     * You must supply this if you have given a non-standard name to the execution role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will be replaced
     * with the values of qualifier and the stack's account and region, respectively.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_CLOUDFORMATION_ROLE_ARN
     *
     * @param cloudFormationExecutionRole The role CloudFormation will assume when deploying the
     *   Stack.
     */
    public fun cloudFormationExecutionRole(cloudFormationExecutionRole: String) {
        cdkBuilder.cloudFormationExecutionRole(cloudFormationExecutionRole)
    }

    /**
     * The role to assume to initiate a deployment in this environment.
     *
     * You must supply this if you have given a non-standard name to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will be replaced
     * with the values of qualifier and the stack's account and region, respectively.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_DEPLOY_ROLE_ARN
     *
     * @param deployRoleArn The role to assume to initiate a deployment in this environment.
     */
    public fun deployRoleArn(deployRoleArn: String) {
        cdkBuilder.deployRoleArn(deployRoleArn)
    }

    /**
     * External ID to use when assuming role for cloudformation deployments.
     *
     * Default: - No external ID
     *
     * @param deployRoleExternalId External ID to use when assuming role for cloudformation
     *   deployments.
     */
    public fun deployRoleExternalId(deployRoleExternalId: String) {
        cdkBuilder.deployRoleExternalId(deployRoleExternalId)
    }

    /**
     * A prefix to use while tagging and uploading Docker images to ECR.
     *
     * This does not add any separators - the source hash will be appended to this string directly.
     *
     * Default: - DefaultStackSynthesizer.DEFAULT_DOCKER_ASSET_PREFIX
     *
     * @param dockerTagPrefix A prefix to use while tagging and uploading Docker images to ECR.
     */
    public fun dockerTagPrefix(dockerTagPrefix: String) {
        cdkBuilder.dockerTagPrefix(dockerTagPrefix)
    }

    /**
     * External ID to use when assuming role for file asset publishing.
     *
     * Default: - No external ID
     *
     * @param fileAssetPublishingExternalId External ID to use when assuming role for file asset
     *   publishing.
     */
    public fun fileAssetPublishingExternalId(fileAssetPublishingExternalId: String) {
        cdkBuilder.fileAssetPublishingExternalId(fileAssetPublishingExternalId)
    }

    /**
     * The role to use to publish file assets to the S3 bucket in this environment.
     *
     * You must supply this if you have given a non-standard name to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will be replaced
     * with the values of qualifier and the stack's account and region, respectively.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_FILE_ASSET_PUBLISHING_ROLE_ARN
     *
     * @param fileAssetPublishingRoleArn The role to use to publish file assets to the S3 bucket in
     *   this environment.
     */
    public fun fileAssetPublishingRoleArn(fileAssetPublishingRoleArn: String) {
        cdkBuilder.fileAssetPublishingRoleArn(fileAssetPublishingRoleArn)
    }

    /**
     * Name of the S3 bucket to hold file assets.
     *
     * You must supply this if you have given a non-standard name to the staging bucket.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will be replaced
     * with the values of qualifier and the stack's account and region, respectively.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_FILE_ASSETS_BUCKET_NAME
     *
     * @param fileAssetsBucketName Name of the S3 bucket to hold file assets.
     */
    public fun fileAssetsBucketName(fileAssetsBucketName: String) {
        cdkBuilder.fileAssetsBucketName(fileAssetsBucketName)
    }

    /**
     * Whether to add a Rule to the stack template verifying the bootstrap stack version.
     *
     * This generally should be left set to `true`, unless you explicitly want to be able to deploy
     * to an unbootstrapped environment.
     *
     * Default: true
     *
     * @param generateBootstrapVersionRule Whether to add a Rule to the stack template verifying the
     *   bootstrap stack version.
     */
    public fun generateBootstrapVersionRule(generateBootstrapVersionRule: Boolean) {
        cdkBuilder.generateBootstrapVersionRule(generateBootstrapVersionRule)
    }

    /**
     * External ID to use when assuming role for image asset publishing.
     *
     * Default: - No external ID
     *
     * @param imageAssetPublishingExternalId External ID to use when assuming role for image asset
     *   publishing.
     */
    public fun imageAssetPublishingExternalId(imageAssetPublishingExternalId: String) {
        cdkBuilder.imageAssetPublishingExternalId(imageAssetPublishingExternalId)
    }

    /**
     * The role to use to publish image assets to the ECR repository in this environment.
     *
     * You must supply this if you have given a non-standard name to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will be replaced
     * with the values of qualifier and the stack's account and region, respectively.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_IMAGE_ASSET_PUBLISHING_ROLE_ARN
     *
     * @param imageAssetPublishingRoleArn The role to use to publish image assets to the ECR
     *   repository in this environment.
     */
    public fun imageAssetPublishingRoleArn(imageAssetPublishingRoleArn: String) {
        cdkBuilder.imageAssetPublishingRoleArn(imageAssetPublishingRoleArn)
    }

    /**
     * Name of the ECR repository to hold Docker Image assets.
     *
     * You must supply this if you have given a non-standard name to the ECR repository.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will be replaced
     * with the values of qualifier and the stack's account and region, respectively.
     *
     * Default: DefaultStackSynthesizer.DEFAULT_IMAGE_ASSETS_REPOSITORY_NAME
     *
     * @param imageAssetsRepositoryName Name of the ECR repository to hold Docker Image assets.
     */
    public fun imageAssetsRepositoryName(imageAssetsRepositoryName: String) {
        cdkBuilder.imageAssetsRepositoryName(imageAssetsRepositoryName)
    }

    /**
     * The role to use to look up values from the target AWS account during synthesis.
     *
     * Default: - None
     *
     * @param lookupRoleArn The role to use to look up values from the target AWS account during
     *   synthesis.
     */
    public fun lookupRoleArn(lookupRoleArn: String) {
        cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    /**
     * External ID to use when assuming lookup role.
     *
     * Default: - No external ID
     *
     * @param lookupRoleExternalId External ID to use when assuming lookup role.
     */
    public fun lookupRoleExternalId(lookupRoleExternalId: String) {
        cdkBuilder.lookupRoleExternalId(lookupRoleExternalId)
    }

    /**
     * Qualifier to disambiguate multiple environments in the same account.
     *
     * You can use this and leave the other naming properties empty if you have deployed the
     * bootstrap environment with standard names but only different qualifiers.
     *
     * Default: - Value of context key '@aws-cdk/core:bootstrapQualifier' if set, otherwise
     * `DefaultStackSynthesizer.DEFAULT_QUALIFIER`
     *
     * @param qualifier Qualifier to disambiguate multiple environments in the same account.
     */
    public fun qualifier(qualifier: String) {
        cdkBuilder.qualifier(qualifier)
    }

    /**
     * Use the bootstrapped lookup role for (read-only) stack operations.
     *
     * Use the lookup role when performing a `cdk diff`. If set to `false`, the `deploy role`
     * credentials will be used to perform a `cdk diff`.
     *
     * Requires bootstrap stack version 8.
     *
     * Default: true
     *
     * @param useLookupRoleForStackOperations Use the bootstrapped lookup role for (read-only) stack
     *   operations.
     */
    public fun useLookupRoleForStackOperations(useLookupRoleForStackOperations: Boolean) {
        cdkBuilder.useLookupRoleForStackOperations(useLookupRoleForStackOperations)
    }

    public fun build(): DefaultStackSynthesizer = cdkBuilder.build()
}
