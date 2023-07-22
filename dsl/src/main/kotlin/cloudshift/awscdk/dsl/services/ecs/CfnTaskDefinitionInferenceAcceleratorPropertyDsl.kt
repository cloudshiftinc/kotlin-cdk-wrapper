@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionInferenceAcceleratorPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.InferenceAcceleratorProperty.Builder =
      CfnTaskDefinition.InferenceAcceleratorProperty.builder()

  /**
   * @param deviceName The Elastic Inference accelerator device name.
   * The `deviceName` must also be referenced in a container definition as a
   * [ResourceRequirement](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ResourceRequirement.html)
   * .
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

  public fun build(): CfnTaskDefinition.InferenceAcceleratorProperty = cdkBuilder.build()
}
