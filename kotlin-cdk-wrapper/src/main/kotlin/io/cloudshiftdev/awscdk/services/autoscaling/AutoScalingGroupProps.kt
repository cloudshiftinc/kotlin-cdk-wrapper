@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.CloudFormationInit
import io.cloudshiftdev.awscdk.services.ec2.IKeyPair
import io.cloudshiftdev.awscdk.services.ec2.ILaunchTemplate
import io.cloudshiftdev.awscdk.services.ec2.IMachineImage
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ec2.UserData
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties of a Fleet.
 *
 * Example:
 *
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
public interface AutoScalingGroupProps : CommonAutoScalingGroupProps {
  /**
   * Apply the given CloudFormation Init configuration to the instances in the AutoScalingGroup at
   * startup.
   *
   * If you specify `init`, you must also specify `signals` to configure
   * the number of instances to wait for and the timeout for waiting for the
   * init process.
   *
   * Default: - no CloudFormation init
   */
  public fun `init`(): CloudFormationInit? = unwrap(this).getInit()?.let(CloudFormationInit::wrap)

  /**
   * Use the given options for applying CloudFormation Init.
   *
   * Describes the configsets to use and the timeout to wait
   *
   * Default: - default options
   */
  public fun initOptions(): ApplyCloudFormationInitOptions? =
      unwrap(this).getInitOptions()?.let(ApplyCloudFormationInitOptions::wrap)

  /**
   * Type of instance to launch.
   *
   * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
   * specified
   *
   * Default: - Do not provide any instance type
   */
  public fun instanceType(): InstanceType? = unwrap(this).getInstanceType()?.let(InstanceType::wrap)

  /**
   * Launch template to use.
   *
   * Launch configuration related settings and MixedInstancesPolicy must not be specified when a
   * launch template is specified.
   *
   * Default: - Do not provide any launch template
   */
  public fun launchTemplate(): ILaunchTemplate? =
      unwrap(this).getLaunchTemplate()?.let(ILaunchTemplate::wrap)

  /**
   * AMI to launch.
   *
   * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
   * specified
   *
   * Default: - Do not provide any machine image
   */
  public fun machineImage(): IMachineImage? =
      unwrap(this).getMachineImage()?.let(IMachineImage::wrap)

  /**
   * Specifies the upper threshold as a percentage of the desired capacity of the Auto Scaling
   * group.
   *
   * It represents the maximum percentage of the group that can be in service and healthy, or
   * pending,
   * to support your workload when replacing instances.
   *
   * Value range is 0 to 100. After it's set, both `minHealthyPercentage` and `maxHealthyPercentage`
   * to
   * -1 will clear the previously set value.
   *
   * Both or neither of `minHealthyPercentage` and `maxHealthyPercentage` must be specified, and the
   * difference between them cannot be greater than 100. A large range increases the number of
   * instances that can be replaced at the same time.
   *
   * Default: - No instance maintenance policy.
   *
   * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
   */
  public fun maxHealthyPercentage(): Number? = unwrap(this).getMaxHealthyPercentage()

  /**
   * Specifies the lower threshold as a percentage of the desired capacity of the Auto Scaling
   * group.
   *
   * It represents the minimum percentage of the group to keep in service, healthy, and ready to use
   * to support your workload when replacing instances.
   *
   * Value range is 0 to 100. After it's set, both `minHealthyPercentage` and `maxHealthyPercentage`
   * to
   * -1 will clear the previously set value.
   *
   * Both or neither of `minHealthyPercentage` and `maxHealthyPercentage` must be specified, and the
   * difference between them cannot be greater than 100. A large range increases the number of
   * instances that can be replaced at the same time.
   *
   * Default: - No instance maintenance policy.
   *
   * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
   */
  public fun minHealthyPercentage(): Number? = unwrap(this).getMinHealthyPercentage()

  /**
   * Mixed Instances Policy to use.
   *
   * Launch configuration related settings and Launch Template  must not be specified when a
   * MixedInstancesPolicy is specified.
   *
   * Default: - Do not provide any MixedInstancesPolicy
   */
  public fun mixedInstancesPolicy(): MixedInstancesPolicy? =
      unwrap(this).getMixedInstancesPolicy()?.let(MixedInstancesPolicy::wrap)

  /**
   * Whether IMDSv2 should be required on launched instances.
   *
   * Default: false
   */
  public fun requireImdsv2(): Boolean? = unwrap(this).getRequireImdsv2()

  /**
   * An IAM role to associate with the instance profile assigned to this Auto Scaling Group.
   *
   * The role must be assumable by the service principal `ec2.amazonaws.com`:
   *
   * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
   * specified
   *
   * Default: A role will automatically be created, it can be accessed via the `role` property
   *
   * Example:
   *
   * ```
   * Role role = Role.Builder.create(this, "MyRole")
   * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
   * .build();
   * ```
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * Security group to launch the instances in.
   *
   * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
   * specified
   *
   * Default: - A SecurityGroup will be created if none is specified.
   */
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * Specific UserData to use.
   *
   * The UserData may still be mutated after creation.
   *
   * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
   * specified
   *
   * Default: - A UserData object appropriate for the MachineImage's
   * Operating System is created.
   */
  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  /**
   * VPC to launch these instances in.
   */
  public fun vpc(): IVpc

  /**
   * A builder for [AutoScalingGroupProps]
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
     * @param init Apply the given CloudFormation Init configuration to the instances in the
     * AutoScalingGroup at startup.
     * If you specify `init`, you must also specify `signals` to configure
     * the number of instances to wait for and the timeout for waiting for the
     * init process.
     */
    public fun `init`(`init`: CloudFormationInit)

    /**
     * @param initOptions Use the given options for applying CloudFormation Init.
     * Describes the configsets to use and the timeout to wait
     */
    public fun initOptions(initOptions: ApplyCloudFormationInitOptions)

    /**
     * @param initOptions Use the given options for applying CloudFormation Init.
     * Describes the configsets to use and the timeout to wait
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38cb54de890b9aeec1216ac0cb906bb2fa14f23c47b77c3cbb2ca3f1a814ccc8")
    public fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit)

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
     * @param instanceType Type of instance to launch.
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun instanceType(instanceType: InstanceType)

    /**
     * @param keyName Name of SSH keypair to grant access to instances.
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     *
     * You can either specify `keyPair` or `keyName`, not both.
     * @deprecated - Use `keyPair` instead -
     * https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_ec2-readme.html#using-an-existing-ec2-key-pair
     */
    @Deprecated(message = "deprecated in CDK")
    public fun keyName(keyName: String)

    /**
     * @param keyPair The SSH keypair to grant access to the instance.
     * Feature flag `AUTOSCALING_GENERATE_LAUNCH_TEMPLATE` must be enabled to use this property.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified.
     *
     * You can either specify `keyPair` or `keyName`, not both.
     */
    public fun keyPair(keyPair: IKeyPair)

    /**
     * @param launchTemplate Launch template to use.
     * Launch configuration related settings and MixedInstancesPolicy must not be specified when a
     * launch template is specified.
     */
    public fun launchTemplate(launchTemplate: ILaunchTemplate)

    /**
     * @param machineImage AMI to launch.
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun machineImage(machineImage: IMachineImage)

    /**
     * @param maxCapacity Maximum number of instances in the fleet.
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * @param maxHealthyPercentage Specifies the upper threshold as a percentage of the desired
     * capacity of the Auto Scaling group.
     * It represents the maximum percentage of the group that can be in service and healthy, or
     * pending,
     * to support your workload when replacing instances.
     *
     * Value range is 0 to 100. After it's set, both `minHealthyPercentage` and
     * `maxHealthyPercentage` to
     * -1 will clear the previously set value.
     *
     * Both or neither of `minHealthyPercentage` and `maxHealthyPercentage` must be specified, and
     * the
     * difference between them cannot be greater than 100. A large range increases the number of
     * instances that can be replaced at the same time.
     */
    public fun maxHealthyPercentage(maxHealthyPercentage: Number)

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
     * @param minHealthyPercentage Specifies the lower threshold as a percentage of the desired
     * capacity of the Auto Scaling group.
     * It represents the minimum percentage of the group to keep in service, healthy, and ready to
     * use
     * to support your workload when replacing instances.
     *
     * Value range is 0 to 100. After it's set, both `minHealthyPercentage` and
     * `maxHealthyPercentage` to
     * -1 will clear the previously set value.
     *
     * Both or neither of `minHealthyPercentage` and `maxHealthyPercentage` must be specified, and
     * the
     * difference between them cannot be greater than 100. A large range increases the number of
     * instances that can be replaced at the same time.
     */
    public fun minHealthyPercentage(minHealthyPercentage: Number)

    /**
     * @param mixedInstancesPolicy Mixed Instances Policy to use.
     * Launch configuration related settings and Launch Template  must not be specified when a
     * MixedInstancesPolicy is specified.
     */
    public fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicy)

    /**
     * @param mixedInstancesPolicy Mixed Instances Policy to use.
     * Launch configuration related settings and Launch Template  must not be specified when a
     * MixedInstancesPolicy is specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18bbae299b63610b93d5bacfdf69d4068d45a4775069c30a64590ea91e113461")
    public fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicy.Builder.() -> Unit)

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
     * @param requireImdsv2 Whether IMDSv2 should be required on launched instances.
     */
    public fun requireImdsv2(requireImdsv2: Boolean)

    /**
     * @param role An IAM role to associate with the instance profile assigned to this Auto Scaling
     * Group.
     * The role must be assumable by the service principal `ec2.amazonaws.com`:
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun role(role: IRole)

    /**
     * @param securityGroup Security group to launch the instances in.
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

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
     * @param userData Specific UserData to use.
     * The UserData may still be mutated after creation.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    public fun userData(userData: UserData)

    /**
     * @param vpc VPC to launch these instances in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Where to place instances within the VPC.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Where to place instances within the VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f86ae84133d5d32dd406c17b5fccfe7a939e906a245971d33533e33b15b60d6e")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder =
        software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.builder()

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
      cdkBuilder.blockDevices(blockDevices.map(BlockDevice.Companion::unwrap))
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
      cdkBuilder.cooldown(cooldown.let(Duration.Companion::unwrap))
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
      cdkBuilder.defaultInstanceWarmup(defaultInstanceWarmup.let(Duration.Companion::unwrap))
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
      cdkBuilder.groupMetrics(groupMetrics.map(GroupMetrics.Companion::unwrap))
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
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck.Companion::unwrap))
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
     * @param init Apply the given CloudFormation Init configuration to the instances in the
     * AutoScalingGroup at startup.
     * If you specify `init`, you must also specify `signals` to configure
     * the number of instances to wait for and the timeout for waiting for the
     * init process.
     */
    override fun `init`(`init`: CloudFormationInit) {
      cdkBuilder.`init`(`init`.let(CloudFormationInit.Companion::unwrap))
    }

    /**
     * @param initOptions Use the given options for applying CloudFormation Init.
     * Describes the configsets to use and the timeout to wait
     */
    override fun initOptions(initOptions: ApplyCloudFormationInitOptions) {
      cdkBuilder.initOptions(initOptions.let(ApplyCloudFormationInitOptions.Companion::unwrap))
    }

    /**
     * @param initOptions Use the given options for applying CloudFormation Init.
     * Describes the configsets to use and the timeout to wait
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38cb54de890b9aeec1216ac0cb906bb2fa14f23c47b77c3cbb2ca3f1a814ccc8")
    override fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit): Unit =
        initOptions(ApplyCloudFormationInitOptions(initOptions))

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
      cdkBuilder.instanceMonitoring(instanceMonitoring.let(Monitoring.Companion::unwrap))
    }

    /**
     * @param instanceType Type of instance to launch.
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType.Companion::unwrap))
    }

    /**
     * @param keyName Name of SSH keypair to grant access to instances.
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     *
     * You can either specify `keyPair` or `keyName`, not both.
     * @deprecated - Use `keyPair` instead -
     * https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_ec2-readme.html#using-an-existing-ec2-key-pair
     */
    @Deprecated(message = "deprecated in CDK")
    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    /**
     * @param keyPair The SSH keypair to grant access to the instance.
     * Feature flag `AUTOSCALING_GENERATE_LAUNCH_TEMPLATE` must be enabled to use this property.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified.
     *
     * You can either specify `keyPair` or `keyName`, not both.
     */
    override fun keyPair(keyPair: IKeyPair) {
      cdkBuilder.keyPair(keyPair.let(IKeyPair.Companion::unwrap))
    }

    /**
     * @param launchTemplate Launch template to use.
     * Launch configuration related settings and MixedInstancesPolicy must not be specified when a
     * launch template is specified.
     */
    override fun launchTemplate(launchTemplate: ILaunchTemplate) {
      cdkBuilder.launchTemplate(launchTemplate.let(ILaunchTemplate.Companion::unwrap))
    }

    /**
     * @param machineImage AMI to launch.
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    override fun machineImage(machineImage: IMachineImage) {
      cdkBuilder.machineImage(machineImage.let(IMachineImage.Companion::unwrap))
    }

    /**
     * @param maxCapacity Maximum number of instances in the fleet.
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param maxHealthyPercentage Specifies the upper threshold as a percentage of the desired
     * capacity of the Auto Scaling group.
     * It represents the maximum percentage of the group that can be in service and healthy, or
     * pending,
     * to support your workload when replacing instances.
     *
     * Value range is 0 to 100. After it's set, both `minHealthyPercentage` and
     * `maxHealthyPercentage` to
     * -1 will clear the previously set value.
     *
     * Both or neither of `minHealthyPercentage` and `maxHealthyPercentage` must be specified, and
     * the
     * difference between them cannot be greater than 100. A large range increases the number of
     * instances that can be replaced at the same time.
     */
    override fun maxHealthyPercentage(maxHealthyPercentage: Number) {
      cdkBuilder.maxHealthyPercentage(maxHealthyPercentage)
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
      cdkBuilder.maxInstanceLifetime(maxInstanceLifetime.let(Duration.Companion::unwrap))
    }

    /**
     * @param minCapacity Minimum number of instances in the fleet.
     */
    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * @param minHealthyPercentage Specifies the lower threshold as a percentage of the desired
     * capacity of the Auto Scaling group.
     * It represents the minimum percentage of the group to keep in service, healthy, and ready to
     * use
     * to support your workload when replacing instances.
     *
     * Value range is 0 to 100. After it's set, both `minHealthyPercentage` and
     * `maxHealthyPercentage` to
     * -1 will clear the previously set value.
     *
     * Both or neither of `minHealthyPercentage` and `maxHealthyPercentage` must be specified, and
     * the
     * difference between them cannot be greater than 100. A large range increases the number of
     * instances that can be replaced at the same time.
     */
    override fun minHealthyPercentage(minHealthyPercentage: Number) {
      cdkBuilder.minHealthyPercentage(minHealthyPercentage)
    }

    /**
     * @param mixedInstancesPolicy Mixed Instances Policy to use.
     * Launch configuration related settings and Launch Template  must not be specified when a
     * MixedInstancesPolicy is specified.
     */
    override fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicy) {
      cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy.let(MixedInstancesPolicy.Companion::unwrap))
    }

    /**
     * @param mixedInstancesPolicy Mixed Instances Policy to use.
     * Launch configuration related settings and Launch Template  must not be specified when a
     * MixedInstancesPolicy is specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18bbae299b63610b93d5bacfdf69d4068d45a4775069c30a64590ea91e113461")
    override
        fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicy.Builder.() -> Unit):
        Unit = mixedInstancesPolicy(MixedInstancesPolicy(mixedInstancesPolicy))

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
      cdkBuilder.notifications(notifications.map(NotificationConfiguration.Companion::unwrap))
    }

    /**
     * @param notifications Configure autoscaling group to send notifications about fleet changes to
     * an SNS topic(s).
     */
    override fun notifications(vararg notifications: NotificationConfiguration): Unit =
        notifications(notifications.toList())

    /**
     * @param requireImdsv2 Whether IMDSv2 should be required on launched instances.
     */
    override fun requireImdsv2(requireImdsv2: Boolean) {
      cdkBuilder.requireImdsv2(requireImdsv2)
    }

    /**
     * @param role An IAM role to associate with the instance profile assigned to this Auto Scaling
     * Group.
     * The role must be assumable by the service principal `ec2.amazonaws.com`:
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param securityGroup Security group to launch the instances in.
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup.Companion::unwrap))
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
    override fun signals(signals: Signals) {
      cdkBuilder.signals(signals.let(Signals.Companion::unwrap))
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
      cdkBuilder.terminationPolicies(terminationPolicies.map(TerminationPolicy.Companion::unwrap))
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
      cdkBuilder.updatePolicy(updatePolicy.let(UpdatePolicy.Companion::unwrap))
    }

    /**
     * @param userData Specific UserData to use.
     * The UserData may still be mutated after creation.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData.Companion::unwrap))
    }

    /**
     * @param vpc VPC to launch these instances in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Where to place instances within the VPC.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Where to place instances within the VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f86ae84133d5d32dd406c17b5fccfe7a939e906a245971d33533e33b15b60d6e")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps,
  ) : CdkObject(cdkObject), AutoScalingGroupProps {
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
     * Apply the given CloudFormation Init configuration to the instances in the AutoScalingGroup at
     * startup.
     *
     * If you specify `init`, you must also specify `signals` to configure
     * the number of instances to wait for and the timeout for waiting for the
     * init process.
     *
     * Default: - no CloudFormation init
     */
    override fun `init`(): CloudFormationInit? =
        unwrap(this).getInit()?.let(CloudFormationInit::wrap)

    /**
     * Use the given options for applying CloudFormation Init.
     *
     * Describes the configsets to use and the timeout to wait
     *
     * Default: - default options
     */
    override fun initOptions(): ApplyCloudFormationInitOptions? =
        unwrap(this).getInitOptions()?.let(ApplyCloudFormationInitOptions::wrap)

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
     * Type of instance to launch.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     *
     * Default: - Do not provide any instance type
     */
    override fun instanceType(): InstanceType? =
        unwrap(this).getInstanceType()?.let(InstanceType::wrap)

    /**
     * (deprecated) Name of SSH keypair to grant access to instances.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     *
     * You can either specify `keyPair` or `keyName`, not both.
     *
     * Default: - No SSH access will be possible.
     *
     * * Use `keyPair` instead -
     * https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_ec2-readme.html#using-an-existing-ec2-key-pair
     */
    @Deprecated(message = "deprecated in CDK")
    override fun keyName(): String? = unwrap(this).getKeyName()

    /**
     * The SSH keypair to grant access to the instance.
     *
     * Feature flag `AUTOSCALING_GENERATE_LAUNCH_TEMPLATE` must be enabled to use this property.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified.
     *
     * You can either specify `keyPair` or `keyName`, not both.
     *
     * Default: - No SSH access will be possible.
     */
    override fun keyPair(): IKeyPair? = unwrap(this).getKeyPair()?.let(IKeyPair::wrap)

    /**
     * Launch template to use.
     *
     * Launch configuration related settings and MixedInstancesPolicy must not be specified when a
     * launch template is specified.
     *
     * Default: - Do not provide any launch template
     */
    override fun launchTemplate(): ILaunchTemplate? =
        unwrap(this).getLaunchTemplate()?.let(ILaunchTemplate::wrap)

    /**
     * AMI to launch.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     *
     * Default: - Do not provide any machine image
     */
    override fun machineImage(): IMachineImage? =
        unwrap(this).getMachineImage()?.let(IMachineImage::wrap)

    /**
     * Maximum number of instances in the fleet.
     *
     * Default: desiredCapacity
     */
    override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    /**
     * Specifies the upper threshold as a percentage of the desired capacity of the Auto Scaling
     * group.
     *
     * It represents the maximum percentage of the group that can be in service and healthy, or
     * pending,
     * to support your workload when replacing instances.
     *
     * Value range is 0 to 100. After it's set, both `minHealthyPercentage` and
     * `maxHealthyPercentage` to
     * -1 will clear the previously set value.
     *
     * Both or neither of `minHealthyPercentage` and `maxHealthyPercentage` must be specified, and
     * the
     * difference between them cannot be greater than 100. A large range increases the number of
     * instances that can be replaced at the same time.
     *
     * Default: - No instance maintenance policy.
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
     */
    override fun maxHealthyPercentage(): Number? = unwrap(this).getMaxHealthyPercentage()

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
     * Specifies the lower threshold as a percentage of the desired capacity of the Auto Scaling
     * group.
     *
     * It represents the minimum percentage of the group to keep in service, healthy, and ready to
     * use
     * to support your workload when replacing instances.
     *
     * Value range is 0 to 100. After it's set, both `minHealthyPercentage` and
     * `maxHealthyPercentage` to
     * -1 will clear the previously set value.
     *
     * Both or neither of `minHealthyPercentage` and `maxHealthyPercentage` must be specified, and
     * the
     * difference between them cannot be greater than 100. A large range increases the number of
     * instances that can be replaced at the same time.
     *
     * Default: - No instance maintenance policy.
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
     */
    override fun minHealthyPercentage(): Number? = unwrap(this).getMinHealthyPercentage()

    /**
     * Mixed Instances Policy to use.
     *
     * Launch configuration related settings and Launch Template  must not be specified when a
     * MixedInstancesPolicy is specified.
     *
     * Default: - Do not provide any MixedInstancesPolicy
     */
    override fun mixedInstancesPolicy(): MixedInstancesPolicy? =
        unwrap(this).getMixedInstancesPolicy()?.let(MixedInstancesPolicy::wrap)

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
     * Whether IMDSv2 should be required on launched instances.
     *
     * Default: false
     */
    override fun requireImdsv2(): Boolean? = unwrap(this).getRequireImdsv2()

    /**
     * An IAM role to associate with the instance profile assigned to this Auto Scaling Group.
     *
     * The role must be assumable by the service principal `ec2.amazonaws.com`:
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     *
     * Default: A role will automatically be created, it can be accessed via the `role` property
     *
     * Example:
     *
     * ```
     * Role role = Role.Builder.create(this, "MyRole")
     * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
     * .build();
     * ```
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * Security group to launch the instances in.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     *
     * Default: - A SecurityGroup will be created if none is specified.
     */
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

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
     * Specific UserData to use.
     *
     * The UserData may still be mutated after creation.
     *
     * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
     * specified
     *
     * Default: - A UserData object appropriate for the MachineImage's
     * Operating System is created.
     */
    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

    /**
     * VPC to launch these instances in.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * Where to place instances within the VPC.
     *
     * Default: - All Private subnets.
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps):
        AutoScalingGroupProps = CdkObjectWrappers.wrap(cdkObject) as? AutoScalingGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AutoScalingGroupProps):
        software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps
  }
}
