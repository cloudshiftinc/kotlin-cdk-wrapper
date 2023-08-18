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

package io.cloudshiftdev.awscdkdsl.pipelines

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.pipelines.StackAsset
import software.amazon.awscdk.pipelines.StackDeploymentProps

/**
 * Properties for a `StackDeployment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.pipelines.*;
 * StackDeploymentProps stackDeploymentProps = StackDeploymentProps.builder()
 * .absoluteTemplatePath("absoluteTemplatePath")
 * .constructPath("constructPath")
 * .stackArtifactId("stackArtifactId")
 * .stackName("stackName")
 * // the properties below are optional
 * .account("account")
 * .assets(List.of(StackAsset.builder()
 * .assetId("assetId")
 * .assetManifestPath("assetManifestPath")
 * .assetSelector("assetSelector")
 * .assetType(AssetType.FILE)
 * .isTemplate(false)
 * // the properties below are optional
 * .assetPublishingRoleArn("assetPublishingRoleArn")
 * .build()))
 * .assumeRoleArn("assumeRoleArn")
 * .executionRoleArn("executionRoleArn")
 * .region("region")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .templateS3Uri("templateS3Uri")
 * .build();
 * ```
 */
@CdkDslMarker
public class StackDeploymentPropsDsl {
    private val cdkBuilder: StackDeploymentProps.Builder = StackDeploymentProps.builder()

    private val _assets: MutableList<StackAsset> = mutableListOf()

    /** @param absoluteTemplatePath Template path on disk to cloud assembly (cdk.out). */
    public fun absoluteTemplatePath(absoluteTemplatePath: String) {
        cdkBuilder.absoluteTemplatePath(absoluteTemplatePath)
    }

    /** @param account Account where the stack should be deployed. */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /** @param assets Assets referenced by this stack. */
    public fun assets(assets: StackAssetDsl.() -> Unit) {
        _assets.add(StackAssetDsl().apply(assets).build())
    }

    /** @param assets Assets referenced by this stack. */
    public fun assets(assets: Collection<StackAsset>) {
        _assets.addAll(assets)
    }

    /** @param assumeRoleArn Role to assume before deploying this stack. */
    public fun assumeRoleArn(assumeRoleArn: String) {
        cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    /** @param constructPath Construct path for this stack. */
    public fun constructPath(constructPath: String) {
        cdkBuilder.constructPath(constructPath)
    }

    /** @param executionRoleArn Execution role to pass to CloudFormation. */
    public fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /** @param region Region where the stack should be deployed. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /** @param stackArtifactId Artifact ID for this stack. */
    public fun stackArtifactId(stackArtifactId: String) {
        cdkBuilder.stackArtifactId(stackArtifactId)
    }

    /** @param stackName Name for this stack. */
    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    /** @param tags Tags to apply to the stack. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * @param templateS3Uri The S3 URL which points to the template asset location in the publishing
     *   bucket.
     */
    public fun templateS3Uri(templateS3Uri: String) {
        cdkBuilder.templateS3Uri(templateS3Uri)
    }

    public fun build(): StackDeploymentProps {
        if (_assets.isNotEmpty()) cdkBuilder.assets(_assets)
        return cdkBuilder.build()
    }
}
