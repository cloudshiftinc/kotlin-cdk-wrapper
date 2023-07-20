@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions
import software.amazon.awscdk.services.ecs.MachineImageType
import software.amazon.awscdk.services.kms.IKey
import kotlin.Boolean

@CdkDslMarker
public class AddAutoScalingGroupCapacityOptionsDsl {
    private val cdkBuilder: AddAutoScalingGroupCapacityOptions.Builder =
        AddAutoScalingGroupCapacityOptions.builder()

    public fun canContainersAccessInstanceRole(canContainersAccessInstanceRole: Boolean) {
        cdkBuilder.canContainersAccessInstanceRole(canContainersAccessInstanceRole)
    }

    public fun machineImageType(machineImageType: MachineImageType) {
        cdkBuilder.machineImageType(machineImageType)
    }

    public fun spotInstanceDraining(spotInstanceDraining: Boolean) {
        cdkBuilder.spotInstanceDraining(spotInstanceDraining)
    }

    public fun topicEncryptionKey(topicEncryptionKey: IKey) {
        cdkBuilder.topicEncryptionKey(topicEncryptionKey)
    }

    public fun build(): AddAutoScalingGroupCapacityOptions = cdkBuilder.build()
}
