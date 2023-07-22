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

  /**
   * @param description (Optional) A brief description of the signal catalog.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name (Optional) The name of the signal catalog.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param nodeCounts (Optional) Information about the number of nodes and node types in a vehicle
   * network.
   */
  public fun nodeCounts(nodeCounts: IResolvable) {
    cdkBuilder.nodeCounts(nodeCounts)
  }

  /**
   * @param nodeCounts (Optional) Information about the number of nodes and node types in a vehicle
   * network.
   */
  public fun nodeCounts(nodeCounts: CfnSignalCatalog.NodeCountsProperty) {
    cdkBuilder.nodeCounts(nodeCounts)
  }

  /**
   * @param nodes (Optional) A list of information about nodes, which are a general abstraction of
   * signals.
   */
  public fun nodes(vararg nodes: Any) {
    _nodes.addAll(listOf(*nodes))
  }

  /**
   * @param nodes (Optional) A list of information about nodes, which are a general abstraction of
   * signals.
   */
  public fun nodes(nodes: Collection<Any>) {
    _nodes.addAll(nodes)
  }

  /**
   * @param nodes (Optional) A list of information about nodes, which are a general abstraction of
   * signals.
   */
  public fun nodes(nodes: IResolvable) {
    cdkBuilder.nodes(nodes)
  }

  /**
   * @param tags (Optional) Metadata that can be used to manage the signal catalog.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags (Optional) Metadata that can be used to manage the signal catalog.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnSignalCatalogProps {
    if(_nodes.isNotEmpty()) cdkBuilder.nodes(_nodes)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
