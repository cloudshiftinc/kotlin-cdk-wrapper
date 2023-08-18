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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAssetProps

/**
 * Properties for defining a `CfnAsset`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * CfnAssetProps cfnAssetProps = CfnAssetProps.builder()
 * .assetModelId("assetModelId")
 * .assetName("assetName")
 * // the properties below are optional
 * .assetDescription("assetDescription")
 * .assetHierarchies(List.of(AssetHierarchyProperty.builder()
 * .childAssetId("childAssetId")
 * .logicalId("logicalId")
 * .build()))
 * .assetProperties(List.of(AssetPropertyProperty.builder()
 * .logicalId("logicalId")
 * // the properties below are optional
 * .alias("alias")
 * .notificationState("notificationState")
 * .unit("unit")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html)
 */
@CdkDslMarker
public class CfnAssetPropsDsl {
    private val cdkBuilder: CfnAssetProps.Builder = CfnAssetProps.builder()

    private val _assetHierarchies: MutableList<Any> = mutableListOf()

    private val _assetProperties: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param assetDescription A description for the asset. */
    public fun assetDescription(assetDescription: String) {
        cdkBuilder.assetDescription(assetDescription)
    }

    /**
     * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyLogicalId`
     *   . A hierarchy specifies allowed parent/child asset relationships.
     */
    public fun assetHierarchies(vararg assetHierarchies: Any) {
        _assetHierarchies.addAll(listOf(*assetHierarchies))
    }

    /**
     * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyLogicalId`
     *   . A hierarchy specifies allowed parent/child asset relationships.
     */
    public fun assetHierarchies(assetHierarchies: Collection<Any>) {
        _assetHierarchies.addAll(assetHierarchies)
    }

    /**
     * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyLogicalId`
     *   . A hierarchy specifies allowed parent/child asset relationships.
     */
    public fun assetHierarchies(assetHierarchies: IResolvable) {
        cdkBuilder.assetHierarchies(assetHierarchies)
    }

    /** @param assetModelId The ID of the asset model from which to create the asset. */
    public fun assetModelId(assetModelId: String) {
        cdkBuilder.assetModelId(assetModelId)
    }

    /**
     * @param assetName A unique, friendly name for the asset. The maximum length is 256 characters
     *   with the pattern `[^\u0000-\u001F\u007F]+` .
     */
    public fun assetName(assetName: String) {
        cdkBuilder.assetName(assetName)
    }

    /**
     * @param assetProperties The list of asset properties for the asset. This object doesn't
     *   include properties that you define in composite models. You can find composite model
     *   properties in the `assetCompositeModels` object.
     */
    public fun assetProperties(vararg assetProperties: Any) {
        _assetProperties.addAll(listOf(*assetProperties))
    }

    /**
     * @param assetProperties The list of asset properties for the asset. This object doesn't
     *   include properties that you define in composite models. You can find composite model
     *   properties in the `assetCompositeModels` object.
     */
    public fun assetProperties(assetProperties: Collection<Any>) {
        _assetProperties.addAll(assetProperties)
    }

    /**
     * @param assetProperties The list of asset properties for the asset. This object doesn't
     *   include properties that you define in composite models. You can find composite model
     *   properties in the `assetCompositeModels` object.
     */
    public fun assetProperties(assetProperties: IResolvable) {
        cdkBuilder.assetProperties(assetProperties)
    }

    /**
     * @param tags A list of key-value pairs that contain metadata for the asset. For more
     *   information, see
     *   [Tagging your AWS IoT SiteWise resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html)
     *   in the *AWS IoT SiteWise User Guide* .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of key-value pairs that contain metadata for the asset. For more
     *   information, see
     *   [Tagging your AWS IoT SiteWise resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html)
     *   in the *AWS IoT SiteWise User Guide* .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAssetProps {
        if (_assetHierarchies.isNotEmpty()) cdkBuilder.assetHierarchies(_assetHierarchies)
        if (_assetProperties.isNotEmpty()) cdkBuilder.assetProperties(_assetProperties)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
