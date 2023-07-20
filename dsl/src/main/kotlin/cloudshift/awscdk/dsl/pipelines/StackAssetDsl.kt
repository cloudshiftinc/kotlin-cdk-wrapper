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

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.pipelines.AssetType
import software.amazon.awscdk.pipelines.StackAsset
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class StackAssetDsl {
    private val cdkBuilder: StackAsset.Builder = StackAsset.builder()

    public fun assetId(assetId: String) {
        cdkBuilder.assetId(assetId)
    }

    public fun assetManifestPath(assetManifestPath: String) {
        cdkBuilder.assetManifestPath(assetManifestPath)
    }

    public fun assetPublishingRoleArn(assetPublishingRoleArn: String) {
        cdkBuilder.assetPublishingRoleArn(assetPublishingRoleArn)
    }

    public fun assetSelector(assetSelector: String) {
        cdkBuilder.assetSelector(assetSelector)
    }

    public fun assetType(assetType: AssetType) {
        cdkBuilder.assetType(assetType)
    }

    public fun isTemplate(isTemplate: Boolean) {
        cdkBuilder.isTemplate(isTemplate)
    }

    public fun build(): StackAsset = cdkBuilder.build()
}
