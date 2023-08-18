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

package io.cloudshiftdev.awscdkdsl.services.iotsitewise

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAsset

/**
 * Describes an asset hierarchy that contains a `childAssetId` and `hierarchyLogicalId` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * AssetHierarchyProperty assetHierarchyProperty = AssetHierarchyProperty.builder()
 * .childAssetId("childAssetId")
 * .logicalId("logicalId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assethierarchy.html)
 */
@CdkDslMarker
public class CfnAssetAssetHierarchyPropertyDsl {
    private val cdkBuilder: CfnAsset.AssetHierarchyProperty.Builder =
        CfnAsset.AssetHierarchyProperty.builder()

    /** @param childAssetId The Id of the child asset. */
    public fun childAssetId(childAssetId: String) {
        cdkBuilder.childAssetId(childAssetId)
    }

    /**
     * @param logicalId The `LogicalID` of the hierarchy. This ID is a `hierarchyLogicalId` . The
     *   maximum length is 256 characters, with the pattern `[^\u0000-\u001F\u007F]+` .
     */
    public fun logicalId(logicalId: String) {
        cdkBuilder.logicalId(logicalId)
    }

    public fun build(): CfnAsset.AssetHierarchyProperty = cdkBuilder.build()
}
