@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.CloudFormationInit
import io.cloudshiftdev.awscdk.services.ec2.ILaunchTemplate
import io.cloudshiftdev.awscdk.services.ec2.IMachineImage
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ec2.UserData
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface AutoScalingGroupProps : CommonAutoScalingGroupProps {
  public fun `init`(): CloudFormationInit? = unwrap(this).getInit()?.let(CloudFormationInit::wrap)

  public fun initOptions(): ApplyCloudFormationInitOptions? =
      unwrap(this).getInitOptions()?.let(ApplyCloudFormationInitOptions::wrap)

  public fun instanceType(): InstanceType? = unwrap(this).getInstanceType()?.let(InstanceType::wrap)

  public fun launchTemplate(): ILaunchTemplate? =
      unwrap(this).getLaunchTemplate()?.let(ILaunchTemplate::wrap)

  public fun machineImage(): IMachineImage? =
      unwrap(this).getMachineImage()?.let(IMachineImage::wrap)

  public fun maxHealthyPercentage(): Number? = unwrap(this).getMaxHealthyPercentage()

  public fun minHealthyPercentage(): Number? = unwrap(this).getMinHealthyPercentage()

  public fun mixedInstancesPolicy(): MixedInstancesPolicy? =
      unwrap(this).getMixedInstancesPolicy()?.let(MixedInstancesPolicy::wrap)

  public fun requireImdsv2(): Boolean? = unwrap(this).getRequireImdsv2()

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  public fun vpc(): IVpc

  @CdkDslMarker
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38cb54de890b9aeec1216ac0cb906bb2fa14f23c47b77c3cbb2ca3f1a814ccc8")
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18bbae299b63610b93d5bacfdf69d4068d45a4775069c30a64590ea91e113461")
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f86ae84133d5d32dd406c17b5fccfe7a939e906a245971d33533e33b15b60d6e")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.Builder =
        software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps.builder()

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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38cb54de890b9aeec1216ac0cb906bb2fa14f23c47b77c3cbb2ca3f1a814ccc8")
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18bbae299b63610b93d5bacfdf69d4068d45a4775069c30a64590ea91e113461")
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f86ae84133d5d32dd406c17b5fccfe7a939e906a245971d33533e33b15b60d6e")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps,
  ) : CdkObject(cdkObject), AutoScalingGroupProps {
    override fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

    override fun associatePublicIpAddress(): Boolean? = unwrap(this).getAssociatePublicIpAddress()

    override fun autoScalingGroupName(): String? = unwrap(this).getAutoScalingGroupName()

    override fun blockDevices(): List<BlockDevice> =
        unwrap(this).getBlockDevices()?.map(BlockDevice::wrap) ?: emptyList()

    override fun capacityRebalance(): Boolean? = unwrap(this).getCapacityRebalance()

    override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    override fun defaultInstanceWarmup(): Duration? =
        unwrap(this).getDefaultInstanceWarmup()?.let(Duration::wrap)

    override fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

    override fun groupMetrics(): List<GroupMetrics> =
        unwrap(this).getGroupMetrics()?.map(GroupMetrics::wrap) ?: emptyList()

    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    override fun ignoreUnmodifiedSizeProperties(): Boolean? =
        unwrap(this).getIgnoreUnmodifiedSizeProperties()

    override fun `init`(): CloudFormationInit? =
        unwrap(this).getInit()?.let(CloudFormationInit::wrap)

    override fun initOptions(): ApplyCloudFormationInitOptions? =
        unwrap(this).getInitOptions()?.let(ApplyCloudFormationInitOptions::wrap)

    override fun instanceMonitoring(): Monitoring? =
        unwrap(this).getInstanceMonitoring()?.let(Monitoring::wrap)

    override fun instanceType(): InstanceType? =
        unwrap(this).getInstanceType()?.let(InstanceType::wrap)

    override fun keyName(): String? = unwrap(this).getKeyName()

    override fun launchTemplate(): ILaunchTemplate? =
        unwrap(this).getLaunchTemplate()?.let(ILaunchTemplate::wrap)

    override fun machineImage(): IMachineImage? =
        unwrap(this).getMachineImage()?.let(IMachineImage::wrap)

    override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    override fun maxHealthyPercentage(): Number? = unwrap(this).getMaxHealthyPercentage()

    override fun maxInstanceLifetime(): Duration? =
        unwrap(this).getMaxInstanceLifetime()?.let(Duration::wrap)

    override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    override fun minHealthyPercentage(): Number? = unwrap(this).getMinHealthyPercentage()

    override fun mixedInstancesPolicy(): MixedInstancesPolicy? =
        unwrap(this).getMixedInstancesPolicy()?.let(MixedInstancesPolicy::wrap)

    override fun newInstancesProtectedFromScaleIn(): Boolean? =
        unwrap(this).getNewInstancesProtectedFromScaleIn()

    override fun notifications(): List<NotificationConfiguration> =
        unwrap(this).getNotifications()?.map(NotificationConfiguration::wrap) ?: emptyList()

    override fun requireImdsv2(): Boolean? = unwrap(this).getRequireImdsv2()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    override fun signals(): Signals? = unwrap(this).getSignals()?.let(Signals::wrap)

    override fun spotPrice(): String? = unwrap(this).getSpotPrice()

    override fun ssmSessionPermissions(): Boolean? = unwrap(this).getSsmSessionPermissions()

    override fun terminationPolicies(): List<TerminationPolicy> =
        unwrap(this).getTerminationPolicies()?.map(TerminationPolicy::wrap) ?: emptyList()

    override fun terminationPolicyCustomLambdaFunctionArn(): String? =
        unwrap(this).getTerminationPolicyCustomLambdaFunctionArn()

    override fun updatePolicy(): UpdatePolicy? =
        unwrap(this).getUpdatePolicy()?.let(UpdatePolicy::wrap)

    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps):
        AutoScalingGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AutoScalingGroupProps):
        software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps
  }
}
