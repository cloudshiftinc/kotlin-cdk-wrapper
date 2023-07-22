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
import software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps

@CdkDslMarker
public class CfnAssetModelPropsDsl {
  private val cdkBuilder: CfnAssetModelProps.Builder = CfnAssetModelProps.builder()

  private val _assetModelCompositeModels: MutableList<Any> = mutableListOf()

  private val _assetModelHierarchies: MutableList<Any> = mutableListOf()

  private val _assetModelProperties: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param assetModelCompositeModels The composite asset models that are part of this asset model.
   * Composite asset models are asset models that contain specific properties. Each composite model
   * has a type that defines the properties that the composite model supports. You can use composite
   * asset models to define alarms on this asset model.
   */
  public fun assetModelCompositeModels(vararg assetModelCompositeModels: Any) {
    _assetModelCompositeModels.addAll(listOf(*assetModelCompositeModels))
  }

  /**
   * @param assetModelCompositeModels The composite asset models that are part of this asset model.
   * Composite asset models are asset models that contain specific properties. Each composite model
   * has a type that defines the properties that the composite model supports. You can use composite
   * asset models to define alarms on this asset model.
   */
  public fun assetModelCompositeModels(assetModelCompositeModels: Collection<Any>) {
    _assetModelCompositeModels.addAll(assetModelCompositeModels)
  }

  /**
   * @param assetModelCompositeModels The composite asset models that are part of this asset model.
   * Composite asset models are asset models that contain specific properties. Each composite model
   * has a type that defines the properties that the composite model supports. You can use composite
   * asset models to define alarms on this asset model.
   */
  public fun assetModelCompositeModels(assetModelCompositeModels: IResolvable) {
    cdkBuilder.assetModelCompositeModels(assetModelCompositeModels)
  }

  /**
   * @param assetModelDescription A description for the asset model.
   */
  public fun assetModelDescription(assetModelDescription: String) {
    cdkBuilder.assetModelDescription(assetModelDescription)
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
  public fun assetModelHierarchies(vararg assetModelHierarchies: Any) {
    _assetModelHierarchies.addAll(listOf(*assetModelHierarchies))
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
  public fun assetModelHierarchies(assetModelHierarchies: Collection<Any>) {
    _assetModelHierarchies.addAll(assetModelHierarchies)
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
  public fun assetModelHierarchies(assetModelHierarchies: IResolvable) {
    cdkBuilder.assetModelHierarchies(assetModelHierarchies)
  }

  /**
   * @param assetModelName A unique, friendly name for the asset model. 
   * The maximum length is 256 characters with the pattern `[^\u0000-\u001F\u007F]+` .
   */
  public fun assetModelName(assetModelName: String) {
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
  public fun assetModelProperties(vararg assetModelProperties: Any) {
    _assetModelProperties.addAll(listOf(*assetModelProperties))
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
  public fun assetModelProperties(assetModelProperties: Collection<Any>) {
    _assetModelProperties.addAll(assetModelProperties)
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
  public fun assetModelProperties(assetModelProperties: IResolvable) {
    cdkBuilder.assetModelProperties(assetModelProperties)
  }

  /**
   * @param tags A list of key-value pairs that contain metadata for the asset.
   * For more information, see [Tagging your AWS IoT SiteWise
   * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
   * *AWS IoT SiteWise User Guide* .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A list of key-value pairs that contain metadata for the asset.
   * For more information, see [Tagging your AWS IoT SiteWise
   * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
   * *AWS IoT SiteWise User Guide* .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAssetModelProps {
    if(_assetModelCompositeModels.isNotEmpty())
        cdkBuilder.assetModelCompositeModels(_assetModelCompositeModels)
    if(_assetModelHierarchies.isNotEmpty()) cdkBuilder.assetModelHierarchies(_assetModelHierarchies)
    if(_assetModelProperties.isNotEmpty()) cdkBuilder.assetModelProperties(_assetModelProperties)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
