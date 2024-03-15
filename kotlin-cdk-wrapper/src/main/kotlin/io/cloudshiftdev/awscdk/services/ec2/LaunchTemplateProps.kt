@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IInstanceProfile
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface LaunchTemplateProps {
  public fun associatePublicIpAddress(): Boolean? = unwrap(this).getAssociatePublicIpAddress()

  public fun blockDevices(): List<BlockDevice> =
      unwrap(this).getBlockDevices()?.map(BlockDevice::wrap) ?: emptyList()

  public fun cpuCredits(): CpuCredits? = unwrap(this).getCpuCredits()?.let(CpuCredits::wrap)

  public fun detailedMonitoring(): Boolean? = unwrap(this).getDetailedMonitoring()

  public fun disableApiTermination(): Boolean? = unwrap(this).getDisableApiTermination()

  public fun ebsOptimized(): Boolean? = unwrap(this).getEbsOptimized()

  public fun hibernationConfigured(): Boolean? = unwrap(this).getHibernationConfigured()

  public fun httpEndpoint(): Boolean? = unwrap(this).getHttpEndpoint()

  public fun httpProtocolIpv6(): Boolean? = unwrap(this).getHttpProtocolIpv6()

  public fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

  public fun httpTokens(): LaunchTemplateHttpTokens? =
      unwrap(this).getHttpTokens()?.let(LaunchTemplateHttpTokens::wrap)

  public fun instanceInitiatedShutdownBehavior(): InstanceInitiatedShutdownBehavior? =
      unwrap(this).getInstanceInitiatedShutdownBehavior()?.let(InstanceInitiatedShutdownBehavior::wrap)

  public fun instanceMetadataTags(): Boolean? = unwrap(this).getInstanceMetadataTags()

  public fun instanceProfile(): IInstanceProfile? =
      unwrap(this).getInstanceProfile()?.let(IInstanceProfile::wrap)

  public fun instanceType(): InstanceType? = unwrap(this).getInstanceType()?.let(InstanceType::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun keyName(): String? = unwrap(this).getKeyName()

  public fun keyPair(): IKeyPair? = unwrap(this).getKeyPair()?.let(IKeyPair::wrap)

  public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

  public fun machineImage(): IMachineImage? =
      unwrap(this).getMachineImage()?.let(IMachineImage::wrap)

  public fun nitroEnclaveEnabled(): Boolean? = unwrap(this).getNitroEnclaveEnabled()

  public fun requireImdsv2(): Boolean? = unwrap(this).getRequireImdsv2()

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  public fun spotOptions(): LaunchTemplateSpotOptions? =
      unwrap(this).getSpotOptions()?.let(LaunchTemplateSpotOptions::wrap)

  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

    public fun blockDevices(blockDevices: List<BlockDevice>)

    public fun blockDevices(vararg blockDevices: BlockDevice)

    public fun cpuCredits(cpuCredits: CpuCredits)

    public fun detailedMonitoring(detailedMonitoring: Boolean)

    public fun disableApiTermination(disableApiTermination: Boolean)

    public fun ebsOptimized(ebsOptimized: Boolean)

    public fun hibernationConfigured(hibernationConfigured: Boolean)

    public fun httpEndpoint(httpEndpoint: Boolean)

    public fun httpProtocolIpv6(httpProtocolIpv6: Boolean)

    public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number)

    public fun httpTokens(httpTokens: LaunchTemplateHttpTokens)

    public
        fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: InstanceInitiatedShutdownBehavior)

    public fun instanceMetadataTags(instanceMetadataTags: Boolean)

    public fun instanceProfile(instanceProfile: IInstanceProfile)

    public fun instanceType(instanceType: InstanceType)

    @Deprecated(message = "deprecated in CDK")
    public fun keyName(keyName: String)

    public fun keyPair(keyPair: IKeyPair)

    public fun launchTemplateName(launchTemplateName: String)

    public fun machineImage(machineImage: IMachineImage)

    public fun nitroEnclaveEnabled(nitroEnclaveEnabled: Boolean)

    public fun requireImdsv2(requireImdsv2: Boolean)

    public fun role(role: IRole)

    public fun securityGroup(securityGroup: ISecurityGroup)

    public fun spotOptions(spotOptions: LaunchTemplateSpotOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88001c7544e45aacfe574b5dab74e5aa452d7405a9304723b27c46ee86d910cb")
    public fun spotOptions(spotOptions: LaunchTemplateSpotOptions.Builder.() -> Unit)

    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LaunchTemplateProps.Builder =
        software.amazon.awscdk.services.ec2.LaunchTemplateProps.builder()

    override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    override fun blockDevices(blockDevices: List<BlockDevice>) {
      cdkBuilder.blockDevices(blockDevices.map(BlockDevice::unwrap))
    }

    override fun blockDevices(vararg blockDevices: BlockDevice): Unit =
        blockDevices(blockDevices.toList())

    override fun cpuCredits(cpuCredits: CpuCredits) {
      cdkBuilder.cpuCredits(cpuCredits.let(CpuCredits::unwrap))
    }

    override fun detailedMonitoring(detailedMonitoring: Boolean) {
      cdkBuilder.detailedMonitoring(detailedMonitoring)
    }

    override fun disableApiTermination(disableApiTermination: Boolean) {
      cdkBuilder.disableApiTermination(disableApiTermination)
    }

    override fun ebsOptimized(ebsOptimized: Boolean) {
      cdkBuilder.ebsOptimized(ebsOptimized)
    }

    override fun hibernationConfigured(hibernationConfigured: Boolean) {
      cdkBuilder.hibernationConfigured(hibernationConfigured)
    }

    override fun httpEndpoint(httpEndpoint: Boolean) {
      cdkBuilder.httpEndpoint(httpEndpoint)
    }

    override fun httpProtocolIpv6(httpProtocolIpv6: Boolean) {
      cdkBuilder.httpProtocolIpv6(httpProtocolIpv6)
    }

    override fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
      cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
    }

    override fun httpTokens(httpTokens: LaunchTemplateHttpTokens) {
      cdkBuilder.httpTokens(httpTokens.let(LaunchTemplateHttpTokens::unwrap))
    }

    override
        fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: InstanceInitiatedShutdownBehavior) {
      cdkBuilder.instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior.let(InstanceInitiatedShutdownBehavior::unwrap))
    }

    override fun instanceMetadataTags(instanceMetadataTags: Boolean) {
      cdkBuilder.instanceMetadataTags(instanceMetadataTags)
    }

    override fun instanceProfile(instanceProfile: IInstanceProfile) {
      cdkBuilder.instanceProfile(instanceProfile.let(IInstanceProfile::unwrap))
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

    override fun launchTemplateName(launchTemplateName: String) {
      cdkBuilder.launchTemplateName(launchTemplateName)
    }

    override fun machineImage(machineImage: IMachineImage) {
      cdkBuilder.machineImage(machineImage.let(IMachineImage::unwrap))
    }

    override fun nitroEnclaveEnabled(nitroEnclaveEnabled: Boolean) {
      cdkBuilder.nitroEnclaveEnabled(nitroEnclaveEnabled)
    }

    override fun requireImdsv2(requireImdsv2: Boolean) {
      cdkBuilder.requireImdsv2(requireImdsv2)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    override fun spotOptions(spotOptions: LaunchTemplateSpotOptions) {
      cdkBuilder.spotOptions(spotOptions.let(LaunchTemplateSpotOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88001c7544e45aacfe574b5dab74e5aa452d7405a9304723b27c46ee86d910cb")
    override fun spotOptions(spotOptions: LaunchTemplateSpotOptions.Builder.() -> Unit): Unit =
        spotOptions(LaunchTemplateSpotOptions(spotOptions))

    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.LaunchTemplateProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateProps,
  ) : CdkObject(cdkObject), LaunchTemplateProps {
    override fun associatePublicIpAddress(): Boolean? = unwrap(this).getAssociatePublicIpAddress()

    override fun blockDevices(): List<BlockDevice> =
        unwrap(this).getBlockDevices()?.map(BlockDevice::wrap) ?: emptyList()

    override fun cpuCredits(): CpuCredits? = unwrap(this).getCpuCredits()?.let(CpuCredits::wrap)

    override fun detailedMonitoring(): Boolean? = unwrap(this).getDetailedMonitoring()

    override fun disableApiTermination(): Boolean? = unwrap(this).getDisableApiTermination()

    override fun ebsOptimized(): Boolean? = unwrap(this).getEbsOptimized()

    override fun hibernationConfigured(): Boolean? = unwrap(this).getHibernationConfigured()

    override fun httpEndpoint(): Boolean? = unwrap(this).getHttpEndpoint()

    override fun httpProtocolIpv6(): Boolean? = unwrap(this).getHttpProtocolIpv6()

    override fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

    override fun httpTokens(): LaunchTemplateHttpTokens? =
        unwrap(this).getHttpTokens()?.let(LaunchTemplateHttpTokens::wrap)

    override fun instanceInitiatedShutdownBehavior(): InstanceInitiatedShutdownBehavior? =
        unwrap(this).getInstanceInitiatedShutdownBehavior()?.let(InstanceInitiatedShutdownBehavior::wrap)

    override fun instanceMetadataTags(): Boolean? = unwrap(this).getInstanceMetadataTags()

    override fun instanceProfile(): IInstanceProfile? =
        unwrap(this).getInstanceProfile()?.let(IInstanceProfile::wrap)

    override fun instanceType(): InstanceType? =
        unwrap(this).getInstanceType()?.let(InstanceType::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun keyName(): String? = unwrap(this).getKeyName()

    override fun keyPair(): IKeyPair? = unwrap(this).getKeyPair()?.let(IKeyPair::wrap)

    override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    override fun machineImage(): IMachineImage? =
        unwrap(this).getMachineImage()?.let(IMachineImage::wrap)

    override fun nitroEnclaveEnabled(): Boolean? = unwrap(this).getNitroEnclaveEnabled()

    override fun requireImdsv2(): Boolean? = unwrap(this).getRequireImdsv2()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    override fun spotOptions(): LaunchTemplateSpotOptions? =
        unwrap(this).getSpotOptions()?.let(LaunchTemplateSpotOptions::wrap)

    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateProps):
        LaunchTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LaunchTemplateProps):
        software.amazon.awscdk.services.ec2.LaunchTemplateProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.LaunchTemplateProps
  }
}
