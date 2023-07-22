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

  /**
   * @param autoScalingGroup The autoscaling group to add as a Capacity Provider. 
   */
  public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
    cdkBuilder.autoScalingGroup(autoScalingGroup)
  }

  /**
   * @param canContainersAccessInstanceRole Specifies whether the containers can access the
   * container instance role.
   */
  public fun canContainersAccessInstanceRole(canContainersAccessInstanceRole: Boolean) {
    cdkBuilder.canContainersAccessInstanceRole(canContainersAccessInstanceRole)
  }

  /**
   * @param capacityProviderName The name of the capacity provider.
   * If a name is specified,
   * it cannot start with `aws`, `ecs`, or `fargate`. If no name is specified,
   * a default name in the CFNStackName-CFNResourceName-RandomString format is used.
   */
  public fun capacityProviderName(capacityProviderName: String) {
    cdkBuilder.capacityProviderName(capacityProviderName)
  }

  /**
   * @param enableManagedScaling When enabled the scale-in and scale-out actions of the cluster's
   * Auto Scaling Group will be managed for you.
   * This means your cluster will automatically scale instances based on the load your tasks put on
   * the cluster.
   * For more information, see [Using Managed
   * Scaling](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/asg-capacity-providers.html#asg-capacity-providers-managed-scaling)
   * in the ECS Developer Guide.
   */
  public fun enableManagedScaling(enableManagedScaling: Boolean) {
    cdkBuilder.enableManagedScaling(enableManagedScaling)
  }

  /**
   * @param enableManagedTerminationProtection When enabled the Auto Scaling Group will only
   * terminate EC2 instances that no longer have running non-daemon tasks.
   * Scale-in protection will be automatically enabled on instances. When all non-daemon tasks are
   * stopped on an instance, ECS initiates the scale-in process and turns off scale-in protection
   * for the
   * instance. The Auto Scaling Group can then terminate the instance. For more information see <a
   * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-auto-scaling.html#managed-termination-protection">Managed
   * termination
   * protection</a>
   * in the ECS Developer Guide.
   *
   * Managed scaling must also be enabled.
   */
  public fun enableManagedTerminationProtection(enableManagedTerminationProtection: Boolean) {
    cdkBuilder.enableManagedTerminationProtection(enableManagedTerminationProtection)
  }

  /**
   * @param machineImageType What type of machine image this is.
   * Depending on the setting, different UserData will automatically be added
   * to the `AutoScalingGroup` to configure it properly for use with ECS.
   *
   * If you create an `AutoScalingGroup` yourself and are adding it via
   * `addAutoScalingGroup()`, you must specify this value. If you are adding an
   * `autoScalingGroup` via `addCapacity`, this value will be determined
   * from the `machineImage` you pass.
   */
  public fun machineImageType(machineImageType: MachineImageType) {
    cdkBuilder.machineImageType(machineImageType)
  }

  /**
   * @param maximumScalingStepSize Maximum scaling step size.
   * In most cases this should be left alone.
   */
  public fun maximumScalingStepSize(maximumScalingStepSize: Number) {
    cdkBuilder.maximumScalingStepSize(maximumScalingStepSize)
  }

  /**
   * @param minimumScalingStepSize Minimum scaling step size.
   * In most cases this should be left alone.
   */
  public fun minimumScalingStepSize(minimumScalingStepSize: Number) {
    cdkBuilder.minimumScalingStepSize(minimumScalingStepSize)
  }

  /**
   * @param spotInstanceDraining Specify whether to enable Automated Draining for Spot Instances
   * running Amazon ECS Services.
   * For more information, see [Using Spot
   * Instances](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-spot.html).
   */
  public fun spotInstanceDraining(spotInstanceDraining: Boolean) {
    cdkBuilder.spotInstanceDraining(spotInstanceDraining)
  }

  /**
   * @param targetCapacityPercent Target capacity percent.
   * In most cases this should be left alone.
   */
  public fun targetCapacityPercent(targetCapacityPercent: Number) {
    cdkBuilder.targetCapacityPercent(targetCapacityPercent)
  }

  /**
   * @param topicEncryptionKey If `AddAutoScalingGroupCapacityOptions.taskDrainTime` is non-zero,
   * then the ECS cluster creates an SNS Topic to as part of a system to drain instances of tasks when
   * the instance is being shut down. If this property is provided, then this key will be used to
   * encrypt the contents of that SNS Topic. See [SNS Data
   * Encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-data-encryption.html) for more
   * information.
   */
  public fun topicEncryptionKey(topicEncryptionKey: IKey) {
    cdkBuilder.topicEncryptionKey(topicEncryptionKey)
  }

  public fun build(): AsgCapacityProviderProps = cdkBuilder.build()
}
