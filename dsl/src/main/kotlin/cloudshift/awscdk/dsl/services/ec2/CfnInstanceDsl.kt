@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnInstance
import software.constructs.Construct

/**
 * Specifies an EC2 instance.
 *
 * If an Elastic IP address is attached to your instance, AWS CloudFormation reattaches the Elastic
 * IP address after it updates the instance. For more information about updating stacks, see
 * [AWS CloudFormation Stacks Updates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
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
@CdkDslMarker
public class CfnInstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnInstance.Builder = CfnInstance.Builder.create(scope, id)

    private val _blockDeviceMappings: MutableList<Any> = mutableListOf()

    private val _elasticGpuSpecifications: MutableList<Any> = mutableListOf()

    private val _elasticInferenceAccelerators: MutableList<Any> = mutableListOf()

    private val _ipv6Addresses: MutableList<Any> = mutableListOf()

    private val _licenseSpecifications: MutableList<Any> = mutableListOf()

    private val _networkInterfaces: MutableList<Any> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _securityGroups: MutableList<String> = mutableListOf()

    private val _ssmAssociations: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _volumes: MutableList<Any> = mutableListOf()

    /**
     * This property is reserved for internal use.
     *
     * If you use it, the stack fails with this error: `Bad property set: [Testing this property]
     * (Service: AmazonEC2; Status Code: 400; Error Code: InvalidParameterCombination; Request ID:
     * 0XXXXXX-49c7-4b40-8bcc-76885dcXXXXX)` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-additionalinfo)
     *
     * @param additionalInfo This property is reserved for internal use.
     */
    public fun additionalInfo(additionalInfo: String) {
        cdkBuilder.additionalInfo(additionalInfo)
    }

    /**
     * Indicates whether the instance is associated with a dedicated host.
     *
     * If you want the instance to always restart on the same host on which it was launched, specify
     * `host` . If you want the instance to restart on any available host, but try to launch onto
     * the last host it ran on (on a best-effort basis), specify `default` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-affinity)
     *
     * @param affinity Indicates whether the instance is associated with a dedicated host.
     */
    public fun affinity(affinity: String) {
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
     *
     * @param availabilityZone The Availability Zone of the instance.
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * The block device mapping entries that defines the block devices to attach to the instance at
     * launch.
     *
     * By default, the block devices specified in the block device mapping for the AMI are used. You
     * can override the AMI block device mapping using the instance block device mapping. For the
     * root volume, you can override only the volume size, volume type, volume encryption settings,
     * and the `DeleteOnTermination` setting.
     *
     * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
     * the attached volumes without interrupting the instance. Modifying any other parameter results
     * in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-blockdevicemappings)
     *
     * @param blockDeviceMappings The block device mapping entries that defines the block devices to
     *   attach to the instance at launch.
     */
    public fun blockDeviceMappings(vararg blockDeviceMappings: Any) {
        _blockDeviceMappings.addAll(listOf(*blockDeviceMappings))
    }

    /**
     * The block device mapping entries that defines the block devices to attach to the instance at
     * launch.
     *
     * By default, the block devices specified in the block device mapping for the AMI are used. You
     * can override the AMI block device mapping using the instance block device mapping. For the
     * root volume, you can override only the volume size, volume type, volume encryption settings,
     * and the `DeleteOnTermination` setting.
     *
     * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
     * the attached volumes without interrupting the instance. Modifying any other parameter results
     * in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-blockdevicemappings)
     *
     * @param blockDeviceMappings The block device mapping entries that defines the block devices to
     *   attach to the instance at launch.
     */
    public fun blockDeviceMappings(blockDeviceMappings: Collection<Any>) {
        _blockDeviceMappings.addAll(blockDeviceMappings)
    }

    /**
     * The block device mapping entries that defines the block devices to attach to the instance at
     * launch.
     *
     * By default, the block devices specified in the block device mapping for the AMI are used. You
     * can override the AMI block device mapping using the instance block device mapping. For the
     * root volume, you can override only the volume size, volume type, volume encryption settings,
     * and the `DeleteOnTermination` setting.
     *
     * After the instance is running, you can modify only the `DeleteOnTermination` parameter for
     * the attached volumes without interrupting the instance. Modifying any other parameter results
     * in instance
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-blockdevicemappings)
     *
     * @param blockDeviceMappings The block device mapping entries that defines the block devices to
     *   attach to the instance at launch.
     */
    public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    /**
     * The CPU options for the instance.
     *
     * For more information, see
     * [Optimize CPU options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html)
     * in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-cpuoptions)
     *
     * @param cpuOptions The CPU options for the instance.
     */
    public fun cpuOptions(cpuOptions: IResolvable) {
        cdkBuilder.cpuOptions(cpuOptions)
    }

    /**
     * The CPU options for the instance.
     *
     * For more information, see
     * [Optimize CPU options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html)
     * in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-cpuoptions)
     *
     * @param cpuOptions The CPU options for the instance.
     */
    public fun cpuOptions(cpuOptions: CfnInstance.CpuOptionsProperty) {
        cdkBuilder.cpuOptions(cpuOptions)
    }

    /**
     * The credit option for CPU usage of the burstable performance instance.
     *
     * Valid values are `standard` and `unlimited` . To change this attribute after launch, use
     * [ModifyInstanceCreditSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html)
     * . For more information, see
     * [Burstable performance instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `standard` (T2 instances) or `unlimited` (T3/T3a/T4g instances)
     *
     * For T3 instances with `host` tenancy, only `standard` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-creditspecification)
     *
     * @param creditSpecification The credit option for CPU usage of the burstable performance
     *   instance.
     */
    public fun creditSpecification(creditSpecification: IResolvable) {
        cdkBuilder.creditSpecification(creditSpecification)
    }

    /**
     * The credit option for CPU usage of the burstable performance instance.
     *
     * Valid values are `standard` and `unlimited` . To change this attribute after launch, use
     * [ModifyInstanceCreditSpecification](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceCreditSpecification.html)
     * . For more information, see
     * [Burstable performance instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `standard` (T2 instances) or `unlimited` (T3/T3a/T4g instances)
     *
     * For T3 instances with `host` tenancy, only `standard` is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-creditspecification)
     *
     * @param creditSpecification The credit option for CPU usage of the burstable performance
     *   instance.
     */
    public fun creditSpecification(creditSpecification: CfnInstance.CreditSpecificationProperty) {
        cdkBuilder.creditSpecification(creditSpecification)
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
     *
     * @param disableApiTermination If you set this parameter to `true` , you can't terminate the
     *   instance using the Amazon EC2 console, CLI, or API;.
     */
    public fun disableApiTermination(disableApiTermination: Boolean) {
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
     *
     * @param disableApiTermination If you set this parameter to `true` , you can't terminate the
     *   instance using the Amazon EC2 console, CLI, or API;.
     */
    public fun disableApiTermination(disableApiTermination: IResolvable) {
        cdkBuilder.disableApiTermination(disableApiTermination)
    }

    /**
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with
     * all instance types. Additional usage charges apply when using an EBS-optimized instance.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ebsoptimized)
     *
     * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O.
     */
    public fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /**
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with
     * all instance types. Additional usage charges apply when using an EBS-optimized instance.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ebsoptimized)
     *
     * @param ebsOptimized Indicates whether the instance is optimized for Amazon EBS I/O.
     */
    public fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /**
     * An elastic GPU to associate with the instance.
     *
     * An Elastic GPU is a GPU resource that you can attach to your Windows instance to accelerate
     * the graphics performance of your applications. For more information, see
     * [Amazon EC2 Elastic GPUs](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications)
     *
     * @param elasticGpuSpecifications An elastic GPU to associate with the instance.
     */
    public fun elasticGpuSpecifications(vararg elasticGpuSpecifications: Any) {
        _elasticGpuSpecifications.addAll(listOf(*elasticGpuSpecifications))
    }

    /**
     * An elastic GPU to associate with the instance.
     *
     * An Elastic GPU is a GPU resource that you can attach to your Windows instance to accelerate
     * the graphics performance of your applications. For more information, see
     * [Amazon EC2 Elastic GPUs](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications)
     *
     * @param elasticGpuSpecifications An elastic GPU to associate with the instance.
     */
    public fun elasticGpuSpecifications(elasticGpuSpecifications: Collection<Any>) {
        _elasticGpuSpecifications.addAll(elasticGpuSpecifications)
    }

    /**
     * An elastic GPU to associate with the instance.
     *
     * An Elastic GPU is a GPU resource that you can attach to your Windows instance to accelerate
     * the graphics performance of your applications. For more information, see
     * [Amazon EC2 Elastic GPUs](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications)
     *
     * @param elasticGpuSpecifications An elastic GPU to associate with the instance.
     */
    public fun elasticGpuSpecifications(elasticGpuSpecifications: IResolvable) {
        cdkBuilder.elasticGpuSpecifications(elasticGpuSpecifications)
    }

    /**
     * An elastic inference accelerator to associate with the instance.
     *
     * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances to
     * accelerate your Deep Learning (DL) inference workloads.
     *
     * You cannot specify accelerators from different generations in the same request.
     *
     * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI),
     * and will help current customers migrate their workloads to options that offer better price
     * and performance. After April 15, 2023, new customers will not be able to launch instances
     * with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However,
     * customers who have used Amazon EI at least once during the past 30-day period are considered
     * current customers and will be able to continue using the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticinferenceaccelerators)
     *
     * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
     *   instance.
     */
    public fun elasticInferenceAccelerators(vararg elasticInferenceAccelerators: Any) {
        _elasticInferenceAccelerators.addAll(listOf(*elasticInferenceAccelerators))
    }

    /**
     * An elastic inference accelerator to associate with the instance.
     *
     * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances to
     * accelerate your Deep Learning (DL) inference workloads.
     *
     * You cannot specify accelerators from different generations in the same request.
     *
     * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI),
     * and will help current customers migrate their workloads to options that offer better price
     * and performance. After April 15, 2023, new customers will not be able to launch instances
     * with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However,
     * customers who have used Amazon EI at least once during the past 30-day period are considered
     * current customers and will be able to continue using the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticinferenceaccelerators)
     *
     * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
     *   instance.
     */
    public fun elasticInferenceAccelerators(elasticInferenceAccelerators: Collection<Any>) {
        _elasticInferenceAccelerators.addAll(elasticInferenceAccelerators)
    }

    /**
     * An elastic inference accelerator to associate with the instance.
     *
     * Elastic inference accelerators are a resource you can attach to your Amazon EC2 instances to
     * accelerate your Deep Learning (DL) inference workloads.
     *
     * You cannot specify accelerators from different generations in the same request.
     *
     * Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI),
     * and will help current customers migrate their workloads to options that offer better price
     * and performance. After April 15, 2023, new customers will not be able to launch instances
     * with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However,
     * customers who have used Amazon EI at least once during the past 30-day period are considered
     * current customers and will be able to continue using the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-elasticinferenceaccelerators)
     *
     * @param elasticInferenceAccelerators An elastic inference accelerator to associate with the
     *   instance.
     */
    public fun elasticInferenceAccelerators(elasticInferenceAccelerators: IResolvable) {
        cdkBuilder.elasticInferenceAccelerators(elasticInferenceAccelerators)
    }

    /**
     * Indicates whether the instance is enabled for AWS Nitro Enclaves.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-enclaveoptions)
     *
     * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves.
     */
    public fun enclaveOptions(enclaveOptions: IResolvable) {
        cdkBuilder.enclaveOptions(enclaveOptions)
    }

    /**
     * Indicates whether the instance is enabled for AWS Nitro Enclaves.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-enclaveoptions)
     *
     * @param enclaveOptions Indicates whether the instance is enabled for AWS Nitro Enclaves.
     */
    public fun enclaveOptions(enclaveOptions: CfnInstance.EnclaveOptionsProperty) {
        cdkBuilder.enclaveOptions(enclaveOptions)
    }

    /**
     * Indicates whether an instance is enabled for hibernation.
     *
     * This parameter is valid only if the instance meets the
     * [hibernation prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
     * . For more information, see
     * [Hibernate your instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html)
     * in the *Amazon EC2 User Guide* .
     *
     * You can't enable hibernation and AWS Nitro Enclaves on the same instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hibernationoptions)
     *
     * @param hibernationOptions Indicates whether an instance is enabled for hibernation.
     */
    public fun hibernationOptions(hibernationOptions: IResolvable) {
        cdkBuilder.hibernationOptions(hibernationOptions)
    }

    /**
     * Indicates whether an instance is enabled for hibernation.
     *
     * This parameter is valid only if the instance meets the
     * [hibernation prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/hibernating-prerequisites.html)
     * . For more information, see
     * [Hibernate your instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html)
     * in the *Amazon EC2 User Guide* .
     *
     * You can't enable hibernation and AWS Nitro Enclaves on the same instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hibernationoptions)
     *
     * @param hibernationOptions Indicates whether an instance is enabled for hibernation.
     */
    public fun hibernationOptions(hibernationOptions: CfnInstance.HibernationOptionsProperty) {
        cdkBuilder.hibernationOptions(hibernationOptions)
    }

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
     *
     * @param hostId If you specify host for the `Affinity` property, the ID of a dedicated host
     *   that the instance is associated with.
     */
    public fun hostId(hostId: String) {
        cdkBuilder.hostId(hostId)
    }

    /**
     * The ARN of the host resource group in which to launch the instances.
     *
     * If you specify a host resource group ARN, omit the *Tenancy* parameter or set it to `host` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-hostresourcegrouparn)
     *
     * @param hostResourceGroupArn The ARN of the host resource group in which to launch the
     *   instances.
     */
    public fun hostResourceGroupArn(hostResourceGroupArn: String) {
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
     *
     * @param iamInstanceProfile The name of an IAM instance profile.
     */
    public fun iamInstanceProfile(iamInstanceProfile: String) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile)
    }

    /**
     * The ID of the AMI.
     *
     * An AMI ID is required to launch an instance and must be specified here or in a launch
     * template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-imageid)
     *
     * @param imageId The ID of the AMI.
     */
    public fun imageId(imageId: String) {
        cdkBuilder.imageId(imageId)
    }

    /**
     * Indicates whether an instance stops or terminates when you initiate shutdown from the
     * instance (using the operating system command for system shutdown).
     *
     * Default: `stop`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-instanceinitiatedshutdownbehavior)
     *
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates
     *   when you initiate shutdown from the instance (using the operating system command for system
     *   shutdown).
     */
    public fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: String) {
        cdkBuilder.instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior)
    }

    /**
     * The instance type. For more information, see
     * [Instance types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) in
     * the *Amazon EC2 User Guide* .
     *
     * When you change your EBS-backed instance type, instance restart or replacement behavior
     * depends on the instance type compatibility between the old and new types. An instance that's
     * backed by an instance store volume is always replaced. For more information, see
     * [Change the instance type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `m1.small`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-instancetype)
     *
     * @param instanceType The instance type. For more information, see
     *   [Instance types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html)
     *   in the *Amazon EC2 User Guide* .
     */
    public fun instanceType(instanceType: String) {
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
     *
     * @param ipv6AddressCount The number of IPv6 addresses to associate with the primary network
     *   interface.
     */
    public fun ipv6AddressCount(ipv6AddressCount: Number) {
        cdkBuilder.ipv6AddressCount(ipv6AddressCount)
    }

    /**
     * The IPv6 addresses from the range of the subnet to associate with the primary network
     * interface.
     *
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of
     * instances to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ipv6addresses)
     *
     * @param ipv6Addresses The IPv6 addresses from the range of the subnet to associate with the
     *   primary network interface.
     */
    public fun ipv6Addresses(vararg ipv6Addresses: Any) {
        _ipv6Addresses.addAll(listOf(*ipv6Addresses))
    }

    /**
     * The IPv6 addresses from the range of the subnet to associate with the primary network
     * interface.
     *
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of
     * instances to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ipv6addresses)
     *
     * @param ipv6Addresses The IPv6 addresses from the range of the subnet to associate with the
     *   primary network interface.
     */
    public fun ipv6Addresses(ipv6Addresses: Collection<Any>) {
        _ipv6Addresses.addAll(ipv6Addresses)
    }

    /**
     * The IPv6 addresses from the range of the subnet to associate with the primary network
     * interface.
     *
     * You cannot specify this option and the option to assign a number of IPv6 addresses in the
     * same request. You cannot specify this option if you've specified a minimum number of
     * instances to launch.
     *
     * You cannot specify this option and the network interfaces option in the same request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ipv6addresses)
     *
     * @param ipv6Addresses The IPv6 addresses from the range of the subnet to associate with the
     *   primary network interface.
     */
    public fun ipv6Addresses(ipv6Addresses: IResolvable) {
        cdkBuilder.ipv6Addresses(ipv6Addresses)
    }

    /**
     * The ID of the kernel.
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [PV-GRUB](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in
     * the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-kernelid)
     *
     * @param kernelId The ID of the kernel.
     */
    public fun kernelId(kernelId: String) {
        cdkBuilder.kernelId(kernelId)
    }

    /**
     * The name of the key pair. You can create a key pair using
     * [CreateKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html)
     * or
     * [ImportKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html)
     * .
     *
     * If you do not specify a key pair, you can't connect to the instance unless you choose an AMI
     * that is configured to allow users another way to log in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-keyname)
     *
     * @param keyName The name of the key pair. You can create a key pair using
     *   [CreateKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateKeyPair.html)
     *   or
     *   [ImportKeyPair](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportKeyPair.html)
     *   .
     */
    public fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
    }

    /**
     * The launch template to use to launch the instances.
     *
     * Any parameters that you specify in the AWS CloudFormation template override the same
     * parameters in the launch template. You can specify either the name or ID of a launch
     * template, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-launchtemplate)
     *
     * @param launchTemplate The launch template to use to launch the instances.
     */
    public fun launchTemplate(launchTemplate: IResolvable) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    /**
     * The launch template to use to launch the instances.
     *
     * Any parameters that you specify in the AWS CloudFormation template override the same
     * parameters in the launch template. You can specify either the name or ID of a launch
     * template, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-launchtemplate)
     *
     * @param launchTemplate The launch template to use to launch the instances.
     */
    public fun launchTemplate(launchTemplate: CfnInstance.LaunchTemplateSpecificationProperty) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    /**
     * The license configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-licensespecifications)
     *
     * @param licenseSpecifications The license configurations.
     */
    public fun licenseSpecifications(vararg licenseSpecifications: Any) {
        _licenseSpecifications.addAll(listOf(*licenseSpecifications))
    }

    /**
     * The license configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-licensespecifications)
     *
     * @param licenseSpecifications The license configurations.
     */
    public fun licenseSpecifications(licenseSpecifications: Collection<Any>) {
        _licenseSpecifications.addAll(licenseSpecifications)
    }

    /**
     * The license configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-licensespecifications)
     *
     * @param licenseSpecifications The license configurations.
     */
    public fun licenseSpecifications(licenseSpecifications: IResolvable) {
        cdkBuilder.licenseSpecifications(licenseSpecifications)
    }

    /**
     * Specifies whether detailed monitoring is enabled for the instance.
     *
     * Specify `true` to enable detailed monitoring. Otherwise, basic monitoring is enabled. For
     * more information about detailed monitoring, see
     * [Enable or turn off detailed monitoring for your instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-monitoring)
     *
     * @param monitoring Specifies whether detailed monitoring is enabled for the instance.
     */
    public fun monitoring(monitoring: Boolean) {
        cdkBuilder.monitoring(monitoring)
    }

    /**
     * Specifies whether detailed monitoring is enabled for the instance.
     *
     * Specify `true` to enable detailed monitoring. Otherwise, basic monitoring is enabled. For
     * more information about detailed monitoring, see
     * [Enable or turn off detailed monitoring for your instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html)
     * in the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-monitoring)
     *
     * @param monitoring Specifies whether detailed monitoring is enabled for the instance.
     */
    public fun monitoring(monitoring: IResolvable) {
        cdkBuilder.monitoring(monitoring)
    }

    /**
     * The network interfaces to associate with the instance.
     *
     * If you use this property to point to a network interface, you must terminate the original
     * interface before attaching a new one to allow the update of the instance to succeed.
     *
     * If this resource has a public IP address and is also in a VPC that is defined in the same
     * template, you must use the
     * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the VPC-gateway attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-networkinterfaces)
     *
     * @param networkInterfaces The network interfaces to associate with the instance.
     */
    public fun networkInterfaces(vararg networkInterfaces: Any) {
        _networkInterfaces.addAll(listOf(*networkInterfaces))
    }

    /**
     * The network interfaces to associate with the instance.
     *
     * If you use this property to point to a network interface, you must terminate the original
     * interface before attaching a new one to allow the update of the instance to succeed.
     *
     * If this resource has a public IP address and is also in a VPC that is defined in the same
     * template, you must use the
     * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the VPC-gateway attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-networkinterfaces)
     *
     * @param networkInterfaces The network interfaces to associate with the instance.
     */
    public fun networkInterfaces(networkInterfaces: Collection<Any>) {
        _networkInterfaces.addAll(networkInterfaces)
    }

    /**
     * The network interfaces to associate with the instance.
     *
     * If you use this property to point to a network interface, you must terminate the original
     * interface before attaching a new one to allow the update of the instance to succeed.
     *
     * If this resource has a public IP address and is also in a VPC that is defined in the same
     * template, you must use the
     * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the VPC-gateway attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-networkinterfaces)
     *
     * @param networkInterfaces The network interfaces to associate with the instance.
     */
    public fun networkInterfaces(networkInterfaces: IResolvable) {
        cdkBuilder.networkInterfaces(networkInterfaces)
    }

    /**
     * The name of an existing placement group that you want to launch the instance into (cluster |
     * partition | spread).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-placementgroupname)
     *
     * @param placementGroupName The name of an existing placement group that you want to launch the
     *   instance into (cluster | partition | spread).
     */
    public fun placementGroupName(placementGroupName: String) {
        cdkBuilder.placementGroupName(placementGroupName)
    }

    /**
     * The options for the instance hostname.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-privatednsnameoptions)
     *
     * @param privateDnsNameOptions The options for the instance hostname.
     */
    public fun privateDnsNameOptions(privateDnsNameOptions: IResolvable) {
        cdkBuilder.privateDnsNameOptions(privateDnsNameOptions)
    }

    /**
     * The options for the instance hostname.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-privatednsnameoptions)
     *
     * @param privateDnsNameOptions The options for the instance hostname.
     */
    public fun privateDnsNameOptions(
        privateDnsNameOptions: CfnInstance.PrivateDnsNameOptionsProperty
    ) {
        cdkBuilder.privateDnsNameOptions(privateDnsNameOptions)
    }

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
     * IP address. During a replacement, AWS CloudFormation creates a new instance but doesn't
     * delete the old instance until the stack has successfully updated. If the stack update fails,
     * AWS CloudFormation uses the old instance to roll back the stack to the previous working
     * state. The old and new instances cannot have the same private IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-privateipaddress)
     *
     * @param privateIpAddress The primary IPv4 address. You must specify a value from the IPv4
     *   address range of the subnet.
     */
    public fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
    }

    /**
     * Indicates whether to assign the tags from the instance to all of the volumes attached to the
     * instance at launch.
     *
     * If you specify `true` and you assign tags to the instance, those tags are automatically
     * assigned to all of the volumes that you attach to the instance at launch. If you specify
     * `false` , those tags are not assigned to the attached volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     *
     * @param propagateTagsToVolumeOnCreation Indicates whether to assign the tags from the instance
     *   to all of the volumes attached to the instance at launch.
     */
    public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean) {
        cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation)
    }

    /**
     * Indicates whether to assign the tags from the instance to all of the volumes attached to the
     * instance at launch.
     *
     * If you specify `true` and you assign tags to the instance, those tags are automatically
     * assigned to all of the volumes that you attach to the instance at launch. If you specify
     * `false` , those tags are not assigned to the attached volumes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     *
     * @param propagateTagsToVolumeOnCreation Indicates whether to assign the tags from the instance
     *   to all of the volumes attached to the instance at launch.
     */
    public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: IResolvable) {
        cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation)
    }

    /**
     * The ID of the RAM disk to select.
     *
     * Some kernels require additional drivers at launch. Check the kernel requirements for
     * information about whether you need to specify a RAM disk. To find kernel requirements, go to
     * the AWS Resource Center and search for the kernel ID.
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [PV-GRUB](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html) in
     * the *Amazon EC2 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ramdiskid)
     *
     * @param ramdiskId The ID of the RAM disk to select.
     */
    public fun ramdiskId(ramdiskId: String) {
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
     *
     * @param securityGroupIds The IDs of the security groups.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
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
     *
     * @param securityGroupIds The IDs of the security groups.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
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
     *
     * @param securityGroups [Default VPC] The names of the security groups. For a nondefault VPC,
     *   you must use security group IDs instead.
     */
    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
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
     *
     * @param securityGroups [Default VPC] The names of the security groups. For a nondefault VPC,
     *   you must use security group IDs instead.
     */
    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
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
     *
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     *   instance is either the source or the destination of any traffic that it receives.
     */
    public fun sourceDestCheck(sourceDestCheck: Boolean) {
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
     *
     * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
     *   instance is either the source or the destination of any traffic that it receives.
     */
    public fun sourceDestCheck(sourceDestCheck: IResolvable) {
        cdkBuilder.sourceDestCheck(sourceDestCheck)
    }

    /**
     * The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more
     * information, see
     * [Create an IAM instance profile for Systems Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * You can currently associate only one document with an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ssmassociations)
     *
     * @param ssmAssociations The SSM
     *   [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     *   and parameter values in AWS Systems Manager to associate with this instance. To use this
     *   property, you must specify an IAM instance profile role for the instance. For more
     *   information, see
     *   [Create an IAM instance profile for Systems Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     *   in the *AWS Systems Manager User Guide* .
     */
    public fun ssmAssociations(vararg ssmAssociations: Any) {
        _ssmAssociations.addAll(listOf(*ssmAssociations))
    }

    /**
     * The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more
     * information, see
     * [Create an IAM instance profile for Systems Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * You can currently associate only one document with an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ssmassociations)
     *
     * @param ssmAssociations The SSM
     *   [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     *   and parameter values in AWS Systems Manager to associate with this instance. To use this
     *   property, you must specify an IAM instance profile role for the instance. For more
     *   information, see
     *   [Create an IAM instance profile for Systems Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     *   in the *AWS Systems Manager User Guide* .
     */
    public fun ssmAssociations(ssmAssociations: Collection<Any>) {
        _ssmAssociations.addAll(ssmAssociations)
    }

    /**
     * The SSM
     * [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     * and parameter values in AWS Systems Manager to associate with this instance. To use this
     * property, you must specify an IAM instance profile role for the instance. For more
     * information, see
     * [Create an IAM instance profile for Systems Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     * in the *AWS Systems Manager User Guide* .
     *
     * You can currently associate only one document with an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-ssmassociations)
     *
     * @param ssmAssociations The SSM
     *   [document](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-document.html)
     *   and parameter values in AWS Systems Manager to associate with this instance. To use this
     *   property, you must specify an IAM instance profile role for the instance. For more
     *   information, see
     *   [Create an IAM instance profile for Systems Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-configuring-access-role.html)
     *   in the *AWS Systems Manager User Guide* .
     */
    public fun ssmAssociations(ssmAssociations: IResolvable) {
        cdkBuilder.ssmAssociations(ssmAssociations)
    }

    /**
     * The ID of the subnet to launch the instance into.
     *
     * If you specify a network interface, you must specify any subnets as part of the network
     * interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-subnetid)
     *
     * @param subnetId The ID of the subnet to launch the instance into.
     */
    public fun subnetId(subnetId: String) {
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
     *
     * @param tags The tags to add to the instance.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to add to the instance.
     *
     * These tags are not applied to the EBS volumes, such as the root volume, unless
     * [PropagateTagsToVolumeOnCreation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-propagatetagstovolumeoncreation)
     * is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-tags)
     *
     * @param tags The tags to add to the instance.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The tenancy of the instance.
     *
     * An instance with a tenancy of `dedicated` runs on single-tenant hardware.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-tenancy)
     *
     * @param tenancy The tenancy of the instance.
     */
    public fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
    }

    /**
     * The user data script to make available to the instance.
     *
     * User data is limited to 16 KB. You must provide base64-encoded text. For more information,
     * see
     * [Fn::Base64](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-base64.html)
     * .
     *
     * User data runs only at instance launch. For more information, see
     * [Run commands on your Linux instance at launch](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html)
     * and
     * [Run commands on your Windows instance at launch](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-windows-user-data.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-userdata)
     *
     * @param userData The user data script to make available to the instance.
     */
    public fun userData(userData: String) {
        cdkBuilder.userData(userData)
    }

    /**
     * The volumes to attach to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-volumes)
     *
     * @param volumes The volumes to attach to the instance.
     */
    public fun volumes(vararg volumes: Any) {
        _volumes.addAll(listOf(*volumes))
    }

    /**
     * The volumes to attach to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-volumes)
     *
     * @param volumes The volumes to attach to the instance.
     */
    public fun volumes(volumes: Collection<Any>) {
        _volumes.addAll(volumes)
    }

    /**
     * The volumes to attach to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-instance.html#cfn-ec2-instance-volumes)
     *
     * @param volumes The volumes to attach to the instance.
     */
    public fun volumes(volumes: IResolvable) {
        cdkBuilder.volumes(volumes)
    }

    public fun build(): CfnInstance {
        if (_blockDeviceMappings.isNotEmpty()) cdkBuilder.blockDeviceMappings(_blockDeviceMappings)
        if (_elasticGpuSpecifications.isNotEmpty())
            cdkBuilder.elasticGpuSpecifications(_elasticGpuSpecifications)
        if (_elasticInferenceAccelerators.isNotEmpty())
            cdkBuilder.elasticInferenceAccelerators(_elasticInferenceAccelerators)
        if (_ipv6Addresses.isNotEmpty()) cdkBuilder.ipv6Addresses(_ipv6Addresses)
        if (_licenseSpecifications.isNotEmpty())
            cdkBuilder.licenseSpecifications(_licenseSpecifications)
        if (_networkInterfaces.isNotEmpty()) cdkBuilder.networkInterfaces(_networkInterfaces)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_ssmAssociations.isNotEmpty()) cdkBuilder.ssmAssociations(_ssmAssociations)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
        return cdkBuilder.build()
    }
}
