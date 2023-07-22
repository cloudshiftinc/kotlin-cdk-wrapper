@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateLaunchTemplateDataPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.LaunchTemplateDataProperty.Builder =
      CfnLaunchTemplate.LaunchTemplateDataProperty.builder()

  private val _blockDeviceMappings: MutableList<Any> = mutableListOf()

  private val _elasticGpuSpecifications: MutableList<Any> = mutableListOf()

  private val _elasticInferenceAccelerators: MutableList<Any> = mutableListOf()

  private val _licenseSpecifications: MutableList<Any> = mutableListOf()

  private val _networkInterfaces: MutableList<Any> = mutableListOf()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _securityGroups: MutableList<String> = mutableListOf()

  private val _tagSpecifications: MutableList<Any> = mutableListOf()

  /**
   * @param blockDeviceMappings The block device mapping.
   */
  public fun blockDeviceMappings(vararg blockDeviceMappings: Any) {
    _blockDeviceMappings.addAll(listOf(*blockDeviceMappings))
  }

  /**
   * @param blockDeviceMappings The block device mapping.
   */
  public fun blockDeviceMappings(blockDeviceMappings: Collection<Any>) {
    _blockDeviceMappings.addAll(blockDeviceMappings)
  }

  /**
   * @param blockDeviceMappings The block device mapping.
   */
  public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
    cdkBuilder.blockDeviceMappings(blockDeviceMappings)
  }

  /**
   * @param capacityReservationSpecification The Capacity Reservation targeting option.
   * If you do not specify this parameter, the instance's Capacity Reservation preference defaults
   * to `open` , which enables it to run in any open Capacity Reservation that has matching attributes
   * (instance type, platform, Availability Zone).
   */
  public fun capacityReservationSpecification(capacityReservationSpecification: IResolvable) {
    cdkBuilder.capacityReservationSpecification(capacityReservationSpecification)
  }

  /**
   * @param capacityReservationSpecification The Capacity Reservation targeting option.
   * If you do not specify this parameter, the instance's Capacity Reservation preference defaults
   * to `open` , which enables it to run in any open Capacity Reservation that has matching attributes
   * (instance type, platform, Availability Zone).
   */
  public
      fun capacityReservationSpecification(capacityReservationSpecification: CfnLaunchTemplate.CapacityReservationSpecificationProperty) {
    cdkBuilder.capacityReservationSpecification(capacityReservationSpecification)
  }

  /**
   * @param cpuOptions The CPU options for the instance.
   * For more information, see [Optimizing CPU
   * Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
   * *Amazon Elastic Compute Cloud User Guide* .
   */
  public fun cpuOptions(cpuOptions: IResolvable) {
    cdkBuilder.cpuOptions(cpuOptions)
  }

  /**
   * @param cpuOptions The CPU options for the instance.
   * For more information, see [Optimizing CPU
   * Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) in the
   * *Amazon Elastic Compute Cloud User Guide* .
   */
  public fun cpuOptions(cpuOptions: CfnLaunchTemplate.CpuOptionsProperty) {
    cdkBuilder.cpuOptions(cpuOptions)
  }

  /**
   * @param creditSpecification The credit option for CPU usage of the instance.
   * Valid only for T instances.
   */
  public fun creditSpecification(creditSpecification: IResolvable) {
    cdkBuilder.creditSpecification(creditSpecification)
  }

  /**
   * @param creditSpecification The credit option for CPU usage of the instance.
   * Valid only for T instances.
   */
  public
      fun creditSpecification(creditSpecification: CfnLaunchTemplate.CreditSpecificationProperty) {
    cdkBuilder.creditSpecification(creditSpecification)
  }

  /**
   * @param disableApiStop Indicates whether to enable the instance for stop protection.
   * For more information, see [Stop
   * protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection)
   * in the *Amazon Elastic Compute Cloud User Guide* .
   */
  public fun disableApiStop(disableApiStop: Boolean) {
    cdkBuilder.disableApiStop(disableApiStop)
  }

  /**
   * @param disableApiStop Indicates whether to enable the instance for stop protection.
   * For more information, see [Stop
   * protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection)
   * in the *Amazon Elastic Compute Cloud User Guide* .
   */
  public fun disableApiStop(disableApiStop: IResolvable) {
    cdkBuilder.disableApiStop(disableApiStop)
  }

  /**
   * @param disableApiTermination If you set this parameter to `true` , you can't terminate the
   * instance using the Amazon EC2 console, CLI, or API;.
   * otherwise, you can. To change this attribute after launch, use
   * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
   * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can terminate
   * the instance by running the shutdown command from the instance.
   */
  public fun disableApiTermination(disableApiTermination: Boolean) {
    cdkBuilder.disableApiTermination(disableApiTermination)
  }

  /**
   * @param disableApiTermination If you set this parameter to `true` , you can't terminate the
   * instance using the Amazon EC2 console, CLI, or API;.
   * otherwise, you can. To change this attribute after launch, use
   * [ModifyInstanceAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html)
   * . Alternatively, if you set `InstanceInitiatedShutdownBehavior` to `terminate` , you can terminate
   * the instance by running the shutdown command from the instance.
   */
  public fun disableApiTermination(disableApiTermination: IResolvable) {
    cdkBuilder.disableApiTermination(disableApiTermination)
  }

  /**
   * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O.
   * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
   * stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all
   * instance types. Additional usage charges apply when using an EBS-optimized instance.
   */
  public fun ebsOptimized(ebsOptimized: Boolean) {
    cdkBuilder.ebsOptimized(ebsOptimized)
  }

  /**
   * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O.
   * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
   * stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with all
   * instance types. Additional usage charges apply when using an EBS-optimized instance.
   */
  public fun ebsOptimized(ebsOptimized: IResolvable) {
    cdkBuilder.ebsOptimized(ebsOptimized)
  }

  /**
   * @param elasticGpuSpecifications An elastic GPU to associate with the instance.
   */
  public fun elasticGpuSpecifications(vararg elasticGpuSpecifications: Any) {
    _elasticGpuSpecifications.addAll(listOf(*elasticGpuSpecifications))
  }

  /**
   * @param elasticGpuSpecifications An elastic GPU to associate with the instance.
   */
  public fun elasticGpuSpecifications(elasticGpuSpecifications: Collection<Any>) {
    _elasticGpuSpecifications.addAll(elasticGpuSpecifications)
  }

  /**
   * @param elasticGpuSpecifications An elastic GPU to associate with the instance.
   */
  public fun elasticGpuSpecifications(elasticGpuSpecifications: IResolvable) {
    cdkBuilder.elasticGpuSpecifications(elasticGpuSpecifications)
  }

  /**
   * @param elasticInferenceAccelerators The elastic inference accelerator for the instance.
   */
  public fun elasticInferenceAccelerators(vararg elasticInferenceAccelerators: Any) {
    _elasticInferenceAccelerators.addAll(listOf(*elasticInferenceAccelerators))
  }

  /**
   * @param elasticInferenceAccelerators The elastic inference accelerator for the instance.
   */
  public fun elasticInferenceAccelerators(elasticInferenceAccelerators: Collection<Any>) {
    _elasticInferenceAccelerators.addAll(elasticInferenceAccelerators)
  }

  /**
   * @param elasticInferenceAccelerators The elastic inference accelerator for the instance.
   */
  public fun elasticInferenceAccelerators(elasticInferenceAccelerators: IResolvable) {
    cdkBuilder.elasticInferenceAccelerators(elasticInferenceAccelerators)
  }

  /**
   * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves.
   * For more information, see [What is AWS Nitro
   * Enclaves?](https://docs.aws.amazon.com/enclaves/latest/user/nitro-enclave.html) in the *AWS Nitro
   * Enclaves User Guide* .
   *
   * You can't enable AWS Nitro Enclaves and hibernation on the same instance.
   */
  public fun enclaveOptions(enclaveOptions: IResolvable) {
    cdkBuilder.enclaveOptions(enclaveOptions)
  }

  /**
   * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves.
   * For more information, see [What is AWS Nitro
   * Enclaves?](https://docs.aws.amazon.com/enclaves/latest/user/nitro-enclave.html) in the *AWS Nitro
   * Enclaves User Guide* .
   *
   * You can't enable AWS Nitro Enclaves and hibernation on the same instance.
   */
  public fun enclaveOptions(enclaveOptions: CfnLaunchTemplate.EnclaveOptionsProperty) {
    cdkBuilder.enclaveOptions(enclaveOptions)
  }

  /**
   * @param hibernationOptions Indicates whether an instance is enabled for hibernation.
   * This parameter is valid only if the instance meets the [hibernation
   * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
   * . For more information, see [Hibernate your
   * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon
   * Elastic Compute Cloud User Guide* .
   */
  public fun hibernationOptions(hibernationOptions: IResolvable) {
    cdkBuilder.hibernationOptions(hibernationOptions)
  }

  /**
   * @param hibernationOptions Indicates whether an instance is enabled for hibernation.
   * This parameter is valid only if the instance meets the [hibernation
   * prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
   * . For more information, see [Hibernate your
   * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in the *Amazon
   * Elastic Compute Cloud User Guide* .
   */
  public fun hibernationOptions(hibernationOptions: CfnLaunchTemplate.HibernationOptionsProperty) {
    cdkBuilder.hibernationOptions(hibernationOptions)
  }

  /**
   * @param iamInstanceProfile The name or Amazon Resource Name (ARN) of an IAM instance profile.
   */
  public fun iamInstanceProfile(iamInstanceProfile: IResolvable) {
    cdkBuilder.iamInstanceProfile(iamInstanceProfile)
  }

  /**
   * @param iamInstanceProfile The name or Amazon Resource Name (ARN) of an IAM instance profile.
   */
  public fun iamInstanceProfile(iamInstanceProfile: CfnLaunchTemplate.IamInstanceProfileProperty) {
    cdkBuilder.iamInstanceProfile(iamInstanceProfile)
  }

  /**
   * @param imageId The ID of the AMI.
   * Alternatively, you can specify a Systems Manager parameter, which will resolve to an AMI ID on
   * launch.
   *
   * Valid formats:
   *
   * * `ami-17characters00000`
   * * `resolve:ssm:parameter-name`
   * * `resolve:ssm:parameter-name:version-number`
   * * `resolve:ssm:parameter-name:label`
   *
   * For more information, see [Use a Systems Manager parameter to find an
   * AMI](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html#using-systems-manager-parameter-to-find-AMI)
   * in the *Amazon Elastic Compute Cloud User Guide* .
   */
  public fun imageId(imageId: String) {
    cdkBuilder.imageId(imageId)
  }

  /**
   * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates when
   * you initiate shutdown from the instance (using the operating system command for system shutdown).
   * Default: `stop`
   */
  public fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: String) {
    cdkBuilder.instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior)
  }

  /**
   * @param instanceMarketOptions The market (purchasing) option for the instances.
   */
  public fun instanceMarketOptions(instanceMarketOptions: IResolvable) {
    cdkBuilder.instanceMarketOptions(instanceMarketOptions)
  }

  /**
   * @param instanceMarketOptions The market (purchasing) option for the instances.
   */
  public
      fun instanceMarketOptions(instanceMarketOptions: CfnLaunchTemplate.InstanceMarketOptionsProperty) {
    cdkBuilder.instanceMarketOptions(instanceMarketOptions)
  }

  /**
   * @param instanceRequirements The attributes for the instance types.
   * When you specify instance attributes, Amazon EC2 will identify instance types with these
   * attributes.
   *
   * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
   */
  public fun instanceRequirements(instanceRequirements: IResolvable) {
    cdkBuilder.instanceRequirements(instanceRequirements)
  }

  /**
   * @param instanceRequirements The attributes for the instance types.
   * When you specify instance attributes, Amazon EC2 will identify instance types with these
   * attributes.
   *
   * If you specify `InstanceRequirements` , you can't specify `InstanceType` .
   */
  public
      fun instanceRequirements(instanceRequirements: CfnLaunchTemplate.InstanceRequirementsProperty) {
    cdkBuilder.instanceRequirements(instanceRequirements)
  }

  /**
   * @param instanceType The instance type. For more information, see [Instance
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in the *Amazon
   * Elastic Compute Cloud User Guide* .
   * If you specify `InstanceType` , you can't specify `InstanceRequirements` .
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param kernelId The ID of the kernel.
   * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
   * [User Provided
   * Kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
   * *Amazon EC2 User Guide* .
   */
  public fun kernelId(kernelId: String) {
    cdkBuilder.kernelId(kernelId)
  }

  /**
   * @param keyName The name of the key pair. You can create a key pair using
   * [CreateKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html) or
   * [ImportKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html) .
   *
   * If you do not specify a key pair, you can't connect to the instance unless you choose an AMI
   * that is configured to allow users another way to log in.
   */
  public fun keyName(keyName: String) {
    cdkBuilder.keyName(keyName)
  }

  /**
   * @param licenseSpecifications The license configurations.
   */
  public fun licenseSpecifications(vararg licenseSpecifications: Any) {
    _licenseSpecifications.addAll(listOf(*licenseSpecifications))
  }

  /**
   * @param licenseSpecifications The license configurations.
   */
  public fun licenseSpecifications(licenseSpecifications: Collection<Any>) {
    _licenseSpecifications.addAll(licenseSpecifications)
  }

  /**
   * @param licenseSpecifications The license configurations.
   */
  public fun licenseSpecifications(licenseSpecifications: IResolvable) {
    cdkBuilder.licenseSpecifications(licenseSpecifications)
  }

  /**
   * @param maintenanceOptions The maintenance options of your instance.
   */
  public fun maintenanceOptions(maintenanceOptions: IResolvable) {
    cdkBuilder.maintenanceOptions(maintenanceOptions)
  }

  /**
   * @param maintenanceOptions The maintenance options of your instance.
   */
  public fun maintenanceOptions(maintenanceOptions: CfnLaunchTemplate.MaintenanceOptionsProperty) {
    cdkBuilder.maintenanceOptions(maintenanceOptions)
  }

  /**
   * @param metadataOptions The metadata options for the instance.
   * For more information, see [Instance metadata and user
   * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
   * *Amazon Elastic Compute Cloud User Guide* .
   */
  public fun metadataOptions(metadataOptions: IResolvable) {
    cdkBuilder.metadataOptions(metadataOptions)
  }

  /**
   * @param metadataOptions The metadata options for the instance.
   * For more information, see [Instance metadata and user
   * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
   * *Amazon Elastic Compute Cloud User Guide* .
   */
  public fun metadataOptions(metadataOptions: CfnLaunchTemplate.MetadataOptionsProperty) {
    cdkBuilder.metadataOptions(metadataOptions)
  }

  /**
   * @param monitoring The monitoring for the instance.
   */
  public fun monitoring(monitoring: IResolvable) {
    cdkBuilder.monitoring(monitoring)
  }

  /**
   * @param monitoring The monitoring for the instance.
   */
  public fun monitoring(monitoring: CfnLaunchTemplate.MonitoringProperty) {
    cdkBuilder.monitoring(monitoring)
  }

  /**
   * @param networkInterfaces One or more network interfaces.
   * If you specify a network interface, you must specify any security groups and subnets as part of
   * the network interface.
   */
  public fun networkInterfaces(vararg networkInterfaces: Any) {
    _networkInterfaces.addAll(listOf(*networkInterfaces))
  }

  /**
   * @param networkInterfaces One or more network interfaces.
   * If you specify a network interface, you must specify any security groups and subnets as part of
   * the network interface.
   */
  public fun networkInterfaces(networkInterfaces: Collection<Any>) {
    _networkInterfaces.addAll(networkInterfaces)
  }

  /**
   * @param networkInterfaces One or more network interfaces.
   * If you specify a network interface, you must specify any security groups and subnets as part of
   * the network interface.
   */
  public fun networkInterfaces(networkInterfaces: IResolvable) {
    cdkBuilder.networkInterfaces(networkInterfaces)
  }

  /**
   * @param placement The placement for the instance.
   */
  public fun placement(placement: IResolvable) {
    cdkBuilder.placement(placement)
  }

  /**
   * @param placement The placement for the instance.
   */
  public fun placement(placement: CfnLaunchTemplate.PlacementProperty) {
    cdkBuilder.placement(placement)
  }

  /**
   * @param privateDnsNameOptions The hostname type for EC2 instances launched into this subnet and
   * how DNS A and AAAA record queries should be handled.
   * For more information, see [Amazon EC2 instance hostname
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
   * *Amazon Elastic Compute Cloud User Guide* .
   */
  public fun privateDnsNameOptions(privateDnsNameOptions: IResolvable) {
    cdkBuilder.privateDnsNameOptions(privateDnsNameOptions)
  }

  /**
   * @param privateDnsNameOptions The hostname type for EC2 instances launched into this subnet and
   * how DNS A and AAAA record queries should be handled.
   * For more information, see [Amazon EC2 instance hostname
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html) in the
   * *Amazon Elastic Compute Cloud User Guide* .
   */
  public
      fun privateDnsNameOptions(privateDnsNameOptions: CfnLaunchTemplate.PrivateDnsNameOptionsProperty) {
    cdkBuilder.privateDnsNameOptions(privateDnsNameOptions)
  }

  /**
   * @param ramDiskId The ID of the RAM disk.
   *
   * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
   * [User provided
   * kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in the
   * *Amazon Elastic Compute Cloud User Guide* .
   */
  public fun ramDiskId(ramDiskId: String) {
    cdkBuilder.ramDiskId(ramDiskId)
  }

  /**
   * @param securityGroupIds The IDs of the security groups.
   * You can specify the IDs of existing security groups and references to resources created by the
   * stack template.
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds The IDs of the security groups.
   * You can specify the IDs of existing security groups and references to resources created by the
   * stack template.
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param securityGroups One or more security group names.
   * For a nondefault VPC, you must use security group IDs instead. You cannot specify both a
   * security group ID and security name in the same request.
   */
  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups One or more security group names.
   * For a nondefault VPC, you must use security group IDs instead. You cannot specify both a
   * security group ID and security name in the same request.
   */
  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * @param tagSpecifications The tags to apply to the resources that are created during instance
   * launch.
   * You can specify tags for the following resources only:
   *
   * * Instances
   * * Volumes
   * * Elastic graphics
   * * Spot Instance requests
   * * Network interfaces
   *
   * To tag a resource after it has been created, see
   * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
   *
   *
   * To tag the launch template itself, you must use the
   * [TagSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateLaunchTemplate.html)
   * parameter.
   */
  public fun tagSpecifications(vararg tagSpecifications: Any) {
    _tagSpecifications.addAll(listOf(*tagSpecifications))
  }

  /**
   * @param tagSpecifications The tags to apply to the resources that are created during instance
   * launch.
   * You can specify tags for the following resources only:
   *
   * * Instances
   * * Volumes
   * * Elastic graphics
   * * Spot Instance requests
   * * Network interfaces
   *
   * To tag a resource after it has been created, see
   * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
   *
   *
   * To tag the launch template itself, you must use the
   * [TagSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateLaunchTemplate.html)
   * parameter.
   */
  public fun tagSpecifications(tagSpecifications: Collection<Any>) {
    _tagSpecifications.addAll(tagSpecifications)
  }

  /**
   * @param tagSpecifications The tags to apply to the resources that are created during instance
   * launch.
   * You can specify tags for the following resources only:
   *
   * * Instances
   * * Volumes
   * * Elastic graphics
   * * Spot Instance requests
   * * Network interfaces
   *
   * To tag a resource after it has been created, see
   * [CreateTags](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html) .
   *
   *
   * To tag the launch template itself, you must use the
   * [TagSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateLaunchTemplate.html)
   * parameter.
   */
  public fun tagSpecifications(tagSpecifications: IResolvable) {
    cdkBuilder.tagSpecifications(tagSpecifications)
  }

  /**
   * @param userData The user data to make available to the instance.
   * You must provide base64-encoded text. User data is limited to 16 KB. For more information, see
   * [Run commands on your Linux instance at
   * launch](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html) (Linux) or [Work with
   * instance user
   * data](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instancedata-add-user-data.html)
   * (Windows) in the *Amazon Elastic Compute Cloud User Guide* .
   *
   * If you are creating the launch template for use with AWS Batch , the user data must be provided
   * in the [MIME multi-part archive
   * format](https://docs.aws.amazon.com/https://cloudinit.readthedocs.io/en/latest/topics/format.html#mime-multi-part-archive)
   * . For more information, see [Amazon EC2 user data in launch
   * templates](https://docs.aws.amazon.com/batch/latest/userguide/launch-templates.html) in the *AWS
   * Batch User Guide* .
   */
  public fun userData(userData: String) {
    cdkBuilder.userData(userData)
  }

  public fun build(): CfnLaunchTemplate.LaunchTemplateDataProperty {
    if(_blockDeviceMappings.isNotEmpty()) cdkBuilder.blockDeviceMappings(_blockDeviceMappings)
    if(_elasticGpuSpecifications.isNotEmpty())
        cdkBuilder.elasticGpuSpecifications(_elasticGpuSpecifications)
    if(_elasticInferenceAccelerators.isNotEmpty())
        cdkBuilder.elasticInferenceAccelerators(_elasticInferenceAccelerators)
    if(_licenseSpecifications.isNotEmpty()) cdkBuilder.licenseSpecifications(_licenseSpecifications)
    if(_networkInterfaces.isNotEmpty()) cdkBuilder.networkInterfaces(_networkInterfaces)
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    if(_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
    return cdkBuilder.build()
  }
}
