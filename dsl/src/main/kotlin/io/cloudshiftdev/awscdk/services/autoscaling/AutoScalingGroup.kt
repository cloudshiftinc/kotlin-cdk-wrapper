package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.CloudFormationInit
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ILaunchTemplate
import io.cloudshiftdev.awscdk.services.ec2.IMachineImage
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.OperatingSystemType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ec2.UserData
import io.cloudshiftdev.awscdk.services.elasticloadbalancing.ILoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancing.LoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AutoScalingGroup
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.autoscaling.AutoScalingGroup,
) :
    Resource(cdkObject),
    ILoadBalancerTarget,
    IConnectable,
    IApplicationLoadBalancerTarget,
    INetworkLoadBalancerTarget,
    IAutoScalingGroup {
    /**
     * Send a message to either an SQS queue or SNS topic when instances launch or terminate.
     *
     * @param id
     * @param props
     */
    public override fun addLifecycleHook(
        id: String,
        props: BasicLifecycleHookProps
    ): LifecycleHook =
        unwrap(this)
            .addLifecycleHook(id, props.let(BasicLifecycleHookProps::unwrap))
            .let(LifecycleHook::wrap)

    /**
     * Send a message to either an SQS queue or SNS topic when instances launch or terminate.
     *
     * @param id
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e73b58a332c5f3bcf737c3c3902fb97721571b04a55f030350ee06a5be61db31")
    public override fun addLifecycleHook(
        id: String,
        props: BasicLifecycleHookProps.Builder.() -> Unit
    ): LifecycleHook = addLifecycleHook(id, BasicLifecycleHookProps(props))

    /**
     * Add the security group to all instances via the launch template security groups array.
     *
     * @param securityGroup : The security group to add.
     */
    public open fun addSecurityGroup(securityGroup: ISecurityGroup) {
        unwrap(this).addSecurityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * Adds a statement to the IAM role assumed by instances of this fleet.
     *
     * @param statement
     */
    public open fun addToRolePolicy(statement: PolicyStatement) {
        unwrap(this).addToRolePolicy(statement.let(PolicyStatement::unwrap))
    }

    /**
     * Adds a statement to the IAM role assumed by instances of this fleet.
     *
     * @param statement
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
    public open fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
        addToRolePolicy(PolicyStatement(statement))

    /**
     * Add command to the startup script of fleet instances.
     *
     * The command must be in the scripting language supported by the fleet's OS (i.e.
     * Linux/Windows). Does nothing for imported ASGs.
     *
     * @param commands
     */
    public override fun addUserData(commands: String) {
        unwrap(this).addUserData(commands)
    }

    /**
     * Add a pool of pre-initialized EC2 instances that sits alongside an Auto Scaling group.
     *
     * @param options
     */
    public override fun addWarmPool(): WarmPool = unwrap(this).addWarmPool().let(WarmPool::wrap)

    /**
     * Add a pool of pre-initialized EC2 instances that sits alongside an Auto Scaling group.
     *
     * @param options
     */
    public override fun addWarmPool(options: WarmPoolOptions): WarmPool =
        unwrap(this).addWarmPool(options.let(WarmPoolOptions::unwrap)).let(WarmPool::wrap)

    /**
     * Add a pool of pre-initialized EC2 instances that sits alongside an Auto Scaling group.
     *
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebe3a17babce83c2ccb570a7464dccb7ae43140da33baacb05b1a15a27a69e43")
    public override fun addWarmPool(options: WarmPoolOptions.Builder.() -> Unit): WarmPool =
        addWarmPool(WarmPoolOptions(options))

    /**
     * Use a CloudFormation Init configuration at instance startup.
     *
     * This does the following:
     * * Attaches the CloudFormation Init metadata to the AutoScalingGroup resource.
     * * Add commands to the UserData to run `cfn-init` and `cfn-signal`.
     * * Update the instance's CreationPolicy to wait for `cfn-init` to finish before reporting
     *   success.
     *
     * @param init
     * @param options
     */
    public open fun applyCloudFormationInit(`init`: CloudFormationInit) {
        unwrap(this).applyCloudFormationInit(`init`.let(CloudFormationInit::unwrap))
    }

    /**
     * Use a CloudFormation Init configuration at instance startup.
     *
     * This does the following:
     * * Attaches the CloudFormation Init metadata to the AutoScalingGroup resource.
     * * Add commands to the UserData to run `cfn-init` and `cfn-signal`.
     * * Update the instance's CreationPolicy to wait for `cfn-init` to finish before reporting
     *   success.
     *
     * @param init
     * @param options
     */
    public open fun applyCloudFormationInit(
        `init`: CloudFormationInit,
        options: ApplyCloudFormationInitOptions
    ) {
        unwrap(this)
            .applyCloudFormationInit(
                `init`.let(CloudFormationInit::unwrap),
                options.let(ApplyCloudFormationInitOptions::unwrap)
            )
    }

    /**
     * Use a CloudFormation Init configuration at instance startup.
     *
     * This does the following:
     * * Attaches the CloudFormation Init metadata to the AutoScalingGroup resource.
     * * Add commands to the UserData to run `cfn-init` and `cfn-signal`.
     * * Update the instance's CreationPolicy to wait for `cfn-init` to finish before reporting
     *   success.
     *
     * @param init
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1aad7fc9c65bc2d621e9c2ff9beede63c99e9a0a5fa587ea45ba05f97691dddf")
    public open fun applyCloudFormationInit(
        `init`: CloudFormationInit,
        options: ApplyCloudFormationInitOptions.Builder.() -> Unit
    ): Unit = applyCloudFormationInit(`init`, ApplyCloudFormationInitOptions(options))

    /** Returns `true` if newly-launched instances are protected from scale-in. */
    public open fun areNewInstancesProtectedFromScaleIn(): Boolean =
        unwrap(this).areNewInstancesProtectedFromScaleIn()

    /**
     * Attach to ELBv2 Application Target Group.
     *
     * @param targetGroup
     */
    public override fun attachToApplicationTargetGroup(
        targetGroup: IApplicationTargetGroup
    ): LoadBalancerTargetProps =
        unwrap(this)
            .attachToApplicationTargetGroup(targetGroup.let(IApplicationTargetGroup::unwrap))
            .let(LoadBalancerTargetProps::wrap)

    /**
     * Attach to a classic load balancer.
     *
     * @param loadBalancer
     */
    public override fun attachToClassicLb(loadBalancer: LoadBalancer) {
        unwrap(this).attachToClassicLB(loadBalancer.let(LoadBalancer::unwrap))
    }

    /**
     * Attach to ELBv2 Application Target Group.
     *
     * @param targetGroup
     */
    public override fun attachToNetworkTargetGroup(
        targetGroup: INetworkTargetGroup
    ): LoadBalancerTargetProps =
        unwrap(this)
            .attachToNetworkTargetGroup(targetGroup.let(INetworkTargetGroup::unwrap))
            .let(LoadBalancerTargetProps::wrap)

    /** Arn of the AutoScalingGroup. */
    public override fun autoScalingGroupArn(): String = unwrap(this).getAutoScalingGroupArn()

    /** Name of the AutoScalingGroup. */
    public override fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

    /** The network connections associated with this resource. */
    public override fun connections(): Connections =
        unwrap(this).getConnections().let(Connections::wrap)

    /** The principal to grant permissions to. */
    public override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    /** The maximum amount of time that an instance can be in service. */
    public open fun maxInstanceLifetime(): Duration? =
        unwrap(this).getMaxInstanceLifetime()?.let(Duration::wrap)

    /** The type of OS instances of this fleet are running. */
    public override fun osType(): OperatingSystemType =
        unwrap(this).getOsType().let(OperatingSystemType::wrap)

    /** Ensures newly-launched instances are protected from scale-in. */
    public open fun protectNewInstancesFromScaleIn() {
        unwrap(this).protectNewInstancesFromScaleIn()
    }

    /** The IAM Role in the instance profile. */
    public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

    /**
     * Scale out or in to achieve a target CPU utilization.
     *
     * @param id
     * @param props
     */
    public override fun scaleOnCpuUtilization(
        id: String,
        props: CpuUtilizationScalingProps
    ): TargetTrackingScalingPolicy =
        unwrap(this)
            .scaleOnCpuUtilization(id, props.let(CpuUtilizationScalingProps::unwrap))
            .let(TargetTrackingScalingPolicy::wrap)

    /**
     * Scale out or in to achieve a target CPU utilization.
     *
     * @param id
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54ff0f79a3a0e98af41f878332105ce744cc94709e6dfa3c31c968213fde0127")
    public override fun scaleOnCpuUtilization(
        id: String,
        props: CpuUtilizationScalingProps.Builder.() -> Unit
    ): TargetTrackingScalingPolicy = scaleOnCpuUtilization(id, CpuUtilizationScalingProps(props))

    /**
     * Scale out or in to achieve a target network ingress rate.
     *
     * @param id
     * @param props
     */
    public override fun scaleOnIncomingBytes(
        id: String,
        props: NetworkUtilizationScalingProps
    ): TargetTrackingScalingPolicy =
        unwrap(this)
            .scaleOnIncomingBytes(id, props.let(NetworkUtilizationScalingProps::unwrap))
            .let(TargetTrackingScalingPolicy::wrap)

    /**
     * Scale out or in to achieve a target network ingress rate.
     *
     * @param id
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53d48012d390303ce4bdadda813caeca6ef440c93ff99ecf347c830212960766")
    public override fun scaleOnIncomingBytes(
        id: String,
        props: NetworkUtilizationScalingProps.Builder.() -> Unit
    ): TargetTrackingScalingPolicy = scaleOnIncomingBytes(id, NetworkUtilizationScalingProps(props))

    /**
     * Scale out or in, in response to a metric.
     *
     * @param id
     * @param props
     */
    public override fun scaleOnMetric(
        id: String,
        props: BasicStepScalingPolicyProps
    ): StepScalingPolicy =
        unwrap(this)
            .scaleOnMetric(id, props.let(BasicStepScalingPolicyProps::unwrap))
            .let(StepScalingPolicy::wrap)

    /**
     * Scale out or in, in response to a metric.
     *
     * @param id
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97c636215f9ded1865259a4c15b81d08ffc6cf47e1b5af030d3b308ae6eba808")
    public override fun scaleOnMetric(
        id: String,
        props: BasicStepScalingPolicyProps.Builder.() -> Unit
    ): StepScalingPolicy = scaleOnMetric(id, BasicStepScalingPolicyProps(props))

    /**
     * Scale out or in to achieve a target network egress rate.
     *
     * @param id
     * @param props
     */
    public override fun scaleOnOutgoingBytes(
        id: String,
        props: NetworkUtilizationScalingProps
    ): TargetTrackingScalingPolicy =
        unwrap(this)
            .scaleOnOutgoingBytes(id, props.let(NetworkUtilizationScalingProps::unwrap))
            .let(TargetTrackingScalingPolicy::wrap)

    /**
     * Scale out or in to achieve a target network egress rate.
     *
     * @param id
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("041c27ca62dcbebfcb1881e27b18d9a65a9e76a73700f64dc5640d2cb3dd2620")
    public override fun scaleOnOutgoingBytes(
        id: String,
        props: NetworkUtilizationScalingProps.Builder.() -> Unit
    ): TargetTrackingScalingPolicy = scaleOnOutgoingBytes(id, NetworkUtilizationScalingProps(props))

    /**
     * Scale out or in to achieve a target request handling rate.
     *
     * The AutoScalingGroup must have been attached to an Application Load Balancer in order to be
     * able to call this.
     *
     * @param id
     * @param props
     */
    public open fun scaleOnRequestCount(
        id: String,
        props: RequestCountScalingProps
    ): TargetTrackingScalingPolicy =
        unwrap(this)
            .scaleOnRequestCount(id, props.let(RequestCountScalingProps::unwrap))
            .let(TargetTrackingScalingPolicy::wrap)

    /**
     * Scale out or in to achieve a target request handling rate.
     *
     * The AutoScalingGroup must have been attached to an Application Load Balancer in order to be
     * able to call this.
     *
     * @param id
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbab02933923f22a0043aff0dff376d920571515f3ac005ffb73167d68ef54b7")
    public open fun scaleOnRequestCount(
        id: String,
        props: RequestCountScalingProps.Builder.() -> Unit
    ): TargetTrackingScalingPolicy = scaleOnRequestCount(id, RequestCountScalingProps(props))

    /**
     * Scale out or in based on time.
     *
     * @param id
     * @param props
     */
    public override fun scaleOnSchedule(
        id: String,
        props: BasicScheduledActionProps
    ): ScheduledAction =
        unwrap(this)
            .scaleOnSchedule(id, props.let(BasicScheduledActionProps::unwrap))
            .let(ScheduledAction::wrap)

    /**
     * Scale out or in based on time.
     *
     * @param id
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8a0caadcedcb277caddacbd0e88af40e8ebf1b6606474968554ce75d027168a")
    public override fun scaleOnSchedule(
        id: String,
        props: BasicScheduledActionProps.Builder.() -> Unit
    ): ScheduledAction = scaleOnSchedule(id, BasicScheduledActionProps(props))

    /**
     * Scale out or in in order to keep a metric around a target value.
     *
     * @param id
     * @param props
     */
    public override fun scaleToTrackMetric(
        id: String,
        props: MetricTargetTrackingProps
    ): TargetTrackingScalingPolicy =
        unwrap(this)
            .scaleToTrackMetric(id, props.let(MetricTargetTrackingProps::unwrap))
            .let(TargetTrackingScalingPolicy::wrap)

    /**
     * Scale out or in in order to keep a metric around a target value.
     *
     * @param id
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("783dfddcfc4313e0ba0ad62e98c32ed03381c60b8a7586ca584816685414690c")
    public override fun scaleToTrackMetric(
        id: String,
        props: MetricTargetTrackingProps.Builder.() -> Unit
    ): TargetTrackingScalingPolicy = scaleToTrackMetric(id, MetricTargetTrackingProps(props))

    /**
     * The maximum spot price configured for the autoscaling group.
     *
     * `undefined` indicates that this group uses on-demand capacity.
     */
    public open fun spotPrice(): String? = unwrap(this).getSpotPrice()

    /** The Base64-encoded user data to make available to the launched EC2 instances. */
    public open fun userData(): UserData = unwrap(this).getUserData().let(UserData::wrap)

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.autoscaling.AutoScalingGroup]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Whether the instances can initiate connections to anywhere by default.
         *
         * Default: true
         *
         * @param allowAllOutbound Whether the instances can initiate connections to anywhere by
         *   default.
         */
        public fun allowAllOutbound(allowAllOutbound: Boolean)

        /**
         * Whether instances in the Auto Scaling Group should have public IP addresses associated
         * with them.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - Use subnet setting.
         *
         * @param associatePublicIpAddress Whether instances in the Auto Scaling Group should have
         *   public IP addresses associated with them.
         */
        public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

        /**
         * The name of the Auto Scaling group.
         *
         * This name must be unique per Region per account.
         *
         * Default: - Auto generated by CloudFormation
         *
         * @param autoScalingGroupName The name of the Auto Scaling group.
         */
        public fun autoScalingGroupName(autoScalingGroupName: String)

        /**
         * Specifies how block devices are exposed to the instance. You can specify virtual devices
         * and EBS volumes.
         *
         * Each instance that is launched has an associated root device volume, either an Amazon EBS
         * volume or an instance store volume. You can use block device mappings to specify
         * additional EBS volumes or instance store volumes to attach to an instance when it is
         * launched.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - Uses the block device mapping of the AMI
         *
         * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
         *
         * @param blockDevices Specifies how block devices are exposed to the instance. You can
         *   specify virtual devices and EBS volumes.
         */
        public fun blockDevices(blockDevices: List<BlockDevice>)

        /**
         * Specifies how block devices are exposed to the instance. You can specify virtual devices
         * and EBS volumes.
         *
         * Each instance that is launched has an associated root device volume, either an Amazon EBS
         * volume or an instance store volume. You can use block device mappings to specify
         * additional EBS volumes or instance store volumes to attach to an instance when it is
         * launched.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - Uses the block device mapping of the AMI
         *
         * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
         *
         * @param blockDevices Specifies how block devices are exposed to the instance. You can
         *   specify virtual devices and EBS volumes.
         */
        public fun blockDevices(vararg blockDevices: BlockDevice)

        /**
         * Indicates whether Capacity Rebalancing is enabled.
         *
         * When you turn on Capacity Rebalancing, Amazon EC2 Auto Scaling attempts to launch a Spot
         * Instance whenever Amazon EC2 notifies that a Spot Instance is at an elevated risk of
         * interruption. After launching a new instance, it then terminates an old instance.
         *
         * Default: false
         *
         * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-capacityrebalance)
         *
         * @param capacityRebalance Indicates whether Capacity Rebalancing is enabled.
         */
        public fun capacityRebalance(capacityRebalance: Boolean)

        /**
         * Default scaling cooldown for this AutoScalingGroup.
         *
         * Default: Duration.minutes(5)
         *
         * @param cooldown Default scaling cooldown for this AutoScalingGroup.
         */
        public fun cooldown(cooldown: Duration)

        /**
         * The amount of time, in seconds, until a newly launched instance can contribute to the
         * Amazon CloudWatch metrics.
         *
         * This delay lets an instance finish initializing before Amazon EC2 Auto Scaling aggregates
         * instance metrics, resulting in more reliable usage data. Set this value equal to the
         * amount of time that it takes for resource consumption to become stable after an instance
         * reaches the InService state.
         *
         * To optimize the performance of scaling policies that scale continuously, such as target
         * tracking and step scaling policies, we strongly recommend that you enable the default
         * instance warmup, even if its value is set to 0 seconds
         *
         * Default instance warmup will not be added if no value is specified
         *
         * Default: None
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-default-instance-warmup.html)
         *
         * @param defaultInstanceWarmup The amount of time, in seconds, until a newly launched
         *   instance can contribute to the Amazon CloudWatch metrics.
         */
        public fun defaultInstanceWarmup(defaultInstanceWarmup: Duration)

        /**
         * Initial amount of instances in the fleet.
         *
         * If this is set to a number, every deployment will reset the amount of instances to this
         * number. It is recommended to leave this value blank.
         *
         * Default: minCapacity, and leave unchanged during deployment
         *
         * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-desiredcapacity)
         *
         * @param desiredCapacity Initial amount of instances in the fleet.
         */
        public fun desiredCapacity(desiredCapacity: Number)

        /**
         * Enable monitoring for group metrics, these metrics describe the group rather than any of
         * its instances.
         *
         * To report all group metrics use `GroupMetrics.all()` Group metrics are reported in a
         * granularity of 1 minute at no additional charge.
         *
         * Default: - no group metrics will be reported
         *
         * @param groupMetrics Enable monitoring for group metrics, these metrics describe the group
         *   rather than any of its instances.
         */
        public fun groupMetrics(groupMetrics: List<GroupMetrics>)

        /**
         * Enable monitoring for group metrics, these metrics describe the group rather than any of
         * its instances.
         *
         * To report all group metrics use `GroupMetrics.all()` Group metrics are reported in a
         * granularity of 1 minute at no additional charge.
         *
         * Default: - no group metrics will be reported
         *
         * @param groupMetrics Enable monitoring for group metrics, these metrics describe the group
         *   rather than any of its instances.
         */
        public fun groupMetrics(vararg groupMetrics: GroupMetrics)

        /**
         * Configuration for health checks.
         *
         * Default: - HealthCheck.ec2 with no grace period
         *
         * @param healthCheck Configuration for health checks.
         */
        public fun healthCheck(healthCheck: HealthCheck)

        /**
         * If the ASG has scheduled actions, don't reset unchanged group sizes.
         *
         * Only used if the ASG has scheduled actions (which may scale your ASG up or down
         * regardless of cdk deployments). If true, the size of the group will only be reset if it
         * has been changed in the CDK app. If false, the sizes will always be changed back to what
         * they were in the CDK app on deployment.
         *
         * Default: true
         *
         * @param ignoreUnmodifiedSizeProperties If the ASG has scheduled actions, don't reset
         *   unchanged group sizes.
         */
        public fun ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties: Boolean)

        /**
         * Apply the given CloudFormation Init configuration to the instances in the
         * AutoScalingGroup at startup.
         *
         * If you specify `init`, you must also specify `signals` to configure the number of
         * instances to wait for and the timeout for waiting for the init process.
         *
         * Default: - no CloudFormation init
         *
         * @param init Apply the given CloudFormation Init configuration to the instances in the
         *   AutoScalingGroup at startup.
         */
        public fun `init`(`init`: CloudFormationInit)

        /**
         * Use the given options for applying CloudFormation Init.
         *
         * Describes the configsets to use and the timeout to wait
         *
         * Default: - default options
         *
         * @param initOptions Use the given options for applying CloudFormation Init.
         */
        public fun initOptions(initOptions: ApplyCloudFormationInitOptions)

        /**
         * Use the given options for applying CloudFormation Init.
         *
         * Describes the configsets to use and the timeout to wait
         *
         * Default: - default options
         *
         * @param initOptions Use the given options for applying CloudFormation Init.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("9f4bf8238a4f4c4faec42b8663e3be1b2df8430c4fac4f2d1eb8794526897f48")
        public fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit)

        /**
         * Controls whether instances in this group are launched with detailed or basic monitoring.
         *
         * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and
         * your account is charged a fee. When you disable detailed monitoring, CloudWatch generates
         * metrics every 5 minutes.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - Monitoring.DETAILED
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics)
         *
         * @param instanceMonitoring Controls whether instances in this group are launched with
         *   detailed or basic monitoring.
         */
        public fun instanceMonitoring(instanceMonitoring: Monitoring)

        /**
         * Type of instance to launch.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - Do not provide any instance type
         *
         * @param instanceType Type of instance to launch.
         */
        public fun instanceType(instanceType: InstanceType)

        /**
         * Name of SSH keypair to grant access to instances.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - No SSH access will be possible.
         *
         * @param keyName Name of SSH keypair to grant access to instances.
         */
        public fun keyName(keyName: String)

        /**
         * Launch template to use.
         *
         * Launch configuration related settings and MixedInstancesPolicy must not be specified when
         * a launch template is specified.
         *
         * Default: - Do not provide any launch template
         *
         * @param launchTemplate Launch template to use.
         */
        public fun launchTemplate(launchTemplate: ILaunchTemplate)

        /**
         * AMI to launch.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - Do not provide any machine image
         *
         * @param machineImage AMI to launch.
         */
        public fun machineImage(machineImage: IMachineImage)

        /**
         * Maximum number of instances in the fleet.
         *
         * Default: desiredCapacity
         *
         * @param maxCapacity Maximum number of instances in the fleet.
         */
        public fun maxCapacity(maxCapacity: Number)

        /**
         * Specifies the upper threshold as a percentage of the desired capacity of the Auto Scaling
         * group.
         *
         * It represents the maximum percentage of the group that can be in service and healthy, or
         * pending, to support your workload when replacing instances.
         *
         * Value range is 0 to 100. After it's set, both `minHealthyPercentage` and
         * `maxHealthyPercentage` to -1 will clear the previously set value.
         *
         * Both or neither of `minHealthyPercentage` and `maxHealthyPercentage` must be specified,
         * and the difference between them cannot be greater than 100. A large range increases the
         * number of instances that can be replaced at the same time.
         *
         * Default: - No instance maintenance policy.
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
         *
         * @param maxHealthyPercentage Specifies the upper threshold as a percentage of the desired
         *   capacity of the Auto Scaling group.
         */
        public fun maxHealthyPercentage(maxHealthyPercentage: Number)

        /**
         * The maximum amount of time that an instance can be in service.
         *
         * The maximum duration applies to all current and future instances in the group. As an
         * instance approaches its maximum duration, it is terminated and replaced, and cannot be
         * used again.
         *
         * You must specify a value of at least 604,800 seconds (7 days). To clear a previously set
         * value, leave this property undefined.
         *
         * Default: none
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html)
         *
         * @param maxInstanceLifetime The maximum amount of time that an instance can be in service.
         */
        public fun maxInstanceLifetime(maxInstanceLifetime: Duration)

        /**
         * Minimum number of instances in the fleet.
         *
         * Default: 1
         *
         * @param minCapacity Minimum number of instances in the fleet.
         */
        public fun minCapacity(minCapacity: Number)

        /**
         * Specifies the lower threshold as a percentage of the desired capacity of the Auto Scaling
         * group.
         *
         * It represents the minimum percentage of the group to keep in service, healthy, and ready
         * to use to support your workload when replacing instances.
         *
         * Value range is 0 to 100. After it's set, both `minHealthyPercentage` and
         * `maxHealthyPercentage` to -1 will clear the previously set value.
         *
         * Both or neither of `minHealthyPercentage` and `maxHealthyPercentage` must be specified,
         * and the difference between them cannot be greater than 100. A large range increases the
         * number of instances that can be replaced at the same time.
         *
         * Default: - No instance maintenance policy.
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
         *
         * @param minHealthyPercentage Specifies the lower threshold as a percentage of the desired
         *   capacity of the Auto Scaling group.
         */
        public fun minHealthyPercentage(minHealthyPercentage: Number)

        /**
         * Mixed Instances Policy to use.
         *
         * Launch configuration related settings and Launch Template must not be specified when a
         * MixedInstancesPolicy is specified.
         *
         * Default: - Do not provide any MixedInstancesPolicy
         *
         * @param mixedInstancesPolicy Mixed Instances Policy to use.
         */
        public fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicy)

        /**
         * Mixed Instances Policy to use.
         *
         * Launch configuration related settings and Launch Template must not be specified when a
         * MixedInstancesPolicy is specified.
         *
         * Default: - Do not provide any MixedInstancesPolicy
         *
         * @param mixedInstancesPolicy Mixed Instances Policy to use.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e75eeafa05f053c8321fcc263549b07d9d8419b59fe65f3ef663d5d17dccf491")
        public fun mixedInstancesPolicy(
            mixedInstancesPolicy: MixedInstancesPolicy.Builder.() -> Unit
        )

        /**
         * Whether newly-launched instances are protected from termination by Amazon EC2 Auto
         * Scaling when scaling in.
         *
         * By default, Auto Scaling can terminate an instance at any time after launch when scaling
         * in an Auto Scaling Group, subject to the group's termination policy. However, you may
         * wish to protect newly-launched instances from being scaled in if they are going to run
         * critical applications that should not be prematurely terminated.
         *
         * This flag must be enabled if the Auto Scaling Group will be associated with an ECS
         * Capacity Provider with managed termination protection.
         *
         * Default: false
         *
         * @param newInstancesProtectedFromScaleIn Whether newly-launched instances are protected
         *   from termination by Amazon EC2 Auto Scaling when scaling in.
         */
        public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean)

        /**
         * Configure autoscaling group to send notifications about fleet changes to an SNS topic(s).
         *
         * Default: - No fleet change notifications will be sent.
         *
         * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations)
         *
         * @param notifications Configure autoscaling group to send notifications about fleet
         *   changes to an SNS topic(s).
         */
        public fun notifications(notifications: List<NotificationConfiguration>)

        /**
         * Configure autoscaling group to send notifications about fleet changes to an SNS topic(s).
         *
         * Default: - No fleet change notifications will be sent.
         *
         * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations)
         *
         * @param notifications Configure autoscaling group to send notifications about fleet
         *   changes to an SNS topic(s).
         */
        public fun notifications(vararg notifications: NotificationConfiguration)

        /**
         * Whether IMDSv2 should be required on launched instances.
         *
         * Default: false
         *
         * @param requireImdsv2 Whether IMDSv2 should be required on launched instances.
         */
        public fun requireImdsv2(requireImdsv2: Boolean)

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
         * ```
         * Role role = Role.Builder.create(this, "MyRole")
         * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
         * .build();
         * ```
         *
         * @param role An IAM role to associate with the instance profile assigned to this Auto
         *   Scaling Group.
         */
        public fun role(role: IRole)

        /**
         * Security group to launch the instances in.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - A SecurityGroup will be created if none is specified.
         *
         * @param securityGroup Security group to launch the instances in.
         */
        public fun securityGroup(securityGroup: ISecurityGroup)

        /**
         * Configure waiting for signals during deployment.
         *
         * Use this to pause the CloudFormation deployment to wait for the instances in the
         * AutoScalingGroup to report successful startup during creation and updates. The UserData
         * script needs to invoke `cfn-signal` with a success or failure code after it is done
         * setting up the instance.
         *
         * Without waiting for signals, the CloudFormation deployment will proceed as soon as the
         * AutoScalingGroup has been created or updated but before the instances in the group have
         * been started.
         *
         * For example, to have instances wait for an Elastic Load Balancing health check before
         * they signal success, add a health-check verification by using the cfn-init helper script.
         * For an example, see the verify_instance_health command in the Auto Scaling rolling
         * updates sample template:
         *
         * https://github.com/awslabs/aws-cloudformation-templates/blob/master/aws/services/AutoScaling/AutoScalingRollingUpdates.yaml
         *
         * Default: - Do not wait for signals
         *
         * @param signals Configure waiting for signals during deployment.
         */
        public fun signals(signals: Signals)

        /**
         * The maximum hourly price (in USD) to be paid for any Spot Instance launched to fulfill
         * the request.
         *
         * Spot Instances are launched when the price you specify exceeds the current Spot market
         * price.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: none
         *
         * @param spotPrice The maximum hourly price (in USD) to be paid for any Spot Instance
         *   launched to fulfill the request.
         */
        public fun spotPrice(spotPrice: String)

        /**
         * Add SSM session permissions to the instance role.
         *
         * Setting this to `true` adds the necessary permissions to connect to the instance using
         * SSM Session Manager. You can do this from the AWS Console.
         *
         * NOTE: Setting this flag to `true` may not be enough by itself. You must also use an AMI
         * that comes with the SSM Agent, or install the SSM Agent yourself. See
         * [Working with SSM Agent](https://docs.aws.amazon.com/systems-manager/latest/userguide/ssm-agent.html)
         * in the SSM Developer Guide.
         *
         * Default: false
         *
         * @param ssmSessionPermissions Add SSM session permissions to the instance role.
         */
        public fun ssmSessionPermissions(ssmSessionPermissions: Boolean)

        /**
         * A policy or a list of policies that are used to select the instances to terminate.
         *
         * The policies are executed in the order that you list them.
         *
         * Default: - `TerminationPolicy.DEFAULT`
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html)
         *
         * @param terminationPolicies A policy or a list of policies that are used to select the
         *   instances to terminate.
         */
        public fun terminationPolicies(terminationPolicies: List<TerminationPolicy>)

        /**
         * A policy or a list of policies that are used to select the instances to terminate.
         *
         * The policies are executed in the order that you list them.
         *
         * Default: - `TerminationPolicy.DEFAULT`
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html)
         *
         * @param terminationPolicies A policy or a list of policies that are used to select the
         *   instances to terminate.
         */
        public fun terminationPolicies(vararg terminationPolicies: TerminationPolicy)

        /**
         * A lambda function Arn that can be used as a custom termination policy to select the
         * instances to terminate.
         *
         * This property must be specified if the TerminationPolicy.CUSTOM_LAMBDA_FUNCTION is used.
         *
         * Default: - No lambda function Arn will be supplied
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/lambda-custom-termination-policy.html)
         *
         * @param terminationPolicyCustomLambdaFunctionArn A lambda function Arn that can be used as
         *   a custom termination policy to select the instances to terminate.
         */
        public fun terminationPolicyCustomLambdaFunctionArn(
            terminationPolicyCustomLambdaFunctionArn: String
        )

        /**
         * What to do when an AutoScalingGroup's instance configuration is changed.
         *
         * This is applied when any of the settings on the ASG are changed that affect how the
         * instances should be created (VPC, instance type, startup scripts, etc.). It indicates how
         * the existing instances should be replaced with new instances matching the new config. By
         * default, nothing is done and only new instances are launched with the new config.
         *
         * Default: - `UpdatePolicy.rollingUpdate()` if using `init`, `UpdatePolicy.none()`
         * otherwise
         *
         * @param updatePolicy What to do when an AutoScalingGroup's instance configuration is
         *   changed.
         */
        public fun updatePolicy(updatePolicy: UpdatePolicy)

        /**
         * Specific UserData to use.
         *
         * The UserData may still be mutated after creation.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - A UserData object appropriate for the MachineImage's Operating System is
         * created.
         *
         * @param userData Specific UserData to use.
         */
        public fun userData(userData: UserData)

        /**
         * VPC to launch these instances in.
         *
         * @param vpc VPC to launch these instances in.
         */
        public fun vpc(vpc: IVpc)

        /**
         * Where to place instances within the VPC.
         *
         * Default: - All Private subnets.
         *
         * @param vpcSubnets Where to place instances within the VPC.
         */
        public fun vpcSubnets(vpcSubnets: SubnetSelection)

        /**
         * Where to place instances within the VPC.
         *
         * Default: - All Private subnets.
         *
         * @param vpcSubnets Where to place instances within the VPC.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7158f9fd519eeb71de0bee62c8fdf925738ab58e57b8c6f3cc89d34317d40bd2")
        public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.autoscaling.AutoScalingGroup.Builder =
            software.amazon.awscdk.services.autoscaling.AutoScalingGroup.Builder.create(scope, id)

        /**
         * Whether the instances can initiate connections to anywhere by default.
         *
         * Default: true
         *
         * @param allowAllOutbound Whether the instances can initiate connections to anywhere by
         *   default.
         */
        override fun allowAllOutbound(allowAllOutbound: Boolean) {
            cdkBuilder.allowAllOutbound(allowAllOutbound)
        }

        /**
         * Whether instances in the Auto Scaling Group should have public IP addresses associated
         * with them.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - Use subnet setting.
         *
         * @param associatePublicIpAddress Whether instances in the Auto Scaling Group should have
         *   public IP addresses associated with them.
         */
        override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
            cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
        }

        /**
         * The name of the Auto Scaling group.
         *
         * This name must be unique per Region per account.
         *
         * Default: - Auto generated by CloudFormation
         *
         * @param autoScalingGroupName The name of the Auto Scaling group.
         */
        override fun autoScalingGroupName(autoScalingGroupName: String) {
            cdkBuilder.autoScalingGroupName(autoScalingGroupName)
        }

        /**
         * Specifies how block devices are exposed to the instance. You can specify virtual devices
         * and EBS volumes.
         *
         * Each instance that is launched has an associated root device volume, either an Amazon EBS
         * volume or an instance store volume. You can use block device mappings to specify
         * additional EBS volumes or instance store volumes to attach to an instance when it is
         * launched.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - Uses the block device mapping of the AMI
         *
         * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
         *
         * @param blockDevices Specifies how block devices are exposed to the instance. You can
         *   specify virtual devices and EBS volumes.
         */
        override fun blockDevices(blockDevices: List<BlockDevice>) {
            cdkBuilder.blockDevices(blockDevices.map(BlockDevice::unwrap))
        }

        /**
         * Specifies how block devices are exposed to the instance. You can specify virtual devices
         * and EBS volumes.
         *
         * Each instance that is launched has an associated root device volume, either an Amazon EBS
         * volume or an instance store volume. You can use block device mappings to specify
         * additional EBS volumes or instance store volumes to attach to an instance when it is
         * launched.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - Uses the block device mapping of the AMI
         *
         * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
         *
         * @param blockDevices Specifies how block devices are exposed to the instance. You can
         *   specify virtual devices and EBS volumes.
         */
        override fun blockDevices(vararg blockDevices: BlockDevice): Unit =
            blockDevices(blockDevices.toList())

        /**
         * Indicates whether Capacity Rebalancing is enabled.
         *
         * When you turn on Capacity Rebalancing, Amazon EC2 Auto Scaling attempts to launch a Spot
         * Instance whenever Amazon EC2 notifies that a Spot Instance is at an elevated risk of
         * interruption. After launching a new instance, it then terminates an old instance.
         *
         * Default: false
         *
         * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-capacityrebalance)
         *
         * @param capacityRebalance Indicates whether Capacity Rebalancing is enabled.
         */
        override fun capacityRebalance(capacityRebalance: Boolean) {
            cdkBuilder.capacityRebalance(capacityRebalance)
        }

        /**
         * Default scaling cooldown for this AutoScalingGroup.
         *
         * Default: Duration.minutes(5)
         *
         * @param cooldown Default scaling cooldown for this AutoScalingGroup.
         */
        override fun cooldown(cooldown: Duration) {
            cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
        }

        /**
         * The amount of time, in seconds, until a newly launched instance can contribute to the
         * Amazon CloudWatch metrics.
         *
         * This delay lets an instance finish initializing before Amazon EC2 Auto Scaling aggregates
         * instance metrics, resulting in more reliable usage data. Set this value equal to the
         * amount of time that it takes for resource consumption to become stable after an instance
         * reaches the InService state.
         *
         * To optimize the performance of scaling policies that scale continuously, such as target
         * tracking and step scaling policies, we strongly recommend that you enable the default
         * instance warmup, even if its value is set to 0 seconds
         *
         * Default instance warmup will not be added if no value is specified
         *
         * Default: None
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-default-instance-warmup.html)
         *
         * @param defaultInstanceWarmup The amount of time, in seconds, until a newly launched
         *   instance can contribute to the Amazon CloudWatch metrics.
         */
        override fun defaultInstanceWarmup(defaultInstanceWarmup: Duration) {
            cdkBuilder.defaultInstanceWarmup(defaultInstanceWarmup.let(Duration::unwrap))
        }

        /**
         * Initial amount of instances in the fleet.
         *
         * If this is set to a number, every deployment will reset the amount of instances to this
         * number. It is recommended to leave this value blank.
         *
         * Default: minCapacity, and leave unchanged during deployment
         *
         * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-desiredcapacity)
         *
         * @param desiredCapacity Initial amount of instances in the fleet.
         */
        override fun desiredCapacity(desiredCapacity: Number) {
            cdkBuilder.desiredCapacity(desiredCapacity)
        }

        /**
         * Enable monitoring for group metrics, these metrics describe the group rather than any of
         * its instances.
         *
         * To report all group metrics use `GroupMetrics.all()` Group metrics are reported in a
         * granularity of 1 minute at no additional charge.
         *
         * Default: - no group metrics will be reported
         *
         * @param groupMetrics Enable monitoring for group metrics, these metrics describe the group
         *   rather than any of its instances.
         */
        override fun groupMetrics(groupMetrics: List<GroupMetrics>) {
            cdkBuilder.groupMetrics(groupMetrics.map(GroupMetrics::unwrap))
        }

        /**
         * Enable monitoring for group metrics, these metrics describe the group rather than any of
         * its instances.
         *
         * To report all group metrics use `GroupMetrics.all()` Group metrics are reported in a
         * granularity of 1 minute at no additional charge.
         *
         * Default: - no group metrics will be reported
         *
         * @param groupMetrics Enable monitoring for group metrics, these metrics describe the group
         *   rather than any of its instances.
         */
        override fun groupMetrics(vararg groupMetrics: GroupMetrics): Unit =
            groupMetrics(groupMetrics.toList())

        /**
         * Configuration for health checks.
         *
         * Default: - HealthCheck.ec2 with no grace period
         *
         * @param healthCheck Configuration for health checks.
         */
        override fun healthCheck(healthCheck: HealthCheck) {
            cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
        }

        /**
         * If the ASG has scheduled actions, don't reset unchanged group sizes.
         *
         * Only used if the ASG has scheduled actions (which may scale your ASG up or down
         * regardless of cdk deployments). If true, the size of the group will only be reset if it
         * has been changed in the CDK app. If false, the sizes will always be changed back to what
         * they were in the CDK app on deployment.
         *
         * Default: true
         *
         * @param ignoreUnmodifiedSizeProperties If the ASG has scheduled actions, don't reset
         *   unchanged group sizes.
         */
        override fun ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties: Boolean) {
            cdkBuilder.ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties)
        }

        /**
         * Apply the given CloudFormation Init configuration to the instances in the
         * AutoScalingGroup at startup.
         *
         * If you specify `init`, you must also specify `signals` to configure the number of
         * instances to wait for and the timeout for waiting for the init process.
         *
         * Default: - no CloudFormation init
         *
         * @param init Apply the given CloudFormation Init configuration to the instances in the
         *   AutoScalingGroup at startup.
         */
        override fun `init`(`init`: CloudFormationInit) {
            cdkBuilder.`init`(`init`.let(CloudFormationInit::unwrap))
        }

        /**
         * Use the given options for applying CloudFormation Init.
         *
         * Describes the configsets to use and the timeout to wait
         *
         * Default: - default options
         *
         * @param initOptions Use the given options for applying CloudFormation Init.
         */
        override fun initOptions(initOptions: ApplyCloudFormationInitOptions) {
            cdkBuilder.initOptions(initOptions.let(ApplyCloudFormationInitOptions::unwrap))
        }

        /**
         * Use the given options for applying CloudFormation Init.
         *
         * Describes the configsets to use and the timeout to wait
         *
         * Default: - default options
         *
         * @param initOptions Use the given options for applying CloudFormation Init.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("9f4bf8238a4f4c4faec42b8663e3be1b2df8430c4fac4f2d1eb8794526897f48")
        override fun initOptions(
            initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit
        ): Unit = initOptions(ApplyCloudFormationInitOptions(initOptions))

        /**
         * Controls whether instances in this group are launched with detailed or basic monitoring.
         *
         * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and
         * your account is charged a fee. When you disable detailed monitoring, CloudWatch generates
         * metrics every 5 minutes.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - Monitoring.DETAILED
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html#enable-as-instance-metrics)
         *
         * @param instanceMonitoring Controls whether instances in this group are launched with
         *   detailed or basic monitoring.
         */
        override fun instanceMonitoring(instanceMonitoring: Monitoring) {
            cdkBuilder.instanceMonitoring(instanceMonitoring.let(Monitoring::unwrap))
        }

        /**
         * Type of instance to launch.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - Do not provide any instance type
         *
         * @param instanceType Type of instance to launch.
         */
        override fun instanceType(instanceType: InstanceType) {
            cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
        }

        /**
         * Name of SSH keypair to grant access to instances.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - No SSH access will be possible.
         *
         * @param keyName Name of SSH keypair to grant access to instances.
         */
        override fun keyName(keyName: String) {
            cdkBuilder.keyName(keyName)
        }

        /**
         * Launch template to use.
         *
         * Launch configuration related settings and MixedInstancesPolicy must not be specified when
         * a launch template is specified.
         *
         * Default: - Do not provide any launch template
         *
         * @param launchTemplate Launch template to use.
         */
        override fun launchTemplate(launchTemplate: ILaunchTemplate) {
            cdkBuilder.launchTemplate(launchTemplate.let(ILaunchTemplate::unwrap))
        }

        /**
         * AMI to launch.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - Do not provide any machine image
         *
         * @param machineImage AMI to launch.
         */
        override fun machineImage(machineImage: IMachineImage) {
            cdkBuilder.machineImage(machineImage.let(IMachineImage::unwrap))
        }

        /**
         * Maximum number of instances in the fleet.
         *
         * Default: desiredCapacity
         *
         * @param maxCapacity Maximum number of instances in the fleet.
         */
        override fun maxCapacity(maxCapacity: Number) {
            cdkBuilder.maxCapacity(maxCapacity)
        }

        /**
         * Specifies the upper threshold as a percentage of the desired capacity of the Auto Scaling
         * group.
         *
         * It represents the maximum percentage of the group that can be in service and healthy, or
         * pending, to support your workload when replacing instances.
         *
         * Value range is 0 to 100. After it's set, both `minHealthyPercentage` and
         * `maxHealthyPercentage` to -1 will clear the previously set value.
         *
         * Both or neither of `minHealthyPercentage` and `maxHealthyPercentage` must be specified,
         * and the difference between them cannot be greater than 100. A large range increases the
         * number of instances that can be replaced at the same time.
         *
         * Default: - No instance maintenance policy.
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
         *
         * @param maxHealthyPercentage Specifies the upper threshold as a percentage of the desired
         *   capacity of the Auto Scaling group.
         */
        override fun maxHealthyPercentage(maxHealthyPercentage: Number) {
            cdkBuilder.maxHealthyPercentage(maxHealthyPercentage)
        }

        /**
         * The maximum amount of time that an instance can be in service.
         *
         * The maximum duration applies to all current and future instances in the group. As an
         * instance approaches its maximum duration, it is terminated and replaced, and cannot be
         * used again.
         *
         * You must specify a value of at least 604,800 seconds (7 days). To clear a previously set
         * value, leave this property undefined.
         *
         * Default: none
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html)
         *
         * @param maxInstanceLifetime The maximum amount of time that an instance can be in service.
         */
        override fun maxInstanceLifetime(maxInstanceLifetime: Duration) {
            cdkBuilder.maxInstanceLifetime(maxInstanceLifetime.let(Duration::unwrap))
        }

        /**
         * Minimum number of instances in the fleet.
         *
         * Default: 1
         *
         * @param minCapacity Minimum number of instances in the fleet.
         */
        override fun minCapacity(minCapacity: Number) {
            cdkBuilder.minCapacity(minCapacity)
        }

        /**
         * Specifies the lower threshold as a percentage of the desired capacity of the Auto Scaling
         * group.
         *
         * It represents the minimum percentage of the group to keep in service, healthy, and ready
         * to use to support your workload when replacing instances.
         *
         * Value range is 0 to 100. After it's set, both `minHealthyPercentage` and
         * `maxHealthyPercentage` to -1 will clear the previously set value.
         *
         * Both or neither of `minHealthyPercentage` and `maxHealthyPercentage` must be specified,
         * and the difference between them cannot be greater than 100. A large range increases the
         * number of instances that can be replaced at the same time.
         *
         * Default: - No instance maintenance policy.
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-maintenance-policy.html)
         *
         * @param minHealthyPercentage Specifies the lower threshold as a percentage of the desired
         *   capacity of the Auto Scaling group.
         */
        override fun minHealthyPercentage(minHealthyPercentage: Number) {
            cdkBuilder.minHealthyPercentage(minHealthyPercentage)
        }

        /**
         * Mixed Instances Policy to use.
         *
         * Launch configuration related settings and Launch Template must not be specified when a
         * MixedInstancesPolicy is specified.
         *
         * Default: - Do not provide any MixedInstancesPolicy
         *
         * @param mixedInstancesPolicy Mixed Instances Policy to use.
         */
        override fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicy) {
            cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy.let(MixedInstancesPolicy::unwrap))
        }

        /**
         * Mixed Instances Policy to use.
         *
         * Launch configuration related settings and Launch Template must not be specified when a
         * MixedInstancesPolicy is specified.
         *
         * Default: - Do not provide any MixedInstancesPolicy
         *
         * @param mixedInstancesPolicy Mixed Instances Policy to use.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e75eeafa05f053c8321fcc263549b07d9d8419b59fe65f3ef663d5d17dccf491")
        override fun mixedInstancesPolicy(
            mixedInstancesPolicy: MixedInstancesPolicy.Builder.() -> Unit
        ): Unit = mixedInstancesPolicy(MixedInstancesPolicy(mixedInstancesPolicy))

        /**
         * Whether newly-launched instances are protected from termination by Amazon EC2 Auto
         * Scaling when scaling in.
         *
         * By default, Auto Scaling can terminate an instance at any time after launch when scaling
         * in an Auto Scaling Group, subject to the group's termination policy. However, you may
         * wish to protect newly-launched instances from being scaled in if they are going to run
         * critical applications that should not be prematurely terminated.
         *
         * This flag must be enabled if the Auto Scaling Group will be associated with an ECS
         * Capacity Provider with managed termination protection.
         *
         * Default: false
         *
         * @param newInstancesProtectedFromScaleIn Whether newly-launched instances are protected
         *   from termination by Amazon EC2 Auto Scaling when scaling in.
         */
        override fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean) {
            cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn)
        }

        /**
         * Configure autoscaling group to send notifications about fleet changes to an SNS topic(s).
         *
         * Default: - No fleet change notifications will be sent.
         *
         * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations)
         *
         * @param notifications Configure autoscaling group to send notifications about fleet
         *   changes to an SNS topic(s).
         */
        override fun notifications(notifications: List<NotificationConfiguration>) {
            cdkBuilder.notifications(notifications.map(NotificationConfiguration::unwrap))
        }

        /**
         * Configure autoscaling group to send notifications about fleet changes to an SNS topic(s).
         *
         * Default: - No fleet change notifications will be sent.
         *
         * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations)
         *
         * @param notifications Configure autoscaling group to send notifications about fleet
         *   changes to an SNS topic(s).
         */
        override fun notifications(vararg notifications: NotificationConfiguration): Unit =
            notifications(notifications.toList())

        /**
         * Whether IMDSv2 should be required on launched instances.
         *
         * Default: false
         *
         * @param requireImdsv2 Whether IMDSv2 should be required on launched instances.
         */
        override fun requireImdsv2(requireImdsv2: Boolean) {
            cdkBuilder.requireImdsv2(requireImdsv2)
        }

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
         * ```
         * Role role = Role.Builder.create(this, "MyRole")
         * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
         * .build();
         * ```
         *
         * @param role An IAM role to associate with the instance profile assigned to this Auto
         *   Scaling Group.
         */
        override fun role(role: IRole) {
            cdkBuilder.role(role.let(IRole::unwrap))
        }

        /**
         * Security group to launch the instances in.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - A SecurityGroup will be created if none is specified.
         *
         * @param securityGroup Security group to launch the instances in.
         */
        override fun securityGroup(securityGroup: ISecurityGroup) {
            cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
        }

        /**
         * Configure waiting for signals during deployment.
         *
         * Use this to pause the CloudFormation deployment to wait for the instances in the
         * AutoScalingGroup to report successful startup during creation and updates. The UserData
         * script needs to invoke `cfn-signal` with a success or failure code after it is done
         * setting up the instance.
         *
         * Without waiting for signals, the CloudFormation deployment will proceed as soon as the
         * AutoScalingGroup has been created or updated but before the instances in the group have
         * been started.
         *
         * For example, to have instances wait for an Elastic Load Balancing health check before
         * they signal success, add a health-check verification by using the cfn-init helper script.
         * For an example, see the verify_instance_health command in the Auto Scaling rolling
         * updates sample template:
         *
         * https://github.com/awslabs/aws-cloudformation-templates/blob/master/aws/services/AutoScaling/AutoScalingRollingUpdates.yaml
         *
         * Default: - Do not wait for signals
         *
         * @param signals Configure waiting for signals during deployment.
         */
        override fun signals(signals: Signals) {
            cdkBuilder.signals(signals.let(Signals::unwrap))
        }

        /**
         * The maximum hourly price (in USD) to be paid for any Spot Instance launched to fulfill
         * the request.
         *
         * Spot Instances are launched when the price you specify exceeds the current Spot market
         * price.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: none
         *
         * @param spotPrice The maximum hourly price (in USD) to be paid for any Spot Instance
         *   launched to fulfill the request.
         */
        override fun spotPrice(spotPrice: String) {
            cdkBuilder.spotPrice(spotPrice)
        }

        /**
         * Add SSM session permissions to the instance role.
         *
         * Setting this to `true` adds the necessary permissions to connect to the instance using
         * SSM Session Manager. You can do this from the AWS Console.
         *
         * NOTE: Setting this flag to `true` may not be enough by itself. You must also use an AMI
         * that comes with the SSM Agent, or install the SSM Agent yourself. See
         * [Working with SSM Agent](https://docs.aws.amazon.com/systems-manager/latest/userguide/ssm-agent.html)
         * in the SSM Developer Guide.
         *
         * Default: false
         *
         * @param ssmSessionPermissions Add SSM session permissions to the instance role.
         */
        override fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
            cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
        }

        /**
         * A policy or a list of policies that are used to select the instances to terminate.
         *
         * The policies are executed in the order that you list them.
         *
         * Default: - `TerminationPolicy.DEFAULT`
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html)
         *
         * @param terminationPolicies A policy or a list of policies that are used to select the
         *   instances to terminate.
         */
        override fun terminationPolicies(terminationPolicies: List<TerminationPolicy>) {
            cdkBuilder.terminationPolicies(terminationPolicies.map(TerminationPolicy::unwrap))
        }

        /**
         * A policy or a list of policies that are used to select the instances to terminate.
         *
         * The policies are executed in the order that you list them.
         *
         * Default: - `TerminationPolicy.DEFAULT`
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html)
         *
         * @param terminationPolicies A policy or a list of policies that are used to select the
         *   instances to terminate.
         */
        override fun terminationPolicies(vararg terminationPolicies: TerminationPolicy): Unit =
            terminationPolicies(terminationPolicies.toList())

        /**
         * A lambda function Arn that can be used as a custom termination policy to select the
         * instances to terminate.
         *
         * This property must be specified if the TerminationPolicy.CUSTOM_LAMBDA_FUNCTION is used.
         *
         * Default: - No lambda function Arn will be supplied
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/lambda-custom-termination-policy.html)
         *
         * @param terminationPolicyCustomLambdaFunctionArn A lambda function Arn that can be used as
         *   a custom termination policy to select the instances to terminate.
         */
        override fun terminationPolicyCustomLambdaFunctionArn(
            terminationPolicyCustomLambdaFunctionArn: String
        ) {
            cdkBuilder.terminationPolicyCustomLambdaFunctionArn(
                terminationPolicyCustomLambdaFunctionArn
            )
        }

        /**
         * What to do when an AutoScalingGroup's instance configuration is changed.
         *
         * This is applied when any of the settings on the ASG are changed that affect how the
         * instances should be created (VPC, instance type, startup scripts, etc.). It indicates how
         * the existing instances should be replaced with new instances matching the new config. By
         * default, nothing is done and only new instances are launched with the new config.
         *
         * Default: - `UpdatePolicy.rollingUpdate()` if using `init`, `UpdatePolicy.none()`
         * otherwise
         *
         * @param updatePolicy What to do when an AutoScalingGroup's instance configuration is
         *   changed.
         */
        override fun updatePolicy(updatePolicy: UpdatePolicy) {
            cdkBuilder.updatePolicy(updatePolicy.let(UpdatePolicy::unwrap))
        }

        /**
         * Specific UserData to use.
         *
         * The UserData may still be mutated after creation.
         *
         * `launchTemplate` and `mixedInstancesPolicy` must not be specified when this property is
         * specified
         *
         * Default: - A UserData object appropriate for the MachineImage's Operating System is
         * created.
         *
         * @param userData Specific UserData to use.
         */
        override fun userData(userData: UserData) {
            cdkBuilder.userData(userData.let(UserData::unwrap))
        }

        /**
         * VPC to launch these instances in.
         *
         * @param vpc VPC to launch these instances in.
         */
        override fun vpc(vpc: IVpc) {
            cdkBuilder.vpc(vpc.let(IVpc::unwrap))
        }

        /**
         * Where to place instances within the VPC.
         *
         * Default: - All Private subnets.
         *
         * @param vpcSubnets Where to place instances within the VPC.
         */
        override fun vpcSubnets(vpcSubnets: SubnetSelection) {
            cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
        }

        /**
         * Where to place instances within the VPC.
         *
         * Default: - All Private subnets.
         *
         * @param vpcSubnets Where to place instances within the VPC.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7158f9fd519eeb71de0bee62c8fdf925738ab58e57b8c6f3cc89d34317d40bd2")
        override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
            vpcSubnets(SubnetSelection(vpcSubnets))

        public fun build(): software.amazon.awscdk.services.autoscaling.AutoScalingGroup =
            cdkBuilder.build()
    }

    public companion object {
        public fun fromAutoScalingGroupName(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            autoScalingGroupName: String,
        ): IAutoScalingGroup =
            software.amazon.awscdk.services.autoscaling.AutoScalingGroup.fromAutoScalingGroupName(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    autoScalingGroupName
                )
                .let(IAutoScalingGroup::wrap)

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): AutoScalingGroup {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return AutoScalingGroup(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.autoscaling.AutoScalingGroup
        ): AutoScalingGroup = AutoScalingGroup(cdkObject)

        internal fun unwrap(
            wrapped: AutoScalingGroup
        ): software.amazon.awscdk.services.autoscaling.AutoScalingGroup = wrapped.cdkObject
    }
}
