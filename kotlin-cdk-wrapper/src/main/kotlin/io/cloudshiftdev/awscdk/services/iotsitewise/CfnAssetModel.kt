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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an asset model from specified property and hierarchy definitions.
 *
 * You create assets from asset models. With asset models, you can easily create assets of the same
 * type that have standardized definitions. Each asset created from a model inherits the asset model's
 * property and hierarchy definitions. For more information, see [Defining asset
 * models](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/define-models.html) in the *AWS
 * IoT SiteWise User Guide* .
 *
 * You can create two types of asset models, `ASSET_MODEL` or `COMPONENT_MODEL` .
 *
 * * *ASSET_MODEL* – (default) An asset model that you can use to create assets. Can't be included
 * as a component in another asset model.
 * * *COMPONENT_MODEL* – A reusable component that you can include in the composite models of other
 * asset models. You can't create assets directly from this type of asset model.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
 * CfnAssetModel cfnAssetModel = CfnAssetModel.Builder.create(this, "MyCfnAssetModel")
 * .assetModelName("assetModelName")
 * // the properties below are optional
 * .assetModelCompositeModels(List.of(AssetModelCompositeModelProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .composedAssetModelId("composedAssetModelId")
 * .compositeModelProperties(List.of(AssetModelPropertyProperty.builder()
 * .dataType("dataType")
 * .name("name")
 * .type(PropertyTypeProperty.builder()
 * .typeName("typeName")
 * // the properties below are optional
 * .attribute(AttributeProperty.builder()
 * .defaultValue("defaultValue")
 * .build())
 * .metric(MetricProperty.builder()
 * .expression("expression")
 * .variables(List.of(ExpressionVariableProperty.builder()
 * .name("name")
 * .value(VariableValueProperty.builder()
 * .hierarchyExternalId("hierarchyExternalId")
 * .hierarchyId("hierarchyId")
 * .hierarchyLogicalId("hierarchyLogicalId")
 * .propertyExternalId("propertyExternalId")
 * .propertyId("propertyId")
 * .propertyLogicalId("propertyLogicalId")
 * .propertyPath(List.of(PropertyPathDefinitionProperty.builder()
 * .name("name")
 * .build()))
 * .build())
 * .build()))
 * .window(MetricWindowProperty.builder()
 * .tumbling(TumblingWindowProperty.builder()
 * .interval("interval")
 * // the properties below are optional
 * .offset("offset")
 * .build())
 * .build())
 * .build())
 * .transform(TransformProperty.builder()
 * .expression("expression")
 * .variables(List.of(ExpressionVariableProperty.builder()
 * .name("name")
 * .value(VariableValueProperty.builder()
 * .hierarchyExternalId("hierarchyExternalId")
 * .hierarchyId("hierarchyId")
 * .hierarchyLogicalId("hierarchyLogicalId")
 * .propertyExternalId("propertyExternalId")
 * .propertyId("propertyId")
 * .propertyLogicalId("propertyLogicalId")
 * .propertyPath(List.of(PropertyPathDefinitionProperty.builder()
 * .name("name")
 * .build()))
 * .build())
 * .build()))
 * .build())
 * .build())
 * // the properties below are optional
 * .dataTypeSpec("dataTypeSpec")
 * .externalId("externalId")
 * .id("id")
 * .logicalId("logicalId")
 * .unit("unit")
 * .build()))
 * .description("description")
 * .externalId("externalId")
 * .id("id")
 * .parentAssetModelCompositeModelExternalId("parentAssetModelCompositeModelExternalId")
 * .path(List.of("path"))
 * .build()))
 * .assetModelDescription("assetModelDescription")
 * .assetModelExternalId("assetModelExternalId")
 * .assetModelHierarchies(List.of(AssetModelHierarchyProperty.builder()
 * .childAssetModelId("childAssetModelId")
 * .name("name")
 * // the properties below are optional
 * .externalId("externalId")
 * .id("id")
 * .logicalId("logicalId")
 * .build()))
 * .assetModelProperties(List.of(AssetModelPropertyProperty.builder()
 * .dataType("dataType")
 * .name("name")
 * .type(PropertyTypeProperty.builder()
 * .typeName("typeName")
 * // the properties below are optional
 * .attribute(AttributeProperty.builder()
 * .defaultValue("defaultValue")
 * .build())
 * .metric(MetricProperty.builder()
 * .expression("expression")
 * .variables(List.of(ExpressionVariableProperty.builder()
 * .name("name")
 * .value(VariableValueProperty.builder()
 * .hierarchyExternalId("hierarchyExternalId")
 * .hierarchyId("hierarchyId")
 * .hierarchyLogicalId("hierarchyLogicalId")
 * .propertyExternalId("propertyExternalId")
 * .propertyId("propertyId")
 * .propertyLogicalId("propertyLogicalId")
 * .propertyPath(List.of(PropertyPathDefinitionProperty.builder()
 * .name("name")
 * .build()))
 * .build())
 * .build()))
 * .window(MetricWindowProperty.builder()
 * .tumbling(TumblingWindowProperty.builder()
 * .interval("interval")
 * // the properties below are optional
 * .offset("offset")
 * .build())
 * .build())
 * .build())
 * .transform(TransformProperty.builder()
 * .expression("expression")
 * .variables(List.of(ExpressionVariableProperty.builder()
 * .name("name")
 * .value(VariableValueProperty.builder()
 * .hierarchyExternalId("hierarchyExternalId")
 * .hierarchyId("hierarchyId")
 * .hierarchyLogicalId("hierarchyLogicalId")
 * .propertyExternalId("propertyExternalId")
 * .propertyId("propertyId")
 * .propertyLogicalId("propertyLogicalId")
 * .propertyPath(List.of(PropertyPathDefinitionProperty.builder()
 * .name("name")
 * .build()))
 * .build())
 * .build()))
 * .build())
 * .build())
 * // the properties below are optional
 * .dataTypeSpec("dataTypeSpec")
 * .externalId("externalId")
 * .id("id")
 * .logicalId("logicalId")
 * .unit("unit")
 * .build()))
 * .assetModelType("assetModelType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html)
 */
public open class CfnAssetModel(
  cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAssetModelProps,
  ) :
      this(software.amazon.awscdk.services.iotsitewise.CfnAssetModel(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAssetModelProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAssetModelProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAssetModelProps(props)
  )

  /**
   * The composite models that are part of this asset model.
   */
  public open fun assetModelCompositeModels(): Any? = unwrap(this).getAssetModelCompositeModels()

  /**
   * The composite models that are part of this asset model.
   */
  public open fun assetModelCompositeModels(`value`: IResolvable) {
    unwrap(this).setAssetModelCompositeModels(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The composite models that are part of this asset model.
   */
  public open fun assetModelCompositeModels(`value`: List<Any>) {
    unwrap(this).setAssetModelCompositeModels(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The composite models that are part of this asset model.
   */
  public open fun assetModelCompositeModels(vararg `value`: Any): Unit =
      assetModelCompositeModels(`value`.toList())

  /**
   * A description for the asset model.
   */
  public open fun assetModelDescription(): String? = unwrap(this).getAssetModelDescription()

  /**
   * A description for the asset model.
   */
  public open fun assetModelDescription(`value`: String) {
    unwrap(this).setAssetModelDescription(`value`)
  }

  /**
   * The external ID of the asset model.
   */
  public open fun assetModelExternalId(): String? = unwrap(this).getAssetModelExternalId()

  /**
   * The external ID of the asset model.
   */
  public open fun assetModelExternalId(`value`: String) {
    unwrap(this).setAssetModelExternalId(`value`)
  }

  /**
   * The hierarchy definitions of the asset model.
   */
  public open fun assetModelHierarchies(): Any? = unwrap(this).getAssetModelHierarchies()

  /**
   * The hierarchy definitions of the asset model.
   */
  public open fun assetModelHierarchies(`value`: IResolvable) {
    unwrap(this).setAssetModelHierarchies(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The hierarchy definitions of the asset model.
   */
  public open fun assetModelHierarchies(`value`: List<Any>) {
    unwrap(this).setAssetModelHierarchies(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The hierarchy definitions of the asset model.
   */
  public open fun assetModelHierarchies(vararg `value`: Any): Unit =
      assetModelHierarchies(`value`.toList())

  /**
   * A unique name for the asset model.
   */
  public open fun assetModelName(): String = unwrap(this).getAssetModelName()

  /**
   * A unique name for the asset model.
   */
  public open fun assetModelName(`value`: String) {
    unwrap(this).setAssetModelName(`value`)
  }

  /**
   * The property definitions of the asset model.
   */
  public open fun assetModelProperties(): Any? = unwrap(this).getAssetModelProperties()

  /**
   * The property definitions of the asset model.
   */
  public open fun assetModelProperties(`value`: IResolvable) {
    unwrap(this).setAssetModelProperties(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The property definitions of the asset model.
   */
  public open fun assetModelProperties(`value`: List<Any>) {
    unwrap(this).setAssetModelProperties(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The property definitions of the asset model.
   */
  public open fun assetModelProperties(vararg `value`: Any): Unit =
      assetModelProperties(`value`.toList())

  /**
   * The type of asset model.
   */
  public open fun assetModelType(): String? = unwrap(this).getAssetModelType()

  /**
   * The type of asset model.
   */
  public open fun assetModelType(`value`: String) {
    unwrap(this).setAssetModelType(`value`)
  }

  /**
   * The ARN of the asset model, which has the following format.
   */
  public open fun attrAssetModelArn(): String = unwrap(this).getAttrAssetModelArn()

  /**
   * The ID of the asset model.
   */
  public open fun attrAssetModelId(): String = unwrap(this).getAttrAssetModelId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of key-value pairs that contain metadata for the asset.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotsitewise.CfnAssetModel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The composite models that are part of this asset model.
     *
     * It groups properties (such as attributes, measurements, transforms, and metrics) and child
     * composite models that model parts of your industrial equipment. Each composite model has a type
     * that defines the properties that the composite model supports. Use composite models to define
     * alarms on this asset model.
     *
     *
     * When creating custom composite models, you need to use
     * [CreateAssetModelCompositeModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html)
     * . For more information, see [Creating custom composite models
     * (Components)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-custom-composite-models.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodels)
     * @param assetModelCompositeModels The composite models that are part of this asset model. 
     */
    public fun assetModelCompositeModels(assetModelCompositeModels: IResolvable)

    /**
     * The composite models that are part of this asset model.
     *
     * It groups properties (such as attributes, measurements, transforms, and metrics) and child
     * composite models that model parts of your industrial equipment. Each composite model has a type
     * that defines the properties that the composite model supports. Use composite models to define
     * alarms on this asset model.
     *
     *
     * When creating custom composite models, you need to use
     * [CreateAssetModelCompositeModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html)
     * . For more information, see [Creating custom composite models
     * (Components)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-custom-composite-models.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodels)
     * @param assetModelCompositeModels The composite models that are part of this asset model. 
     */
    public fun assetModelCompositeModels(assetModelCompositeModels: List<Any>)

    /**
     * The composite models that are part of this asset model.
     *
     * It groups properties (such as attributes, measurements, transforms, and metrics) and child
     * composite models that model parts of your industrial equipment. Each composite model has a type
     * that defines the properties that the composite model supports. Use composite models to define
     * alarms on this asset model.
     *
     *
     * When creating custom composite models, you need to use
     * [CreateAssetModelCompositeModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html)
     * . For more information, see [Creating custom composite models
     * (Components)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-custom-composite-models.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodels)
     * @param assetModelCompositeModels The composite models that are part of this asset model. 
     */
    public fun assetModelCompositeModels(vararg assetModelCompositeModels: Any)

    /**
     * A description for the asset model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodeldescription)
     * @param assetModelDescription A description for the asset model. 
     */
    public fun assetModelDescription(assetModelDescription: String)

    /**
     * The external ID of the asset model.
     *
     * For more information, see [Using external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelexternalid)
     * @param assetModelExternalId The external ID of the asset model. 
     */
    public fun assetModelExternalId(assetModelExternalId: String)

    /**
     * The hierarchy definitions of the asset model.
     *
     * Each hierarchy specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see [Asset
     * hierarchies](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 10 hierarchies per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelhierarchies)
     * @param assetModelHierarchies The hierarchy definitions of the asset model. 
     */
    public fun assetModelHierarchies(assetModelHierarchies: IResolvable)

    /**
     * The hierarchy definitions of the asset model.
     *
     * Each hierarchy specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see [Asset
     * hierarchies](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 10 hierarchies per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelhierarchies)
     * @param assetModelHierarchies The hierarchy definitions of the asset model. 
     */
    public fun assetModelHierarchies(assetModelHierarchies: List<Any>)

    /**
     * The hierarchy definitions of the asset model.
     *
     * Each hierarchy specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see [Asset
     * hierarchies](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 10 hierarchies per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelhierarchies)
     * @param assetModelHierarchies The hierarchy definitions of the asset model. 
     */
    public fun assetModelHierarchies(vararg assetModelHierarchies: Any)

    /**
     * A unique name for the asset model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelname)
     * @param assetModelName A unique name for the asset model. 
     */
    public fun assetModelName(assetModelName: String)

    /**
     * The property definitions of the asset model.
     *
     * For more information, see [Asset
     * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 200 properties per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelproperties)
     * @param assetModelProperties The property definitions of the asset model. 
     */
    public fun assetModelProperties(assetModelProperties: IResolvable)

    /**
     * The property definitions of the asset model.
     *
     * For more information, see [Asset
     * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 200 properties per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelproperties)
     * @param assetModelProperties The property definitions of the asset model. 
     */
    public fun assetModelProperties(assetModelProperties: List<Any>)

    /**
     * The property definitions of the asset model.
     *
     * For more information, see [Asset
     * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 200 properties per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelproperties)
     * @param assetModelProperties The property definitions of the asset model. 
     */
    public fun assetModelProperties(vararg assetModelProperties: Any)

    /**
     * The type of asset model.
     *
     * * *ASSET_MODEL* – (default) An asset model that you can use to create assets. Can't be
     * included as a component in another asset model.
     * * *COMPONENT_MODEL* – A reusable component that you can include in the composite models of
     * other asset models. You can't create assets directly from this type of asset model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodeltype)
     * @param assetModelType The type of asset model. 
     */
    public fun assetModelType(assetModelType: String)

    /**
     * A list of key-value pairs that contain metadata for the asset.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-tags)
     * @param tags A list of key-value pairs that contain metadata for the asset. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnAssetModel.Builder.create(scope, id)

    /**
     * The composite models that are part of this asset model.
     *
     * It groups properties (such as attributes, measurements, transforms, and metrics) and child
     * composite models that model parts of your industrial equipment. Each composite model has a type
     * that defines the properties that the composite model supports. Use composite models to define
     * alarms on this asset model.
     *
     *
     * When creating custom composite models, you need to use
     * [CreateAssetModelCompositeModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html)
     * . For more information, see [Creating custom composite models
     * (Components)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-custom-composite-models.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodels)
     * @param assetModelCompositeModels The composite models that are part of this asset model. 
     */
    override fun assetModelCompositeModels(assetModelCompositeModels: IResolvable) {
      cdkBuilder.assetModelCompositeModels(assetModelCompositeModels.let(IResolvable.Companion::unwrap))
    }

    /**
     * The composite models that are part of this asset model.
     *
     * It groups properties (such as attributes, measurements, transforms, and metrics) and child
     * composite models that model parts of your industrial equipment. Each composite model has a type
     * that defines the properties that the composite model supports. Use composite models to define
     * alarms on this asset model.
     *
     *
     * When creating custom composite models, you need to use
     * [CreateAssetModelCompositeModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html)
     * . For more information, see [Creating custom composite models
     * (Components)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-custom-composite-models.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodels)
     * @param assetModelCompositeModels The composite models that are part of this asset model. 
     */
    override fun assetModelCompositeModels(assetModelCompositeModels: List<Any>) {
      cdkBuilder.assetModelCompositeModels(assetModelCompositeModels.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The composite models that are part of this asset model.
     *
     * It groups properties (such as attributes, measurements, transforms, and metrics) and child
     * composite models that model parts of your industrial equipment. Each composite model has a type
     * that defines the properties that the composite model supports. Use composite models to define
     * alarms on this asset model.
     *
     *
     * When creating custom composite models, you need to use
     * [CreateAssetModelCompositeModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModelCompositeModel.html)
     * . For more information, see [Creating custom composite models
     * (Components)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-custom-composite-models.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodels)
     * @param assetModelCompositeModels The composite models that are part of this asset model. 
     */
    override fun assetModelCompositeModels(vararg assetModelCompositeModels: Any): Unit =
        assetModelCompositeModels(assetModelCompositeModels.toList())

    /**
     * A description for the asset model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodeldescription)
     * @param assetModelDescription A description for the asset model. 
     */
    override fun assetModelDescription(assetModelDescription: String) {
      cdkBuilder.assetModelDescription(assetModelDescription)
    }

    /**
     * The external ID of the asset model.
     *
     * For more information, see [Using external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelexternalid)
     * @param assetModelExternalId The external ID of the asset model. 
     */
    override fun assetModelExternalId(assetModelExternalId: String) {
      cdkBuilder.assetModelExternalId(assetModelExternalId)
    }

    /**
     * The hierarchy definitions of the asset model.
     *
     * Each hierarchy specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see [Asset
     * hierarchies](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 10 hierarchies per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelhierarchies)
     * @param assetModelHierarchies The hierarchy definitions of the asset model. 
     */
    override fun assetModelHierarchies(assetModelHierarchies: IResolvable) {
      cdkBuilder.assetModelHierarchies(assetModelHierarchies.let(IResolvable.Companion::unwrap))
    }

    /**
     * The hierarchy definitions of the asset model.
     *
     * Each hierarchy specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see [Asset
     * hierarchies](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 10 hierarchies per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelhierarchies)
     * @param assetModelHierarchies The hierarchy definitions of the asset model. 
     */
    override fun assetModelHierarchies(assetModelHierarchies: List<Any>) {
      cdkBuilder.assetModelHierarchies(assetModelHierarchies.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The hierarchy definitions of the asset model.
     *
     * Each hierarchy specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see [Asset
     * hierarchies](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 10 hierarchies per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelhierarchies)
     * @param assetModelHierarchies The hierarchy definitions of the asset model. 
     */
    override fun assetModelHierarchies(vararg assetModelHierarchies: Any): Unit =
        assetModelHierarchies(assetModelHierarchies.toList())

    /**
     * A unique name for the asset model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelname)
     * @param assetModelName A unique name for the asset model. 
     */
    override fun assetModelName(assetModelName: String) {
      cdkBuilder.assetModelName(assetModelName)
    }

    /**
     * The property definitions of the asset model.
     *
     * For more information, see [Asset
     * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 200 properties per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelproperties)
     * @param assetModelProperties The property definitions of the asset model. 
     */
    override fun assetModelProperties(assetModelProperties: IResolvable) {
      cdkBuilder.assetModelProperties(assetModelProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * The property definitions of the asset model.
     *
     * For more information, see [Asset
     * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 200 properties per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelproperties)
     * @param assetModelProperties The property definitions of the asset model. 
     */
    override fun assetModelProperties(assetModelProperties: List<Any>) {
      cdkBuilder.assetModelProperties(assetModelProperties.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The property definitions of the asset model.
     *
     * For more information, see [Asset
     * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 200 properties per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelproperties)
     * @param assetModelProperties The property definitions of the asset model. 
     */
    override fun assetModelProperties(vararg assetModelProperties: Any): Unit =
        assetModelProperties(assetModelProperties.toList())

    /**
     * The type of asset model.
     *
     * * *ASSET_MODEL* – (default) An asset model that you can use to create assets. Can't be
     * included as a component in another asset model.
     * * *COMPONENT_MODEL* – A reusable component that you can include in the composite models of
     * other asset models. You can't create assets directly from this type of asset model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodeltype)
     * @param assetModelType The type of asset model. 
     */
    override fun assetModelType(assetModelType: String) {
      cdkBuilder.assetModelType(assetModelType)
    }

    /**
     * A list of key-value pairs that contain metadata for the asset.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-tags)
     * @param tags A list of key-value pairs that contain metadata for the asset. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of key-value pairs that contain metadata for the asset.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-tags)
     * @param tags A list of key-value pairs that contain metadata for the asset. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAssetModel =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotsitewise.CfnAssetModel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAssetModel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAssetModel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel):
        CfnAssetModel = CfnAssetModel(cdkObject)

    internal fun unwrap(wrapped: CfnAssetModel):
        software.amazon.awscdk.services.iotsitewise.CfnAssetModel = wrapped.cdkObject as
        software.amazon.awscdk.services.iotsitewise.CfnAssetModel
  }

  /**
   * Contains information about a composite model in an asset model.
   *
   * This object contains the asset property definitions that you define in the composite model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * AssetModelCompositeModelProperty assetModelCompositeModelProperty =
   * AssetModelCompositeModelProperty.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .composedAssetModelId("composedAssetModelId")
   * .compositeModelProperties(List.of(AssetModelPropertyProperty.builder()
   * .dataType("dataType")
   * .name("name")
   * .type(PropertyTypeProperty.builder()
   * .typeName("typeName")
   * // the properties below are optional
   * .attribute(AttributeProperty.builder()
   * .defaultValue("defaultValue")
   * .build())
   * .metric(MetricProperty.builder()
   * .expression("expression")
   * .variables(List.of(ExpressionVariableProperty.builder()
   * .name("name")
   * .value(VariableValueProperty.builder()
   * .hierarchyExternalId("hierarchyExternalId")
   * .hierarchyId("hierarchyId")
   * .hierarchyLogicalId("hierarchyLogicalId")
   * .propertyExternalId("propertyExternalId")
   * .propertyId("propertyId")
   * .propertyLogicalId("propertyLogicalId")
   * .propertyPath(List.of(PropertyPathDefinitionProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build()))
   * .window(MetricWindowProperty.builder()
   * .tumbling(TumblingWindowProperty.builder()
   * .interval("interval")
   * // the properties below are optional
   * .offset("offset")
   * .build())
   * .build())
   * .build())
   * .transform(TransformProperty.builder()
   * .expression("expression")
   * .variables(List.of(ExpressionVariableProperty.builder()
   * .name("name")
   * .value(VariableValueProperty.builder()
   * .hierarchyExternalId("hierarchyExternalId")
   * .hierarchyId("hierarchyId")
   * .hierarchyLogicalId("hierarchyLogicalId")
   * .propertyExternalId("propertyExternalId")
   * .propertyId("propertyId")
   * .propertyLogicalId("propertyLogicalId")
   * .propertyPath(List.of(PropertyPathDefinitionProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build()))
   * .build())
   * .build())
   * // the properties below are optional
   * .dataTypeSpec("dataTypeSpec")
   * .externalId("externalId")
   * .id("id")
   * .logicalId("logicalId")
   * .unit("unit")
   * .build()))
   * .description("description")
   * .externalId("externalId")
   * .id("id")
   * .parentAssetModelCompositeModelExternalId("parentAssetModelCompositeModelExternalId")
   * .path(List.of("path"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html)
   */
  public interface AssetModelCompositeModelProperty {
    /**
     * The ID of a component model which is reused to create this composite model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-composedassetmodelid)
     */
    public fun composedAssetModelId(): String? = unwrap(this).getComposedAssetModelId()

    /**
     * The asset property definitions for this composite model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-compositemodelproperties)
     */
    public fun compositeModelProperties(): Any? = unwrap(this).getCompositeModelProperties()

    /**
     * The description of the composite model.
     *
     *
     * If the composite model is a `component-model-based` composite model, the description is
     * inherited from the `COMPONENT_MODEL` asset model and cannot be changed.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The external ID of a composite model on this asset model.
     *
     * For more information, see [Using external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids) in
     * the *AWS IoT SiteWise User Guide* .
     *
     *
     * One of `ExternalId` or `Path` must be specified.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-externalid)
     */
    public fun externalId(): String? = unwrap(this).getExternalId()

    /**
     * The ID of the asset model composite model.
     *
     *
     * This is a return value and can't be set.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * The name of the composite model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-name)
     */
    public fun name(): String

    /**
     * The external ID of the parent composite model.
     *
     * For more information, see [Using external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-parentassetmodelcompositemodelexternalid)
     */
    public fun parentAssetModelCompositeModelExternalId(): String? =
        unwrap(this).getParentAssetModelCompositeModelExternalId()

    /**
     * The structured path to the property from the root of the asset using property names.
     *
     * Path is used as the ID if the asset model is a derived composite model.
     *
     *
     * One of `ExternalId` or `Path` must be specified.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-path)
     */
    public fun path(): List<String> = unwrap(this).getPath() ?: emptyList()

    /**
     * The type of the composite model.
     *
     * For alarm composite models, this type is `AWS/ALARM` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-type)
     */
    public fun type(): String

    /**
     * A builder for [AssetModelCompositeModelProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param composedAssetModelId The ID of a component model which is reused to create this
       * composite model.
       */
      public fun composedAssetModelId(composedAssetModelId: String)

      /**
       * @param compositeModelProperties The asset property definitions for this composite model.
       */
      public fun compositeModelProperties(compositeModelProperties: IResolvable)

      /**
       * @param compositeModelProperties The asset property definitions for this composite model.
       */
      public fun compositeModelProperties(compositeModelProperties: List<Any>)

      /**
       * @param compositeModelProperties The asset property definitions for this composite model.
       */
      public fun compositeModelProperties(vararg compositeModelProperties: Any)

      /**
       * @param description The description of the composite model.
       *
       * If the composite model is a `component-model-based` composite model, the description is
       * inherited from the `COMPONENT_MODEL` asset model and cannot be changed.
       */
      public fun description(description: String)

      /**
       * @param externalId The external ID of a composite model on this asset model.
       * For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       *
       * One of `ExternalId` or `Path` must be specified.
       */
      public fun externalId(externalId: String)

      /**
       * @param id The ID of the asset model composite model.
       *
       * This is a return value and can't be set.
       */
      public fun id(id: String)

      /**
       * @param name The name of the composite model. 
       */
      public fun name(name: String)

      /**
       * @param parentAssetModelCompositeModelExternalId The external ID of the parent composite
       * model.
       * For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       */
      public
          fun parentAssetModelCompositeModelExternalId(parentAssetModelCompositeModelExternalId: String)

      /**
       * @param path The structured path to the property from the root of the asset using property
       * names.
       * Path is used as the ID if the asset model is a derived composite model.
       *
       *
       * One of `ExternalId` or `Path` must be specified.
       */
      public fun path(path: List<String>)

      /**
       * @param path The structured path to the property from the root of the asset using property
       * names.
       * Path is used as the ID if the asset model is a derived composite model.
       *
       *
       * One of `ExternalId` or `Path` must be specified.
       */
      public fun path(vararg path: String)

      /**
       * @param type The type of the composite model. 
       * For alarm composite models, this type is `AWS/ALARM` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty.builder()

      /**
       * @param composedAssetModelId The ID of a component model which is reused to create this
       * composite model.
       */
      override fun composedAssetModelId(composedAssetModelId: String) {
        cdkBuilder.composedAssetModelId(composedAssetModelId)
      }

      /**
       * @param compositeModelProperties The asset property definitions for this composite model.
       */
      override fun compositeModelProperties(compositeModelProperties: IResolvable) {
        cdkBuilder.compositeModelProperties(compositeModelProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param compositeModelProperties The asset property definitions for this composite model.
       */
      override fun compositeModelProperties(compositeModelProperties: List<Any>) {
        cdkBuilder.compositeModelProperties(compositeModelProperties.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param compositeModelProperties The asset property definitions for this composite model.
       */
      override fun compositeModelProperties(vararg compositeModelProperties: Any): Unit =
          compositeModelProperties(compositeModelProperties.toList())

      /**
       * @param description The description of the composite model.
       *
       * If the composite model is a `component-model-based` composite model, the description is
       * inherited from the `COMPONENT_MODEL` asset model and cannot be changed.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param externalId The external ID of a composite model on this asset model.
       * For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       *
       * One of `ExternalId` or `Path` must be specified.
       */
      override fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
      }

      /**
       * @param id The ID of the asset model composite model.
       *
       * This is a return value and can't be set.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param name The name of the composite model. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param parentAssetModelCompositeModelExternalId The external ID of the parent composite
       * model.
       * For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       */
      override
          fun parentAssetModelCompositeModelExternalId(parentAssetModelCompositeModelExternalId: String) {
        cdkBuilder.parentAssetModelCompositeModelExternalId(parentAssetModelCompositeModelExternalId)
      }

      /**
       * @param path The structured path to the property from the root of the asset using property
       * names.
       * Path is used as the ID if the asset model is a derived composite model.
       *
       *
       * One of `ExternalId` or `Path` must be specified.
       */
      override fun path(path: List<String>) {
        cdkBuilder.path(path)
      }

      /**
       * @param path The structured path to the property from the root of the asset using property
       * names.
       * Path is used as the ID if the asset model is a derived composite model.
       *
       *
       * One of `ExternalId` or `Path` must be specified.
       */
      override fun path(vararg path: String): Unit = path(path.toList())

      /**
       * @param type The type of the composite model. 
       * For alarm composite models, this type is `AWS/ALARM` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty,
    ) : CdkObject(cdkObject),
        AssetModelCompositeModelProperty {
      /**
       * The ID of a component model which is reused to create this composite model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-composedassetmodelid)
       */
      override fun composedAssetModelId(): String? = unwrap(this).getComposedAssetModelId()

      /**
       * The asset property definitions for this composite model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-compositemodelproperties)
       */
      override fun compositeModelProperties(): Any? = unwrap(this).getCompositeModelProperties()

      /**
       * The description of the composite model.
       *
       *
       * If the composite model is a `component-model-based` composite model, the description is
       * inherited from the `COMPONENT_MODEL` asset model and cannot be changed.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The external ID of a composite model on this asset model.
       *
       * For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       *
       * One of `ExternalId` or `Path` must be specified.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-externalid)
       */
      override fun externalId(): String? = unwrap(this).getExternalId()

      /**
       * The ID of the asset model composite model.
       *
       *
       * This is a return value and can't be set.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * The name of the composite model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The external ID of the parent composite model.
       *
       * For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-parentassetmodelcompositemodelexternalid)
       */
      override fun parentAssetModelCompositeModelExternalId(): String? =
          unwrap(this).getParentAssetModelCompositeModelExternalId()

      /**
       * The structured path to the property from the root of the asset using property names.
       *
       * Path is used as the ID if the asset model is a derived composite model.
       *
       *
       * One of `ExternalId` or `Path` must be specified.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-path)
       */
      override fun path(): List<String> = unwrap(this).getPath() ?: emptyList()

      /**
       * The type of the composite model.
       *
       * For alarm composite models, this type is `AWS/ALARM` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodel-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetModelCompositeModelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty):
          AssetModelCompositeModelProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AssetModelCompositeModelProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetModelCompositeModelProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty
    }
  }

  /**
   * Describes an asset hierarchy that contains a hierarchy's name, ID, and child asset model ID
   * that specifies the type of asset that can be in this hierarchy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * AssetModelHierarchyProperty assetModelHierarchyProperty = AssetModelHierarchyProperty.builder()
   * .childAssetModelId("childAssetModelId")
   * .name("name")
   * // the properties below are optional
   * .externalId("externalId")
   * .id("id")
   * .logicalId("logicalId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelhierarchy.html)
   */
  public interface AssetModelHierarchyProperty {
    /**
     * The ID of the asset model, in UUID format.
     *
     * All assets in this hierarchy must be instances of the `childAssetModelId` asset model. AWS
     * IoT SiteWise will always return the actual asset model ID for this value. However, when you are
     * specifying this value as part of a call to
     * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
     * , you may provide either the asset model ID or else `externalId:` followed by the asset model's
     * external ID. For more information, see [Using external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelhierarchy.html#cfn-iotsitewise-assetmodel-assetmodelhierarchy-childassetmodelid)
     */
    public fun childAssetModelId(): String

    /**
     * The external ID (if any) provided in the
     * [CreateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html)
     * or
     * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
     * operation. You can assign an external ID by specifying this value as part of a call to
     * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
     * . However, you can't change the external ID if one is already assigned. For more information,
     * see [Using external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids) in
     * the *AWS IoT SiteWise User Guide* .
     *
     *
     * One of `ExternalId` or `LogicalId` must be specified.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelhierarchy.html#cfn-iotsitewise-assetmodel-assetmodelhierarchy-externalid)
     */
    public fun externalId(): String? = unwrap(this).getExternalId()

    /**
     * The ID of the asset model hierarchy. This ID is a `hierarchyId` .
     *
     *
     * This is a return value and can't be set.
     *
     *
     * * If you are callling
     * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
     * to create a *new* hierarchy: You can specify its ID here, if desired. AWS IoT SiteWise
     * automatically generates a unique ID for you, so this parameter is never required. However, if
     * you prefer to supply your own ID instead, you can specify it here in UUID format. If you specify
     * your own ID, it must be globally unique.
     * * If you are calling UpdateAssetModel to modify an *existing* hierarchy: This can be either
     * the actual ID in UUID format, or else `externalId:` followed by the external ID, if it has one.
     * For more information, see [Referencing objects with external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelhierarchy.html#cfn-iotsitewise-assetmodel-assetmodelhierarchy-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * The `LogicalID` of the asset model hierarchy. This ID is a `hierarchyLogicalId` .
     *
     *
     * One of `ExternalId` or `LogicalId` must be specified.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelhierarchy.html#cfn-iotsitewise-assetmodel-assetmodelhierarchy-logicalid)
     */
    public fun logicalId(): String? = unwrap(this).getLogicalId()

    /**
     * The name of the asset model hierarchy that you specify by using the
     * [CreateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html)
     * or
     * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
     * API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelhierarchy.html#cfn-iotsitewise-assetmodel-assetmodelhierarchy-name)
     */
    public fun name(): String

    /**
     * A builder for [AssetModelHierarchyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param childAssetModelId The ID of the asset model, in UUID format. 
       * All assets in this hierarchy must be instances of the `childAssetModelId` asset model. AWS
       * IoT SiteWise will always return the actual asset model ID for this value. However, when you
       * are specifying this value as part of a call to
       * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
       * , you may provide either the asset model ID or else `externalId:` followed by the asset
       * model's external ID. For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       */
      public fun childAssetModelId(childAssetModelId: String)

      /**
       * @param externalId The external ID (if any) provided in the
       * [CreateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html)
       * or
       * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
       * operation. You can assign an external ID by specifying this value as part of a call to
       * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
       * . However, you can't change the external ID if one is already assigned. For more information,
       * see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * One of `ExternalId` or `LogicalId` must be specified.
       */
      public fun externalId(externalId: String)

      /**
       * @param id The ID of the asset model hierarchy. This ID is a `hierarchyId` .
       *
       * This is a return value and can't be set.
       *
       *
       * * If you are callling
       * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
       * to create a *new* hierarchy: You can specify its ID here, if desired. AWS IoT SiteWise
       * automatically generates a unique ID for you, so this parameter is never required. However, if
       * you prefer to supply your own ID instead, you can specify it here in UUID format. If you
       * specify your own ID, it must be globally unique.
       * * If you are calling UpdateAssetModel to modify an *existing* hierarchy: This can be either
       * the actual ID in UUID format, or else `externalId:` followed by the external ID, if it has
       * one. For more information, see [Referencing objects with external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references)
       * in the *AWS IoT SiteWise User Guide* .
       */
      public fun id(id: String)

      /**
       * @param logicalId The `LogicalID` of the asset model hierarchy. This ID is a
       * `hierarchyLogicalId` .
       *
       * One of `ExternalId` or `LogicalId` must be specified.
       */
      public fun logicalId(logicalId: String)

      /**
       * @param name The name of the asset model hierarchy that you specify by using the
       * [CreateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html)
       * or
       * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
       * API operation. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty.builder()

      /**
       * @param childAssetModelId The ID of the asset model, in UUID format. 
       * All assets in this hierarchy must be instances of the `childAssetModelId` asset model. AWS
       * IoT SiteWise will always return the actual asset model ID for this value. However, when you
       * are specifying this value as part of a call to
       * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
       * , you may provide either the asset model ID or else `externalId:` followed by the asset
       * model's external ID. For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       */
      override fun childAssetModelId(childAssetModelId: String) {
        cdkBuilder.childAssetModelId(childAssetModelId)
      }

      /**
       * @param externalId The external ID (if any) provided in the
       * [CreateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html)
       * or
       * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
       * operation. You can assign an external ID by specifying this value as part of a call to
       * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
       * . However, you can't change the external ID if one is already assigned. For more information,
       * see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * One of `ExternalId` or `LogicalId` must be specified.
       */
      override fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
      }

      /**
       * @param id The ID of the asset model hierarchy. This ID is a `hierarchyId` .
       *
       * This is a return value and can't be set.
       *
       *
       * * If you are callling
       * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
       * to create a *new* hierarchy: You can specify its ID here, if desired. AWS IoT SiteWise
       * automatically generates a unique ID for you, so this parameter is never required. However, if
       * you prefer to supply your own ID instead, you can specify it here in UUID format. If you
       * specify your own ID, it must be globally unique.
       * * If you are calling UpdateAssetModel to modify an *existing* hierarchy: This can be either
       * the actual ID in UUID format, or else `externalId:` followed by the external ID, if it has
       * one. For more information, see [Referencing objects with external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references)
       * in the *AWS IoT SiteWise User Guide* .
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param logicalId The `LogicalID` of the asset model hierarchy. This ID is a
       * `hierarchyLogicalId` .
       *
       * One of `ExternalId` or `LogicalId` must be specified.
       */
      override fun logicalId(logicalId: String) {
        cdkBuilder.logicalId(logicalId)
      }

      /**
       * @param name The name of the asset model hierarchy that you specify by using the
       * [CreateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html)
       * or
       * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
       * API operation. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty,
    ) : CdkObject(cdkObject),
        AssetModelHierarchyProperty {
      /**
       * The ID of the asset model, in UUID format.
       *
       * All assets in this hierarchy must be instances of the `childAssetModelId` asset model. AWS
       * IoT SiteWise will always return the actual asset model ID for this value. However, when you
       * are specifying this value as part of a call to
       * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
       * , you may provide either the asset model ID or else `externalId:` followed by the asset
       * model's external ID. For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelhierarchy.html#cfn-iotsitewise-assetmodel-assetmodelhierarchy-childassetmodelid)
       */
      override fun childAssetModelId(): String = unwrap(this).getChildAssetModelId()

      /**
       * The external ID (if any) provided in the
       * [CreateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html)
       * or
       * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
       * operation. You can assign an external ID by specifying this value as part of a call to
       * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
       * . However, you can't change the external ID if one is already assigned. For more information,
       * see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       *
       * One of `ExternalId` or `LogicalId` must be specified.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelhierarchy.html#cfn-iotsitewise-assetmodel-assetmodelhierarchy-externalid)
       */
      override fun externalId(): String? = unwrap(this).getExternalId()

      /**
       * The ID of the asset model hierarchy. This ID is a `hierarchyId` .
       *
       *
       * This is a return value and can't be set.
       *
       *
       * * If you are callling
       * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
       * to create a *new* hierarchy: You can specify its ID here, if desired. AWS IoT SiteWise
       * automatically generates a unique ID for you, so this parameter is never required. However, if
       * you prefer to supply your own ID instead, you can specify it here in UUID format. If you
       * specify your own ID, it must be globally unique.
       * * If you are calling UpdateAssetModel to modify an *existing* hierarchy: This can be either
       * the actual ID in UUID format, or else `externalId:` followed by the external ID, if it has
       * one. For more information, see [Referencing objects with external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-id-references)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelhierarchy.html#cfn-iotsitewise-assetmodel-assetmodelhierarchy-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * The `LogicalID` of the asset model hierarchy. This ID is a `hierarchyLogicalId` .
       *
       *
       * One of `ExternalId` or `LogicalId` must be specified.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelhierarchy.html#cfn-iotsitewise-assetmodel-assetmodelhierarchy-logicalid)
       */
      override fun logicalId(): String? = unwrap(this).getLogicalId()

      /**
       * The name of the asset model hierarchy that you specify by using the
       * [CreateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_CreateAssetModel.html)
       * or
       * [UpdateAssetModel](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetModel.html)
       * API operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelhierarchy.html#cfn-iotsitewise-assetmodel-assetmodelhierarchy-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetModelHierarchyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty):
          AssetModelHierarchyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AssetModelHierarchyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetModelHierarchyProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelHierarchyProperty
    }
  }

  /**
   * Contains information about an asset model property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * AssetModelPropertyProperty assetModelPropertyProperty = AssetModelPropertyProperty.builder()
   * .dataType("dataType")
   * .name("name")
   * .type(PropertyTypeProperty.builder()
   * .typeName("typeName")
   * // the properties below are optional
   * .attribute(AttributeProperty.builder()
   * .defaultValue("defaultValue")
   * .build())
   * .metric(MetricProperty.builder()
   * .expression("expression")
   * .variables(List.of(ExpressionVariableProperty.builder()
   * .name("name")
   * .value(VariableValueProperty.builder()
   * .hierarchyExternalId("hierarchyExternalId")
   * .hierarchyId("hierarchyId")
   * .hierarchyLogicalId("hierarchyLogicalId")
   * .propertyExternalId("propertyExternalId")
   * .propertyId("propertyId")
   * .propertyLogicalId("propertyLogicalId")
   * .propertyPath(List.of(PropertyPathDefinitionProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build()))
   * .window(MetricWindowProperty.builder()
   * .tumbling(TumblingWindowProperty.builder()
   * .interval("interval")
   * // the properties below are optional
   * .offset("offset")
   * .build())
   * .build())
   * .build())
   * .transform(TransformProperty.builder()
   * .expression("expression")
   * .variables(List.of(ExpressionVariableProperty.builder()
   * .name("name")
   * .value(VariableValueProperty.builder()
   * .hierarchyExternalId("hierarchyExternalId")
   * .hierarchyId("hierarchyId")
   * .hierarchyLogicalId("hierarchyLogicalId")
   * .propertyExternalId("propertyExternalId")
   * .propertyId("propertyId")
   * .propertyLogicalId("propertyLogicalId")
   * .propertyPath(List.of(PropertyPathDefinitionProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build()))
   * .build())
   * .build())
   * // the properties below are optional
   * .dataTypeSpec("dataTypeSpec")
   * .externalId("externalId")
   * .id("id")
   * .logicalId("logicalId")
   * .unit("unit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html)
   */
  public interface AssetModelPropertyProperty {
    /**
     * The data type of the asset model property.
     *
     * If you specify `STRUCT` , you must also specify `dataTypeSpec` to identify the type of the
     * structure for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html#cfn-iotsitewise-assetmodel-assetmodelproperty-datatype)
     */
    public fun dataType(): String

    /**
     * The data type of the structure for this property.
     *
     * This parameter exists on properties that have the `STRUCT` data type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html#cfn-iotsitewise-assetmodel-assetmodelproperty-datatypespec)
     */
    public fun dataTypeSpec(): String? = unwrap(this).getDataTypeSpec()

    /**
     * The external ID of the asset property.
     *
     * For more information, see [Using external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids) in
     * the *AWS IoT SiteWise User Guide* .
     *
     *
     * One of `ExternalId` or `LogicalId` must be specified.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html#cfn-iotsitewise-assetmodel-assetmodelproperty-externalid)
     */
    public fun externalId(): String? = unwrap(this).getExternalId()

    /**
     * The ID of the property.
     *
     *
     * This is a return value and can't be set.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html#cfn-iotsitewise-assetmodel-assetmodelproperty-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * The `LogicalID` of the asset model property.
     *
     *
     * One of `ExternalId` or `LogicalId` must be specified.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html#cfn-iotsitewise-assetmodel-assetmodelproperty-logicalid)
     */
    public fun logicalId(): String? = unwrap(this).getLogicalId()

    /**
     * The name of the asset model property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html#cfn-iotsitewise-assetmodel-assetmodelproperty-name)
     */
    public fun name(): String

    /**
     * Contains a property type, which can be one of `attribute` , `measurement` , `metric` , or
     * `transform` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html#cfn-iotsitewise-assetmodel-assetmodelproperty-type)
     */
    public fun type(): Any

    /**
     * The unit of the asset model property, such as `Newtons` or `RPM` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html#cfn-iotsitewise-assetmodel-assetmodelproperty-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * A builder for [AssetModelPropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataType The data type of the asset model property. 
       * If you specify `STRUCT` , you must also specify `dataTypeSpec` to identify the type of the
       * structure for this property.
       */
      public fun dataType(dataType: String)

      /**
       * @param dataTypeSpec The data type of the structure for this property.
       * This parameter exists on properties that have the `STRUCT` data type.
       */
      public fun dataTypeSpec(dataTypeSpec: String)

      /**
       * @param externalId The external ID of the asset property.
       * For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       *
       * One of `ExternalId` or `LogicalId` must be specified.
       */
      public fun externalId(externalId: String)

      /**
       * @param id The ID of the property.
       *
       * This is a return value and can't be set.
       */
      public fun id(id: String)

      /**
       * @param logicalId The `LogicalID` of the asset model property.
       *
       * One of `ExternalId` or `LogicalId` must be specified.
       */
      public fun logicalId(logicalId: String)

      /**
       * @param name The name of the asset model property. 
       */
      public fun name(name: String)

      /**
       * @param type Contains a property type, which can be one of `attribute` , `measurement` ,
       * `metric` , or `transform` . 
       */
      public fun type(type: IResolvable)

      /**
       * @param type Contains a property type, which can be one of `attribute` , `measurement` ,
       * `metric` , or `transform` . 
       */
      public fun type(type: PropertyTypeProperty)

      /**
       * @param type Contains a property type, which can be one of `attribute` , `measurement` ,
       * `metric` , or `transform` . 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b02bf400fd48dbd96fc4dc77d6dbf6839b0ec880462bf2bab2a6626dd1ae860")
      public fun type(type: PropertyTypeProperty.Builder.() -> Unit)

      /**
       * @param unit The unit of the asset model property, such as `Newtons` or `RPM` .
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty.builder()

      /**
       * @param dataType The data type of the asset model property. 
       * If you specify `STRUCT` , you must also specify `dataTypeSpec` to identify the type of the
       * structure for this property.
       */
      override fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
      }

      /**
       * @param dataTypeSpec The data type of the structure for this property.
       * This parameter exists on properties that have the `STRUCT` data type.
       */
      override fun dataTypeSpec(dataTypeSpec: String) {
        cdkBuilder.dataTypeSpec(dataTypeSpec)
      }

      /**
       * @param externalId The external ID of the asset property.
       * For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       *
       * One of `ExternalId` or `LogicalId` must be specified.
       */
      override fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
      }

      /**
       * @param id The ID of the property.
       *
       * This is a return value and can't be set.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param logicalId The `LogicalID` of the asset model property.
       *
       * One of `ExternalId` or `LogicalId` must be specified.
       */
      override fun logicalId(logicalId: String) {
        cdkBuilder.logicalId(logicalId)
      }

      /**
       * @param name The name of the asset model property. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type Contains a property type, which can be one of `attribute` , `measurement` ,
       * `metric` , or `transform` . 
       */
      override fun type(type: IResolvable) {
        cdkBuilder.type(type.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param type Contains a property type, which can be one of `attribute` , `measurement` ,
       * `metric` , or `transform` . 
       */
      override fun type(type: PropertyTypeProperty) {
        cdkBuilder.type(type.let(PropertyTypeProperty.Companion::unwrap))
      }

      /**
       * @param type Contains a property type, which can be one of `attribute` , `measurement` ,
       * `metric` , or `transform` . 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b02bf400fd48dbd96fc4dc77d6dbf6839b0ec880462bf2bab2a6626dd1ae860")
      override fun type(type: PropertyTypeProperty.Builder.() -> Unit): Unit =
          type(PropertyTypeProperty(type))

      /**
       * @param unit The unit of the asset model property, such as `Newtons` or `RPM` .
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty,
    ) : CdkObject(cdkObject),
        AssetModelPropertyProperty {
      /**
       * The data type of the asset model property.
       *
       * If you specify `STRUCT` , you must also specify `dataTypeSpec` to identify the type of the
       * structure for this property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html#cfn-iotsitewise-assetmodel-assetmodelproperty-datatype)
       */
      override fun dataType(): String = unwrap(this).getDataType()

      /**
       * The data type of the structure for this property.
       *
       * This parameter exists on properties that have the `STRUCT` data type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html#cfn-iotsitewise-assetmodel-assetmodelproperty-datatypespec)
       */
      override fun dataTypeSpec(): String? = unwrap(this).getDataTypeSpec()

      /**
       * The external ID of the asset property.
       *
       * For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       *
       * One of `ExternalId` or `LogicalId` must be specified.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html#cfn-iotsitewise-assetmodel-assetmodelproperty-externalid)
       */
      override fun externalId(): String? = unwrap(this).getExternalId()

      /**
       * The ID of the property.
       *
       *
       * This is a return value and can't be set.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html#cfn-iotsitewise-assetmodel-assetmodelproperty-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * The `LogicalID` of the asset model property.
       *
       *
       * One of `ExternalId` or `LogicalId` must be specified.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html#cfn-iotsitewise-assetmodel-assetmodelproperty-logicalid)
       */
      override fun logicalId(): String? = unwrap(this).getLogicalId()

      /**
       * The name of the asset model property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html#cfn-iotsitewise-assetmodel-assetmodelproperty-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Contains a property type, which can be one of `attribute` , `measurement` , `metric` , or
       * `transform` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html#cfn-iotsitewise-assetmodel-assetmodelproperty-type)
       */
      override fun type(): Any = unwrap(this).getType()

      /**
       * The unit of the asset model property, such as `Newtons` or `RPM` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html#cfn-iotsitewise-assetmodel-assetmodelproperty-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssetModelPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty):
          AssetModelPropertyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AssetModelPropertyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetModelPropertyProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty
    }
  }

  /**
   * Contains an asset attribute property.
   *
   * For more information, see
   * [Attributes](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html#attributes)
   * in the *AWS IoT SiteWise User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * AttributeProperty attributeProperty = AttributeProperty.builder()
   * .defaultValue("defaultValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-attribute.html)
   */
  public interface AttributeProperty {
    /**
     * The default value of the asset model property attribute.
     *
     * All assets that you create from the asset model contain this attribute value. You can update
     * an attribute's value after you create an asset. For more information, see [Updating attribute
     * values](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-attribute-values.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-attribute.html#cfn-iotsitewise-assetmodel-attribute-defaultvalue)
     */
    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    /**
     * A builder for [AttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultValue The default value of the asset model property attribute.
       * All assets that you create from the asset model contain this attribute value. You can
       * update an attribute's value after you create an asset. For more information, see [Updating
       * attribute
       * values](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-attribute-values.html)
       * in the *AWS IoT SiteWise User Guide* .
       */
      public fun defaultValue(defaultValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty.builder()

      /**
       * @param defaultValue The default value of the asset model property attribute.
       * All assets that you create from the asset model contain this attribute value. You can
       * update an attribute's value after you create an asset. For more information, see [Updating
       * attribute
       * values](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-attribute-values.html)
       * in the *AWS IoT SiteWise User Guide* .
       */
      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty,
    ) : CdkObject(cdkObject),
        AttributeProperty {
      /**
       * The default value of the asset model property attribute.
       *
       * All assets that you create from the asset model contain this attribute value. You can
       * update an attribute's value after you create an asset. For more information, see [Updating
       * attribute
       * values](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-attribute-values.html)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-attribute.html#cfn-iotsitewise-assetmodel-attribute-defaultvalue)
       */
      override fun defaultValue(): String? = unwrap(this).getDefaultValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty):
          AttributeProperty = CdkObjectWrappers.wrap(cdkObject) as? AttributeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty
    }
  }

  /**
   * Contains expression variable information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * ExpressionVariableProperty expressionVariableProperty = ExpressionVariableProperty.builder()
   * .name("name")
   * .value(VariableValueProperty.builder()
   * .hierarchyExternalId("hierarchyExternalId")
   * .hierarchyId("hierarchyId")
   * .hierarchyLogicalId("hierarchyLogicalId")
   * .propertyExternalId("propertyExternalId")
   * .propertyId("propertyId")
   * .propertyLogicalId("propertyLogicalId")
   * .propertyPath(List.of(PropertyPathDefinitionProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-expressionvariable.html)
   */
  public interface ExpressionVariableProperty {
    /**
     * The friendly name of the variable to be used in the expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-expressionvariable.html#cfn-iotsitewise-assetmodel-expressionvariable-name)
     */
    public fun name(): String

    /**
     * The variable that identifies an asset property from which to use values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-expressionvariable.html#cfn-iotsitewise-assetmodel-expressionvariable-value)
     */
    public fun `value`(): Any

    /**
     * A builder for [ExpressionVariableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The friendly name of the variable to be used in the expression. 
       */
      public fun name(name: String)

      /**
       * @param value The variable that identifies an asset property from which to use values. 
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value The variable that identifies an asset property from which to use values. 
       */
      public fun `value`(`value`: VariableValueProperty)

      /**
       * @param value The variable that identifies an asset property from which to use values. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fe68506a7e1507283e6722d8984a214e5a03a14cbb29005f0a2a6361c396d13")
      public fun `value`(`value`: VariableValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty.builder()

      /**
       * @param name The friendly name of the variable to be used in the expression. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The variable that identifies an asset property from which to use values. 
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param value The variable that identifies an asset property from which to use values. 
       */
      override fun `value`(`value`: VariableValueProperty) {
        cdkBuilder.`value`(`value`.let(VariableValueProperty.Companion::unwrap))
      }

      /**
       * @param value The variable that identifies an asset property from which to use values. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fe68506a7e1507283e6722d8984a214e5a03a14cbb29005f0a2a6361c396d13")
      override fun `value`(`value`: VariableValueProperty.Builder.() -> Unit): Unit =
          `value`(VariableValueProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty,
    ) : CdkObject(cdkObject),
        ExpressionVariableProperty {
      /**
       * The friendly name of the variable to be used in the expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-expressionvariable.html#cfn-iotsitewise-assetmodel-expressionvariable-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The variable that identifies an asset property from which to use values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-expressionvariable.html#cfn-iotsitewise-assetmodel-expressionvariable-value)
       */
      override fun `value`(): Any = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExpressionVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty):
          ExpressionVariableProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExpressionVariableProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExpressionVariableProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty
    }
  }

  /**
   * Contains an asset metric property.
   *
   * With metrics, you can calculate aggregate functions, such as an average, maximum, or minimum,
   * as specified through an expression. A metric maps several values to a single value (such as a
   * sum).
   *
   * The maximum number of dependent/cascading variables used in any one metric calculation is 10.
   * Therefore, a *root* metric can have up to 10 cascading metrics in its computational dependency
   * tree. Additionally, a metric can only have a data type of `DOUBLE` and consume properties with
   * data types of `INTEGER` or `DOUBLE` .
   *
   * For more information, see
   * [Metrics](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html#metrics)
   * in the *AWS IoT SiteWise User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * MetricProperty metricProperty = MetricProperty.builder()
   * .expression("expression")
   * .variables(List.of(ExpressionVariableProperty.builder()
   * .name("name")
   * .value(VariableValueProperty.builder()
   * .hierarchyExternalId("hierarchyExternalId")
   * .hierarchyId("hierarchyId")
   * .hierarchyLogicalId("hierarchyLogicalId")
   * .propertyExternalId("propertyExternalId")
   * .propertyId("propertyId")
   * .propertyLogicalId("propertyLogicalId")
   * .propertyPath(List.of(PropertyPathDefinitionProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build()))
   * .window(MetricWindowProperty.builder()
   * .tumbling(TumblingWindowProperty.builder()
   * .interval("interval")
   * // the properties below are optional
   * .offset("offset")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-metric.html)
   */
  public interface MetricProperty {
    /**
     * The mathematical expression that defines the metric aggregation function.
     *
     * You can specify up to 10 variables per expression. You can specify up to 10 functions per
     * expression.
     *
     * For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-metric.html#cfn-iotsitewise-assetmodel-metric-expression)
     */
    public fun expression(): String

    /**
     * The list of variables used in the expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-metric.html#cfn-iotsitewise-assetmodel-metric-variables)
     */
    public fun variables(): Any

    /**
     * The window (time interval) over which AWS IoT SiteWise computes the metric's aggregation
     * expression.
     *
     * AWS IoT SiteWise computes one data point per `window` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-metric.html#cfn-iotsitewise-assetmodel-metric-window)
     */
    public fun window(): Any

    /**
     * A builder for [MetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expression The mathematical expression that defines the metric aggregation function.
       * 
       * You can specify up to 10 variables per expression. You can specify up to 10 functions per
       * expression.
       *
       * For more information, see
       * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS
       * IoT SiteWise User Guide* .
       */
      public fun expression(expression: String)

      /**
       * @param variables The list of variables used in the expression. 
       */
      public fun variables(variables: IResolvable)

      /**
       * @param variables The list of variables used in the expression. 
       */
      public fun variables(variables: List<Any>)

      /**
       * @param variables The list of variables used in the expression. 
       */
      public fun variables(vararg variables: Any)

      /**
       * @param window The window (time interval) over which AWS IoT SiteWise computes the metric's
       * aggregation expression. 
       * AWS IoT SiteWise computes one data point per `window` .
       */
      public fun window(window: IResolvable)

      /**
       * @param window The window (time interval) over which AWS IoT SiteWise computes the metric's
       * aggregation expression. 
       * AWS IoT SiteWise computes one data point per `window` .
       */
      public fun window(window: MetricWindowProperty)

      /**
       * @param window The window (time interval) over which AWS IoT SiteWise computes the metric's
       * aggregation expression. 
       * AWS IoT SiteWise computes one data point per `window` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7fbeef7edee53ffe8864dcbc4ac9425520874cfd6a923039e871babf1bfb90c2")
      public fun window(window: MetricWindowProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty.builder()

      /**
       * @param expression The mathematical expression that defines the metric aggregation function.
       * 
       * You can specify up to 10 variables per expression. You can specify up to 10 functions per
       * expression.
       *
       * For more information, see
       * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS
       * IoT SiteWise User Guide* .
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param variables The list of variables used in the expression. 
       */
      override fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param variables The list of variables used in the expression. 
       */
      override fun variables(variables: List<Any>) {
        cdkBuilder.variables(variables.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param variables The list of variables used in the expression. 
       */
      override fun variables(vararg variables: Any): Unit = variables(variables.toList())

      /**
       * @param window The window (time interval) over which AWS IoT SiteWise computes the metric's
       * aggregation expression. 
       * AWS IoT SiteWise computes one data point per `window` .
       */
      override fun window(window: IResolvable) {
        cdkBuilder.window(window.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param window The window (time interval) over which AWS IoT SiteWise computes the metric's
       * aggregation expression. 
       * AWS IoT SiteWise computes one data point per `window` .
       */
      override fun window(window: MetricWindowProperty) {
        cdkBuilder.window(window.let(MetricWindowProperty.Companion::unwrap))
      }

      /**
       * @param window The window (time interval) over which AWS IoT SiteWise computes the metric's
       * aggregation expression. 
       * AWS IoT SiteWise computes one data point per `window` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7fbeef7edee53ffe8864dcbc4ac9425520874cfd6a923039e871babf1bfb90c2")
      override fun window(window: MetricWindowProperty.Builder.() -> Unit): Unit =
          window(MetricWindowProperty(window))

      public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty,
    ) : CdkObject(cdkObject),
        MetricProperty {
      /**
       * The mathematical expression that defines the metric aggregation function.
       *
       * You can specify up to 10 variables per expression. You can specify up to 10 functions per
       * expression.
       *
       * For more information, see
       * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS
       * IoT SiteWise User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-metric.html#cfn-iotsitewise-assetmodel-metric-expression)
       */
      override fun expression(): String = unwrap(this).getExpression()

      /**
       * The list of variables used in the expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-metric.html#cfn-iotsitewise-assetmodel-metric-variables)
       */
      override fun variables(): Any = unwrap(this).getVariables()

      /**
       * The window (time interval) over which AWS IoT SiteWise computes the metric's aggregation
       * expression.
       *
       * AWS IoT SiteWise computes one data point per `window` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-metric.html#cfn-iotsitewise-assetmodel-metric-window)
       */
      override fun window(): Any = unwrap(this).getWindow()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty):
          MetricProperty = CdkObjectWrappers.wrap(cdkObject) as? MetricProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricProperty
    }
  }

  /**
   * Contains a time interval window used for data aggregate computations (for example, average,
   * sum, count, and so on).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * MetricWindowProperty metricWindowProperty = MetricWindowProperty.builder()
   * .tumbling(TumblingWindowProperty.builder()
   * .interval("interval")
   * // the properties below are optional
   * .offset("offset")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-metricwindow.html)
   */
  public interface MetricWindowProperty {
    /**
     * The tumbling time interval window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-metricwindow.html#cfn-iotsitewise-assetmodel-metricwindow-tumbling)
     */
    public fun tumbling(): Any? = unwrap(this).getTumbling()

    /**
     * A builder for [MetricWindowProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param tumbling The tumbling time interval window.
       */
      public fun tumbling(tumbling: IResolvable)

      /**
       * @param tumbling The tumbling time interval window.
       */
      public fun tumbling(tumbling: TumblingWindowProperty)

      /**
       * @param tumbling The tumbling time interval window.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab07695551b582b00f816c66a7f2576b947182c36f6a83dfe16e32b8ea5ebfa2")
      public fun tumbling(tumbling: TumblingWindowProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty.builder()

      /**
       * @param tumbling The tumbling time interval window.
       */
      override fun tumbling(tumbling: IResolvable) {
        cdkBuilder.tumbling(tumbling.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tumbling The tumbling time interval window.
       */
      override fun tumbling(tumbling: TumblingWindowProperty) {
        cdkBuilder.tumbling(tumbling.let(TumblingWindowProperty.Companion::unwrap))
      }

      /**
       * @param tumbling The tumbling time interval window.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab07695551b582b00f816c66a7f2576b947182c36f6a83dfe16e32b8ea5ebfa2")
      override fun tumbling(tumbling: TumblingWindowProperty.Builder.() -> Unit): Unit =
          tumbling(TumblingWindowProperty(tumbling))

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty,
    ) : CdkObject(cdkObject),
        MetricWindowProperty {
      /**
       * The tumbling time interval window.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-metricwindow.html#cfn-iotsitewise-assetmodel-metricwindow-tumbling)
       */
      override fun tumbling(): Any? = unwrap(this).getTumbling()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty):
          MetricWindowProperty = CdkObjectWrappers.wrap(cdkObject) as? MetricWindowProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricWindowProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.MetricWindowProperty
    }
  }

  /**
   * Represents one level between a composite model and the root of the asset model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * PropertyPathDefinitionProperty propertyPathDefinitionProperty =
   * PropertyPathDefinitionProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-propertypathdefinition.html)
   */
  public interface PropertyPathDefinitionProperty {
    /**
     * The name of the path segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-propertypathdefinition.html#cfn-iotsitewise-assetmodel-propertypathdefinition-name)
     */
    public fun name(): String

    /**
     * A builder for [PropertyPathDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the path segment. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyPathDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyPathDefinitionProperty.builder()

      /**
       * @param name The name of the path segment. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyPathDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyPathDefinitionProperty,
    ) : CdkObject(cdkObject),
        PropertyPathDefinitionProperty {
      /**
       * The name of the path segment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-propertypathdefinition.html#cfn-iotsitewise-assetmodel-propertypathdefinition-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PropertyPathDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyPathDefinitionProperty):
          PropertyPathDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PropertyPathDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertyPathDefinitionProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyPathDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyPathDefinitionProperty
    }
  }

  /**
   * Contains a property type, which can be one of `attribute` , `measurement` , `metric` , or
   * `transform` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * PropertyTypeProperty propertyTypeProperty = PropertyTypeProperty.builder()
   * .typeName("typeName")
   * // the properties below are optional
   * .attribute(AttributeProperty.builder()
   * .defaultValue("defaultValue")
   * .build())
   * .metric(MetricProperty.builder()
   * .expression("expression")
   * .variables(List.of(ExpressionVariableProperty.builder()
   * .name("name")
   * .value(VariableValueProperty.builder()
   * .hierarchyExternalId("hierarchyExternalId")
   * .hierarchyId("hierarchyId")
   * .hierarchyLogicalId("hierarchyLogicalId")
   * .propertyExternalId("propertyExternalId")
   * .propertyId("propertyId")
   * .propertyLogicalId("propertyLogicalId")
   * .propertyPath(List.of(PropertyPathDefinitionProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build()))
   * .window(MetricWindowProperty.builder()
   * .tumbling(TumblingWindowProperty.builder()
   * .interval("interval")
   * // the properties below are optional
   * .offset("offset")
   * .build())
   * .build())
   * .build())
   * .transform(TransformProperty.builder()
   * .expression("expression")
   * .variables(List.of(ExpressionVariableProperty.builder()
   * .name("name")
   * .value(VariableValueProperty.builder()
   * .hierarchyExternalId("hierarchyExternalId")
   * .hierarchyId("hierarchyId")
   * .hierarchyLogicalId("hierarchyLogicalId")
   * .propertyExternalId("propertyExternalId")
   * .propertyId("propertyId")
   * .propertyLogicalId("propertyLogicalId")
   * .propertyPath(List.of(PropertyPathDefinitionProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-propertytype.html)
   */
  public interface PropertyTypeProperty {
    /**
     * Specifies an asset attribute property.
     *
     * An attribute generally contains static information, such as the serial number of an
     * [IIoT](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications)
     * wind turbine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-propertytype.html#cfn-iotsitewise-assetmodel-propertytype-attribute)
     */
    public fun attribute(): Any? = unwrap(this).getAttribute()

    /**
     * Specifies an asset metric property.
     *
     * A metric contains a mathematical expression that uses aggregate functions to process all
     * input data points over a time interval and output a single data point, such as to calculate the
     * average hourly temperature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-propertytype.html#cfn-iotsitewise-assetmodel-propertytype-metric)
     */
    public fun metric(): Any? = unwrap(this).getMetric()

    /**
     * Specifies an asset transform property.
     *
     * A transform contains a mathematical expression that maps a property's data points from one
     * form to another, such as a unit conversion from Celsius to Fahrenheit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-propertytype.html#cfn-iotsitewise-assetmodel-propertytype-transform)
     */
    public fun transform(): Any? = unwrap(this).getTransform()

    /**
     * The type of property type, which can be one of `Attribute` , `Measurement` , `Metric` , or
     * `Transform` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-propertytype.html#cfn-iotsitewise-assetmodel-propertytype-typename)
     */
    public fun typeName(): String

    /**
     * A builder for [PropertyTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attribute Specifies an asset attribute property.
       * An attribute generally contains static information, such as the serial number of an
       * [IIoT](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications)
       * wind turbine.
       */
      public fun attribute(attribute: IResolvable)

      /**
       * @param attribute Specifies an asset attribute property.
       * An attribute generally contains static information, such as the serial number of an
       * [IIoT](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications)
       * wind turbine.
       */
      public fun attribute(attribute: AttributeProperty)

      /**
       * @param attribute Specifies an asset attribute property.
       * An attribute generally contains static information, such as the serial number of an
       * [IIoT](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications)
       * wind turbine.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("837dcafc53122be3e760e748d4174916478f69f7a41d6a3abb2c31aeabb4ecf5")
      public fun attribute(attribute: AttributeProperty.Builder.() -> Unit)

      /**
       * @param metric Specifies an asset metric property.
       * A metric contains a mathematical expression that uses aggregate functions to process all
       * input data points over a time interval and output a single data point, such as to calculate
       * the average hourly temperature.
       */
      public fun metric(metric: IResolvable)

      /**
       * @param metric Specifies an asset metric property.
       * A metric contains a mathematical expression that uses aggregate functions to process all
       * input data points over a time interval and output a single data point, such as to calculate
       * the average hourly temperature.
       */
      public fun metric(metric: MetricProperty)

      /**
       * @param metric Specifies an asset metric property.
       * A metric contains a mathematical expression that uses aggregate functions to process all
       * input data points over a time interval and output a single data point, such as to calculate
       * the average hourly temperature.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0aa67042088e7c648ef91ace7754b97fb0bb6625a0d4f0acadb45dc76cc8619f")
      public fun metric(metric: MetricProperty.Builder.() -> Unit)

      /**
       * @param transform Specifies an asset transform property.
       * A transform contains a mathematical expression that maps a property's data points from one
       * form to another, such as a unit conversion from Celsius to Fahrenheit.
       */
      public fun transform(transform: IResolvable)

      /**
       * @param transform Specifies an asset transform property.
       * A transform contains a mathematical expression that maps a property's data points from one
       * form to another, such as a unit conversion from Celsius to Fahrenheit.
       */
      public fun transform(transform: TransformProperty)

      /**
       * @param transform Specifies an asset transform property.
       * A transform contains a mathematical expression that maps a property's data points from one
       * form to another, such as a unit conversion from Celsius to Fahrenheit.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("14787231582a963e96e4e44653f5cc21200d553f60fa1bf28dc98ad2ded77f58")
      public fun transform(transform: TransformProperty.Builder.() -> Unit)

      /**
       * @param typeName The type of property type, which can be one of `Attribute` , `Measurement`
       * , `Metric` , or `Transform` . 
       */
      public fun typeName(typeName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty.builder()

      /**
       * @param attribute Specifies an asset attribute property.
       * An attribute generally contains static information, such as the serial number of an
       * [IIoT](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications)
       * wind turbine.
       */
      override fun attribute(attribute: IResolvable) {
        cdkBuilder.attribute(attribute.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param attribute Specifies an asset attribute property.
       * An attribute generally contains static information, such as the serial number of an
       * [IIoT](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications)
       * wind turbine.
       */
      override fun attribute(attribute: AttributeProperty) {
        cdkBuilder.attribute(attribute.let(AttributeProperty.Companion::unwrap))
      }

      /**
       * @param attribute Specifies an asset attribute property.
       * An attribute generally contains static information, such as the serial number of an
       * [IIoT](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications)
       * wind turbine.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("837dcafc53122be3e760e748d4174916478f69f7a41d6a3abb2c31aeabb4ecf5")
      override fun attribute(attribute: AttributeProperty.Builder.() -> Unit): Unit =
          attribute(AttributeProperty(attribute))

      /**
       * @param metric Specifies an asset metric property.
       * A metric contains a mathematical expression that uses aggregate functions to process all
       * input data points over a time interval and output a single data point, such as to calculate
       * the average hourly temperature.
       */
      override fun metric(metric: IResolvable) {
        cdkBuilder.metric(metric.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param metric Specifies an asset metric property.
       * A metric contains a mathematical expression that uses aggregate functions to process all
       * input data points over a time interval and output a single data point, such as to calculate
       * the average hourly temperature.
       */
      override fun metric(metric: MetricProperty) {
        cdkBuilder.metric(metric.let(MetricProperty.Companion::unwrap))
      }

      /**
       * @param metric Specifies an asset metric property.
       * A metric contains a mathematical expression that uses aggregate functions to process all
       * input data points over a time interval and output a single data point, such as to calculate
       * the average hourly temperature.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0aa67042088e7c648ef91ace7754b97fb0bb6625a0d4f0acadb45dc76cc8619f")
      override fun metric(metric: MetricProperty.Builder.() -> Unit): Unit =
          metric(MetricProperty(metric))

      /**
       * @param transform Specifies an asset transform property.
       * A transform contains a mathematical expression that maps a property's data points from one
       * form to another, such as a unit conversion from Celsius to Fahrenheit.
       */
      override fun transform(transform: IResolvable) {
        cdkBuilder.transform(transform.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param transform Specifies an asset transform property.
       * A transform contains a mathematical expression that maps a property's data points from one
       * form to another, such as a unit conversion from Celsius to Fahrenheit.
       */
      override fun transform(transform: TransformProperty) {
        cdkBuilder.transform(transform.let(TransformProperty.Companion::unwrap))
      }

      /**
       * @param transform Specifies an asset transform property.
       * A transform contains a mathematical expression that maps a property's data points from one
       * form to another, such as a unit conversion from Celsius to Fahrenheit.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("14787231582a963e96e4e44653f5cc21200d553f60fa1bf28dc98ad2ded77f58")
      override fun transform(transform: TransformProperty.Builder.() -> Unit): Unit =
          transform(TransformProperty(transform))

      /**
       * @param typeName The type of property type, which can be one of `Attribute` , `Measurement`
       * , `Metric` , or `Transform` . 
       */
      override fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty,
    ) : CdkObject(cdkObject),
        PropertyTypeProperty {
      /**
       * Specifies an asset attribute property.
       *
       * An attribute generally contains static information, such as the serial number of an
       * [IIoT](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Internet_of_things#Industrial_applications)
       * wind turbine.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-propertytype.html#cfn-iotsitewise-assetmodel-propertytype-attribute)
       */
      override fun attribute(): Any? = unwrap(this).getAttribute()

      /**
       * Specifies an asset metric property.
       *
       * A metric contains a mathematical expression that uses aggregate functions to process all
       * input data points over a time interval and output a single data point, such as to calculate
       * the average hourly temperature.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-propertytype.html#cfn-iotsitewise-assetmodel-propertytype-metric)
       */
      override fun metric(): Any? = unwrap(this).getMetric()

      /**
       * Specifies an asset transform property.
       *
       * A transform contains a mathematical expression that maps a property's data points from one
       * form to another, such as a unit conversion from Celsius to Fahrenheit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-propertytype.html#cfn-iotsitewise-assetmodel-propertytype-transform)
       */
      override fun transform(): Any? = unwrap(this).getTransform()

      /**
       * The type of property type, which can be one of `Attribute` , `Measurement` , `Metric` , or
       * `Transform` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-propertytype.html#cfn-iotsitewise-assetmodel-propertytype-typename)
       */
      override fun typeName(): String = unwrap(this).getTypeName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PropertyTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty):
          PropertyTypeProperty = CdkObjectWrappers.wrap(cdkObject) as? PropertyTypeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertyTypeProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty
    }
  }

  /**
   * Contains an asset transform property.
   *
   * A transform is a one-to-one mapping of a property's data points from one form to another. For
   * example, you can use a transform to convert a Celsius data stream to Fahrenheit by applying the
   * transformation expression to each data point of the Celsius stream. A transform can only have a
   * data type of `DOUBLE` and consume properties with data types of `INTEGER` or `DOUBLE` .
   *
   * For more information, see
   * [Transforms](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html#transforms)
   * in the *AWS IoT SiteWise User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * TransformProperty transformProperty = TransformProperty.builder()
   * .expression("expression")
   * .variables(List.of(ExpressionVariableProperty.builder()
   * .name("name")
   * .value(VariableValueProperty.builder()
   * .hierarchyExternalId("hierarchyExternalId")
   * .hierarchyId("hierarchyId")
   * .hierarchyLogicalId("hierarchyLogicalId")
   * .propertyExternalId("propertyExternalId")
   * .propertyId("propertyId")
   * .propertyLogicalId("propertyLogicalId")
   * .propertyPath(List.of(PropertyPathDefinitionProperty.builder()
   * .name("name")
   * .build()))
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-transform.html)
   */
  public interface TransformProperty {
    /**
     * The mathematical expression that defines the transformation function.
     *
     * You can specify up to 10 variables per expression. You can specify up to 10 functions per
     * expression.
     *
     * For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-transform.html#cfn-iotsitewise-assetmodel-transform-expression)
     */
    public fun expression(): String

    /**
     * The list of variables used in the expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-transform.html#cfn-iotsitewise-assetmodel-transform-variables)
     */
    public fun variables(): Any

    /**
     * A builder for [TransformProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expression The mathematical expression that defines the transformation function. 
       * You can specify up to 10 variables per expression. You can specify up to 10 functions per
       * expression.
       *
       * For more information, see
       * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS
       * IoT SiteWise User Guide* .
       */
      public fun expression(expression: String)

      /**
       * @param variables The list of variables used in the expression. 
       */
      public fun variables(variables: IResolvable)

      /**
       * @param variables The list of variables used in the expression. 
       */
      public fun variables(variables: List<Any>)

      /**
       * @param variables The list of variables used in the expression. 
       */
      public fun variables(vararg variables: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TransformProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TransformProperty.builder()

      /**
       * @param expression The mathematical expression that defines the transformation function. 
       * You can specify up to 10 variables per expression. You can specify up to 10 functions per
       * expression.
       *
       * For more information, see
       * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS
       * IoT SiteWise User Guide* .
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param variables The list of variables used in the expression. 
       */
      override fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param variables The list of variables used in the expression. 
       */
      override fun variables(variables: List<Any>) {
        cdkBuilder.variables(variables.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param variables The list of variables used in the expression. 
       */
      override fun variables(vararg variables: Any): Unit = variables(variables.toList())

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TransformProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TransformProperty,
    ) : CdkObject(cdkObject),
        TransformProperty {
      /**
       * The mathematical expression that defines the transformation function.
       *
       * You can specify up to 10 variables per expression. You can specify up to 10 functions per
       * expression.
       *
       * For more information, see
       * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS
       * IoT SiteWise User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-transform.html#cfn-iotsitewise-assetmodel-transform-expression)
       */
      override fun expression(): String = unwrap(this).getExpression()

      /**
       * The list of variables used in the expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-transform.html#cfn-iotsitewise-assetmodel-transform-variables)
       */
      override fun variables(): Any = unwrap(this).getVariables()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TransformProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TransformProperty):
          TransformProperty = CdkObjectWrappers.wrap(cdkObject) as? TransformProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TransformProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TransformProperty
    }
  }

  /**
   * Contains a tumbling window, which is a repeating fixed-sized, non-overlapping, and contiguous
   * time window.
   *
   * You can use this window in metrics to aggregate data from properties and other assets.
   *
   * You can use `m` , `h` , `d` , and `w` when you specify an interval or offset. Note that `m`
   * represents minutes, `h` represents hours, `d` represents days, and `w` represents weeks. You can
   * also use `s` to represent seconds in `offset` .
   *
   * The `interval` and `offset` parameters support the [ISO 8601
   * format](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_8601) . For example, `PT5S`
   * represents 5 seconds, `PT5M` represents 5 minutes, and `PT5H` represents 5 hours.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * TumblingWindowProperty tumblingWindowProperty = TumblingWindowProperty.builder()
   * .interval("interval")
   * // the properties below are optional
   * .offset("offset")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-tumblingwindow.html)
   */
  public interface TumblingWindowProperty {
    /**
     * The time interval for the tumbling window. The interval time must be between 1 minute and 1
     * week.
     *
     * AWS IoT SiteWise computes the `1w` interval the end of Sunday at midnight each week (UTC),
     * the `1d` interval at the end of each day at midnight (UTC), the `1h` interval at the end of each
     * hour, and so on.
     *
     * When AWS IoT SiteWise aggregates data points for metric computations, the start of each
     * interval is exclusive and the end of each interval is inclusive. AWS IoT SiteWise places the
     * computed data point at the end of the interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-tumblingwindow.html#cfn-iotsitewise-assetmodel-tumblingwindow-interval)
     */
    public fun interval(): String

    /**
     * The offset for the tumbling window. The `offset` parameter accepts the following:.
     *
     * * The offset time.
     *
     * For example, if you specify `18h` for `offset` and `1d` for `interval` , AWS IoT SiteWise
     * aggregates data in one of the following ways:
     *
     * * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6
     * PM (UTC) on the day when you create the metric.
     * * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM
     * (UTC) the next day.
     * * The ISO 8601 format.
     *
     * For example, if you specify `PT18H` for `offset` and `1d` for `interval` , AWS IoT SiteWise
     * aggregates data in one of the following ways:
     *
     * * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6
     * PM (UTC) on the day when you create the metric.
     * * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM
     * (UTC) the next day.
     * * The 24-hour clock.
     *
     * For example, if you specify `00:03:00` for `offset` , `5m` for `interval` , and you create
     * the metric at 2 PM (UTC), you get the first aggregation result at 2:03 PM (UTC). You get the
     * second aggregation result at 2:08 PM (UTC).
     *
     * * The offset time zone.
     *
     * For example, if you specify `2021-07-23T18:00-08` for `offset` and `1d` for `interval` , AWS
     * IoT SiteWise aggregates data in one of the following ways:
     *
     * * If you create the metric before or at 6 PM (PST), you get the first aggregation result at 6
     * PM (PST) on the day when you create the metric.
     * * If you create the metric after 6 PM (PST), you get the first aggregation result at 6 PM
     * (PST) the next day.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-tumblingwindow.html#cfn-iotsitewise-assetmodel-tumblingwindow-offset)
     */
    public fun offset(): String? = unwrap(this).getOffset()

    /**
     * A builder for [TumblingWindowProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param interval The time interval for the tumbling window. The interval time must be
       * between 1 minute and 1 week. 
       * AWS IoT SiteWise computes the `1w` interval the end of Sunday at midnight each week (UTC),
       * the `1d` interval at the end of each day at midnight (UTC), the `1h` interval at the end of
       * each hour, and so on.
       *
       * When AWS IoT SiteWise aggregates data points for metric computations, the start of each
       * interval is exclusive and the end of each interval is inclusive. AWS IoT SiteWise places the
       * computed data point at the end of the interval.
       */
      public fun interval(interval: String)

      /**
       * @param offset The offset for the tumbling window. The `offset` parameter accepts the
       * following:.
       * * The offset time.
       *
       * For example, if you specify `18h` for `offset` and `1d` for `interval` , AWS IoT SiteWise
       * aggregates data in one of the following ways:
       *
       * * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at
       * 6 PM (UTC) on the day when you create the metric.
       * * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM
       * (UTC) the next day.
       * * The ISO 8601 format.
       *
       * For example, if you specify `PT18H` for `offset` and `1d` for `interval` , AWS IoT SiteWise
       * aggregates data in one of the following ways:
       *
       * * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at
       * 6 PM (UTC) on the day when you create the metric.
       * * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM
       * (UTC) the next day.
       * * The 24-hour clock.
       *
       * For example, if you specify `00:03:00` for `offset` , `5m` for `interval` , and you create
       * the metric at 2 PM (UTC), you get the first aggregation result at 2:03 PM (UTC). You get the
       * second aggregation result at 2:08 PM (UTC).
       *
       * * The offset time zone.
       *
       * For example, if you specify `2021-07-23T18:00-08` for `offset` and `1d` for `interval` ,
       * AWS IoT SiteWise aggregates data in one of the following ways:
       *
       * * If you create the metric before or at 6 PM (PST), you get the first aggregation result at
       * 6 PM (PST) on the day when you create the metric.
       * * If you create the metric after 6 PM (PST), you get the first aggregation result at 6 PM
       * (PST) the next day.
       */
      public fun offset(offset: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty.builder()

      /**
       * @param interval The time interval for the tumbling window. The interval time must be
       * between 1 minute and 1 week. 
       * AWS IoT SiteWise computes the `1w` interval the end of Sunday at midnight each week (UTC),
       * the `1d` interval at the end of each day at midnight (UTC), the `1h` interval at the end of
       * each hour, and so on.
       *
       * When AWS IoT SiteWise aggregates data points for metric computations, the start of each
       * interval is exclusive and the end of each interval is inclusive. AWS IoT SiteWise places the
       * computed data point at the end of the interval.
       */
      override fun interval(interval: String) {
        cdkBuilder.interval(interval)
      }

      /**
       * @param offset The offset for the tumbling window. The `offset` parameter accepts the
       * following:.
       * * The offset time.
       *
       * For example, if you specify `18h` for `offset` and `1d` for `interval` , AWS IoT SiteWise
       * aggregates data in one of the following ways:
       *
       * * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at
       * 6 PM (UTC) on the day when you create the metric.
       * * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM
       * (UTC) the next day.
       * * The ISO 8601 format.
       *
       * For example, if you specify `PT18H` for `offset` and `1d` for `interval` , AWS IoT SiteWise
       * aggregates data in one of the following ways:
       *
       * * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at
       * 6 PM (UTC) on the day when you create the metric.
       * * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM
       * (UTC) the next day.
       * * The 24-hour clock.
       *
       * For example, if you specify `00:03:00` for `offset` , `5m` for `interval` , and you create
       * the metric at 2 PM (UTC), you get the first aggregation result at 2:03 PM (UTC). You get the
       * second aggregation result at 2:08 PM (UTC).
       *
       * * The offset time zone.
       *
       * For example, if you specify `2021-07-23T18:00-08` for `offset` and `1d` for `interval` ,
       * AWS IoT SiteWise aggregates data in one of the following ways:
       *
       * * If you create the metric before or at 6 PM (PST), you get the first aggregation result at
       * 6 PM (PST) on the day when you create the metric.
       * * If you create the metric after 6 PM (PST), you get the first aggregation result at 6 PM
       * (PST) the next day.
       */
      override fun offset(offset: String) {
        cdkBuilder.offset(offset)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty,
    ) : CdkObject(cdkObject),
        TumblingWindowProperty {
      /**
       * The time interval for the tumbling window. The interval time must be between 1 minute and 1
       * week.
       *
       * AWS IoT SiteWise computes the `1w` interval the end of Sunday at midnight each week (UTC),
       * the `1d` interval at the end of each day at midnight (UTC), the `1h` interval at the end of
       * each hour, and so on.
       *
       * When AWS IoT SiteWise aggregates data points for metric computations, the start of each
       * interval is exclusive and the end of each interval is inclusive. AWS IoT SiteWise places the
       * computed data point at the end of the interval.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-tumblingwindow.html#cfn-iotsitewise-assetmodel-tumblingwindow-interval)
       */
      override fun interval(): String = unwrap(this).getInterval()

      /**
       * The offset for the tumbling window. The `offset` parameter accepts the following:.
       *
       * * The offset time.
       *
       * For example, if you specify `18h` for `offset` and `1d` for `interval` , AWS IoT SiteWise
       * aggregates data in one of the following ways:
       *
       * * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at
       * 6 PM (UTC) on the day when you create the metric.
       * * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM
       * (UTC) the next day.
       * * The ISO 8601 format.
       *
       * For example, if you specify `PT18H` for `offset` and `1d` for `interval` , AWS IoT SiteWise
       * aggregates data in one of the following ways:
       *
       * * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at
       * 6 PM (UTC) on the day when you create the metric.
       * * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM
       * (UTC) the next day.
       * * The 24-hour clock.
       *
       * For example, if you specify `00:03:00` for `offset` , `5m` for `interval` , and you create
       * the metric at 2 PM (UTC), you get the first aggregation result at 2:03 PM (UTC). You get the
       * second aggregation result at 2:08 PM (UTC).
       *
       * * The offset time zone.
       *
       * For example, if you specify `2021-07-23T18:00-08` for `offset` and `1d` for `interval` ,
       * AWS IoT SiteWise aggregates data in one of the following ways:
       *
       * * If you create the metric before or at 6 PM (PST), you get the first aggregation result at
       * 6 PM (PST) on the day when you create the metric.
       * * If you create the metric after 6 PM (PST), you get the first aggregation result at 6 PM
       * (PST) the next day.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-tumblingwindow.html#cfn-iotsitewise-assetmodel-tumblingwindow-offset)
       */
      override fun offset(): String? = unwrap(this).getOffset()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TumblingWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty):
          TumblingWindowProperty = CdkObjectWrappers.wrap(cdkObject) as? TumblingWindowProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TumblingWindowProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.TumblingWindowProperty
    }
  }

  /**
   * Identifies a property value used in an expression.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
   * VariableValueProperty variableValueProperty = VariableValueProperty.builder()
   * .hierarchyExternalId("hierarchyExternalId")
   * .hierarchyId("hierarchyId")
   * .hierarchyLogicalId("hierarchyLogicalId")
   * .propertyExternalId("propertyExternalId")
   * .propertyId("propertyId")
   * .propertyLogicalId("propertyLogicalId")
   * .propertyPath(List.of(PropertyPathDefinitionProperty.builder()
   * .name("name")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html)
   */
  public interface VariableValueProperty {
    /**
     * The external ID of the hierarchy being referenced.
     *
     * For more information, see [Using external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html#cfn-iotsitewise-assetmodel-variablevalue-hierarchyexternalid)
     */
    public fun hierarchyExternalId(): String? = unwrap(this).getHierarchyExternalId()

    /**
     * The ID of the hierarchy to query for the property ID.
     *
     * You can use the hierarchy's name instead of the hierarchy's ID. If the hierarchy has an
     * external ID, you can specify `externalId:` followed by the external ID. For more information,
     * see [Using external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * You use a hierarchy ID instead of a model ID because you can have several hierarchies using
     * the same model and therefore the same `propertyId` . For example, you might have separately
     * grouped assets that come from the same asset model. For more information, see [Asset
     * hierarchies](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html#cfn-iotsitewise-assetmodel-variablevalue-hierarchyid)
     */
    public fun hierarchyId(): String? = unwrap(this).getHierarchyId()

    /**
     * The `LogicalID` of the hierarchy to query for the `PropertyLogicalID` .
     *
     * You use a `hierarchyLogicalID` instead of a model ID because you can have several hierarchies
     * using the same model and therefore the same property. For example, you might have separately
     * grouped assets that come from the same asset model. For more information, see [Defining
     * relationships between asset models
     * (hierarchies)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html#cfn-iotsitewise-assetmodel-variablevalue-hierarchylogicalid)
     */
    public fun hierarchyLogicalId(): String? = unwrap(this).getHierarchyLogicalId()

    /**
     * The external ID of the property being referenced.
     *
     * For more information, see [Using external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html#cfn-iotsitewise-assetmodel-variablevalue-propertyexternalid)
     */
    public fun propertyExternalId(): String? = unwrap(this).getPropertyExternalId()

    /**
     * The ID of the property to use as the variable.
     *
     * You can use the property `name` if it's from the same asset model. If the property has an
     * external ID, you can specify `externalId:` followed by the external ID. For more information,
     * see [Using external
     * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids) in
     * the *AWS IoT SiteWise User Guide* .
     *
     *
     * This is a return value and can't be set.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html#cfn-iotsitewise-assetmodel-variablevalue-propertyid)
     */
    public fun propertyId(): String? = unwrap(this).getPropertyId()

    /**
     * The `LogicalID` of the property that is being referenced.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html#cfn-iotsitewise-assetmodel-variablevalue-propertylogicalid)
     */
    public fun propertyLogicalId(): String? = unwrap(this).getPropertyLogicalId()

    /**
     * The path of the property.
     *
     * Each step of the path is the name of the step. See the following example:
     *
     * `PropertyPath: Name: AssetModelName Name: Composite1 Name: NestedComposite`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html#cfn-iotsitewise-assetmodel-variablevalue-propertypath)
     */
    public fun propertyPath(): Any? = unwrap(this).getPropertyPath()

    /**
     * A builder for [VariableValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hierarchyExternalId The external ID of the hierarchy being referenced.
       * For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       */
      public fun hierarchyExternalId(hierarchyExternalId: String)

      /**
       * @param hierarchyId The ID of the hierarchy to query for the property ID.
       * You can use the hierarchy's name instead of the hierarchy's ID. If the hierarchy has an
       * external ID, you can specify `externalId:` followed by the external ID. For more information,
       * see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * You use a hierarchy ID instead of a model ID because you can have several hierarchies using
       * the same model and therefore the same `propertyId` . For example, you might have separately
       * grouped assets that come from the same asset model. For more information, see [Asset
       * hierarchies](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html)
       * in the *AWS IoT SiteWise User Guide* .
       */
      public fun hierarchyId(hierarchyId: String)

      /**
       * @param hierarchyLogicalId The `LogicalID` of the hierarchy to query for the
       * `PropertyLogicalID` .
       * You use a `hierarchyLogicalID` instead of a model ID because you can have several
       * hierarchies using the same model and therefore the same property. For example, you might have
       * separately grouped assets that come from the same asset model. For more information, see
       * [Defining relationships between asset models
       * (hierarchies)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html)
       * in the *AWS IoT SiteWise User Guide* .
       */
      public fun hierarchyLogicalId(hierarchyLogicalId: String)

      /**
       * @param propertyExternalId The external ID of the property being referenced.
       * For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       */
      public fun propertyExternalId(propertyExternalId: String)

      /**
       * @param propertyId The ID of the property to use as the variable.
       * You can use the property `name` if it's from the same asset model. If the property has an
       * external ID, you can specify `externalId:` followed by the external ID. For more information,
       * see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       *
       * This is a return value and can't be set.
       */
      public fun propertyId(propertyId: String)

      /**
       * @param propertyLogicalId The `LogicalID` of the property that is being referenced.
       */
      public fun propertyLogicalId(propertyLogicalId: String)

      /**
       * @param propertyPath The path of the property.
       * Each step of the path is the name of the step. See the following example:
       *
       * `PropertyPath: Name: AssetModelName Name: Composite1 Name: NestedComposite`
       */
      public fun propertyPath(propertyPath: IResolvable)

      /**
       * @param propertyPath The path of the property.
       * Each step of the path is the name of the step. See the following example:
       *
       * `PropertyPath: Name: AssetModelName Name: Composite1 Name: NestedComposite`
       */
      public fun propertyPath(propertyPath: List<Any>)

      /**
       * @param propertyPath The path of the property.
       * Each step of the path is the name of the step. See the following example:
       *
       * `PropertyPath: Name: AssetModelName Name: Composite1 Name: NestedComposite`
       */
      public fun propertyPath(vararg propertyPath: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty.builder()

      /**
       * @param hierarchyExternalId The external ID of the hierarchy being referenced.
       * For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       */
      override fun hierarchyExternalId(hierarchyExternalId: String) {
        cdkBuilder.hierarchyExternalId(hierarchyExternalId)
      }

      /**
       * @param hierarchyId The ID of the hierarchy to query for the property ID.
       * You can use the hierarchy's name instead of the hierarchy's ID. If the hierarchy has an
       * external ID, you can specify `externalId:` followed by the external ID. For more information,
       * see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * You use a hierarchy ID instead of a model ID because you can have several hierarchies using
       * the same model and therefore the same `propertyId` . For example, you might have separately
       * grouped assets that come from the same asset model. For more information, see [Asset
       * hierarchies](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html)
       * in the *AWS IoT SiteWise User Guide* .
       */
      override fun hierarchyId(hierarchyId: String) {
        cdkBuilder.hierarchyId(hierarchyId)
      }

      /**
       * @param hierarchyLogicalId The `LogicalID` of the hierarchy to query for the
       * `PropertyLogicalID` .
       * You use a `hierarchyLogicalID` instead of a model ID because you can have several
       * hierarchies using the same model and therefore the same property. For example, you might have
       * separately grouped assets that come from the same asset model. For more information, see
       * [Defining relationships between asset models
       * (hierarchies)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html)
       * in the *AWS IoT SiteWise User Guide* .
       */
      override fun hierarchyLogicalId(hierarchyLogicalId: String) {
        cdkBuilder.hierarchyLogicalId(hierarchyLogicalId)
      }

      /**
       * @param propertyExternalId The external ID of the property being referenced.
       * For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       */
      override fun propertyExternalId(propertyExternalId: String) {
        cdkBuilder.propertyExternalId(propertyExternalId)
      }

      /**
       * @param propertyId The ID of the property to use as the variable.
       * You can use the property `name` if it's from the same asset model. If the property has an
       * external ID, you can specify `externalId:` followed by the external ID. For more information,
       * see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       *
       * This is a return value and can't be set.
       */
      override fun propertyId(propertyId: String) {
        cdkBuilder.propertyId(propertyId)
      }

      /**
       * @param propertyLogicalId The `LogicalID` of the property that is being referenced.
       */
      override fun propertyLogicalId(propertyLogicalId: String) {
        cdkBuilder.propertyLogicalId(propertyLogicalId)
      }

      /**
       * @param propertyPath The path of the property.
       * Each step of the path is the name of the step. See the following example:
       *
       * `PropertyPath: Name: AssetModelName Name: Composite1 Name: NestedComposite`
       */
      override fun propertyPath(propertyPath: IResolvable) {
        cdkBuilder.propertyPath(propertyPath.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param propertyPath The path of the property.
       * Each step of the path is the name of the step. See the following example:
       *
       * `PropertyPath: Name: AssetModelName Name: Composite1 Name: NestedComposite`
       */
      override fun propertyPath(propertyPath: List<Any>) {
        cdkBuilder.propertyPath(propertyPath.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param propertyPath The path of the property.
       * Each step of the path is the name of the step. See the following example:
       *
       * `PropertyPath: Name: AssetModelName Name: Composite1 Name: NestedComposite`
       */
      override fun propertyPath(vararg propertyPath: Any): Unit =
          propertyPath(propertyPath.toList())

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty,
    ) : CdkObject(cdkObject),
        VariableValueProperty {
      /**
       * The external ID of the hierarchy being referenced.
       *
       * For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html#cfn-iotsitewise-assetmodel-variablevalue-hierarchyexternalid)
       */
      override fun hierarchyExternalId(): String? = unwrap(this).getHierarchyExternalId()

      /**
       * The ID of the hierarchy to query for the property ID.
       *
       * You can use the hierarchy's name instead of the hierarchy's ID. If the hierarchy has an
       * external ID, you can specify `externalId:` followed by the external ID. For more information,
       * see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * You use a hierarchy ID instead of a model ID because you can have several hierarchies using
       * the same model and therefore the same `propertyId` . For example, you might have separately
       * grouped assets that come from the same asset model. For more information, see [Asset
       * hierarchies](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html#cfn-iotsitewise-assetmodel-variablevalue-hierarchyid)
       */
      override fun hierarchyId(): String? = unwrap(this).getHierarchyId()

      /**
       * The `LogicalID` of the hierarchy to query for the `PropertyLogicalID` .
       *
       * You use a `hierarchyLogicalID` instead of a model ID because you can have several
       * hierarchies using the same model and therefore the same property. For example, you might have
       * separately grouped assets that come from the same asset model. For more information, see
       * [Defining relationships between asset models
       * (hierarchies)](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html#cfn-iotsitewise-assetmodel-variablevalue-hierarchylogicalid)
       */
      override fun hierarchyLogicalId(): String? = unwrap(this).getHierarchyLogicalId()

      /**
       * The external ID of the property being referenced.
       *
       * For more information, see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html#cfn-iotsitewise-assetmodel-variablevalue-propertyexternalid)
       */
      override fun propertyExternalId(): String? = unwrap(this).getPropertyExternalId()

      /**
       * The ID of the property to use as the variable.
       *
       * You can use the property `name` if it's from the same asset model. If the property has an
       * external ID, you can specify `externalId:` followed by the external ID. For more information,
       * see [Using external
       * IDs](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids)
       * in the *AWS IoT SiteWise User Guide* .
       *
       *
       * This is a return value and can't be set.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html#cfn-iotsitewise-assetmodel-variablevalue-propertyid)
       */
      override fun propertyId(): String? = unwrap(this).getPropertyId()

      /**
       * The `LogicalID` of the property that is being referenced.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html#cfn-iotsitewise-assetmodel-variablevalue-propertylogicalid)
       */
      override fun propertyLogicalId(): String? = unwrap(this).getPropertyLogicalId()

      /**
       * The path of the property.
       *
       * Each step of the path is the name of the step. See the following example:
       *
       * `PropertyPath: Name: AssetModelName Name: Composite1 Name: NestedComposite`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html#cfn-iotsitewise-assetmodel-variablevalue-propertypath)
       */
      override fun propertyPath(): Any? = unwrap(this).getPropertyPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VariableValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty):
          VariableValueProperty = CdkObjectWrappers.wrap(cdkObject) as? VariableValueProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VariableValueProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty
    }
  }
}
