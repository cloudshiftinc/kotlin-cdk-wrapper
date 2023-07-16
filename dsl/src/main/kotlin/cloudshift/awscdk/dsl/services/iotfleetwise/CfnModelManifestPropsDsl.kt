@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotfleetwise.CfnModelManifestProps

@CdkDslMarker
public class CfnModelManifestPropsDsl {
  private val cdkBuilder: CfnModelManifestProps.Builder = CfnModelManifestProps.builder()

  private val _nodes: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun nodes(vararg nodes: String) {
    _nodes.addAll(listOf(*nodes))
  }

  public fun nodes(nodes: Collection<String>) {
    _nodes.addAll(nodes)
  }

  public fun signalCatalogArn(signalCatalogArn: String) {
    cdkBuilder.signalCatalogArn(signalCatalogArn)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnModelManifestProps {
    if(_nodes.isNotEmpty()) cdkBuilder.nodes(_nodes)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
