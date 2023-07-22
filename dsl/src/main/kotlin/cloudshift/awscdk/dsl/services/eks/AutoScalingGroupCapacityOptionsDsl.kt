@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.autoscaling.BlockDeviceDsl
import cloudshift.awscdk.dsl.services.autoscaling.NotificationConfigurationDsl
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.BlockDevice
import software.amazon.awscdk.services.autoscaling.GroupMetrics
import software.amazon.awscdk.services.autoscaling.HealthCheck
import software.amazon.awscdk.services.autoscaling.Monitoring
import software.amazon.awscdk.services.autoscaling.NotificationConfiguration
import software.amazon.awscdk.services.autoscaling.Signals
import software.amazon.awscdk.services.autoscaling.TerminationPolicy
import software.amazon.awscdk.services.autoscaling.UpdatePolicy
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.eks.AutoScalingGroupCapacityOptions
import software.amazon.awscdk.services.eks.BootstrapOptions
import software.amazon.awscdk.services.eks.MachineImageType

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
@CdkDslMarker
public class AutoScalingGroupCapacityOptionsDsl {
  private val cdkBuilder: AutoScalingGroupCapacityOptions.Builder =
      AutoScalingGroupCapacityOptions.builder()

  private val _blockDevices: MutableList<BlockDevice> = mutableListOf()

  private val _groupMetrics: MutableList<GroupMetrics> = mutableListOf()

  private val _notifications: MutableList<NotificationConfiguration> = mutableListOf()

  private val _terminationPolicies: MutableList<TerminationPolicy> = mutableListOf()

  /**
   * @param allowAllOutbound Whether the instances can initiate connections to anywhere by default.
   */
  public fun allowAllOutbound(allowAllOutbound: Boolean) {
    cdkBuilder.allowAllOutbound(allowAllOutbound)
  }

  /**
   * @param associatePublicIpAddress Whether instances in the Auto Scaling Group should have public
   * IP addresses associated with them.
   * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
   * specified
   */
  public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
    cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
  }

  /**
   * @param autoScalingGroupName The name of the Auto Scaling group.
   * This name must be unique per Region per account.
   */
  public fun autoScalingGroupName(autoScalingGroupName: String) {
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
  public fun blockDevices(blockDevices: BlockDeviceDsl.() -> Unit) {
    _blockDevices.add(BlockDeviceDsl().apply(blockDevices).build())
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
  public fun blockDevices(blockDevices: Collection<BlockDevice>) {
    _blockDevices.addAll(blockDevices)
  }

  /**
   * @param bootstrapEnabled Configures the EC2 user-data script for instances in this autoscaling
   * group to bootstrap the node (invoke `/etc/eks/bootstrap.sh`) and associate it with the EKS
   * cluster.
   * If you wish to provide a custom user data script, set this to `false` and
   * manually invoke `autoscalingGroup.addUserData()`.
   */
  public fun bootstrapEnabled(bootstrapEnabled: Boolean) {
    cdkBuilder.bootstrapEnabled(bootstrapEnabled)
  }

  /**
   * @param bootstrapOptions EKS node bootstrapping options.
   */
  public fun bootstrapOptions(bootstrapOptions: BootstrapOptionsDsl.() -> Unit = {}) {
    val builder = BootstrapOptionsDsl()
    builder.apply(bootstrapOptions)
    cdkBuilder.bootstrapOptions(builder.build())
  }

  /**
   * @param bootstrapOptions EKS node bootstrapping options.
   */
  public fun bootstrapOptions(bootstrapOptions: BootstrapOptions) {
    cdkBuilder.bootstrapOptions(bootstrapOptions)
  }

  /**
   * @param capacityRebalance Indicates whether Capacity Rebalancing is enabled.
   * When you turn on Capacity Rebalancing, Amazon EC2 Auto Scaling
   * attempts to launch a Spot Instance whenever Amazon EC2 notifies that a Spot Instance is at an
   * elevated risk of
   * interruption. After launching a new instance, it then terminates an old instance.
   */
  public fun capacityRebalance(capacityRebalance: Boolean) {
    cdkBuilder.capacityRebalance(capacityRebalance)
  }

  /**
   * @param cooldown Default scaling cooldown for this AutoScalingGroup.
   */
  public fun cooldown(cooldown: Duration) {
    cdkBuilder.cooldown(cooldown)
  }

  /**
   * @param defaultInstanceWarmup The amount of time, in seconds, until a newly launched instance
   * can contribute to the Amazon CloudWatch metrics.
   * This delay lets an instance finish initializing before Amazon EC2 Auto Scaling aggregates
   * instance metrics,
   * resulting in more reliable usage data. Set this value equal to the amount of time that it takes
   * for resource
   * consumption to become stable after an instance reaches the InService state.
   *
   * To optimize the performance of scaling policies that scale continuously, such as target
   * tracking and
   * step scaling policies, we strongly recommend that you enable the default instance warmup, even
   * if its value is set to 0 seconds
   *
   * Default instance warmup will not be added if no value is specified
   */
  public fun defaultInstanceWarmup(defaultInstanceWarmup: Duration) {
    cdkBuilder.defaultInstanceWarmup(defaultInstanceWarmup)
  }

  /**
   * @param desiredCapacity Initial amount of instances in the fleet.
   * If this is set to a number, every deployment will reset the amount of
   * instances to this number. It is recommended to leave this value blank.
   */
  public fun desiredCapacity(desiredCapacity: Number) {
    cdkBuilder.desiredCapacity(desiredCapacity)
  }

  /**
   * @param groupMetrics Enable monitoring for group metrics, these metrics describe the group
   * rather than any of its instances.
   * To report all group metrics use `GroupMetrics.all()`
   * Group metrics are reported in a granularity of 1 minute at no additional charge.
   */
  public fun groupMetrics(vararg groupMetrics: GroupMetrics) {
    _groupMetrics.addAll(listOf(*groupMetrics))
  }

  /**
   * @param groupMetrics Enable monitoring for group metrics, these metrics describe the group
   * rather than any of its instances.
   * To report all group metrics use `GroupMetrics.all()`
   * Group metrics are reported in a granularity of 1 minute at no additional charge.
   */
  public fun groupMetrics(groupMetrics: Collection<GroupMetrics>) {
    _groupMetrics.addAll(groupMetrics)
  }

  /**
   * @param healthCheck Configuration for health checks.
   */
  public fun healthCheck(healthCheck: HealthCheck) {
    cdkBuilder.healthCheck(healthCheck)
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
  public fun ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties: Boolean) {
    cdkBuilder.ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties)
  }

  /**
   * @param instanceMonitoring Controls whether instances in this group are launched with detailed
   * or basic monitoring.
   * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and your
   * account
   * is charged a fee. When you disable detailed monitoring, CloudWatch generates metrics every 5
   * minutes.
   *
   * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
   * specified
   */
  public fun instanceMonitoring(instanceMonitoring: Monitoring) {
    cdkBuilder.instanceMonitoring(instanceMonitoring)
  }

  /**
   * @param instanceType Instance type of the instances to start. 
   */
  public fun instanceType(instanceType: InstanceType) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param keyName Name of SSH keypair to grant access to instances.
   * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
   * specified
   */
  public fun keyName(keyName: String) {
    cdkBuilder.keyName(keyName)
  }

  /**
   * @param machineImageType Machine image type.
   */
  public fun machineImageType(machineImageType: MachineImageType) {
    cdkBuilder.machineImageType(machineImageType)
  }

  /**
   * @param mapRole Will automatically update the aws-auth ConfigMap to map the IAM instance role to
   * RBAC.
   * This cannot be explicitly set to `true` if the cluster has kubectl disabled.
   */
  public fun mapRole(mapRole: Boolean) {
    cdkBuilder.mapRole(mapRole)
  }

  /**
   * @param maxCapacity Maximum number of instances in the fleet.
   */
  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  /**
   * @param maxInstanceLifetime The maximum amount of time that an instance can be in service.
   * The maximum duration applies
   * to all current and future instances in the group. As an instance approaches its maximum
   * duration,
   * it is terminated and replaced, and cannot be used again.
   *
   * You must specify a value of at least 604,800 seconds (7 days). To clear a previously set value,
   * leave this property undefined.
   */
  public fun maxInstanceLifetime(maxInstanceLifetime: Duration) {
    cdkBuilder.maxInstanceLifetime(maxInstanceLifetime)
  }

  /**
   * @param minCapacity Minimum number of instances in the fleet.
   */
  public fun minCapacity(minCapacity: Number) {
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
  public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean) {
    cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn)
  }

  /**
   * @param notifications Configure autoscaling group to send notifications about fleet changes to
   * an SNS topic(s).
   */
  public fun notifications(notifications: NotificationConfigurationDsl.() -> Unit) {
    _notifications.add(NotificationConfigurationDsl().apply(notifications).build())
  }

  /**
   * @param notifications Configure autoscaling group to send notifications about fleet changes to
   * an SNS topic(s).
   */
  public fun notifications(notifications: Collection<NotificationConfiguration>) {
    _notifications.addAll(notifications)
  }

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
  public fun signals(signals: Signals) {
    cdkBuilder.signals(signals)
  }

  /**
   * @param spotInterruptHandler Installs the AWS spot instance interrupt handler on the cluster if
   * it's not already added.
   * Only relevant if `spotPrice` is used.
   */
  public fun spotInterruptHandler(spotInterruptHandler: Boolean) {
    cdkBuilder.spotInterruptHandler(spotInterruptHandler)
  }

  /**
   * @param spotPrice The maximum hourly price (in USD) to be paid for any Spot Instance launched to
   * fulfill the request.
   * Spot Instances are
   * launched when the price you specify exceeds the current Spot market price.
   *
   * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
   * specified
   */
  public fun spotPrice(spotPrice: String) {
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
  public fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
    cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
  }

  /**
   * @param terminationPolicies A policy or a list of policies that are used to select the instances
   * to terminate.
   * The policies are executed in the order that you list them.
   */
  public fun terminationPolicies(vararg terminationPolicies: TerminationPolicy) {
    _terminationPolicies.addAll(listOf(*terminationPolicies))
  }

  /**
   * @param terminationPolicies A policy or a list of policies that are used to select the instances
   * to terminate.
   * The policies are executed in the order that you list them.
   */
  public fun terminationPolicies(terminationPolicies: Collection<TerminationPolicy>) {
    _terminationPolicies.addAll(terminationPolicies)
  }

  /**
   * @param updatePolicy What to do when an AutoScalingGroup's instance configuration is changed.
   * This is applied when any of the settings on the ASG are changed that
   * affect how the instances should be created (VPC, instance type, startup
   * scripts, etc.). It indicates how the existing instances should be
   * replaced with new instances matching the new config. By default, nothing
   * is done and only new instances are launched with the new config.
   */
  public fun updatePolicy(updatePolicy: UpdatePolicy) {
    cdkBuilder.updatePolicy(updatePolicy)
  }

  /**
   * @param vpcSubnets Where to place instances within the VPC.
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(vpcSubnets)
    cdkBuilder.vpcSubnets(builder.build())
  }

  /**
   * @param vpcSubnets Where to place instances within the VPC.
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): AutoScalingGroupCapacityOptions {
    if(_blockDevices.isNotEmpty()) cdkBuilder.blockDevices(_blockDevices)
    if(_groupMetrics.isNotEmpty()) cdkBuilder.groupMetrics(_groupMetrics)
    if(_notifications.isNotEmpty()) cdkBuilder.notifications(_notifications)
    if(_terminationPolicies.isNotEmpty()) cdkBuilder.terminationPolicies(_terminationPolicies)
    return cdkBuilder.build()
  }
}
