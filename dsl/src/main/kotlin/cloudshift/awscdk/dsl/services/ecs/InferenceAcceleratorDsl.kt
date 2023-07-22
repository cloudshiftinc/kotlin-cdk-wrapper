@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.InferenceAccelerator

/**
 * Elastic Inference Accelerator.
 *
 * For more information, see [Elastic Inference
 * Basics](https://docs.aws.amazon.com/elastic-inference/latest/developerguide/basics.html)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * InferenceAccelerator inferenceAccelerator = InferenceAccelerator.builder()
 * .deviceName("deviceName")
 * .deviceType("deviceType")
 * .build();
 * ```
 */
@CdkDslMarker
public class InferenceAcceleratorDsl {
  private val cdkBuilder: InferenceAccelerator.Builder = InferenceAccelerator.builder()

  /**
   * @param deviceName The Elastic Inference accelerator device name.
   */
  public fun deviceName(deviceName: String) {
    cdkBuilder.deviceName(deviceName)
  }

  /**
   * @param deviceType The Elastic Inference accelerator type to use.
   * The allowed values are: eia2.medium, eia2.large and eia2.xlarge.
   */
  public fun deviceType(deviceType: String) {
    cdkBuilder.deviceType(deviceType)
  }

  public fun build(): InferenceAccelerator = cdkBuilder.build()
}
