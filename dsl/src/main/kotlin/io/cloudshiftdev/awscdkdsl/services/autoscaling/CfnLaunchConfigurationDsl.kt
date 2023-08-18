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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration
import software.constructs.Construct

/**
 * The `AWS::AutoScaling::LaunchConfiguration` resource specifies the launch configuration that can
 * be used by an Auto Scaling group to configure Amazon EC2 instances.
 *
 * When you update the launch configuration for an Auto Scaling group, CloudFormation deletes that
 * resource and creates a new launch configuration with the updated properties and a new name.
 * Existing instances are not affected. To update existing instances when you update the
 * `AWS::AutoScaling::LaunchConfiguration` resource, you can specify an
 * [UpdatePolicy attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html)
 * for the group. You can find sample update policies for rolling updates in
 * [Auto scaling template snippets](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-autoscaling.html)
 * .
 *
 * Amazon EC2 Auto Scaling configures instances launched as part of an Auto Scaling group using
 * either a
 * [launch template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
 * or a launch configuration. We strongly recommend that you do not use launch configurations. They
 * do not provide full functionality for Amazon EC2 Auto Scaling or Amazon EC2. For more
 * information, see
 * [Launch configurations](https://docs.aws.amazon.com/autoscaling/ec2/userguide/launch-configurations.html)
 * and
 * [Migrate AWS CloudFormation stacks from launch configurations to launch templates](https://docs.aws.amazon.com/autoscaling/ec2/userguide/migrate-launch-configurations-with-cloudformation.html)
 * in the *Amazon EC2 Auto Scaling User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * CfnLaunchConfiguration cfnLaunchConfiguration = CfnLaunchConfiguration.Builder.create(this,
 * "MyCfnLaunchConfiguration")
 * .imageId("imageId")
 * .instanceType("instanceType")
 * // the properties below are optional
 * .associatePublicIpAddress(false)
 * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
 * .deviceName("deviceName")
 * // the properties below are optional
 * .ebs(BlockDeviceProperty.builder()
 * .deleteOnTermination(false)
 * .encrypted(false)
 * .iops(123)
 * .snapshotId("snapshotId")
 * .throughput(123)
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build())
 * .noDevice(false)
 * .virtualName("virtualName")
 * .build()))
 * .classicLinkVpcId("classicLinkVpcId")
 * .classicLinkVpcSecurityGroups(List.of("classicLinkVpcSecurityGroups"))
 * .ebsOptimized(false)
 * .iamInstanceProfile("iamInstanceProfile")
 * .instanceId("instanceId")
 * .instanceMonitoring(false)
 * .kernelId("kernelId")
 * .keyName("keyName")
 * .launchConfigurationName("launchConfigurationName")
 * .metadataOptions(MetadataOptionsProperty.builder()
 * .httpEndpoint("httpEndpoint")
 * .httpPutResponseHopLimit(123)
 * .httpTokens("httpTokens")
 * .build())
 * .placementTenancy("placementTenancy")
 * .ramDiskId("ramDiskId")
 * .securityGroups(List.of("securityGroups"))
 * .spotPrice("spotPrice")
 * .userData("userData")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html)
 */
@CdkDslMarker
public class CfnLaunchConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLaunchConfiguration.Builder =
        CfnLaunchConfiguration.Builder.create(scope, id)

    private val _blockDeviceMappings: MutableList<Any> = mutableListOf()

    private val _classicLinkVpcSecurityGroups: MutableList<String> = mutableListOf()

    private val _securityGroups: MutableList<String> = mutableListOf()

    /**
     * Specifies whether to assign a public IPv4 address to the group's instances.
     *
     * If the instance is launched into a default subnet, the default is to assign a public IPv4
     * address, unless you disabled the option to assign a public IPv4 address on the subnet. If the
     * instance is launched into a nondefault subnet, the default is not to assign a public IPv4
     * address, unless you enabled the option to assign a public IPv4 address on the subnet.
     *
     * If you specify `true` , each instance in the Auto Scaling group receives a unique public IPv4
     * address. For more information, see
     * [Launching Auto Scaling instances in a VPC](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you specify this property, you must specify at least one subnet for `VPCZoneIdentifier`
     * when you create your group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-associatepublicipaddress)
     *
     * @param associatePublicIpAddress Specifies whether to assign a public IPv4 address to the
     *   group's instances.
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    /**
     * Specifies whether to assign a public IPv4 address to the group's instances.
     *
     * If the instance is launched into a default subnet, the default is to assign a public IPv4
     * address, unless you disabled the option to assign a public IPv4 address on the subnet. If the
     * instance is launched into a nondefault subnet, the default is not to assign a public IPv4
     * address, unless you enabled the option to assign a public IPv4 address on the subnet.
     *
     * If you specify `true` , each instance in the Auto Scaling group receives a unique public IPv4
     * address. For more information, see
     * [Launching Auto Scaling instances in a VPC](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you specify this property, you must specify at least one subnet for `VPCZoneIdentifier`
     * when you create your group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-associatepublicipaddress)
     *
     * @param associatePublicIpAddress Specifies whether to assign a public IPv4 address to the
     *   group's instances.
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    /**
     * The block device mapping entries that define the block devices to attach to the instances at
     * launch.
     *
     * By default, the block devices specified in the block device mapping for the AMI are used. For
     * more information, see
     * [Block device mappings](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-blockdevicemappings)
     *
     * @param blockDeviceMappings The block device mapping entries that define the block devices to
     *   attach to the instances at launch.
     */
    public fun blockDeviceMappings(vararg blockDeviceMappings: Any) {
        _blockDeviceMappings.addAll(listOf(*blockDeviceMappings))
    }

    /**
     * The block device mapping entries that define the block devices to attach to the instances at
     * launch.
     *
     * By default, the block devices specified in the block device mapping for the AMI are used. For
     * more information, see
     * [Block device mappings](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-blockdevicemappings)
     *
     * @param blockDeviceMappings The block device mapping entries that define the block devices to
     *   attach to the instances at launch.
     */
    public fun blockDeviceMappings(blockDeviceMappings: Collection<Any>) {
        _blockDeviceMappings.addAll(blockDeviceMappings)
    }

    /**
     * The block device mapping entries that define the block devices to attach to the instances at
     * launch.
     *
     * By default, the block devices specified in the block device mapping for the AMI are used. For
     * more information, see
     * [Block device mappings](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-blockdevicemappings)
     *
     * @param blockDeviceMappings The block device mapping entries that define the block devices to
     *   attach to the instances at launch.
     */
    public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    /**
     * Available for backward compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-classiclinkvpcid)
     *
     * @param classicLinkVpcId Available for backward compatibility.
     */
    public fun classicLinkVpcId(classicLinkVpcId: String) {
        cdkBuilder.classicLinkVpcId(classicLinkVpcId)
    }

    /**
     * Available for backward compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-classiclinkvpcsecuritygroups)
     *
     * @param classicLinkVpcSecurityGroups Available for backward compatibility.
     */
    public fun classicLinkVpcSecurityGroups(vararg classicLinkVpcSecurityGroups: String) {
        _classicLinkVpcSecurityGroups.addAll(listOf(*classicLinkVpcSecurityGroups))
    }

    /**
     * Available for backward compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-classiclinkvpcsecuritygroups)
     *
     * @param classicLinkVpcSecurityGroups Available for backward compatibility.
     */
    public fun classicLinkVpcSecurityGroups(classicLinkVpcSecurityGroups: Collection<String>) {
        _classicLinkVpcSecurityGroups.addAll(classicLinkVpcSecurityGroups)
    }

    /**
     * Specifies whether the launch configuration is optimized for EBS I/O ( `true` ) or not (
     * `false` ).
     *
     * The optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization is not available with all
     * instance types. Additional fees are incurred when you enable EBS optimization for an instance
     * type that is not EBS-optimized by default. For more information, see
     * [Amazon EBS-optimized instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-ebsoptimized)
     *
     * @param ebsOptimized Specifies whether the launch configuration is optimized for EBS I/O (
     *   `true` ) or not ( `false` ).
     */
    public fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /**
     * Specifies whether the launch configuration is optimized for EBS I/O ( `true` ) or not (
     * `false` ).
     *
     * The optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization is not available with all
     * instance types. Additional fees are incurred when you enable EBS optimization for an instance
     * type that is not EBS-optimized by default. For more information, see
     * [Amazon EBS-optimized instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-ebsoptimized)
     *
     * @param ebsOptimized Specifies whether the launch configuration is optimized for EBS I/O (
     *   `true` ) or not ( `false` ).
     */
    public fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /**
     * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM
     * role for the instance.
     *
     * The instance profile contains the IAM role. For more information, see
     * [IAM role for applications that run on Amazon EC2 instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/us-iam-role.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-iaminstanceprofile)
     *
     * @param iamInstanceProfile The name or the Amazon Resource Name (ARN) of the instance profile
     *   associated with the IAM role for the instance.
     */
    public fun iamInstanceProfile(iamInstanceProfile: String) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile)
    }

    /**
     * The ID of the Amazon Machine Image (AMI) that was assigned during registration.
     *
     * For more information, see
     * [Finding a Linux AMI](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * If you specify `InstanceId` , an `ImageId` is not required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-imageid)
     *
     * @param imageId The ID of the Amazon Machine Image (AMI) that was assigned during
     *   registration.
     */
    public fun imageId(imageId: String) {
        cdkBuilder.imageId(imageId)
    }

    /**
     * The ID of the Amazon EC2 instance to use to create the launch configuration.
     *
     * When you use an instance to create a launch configuration, all properties are derived from
     * the instance with the exception of `BlockDeviceMapping` and `AssociatePublicIpAddress` . You
     * can override any properties from the instance by specifying them in the launch configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-instanceid)
     *
     * @param instanceId The ID of the Amazon EC2 instance to use to create the launch
     *   configuration.
     */
    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    /**
     * Controls whether instances in this group are launched with detailed ( `true` ) or basic (
     * `false` ) monitoring.
     *
     * The default value is `true` (enabled).
     *
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and
     * your account is charged a fee. When you disable detailed monitoring, CloudWatch generates
     * metrics every 5 minutes. For more information, see
     * [Configure Monitoring for Auto Scaling Instances](https://docs.aws.amazon.com/autoscaling/latest/userguide/enable-as-instance-metrics.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-instancemonitoring)
     *
     * @param instanceMonitoring Controls whether instances in this group are launched with detailed
     *   ( `true` ) or basic ( `false` ) monitoring.
     */
    public fun instanceMonitoring(instanceMonitoring: Boolean) {
        cdkBuilder.instanceMonitoring(instanceMonitoring)
    }

    /**
     * Controls whether instances in this group are launched with detailed ( `true` ) or basic (
     * `false` ) monitoring.
     *
     * The default value is `true` (enabled).
     *
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and
     * your account is charged a fee. When you disable detailed monitoring, CloudWatch generates
     * metrics every 5 minutes. For more information, see
     * [Configure Monitoring for Auto Scaling Instances](https://docs.aws.amazon.com/autoscaling/latest/userguide/enable-as-instance-metrics.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-instancemonitoring)
     *
     * @param instanceMonitoring Controls whether instances in this group are launched with detailed
     *   ( `true` ) or basic ( `false` ) monitoring.
     */
    public fun instanceMonitoring(instanceMonitoring: IResolvable) {
        cdkBuilder.instanceMonitoring(instanceMonitoring)
    }

    /**
     * Specifies the instance type of the EC2 instance.
     *
     * For information about available instance types, see
     * [Available instance types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * If you specify `InstanceId` , an `InstanceType` is not required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-instancetype)
     *
     * @param instanceType Specifies the instance type of the EC2 instance.
     */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * The ID of the kernel associated with the AMI.
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [User provided kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-kernelid)
     *
     * @param kernelId The ID of the kernel associated with the AMI.
     */
    public fun kernelId(kernelId: String) {
        cdkBuilder.kernelId(kernelId)
    }

    /**
     * The name of the key pair.
     *
     * For more information, see
     * [Amazon EC2 key pairs and Linux instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-keyname)
     *
     * @param keyName The name of the key pair.
     */
    public fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
    }

    /**
     * The name of the launch configuration.
     *
     * This name must be unique per Region per account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-launchconfigurationname)
     *
     * @param launchConfigurationName The name of the launch configuration.
     */
    public fun launchConfigurationName(launchConfigurationName: String) {
        cdkBuilder.launchConfigurationName(launchConfigurationName)
    }

    /**
     * The metadata options for the instances.
     *
     * For more information, see
     * [Configuring the Instance Metadata Options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-metadataoptions)
     *
     * @param metadataOptions The metadata options for the instances.
     */
    public fun metadataOptions(metadataOptions: IResolvable) {
        cdkBuilder.metadataOptions(metadataOptions)
    }

    /**
     * The metadata options for the instances.
     *
     * For more information, see
     * [Configuring the Instance Metadata Options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-metadataoptions)
     *
     * @param metadataOptions The metadata options for the instances.
     */
    public fun metadataOptions(metadataOptions: CfnLaunchConfiguration.MetadataOptionsProperty) {
        cdkBuilder.metadataOptions(metadataOptions)
    }

    /**
     * The tenancy of the instance, either `default` or `dedicated` .
     *
     * An instance with `dedicated` tenancy runs on isolated, single-tenant hardware and can only be
     * launched into a VPC. To launch dedicated instances into a shared tenancy VPC (a VPC with the
     * instance placement tenancy attribute set to `default` ), you must set the value of this
     * property to `dedicated` . For more information, see
     * [Configuring instance tenancy with Amazon EC2 Auto Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/auto-scaling-dedicated-instances.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you specify `PlacementTenancy` , you must specify at least one subnet for
     * `VPCZoneIdentifier` when you create your group.
     *
     * Valid values: `default` | `dedicated`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-placementtenancy)
     *
     * @param placementTenancy The tenancy of the instance, either `default` or `dedicated` .
     */
    public fun placementTenancy(placementTenancy: String) {
        cdkBuilder.placementTenancy(placementTenancy)
    }

    /**
     * The ID of the RAM disk to select.
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [User provided kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-ramdiskid)
     *
     * @param ramDiskId The ID of the RAM disk to select.
     */
    public fun ramDiskId(ramDiskId: String) {
        cdkBuilder.ramDiskId(ramDiskId)
    }

    /**
     * A list that contains the security groups to assign to the instances in the Auto Scaling
     * group.
     *
     * The list can contain both the IDs of existing security groups and references to
     * [SecurityGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
     * resources created in the template.
     *
     * For more information, see
     * [Control traffic to resources using security groups](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-securitygroups)
     *
     * @param securityGroups A list that contains the security groups to assign to the instances in
     *   the Auto Scaling group.
     */
    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * A list that contains the security groups to assign to the instances in the Auto Scaling
     * group.
     *
     * The list can contain both the IDs of existing security groups and references to
     * [SecurityGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
     * resources created in the template.
     *
     * For more information, see
     * [Control traffic to resources using security groups](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-securitygroups)
     *
     * @param securityGroups A list that contains the security groups to assign to the instances in
     *   the Auto Scaling group.
     */
    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request.
     *
     * Spot Instances are launched when the price you specify exceeds the current Spot price. For
     * more information, see
     * [Request Spot Instances for fault-tolerant and flexible applications](https://docs.aws.amazon.com/autoscaling/ec2/userguide/launch-template-spot-instances.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid Range: Minimum value of 0.001
     *
     * When you change your maximum price by creating a new launch configuration, running instances
     * will continue to run as long as the maximum price for those running instances is higher than
     * the current Spot price.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-spotprice)
     *
     * @param spotPrice The maximum hourly price to be paid for any Spot Instance launched to
     *   fulfill the request.
     */
    public fun spotPrice(spotPrice: String) {
        cdkBuilder.spotPrice(spotPrice)
    }

    /**
     * The Base64-encoded user data to make available to the launched EC2 instances.
     *
     * For more information, see
     * [Instance metadata and user data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-userdata)
     *
     * @param userData The Base64-encoded user data to make available to the launched EC2 instances.
     */
    public fun userData(userData: String) {
        cdkBuilder.userData(userData)
    }

    public fun build(): CfnLaunchConfiguration {
        if (_blockDeviceMappings.isNotEmpty()) cdkBuilder.blockDeviceMappings(_blockDeviceMappings)
        if (_classicLinkVpcSecurityGroups.isNotEmpty())
            cdkBuilder.classicLinkVpcSecurityGroups(_classicLinkVpcSecurityGroups)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
