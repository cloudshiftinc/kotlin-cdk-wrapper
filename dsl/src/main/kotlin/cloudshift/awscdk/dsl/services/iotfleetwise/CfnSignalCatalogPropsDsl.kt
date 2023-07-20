@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps

@CdkDslMarker
public class CfnSignalCatalogPropsDsl {
  private val cdkBuilder: CfnSignalCatalogProps.Builder = CfnSignalCatalogProps.builder()

  private val _nodes: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun nodeCounts(nodeCounts: IResolvable) {
    cdkBuilder.nodeCounts(nodeCounts)
  }

  public fun nodeCounts(nodeCounts: CfnSignalCatalog.NodeCountsProperty) {
    cdkBuilder.nodeCounts(nodeCounts)
  }

  public fun nodes(vararg nodes: Any) {
    _nodes.addAll(listOf(*nodes))
  }

  public fun nodes(nodes: Collection<Any>) {
    _nodes.addAll(nodes)
  }

  public fun nodes(nodes: IResolvable) {
    cdkBuilder.nodes(nodes)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnSignalCatalogProps {
    if(_nodes.isNotEmpty()) cdkBuilder.nodes(_nodes)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
