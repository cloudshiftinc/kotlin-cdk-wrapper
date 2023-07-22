@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeEcsResourceRequirementPropertyDsl {
  private val cdkBuilder: CfnPipe.EcsResourceRequirementProperty.Builder =
      CfnPipe.EcsResourceRequirementProperty.builder()

  /**
   * @param type The type of resource to assign to a container. 
   * The supported values are `GPU` or `InferenceAccelerator` .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param value The value for the specified resource type. 
   * If the `GPU` type is used, the value is the number of physical `GPUs` the Amazon ECS container
   * agent reserves for the container. The number of GPUs that's reserved for all containers in a task
   * can't exceed the number of available GPUs on the container instance that the task is launched on.
   *
   * If the `InferenceAccelerator` type is used, the `value` matches the `deviceName` for an
   * InferenceAccelerator specified in a task definition.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnPipe.EcsResourceRequirementProperty = cdkBuilder.build()
}
