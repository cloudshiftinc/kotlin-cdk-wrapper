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
 * Properties for defining a `CfnAssetModel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
 * CfnAssetModelProps cfnAssetModelProps = CfnAssetModelProps.builder()
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
public interface CfnAssetModelProps {
  /**
   * The composite asset models that are part of this asset model.
   *
   * Composite asset models are asset models that contain specific properties. Each composite model
   * has a type that defines the properties that the composite model supports. You can use composite
   * asset models to define alarms on this asset model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodels)
   */
  public fun assetModelCompositeModels(): Any? = unwrap(this).getAssetModelCompositeModels()

  /**
   * A description for the asset model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodeldescription)
   */
  public fun assetModelDescription(): String? = unwrap(this).getAssetModelDescription()

  /**
   * The external ID of the asset model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelexternalid)
   */
  public fun assetModelExternalId(): String? = unwrap(this).getAssetModelExternalId()

  /**
   * The hierarchy definitions of the asset model.
   *
   * Each hierarchy specifies an asset model whose assets can be children of any other assets
   * created from this asset model. For more information, see [Defining relationships between
   * assets](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html) in the
   * *AWS IoT SiteWise User Guide* .
   *
   * You can specify up to 10 hierarchies per asset model. For more information, see
   * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
   * SiteWise User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelhierarchies)
   */
  public fun assetModelHierarchies(): Any? = unwrap(this).getAssetModelHierarchies()

  /**
   * A unique, friendly name for the asset model.
   *
   * The maximum length is 256 characters with the pattern `[^\u0000-\u001F\u007F]+` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelname)
   */
  public fun assetModelName(): String

  /**
   * The property definitions of the asset model.
   *
   * For more information, see [Defining data
   * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html) in
   * the *AWS IoT SiteWise User Guide* .
   *
   * You can specify up to 200 properties per asset model. For more information, see
   * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
   * SiteWise User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelproperties)
   */
  public fun assetModelProperties(): Any? = unwrap(this).getAssetModelProperties()

  /**
   * The type of the asset model (ASSET_MODEL OR COMPONENT_MODEL).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodeltype)
   */
  public fun assetModelType(): String? = unwrap(this).getAssetModelType()

  /**
   * A list of key-value pairs that contain metadata for the asset.
   *
   * For more information, see [Tagging your AWS IoT SiteWise
   * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
   * *AWS IoT SiteWise User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAssetModelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assetModelCompositeModels The composite asset models that are part of this asset
     * model.
     * Composite asset models are asset models that contain specific properties. Each composite
     * model has a type that defines the properties that the composite model supports. You can use
     * composite asset models to define alarms on this asset model.
     */
    public fun assetModelCompositeModels(assetModelCompositeModels: IResolvable)

    /**
     * @param assetModelCompositeModels The composite asset models that are part of this asset
     * model.
     * Composite asset models are asset models that contain specific properties. Each composite
     * model has a type that defines the properties that the composite model supports. You can use
     * composite asset models to define alarms on this asset model.
     */
    public fun assetModelCompositeModels(assetModelCompositeModels: List<Any>)

    /**
     * @param assetModelCompositeModels The composite asset models that are part of this asset
     * model.
     * Composite asset models are asset models that contain specific properties. Each composite
     * model has a type that defines the properties that the composite model supports. You can use
     * composite asset models to define alarms on this asset model.
     */
    public fun assetModelCompositeModels(vararg assetModelCompositeModels: Any)

    /**
     * @param assetModelDescription A description for the asset model.
     */
    public fun assetModelDescription(assetModelDescription: String)

    /**
     * @param assetModelExternalId The external ID of the asset model.
     */
    public fun assetModelExternalId(assetModelExternalId: String)

    /**
     * @param assetModelHierarchies The hierarchy definitions of the asset model.
     * Each hierarchy specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see [Defining relationships between
     * assets](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 10 hierarchies per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     */
    public fun assetModelHierarchies(assetModelHierarchies: IResolvable)

    /**
     * @param assetModelHierarchies The hierarchy definitions of the asset model.
     * Each hierarchy specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see [Defining relationships between
     * assets](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 10 hierarchies per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     */
    public fun assetModelHierarchies(assetModelHierarchies: List<Any>)

    /**
     * @param assetModelHierarchies The hierarchy definitions of the asset model.
     * Each hierarchy specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see [Defining relationships between
     * assets](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 10 hierarchies per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     */
    public fun assetModelHierarchies(vararg assetModelHierarchies: Any)

    /**
     * @param assetModelName A unique, friendly name for the asset model. 
     * The maximum length is 256 characters with the pattern `[^\u0000-\u001F\u007F]+` .
     */
    public fun assetModelName(assetModelName: String)

    /**
     * @param assetModelProperties The property definitions of the asset model.
     * For more information, see [Defining data
     * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 200 properties per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     */
    public fun assetModelProperties(assetModelProperties: IResolvable)

    /**
     * @param assetModelProperties The property definitions of the asset model.
     * For more information, see [Defining data
     * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 200 properties per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     */
    public fun assetModelProperties(assetModelProperties: List<Any>)

    /**
     * @param assetModelProperties The property definitions of the asset model.
     * For more information, see [Defining data
     * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 200 properties per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     */
    public fun assetModelProperties(vararg assetModelProperties: Any)

    /**
     * @param assetModelType The type of the asset model (ASSET_MODEL OR COMPONENT_MODEL).
     */
    public fun assetModelType(assetModelType: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps.builder()

    /**
     * @param assetModelCompositeModels The composite asset models that are part of this asset
     * model.
     * Composite asset models are asset models that contain specific properties. Each composite
     * model has a type that defines the properties that the composite model supports. You can use
     * composite asset models to define alarms on this asset model.
     */
    override fun assetModelCompositeModels(assetModelCompositeModels: IResolvable) {
      cdkBuilder.assetModelCompositeModels(assetModelCompositeModels.let(IResolvable::unwrap))
    }

    /**
     * @param assetModelCompositeModels The composite asset models that are part of this asset
     * model.
     * Composite asset models are asset models that contain specific properties. Each composite
     * model has a type that defines the properties that the composite model supports. You can use
     * composite asset models to define alarms on this asset model.
     */
    override fun assetModelCompositeModels(assetModelCompositeModels: List<Any>) {
      cdkBuilder.assetModelCompositeModels(assetModelCompositeModels)
    }

    /**
     * @param assetModelCompositeModels The composite asset models that are part of this asset
     * model.
     * Composite asset models are asset models that contain specific properties. Each composite
     * model has a type that defines the properties that the composite model supports. You can use
     * composite asset models to define alarms on this asset model.
     */
    override fun assetModelCompositeModels(vararg assetModelCompositeModels: Any): Unit =
        assetModelCompositeModels(assetModelCompositeModels.toList())

    /**
     * @param assetModelDescription A description for the asset model.
     */
    override fun assetModelDescription(assetModelDescription: String) {
      cdkBuilder.assetModelDescription(assetModelDescription)
    }

    /**
     * @param assetModelExternalId The external ID of the asset model.
     */
    override fun assetModelExternalId(assetModelExternalId: String) {
      cdkBuilder.assetModelExternalId(assetModelExternalId)
    }

    /**
     * @param assetModelHierarchies The hierarchy definitions of the asset model.
     * Each hierarchy specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see [Defining relationships between
     * assets](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 10 hierarchies per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     */
    override fun assetModelHierarchies(assetModelHierarchies: IResolvable) {
      cdkBuilder.assetModelHierarchies(assetModelHierarchies.let(IResolvable::unwrap))
    }

    /**
     * @param assetModelHierarchies The hierarchy definitions of the asset model.
     * Each hierarchy specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see [Defining relationships between
     * assets](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 10 hierarchies per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     */
    override fun assetModelHierarchies(assetModelHierarchies: List<Any>) {
      cdkBuilder.assetModelHierarchies(assetModelHierarchies)
    }

    /**
     * @param assetModelHierarchies The hierarchy definitions of the asset model.
     * Each hierarchy specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see [Defining relationships between
     * assets](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 10 hierarchies per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     */
    override fun assetModelHierarchies(vararg assetModelHierarchies: Any): Unit =
        assetModelHierarchies(assetModelHierarchies.toList())

    /**
     * @param assetModelName A unique, friendly name for the asset model. 
     * The maximum length is 256 characters with the pattern `[^\u0000-\u001F\u007F]+` .
     */
    override fun assetModelName(assetModelName: String) {
      cdkBuilder.assetModelName(assetModelName)
    }

    /**
     * @param assetModelProperties The property definitions of the asset model.
     * For more information, see [Defining data
     * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 200 properties per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     */
    override fun assetModelProperties(assetModelProperties: IResolvable) {
      cdkBuilder.assetModelProperties(assetModelProperties.let(IResolvable::unwrap))
    }

    /**
     * @param assetModelProperties The property definitions of the asset model.
     * For more information, see [Defining data
     * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 200 properties per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     */
    override fun assetModelProperties(assetModelProperties: List<Any>) {
      cdkBuilder.assetModelProperties(assetModelProperties)
    }

    /**
     * @param assetModelProperties The property definitions of the asset model.
     * For more information, see [Defining data
     * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 200 properties per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     */
    override fun assetModelProperties(vararg assetModelProperties: Any): Unit =
        assetModelProperties(assetModelProperties.toList())

    /**
     * @param assetModelType The type of the asset model (ASSET_MODEL OR COMPONENT_MODEL).
     */
    override fun assetModelType(assetModelType: String) {
      cdkBuilder.assetModelType(assetModelType)
    }

    /**
     * @param tags A list of key-value pairs that contain metadata for the asset.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of key-value pairs that contain metadata for the asset.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps,
  ) : CdkObject(cdkObject), CfnAssetModelProps {
    /**
     * The composite asset models that are part of this asset model.
     *
     * Composite asset models are asset models that contain specific properties. Each composite
     * model has a type that defines the properties that the composite model supports. You can use
     * composite asset models to define alarms on this asset model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodels)
     */
    override fun assetModelCompositeModels(): Any? = unwrap(this).getAssetModelCompositeModels()

    /**
     * A description for the asset model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodeldescription)
     */
    override fun assetModelDescription(): String? = unwrap(this).getAssetModelDescription()

    /**
     * The external ID of the asset model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelexternalid)
     */
    override fun assetModelExternalId(): String? = unwrap(this).getAssetModelExternalId()

    /**
     * The hierarchy definitions of the asset model.
     *
     * Each hierarchy specifies an asset model whose assets can be children of any other assets
     * created from this asset model. For more information, see [Defining relationships between
     * assets](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 10 hierarchies per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelhierarchies)
     */
    override fun assetModelHierarchies(): Any? = unwrap(this).getAssetModelHierarchies()

    /**
     * A unique, friendly name for the asset model.
     *
     * The maximum length is 256 characters with the pattern `[^\u0000-\u001F\u007F]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelname)
     */
    override fun assetModelName(): String = unwrap(this).getAssetModelName()

    /**
     * The property definitions of the asset model.
     *
     * For more information, see [Defining data
     * properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html) in
     * the *AWS IoT SiteWise User Guide* .
     *
     * You can specify up to 200 properties per asset model. For more information, see
     * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
     * SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelproperties)
     */
    override fun assetModelProperties(): Any? = unwrap(this).getAssetModelProperties()

    /**
     * The type of the asset model (ASSET_MODEL OR COMPONENT_MODEL).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodeltype)
     */
    override fun assetModelType(): String? = unwrap(this).getAssetModelType()

    /**
     * A list of key-value pairs that contain metadata for the asset.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssetModelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps):
        CfnAssetModelProps = CdkObjectWrappers.wrap(cdkObject) as CfnAssetModelProps

    internal fun unwrap(wrapped: CfnAssetModelProps):
        software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps
  }
}
