@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnAsset`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
 * CfnAssetProps cfnAssetProps = CfnAssetProps.builder()
 * .assetModelId("assetModelId")
 * .assetName("assetName")
 * // the properties below are optional
 * .assetDescription("assetDescription")
 * .assetExternalId("assetExternalId")
 * .assetHierarchies(List.of(AssetHierarchyProperty.builder()
 * .childAssetId("childAssetId")
 * // the properties below are optional
 * .externalId("externalId")
 * .id("id")
 * .logicalId("logicalId")
 * .build()))
 * .assetProperties(List.of(AssetPropertyProperty.builder()
 * .alias("alias")
 * .externalId("externalId")
 * .id("id")
 * .logicalId("logicalId")
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
public interface CfnAssetProps {
  /**
   * The ID of the asset, in UUID format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetdescription)
   */
  public fun assetDescription(): String? = unwrap(this).getAssetDescription()

  /**
   * The external ID of the asset model composite model.
   *
   * For more information, see [Using external
   * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids) in
   * the *AWS IoT SiteWise User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetexternalid)
   */
  public fun assetExternalId(): String? = unwrap(this).getAssetExternalId()

  /**
   * A list of asset hierarchies that each contain a `hierarchyId` .
   *
   * A hierarchy specifies allowed parent/child asset relationships.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assethierarchies)
   */
  public fun assetHierarchies(): Any? = unwrap(this).getAssetHierarchies()

  /**
   * The ID of the asset model from which to create the asset.
   *
   * This can be either the actual ID in UUID format, or else `externalId:` followed by the external
   * ID, if it has one. For more information, see [Referencing objects with external
   * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references)
   * in the *AWS IoT SiteWise User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetmodelid)
   */
  public fun assetModelId(): String

  /**
   * A friendly name for the asset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetname)
   */
  public fun assetName(): String

  /**
   * The list of asset properties for the asset.
   *
   * This object doesn't include properties that you define in composite models. You can find
   * composite model properties in the `assetCompositeModels` object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetproperties)
   */
  public fun assetProperties(): Any? = unwrap(this).getAssetProperties()

  /**
   * A list of key-value pairs that contain metadata for the asset.
   *
   * For more information, see [Tagging your AWS IoT SiteWise
   * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
   * *AWS IoT SiteWise User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAssetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assetDescription The ID of the asset, in UUID format.
     */
    public fun assetDescription(assetDescription: String)

    /**
     * @param assetExternalId The external ID of the asset model composite model.
     * For more information, see [Using external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids) in
     * the *AWS IoT SiteWise User Guide* .
     */
    public fun assetExternalId(assetExternalId: String)

    /**
     * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyId` .
     * A hierarchy specifies allowed parent/child asset relationships.
     */
    public fun assetHierarchies(assetHierarchies: IResolvable)

    /**
     * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyId` .
     * A hierarchy specifies allowed parent/child asset relationships.
     */
    public fun assetHierarchies(assetHierarchies: List<Any>)

    /**
     * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyId` .
     * A hierarchy specifies allowed parent/child asset relationships.
     */
    public fun assetHierarchies(vararg assetHierarchies: Any)

    /**
     * @param assetModelId The ID of the asset model from which to create the asset. 
     * This can be either the actual ID in UUID format, or else `externalId:` followed by the
     * external ID, if it has one. For more information, see [Referencing objects with external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references)
     * in the *AWS IoT SiteWise User Guide* .
     */
    public fun assetModelId(assetModelId: String)

    /**
     * @param assetName A friendly name for the asset. 
     */
    public fun assetName(assetName: String)

    /**
     * @param assetProperties The list of asset properties for the asset.
     * This object doesn't include properties that you define in composite models. You can find
     * composite model properties in the `assetCompositeModels` object.
     */
    public fun assetProperties(assetProperties: IResolvable)

    /**
     * @param assetProperties The list of asset properties for the asset.
     * This object doesn't include properties that you define in composite models. You can find
     * composite model properties in the `assetCompositeModels` object.
     */
    public fun assetProperties(assetProperties: List<Any>)

    /**
     * @param assetProperties The list of asset properties for the asset.
     * This object doesn't include properties that you define in composite models. You can find
     * composite model properties in the `assetCompositeModels` object.
     */
    public fun assetProperties(vararg assetProperties: Any)

    /**
     * @param tags A list of key-value pairs that contain metadata for the asset.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs that contain metadata for the asset.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnAssetProps.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnAssetProps.builder()

    /**
     * @param assetDescription The ID of the asset, in UUID format.
     */
    override fun assetDescription(assetDescription: String) {
      cdkBuilder.assetDescription(assetDescription)
    }

    /**
     * @param assetExternalId The external ID of the asset model composite model.
     * For more information, see [Using external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids) in
     * the *AWS IoT SiteWise User Guide* .
     */
    override fun assetExternalId(assetExternalId: String) {
      cdkBuilder.assetExternalId(assetExternalId)
    }

    /**
     * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyId` .
     * A hierarchy specifies allowed parent/child asset relationships.
     */
    override fun assetHierarchies(assetHierarchies: IResolvable) {
      cdkBuilder.assetHierarchies(assetHierarchies.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyId` .
     * A hierarchy specifies allowed parent/child asset relationships.
     */
    override fun assetHierarchies(assetHierarchies: List<Any>) {
      cdkBuilder.assetHierarchies(assetHierarchies.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyId` .
     * A hierarchy specifies allowed parent/child asset relationships.
     */
    override fun assetHierarchies(vararg assetHierarchies: Any): Unit =
        assetHierarchies(assetHierarchies.toList())

    /**
     * @param assetModelId The ID of the asset model from which to create the asset. 
     * This can be either the actual ID in UUID format, or else `externalId:` followed by the
     * external ID, if it has one. For more information, see [Referencing objects with external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references)
     * in the *AWS IoT SiteWise User Guide* .
     */
    override fun assetModelId(assetModelId: String) {
      cdkBuilder.assetModelId(assetModelId)
    }

    /**
     * @param assetName A friendly name for the asset. 
     */
    override fun assetName(assetName: String) {
      cdkBuilder.assetName(assetName)
    }

    /**
     * @param assetProperties The list of asset properties for the asset.
     * This object doesn't include properties that you define in composite models. You can find
     * composite model properties in the `assetCompositeModels` object.
     */
    override fun assetProperties(assetProperties: IResolvable) {
      cdkBuilder.assetProperties(assetProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param assetProperties The list of asset properties for the asset.
     * This object doesn't include properties that you define in composite models. You can find
     * composite model properties in the `assetCompositeModels` object.
     */
    override fun assetProperties(assetProperties: List<Any>) {
      cdkBuilder.assetProperties(assetProperties.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param assetProperties The list of asset properties for the asset.
     * This object doesn't include properties that you define in composite models. You can find
     * composite model properties in the `assetCompositeModels` object.
     */
    override fun assetProperties(vararg assetProperties: Any): Unit =
        assetProperties(assetProperties.toList())

    /**
     * @param tags A list of key-value pairs that contain metadata for the asset.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of key-value pairs that contain metadata for the asset.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAssetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetProps,
  ) : CdkObject(cdkObject), CfnAssetProps {
    /**
     * The ID of the asset, in UUID format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetdescription)
     */
    override fun assetDescription(): String? = unwrap(this).getAssetDescription()

    /**
     * The external ID of the asset model composite model.
     *
     * For more information, see [Using external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetexternalid)
     */
    override fun assetExternalId(): String? = unwrap(this).getAssetExternalId()

    /**
     * A list of asset hierarchies that each contain a `hierarchyId` .
     *
     * A hierarchy specifies allowed parent/child asset relationships.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assethierarchies)
     */
    override fun assetHierarchies(): Any? = unwrap(this).getAssetHierarchies()

    /**
     * The ID of the asset model from which to create the asset.
     *
     * This can be either the actual ID in UUID format, or else `externalId:` followed by the
     * external ID, if it has one. For more information, see [Referencing objects with external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetmodelid)
     */
    override fun assetModelId(): String = unwrap(this).getAssetModelId()

    /**
     * A friendly name for the asset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetname)
     */
    override fun assetName(): String = unwrap(this).getAssetName()

    /**
     * The list of asset properties for the asset.
     *
     * This object doesn't include properties that you define in composite models. You can find
     * composite model properties in the `assetCompositeModels` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetproperties)
     */
    override fun assetProperties(): Any? = unwrap(this).getAssetProperties()

    /**
     * A list of key-value pairs that contain metadata for the asset.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetProps):
        CfnAssetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAssetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAssetProps):
        software.amazon.awscdk.services.iotsitewise.CfnAssetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iotsitewise.CfnAssetProps
  }
}
