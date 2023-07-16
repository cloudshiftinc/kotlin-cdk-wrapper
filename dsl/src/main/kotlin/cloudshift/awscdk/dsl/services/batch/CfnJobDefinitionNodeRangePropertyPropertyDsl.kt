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

  public fun container(container: IResolvable) {
    cdkBuilder.container(container)
  }

  public fun container(container: CfnJobDefinition.ContainerPropertiesProperty) {
    cdkBuilder.container(container)
  }

  public fun targetNodes(targetNodes: String) {
    cdkBuilder.targetNodes(targetNodes)
  }

  public fun build(): CfnJobDefinition.NodeRangePropertyProperty = cdkBuilder.build()
}
