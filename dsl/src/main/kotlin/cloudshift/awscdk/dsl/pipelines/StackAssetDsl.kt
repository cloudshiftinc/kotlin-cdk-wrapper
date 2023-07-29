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

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.pipelines.AssetType
import software.amazon.awscdk.pipelines.StackAsset

/**
 * An asset used by a Stack.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.pipelines.*;
 * StackAsset stackAsset = StackAsset.builder()
 * .assetId("assetId")
 * .assetManifestPath("assetManifestPath")
 * .assetSelector("assetSelector")
 * .assetType(AssetType.FILE)
 * .isTemplate(false)
 * // the properties below are optional
 * .assetPublishingRoleArn("assetPublishingRoleArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class StackAssetDsl {
    private val cdkBuilder: StackAsset.Builder = StackAsset.builder()

    /** @param assetId Asset identifier. */
    public fun assetId(assetId: String) {
        cdkBuilder.assetId(assetId)
    }

    /**
     * @param assetManifestPath Absolute asset manifest path. This needs to be made relative at a
     *   later point in time, but when this information is parsed we don't know about the root cloud
     *   assembly yet.
     */
    public fun assetManifestPath(assetManifestPath: String) {
        cdkBuilder.assetManifestPath(assetManifestPath)
    }

    /** @param assetPublishingRoleArn Role ARN to assume to publish. */
    public fun assetPublishingRoleArn(assetPublishingRoleArn: String) {
        cdkBuilder.assetPublishingRoleArn(assetPublishingRoleArn)
    }

    /** @param assetSelector Asset selector to pass to `cdk-assets`. */
    public fun assetSelector(assetSelector: String) {
        cdkBuilder.assetSelector(assetSelector)
    }

    /** @param assetType Type of asset to publish. */
    public fun assetType(assetType: AssetType) {
        cdkBuilder.assetType(assetType)
    }

    /** @param isTemplate Does this asset represent the CloudFormation template for the stack. */
    public fun isTemplate(isTemplate: Boolean) {
        cdkBuilder.isTemplate(isTemplate)
    }

    public fun build(): StackAsset = cdkBuilder.build()
}
