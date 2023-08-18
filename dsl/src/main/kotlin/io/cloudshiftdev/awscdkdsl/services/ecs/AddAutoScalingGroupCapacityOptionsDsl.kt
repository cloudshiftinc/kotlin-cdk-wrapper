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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions
import software.amazon.awscdk.services.ecs.MachineImageType
import software.amazon.awscdk.services.kms.IKey

/**
 * The properties for adding an AutoScalingGroup.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.kms.*;
 * Key key;
 * AddAutoScalingGroupCapacityOptions addAutoScalingGroupCapacityOptions =
 * AddAutoScalingGroupCapacityOptions.builder()
 * .canContainersAccessInstanceRole(false)
 * .machineImageType(MachineImageType.AMAZON_LINUX_2)
 * .spotInstanceDraining(false)
 * .topicEncryptionKey(key)
 * .build();
 * ```
 */
@CdkDslMarker
public class AddAutoScalingGroupCapacityOptionsDsl {
    private val cdkBuilder: AddAutoScalingGroupCapacityOptions.Builder =
        AddAutoScalingGroupCapacityOptions.builder()

    /**
     * @param canContainersAccessInstanceRole Specifies whether the containers can access the
     *   container instance role.
     */
    public fun canContainersAccessInstanceRole(canContainersAccessInstanceRole: Boolean) {
        cdkBuilder.canContainersAccessInstanceRole(canContainersAccessInstanceRole)
    }

    /**
     * @param machineImageType What type of machine image this is. Depending on the setting,
     *   different UserData will automatically be added to the `AutoScalingGroup` to configure it
     *   properly for use with ECS.
     *
     * If you create an `AutoScalingGroup` yourself and are adding it via `addAutoScalingGroup()`,
     * you must specify this value. If you are adding an `autoScalingGroup` via `addCapacity`, this
     * value will be determined from the `machineImage` you pass.
     */
    public fun machineImageType(machineImageType: MachineImageType) {
        cdkBuilder.machineImageType(machineImageType)
    }

    /**
     * @param spotInstanceDraining Specify whether to enable Automated Draining for Spot Instances
     *   running Amazon ECS Services. For more information, see
     *   [Using Spot Instances](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-spot.html).
     */
    public fun spotInstanceDraining(spotInstanceDraining: Boolean) {
        cdkBuilder.spotInstanceDraining(spotInstanceDraining)
    }

    /**
     * @param topicEncryptionKey If `AddAutoScalingGroupCapacityOptions.taskDrainTime` is non-zero,
     *   then the ECS cluster creates an SNS Topic to as part of a system to drain instances of
     *   tasks when the instance is being shut down. If this property is provided, then this key
     *   will be used to encrypt the contents of that SNS Topic. See
     *   [SNS Data Encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-data-encryption.html)
     *   for more information.
     */
    public fun topicEncryptionKey(topicEncryptionKey: IKey) {
        cdkBuilder.topicEncryptionKey(topicEncryptionKey)
    }

    public fun build(): AddAutoScalingGroupCapacityOptions = cdkBuilder.build()
}
