@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnAssetProps

@CdkDslMarker
public class CfnAssetPropsDsl {
  private val cdkBuilder: CfnAssetProps.Builder = CfnAssetProps.builder()

  private val _egressEndpoints: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun egressEndpoints(vararg egressEndpoints: Any) {
    _egressEndpoints.addAll(listOf(*egressEndpoints))
  }

  public fun egressEndpoints(egressEndpoints: Collection<Any>) {
    _egressEndpoints.addAll(egressEndpoints)
  }

  public fun egressEndpoints(egressEndpoints: IResolvable) {
    cdkBuilder.egressEndpoints(egressEndpoints)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun packagingGroupId(packagingGroupId: String) {
    cdkBuilder.packagingGroupId(packagingGroupId)
  }

  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun sourceArn(sourceArn: String) {
    cdkBuilder.sourceArn(sourceArn)
  }

  public fun sourceRoleArn(sourceRoleArn: String) {
    cdkBuilder.sourceRoleArn(sourceRoleArn)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAssetProps {
    if(_egressEndpoints.isNotEmpty()) cdkBuilder.egressEndpoints(_egressEndpoints)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
