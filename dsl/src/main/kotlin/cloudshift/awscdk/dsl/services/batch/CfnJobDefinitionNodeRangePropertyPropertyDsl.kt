@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionNodeRangePropertyPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.NodeRangePropertyProperty.Builder =
      CfnJobDefinition.NodeRangePropertyProperty.builder()

  /**
   * @param container The container details for the node range.
   */
  public fun container(container: IResolvable) {
    cdkBuilder.container(container)
  }

  /**
   * @param container The container details for the node range.
   */
  public fun container(container: CfnJobDefinition.ContainerPropertiesProperty) {
    cdkBuilder.container(container)
  }

  /**
   * @param targetNodes The range of nodes, using node index values. 
   * A range of `0:3` indicates nodes with index values of `0` through `3` . If the starting range
   * value is omitted ( `:n` ), then `0` is used to start the range. If the ending range value is
   * omitted ( `n:` ), then the highest possible node index is used to end the range. Your accumulative
   * node ranges must account for all nodes ( `0:n` ). You can nest node ranges (for example, `0:10`
   * and `4:5` ). In this case, the `4:5` range properties override the `0:10` properties.
   */
  public fun targetNodes(targetNodes: String) {
    cdkBuilder.targetNodes(targetNodes)
  }

  public fun build(): CfnJobDefinition.NodeRangePropertyProperty = cdkBuilder.build()
}
