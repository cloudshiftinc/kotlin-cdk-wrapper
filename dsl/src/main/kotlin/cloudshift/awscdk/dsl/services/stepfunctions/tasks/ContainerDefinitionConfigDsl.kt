@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionConfig

@CdkDslMarker
public class ContainerDefinitionConfigDsl {
  private val cdkBuilder: ContainerDefinitionConfig.Builder = ContainerDefinitionConfig.builder()

  public fun parameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.parameters(builder.map)
  }

  public fun parameters(parameters: Map<String, Any>) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): ContainerDefinitionConfig = cdkBuilder.build()
}
