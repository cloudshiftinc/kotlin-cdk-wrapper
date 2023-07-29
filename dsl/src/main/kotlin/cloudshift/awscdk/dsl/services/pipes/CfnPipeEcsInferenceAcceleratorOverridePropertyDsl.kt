@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * Details on an Elastic Inference accelerator task override.
 *
 * This parameter is used to override the Elastic Inference accelerator specified in the task
 * definition. For more information, see
 * [Working with Amazon Elastic Inference on Amazon ECS](https://docs.aws.amazon.com/AmazonECS/latest/userguide/ecs-inference.html)
 * in the *Amazon Elastic Container Service Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * EcsInferenceAcceleratorOverrideProperty ecsInferenceAcceleratorOverrideProperty =
 * EcsInferenceAcceleratorOverrideProperty.builder()
 * .deviceName("deviceName")
 * .deviceType("deviceType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsinferenceacceleratoroverride.html)
 */
@CdkDslMarker
public class CfnPipeEcsInferenceAcceleratorOverridePropertyDsl {
    private val cdkBuilder: CfnPipe.EcsInferenceAcceleratorOverrideProperty.Builder =
        CfnPipe.EcsInferenceAcceleratorOverrideProperty.builder()

    /**
     * @param deviceName The Elastic Inference accelerator device name to override for the task.
     *   This parameter must match a `deviceName` specified in the task definition.
     */
    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    /** @param deviceType The Elastic Inference accelerator type to use. */
    public fun deviceType(deviceType: String) {
        cdkBuilder.deviceType(deviceType)
    }

    public fun build(): CfnPipe.EcsInferenceAcceleratorOverrideProperty = cdkBuilder.build()
}
