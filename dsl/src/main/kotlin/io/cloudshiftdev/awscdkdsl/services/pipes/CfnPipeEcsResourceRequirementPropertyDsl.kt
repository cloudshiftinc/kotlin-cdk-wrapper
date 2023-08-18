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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The type and amount of a resource to assign to a container.
 *
 * The supported resource types are GPUs and Elastic Inference accelerators. For more information,
 * see
 * [Working with GPUs on Amazon ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-gpu.html)
 * or
 * [Working with Amazon Elastic Inference on Amazon ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-inference.html)
 * in the *Amazon Elastic Container Service Developer Guide*
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * EcsResourceRequirementProperty ecsResourceRequirementProperty =
 * EcsResourceRequirementProperty.builder()
 * .type("type")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-ecsresourcerequirement.html)
 */
@CdkDslMarker
public class CfnPipeEcsResourceRequirementPropertyDsl {
    private val cdkBuilder: CfnPipe.EcsResourceRequirementProperty.Builder =
        CfnPipe.EcsResourceRequirementProperty.builder()

    /**
     * @param type The type of resource to assign to a container. The supported values are `GPU` or
     *   `InferenceAccelerator` .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param value The value for the specified resource type. If the `GPU` type is used, the value
     *   is the number of physical `GPUs` the Amazon ECS container agent reserves for the container.
     *   The number of GPUs that's reserved for all containers in a task can't exceed the number of
     *   available GPUs on the container instance that the task is launched on.
     *
     * If the `InferenceAccelerator` type is used, the `value` matches the `deviceName` for an
     * InferenceAccelerator specified in a task definition.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnPipe.EcsResourceRequirementProperty = cdkBuilder.build()
}
