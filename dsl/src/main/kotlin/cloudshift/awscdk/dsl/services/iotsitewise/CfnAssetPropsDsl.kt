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
import software.amazon.awscdk.services.iotsitewise.CfnAssetProps

@CdkDslMarker
public class CfnAssetPropsDsl {
  private val cdkBuilder: CfnAssetProps.Builder = CfnAssetProps.builder()

  private val _assetHierarchies: MutableList<Any> = mutableListOf()

  private val _assetProperties: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun assetDescription(assetDescription: String) {
    cdkBuilder.assetDescription(assetDescription)
  }

  public fun assetHierarchies(vararg assetHierarchies: Any) {
    _assetHierarchies.addAll(listOf(*assetHierarchies))
  }

  public fun assetHierarchies(assetHierarchies: Collection<Any>) {
    _assetHierarchies.addAll(assetHierarchies)
  }

  public fun assetHierarchies(assetHierarchies: IResolvable) {
    cdkBuilder.assetHierarchies(assetHierarchies)
  }

  public fun assetModelId(assetModelId: String) {
    cdkBuilder.assetModelId(assetModelId)
  }

  public fun assetName(assetName: String) {
    cdkBuilder.assetName(assetName)
  }

  public fun assetProperties(vararg assetProperties: Any) {
    _assetProperties.addAll(listOf(*assetProperties))
  }

  public fun assetProperties(assetProperties: Collection<Any>) {
    _assetProperties.addAll(assetProperties)
  }

  public fun assetProperties(assetProperties: IResolvable) {
    cdkBuilder.assetProperties(assetProperties)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAssetProps {
    if(_assetHierarchies.isNotEmpty()) cdkBuilder.assetHierarchies(_assetHierarchies)
    if(_assetProperties.isNotEmpty()) cdkBuilder.assetProperties(_assetProperties)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
