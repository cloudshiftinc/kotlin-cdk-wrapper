@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an asset from an existing asset model.
 *
 * For more information, see [Creating
 * assets](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-assets.html) in the *AWS
 * IoT SiteWise User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
 * CfnAsset cfnAsset = CfnAsset.Builder.create(this, "MyCfnAsset")
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
public open class CfnAsset internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAsset,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * A description for the asset.
   */
  public open fun assetDescription(): String? = unwrap(this).getAssetDescription()

  /**
   * A description for the asset.
   */
  public open fun assetDescription(`value`: String) {
    unwrap(this).setAssetDescription(`value`)
  }

  /**
   * The External ID of the asset.
   */
  public open fun assetExternalId(): String? = unwrap(this).getAssetExternalId()

  /**
   * The External ID of the asset.
   */
  public open fun assetExternalId(`value`: String) {
    unwrap(this).setAssetExternalId(`value`)
  }

  /**
   * A list of asset hierarchies that each contain a `hierarchyLogicalId` .
   */
  public open fun assetHierarchies(): Any? = unwrap(this).getAssetHierarchies()

  /**
   * A list of asset hierarchies that each contain a `hierarchyLogicalId` .
   */
  public open fun assetHierarchies(`value`: IResolvable) {
    unwrap(this).setAssetHierarchies(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of asset hierarchies that each contain a `hierarchyLogicalId` .
   */
  public open fun assetHierarchies(`value`: List<Any>) {
    unwrap(this).setAssetHierarchies(`value`)
  }

  /**
   * A list of asset hierarchies that each contain a `hierarchyLogicalId` .
   */
  public open fun assetHierarchies(vararg `value`: Any): Unit = assetHierarchies(`value`.toList())

  /**
   * The ID of the asset model from which to create the asset.
   */
  public open fun assetModelId(): String = unwrap(this).getAssetModelId()

  /**
   * The ID of the asset model from which to create the asset.
   */
  public open fun assetModelId(`value`: String) {
    unwrap(this).setAssetModelId(`value`)
  }

  /**
   * A unique, friendly name for the asset.
   */
  public open fun assetName(): String = unwrap(this).getAssetName()

  /**
   * A unique, friendly name for the asset.
   */
  public open fun assetName(`value`: String) {
    unwrap(this).setAssetName(`value`)
  }

  /**
   * The list of asset properties for the asset.
   */
  public open fun assetProperties(): Any? = unwrap(this).getAssetProperties()

  /**
   * The list of asset properties for the asset.
   */
  public open fun assetProperties(`value`: IResolvable) {
    unwrap(this).setAssetProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * The list of asset properties for the asset.
   */
  public open fun assetProperties(`value`: List<Any>) {
    unwrap(this).setAssetProperties(`value`)
  }

  /**
   * The list of asset properties for the asset.
   */
  public open fun assetProperties(vararg `value`: Any): Unit = assetProperties(`value`.toList())

  /**
   * The ARN of the asset.
   */
  public open fun attrAssetArn(): String = unwrap(this).getAttrAssetArn()

  /**
   * The ID of the asset.
   */
  public open fun attrAssetId(): String = unwrap(this).getAttrAssetId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of key-value pairs that contain metadata for the asset.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of key-value pairs that contain metadata for the asset.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of key-value pairs that contain metadata for the asset.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotsitewise.CfnAsset].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the asset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetdescription)
     * @param assetDescription A description for the asset. 
     */
    public fun assetDescription(assetDescription: String)

    /**
     * The External ID of the asset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetexternalid)
     * @param assetExternalId The External ID of the asset. 
     */
    public fun assetExternalId(assetExternalId: String)

    /**
     * A list of asset hierarchies that each contain a `hierarchyLogicalId` .
     *
     * A hierarchy specifies allowed parent/child asset relationships.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assethierarchies)
     * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyLogicalId`
     * . 
     */
    public fun assetHierarchies(assetHierarchies: IResolvable)

    /**
     * A list of asset hierarchies that each contain a `hierarchyLogicalId` .
     *
     * A hierarchy specifies allowed parent/child asset relationships.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assethierarchies)
     * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyLogicalId`
     * . 
     */
    public fun assetHierarchies(assetHierarchies: List<Any>)

    /**
     * A list of asset hierarchies that each contain a `hierarchyLogicalId` .
     *
     * A hierarchy specifies allowed parent/child asset relationships.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assethierarchies)
     * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyLogicalId`
     * . 
     */
    public fun assetHierarchies(vararg assetHierarchies: Any)

    /**
     * The ID of the asset model from which to create the asset.
     *
     * This can be either the actual ID in UUID format, or else `externalId:` followed by the
     * external ID, if it has one. For more information, see [Referencing objects with external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetmodelid)
     * @param assetModelId The ID of the asset model from which to create the asset. 
     */
    public fun assetModelId(assetModelId: String)

    /**
     * A unique, friendly name for the asset.
     *
     * The maximum length is 256 characters with the pattern `[^\u0000-\u001F\u007F]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetname)
     * @param assetName A unique, friendly name for the asset. 
     */
    public fun assetName(assetName: String)

    /**
     * The list of asset properties for the asset.
     *
     * This object doesn't include properties that you define in composite models. You can find
     * composite model properties in the `assetCompositeModels` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetproperties)
     * @param assetProperties The list of asset properties for the asset. 
     */
    public fun assetProperties(assetProperties: IResolvable)

    /**
     * The list of asset properties for the asset.
     *
     * This object doesn't include properties that you define in composite models. You can find
     * composite model properties in the `assetCompositeModels` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetproperties)
     * @param assetProperties The list of asset properties for the asset. 
     */
    public fun assetProperties(assetProperties: List<Any>)

    /**
     * The list of asset properties for the asset.
     *
     * This object doesn't include properties that you define in composite models. You can find
     * composite model properties in the `assetCompositeModels` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetproperties)
     * @param assetProperties The list of asset properties for the asset. 
     */
    public fun assetProperties(vararg assetProperties: Any)

    /**
     * A list of key-value pairs that contain metadata for the asset.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-tags)
     * @param tags A list of key-value pairs that contain metadata for the asset. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of key-value pairs that contain metadata for the asset.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-tags)
     * @param tags A list of key-value pairs that contain metadata for the asset. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnAsset.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnAsset.Builder.create(scope, id)

    /**
     * A description for the asset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetdescription)
     * @param assetDescription A description for the asset. 
     */
    override fun assetDescription(assetDescription: String) {
      cdkBuilder.assetDescription(assetDescription)
    }

    /**
     * The External ID of the asset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetexternalid)
     * @param assetExternalId The External ID of the asset. 
     */
    override fun assetExternalId(assetExternalId: String) {
      cdkBuilder.assetExternalId(assetExternalId)
    }

    /**
     * A list of asset hierarchies that each contain a `hierarchyLogicalId` .
     *
     * A hierarchy specifies allowed parent/child asset relationships.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assethierarchies)
     * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyLogicalId`
     * . 
     */
    override fun assetHierarchies(assetHierarchies: IResolvable) {
      cdkBuilder.assetHierarchies(assetHierarchies.let(IResolvable::unwrap))
    }

    /**
     * A list of asset hierarchies that each contain a `hierarchyLogicalId` .
     *
     * A hierarchy specifies allowed parent/child asset relationships.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assethierarchies)
     * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyLogicalId`
     * . 
     */
    override fun assetHierarchies(assetHierarchies: List<Any>) {
      cdkBuilder.assetHierarchies(assetHierarchies)
    }

    /**
     * A list of asset hierarchies that each contain a `hierarchyLogicalId` .
     *
     * A hierarchy specifies allowed parent/child asset relationships.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assethierarchies)
     * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyLogicalId`
     * . 
     */
    override fun assetHierarchies(vararg assetHierarchies: Any): Unit =
        assetHierarchies(assetHierarchies.toList())

    /**
     * The ID of the asset model from which to create the asset.
     *
     * This can be either the actual ID in UUID format, or else `externalId:` followed by the
     * external ID, if it has one. For more information, see [Referencing objects with external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetmodelid)
     * @param assetModelId The ID of the asset model from which to create the asset. 
     */
    override fun assetModelId(assetModelId: String) {
      cdkBuilder.assetModelId(assetModelId)
    }

    /**
     * A unique, friendly name for the asset.
     *
     * The maximum length is 256 characters with the pattern `[^\u0000-\u001F\u007F]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetname)
     * @param assetName A unique, friendly name for the asset. 
     */
    override fun assetName(assetName: String) {
      cdkBuilder.assetName(assetName)
    }

    /**
     * The list of asset properties for the asset.
     *
     * This object doesn't include properties that you define in composite models. You can find
     * composite model properties in the `assetCompositeModels` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetproperties)
     * @param assetProperties The list of asset properties for the asset. 
     */
    override fun assetProperties(assetProperties: IResolvable) {
      cdkBuilder.assetProperties(assetProperties.let(IResolvable::unwrap))
    }

    /**
     * The list of asset properties for the asset.
     *
     * This object doesn't include properties that you define in composite models. You can find
     * composite model properties in the `assetCompositeModels` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetproperties)
     * @param assetProperties The list of asset properties for the asset. 
     */
    override fun assetProperties(assetProperties: List<Any>) {
      cdkBuilder.assetProperties(assetProperties)
    }

    /**
     * The list of asset properties for the asset.
     *
     * This object doesn't include properties that you define in composite models. You can find
     * composite model properties in the `assetCompositeModels` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetproperties)
     * @param assetProperties The list of asset properties for the asset. 
     */
    override fun assetProperties(vararg assetProperties: Any): Unit =
        assetProperties(assetProperties.toList())

    /**
     * A list of key-value pairs that contain metadata for the asset.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-tags)
     * @param tags A list of key-value pairs that contain metadata for the asset. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of key-value pairs that contain metadata for the asset.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-tags)
     * @param tags A list of key-value pairs that contain metadata for the asset. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAsset = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotsitewise.CfnAsset.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAsset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAsset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAsset): CfnAsset =
        CfnAsset(cdkObject)

    internal fun unwrap(wrapped: CfnAsset): software.amazon.awscdk.services.iotsitewise.CfnAsset =
        wrapped.cdkObject
  }

  /**
   * Describes an asset hierarchy that contains a `childAssetId` and `hierarchyLogicalId` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * AssetHierarchyProperty assetHierarchyProperty = AssetHierarchyProperty.builder()
   * .childAssetId("childAssetId")
   * // the properties below are optional
   * .externalId("externalId")
   * .id("id")
   * .logicalId("logicalId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assethierarchy.html)
   */
  public interface AssetHierarchyProperty {
    /**
     * The Id of the child asset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assethierarchy.html#cfn-iotsitewise-asset-assethierarchy-childassetid)
     */
    public fun childAssetId(): String

    /**
     * String-friendly customer provided external ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assethierarchy.html#cfn-iotsitewise-asset-assethierarchy-externalid)
     */
    public fun externalId(): String? = unwrap(this).getExternalId()

    /**
     * Customer provided actual UUID for property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assethierarchy.html#cfn-iotsitewise-asset-assethierarchy-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * The `LogicalID` of the hierarchy. This ID is a `hierarchyLogicalId` .
     *
     * The maximum length is 256 characters, with the pattern `[^\u0000-\u001F\u007F]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assethierarchy.html#cfn-iotsitewise-asset-assethierarchy-logicalid)
     */
    public fun logicalId(): String? = unwrap(this).getLogicalId()

    /**
     * A builder for [AssetHierarchyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param childAssetId The Id of the child asset. 
       */
      public fun childAssetId(childAssetId: String)

      /**
       * @param externalId String-friendly customer provided external ID.
       */
      public fun externalId(externalId: String)

      /**
       * @param id Customer provided actual UUID for property.
       */
      public fun id(id: String)

      /**
       * @param logicalId The `LogicalID` of the hierarchy. This ID is a `hierarchyLogicalId` .
       * The maximum length is 256 characters, with the pattern `[^\u0000-\u001F\u007F]+` .
       */
      public fun logicalId(logicalId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty.builder()

      /**
       * @param childAssetId The Id of the child asset. 
       */
      override fun childAssetId(childAssetId: String) {
        cdkBuilder.childAssetId(childAssetId)
      }

      /**
       * @param externalId String-friendly customer provided external ID.
       */
      override fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
      }

      /**
       * @param id Customer provided actual UUID for property.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param logicalId The `LogicalID` of the hierarchy. This ID is a `hierarchyLogicalId` .
       * The maximum length is 256 characters, with the pattern `[^\u0000-\u001F\u007F]+` .
       */
      override fun logicalId(logicalId: String) {
        cdkBuilder.logicalId(logicalId)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty,
    ) : CdkObject(cdkObject), AssetHierarchyProperty {
      /**
       * The Id of the child asset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assethierarchy.html#cfn-iotsitewise-asset-assethierarchy-childassetid)
       */
      override fun childAssetId(): String = unwrap(this).getChildAssetId()

      /**
       * String-friendly customer provided external ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assethierarchy.html#cfn-iotsitewise-asset-assethierarchy-externalid)
       */
      override fun externalId(): String? = unwrap(this).getExternalId()

      /**
       * Customer provided actual UUID for property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assethierarchy.html#cfn-iotsitewise-asset-assethierarchy-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * The `LogicalID` of the hierarchy. This ID is a `hierarchyLogicalId` .
       *
       * The maximum length is 256 characters, with the pattern `[^\u0000-\u001F\u007F]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assethierarchy.html#cfn-iotsitewise-asset-assethierarchy-logicalid)
       */
      override fun logicalId(): String? = unwrap(this).getLogicalId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetHierarchyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty):
          AssetHierarchyProperty = CdkObjectWrappers.wrap(cdkObject) as AssetHierarchyProperty

      internal fun unwrap(wrapped: AssetHierarchyProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty
    }
  }

  /**
   * Contains asset property information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * AssetPropertyProperty assetPropertyProperty = AssetPropertyProperty.builder()
   * .alias("alias")
   * .externalId("externalId")
   * .id("id")
   * .logicalId("logicalId")
   * .notificationState("notificationState")
   * .unit("unit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assetproperty.html)
   */
  public interface AssetPropertyProperty {
    /**
     * The property alias that identifies the property, such as an OPC-UA server data stream path
     * (for example, `/company/windfarm/3/turbine/7/temperature` ).
     *
     * For more information, see [Mapping industrial data streams to asset
     * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * The property alias must have 1-1000 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assetproperty.html#cfn-iotsitewise-asset-assetproperty-alias)
     */
    public fun alias(): String? = unwrap(this).getAlias()

    /**
     * String-friendly customer provided external ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assetproperty.html#cfn-iotsitewise-asset-assetproperty-externalid)
     */
    public fun externalId(): String? = unwrap(this).getExternalId()

    /**
     * Customer provided actual UUID for property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assetproperty.html#cfn-iotsitewise-asset-assetproperty-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * The `LogicalID` of the asset property.
     *
     * The maximum length is 256 characters, with the pattern `[^\u0000-\u001F\u007F]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assetproperty.html#cfn-iotsitewise-asset-assetproperty-logicalid)
     */
    public fun logicalId(): String? = unwrap(this).getLogicalId()

    /**
     * The MQTT notification state ( `ENABLED` or `DISABLED` ) for this asset property.
     *
     * When the notification state is `ENABLED` , AWS IoT SiteWise publishes property value updates
     * to a unique MQTT topic. For more information, see [Interacting with other
     * services](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * If you omit this parameter, the notification state is set to `DISABLED` .
     *
     *
     * You must use all caps for the NotificationState parameter. If you use lower case letters, you
     * will receive a schema validation error.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assetproperty.html#cfn-iotsitewise-asset-assetproperty-notificationstate)
     */
    public fun notificationState(): String? = unwrap(this).getNotificationState()

    /**
     * The unit (such as `Newtons` or `RPM` ) of the asset property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assetproperty.html#cfn-iotsitewise-asset-assetproperty-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * A builder for [AssetPropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alias The property alias that identifies the property, such as an OPC-UA server data
       * stream path (for example, `/company/windfarm/3/turbine/7/temperature` ).
       * For more information, see [Mapping industrial data streams to asset
       * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * The property alias must have 1-1000 characters.
       */
      public fun alias(alias: String)

      /**
       * @param externalId String-friendly customer provided external ID.
       */
      public fun externalId(externalId: String)

      /**
       * @param id Customer provided actual UUID for property.
       */
      public fun id(id: String)

      /**
       * @param logicalId The `LogicalID` of the asset property.
       * The maximum length is 256 characters, with the pattern `[^\u0000-\u001F\u007F]+` .
       */
      public fun logicalId(logicalId: String)

      /**
       * @param notificationState The MQTT notification state ( `ENABLED` or `DISABLED` ) for this
       * asset property.
       * When the notification state is `ENABLED` , AWS IoT SiteWise publishes property value
       * updates to a unique MQTT topic. For more information, see [Interacting with other
       * services](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * If you omit this parameter, the notification state is set to `DISABLED` .
       *
       *
       * You must use all caps for the NotificationState parameter. If you use lower case letters,
       * you will receive a schema validation error.
       */
      public fun notificationState(notificationState: String)

      /**
       * @param unit The unit (such as `Newtons` or `RPM` ) of the asset property.
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty.builder()

      /**
       * @param alias The property alias that identifies the property, such as an OPC-UA server data
       * stream path (for example, `/company/windfarm/3/turbine/7/temperature` ).
       * For more information, see [Mapping industrial data streams to asset
       * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * The property alias must have 1-1000 characters.
       */
      override fun alias(alias: String) {
        cdkBuilder.alias(alias)
      }

      /**
       * @param externalId String-friendly customer provided external ID.
       */
      override fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
      }

      /**
       * @param id Customer provided actual UUID for property.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param logicalId The `LogicalID` of the asset property.
       * The maximum length is 256 characters, with the pattern `[^\u0000-\u001F\u007F]+` .
       */
      override fun logicalId(logicalId: String) {
        cdkBuilder.logicalId(logicalId)
      }

      /**
       * @param notificationState The MQTT notification state ( `ENABLED` or `DISABLED` ) for this
       * asset property.
       * When the notification state is `ENABLED` , AWS IoT SiteWise publishes property value
       * updates to a unique MQTT topic. For more information, see [Interacting with other
       * services](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * If you omit this parameter, the notification state is set to `DISABLED` .
       *
       *
       * You must use all caps for the NotificationState parameter. If you use lower case letters,
       * you will receive a schema validation error.
       */
      override fun notificationState(notificationState: String) {
        cdkBuilder.notificationState(notificationState)
      }

      /**
       * @param unit The unit (such as `Newtons` or `RPM` ) of the asset property.
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty,
    ) : CdkObject(cdkObject), AssetPropertyProperty {
      /**
       * The property alias that identifies the property, such as an OPC-UA server data stream path
       * (for example, `/company/windfarm/3/turbine/7/temperature` ).
       *
       * For more information, see [Mapping industrial data streams to asset
       * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * The property alias must have 1-1000 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assetproperty.html#cfn-iotsitewise-asset-assetproperty-alias)
       */
      override fun alias(): String? = unwrap(this).getAlias()

      /**
       * String-friendly customer provided external ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assetproperty.html#cfn-iotsitewise-asset-assetproperty-externalid)
       */
      override fun externalId(): String? = unwrap(this).getExternalId()

      /**
       * Customer provided actual UUID for property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assetproperty.html#cfn-iotsitewise-asset-assetproperty-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * The `LogicalID` of the asset property.
       *
       * The maximum length is 256 characters, with the pattern `[^\u0000-\u001F\u007F]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assetproperty.html#cfn-iotsitewise-asset-assetproperty-logicalid)
       */
      override fun logicalId(): String? = unwrap(this).getLogicalId()

      /**
       * The MQTT notification state ( `ENABLED` or `DISABLED` ) for this asset property.
       *
       * When the notification state is `ENABLED` , AWS IoT SiteWise publishes property value
       * updates to a unique MQTT topic. For more information, see [Interacting with other
       * services](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * If you omit this parameter, the notification state is set to `DISABLED` .
       *
       *
       * You must use all caps for the NotificationState parameter. If you use lower case letters,
       * you will receive a schema validation error.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assetproperty.html#cfn-iotsitewise-asset-assetproperty-notificationstate)
       */
      override fun notificationState(): String? = unwrap(this).getNotificationState()

      /**
       * The unit (such as `Newtons` or `RPM` ) of the asset property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assetproperty.html#cfn-iotsitewise-asset-assetproperty-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty):
          AssetPropertyProperty = CdkObjectWrappers.wrap(cdkObject) as AssetPropertyProperty

      internal fun unwrap(wrapped: AssetPropertyProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty
    }
  }
}
