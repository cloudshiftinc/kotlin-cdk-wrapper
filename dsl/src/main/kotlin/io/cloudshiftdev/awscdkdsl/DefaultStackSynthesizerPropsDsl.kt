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
import software.amazon.awscdk.DefaultStackSynthesizerProps

/**
 * Configuration properties for DefaultStackSynthesizer.
 *
 * Example:
 * ```
 * MyStack.Builder.create(app, "MyStack")
 * .synthesizer(DefaultStackSynthesizer.Builder.create()
 * .fileAssetsBucketName("my-orgs-asset-bucket")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class DefaultStackSynthesizerPropsDsl {
    private val cdkBuilder: DefaultStackSynthesizerProps.Builder =
        DefaultStackSynthesizerProps.builder()

    /**
     * @param bootstrapStackVersionSsmParameter Bootstrap stack version SSM parameter. The
     *   placeholder `${Qualifier}` will be replaced with the value of qualifier.
     */
    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
        cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    /** @param bucketPrefix bucketPrefix to use while storing S3 Assets. */
    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    /**
     * @param cloudFormationExecutionRole The role CloudFormation will assume when deploying the
     *   Stack. You must supply this if you have given a non-standard name to the execution role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will be replaced
     * with the values of qualifier and the stack's account and region, respectively.
     */
    public fun cloudFormationExecutionRole(cloudFormationExecutionRole: String) {
        cdkBuilder.cloudFormationExecutionRole(cloudFormationExecutionRole)
    }

    /**
     * @param deployRoleArn The role to assume to initiate a deployment in this environment. You
     *   must supply this if you have given a non-standard name to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will be replaced
     * with the values of qualifier and the stack's account and region, respectively.
     */
    public fun deployRoleArn(deployRoleArn: String) {
        cdkBuilder.deployRoleArn(deployRoleArn)
    }

    /**
     * @param deployRoleExternalId External ID to use when assuming role for cloudformation
     *   deployments.
     */
    public fun deployRoleExternalId(deployRoleExternalId: String) {
        cdkBuilder.deployRoleExternalId(deployRoleExternalId)
    }

    /**
     * @param dockerTagPrefix A prefix to use while tagging and uploading Docker images to ECR. This
     *   does not add any separators - the source hash will be appended to this string directly.
     */
    public fun dockerTagPrefix(dockerTagPrefix: String) {
        cdkBuilder.dockerTagPrefix(dockerTagPrefix)
    }

    /**
     * @param fileAssetPublishingExternalId External ID to use when assuming role for file asset
     *   publishing.
     */
    public fun fileAssetPublishingExternalId(fileAssetPublishingExternalId: String) {
        cdkBuilder.fileAssetPublishingExternalId(fileAssetPublishingExternalId)
    }

    /**
     * @param fileAssetPublishingRoleArn The role to use to publish file assets to the S3 bucket in
     *   this environment. You must supply this if you have given a non-standard name to the
     *   publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will be replaced
     * with the values of qualifier and the stack's account and region, respectively.
     */
    public fun fileAssetPublishingRoleArn(fileAssetPublishingRoleArn: String) {
        cdkBuilder.fileAssetPublishingRoleArn(fileAssetPublishingRoleArn)
    }

    /**
     * @param fileAssetsBucketName Name of the S3 bucket to hold file assets. You must supply this
     *   if you have given a non-standard name to the staging bucket.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will be replaced
     * with the values of qualifier and the stack's account and region, respectively.
     */
    public fun fileAssetsBucketName(fileAssetsBucketName: String) {
        cdkBuilder.fileAssetsBucketName(fileAssetsBucketName)
    }

    /**
     * @param generateBootstrapVersionRule Whether to add a Rule to the stack template verifying the
     *   bootstrap stack version. This generally should be left set to `true`, unless you explicitly
     *   want to be able to deploy to an unbootstrapped environment.
     */
    public fun generateBootstrapVersionRule(generateBootstrapVersionRule: Boolean) {
        cdkBuilder.generateBootstrapVersionRule(generateBootstrapVersionRule)
    }

    /**
     * @param imageAssetPublishingExternalId External ID to use when assuming role for image asset
     *   publishing.
     */
    public fun imageAssetPublishingExternalId(imageAssetPublishingExternalId: String) {
        cdkBuilder.imageAssetPublishingExternalId(imageAssetPublishingExternalId)
    }

    /**
     * @param imageAssetPublishingRoleArn The role to use to publish image assets to the ECR
     *   repository in this environment. You must supply this if you have given a non-standard name
     *   to the publishing role.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will be replaced
     * with the values of qualifier and the stack's account and region, respectively.
     */
    public fun imageAssetPublishingRoleArn(imageAssetPublishingRoleArn: String) {
        cdkBuilder.imageAssetPublishingRoleArn(imageAssetPublishingRoleArn)
    }

    /**
     * @param imageAssetsRepositoryName Name of the ECR repository to hold Docker Image assets. You
     *   must supply this if you have given a non-standard name to the ECR repository.
     *
     * The placeholders `${Qualifier}`, `${AWS::AccountId}` and `${AWS::Region}` will be replaced
     * with the values of qualifier and the stack's account and region, respectively.
     */
    public fun imageAssetsRepositoryName(imageAssetsRepositoryName: String) {
        cdkBuilder.imageAssetsRepositoryName(imageAssetsRepositoryName)
    }

    /**
     * @param lookupRoleArn The role to use to look up values from the target AWS account during
     *   synthesis.
     */
    public fun lookupRoleArn(lookupRoleArn: String) {
        cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    /** @param lookupRoleExternalId External ID to use when assuming lookup role. */
    public fun lookupRoleExternalId(lookupRoleExternalId: String) {
        cdkBuilder.lookupRoleExternalId(lookupRoleExternalId)
    }

    /**
     * @param qualifier Qualifier to disambiguate multiple environments in the same account. You can
     *   use this and leave the other naming properties empty if you have deployed the bootstrap
     *   environment with standard names but only different qualifiers.
     */
    public fun qualifier(qualifier: String) {
        cdkBuilder.qualifier(qualifier)
    }

    /**
     * @param useLookupRoleForStackOperations Use the bootstrapped lookup role for (read-only) stack
     *   operations. Use the lookup role when performing a `cdk diff`. If set to `false`, the
     *   `deploy role` credentials will be used to perform a `cdk diff`.
     *
     * Requires bootstrap stack version 8.
     */
    public fun useLookupRoleForStackOperations(useLookupRoleForStackOperations: Boolean) {
        cdkBuilder.useLookupRoleForStackOperations(useLookupRoleForStackOperations)
    }

    public fun build(): DefaultStackSynthesizerProps = cdkBuilder.build()
}
