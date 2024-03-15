@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * The options for creating an Auto Scaling Group Capacity Provider.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * LaunchTemplate launchTemplate = LaunchTemplate.Builder.create(this, "ASG-LaunchTemplate")
 * .instanceType(new InstanceType("t3.medium"))
 * .machineImage(EcsOptimizedImage.amazonLinux2())
 * .userData(UserData.forLinux())
 * .build();
 * AutoScalingGroup autoScalingGroup = AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .mixedInstancesPolicy(MixedInstancesPolicy.builder()
 * .instancesDistribution(InstancesDistribution.builder()
 * .onDemandPercentageAboveBaseCapacity(50)
 * .build())
 * .launchTemplate(launchTemplate)
 * .build())
 * .build();
 * Cluster cluster = Cluster.Builder.create(this, "Cluster").vpc(vpc).build();
 * AsgCapacityProvider capacityProvider = AsgCapacityProvider.Builder.create(this,
 * "AsgCapacityProvider")
 * .autoScalingGroup(autoScalingGroup)
 * .machineImageType(MachineImageType.AMAZON_LINUX_2)
 * .build();
 * cluster.addAsgCapacityProvider(capacityProvider);
 * ```
 */
public interface AsgCapacityProviderProps : AddAutoScalingGroupCapacityOptions {
  /**
   * The autoscaling group to add as a Capacity Provider.
   */
  public fun autoScalingGroup(): IAutoScalingGroup

  /**
   * The name of the capacity provider.
   *
   * If a name is specified,
   * it cannot start with `aws`, `ecs`, or `fargate`. If no name is specified,
   * a default name in the CFNStackName-CFNResourceName-RandomString format is used.
   * If the stack name starts with `aws`, `ecs`, or `fargate`, a unique resource name
   * is generated that starts with `cp-`.
   *
   * Default: CloudFormation-generated name
   */
  public fun capacityProviderName(): String? = unwrap(this).getCapacityProviderName()

  /**
   * Managed instance draining facilitates graceful termination of Amazon ECS instances.
   *
   * This allows your service workloads to stop safely and be rescheduled to non-terminating
   * instances.
   * Infrastructure maintenance and updates are preformed without disruptions to workloads.
   * To use managed instance draining, set enableManagedDraining to true.
   *
   * Default: true
   */
  public fun enableManagedDraining(): Boolean? = unwrap(this).getEnableManagedDraining()

  /**
   * When enabled the scale-in and scale-out actions of the cluster's Auto Scaling Group will be
   * managed for you.
   *
   * This means your cluster will automatically scale instances based on the load your tasks put on
   * the cluster.
   * For more information, see [Using Managed
   * Scaling](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/asg-capacity-providers.html#asg-capacity-providers-managed-scaling)
   * in the ECS Developer Guide.
   *
   * Default: true
   */
  public fun enableManagedScaling(): Boolean? = unwrap(this).getEnableManagedScaling()

  /**
   * When enabled the Auto Scaling Group will only terminate EC2 instances that no longer have
   * running non-daemon tasks.
   *
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
   *
   * Default: true
   */
  public fun enableManagedTerminationProtection(): Boolean? =
      unwrap(this).getEnableManagedTerminationProtection()

  /**
   * The period of time, in seconds, after a newly launched Amazon EC2 instance can contribute to
   * CloudWatch metrics for Auto Scaling group.
   *
   * Must be between 0 and 10000.
   *
   * Default: 300
   */
  public fun instanceWarmupPeriod(): Number? = unwrap(this).getInstanceWarmupPeriod()

  /**
   * Maximum scaling step size.
   *
   * In most cases this should be left alone.
   *
   * Default: 1000
   */
  public fun maximumScalingStepSize(): Number? = unwrap(this).getMaximumScalingStepSize()

  /**
   * Minimum scaling step size.
   *
   * In most cases this should be left alone.
   *
   * Default: 1
   */
  public fun minimumScalingStepSize(): Number? = unwrap(this).getMinimumScalingStepSize()

  /**
   * Target capacity percent.
   *
   * In most cases this should be left alone.
   *
   * Default: 100
   */
  public fun targetCapacityPercent(): Number? = unwrap(this).getTargetCapacityPercent()

  /**
   * A builder for [AsgCapacityProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingGroup The autoscaling group to add as a Capacity Provider. 
     */
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup)

    /**
     * @param canContainersAccessInstanceRole Specifies whether the containers can access the
     * container instance role.
     */
    public fun canContainersAccessInstanceRole(canContainersAccessInstanceRole: Boolean)

    /**
     * @param capacityProviderName The name of the capacity provider.
     * If a name is specified,
     * it cannot start with `aws`, `ecs`, or `fargate`. If no name is specified,
     * a default name in the CFNStackName-CFNResourceName-RandomString format is used.
     * If the stack name starts with `aws`, `ecs`, or `fargate`, a unique resource name
     * is generated that starts with `cp-`.
     */
    public fun capacityProviderName(capacityProviderName: String)

    /**
     * @param enableManagedDraining Managed instance draining facilitates graceful termination of
     * Amazon ECS instances.
     * This allows your service workloads to stop safely and be rescheduled to non-terminating
     * instances.
     * Infrastructure maintenance and updates are preformed without disruptions to workloads.
     * To use managed instance draining, set enableManagedDraining to true.
     */
    public fun enableManagedDraining(enableManagedDraining: Boolean)

    /**
     * @param enableManagedScaling When enabled the scale-in and scale-out actions of the cluster's
     * Auto Scaling Group will be managed for you.
     * This means your cluster will automatically scale instances based on the load your tasks put
     * on the cluster.
     * For more information, see [Using Managed
     * Scaling](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/asg-capacity-providers.html#asg-capacity-providers-managed-scaling)
     * in the ECS Developer Guide.
     */
    public fun enableManagedScaling(enableManagedScaling: Boolean)

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
    public fun enableManagedTerminationProtection(enableManagedTerminationProtection: Boolean)

    /**
     * @param instanceWarmupPeriod The period of time, in seconds, after a newly launched Amazon EC2
     * instance can contribute to CloudWatch metrics for Auto Scaling group.
     * Must be between 0 and 10000.
     */
    public fun instanceWarmupPeriod(instanceWarmupPeriod: Number)

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
    public fun machineImageType(machineImageType: MachineImageType)

    /**
     * @param maximumScalingStepSize Maximum scaling step size.
     * In most cases this should be left alone.
     */
    public fun maximumScalingStepSize(maximumScalingStepSize: Number)

    /**
     * @param minimumScalingStepSize Minimum scaling step size.
     * In most cases this should be left alone.
     */
    public fun minimumScalingStepSize(minimumScalingStepSize: Number)

    /**
     * @param spotInstanceDraining Specify whether to enable Automated Draining for Spot Instances
     * running Amazon ECS Services.
     * For more information, see [Using Spot
     * Instances](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-spot.html).
     */
    public fun spotInstanceDraining(spotInstanceDraining: Boolean)

    /**
     * @param targetCapacityPercent Target capacity percent.
     * In most cases this should be left alone.
     */
    public fun targetCapacityPercent(targetCapacityPercent: Number)

    /**
     * @param topicEncryptionKey If `AddAutoScalingGroupCapacityOptions.taskDrainTime` is non-zero,
     * then the ECS cluster creates an SNS Topic to as part of a system to drain instances of tasks
     * when the instance is being shut down. If this property is provided, then this key will be used
     * to encrypt the contents of that SNS Topic. See [SNS Data
     * Encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-data-encryption.html) for more
     * information.
     */
    public fun topicEncryptionKey(topicEncryptionKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.AsgCapacityProviderProps.Builder =
        software.amazon.awscdk.services.ecs.AsgCapacityProviderProps.builder()

    /**
     * @param autoScalingGroup The autoscaling group to add as a Capacity Provider. 
     */
    override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

    /**
     * @param canContainersAccessInstanceRole Specifies whether the containers can access the
     * container instance role.
     */
    override fun canContainersAccessInstanceRole(canContainersAccessInstanceRole: Boolean) {
      cdkBuilder.canContainersAccessInstanceRole(canContainersAccessInstanceRole)
    }

    /**
     * @param capacityProviderName The name of the capacity provider.
     * If a name is specified,
     * it cannot start with `aws`, `ecs`, or `fargate`. If no name is specified,
     * a default name in the CFNStackName-CFNResourceName-RandomString format is used.
     * If the stack name starts with `aws`, `ecs`, or `fargate`, a unique resource name
     * is generated that starts with `cp-`.
     */
    override fun capacityProviderName(capacityProviderName: String) {
      cdkBuilder.capacityProviderName(capacityProviderName)
    }

    /**
     * @param enableManagedDraining Managed instance draining facilitates graceful termination of
     * Amazon ECS instances.
     * This allows your service workloads to stop safely and be rescheduled to non-terminating
     * instances.
     * Infrastructure maintenance and updates are preformed without disruptions to workloads.
     * To use managed instance draining, set enableManagedDraining to true.
     */
    override fun enableManagedDraining(enableManagedDraining: Boolean) {
      cdkBuilder.enableManagedDraining(enableManagedDraining)
    }

    /**
     * @param enableManagedScaling When enabled the scale-in and scale-out actions of the cluster's
     * Auto Scaling Group will be managed for you.
     * This means your cluster will automatically scale instances based on the load your tasks put
     * on the cluster.
     * For more information, see [Using Managed
     * Scaling](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/asg-capacity-providers.html#asg-capacity-providers-managed-scaling)
     * in the ECS Developer Guide.
     */
    override fun enableManagedScaling(enableManagedScaling: Boolean) {
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
    override fun enableManagedTerminationProtection(enableManagedTerminationProtection: Boolean) {
      cdkBuilder.enableManagedTerminationProtection(enableManagedTerminationProtection)
    }

    /**
     * @param instanceWarmupPeriod The period of time, in seconds, after a newly launched Amazon EC2
     * instance can contribute to CloudWatch metrics for Auto Scaling group.
     * Must be between 0 and 10000.
     */
    override fun instanceWarmupPeriod(instanceWarmupPeriod: Number) {
      cdkBuilder.instanceWarmupPeriod(instanceWarmupPeriod)
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
    override fun machineImageType(machineImageType: MachineImageType) {
      cdkBuilder.machineImageType(machineImageType.let(MachineImageType::unwrap))
    }

    /**
     * @param maximumScalingStepSize Maximum scaling step size.
     * In most cases this should be left alone.
     */
    override fun maximumScalingStepSize(maximumScalingStepSize: Number) {
      cdkBuilder.maximumScalingStepSize(maximumScalingStepSize)
    }

    /**
     * @param minimumScalingStepSize Minimum scaling step size.
     * In most cases this should be left alone.
     */
    override fun minimumScalingStepSize(minimumScalingStepSize: Number) {
      cdkBuilder.minimumScalingStepSize(minimumScalingStepSize)
    }

    /**
     * @param spotInstanceDraining Specify whether to enable Automated Draining for Spot Instances
     * running Amazon ECS Services.
     * For more information, see [Using Spot
     * Instances](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-spot.html).
     */
    override fun spotInstanceDraining(spotInstanceDraining: Boolean) {
      cdkBuilder.spotInstanceDraining(spotInstanceDraining)
    }

    /**
     * @param targetCapacityPercent Target capacity percent.
     * In most cases this should be left alone.
     */
    override fun targetCapacityPercent(targetCapacityPercent: Number) {
      cdkBuilder.targetCapacityPercent(targetCapacityPercent)
    }

    /**
     * @param topicEncryptionKey If `AddAutoScalingGroupCapacityOptions.taskDrainTime` is non-zero,
     * then the ECS cluster creates an SNS Topic to as part of a system to drain instances of tasks
     * when the instance is being shut down. If this property is provided, then this key will be used
     * to encrypt the contents of that SNS Topic. See [SNS Data
     * Encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-data-encryption.html) for more
     * information.
     */
    override fun topicEncryptionKey(topicEncryptionKey: IKey) {
      cdkBuilder.topicEncryptionKey(topicEncryptionKey.let(IKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.AsgCapacityProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.AsgCapacityProviderProps,
  ) : CdkObject(cdkObject), AsgCapacityProviderProps {
    /**
     * The autoscaling group to add as a Capacity Provider.
     */
    override fun autoScalingGroup(): IAutoScalingGroup =
        unwrap(this).getAutoScalingGroup().let(IAutoScalingGroup::wrap)

    /**
     * Specifies whether the containers can access the container instance role.
     *
     * Default: false
     */
    override fun canContainersAccessInstanceRole(): Boolean? =
        unwrap(this).getCanContainersAccessInstanceRole()

    /**
     * The name of the capacity provider.
     *
     * If a name is specified,
     * it cannot start with `aws`, `ecs`, or `fargate`. If no name is specified,
     * a default name in the CFNStackName-CFNResourceName-RandomString format is used.
     * If the stack name starts with `aws`, `ecs`, or `fargate`, a unique resource name
     * is generated that starts with `cp-`.
     *
     * Default: CloudFormation-generated name
     */
    override fun capacityProviderName(): String? = unwrap(this).getCapacityProviderName()

    /**
     * Managed instance draining facilitates graceful termination of Amazon ECS instances.
     *
     * This allows your service workloads to stop safely and be rescheduled to non-terminating
     * instances.
     * Infrastructure maintenance and updates are preformed without disruptions to workloads.
     * To use managed instance draining, set enableManagedDraining to true.
     *
     * Default: true
     */
    override fun enableManagedDraining(): Boolean? = unwrap(this).getEnableManagedDraining()

    /**
     * When enabled the scale-in and scale-out actions of the cluster's Auto Scaling Group will be
     * managed for you.
     *
     * This means your cluster will automatically scale instances based on the load your tasks put
     * on the cluster.
     * For more information, see [Using Managed
     * Scaling](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/asg-capacity-providers.html#asg-capacity-providers-managed-scaling)
     * in the ECS Developer Guide.
     *
     * Default: true
     */
    override fun enableManagedScaling(): Boolean? = unwrap(this).getEnableManagedScaling()

    /**
     * When enabled the Auto Scaling Group will only terminate EC2 instances that no longer have
     * running non-daemon tasks.
     *
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
     *
     * Default: true
     */
    override fun enableManagedTerminationProtection(): Boolean? =
        unwrap(this).getEnableManagedTerminationProtection()

    /**
     * The period of time, in seconds, after a newly launched Amazon EC2 instance can contribute to
     * CloudWatch metrics for Auto Scaling group.
     *
     * Must be between 0 and 10000.
     *
     * Default: 300
     */
    override fun instanceWarmupPeriod(): Number? = unwrap(this).getInstanceWarmupPeriod()

    /**
     * What type of machine image this is.
     *
     * Depending on the setting, different UserData will automatically be added
     * to the `AutoScalingGroup` to configure it properly for use with ECS.
     *
     * If you create an `AutoScalingGroup` yourself and are adding it via
     * `addAutoScalingGroup()`, you must specify this value. If you are adding an
     * `autoScalingGroup` via `addCapacity`, this value will be determined
     * from the `machineImage` you pass.
     *
     * Default: - Automatically determined from `machineImage`, if available, otherwise
     * `MachineImageType.AMAZON_LINUX_2`.
     */
    override fun machineImageType(): MachineImageType? =
        unwrap(this).getMachineImageType()?.let(MachineImageType::wrap)

    /**
     * Maximum scaling step size.
     *
     * In most cases this should be left alone.
     *
     * Default: 1000
     */
    override fun maximumScalingStepSize(): Number? = unwrap(this).getMaximumScalingStepSize()

    /**
     * Minimum scaling step size.
     *
     * In most cases this should be left alone.
     *
     * Default: 1
     */
    override fun minimumScalingStepSize(): Number? = unwrap(this).getMinimumScalingStepSize()

    /**
     * Specify whether to enable Automated Draining for Spot Instances running Amazon ECS Services.
     *
     * For more information, see [Using Spot
     * Instances](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-spot.html).
     *
     * Default: false
     */
    override fun spotInstanceDraining(): Boolean? = unwrap(this).getSpotInstanceDraining()

    /**
     * Target capacity percent.
     *
     * In most cases this should be left alone.
     *
     * Default: 100
     */
    override fun targetCapacityPercent(): Number? = unwrap(this).getTargetCapacityPercent()

    /**
     * If `AddAutoScalingGroupCapacityOptions.taskDrainTime` is non-zero, then the ECS cluster
     * creates an SNS Topic to as part of a system to drain instances of tasks when the instance is
     * being shut down. If this property is provided, then this key will be used to encrypt the
     * contents of that SNS Topic. See [SNS Data
     * Encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-data-encryption.html) for more
     * information.
     *
     * Default: The SNS Topic will not be encrypted.
     */
    override fun topicEncryptionKey(): IKey? = unwrap(this).getTopicEncryptionKey()?.let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AsgCapacityProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AsgCapacityProviderProps):
        AsgCapacityProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AsgCapacityProviderProps):
        software.amazon.awscdk.services.ecs.AsgCapacityProviderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.AsgCapacityProviderProps
  }
}
