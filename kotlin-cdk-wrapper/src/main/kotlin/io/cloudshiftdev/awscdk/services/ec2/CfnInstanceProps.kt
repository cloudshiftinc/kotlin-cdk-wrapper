@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
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

/**
 * Properties for defining a `CfnInstance`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnInstanceProps cfnInstanceProps = CfnInstanceProps.builder()
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
public interface CfnInstanceProps {
  /**
   * This property is reserved for internal use.
   *
   * If you use it, the stack fails with this error: `Bad property set: [Testing this property]
   * (Service: AmazonEC2; Status Code: 400; Error Code: InvalidParameterCombination; Request ID:
   * 0XXXXXX-49c7-4b40-8bcc-76885dcXXXXX)` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-additionalinfo)
   */
  public fun additionalInfo(): String? = unwrap(this).getAdditionalInfo()

  /**
   * Indicates whether the instance is associated with a dedicated host.
   *
   * If you want the instance to always restart on the same host on which it was launched, specify
   * `host` . If you want the instance to restart on any available host, but try to launch onto the
   * last host it ran on (on a best-effort basis), specify `default` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-affinity)
   */
  public fun affinity(): String? = unwrap(this).getAffinity()

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
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

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
   * After the instance is running, you can modify only the `DeleteOnTermination` parameter for the
   * attached volumes without interrupting the instance. Modifying any other parameter results in
   * instance
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-blockdevicemappings)
   */
  public fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

  /**
   * The CPU options for the instance.
   *
   * For more information, see [Optimize CPU
   * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
   * *Amazon Elastic Compute Cloud User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-cpuoptions)
   */
  public fun cpuOptions(): Any? = unwrap(this).getCpuOptions()

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
   */
  public fun creditSpecification(): Any? = unwrap(this).getCreditSpecification()

  /**
   * If you set this parameter to `true` , you can't terminate the instance using the Amazon EC2
   * console, CLI, or API;
   *
   * otherwise, you can. To change this attribute after launch, use
   * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
   * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can terminate
   * the instance by running the shutdown command from the instance.
   *
   * Default: `false`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-disableapitermination)
   */
  public fun disableApiTermination(): Any? = unwrap(this).getDisableApiTermination()

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
   */
  public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

  /**
   * An elastic GPU to associate with the instance.
   *
   *
   * Amazon Elastic Graphics reached end of life on January 8, 2024.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications)
   */
  public fun elasticGpuSpecifications(): Any? = unwrap(this).getElasticGpuSpecifications()

  /**
   * An elastic inference accelerator to associate with the instance.
   *
   *
   * Amazon Elastic Inference (EI) is no longer available to new customers. For more information,
   * see [Amazon Elastic Inference
   * FAQs](https://docs.aws.amazon.com/machine-learning/elastic-inference/faqs/) .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticinferenceaccelerators)
   */
  public fun elasticInferenceAccelerators(): Any? = unwrap(this).getElasticInferenceAccelerators()

  /**
   * Indicates whether the instance is enabled for AWS Nitro Enclaves.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-enclaveoptions)
   */
  public fun enclaveOptions(): Any? = unwrap(this).getEnclaveOptions()

  /**
   * Indicates whether an instance is enabled for hibernation.
   *
   * This parameter is valid only if the instance meets the [hibernation
   * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
   * . For more information, see [Hibernate your Amazon EC2
   * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon EC2
   * User Guide* .
   *
   * You can't enable hibernation and AWS Nitro Enclaves on the same instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hibernationoptions)
   */
  public fun hibernationOptions(): Any? = unwrap(this).getHibernationOptions()

  /**
   * If you specify host for the `Affinity` property, the ID of a dedicated host that the instance
   * is associated with.
   *
   * If you don't specify an ID, Amazon EC2 launches the instance onto any available, compatible
   * dedicated host in your account. This type of launch is called an untargeted launch. Note that for
   * untargeted launches, you must have a compatible, dedicated host available to successfully launch
   * instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hostid)
   */
  public fun hostId(): String? = unwrap(this).getHostId()

  /**
   * The ARN of the host resource group in which to launch the instances.
   *
   * If you specify a host resource group ARN, omit the *Tenancy* parameter or set it to `host` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hostresourcegrouparn)
   */
  public fun hostResourceGroupArn(): String? = unwrap(this).getHostResourceGroupArn()

  /**
   * The name of an IAM instance profile.
   *
   * To create a new IAM instance profile, use the
   * [AWS::IAM::InstanceProfile](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html)
   * resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-iaminstanceprofile)
   */
  public fun iamInstanceProfile(): String? = unwrap(this).getIamInstanceProfile()

  /**
   * The ID of the AMI.
   *
   * An AMI ID is required to launch an instance and must be specified here or in a launch template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-imageid)
   */
  public fun imageId(): String? = unwrap(this).getImageId()

  /**
   * Indicates whether an instance stops or terminates when you initiate shutdown from the instance
   * (using the operating system command for system shutdown).
   *
   * Default: `stop`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-instanceinitiatedshutdownbehavior)
   */
  public fun instanceInitiatedShutdownBehavior(): String? =
      unwrap(this).getInstanceInitiatedShutdownBehavior()

  /**
   * The instance type. For more information, see [Instance
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon EC2
   * User Guide* .
   *
   * When you change your EBS-backed instance type, instance restart or replacement behavior depends
   * on the instance type compatibility between the old and new types. An instance with an instance
   * store volume as the root volume is always replaced. For more information, see [Change the instance
   * type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html) in the *Amazon
   * EC2 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-instancetype)
   */
  public fun instanceType(): String? = unwrap(this).getInstanceType()

  /**
   * The number of IPv6 addresses to associate with the primary network interface.
   *
   * Amazon EC2 chooses the IPv6 addresses from the range of your subnet. You cannot specify this
   * option and the option to assign specific IPv6 addresses in the same request. You can specify this
   * option if you've specified a minimum number of instances to launch.
   *
   * You cannot specify this option and the network interfaces option in the same request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ipv6addresscount)
   */
  public fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

  /**
   * The IPv6 addresses from the range of the subnet to associate with the primary network
   * interface.
   *
   * You cannot specify this option and the option to assign a number of IPv6 addresses in the same
   * request. You cannot specify this option if you've specified a minimum number of instances to
   * launch.
   *
   * You cannot specify this option and the network interfaces option in the same request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ipv6addresses)
   */
  public fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

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
   */
  public fun kernelId(): String? = unwrap(this).getKernelId()

  /**
   * The name of the key pair. You can create a key pair using
   * [CreateKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html) or
   * [ImportKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html) .
   *
   *
   * If you do not specify a key pair, you can't connect to the instance unless you choose an AMI
   * that is configured to allow users another way to log in.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-keyname)
   */
  public fun keyName(): String? = unwrap(this).getKeyName()

  /**
   * The launch template.
   *
   * Any additional parameters that you specify for the new instance overwrite the corresponding
   * parameters included in the launch template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-launchtemplate)
   */
  public fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

  /**
   * The license configurations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-licensespecifications)
   */
  public fun licenseSpecifications(): Any? = unwrap(this).getLicenseSpecifications()

  /**
   * Specifies whether detailed monitoring is enabled for the instance.
   *
   * Specify `true` to enable detailed monitoring. Otherwise, basic monitoring is enabled. For more
   * information about detailed monitoring, see [Enable or turn off detailed monitoring for your
   * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html) in the
   * *Amazon EC2 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-monitoring)
   */
  public fun monitoring(): Any? = unwrap(this).getMonitoring()

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
   */
  public fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

  /**
   * The name of an existing placement group that you want to launch the instance into (cluster |
   * partition | spread).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-placementgroupname)
   */
  public fun placementGroupName(): String? = unwrap(this).getPlacementGroupName()

  /**
   * The options for the instance hostname.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-privatednsnameoptions)
   */
  public fun privateDnsNameOptions(): Any? = unwrap(this).getPrivateDnsNameOptions()

  /**
   * The primary IPv4 address. You must specify a value from the IPv4 address range of the subnet.
   *
   * Only one private IP address can be designated as primary. You can't specify this option if
   * you've specified the option to designate a private IP address as the primary IP address in a
   * network interface specification. You cannot specify this option if you're launching more than one
   * instance in the request.
   *
   * You cannot specify this option and the network interfaces option in the same request.
   *
   * If you make an update to an instance that requires replacement, you must assign a new private
   * IP address. During a replacement, AWS CloudFormation creates a new instance but doesn't delete the
   * old instance until the stack has successfully updated. If the stack update fails, AWS
   * CloudFormation uses the old instance to roll back the stack to the previous working state. The old
   * and new instances cannot have the same private IP address.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-privateipaddress)
   */
  public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  /**
   * Indicates whether to assign the tags from the instance to all of the volumes attached to the
   * instance at launch.
   *
   * If you specify `true` and you assign tags to the instance, those tags are automatically
   * assigned to all of the volumes that you attach to the instance at launch. If you specify `false` ,
   * those tags are not assigned to the attached volumes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
   */
  public fun propagateTagsToVolumeOnCreation(): Any? =
      unwrap(this).getPropagateTagsToVolumeOnCreation()

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
   */
  public fun ramdiskId(): String? = unwrap(this).getRamdiskId()

  /**
   * The IDs of the security groups.
   *
   * You can specify the IDs of existing security groups and references to resources created by the
   * stack template.
   *
   * If you specify a network interface, you must specify any security groups as part of the network
   * interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * [Default VPC] The names of the security groups. For a nondefault VPC, you must use security
   * group IDs instead.
   *
   * You cannot specify this option and the network interfaces option in the same request. The list
   * can contain both the name of existing Amazon EC2 security groups or references to
   * AWS::EC2::SecurityGroup resources created in the template.
   *
   * Default: Amazon EC2 uses the default security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-securitygroups)
   */
  public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  /**
   * Enable or disable source/destination checks, which ensure that the instance is either the
   * source or the destination of any traffic that it receives.
   *
   * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
   * The default value is `true` . You must disable source/destination checks if the instance runs
   * services such as network address translation, routing, or firewalls.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-sourcedestcheck)
   */
  public fun sourceDestCheck(): Any? = unwrap(this).getSourceDestCheck()

  /**
   * The SSM
   * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
   * and parameter values in AWS Systems Manager to associate with this instance. To use this property,
   * you must specify an IAM instance profile role for the instance. For more information, see [Create
   * an IAM instance profile for Systems
   * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
   * in the *AWS Systems Manager User Guide* .
   *
   *
   * You can associate only one document with an instance.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ssmassociations)
   */
  public fun ssmAssociations(): Any? = unwrap(this).getSsmAssociations()

  /**
   * The ID of the subnet to launch the instance into.
   *
   * If you specify a network interface, you must specify any subnets as part of the network
   * interface instead of using this parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-subnetid)
   */
  public fun subnetId(): String? = unwrap(this).getSubnetId()

  /**
   * The tags to add to the instance.
   *
   * These tags are not applied to the EBS volumes, such as the root volume, unless
   * [PropagateTagsToVolumeOnCreation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
   * is `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tenancy of the instance.
   *
   * An instance with a tenancy of `dedicated` runs on single-tenant hardware.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-tenancy)
   */
  public fun tenancy(): String? = unwrap(this).getTenancy()

  /**
   * The parameters or scripts to store as user data.
   *
   * Any scripts in user data are run when you launch the instance. User data is limited to 16 KB.
   * You must provide base64-encoded text. For more information, see
   * [Fn::Base64](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-base64.html)
   * .
   *
   * If the root volume is an EBS volume and you update user data, CloudFormation restarts the
   * instance. If the root volume is an instance store volume and you update user data, the instance is
   * replaced.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-userdata)
   */
  public fun userData(): String? = unwrap(this).getUserData()

  /**
   * The volumes to attach to the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-volumes)
   */
  public fun volumes(): Any? = unwrap(this).getVolumes()

  /**
   * A builder for [CfnInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalInfo This property is reserved for internal use.
     * If you use it, the stack fails with this error: `Bad property set: [Testing this property]
     * (Service: AmazonEC2; Status Code: 400; Error Code: InvalidParameterCombination; Request ID:
     * 0XXXXXX-49c7-4b40-8bcc-76885dcXXXXX)` .
     */
    public fun additionalInfo(additionalInfo: String)

    /**
     * @param affinity Indicates whether the instance is associated with a dedicated host.
     * If you want the instance to always restart on the same host on which it was launched, specify
     * `host` . If you want the instance to restart on any available host, but try to launch onto the
     * last host it ran on (on a best-effort basis), specify `default` .
     */
    public fun affinity(affinity: String)

    /**
     * @param availabilityZone The Availability Zone of the instance.
     * If not specified, an Availability Zone will be automatically chosen for you based on the load
     * balancing criteria for the Region.
     *
     * This parameter is not supported by
     * [DescribeImageAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImageAttribute.html)
     * .
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param blockDeviceMappings The block device mapping entries that defines the block devices to
     * attach to the instance at launch.
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
     */
    public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

    /**
     * @param blockDeviceMappings The block device mapping entries that defines the block devices to
     * attach to the instance at launch.
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
     */
    public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

    /**
     * @param blockDeviceMappings The block device mapping entries that defines the block devices to
     * attach to the instance at launch.
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
     */
    public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

    /**
     * @param cpuOptions The CPU options for the instance.
     * For more information, see [Optimize CPU
     * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     */
    public fun cpuOptions(cpuOptions: IResolvable)

    /**
     * @param cpuOptions The CPU options for the instance.
     * For more information, see [Optimize CPU
     * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     */
    public fun cpuOptions(cpuOptions: CfnInstance.CpuOptionsProperty)

    /**
     * @param cpuOptions The CPU options for the instance.
     * For more information, see [Optimize CPU
     * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75d9bfdd7e563d53d90d53e18c29c1142832f9a78be4442581d7be6bec5743c9")
    public fun cpuOptions(cpuOptions: CfnInstance.CpuOptionsProperty.Builder.() -> Unit)

    /**
     * @param creditSpecification The credit option for CPU usage of the burstable performance
     * instance.
     * Valid values are `standard` and `unlimited` . To change this attribute after launch, use
     * [ModifyInstanceCreditSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html)
     * . For more information, see [Burstable performance
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `standard` (T2 instances) or `unlimited` (T3/T3a/T4g instances)
     *
     * For T3 instances with `host` tenancy, only `standard` is supported.
     */
    public fun creditSpecification(creditSpecification: IResolvable)

    /**
     * @param creditSpecification The credit option for CPU usage of the burstable performance
     * instance.
     * Valid values are `standard` and `unlimited` . To change this attribute after launch, use
     * [ModifyInstanceCreditSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html)
     * . For more information, see [Burstable performance
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `standard` (T2 instances) or `unlimited` (T3/T3a/T4g instances)
     *
     * For T3 instances with `host` tenancy, only `standard` is supported.
     */
    public fun creditSpecification(creditSpecification: CfnInstance.CreditSpecificationProperty)

    /**
     * @param creditSpecification The credit option for CPU usage of the burstable performance
     * instance.
     * Valid values are `standard` and `unlimited` . To change this attribute after launch, use
     * [ModifyInstanceCreditSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html)
     * . For more information, see [Burstable performance
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `standard` (T2 instances) or `unlimited` (T3/T3a/T4g instances)
     *
     * For T3 instances with `host` tenancy, only `standard` is supported.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41da8b77c891273186a85c00f0ef2ac1933c0c9816af9e3ccf5cea1e9e6197b2")
    public
        fun creditSpecification(creditSpecification: CfnInstance.CreditSpecificationProperty.Builder.() -> Unit)

    /**
     * @param disableApiTermination If you set this parameter to `true` , you can't terminate the
     * instance using the Amazon EC2 console, CLI, or API;.
     * otherwise, you can. To change this attribute after launch, use
     * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
     * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can
     * terminate the instance by running the shutdown command from the instance.
     *
     * Default: `false`
     */
    public fun disableApiTermination(disableApiTermination: Boolean)

    /**
     * @param disableApiTermination If you set this parameter to `true` , you can't terminate the
     * instance using the Amazon EC2 console, CLI, or API;.
     * otherwise, you can. To change this attribute after launch, use
     * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
     * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can
     * terminate the instance by running the shutdown command from the instance.
     *
     * Default: `false`
     */
    public fun disableApiTermination(disableApiTermination: IResolvable)

    /**
     * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O.
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all
     * instance types. Additional usage charges apply when using an EBS-optimized instance.
     *
     * Default: `false`
     */
    public fun ebsOptimized(ebsOptimized: Boolean)

    /**
     * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O.
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all
     * instance types. Additional usage charges apply when using an EBS-optimized instance.
     *
     * Default: `false`
     */
    public fun ebsOptimized(ebsOptimized: IResolvable)

    /**
     * @param elasticGpuSpecifications An elastic GPU to associate with the instance.
     *
     * Amazon Elastic Graphics reached end of life on January 8, 2024.
     */
    public fun elasticGpuSpecifications(elasticGpuSpecifications: IResolvable)

    /**
     * @param elasticGpuSpecifications An elastic GPU to associate with the instance.
     *
     * Amazon Elastic Graphics reached end of life on January 8, 2024.
     */
    public fun elasticGpuSpecifications(elasticGpuSpecifications: List<Any>)

    /**
     * @param elasticGpuSpecifications An elastic GPU to associate with the instance.
     *
     * Amazon Elastic Graphics reached end of life on January 8, 2024.
     */
    public fun elasticGpuSpecifications(vararg elasticGpuSpecifications: Any)

    /**
     * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
     * instance.
     *
     * Amazon Elastic Inference (EI) is no longer available to new customers. For more information,
     * see [Amazon Elastic Inference
     * FAQs](https://docs.aws.amazon.com/machine-learning/elastic-inference/faqs/) .
     */
    public fun elasticInferenceAccelerators(elasticInferenceAccelerators: IResolvable)

    /**
     * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
     * instance.
     *
     * Amazon Elastic Inference (EI) is no longer available to new customers. For more information,
     * see [Amazon Elastic Inference
     * FAQs](https://docs.aws.amazon.com/machine-learning/elastic-inference/faqs/) .
     */
    public fun elasticInferenceAccelerators(elasticInferenceAccelerators: List<Any>)

    /**
     * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
     * instance.
     *
     * Amazon Elastic Inference (EI) is no longer available to new customers. For more information,
     * see [Amazon Elastic Inference
     * FAQs](https://docs.aws.amazon.com/machine-learning/elastic-inference/faqs/) .
     */
    public fun elasticInferenceAccelerators(vararg elasticInferenceAccelerators: Any)

    /**
     * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves.
     */
    public fun enclaveOptions(enclaveOptions: IResolvable)

    /**
     * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves.
     */
    public fun enclaveOptions(enclaveOptions: CfnInstance.EnclaveOptionsProperty)

    /**
     * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d85ae7df196b14420b19ab3a85392a5a10a74a350a3592733d4a174de1033ce")
    public fun enclaveOptions(enclaveOptions: CfnInstance.EnclaveOptionsProperty.Builder.() -> Unit)

    /**
     * @param hibernationOptions Indicates whether an instance is enabled for hibernation.
     * This parameter is valid only if the instance meets the [hibernation
     * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
     * . For more information, see [Hibernate your Amazon EC2
     * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon EC2
     * User Guide* .
     *
     * You can't enable hibernation and AWS Nitro Enclaves on the same instance.
     */
    public fun hibernationOptions(hibernationOptions: IResolvable)

    /**
     * @param hibernationOptions Indicates whether an instance is enabled for hibernation.
     * This parameter is valid only if the instance meets the [hibernation
     * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
     * . For more information, see [Hibernate your Amazon EC2
     * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon EC2
     * User Guide* .
     *
     * You can't enable hibernation and AWS Nitro Enclaves on the same instance.
     */
    public fun hibernationOptions(hibernationOptions: CfnInstance.HibernationOptionsProperty)

    /**
     * @param hibernationOptions Indicates whether an instance is enabled for hibernation.
     * This parameter is valid only if the instance meets the [hibernation
     * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
     * . For more information, see [Hibernate your Amazon EC2
     * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon EC2
     * User Guide* .
     *
     * You can't enable hibernation and AWS Nitro Enclaves on the same instance.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("628421170cd101f2c8fc7f6a7b593a965f21f616ccd77765a5c5ea5257d59441")
    public
        fun hibernationOptions(hibernationOptions: CfnInstance.HibernationOptionsProperty.Builder.() -> Unit)

    /**
     * @param hostId If you specify host for the `Affinity` property, the ID of a dedicated host
     * that the instance is associated with.
     * If you don't specify an ID, Amazon EC2 launches the instance onto any available, compatible
     * dedicated host in your account. This type of launch is called an untargeted launch. Note that
     * for untargeted launches, you must have a compatible, dedicated host available to successfully
     * launch instances.
     */
    public fun hostId(hostId: String)

    /**
     * @param hostResourceGroupArn The ARN of the host resource group in which to launch the
     * instances.
     * If you specify a host resource group ARN, omit the *Tenancy* parameter or set it to `host` .
     */
    public fun hostResourceGroupArn(hostResourceGroupArn: String)

    /**
     * @param iamInstanceProfile The name of an IAM instance profile.
     * To create a new IAM instance profile, use the
     * [AWS::IAM::InstanceProfile](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html)
     * resource.
     */
    public fun iamInstanceProfile(iamInstanceProfile: String)

    /**
     * @param imageId The ID of the AMI.
     * An AMI ID is required to launch an instance and must be specified here or in a launch
     * template.
     */
    public fun imageId(imageId: String)

    /**
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates
     * when you initiate shutdown from the instance (using the operating system command for system
     * shutdown).
     * Default: `stop`
     */
    public fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: String)

    /**
     * @param instanceType The instance type. For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide* .
     * When you change your EBS-backed instance type, instance restart or replacement behavior
     * depends on the instance type compatibility between the old and new types. An instance with an
     * instance store volume as the root volume is always replaced. For more information, see [Change
     * the instance type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html)
     * in the *Amazon EC2 User Guide* .
     */
    public fun instanceType(instanceType: String)

    /**
     * @param ipv6AddressCount The number of IPv6 addresses to associate with the primary network
     * interface.
     * Amazon EC2 chooses the IPv6 addresses from the range of your subnet. You cannot specify this
     * option and the option to assign specific IPv6 addresses in the same request. You can specify
     * this option if you've specified a minimum number of instances to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     */
    public fun ipv6AddressCount(ipv6AddressCount: Number)

    /**
     * @param ipv6Addresses The IPv6 addresses from the range of the subnet to associate with the
     * primary network interface.
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of instances
     * to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     */
    public fun ipv6Addresses(ipv6Addresses: IResolvable)

    /**
     * @param ipv6Addresses The IPv6 addresses from the range of the subnet to associate with the
     * primary network interface.
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of instances
     * to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     */
    public fun ipv6Addresses(ipv6Addresses: List<Any>)

    /**
     * @param ipv6Addresses The IPv6 addresses from the range of the subnet to associate with the
     * primary network interface.
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of instances
     * to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     */
    public fun ipv6Addresses(vararg ipv6Addresses: Any)

    /**
     * @param kernelId The ID of the kernel.
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [PV-GRUB](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
     * *Amazon EC2 User Guide* .
     */
    public fun kernelId(kernelId: String)

    /**
     * @param keyName The name of the key pair. You can create a key pair using
     * [CreateKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html)
     * or
     * [ImportKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html) .
     *
     * If you do not specify a key pair, you can't connect to the instance unless you choose an AMI
     * that is configured to allow users another way to log in.
     */
    public fun keyName(keyName: String)

    /**
     * @param launchTemplate The launch template.
     * Any additional parameters that you specify for the new instance overwrite the corresponding
     * parameters included in the launch template.
     */
    public fun launchTemplate(launchTemplate: IResolvable)

    /**
     * @param launchTemplate The launch template.
     * Any additional parameters that you specify for the new instance overwrite the corresponding
     * parameters included in the launch template.
     */
    public fun launchTemplate(launchTemplate: CfnInstance.LaunchTemplateSpecificationProperty)

    /**
     * @param launchTemplate The launch template.
     * Any additional parameters that you specify for the new instance overwrite the corresponding
     * parameters included in the launch template.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e326118898904f1199750eeee8062e3036ec75ce7993b39f7c062ee9a576a10f")
    public
        fun launchTemplate(launchTemplate: CfnInstance.LaunchTemplateSpecificationProperty.Builder.() -> Unit)

    /**
     * @param licenseSpecifications The license configurations.
     */
    public fun licenseSpecifications(licenseSpecifications: IResolvable)

    /**
     * @param licenseSpecifications The license configurations.
     */
    public fun licenseSpecifications(licenseSpecifications: List<Any>)

    /**
     * @param licenseSpecifications The license configurations.
     */
    public fun licenseSpecifications(vararg licenseSpecifications: Any)

    /**
     * @param monitoring Specifies whether detailed monitoring is enabled for the instance.
     * Specify `true` to enable detailed monitoring. Otherwise, basic monitoring is enabled. For
     * more information about detailed monitoring, see [Enable or turn off detailed monitoring for your
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html) in the
     * *Amazon EC2 User Guide* .
     */
    public fun monitoring(monitoring: Boolean)

    /**
     * @param monitoring Specifies whether detailed monitoring is enabled for the instance.
     * Specify `true` to enable detailed monitoring. Otherwise, basic monitoring is enabled. For
     * more information about detailed monitoring, see [Enable or turn off detailed monitoring for your
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html) in the
     * *Amazon EC2 User Guide* .
     */
    public fun monitoring(monitoring: IResolvable)

    /**
     * @param networkInterfaces The network interfaces to associate with the instance.
     *
     * If you use this property to point to a network interface, you must terminate the original
     * interface before attaching a new one to allow the update of the instance to succeed.
     *
     * If this resource has a public IP address and is also in a VPC that is defined in the same
     * template, you must use the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the VPC-gateway attachment.
     */
    public fun networkInterfaces(networkInterfaces: IResolvable)

    /**
     * @param networkInterfaces The network interfaces to associate with the instance.
     *
     * If you use this property to point to a network interface, you must terminate the original
     * interface before attaching a new one to allow the update of the instance to succeed.
     *
     * If this resource has a public IP address and is also in a VPC that is defined in the same
     * template, you must use the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the VPC-gateway attachment.
     */
    public fun networkInterfaces(networkInterfaces: List<Any>)

    /**
     * @param networkInterfaces The network interfaces to associate with the instance.
     *
     * If you use this property to point to a network interface, you must terminate the original
     * interface before attaching a new one to allow the update of the instance to succeed.
     *
     * If this resource has a public IP address and is also in a VPC that is defined in the same
     * template, you must use the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the VPC-gateway attachment.
     */
    public fun networkInterfaces(vararg networkInterfaces: Any)

    /**
     * @param placementGroupName The name of an existing placement group that you want to launch the
     * instance into (cluster | partition | spread).
     */
    public fun placementGroupName(placementGroupName: String)

    /**
     * @param privateDnsNameOptions The options for the instance hostname.
     */
    public fun privateDnsNameOptions(privateDnsNameOptions: IResolvable)

    /**
     * @param privateDnsNameOptions The options for the instance hostname.
     */
    public
        fun privateDnsNameOptions(privateDnsNameOptions: CfnInstance.PrivateDnsNameOptionsProperty)

    /**
     * @param privateDnsNameOptions The options for the instance hostname.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ac6d718cb39dd2d1c0790d4a269a5af4024cb27ec1e1cf3b42864818bd81afc")
    public
        fun privateDnsNameOptions(privateDnsNameOptions: CfnInstance.PrivateDnsNameOptionsProperty.Builder.() -> Unit)

    /**
     * @param privateIpAddress The primary IPv4 address. You must specify a value from the IPv4
     * address range of the subnet.
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
     */
    public fun privateIpAddress(privateIpAddress: String)

    /**
     * @param propagateTagsToVolumeOnCreation Indicates whether to assign the tags from the instance
     * to all of the volumes attached to the instance at launch.
     * If you specify `true` and you assign tags to the instance, those tags are automatically
     * assigned to all of the volumes that you attach to the instance at launch. If you specify `false`
     * , those tags are not assigned to the attached volumes.
     */
    public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean)

    /**
     * @param propagateTagsToVolumeOnCreation Indicates whether to assign the tags from the instance
     * to all of the volumes attached to the instance at launch.
     * If you specify `true` and you assign tags to the instance, those tags are automatically
     * assigned to all of the volumes that you attach to the instance at launch. If you specify `false`
     * , those tags are not assigned to the attached volumes.
     */
    public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: IResolvable)

    /**
     * @param ramdiskId The ID of the RAM disk to select.
     * Some kernels require additional drivers at launch. Check the kernel requirements for
     * information about whether you need to specify a RAM disk. To find kernel requirements, go to the
     * AWS Resource Center and search for the kernel ID.
     *
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [PV-GRUB](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
     * *Amazon EC2 User Guide* .
     */
    public fun ramdiskId(ramdiskId: String)

    /**
     * @param securityGroupIds The IDs of the security groups.
     * You can specify the IDs of existing security groups and references to resources created by
     * the stack template.
     *
     * If you specify a network interface, you must specify any security groups as part of the
     * network interface.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The IDs of the security groups.
     * You can specify the IDs of existing security groups and references to resources created by
     * the stack template.
     *
     * If you specify a network interface, you must specify any security groups as part of the
     * network interface.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param securityGroups [Default VPC] The names of the security groups. For a nondefault VPC,
     * you must use security group IDs instead.
     * You cannot specify this option and the network interfaces option in the same request. The
     * list can contain both the name of existing Amazon EC2 security groups or references to
     * AWS::EC2::SecurityGroup resources created in the template.
     *
     * Default: Amazon EC2 uses the default security group.
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * @param securityGroups [Default VPC] The names of the security groups. For a nondefault VPC,
     * you must use security group IDs instead.
     * You cannot specify this option and the network interfaces option in the same request. The
     * list can contain both the name of existing Amazon EC2 security groups or references to
     * AWS::EC2::SecurityGroup resources created in the template.
     *
     * Default: Amazon EC2 uses the default security group.
     */
    public fun securityGroups(vararg securityGroups: String)

    /**
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     * instance is either the source or the destination of any traffic that it receives.
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     */
    public fun sourceDestCheck(sourceDestCheck: Boolean)

    /**
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     * instance is either the source or the destination of any traffic that it receives.
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     */
    public fun sourceDestCheck(sourceDestCheck: IResolvable)

    /**
     * @param ssmAssociations The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * You can associate only one document with an instance.
     */
    public fun ssmAssociations(ssmAssociations: IResolvable)

    /**
     * @param ssmAssociations The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * You can associate only one document with an instance.
     */
    public fun ssmAssociations(ssmAssociations: List<Any>)

    /**
     * @param ssmAssociations The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * You can associate only one document with an instance.
     */
    public fun ssmAssociations(vararg ssmAssociations: Any)

    /**
     * @param subnetId The ID of the subnet to launch the instance into.
     * If you specify a network interface, you must specify any subnets as part of the network
     * interface instead of using this parameter.
     */
    public fun subnetId(subnetId: String)

    /**
     * @param tags The tags to add to the instance.
     * These tags are not applied to the EBS volumes, such as the root volume, unless
     * [PropagateTagsToVolumeOnCreation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     * is `true` .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to the instance.
     * These tags are not applied to the EBS volumes, such as the root volume, unless
     * [PropagateTagsToVolumeOnCreation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     * is `true` .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param tenancy The tenancy of the instance.
     * An instance with a tenancy of `dedicated` runs on single-tenant hardware.
     */
    public fun tenancy(tenancy: String)

    /**
     * @param userData The parameters or scripts to store as user data.
     * Any scripts in user data are run when you launch the instance. User data is limited to 16 KB.
     * You must provide base64-encoded text. For more information, see
     * [Fn::Base64](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-base64.html)
     * .
     *
     * If the root volume is an EBS volume and you update user data, CloudFormation restarts the
     * instance. If the root volume is an instance store volume and you update user data, the instance
     * is replaced.
     */
    public fun userData(userData: String)

    /**
     * @param volumes The volumes to attach to the instance.
     */
    public fun volumes(volumes: IResolvable)

    /**
     * @param volumes The volumes to attach to the instance.
     */
    public fun volumes(volumes: List<Any>)

    /**
     * @param volumes The volumes to attach to the instance.
     */
    public fun volumes(vararg volumes: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnInstanceProps.Builder =
        software.amazon.awscdk.services.ec2.CfnInstanceProps.builder()

    /**
     * @param additionalInfo This property is reserved for internal use.
     * If you use it, the stack fails with this error: `Bad property set: [Testing this property]
     * (Service: AmazonEC2; Status Code: 400; Error Code: InvalidParameterCombination; Request ID:
     * 0XXXXXX-49c7-4b40-8bcc-76885dcXXXXX)` .
     */
    override fun additionalInfo(additionalInfo: String) {
      cdkBuilder.additionalInfo(additionalInfo)
    }

    /**
     * @param affinity Indicates whether the instance is associated with a dedicated host.
     * If you want the instance to always restart on the same host on which it was launched, specify
     * `host` . If you want the instance to restart on any available host, but try to launch onto the
     * last host it ran on (on a best-effort basis), specify `default` .
     */
    override fun affinity(affinity: String) {
      cdkBuilder.affinity(affinity)
    }

    /**
     * @param availabilityZone The Availability Zone of the instance.
     * If not specified, an Availability Zone will be automatically chosen for you based on the load
     * balancing criteria for the Region.
     *
     * This parameter is not supported by
     * [DescribeImageAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImageAttribute.html)
     * .
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param blockDeviceMappings The block device mapping entries that defines the block devices to
     * attach to the instance at launch.
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
     */
    override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param blockDeviceMappings The block device mapping entries that defines the block devices to
     * attach to the instance at launch.
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
     */
    override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param blockDeviceMappings The block device mapping entries that defines the block devices to
     * attach to the instance at launch.
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
     */
    override fun blockDeviceMappings(vararg blockDeviceMappings: Any): Unit =
        blockDeviceMappings(blockDeviceMappings.toList())

    /**
     * @param cpuOptions The CPU options for the instance.
     * For more information, see [Optimize CPU
     * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     */
    override fun cpuOptions(cpuOptions: IResolvable) {
      cdkBuilder.cpuOptions(cpuOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param cpuOptions The CPU options for the instance.
     * For more information, see [Optimize CPU
     * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     */
    override fun cpuOptions(cpuOptions: CfnInstance.CpuOptionsProperty) {
      cdkBuilder.cpuOptions(cpuOptions.let(CfnInstance.CpuOptionsProperty.Companion::unwrap))
    }

    /**
     * @param cpuOptions The CPU options for the instance.
     * For more information, see [Optimize CPU
     * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75d9bfdd7e563d53d90d53e18c29c1142832f9a78be4442581d7be6bec5743c9")
    override fun cpuOptions(cpuOptions: CfnInstance.CpuOptionsProperty.Builder.() -> Unit): Unit =
        cpuOptions(CfnInstance.CpuOptionsProperty(cpuOptions))

    /**
     * @param creditSpecification The credit option for CPU usage of the burstable performance
     * instance.
     * Valid values are `standard` and `unlimited` . To change this attribute after launch, use
     * [ModifyInstanceCreditSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html)
     * . For more information, see [Burstable performance
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `standard` (T2 instances) or `unlimited` (T3/T3a/T4g instances)
     *
     * For T3 instances with `host` tenancy, only `standard` is supported.
     */
    override fun creditSpecification(creditSpecification: IResolvable) {
      cdkBuilder.creditSpecification(creditSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param creditSpecification The credit option for CPU usage of the burstable performance
     * instance.
     * Valid values are `standard` and `unlimited` . To change this attribute after launch, use
     * [ModifyInstanceCreditSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html)
     * . For more information, see [Burstable performance
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `standard` (T2 instances) or `unlimited` (T3/T3a/T4g instances)
     *
     * For T3 instances with `host` tenancy, only `standard` is supported.
     */
    override fun creditSpecification(creditSpecification: CfnInstance.CreditSpecificationProperty) {
      cdkBuilder.creditSpecification(creditSpecification.let(CfnInstance.CreditSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param creditSpecification The credit option for CPU usage of the burstable performance
     * instance.
     * Valid values are `standard` and `unlimited` . To change this attribute after launch, use
     * [ModifyInstanceCreditSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html)
     * . For more information, see [Burstable performance
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `standard` (T2 instances) or `unlimited` (T3/T3a/T4g instances)
     *
     * For T3 instances with `host` tenancy, only `standard` is supported.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41da8b77c891273186a85c00f0ef2ac1933c0c9816af9e3ccf5cea1e9e6197b2")
    override
        fun creditSpecification(creditSpecification: CfnInstance.CreditSpecificationProperty.Builder.() -> Unit):
        Unit = creditSpecification(CfnInstance.CreditSpecificationProperty(creditSpecification))

    /**
     * @param disableApiTermination If you set this parameter to `true` , you can't terminate the
     * instance using the Amazon EC2 console, CLI, or API;.
     * otherwise, you can. To change this attribute after launch, use
     * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
     * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can
     * terminate the instance by running the shutdown command from the instance.
     *
     * Default: `false`
     */
    override fun disableApiTermination(disableApiTermination: Boolean) {
      cdkBuilder.disableApiTermination(disableApiTermination)
    }

    /**
     * @param disableApiTermination If you set this parameter to `true` , you can't terminate the
     * instance using the Amazon EC2 console, CLI, or API;.
     * otherwise, you can. To change this attribute after launch, use
     * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
     * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can
     * terminate the instance by running the shutdown command from the instance.
     *
     * Default: `false`
     */
    override fun disableApiTermination(disableApiTermination: IResolvable) {
      cdkBuilder.disableApiTermination(disableApiTermination.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O.
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all
     * instance types. Additional usage charges apply when using an EBS-optimized instance.
     *
     * Default: `false`
     */
    override fun ebsOptimized(ebsOptimized: Boolean) {
      cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /**
     * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O.
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all
     * instance types. Additional usage charges apply when using an EBS-optimized instance.
     *
     * Default: `false`
     */
    override fun ebsOptimized(ebsOptimized: IResolvable) {
      cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param elasticGpuSpecifications An elastic GPU to associate with the instance.
     *
     * Amazon Elastic Graphics reached end of life on January 8, 2024.
     */
    override fun elasticGpuSpecifications(elasticGpuSpecifications: IResolvable) {
      cdkBuilder.elasticGpuSpecifications(elasticGpuSpecifications.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param elasticGpuSpecifications An elastic GPU to associate with the instance.
     *
     * Amazon Elastic Graphics reached end of life on January 8, 2024.
     */
    override fun elasticGpuSpecifications(elasticGpuSpecifications: List<Any>) {
      cdkBuilder.elasticGpuSpecifications(elasticGpuSpecifications.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param elasticGpuSpecifications An elastic GPU to associate with the instance.
     *
     * Amazon Elastic Graphics reached end of life on January 8, 2024.
     */
    override fun elasticGpuSpecifications(vararg elasticGpuSpecifications: Any): Unit =
        elasticGpuSpecifications(elasticGpuSpecifications.toList())

    /**
     * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
     * instance.
     *
     * Amazon Elastic Inference (EI) is no longer available to new customers. For more information,
     * see [Amazon Elastic Inference
     * FAQs](https://docs.aws.amazon.com/machine-learning/elastic-inference/faqs/) .
     */
    override fun elasticInferenceAccelerators(elasticInferenceAccelerators: IResolvable) {
      cdkBuilder.elasticInferenceAccelerators(elasticInferenceAccelerators.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
     * instance.
     *
     * Amazon Elastic Inference (EI) is no longer available to new customers. For more information,
     * see [Amazon Elastic Inference
     * FAQs](https://docs.aws.amazon.com/machine-learning/elastic-inference/faqs/) .
     */
    override fun elasticInferenceAccelerators(elasticInferenceAccelerators: List<Any>) {
      cdkBuilder.elasticInferenceAccelerators(elasticInferenceAccelerators.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
     * instance.
     *
     * Amazon Elastic Inference (EI) is no longer available to new customers. For more information,
     * see [Amazon Elastic Inference
     * FAQs](https://docs.aws.amazon.com/machine-learning/elastic-inference/faqs/) .
     */
    override fun elasticInferenceAccelerators(vararg elasticInferenceAccelerators: Any): Unit =
        elasticInferenceAccelerators(elasticInferenceAccelerators.toList())

    /**
     * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves.
     */
    override fun enclaveOptions(enclaveOptions: IResolvable) {
      cdkBuilder.enclaveOptions(enclaveOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves.
     */
    override fun enclaveOptions(enclaveOptions: CfnInstance.EnclaveOptionsProperty) {
      cdkBuilder.enclaveOptions(enclaveOptions.let(CfnInstance.EnclaveOptionsProperty.Companion::unwrap))
    }

    /**
     * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d85ae7df196b14420b19ab3a85392a5a10a74a350a3592733d4a174de1033ce")
    override
        fun enclaveOptions(enclaveOptions: CfnInstance.EnclaveOptionsProperty.Builder.() -> Unit):
        Unit = enclaveOptions(CfnInstance.EnclaveOptionsProperty(enclaveOptions))

    /**
     * @param hibernationOptions Indicates whether an instance is enabled for hibernation.
     * This parameter is valid only if the instance meets the [hibernation
     * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
     * . For more information, see [Hibernate your Amazon EC2
     * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon EC2
     * User Guide* .
     *
     * You can't enable hibernation and AWS Nitro Enclaves on the same instance.
     */
    override fun hibernationOptions(hibernationOptions: IResolvable) {
      cdkBuilder.hibernationOptions(hibernationOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param hibernationOptions Indicates whether an instance is enabled for hibernation.
     * This parameter is valid only if the instance meets the [hibernation
     * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
     * . For more information, see [Hibernate your Amazon EC2
     * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon EC2
     * User Guide* .
     *
     * You can't enable hibernation and AWS Nitro Enclaves on the same instance.
     */
    override fun hibernationOptions(hibernationOptions: CfnInstance.HibernationOptionsProperty) {
      cdkBuilder.hibernationOptions(hibernationOptions.let(CfnInstance.HibernationOptionsProperty.Companion::unwrap))
    }

    /**
     * @param hibernationOptions Indicates whether an instance is enabled for hibernation.
     * This parameter is valid only if the instance meets the [hibernation
     * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
     * . For more information, see [Hibernate your Amazon EC2
     * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon EC2
     * User Guide* .
     *
     * You can't enable hibernation and AWS Nitro Enclaves on the same instance.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("628421170cd101f2c8fc7f6a7b593a965f21f616ccd77765a5c5ea5257d59441")
    override
        fun hibernationOptions(hibernationOptions: CfnInstance.HibernationOptionsProperty.Builder.() -> Unit):
        Unit = hibernationOptions(CfnInstance.HibernationOptionsProperty(hibernationOptions))

    /**
     * @param hostId If you specify host for the `Affinity` property, the ID of a dedicated host
     * that the instance is associated with.
     * If you don't specify an ID, Amazon EC2 launches the instance onto any available, compatible
     * dedicated host in your account. This type of launch is called an untargeted launch. Note that
     * for untargeted launches, you must have a compatible, dedicated host available to successfully
     * launch instances.
     */
    override fun hostId(hostId: String) {
      cdkBuilder.hostId(hostId)
    }

    /**
     * @param hostResourceGroupArn The ARN of the host resource group in which to launch the
     * instances.
     * If you specify a host resource group ARN, omit the *Tenancy* parameter or set it to `host` .
     */
    override fun hostResourceGroupArn(hostResourceGroupArn: String) {
      cdkBuilder.hostResourceGroupArn(hostResourceGroupArn)
    }

    /**
     * @param iamInstanceProfile The name of an IAM instance profile.
     * To create a new IAM instance profile, use the
     * [AWS::IAM::InstanceProfile](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html)
     * resource.
     */
    override fun iamInstanceProfile(iamInstanceProfile: String) {
      cdkBuilder.iamInstanceProfile(iamInstanceProfile)
    }

    /**
     * @param imageId The ID of the AMI.
     * An AMI ID is required to launch an instance and must be specified here or in a launch
     * template.
     */
    override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    /**
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates
     * when you initiate shutdown from the instance (using the operating system command for system
     * shutdown).
     * Default: `stop`
     */
    override fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: String) {
      cdkBuilder.instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior)
    }

    /**
     * @param instanceType The instance type. For more information, see [Instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
     * EC2 User Guide* .
     * When you change your EBS-backed instance type, instance restart or replacement behavior
     * depends on the instance type compatibility between the old and new types. An instance with an
     * instance store volume as the root volume is always replaced. For more information, see [Change
     * the instance type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html)
     * in the *Amazon EC2 User Guide* .
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param ipv6AddressCount The number of IPv6 addresses to associate with the primary network
     * interface.
     * Amazon EC2 chooses the IPv6 addresses from the range of your subnet. You cannot specify this
     * option and the option to assign specific IPv6 addresses in the same request. You can specify
     * this option if you've specified a minimum number of instances to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     */
    override fun ipv6AddressCount(ipv6AddressCount: Number) {
      cdkBuilder.ipv6AddressCount(ipv6AddressCount)
    }

    /**
     * @param ipv6Addresses The IPv6 addresses from the range of the subnet to associate with the
     * primary network interface.
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of instances
     * to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     */
    override fun ipv6Addresses(ipv6Addresses: IResolvable) {
      cdkBuilder.ipv6Addresses(ipv6Addresses.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ipv6Addresses The IPv6 addresses from the range of the subnet to associate with the
     * primary network interface.
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of instances
     * to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     */
    override fun ipv6Addresses(ipv6Addresses: List<Any>) {
      cdkBuilder.ipv6Addresses(ipv6Addresses.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param ipv6Addresses The IPv6 addresses from the range of the subnet to associate with the
     * primary network interface.
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of instances
     * to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     */
    override fun ipv6Addresses(vararg ipv6Addresses: Any): Unit =
        ipv6Addresses(ipv6Addresses.toList())

    /**
     * @param kernelId The ID of the kernel.
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [PV-GRUB](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
     * *Amazon EC2 User Guide* .
     */
    override fun kernelId(kernelId: String) {
      cdkBuilder.kernelId(kernelId)
    }

    /**
     * @param keyName The name of the key pair. You can create a key pair using
     * [CreateKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html)
     * or
     * [ImportKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html) .
     *
     * If you do not specify a key pair, you can't connect to the instance unless you choose an AMI
     * that is configured to allow users another way to log in.
     */
    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    /**
     * @param launchTemplate The launch template.
     * Any additional parameters that you specify for the new instance overwrite the corresponding
     * parameters included in the launch template.
     */
    override fun launchTemplate(launchTemplate: IResolvable) {
      cdkBuilder.launchTemplate(launchTemplate.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param launchTemplate The launch template.
     * Any additional parameters that you specify for the new instance overwrite the corresponding
     * parameters included in the launch template.
     */
    override fun launchTemplate(launchTemplate: CfnInstance.LaunchTemplateSpecificationProperty) {
      cdkBuilder.launchTemplate(launchTemplate.let(CfnInstance.LaunchTemplateSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param launchTemplate The launch template.
     * Any additional parameters that you specify for the new instance overwrite the corresponding
     * parameters included in the launch template.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e326118898904f1199750eeee8062e3036ec75ce7993b39f7c062ee9a576a10f")
    override
        fun launchTemplate(launchTemplate: CfnInstance.LaunchTemplateSpecificationProperty.Builder.() -> Unit):
        Unit = launchTemplate(CfnInstance.LaunchTemplateSpecificationProperty(launchTemplate))

    /**
     * @param licenseSpecifications The license configurations.
     */
    override fun licenseSpecifications(licenseSpecifications: IResolvable) {
      cdkBuilder.licenseSpecifications(licenseSpecifications.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param licenseSpecifications The license configurations.
     */
    override fun licenseSpecifications(licenseSpecifications: List<Any>) {
      cdkBuilder.licenseSpecifications(licenseSpecifications.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param licenseSpecifications The license configurations.
     */
    override fun licenseSpecifications(vararg licenseSpecifications: Any): Unit =
        licenseSpecifications(licenseSpecifications.toList())

    /**
     * @param monitoring Specifies whether detailed monitoring is enabled for the instance.
     * Specify `true` to enable detailed monitoring. Otherwise, basic monitoring is enabled. For
     * more information about detailed monitoring, see [Enable or turn off detailed monitoring for your
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html) in the
     * *Amazon EC2 User Guide* .
     */
    override fun monitoring(monitoring: Boolean) {
      cdkBuilder.monitoring(monitoring)
    }

    /**
     * @param monitoring Specifies whether detailed monitoring is enabled for the instance.
     * Specify `true` to enable detailed monitoring. Otherwise, basic monitoring is enabled. For
     * more information about detailed monitoring, see [Enable or turn off detailed monitoring for your
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html) in the
     * *Amazon EC2 User Guide* .
     */
    override fun monitoring(monitoring: IResolvable) {
      cdkBuilder.monitoring(monitoring.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param networkInterfaces The network interfaces to associate with the instance.
     *
     * If you use this property to point to a network interface, you must terminate the original
     * interface before attaching a new one to allow the update of the instance to succeed.
     *
     * If this resource has a public IP address and is also in a VPC that is defined in the same
     * template, you must use the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the VPC-gateway attachment.
     */
    override fun networkInterfaces(networkInterfaces: IResolvable) {
      cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param networkInterfaces The network interfaces to associate with the instance.
     *
     * If you use this property to point to a network interface, you must terminate the original
     * interface before attaching a new one to allow the update of the instance to succeed.
     *
     * If this resource has a public IP address and is also in a VPC that is defined in the same
     * template, you must use the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the VPC-gateway attachment.
     */
    override fun networkInterfaces(networkInterfaces: List<Any>) {
      cdkBuilder.networkInterfaces(networkInterfaces.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param networkInterfaces The network interfaces to associate with the instance.
     *
     * If you use this property to point to a network interface, you must terminate the original
     * interface before attaching a new one to allow the update of the instance to succeed.
     *
     * If this resource has a public IP address and is also in a VPC that is defined in the same
     * template, you must use the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the VPC-gateway attachment.
     */
    override fun networkInterfaces(vararg networkInterfaces: Any): Unit =
        networkInterfaces(networkInterfaces.toList())

    /**
     * @param placementGroupName The name of an existing placement group that you want to launch the
     * instance into (cluster | partition | spread).
     */
    override fun placementGroupName(placementGroupName: String) {
      cdkBuilder.placementGroupName(placementGroupName)
    }

    /**
     * @param privateDnsNameOptions The options for the instance hostname.
     */
    override fun privateDnsNameOptions(privateDnsNameOptions: IResolvable) {
      cdkBuilder.privateDnsNameOptions(privateDnsNameOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param privateDnsNameOptions The options for the instance hostname.
     */
    override
        fun privateDnsNameOptions(privateDnsNameOptions: CfnInstance.PrivateDnsNameOptionsProperty) {
      cdkBuilder.privateDnsNameOptions(privateDnsNameOptions.let(CfnInstance.PrivateDnsNameOptionsProperty.Companion::unwrap))
    }

    /**
     * @param privateDnsNameOptions The options for the instance hostname.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ac6d718cb39dd2d1c0790d4a269a5af4024cb27ec1e1cf3b42864818bd81afc")
    override
        fun privateDnsNameOptions(privateDnsNameOptions: CfnInstance.PrivateDnsNameOptionsProperty.Builder.() -> Unit):
        Unit =
        privateDnsNameOptions(CfnInstance.PrivateDnsNameOptionsProperty(privateDnsNameOptions))

    /**
     * @param privateIpAddress The primary IPv4 address. You must specify a value from the IPv4
     * address range of the subnet.
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
     */
    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    /**
     * @param propagateTagsToVolumeOnCreation Indicates whether to assign the tags from the instance
     * to all of the volumes attached to the instance at launch.
     * If you specify `true` and you assign tags to the instance, those tags are automatically
     * assigned to all of the volumes that you attach to the instance at launch. If you specify `false`
     * , those tags are not assigned to the attached volumes.
     */
    override fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean) {
      cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation)
    }

    /**
     * @param propagateTagsToVolumeOnCreation Indicates whether to assign the tags from the instance
     * to all of the volumes attached to the instance at launch.
     * If you specify `true` and you assign tags to the instance, those tags are automatically
     * assigned to all of the volumes that you attach to the instance at launch. If you specify `false`
     * , those tags are not assigned to the attached volumes.
     */
    override fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: IResolvable) {
      cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ramdiskId The ID of the RAM disk to select.
     * Some kernels require additional drivers at launch. Check the kernel requirements for
     * information about whether you need to specify a RAM disk. To find kernel requirements, go to the
     * AWS Resource Center and search for the kernel ID.
     *
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [PV-GRUB](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
     * *Amazon EC2 User Guide* .
     */
    override fun ramdiskId(ramdiskId: String) {
      cdkBuilder.ramdiskId(ramdiskId)
    }

    /**
     * @param securityGroupIds The IDs of the security groups.
     * You can specify the IDs of existing security groups and references to resources created by
     * the stack template.
     *
     * If you specify a network interface, you must specify any security groups as part of the
     * network interface.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The IDs of the security groups.
     * You can specify the IDs of existing security groups and references to resources created by
     * the stack template.
     *
     * If you specify a network interface, you must specify any security groups as part of the
     * network interface.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param securityGroups [Default VPC] The names of the security groups. For a nondefault VPC,
     * you must use security group IDs instead.
     * You cannot specify this option and the network interfaces option in the same request. The
     * list can contain both the name of existing Amazon EC2 security groups or references to
     * AWS::EC2::SecurityGroup resources created in the template.
     *
     * Default: Amazon EC2 uses the default security group.
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * @param securityGroups [Default VPC] The names of the security groups. For a nondefault VPC,
     * you must use security group IDs instead.
     * You cannot specify this option and the network interfaces option in the same request. The
     * list can contain both the name of existing Amazon EC2 security groups or references to
     * AWS::EC2::SecurityGroup resources created in the template.
     *
     * Default: Amazon EC2 uses the default security group.
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     * instance is either the source or the destination of any traffic that it receives.
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     */
    override fun sourceDestCheck(sourceDestCheck: Boolean) {
      cdkBuilder.sourceDestCheck(sourceDestCheck)
    }

    /**
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     * instance is either the source or the destination of any traffic that it receives.
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     */
    override fun sourceDestCheck(sourceDestCheck: IResolvable) {
      cdkBuilder.sourceDestCheck(sourceDestCheck.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ssmAssociations The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * You can associate only one document with an instance.
     */
    override fun ssmAssociations(ssmAssociations: IResolvable) {
      cdkBuilder.ssmAssociations(ssmAssociations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ssmAssociations The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * You can associate only one document with an instance.
     */
    override fun ssmAssociations(ssmAssociations: List<Any>) {
      cdkBuilder.ssmAssociations(ssmAssociations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param ssmAssociations The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more information,
     * see [Create an IAM instance profile for Systems
     * Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * You can associate only one document with an instance.
     */
    override fun ssmAssociations(vararg ssmAssociations: Any): Unit =
        ssmAssociations(ssmAssociations.toList())

    /**
     * @param subnetId The ID of the subnet to launch the instance into.
     * If you specify a network interface, you must specify any subnets as part of the network
     * interface instead of using this parameter.
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * @param tags The tags to add to the instance.
     * These tags are not applied to the EBS volumes, such as the root volume, unless
     * [PropagateTagsToVolumeOnCreation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     * is `true` .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to add to the instance.
     * These tags are not applied to the EBS volumes, such as the root volume, unless
     * [PropagateTagsToVolumeOnCreation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     * is `true` .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param tenancy The tenancy of the instance.
     * An instance with a tenancy of `dedicated` runs on single-tenant hardware.
     */
    override fun tenancy(tenancy: String) {
      cdkBuilder.tenancy(tenancy)
    }

    /**
     * @param userData The parameters or scripts to store as user data.
     * Any scripts in user data are run when you launch the instance. User data is limited to 16 KB.
     * You must provide base64-encoded text. For more information, see
     * [Fn::Base64](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-base64.html)
     * .
     *
     * If the root volume is an EBS volume and you update user data, CloudFormation restarts the
     * instance. If the root volume is an instance store volume and you update user data, the instance
     * is replaced.
     */
    override fun userData(userData: String) {
      cdkBuilder.userData(userData)
    }

    /**
     * @param volumes The volumes to attach to the instance.
     */
    override fun volumes(volumes: IResolvable) {
      cdkBuilder.volumes(volumes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param volumes The volumes to attach to the instance.
     */
    override fun volumes(volumes: List<Any>) {
      cdkBuilder.volumes(volumes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param volumes The volumes to attach to the instance.
     */
    override fun volumes(vararg volumes: Any): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnInstanceProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnInstanceProps,
  ) : CdkObject(cdkObject),
      CfnInstanceProps {
    /**
     * This property is reserved for internal use.
     *
     * If you use it, the stack fails with this error: `Bad property set: [Testing this property]
     * (Service: AmazonEC2; Status Code: 400; Error Code: InvalidParameterCombination; Request ID:
     * 0XXXXXX-49c7-4b40-8bcc-76885dcXXXXX)` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-additionalinfo)
     */
    override fun additionalInfo(): String? = unwrap(this).getAdditionalInfo()

    /**
     * Indicates whether the instance is associated with a dedicated host.
     *
     * If you want the instance to always restart on the same host on which it was launched, specify
     * `host` . If you want the instance to restart on any available host, but try to launch onto the
     * last host it ran on (on a best-effort basis), specify `default` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-affinity)
     */
    override fun affinity(): String? = unwrap(this).getAffinity()

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
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

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
     */
    override fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

    /**
     * The CPU options for the instance.
     *
     * For more information, see [Optimize CPU
     * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
     * *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-cpuoptions)
     */
    override fun cpuOptions(): Any? = unwrap(this).getCpuOptions()

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
     */
    override fun creditSpecification(): Any? = unwrap(this).getCreditSpecification()

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
     */
    override fun disableApiTermination(): Any? = unwrap(this).getDisableApiTermination()

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
     */
    override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    /**
     * An elastic GPU to associate with the instance.
     *
     *
     * Amazon Elastic Graphics reached end of life on January 8, 2024.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications)
     */
    override fun elasticGpuSpecifications(): Any? = unwrap(this).getElasticGpuSpecifications()

    /**
     * An elastic inference accelerator to associate with the instance.
     *
     *
     * Amazon Elastic Inference (EI) is no longer available to new customers. For more information,
     * see [Amazon Elastic Inference
     * FAQs](https://docs.aws.amazon.com/machine-learning/elastic-inference/faqs/) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticinferenceaccelerators)
     */
    override fun elasticInferenceAccelerators(): Any? =
        unwrap(this).getElasticInferenceAccelerators()

    /**
     * Indicates whether the instance is enabled for AWS Nitro Enclaves.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-enclaveoptions)
     */
    override fun enclaveOptions(): Any? = unwrap(this).getEnclaveOptions()

    /**
     * Indicates whether an instance is enabled for hibernation.
     *
     * This parameter is valid only if the instance meets the [hibernation
     * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
     * . For more information, see [Hibernate your Amazon EC2
     * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon EC2
     * User Guide* .
     *
     * You can't enable hibernation and AWS Nitro Enclaves on the same instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hibernationoptions)
     */
    override fun hibernationOptions(): Any? = unwrap(this).getHibernationOptions()

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
     */
    override fun hostId(): String? = unwrap(this).getHostId()

    /**
     * The ARN of the host resource group in which to launch the instances.
     *
     * If you specify a host resource group ARN, omit the *Tenancy* parameter or set it to `host` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hostresourcegrouparn)
     */
    override fun hostResourceGroupArn(): String? = unwrap(this).getHostResourceGroupArn()

    /**
     * The name of an IAM instance profile.
     *
     * To create a new IAM instance profile, use the
     * [AWS::IAM::InstanceProfile](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html)
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-iaminstanceprofile)
     */
    override fun iamInstanceProfile(): String? = unwrap(this).getIamInstanceProfile()

    /**
     * The ID of the AMI.
     *
     * An AMI ID is required to launch an instance and must be specified here or in a launch
     * template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-imageid)
     */
    override fun imageId(): String? = unwrap(this).getImageId()

    /**
     * Indicates whether an instance stops or terminates when you initiate shutdown from the
     * instance (using the operating system command for system shutdown).
     *
     * Default: `stop`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-instanceinitiatedshutdownbehavior)
     */
    override fun instanceInitiatedShutdownBehavior(): String? =
        unwrap(this).getInstanceInitiatedShutdownBehavior()

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
     */
    override fun instanceType(): String? = unwrap(this).getInstanceType()

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
     */
    override fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

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
     */
    override fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

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
     */
    override fun kernelId(): String? = unwrap(this).getKernelId()

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
     */
    override fun keyName(): String? = unwrap(this).getKeyName()

    /**
     * The launch template.
     *
     * Any additional parameters that you specify for the new instance overwrite the corresponding
     * parameters included in the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-launchtemplate)
     */
    override fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

    /**
     * The license configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-licensespecifications)
     */
    override fun licenseSpecifications(): Any? = unwrap(this).getLicenseSpecifications()

    /**
     * Specifies whether detailed monitoring is enabled for the instance.
     *
     * Specify `true` to enable detailed monitoring. Otherwise, basic monitoring is enabled. For
     * more information about detailed monitoring, see [Enable or turn off detailed monitoring for your
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html) in the
     * *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-monitoring)
     */
    override fun monitoring(): Any? = unwrap(this).getMonitoring()

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
     */
    override fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

    /**
     * The name of an existing placement group that you want to launch the instance into (cluster |
     * partition | spread).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-placementgroupname)
     */
    override fun placementGroupName(): String? = unwrap(this).getPlacementGroupName()

    /**
     * The options for the instance hostname.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-privatednsnameoptions)
     */
    override fun privateDnsNameOptions(): Any? = unwrap(this).getPrivateDnsNameOptions()

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
     */
    override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    /**
     * Indicates whether to assign the tags from the instance to all of the volumes attached to the
     * instance at launch.
     *
     * If you specify `true` and you assign tags to the instance, those tags are automatically
     * assigned to all of the volumes that you attach to the instance at launch. If you specify `false`
     * , those tags are not assigned to the attached volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     */
    override fun propagateTagsToVolumeOnCreation(): Any? =
        unwrap(this).getPropagateTagsToVolumeOnCreation()

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
     */
    override fun ramdiskId(): String? = unwrap(this).getRamdiskId()

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
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

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
     */
    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * Enable or disable source/destination checks, which ensure that the instance is either the
     * source or the destination of any traffic that it receives.
     *
     * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
     * The default value is `true` . You must disable source/destination checks if the instance runs
     * services such as network address translation, routing, or firewalls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-sourcedestcheck)
     */
    override fun sourceDestCheck(): Any? = unwrap(this).getSourceDestCheck()

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
     */
    override fun ssmAssociations(): Any? = unwrap(this).getSsmAssociations()

    /**
     * The ID of the subnet to launch the instance into.
     *
     * If you specify a network interface, you must specify any subnets as part of the network
     * interface instead of using this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-subnetid)
     */
    override fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * The tags to add to the instance.
     *
     * These tags are not applied to the EBS volumes, such as the root volume, unless
     * [PropagateTagsToVolumeOnCreation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     * is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The tenancy of the instance.
     *
     * An instance with a tenancy of `dedicated` runs on single-tenant hardware.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-tenancy)
     */
    override fun tenancy(): String? = unwrap(this).getTenancy()

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
     */
    override fun userData(): String? = unwrap(this).getUserData()

    /**
     * The volumes to attach to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-volumes)
     */
    override fun volumes(): Any? = unwrap(this).getVolumes()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstanceProps):
        CfnInstanceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnInstanceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProps):
        software.amazon.awscdk.services.ec2.CfnInstanceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnInstanceProps
  }
}
