@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnMesh
import software.amazon.awscdk.services.appmesh.CfnMeshProps

@CdkDslMarker
public class CfnMeshPropsDsl {
  private val cdkBuilder: CfnMeshProps.Builder = CfnMeshProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun meshName(meshName: String) {
    cdkBuilder.meshName(meshName)
  }

  public fun spec(spec: IResolvable) {
    cdkBuilder.spec(spec)
  }

  public fun spec(spec: CfnMesh.MeshSpecProperty) {
    cdkBuilder.spec(spec)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnMeshProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
