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

  /**
   * @param parameters Additional parameters to pass to the base task.
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * @param parameters Additional parameters to pass to the base task.
   */
  public fun parameters(parameters: Map<String, Any>) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): ContainerDefinitionConfig = cdkBuilder.build()
}
