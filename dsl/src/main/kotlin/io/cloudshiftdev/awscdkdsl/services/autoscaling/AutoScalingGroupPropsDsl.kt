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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions
import software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps
import software.amazon.awscdk.services.autoscaling.BlockDevice
import software.amazon.awscdk.services.autoscaling.GroupMetrics
import software.amazon.awscdk.services.autoscaling.HealthCheck
import software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy
import software.amazon.awscdk.services.autoscaling.Monitoring
import software.amazon.awscdk.services.autoscaling.NotificationConfiguration
import software.amazon.awscdk.services.autoscaling.Signals
import software.amazon.awscdk.services.autoscaling.TerminationPolicy
import software.amazon.awscdk.services.autoscaling.UpdatePolicy
import software.amazon.awscdk.services.ec2.CloudFormationInit
import software.amazon.awscdk.services.ec2.ILaunchTemplate
import software.amazon.awscdk.services.ec2.IMachineImage
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ec2.UserData
import software.amazon.awscdk.services.iam.IRole

/**
 * Properties of a Fleet.
 *
 * Example:
 * ```
 * Vpc vpc;
 * InstanceType instanceType;
 * IMachineImage machineImage;
 * AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(machineImage)
 * // ...
 * .init(CloudFormationInit.fromElements(InitFile.fromString("/etc/my_instance", "This got written
 * during instance startup")))
 * .signals(Signals.waitForAll(SignalsOptions.builder()
 * .timeout(Duration.minutes(10))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class AutoScalingGroupPropsDsl {
    private val cdkBuilder: AutoScalingGroupProps.Builder = AutoScalingGroupProps.builder()

    private val _blockDevices: MutableList<BlockDevice> = mutableListOf()

    private val _groupMetrics: MutableList<GroupMetrics> = mutableListOf()

    private val _notifications: MutableList<NotificationConfiguration> = mutableListOf()

    private val _terminationPolicies: MutableList<TerminationPolicy> = mutableListOf()

    /**
     * @param allowAllOutbound Whether the instances can initiate connections to anywhere by
     *   default.
     */
    public fun allowAllOutbound(allowAllOutbound: Boolean) {
        cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /**
     * @param associatePublicIpAddress Whether instances in the Auto Scaling Group should have
     *   public IP addresses associated with them. `launchTemplate` and `mixedInstancesPolicy` must
     *   not be specified when this property is specified
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    /**
     * @param autoScalingGroupName The name of the Auto Scaling group. This name must be unique per
     *   Region per account.
     */
    public fun autoScalingGroupName(autoScalingGroupName: String) {
        cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    /**
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     *   virtual devices and EBS volumes. Each instance that is launched has an associated root
     *   device volume, either an Amazon EBS volume or an instance store volume. You can use block
     *   device mappings to specify additional EBS volumes or instance store volumes to attach to an
     *   instance when it is launched.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun blockDevices(blockDevices: BlockDeviceDsl.() -> Unit) {
        _blockDevices.add(BlockDeviceDsl().apply(blockDevices).build())
    }

    /**
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     *   virtual devices and EBS volumes. Each instance that is launched has an associated root
     *   device volume, either an Amazon EBS volume or an instance store volume. You can use block
     *   device mappings to specify additional EBS volumes or instance store volumes to attach to an
     *   instance when it is launched.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun blockDevices(blockDevices: Collection<BlockDevice>) {
        _blockDevices.addAll(blockDevices)
    }

    /**
     * @param capacityRebalance Indicates whether Capacity Rebalancing is enabled. When you turn on
     *   Capacity Rebalancing, Amazon EC2 Auto Scaling attempts to launch a Spot Instance whenever
     *   Amazon EC2 notifies that a Spot Instance is at an elevated risk of interruption. After
     *   launching a new instance, it then terminates an old instance.
     */
    public fun capacityRebalance(capacityRebalance: Boolean) {
        cdkBuilder.capacityRebalance(capacityRebalance)
    }

    /** @param cooldown Default scaling cooldown for this AutoScalingGroup. */
    public fun cooldown(cooldown: Duration) {
        cdkBuilder.cooldown(cooldown)
    }

    /**
     * @param defaultInstanceWarmup The amount of time, in seconds, until a newly launched instance
     *   can contribute to the Amazon CloudWatch metrics. This delay lets an instance finish
     *   initializing before Amazon EC2 Auto Scaling aggregates instance metrics, resulting in more
     *   reliable usage data. Set this value equal to the amount of time that it takes for resource
     *   consumption to become stable after an instance reaches the InService state.
     *
     * To optimize the performance of scaling policies that scale continuously, such as target
     * tracking and step scaling policies, we strongly recommend that you enable the default
     * instance warmup, even if its value is set to 0 seconds
     *
     * Default instance warmup will not be added if no value is specified
     */
    public fun defaultInstanceWarmup(defaultInstanceWarmup: Duration) {
        cdkBuilder.defaultInstanceWarmup(defaultInstanceWarmup)
    }

    /**
     * @param desiredCapacity Initial amount of instances in the fleet. If this is set to a number,
     *   every deployment will reset the amount of instances to this number. It is recommended to
     *   leave this value blank.
     */
    public fun desiredCapacity(desiredCapacity: Number) {
        cdkBuilder.desiredCapacity(desiredCapacity)
    }

    /**
     * @param groupMetrics Enable monitoring for group metrics, these metrics describe the group
     *   rather than any of its instances. To report all group metrics use `GroupMetrics.all()`
     *   Group metrics are reported in a granularity of 1 minute at no additional charge.
     */
    public fun groupMetrics(vararg groupMetrics: GroupMetrics) {
        _groupMetrics.addAll(listOf(*groupMetrics))
    }

    /**
     * @param groupMetrics Enable monitoring for group metrics, these metrics describe the group
     *   rather than any of its instances. To report all group metrics use `GroupMetrics.all()`
     *   Group metrics are reported in a granularity of 1 minute at no additional charge.
     */
    public fun groupMetrics(groupMetrics: Collection<GroupMetrics>) {
        _groupMetrics.addAll(groupMetrics)
    }

    /** @param healthCheck Configuration for health checks. */
    public fun healthCheck(healthCheck: HealthCheck) {
        cdkBuilder.healthCheck(healthCheck)
    }

    /**
     * @param ignoreUnmodifiedSizeProperties If the ASG has scheduled actions, don't reset unchanged
     *   group sizes. Only used if the ASG has scheduled actions (which may scale your ASG up or
     *   down regardless of cdk deployments). If true, the size of the group will only be reset if
     *   it has been changed in the CDK app. If false, the sizes will always be changed back to what
     *   they were in the CDK app on deployment.
     */
    public fun ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties: Boolean) {
        cdkBuilder.ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties)
    }

    /**
     * @param init Apply the given CloudFormation Init configuration to the instances in the
     *   AutoScalingGroup at startup. If you specify `init`, you must also specify `signals` to
     *   configure the number of instances to wait for and the timeout for waiting for the init
     *   process.
     */
    public fun `init`(`init`: CloudFormationInit) {
        cdkBuilder.`init`(`init`)
    }

    /**
     * @param initOptions Use the given options for applying CloudFormation Init. Describes the
     *   configsets to use and the timeout to wait
     */
    public fun initOptions(initOptions: ApplyCloudFormationInitOptionsDsl.() -> Unit = {}) {
        val builder = ApplyCloudFormationInitOptionsDsl()
        builder.apply(initOptions)
        cdkBuilder.initOptions(builder.build())
    }

    /**
     * @param initOptions Use the given options for applying CloudFormation Init. Describes the
     *   configsets to use and the timeout to wait
     */
    public fun initOptions(initOptions: ApplyCloudFormationInitOptions) {
        cdkBuilder.initOptions(initOptions)
    }

    /**
     * @param instanceMonitoring Controls whether instances in this group are launched with detailed
     *   or basic monitoring. When detailed monitoring is enabled, Amazon CloudWatch generates
     *   metrics every minute and your account is charged a fee. When you disable detailed
     *   monitoring, CloudWatch generates metrics every 5 minutes.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun instanceMonitoring(instanceMonitoring: Monitoring) {
        cdkBuilder.instanceMonitoring(instanceMonitoring)
    }

    /**
     * @param instanceType Type of instance to launch. `launchTemplate` and `mixedInstancesPolicy`
     *   must not be specified when this property is specified
     */
    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param keyName Name of SSH keypair to grant access to instances. `launchTemplate` and
     *   `mixedInstancesPolicy` must not be specified when this property is specified
     */
    public fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
    }

    /**
     * @param launchTemplate Launch template to use. Launch configuration related settings and
     *   MixedInstancesPolicy must not be specified when a launch template is specified.
     */
    public fun launchTemplate(launchTemplate: ILaunchTemplate) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    /**
     * @param machineImage AMI to launch. `launchTemplate` and `mixedInstancesPolicy` must not be
     *   specified when this property is specified
     */
    public fun machineImage(machineImage: IMachineImage) {
        cdkBuilder.machineImage(machineImage)
    }

    /** @param maxCapacity Maximum number of instances in the fleet. */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param maxHealthyPercentage Specifies the upper threshold as a percentage of the desired
     *   capacity of the Auto Scaling group. It represents the maximum percentage of the group that
     *   can be in service and healthy, or pending, to support your workload when replacing
     *   instances.
     *
     * Value range is 0 to 100. After it's set, both `minHealthyPercentage` and
     * `maxHealthyPercentage` to -1 will clear the previously set value.
     *
     * Both or neither of `minHealthyPercentage` and `maxHealthyPercentage` must be specified, and
     * the difference between them cannot be greater than 100. A large range increases the number of
     * instances that can be replaced at the same time.
     */
    public fun maxHealthyPercentage(maxHealthyPercentage: Number) {
        cdkBuilder.maxHealthyPercentage(maxHealthyPercentage)
    }

    /**
     * @param maxInstanceLifetime The maximum amount of time that an instance can be in service. The
     *   maximum duration applies to all current and future instances in the group. As an instance
     *   approaches its maximum duration, it is terminated and replaced, and cannot be used again.
     *
     * You must specify a value of at least 604,800 seconds (7 days). To clear a previously set
     * value, leave this property undefined.
     */
    public fun maxInstanceLifetime(maxInstanceLifetime: Duration) {
        cdkBuilder.maxInstanceLifetime(maxInstanceLifetime)
    }

    /** @param minCapacity Minimum number of instances in the fleet. */
    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * @param minHealthyPercentage Specifies the lower threshold as a percentage of the desired
     *   capacity of the Auto Scaling group. It represents the minimum percentage of the group to
     *   keep in service, healthy, and ready to use to support your workload when replacing
     *   instances.
     *
     * Value range is 0 to 100. After it's set, both `minHealthyPercentage` and
     * `maxHealthyPercentage` to -1 will clear the previously set value.
     *
     * Both or neither of `minHealthyPercentage` and `maxHealthyPercentage` must be specified, and
     * the difference between them cannot be greater than 100. A large range increases the number of
     * instances that can be replaced at the same time.
     */
    public fun minHealthyPercentage(minHealthyPercentage: Number) {
        cdkBuilder.minHealthyPercentage(minHealthyPercentage)
    }

    /**
     * @param mixedInstancesPolicy Mixed Instances Policy to use. Launch configuration related
     *   settings and Launch Template must not be specified when a MixedInstancesPolicy is
     *   specified.
     */
    public fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicyDsl.() -> Unit = {}) {
        val builder = MixedInstancesPolicyDsl()
        builder.apply(mixedInstancesPolicy)
        cdkBuilder.mixedInstancesPolicy(builder.build())
    }

    /**
     * @param mixedInstancesPolicy Mixed Instances Policy to use. Launch configuration related
     *   settings and Launch Template must not be specified when a MixedInstancesPolicy is
     *   specified.
     */
    public fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicy) {
        cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy)
    }

    /**
     * @param newInstancesProtectedFromScaleIn Whether newly-launched instances are protected from
     *   termination by Amazon EC2 Auto Scaling when scaling in. By default, Auto Scaling can
     *   terminate an instance at any time after launch when scaling in an Auto Scaling Group,
     *   subject to the group's termination policy. However, you may wish to protect newly-launched
     *   instances from being scaled in if they are going to run critical applications that should
     *   not be prematurely terminated.
     *
     * This flag must be enabled if the Auto Scaling Group will be associated with an ECS Capacity
     * Provider with managed termination protection.
     */
    public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean) {
        cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn)
    }

    /**
     * @param notifications Configure autoscaling group to send notifications about fleet changes to
     *   an SNS topic(s).
     */
    public fun notifications(notifications: NotificationConfigurationDsl.() -> Unit) {
        _notifications.add(NotificationConfigurationDsl().apply(notifications).build())
    }

    /**
     * @param notifications Configure autoscaling group to send notifications about fleet changes to
     *   an SNS topic(s).
     */
    public fun notifications(notifications: Collection<NotificationConfiguration>) {
        _notifications.addAll(notifications)
    }

    /** @param requireImdsv2 Whether IMDSv2 should be required on launched instances. */
    public fun requireImdsv2(requireImdsv2: Boolean) {
        cdkBuilder.requireImdsv2(requireImdsv2)
    }

    /**
     * @param role An IAM role to associate with the instance profile assigned to this Auto Scaling
     *   Group. The role must be assumable by the service principal `ec2.amazonaws.com`:
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param securityGroup Security group to launch the instances in. `launchTemplate` and
     *   `mixedInstancesPolicy` must not be specified when this property is specified
     */
    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    /**
     * @param signals Configure waiting for signals during deployment. Use this to pause the
     *   CloudFormation deployment to wait for the instances in the AutoScalingGroup to report
     *   successful startup during creation and updates. The UserData script needs to invoke
     *   `cfn-signal` with a success or failure code after it is done setting up the instance.
     *
     * Without waiting for signals, the CloudFormation deployment will proceed as soon as the
     * AutoScalingGroup has been created or updated but before the instances in the group have been
     * started.
     *
     * For example, to have instances wait for an Elastic Load Balancing health check before they
     * signal success, add a health-check verification by using the cfn-init helper script. For an
     * example, see the verify_instance_health command in the Auto Scaling rolling updates sample
     * template:
     *
     * https://github.com/awslabs/aws-cloudformation-templates/blob/master/aws/services/AutoScaling/AutoScalingRollingUpdates.yaml
     */
    public fun signals(signals: Signals) {
        cdkBuilder.signals(signals)
    }

    /**
     * @param spotPrice The maximum hourly price (in USD) to be paid for any Spot Instance launched
     *   to fulfill the request. Spot Instances are launched when the price you specify exceeds the
     *   current Spot market price.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun spotPrice(spotPrice: String) {
        cdkBuilder.spotPrice(spotPrice)
    }

    /**
     * @param ssmSessionPermissions Add SSM session permissions to the instance role. Setting this
     *   to `true` adds the necessary permissions to connect to the instance using SSM Session
     *   Manager. You can do this from the AWS Console.
     *
     * NOTE: Setting this flag to `true` may not be enough by itself. You must also use an AMI that
     * comes with the SSM Agent, or install the SSM Agent yourself. See
     * [Working with SSM Agent](https://docs.aws.amazon.com/systems-manager/latest/userguide/ssm-agent.html)
     * in the SSM Developer Guide.
     */
    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
        cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    /**
     * @param terminationPolicies A policy or a list of policies that are used to select the
     *   instances to terminate. The policies are executed in the order that you list them.
     */
    public fun terminationPolicies(vararg terminationPolicies: TerminationPolicy) {
        _terminationPolicies.addAll(listOf(*terminationPolicies))
    }

    /**
     * @param terminationPolicies A policy or a list of policies that are used to select the
     *   instances to terminate. The policies are executed in the order that you list them.
     */
    public fun terminationPolicies(terminationPolicies: Collection<TerminationPolicy>) {
        _terminationPolicies.addAll(terminationPolicies)
    }

    /**
     * @param updatePolicy What to do when an AutoScalingGroup's instance configuration is changed.
     *   This is applied when any of the settings on the ASG are changed that affect how the
     *   instances should be created (VPC, instance type, startup scripts, etc.). It indicates how
     *   the existing instances should be replaced with new instances matching the new config. By
     *   default, nothing is done and only new instances are launched with the new config.
     */
    public fun updatePolicy(updatePolicy: UpdatePolicy) {
        cdkBuilder.updatePolicy(updatePolicy)
    }

    /**
     * @param userData Specific UserData to use. The UserData may still be mutated after creation.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    /** @param vpc VPC to launch these instances in. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /** @param vpcSubnets Where to place instances within the VPC. */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /** @param vpcSubnets Where to place instances within the VPC. */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): AutoScalingGroupProps {
        if (_blockDevices.isNotEmpty()) cdkBuilder.blockDevices(_blockDevices)
        if (_groupMetrics.isNotEmpty()) cdkBuilder.groupMetrics(_groupMetrics)
        if (_notifications.isNotEmpty()) cdkBuilder.notifications(_notifications)
        if (_terminationPolicies.isNotEmpty()) cdkBuilder.terminationPolicies(_terminationPolicies)
        return cdkBuilder.build()
    }
}
