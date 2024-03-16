@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.autoscaling.BlockDevice
import io.cloudshiftdev.awscdk.services.autoscaling.CommonAutoScalingGroupProps
import io.cloudshiftdev.awscdk.services.autoscaling.GroupMetrics
import io.cloudshiftdev.awscdk.services.autoscaling.HealthCheck
import io.cloudshiftdev.awscdk.services.autoscaling.Monitoring
import io.cloudshiftdev.awscdk.services.autoscaling.NotificationConfiguration
import io.cloudshiftdev.awscdk.services.autoscaling.Signals
import io.cloudshiftdev.awscdk.services.autoscaling.TerminationPolicy
import io.cloudshiftdev.awscdk.services.autoscaling.UpdatePolicy
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Options for adding worker nodes.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * cluster.addAutoScalingGroupCapacity("BottlerocketNodes",
 * AutoScalingGroupCapacityOptions.builder()
 * .instanceType(new InstanceType("t3.small"))
 * .minCapacity(2)
 * .machineImageType(MachineImageType.BOTTLEROCKET)
 * .build());
 * ```
 */
public interface AutoScalingGroupCapacityOptions : CommonAutoScalingGroupProps {
  /**
   * Configures the EC2 user-data script for instances in this autoscaling group to bootstrap the
   * node (invoke `/etc/eks/bootstrap.sh`) and associate it with the EKS cluster.
   *
   * If you wish to provide a custom user data script, set this to `false` and
   * manually invoke `autoscalingGroup.addUserData()`.
   *
   * Default: true
   */
  public fun bootstrapEnabled(): Boolean? = unwrap(this).getBootstrapEnabled()

  /**
   * EKS node bootstrapping options.
   *
   * Default: - none
   */
  public fun bootstrapOptions(): BootstrapOptions? =
      unwrap(this).getBootstrapOptions()?.let(BootstrapOptions::wrap)

  /**
   * Instance type of the instances to start.
   */
  public fun instanceType(): InstanceType

  /**
   * Machine image type.
   *
   * Default: MachineImageType.AMAZON_LINUX_2
   */
  public fun machineImageType(): MachineImageType? =
      unwrap(this).getMachineImageType()?.let(MachineImageType::wrap)

  /**
   * Will automatically update the aws-auth ConfigMap to map the IAM instance role to RBAC.
   *
   * This cannot be explicitly set to `true` if the cluster has kubectl disabled.
   *
   * Default: - true if the cluster has kubectl enabled (which is the default).
   */
  public fun mapRole(): Boolean? = unwrap(this).getMapRole()

  /**
   * Installs the AWS spot instance interrupt handler on the cluster if it's not already added.
   *
   * Only relevant if `spotPrice` is used.
   *
   * Default: true
   */
  public fun spotInterruptHandler(): Boolean? = unwrap(this).getSpotInterruptHandler()

  /**
   * A builder for [AutoScalingGroupCapacityOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowAllOutbound Whether the instances can initiate connections to anywhere by
     * default.
     */
    public fun allowAllOutbound(allowAllOutbound: Boolean)

    /**
     * @param associatePublicIpAddress Whether instances in the Auto Scaling Group should have
     * public IP addresses associated with them.
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

    /**
     * @param autoScalingGroupName The name of the Auto Scaling group.
     * This name must be unique per Region per account.
     */
    public fun autoScalingGroupName(autoScalingGroupName: String)

    /**
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     * virtual devices and EBS volumes.
     * Each instance that is launched has an associated root device volume,
     * either an Amazon EBS volume or an instance store volume.
     * You can use block device mappings to specify additional EBS volumes or
     * instance store volumes to attach to an instance when it is launched.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun blockDevices(blockDevices: List<BlockDevice>)

    /**
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     * virtual devices and EBS volumes.
     * Each instance that is launched has an associated root device volume,
     * either an Amazon EBS volume or an instance store volume.
     * You can use block device mappings to specify additional EBS volumes or
     * instance store volumes to attach to an instance when it is launched.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun blockDevices(vararg blockDevices: BlockDevice)

    /**
     * @param bootstrapEnabled Configures the EC2 user-data script for instances in this autoscaling
     * group to bootstrap the node (invoke `/etc/eks/bootstrap.sh`) and associate it with the EKS
     * cluster.
     * If you wish to provide a custom user data script, set this to `false` and
     * manually invoke `autoscalingGroup.addUserData()`.
     */
    public fun bootstrapEnabled(bootstrapEnabled: Boolean)

    /**
     * @param bootstrapOptions EKS node bootstrapping options.
     */
    public fun bootstrapOptions(bootstrapOptions: BootstrapOptions)

    /**
     * @param bootstrapOptions EKS node bootstrapping options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16bbfd1d17568d71038199fead41572160614552b82e21f3e7a8b3e40212b939")
    public fun bootstrapOptions(bootstrapOptions: BootstrapOptions.Builder.() -> Unit)

    /**
     * @param capacityRebalance Indicates whether Capacity Rebalancing is enabled.
     * When you turn on Capacity Rebalancing, Amazon EC2 Auto Scaling
     * attempts to launch a Spot Instance whenever Amazon EC2 notifies that a Spot Instance is at an
     * elevated risk of
     * interruption. After launching a new instance, it then terminates an old instance.
     */
    public fun capacityRebalance(capacityRebalance: Boolean)

    /**
     * @param cooldown Default scaling cooldown for this AutoScalingGroup.
     */
    public fun cooldown(cooldown: Duration)

    /**
     * @param defaultInstanceWarmup The amount of time, in seconds, until a newly launched instance
     * can contribute to the Amazon CloudWatch metrics.
     * This delay lets an instance finish initializing before Amazon EC2 Auto Scaling aggregates
     * instance metrics,
     * resulting in more reliable usage data. Set this value equal to the amount of time that it
     * takes for resource
     * consumption to become stable after an instance reaches the InService state.
     *
     * To optimize the performance of scaling policies that scale continuously, such as target
     * tracking and
     * step scaling policies, we strongly recommend that you enable the default instance warmup,
     * even if its value is set to 0 seconds
     *
     * Default instance warmup will not be added if no value is specified
     */
    public fun defaultInstanceWarmup(defaultInstanceWarmup: Duration)

    /**
     * @param desiredCapacity Initial amount of instances in the fleet.
     * If this is set to a number, every deployment will reset the amount of
     * instances to this number. It is recommended to leave this value blank.
     */
    public fun desiredCapacity(desiredCapacity: Number)

    /**
     * @param groupMetrics Enable monitoring for group metrics, these metrics describe the group
     * rather than any of its instances.
     * To report all group metrics use `GroupMetrics.all()`
     * Group metrics are reported in a granularity of 1 minute at no additional charge.
     */
    public fun groupMetrics(groupMetrics: List<GroupMetrics>)

    /**
     * @param groupMetrics Enable monitoring for group metrics, these metrics describe the group
     * rather than any of its instances.
     * To report all group metrics use `GroupMetrics.all()`
     * Group metrics are reported in a granularity of 1 minute at no additional charge.
     */
    public fun groupMetrics(vararg groupMetrics: GroupMetrics)

    /**
     * @param healthCheck Configuration for health checks.
     */
    public fun healthCheck(healthCheck: HealthCheck)

    /**
     * @param ignoreUnmodifiedSizeProperties If the ASG has scheduled actions, don't reset unchanged
     * group sizes.
     * Only used if the ASG has scheduled actions (which may scale your ASG up
     * or down regardless of cdk deployments). If true, the size of the group
     * will only be reset if it has been changed in the CDK app. If false, the
     * sizes will always be changed back to what they were in the CDK app
     * on deployment.
     */
    public fun ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties: Boolean)

    /**
     * @param instanceMonitoring Controls whether instances in this group are launched with detailed
     * or basic monitoring.
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and
     * your account
     * is charged a fee. When you disable detailed monitoring, CloudWatch generates metrics every 5
     * minutes.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun instanceMonitoring(instanceMonitoring: Monitoring)

    /**
     * @param instanceType Instance type of the instances to start. 
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * @param keyName Name of SSH keypair to grant access to instances.
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun keyName(keyName: String)

    /**
     * @param machineImageType Machine image type.
     */
    public fun machineImageType(machineImageType: MachineImageType)

    /**
     * @param mapRole Will automatically update the aws-auth ConfigMap to map the IAM instance role
     * to RBAC.
     * This cannot be explicitly set to `true` if the cluster has kubectl disabled.
     */
    public fun mapRole(mapRole: Boolean)

    /**
     * @param maxCapacity Maximum number of instances in the fleet.
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * @param maxInstanceLifetime The maximum amount of time that an instance can be in service.
     * The maximum duration applies
     * to all current and future instances in the group. As an instance approaches its maximum
     * duration,
     * it is terminated and replaced, and cannot be used again.
     *
     * You must specify a value of at least 604,800 seconds (7 days). To clear a previously set
     * value,
     * leave this property undefined.
     */
    public fun maxInstanceLifetime(maxInstanceLifetime: Duration)

    /**
     * @param minCapacity Minimum number of instances in the fleet.
     */
    public fun minCapacity(minCapacity: Number)

    /**
     * @param newInstancesProtectedFromScaleIn Whether newly-launched instances are protected from
     * termination by Amazon EC2 Auto Scaling when scaling in.
     * By default, Auto Scaling can terminate an instance at any time after launch
     * when scaling in an Auto Scaling Group, subject to the group's termination
     * policy. However, you may wish to protect newly-launched instances from
     * being scaled in if they are going to run critical applications that should
     * not be prematurely terminated.
     *
     * This flag must be enabled if the Auto Scaling Group will be associated with
     * an ECS Capacity Provider with managed termination protection.
     */
    public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean)

    /**
     * @param notifications Configure autoscaling group to send notifications about fleet changes to
     * an SNS topic(s).
     */
    public fun notifications(notifications: List<NotificationConfiguration>)

    /**
     * @param notifications Configure autoscaling group to send notifications about fleet changes to
     * an SNS topic(s).
     */
    public fun notifications(vararg notifications: NotificationConfiguration)

    /**
     * @param signals Configure waiting for signals during deployment.
     * Use this to pause the CloudFormation deployment to wait for the instances
     * in the AutoScalingGroup to report successful startup during
     * creation and updates. The UserData script needs to invoke `cfn-signal`
     * with a success or failure code after it is done setting up the instance.
     *
     * Without waiting for signals, the CloudFormation deployment will proceed as
     * soon as the AutoScalingGroup has been created or updated but before the
     * instances in the group have been started.
     *
     * For example, to have instances wait for an Elastic Load Balancing health check before
     * they signal success, add a health-check verification by using the
     * cfn-init helper script. For an example, see the verify_instance_health
     * command in the Auto Scaling rolling updates sample template:
     *
     * https://github.com/awslabs/aws-cloudformation-templates/blob/master/aws/services/AutoScaling/AutoScalingRollingUpdates.yaml
     */
    public fun signals(signals: Signals)

    /**
     * @param spotInterruptHandler Installs the AWS spot instance interrupt handler on the cluster
     * if it's not already added.
     * Only relevant if `spotPrice` is used.
     */
    public fun spotInterruptHandler(spotInterruptHandler: Boolean)

    /**
     * @param spotPrice The maximum hourly price (in USD) to be paid for any Spot Instance launched
     * to fulfill the request.
     * Spot Instances are
     * launched when the price you specify exceeds the current Spot market price.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun spotPrice(spotPrice: String)

    /**
     * @param ssmSessionPermissions Add SSM session permissions to the instance role.
     * Setting this to `true` adds the necessary permissions to connect
     * to the instance using SSM Session Manager. You can do this
     * from the AWS Console.
     *
     * NOTE: Setting this flag to `true` may not be enough by itself.
     * You must also use an AMI that comes with the SSM Agent, or install
     * the SSM Agent yourself. See
     * [Working with SSM
     * Agent](https://docs.aws.amazon.com/systems-manager/latest/userguide/ssm-agent.html)
     * in the SSM Developer Guide.
     */
    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean)

    /**
     * @param terminationPolicies A policy or a list of policies that are used to select the
     * instances to terminate.
     * The policies are executed in the order that you list them.
     */
    public fun terminationPolicies(terminationPolicies: List<TerminationPolicy>)

    /**
     * @param terminationPolicies A policy or a list of policies that are used to select the
     * instances to terminate.
     * The policies are executed in the order that you list them.
     */
    public fun terminationPolicies(vararg terminationPolicies: TerminationPolicy)

    /**
     * @param terminationPolicyCustomLambdaFunctionArn A lambda function Arn that can be used as a
     * custom termination policy to select the instances to terminate.
     * This property must be specified if the TerminationPolicy.CUSTOM_LAMBDA_FUNCTION
     * is used.
     */
    public
        fun terminationPolicyCustomLambdaFunctionArn(terminationPolicyCustomLambdaFunctionArn: String)

    /**
     * @param updatePolicy What to do when an AutoScalingGroup's instance configuration is changed.
     * This is applied when any of the settings on the ASG are changed that
     * affect how the instances should be created (VPC, instance type, startup
     * scripts, etc.). It indicates how the existing instances should be
     * replaced with new instances matching the new config. By default, nothing
     * is done and only new instances are launched with the new config.
     */
    public fun updatePolicy(updatePolicy: UpdatePolicy)

    /**
     * @param vpcSubnets Where to place instances within the VPC.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Where to place instances within the VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15bd6af97ee0184a977f596807810ef3c8b8f2df76c3366fcdd60141c1ac68d1")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.eks.AutoScalingGroupCapacityOptions.Builder =
        software.amazon.awscdk.services.eks.AutoScalingGroupCapacityOptions.builder()

    /**
     * @param allowAllOutbound Whether the instances can initiate connections to anywhere by
     * default.
     */
    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /**
     * @param associatePublicIpAddress Whether instances in the Auto Scaling Group should have
     * public IP addresses associated with them.
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    /**
     * @param autoScalingGroupName The name of the Auto Scaling group.
     * This name must be unique per Region per account.
     */
    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    /**
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     * virtual devices and EBS volumes.
     * Each instance that is launched has an associated root device volume,
     * either an Amazon EBS volume or an instance store volume.
     * You can use block device mappings to specify additional EBS volumes or
     * instance store volumes to attach to an instance when it is launched.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    override fun blockDevices(blockDevices: List<BlockDevice>) {
      cdkBuilder.blockDevices(blockDevices.map(BlockDevice::unwrap))
    }

    /**
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     * virtual devices and EBS volumes.
     * Each instance that is launched has an associated root device volume,
     * either an Amazon EBS volume or an instance store volume.
     * You can use block device mappings to specify additional EBS volumes or
     * instance store volumes to attach to an instance when it is launched.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    override fun blockDevices(vararg blockDevices: BlockDevice): Unit =
        blockDevices(blockDevices.toList())

    /**
     * @param bootstrapEnabled Configures the EC2 user-data script for instances in this autoscaling
     * group to bootstrap the node (invoke `/etc/eks/bootstrap.sh`) and associate it with the EKS
     * cluster.
     * If you wish to provide a custom user data script, set this to `false` and
     * manually invoke `autoscalingGroup.addUserData()`.
     */
    override fun bootstrapEnabled(bootstrapEnabled: Boolean) {
      cdkBuilder.bootstrapEnabled(bootstrapEnabled)
    }

    /**
     * @param bootstrapOptions EKS node bootstrapping options.
     */
    override fun bootstrapOptions(bootstrapOptions: BootstrapOptions) {
      cdkBuilder.bootstrapOptions(bootstrapOptions.let(BootstrapOptions::unwrap))
    }

    /**
     * @param bootstrapOptions EKS node bootstrapping options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16bbfd1d17568d71038199fead41572160614552b82e21f3e7a8b3e40212b939")
    override fun bootstrapOptions(bootstrapOptions: BootstrapOptions.Builder.() -> Unit): Unit =
        bootstrapOptions(BootstrapOptions(bootstrapOptions))

    /**
     * @param capacityRebalance Indicates whether Capacity Rebalancing is enabled.
     * When you turn on Capacity Rebalancing, Amazon EC2 Auto Scaling
     * attempts to launch a Spot Instance whenever Amazon EC2 notifies that a Spot Instance is at an
     * elevated risk of
     * interruption. After launching a new instance, it then terminates an old instance.
     */
    override fun capacityRebalance(capacityRebalance: Boolean) {
      cdkBuilder.capacityRebalance(capacityRebalance)
    }

    /**
     * @param cooldown Default scaling cooldown for this AutoScalingGroup.
     */
    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    /**
     * @param defaultInstanceWarmup The amount of time, in seconds, until a newly launched instance
     * can contribute to the Amazon CloudWatch metrics.
     * This delay lets an instance finish initializing before Amazon EC2 Auto Scaling aggregates
     * instance metrics,
     * resulting in more reliable usage data. Set this value equal to the amount of time that it
     * takes for resource
     * consumption to become stable after an instance reaches the InService state.
     *
     * To optimize the performance of scaling policies that scale continuously, such as target
     * tracking and
     * step scaling policies, we strongly recommend that you enable the default instance warmup,
     * even if its value is set to 0 seconds
     *
     * Default instance warmup will not be added if no value is specified
     */
    override fun defaultInstanceWarmup(defaultInstanceWarmup: Duration) {
      cdkBuilder.defaultInstanceWarmup(defaultInstanceWarmup.let(Duration::unwrap))
    }

    /**
     * @param desiredCapacity Initial amount of instances in the fleet.
     * If this is set to a number, every deployment will reset the amount of
     * instances to this number. It is recommended to leave this value blank.
     */
    override fun desiredCapacity(desiredCapacity: Number) {
      cdkBuilder.desiredCapacity(desiredCapacity)
    }

    /**
     * @param groupMetrics Enable monitoring for group metrics, these metrics describe the group
     * rather than any of its instances.
     * To report all group metrics use `GroupMetrics.all()`
     * Group metrics are reported in a granularity of 1 minute at no additional charge.
     */
    override fun groupMetrics(groupMetrics: List<GroupMetrics>) {
      cdkBuilder.groupMetrics(groupMetrics.map(GroupMetrics::unwrap))
    }

    /**
     * @param groupMetrics Enable monitoring for group metrics, these metrics describe the group
     * rather than any of its instances.
     * To report all group metrics use `GroupMetrics.all()`
     * Group metrics are reported in a granularity of 1 minute at no additional charge.
     */
    override fun groupMetrics(vararg groupMetrics: GroupMetrics): Unit =
        groupMetrics(groupMetrics.toList())

    /**
     * @param healthCheck Configuration for health checks.
     */
    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    /**
     * @param ignoreUnmodifiedSizeProperties If the ASG has scheduled actions, don't reset unchanged
     * group sizes.
     * Only used if the ASG has scheduled actions (which may scale your ASG up
     * or down regardless of cdk deployments). If true, the size of the group
     * will only be reset if it has been changed in the CDK app. If false, the
     * sizes will always be changed back to what they were in the CDK app
     * on deployment.
     */
    override fun ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties: Boolean) {
      cdkBuilder.ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties)
    }

    /**
     * @param instanceMonitoring Controls whether instances in this group are launched with detailed
     * or basic monitoring.
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and
     * your account
     * is charged a fee. When you disable detailed monitoring, CloudWatch generates metrics every 5
     * minutes.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    override fun instanceMonitoring(instanceMonitoring: Monitoring) {
      cdkBuilder.instanceMonitoring(instanceMonitoring.let(Monitoring::unwrap))
    }

    /**
     * @param instanceType Instance type of the instances to start. 
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    /**
     * @param keyName Name of SSH keypair to grant access to instances.
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    /**
     * @param machineImageType Machine image type.
     */
    override fun machineImageType(machineImageType: MachineImageType) {
      cdkBuilder.machineImageType(machineImageType.let(MachineImageType::unwrap))
    }

    /**
     * @param mapRole Will automatically update the aws-auth ConfigMap to map the IAM instance role
     * to RBAC.
     * This cannot be explicitly set to `true` if the cluster has kubectl disabled.
     */
    override fun mapRole(mapRole: Boolean) {
      cdkBuilder.mapRole(mapRole)
    }

    /**
     * @param maxCapacity Maximum number of instances in the fleet.
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param maxInstanceLifetime The maximum amount of time that an instance can be in service.
     * The maximum duration applies
     * to all current and future instances in the group. As an instance approaches its maximum
     * duration,
     * it is terminated and replaced, and cannot be used again.
     *
     * You must specify a value of at least 604,800 seconds (7 days). To clear a previously set
     * value,
     * leave this property undefined.
     */
    override fun maxInstanceLifetime(maxInstanceLifetime: Duration) {
      cdkBuilder.maxInstanceLifetime(maxInstanceLifetime.let(Duration::unwrap))
    }

    /**
     * @param minCapacity Minimum number of instances in the fleet.
     */
    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * @param newInstancesProtectedFromScaleIn Whether newly-launched instances are protected from
     * termination by Amazon EC2 Auto Scaling when scaling in.
     * By default, Auto Scaling can terminate an instance at any time after launch
     * when scaling in an Auto Scaling Group, subject to the group's termination
     * policy. However, you may wish to protect newly-launched instances from
     * being scaled in if they are going to run critical applications that should
     * not be prematurely terminated.
     *
     * This flag must be enabled if the Auto Scaling Group will be associated with
     * an ECS Capacity Provider with managed termination protection.
     */
    override fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean) {
      cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn)
    }

    /**
     * @param notifications Configure autoscaling group to send notifications about fleet changes to
     * an SNS topic(s).
     */
    override fun notifications(notifications: List<NotificationConfiguration>) {
      cdkBuilder.notifications(notifications.map(NotificationConfiguration::unwrap))
    }

    /**
     * @param notifications Configure autoscaling group to send notifications about fleet changes to
     * an SNS topic(s).
     */
    override fun notifications(vararg notifications: NotificationConfiguration): Unit =
        notifications(notifications.toList())

    /**
     * @param signals Configure waiting for signals during deployment.
     * Use this to pause the CloudFormation deployment to wait for the instances
     * in the AutoScalingGroup to report successful startup during
     * creation and updates. The UserData script needs to invoke `cfn-signal`
     * with a success or failure code after it is done setting up the instance.
     *
     * Without waiting for signals, the CloudFormation deployment will proceed as
     * soon as the AutoScalingGroup has been created or updated but before the
     * instances in the group have been started.
     *
     * For example, to have instances wait for an Elastic Load Balancing health check before
     * they signal success, add a health-check verification by using the
     * cfn-init helper script. For an example, see the verify_instance_health
     * command in the Auto Scaling rolling updates sample template:
     *
     * https://github.com/awslabs/aws-cloudformation-templates/blob/master/aws/services/AutoScaling/AutoScalingRollingUpdates.yaml
     */
    override fun signals(signals: Signals) {
      cdkBuilder.signals(signals.let(Signals::unwrap))
    }

    /**
     * @param spotInterruptHandler Installs the AWS spot instance interrupt handler on the cluster
     * if it's not already added.
     * Only relevant if `spotPrice` is used.
     */
    override fun spotInterruptHandler(spotInterruptHandler: Boolean) {
      cdkBuilder.spotInterruptHandler(spotInterruptHandler)
    }

    /**
     * @param spotPrice The maximum hourly price (in USD) to be paid for any Spot Instance launched
     * to fulfill the request.
     * Spot Instances are
     * launched when the price you specify exceeds the current Spot market price.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    override fun spotPrice(spotPrice: String) {
      cdkBuilder.spotPrice(spotPrice)
    }

    /**
     * @param ssmSessionPermissions Add SSM session permissions to the instance role.
     * Setting this to `true` adds the necessary permissions to connect
     * to the instance using SSM Session Manager. You can do this
     * from the AWS Console.
     *
     * NOTE: Setting this flag to `true` may not be enough by itself.
     * You must also use an AMI that comes with the SSM Agent, or install
     * the SSM Agent yourself. See
     * [Working with SSM
     * Agent](https://docs.aws.amazon.com/systems-manager/latest/userguide/ssm-agent.html)
     * in the SSM Developer Guide.
     */
    override fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
      cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    /**
     * @param terminationPolicies A policy or a list of policies that are used to select the
     * instances to terminate.
     * The policies are executed in the order that you list them.
     */
    override fun terminationPolicies(terminationPolicies: List<TerminationPolicy>) {
      cdkBuilder.terminationPolicies(terminationPolicies.map(TerminationPolicy::unwrap))
    }

    /**
     * @param terminationPolicies A policy or a list of policies that are used to select the
     * instances to terminate.
     * The policies are executed in the order that you list them.
     */
    override fun terminationPolicies(vararg terminationPolicies: TerminationPolicy): Unit =
        terminationPolicies(terminationPolicies.toList())

    /**
     * @param terminationPolicyCustomLambdaFunctionArn A lambda function Arn that can be used as a
     * custom termination policy to select the instances to terminate.
     * This property must be specified if the TerminationPolicy.CUSTOM_LAMBDA_FUNCTION
     * is used.
     */
    override
        fun terminationPolicyCustomLambdaFunctionArn(terminationPolicyCustomLambdaFunctionArn: String) {
      cdkBuilder.terminationPolicyCustomLambdaFunctionArn(terminationPolicyCustomLambdaFunctionArn)
    }

    /**
     * @param updatePolicy What to do when an AutoScalingGroup's instance configuration is changed.
     * This is applied when any of the settings on the ASG are changed that
     * affect how the instances should be created (VPC, instance type, startup
     * scripts, etc.). It indicates how the existing instances should be
     * replaced with new instances matching the new config. By default, nothing
     * is done and only new instances are launched with the new config.
     */
    override fun updatePolicy(updatePolicy: UpdatePolicy) {
      cdkBuilder.updatePolicy(updatePolicy.let(UpdatePolicy::unwrap))
    }

    /**
     * @param vpcSubnets Where to place instances within the VPC.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets Where to place instances within the VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15bd6af97ee0184a977f596807810ef3c8b8f2df76c3366fcdd60141c1ac68d1")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.eks.AutoScalingGroupCapacityOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.AutoScalingGroupCapacityOptions,
  ) : CdkObject(cdkObject), AutoScalingGroupCapacityOptions {
    /**
     * Whether the instances can initiate connections to anywhere by default.
     *
     * Default: true
     */
    override fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

    /**
     * Whether instances in the Auto Scaling Group should have public IP addresses associated with
     * them.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     *
     * Default: - Use subnet setting.
     */
    override fun associatePublicIpAddress(): Boolean? = unwrap(this).getAssociatePublicIpAddress()

    /**
     * The name of the Auto Scaling group.
     *
     * This name must be unique per Region per account.
     *
     * Default: - Auto generated by CloudFormation
     */
    override fun autoScalingGroupName(): String? = unwrap(this).getAutoScalingGroupName()

    /**
     * Specifies how block devices are exposed to the instance. You can specify virtual devices and
     * EBS volumes.
     *
     * Each instance that is launched has an associated root device volume,
     * either an Amazon EBS volume or an instance store volume.
     * You can use block device mappings to specify additional EBS volumes or
     * instance store volumes to attach to an instance when it is launched.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     *
     * Default: - Uses the block device mapping of the AMI
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     */
    override fun blockDevices(): List<BlockDevice> =
        unwrap(this).getBlockDevices()?.map(BlockDevice::wrap) ?: emptyList()

    /**
     * Configures the EC2 user-data script for instances in this autoscaling group to bootstrap the
     * node (invoke `/etc/eks/bootstrap.sh`) and associate it with the EKS cluster.
     *
     * If you wish to provide a custom user data script, set this to `false` and
     * manually invoke `autoscalingGroup.addUserData()`.
     *
     * Default: true
     */
    override fun bootstrapEnabled(): Boolean? = unwrap(this).getBootstrapEnabled()

    /**
     * EKS node bootstrapping options.
     *
     * Default: - none
     */
    override fun bootstrapOptions(): BootstrapOptions? =
        unwrap(this).getBootstrapOptions()?.let(BootstrapOptions::wrap)

    /**
     * Indicates whether Capacity Rebalancing is enabled.
     *
     * When you turn on Capacity Rebalancing, Amazon EC2 Auto Scaling
     * attempts to launch a Spot Instance whenever Amazon EC2 notifies that a Spot Instance is at an
     * elevated risk of
     * interruption. After launching a new instance, it then terminates an old instance.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-capacityrebalance)
     */
    override fun capacityRebalance(): Boolean? = unwrap(this).getCapacityRebalance()

    /**
     * Default scaling cooldown for this AutoScalingGroup.
     *
     * Default: Duration.minutes(5)
     */
    override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    /**
     * The amount of time, in seconds, until a newly launched instance can contribute to the Amazon
     * CloudWatch metrics.
     *
     * This delay lets an instance finish initializing before Amazon EC2 Auto Scaling aggregates
     * instance metrics,
     * resulting in more reliable usage data. Set this value equal to the amount of time that it
     * takes for resource
     * consumption to become stable after an instance reaches the InService state.
     *
     * To optimize the performance of scaling policies that scale continuously, such as target
     * tracking and
     * step scaling policies, we strongly recommend that you enable the default instance warmup,
     * even if its value is set to 0 seconds
     *
     * Default instance warmup will not be added if no value is specified
     *
     * Default: None
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-default-instance-warmup.html)
     */
    override fun defaultInstanceWarmup(): Duration? =
        unwrap(this).getDefaultInstanceWarmup()?.let(Duration::wrap)

    /**
     * Initial amount of instances in the fleet.
     *
     * If this is set to a number, every deployment will reset the amount of
     * instances to this number. It is recommended to leave this value blank.
     *
     * Default: minCapacity, and leave unchanged during deployment
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-desiredcapacity)
     */
    override fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

    /**
     * Enable monitoring for group metrics, these metrics describe the group rather than any of its
     * instances.
     *
     * To report all group metrics use `GroupMetrics.all()`
     * Group metrics are reported in a granularity of 1 minute at no additional charge.
     *
     * Default: - no group metrics will be reported
     */
    override fun groupMetrics(): List<GroupMetrics> =
        unwrap(this).getGroupMetrics()?.map(GroupMetrics::wrap) ?: emptyList()

    /**
     * Configuration for health checks.
     *
     * Default: - HealthCheck.ec2 with no grace period
     */
    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    /**
     * If the ASG has scheduled actions, don't reset unchanged group sizes.
     *
     * Only used if the ASG has scheduled actions (which may scale your ASG up
     * or down regardless of cdk deployments). If true, the size of the group
     * will only be reset if it has been changed in the CDK app. If false, the
     * sizes will always be changed back to what they were in the CDK app
     * on deployment.
     *
     * Default: true
     */
    override fun ignoreUnmodifiedSizeProperties(): Boolean? =
        unwrap(this).getIgnoreUnmodifiedSizeProperties()

    /**
     * Controls whether instances in this group are launched with detailed or basic monitoring.
     *
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and
     * your account
     * is charged a fee. When you disable detailed monitoring, CloudWatch generates metrics every 5
     * minutes.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     *
     * Default: - Monitoring.DETAILED
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics)
     */
    override fun instanceMonitoring(): Monitoring? =
        unwrap(this).getInstanceMonitoring()?.let(Monitoring::wrap)

    /**
     * Instance type of the instances to start.
     */
    override fun instanceType(): InstanceType =
        unwrap(this).getInstanceType().let(InstanceType::wrap)

    /**
     * Name of SSH keypair to grant access to instances.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     *
     * Default: - No SSH access will be possible.
     */
    override fun keyName(): String? = unwrap(this).getKeyName()

    /**
     * Machine image type.
     *
     * Default: MachineImageType.AMAZON_LINUX_2
     */
    override fun machineImageType(): MachineImageType? =
        unwrap(this).getMachineImageType()?.let(MachineImageType::wrap)

    /**
     * Will automatically update the aws-auth ConfigMap to map the IAM instance role to RBAC.
     *
     * This cannot be explicitly set to `true` if the cluster has kubectl disabled.
     *
     * Default: - true if the cluster has kubectl enabled (which is the default).
     */
    override fun mapRole(): Boolean? = unwrap(this).getMapRole()

    /**
     * Maximum number of instances in the fleet.
     *
     * Default: desiredCapacity
     */
    override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    /**
     * The maximum amount of time that an instance can be in service.
     *
     * The maximum duration applies
     * to all current and future instances in the group. As an instance approaches its maximum
     * duration,
     * it is terminated and replaced, and cannot be used again.
     *
     * You must specify a value of at least 604,800 seconds (7 days). To clear a previously set
     * value,
     * leave this property undefined.
     *
     * Default: none
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html)
     */
    override fun maxInstanceLifetime(): Duration? =
        unwrap(this).getMaxInstanceLifetime()?.let(Duration::wrap)

    /**
     * Minimum number of instances in the fleet.
     *
     * Default: 1
     */
    override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    /**
     * Whether newly-launched instances are protected from termination by Amazon EC2 Auto Scaling
     * when scaling in.
     *
     * By default, Auto Scaling can terminate an instance at any time after launch
     * when scaling in an Auto Scaling Group, subject to the group's termination
     * policy. However, you may wish to protect newly-launched instances from
     * being scaled in if they are going to run critical applications that should
     * not be prematurely terminated.
     *
     * This flag must be enabled if the Auto Scaling Group will be associated with
     * an ECS Capacity Provider with managed termination protection.
     *
     * Default: false
     */
    override fun newInstancesProtectedFromScaleIn(): Boolean? =
        unwrap(this).getNewInstancesProtectedFromScaleIn()

    /**
     * Configure autoscaling group to send notifications about fleet changes to an SNS topic(s).
     *
     * Default: - No fleet change notifications will be sent.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations)
     */
    override fun notifications(): List<NotificationConfiguration> =
        unwrap(this).getNotifications()?.map(NotificationConfiguration::wrap) ?: emptyList()

    /**
     * Configure waiting for signals during deployment.
     *
     * Use this to pause the CloudFormation deployment to wait for the instances
     * in the AutoScalingGroup to report successful startup during
     * creation and updates. The UserData script needs to invoke `cfn-signal`
     * with a success or failure code after it is done setting up the instance.
     *
     * Without waiting for signals, the CloudFormation deployment will proceed as
     * soon as the AutoScalingGroup has been created or updated but before the
     * instances in the group have been started.
     *
     * For example, to have instances wait for an Elastic Load Balancing health check before
     * they signal success, add a health-check verification by using the
     * cfn-init helper script. For an example, see the verify_instance_health
     * command in the Auto Scaling rolling updates sample template:
     *
     * https://github.com/awslabs/aws-cloudformation-templates/blob/master/aws/services/AutoScaling/AutoScalingRollingUpdates.yaml
     *
     * Default: - Do not wait for signals
     */
    override fun signals(): Signals? = unwrap(this).getSignals()?.let(Signals::wrap)

    /**
     * Installs the AWS spot instance interrupt handler on the cluster if it's not already added.
     *
     * Only relevant if `spotPrice` is used.
     *
     * Default: true
     */
    override fun spotInterruptHandler(): Boolean? = unwrap(this).getSpotInterruptHandler()

    /**
     * The maximum hourly price (in USD) to be paid for any Spot Instance launched to fulfill the
     * request.
     *
     * Spot Instances are
     * launched when the price you specify exceeds the current Spot market price.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     *
     * Default: none
     */
    override fun spotPrice(): String? = unwrap(this).getSpotPrice()

    /**
     * Add SSM session permissions to the instance role.
     *
     * Setting this to `true` adds the necessary permissions to connect
     * to the instance using SSM Session Manager. You can do this
     * from the AWS Console.
     *
     * NOTE: Setting this flag to `true` may not be enough by itself.
     * You must also use an AMI that comes with the SSM Agent, or install
     * the SSM Agent yourself. See
     * [Working with SSM
     * Agent](https://docs.aws.amazon.com/systems-manager/latest/userguide/ssm-agent.html)
     * in the SSM Developer Guide.
     *
     * Default: false
     */
    override fun ssmSessionPermissions(): Boolean? = unwrap(this).getSsmSessionPermissions()

    /**
     * A policy or a list of policies that are used to select the instances to terminate.
     *
     * The policies are executed in the order that you list them.
     *
     * Default: - `TerminationPolicy.DEFAULT`
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html)
     */
    override fun terminationPolicies(): List<TerminationPolicy> =
        unwrap(this).getTerminationPolicies()?.map(TerminationPolicy::wrap) ?: emptyList()

    /**
     * A lambda function Arn that can be used as a custom termination policy to select the instances
     * to terminate.
     *
     * This property must be specified if the TerminationPolicy.CUSTOM_LAMBDA_FUNCTION
     * is used.
     *
     * Default: - No lambda function Arn will be supplied
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/lambda-custom-termination-policy.html)
     */
    override fun terminationPolicyCustomLambdaFunctionArn(): String? =
        unwrap(this).getTerminationPolicyCustomLambdaFunctionArn()

    /**
     * What to do when an AutoScalingGroup's instance configuration is changed.
     *
     * This is applied when any of the settings on the ASG are changed that
     * affect how the instances should be created (VPC, instance type, startup
     * scripts, etc.). It indicates how the existing instances should be
     * replaced with new instances matching the new config. By default, nothing
     * is done and only new instances are launched with the new config.
     *
     * Default: - `UpdatePolicy.rollingUpdate()` if using `init`, `UpdatePolicy.none()` otherwise
     */
    override fun updatePolicy(): UpdatePolicy? =
        unwrap(this).getUpdatePolicy()?.let(UpdatePolicy::wrap)

    /**
     * Where to place instances within the VPC.
     *
     * Default: - All Private subnets.
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingGroupCapacityOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.eks.AutoScalingGroupCapacityOptions):
        AutoScalingGroupCapacityOptions = CdkObjectWrappers.wrap(cdkObject) as
        AutoScalingGroupCapacityOptions

    internal fun unwrap(wrapped: AutoScalingGroupCapacityOptions):
        software.amazon.awscdk.services.eks.AutoScalingGroupCapacityOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.AutoScalingGroupCapacityOptions
  }
}
