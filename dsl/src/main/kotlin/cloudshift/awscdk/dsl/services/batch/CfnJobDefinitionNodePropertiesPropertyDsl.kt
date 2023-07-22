@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionNodePropertiesPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.NodePropertiesProperty.Builder =
      CfnJobDefinition.NodePropertiesProperty.builder()

  private val _nodeRangeProperties: MutableList<Any> = mutableListOf()

  /**
   * @param mainNode Specifies the node index for the main node of a multi-node parallel job. 
   * This node index value must be fewer than the number of nodes.
   */
  public fun mainNode(mainNode: Number) {
    cdkBuilder.mainNode(mainNode)
  }

  /**
   * @param nodeRangeProperties A list of node ranges and their properties that are associated with
   * a multi-node parallel job. 
   */
  public fun nodeRangeProperties(vararg nodeRangeProperties: Any) {
    _nodeRangeProperties.addAll(listOf(*nodeRangeProperties))
  }

  /**
   * @param nodeRangeProperties A list of node ranges and their properties that are associated with
   * a multi-node parallel job. 
   */
  public fun nodeRangeProperties(nodeRangeProperties: Collection<Any>) {
    _nodeRangeProperties.addAll(nodeRangeProperties)
  }

  /**
   * @param nodeRangeProperties A list of node ranges and their properties that are associated with
   * a multi-node parallel job. 
   */
  public fun nodeRangeProperties(nodeRangeProperties: IResolvable) {
    cdkBuilder.nodeRangeProperties(nodeRangeProperties)
  }

  /**
   * @param numNodes The number of nodes that are associated with a multi-node parallel job. 
   */
  public fun numNodes(numNodes: Number) {
    cdkBuilder.numNodes(numNodes)
  }

  public fun build(): CfnJobDefinition.NodePropertiesProperty {
    if(_nodeRangeProperties.isNotEmpty()) cdkBuilder.nodeRangeProperties(_nodeRangeProperties)
    return cdkBuilder.build()
  }
}
