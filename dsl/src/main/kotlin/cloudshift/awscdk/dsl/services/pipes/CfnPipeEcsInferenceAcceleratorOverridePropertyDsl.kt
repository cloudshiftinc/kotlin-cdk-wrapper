@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeEcsInferenceAcceleratorOverridePropertyDsl {
  private val cdkBuilder: CfnPipe.EcsInferenceAcceleratorOverrideProperty.Builder =
      CfnPipe.EcsInferenceAcceleratorOverrideProperty.builder()

  /**
   * @param deviceName The Elastic Inference accelerator device name to override for the task.
   * This parameter must match a `deviceName` specified in the task definition.
   */
  public fun deviceName(deviceName: String) {
    cdkBuilder.deviceName(deviceName)
  }

  /**
   * @param deviceType The Elastic Inference accelerator type to use.
   */
  public fun deviceType(deviceType: String) {
    cdkBuilder.deviceType(deviceType)
  }

  public fun build(): CfnPipe.EcsInferenceAcceleratorOverrideProperty = cdkBuilder.build()
}
