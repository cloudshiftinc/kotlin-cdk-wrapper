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
import software.amazon.awscdk.services.iotsitewise.CfnAsset
import software.constructs.Construct

@CdkDslMarker
public class CfnAssetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAsset.Builder = CfnAsset.Builder.create(scope, id)

  private val _assetHierarchies: MutableList<Any> = mutableListOf()

  private val _assetProperties: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * A description for the asset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetdescription)
   * @param assetDescription A description for the asset. 
   */
  public fun assetDescription(assetDescription: String) {
    cdkBuilder.assetDescription(assetDescription)
  }

  /**
   * A list of asset hierarchies that each contain a `hierarchyLogicalId` .
   *
   * A hierarchy specifies allowed parent/child asset relationships.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assethierarchies)
   * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyLogicalId` . 
   */
  public fun assetHierarchies(vararg assetHierarchies: Any) {
    _assetHierarchies.addAll(listOf(*assetHierarchies))
  }

  /**
   * A list of asset hierarchies that each contain a `hierarchyLogicalId` .
   *
   * A hierarchy specifies allowed parent/child asset relationships.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assethierarchies)
   * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyLogicalId` . 
   */
  public fun assetHierarchies(assetHierarchies: Collection<Any>) {
    _assetHierarchies.addAll(assetHierarchies)
  }

  /**
   * A list of asset hierarchies that each contain a `hierarchyLogicalId` .
   *
   * A hierarchy specifies allowed parent/child asset relationships.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assethierarchies)
   * @param assetHierarchies A list of asset hierarchies that each contain a `hierarchyLogicalId` . 
   */
  public fun assetHierarchies(assetHierarchies: IResolvable) {
    cdkBuilder.assetHierarchies(assetHierarchies)
  }

  /**
   * The ID of the asset model from which to create the asset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-assetmodelid)
   * @param assetModelId The ID of the asset model from which to create the asset. 
   */
  public fun assetModelId(assetModelId: String) {
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
  public fun assetName(assetName: String) {
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
  public fun assetProperties(vararg assetProperties: Any) {
    _assetProperties.addAll(listOf(*assetProperties))
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
  public fun assetProperties(assetProperties: Collection<Any>) {
    _assetProperties.addAll(assetProperties)
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
  public fun assetProperties(assetProperties: IResolvable) {
    cdkBuilder.assetProperties(assetProperties)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html#cfn-iotsitewise-asset-tags)
   * @param tags A list of key-value pairs that contain metadata for the asset. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAsset {
    if(_assetHierarchies.isNotEmpty()) cdkBuilder.assetHierarchies(_assetHierarchies)
    if(_assetProperties.isNotEmpty()) cdkBuilder.assetProperties(_assetProperties)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
