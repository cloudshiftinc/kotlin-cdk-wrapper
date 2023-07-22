@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel
import software.constructs.Construct

/**
 * Creates an asset model from specified property and hierarchy definitions.
 *
 * You create assets from asset models. With asset models, you can easily create assets of the same
 * type that have standardized definitions. Each asset created from a model inherits the asset model's
 * property and hierarchy definitions. For more information, see [Defining asset
 * models](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/define-models.html) in the *AWS
 * IoT SiteWise User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * CfnAssetModel cfnAssetModel = CfnAssetModel.Builder.create(this, "MyCfnAssetModel")
 * .assetModelName("assetModelName")
 * // the properties below are optional
 * .assetModelCompositeModels(List.of(AssetModelCompositeModelProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .compositeModelProperties(List.of(AssetModelPropertyProperty.builder()
 * .dataType("dataType")
 * .logicalId("logicalId")
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
 * .propertyLogicalId("propertyLogicalId")
 * // the properties below are optional
 * .hierarchyLogicalId("hierarchyLogicalId")
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
 * .propertyLogicalId("propertyLogicalId")
 * // the properties below are optional
 * .hierarchyLogicalId("hierarchyLogicalId")
 * .build())
 * .build()))
 * .build())
 * .build())
 * // the properties below are optional
 * .dataTypeSpec("dataTypeSpec")
 * .unit("unit")
 * .build()))
 * .description("description")
 * .build()))
 * .assetModelDescription("assetModelDescription")
 * .assetModelHierarchies(List.of(AssetModelHierarchyProperty.builder()
 * .childAssetModelId("childAssetModelId")
 * .logicalId("logicalId")
 * .name("name")
 * .build()))
 * .assetModelProperties(List.of(AssetModelPropertyProperty.builder()
 * .dataType("dataType")
 * .logicalId("logicalId")
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
 * .propertyLogicalId("propertyLogicalId")
 * // the properties below are optional
 * .hierarchyLogicalId("hierarchyLogicalId")
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
 * .propertyLogicalId("propertyLogicalId")
 * // the properties below are optional
 * .hierarchyLogicalId("hierarchyLogicalId")
 * .build())
 * .build()))
 * .build())
 * .build())
 * // the properties below are optional
 * .dataTypeSpec("dataTypeSpec")
 * .unit("unit")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html)
 */
@CdkDslMarker
public class CfnAssetModelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAssetModel.Builder = CfnAssetModel.Builder.create(scope, id)

  private val _assetModelCompositeModels: MutableList<Any> = mutableListOf()

  private val _assetModelHierarchies: MutableList<Any> = mutableListOf()

  private val _assetModelProperties: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The composite asset models that are part of this asset model.
   *
   * Composite asset models are asset models that contain specific properties. Each composite model
   * has a type that defines the properties that the composite model supports. You can use composite
   * asset models to define alarms on this asset model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodels)
   * @param assetModelCompositeModels The composite asset models that are part of this asset model. 
   */
  public fun assetModelCompositeModels(vararg assetModelCompositeModels: Any) {
    _assetModelCompositeModels.addAll(listOf(*assetModelCompositeModels))
  }

  /**
   * The composite asset models that are part of this asset model.
   *
   * Composite asset models are asset models that contain specific properties. Each composite model
   * has a type that defines the properties that the composite model supports. You can use composite
   * asset models to define alarms on this asset model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodels)
   * @param assetModelCompositeModels The composite asset models that are part of this asset model. 
   */
  public fun assetModelCompositeModels(assetModelCompositeModels: Collection<Any>) {
    _assetModelCompositeModels.addAll(assetModelCompositeModels)
  }

  /**
   * The composite asset models that are part of this asset model.
   *
   * Composite asset models are asset models that contain specific properties. Each composite model
   * has a type that defines the properties that the composite model supports. You can use composite
   * asset models to define alarms on this asset model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelcompositemodels)
   * @param assetModelCompositeModels The composite asset models that are part of this asset model. 
   */
  public fun assetModelCompositeModels(assetModelCompositeModels: IResolvable) {
    cdkBuilder.assetModelCompositeModels(assetModelCompositeModels)
  }

  /**
   * A description for the asset model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodeldescription)
   * @param assetModelDescription A description for the asset model. 
   */
  public fun assetModelDescription(assetModelDescription: String) {
    cdkBuilder.assetModelDescription(assetModelDescription)
  }

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
   * @param assetModelHierarchies The hierarchy definitions of the asset model. 
   */
  public fun assetModelHierarchies(vararg assetModelHierarchies: Any) {
    _assetModelHierarchies.addAll(listOf(*assetModelHierarchies))
  }

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
   * @param assetModelHierarchies The hierarchy definitions of the asset model. 
   */
  public fun assetModelHierarchies(assetModelHierarchies: Collection<Any>) {
    _assetModelHierarchies.addAll(assetModelHierarchies)
  }

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
   * @param assetModelHierarchies The hierarchy definitions of the asset model. 
   */
  public fun assetModelHierarchies(assetModelHierarchies: IResolvable) {
    cdkBuilder.assetModelHierarchies(assetModelHierarchies)
  }

  /**
   * A unique, friendly name for the asset model.
   *
   * The maximum length is 256 characters with the pattern `[^\u0000-\u001F\u007F]+` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html#cfn-iotsitewise-assetmodel-assetmodelname)
   * @param assetModelName A unique, friendly name for the asset model. 
   */
  public fun assetModelName(assetModelName: String) {
    cdkBuilder.assetModelName(assetModelName)
  }

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
   * @param assetModelProperties The property definitions of the asset model. 
   */
  public fun assetModelProperties(vararg assetModelProperties: Any) {
    _assetModelProperties.addAll(listOf(*assetModelProperties))
  }

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
   * @param assetModelProperties The property definitions of the asset model. 
   */
  public fun assetModelProperties(assetModelProperties: Collection<Any>) {
    _assetModelProperties.addAll(assetModelProperties)
  }

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
   * @param assetModelProperties The property definitions of the asset model. 
   */
  public fun assetModelProperties(assetModelProperties: IResolvable) {
    cdkBuilder.assetModelProperties(assetModelProperties)
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
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
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
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAssetModel {
    if(_assetModelCompositeModels.isNotEmpty())
        cdkBuilder.assetModelCompositeModels(_assetModelCompositeModels)
    if(_assetModelHierarchies.isNotEmpty()) cdkBuilder.assetModelHierarchies(_assetModelHierarchies)
    if(_assetModelProperties.isNotEmpty()) cdkBuilder.assetModelProperties(_assetModelProperties)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
