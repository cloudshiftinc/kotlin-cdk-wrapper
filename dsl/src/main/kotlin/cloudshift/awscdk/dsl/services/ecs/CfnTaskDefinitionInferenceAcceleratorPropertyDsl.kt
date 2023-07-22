@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * Details on an Elastic Inference accelerator.
 *
 * For more information, see [Working with Amazon Elastic Inference on Amazon
 * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-inference.html) in the *Amazon
 * Elastic Container Service Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * InferenceAcceleratorProperty inferenceAcceleratorProperty =
 * InferenceAcceleratorProperty.builder()
 * .deviceName("deviceName")
 * .deviceType("deviceType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-inferenceaccelerator.html)
 */
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
