@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.ecs.AsgCapacityProviderProps
import software.amazon.awscdk.services.ecs.MachineImageType
import software.amazon.awscdk.services.kms.IKey

@CdkDslMarker
public class AsgCapacityProviderPropsDsl {
  private val cdkBuilder: AsgCapacityProviderProps.Builder = AsgCapacityProviderProps.builder()

  public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
    cdkBuilder.autoScalingGroup(autoScalingGroup)
  }

  public fun canContainersAccessInstanceRole(canContainersAccessInstanceRole: Boolean) {
    cdkBuilder.canContainersAccessInstanceRole(canContainersAccessInstanceRole)
  }

  public fun capacityProviderName(capacityProviderName: String) {
    cdkBuilder.capacityProviderName(capacityProviderName)
  }

  public fun enableManagedScaling(enableManagedScaling: Boolean) {
    cdkBuilder.enableManagedScaling(enableManagedScaling)
  }

  public fun enableManagedTerminationProtection(enableManagedTerminationProtection: Boolean) {
    cdkBuilder.enableManagedTerminationProtection(enableManagedTerminationProtection)
  }

  public fun machineImageType(machineImageType: MachineImageType) {
    cdkBuilder.machineImageType(machineImageType)
  }

  public fun maximumScalingStepSize(maximumScalingStepSize: Number) {
    cdkBuilder.maximumScalingStepSize(maximumScalingStepSize)
  }

  public fun minimumScalingStepSize(minimumScalingStepSize: Number) {
    cdkBuilder.minimumScalingStepSize(minimumScalingStepSize)
  }

  public fun spotInstanceDraining(spotInstanceDraining: Boolean) {
    cdkBuilder.spotInstanceDraining(spotInstanceDraining)
  }

  public fun targetCapacityPercent(targetCapacityPercent: Number) {
    cdkBuilder.targetCapacityPercent(targetCapacityPercent)
  }

  public fun topicEncryptionKey(topicEncryptionKey: IKey) {
    cdkBuilder.topicEncryptionKey(topicEncryptionKey)
  }

  public fun build(): AsgCapacityProviderProps = cdkBuilder.build()
}
