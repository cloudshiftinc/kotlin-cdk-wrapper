@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.autoscaling.AutoScalingGroup
import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An Auto Scaling Group Capacity Provider.
 *
 * This allows an ECS cluster to target
 * a specific EC2 Auto Scaling Group for the placement of tasks. Optionally (and
 * recommended), ECS can manage the number of instances in the ASG to fit the
 * tasks, and can ensure that instances are not prematurely terminated while
 * there are still tasks running on them.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * Cluster cluster = Cluster.Builder.create(this, "Cluster")
 * .vpc(vpc)
 * .build();
 * // Either add default capacity
 * cluster.addCapacity("DefaultAutoScalingGroupCapacity", AddCapacityOptions.builder()
 * .instanceType(new InstanceType("t2.xlarge"))
 * .desiredCapacity(3)
 * .build());
 * // Or add customized capacity. Be sure to start the Amazon ECS-optimized AMI.
 * AutoScalingGroup autoScalingGroup = AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .instanceType(new InstanceType("t2.xlarge"))
 * .machineImage(EcsOptimizedImage.amazonLinux())
 * // Or use Amazon ECS-Optimized Amazon Linux 2 AMI
 * // machineImage: EcsOptimizedImage.amazonLinux2(),
 * .desiredCapacity(3)
 * .build();
 * AsgCapacityProvider capacityProvider = AsgCapacityProvider.Builder.create(this,
 * "AsgCapacityProvider")
 * .autoScalingGroup(autoScalingGroup)
 * .build();
 * cluster.addAsgCapacityProvider(capacityProvider);
 * ```
 */
public open class AsgCapacityProvider internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.AsgCapacityProvider,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AsgCapacityProviderProps,
  ) :
      this(software.amazon.awscdk.services.ecs.AsgCapacityProvider(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(AsgCapacityProviderProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AsgCapacityProviderProps.Builder.() -> Unit,
  ) : this(scope, id, AsgCapacityProviderProps(props)
  )

  /**
   * Auto Scaling Group.
   */
  public open fun autoScalingGroup(): AutoScalingGroup =
      unwrap(this).getAutoScalingGroup().let(AutoScalingGroup::wrap)

  /**
   * Specifies whether the containers can access the container instance role.
   *
   * Default: false
   */
  public open fun canContainersAccessInstanceRole(): Boolean? =
      unwrap(this).getCanContainersAccessInstanceRole()

  /**
   * Capacity provider name.
   *
   * Default: Chosen by CloudFormation
   */
  public open fun capacityProviderName(): String = unwrap(this).getCapacityProviderName()

  /**
   * Whether managed draining is enabled.
   */
  public open fun enableManagedDraining(): Boolean? = unwrap(this).getEnableManagedDraining()

  /**
   * Whether managed termination protection is enabled.
   */
  public open fun enableManagedTerminationProtection(): Boolean? =
      unwrap(this).getEnableManagedTerminationProtection()

  /**
   * Auto Scaling Group machineImageType.
   */
  public open fun machineImageType(): MachineImageType =
      unwrap(this).getMachineImageType().let(MachineImageType::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.AsgCapacityProvider].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The autoscaling group to add as a Capacity Provider.
     *
     * @param autoScalingGroup The autoscaling group to add as a Capacity Provider. 
     */
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup)

    /**
     * Specifies whether the containers can access the container instance role.
     *
     * Default: false
     *
     * @param canContainersAccessInstanceRole Specifies whether the containers can access the
     * container instance role. 
     */
    public fun canContainersAccessInstanceRole(canContainersAccessInstanceRole: Boolean)

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
     *
     * @param capacityProviderName The name of the capacity provider. 
     */
    public fun capacityProviderName(capacityProviderName: String)

    /**
     * Managed instance draining facilitates graceful termination of Amazon ECS instances.
     *
     * This allows your service workloads to stop safely and be rescheduled to non-terminating
     * instances.
     * Infrastructure maintenance and updates are preformed without disruptions to workloads.
     * To use managed instance draining, set enableManagedDraining to true.
     *
     * Default: true
     *
     * @param enableManagedDraining Managed instance draining facilitates graceful termination of
     * Amazon ECS instances. 
     */
    public fun enableManagedDraining(enableManagedDraining: Boolean)

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
     *
     * @param enableManagedScaling When enabled the scale-in and scale-out actions of the cluster's
     * Auto Scaling Group will be managed for you. 
     */
    public fun enableManagedScaling(enableManagedScaling: Boolean)

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
     *
     * @param enableManagedTerminationProtection When enabled the Auto Scaling Group will only
     * terminate EC2 instances that no longer have running non-daemon tasks. 
     */
    public fun enableManagedTerminationProtection(enableManagedTerminationProtection: Boolean)

    /**
     * The period of time, in seconds, after a newly launched Amazon EC2 instance can contribute to
     * CloudWatch metrics for Auto Scaling group.
     *
     * Must be between 0 and 10000.
     *
     * Default: 300
     *
     * @param instanceWarmupPeriod The period of time, in seconds, after a newly launched Amazon EC2
     * instance can contribute to CloudWatch metrics for Auto Scaling group. 
     */
    public fun instanceWarmupPeriod(instanceWarmupPeriod: Number)

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
     *
     * @param machineImageType What type of machine image this is. 
     */
    public fun machineImageType(machineImageType: MachineImageType)

    /**
     * Maximum scaling step size.
     *
     * In most cases this should be left alone.
     *
     * Default: 1000
     *
     * @param maximumScalingStepSize Maximum scaling step size. 
     */
    public fun maximumScalingStepSize(maximumScalingStepSize: Number)

    /**
     * Minimum scaling step size.
     *
     * In most cases this should be left alone.
     *
     * Default: 1
     *
     * @param minimumScalingStepSize Minimum scaling step size. 
     */
    public fun minimumScalingStepSize(minimumScalingStepSize: Number)

    /**
     * Specify whether to enable Automated Draining for Spot Instances running Amazon ECS Services.
     *
     * For more information, see [Using Spot
     * Instances](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-spot.html).
     *
     * Default: false
     *
     * @param spotInstanceDraining Specify whether to enable Automated Draining for Spot Instances
     * running Amazon ECS Services. 
     */
    public fun spotInstanceDraining(spotInstanceDraining: Boolean)

    /**
     * Target capacity percent.
     *
     * In most cases this should be left alone.
     *
     * Default: 100
     *
     * @param targetCapacityPercent Target capacity percent. 
     */
    public fun targetCapacityPercent(targetCapacityPercent: Number)

    /**
     * If `AddAutoScalingGroupCapacityOptions.taskDrainTime` is non-zero, then the ECS cluster
     * creates an SNS Topic to as part of a system to drain instances of tasks when the instance is
     * being shut down. If this property is provided, then this key will be used to encrypt the
     * contents of that SNS Topic. See [SNS Data
     * Encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-data-encryption.html) for more
     * information.
     *
     * Default: The SNS Topic will not be encrypted.
     *
     * @param topicEncryptionKey If `AddAutoScalingGroupCapacityOptions.taskDrainTime` is non-zero,
     * then the ECS cluster creates an SNS Topic to as part of a system to drain instances of tasks
     * when the instance is being shut down. If this property is provided, then this key will be used
     * to encrypt the contents of that SNS Topic. See [SNS Data
     * Encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-data-encryption.html) for more
     * information. 
     */
    public fun topicEncryptionKey(topicEncryptionKey: IKey)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.AsgCapacityProvider.Builder =
        software.amazon.awscdk.services.ecs.AsgCapacityProvider.Builder.create(scope, id)

    /**
     * The autoscaling group to add as a Capacity Provider.
     *
     * @param autoScalingGroup The autoscaling group to add as a Capacity Provider. 
     */
    override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

    /**
     * Specifies whether the containers can access the container instance role.
     *
     * Default: false
     *
     * @param canContainersAccessInstanceRole Specifies whether the containers can access the
     * container instance role. 
     */
    override fun canContainersAccessInstanceRole(canContainersAccessInstanceRole: Boolean) {
      cdkBuilder.canContainersAccessInstanceRole(canContainersAccessInstanceRole)
    }

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
     *
     * @param capacityProviderName The name of the capacity provider. 
     */
    override fun capacityProviderName(capacityProviderName: String) {
      cdkBuilder.capacityProviderName(capacityProviderName)
    }

    /**
     * Managed instance draining facilitates graceful termination of Amazon ECS instances.
     *
     * This allows your service workloads to stop safely and be rescheduled to non-terminating
     * instances.
     * Infrastructure maintenance and updates are preformed without disruptions to workloads.
     * To use managed instance draining, set enableManagedDraining to true.
     *
     * Default: true
     *
     * @param enableManagedDraining Managed instance draining facilitates graceful termination of
     * Amazon ECS instances. 
     */
    override fun enableManagedDraining(enableManagedDraining: Boolean) {
      cdkBuilder.enableManagedDraining(enableManagedDraining)
    }

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
     *
     * @param enableManagedScaling When enabled the scale-in and scale-out actions of the cluster's
     * Auto Scaling Group will be managed for you. 
     */
    override fun enableManagedScaling(enableManagedScaling: Boolean) {
      cdkBuilder.enableManagedScaling(enableManagedScaling)
    }

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
     *
     * @param enableManagedTerminationProtection When enabled the Auto Scaling Group will only
     * terminate EC2 instances that no longer have running non-daemon tasks. 
     */
    override fun enableManagedTerminationProtection(enableManagedTerminationProtection: Boolean) {
      cdkBuilder.enableManagedTerminationProtection(enableManagedTerminationProtection)
    }

    /**
     * The period of time, in seconds, after a newly launched Amazon EC2 instance can contribute to
     * CloudWatch metrics for Auto Scaling group.
     *
     * Must be between 0 and 10000.
     *
     * Default: 300
     *
     * @param instanceWarmupPeriod The period of time, in seconds, after a newly launched Amazon EC2
     * instance can contribute to CloudWatch metrics for Auto Scaling group. 
     */
    override fun instanceWarmupPeriod(instanceWarmupPeriod: Number) {
      cdkBuilder.instanceWarmupPeriod(instanceWarmupPeriod)
    }

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
     *
     * @param machineImageType What type of machine image this is. 
     */
    override fun machineImageType(machineImageType: MachineImageType) {
      cdkBuilder.machineImageType(machineImageType.let(MachineImageType::unwrap))
    }

    /**
     * Maximum scaling step size.
     *
     * In most cases this should be left alone.
     *
     * Default: 1000
     *
     * @param maximumScalingStepSize Maximum scaling step size. 
     */
    override fun maximumScalingStepSize(maximumScalingStepSize: Number) {
      cdkBuilder.maximumScalingStepSize(maximumScalingStepSize)
    }

    /**
     * Minimum scaling step size.
     *
     * In most cases this should be left alone.
     *
     * Default: 1
     *
     * @param minimumScalingStepSize Minimum scaling step size. 
     */
    override fun minimumScalingStepSize(minimumScalingStepSize: Number) {
      cdkBuilder.minimumScalingStepSize(minimumScalingStepSize)
    }

    /**
     * Specify whether to enable Automated Draining for Spot Instances running Amazon ECS Services.
     *
     * For more information, see [Using Spot
     * Instances](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-spot.html).
     *
     * Default: false
     *
     * @param spotInstanceDraining Specify whether to enable Automated Draining for Spot Instances
     * running Amazon ECS Services. 
     */
    override fun spotInstanceDraining(spotInstanceDraining: Boolean) {
      cdkBuilder.spotInstanceDraining(spotInstanceDraining)
    }

    /**
     * Target capacity percent.
     *
     * In most cases this should be left alone.
     *
     * Default: 100
     *
     * @param targetCapacityPercent Target capacity percent. 
     */
    override fun targetCapacityPercent(targetCapacityPercent: Number) {
      cdkBuilder.targetCapacityPercent(targetCapacityPercent)
    }

    /**
     * If `AddAutoScalingGroupCapacityOptions.taskDrainTime` is non-zero, then the ECS cluster
     * creates an SNS Topic to as part of a system to drain instances of tasks when the instance is
     * being shut down. If this property is provided, then this key will be used to encrypt the
     * contents of that SNS Topic. See [SNS Data
     * Encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-data-encryption.html) for more
     * information.
     *
     * Default: The SNS Topic will not be encrypted.
     *
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

    public fun build(): software.amazon.awscdk.services.ecs.AsgCapacityProvider = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AsgCapacityProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AsgCapacityProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AsgCapacityProvider):
        AsgCapacityProvider = AsgCapacityProvider(cdkObject)

    internal fun unwrap(wrapped: AsgCapacityProvider):
        software.amazon.awscdk.services.ecs.AsgCapacityProvider = wrapped.cdkObject
  }
}
