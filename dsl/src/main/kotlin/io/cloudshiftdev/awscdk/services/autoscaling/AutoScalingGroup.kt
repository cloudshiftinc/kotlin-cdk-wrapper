package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AutoScalingGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.AutoScalingGroup,
) : Resource(cdkObject), ILoadBalancerTarget, IConnectable, IApplicationLoadBalancerTarget,
    INetworkLoadBalancerTarget, IAutoScalingGroup {
  public override fun addLifecycleHook(id: String, props: BasicLifecycleHookProps): LifecycleHook =
      unwrap(this).addLifecycleHook(id,
      props.let(BasicLifecycleHookProps::unwrap)).let(LifecycleHook::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e73b58a332c5f3bcf737c3c3902fb97721571b04a55f030350ee06a5be61db31")
  public override fun addLifecycleHook(id: String,
      props: BasicLifecycleHookProps.Builder.() -> Unit): LifecycleHook = addLifecycleHook(id,
      BasicLifecycleHookProps(props))

  public open fun addSecurityGroup(securityGroup: ISecurityGroup) {
    unwrap(this).addSecurityGroup(securityGroup.let(ISecurityGroup::unwrap))
  }

  public open fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public open fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  public override fun addUserData(commands: String) {
    unwrap(this).addUserData(commands)
  }

  public override fun addWarmPool(): WarmPool = unwrap(this).addWarmPool().let(WarmPool::wrap)

  public override fun addWarmPool(options: WarmPoolOptions): WarmPool =
      unwrap(this).addWarmPool(options.let(WarmPoolOptions::unwrap)).let(WarmPool::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ebe3a17babce83c2ccb570a7464dccb7ae43140da33baacb05b1a15a27a69e43")
  public override fun addWarmPool(options: WarmPoolOptions.Builder.() -> Unit): WarmPool =
      addWarmPool(WarmPoolOptions(options))

  public open fun applyCloudFormationInit(`init`: CloudFormationInit) {
    unwrap(this).applyCloudFormationInit(`init`.let(CloudFormationInit::unwrap))
  }

  public open fun applyCloudFormationInit(`init`: CloudFormationInit,
      options: ApplyCloudFormationInitOptions) {
    unwrap(this).applyCloudFormationInit(`init`.let(CloudFormationInit::unwrap),
        options.let(ApplyCloudFormationInitOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1aad7fc9c65bc2d621e9c2ff9beede63c99e9a0a5fa587ea45ba05f97691dddf")
  public open fun applyCloudFormationInit(`init`: CloudFormationInit,
      options: ApplyCloudFormationInitOptions.Builder.() -> Unit): Unit =
      applyCloudFormationInit(`init`, ApplyCloudFormationInitOptions(options))

  public open fun areNewInstancesProtectedFromScaleIn(): Boolean =
      unwrap(this).areNewInstancesProtectedFromScaleIn()

  public override fun attachToApplicationTargetGroup(targetGroup: IApplicationTargetGroup):
      LoadBalancerTargetProps =
      unwrap(this).attachToApplicationTargetGroup(targetGroup.let(IApplicationTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)

  public override fun attachToClassicLb(loadBalancer: LoadBalancer) {
    unwrap(this).attachToClassicLB(loadBalancer.let(LoadBalancer::unwrap))
  }

  public override fun attachToNetworkTargetGroup(targetGroup: INetworkTargetGroup):
      LoadBalancerTargetProps =
      unwrap(this).attachToNetworkTargetGroup(targetGroup.let(INetworkTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)

  public override fun autoScalingGroupArn(): String = unwrap(this).getAutoScalingGroupArn()

  public override fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public open fun maxInstanceLifetime(): Duration? =
      unwrap(this).getMaxInstanceLifetime()?.let(Duration::wrap)

  public override fun osType(): OperatingSystemType =
      unwrap(this).getOsType().let(OperatingSystemType::wrap)

  public open fun protectNewInstancesFromScaleIn() {
    unwrap(this).protectNewInstancesFromScaleIn()
  }

  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  public override fun scaleOnCpuUtilization(id: String, props: CpuUtilizationScalingProps):
      TargetTrackingScalingPolicy = unwrap(this).scaleOnCpuUtilization(id,
      props.let(CpuUtilizationScalingProps::unwrap)).let(TargetTrackingScalingPolicy::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("54ff0f79a3a0e98af41f878332105ce744cc94709e6dfa3c31c968213fde0127")
  public override fun scaleOnCpuUtilization(id: String,
      props: CpuUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy =
      scaleOnCpuUtilization(id, CpuUtilizationScalingProps(props))

  public override fun scaleOnIncomingBytes(id: String, props: NetworkUtilizationScalingProps):
      TargetTrackingScalingPolicy = unwrap(this).scaleOnIncomingBytes(id,
      props.let(NetworkUtilizationScalingProps::unwrap)).let(TargetTrackingScalingPolicy::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("53d48012d390303ce4bdadda813caeca6ef440c93ff99ecf347c830212960766")
  public override fun scaleOnIncomingBytes(id: String,
      props: NetworkUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy =
      scaleOnIncomingBytes(id, NetworkUtilizationScalingProps(props))

  public override fun scaleOnMetric(id: String, props: BasicStepScalingPolicyProps):
      StepScalingPolicy = unwrap(this).scaleOnMetric(id,
      props.let(BasicStepScalingPolicyProps::unwrap)).let(StepScalingPolicy::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("97c636215f9ded1865259a4c15b81d08ffc6cf47e1b5af030d3b308ae6eba808")
  public override fun scaleOnMetric(id: String,
      props: BasicStepScalingPolicyProps.Builder.() -> Unit): StepScalingPolicy = scaleOnMetric(id,
      BasicStepScalingPolicyProps(props))

  public override fun scaleOnOutgoingBytes(id: String, props: NetworkUtilizationScalingProps):
      TargetTrackingScalingPolicy = unwrap(this).scaleOnOutgoingBytes(id,
      props.let(NetworkUtilizationScalingProps::unwrap)).let(TargetTrackingScalingPolicy::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("041c27ca62dcbebfcb1881e27b18d9a65a9e76a73700f64dc5640d2cb3dd2620")
  public override fun scaleOnOutgoingBytes(id: String,
      props: NetworkUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy =
      scaleOnOutgoingBytes(id, NetworkUtilizationScalingProps(props))

  public open fun scaleOnRequestCount(id: String, props: RequestCountScalingProps):
      TargetTrackingScalingPolicy = unwrap(this).scaleOnRequestCount(id,
      props.let(RequestCountScalingProps::unwrap)).let(TargetTrackingScalingPolicy::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cbab02933923f22a0043aff0dff376d920571515f3ac005ffb73167d68ef54b7")
  public open fun scaleOnRequestCount(id: String,
      props: RequestCountScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy =
      scaleOnRequestCount(id, RequestCountScalingProps(props))

  public override fun scaleOnSchedule(id: String, props: BasicScheduledActionProps): ScheduledAction
      = unwrap(this).scaleOnSchedule(id,
      props.let(BasicScheduledActionProps::unwrap)).let(ScheduledAction::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8a0caadcedcb277caddacbd0e88af40e8ebf1b6606474968554ce75d027168a")
  public override fun scaleOnSchedule(id: String,
      props: BasicScheduledActionProps.Builder.() -> Unit): ScheduledAction = scaleOnSchedule(id,
      BasicScheduledActionProps(props))

  public override fun scaleToTrackMetric(id: String, props: MetricTargetTrackingProps):
      TargetTrackingScalingPolicy = unwrap(this).scaleToTrackMetric(id,
      props.let(MetricTargetTrackingProps::unwrap)).let(TargetTrackingScalingPolicy::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("783dfddcfc4313e0ba0ad62e98c32ed03381c60b8a7586ca584816685414690c")
  public override fun scaleToTrackMetric(id: String,
      props: MetricTargetTrackingProps.Builder.() -> Unit): TargetTrackingScalingPolicy =
      scaleToTrackMetric(id, MetricTargetTrackingProps(props))

  public open fun spotPrice(): String? = unwrap(this).getSpotPrice()

  public open fun userData(): UserData = unwrap(this).getUserData().let(UserData::wrap)

  public interface Builder {
    public fun allowAllOutbound(allowAllOutbound: Boolean)

    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

    public fun autoScalingGroupName(autoScalingGroupName: String)

    public fun blockDevices(blockDevices: List<BlockDevice>)

    public fun blockDevices(vararg blockDevices: BlockDevice)

    public fun capacityRebalance(capacityRebalance: Boolean)

    public fun cooldown(cooldown: Duration)

    public fun defaultInstanceWarmup(defaultInstanceWarmup: Duration)

    public fun desiredCapacity(desiredCapacity: Number)

    public fun groupMetrics(groupMetrics: List<GroupMetrics>)

    public fun groupMetrics(vararg groupMetrics: GroupMetrics)

    public fun healthCheck(healthCheck: HealthCheck)

    public fun ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties: Boolean)

    public fun `init`(`init`: CloudFormationInit)

    public fun initOptions(initOptions: ApplyCloudFormationInitOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f4bf8238a4f4c4faec42b8663e3be1b2df8430c4fac4f2d1eb8794526897f48")
    public fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit)

    public fun instanceMonitoring(instanceMonitoring: Monitoring)

    public fun instanceType(instanceType: InstanceType)

    public fun keyName(keyName: String)

    public fun launchTemplate(launchTemplate: ILaunchTemplate)

    public fun machineImage(machineImage: IMachineImage)

    public fun maxCapacity(maxCapacity: Number)

    public fun maxHealthyPercentage(maxHealthyPercentage: Number)

    public fun maxInstanceLifetime(maxInstanceLifetime: Duration)

    public fun minCapacity(minCapacity: Number)

    public fun minHealthyPercentage(minHealthyPercentage: Number)

    public fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicy)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e75eeafa05f053c8321fcc263549b07d9d8419b59fe65f3ef663d5d17dccf491")
    public fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicy.Builder.() -> Unit)

    public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean)

    public fun notifications(notifications: List<NotificationConfiguration>)

    public fun notifications(vararg notifications: NotificationConfiguration)

    public fun requireImdsv2(requireImdsv2: Boolean)

    public fun role(role: IRole)

    public fun securityGroup(securityGroup: ISecurityGroup)

    public fun signals(signals: Signals)

    public fun spotPrice(spotPrice: String)

    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean)

    public fun terminationPolicies(terminationPolicies: List<TerminationPolicy>)

    public fun terminationPolicies(vararg terminationPolicies: TerminationPolicy)

    public
        fun terminationPolicyCustomLambdaFunctionArn(terminationPolicyCustomLambdaFunctionArn: String)

    public fun updatePolicy(updatePolicy: UpdatePolicy)

    public fun userData(userData: UserData)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7158f9fd519eeb71de0bee62c8fdf925738ab58e57b8c6f3cc89d34317d40bd2")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.AutoScalingGroup.Builder =
        software.amazon.awscdk.services.autoscaling.AutoScalingGroup.Builder.create(scope, id)

    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    override fun blockDevices(blockDevices: List<BlockDevice>) {
      cdkBuilder.blockDevices(blockDevices.map(BlockDevice::unwrap))
    }

    override fun blockDevices(vararg blockDevices: BlockDevice): Unit =
        blockDevices(blockDevices.toList())

    override fun capacityRebalance(capacityRebalance: Boolean) {
      cdkBuilder.capacityRebalance(capacityRebalance)
    }

    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    override fun defaultInstanceWarmup(defaultInstanceWarmup: Duration) {
      cdkBuilder.defaultInstanceWarmup(defaultInstanceWarmup.let(Duration::unwrap))
    }

    override fun desiredCapacity(desiredCapacity: Number) {
      cdkBuilder.desiredCapacity(desiredCapacity)
    }

    override fun groupMetrics(groupMetrics: List<GroupMetrics>) {
      cdkBuilder.groupMetrics(groupMetrics.map(GroupMetrics::unwrap))
    }

    override fun groupMetrics(vararg groupMetrics: GroupMetrics): Unit =
        groupMetrics(groupMetrics.toList())

    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    override fun ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties: Boolean) {
      cdkBuilder.ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties)
    }

    override fun `init`(`init`: CloudFormationInit) {
      cdkBuilder.`init`(`init`.let(CloudFormationInit::unwrap))
    }

    override fun initOptions(initOptions: ApplyCloudFormationInitOptions) {
      cdkBuilder.initOptions(initOptions.let(ApplyCloudFormationInitOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f4bf8238a4f4c4faec42b8663e3be1b2df8430c4fac4f2d1eb8794526897f48")
    override fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit): Unit =
        initOptions(ApplyCloudFormationInitOptions(initOptions))

    override fun instanceMonitoring(instanceMonitoring: Monitoring) {
      cdkBuilder.instanceMonitoring(instanceMonitoring.let(Monitoring::unwrap))
    }

    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    override fun launchTemplate(launchTemplate: ILaunchTemplate) {
      cdkBuilder.launchTemplate(launchTemplate.let(ILaunchTemplate::unwrap))
    }

    override fun machineImage(machineImage: IMachineImage) {
      cdkBuilder.machineImage(machineImage.let(IMachineImage::unwrap))
    }

    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    override fun maxHealthyPercentage(maxHealthyPercentage: Number) {
      cdkBuilder.maxHealthyPercentage(maxHealthyPercentage)
    }

    override fun maxInstanceLifetime(maxInstanceLifetime: Duration) {
      cdkBuilder.maxInstanceLifetime(maxInstanceLifetime.let(Duration::unwrap))
    }

    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    override fun minHealthyPercentage(minHealthyPercentage: Number) {
      cdkBuilder.minHealthyPercentage(minHealthyPercentage)
    }

    override fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicy) {
      cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy.let(MixedInstancesPolicy::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e75eeafa05f053c8321fcc263549b07d9d8419b59fe65f3ef663d5d17dccf491")
    override
        fun mixedInstancesPolicy(mixedInstancesPolicy: MixedInstancesPolicy.Builder.() -> Unit):
        Unit = mixedInstancesPolicy(MixedInstancesPolicy(mixedInstancesPolicy))

    override fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean) {
      cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn)
    }

    override fun notifications(notifications: List<NotificationConfiguration>) {
      cdkBuilder.notifications(notifications.map(NotificationConfiguration::unwrap))
    }

    override fun notifications(vararg notifications: NotificationConfiguration): Unit =
        notifications(notifications.toList())

    override fun requireImdsv2(requireImdsv2: Boolean) {
      cdkBuilder.requireImdsv2(requireImdsv2)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    override fun signals(signals: Signals) {
      cdkBuilder.signals(signals.let(Signals::unwrap))
    }

    override fun spotPrice(spotPrice: String) {
      cdkBuilder.spotPrice(spotPrice)
    }

    override fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
      cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    override fun terminationPolicies(terminationPolicies: List<TerminationPolicy>) {
      cdkBuilder.terminationPolicies(terminationPolicies.map(TerminationPolicy::unwrap))
    }

    override fun terminationPolicies(vararg terminationPolicies: TerminationPolicy): Unit =
        terminationPolicies(terminationPolicies.toList())

    override
        fun terminationPolicyCustomLambdaFunctionArn(terminationPolicyCustomLambdaFunctionArn: String) {
      cdkBuilder.terminationPolicyCustomLambdaFunctionArn(terminationPolicyCustomLambdaFunctionArn)
    }

    override fun updatePolicy(updatePolicy: UpdatePolicy) {
      cdkBuilder.updatePolicy(updatePolicy.let(UpdatePolicy::unwrap))
    }

    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7158f9fd519eeb71de0bee62c8fdf925738ab58e57b8c6f3cc89d34317d40bd2")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.autoscaling.AutoScalingGroup =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromAutoScalingGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      autoScalingGroupName: String,
    ): IAutoScalingGroup =
        software.amazon.awscdk.services.autoscaling.AutoScalingGroup.fromAutoScalingGroupName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, autoScalingGroupName).let(IAutoScalingGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AutoScalingGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AutoScalingGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.AutoScalingGroup):
        AutoScalingGroup = AutoScalingGroup(cdkObject)

    internal fun unwrap(wrapped: AutoScalingGroup):
        software.amazon.awscdk.services.autoscaling.AutoScalingGroup = wrapped.cdkObject
  }
}
