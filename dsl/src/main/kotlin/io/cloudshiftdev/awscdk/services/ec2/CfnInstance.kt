package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstance internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun additionalInfo(): String? = unwrap(this).getAdditionalInfo()

  public open fun additionalInfo(`value`: String) {
    unwrap(this).setAdditionalInfo(`value`)
  }

  public open fun affinity(): String? = unwrap(this).getAffinity()

  public open fun affinity(`value`: String) {
    unwrap(this).setAffinity(`value`)
  }

  public open fun attrAvailabilityZone(): String = unwrap(this).getAttrAvailabilityZone()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrPrivateDnsName(): String = unwrap(this).getAttrPrivateDnsName()

  public open fun attrPrivateIp(): String = unwrap(this).getAttrPrivateIp()

  public open fun attrPublicDnsName(): String = unwrap(this).getAttrPublicDnsName()

  public open fun attrPublicIp(): String = unwrap(this).getAttrPublicIp()

  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  public open fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

  public open fun blockDeviceMappings(`value`: IResolvable) {
    unwrap(this).setBlockDeviceMappings(`value`.let(IResolvable::unwrap))
  }

  public open fun blockDeviceMappings(__idx_ac66f0: List<Any>) {
    unwrap(this).setBlockDeviceMappings(__idx_ac66f0)
  }

  public open fun blockDeviceMappings(vararg __idx_ac66f0: Any): Unit =
      blockDeviceMappings(__idx_ac66f0.toList())

  public open fun cpuOptions(): Any? = unwrap(this).getCpuOptions()

  public open fun cpuOptions(`value`: IResolvable) {
    unwrap(this).setCpuOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun cpuOptions(`value`: CpuOptionsProperty) {
    unwrap(this).setCpuOptions(`value`.let(CpuOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5d2629f18af4b772606a95484a7287ddd10b446b95a51771dad200e69d8ef45")
  public open fun cpuOptions(`value`: CpuOptionsProperty.Builder.() -> Unit): Unit =
      cpuOptions(CpuOptionsProperty(`value`))

  public open fun creditSpecification(): Any? = unwrap(this).getCreditSpecification()

  public open fun creditSpecification(`value`: IResolvable) {
    unwrap(this).setCreditSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun creditSpecification(`value`: CreditSpecificationProperty) {
    unwrap(this).setCreditSpecification(`value`.let(CreditSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e281afa738ad6808633f441ebce50d06b0f57696d1adf33fb9d1fc0e41a3b369")
  public open fun creditSpecification(`value`: CreditSpecificationProperty.Builder.() -> Unit): Unit
      = creditSpecification(CreditSpecificationProperty(`value`))

  public open fun disableApiTermination(): Any? = unwrap(this).getDisableApiTermination()

  public open fun disableApiTermination(`value`: Boolean) {
    unwrap(this).setDisableApiTermination(`value`)
  }

  public open fun disableApiTermination(`value`: IResolvable) {
    unwrap(this).setDisableApiTermination(`value`.let(IResolvable::unwrap))
  }

  public open fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

  public open fun ebsOptimized(`value`: Boolean) {
    unwrap(this).setEbsOptimized(`value`)
  }

  public open fun ebsOptimized(`value`: IResolvable) {
    unwrap(this).setEbsOptimized(`value`.let(IResolvable::unwrap))
  }

  public open fun elasticGpuSpecifications(): Any? = unwrap(this).getElasticGpuSpecifications()

  public open fun elasticGpuSpecifications(`value`: IResolvable) {
    unwrap(this).setElasticGpuSpecifications(`value`.let(IResolvable::unwrap))
  }

  public open fun elasticGpuSpecifications(__idx_ac66f0: List<Any>) {
    unwrap(this).setElasticGpuSpecifications(__idx_ac66f0)
  }

  public open fun elasticGpuSpecifications(vararg __idx_ac66f0: Any): Unit =
      elasticGpuSpecifications(__idx_ac66f0.toList())

  public open fun elasticInferenceAccelerators(): Any? =
      unwrap(this).getElasticInferenceAccelerators()

  public open fun elasticInferenceAccelerators(`value`: IResolvable) {
    unwrap(this).setElasticInferenceAccelerators(`value`.let(IResolvable::unwrap))
  }

  public open fun elasticInferenceAccelerators(__idx_ac66f0: List<Any>) {
    unwrap(this).setElasticInferenceAccelerators(__idx_ac66f0)
  }

  public open fun elasticInferenceAccelerators(vararg __idx_ac66f0: Any): Unit =
      elasticInferenceAccelerators(__idx_ac66f0.toList())

  public open fun enclaveOptions(): Any? = unwrap(this).getEnclaveOptions()

  public open fun enclaveOptions(`value`: IResolvable) {
    unwrap(this).setEnclaveOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun enclaveOptions(`value`: EnclaveOptionsProperty) {
    unwrap(this).setEnclaveOptions(`value`.let(EnclaveOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d4f3f674bcf5681180c9e7721090e0e7b85b3c2271d40b0b45852e9b209a4684")
  public open fun enclaveOptions(`value`: EnclaveOptionsProperty.Builder.() -> Unit): Unit =
      enclaveOptions(EnclaveOptionsProperty(`value`))

  public open fun hibernationOptions(): Any? = unwrap(this).getHibernationOptions()

  public open fun hibernationOptions(`value`: IResolvable) {
    unwrap(this).setHibernationOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun hibernationOptions(`value`: HibernationOptionsProperty) {
    unwrap(this).setHibernationOptions(`value`.let(HibernationOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a1daa1b727cd75c23fc47601d2198ed7d77a27aa5c3051afc107abaca836542c")
  public open fun hibernationOptions(`value`: HibernationOptionsProperty.Builder.() -> Unit): Unit =
      hibernationOptions(HibernationOptionsProperty(`value`))

  public open fun hostId(): String? = unwrap(this).getHostId()

  public open fun hostId(`value`: String) {
    unwrap(this).setHostId(`value`)
  }

  public open fun hostResourceGroupArn(): String? = unwrap(this).getHostResourceGroupArn()

  public open fun hostResourceGroupArn(`value`: String) {
    unwrap(this).setHostResourceGroupArn(`value`)
  }

  public open fun iamInstanceProfile(): String? = unwrap(this).getIamInstanceProfile()

  public open fun iamInstanceProfile(`value`: String) {
    unwrap(this).setIamInstanceProfile(`value`)
  }

  public open fun imageId(): String? = unwrap(this).getImageId()

  public open fun imageId(`value`: String) {
    unwrap(this).setImageId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceInitiatedShutdownBehavior(): String? =
      unwrap(this).getInstanceInitiatedShutdownBehavior()

  public open fun instanceInitiatedShutdownBehavior(`value`: String) {
    unwrap(this).setInstanceInitiatedShutdownBehavior(`value`)
  }

  public open fun instanceType(): String? = unwrap(this).getInstanceType()

  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  public open fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

  public open fun ipv6AddressCount(`value`: Number) {
    unwrap(this).setIpv6AddressCount(`value`)
  }

  public open fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

  public open fun ipv6Addresses(`value`: IResolvable) {
    unwrap(this).setIpv6Addresses(`value`.let(IResolvable::unwrap))
  }

  public open fun ipv6Addresses(__idx_ac66f0: List<Any>) {
    unwrap(this).setIpv6Addresses(__idx_ac66f0)
  }

  public open fun ipv6Addresses(vararg __idx_ac66f0: Any): Unit =
      ipv6Addresses(__idx_ac66f0.toList())

  public open fun kernelId(): String? = unwrap(this).getKernelId()

  public open fun kernelId(`value`: String) {
    unwrap(this).setKernelId(`value`)
  }

  public open fun keyName(): String? = unwrap(this).getKeyName()

  public open fun keyName(`value`: String) {
    unwrap(this).setKeyName(`value`)
  }

  public open fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

  public open fun launchTemplate(`value`: IResolvable) {
    unwrap(this).setLaunchTemplate(`value`.let(IResolvable::unwrap))
  }

  public open fun launchTemplate(`value`: LaunchTemplateSpecificationProperty) {
    unwrap(this).setLaunchTemplate(`value`.let(LaunchTemplateSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("535cb576814b4579419de7412d1256c1940139943ea2c243956fbc07001789a0")
  public open fun launchTemplate(`value`: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
      Unit = launchTemplate(LaunchTemplateSpecificationProperty(`value`))

  public open fun licenseSpecifications(): Any? = unwrap(this).getLicenseSpecifications()

  public open fun licenseSpecifications(`value`: IResolvable) {
    unwrap(this).setLicenseSpecifications(`value`.let(IResolvable::unwrap))
  }

  public open fun licenseSpecifications(__idx_ac66f0: List<Any>) {
    unwrap(this).setLicenseSpecifications(__idx_ac66f0)
  }

  public open fun licenseSpecifications(vararg __idx_ac66f0: Any): Unit =
      licenseSpecifications(__idx_ac66f0.toList())

  public open fun monitoring(): Any? = unwrap(this).getMonitoring()

  public open fun monitoring(`value`: Boolean) {
    unwrap(this).setMonitoring(`value`)
  }

  public open fun monitoring(`value`: IResolvable) {
    unwrap(this).setMonitoring(`value`.let(IResolvable::unwrap))
  }

  public open fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

  public open fun networkInterfaces(`value`: IResolvable) {
    unwrap(this).setNetworkInterfaces(`value`.let(IResolvable::unwrap))
  }

  public open fun networkInterfaces(__idx_ac66f0: List<Any>) {
    unwrap(this).setNetworkInterfaces(__idx_ac66f0)
  }

  public open fun networkInterfaces(vararg __idx_ac66f0: Any): Unit =
      networkInterfaces(__idx_ac66f0.toList())

  public open fun placementGroupName(): String? = unwrap(this).getPlacementGroupName()

  public open fun placementGroupName(`value`: String) {
    unwrap(this).setPlacementGroupName(`value`)
  }

  public open fun privateDnsNameOptions(): Any? = unwrap(this).getPrivateDnsNameOptions()

  public open fun privateDnsNameOptions(`value`: IResolvable) {
    unwrap(this).setPrivateDnsNameOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun privateDnsNameOptions(`value`: PrivateDnsNameOptionsProperty) {
    unwrap(this).setPrivateDnsNameOptions(`value`.let(PrivateDnsNameOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("679ef0663bdcb803470ce65281f016c218e8a62b009e4f1f3644ad6be443da6a")
  public open fun privateDnsNameOptions(`value`: PrivateDnsNameOptionsProperty.Builder.() -> Unit):
      Unit = privateDnsNameOptions(PrivateDnsNameOptionsProperty(`value`))

  public open fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  public open fun privateIpAddress(`value`: String) {
    unwrap(this).setPrivateIpAddress(`value`)
  }

  public open fun propagateTagsToVolumeOnCreation(): Any? =
      unwrap(this).getPropagateTagsToVolumeOnCreation()

  public open fun propagateTagsToVolumeOnCreation(`value`: Boolean) {
    unwrap(this).setPropagateTagsToVolumeOnCreation(`value`)
  }

  public open fun propagateTagsToVolumeOnCreation(`value`: IResolvable) {
    unwrap(this).setPropagateTagsToVolumeOnCreation(`value`.let(IResolvable::unwrap))
  }

  public open fun ramdiskId(): String? = unwrap(this).getRamdiskId()

  public open fun ramdiskId(`value`: String) {
    unwrap(this).setRamdiskId(`value`)
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  public open fun securityGroups(`value`: List<String>) {
    unwrap(this).setSecurityGroups(`value`)
  }

  public open fun securityGroups(vararg `value`: String): Unit = securityGroups(`value`.toList())

  public open fun sourceDestCheck(): Any? = unwrap(this).getSourceDestCheck()

  public open fun sourceDestCheck(`value`: Boolean) {
    unwrap(this).setSourceDestCheck(`value`)
  }

  public open fun sourceDestCheck(`value`: IResolvable) {
    unwrap(this).setSourceDestCheck(`value`.let(IResolvable::unwrap))
  }

  public open fun ssmAssociations(): Any? = unwrap(this).getSsmAssociations()

  public open fun ssmAssociations(`value`: IResolvable) {
    unwrap(this).setSsmAssociations(`value`.let(IResolvable::unwrap))
  }

  public open fun ssmAssociations(__idx_ac66f0: List<Any>) {
    unwrap(this).setSsmAssociations(__idx_ac66f0)
  }

  public open fun ssmAssociations(vararg __idx_ac66f0: Any): Unit =
      ssmAssociations(__idx_ac66f0.toList())

  public open fun subnetId(): String? = unwrap(this).getSubnetId()

  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun tenancy(): String? = unwrap(this).getTenancy()

  public open fun tenancy(`value`: String) {
    unwrap(this).setTenancy(`value`)
  }

  public open fun userData(): String? = unwrap(this).getUserData()

  public open fun userData(`value`: String) {
    unwrap(this).setUserData(`value`)
  }

  public open fun volumes(): Any? = unwrap(this).getVolumes()

  public open fun volumes(`value`: IResolvable) {
    unwrap(this).setVolumes(`value`.let(IResolvable::unwrap))
  }

  public open fun volumes(__idx_ac66f0: List<Any>) {
    unwrap(this).setVolumes(__idx_ac66f0)
  }

  public open fun volumes(vararg __idx_ac66f0: Any): Unit = volumes(__idx_ac66f0.toList())

  public interface Builder {
    public fun additionalInfo(additionalInfo: String)

    public fun affinity(affinity: String)

    public fun availabilityZone(availabilityZone: String)

    public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

    public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

    public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

    public fun cpuOptions(cpuOptions: IResolvable)

    public fun cpuOptions(cpuOptions: CpuOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("200f802d6678d49e125ebc55394f3fe219b3c76085e543b3bcf74003b51b8940")
    public fun cpuOptions(cpuOptions: CpuOptionsProperty.Builder.() -> Unit)

    public fun creditSpecification(creditSpecification: IResolvable)

    public fun creditSpecification(creditSpecification: CreditSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("557eb78c2cb1d5bc4288a9e41d6a454decbdb95ace5d44686d1217414b12da80")
    public
        fun creditSpecification(creditSpecification: CreditSpecificationProperty.Builder.() -> Unit)

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

    public fun enclaveOptions(enclaveOptions: EnclaveOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f759cdb2f8634a2d9e2950ad963a997445cd84d5a62e746ac0abfc8a77e0e5d")
    public fun enclaveOptions(enclaveOptions: EnclaveOptionsProperty.Builder.() -> Unit)

    public fun hibernationOptions(hibernationOptions: IResolvable)

    public fun hibernationOptions(hibernationOptions: HibernationOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8466dee098089da22e3064fb04b8975a80e569c6287108da8a3220d1a21b95da")
    public fun hibernationOptions(hibernationOptions: HibernationOptionsProperty.Builder.() -> Unit)

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

    public fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a96fad6d5019a3dd2182fee83a3a37fbea28f6c867f2ec0ff8c8d0b4e93680a")
    public
        fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty.Builder.() -> Unit)

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

    public fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e02ff10ec39ab61f51631930c93d6b96606843794b59eeb8c716656ba4304b9")
    public
        fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsProperty.Builder.() -> Unit)

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnInstance.Builder =
        software.amazon.awscdk.services.ec2.CfnInstance.Builder.create(scope, id)

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

    override fun cpuOptions(cpuOptions: CpuOptionsProperty) {
      cdkBuilder.cpuOptions(cpuOptions.let(CpuOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("200f802d6678d49e125ebc55394f3fe219b3c76085e543b3bcf74003b51b8940")
    override fun cpuOptions(cpuOptions: CpuOptionsProperty.Builder.() -> Unit): Unit =
        cpuOptions(CpuOptionsProperty(cpuOptions))

    override fun creditSpecification(creditSpecification: IResolvable) {
      cdkBuilder.creditSpecification(creditSpecification.let(IResolvable::unwrap))
    }

    override fun creditSpecification(creditSpecification: CreditSpecificationProperty) {
      cdkBuilder.creditSpecification(creditSpecification.let(CreditSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("557eb78c2cb1d5bc4288a9e41d6a454decbdb95ace5d44686d1217414b12da80")
    override
        fun creditSpecification(creditSpecification: CreditSpecificationProperty.Builder.() -> Unit):
        Unit = creditSpecification(CreditSpecificationProperty(creditSpecification))

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

    override fun enclaveOptions(enclaveOptions: EnclaveOptionsProperty) {
      cdkBuilder.enclaveOptions(enclaveOptions.let(EnclaveOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f759cdb2f8634a2d9e2950ad963a997445cd84d5a62e746ac0abfc8a77e0e5d")
    override fun enclaveOptions(enclaveOptions: EnclaveOptionsProperty.Builder.() -> Unit): Unit =
        enclaveOptions(EnclaveOptionsProperty(enclaveOptions))

    override fun hibernationOptions(hibernationOptions: IResolvable) {
      cdkBuilder.hibernationOptions(hibernationOptions.let(IResolvable::unwrap))
    }

    override fun hibernationOptions(hibernationOptions: HibernationOptionsProperty) {
      cdkBuilder.hibernationOptions(hibernationOptions.let(HibernationOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8466dee098089da22e3064fb04b8975a80e569c6287108da8a3220d1a21b95da")
    override
        fun hibernationOptions(hibernationOptions: HibernationOptionsProperty.Builder.() -> Unit):
        Unit = hibernationOptions(HibernationOptionsProperty(hibernationOptions))

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

    override fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty) {
      cdkBuilder.launchTemplate(launchTemplate.let(LaunchTemplateSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a96fad6d5019a3dd2182fee83a3a37fbea28f6c867f2ec0ff8c8d0b4e93680a")
    override
        fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
        Unit = launchTemplate(LaunchTemplateSpecificationProperty(launchTemplate))

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

    override fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsProperty) {
      cdkBuilder.privateDnsNameOptions(privateDnsNameOptions.let(PrivateDnsNameOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e02ff10ec39ab61f51631930c93d6b96606843794b59eeb8c716656ba4304b9")
    override
        fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsProperty.Builder.() -> Unit):
        Unit = privateDnsNameOptions(PrivateDnsNameOptionsProperty(privateDnsNameOptions))

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

    public fun build(): software.amazon.awscdk.services.ec2.CfnInstance = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance): CfnInstance =
        CfnInstance(cdkObject)

    internal fun unwrap(wrapped: CfnInstance): software.amazon.awscdk.services.ec2.CfnInstance =
        wrapped.cdkObject
  }

  public interface CreditSpecificationProperty {
    public fun cpuCredits(): String? = unwrap(this).getCpuCredits()

    public interface Builder {
      public fun cpuCredits(cpuCredits: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.CreditSpecificationProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.CreditSpecificationProperty.builder()

      override fun cpuCredits(cpuCredits: String) {
        cdkBuilder.cpuCredits(cpuCredits)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.CreditSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.CreditSpecificationProperty,
    ) : CreditSpecificationProperty {
      override fun cpuCredits(): String? = unwrap(this).getCpuCredits()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CreditSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.CreditSpecificationProperty):
          CreditSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CreditSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.CreditSpecificationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InstanceIpv6AddressProperty {
    public fun ipv6Address(): String

    public interface Builder {
      public fun ipv6Address(ipv6Address: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.InstanceIpv6AddressProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.InstanceIpv6AddressProperty.builder()

      override fun ipv6Address(ipv6Address: String) {
        cdkBuilder.ipv6Address(ipv6Address)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.InstanceIpv6AddressProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.InstanceIpv6AddressProperty,
    ) : InstanceIpv6AddressProperty {
      override fun ipv6Address(): String = unwrap(this).getIpv6Address()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceIpv6AddressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.InstanceIpv6AddressProperty):
          InstanceIpv6AddressProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceIpv6AddressProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.InstanceIpv6AddressProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VolumeProperty {
    public fun device(): String

    public fun volumeId(): String

    public interface Builder {
      public fun device(device: String)

      public fun volumeId(volumeId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnInstance.VolumeProperty.Builder
          = software.amazon.awscdk.services.ec2.CfnInstance.VolumeProperty.builder()

      override fun device(device: String) {
        cdkBuilder.device(device)
      }

      override fun volumeId(volumeId: String) {
        cdkBuilder.volumeId(volumeId)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.VolumeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.VolumeProperty,
    ) : VolumeProperty {
      override fun device(): String = unwrap(this).getDevice()

      override fun volumeId(): String = unwrap(this).getVolumeId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.VolumeProperty):
          VolumeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.VolumeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EbsProperty {
    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    public fun iops(): Number? = unwrap(this).getIops()

    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun snapshotId(): String? = unwrap(this).getSnapshotId()

    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    public fun volumeType(): String? = unwrap(this).getVolumeType()

    public interface Builder {
      public fun deleteOnTermination(deleteOnTermination: Boolean)

      public fun deleteOnTermination(deleteOnTermination: IResolvable)

      public fun encrypted(encrypted: Boolean)

      public fun encrypted(encrypted: IResolvable)

      public fun iops(iops: Number)

      public fun kmsKeyId(kmsKeyId: String)

      public fun snapshotId(snapshotId: String)

      public fun volumeSize(volumeSize: Number)

      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnInstance.EbsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.EbsProperty.builder()

      override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
      }

      override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
      }

      override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.EbsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.EbsProperty,
    ) : EbsProperty {
      override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      override fun encrypted(): Any? = unwrap(this).getEncrypted()

      override fun iops(): Number? = unwrap(this).getIops()

      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun snapshotId(): String? = unwrap(this).getSnapshotId()

      override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EbsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.EbsProperty):
          EbsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.EbsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PrivateDnsNameOptionsProperty {
    public fun enableResourceNameDnsARecord(): Any? = unwrap(this).getEnableResourceNameDnsARecord()

    public fun enableResourceNameDnsAaaaRecord(): Any? =
        unwrap(this).getEnableResourceNameDnsAaaaRecord()

    public fun hostnameType(): String? = unwrap(this).getHostnameType()

    public interface Builder {
      public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean)

      public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable)

      public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean)

      public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable)

      public fun hostnameType(hostnameType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateDnsNameOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateDnsNameOptionsProperty.builder()

      override fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord)
      }

      override fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord.let(IResolvable::unwrap))
      }

      override fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord)
      }

      override fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord.let(IResolvable::unwrap))
      }

      override fun hostnameType(hostnameType: String) {
        cdkBuilder.hostnameType(hostnameType)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateDnsNameOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateDnsNameOptionsProperty,
    ) : PrivateDnsNameOptionsProperty {
      override fun enableResourceNameDnsARecord(): Any? =
          unwrap(this).getEnableResourceNameDnsARecord()

      override fun enableResourceNameDnsAaaaRecord(): Any? =
          unwrap(this).getEnableResourceNameDnsAaaaRecord()

      override fun hostnameType(): String? = unwrap(this).getHostnameType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateDnsNameOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.PrivateDnsNameOptionsProperty):
          PrivateDnsNameOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateDnsNameOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateDnsNameOptionsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EnclaveOptionsProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.EnclaveOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.EnclaveOptionsProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.EnclaveOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.EnclaveOptionsProperty,
    ) : EnclaveOptionsProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnclaveOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.EnclaveOptionsProperty):
          EnclaveOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnclaveOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.EnclaveOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NoDeviceProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.NoDeviceProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.NoDeviceProperty.builder()

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.NoDeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.NoDeviceProperty,
    ) : NoDeviceProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NoDeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.NoDeviceProperty):
          NoDeviceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NoDeviceProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.NoDeviceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PrivateIpAddressSpecificationProperty {
    public fun primary(): Any

    public fun privateIpAddress(): String

    public interface Builder {
      public fun primary(primary: Boolean)

      public fun primary(primary: IResolvable)

      public fun privateIpAddress(privateIpAddress: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateIpAddressSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateIpAddressSpecificationProperty.builder()

      override fun primary(primary: Boolean) {
        cdkBuilder.primary(primary)
      }

      override fun primary(primary: IResolvable) {
        cdkBuilder.primary(primary.let(IResolvable::unwrap))
      }

      override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateIpAddressSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateIpAddressSpecificationProperty,
    ) : PrivateIpAddressSpecificationProperty {
      override fun primary(): Any = unwrap(this).getPrimary()

      override fun privateIpAddress(): String = unwrap(this).getPrivateIpAddress()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PrivateIpAddressSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.PrivateIpAddressSpecificationProperty):
          PrivateIpAddressSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateIpAddressSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateIpAddressSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HibernationOptionsProperty {
    public fun configured(): Any? = unwrap(this).getConfigured()

    public interface Builder {
      public fun configured(configured: Boolean)

      public fun configured(configured: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.HibernationOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.HibernationOptionsProperty.builder()

      override fun configured(configured: Boolean) {
        cdkBuilder.configured(configured)
      }

      override fun configured(configured: IResolvable) {
        cdkBuilder.configured(configured.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.HibernationOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.HibernationOptionsProperty,
    ) : HibernationOptionsProperty {
      override fun configured(): Any? = unwrap(this).getConfigured()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HibernationOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.HibernationOptionsProperty):
          HibernationOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HibernationOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.HibernationOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LicenseSpecificationProperty {
    public fun licenseConfigurationArn(): String

    public interface Builder {
      public fun licenseConfigurationArn(licenseConfigurationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.LicenseSpecificationProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.LicenseSpecificationProperty.builder()

      override fun licenseConfigurationArn(licenseConfigurationArn: String) {
        cdkBuilder.licenseConfigurationArn(licenseConfigurationArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.LicenseSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.LicenseSpecificationProperty,
    ) : LicenseSpecificationProperty {
      override fun licenseConfigurationArn(): String = unwrap(this).getLicenseConfigurationArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LicenseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.LicenseSpecificationProperty):
          LicenseSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LicenseSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.LicenseSpecificationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NetworkInterfaceProperty {
    public fun associateCarrierIpAddress(): Any? = unwrap(this).getAssociateCarrierIpAddress()

    public fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    public fun description(): String? = unwrap(this).getDescription()

    public fun deviceIndex(): String

    public fun groupSet(): List<String> = unwrap(this).getGroupSet() ?: emptyList()

    public fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

    public fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

    public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    public fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

    public fun secondaryPrivateIpAddressCount(): Number? =
        unwrap(this).getSecondaryPrivateIpAddressCount()

    public fun subnetId(): String? = unwrap(this).getSubnetId()

    public interface Builder {
      public fun associateCarrierIpAddress(associateCarrierIpAddress: Boolean)

      public fun associateCarrierIpAddress(associateCarrierIpAddress: IResolvable)

      public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

      public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable)

      public fun deleteOnTermination(deleteOnTermination: Boolean)

      public fun deleteOnTermination(deleteOnTermination: IResolvable)

      public fun description(description: String)

      public fun deviceIndex(deviceIndex: String)

      public fun groupSet(groupSet: List<String>)

      public fun groupSet(vararg groupSet: String)

      public fun ipv6AddressCount(ipv6AddressCount: Number)

      public fun ipv6Addresses(ipv6Addresses: IResolvable)

      public fun ipv6Addresses(ipv6Addresses: List<Any>)

      public fun ipv6Addresses(vararg ipv6Addresses: Any)

      public fun networkInterfaceId(networkInterfaceId: String)

      public fun privateIpAddress(privateIpAddress: String)

      public fun privateIpAddresses(privateIpAddresses: IResolvable)

      public fun privateIpAddresses(privateIpAddresses: List<Any>)

      public fun privateIpAddresses(vararg privateIpAddresses: Any)

      public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number)

      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.NetworkInterfaceProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.NetworkInterfaceProperty.builder()

      override fun associateCarrierIpAddress(associateCarrierIpAddress: Boolean) {
        cdkBuilder.associateCarrierIpAddress(associateCarrierIpAddress)
      }

      override fun associateCarrierIpAddress(associateCarrierIpAddress: IResolvable) {
        cdkBuilder.associateCarrierIpAddress(associateCarrierIpAddress.let(IResolvable::unwrap))
      }

      override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
      }

      override fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress.let(IResolvable::unwrap))
      }

      override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
      }

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun deviceIndex(deviceIndex: String) {
        cdkBuilder.deviceIndex(deviceIndex)
      }

      override fun groupSet(groupSet: List<String>) {
        cdkBuilder.groupSet(groupSet)
      }

      override fun groupSet(vararg groupSet: String): Unit = groupSet(groupSet.toList())

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

      override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
      }

      override fun privateIpAddresses(privateIpAddresses: IResolvable) {
        cdkBuilder.privateIpAddresses(privateIpAddresses.let(IResolvable::unwrap))
      }

      override fun privateIpAddresses(privateIpAddresses: List<Any>) {
        cdkBuilder.privateIpAddresses(privateIpAddresses)
      }

      override fun privateIpAddresses(vararg privateIpAddresses: Any): Unit =
          privateIpAddresses(privateIpAddresses.toList())

      override fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
        cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
      }

      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.NetworkInterfaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.NetworkInterfaceProperty,
    ) : NetworkInterfaceProperty {
      override fun associateCarrierIpAddress(): Any? = unwrap(this).getAssociateCarrierIpAddress()

      override fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

      override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      override fun description(): String? = unwrap(this).getDescription()

      override fun deviceIndex(): String = unwrap(this).getDeviceIndex()

      override fun groupSet(): List<String> = unwrap(this).getGroupSet() ?: emptyList()

      override fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

      override fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

      override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

      override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

      override fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

      override fun secondaryPrivateIpAddressCount(): Number? =
          unwrap(this).getSecondaryPrivateIpAddressCount()

      override fun subnetId(): String? = unwrap(this).getSubnetId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.NetworkInterfaceProperty):
          NetworkInterfaceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.NetworkInterfaceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AssociationParameterProperty {
    public fun key(): String

    public fun `value`(): List<String>

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: List<String>)

      public fun `value`(vararg `value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: List<String>) {
        cdkBuilder.`value`(`value`)
      }

      override fun `value`(vararg `value`: String): Unit = `value`(`value`.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty,
    ) : AssociationParameterProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): List<String> = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssociationParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty):
          AssociationParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssociationParameterProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BlockDeviceMappingProperty {
    public fun deviceName(): String

    public fun ebs(): Any? = unwrap(this).getEbs()

    public fun noDevice(): Any? = unwrap(this).getNoDevice()

    public fun virtualName(): String? = unwrap(this).getVirtualName()

    public interface Builder {
      public fun deviceName(deviceName: String)

      public fun ebs(ebs: IResolvable)

      public fun ebs(ebs: EbsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa51ff763aa8bf568c51574263c3aeb2be7d9ce9d74abe4520311ed1d8e0670e")
      public fun ebs(ebs: EbsProperty.Builder.() -> Unit)

      public fun noDevice(noDevice: IResolvable)

      public fun noDevice(noDevice: NoDeviceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2139cab1e957880340ddab108f407982c3aa163ffd0d1078ad6d0ca94c0bc64e")
      public fun noDevice(noDevice: NoDeviceProperty.Builder.() -> Unit)

      public fun virtualName(virtualName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.BlockDeviceMappingProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.BlockDeviceMappingProperty.builder()

      override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      override fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs.let(IResolvable::unwrap))
      }

      override fun ebs(ebs: EbsProperty) {
        cdkBuilder.ebs(ebs.let(EbsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa51ff763aa8bf568c51574263c3aeb2be7d9ce9d74abe4520311ed1d8e0670e")
      override fun ebs(ebs: EbsProperty.Builder.() -> Unit): Unit = ebs(EbsProperty(ebs))

      override fun noDevice(noDevice: IResolvable) {
        cdkBuilder.noDevice(noDevice.let(IResolvable::unwrap))
      }

      override fun noDevice(noDevice: NoDeviceProperty) {
        cdkBuilder.noDevice(noDevice.let(NoDeviceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2139cab1e957880340ddab108f407982c3aa163ffd0d1078ad6d0ca94c0bc64e")
      override fun noDevice(noDevice: NoDeviceProperty.Builder.() -> Unit): Unit =
          noDevice(NoDeviceProperty(noDevice))

      override fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.BlockDeviceMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.BlockDeviceMappingProperty,
    ) : BlockDeviceMappingProperty {
      override fun deviceName(): String = unwrap(this).getDeviceName()

      override fun ebs(): Any? = unwrap(this).getEbs()

      override fun noDevice(): Any? = unwrap(this).getNoDevice()

      override fun virtualName(): String? = unwrap(this).getVirtualName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BlockDeviceMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.BlockDeviceMappingProperty):
          BlockDeviceMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockDeviceMappingProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.BlockDeviceMappingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SsmAssociationProperty {
    public fun associationParameters(): Any? = unwrap(this).getAssociationParameters()

    public fun documentName(): String

    public interface Builder {
      public fun associationParameters(associationParameters: IResolvable)

      public fun associationParameters(associationParameters: List<Any>)

      public fun associationParameters(vararg associationParameters: Any)

      public fun documentName(documentName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty.builder()

      override fun associationParameters(associationParameters: IResolvable) {
        cdkBuilder.associationParameters(associationParameters.let(IResolvable::unwrap))
      }

      override fun associationParameters(associationParameters: List<Any>) {
        cdkBuilder.associationParameters(associationParameters)
      }

      override fun associationParameters(vararg associationParameters: Any): Unit =
          associationParameters(associationParameters.toList())

      override fun documentName(documentName: String) {
        cdkBuilder.documentName(documentName)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty,
    ) : SsmAssociationProperty {
      override fun associationParameters(): Any? = unwrap(this).getAssociationParameters()

      override fun documentName(): String = unwrap(this).getDocumentName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SsmAssociationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty):
          SsmAssociationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SsmAssociationProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CpuOptionsProperty {
    public fun coreCount(): Number? = unwrap(this).getCoreCount()

    public fun threadsPerCore(): Number? = unwrap(this).getThreadsPerCore()

    public interface Builder {
      public fun coreCount(coreCount: Number)

      public fun threadsPerCore(threadsPerCore: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.CpuOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.CpuOptionsProperty.builder()

      override fun coreCount(coreCount: Number) {
        cdkBuilder.coreCount(coreCount)
      }

      override fun threadsPerCore(threadsPerCore: Number) {
        cdkBuilder.threadsPerCore(threadsPerCore)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.CpuOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.CpuOptionsProperty,
    ) : CpuOptionsProperty {
      override fun coreCount(): Number? = unwrap(this).getCoreCount()

      override fun threadsPerCore(): Number? = unwrap(this).getThreadsPerCore()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CpuOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.CpuOptionsProperty):
          CpuOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CpuOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.CpuOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ElasticInferenceAcceleratorProperty {
    public fun count(): Number? = unwrap(this).getCount()

    public fun type(): String

    public interface Builder {
      public fun count(count: Number)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty.builder()

      override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty,
    ) : ElasticInferenceAcceleratorProperty {
      override fun count(): Number? = unwrap(this).getCount()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ElasticInferenceAcceleratorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty):
          ElasticInferenceAcceleratorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticInferenceAcceleratorProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ElasticGpuSpecificationProperty {
    public fun type(): String

    public interface Builder {
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticGpuSpecificationProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticGpuSpecificationProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticGpuSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticGpuSpecificationProperty,
    ) : ElasticGpuSpecificationProperty {
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ElasticGpuSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.ElasticGpuSpecificationProperty):
          ElasticGpuSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticGpuSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticGpuSpecificationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface LaunchTemplateSpecificationProperty {
    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    public fun version(): String

    public interface Builder {
      public fun launchTemplateId(launchTemplateId: String)

      public fun launchTemplateName(launchTemplateName: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.LaunchTemplateSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnInstance.LaunchTemplateSpecificationProperty.builder()

      override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      override fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.LaunchTemplateSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.LaunchTemplateSpecificationProperty,
    ) : LaunchTemplateSpecificationProperty {
      override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LaunchTemplateSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.LaunchTemplateSpecificationProperty):
          LaunchTemplateSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.LaunchTemplateSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
