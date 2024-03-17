@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies an EC2 instance.
 *
 * If an Elastic IP address is attached to your instance, AWS CloudFormation reattaches the Elastic
 * IP address after it updates the instance. For more information about updating stacks, see [AWS
 * CloudFormation Stacks
 * Updates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnInstance cfnInstance = CfnInstance.Builder.create(this, "MyCfnInstance")
 * .additionalInfo("additionalInfo")
 * .affinity("affinity")
 * .availabilityZone("availabilityZone")
 * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
 * .deviceName("deviceName")
 * // the properties below are optional
 * .ebs(EbsProperty.builder()
 * .deleteOnTermination(false)
 * .encrypted(false)
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .snapshotId("snapshotId")
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build())
 * .noDevice(NoDeviceProperty.builder().build())
 * .virtualName("virtualName")
 * .build()))
 * .cpuOptions(CpuOptionsProperty.builder()
 * .coreCount(123)
 * .threadsPerCore(123)
 * .build())
 * .creditSpecification(CreditSpecificationProperty.builder()
 * .cpuCredits("cpuCredits")
 * .build())
 * .disableApiTermination(false)
 * .ebsOptimized(false)
 * .elasticGpuSpecifications(List.of(ElasticGpuSpecificationProperty.builder()
 * .type("type")
 * .build()))
 * .elasticInferenceAccelerators(List.of(ElasticInferenceAcceleratorProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .count(123)
 * .build()))
 * .enclaveOptions(EnclaveOptionsProperty.builder()
 * .enabled(false)
 * .build())
 * .hibernationOptions(HibernationOptionsProperty.builder()
 * .configured(false)
 * .build())
 * .hostId("hostId")
 * .hostResourceGroupArn("hostResourceGroupArn")
 * .iamInstanceProfile("iamInstanceProfile")
 * .imageId("imageId")
 * .instanceInitiatedShutdownBehavior("instanceInitiatedShutdownBehavior")
 * .instanceType("instanceType")
 * .ipv6AddressCount(123)
 * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
 * .ipv6Address("ipv6Address")
 * .build()))
 * .kernelId("kernelId")
 * .keyName("keyName")
 * .launchTemplate(LaunchTemplateSpecificationProperty.builder()
 * .version("version")
 * // the properties below are optional
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .build())
 * .licenseSpecifications(List.of(LicenseSpecificationProperty.builder()
 * .licenseConfigurationArn("licenseConfigurationArn")
 * .build()))
 * .monitoring(false)
 * .networkInterfaces(List.of(NetworkInterfaceProperty.builder()
 * .deviceIndex("deviceIndex")
 * // the properties below are optional
 * .associateCarrierIpAddress(false)
 * .associatePublicIpAddress(false)
 * .deleteOnTermination(false)
 * .description("description")
 * .groupSet(List.of("groupSet"))
 * .ipv6AddressCount(123)
 * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
 * .ipv6Address("ipv6Address")
 * .build()))
 * .networkInterfaceId("networkInterfaceId")
 * .privateIpAddress("privateIpAddress")
 * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
 * .primary(false)
 * .privateIpAddress("privateIpAddress")
 * .build()))
 * .secondaryPrivateIpAddressCount(123)
 * .subnetId("subnetId")
 * .build()))
 * .placementGroupName("placementGroupName")
 * .privateDnsNameOptions(PrivateDnsNameOptionsProperty.builder()
 * .enableResourceNameDnsAaaaRecord(false)
 * .enableResourceNameDnsARecord(false)
 * .hostnameType("hostnameType")
 * .build())
 * .privateIpAddress("privateIpAddress")
 * .propagateTagsToVolumeOnCreation(false)
 * .ramdiskId("ramdiskId")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .securityGroups(List.of("securityGroups"))
 * .sourceDestCheck(false)
 * .ssmAssociations(List.of(SsmAssociationProperty.builder()
 * .documentName("documentName")
 * // the properties below are optional
 * .associationParameters(List.of(AssociationParameterProperty.builder()
 * .key("key")
 * .value(List.of("value"))
 * .build()))
 * .build()))
 * .subnetId("subnetId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tenancy("tenancy")
 * .userData("userData")
 * .volumes(List.of(VolumeProperty.builder()
 * .device("device")
 * .volumeId("volumeId")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html)
 */
public open class CfnInstance internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * This property is reserved for internal use.
   */
  public open fun additionalInfo(): String? = unwrap(this).getAdditionalInfo()

  /**
   * This property is reserved for internal use.
   */
  public open fun additionalInfo(`value`: String) {
    unwrap(this).setAdditionalInfo(`value`)
  }

  /**
   * Indicates whether the instance is associated with a dedicated host.
   */
  public open fun affinity(): String? = unwrap(this).getAffinity()

  /**
   * Indicates whether the instance is associated with a dedicated host.
   */
  public open fun affinity(`value`: String) {
    unwrap(this).setAffinity(`value`)
  }

  /**
   * The Availability Zone where the specified instance is launched. For example: `us-east-1b` .
   *
   * You can retrieve a list of all Availability Zones for a Region by using the
   * [Fn::GetAZs](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getavailabilityzones.html)
   * intrinsic function.
   */
  public open fun attrAvailabilityZone(): String = unwrap(this).getAttrAvailabilityZone()

  /**
   * The ID of the instance.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The private DNS name of the specified instance.
   *
   * For example: `ip-10-24-34-0.ec2.internal` .
   */
  public open fun attrPrivateDnsName(): String = unwrap(this).getAttrPrivateDnsName()

  /**
   * The private IP address of the specified instance.
   *
   * For example: `10.24.34.0` .
   */
  public open fun attrPrivateIp(): String = unwrap(this).getAttrPrivateIp()

  /**
   * The public DNS name of the specified instance.
   *
   * For example: `ec2-107-20-50-45.compute-1.amazonaws.com` .
   */
  public open fun attrPublicDnsName(): String = unwrap(this).getAttrPublicDnsName()

  /**
   * The public IP address of the specified instance.
   *
   * For example: `192.0.2.0` .
   */
  public open fun attrPublicIp(): String = unwrap(this).getAttrPublicIp()

  /**
   * The Availability Zone of the instance.
   */
  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The Availability Zone of the instance.
   */
  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  /**
   * The block device mapping entries that defines the block devices to attach to the instance at
   * launch.
   */
  public open fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

  /**
   * The block device mapping entries that defines the block devices to attach to the instance at
   * launch.
   */
  public open fun blockDeviceMappings(`value`: IResolvable) {
    unwrap(this).setBlockDeviceMappings(`value`.let(IResolvable::unwrap))
  }

  /**
   * The block device mapping entries that defines the block devices to attach to the instance at
   * launch.
   */
  public open fun blockDeviceMappings(`value`: List<Any>) {
    unwrap(this).setBlockDeviceMappings(`value`)
  }

  /**
   * The block device mapping entries that defines the block devices to attach to the instance at
   * launch.
   */
  public open fun blockDeviceMappings(vararg `value`: Any): Unit =
      blockDeviceMappings(`value`.toList())

  /**
   * The CPU options for the instance.
   */
  public open fun cpuOptions(): Any? = unwrap(this).getCpuOptions()

  /**
   * The CPU options for the instance.
   */
  public open fun cpuOptions(`value`: IResolvable) {
    unwrap(this).setCpuOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The CPU options for the instance.
   */
  public open fun cpuOptions(`value`: CpuOptionsProperty) {
    unwrap(this).setCpuOptions(`value`.let(CpuOptionsProperty::unwrap))
  }

  /**
   * The CPU options for the instance.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5d2629f18af4b772606a95484a7287ddd10b446b95a51771dad200e69d8ef45")
  public open fun cpuOptions(`value`: CpuOptionsProperty.Builder.() -> Unit): Unit =
      cpuOptions(CpuOptionsProperty(`value`))

  /**
   * The credit option for CPU usage of the burstable performance instance.
   */
  public open fun creditSpecification(): Any? = unwrap(this).getCreditSpecification()

  /**
   * The credit option for CPU usage of the burstable performance instance.
   */
  public open fun creditSpecification(`value`: IResolvable) {
    unwrap(this).setCreditSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * The credit option for CPU usage of the burstable performance instance.
   */
  public open fun creditSpecification(`value`: CreditSpecificationProperty) {
    unwrap(this).setCreditSpecification(`value`.let(CreditSpecificationProperty::unwrap))
  }

  /**
   * The credit option for CPU usage of the burstable performance instance.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e281afa738ad6808633f441ebce50d06b0f57696d1adf33fb9d1fc0e41a3b369")
  public open fun creditSpecification(`value`: CreditSpecificationProperty.Builder.() -> Unit): Unit
      = creditSpecification(CreditSpecificationProperty(`value`))

  /**
   * If you set this parameter to `true` , you can't terminate the instance using the Amazon EC2
   * console, CLI, or API;
   */
  public open fun disableApiTermination(): Any? = unwrap(this).getDisableApiTermination()

  /**
   * If you set this parameter to `true` , you can't terminate the instance using the Amazon EC2
   * console, CLI, or API;
   */
  public open fun disableApiTermination(`value`: Boolean) {
    unwrap(this).setDisableApiTermination(`value`)
  }

  /**
   * If you set this parameter to `true` , you can't terminate the instance using the Amazon EC2
   * console, CLI, or API;
   */
  public open fun disableApiTermination(`value`: IResolvable) {
    unwrap(this).setDisableApiTermination(`value`.let(IResolvable::unwrap))
  }

  /**
   * Indicates whether the instance is optimized for Amazon EBS I/O.
   */
  public open fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

  /**
   * Indicates whether the instance is optimized for Amazon EBS I/O.
   */
  public open fun ebsOptimized(`value`: Boolean) {
    unwrap(this).setEbsOptimized(`value`)
  }

  /**
   * Indicates whether the instance is optimized for Amazon EBS I/O.
   */
  public open fun ebsOptimized(`value`: IResolvable) {
    unwrap(this).setEbsOptimized(`value`.let(IResolvable::unwrap))
  }

  /**
   * Deprecated.
   */
  public open fun elasticGpuSpecifications(): Any? = unwrap(this).getElasticGpuSpecifications()

  /**
   * Deprecated.
   */
  public open fun elasticGpuSpecifications(`value`: IResolvable) {
    unwrap(this).setElasticGpuSpecifications(`value`.let(IResolvable::unwrap))
  }

  /**
   * Deprecated.
   */
  public open fun elasticGpuSpecifications(`value`: List<Any>) {
    unwrap(this).setElasticGpuSpecifications(`value`)
  }

  /**
   * Deprecated.
   */
  public open fun elasticGpuSpecifications(vararg `value`: Any): Unit =
      elasticGpuSpecifications(`value`.toList())

  /**
   * An elastic inference accelerator to associate with the instance.
   */
  public open fun elasticInferenceAccelerators(): Any? =
      unwrap(this).getElasticInferenceAccelerators()

  /**
   * An elastic inference accelerator to associate with the instance.
   */
  public open fun elasticInferenceAccelerators(`value`: IResolvable) {
    unwrap(this).setElasticInferenceAccelerators(`value`.let(IResolvable::unwrap))
  }

  /**
   * An elastic inference accelerator to associate with the instance.
   */
  public open fun elasticInferenceAccelerators(`value`: List<Any>) {
    unwrap(this).setElasticInferenceAccelerators(`value`)
  }

  /**
   * An elastic inference accelerator to associate with the instance.
   */
  public open fun elasticInferenceAccelerators(vararg `value`: Any): Unit =
      elasticInferenceAccelerators(`value`.toList())

  /**
   * Indicates whether the instance is enabled for AWS Nitro Enclaves.
   */
  public open fun enclaveOptions(): Any? = unwrap(this).getEnclaveOptions()

  /**
   * Indicates whether the instance is enabled for AWS Nitro Enclaves.
   */
  public open fun enclaveOptions(`value`: IResolvable) {
    unwrap(this).setEnclaveOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Indicates whether the instance is enabled for AWS Nitro Enclaves.
   */
  public open fun enclaveOptions(`value`: EnclaveOptionsProperty) {
    unwrap(this).setEnclaveOptions(`value`.let(EnclaveOptionsProperty::unwrap))
  }

  /**
   * Indicates whether the instance is enabled for AWS Nitro Enclaves.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d4f3f674bcf5681180c9e7721090e0e7b85b3c2271d40b0b45852e9b209a4684")
  public open fun enclaveOptions(`value`: EnclaveOptionsProperty.Builder.() -> Unit): Unit =
      enclaveOptions(EnclaveOptionsProperty(`value`))

  /**
   * Indicates whether an instance is enabled for hibernation.
   */
  public open fun hibernationOptions(): Any? = unwrap(this).getHibernationOptions()

  /**
   * Indicates whether an instance is enabled for hibernation.
   */
  public open fun hibernationOptions(`value`: IResolvable) {
    unwrap(this).setHibernationOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Indicates whether an instance is enabled for hibernation.
   */
  public open fun hibernationOptions(`value`: HibernationOptionsProperty) {
    unwrap(this).setHibernationOptions(`value`.let(HibernationOptionsProperty::unwrap))
  }

  /**
   * Indicates whether an instance is enabled for hibernation.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a1daa1b727cd75c23fc47601d2198ed7d77a27aa5c3051afc107abaca836542c")
  public open fun hibernationOptions(`value`: HibernationOptionsProperty.Builder.() -> Unit): Unit =
      hibernationOptions(HibernationOptionsProperty(`value`))

  /**
   * If you specify host for the `Affinity` property, the ID of a dedicated host that the instance
   * is associated with.
   */
  public open fun hostId(): String? = unwrap(this).getHostId()

  /**
   * If you specify host for the `Affinity` property, the ID of a dedicated host that the instance
   * is associated with.
   */
  public open fun hostId(`value`: String) {
    unwrap(this).setHostId(`value`)
  }

  /**
   * The ARN of the host resource group in which to launch the instances.
   */
  public open fun hostResourceGroupArn(): String? = unwrap(this).getHostResourceGroupArn()

  /**
   * The ARN of the host resource group in which to launch the instances.
   */
  public open fun hostResourceGroupArn(`value`: String) {
    unwrap(this).setHostResourceGroupArn(`value`)
  }

  /**
   * The name of an IAM instance profile.
   */
  public open fun iamInstanceProfile(): String? = unwrap(this).getIamInstanceProfile()

  /**
   * The name of an IAM instance profile.
   */
  public open fun iamInstanceProfile(`value`: String) {
    unwrap(this).setIamInstanceProfile(`value`)
  }

  /**
   * The ID of the AMI.
   */
  public open fun imageId(): String? = unwrap(this).getImageId()

  /**
   * The ID of the AMI.
   */
  public open fun imageId(`value`: String) {
    unwrap(this).setImageId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Indicates whether an instance stops or terminates when you initiate shutdown from the instance
   * (using the operating system command for system shutdown).
   */
  public open fun instanceInitiatedShutdownBehavior(): String? =
      unwrap(this).getInstanceInitiatedShutdownBehavior()

  /**
   * Indicates whether an instance stops or terminates when you initiate shutdown from the instance
   * (using the operating system command for system shutdown).
   */
  public open fun instanceInitiatedShutdownBehavior(`value`: String) {
    unwrap(this).setInstanceInitiatedShutdownBehavior(`value`)
  }

  /**
   * The instance type.
   *
   * For more information, see [Instance
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon EC2
   * User Guide* .
   */
  public open fun instanceType(): String? = unwrap(this).getInstanceType()

  /**
   * The instance type.
   *
   * For more information, see [Instance
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon EC2
   * User Guide* .
   */
  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  /**
   * The number of IPv6 addresses to associate with the primary network interface.
   */
  public open fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

  /**
   * The number of IPv6 addresses to associate with the primary network interface.
   */
  public open fun ipv6AddressCount(`value`: Number) {
    unwrap(this).setIpv6AddressCount(`value`)
  }

  /**
   * The IPv6 addresses from the range of the subnet to associate with the primary network
   * interface.
   */
  public open fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

  /**
   * The IPv6 addresses from the range of the subnet to associate with the primary network
   * interface.
   */
  public open fun ipv6Addresses(`value`: IResolvable) {
    unwrap(this).setIpv6Addresses(`value`.let(IResolvable::unwrap))
  }

  /**
   * The IPv6 addresses from the range of the subnet to associate with the primary network
   * interface.
   */
  public open fun ipv6Addresses(`value`: List<Any>) {
    unwrap(this).setIpv6Addresses(`value`)
  }

  /**
   * The IPv6 addresses from the range of the subnet to associate with the primary network
   * interface.
   */
  public open fun ipv6Addresses(vararg `value`: Any): Unit = ipv6Addresses(`value`.toList())

  /**
   * The ID of the kernel.
   */
  public open fun kernelId(): String? = unwrap(this).getKernelId()

  /**
   * The ID of the kernel.
   */
  public open fun kernelId(`value`: String) {
    unwrap(this).setKernelId(`value`)
  }

  /**
   * The name of the key pair.
   *
   * You can create a key pair using
   * [CreateKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html) or
   * [ImportKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html) .
   */
  public open fun keyName(): String? = unwrap(this).getKeyName()

  /**
   * The name of the key pair.
   *
   * You can create a key pair using
   * [CreateKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html) or
   * [ImportKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html) .
   */
  public open fun keyName(`value`: String) {
    unwrap(this).setKeyName(`value`)
  }

  /**
   * The launch template to use to launch the instances.
   */
  public open fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

  /**
   * The launch template to use to launch the instances.
   */
  public open fun launchTemplate(`value`: IResolvable) {
    unwrap(this).setLaunchTemplate(`value`.let(IResolvable::unwrap))
  }

  /**
   * The launch template to use to launch the instances.
   */
  public open fun launchTemplate(`value`: LaunchTemplateSpecificationProperty) {
    unwrap(this).setLaunchTemplate(`value`.let(LaunchTemplateSpecificationProperty::unwrap))
  }

  /**
   * The launch template to use to launch the instances.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("535cb576814b4579419de7412d1256c1940139943ea2c243956fbc07001789a0")
  public open fun launchTemplate(`value`: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
      Unit = launchTemplate(LaunchTemplateSpecificationProperty(`value`))

  /**
   * The license configurations.
   */
  public open fun licenseSpecifications(): Any? = unwrap(this).getLicenseSpecifications()

  /**
   * The license configurations.
   */
  public open fun licenseSpecifications(`value`: IResolvable) {
    unwrap(this).setLicenseSpecifications(`value`.let(IResolvable::unwrap))
  }

  /**
   * The license configurations.
   */
  public open fun licenseSpecifications(`value`: List<Any>) {
    unwrap(this).setLicenseSpecifications(`value`)
  }

  /**
   * The license configurations.
   */
  public open fun licenseSpecifications(vararg `value`: Any): Unit =
      licenseSpecifications(`value`.toList())

  /**
   * Specifies whether detailed monitoring is enabled for the instance.
   */
  public open fun monitoring(): Any? = unwrap(this).getMonitoring()

  /**
   * Specifies whether detailed monitoring is enabled for the instance.
   */
  public open fun monitoring(`value`: Boolean) {
    unwrap(this).setMonitoring(`value`)
  }

  /**
   * Specifies whether detailed monitoring is enabled for the instance.
   */
  public open fun monitoring(`value`: IResolvable) {
    unwrap(this).setMonitoring(`value`.let(IResolvable::unwrap))
  }

  /**
   * The network interfaces to associate with the instance.
   */
  public open fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

  /**
   * The network interfaces to associate with the instance.
   */
  public open fun networkInterfaces(`value`: IResolvable) {
    unwrap(this).setNetworkInterfaces(`value`.let(IResolvable::unwrap))
  }

  /**
   * The network interfaces to associate with the instance.
   */
  public open fun networkInterfaces(`value`: List<Any>) {
    unwrap(this).setNetworkInterfaces(`value`)
  }

  /**
   * The network interfaces to associate with the instance.
   */
  public open fun networkInterfaces(vararg `value`: Any): Unit = networkInterfaces(`value`.toList())

  /**
   * The name of an existing placement group that you want to launch the instance into (cluster |
   * partition | spread).
   */
  public open fun placementGroupName(): String? = unwrap(this).getPlacementGroupName()

  /**
   * The name of an existing placement group that you want to launch the instance into (cluster |
   * partition | spread).
   */
  public open fun placementGroupName(`value`: String) {
    unwrap(this).setPlacementGroupName(`value`)
  }

  /**
   * The options for the instance hostname.
   */
  public open fun privateDnsNameOptions(): Any? = unwrap(this).getPrivateDnsNameOptions()

  /**
   * The options for the instance hostname.
   */
  public open fun privateDnsNameOptions(`value`: IResolvable) {
    unwrap(this).setPrivateDnsNameOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The options for the instance hostname.
   */
  public open fun privateDnsNameOptions(`value`: PrivateDnsNameOptionsProperty) {
    unwrap(this).setPrivateDnsNameOptions(`value`.let(PrivateDnsNameOptionsProperty::unwrap))
  }

  /**
   * The options for the instance hostname.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("679ef0663bdcb803470ce65281f016c218e8a62b009e4f1f3644ad6be443da6a")
  public open fun privateDnsNameOptions(`value`: PrivateDnsNameOptionsProperty.Builder.() -> Unit):
      Unit = privateDnsNameOptions(PrivateDnsNameOptionsProperty(`value`))

  /**
   * The primary IPv4 address.
   *
   * You must specify a value from the IPv4 address range of the subnet.
   */
  public open fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  /**
   * The primary IPv4 address.
   *
   * You must specify a value from the IPv4 address range of the subnet.
   */
  public open fun privateIpAddress(`value`: String) {
    unwrap(this).setPrivateIpAddress(`value`)
  }

  /**
   * Indicates whether to assign the tags from the instance to all of the volumes attached to the
   * instance at launch.
   */
  public open fun propagateTagsToVolumeOnCreation(): Any? =
      unwrap(this).getPropagateTagsToVolumeOnCreation()

  /**
   * Indicates whether to assign the tags from the instance to all of the volumes attached to the
   * instance at launch.
   */
  public open fun propagateTagsToVolumeOnCreation(`value`: Boolean) {
    unwrap(this).setPropagateTagsToVolumeOnCreation(`value`)
  }

  /**
   * Indicates whether to assign the tags from the instance to all of the volumes attached to the
   * instance at launch.
   */
  public open fun propagateTagsToVolumeOnCreation(`value`: IResolvable) {
    unwrap(this).setPropagateTagsToVolumeOnCreation(`value`.let(IResolvable::unwrap))
  }

  /**
   * The ID of the RAM disk to select.
   */
  public open fun ramdiskId(): String? = unwrap(this).getRamdiskId()

  /**
   * The ID of the RAM disk to select.
   */
  public open fun ramdiskId(`value`: String) {
    unwrap(this).setRamdiskId(`value`)
  }

  /**
   * The IDs of the security groups.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * The IDs of the security groups.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The IDs of the security groups.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * [Default VPC] The names of the security groups.
   *
   * For a nondefault VPC, you must use security group IDs instead.
   */
  public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  /**
   * [Default VPC] The names of the security groups.
   *
   * For a nondefault VPC, you must use security group IDs instead.
   */
  public open fun securityGroups(`value`: List<String>) {
    unwrap(this).setSecurityGroups(`value`)
  }

  /**
   * [Default VPC] The names of the security groups.
   *
   * For a nondefault VPC, you must use security group IDs instead.
   */
  public open fun securityGroups(vararg `value`: String): Unit = securityGroups(`value`.toList())

  /**
   * Enable or disable source/destination checks, which ensure that the instance is either the
   * source or the destination of any traffic that it receives.
   */
  public open fun sourceDestCheck(): Any? = unwrap(this).getSourceDestCheck()

  /**
   * Enable or disable source/destination checks, which ensure that the instance is either the
   * source or the destination of any traffic that it receives.
   */
  public open fun sourceDestCheck(`value`: Boolean) {
    unwrap(this).setSourceDestCheck(`value`)
  }

  /**
   * Enable or disable source/destination checks, which ensure that the instance is either the
   * source or the destination of any traffic that it receives.
   */
  public open fun sourceDestCheck(`value`: IResolvable) {
    unwrap(this).setSourceDestCheck(`value`.let(IResolvable::unwrap))
  }

  /**
   * The SSM
   * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
   * and parameter values in AWS Systems Manager to associate with this instance. To use this property,
   * you must specify an IAM instance profile role for the instance. For more information, see [Create
   * an IAM instance profile for Systems
   * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
   * in the *AWS Systems Manager User Guide* .
   */
  public open fun ssmAssociations(): Any? = unwrap(this).getSsmAssociations()

  /**
   * The SSM
   * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
   * and parameter values in AWS Systems Manager to associate with this instance. To use this property,
   * you must specify an IAM instance profile role for the instance. For more information, see [Create
   * an IAM instance profile for Systems
   * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
   * in the *AWS Systems Manager User Guide* .
   */
  public open fun ssmAssociations(`value`: IResolvable) {
    unwrap(this).setSsmAssociations(`value`.let(IResolvable::unwrap))
  }

  /**
   * The SSM
   * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
   * and parameter values in AWS Systems Manager to associate with this instance. To use this property,
   * you must specify an IAM instance profile role for the instance. For more information, see [Create
   * an IAM instance profile for Systems
   * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
   * in the *AWS Systems Manager User Guide* .
   */
  public open fun ssmAssociations(`value`: List<Any>) {
    unwrap(this).setSsmAssociations(`value`)
  }

  /**
   * The SSM
   * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
   * and parameter values in AWS Systems Manager to associate with this instance. To use this property,
   * you must specify an IAM instance profile role for the instance. For more information, see [Create
   * an IAM instance profile for Systems
   * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
   * in the *AWS Systems Manager User Guide* .
   */
  public open fun ssmAssociations(vararg `value`: Any): Unit = ssmAssociations(`value`.toList())

  /**
   * The ID of the subnet to launch the instance into.
   */
  public open fun subnetId(): String? = unwrap(this).getSubnetId()

  /**
   * The ID of the subnet to launch the instance into.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to add to the instance.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to add to the instance.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to add to the instance.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The tenancy of the instance.
   */
  public open fun tenancy(): String? = unwrap(this).getTenancy()

  /**
   * The tenancy of the instance.
   */
  public open fun tenancy(`value`: String) {
    unwrap(this).setTenancy(`value`)
  }

  /**
   * The parameters or scripts to store as user data.
   */
  public open fun userData(): String? = unwrap(this).getUserData()

  /**
   * The parameters or scripts to store as user data.
   */
  public open fun userData(`value`: String) {
    unwrap(this).setUserData(`value`)
  }

  /**
   * The volumes to attach to the instance.
   */
  public open fun volumes(): Any? = unwrap(this).getVolumes()

  /**
   * The volumes to attach to the instance.
   */
  public open fun volumes(`value`: IResolvable) {
    unwrap(this).setVolumes(`value`.let(IResolvable::unwrap))
  }

  /**
   * The volumes to attach to the instance.
   */
  public open fun volumes(`value`: List<Any>) {
    unwrap(this).setVolumes(`value`)
  }

  /**
   * The volumes to attach to the instance.
   */
  public open fun volumes(vararg `value`: Any): Unit = volumes(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnInstance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * This property is reserved for internal use.
     *
     * If you use it, the stack fails with this error: `Bad property set: [Testing this property]
     * (Service: AmazonEC2; Status Code: 400; Error Code: InvalidParameterCombination; Request ID:
     * 0XXXXXX-49c7-4b40-8bcc-76885dcXXXXX)` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-additionalinfo)
     * @param additionalInfo This property is reserved for internal use. 
     */
    public fun additionalInfo(additionalInfo: String)

    /**
     * Indicates whether the instance is associated with a dedicated host.
     *
     * If you want the instance to always restart on the same host on which it was launched, specify
     * `host` . If you want the instance to restart on any available host, but try to launch onto the
     * last host it ran on (on a best-effort basis), specify `default` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-affinity)
     * @param affinity Indicates whether the instance is associated with a dedicated host. 
     */
    public fun affinity(affinity: String)

    /**
     * The Availability Zone of the instance.
     *
     * If not specified, an Availability Zone will be automatically chosen for you based on the load
     * balancing criteria for the Region.
     *
     * This parameter is not supported by
     * [DescribeImageAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImageAttribute.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-availabilityzone)
     * @param availabilityZone The Availability Zone of the instance. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * The block device mapping entries that defines the block devices to attach to the instance at
     * launch.
     *
     * By default, the block devices specified in the block device mapping for the AMI are used. You
     * can override the AMI block device mapping using the instance block device mapping. For the root
     * volume, you can override only the volume size, volume type, volume encryption settings, and the
     * `DeleteOnTermination` setting.
     *
     *
     * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
     * the attached volumes without interrupting the instance. Modifying any other parameter results in
     * instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-blockdevicemappings)
     * @param blockDeviceMappings The block device mapping entries that defines the block devices to
     * attach to the instance at launch. 
     */
    public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

    /**
     * The block device mapping entries that defines the block devices to attach to the instance at
     * launch.
     *
     * By default, the block devices specified in the block device mapping for the AMI are used. You
     * can override the AMI block device mapping using the instance block device mapping. For the root
     * volume, you can override only the volume size, volume type, volume encryption settings, and the
     * `DeleteOnTermination` setting.
     *
     *
     * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
     * the attached volumes without interrupting the instance. Modifying any other parameter results in
     * instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-blockdevicemappings)
     * @param blockDeviceMappings The block device mapping entries that defines the block devices to
     * attach to the instance at launch. 
     */
    public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

    /**
     * The block device mapping entries that defines the block devices to attach to the instance at
     * launch.
     *
     * By default, the block devices specified in the block device mapping for the AMI are used. You
     * can override the AMI block device mapping using the instance block device mapping. For the root
     * volume, you can override only the volume size, volume type, volume encryption settings, and the
     * `DeleteOnTermination` setting.
     *
     *
     * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
     * the attached volumes without interrupting the instance. Modifying any other parameter results in
     * instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-blockdevicemappings)
     * @param blockDeviceMappings The block device mapping entries that defines the block devices to
     * attach to the instance at launch. 
     */
    public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

    /**
     * The CPU options for the instance.
     *
     * For more information, see [Optimize CPU
     * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-cpuoptions)
     * @param cpuOptions The CPU options for the instance. 
     */
    public fun cpuOptions(cpuOptions: IResolvable)

    /**
     * The CPU options for the instance.
     *
     * For more information, see [Optimize CPU
     * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-cpuoptions)
     * @param cpuOptions The CPU options for the instance. 
     */
    public fun cpuOptions(cpuOptions: CpuOptionsProperty)

    /**
     * The CPU options for the instance.
     *
     * For more information, see [Optimize CPU
     * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-cpuoptions)
     * @param cpuOptions The CPU options for the instance. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("200f802d6678d49e125ebc55394f3fe219b3c76085e543b3bcf74003b51b8940")
    public fun cpuOptions(cpuOptions: CpuOptionsProperty.Builder.() -> Unit)

    /**
     * The credit option for CPU usage of the burstable performance instance.
     *
     * Valid values are `standard` and `unlimited` . To change this attribute after launch, use
     * [ModifyInstanceCreditSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html)
     * . For more information, see [Burstable performance
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `standard` (T2 instances) or `unlimited` (T3/T3a/T4g instances)
     *
     * For T3 instances with `host` tenancy, only `standard` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-creditspecification)
     * @param creditSpecification The credit option for CPU usage of the burstable performance
     * instance. 
     */
    public fun creditSpecification(creditSpecification: IResolvable)

    /**
     * The credit option for CPU usage of the burstable performance instance.
     *
     * Valid values are `standard` and `unlimited` . To change this attribute after launch, use
     * [ModifyInstanceCreditSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html)
     * . For more information, see [Burstable performance
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `standard` (T2 instances) or `unlimited` (T3/T3a/T4g instances)
     *
     * For T3 instances with `host` tenancy, only `standard` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-creditspecification)
     * @param creditSpecification The credit option for CPU usage of the burstable performance
     * instance. 
     */
    public fun creditSpecification(creditSpecification: CreditSpecificationProperty)

    /**
     * The credit option for CPU usage of the burstable performance instance.
     *
     * Valid values are `standard` and `unlimited` . To change this attribute after launch, use
     * [ModifyInstanceCreditSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html)
     * . For more information, see [Burstable performance
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `standard` (T2 instances) or `unlimited` (T3/T3a/T4g instances)
     *
     * For T3 instances with `host` tenancy, only `standard` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-creditspecification)
     * @param creditSpecification The credit option for CPU usage of the burstable performance
     * instance. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("557eb78c2cb1d5bc4288a9e41d6a454decbdb95ace5d44686d1217414b12da80")
    public
        fun creditSpecification(creditSpecification: CreditSpecificationProperty.Builder.() -> Unit)

    /**
     * If you set this parameter to `true` , you can't terminate the instance using the Amazon EC2
     * console, CLI, or API;
     *
     * otherwise, you can. To change this attribute after launch, use
     * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
     * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can
     * terminate the instance by running the shutdown command from the instance.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-disableapitermination)
     * @param disableApiTermination If you set this parameter to `true` , you can't terminate the
     * instance using the Amazon EC2 console, CLI, or API;. 
     */
    public fun disableApiTermination(disableApiTermination: Boolean)

    /**
     * If you set this parameter to `true` , you can't terminate the instance using the Amazon EC2
     * console, CLI, or API;
     *
     * otherwise, you can. To change this attribute after launch, use
     * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
     * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can
     * terminate the instance by running the shutdown command from the instance.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-disableapitermination)
     * @param disableApiTermination If you set this parameter to `true` , you can't terminate the
     * instance using the Amazon EC2 console, CLI, or API;. 
     */
    public fun disableApiTermination(disableApiTermination: IResolvable)

    /**
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all
     * instance types. Additional usage charges apply when using an EBS-optimized instance.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ebsoptimized)
     * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O. 
     */
    public fun ebsOptimized(ebsOptimized: Boolean)

    /**
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all
     * instance types. Additional usage charges apply when using an EBS-optimized instance.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ebsoptimized)
     * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O. 
     */
    public fun ebsOptimized(ebsOptimized: IResolvable)

    /**
     * Deprecated.
     *
     *
     * Amazon Elastic Graphics reached end of life on January 8, 2024. For workloads that require
     * graphics acceleration, we recommend that you use Amazon EC2 G4ad, G4dn, or G5 instances.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications)
     * @param elasticGpuSpecifications Deprecated. 
     */
    public fun elasticGpuSpecifications(elasticGpuSpecifications: IResolvable)

    /**
     * Deprecated.
     *
     *
     * Amazon Elastic Graphics reached end of life on January 8, 2024. For workloads that require
     * graphics acceleration, we recommend that you use Amazon EC2 G4ad, G4dn, or G5 instances.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications)
     * @param elasticGpuSpecifications Deprecated. 
     */
    public fun elasticGpuSpecifications(elasticGpuSpecifications: List<Any>)

    /**
     * Deprecated.
     *
     *
     * Amazon Elastic Graphics reached end of life on January 8, 2024. For workloads that require
     * graphics acceleration, we recommend that you use Amazon EC2 G4ad, G4dn, or G5 instances.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications)
     * @param elasticGpuSpecifications Deprecated. 
     */
    public fun elasticGpuSpecifications(vararg elasticGpuSpecifications: Any)

    /**
     * An elastic inference accelerator to associate with the instance.
     *
     * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances to
     * accelerate your Deep Learning (DL) inference workloads.
     *
     * You cannot specify accelerators from different generations in the same request.
     *
     *
     * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI),
     * and will help current customers migrate their workloads to options that offer better price and
     * performance. After April 15, 2023, new customers will not be able to launch instances with
     * Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who
     * have used Amazon EI at least once during the past 30-day period are considered current customers
     * and will be able to continue using the service.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticinferenceaccelerators)
     * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
     * instance. 
     */
    public fun elasticInferenceAccelerators(elasticInferenceAccelerators: IResolvable)

    /**
     * An elastic inference accelerator to associate with the instance.
     *
     * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances to
     * accelerate your Deep Learning (DL) inference workloads.
     *
     * You cannot specify accelerators from different generations in the same request.
     *
     *
     * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI),
     * and will help current customers migrate their workloads to options that offer better price and
     * performance. After April 15, 2023, new customers will not be able to launch instances with
     * Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who
     * have used Amazon EI at least once during the past 30-day period are considered current customers
     * and will be able to continue using the service.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticinferenceaccelerators)
     * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
     * instance. 
     */
    public fun elasticInferenceAccelerators(elasticInferenceAccelerators: List<Any>)

    /**
     * An elastic inference accelerator to associate with the instance.
     *
     * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances to
     * accelerate your Deep Learning (DL) inference workloads.
     *
     * You cannot specify accelerators from different generations in the same request.
     *
     *
     * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI),
     * and will help current customers migrate their workloads to options that offer better price and
     * performance. After April 15, 2023, new customers will not be able to launch instances with
     * Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who
     * have used Amazon EI at least once during the past 30-day period are considered current customers
     * and will be able to continue using the service.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticinferenceaccelerators)
     * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
     * instance. 
     */
    public fun elasticInferenceAccelerators(vararg elasticInferenceAccelerators: Any)

    /**
     * Indicates whether the instance is enabled for AWS Nitro Enclaves.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-enclaveoptions)
     * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves. 
     */
    public fun enclaveOptions(enclaveOptions: IResolvable)

    /**
     * Indicates whether the instance is enabled for AWS Nitro Enclaves.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-enclaveoptions)
     * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves. 
     */
    public fun enclaveOptions(enclaveOptions: EnclaveOptionsProperty)

    /**
     * Indicates whether the instance is enabled for AWS Nitro Enclaves.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-enclaveoptions)
     * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f759cdb2f8634a2d9e2950ad963a997445cd84d5a62e746ac0abfc8a77e0e5d")
    public fun enclaveOptions(enclaveOptions: EnclaveOptionsProperty.Builder.() -> Unit)

    /**
     * Indicates whether an instance is enabled for hibernation.
     *
     * This parameter is valid only if the instance meets the [hibernation
     * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
     * . For more information, see [Hibernate your
     * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon EC2
     * User Guide* .
     *
     * You can't enable hibernation and AWS Nitro Enclaves on the same instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hibernationoptions)
     * @param hibernationOptions Indicates whether an instance is enabled for hibernation. 
     */
    public fun hibernationOptions(hibernationOptions: IResolvable)

    /**
     * Indicates whether an instance is enabled for hibernation.
     *
     * This parameter is valid only if the instance meets the [hibernation
     * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
     * . For more information, see [Hibernate your
     * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon EC2
     * User Guide* .
     *
     * You can't enable hibernation and AWS Nitro Enclaves on the same instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hibernationoptions)
     * @param hibernationOptions Indicates whether an instance is enabled for hibernation. 
     */
    public fun hibernationOptions(hibernationOptions: HibernationOptionsProperty)

    /**
     * Indicates whether an instance is enabled for hibernation.
     *
     * This parameter is valid only if the instance meets the [hibernation
     * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
     * . For more information, see [Hibernate your
     * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon EC2
     * User Guide* .
     *
     * You can't enable hibernation and AWS Nitro Enclaves on the same instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hibernationoptions)
     * @param hibernationOptions Indicates whether an instance is enabled for hibernation. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8466dee098089da22e3064fb04b8975a80e569c6287108da8a3220d1a21b95da")
    public fun hibernationOptions(hibernationOptions: HibernationOptionsProperty.Builder.() -> Unit)

    /**
     * If you specify host for the `Affinity` property, the ID of a dedicated host that the instance
     * is associated with.
     *
     * If you don't specify an ID, Amazon EC2 launches the instance onto any available, compatible
     * dedicated host in your account. This type of launch is called an untargeted launch. Note that
     * for untargeted launches, you must have a compatible, dedicated host available to successfully
     * launch instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hostid)
     * @param hostId If you specify host for the `Affinity` property, the ID of a dedicated host
     * that the instance is associated with. 
     */
    public fun hostId(hostId: String)

    /**
     * The ARN of the host resource group in which to launch the instances.
     *
     * If you specify a host resource group ARN, omit the *Tenancy* parameter or set it to `host` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hostresourcegrouparn)
     * @param hostResourceGroupArn The ARN of the host resource group in which to launch the
     * instances. 
     */
    public fun hostResourceGroupArn(hostResourceGroupArn: String)

    /**
     * The name of an IAM instance profile.
     *
     * To create a new IAM instance profile, use the
     * [AWS::IAM::InstanceProfile](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html)
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-iaminstanceprofile)
     * @param iamInstanceProfile The name of an IAM instance profile. 
     */
    public fun iamInstanceProfile(iamInstanceProfile: String)

    /**
     * The ID of the AMI.
     *
     * An AMI ID is required to launch an instance and must be specified here or in a launch
     * template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-imageid)
     * @param imageId The ID of the AMI. 
     */
    public fun imageId(imageId: String)

    /**
     * Indicates whether an instance stops or terminates when you initiate shutdown from the
     * instance (using the operating system command for system shutdown).
     *
     * Default: `stop`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-instanceinitiatedshutdownbehavior)
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates
     * when you initiate shutdown from the instance (using the operating system command for system
     * shutdown). 
     */
    public fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: String)

    /**
     * The instance type. For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide* .
     *
     * When you change your EBS-backed instance type, instance restart or replacement behavior
     * depends on the instance type compatibility between the old and new types. An instance with an
     * instance store volume as the root volume is always replaced. For more information, see [Change
     * the instance type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-instancetype)
     * @param instanceType The instance type. For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide* . 
     */
    public fun instanceType(instanceType: String)

    /**
     * The number of IPv6 addresses to associate with the primary network interface.
     *
     * Amazon EC2 chooses the IPv6 addresses from the range of your subnet. You cannot specify this
     * option and the option to assign specific IPv6 addresses in the same request. You can specify
     * this option if you've specified a minimum number of instances to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ipv6addresscount)
     * @param ipv6AddressCount The number of IPv6 addresses to associate with the primary network
     * interface. 
     */
    public fun ipv6AddressCount(ipv6AddressCount: Number)

    /**
     * The IPv6 addresses from the range of the subnet to associate with the primary network
     * interface.
     *
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of instances
     * to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ipv6addresses)
     * @param ipv6Addresses The IPv6 addresses from the range of the subnet to associate with the
     * primary network interface. 
     */
    public fun ipv6Addresses(ipv6Addresses: IResolvable)

    /**
     * The IPv6 addresses from the range of the subnet to associate with the primary network
     * interface.
     *
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of instances
     * to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ipv6addresses)
     * @param ipv6Addresses The IPv6 addresses from the range of the subnet to associate with the
     * primary network interface. 
     */
    public fun ipv6Addresses(ipv6Addresses: List<Any>)

    /**
     * The IPv6 addresses from the range of the subnet to associate with the primary network
     * interface.
     *
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of instances
     * to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ipv6addresses)
     * @param ipv6Addresses The IPv6 addresses from the range of the subnet to associate with the
     * primary network interface. 
     */
    public fun ipv6Addresses(vararg ipv6Addresses: Any)

    /**
     * The ID of the kernel.
     *
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [PV-GRUB](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
     * *Amazon EC2 User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-kernelid)
     * @param kernelId The ID of the kernel. 
     */
    public fun kernelId(kernelId: String)

    /**
     * The name of the key pair. You can create a key pair using
     * [CreateKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html)
     * or
     * [ImportKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html) .
     *
     *
     * If you do not specify a key pair, you can't connect to the instance unless you choose an AMI
     * that is configured to allow users another way to log in.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-keyname)
     * @param keyName The name of the key pair. You can create a key pair using
     * [CreateKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html)
     * or
     * [ImportKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html) .
     * 
     */
    public fun keyName(keyName: String)

    /**
     * The launch template to use to launch the instances.
     *
     * Any parameters that you specify in the AWS CloudFormation template override the same
     * parameters in the launch template. You can specify either the name or ID of a launch template,
     * but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-launchtemplate)
     * @param launchTemplate The launch template to use to launch the instances. 
     */
    public fun launchTemplate(launchTemplate: IResolvable)

    /**
     * The launch template to use to launch the instances.
     *
     * Any parameters that you specify in the AWS CloudFormation template override the same
     * parameters in the launch template. You can specify either the name or ID of a launch template,
     * but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-launchtemplate)
     * @param launchTemplate The launch template to use to launch the instances. 
     */
    public fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty)

    /**
     * The launch template to use to launch the instances.
     *
     * Any parameters that you specify in the AWS CloudFormation template override the same
     * parameters in the launch template. You can specify either the name or ID of a launch template,
     * but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-launchtemplate)
     * @param launchTemplate The launch template to use to launch the instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a96fad6d5019a3dd2182fee83a3a37fbea28f6c867f2ec0ff8c8d0b4e93680a")
    public
        fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty.Builder.() -> Unit)

    /**
     * The license configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-licensespecifications)
     * @param licenseSpecifications The license configurations. 
     */
    public fun licenseSpecifications(licenseSpecifications: IResolvable)

    /**
     * The license configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-licensespecifications)
     * @param licenseSpecifications The license configurations. 
     */
    public fun licenseSpecifications(licenseSpecifications: List<Any>)

    /**
     * The license configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-licensespecifications)
     * @param licenseSpecifications The license configurations. 
     */
    public fun licenseSpecifications(vararg licenseSpecifications: Any)

    /**
     * Specifies whether detailed monitoring is enabled for the instance.
     *
     * Specify `true` to enable detailed monitoring. Otherwise, basic monitoring is enabled. For
     * more information about detailed monitoring, see [Enable or turn off detailed monitoring for your
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html) in the
     * *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-monitoring)
     * @param monitoring Specifies whether detailed monitoring is enabled for the instance. 
     */
    public fun monitoring(monitoring: Boolean)

    /**
     * Specifies whether detailed monitoring is enabled for the instance.
     *
     * Specify `true` to enable detailed monitoring. Otherwise, basic monitoring is enabled. For
     * more information about detailed monitoring, see [Enable or turn off detailed monitoring for your
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html) in the
     * *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-monitoring)
     * @param monitoring Specifies whether detailed monitoring is enabled for the instance. 
     */
    public fun monitoring(monitoring: IResolvable)

    /**
     * The network interfaces to associate with the instance.
     *
     *
     * If you use this property to point to a network interface, you must terminate the original
     * interface before attaching a new one to allow the update of the instance to succeed.
     *
     * If this resource has a public IP address and is also in a VPC that is defined in the same
     * template, you must use the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the VPC-gateway attachment.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-networkinterfaces)
     * @param networkInterfaces The network interfaces to associate with the instance. 
     */
    public fun networkInterfaces(networkInterfaces: IResolvable)

    /**
     * The network interfaces to associate with the instance.
     *
     *
     * If you use this property to point to a network interface, you must terminate the original
     * interface before attaching a new one to allow the update of the instance to succeed.
     *
     * If this resource has a public IP address and is also in a VPC that is defined in the same
     * template, you must use the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the VPC-gateway attachment.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-networkinterfaces)
     * @param networkInterfaces The network interfaces to associate with the instance. 
     */
    public fun networkInterfaces(networkInterfaces: List<Any>)

    /**
     * The network interfaces to associate with the instance.
     *
     *
     * If you use this property to point to a network interface, you must terminate the original
     * interface before attaching a new one to allow the update of the instance to succeed.
     *
     * If this resource has a public IP address and is also in a VPC that is defined in the same
     * template, you must use the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the VPC-gateway attachment.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-networkinterfaces)
     * @param networkInterfaces The network interfaces to associate with the instance. 
     */
    public fun networkInterfaces(vararg networkInterfaces: Any)

    /**
     * The name of an existing placement group that you want to launch the instance into (cluster |
     * partition | spread).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-placementgroupname)
     * @param placementGroupName The name of an existing placement group that you want to launch the
     * instance into (cluster | partition | spread). 
     */
    public fun placementGroupName(placementGroupName: String)

    /**
     * The options for the instance hostname.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-privatednsnameoptions)
     * @param privateDnsNameOptions The options for the instance hostname. 
     */
    public fun privateDnsNameOptions(privateDnsNameOptions: IResolvable)

    /**
     * The options for the instance hostname.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-privatednsnameoptions)
     * @param privateDnsNameOptions The options for the instance hostname. 
     */
    public fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsProperty)

    /**
     * The options for the instance hostname.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-privatednsnameoptions)
     * @param privateDnsNameOptions The options for the instance hostname. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e02ff10ec39ab61f51631930c93d6b96606843794b59eeb8c716656ba4304b9")
    public
        fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsProperty.Builder.() -> Unit)

    /**
     * The primary IPv4 address. You must specify a value from the IPv4 address range of the subnet.
     *
     * Only one private IP address can be designated as primary. You can't specify this option if
     * you've specified the option to designate a private IP address as the primary IP address in a
     * network interface specification. You cannot specify this option if you're launching more than
     * one instance in the request.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     *
     * If you make an update to an instance that requires replacement, you must assign a new private
     * IP address. During a replacement, AWS CloudFormation creates a new instance but doesn't delete
     * the old instance until the stack has successfully updated. If the stack update fails, AWS
     * CloudFormation uses the old instance to roll back the stack to the previous working state. The
     * old and new instances cannot have the same private IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-privateipaddress)
     * @param privateIpAddress The primary IPv4 address. You must specify a value from the IPv4
     * address range of the subnet. 
     */
    public fun privateIpAddress(privateIpAddress: String)

    /**
     * Indicates whether to assign the tags from the instance to all of the volumes attached to the
     * instance at launch.
     *
     * If you specify `true` and you assign tags to the instance, those tags are automatically
     * assigned to all of the volumes that you attach to the instance at launch. If you specify `false`
     * , those tags are not assigned to the attached volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     * @param propagateTagsToVolumeOnCreation Indicates whether to assign the tags from the instance
     * to all of the volumes attached to the instance at launch. 
     */
    public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean)

    /**
     * Indicates whether to assign the tags from the instance to all of the volumes attached to the
     * instance at launch.
     *
     * If you specify `true` and you assign tags to the instance, those tags are automatically
     * assigned to all of the volumes that you attach to the instance at launch. If you specify `false`
     * , those tags are not assigned to the attached volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     * @param propagateTagsToVolumeOnCreation Indicates whether to assign the tags from the instance
     * to all of the volumes attached to the instance at launch. 
     */
    public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: IResolvable)

    /**
     * The ID of the RAM disk to select.
     *
     * Some kernels require additional drivers at launch. Check the kernel requirements for
     * information about whether you need to specify a RAM disk. To find kernel requirements, go to the
     * AWS Resource Center and search for the kernel ID.
     *
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [PV-GRUB](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
     * *Amazon EC2 User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ramdiskid)
     * @param ramdiskId The ID of the RAM disk to select. 
     */
    public fun ramdiskId(ramdiskId: String)

    /**
     * The IDs of the security groups.
     *
     * You can specify the IDs of existing security groups and references to resources created by
     * the stack template.
     *
     * If you specify a network interface, you must specify any security groups as part of the
     * network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-securitygroupids)
     * @param securityGroupIds The IDs of the security groups. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The IDs of the security groups.
     *
     * You can specify the IDs of existing security groups and references to resources created by
     * the stack template.
     *
     * If you specify a network interface, you must specify any security groups as part of the
     * network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-securitygroupids)
     * @param securityGroupIds The IDs of the security groups. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * [Default VPC] The names of the security groups. For a nondefault VPC, you must use security
     * group IDs instead.
     *
     * You cannot specify this option and the network interfaces option in the same request. The
     * list can contain both the name of existing Amazon EC2 security groups or references to
     * AWS::EC2::SecurityGroup resources created in the template.
     *
     * Default: Amazon EC2 uses the default security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-securitygroups)
     * @param securityGroups [Default VPC] The names of the security groups. For a nondefault VPC,
     * you must use security group IDs instead. 
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * [Default VPC] The names of the security groups. For a nondefault VPC, you must use security
     * group IDs instead.
     *
     * You cannot specify this option and the network interfaces option in the same request. The
     * list can contain both the name of existing Amazon EC2 security groups or references to
     * AWS::EC2::SecurityGroup resources created in the template.
     *
     * Default: Amazon EC2 uses the default security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-securitygroups)
     * @param securityGroups [Default VPC] The names of the security groups. For a nondefault VPC,
     * you must use security group IDs instead. 
     */
    public fun securityGroups(vararg securityGroups: String)

    /**
     * Enable or disable source/destination checks, which ensure that the instance is either the
     * source or the destination of any traffic that it receives.
     *
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-sourcedestcheck)
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     * instance is either the source or the destination of any traffic that it receives. 
     */
    public fun sourceDestCheck(sourceDestCheck: Boolean)

    /**
     * Enable or disable source/destination checks, which ensure that the instance is either the
     * source or the destination of any traffic that it receives.
     *
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-sourcedestcheck)
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     * instance is either the source or the destination of any traffic that it receives. 
     */
    public fun sourceDestCheck(sourceDestCheck: IResolvable)

    /**
     * The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* .
     *
     *
     * You can associate only one document with an instance.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ssmassociations)
     * @param ssmAssociations The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* . 
     */
    public fun ssmAssociations(ssmAssociations: IResolvable)

    /**
     * The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* .
     *
     *
     * You can associate only one document with an instance.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ssmassociations)
     * @param ssmAssociations The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* . 
     */
    public fun ssmAssociations(ssmAssociations: List<Any>)

    /**
     * The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* .
     *
     *
     * You can associate only one document with an instance.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ssmassociations)
     * @param ssmAssociations The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* . 
     */
    public fun ssmAssociations(vararg ssmAssociations: Any)

    /**
     * The ID of the subnet to launch the instance into.
     *
     * If you specify a network interface, you must specify any subnets as part of the network
     * interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-subnetid)
     * @param subnetId The ID of the subnet to launch the instance into. 
     */
    public fun subnetId(subnetId: String)

    /**
     * The tags to add to the instance.
     *
     * These tags are not applied to the EBS volumes, such as the root volume, unless
     * [PropagateTagsToVolumeOnCreation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     * is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-tags)
     * @param tags The tags to add to the instance. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to add to the instance.
     *
     * These tags are not applied to the EBS volumes, such as the root volume, unless
     * [PropagateTagsToVolumeOnCreation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     * is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-tags)
     * @param tags The tags to add to the instance. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The tenancy of the instance.
     *
     * An instance with a tenancy of `dedicated` runs on single-tenant hardware.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-tenancy)
     * @param tenancy The tenancy of the instance. 
     */
    public fun tenancy(tenancy: String)

    /**
     * The parameters or scripts to store as user data.
     *
     * Any scripts in user data are run when you launch the instance. User data is limited to 16 KB.
     * You must provide base64-encoded text. For more information, see
     * [Fn::Base64](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-base64.html)
     * .
     *
     * If the root volume is an EBS volume and you update user data, CloudFormation restarts the
     * instance. If the root volume is an instance store volume and you update user data, the instance
     * is replaced.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-userdata)
     * @param userData The parameters or scripts to store as user data. 
     */
    public fun userData(userData: String)

    /**
     * The volumes to attach to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-volumes)
     * @param volumes The volumes to attach to the instance. 
     */
    public fun volumes(volumes: IResolvable)

    /**
     * The volumes to attach to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-volumes)
     * @param volumes The volumes to attach to the instance. 
     */
    public fun volumes(volumes: List<Any>)

    /**
     * The volumes to attach to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-volumes)
     * @param volumes The volumes to attach to the instance. 
     */
    public fun volumes(vararg volumes: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnInstance.Builder =
        software.amazon.awscdk.services.ec2.CfnInstance.Builder.create(scope, id)

    /**
     * This property is reserved for internal use.
     *
     * If you use it, the stack fails with this error: `Bad property set: [Testing this property]
     * (Service: AmazonEC2; Status Code: 400; Error Code: InvalidParameterCombination; Request ID:
     * 0XXXXXX-49c7-4b40-8bcc-76885dcXXXXX)` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-additionalinfo)
     * @param additionalInfo This property is reserved for internal use. 
     */
    override fun additionalInfo(additionalInfo: String) {
      cdkBuilder.additionalInfo(additionalInfo)
    }

    /**
     * Indicates whether the instance is associated with a dedicated host.
     *
     * If you want the instance to always restart on the same host on which it was launched, specify
     * `host` . If you want the instance to restart on any available host, but try to launch onto the
     * last host it ran on (on a best-effort basis), specify `default` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-affinity)
     * @param affinity Indicates whether the instance is associated with a dedicated host. 
     */
    override fun affinity(affinity: String) {
      cdkBuilder.affinity(affinity)
    }

    /**
     * The Availability Zone of the instance.
     *
     * If not specified, an Availability Zone will be automatically chosen for you based on the load
     * balancing criteria for the Region.
     *
     * This parameter is not supported by
     * [DescribeImageAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImageAttribute.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-availabilityzone)
     * @param availabilityZone The Availability Zone of the instance. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * The block device mapping entries that defines the block devices to attach to the instance at
     * launch.
     *
     * By default, the block devices specified in the block device mapping for the AMI are used. You
     * can override the AMI block device mapping using the instance block device mapping. For the root
     * volume, you can override only the volume size, volume type, volume encryption settings, and the
     * `DeleteOnTermination` setting.
     *
     *
     * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
     * the attached volumes without interrupting the instance. Modifying any other parameter results in
     * instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-blockdevicemappings)
     * @param blockDeviceMappings The block device mapping entries that defines the block devices to
     * attach to the instance at launch. 
     */
    override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable::unwrap))
    }

    /**
     * The block device mapping entries that defines the block devices to attach to the instance at
     * launch.
     *
     * By default, the block devices specified in the block device mapping for the AMI are used. You
     * can override the AMI block device mapping using the instance block device mapping. For the root
     * volume, you can override only the volume size, volume type, volume encryption settings, and the
     * `DeleteOnTermination` setting.
     *
     *
     * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
     * the attached volumes without interrupting the instance. Modifying any other parameter results in
     * instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-blockdevicemappings)
     * @param blockDeviceMappings The block device mapping entries that defines the block devices to
     * attach to the instance at launch. 
     */
    override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    /**
     * The block device mapping entries that defines the block devices to attach to the instance at
     * launch.
     *
     * By default, the block devices specified in the block device mapping for the AMI are used. You
     * can override the AMI block device mapping using the instance block device mapping. For the root
     * volume, you can override only the volume size, volume type, volume encryption settings, and the
     * `DeleteOnTermination` setting.
     *
     *
     * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
     * the attached volumes without interrupting the instance. Modifying any other parameter results in
     * instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-blockdevicemappings)
     * @param blockDeviceMappings The block device mapping entries that defines the block devices to
     * attach to the instance at launch. 
     */
    override fun blockDeviceMappings(vararg blockDeviceMappings: Any): Unit =
        blockDeviceMappings(blockDeviceMappings.toList())

    /**
     * The CPU options for the instance.
     *
     * For more information, see [Optimize CPU
     * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-cpuoptions)
     * @param cpuOptions The CPU options for the instance. 
     */
    override fun cpuOptions(cpuOptions: IResolvable) {
      cdkBuilder.cpuOptions(cpuOptions.let(IResolvable::unwrap))
    }

    /**
     * The CPU options for the instance.
     *
     * For more information, see [Optimize CPU
     * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-cpuoptions)
     * @param cpuOptions The CPU options for the instance. 
     */
    override fun cpuOptions(cpuOptions: CpuOptionsProperty) {
      cdkBuilder.cpuOptions(cpuOptions.let(CpuOptionsProperty::unwrap))
    }

    /**
     * The CPU options for the instance.
     *
     * For more information, see [Optimize CPU
     * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-cpuoptions)
     * @param cpuOptions The CPU options for the instance. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("200f802d6678d49e125ebc55394f3fe219b3c76085e543b3bcf74003b51b8940")
    override fun cpuOptions(cpuOptions: CpuOptionsProperty.Builder.() -> Unit): Unit =
        cpuOptions(CpuOptionsProperty(cpuOptions))

    /**
     * The credit option for CPU usage of the burstable performance instance.
     *
     * Valid values are `standard` and `unlimited` . To change this attribute after launch, use
     * [ModifyInstanceCreditSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html)
     * . For more information, see [Burstable performance
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `standard` (T2 instances) or `unlimited` (T3/T3a/T4g instances)
     *
     * For T3 instances with `host` tenancy, only `standard` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-creditspecification)
     * @param creditSpecification The credit option for CPU usage of the burstable performance
     * instance. 
     */
    override fun creditSpecification(creditSpecification: IResolvable) {
      cdkBuilder.creditSpecification(creditSpecification.let(IResolvable::unwrap))
    }

    /**
     * The credit option for CPU usage of the burstable performance instance.
     *
     * Valid values are `standard` and `unlimited` . To change this attribute after launch, use
     * [ModifyInstanceCreditSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html)
     * . For more information, see [Burstable performance
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `standard` (T2 instances) or `unlimited` (T3/T3a/T4g instances)
     *
     * For T3 instances with `host` tenancy, only `standard` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-creditspecification)
     * @param creditSpecification The credit option for CPU usage of the burstable performance
     * instance. 
     */
    override fun creditSpecification(creditSpecification: CreditSpecificationProperty) {
      cdkBuilder.creditSpecification(creditSpecification.let(CreditSpecificationProperty::unwrap))
    }

    /**
     * The credit option for CPU usage of the burstable performance instance.
     *
     * Valid values are `standard` and `unlimited` . To change this attribute after launch, use
     * [ModifyInstanceCreditSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html)
     * . For more information, see [Burstable performance
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `standard` (T2 instances) or `unlimited` (T3/T3a/T4g instances)
     *
     * For T3 instances with `host` tenancy, only `standard` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-creditspecification)
     * @param creditSpecification The credit option for CPU usage of the burstable performance
     * instance. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("557eb78c2cb1d5bc4288a9e41d6a454decbdb95ace5d44686d1217414b12da80")
    override
        fun creditSpecification(creditSpecification: CreditSpecificationProperty.Builder.() -> Unit):
        Unit = creditSpecification(CreditSpecificationProperty(creditSpecification))

    /**
     * If you set this parameter to `true` , you can't terminate the instance using the Amazon EC2
     * console, CLI, or API;
     *
     * otherwise, you can. To change this attribute after launch, use
     * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
     * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can
     * terminate the instance by running the shutdown command from the instance.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-disableapitermination)
     * @param disableApiTermination If you set this parameter to `true` , you can't terminate the
     * instance using the Amazon EC2 console, CLI, or API;. 
     */
    override fun disableApiTermination(disableApiTermination: Boolean) {
      cdkBuilder.disableApiTermination(disableApiTermination)
    }

    /**
     * If you set this parameter to `true` , you can't terminate the instance using the Amazon EC2
     * console, CLI, or API;
     *
     * otherwise, you can. To change this attribute after launch, use
     * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
     * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can
     * terminate the instance by running the shutdown command from the instance.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-disableapitermination)
     * @param disableApiTermination If you set this parameter to `true` , you can't terminate the
     * instance using the Amazon EC2 console, CLI, or API;. 
     */
    override fun disableApiTermination(disableApiTermination: IResolvable) {
      cdkBuilder.disableApiTermination(disableApiTermination.let(IResolvable::unwrap))
    }

    /**
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all
     * instance types. Additional usage charges apply when using an EBS-optimized instance.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ebsoptimized)
     * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O. 
     */
    override fun ebsOptimized(ebsOptimized: Boolean) {
      cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /**
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all
     * instance types. Additional usage charges apply when using an EBS-optimized instance.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ebsoptimized)
     * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O. 
     */
    override fun ebsOptimized(ebsOptimized: IResolvable) {
      cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
    }

    /**
     * Deprecated.
     *
     *
     * Amazon Elastic Graphics reached end of life on January 8, 2024. For workloads that require
     * graphics acceleration, we recommend that you use Amazon EC2 G4ad, G4dn, or G5 instances.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications)
     * @param elasticGpuSpecifications Deprecated. 
     */
    override fun elasticGpuSpecifications(elasticGpuSpecifications: IResolvable) {
      cdkBuilder.elasticGpuSpecifications(elasticGpuSpecifications.let(IResolvable::unwrap))
    }

    /**
     * Deprecated.
     *
     *
     * Amazon Elastic Graphics reached end of life on January 8, 2024. For workloads that require
     * graphics acceleration, we recommend that you use Amazon EC2 G4ad, G4dn, or G5 instances.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications)
     * @param elasticGpuSpecifications Deprecated. 
     */
    override fun elasticGpuSpecifications(elasticGpuSpecifications: List<Any>) {
      cdkBuilder.elasticGpuSpecifications(elasticGpuSpecifications)
    }

    /**
     * Deprecated.
     *
     *
     * Amazon Elastic Graphics reached end of life on January 8, 2024. For workloads that require
     * graphics acceleration, we recommend that you use Amazon EC2 G4ad, G4dn, or G5 instances.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications)
     * @param elasticGpuSpecifications Deprecated. 
     */
    override fun elasticGpuSpecifications(vararg elasticGpuSpecifications: Any): Unit =
        elasticGpuSpecifications(elasticGpuSpecifications.toList())

    /**
     * An elastic inference accelerator to associate with the instance.
     *
     * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances to
     * accelerate your Deep Learning (DL) inference workloads.
     *
     * You cannot specify accelerators from different generations in the same request.
     *
     *
     * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI),
     * and will help current customers migrate their workloads to options that offer better price and
     * performance. After April 15, 2023, new customers will not be able to launch instances with
     * Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who
     * have used Amazon EI at least once during the past 30-day period are considered current customers
     * and will be able to continue using the service.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticinferenceaccelerators)
     * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
     * instance. 
     */
    override fun elasticInferenceAccelerators(elasticInferenceAccelerators: IResolvable) {
      cdkBuilder.elasticInferenceAccelerators(elasticInferenceAccelerators.let(IResolvable::unwrap))
    }

    /**
     * An elastic inference accelerator to associate with the instance.
     *
     * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances to
     * accelerate your Deep Learning (DL) inference workloads.
     *
     * You cannot specify accelerators from different generations in the same request.
     *
     *
     * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI),
     * and will help current customers migrate their workloads to options that offer better price and
     * performance. After April 15, 2023, new customers will not be able to launch instances with
     * Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who
     * have used Amazon EI at least once during the past 30-day period are considered current customers
     * and will be able to continue using the service.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticinferenceaccelerators)
     * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
     * instance. 
     */
    override fun elasticInferenceAccelerators(elasticInferenceAccelerators: List<Any>) {
      cdkBuilder.elasticInferenceAccelerators(elasticInferenceAccelerators)
    }

    /**
     * An elastic inference accelerator to associate with the instance.
     *
     * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances to
     * accelerate your Deep Learning (DL) inference workloads.
     *
     * You cannot specify accelerators from different generations in the same request.
     *
     *
     * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI),
     * and will help current customers migrate their workloads to options that offer better price and
     * performance. After April 15, 2023, new customers will not be able to launch instances with
     * Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who
     * have used Amazon EI at least once during the past 30-day period are considered current customers
     * and will be able to continue using the service.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticinferenceaccelerators)
     * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
     * instance. 
     */
    override fun elasticInferenceAccelerators(vararg elasticInferenceAccelerators: Any): Unit =
        elasticInferenceAccelerators(elasticInferenceAccelerators.toList())

    /**
     * Indicates whether the instance is enabled for AWS Nitro Enclaves.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-enclaveoptions)
     * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves. 
     */
    override fun enclaveOptions(enclaveOptions: IResolvable) {
      cdkBuilder.enclaveOptions(enclaveOptions.let(IResolvable::unwrap))
    }

    /**
     * Indicates whether the instance is enabled for AWS Nitro Enclaves.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-enclaveoptions)
     * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves. 
     */
    override fun enclaveOptions(enclaveOptions: EnclaveOptionsProperty) {
      cdkBuilder.enclaveOptions(enclaveOptions.let(EnclaveOptionsProperty::unwrap))
    }

    /**
     * Indicates whether the instance is enabled for AWS Nitro Enclaves.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-enclaveoptions)
     * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f759cdb2f8634a2d9e2950ad963a997445cd84d5a62e746ac0abfc8a77e0e5d")
    override fun enclaveOptions(enclaveOptions: EnclaveOptionsProperty.Builder.() -> Unit): Unit =
        enclaveOptions(EnclaveOptionsProperty(enclaveOptions))

    /**
     * Indicates whether an instance is enabled for hibernation.
     *
     * This parameter is valid only if the instance meets the [hibernation
     * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
     * . For more information, see [Hibernate your
     * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon EC2
     * User Guide* .
     *
     * You can't enable hibernation and AWS Nitro Enclaves on the same instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hibernationoptions)
     * @param hibernationOptions Indicates whether an instance is enabled for hibernation. 
     */
    override fun hibernationOptions(hibernationOptions: IResolvable) {
      cdkBuilder.hibernationOptions(hibernationOptions.let(IResolvable::unwrap))
    }

    /**
     * Indicates whether an instance is enabled for hibernation.
     *
     * This parameter is valid only if the instance meets the [hibernation
     * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
     * . For more information, see [Hibernate your
     * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon EC2
     * User Guide* .
     *
     * You can't enable hibernation and AWS Nitro Enclaves on the same instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hibernationoptions)
     * @param hibernationOptions Indicates whether an instance is enabled for hibernation. 
     */
    override fun hibernationOptions(hibernationOptions: HibernationOptionsProperty) {
      cdkBuilder.hibernationOptions(hibernationOptions.let(HibernationOptionsProperty::unwrap))
    }

    /**
     * Indicates whether an instance is enabled for hibernation.
     *
     * This parameter is valid only if the instance meets the [hibernation
     * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
     * . For more information, see [Hibernate your
     * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon EC2
     * User Guide* .
     *
     * You can't enable hibernation and AWS Nitro Enclaves on the same instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hibernationoptions)
     * @param hibernationOptions Indicates whether an instance is enabled for hibernation. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8466dee098089da22e3064fb04b8975a80e569c6287108da8a3220d1a21b95da")
    override
        fun hibernationOptions(hibernationOptions: HibernationOptionsProperty.Builder.() -> Unit):
        Unit = hibernationOptions(HibernationOptionsProperty(hibernationOptions))

    /**
     * If you specify host for the `Affinity` property, the ID of a dedicated host that the instance
     * is associated with.
     *
     * If you don't specify an ID, Amazon EC2 launches the instance onto any available, compatible
     * dedicated host in your account. This type of launch is called an untargeted launch. Note that
     * for untargeted launches, you must have a compatible, dedicated host available to successfully
     * launch instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hostid)
     * @param hostId If you specify host for the `Affinity` property, the ID of a dedicated host
     * that the instance is associated with. 
     */
    override fun hostId(hostId: String) {
      cdkBuilder.hostId(hostId)
    }

    /**
     * The ARN of the host resource group in which to launch the instances.
     *
     * If you specify a host resource group ARN, omit the *Tenancy* parameter or set it to `host` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hostresourcegrouparn)
     * @param hostResourceGroupArn The ARN of the host resource group in which to launch the
     * instances. 
     */
    override fun hostResourceGroupArn(hostResourceGroupArn: String) {
      cdkBuilder.hostResourceGroupArn(hostResourceGroupArn)
    }

    /**
     * The name of an IAM instance profile.
     *
     * To create a new IAM instance profile, use the
     * [AWS::IAM::InstanceProfile](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html)
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-iaminstanceprofile)
     * @param iamInstanceProfile The name of an IAM instance profile. 
     */
    override fun iamInstanceProfile(iamInstanceProfile: String) {
      cdkBuilder.iamInstanceProfile(iamInstanceProfile)
    }

    /**
     * The ID of the AMI.
     *
     * An AMI ID is required to launch an instance and must be specified here or in a launch
     * template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-imageid)
     * @param imageId The ID of the AMI. 
     */
    override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    /**
     * Indicates whether an instance stops or terminates when you initiate shutdown from the
     * instance (using the operating system command for system shutdown).
     *
     * Default: `stop`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-instanceinitiatedshutdownbehavior)
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates
     * when you initiate shutdown from the instance (using the operating system command for system
     * shutdown). 
     */
    override fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: String) {
      cdkBuilder.instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior)
    }

    /**
     * The instance type. For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide* .
     *
     * When you change your EBS-backed instance type, instance restart or replacement behavior
     * depends on the instance type compatibility between the old and new types. An instance with an
     * instance store volume as the root volume is always replaced. For more information, see [Change
     * the instance type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-instancetype)
     * @param instanceType The instance type. For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide* . 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * The number of IPv6 addresses to associate with the primary network interface.
     *
     * Amazon EC2 chooses the IPv6 addresses from the range of your subnet. You cannot specify this
     * option and the option to assign specific IPv6 addresses in the same request. You can specify
     * this option if you've specified a minimum number of instances to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ipv6addresscount)
     * @param ipv6AddressCount The number of IPv6 addresses to associate with the primary network
     * interface. 
     */
    override fun ipv6AddressCount(ipv6AddressCount: Number) {
      cdkBuilder.ipv6AddressCount(ipv6AddressCount)
    }

    /**
     * The IPv6 addresses from the range of the subnet to associate with the primary network
     * interface.
     *
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of instances
     * to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ipv6addresses)
     * @param ipv6Addresses The IPv6 addresses from the range of the subnet to associate with the
     * primary network interface. 
     */
    override fun ipv6Addresses(ipv6Addresses: IResolvable) {
      cdkBuilder.ipv6Addresses(ipv6Addresses.let(IResolvable::unwrap))
    }

    /**
     * The IPv6 addresses from the range of the subnet to associate with the primary network
     * interface.
     *
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of instances
     * to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ipv6addresses)
     * @param ipv6Addresses The IPv6 addresses from the range of the subnet to associate with the
     * primary network interface. 
     */
    override fun ipv6Addresses(ipv6Addresses: List<Any>) {
      cdkBuilder.ipv6Addresses(ipv6Addresses)
    }

    /**
     * The IPv6 addresses from the range of the subnet to associate with the primary network
     * interface.
     *
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of instances
     * to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ipv6addresses)
     * @param ipv6Addresses The IPv6 addresses from the range of the subnet to associate with the
     * primary network interface. 
     */
    override fun ipv6Addresses(vararg ipv6Addresses: Any): Unit =
        ipv6Addresses(ipv6Addresses.toList())

    /**
     * The ID of the kernel.
     *
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [PV-GRUB](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
     * *Amazon EC2 User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-kernelid)
     * @param kernelId The ID of the kernel. 
     */
    override fun kernelId(kernelId: String) {
      cdkBuilder.kernelId(kernelId)
    }

    /**
     * The name of the key pair. You can create a key pair using
     * [CreateKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html)
     * or
     * [ImportKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html) .
     *
     *
     * If you do not specify a key pair, you can't connect to the instance unless you choose an AMI
     * that is configured to allow users another way to log in.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-keyname)
     * @param keyName The name of the key pair. You can create a key pair using
     * [CreateKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html)
     * or
     * [ImportKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html) .
     * 
     */
    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    /**
     * The launch template to use to launch the instances.
     *
     * Any parameters that you specify in the AWS CloudFormation template override the same
     * parameters in the launch template. You can specify either the name or ID of a launch template,
     * but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-launchtemplate)
     * @param launchTemplate The launch template to use to launch the instances. 
     */
    override fun launchTemplate(launchTemplate: IResolvable) {
      cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
    }

    /**
     * The launch template to use to launch the instances.
     *
     * Any parameters that you specify in the AWS CloudFormation template override the same
     * parameters in the launch template. You can specify either the name or ID of a launch template,
     * but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-launchtemplate)
     * @param launchTemplate The launch template to use to launch the instances. 
     */
    override fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty) {
      cdkBuilder.launchTemplate(launchTemplate.let(LaunchTemplateSpecificationProperty::unwrap))
    }

    /**
     * The launch template to use to launch the instances.
     *
     * Any parameters that you specify in the AWS CloudFormation template override the same
     * parameters in the launch template. You can specify either the name or ID of a launch template,
     * but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-launchtemplate)
     * @param launchTemplate The launch template to use to launch the instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a96fad6d5019a3dd2182fee83a3a37fbea28f6c867f2ec0ff8c8d0b4e93680a")
    override
        fun launchTemplate(launchTemplate: LaunchTemplateSpecificationProperty.Builder.() -> Unit):
        Unit = launchTemplate(LaunchTemplateSpecificationProperty(launchTemplate))

    /**
     * The license configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-licensespecifications)
     * @param licenseSpecifications The license configurations. 
     */
    override fun licenseSpecifications(licenseSpecifications: IResolvable) {
      cdkBuilder.licenseSpecifications(licenseSpecifications.let(IResolvable::unwrap))
    }

    /**
     * The license configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-licensespecifications)
     * @param licenseSpecifications The license configurations. 
     */
    override fun licenseSpecifications(licenseSpecifications: List<Any>) {
      cdkBuilder.licenseSpecifications(licenseSpecifications)
    }

    /**
     * The license configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-licensespecifications)
     * @param licenseSpecifications The license configurations. 
     */
    override fun licenseSpecifications(vararg licenseSpecifications: Any): Unit =
        licenseSpecifications(licenseSpecifications.toList())

    /**
     * Specifies whether detailed monitoring is enabled for the instance.
     *
     * Specify `true` to enable detailed monitoring. Otherwise, basic monitoring is enabled. For
     * more information about detailed monitoring, see [Enable or turn off detailed monitoring for your
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html) in the
     * *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-monitoring)
     * @param monitoring Specifies whether detailed monitoring is enabled for the instance. 
     */
    override fun monitoring(monitoring: Boolean) {
      cdkBuilder.monitoring(monitoring)
    }

    /**
     * Specifies whether detailed monitoring is enabled for the instance.
     *
     * Specify `true` to enable detailed monitoring. Otherwise, basic monitoring is enabled. For
     * more information about detailed monitoring, see [Enable or turn off detailed monitoring for your
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html) in the
     * *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-monitoring)
     * @param monitoring Specifies whether detailed monitoring is enabled for the instance. 
     */
    override fun monitoring(monitoring: IResolvable) {
      cdkBuilder.monitoring(monitoring.let(IResolvable::unwrap))
    }

    /**
     * The network interfaces to associate with the instance.
     *
     *
     * If you use this property to point to a network interface, you must terminate the original
     * interface before attaching a new one to allow the update of the instance to succeed.
     *
     * If this resource has a public IP address and is also in a VPC that is defined in the same
     * template, you must use the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the VPC-gateway attachment.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-networkinterfaces)
     * @param networkInterfaces The network interfaces to associate with the instance. 
     */
    override fun networkInterfaces(networkInterfaces: IResolvable) {
      cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable::unwrap))
    }

    /**
     * The network interfaces to associate with the instance.
     *
     *
     * If you use this property to point to a network interface, you must terminate the original
     * interface before attaching a new one to allow the update of the instance to succeed.
     *
     * If this resource has a public IP address and is also in a VPC that is defined in the same
     * template, you must use the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the VPC-gateway attachment.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-networkinterfaces)
     * @param networkInterfaces The network interfaces to associate with the instance. 
     */
    override fun networkInterfaces(networkInterfaces: List<Any>) {
      cdkBuilder.networkInterfaces(networkInterfaces)
    }

    /**
     * The network interfaces to associate with the instance.
     *
     *
     * If you use this property to point to a network interface, you must terminate the original
     * interface before attaching a new one to allow the update of the instance to succeed.
     *
     * If this resource has a public IP address and is also in a VPC that is defined in the same
     * template, you must use the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the VPC-gateway attachment.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-networkinterfaces)
     * @param networkInterfaces The network interfaces to associate with the instance. 
     */
    override fun networkInterfaces(vararg networkInterfaces: Any): Unit =
        networkInterfaces(networkInterfaces.toList())

    /**
     * The name of an existing placement group that you want to launch the instance into (cluster |
     * partition | spread).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-placementgroupname)
     * @param placementGroupName The name of an existing placement group that you want to launch the
     * instance into (cluster | partition | spread). 
     */
    override fun placementGroupName(placementGroupName: String) {
      cdkBuilder.placementGroupName(placementGroupName)
    }

    /**
     * The options for the instance hostname.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-privatednsnameoptions)
     * @param privateDnsNameOptions The options for the instance hostname. 
     */
    override fun privateDnsNameOptions(privateDnsNameOptions: IResolvable) {
      cdkBuilder.privateDnsNameOptions(privateDnsNameOptions.let(IResolvable::unwrap))
    }

    /**
     * The options for the instance hostname.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-privatednsnameoptions)
     * @param privateDnsNameOptions The options for the instance hostname. 
     */
    override fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsProperty) {
      cdkBuilder.privateDnsNameOptions(privateDnsNameOptions.let(PrivateDnsNameOptionsProperty::unwrap))
    }

    /**
     * The options for the instance hostname.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-privatednsnameoptions)
     * @param privateDnsNameOptions The options for the instance hostname. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e02ff10ec39ab61f51631930c93d6b96606843794b59eeb8c716656ba4304b9")
    override
        fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsProperty.Builder.() -> Unit):
        Unit = privateDnsNameOptions(PrivateDnsNameOptionsProperty(privateDnsNameOptions))

    /**
     * The primary IPv4 address. You must specify a value from the IPv4 address range of the subnet.
     *
     * Only one private IP address can be designated as primary. You can't specify this option if
     * you've specified the option to designate a private IP address as the primary IP address in a
     * network interface specification. You cannot specify this option if you're launching more than
     * one instance in the request.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     *
     * If you make an update to an instance that requires replacement, you must assign a new private
     * IP address. During a replacement, AWS CloudFormation creates a new instance but doesn't delete
     * the old instance until the stack has successfully updated. If the stack update fails, AWS
     * CloudFormation uses the old instance to roll back the stack to the previous working state. The
     * old and new instances cannot have the same private IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-privateipaddress)
     * @param privateIpAddress The primary IPv4 address. You must specify a value from the IPv4
     * address range of the subnet. 
     */
    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    /**
     * Indicates whether to assign the tags from the instance to all of the volumes attached to the
     * instance at launch.
     *
     * If you specify `true` and you assign tags to the instance, those tags are automatically
     * assigned to all of the volumes that you attach to the instance at launch. If you specify `false`
     * , those tags are not assigned to the attached volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     * @param propagateTagsToVolumeOnCreation Indicates whether to assign the tags from the instance
     * to all of the volumes attached to the instance at launch. 
     */
    override fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean) {
      cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation)
    }

    /**
     * Indicates whether to assign the tags from the instance to all of the volumes attached to the
     * instance at launch.
     *
     * If you specify `true` and you assign tags to the instance, those tags are automatically
     * assigned to all of the volumes that you attach to the instance at launch. If you specify `false`
     * , those tags are not assigned to the attached volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     * @param propagateTagsToVolumeOnCreation Indicates whether to assign the tags from the instance
     * to all of the volumes attached to the instance at launch. 
     */
    override fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: IResolvable) {
      cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation.let(IResolvable::unwrap))
    }

    /**
     * The ID of the RAM disk to select.
     *
     * Some kernels require additional drivers at launch. Check the kernel requirements for
     * information about whether you need to specify a RAM disk. To find kernel requirements, go to the
     * AWS Resource Center and search for the kernel ID.
     *
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [PV-GRUB](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
     * *Amazon EC2 User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ramdiskid)
     * @param ramdiskId The ID of the RAM disk to select. 
     */
    override fun ramdiskId(ramdiskId: String) {
      cdkBuilder.ramdiskId(ramdiskId)
    }

    /**
     * The IDs of the security groups.
     *
     * You can specify the IDs of existing security groups and references to resources created by
     * the stack template.
     *
     * If you specify a network interface, you must specify any security groups as part of the
     * network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-securitygroupids)
     * @param securityGroupIds The IDs of the security groups. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The IDs of the security groups.
     *
     * You can specify the IDs of existing security groups and references to resources created by
     * the stack template.
     *
     * If you specify a network interface, you must specify any security groups as part of the
     * network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-securitygroupids)
     * @param securityGroupIds The IDs of the security groups. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * [Default VPC] The names of the security groups. For a nondefault VPC, you must use security
     * group IDs instead.
     *
     * You cannot specify this option and the network interfaces option in the same request. The
     * list can contain both the name of existing Amazon EC2 security groups or references to
     * AWS::EC2::SecurityGroup resources created in the template.
     *
     * Default: Amazon EC2 uses the default security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-securitygroups)
     * @param securityGroups [Default VPC] The names of the security groups. For a nondefault VPC,
     * you must use security group IDs instead. 
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * [Default VPC] The names of the security groups. For a nondefault VPC, you must use security
     * group IDs instead.
     *
     * You cannot specify this option and the network interfaces option in the same request. The
     * list can contain both the name of existing Amazon EC2 security groups or references to
     * AWS::EC2::SecurityGroup resources created in the template.
     *
     * Default: Amazon EC2 uses the default security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-securitygroups)
     * @param securityGroups [Default VPC] The names of the security groups. For a nondefault VPC,
     * you must use security group IDs instead. 
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    /**
     * Enable or disable source/destination checks, which ensure that the instance is either the
     * source or the destination of any traffic that it receives.
     *
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-sourcedestcheck)
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     * instance is either the source or the destination of any traffic that it receives. 
     */
    override fun sourceDestCheck(sourceDestCheck: Boolean) {
      cdkBuilder.sourceDestCheck(sourceDestCheck)
    }

    /**
     * Enable or disable source/destination checks, which ensure that the instance is either the
     * source or the destination of any traffic that it receives.
     *
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-sourcedestcheck)
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     * instance is either the source or the destination of any traffic that it receives. 
     */
    override fun sourceDestCheck(sourceDestCheck: IResolvable) {
      cdkBuilder.sourceDestCheck(sourceDestCheck.let(IResolvable::unwrap))
    }

    /**
     * The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* .
     *
     *
     * You can associate only one document with an instance.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ssmassociations)
     * @param ssmAssociations The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* . 
     */
    override fun ssmAssociations(ssmAssociations: IResolvable) {
      cdkBuilder.ssmAssociations(ssmAssociations.let(IResolvable::unwrap))
    }

    /**
     * The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* .
     *
     *
     * You can associate only one document with an instance.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ssmassociations)
     * @param ssmAssociations The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* . 
     */
    override fun ssmAssociations(ssmAssociations: List<Any>) {
      cdkBuilder.ssmAssociations(ssmAssociations)
    }

    /**
     * The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* .
     *
     *
     * You can associate only one document with an instance.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ssmassociations)
     * @param ssmAssociations The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* . 
     */
    override fun ssmAssociations(vararg ssmAssociations: Any): Unit =
        ssmAssociations(ssmAssociations.toList())

    /**
     * The ID of the subnet to launch the instance into.
     *
     * If you specify a network interface, you must specify any subnets as part of the network
     * interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-subnetid)
     * @param subnetId The ID of the subnet to launch the instance into. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * The tags to add to the instance.
     *
     * These tags are not applied to the EBS volumes, such as the root volume, unless
     * [PropagateTagsToVolumeOnCreation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     * is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-tags)
     * @param tags The tags to add to the instance. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to add to the instance.
     *
     * These tags are not applied to the EBS volumes, such as the root volume, unless
     * [PropagateTagsToVolumeOnCreation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     * is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-tags)
     * @param tags The tags to add to the instance. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The tenancy of the instance.
     *
     * An instance with a tenancy of `dedicated` runs on single-tenant hardware.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-tenancy)
     * @param tenancy The tenancy of the instance. 
     */
    override fun tenancy(tenancy: String) {
      cdkBuilder.tenancy(tenancy)
    }

    /**
     * The parameters or scripts to store as user data.
     *
     * Any scripts in user data are run when you launch the instance. User data is limited to 16 KB.
     * You must provide base64-encoded text. For more information, see
     * [Fn::Base64](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-base64.html)
     * .
     *
     * If the root volume is an EBS volume and you update user data, CloudFormation restarts the
     * instance. If the root volume is an instance store volume and you update user data, the instance
     * is replaced.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-userdata)
     * @param userData The parameters or scripts to store as user data. 
     */
    override fun userData(userData: String) {
      cdkBuilder.userData(userData)
    }

    /**
     * The volumes to attach to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-volumes)
     * @param volumes The volumes to attach to the instance. 
     */
    override fun volumes(volumes: IResolvable) {
      cdkBuilder.volumes(volumes.let(IResolvable::unwrap))
    }

    /**
     * The volumes to attach to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-volumes)
     * @param volumes The volumes to attach to the instance. 
     */
    override fun volumes(volumes: List<Any>) {
      cdkBuilder.volumes(volumes)
    }

    /**
     * The volumes to attach to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-volumes)
     * @param volumes The volumes to attach to the instance. 
     */
    override fun volumes(vararg volumes: Any): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnInstance = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnInstance.CFN_RESOURCE_TYPE_NAME

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

  /**
   * Specifies the credit option for CPU usage of a T instance.
   *
   * `CreditSpecification` is a property of the
   * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
   * resource.
   *
   * For more information, see [Burstable performance
   * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
   * in the *Amazon EC2 User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * CreditSpecificationProperty creditSpecificationProperty = CreditSpecificationProperty.builder()
   * .cpuCredits("cpuCredits")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html)
   */
  public interface CreditSpecificationProperty {
    /**
     * The credit option for CPU usage of the instance.
     *
     * Valid values: `standard` | `unlimited`
     *
     * T3 instances with `host` tenancy do not support the `unlimited` CPU credit option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html#cfn-ec2-instance-creditspecification-cpucredits)
     */
    public fun cpuCredits(): String? = unwrap(this).getCpuCredits()

    /**
     * A builder for [CreditSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cpuCredits The credit option for CPU usage of the instance.
       * Valid values: `standard` | `unlimited`
       *
       * T3 instances with `host` tenancy do not support the `unlimited` CPU credit option.
       */
      public fun cpuCredits(cpuCredits: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.CreditSpecificationProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.CreditSpecificationProperty.builder()

      /**
       * @param cpuCredits The credit option for CPU usage of the instance.
       * Valid values: `standard` | `unlimited`
       *
       * T3 instances with `host` tenancy do not support the `unlimited` CPU credit option.
       */
      override fun cpuCredits(cpuCredits: String) {
        cdkBuilder.cpuCredits(cpuCredits)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.CreditSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.CreditSpecificationProperty,
    ) : CdkObject(cdkObject), CreditSpecificationProperty {
      /**
       * The credit option for CPU usage of the instance.
       *
       * Valid values: `standard` | `unlimited`
       *
       * T3 instances with `host` tenancy do not support the `unlimited` CPU credit option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html#cfn-ec2-instance-creditspecification-cpucredits)
       */
      override fun cpuCredits(): String? = unwrap(this).getCpuCredits()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CreditSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.CreditSpecificationProperty):
          CreditSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CreditSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CreditSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.CreditSpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnInstance.CreditSpecificationProperty
    }
  }

  /**
   * Specifies the IPv6 address for the instance.
   *
   * `InstanceIpv6Address` is a property of the
   * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * InstanceIpv6AddressProperty instanceIpv6AddressProperty = InstanceIpv6AddressProperty.builder()
   * .ipv6Address("ipv6Address")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html)
   */
  public interface InstanceIpv6AddressProperty {
    /**
     * The IPv6 address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html#cfn-ec2-instance-instanceipv6address-ipv6address)
     */
    public fun ipv6Address(): String

    /**
     * A builder for [InstanceIpv6AddressProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipv6Address The IPv6 address. 
       */
      public fun ipv6Address(ipv6Address: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.InstanceIpv6AddressProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.InstanceIpv6AddressProperty.builder()

      /**
       * @param ipv6Address The IPv6 address. 
       */
      override fun ipv6Address(ipv6Address: String) {
        cdkBuilder.ipv6Address(ipv6Address)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.InstanceIpv6AddressProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.InstanceIpv6AddressProperty,
    ) : CdkObject(cdkObject), InstanceIpv6AddressProperty {
      /**
       * The IPv6 address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html#cfn-ec2-instance-instanceipv6address-ipv6address)
       */
      override fun ipv6Address(): String = unwrap(this).getIpv6Address()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceIpv6AddressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.InstanceIpv6AddressProperty):
          InstanceIpv6AddressProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceIpv6AddressProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceIpv6AddressProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.InstanceIpv6AddressProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnInstance.InstanceIpv6AddressProperty
    }
  }

  /**
   * Specifies a volume to attach to an instance.
   *
   * `Volume` is an embedded property of the
   * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * VolumeProperty volumeProperty = VolumeProperty.builder()
   * .device("device")
   * .volumeId("volumeId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-volume.html)
   */
  public interface VolumeProperty {
    /**
     * The device name (for example, `/dev/sdh` or `xvdh` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-volume.html#cfn-ec2-instance-volume-device)
     */
    public fun device(): String

    /**
     * The ID of the EBS volume.
     *
     * The volume and instance must be within the same Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-volume.html#cfn-ec2-instance-volume-volumeid)
     */
    public fun volumeId(): String

    /**
     * A builder for [VolumeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param device The device name (for example, `/dev/sdh` or `xvdh` ). 
       */
      public fun device(device: String)

      /**
       * @param volumeId The ID of the EBS volume. 
       * The volume and instance must be within the same Availability Zone.
       */
      public fun volumeId(volumeId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnInstance.VolumeProperty.Builder
          = software.amazon.awscdk.services.ec2.CfnInstance.VolumeProperty.builder()

      /**
       * @param device The device name (for example, `/dev/sdh` or `xvdh` ). 
       */
      override fun device(device: String) {
        cdkBuilder.device(device)
      }

      /**
       * @param volumeId The ID of the EBS volume. 
       * The volume and instance must be within the same Availability Zone.
       */
      override fun volumeId(volumeId: String) {
        cdkBuilder.volumeId(volumeId)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.VolumeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.VolumeProperty,
    ) : CdkObject(cdkObject), VolumeProperty {
      /**
       * The device name (for example, `/dev/sdh` or `xvdh` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-volume.html#cfn-ec2-instance-volume-device)
       */
      override fun device(): String = unwrap(this).getDevice()

      /**
       * The ID of the EBS volume.
       *
       * The volume and instance must be within the same Availability Zone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-volume.html#cfn-ec2-instance-volume-volumeid)
       */
      override fun volumeId(): String = unwrap(this).getVolumeId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.VolumeProperty):
          VolumeProperty = CdkObjectWrappers.wrap(cdkObject) as? VolumeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.VolumeProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnInstance.VolumeProperty
    }
  }

  /**
   * Specifies a block device for an EBS volume.
   *
   * `Ebs` is a property of the [Amazon EC2
   * BlockDeviceMapping](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html)
   * property.
   *
   *
   * After the instance is running, you can modify only the `DeleteOnTermination` parameters for the
   * attached volumes without interrupting the instance. Modifying any other parameter results in
   * instance
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * EbsProperty ebsProperty = EbsProperty.builder()
   * .deleteOnTermination(false)
   * .encrypted(false)
   * .iops(123)
   * .kmsKeyId("kmsKeyId")
   * .snapshotId("snapshotId")
   * .volumeSize(123)
   * .volumeType("volumeType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html)
   */
  public interface EbsProperty {
    /**
     * Indicates whether the EBS volume is deleted on instance termination.
     *
     * For more information, see [Preserving Amazon EBS volumes on instance
     * termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html#cfn-ec2-instance-ebs-deleteontermination)
     */
    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    /**
     * Indicates whether the volume should be encrypted.
     *
     * The effect of setting the encryption state to `true` depends on the volume origin (new or
     * from a snapshot), starting encryption state, ownership, and whether encryption by default is
     * enabled. For more information, see [Encryption by
     * default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
     * in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
     * encryption. For more information, see [Supported instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
     * .
     *
     *
     * After the instance is running, modifying this parameter results in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html#cfn-ec2-instance-ebs-encrypted)
     */
    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    /**
     * The number of I/O operations per second (IOPS).
     *
     * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
     * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
     * volume and the rate at which the volume accumulates I/O credits for bursting.
     *
     * The following are the supported values for each volume type:
     *
     * * `gp3` : 3,000-16,000 IOPS
     * * `io1` : 100-64,000 IOPS
     * * `io2` : 100-64,000 IOPS
     *
     * For `io1` and `io2` volumes, we guarantee 64,000 IOPS only for [Instances built on the Nitro
     * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
     * . Other instance families guarantee performance up to 32,000 IOPS.
     *
     * This parameter is required for `io1` and `io2` volumes. The default for `gp3` volumes is
     * 3,000 IOPS. This parameter is not supported for `gp2` , `st1` , `sc1` , or `standard` volumes.
     *
     *
     * After the instance is running, modifying this parameter results in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html#cfn-ec2-instance-ebs-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * The identifier of the AWS KMS key to use for Amazon EBS encryption.
     *
     * If `KmsKeyId` is specified, the encrypted state must be `true` . If the encrypted state is
     * `true` but you do not specify `KmsKeyId` , your KMS key for EBS is used.
     *
     * You can specify the KMS key using any of the following:
     *
     * * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
     * * Key alias. For example, alias/ExampleAlias.
     * * Key ARN. For example,
     * arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * * Alias ARN. For example, arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias.
     *
     *
     * After the instance is running, modifying this parameter results in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html#cfn-ec2-instance-ebs-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The ID of the snapshot.
     *
     * If you specify both `SnapshotId` and `VolumeSize` , `VolumeSize` must be equal or greater
     * than the size of the snapshot.
     *
     *
     * After the instance is running, modifying this parameter results in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html#cfn-ec2-instance-ebs-snapshotid)
     */
    public fun snapshotId(): String? = unwrap(this).getSnapshotId()

    /**
     * The size of the volume, in GiBs.
     *
     * You must specify either a snapshot ID or a volume size. If you specify a snapshot, the
     * default is the snapshot size. You can specify a volume size that is equal to or larger than the
     * snapshot size.
     *
     * The following are the supported volumes sizes for each volume type:
     *
     * * `gp2` and `gp3` :1-16,384
     * * `io1` and `io2` : 4-16,384
     * * `st1` and `sc1` : 125-16,384
     * * `standard` : 1-1,024
     *
     *
     * After the instance is running, modifying this parameter results in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html#cfn-ec2-instance-ebs-volumesize)
     */
    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    /**
     * The volume type.
     *
     * For more information, see [Amazon EBS volume
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
     * EC2 User Guide* . If the volume type is `io1` or `io2` , you must specify the IOPS that the
     * volume supports.
     *
     *
     * After the instance is running, modifying this parameter results in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html#cfn-ec2-instance-ebs-volumetype)
     */
    public fun volumeType(): String? = unwrap(this).getVolumeType()

    /**
     * A builder for [EbsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance
       * termination.
       * For more information, see [Preserving Amazon EBS volumes on instance
       * termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination)
       * in the *Amazon EC2 User Guide* .
       */
      public fun deleteOnTermination(deleteOnTermination: Boolean)

      /**
       * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance
       * termination.
       * For more information, see [Preserving Amazon EBS volumes on instance
       * termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination)
       * in the *Amazon EC2 User Guide* .
       */
      public fun deleteOnTermination(deleteOnTermination: IResolvable)

      /**
       * @param encrypted Indicates whether the volume should be encrypted.
       * The effect of setting the encryption state to `true` depends on the volume origin (new or
       * from a snapshot), starting encryption state, ownership, and whether encryption by default is
       * enabled. For more information, see [Encryption by
       * default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
       * in the *Amazon Elastic Compute Cloud User Guide* .
       *
       * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
       * encryption. For more information, see [Supported instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
       * .
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      public fun encrypted(encrypted: Boolean)

      /**
       * @param encrypted Indicates whether the volume should be encrypted.
       * The effect of setting the encryption state to `true` depends on the volume origin (new or
       * from a snapshot), starting encryption state, ownership, and whether encryption by default is
       * enabled. For more information, see [Encryption by
       * default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
       * in the *Amazon Elastic Compute Cloud User Guide* .
       *
       * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
       * encryption. For more information, see [Supported instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
       * .
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      public fun encrypted(encrypted: IResolvable)

      /**
       * @param iops The number of I/O operations per second (IOPS).
       * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
       * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
       * volume and the rate at which the volume accumulates I/O credits for bursting.
       *
       * The following are the supported values for each volume type:
       *
       * * `gp3` : 3,000-16,000 IOPS
       * * `io1` : 100-64,000 IOPS
       * * `io2` : 100-64,000 IOPS
       *
       * For `io1` and `io2` volumes, we guarantee 64,000 IOPS only for [Instances built on the
       * Nitro
       * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
       * . Other instance families guarantee performance up to 32,000 IOPS.
       *
       * This parameter is required for `io1` and `io2` volumes. The default for `gp3` volumes is
       * 3,000 IOPS. This parameter is not supported for `gp2` , `st1` , `sc1` , or `standard` volumes.
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      public fun iops(iops: Number)

      /**
       * @param kmsKeyId The identifier of the AWS KMS key to use for Amazon EBS encryption.
       * If `KmsKeyId` is specified, the encrypted state must be `true` . If the encrypted state is
       * `true` but you do not specify `KmsKeyId` , your KMS key for EBS is used.
       *
       * You can specify the KMS key using any of the following:
       *
       * * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
       * * Key alias. For example, alias/ExampleAlias.
       * * Key ARN. For example,
       * arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
       * * Alias ARN. For example, arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias.
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param snapshotId The ID of the snapshot.
       * If you specify both `SnapshotId` and `VolumeSize` , `VolumeSize` must be equal or greater
       * than the size of the snapshot.
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      public fun snapshotId(snapshotId: String)

      /**
       * @param volumeSize The size of the volume, in GiBs.
       * You must specify either a snapshot ID or a volume size. If you specify a snapshot, the
       * default is the snapshot size. You can specify a volume size that is equal to or larger than
       * the snapshot size.
       *
       * The following are the supported volumes sizes for each volume type:
       *
       * * `gp2` and `gp3` :1-16,384
       * * `io1` and `io2` : 4-16,384
       * * `st1` and `sc1` : 125-16,384
       * * `standard` : 1-1,024
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      public fun volumeSize(volumeSize: Number)

      /**
       * @param volumeType The volume type.
       * For more information, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
       * EC2 User Guide* . If the volume type is `io1` or `io2` , you must specify the IOPS that the
       * volume supports.
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnInstance.EbsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.EbsProperty.builder()

      /**
       * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance
       * termination.
       * For more information, see [Preserving Amazon EBS volumes on instance
       * termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination)
       * in the *Amazon EC2 User Guide* .
       */
      override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      /**
       * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance
       * termination.
       * For more information, see [Preserving Amazon EBS volumes on instance
       * termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination)
       * in the *Amazon EC2 User Guide* .
       */
      override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
      }

      /**
       * @param encrypted Indicates whether the volume should be encrypted.
       * The effect of setting the encryption state to `true` depends on the volume origin (new or
       * from a snapshot), starting encryption state, ownership, and whether encryption by default is
       * enabled. For more information, see [Encryption by
       * default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
       * in the *Amazon Elastic Compute Cloud User Guide* .
       *
       * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
       * encryption. For more information, see [Supported instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
       * .
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      /**
       * @param encrypted Indicates whether the volume should be encrypted.
       * The effect of setting the encryption state to `true` depends on the volume origin (new or
       * from a snapshot), starting encryption state, ownership, and whether encryption by default is
       * enabled. For more information, see [Encryption by
       * default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
       * in the *Amazon Elastic Compute Cloud User Guide* .
       *
       * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
       * encryption. For more information, see [Supported instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
       * .
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      /**
       * @param iops The number of I/O operations per second (IOPS).
       * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
       * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
       * volume and the rate at which the volume accumulates I/O credits for bursting.
       *
       * The following are the supported values for each volume type:
       *
       * * `gp3` : 3,000-16,000 IOPS
       * * `io1` : 100-64,000 IOPS
       * * `io2` : 100-64,000 IOPS
       *
       * For `io1` and `io2` volumes, we guarantee 64,000 IOPS only for [Instances built on the
       * Nitro
       * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
       * . Other instance families guarantee performance up to 32,000 IOPS.
       *
       * This parameter is required for `io1` and `io2` volumes. The default for `gp3` volumes is
       * 3,000 IOPS. This parameter is not supported for `gp2` , `st1` , `sc1` , or `standard` volumes.
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param kmsKeyId The identifier of the AWS KMS key to use for Amazon EBS encryption.
       * If `KmsKeyId` is specified, the encrypted state must be `true` . If the encrypted state is
       * `true` but you do not specify `KmsKeyId` , your KMS key for EBS is used.
       *
       * You can specify the KMS key using any of the following:
       *
       * * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
       * * Key alias. For example, alias/ExampleAlias.
       * * Key ARN. For example,
       * arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
       * * Alias ARN. For example, arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias.
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param snapshotId The ID of the snapshot.
       * If you specify both `SnapshotId` and `VolumeSize` , `VolumeSize` must be equal or greater
       * than the size of the snapshot.
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      override fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
      }

      /**
       * @param volumeSize The size of the volume, in GiBs.
       * You must specify either a snapshot ID or a volume size. If you specify a snapshot, the
       * default is the snapshot size. You can specify a volume size that is equal to or larger than
       * the snapshot size.
       *
       * The following are the supported volumes sizes for each volume type:
       *
       * * `gp2` and `gp3` :1-16,384
       * * `io1` and `io2` : 4-16,384
       * * `st1` and `sc1` : 125-16,384
       * * `standard` : 1-1,024
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      /**
       * @param volumeType The volume type.
       * For more information, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
       * EC2 User Guide* . If the volume type is `io1` or `io2` , you must specify the IOPS that the
       * volume supports.
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.EbsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.EbsProperty,
    ) : CdkObject(cdkObject), EbsProperty {
      /**
       * Indicates whether the EBS volume is deleted on instance termination.
       *
       * For more information, see [Preserving Amazon EBS volumes on instance
       * termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination)
       * in the *Amazon EC2 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html#cfn-ec2-instance-ebs-deleteontermination)
       */
      override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      /**
       * Indicates whether the volume should be encrypted.
       *
       * The effect of setting the encryption state to `true` depends on the volume origin (new or
       * from a snapshot), starting encryption state, ownership, and whether encryption by default is
       * enabled. For more information, see [Encryption by
       * default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
       * in the *Amazon Elastic Compute Cloud User Guide* .
       *
       * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
       * encryption. For more information, see [Supported instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
       * .
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html#cfn-ec2-instance-ebs-encrypted)
       */
      override fun encrypted(): Any? = unwrap(this).getEncrypted()

      /**
       * The number of I/O operations per second (IOPS).
       *
       * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are
       * provisioned for the volume. For `gp2` volumes, this represents the baseline performance of the
       * volume and the rate at which the volume accumulates I/O credits for bursting.
       *
       * The following are the supported values for each volume type:
       *
       * * `gp3` : 3,000-16,000 IOPS
       * * `io1` : 100-64,000 IOPS
       * * `io2` : 100-64,000 IOPS
       *
       * For `io1` and `io2` volumes, we guarantee 64,000 IOPS only for [Instances built on the
       * Nitro
       * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
       * . Other instance families guarantee performance up to 32,000 IOPS.
       *
       * This parameter is required for `io1` and `io2` volumes. The default for `gp3` volumes is
       * 3,000 IOPS. This parameter is not supported for `gp2` , `st1` , `sc1` , or `standard` volumes.
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html#cfn-ec2-instance-ebs-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * The identifier of the AWS KMS key to use for Amazon EBS encryption.
       *
       * If `KmsKeyId` is specified, the encrypted state must be `true` . If the encrypted state is
       * `true` but you do not specify `KmsKeyId` , your KMS key for EBS is used.
       *
       * You can specify the KMS key using any of the following:
       *
       * * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
       * * Key alias. For example, alias/ExampleAlias.
       * * Key ARN. For example,
       * arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
       * * Alias ARN. For example, arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias.
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html#cfn-ec2-instance-ebs-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The ID of the snapshot.
       *
       * If you specify both `SnapshotId` and `VolumeSize` , `VolumeSize` must be equal or greater
       * than the size of the snapshot.
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html#cfn-ec2-instance-ebs-snapshotid)
       */
      override fun snapshotId(): String? = unwrap(this).getSnapshotId()

      /**
       * The size of the volume, in GiBs.
       *
       * You must specify either a snapshot ID or a volume size. If you specify a snapshot, the
       * default is the snapshot size. You can specify a volume size that is equal to or larger than
       * the snapshot size.
       *
       * The following are the supported volumes sizes for each volume type:
       *
       * * `gp2` and `gp3` :1-16,384
       * * `io1` and `io2` : 4-16,384
       * * `st1` and `sc1` : 125-16,384
       * * `standard` : 1-1,024
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html#cfn-ec2-instance-ebs-volumesize)
       */
      override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      /**
       * The volume type.
       *
       * For more information, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
       * EC2 User Guide* . If the volume type is `io1` or `io2` , you must specify the IOPS that the
       * volume supports.
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html#cfn-ec2-instance-ebs-volumetype)
       */
      override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.EbsProperty):
          EbsProperty = CdkObjectWrappers.wrap(cdkObject) as? EbsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.EbsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnInstance.EbsProperty
    }
  }

  /**
   * The type of hostnames to assign to instances in the subnet at launch.
   *
   * For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For
   * IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack subnets,
   * you can specify whether DNS names use the instance IPv4 address or the instance ID. For more
   * information, see [Amazon EC2 instance hostname
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
   * *Amazon Elastic Compute Cloud User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * PrivateDnsNameOptionsProperty privateDnsNameOptionsProperty =
   * PrivateDnsNameOptionsProperty.builder()
   * .enableResourceNameDnsAaaaRecord(false)
   * .enableResourceNameDnsARecord(false)
   * .hostnameType("hostnameType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-privatednsnameoptions.html)
   */
  public interface PrivateDnsNameOptionsProperty {
    /**
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     *
     * For more information, see [Amazon EC2 instance hostname
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-privatednsnameoptions.html#cfn-ec2-instance-privatednsnameoptions-enableresourcenamednsarecord)
     */
    public fun enableResourceNameDnsARecord(): Any? = unwrap(this).getEnableResourceNameDnsARecord()

    /**
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     *
     * For more information, see [Amazon EC2 instance hostname
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-privatednsnameoptions.html#cfn-ec2-instance-privatednsnameoptions-enableresourcenamednsaaaarecord)
     */
    public fun enableResourceNameDnsAaaaRecord(): Any? =
        unwrap(this).getEnableResourceNameDnsAaaaRecord()

    /**
     * The type of hostnames to assign to instances in the subnet at launch.
     *
     * For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For
     * IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
     * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID. For
     * more information, see [Amazon EC2 instance hostname
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-privatednsnameoptions.html#cfn-ec2-instance-privatednsnameoptions-hostnametype)
     */
    public fun hostnameType(): String? = unwrap(this).getHostnameType()

    /**
     * A builder for [PrivateDnsNameOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableResourceNameDnsARecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS A records.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean)

      /**
       * @param enableResourceNameDnsARecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS A records.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable)

      /**
       * @param enableResourceNameDnsAaaaRecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS AAAA records.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean)

      /**
       * @param enableResourceNameDnsAaaaRecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS AAAA records.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable)

      /**
       * @param hostnameType The type of hostnames to assign to instances in the subnet at launch.
       * For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For
       * IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
       * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      public fun hostnameType(hostnameType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateDnsNameOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateDnsNameOptionsProperty.builder()

      /**
       * @param enableResourceNameDnsARecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS A records.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord)
      }

      /**
       * @param enableResourceNameDnsARecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS A records.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord.let(IResolvable::unwrap))
      }

      /**
       * @param enableResourceNameDnsAaaaRecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS AAAA records.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord)
      }

      /**
       * @param enableResourceNameDnsAaaaRecord Indicates whether to respond to DNS queries for
       * instance hostnames with DNS AAAA records.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord.let(IResolvable::unwrap))
      }

      /**
       * @param hostnameType The type of hostnames to assign to instances in the subnet at launch.
       * For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For
       * IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
       * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       */
      override fun hostnameType(hostnameType: String) {
        cdkBuilder.hostnameType(hostnameType)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateDnsNameOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateDnsNameOptionsProperty,
    ) : CdkObject(cdkObject), PrivateDnsNameOptionsProperty {
      /**
       * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
       *
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-privatednsnameoptions.html#cfn-ec2-instance-privatednsnameoptions-enableresourcenamednsarecord)
       */
      override fun enableResourceNameDnsARecord(): Any? =
          unwrap(this).getEnableResourceNameDnsARecord()

      /**
       * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
       *
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-privatednsnameoptions.html#cfn-ec2-instance-privatednsnameoptions-enableresourcenamednsaaaarecord)
       */
      override fun enableResourceNameDnsAaaaRecord(): Any? =
          unwrap(this).getEnableResourceNameDnsAaaaRecord()

      /**
       * The type of hostnames to assign to instances in the subnet at launch.
       *
       * For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For
       * IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack
       * subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
       * For more information, see [Amazon EC2 instance hostname
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
       * *Amazon Elastic Compute Cloud User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-privatednsnameoptions.html#cfn-ec2-instance-privatednsnameoptions-hostnametype)
       */
      override fun hostnameType(): String? = unwrap(this).getHostnameType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateDnsNameOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.PrivateDnsNameOptionsProperty):
          PrivateDnsNameOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PrivateDnsNameOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateDnsNameOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateDnsNameOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateDnsNameOptionsProperty
    }
  }

  /**
   * Indicates whether the instance is enabled for AWS Nitro Enclaves.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * EnclaveOptionsProperty enclaveOptionsProperty = EnclaveOptionsProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-enclaveoptions.html)
   */
  public interface EnclaveOptionsProperty {
    /**
     * If this parameter is set to `true` , the instance is enabled for AWS Nitro Enclaves;
     *
     * otherwise, it is not enabled for AWS Nitro Enclaves.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-enclaveoptions.html#cfn-ec2-instance-enclaveoptions-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [EnclaveOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled If this parameter is set to `true` , the instance is enabled for AWS Nitro
       * Enclaves;.
       * otherwise, it is not enabled for AWS Nitro Enclaves.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled If this parameter is set to `true` , the instance is enabled for AWS Nitro
       * Enclaves;.
       * otherwise, it is not enabled for AWS Nitro Enclaves.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.EnclaveOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.EnclaveOptionsProperty.builder()

      /**
       * @param enabled If this parameter is set to `true` , the instance is enabled for AWS Nitro
       * Enclaves;.
       * otherwise, it is not enabled for AWS Nitro Enclaves.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled If this parameter is set to `true` , the instance is enabled for AWS Nitro
       * Enclaves;.
       * otherwise, it is not enabled for AWS Nitro Enclaves.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.EnclaveOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.EnclaveOptionsProperty,
    ) : CdkObject(cdkObject), EnclaveOptionsProperty {
      /**
       * If this parameter is set to `true` , the instance is enabled for AWS Nitro Enclaves;
       *
       * otherwise, it is not enabled for AWS Nitro Enclaves.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-enclaveoptions.html#cfn-ec2-instance-enclaveoptions-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnclaveOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.EnclaveOptionsProperty):
          EnclaveOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? EnclaveOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnclaveOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.EnclaveOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnInstance.EnclaveOptionsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * NoDeviceProperty noDeviceProperty = NoDeviceProperty.builder().build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-nodevice.html)
   */
  public interface NoDeviceProperty {
    /**
     * A builder for [NoDeviceProperty]
     */
    @CdkDslMarker
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.NoDeviceProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.NoDeviceProperty.builder()

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.NoDeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.NoDeviceProperty,
    ) : CdkObject(cdkObject), NoDeviceProperty

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NoDeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.NoDeviceProperty):
          NoDeviceProperty = CdkObjectWrappers.wrap(cdkObject) as? NoDeviceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NoDeviceProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.NoDeviceProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnInstance.NoDeviceProperty
    }
  }

  /**
   * Specifies a secondary private IPv4 address for a network interface.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * PrivateIpAddressSpecificationProperty privateIpAddressSpecificationProperty =
   * PrivateIpAddressSpecificationProperty.builder()
   * .primary(false)
   * .privateIpAddress("privateIpAddress")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-privateipaddressspecification.html)
   */
  public interface PrivateIpAddressSpecificationProperty {
    /**
     * Indicates whether the private IPv4 address is the primary private IPv4 address.
     *
     * Only one IPv4 address can be designated as primary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-privateipaddressspecification.html#cfn-ec2-instance-privateipaddressspecification-primary)
     */
    public fun primary(): Any

    /**
     * The private IPv4 address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-privateipaddressspecification.html#cfn-ec2-instance-privateipaddressspecification-privateipaddress)
     */
    public fun privateIpAddress(): String

    /**
     * A builder for [PrivateIpAddressSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param primary Indicates whether the private IPv4 address is the primary private IPv4
       * address. 
       * Only one IPv4 address can be designated as primary.
       */
      public fun primary(primary: Boolean)

      /**
       * @param primary Indicates whether the private IPv4 address is the primary private IPv4
       * address. 
       * Only one IPv4 address can be designated as primary.
       */
      public fun primary(primary: IResolvable)

      /**
       * @param privateIpAddress The private IPv4 address. 
       */
      public fun privateIpAddress(privateIpAddress: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateIpAddressSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateIpAddressSpecificationProperty.builder()

      /**
       * @param primary Indicates whether the private IPv4 address is the primary private IPv4
       * address. 
       * Only one IPv4 address can be designated as primary.
       */
      override fun primary(primary: Boolean) {
        cdkBuilder.primary(primary)
      }

      /**
       * @param primary Indicates whether the private IPv4 address is the primary private IPv4
       * address. 
       * Only one IPv4 address can be designated as primary.
       */
      override fun primary(primary: IResolvable) {
        cdkBuilder.primary(primary.let(IResolvable::unwrap))
      }

      /**
       * @param privateIpAddress The private IPv4 address. 
       */
      override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateIpAddressSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateIpAddressSpecificationProperty,
    ) : CdkObject(cdkObject), PrivateIpAddressSpecificationProperty {
      /**
       * Indicates whether the private IPv4 address is the primary private IPv4 address.
       *
       * Only one IPv4 address can be designated as primary.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-privateipaddressspecification.html#cfn-ec2-instance-privateipaddressspecification-primary)
       */
      override fun primary(): Any = unwrap(this).getPrimary()

      /**
       * The private IPv4 address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-privateipaddressspecification.html#cfn-ec2-instance-privateipaddressspecification-privateipaddress)
       */
      override fun privateIpAddress(): String = unwrap(this).getPrivateIpAddress()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PrivateIpAddressSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.PrivateIpAddressSpecificationProperty):
          PrivateIpAddressSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PrivateIpAddressSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateIpAddressSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateIpAddressSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnInstance.PrivateIpAddressSpecificationProperty
    }
  }

  /**
   * Specifies the hibernation options for the instance.
   *
   * `HibernationOptions` is a property of the
   * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * HibernationOptionsProperty hibernationOptionsProperty = HibernationOptionsProperty.builder()
   * .configured(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-hibernationoptions.html)
   */
  public interface HibernationOptionsProperty {
    /**
     * Set to `true` to enable your instance for hibernation.
     *
     * For Spot Instances, if you set `Configured` to `true` , either omit the
     * `InstanceInterruptionBehavior` parameter (for
     * [`SpotMarketOptions`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotMarketOptions.html)
     * ), or set it to `hibernate` . When `Configured` is true:
     *
     * * If you omit `InstanceInterruptionBehavior` , it defaults to `hibernate` .
     * * If you set `InstanceInterruptionBehavior` to a value other than `hibernate` , you'll get an
     * error.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-hibernationoptions.html#cfn-ec2-instance-hibernationoptions-configured)
     */
    public fun configured(): Any? = unwrap(this).getConfigured()

    /**
     * A builder for [HibernationOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configured Set to `true` to enable your instance for hibernation.
       * For Spot Instances, if you set `Configured` to `true` , either omit the
       * `InstanceInterruptionBehavior` parameter (for
       * [`SpotMarketOptions`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotMarketOptions.html)
       * ), or set it to `hibernate` . When `Configured` is true:
       *
       * * If you omit `InstanceInterruptionBehavior` , it defaults to `hibernate` .
       * * If you set `InstanceInterruptionBehavior` to a value other than `hibernate` , you'll get
       * an error.
       *
       * Default: `false`
       */
      public fun configured(configured: Boolean)

      /**
       * @param configured Set to `true` to enable your instance for hibernation.
       * For Spot Instances, if you set `Configured` to `true` , either omit the
       * `InstanceInterruptionBehavior` parameter (for
       * [`SpotMarketOptions`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotMarketOptions.html)
       * ), or set it to `hibernate` . When `Configured` is true:
       *
       * * If you omit `InstanceInterruptionBehavior` , it defaults to `hibernate` .
       * * If you set `InstanceInterruptionBehavior` to a value other than `hibernate` , you'll get
       * an error.
       *
       * Default: `false`
       */
      public fun configured(configured: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.HibernationOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.HibernationOptionsProperty.builder()

      /**
       * @param configured Set to `true` to enable your instance for hibernation.
       * For Spot Instances, if you set `Configured` to `true` , either omit the
       * `InstanceInterruptionBehavior` parameter (for
       * [`SpotMarketOptions`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotMarketOptions.html)
       * ), or set it to `hibernate` . When `Configured` is true:
       *
       * * If you omit `InstanceInterruptionBehavior` , it defaults to `hibernate` .
       * * If you set `InstanceInterruptionBehavior` to a value other than `hibernate` , you'll get
       * an error.
       *
       * Default: `false`
       */
      override fun configured(configured: Boolean) {
        cdkBuilder.configured(configured)
      }

      /**
       * @param configured Set to `true` to enable your instance for hibernation.
       * For Spot Instances, if you set `Configured` to `true` , either omit the
       * `InstanceInterruptionBehavior` parameter (for
       * [`SpotMarketOptions`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotMarketOptions.html)
       * ), or set it to `hibernate` . When `Configured` is true:
       *
       * * If you omit `InstanceInterruptionBehavior` , it defaults to `hibernate` .
       * * If you set `InstanceInterruptionBehavior` to a value other than `hibernate` , you'll get
       * an error.
       *
       * Default: `false`
       */
      override fun configured(configured: IResolvable) {
        cdkBuilder.configured(configured.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.HibernationOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.HibernationOptionsProperty,
    ) : CdkObject(cdkObject), HibernationOptionsProperty {
      /**
       * Set to `true` to enable your instance for hibernation.
       *
       * For Spot Instances, if you set `Configured` to `true` , either omit the
       * `InstanceInterruptionBehavior` parameter (for
       * [`SpotMarketOptions`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotMarketOptions.html)
       * ), or set it to `hibernate` . When `Configured` is true:
       *
       * * If you omit `InstanceInterruptionBehavior` , it defaults to `hibernate` .
       * * If you set `InstanceInterruptionBehavior` to a value other than `hibernate` , you'll get
       * an error.
       *
       * Default: `false`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-hibernationoptions.html#cfn-ec2-instance-hibernationoptions-configured)
       */
      override fun configured(): Any? = unwrap(this).getConfigured()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HibernationOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.HibernationOptionsProperty):
          HibernationOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HibernationOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HibernationOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.HibernationOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnInstance.HibernationOptionsProperty
    }
  }

  /**
   * Specifies the license configuration to use.
   *
   * `LicenseSpecification` is a property of the
   * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * LicenseSpecificationProperty licenseSpecificationProperty =
   * LicenseSpecificationProperty.builder()
   * .licenseConfigurationArn("licenseConfigurationArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-licensespecification.html)
   */
  public interface LicenseSpecificationProperty {
    /**
     * The Amazon Resource Name (ARN) of the license configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-licensespecification.html#cfn-ec2-instance-licensespecification-licenseconfigurationarn)
     */
    public fun licenseConfigurationArn(): String

    /**
     * A builder for [LicenseSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param licenseConfigurationArn The Amazon Resource Name (ARN) of the license configuration.
       * 
       */
      public fun licenseConfigurationArn(licenseConfigurationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.LicenseSpecificationProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.LicenseSpecificationProperty.builder()

      /**
       * @param licenseConfigurationArn The Amazon Resource Name (ARN) of the license configuration.
       * 
       */
      override fun licenseConfigurationArn(licenseConfigurationArn: String) {
        cdkBuilder.licenseConfigurationArn(licenseConfigurationArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.LicenseSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.LicenseSpecificationProperty,
    ) : CdkObject(cdkObject), LicenseSpecificationProperty {
      /**
       * The Amazon Resource Name (ARN) of the license configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-licensespecification.html#cfn-ec2-instance-licensespecification-licenseconfigurationarn)
       */
      override fun licenseConfigurationArn(): String = unwrap(this).getLicenseConfigurationArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LicenseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.LicenseSpecificationProperty):
          LicenseSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LicenseSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LicenseSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.LicenseSpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnInstance.LicenseSpecificationProperty
    }
  }

  /**
   * Specifies a network interface that is to be attached to an instance.
   *
   * You can create a network interface when launching an instance. For an example, see the
   * [AWS::EC2::Instance
   * examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#aws-properties-ec2-instance--examples--Automatically_assign_a_public_IP_address)
   * .
   *
   * Alternatively, you can attach an existing network interface when launching an instance. For an
   * example, see the [AWS::EC2:NetworkInterface
   * examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html#aws-resource-ec2-networkinterface--examples)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
   * .deviceIndex("deviceIndex")
   * // the properties below are optional
   * .associateCarrierIpAddress(false)
   * .associatePublicIpAddress(false)
   * .deleteOnTermination(false)
   * .description("description")
   * .groupSet(List.of("groupSet"))
   * .ipv6AddressCount(123)
   * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
   * .ipv6Address("ipv6Address")
   * .build()))
   * .networkInterfaceId("networkInterfaceId")
   * .privateIpAddress("privateIpAddress")
   * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
   * .primary(false)
   * .privateIpAddress("privateIpAddress")
   * .build()))
   * .secondaryPrivateIpAddressCount(123)
   * .subnetId("subnetId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html)
   */
  public interface NetworkInterfaceProperty {
    /**
     * Indicates whether to assign a carrier IP address to the network interface.
     *
     * You can only assign a carrier IP address to a network interface that is in a subnet in a
     * Wavelength Zone. For more information about carrier IP addresses, see [Carrier IP
     * address](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip)
     * in the *AWS Wavelength Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-associatecarrieripaddress)
     */
    public fun associateCarrierIpAddress(): Any? = unwrap(this).getAssociateCarrierIpAddress()

    /**
     * Indicates whether to assign a public IPv4 address to an instance.
     *
     * Applies only if creating a network interface when launching an instance. The network
     * interface must be the primary network interface. If launching into a default subnet, the default
     * value is `true` .
     *
     * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
     * running instances and Elastic IP addresses. For more information, see the *Public IPv4 Address*
     * tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-associatepublicipaddress)
     */
    public fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

    /**
     * Indicates whether the network interface is deleted when the instance is terminated.
     *
     * Applies only if creating a network interface when launching an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-deleteontermination)
     */
    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    /**
     * The description of the network interface.
     *
     * Applies only if creating a network interface when launching an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The position of the network interface in the attachment order.
     *
     * A primary network interface has a device index of 0.
     *
     * If you create a network interface when launching an instance, you must specify the device
     * index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-deviceindex)
     */
    public fun deviceIndex(): String

    /**
     * The IDs of the security groups for the network interface.
     *
     * Applies only if creating a network interface when launching an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-groupset)
     */
    public fun groupSet(): List<String> = unwrap(this).getGroupSet() ?: emptyList()

    /**
     * A number of IPv6 addresses to assign to the network interface.
     *
     * Amazon EC2 chooses the IPv6 addresses from the range of the subnet. You cannot specify this
     * option and the option to assign specific IPv6 addresses in the same request. You can specify
     * this option if you've specified a minimum number of instances to launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-ipv6addresscount)
     */
    public fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

    /**
     * The IPv6 addresses to assign to the network interface.
     *
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of instances
     * to launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-ipv6addresses)
     */
    public fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

    /**
     * The ID of the network interface, when attaching an existing network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-networkinterfaceid)
     */
    public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    /**
     * The private IPv4 address of the network interface.
     *
     * Applies only if creating a network interface when launching an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-privateipaddress)
     */
    public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    /**
     * One or more private IPv4 addresses to assign to the network interface.
     *
     * Only one private IPv4 address can be designated as primary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-privateipaddresses)
     */
    public fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

    /**
     * The number of secondary private IPv4 addresses.
     *
     * You can't specify this option and specify more than one private IP address using the private
     * IP addresses option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-secondaryprivateipaddresscount)
     */
    public fun secondaryPrivateIpAddressCount(): Number? =
        unwrap(this).getSecondaryPrivateIpAddressCount()

    /**
     * The ID of the subnet associated with the network interface.
     *
     * Applies only if creating a network interface when launching an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-subnetid)
     */
    public fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * A builder for [NetworkInterfaceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param associateCarrierIpAddress Indicates whether to assign a carrier IP address to the
       * network interface.
       * You can only assign a carrier IP address to a network interface that is in a subnet in a
       * Wavelength Zone. For more information about carrier IP addresses, see [Carrier IP
       * address](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip)
       * in the *AWS Wavelength Developer Guide* .
       */
      public fun associateCarrierIpAddress(associateCarrierIpAddress: Boolean)

      /**
       * @param associateCarrierIpAddress Indicates whether to assign a carrier IP address to the
       * network interface.
       * You can only assign a carrier IP address to a network interface that is in a subnet in a
       * Wavelength Zone. For more information about carrier IP addresses, see [Carrier IP
       * address](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip)
       * in the *AWS Wavelength Developer Guide* .
       */
      public fun associateCarrierIpAddress(associateCarrierIpAddress: IResolvable)

      /**
       * @param associatePublicIpAddress Indicates whether to assign a public IPv4 address to an
       * instance.
       * Applies only if creating a network interface when launching an instance. The network
       * interface must be the primary network interface. If launching into a default subnet, the
       * default value is `true` .
       *
       * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
       * running instances and Elastic IP addresses. For more information, see the *Public IPv4
       * Address* tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
       */
      public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

      /**
       * @param associatePublicIpAddress Indicates whether to assign a public IPv4 address to an
       * instance.
       * Applies only if creating a network interface when launching an instance. The network
       * interface must be the primary network interface. If launching into a default subnet, the
       * default value is `true` .
       *
       * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
       * running instances and Elastic IP addresses. For more information, see the *Public IPv4
       * Address* tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
       */
      public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable)

      /**
       * @param deleteOnTermination Indicates whether the network interface is deleted when the
       * instance is terminated.
       * Applies only if creating a network interface when launching an instance.
       */
      public fun deleteOnTermination(deleteOnTermination: Boolean)

      /**
       * @param deleteOnTermination Indicates whether the network interface is deleted when the
       * instance is terminated.
       * Applies only if creating a network interface when launching an instance.
       */
      public fun deleteOnTermination(deleteOnTermination: IResolvable)

      /**
       * @param description The description of the network interface.
       * Applies only if creating a network interface when launching an instance.
       */
      public fun description(description: String)

      /**
       * @param deviceIndex The position of the network interface in the attachment order. 
       * A primary network interface has a device index of 0.
       *
       * If you create a network interface when launching an instance, you must specify the device
       * index.
       */
      public fun deviceIndex(deviceIndex: String)

      /**
       * @param groupSet The IDs of the security groups for the network interface.
       * Applies only if creating a network interface when launching an instance.
       */
      public fun groupSet(groupSet: List<String>)

      /**
       * @param groupSet The IDs of the security groups for the network interface.
       * Applies only if creating a network interface when launching an instance.
       */
      public fun groupSet(vararg groupSet: String)

      /**
       * @param ipv6AddressCount A number of IPv6 addresses to assign to the network interface.
       * Amazon EC2 chooses the IPv6 addresses from the range of the subnet. You cannot specify this
       * option and the option to assign specific IPv6 addresses in the same request. You can specify
       * this option if you've specified a minimum number of instances to launch.
       */
      public fun ipv6AddressCount(ipv6AddressCount: Number)

      /**
       * @param ipv6Addresses The IPv6 addresses to assign to the network interface.
       * You cannot specify this option and the option to assign a number of IPv6 addresses in the
       * same request. You cannot specify this option if you've specified a minimum number of instances
       * to launch.
       */
      public fun ipv6Addresses(ipv6Addresses: IResolvable)

      /**
       * @param ipv6Addresses The IPv6 addresses to assign to the network interface.
       * You cannot specify this option and the option to assign a number of IPv6 addresses in the
       * same request. You cannot specify this option if you've specified a minimum number of instances
       * to launch.
       */
      public fun ipv6Addresses(ipv6Addresses: List<Any>)

      /**
       * @param ipv6Addresses The IPv6 addresses to assign to the network interface.
       * You cannot specify this option and the option to assign a number of IPv6 addresses in the
       * same request. You cannot specify this option if you've specified a minimum number of instances
       * to launch.
       */
      public fun ipv6Addresses(vararg ipv6Addresses: Any)

      /**
       * @param networkInterfaceId The ID of the network interface, when attaching an existing
       * network interface.
       */
      public fun networkInterfaceId(networkInterfaceId: String)

      /**
       * @param privateIpAddress The private IPv4 address of the network interface.
       * Applies only if creating a network interface when launching an instance.
       */
      public fun privateIpAddress(privateIpAddress: String)

      /**
       * @param privateIpAddresses One or more private IPv4 addresses to assign to the network
       * interface.
       * Only one private IPv4 address can be designated as primary.
       */
      public fun privateIpAddresses(privateIpAddresses: IResolvable)

      /**
       * @param privateIpAddresses One or more private IPv4 addresses to assign to the network
       * interface.
       * Only one private IPv4 address can be designated as primary.
       */
      public fun privateIpAddresses(privateIpAddresses: List<Any>)

      /**
       * @param privateIpAddresses One or more private IPv4 addresses to assign to the network
       * interface.
       * Only one private IPv4 address can be designated as primary.
       */
      public fun privateIpAddresses(vararg privateIpAddresses: Any)

      /**
       * @param secondaryPrivateIpAddressCount The number of secondary private IPv4 addresses.
       * You can't specify this option and specify more than one private IP address using the
       * private IP addresses option.
       */
      public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number)

      /**
       * @param subnetId The ID of the subnet associated with the network interface.
       * Applies only if creating a network interface when launching an instance.
       */
      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.NetworkInterfaceProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.NetworkInterfaceProperty.builder()

      /**
       * @param associateCarrierIpAddress Indicates whether to assign a carrier IP address to the
       * network interface.
       * You can only assign a carrier IP address to a network interface that is in a subnet in a
       * Wavelength Zone. For more information about carrier IP addresses, see [Carrier IP
       * address](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip)
       * in the *AWS Wavelength Developer Guide* .
       */
      override fun associateCarrierIpAddress(associateCarrierIpAddress: Boolean) {
        cdkBuilder.associateCarrierIpAddress(associateCarrierIpAddress)
      }

      /**
       * @param associateCarrierIpAddress Indicates whether to assign a carrier IP address to the
       * network interface.
       * You can only assign a carrier IP address to a network interface that is in a subnet in a
       * Wavelength Zone. For more information about carrier IP addresses, see [Carrier IP
       * address](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip)
       * in the *AWS Wavelength Developer Guide* .
       */
      override fun associateCarrierIpAddress(associateCarrierIpAddress: IResolvable) {
        cdkBuilder.associateCarrierIpAddress(associateCarrierIpAddress.let(IResolvable::unwrap))
      }

      /**
       * @param associatePublicIpAddress Indicates whether to assign a public IPv4 address to an
       * instance.
       * Applies only if creating a network interface when launching an instance. The network
       * interface must be the primary network interface. If launching into a default subnet, the
       * default value is `true` .
       *
       * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
       * running instances and Elastic IP addresses. For more information, see the *Public IPv4
       * Address* tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
       */
      override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
      }

      /**
       * @param associatePublicIpAddress Indicates whether to assign a public IPv4 address to an
       * instance.
       * Applies only if creating a network interface when launching an instance. The network
       * interface must be the primary network interface. If launching into a default subnet, the
       * default value is `true` .
       *
       * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
       * running instances and Elastic IP addresses. For more information, see the *Public IPv4
       * Address* tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
       */
      override fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress.let(IResolvable::unwrap))
      }

      /**
       * @param deleteOnTermination Indicates whether the network interface is deleted when the
       * instance is terminated.
       * Applies only if creating a network interface when launching an instance.
       */
      override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      /**
       * @param deleteOnTermination Indicates whether the network interface is deleted when the
       * instance is terminated.
       * Applies only if creating a network interface when launching an instance.
       */
      override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
      }

      /**
       * @param description The description of the network interface.
       * Applies only if creating a network interface when launching an instance.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param deviceIndex The position of the network interface in the attachment order. 
       * A primary network interface has a device index of 0.
       *
       * If you create a network interface when launching an instance, you must specify the device
       * index.
       */
      override fun deviceIndex(deviceIndex: String) {
        cdkBuilder.deviceIndex(deviceIndex)
      }

      /**
       * @param groupSet The IDs of the security groups for the network interface.
       * Applies only if creating a network interface when launching an instance.
       */
      override fun groupSet(groupSet: List<String>) {
        cdkBuilder.groupSet(groupSet)
      }

      /**
       * @param groupSet The IDs of the security groups for the network interface.
       * Applies only if creating a network interface when launching an instance.
       */
      override fun groupSet(vararg groupSet: String): Unit = groupSet(groupSet.toList())

      /**
       * @param ipv6AddressCount A number of IPv6 addresses to assign to the network interface.
       * Amazon EC2 chooses the IPv6 addresses from the range of the subnet. You cannot specify this
       * option and the option to assign specific IPv6 addresses in the same request. You can specify
       * this option if you've specified a minimum number of instances to launch.
       */
      override fun ipv6AddressCount(ipv6AddressCount: Number) {
        cdkBuilder.ipv6AddressCount(ipv6AddressCount)
      }

      /**
       * @param ipv6Addresses The IPv6 addresses to assign to the network interface.
       * You cannot specify this option and the option to assign a number of IPv6 addresses in the
       * same request. You cannot specify this option if you've specified a minimum number of instances
       * to launch.
       */
      override fun ipv6Addresses(ipv6Addresses: IResolvable) {
        cdkBuilder.ipv6Addresses(ipv6Addresses.let(IResolvable::unwrap))
      }

      /**
       * @param ipv6Addresses The IPv6 addresses to assign to the network interface.
       * You cannot specify this option and the option to assign a number of IPv6 addresses in the
       * same request. You cannot specify this option if you've specified a minimum number of instances
       * to launch.
       */
      override fun ipv6Addresses(ipv6Addresses: List<Any>) {
        cdkBuilder.ipv6Addresses(ipv6Addresses)
      }

      /**
       * @param ipv6Addresses The IPv6 addresses to assign to the network interface.
       * You cannot specify this option and the option to assign a number of IPv6 addresses in the
       * same request. You cannot specify this option if you've specified a minimum number of instances
       * to launch.
       */
      override fun ipv6Addresses(vararg ipv6Addresses: Any): Unit =
          ipv6Addresses(ipv6Addresses.toList())

      /**
       * @param networkInterfaceId The ID of the network interface, when attaching an existing
       * network interface.
       */
      override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      /**
       * @param privateIpAddress The private IPv4 address of the network interface.
       * Applies only if creating a network interface when launching an instance.
       */
      override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
      }

      /**
       * @param privateIpAddresses One or more private IPv4 addresses to assign to the network
       * interface.
       * Only one private IPv4 address can be designated as primary.
       */
      override fun privateIpAddresses(privateIpAddresses: IResolvable) {
        cdkBuilder.privateIpAddresses(privateIpAddresses.let(IResolvable::unwrap))
      }

      /**
       * @param privateIpAddresses One or more private IPv4 addresses to assign to the network
       * interface.
       * Only one private IPv4 address can be designated as primary.
       */
      override fun privateIpAddresses(privateIpAddresses: List<Any>) {
        cdkBuilder.privateIpAddresses(privateIpAddresses)
      }

      /**
       * @param privateIpAddresses One or more private IPv4 addresses to assign to the network
       * interface.
       * Only one private IPv4 address can be designated as primary.
       */
      override fun privateIpAddresses(vararg privateIpAddresses: Any): Unit =
          privateIpAddresses(privateIpAddresses.toList())

      /**
       * @param secondaryPrivateIpAddressCount The number of secondary private IPv4 addresses.
       * You can't specify this option and specify more than one private IP address using the
       * private IP addresses option.
       */
      override fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
        cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
      }

      /**
       * @param subnetId The ID of the subnet associated with the network interface.
       * Applies only if creating a network interface when launching an instance.
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.NetworkInterfaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.NetworkInterfaceProperty,
    ) : CdkObject(cdkObject), NetworkInterfaceProperty {
      /**
       * Indicates whether to assign a carrier IP address to the network interface.
       *
       * You can only assign a carrier IP address to a network interface that is in a subnet in a
       * Wavelength Zone. For more information about carrier IP addresses, see [Carrier IP
       * address](https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip)
       * in the *AWS Wavelength Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-associatecarrieripaddress)
       */
      override fun associateCarrierIpAddress(): Any? = unwrap(this).getAssociateCarrierIpAddress()

      /**
       * Indicates whether to assign a public IPv4 address to an instance.
       *
       * Applies only if creating a network interface when launching an instance. The network
       * interface must be the primary network interface. If launching into a default subnet, the
       * default value is `true` .
       *
       * AWS charges for all public IPv4 addresses, including public IPv4 addresses associated with
       * running instances and Elastic IP addresses. For more information, see the *Public IPv4
       * Address* tab on the [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-associatepublicipaddress)
       */
      override fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

      /**
       * Indicates whether the network interface is deleted when the instance is terminated.
       *
       * Applies only if creating a network interface when launching an instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-deleteontermination)
       */
      override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      /**
       * The description of the network interface.
       *
       * Applies only if creating a network interface when launching an instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The position of the network interface in the attachment order.
       *
       * A primary network interface has a device index of 0.
       *
       * If you create a network interface when launching an instance, you must specify the device
       * index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-deviceindex)
       */
      override fun deviceIndex(): String = unwrap(this).getDeviceIndex()

      /**
       * The IDs of the security groups for the network interface.
       *
       * Applies only if creating a network interface when launching an instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-groupset)
       */
      override fun groupSet(): List<String> = unwrap(this).getGroupSet() ?: emptyList()

      /**
       * A number of IPv6 addresses to assign to the network interface.
       *
       * Amazon EC2 chooses the IPv6 addresses from the range of the subnet. You cannot specify this
       * option and the option to assign specific IPv6 addresses in the same request. You can specify
       * this option if you've specified a minimum number of instances to launch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-ipv6addresscount)
       */
      override fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

      /**
       * The IPv6 addresses to assign to the network interface.
       *
       * You cannot specify this option and the option to assign a number of IPv6 addresses in the
       * same request. You cannot specify this option if you've specified a minimum number of instances
       * to launch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-ipv6addresses)
       */
      override fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

      /**
       * The ID of the network interface, when attaching an existing network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-networkinterfaceid)
       */
      override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

      /**
       * The private IPv4 address of the network interface.
       *
       * Applies only if creating a network interface when launching an instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-privateipaddress)
       */
      override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

      /**
       * One or more private IPv4 addresses to assign to the network interface.
       *
       * Only one private IPv4 address can be designated as primary.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-privateipaddresses)
       */
      override fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

      /**
       * The number of secondary private IPv4 addresses.
       *
       * You can't specify this option and specify more than one private IP address using the
       * private IP addresses option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-secondaryprivateipaddresscount)
       */
      override fun secondaryPrivateIpAddressCount(): Number? =
          unwrap(this).getSecondaryPrivateIpAddressCount()

      /**
       * The ID of the subnet associated with the network interface.
       *
       * Applies only if creating a network interface when launching an instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-networkinterface.html#cfn-ec2-instance-networkinterface-subnetid)
       */
      override fun subnetId(): String? = unwrap(this).getSubnetId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.NetworkInterfaceProperty):
          NetworkInterfaceProperty = CdkObjectWrappers.wrap(cdkObject) as? NetworkInterfaceProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.NetworkInterfaceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnInstance.NetworkInterfaceProperty
    }
  }

  /**
   * Specifies input parameter values for an SSM document in AWS Systems Manager .
   *
   * `AssociationParameter` is a property of the [Amazon EC2 Instance
   * SsmAssociation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociations.html)
   * property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * AssociationParameterProperty associationParameterProperty =
   * AssociationParameterProperty.builder()
   * .key("key")
   * .value(List.of("value"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-associationparameter.html)
   */
  public interface AssociationParameterProperty {
    /**
     * The name of an input parameter that is in the associated SSM document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-associationparameter.html#cfn-ec2-instance-associationparameter-key)
     */
    public fun key(): String

    /**
     * The value of an input parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-associationparameter.html#cfn-ec2-instance-associationparameter-value)
     */
    public fun `value`(): List<String>

    /**
     * A builder for [AssociationParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The name of an input parameter that is in the associated SSM document. 
       */
      public fun key(key: String)

      /**
       * @param value The value of an input parameter. 
       */
      public fun `value`(`value`: List<String>)

      /**
       * @param value The value of an input parameter. 
       */
      public fun `value`(vararg `value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty.builder()

      /**
       * @param key The name of an input parameter that is in the associated SSM document. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of an input parameter. 
       */
      override fun `value`(`value`: List<String>) {
        cdkBuilder.`value`(`value`)
      }

      /**
       * @param value The value of an input parameter. 
       */
      override fun `value`(vararg `value`: String): Unit = `value`(`value`.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty,
    ) : CdkObject(cdkObject), AssociationParameterProperty {
      /**
       * The name of an input parameter that is in the associated SSM document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-associationparameter.html#cfn-ec2-instance-associationparameter-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value of an input parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-associationparameter.html#cfn-ec2-instance-associationparameter-value)
       */
      override fun `value`(): List<String> = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AssociationParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty):
          AssociationParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AssociationParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssociationParameterProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnInstance.AssociationParameterProperty
    }
  }

  /**
   * Specifies a block device mapping for an instance.
   *
   * You must specify exactly one of the following properties: `VirtualName` , `Ebs` , or `NoDevice`
   * .
   *
   * `BlockDeviceMapping` is a property of the
   * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
   * resource.
   *
   *
   * After the instance is running, you can modify only the `DeleteOnTermination` parameter for the
   * attached volumes without interrupting the instance. Modifying any other parameter results in
   * instance
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * BlockDeviceMappingProperty blockDeviceMappingProperty = BlockDeviceMappingProperty.builder()
   * .deviceName("deviceName")
   * // the properties below are optional
   * .ebs(EbsProperty.builder()
   * .deleteOnTermination(false)
   * .encrypted(false)
   * .iops(123)
   * .kmsKeyId("kmsKeyId")
   * .snapshotId("snapshotId")
   * .volumeSize(123)
   * .volumeType("volumeType")
   * .build())
   * .noDevice(NoDeviceProperty.builder().build())
   * .virtualName("virtualName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-blockdevicemapping.html)
   */
  public interface BlockDeviceMappingProperty {
    /**
     * The device name (for example, `/dev/sdh` or `xvdh` ).
     *
     *
     * After the instance is running, this parameter is used to specify the device name of the block
     * device mapping to update.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-blockdevicemapping.html#cfn-ec2-instance-blockdevicemapping-devicename)
     */
    public fun deviceName(): String

    /**
     * Parameters used to automatically set up EBS volumes when the instance is launched.
     *
     *
     * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
     * the attached volumes without interrupting the instance. Modifying any other parameter results in
     * instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-blockdevicemapping.html#cfn-ec2-instance-blockdevicemapping-ebs)
     */
    public fun ebs(): Any? = unwrap(this).getEbs()

    /**
     * To omit the device from the block device mapping, specify an empty string.
     *
     *
     * After the instance is running, modifying this parameter results in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-blockdevicemapping.html#cfn-ec2-instance-blockdevicemapping-nodevice)
     */
    public fun noDevice(): Any? = unwrap(this).getNoDevice()

    /**
     * The virtual device name ( `ephemeral` N).
     *
     * The name must be in the form `ephemeral` *X* where *X* is a number starting from zero (0).
     * For example, an instance type with 2 available instance store volumes can specify mappings for
     * `ephemeral0` and `ephemeral1` . The number of available instance store volumes depends on the
     * instance type. After you connect to the instance, you must mount the volume.
     *
     * NVMe instance store volumes are automatically enumerated and assigned a device name.
     * Including them in your block device mapping has no effect.
     *
     * *Constraints* : For M3 instances, you must specify instance store volumes in the block device
     * mapping for the instance. When you launch an M3 instance, we ignore any instance store volumes
     * specified in the block device mapping for the AMI.
     *
     *
     * After the instance is running, modifying this parameter results in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-blockdevicemapping.html#cfn-ec2-instance-blockdevicemapping-virtualname)
     */
    public fun virtualName(): String? = unwrap(this).getVirtualName()

    /**
     * A builder for [BlockDeviceMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deviceName The device name (for example, `/dev/sdh` or `xvdh` ). 
       *
       * After the instance is running, this parameter is used to specify the device name of the
       * block device mapping to update.
       */
      public fun deviceName(deviceName: String)

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       *
       * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
       * the attached volumes without interrupting the instance. Modifying any other parameter results
       * in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)
       * .
       */
      public fun ebs(ebs: IResolvable)

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       *
       * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
       * the attached volumes without interrupting the instance. Modifying any other parameter results
       * in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)
       * .
       */
      public fun ebs(ebs: EbsProperty)

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       *
       * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
       * the attached volumes without interrupting the instance. Modifying any other parameter results
       * in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa51ff763aa8bf568c51574263c3aeb2be7d9ce9d74abe4520311ed1d8e0670e")
      public fun ebs(ebs: EbsProperty.Builder.() -> Unit)

      /**
       * @param noDevice To omit the device from the block device mapping, specify an empty string.
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      public fun noDevice(noDevice: IResolvable)

      /**
       * @param noDevice To omit the device from the block device mapping, specify an empty string.
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      public fun noDevice(noDevice: NoDeviceProperty)

      /**
       * @param noDevice To omit the device from the block device mapping, specify an empty string.
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2139cab1e957880340ddab108f407982c3aa163ffd0d1078ad6d0ca94c0bc64e")
      public fun noDevice(noDevice: NoDeviceProperty.Builder.() -> Unit)

      /**
       * @param virtualName The virtual device name ( `ephemeral` N).
       * The name must be in the form `ephemeral` *X* where *X* is a number starting from zero (0).
       * For example, an instance type with 2 available instance store volumes can specify mappings for
       * `ephemeral0` and `ephemeral1` . The number of available instance store volumes depends on the
       * instance type. After you connect to the instance, you must mount the volume.
       *
       * NVMe instance store volumes are automatically enumerated and assigned a device name.
       * Including them in your block device mapping has no effect.
       *
       * *Constraints* : For M3 instances, you must specify instance store volumes in the block
       * device mapping for the instance. When you launch an M3 instance, we ignore any instance store
       * volumes specified in the block device mapping for the AMI.
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      public fun virtualName(virtualName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.BlockDeviceMappingProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.BlockDeviceMappingProperty.builder()

      /**
       * @param deviceName The device name (for example, `/dev/sdh` or `xvdh` ). 
       *
       * After the instance is running, this parameter is used to specify the device name of the
       * block device mapping to update.
       */
      override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       *
       * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
       * the attached volumes without interrupting the instance. Modifying any other parameter results
       * in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)
       * .
       */
      override fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs.let(IResolvable::unwrap))
      }

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       *
       * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
       * the attached volumes without interrupting the instance. Modifying any other parameter results
       * in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)
       * .
       */
      override fun ebs(ebs: EbsProperty) {
        cdkBuilder.ebs(ebs.let(EbsProperty::unwrap))
      }

      /**
       * @param ebs Parameters used to automatically set up EBS volumes when the instance is
       * launched.
       *
       * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
       * the attached volumes without interrupting the instance. Modifying any other parameter results
       * in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aa51ff763aa8bf568c51574263c3aeb2be7d9ce9d74abe4520311ed1d8e0670e")
      override fun ebs(ebs: EbsProperty.Builder.() -> Unit): Unit = ebs(EbsProperty(ebs))

      /**
       * @param noDevice To omit the device from the block device mapping, specify an empty string.
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      override fun noDevice(noDevice: IResolvable) {
        cdkBuilder.noDevice(noDevice.let(IResolvable::unwrap))
      }

      /**
       * @param noDevice To omit the device from the block device mapping, specify an empty string.
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      override fun noDevice(noDevice: NoDeviceProperty) {
        cdkBuilder.noDevice(noDevice.let(NoDeviceProperty::unwrap))
      }

      /**
       * @param noDevice To omit the device from the block device mapping, specify an empty string.
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2139cab1e957880340ddab108f407982c3aa163ffd0d1078ad6d0ca94c0bc64e")
      override fun noDevice(noDevice: NoDeviceProperty.Builder.() -> Unit): Unit =
          noDevice(NoDeviceProperty(noDevice))

      /**
       * @param virtualName The virtual device name ( `ephemeral` N).
       * The name must be in the form `ephemeral` *X* where *X* is a number starting from zero (0).
       * For example, an instance type with 2 available instance store volumes can specify mappings for
       * `ephemeral0` and `ephemeral1` . The number of available instance store volumes depends on the
       * instance type. After you connect to the instance, you must mount the volume.
       *
       * NVMe instance store volumes are automatically enumerated and assigned a device name.
       * Including them in your block device mapping has no effect.
       *
       * *Constraints* : For M3 instances, you must specify instance store volumes in the block
       * device mapping for the instance. When you launch an M3 instance, we ignore any instance store
       * volumes specified in the block device mapping for the AMI.
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       */
      override fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.BlockDeviceMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.BlockDeviceMappingProperty,
    ) : CdkObject(cdkObject), BlockDeviceMappingProperty {
      /**
       * The device name (for example, `/dev/sdh` or `xvdh` ).
       *
       *
       * After the instance is running, this parameter is used to specify the device name of the
       * block device mapping to update.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-blockdevicemapping.html#cfn-ec2-instance-blockdevicemapping-devicename)
       */
      override fun deviceName(): String = unwrap(this).getDeviceName()

      /**
       * Parameters used to automatically set up EBS volumes when the instance is launched.
       *
       *
       * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
       * the attached volumes without interrupting the instance. Modifying any other parameter results
       * in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-blockdevicemapping.html#cfn-ec2-instance-blockdevicemapping-ebs)
       */
      override fun ebs(): Any? = unwrap(this).getEbs()

      /**
       * To omit the device from the block device mapping, specify an empty string.
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-blockdevicemapping.html#cfn-ec2-instance-blockdevicemapping-nodevice)
       */
      override fun noDevice(): Any? = unwrap(this).getNoDevice()

      /**
       * The virtual device name ( `ephemeral` N).
       *
       * The name must be in the form `ephemeral` *X* where *X* is a number starting from zero (0).
       * For example, an instance type with 2 available instance store volumes can specify mappings for
       * `ephemeral0` and `ephemeral1` . The number of available instance store volumes depends on the
       * instance type. After you connect to the instance, you must mount the volume.
       *
       * NVMe instance store volumes are automatically enumerated and assigned a device name.
       * Including them in your block device mapping has no effect.
       *
       * *Constraints* : For M3 instances, you must specify instance store volumes in the block
       * device mapping for the instance. When you launch an M3 instance, we ignore any instance store
       * volumes specified in the block device mapping for the AMI.
       *
       *
       * After the instance is running, modifying this parameter results in instance
       * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-blockdevicemapping.html#cfn-ec2-instance-blockdevicemapping-virtualname)
       */
      override fun virtualName(): String? = unwrap(this).getVirtualName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BlockDeviceMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.BlockDeviceMappingProperty):
          BlockDeviceMappingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BlockDeviceMappingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockDeviceMappingProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.BlockDeviceMappingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnInstance.BlockDeviceMappingProperty
    }
  }

  /**
   * Specifies the SSM document and parameter values in AWS Systems Manager to associate with an
   * instance.
   *
   * `SsmAssociations` is a property of the
   * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * SsmAssociationProperty ssmAssociationProperty = SsmAssociationProperty.builder()
   * .documentName("documentName")
   * // the properties below are optional
   * .associationParameters(List.of(AssociationParameterProperty.builder()
   * .key("key")
   * .value(List.of("value"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociation.html)
   */
  public interface SsmAssociationProperty {
    /**
     * The input parameter values to use with the associated SSM document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociation.html#cfn-ec2-instance-ssmassociation-associationparameters)
     */
    public fun associationParameters(): Any? = unwrap(this).getAssociationParameters()

    /**
     * The name of an SSM document to associate with the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociation.html#cfn-ec2-instance-ssmassociation-documentname)
     */
    public fun documentName(): String

    /**
     * A builder for [SsmAssociationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param associationParameters The input parameter values to use with the associated SSM
       * document.
       */
      public fun associationParameters(associationParameters: IResolvable)

      /**
       * @param associationParameters The input parameter values to use with the associated SSM
       * document.
       */
      public fun associationParameters(associationParameters: List<Any>)

      /**
       * @param associationParameters The input parameter values to use with the associated SSM
       * document.
       */
      public fun associationParameters(vararg associationParameters: Any)

      /**
       * @param documentName The name of an SSM document to associate with the instance. 
       */
      public fun documentName(documentName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty.builder()

      /**
       * @param associationParameters The input parameter values to use with the associated SSM
       * document.
       */
      override fun associationParameters(associationParameters: IResolvable) {
        cdkBuilder.associationParameters(associationParameters.let(IResolvable::unwrap))
      }

      /**
       * @param associationParameters The input parameter values to use with the associated SSM
       * document.
       */
      override fun associationParameters(associationParameters: List<Any>) {
        cdkBuilder.associationParameters(associationParameters)
      }

      /**
       * @param associationParameters The input parameter values to use with the associated SSM
       * document.
       */
      override fun associationParameters(vararg associationParameters: Any): Unit =
          associationParameters(associationParameters.toList())

      /**
       * @param documentName The name of an SSM document to associate with the instance. 
       */
      override fun documentName(documentName: String) {
        cdkBuilder.documentName(documentName)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty,
    ) : CdkObject(cdkObject), SsmAssociationProperty {
      /**
       * The input parameter values to use with the associated SSM document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociation.html#cfn-ec2-instance-ssmassociation-associationparameters)
       */
      override fun associationParameters(): Any? = unwrap(this).getAssociationParameters()

      /**
       * The name of an SSM document to associate with the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ssmassociation.html#cfn-ec2-instance-ssmassociation-documentname)
       */
      override fun documentName(): String = unwrap(this).getDocumentName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SsmAssociationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty):
          SsmAssociationProperty = CdkObjectWrappers.wrap(cdkObject) as? SsmAssociationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SsmAssociationProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty
    }
  }

  /**
   * Specifies the CPU options for the instance.
   *
   * When you specify CPU options, you must specify both the number of CPU cores and threads per
   * core.
   *
   * Modifying the CPU options for an instance results in instance
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   *
   * For more information, see [Optimize CPU
   * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
   * *Amazon Elastic Compute Cloud User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * CpuOptionsProperty cpuOptionsProperty = CpuOptionsProperty.builder()
   * .coreCount(123)
   * .threadsPerCore(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-cpuoptions.html)
   */
  public interface CpuOptionsProperty {
    /**
     * The number of CPU cores for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-cpuoptions.html#cfn-ec2-instance-cpuoptions-corecount)
     */
    public fun coreCount(): Number? = unwrap(this).getCoreCount()

    /**
     * The number of threads per CPU core.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-cpuoptions.html#cfn-ec2-instance-cpuoptions-threadspercore)
     */
    public fun threadsPerCore(): Number? = unwrap(this).getThreadsPerCore()

    /**
     * A builder for [CpuOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param coreCount The number of CPU cores for the instance.
       */
      public fun coreCount(coreCount: Number)

      /**
       * @param threadsPerCore The number of threads per CPU core.
       */
      public fun threadsPerCore(threadsPerCore: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.CpuOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.CpuOptionsProperty.builder()

      /**
       * @param coreCount The number of CPU cores for the instance.
       */
      override fun coreCount(coreCount: Number) {
        cdkBuilder.coreCount(coreCount)
      }

      /**
       * @param threadsPerCore The number of threads per CPU core.
       */
      override fun threadsPerCore(threadsPerCore: Number) {
        cdkBuilder.threadsPerCore(threadsPerCore)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnInstance.CpuOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.CpuOptionsProperty,
    ) : CdkObject(cdkObject), CpuOptionsProperty {
      /**
       * The number of CPU cores for the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-cpuoptions.html#cfn-ec2-instance-cpuoptions-corecount)
       */
      override fun coreCount(): Number? = unwrap(this).getCoreCount()

      /**
       * The number of threads per CPU core.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-cpuoptions.html#cfn-ec2-instance-cpuoptions-threadspercore)
       */
      override fun threadsPerCore(): Number? = unwrap(this).getThreadsPerCore()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CpuOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.CpuOptionsProperty):
          CpuOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? CpuOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CpuOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.CpuOptionsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnInstance.CpuOptionsProperty
    }
  }

  /**
   * Specifies the Elastic Inference Accelerator for the instance.
   *
   * `ElasticInferenceAccelerator` is a property of the
   * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * ElasticInferenceAcceleratorProperty elasticInferenceAcceleratorProperty =
   * ElasticInferenceAcceleratorProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .count(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticinferenceaccelerator.html)
   */
  public interface ElasticInferenceAcceleratorProperty {
    /**
     * The number of elastic inference accelerators to attach to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticinferenceaccelerator.html#cfn-ec2-instance-elasticinferenceaccelerator-count)
     */
    public fun count(): Number? = unwrap(this).getCount()

    /**
     * The type of elastic inference accelerator.
     *
     * The possible values are `eia1.medium` , `eia1.large` , `eia1.xlarge` , `eia2.medium` ,
     * `eia2.large` , and `eia2.xlarge` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticinferenceaccelerator.html#cfn-ec2-instance-elasticinferenceaccelerator-type)
     */
    public fun type(): String

    /**
     * A builder for [ElasticInferenceAcceleratorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param count The number of elastic inference accelerators to attach to the instance.
       */
      public fun count(count: Number)

      /**
       * @param type The type of elastic inference accelerator. 
       * The possible values are `eia1.medium` , `eia1.large` , `eia1.xlarge` , `eia2.medium` ,
       * `eia2.large` , and `eia2.xlarge` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty.builder()

      /**
       * @param count The number of elastic inference accelerators to attach to the instance.
       */
      override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      /**
       * @param type The type of elastic inference accelerator. 
       * The possible values are `eia1.medium` , `eia1.large` , `eia1.xlarge` , `eia2.medium` ,
       * `eia2.large` , and `eia2.xlarge` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty,
    ) : CdkObject(cdkObject), ElasticInferenceAcceleratorProperty {
      /**
       * The number of elastic inference accelerators to attach to the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticinferenceaccelerator.html#cfn-ec2-instance-elasticinferenceaccelerator-count)
       */
      override fun count(): Number? = unwrap(this).getCount()

      /**
       * The type of elastic inference accelerator.
       *
       * The possible values are `eia1.medium` , `eia1.large` , `eia1.xlarge` , `eia2.medium` ,
       * `eia2.large` , and `eia2.xlarge` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticinferenceaccelerator.html#cfn-ec2-instance-elasticinferenceaccelerator-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ElasticInferenceAcceleratorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty):
          ElasticInferenceAcceleratorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ElasticInferenceAcceleratorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticInferenceAcceleratorProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty
    }
  }

  /**
   * Amazon Elastic Graphics reached end of life on January 8, 2024.
   *
   * For workloads that require graphics acceleration, we recommend that you use Amazon EC2 G4ad,
   * G4dn, or G5 instances.
   *
   * Specifies the type of Elastic GPU. An Elastic GPU is a GPU resource that you can attach to your
   * Amazon EC2 instance to accelerate the graphics performance of your applications. For more
   * information, see [Amazon EC2 Elastic
   * GPUs](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html) in the *Amazon
   * EC2 User Guide for Windows Instances* .
   *
   * `ElasticGpuSpecification` is a property of the
   * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * ElasticGpuSpecificationProperty elasticGpuSpecificationProperty =
   * ElasticGpuSpecificationProperty.builder()
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticgpuspecification.html)
   */
  public interface ElasticGpuSpecificationProperty {
    /**
     * The type of Elastic Graphics accelerator.
     *
     * For more information about the values to specify for `Type` , see [Elastic Graphics
     * Basics](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics)
     * , specifically the Elastic Graphics accelerator column, in the *Amazon Elastic Compute Cloud
     * User Guide for Windows Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticgpuspecification.html#cfn-ec2-instance-elasticgpuspecification-type)
     */
    public fun type(): String

    /**
     * A builder for [ElasticGpuSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of Elastic Graphics accelerator. 
       * For more information about the values to specify for `Type` , see [Elastic Graphics
       * Basics](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics)
       * , specifically the Elastic Graphics accelerator column, in the *Amazon Elastic Compute Cloud
       * User Guide for Windows Instances* .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticGpuSpecificationProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticGpuSpecificationProperty.builder()

      /**
       * @param type The type of Elastic Graphics accelerator. 
       * For more information about the values to specify for `Type` , see [Elastic Graphics
       * Basics](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics)
       * , specifically the Elastic Graphics accelerator column, in the *Amazon Elastic Compute Cloud
       * User Guide for Windows Instances* .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticGpuSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticGpuSpecificationProperty,
    ) : CdkObject(cdkObject), ElasticGpuSpecificationProperty {
      /**
       * The type of Elastic Graphics accelerator.
       *
       * For more information about the values to specify for `Type` , see [Elastic Graphics
       * Basics](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics)
       * , specifically the Elastic Graphics accelerator column, in the *Amazon Elastic Compute Cloud
       * User Guide for Windows Instances* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticgpuspecification.html#cfn-ec2-instance-elasticgpuspecification-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ElasticGpuSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.ElasticGpuSpecificationProperty):
          ElasticGpuSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ElasticGpuSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticGpuSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticGpuSpecificationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnInstance.ElasticGpuSpecificationProperty
    }
  }

  /**
   * Specifies a launch template to use when launching an Amazon EC2 instance.
   *
   * You must specify the following:
   *
   * * The ID or the name of the launch template, but not both.
   * * The version of the launch template.
   *
   * `LaunchTemplateSpecification` is a property of the
   * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
   * resource.
   *
   * For information about creating a launch template, see
   * [AWS::EC2::LaunchTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
   * and [Create a launch
   * template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
   * in the *Amazon EC2 User Guide* .
   *
   * For examples of launch templates, see
   * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate--examples)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * LaunchTemplateSpecificationProperty launchTemplateSpecificationProperty =
   * LaunchTemplateSpecificationProperty.builder()
   * .version("version")
   * // the properties below are optional
   * .launchTemplateId("launchTemplateId")
   * .launchTemplateName("launchTemplateName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html)
   */
  public interface LaunchTemplateSpecificationProperty {
    /**
     * The ID of the launch template.
     *
     * You must specify the `LaunchTemplateId` or the `LaunchTemplateName` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html#cfn-ec2-instance-launchtemplatespecification-launchtemplateid)
     */
    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    /**
     * The name of the launch template.
     *
     * You must specify the `LaunchTemplateName` or the `LaunchTemplateId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html#cfn-ec2-instance-launchtemplatespecification-launchtemplatename)
     */
    public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    /**
     * The version number of the launch template.
     *
     * Specifying `$Latest` or `$Default` for the template version number is not supported. However,
     * you can specify `LatestVersionNumber` or `DefaultVersionNumber` using the `Fn::GetAtt` intrinsic
     * function. For more information, see
     * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate-return-values-fn--getatt)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html#cfn-ec2-instance-launchtemplatespecification-version)
     */
    public fun version(): String

    /**
     * A builder for [LaunchTemplateSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param launchTemplateId The ID of the launch template.
       * You must specify the `LaunchTemplateId` or the `LaunchTemplateName` , but not both.
       */
      public fun launchTemplateId(launchTemplateId: String)

      /**
       * @param launchTemplateName The name of the launch template.
       * You must specify the `LaunchTemplateName` or the `LaunchTemplateId` , but not both.
       */
      public fun launchTemplateName(launchTemplateName: String)

      /**
       * @param version The version number of the launch template. 
       * Specifying `$Latest` or `$Default` for the template version number is not supported.
       * However, you can specify `LatestVersionNumber` or `DefaultVersionNumber` using the
       * `Fn::GetAtt` intrinsic function. For more information, see
       * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate-return-values-fn--getatt)
       * .
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnInstance.LaunchTemplateSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnInstance.LaunchTemplateSpecificationProperty.builder()

      /**
       * @param launchTemplateId The ID of the launch template.
       * You must specify the `LaunchTemplateId` or the `LaunchTemplateName` , but not both.
       */
      override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      /**
       * @param launchTemplateName The name of the launch template.
       * You must specify the `LaunchTemplateName` or the `LaunchTemplateId` , but not both.
       */
      override fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
      }

      /**
       * @param version The version number of the launch template. 
       * Specifying `$Latest` or `$Default` for the template version number is not supported.
       * However, you can specify `LatestVersionNumber` or `DefaultVersionNumber` using the
       * `Fn::GetAtt` intrinsic function. For more information, see
       * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate-return-values-fn--getatt)
       * .
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnInstance.LaunchTemplateSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnInstance.LaunchTemplateSpecificationProperty,
    ) : CdkObject(cdkObject), LaunchTemplateSpecificationProperty {
      /**
       * The ID of the launch template.
       *
       * You must specify the `LaunchTemplateId` or the `LaunchTemplateName` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html#cfn-ec2-instance-launchtemplatespecification-launchtemplateid)
       */
      override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      /**
       * The name of the launch template.
       *
       * You must specify the `LaunchTemplateName` or the `LaunchTemplateId` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html#cfn-ec2-instance-launchtemplatespecification-launchtemplatename)
       */
      override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

      /**
       * The version number of the launch template.
       *
       * Specifying `$Latest` or `$Default` for the template version number is not supported.
       * However, you can specify `LatestVersionNumber` or `DefaultVersionNumber` using the
       * `Fn::GetAtt` intrinsic function. For more information, see
       * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate-return-values-fn--getatt)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html#cfn-ec2-instance-launchtemplatespecification-version)
       */
      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LaunchTemplateSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstance.LaunchTemplateSpecificationProperty):
          LaunchTemplateSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LaunchTemplateSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnInstance.LaunchTemplateSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnInstance.LaunchTemplateSpecificationProperty
    }
  }
}
