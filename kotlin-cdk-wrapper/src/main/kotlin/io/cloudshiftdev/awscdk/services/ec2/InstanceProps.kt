@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface InstanceProps {
  public fun allowAllIpv6Outbound(): Boolean? = unwrap(this).getAllowAllIpv6Outbound()

  public fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

  public fun associatePublicIpAddress(): Boolean? = unwrap(this).getAssociatePublicIpAddress()

  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public fun blockDevices(): List<BlockDevice> =
      unwrap(this).getBlockDevices()?.map(BlockDevice::wrap) ?: emptyList()

  public fun creditSpecification(): CpuCredits? =
      unwrap(this).getCreditSpecification()?.let(CpuCredits::wrap)

  public fun detailedMonitoring(): Boolean? = unwrap(this).getDetailedMonitoring()

  public fun `init`(): CloudFormationInit? = unwrap(this).getInit()?.let(CloudFormationInit::wrap)

  public fun initOptions(): ApplyCloudFormationInitOptions? =
      unwrap(this).getInitOptions()?.let(ApplyCloudFormationInitOptions::wrap)

  public fun instanceName(): String? = unwrap(this).getInstanceName()

  public fun instanceType(): InstanceType

  @Deprecated(message = "deprecated in CDK")
  public fun keyName(): String? = unwrap(this).getKeyName()

  public fun keyPair(): IKeyPair? = unwrap(this).getKeyPair()?.let(IKeyPair::wrap)

  public fun machineImage(): IMachineImage

  public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  public fun propagateTagsToVolumeOnCreation(): Boolean? =
      unwrap(this).getPropagateTagsToVolumeOnCreation()

  public fun requireImdsv2(): Boolean? = unwrap(this).getRequireImdsv2()

  public fun resourceSignalTimeout(): Duration? =
      unwrap(this).getResourceSignalTimeout()?.let(Duration::wrap)

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  public fun sourceDestCheck(): Boolean? = unwrap(this).getSourceDestCheck()

  public fun ssmSessionPermissions(): Boolean? = unwrap(this).getSsmSessionPermissions()

  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  public fun userDataCausesReplacement(): Boolean? = unwrap(this).getUserDataCausesReplacement()

  public fun vpc(): IVpc

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean)

    public fun allowAllOutbound(allowAllOutbound: Boolean)

    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

    public fun availabilityZone(availabilityZone: String)

    public fun blockDevices(blockDevices: List<BlockDevice>)

    public fun blockDevices(vararg blockDevices: BlockDevice)

    public fun creditSpecification(creditSpecification: CpuCredits)

    public fun detailedMonitoring(detailedMonitoring: Boolean)

    public fun `init`(`init`: CloudFormationInit)

    public fun initOptions(initOptions: ApplyCloudFormationInitOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93ef9f027b11af4d08b697f78b8080ddc971b57648604223a8f564ca3a53ac30")
    public fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit)

    public fun instanceName(instanceName: String)

    public fun instanceType(instanceType: InstanceType)

    @Deprecated(message = "deprecated in CDK")
    public fun keyName(keyName: String)

    public fun keyPair(keyPair: IKeyPair)

    public fun machineImage(machineImage: IMachineImage)

    public fun privateIpAddress(privateIpAddress: String)

    public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean)

    public fun requireImdsv2(requireImdsv2: Boolean)

    public fun resourceSignalTimeout(resourceSignalTimeout: Duration)

    public fun role(role: IRole)

    public fun securityGroup(securityGroup: ISecurityGroup)

    public fun sourceDestCheck(sourceDestCheck: Boolean)

    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean)

    public fun userData(userData: UserData)

    public fun userDataCausesReplacement(userDataCausesReplacement: Boolean)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a080d6d88d0a0b22011c07701fb2a79d2e580884701d8362c7550488be2cdd70")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InstanceProps.Builder =
        software.amazon.awscdk.services.ec2.InstanceProps.builder()

    override fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
      cdkBuilder.allowAllIpv6Outbound(allowAllIpv6Outbound)
    }

    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun blockDevices(blockDevices: List<BlockDevice>) {
      cdkBuilder.blockDevices(blockDevices.map(BlockDevice::unwrap))
    }

    override fun blockDevices(vararg blockDevices: BlockDevice): Unit =
        blockDevices(blockDevices.toList())

    override fun creditSpecification(creditSpecification: CpuCredits) {
      cdkBuilder.creditSpecification(creditSpecification.let(CpuCredits::unwrap))
    }

    override fun detailedMonitoring(detailedMonitoring: Boolean) {
      cdkBuilder.detailedMonitoring(detailedMonitoring)
    }

    override fun `init`(`init`: CloudFormationInit) {
      cdkBuilder.`init`(`init`.let(CloudFormationInit::unwrap))
    }

    override fun initOptions(initOptions: ApplyCloudFormationInitOptions) {
      cdkBuilder.initOptions(initOptions.let(ApplyCloudFormationInitOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93ef9f027b11af4d08b697f78b8080ddc971b57648604223a8f564ca3a53ac30")
    override fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit): Unit =
        initOptions(ApplyCloudFormationInitOptions(initOptions))

    override fun instanceName(instanceName: String) {
      cdkBuilder.instanceName(instanceName)
    }

    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    override fun keyPair(keyPair: IKeyPair) {
      cdkBuilder.keyPair(keyPair.let(IKeyPair::unwrap))
    }

    override fun machineImage(machineImage: IMachineImage) {
      cdkBuilder.machineImage(machineImage.let(IMachineImage::unwrap))
    }

    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    override fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean) {
      cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation)
    }

    override fun requireImdsv2(requireImdsv2: Boolean) {
      cdkBuilder.requireImdsv2(requireImdsv2)
    }

    override fun resourceSignalTimeout(resourceSignalTimeout: Duration) {
      cdkBuilder.resourceSignalTimeout(resourceSignalTimeout.let(Duration::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    override fun sourceDestCheck(sourceDestCheck: Boolean) {
      cdkBuilder.sourceDestCheck(sourceDestCheck)
    }

    override fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
      cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    override fun userDataCausesReplacement(userDataCausesReplacement: Boolean) {
      cdkBuilder.userDataCausesReplacement(userDataCausesReplacement)
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a080d6d88d0a0b22011c07701fb2a79d2e580884701d8362c7550488be2cdd70")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.ec2.InstanceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.InstanceProps,
  ) : CdkObject(cdkObject), InstanceProps {
    override fun allowAllIpv6Outbound(): Boolean? = unwrap(this).getAllowAllIpv6Outbound()

    override fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

    override fun associatePublicIpAddress(): Boolean? = unwrap(this).getAssociatePublicIpAddress()

    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun blockDevices(): List<BlockDevice> =
        unwrap(this).getBlockDevices()?.map(BlockDevice::wrap) ?: emptyList()

    override fun creditSpecification(): CpuCredits? =
        unwrap(this).getCreditSpecification()?.let(CpuCredits::wrap)

    override fun detailedMonitoring(): Boolean? = unwrap(this).getDetailedMonitoring()

    override fun `init`(): CloudFormationInit? =
        unwrap(this).getInit()?.let(CloudFormationInit::wrap)

    override fun initOptions(): ApplyCloudFormationInitOptions? =
        unwrap(this).getInitOptions()?.let(ApplyCloudFormationInitOptions::wrap)

    override fun instanceName(): String? = unwrap(this).getInstanceName()

    override fun instanceType(): InstanceType =
        unwrap(this).getInstanceType().let(InstanceType::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun keyName(): String? = unwrap(this).getKeyName()

    override fun keyPair(): IKeyPair? = unwrap(this).getKeyPair()?.let(IKeyPair::wrap)

    override fun machineImage(): IMachineImage =
        unwrap(this).getMachineImage().let(IMachineImage::wrap)

    override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    override fun propagateTagsToVolumeOnCreation(): Boolean? =
        unwrap(this).getPropagateTagsToVolumeOnCreation()

    override fun requireImdsv2(): Boolean? = unwrap(this).getRequireImdsv2()

    override fun resourceSignalTimeout(): Duration? =
        unwrap(this).getResourceSignalTimeout()?.let(Duration::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    override fun sourceDestCheck(): Boolean? = unwrap(this).getSourceDestCheck()

    override fun ssmSessionPermissions(): Boolean? = unwrap(this).getSsmSessionPermissions()

    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

    override fun userDataCausesReplacement(): Boolean? = unwrap(this).getUserDataCausesReplacement()

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InstanceProps): InstanceProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstanceProps): software.amazon.awscdk.services.ec2.InstanceProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.InstanceProps
  }
}
