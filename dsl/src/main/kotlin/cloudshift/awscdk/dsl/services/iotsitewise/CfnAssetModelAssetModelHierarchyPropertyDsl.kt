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

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

/**
 * Describes an asset hierarchy that contains a hierarchy's name, `LogicalID` , and child asset
 * model ID that specifies the type of asset that can be in this hierarchy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * AssetModelHierarchyProperty assetModelHierarchyProperty = AssetModelHierarchyProperty.builder()
 * .childAssetModelId("childAssetModelId")
 * .logicalId("logicalId")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelhierarchy.html)
 */
@CdkDslMarker
public class CfnAssetModelAssetModelHierarchyPropertyDsl {
    private val cdkBuilder: CfnAssetModel.AssetModelHierarchyProperty.Builder =
        CfnAssetModel.AssetModelHierarchyProperty.builder()

    /** @param childAssetModelId The Id of the asset model. */
    public fun childAssetModelId(childAssetModelId: String) {
        cdkBuilder.childAssetModelId(childAssetModelId)
    }

    /**
     * @param logicalId The `LogicalID` of the asset model hierarchy. This ID is a
     *   `hierarchyLogicalId` . The maximum length is 256 characters, with the pattern
     *   `[^\u0000-\u001F\u007F]+`
     */
    public fun logicalId(logicalId: String) {
        cdkBuilder.logicalId(logicalId)
    }

    /**
     * @param name The name of the asset model hierarchy. The maximum length is 256 characters with
     *   the pattern `[^\u0000-\u001F\u007F]+` .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnAssetModel.AssetModelHierarchyProperty = cdkBuilder.build()
}
