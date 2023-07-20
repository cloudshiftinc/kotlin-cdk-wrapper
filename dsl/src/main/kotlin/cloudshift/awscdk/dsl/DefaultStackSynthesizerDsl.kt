@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.DefaultStackSynthesizer
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class DefaultStackSynthesizerDsl {
    private val cdkBuilder: DefaultStackSynthesizer.Builder = DefaultStackSynthesizer.Builder.create()

    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
        cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    public fun cloudFormationExecutionRole(cloudFormationExecutionRole: String) {
        cdkBuilder.cloudFormationExecutionRole(cloudFormationExecutionRole)
    }

    public fun deployRoleArn(deployRoleArn: String) {
        cdkBuilder.deployRoleArn(deployRoleArn)
    }

    public fun deployRoleExternalId(deployRoleExternalId: String) {
        cdkBuilder.deployRoleExternalId(deployRoleExternalId)
    }

    public fun dockerTagPrefix(dockerTagPrefix: String) {
        cdkBuilder.dockerTagPrefix(dockerTagPrefix)
    }

    public fun fileAssetPublishingExternalId(fileAssetPublishingExternalId: String) {
        cdkBuilder.fileAssetPublishingExternalId(fileAssetPublishingExternalId)
    }

    public fun fileAssetPublishingRoleArn(fileAssetPublishingRoleArn: String) {
        cdkBuilder.fileAssetPublishingRoleArn(fileAssetPublishingRoleArn)
    }

    public fun fileAssetsBucketName(fileAssetsBucketName: String) {
        cdkBuilder.fileAssetsBucketName(fileAssetsBucketName)
    }

    public fun generateBootstrapVersionRule(generateBootstrapVersionRule: Boolean) {
        cdkBuilder.generateBootstrapVersionRule(generateBootstrapVersionRule)
    }

    public fun imageAssetPublishingExternalId(imageAssetPublishingExternalId: String) {
        cdkBuilder.imageAssetPublishingExternalId(imageAssetPublishingExternalId)
    }

    public fun imageAssetPublishingRoleArn(imageAssetPublishingRoleArn: String) {
        cdkBuilder.imageAssetPublishingRoleArn(imageAssetPublishingRoleArn)
    }

    public fun imageAssetsRepositoryName(imageAssetsRepositoryName: String) {
        cdkBuilder.imageAssetsRepositoryName(imageAssetsRepositoryName)
    }

    public fun lookupRoleArn(lookupRoleArn: String) {
        cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    public fun lookupRoleExternalId(lookupRoleExternalId: String) {
        cdkBuilder.lookupRoleExternalId(lookupRoleExternalId)
    }

    public fun qualifier(qualifier: String) {
        cdkBuilder.qualifier(qualifier)
    }

    public fun useLookupRoleForStackOperations(useLookupRoleForStackOperations: Boolean) {
        cdkBuilder.useLookupRoleForStackOperations(useLookupRoleForStackOperations)
    }

    public fun build(): DefaultStackSynthesizer = cdkBuilder.build()
}
