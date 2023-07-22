@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.stepfunctions.tasks.EcsLaunchTargetConfig

@CdkDslMarker
public class EcsLaunchTargetConfigDsl {
  private val cdkBuilder: EcsLaunchTargetConfig.Builder = EcsLaunchTargetConfig.builder()

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

  public fun build(): EcsLaunchTargetConfig = cdkBuilder.build()
}
