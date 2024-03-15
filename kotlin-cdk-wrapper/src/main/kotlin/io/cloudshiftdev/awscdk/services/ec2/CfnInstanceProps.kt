@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnInstanceProps {
  public fun additionalInfo(): String? = unwrap(this).getAdditionalInfo()

  public fun affinity(): String? = unwrap(this).getAffinity()

  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

  public fun cpuOptions(): Any? = unwrap(this).getCpuOptions()

  public fun creditSpecification(): Any? = unwrap(this).getCreditSpecification()

  public fun disableApiTermination(): Any? = unwrap(this).getDisableApiTermination()

  public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

  public fun elasticGpuSpecifications(): Any? = unwrap(this).getElasticGpuSpecifications()

  public fun elasticInferenceAccelerators(): Any? = unwrap(this).getElasticInferenceAccelerators()

  public fun enclaveOptions(): Any? = unwrap(this).getEnclaveOptions()

  public fun hibernationOptions(): Any? = unwrap(this).getHibernationOptions()

  public fun hostId(): String? = unwrap(this).getHostId()

  public fun hostResourceGroupArn(): String? = unwrap(this).getHostResourceGroupArn()

  public fun iamInstanceProfile(): String? = unwrap(this).getIamInstanceProfile()

  public fun imageId(): String? = unwrap(this).getImageId()

  public fun instanceInitiatedShutdownBehavior(): String? =
      unwrap(this).getInstanceInitiatedShutdownBehavior()

  public fun instanceType(): String? = unwrap(this).getInstanceType()

  public fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

  public fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

  public fun kernelId(): String? = unwrap(this).getKernelId()

  public fun keyName(): String? = unwrap(this).getKeyName()

  public fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

  public fun licenseSpecifications(): Any? = unwrap(this).getLicenseSpecifications()

  public fun monitoring(): Any? = unwrap(this).getMonitoring()

  public fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

  public fun placementGroupName(): String? = unwrap(this).getPlacementGroupName()

  public fun privateDnsNameOptions(): Any? = unwrap(this).getPrivateDnsNameOptions()

  public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  public fun propagateTagsToVolumeOnCreation(): Any? =
      unwrap(this).getPropagateTagsToVolumeOnCreation()

  public fun ramdiskId(): String? = unwrap(this).getRamdiskId()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  public fun sourceDestCheck(): Any? = unwrap(this).getSourceDestCheck()

  public fun ssmAssociations(): Any? = unwrap(this).getSsmAssociations()

  public fun subnetId(): String? = unwrap(this).getSubnetId()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun tenancy(): String? = unwrap(this).getTenancy()

  public fun userData(): String? = unwrap(this).getUserData()

  public fun volumes(): Any? = unwrap(this).getVolumes()

  @CdkDslMarker
  public interface Builder {
    public fun additionalInfo(additionalInfo: String)

    public fun affinity(affinity: String)

    public fun availabilityZone(availabilityZone: String)

    public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

    public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

    public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

    public fun cpuOptions(cpuOptions: IResolvable)

    public fun cpuOptions(cpuOptions: CfnInstance.CpuOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75d9bfdd7e563d53d90d53e18c29c1142832f9a78be4442581d7be6bec5743c9")
    public fun cpuOptions(cpuOptions: CfnInstance.CpuOptionsProperty.Builder.() -> Unit)

    public fun creditSpecification(creditSpecification: IResolvable)

    public fun creditSpecification(creditSpecification: CfnInstance.CreditSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41da8b77c891273186a85c00f0ef2ac1933c0c9816af9e3ccf5cea1e9e6197b2")
    public
        fun creditSpecification(creditSpecification: CfnInstance.CreditSpecificationProperty.Builder.() -> Unit)

    public fun disableApiTermination(disableApiTermination: Boolean)

    public fun disableApiTermination(disableApiTermination: IResolvable)

    public fun ebsOptimized(ebsOptimized: Boolean)

    public fun ebsOptimized(ebsOptimized: IResolvable)

    public fun elasticGpuSpecifications(elasticGpuSpecifications: IResolvable)

    public fun elasticGpuSpecifications(elasticGpuSpecifications: List<Any>)

    public fun elasticGpuSpecifications(vararg elasticGpuSpecifications: Any)

    public fun elasticInferenceAccelerators(elasticInferenceAccelerators: IResolvable)

    public fun elasticInferenceAccelerators(elasticInferenceAccelerators: List<Any>)

    public fun elasticInferenceAccelerators(vararg elasticInferenceAccelerators: Any)

    public fun enclaveOptions(enclaveOptions: IResolvable)

    public fun enclaveOptions(enclaveOptions: CfnInstance.EnclaveOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d85ae7df196b14420b19ab3a85392a5a10a74a350a3592733d4a174de1033ce")
    public fun enclaveOptions(enclaveOptions: CfnInstance.EnclaveOptionsProperty.Builder.() -> Unit)

    public fun hibernationOptions(hibernationOptions: IResolvable)

    public fun hibernationOptions(hibernationOptions: CfnInstance.HibernationOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("628421170cd101f2c8fc7f6a7b593a965f21f616ccd77765a5c5ea5257d59441")
    public
        fun hibernationOptions(hibernationOptions: CfnInstance.HibernationOptionsProperty.Builder.() -> Unit)

    public fun hostId(hostId: String)

    public fun hostResourceGroupArn(hostResourceGroupArn: String)

    public fun iamInstanceProfile(iamInstanceProfile: String)

    public fun imageId(imageId: String)

    public fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: String)

    public fun instanceType(instanceType: String)

    public fun ipv6AddressCount(ipv6AddressCount: Number)

    public fun ipv6Addresses(ipv6Addresses: IResolvable)

    public fun ipv6Addresses(ipv6Addresses: List<Any>)

    public fun ipv6Addresses(vararg ipv6Addresses: Any)

    public fun kernelId(kernelId: String)

    public fun keyName(keyName: String)

    public fun launchTemplate(launchTemplate: IResolvable)

    public fun launchTemplate(launchTemplate: CfnInstance.LaunchTemplateSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e326118898904f1199750eeee8062e3036ec75ce7993b39f7c062ee9a576a10f")
    public
        fun launchTemplate(launchTemplate: CfnInstance.LaunchTemplateSpecificationProperty.Builder.() -> Unit)

    public fun licenseSpecifications(licenseSpecifications: IResolvable)

    public fun licenseSpecifications(licenseSpecifications: List<Any>)

    public fun licenseSpecifications(vararg licenseSpecifications: Any)

    public fun monitoring(monitoring: Boolean)

    public fun monitoring(monitoring: IResolvable)

    public fun networkInterfaces(networkInterfaces: IResolvable)

    public fun networkInterfaces(networkInterfaces: List<Any>)

    public fun networkInterfaces(vararg networkInterfaces: Any)

    public fun placementGroupName(placementGroupName: String)

    public fun privateDnsNameOptions(privateDnsNameOptions: IResolvable)

    public
        fun privateDnsNameOptions(privateDnsNameOptions: CfnInstance.PrivateDnsNameOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ac6d718cb39dd2d1c0790d4a269a5af4024cb27ec1e1cf3b42864818bd81afc")
    public
        fun privateDnsNameOptions(privateDnsNameOptions: CfnInstance.PrivateDnsNameOptionsProperty.Builder.() -> Unit)

    public fun privateIpAddress(privateIpAddress: String)

    public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean)

    public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: IResolvable)

    public fun ramdiskId(ramdiskId: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun securityGroups(securityGroups: List<String>)

    public fun securityGroups(vararg securityGroups: String)

    public fun sourceDestCheck(sourceDestCheck: Boolean)

    public fun sourceDestCheck(sourceDestCheck: IResolvable)

    public fun ssmAssociations(ssmAssociations: IResolvable)

    public fun ssmAssociations(ssmAssociations: List<Any>)

    public fun ssmAssociations(vararg ssmAssociations: Any)

    public fun subnetId(subnetId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tenancy(tenancy: String)

    public fun userData(userData: String)

    public fun volumes(volumes: IResolvable)

    public fun volumes(volumes: List<Any>)

    public fun volumes(vararg volumes: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnInstanceProps.Builder =
        software.amazon.awscdk.services.ec2.CfnInstanceProps.builder()

    override fun additionalInfo(additionalInfo: String) {
      cdkBuilder.additionalInfo(additionalInfo)
    }

    override fun affinity(affinity: String) {
      cdkBuilder.affinity(affinity)
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable::unwrap))
    }

    override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    override fun blockDeviceMappings(vararg blockDeviceMappings: Any): Unit =
        blockDeviceMappings(blockDeviceMappings.toList())

    override fun cpuOptions(cpuOptions: IResolvable) {
      cdkBuilder.cpuOptions(cpuOptions.let(IResolvable::unwrap))
    }

    override fun cpuOptions(cpuOptions: CfnInstance.CpuOptionsProperty) {
      cdkBuilder.cpuOptions(cpuOptions.let(CfnInstance.CpuOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75d9bfdd7e563d53d90d53e18c29c1142832f9a78be4442581d7be6bec5743c9")
    override fun cpuOptions(cpuOptions: CfnInstance.CpuOptionsProperty.Builder.() -> Unit): Unit =
        cpuOptions(CfnInstance.CpuOptionsProperty(cpuOptions))

    override fun creditSpecification(creditSpecification: IResolvable) {
      cdkBuilder.creditSpecification(creditSpecification.let(IResolvable::unwrap))
    }

    override fun creditSpecification(creditSpecification: CfnInstance.CreditSpecificationProperty) {
      cdkBuilder.creditSpecification(creditSpecification.let(CfnInstance.CreditSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41da8b77c891273186a85c00f0ef2ac1933c0c9816af9e3ccf5cea1e9e6197b2")
    override
        fun creditSpecification(creditSpecification: CfnInstance.CreditSpecificationProperty.Builder.() -> Unit):
        Unit = creditSpecification(CfnInstance.CreditSpecificationProperty(creditSpecification))

    override fun disableApiTermination(disableApiTermination: Boolean) {
      cdkBuilder.disableApiTermination(disableApiTermination)
    }

    override fun disableApiTermination(disableApiTermination: IResolvable) {
      cdkBuilder.disableApiTermination(disableApiTermination.let(IResolvable::unwrap))
    }

    override fun ebsOptimized(ebsOptimized: Boolean) {
      cdkBuilder.ebsOptimized(ebsOptimized)
    }

    override fun ebsOptimized(ebsOptimized: IResolvable) {
      cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
    }

    override fun elasticGpuSpecifications(elasticGpuSpecifications: IResolvable) {
      cdkBuilder.elasticGpuSpecifications(elasticGpuSpecifications.let(IResolvable::unwrap))
    }

    override fun elasticGpuSpecifications(elasticGpuSpecifications: List<Any>) {
      cdkBuilder.elasticGpuSpecifications(elasticGpuSpecifications)
    }

    override fun elasticGpuSpecifications(vararg elasticGpuSpecifications: Any): Unit =
        elasticGpuSpecifications(elasticGpuSpecifications.toList())

    override fun elasticInferenceAccelerators(elasticInferenceAccelerators: IResolvable) {
      cdkBuilder.elasticInferenceAccelerators(elasticInferenceAccelerators.let(IResolvable::unwrap))
    }

    override fun elasticInferenceAccelerators(elasticInferenceAccelerators: List<Any>) {
      cdkBuilder.elasticInferenceAccelerators(elasticInferenceAccelerators)
    }

    override fun elasticInferenceAccelerators(vararg elasticInferenceAccelerators: Any): Unit =
        elasticInferenceAccelerators(elasticInferenceAccelerators.toList())

    override fun enclaveOptions(enclaveOptions: IResolvable) {
      cdkBuilder.enclaveOptions(enclaveOptions.let(IResolvable::unwrap))
    }

    override fun enclaveOptions(enclaveOptions: CfnInstance.EnclaveOptionsProperty) {
      cdkBuilder.enclaveOptions(enclaveOptions.let(CfnInstance.EnclaveOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d85ae7df196b14420b19ab3a85392a5a10a74a350a3592733d4a174de1033ce")
    override
        fun enclaveOptions(enclaveOptions: CfnInstance.EnclaveOptionsProperty.Builder.() -> Unit):
        Unit = enclaveOptions(CfnInstance.EnclaveOptionsProperty(enclaveOptions))

    override fun hibernationOptions(hibernationOptions: IResolvable) {
      cdkBuilder.hibernationOptions(hibernationOptions.let(IResolvable::unwrap))
    }

    override fun hibernationOptions(hibernationOptions: CfnInstance.HibernationOptionsProperty) {
      cdkBuilder.hibernationOptions(hibernationOptions.let(CfnInstance.HibernationOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("628421170cd101f2c8fc7f6a7b593a965f21f616ccd77765a5c5ea5257d59441")
    override
        fun hibernationOptions(hibernationOptions: CfnInstance.HibernationOptionsProperty.Builder.() -> Unit):
        Unit = hibernationOptions(CfnInstance.HibernationOptionsProperty(hibernationOptions))

    override fun hostId(hostId: String) {
      cdkBuilder.hostId(hostId)
    }

    override fun hostResourceGroupArn(hostResourceGroupArn: String) {
      cdkBuilder.hostResourceGroupArn(hostResourceGroupArn)
    }

    override fun iamInstanceProfile(iamInstanceProfile: String) {
      cdkBuilder.iamInstanceProfile(iamInstanceProfile)
    }

    override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    override fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: String) {
      cdkBuilder.instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior)
    }

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun ipv6AddressCount(ipv6AddressCount: Number) {
      cdkBuilder.ipv6AddressCount(ipv6AddressCount)
    }

    override fun ipv6Addresses(ipv6Addresses: IResolvable) {
      cdkBuilder.ipv6Addresses(ipv6Addresses.let(IResolvable::unwrap))
    }

    override fun ipv6Addresses(ipv6Addresses: List<Any>) {
      cdkBuilder.ipv6Addresses(ipv6Addresses)
    }

    override fun ipv6Addresses(vararg ipv6Addresses: Any): Unit =
        ipv6Addresses(ipv6Addresses.toList())

    override fun kernelId(kernelId: String) {
      cdkBuilder.kernelId(kernelId)
    }

    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    override fun launchTemplate(launchTemplate: IResolvable) {
      cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
    }

    override fun launchTemplate(launchTemplate: CfnInstance.LaunchTemplateSpecificationProperty) {
      cdkBuilder.launchTemplate(launchTemplate.let(CfnInstance.LaunchTemplateSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e326118898904f1199750eeee8062e3036ec75ce7993b39f7c062ee9a576a10f")
    override
        fun launchTemplate(launchTemplate: CfnInstance.LaunchTemplateSpecificationProperty.Builder.() -> Unit):
        Unit = launchTemplate(CfnInstance.LaunchTemplateSpecificationProperty(launchTemplate))

    override fun licenseSpecifications(licenseSpecifications: IResolvable) {
      cdkBuilder.licenseSpecifications(licenseSpecifications.let(IResolvable::unwrap))
    }

    override fun licenseSpecifications(licenseSpecifications: List<Any>) {
      cdkBuilder.licenseSpecifications(licenseSpecifications)
    }

    override fun licenseSpecifications(vararg licenseSpecifications: Any): Unit =
        licenseSpecifications(licenseSpecifications.toList())

    override fun monitoring(monitoring: Boolean) {
      cdkBuilder.monitoring(monitoring)
    }

    override fun monitoring(monitoring: IResolvable) {
      cdkBuilder.monitoring(monitoring.let(IResolvable::unwrap))
    }

    override fun networkInterfaces(networkInterfaces: IResolvable) {
      cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable::unwrap))
    }

    override fun networkInterfaces(networkInterfaces: List<Any>) {
      cdkBuilder.networkInterfaces(networkInterfaces)
    }

    override fun networkInterfaces(vararg networkInterfaces: Any): Unit =
        networkInterfaces(networkInterfaces.toList())

    override fun placementGroupName(placementGroupName: String) {
      cdkBuilder.placementGroupName(placementGroupName)
    }

    override fun privateDnsNameOptions(privateDnsNameOptions: IResolvable) {
      cdkBuilder.privateDnsNameOptions(privateDnsNameOptions.let(IResolvable::unwrap))
    }

    override
        fun privateDnsNameOptions(privateDnsNameOptions: CfnInstance.PrivateDnsNameOptionsProperty) {
      cdkBuilder.privateDnsNameOptions(privateDnsNameOptions.let(CfnInstance.PrivateDnsNameOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ac6d718cb39dd2d1c0790d4a269a5af4024cb27ec1e1cf3b42864818bd81afc")
    override
        fun privateDnsNameOptions(privateDnsNameOptions: CfnInstance.PrivateDnsNameOptionsProperty.Builder.() -> Unit):
        Unit =
        privateDnsNameOptions(CfnInstance.PrivateDnsNameOptionsProperty(privateDnsNameOptions))

    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    override fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean) {
      cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation)
    }

    override fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: IResolvable) {
      cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation.let(IResolvable::unwrap))
    }

    override fun ramdiskId(ramdiskId: String) {
      cdkBuilder.ramdiskId(ramdiskId)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    override fun sourceDestCheck(sourceDestCheck: Boolean) {
      cdkBuilder.sourceDestCheck(sourceDestCheck)
    }

    override fun sourceDestCheck(sourceDestCheck: IResolvable) {
      cdkBuilder.sourceDestCheck(sourceDestCheck.let(IResolvable::unwrap))
    }

    override fun ssmAssociations(ssmAssociations: IResolvable) {
      cdkBuilder.ssmAssociations(ssmAssociations.let(IResolvable::unwrap))
    }

    override fun ssmAssociations(ssmAssociations: List<Any>) {
      cdkBuilder.ssmAssociations(ssmAssociations)
    }

    override fun ssmAssociations(vararg ssmAssociations: Any): Unit =
        ssmAssociations(ssmAssociations.toList())

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun tenancy(tenancy: String) {
      cdkBuilder.tenancy(tenancy)
    }

    override fun userData(userData: String) {
      cdkBuilder.userData(userData)
    }

    override fun volumes(volumes: IResolvable) {
      cdkBuilder.volumes(volumes.let(IResolvable::unwrap))
    }

    override fun volumes(volumes: List<Any>) {
      cdkBuilder.volumes(volumes)
    }

    override fun volumes(vararg volumes: Any): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnInstanceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnInstanceProps,
  ) : CdkObject(cdkObject), CfnInstanceProps {
    override fun additionalInfo(): String? = unwrap(this).getAdditionalInfo()

    override fun affinity(): String? = unwrap(this).getAffinity()

    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

    override fun cpuOptions(): Any? = unwrap(this).getCpuOptions()

    override fun creditSpecification(): Any? = unwrap(this).getCreditSpecification()

    override fun disableApiTermination(): Any? = unwrap(this).getDisableApiTermination()

    override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    override fun elasticGpuSpecifications(): Any? = unwrap(this).getElasticGpuSpecifications()

    override fun elasticInferenceAccelerators(): Any? =
        unwrap(this).getElasticInferenceAccelerators()

    override fun enclaveOptions(): Any? = unwrap(this).getEnclaveOptions()

    override fun hibernationOptions(): Any? = unwrap(this).getHibernationOptions()

    override fun hostId(): String? = unwrap(this).getHostId()

    override fun hostResourceGroupArn(): String? = unwrap(this).getHostResourceGroupArn()

    override fun iamInstanceProfile(): String? = unwrap(this).getIamInstanceProfile()

    override fun imageId(): String? = unwrap(this).getImageId()

    override fun instanceInitiatedShutdownBehavior(): String? =
        unwrap(this).getInstanceInitiatedShutdownBehavior()

    override fun instanceType(): String? = unwrap(this).getInstanceType()

    override fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

    override fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

    override fun kernelId(): String? = unwrap(this).getKernelId()

    override fun keyName(): String? = unwrap(this).getKeyName()

    override fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

    override fun licenseSpecifications(): Any? = unwrap(this).getLicenseSpecifications()

    override fun monitoring(): Any? = unwrap(this).getMonitoring()

    override fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

    override fun placementGroupName(): String? = unwrap(this).getPlacementGroupName()

    override fun privateDnsNameOptions(): Any? = unwrap(this).getPrivateDnsNameOptions()

    override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    override fun propagateTagsToVolumeOnCreation(): Any? =
        unwrap(this).getPropagateTagsToVolumeOnCreation()

    override fun ramdiskId(): String? = unwrap(this).getRamdiskId()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    override fun sourceDestCheck(): Any? = unwrap(this).getSourceDestCheck()

    override fun ssmAssociations(): Any? = unwrap(this).getSsmAssociations()

    override fun subnetId(): String? = unwrap(this).getSubnetId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun tenancy(): String? = unwrap(this).getTenancy()

    override fun userData(): String? = unwrap(this).getUserData()

    override fun volumes(): Any? = unwrap(this).getVolumes()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstanceProps):
        CfnInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProps):
        software.amazon.awscdk.services.ec2.CfnInstanceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnInstanceProps
  }
}
