@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLaunchConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * CfnLaunchConfigurationProps cfnLaunchConfigurationProps = CfnLaunchConfigurationProps.builder()
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
public interface CfnLaunchConfigurationProps {
  /**
   * Specifies whether to assign a public IPv4 address to the group's instances.
   *
   * If the instance is launched into a default subnet, the default is to assign a public IPv4
   * address, unless you disabled the option to assign a public IPv4 address on the subnet. If the
   * instance is launched into a nondefault subnet, the default is not to assign a public IPv4 address,
   * unless you enabled the option to assign a public IPv4 address on the subnet.
   *
   * If you specify `true` , each instance in the Auto Scaling group receives a unique public IPv4
   * address. For more information, see [Launching Auto Scaling instances in a
   * VPC](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html) in the *Amazon EC2
   * Auto Scaling User Guide* .
   *
   * If you specify this property, you must specify at least one subnet for `VPCZoneIdentifier` when
   * you create your group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-associatepublicipaddress)
   */
  public fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

  /**
   * The block device mapping entries that define the block devices to attach to the instances at
   * launch.
   *
   * By default, the block devices specified in the block device mapping for the AMI are used. For
   * more information, see [Block device
   * mappings](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
   * in the *Amazon EC2 User Guide for Linux Instances* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-blockdevicemappings)
   */
  public fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

  /**
   * Available for backward compatibility.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-classiclinkvpcid)
   */
  public fun classicLinkVpcId(): String? = unwrap(this).getClassicLinkVpcId()

  /**
   * Available for backward compatibility.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-classiclinkvpcsecuritygroups)
   */
  public fun classicLinkVpcSecurityGroups(): List<String> =
      unwrap(this).getClassicLinkVpcSecurityGroups() ?: emptyList()

  /**
   * Specifies whether the launch configuration is optimized for EBS I/O ( `true` ) or not ( `false`
   * ).
   *
   * The optimization provides dedicated throughput to Amazon EBS and an optimized configuration
   * stack to provide optimal I/O performance. This optimization is not available with all instance
   * types. Additional fees are incurred when you enable EBS optimization for an instance type that is
   * not EBS-optimized by default. For more information, see [Amazon EBS-optimized
   * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) in the *Amazon
   * EC2 User Guide for Linux Instances* .
   *
   * The default value is `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-ebsoptimized)
   */
  public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

  /**
   * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role
   * for the instance.
   *
   * The instance profile contains the IAM role. For more information, see [IAM role for
   * applications that run on Amazon EC2
   * instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/us-iam-role.html) in the *Amazon
   * EC2 Auto Scaling User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-iaminstanceprofile)
   */
  public fun iamInstanceProfile(): String? = unwrap(this).getIamInstanceProfile()

  /**
   * The ID of the Amazon Machine Image (AMI) that was assigned during registration.
   *
   * For more information, see [Finding a Linux
   * AMI](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html) in the *Amazon EC2
   * User Guide for Linux Instances* .
   *
   * If you specify `InstanceId` , an `ImageId` is not required.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-imageid)
   */
  public fun imageId(): String

  /**
   * The ID of the Amazon EC2 instance to use to create the launch configuration.
   *
   * When you use an instance to create a launch configuration, all properties are derived from the
   * instance with the exception of `BlockDeviceMapping` and `AssociatePublicIpAddress` . You can
   * override any properties from the instance by specifying them in the launch configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-instanceid)
   */
  public fun instanceId(): String? = unwrap(this).getInstanceId()

  /**
   * Controls whether instances in this group are launched with detailed ( `true` ) or basic (
   * `false` ) monitoring.
   *
   * The default value is `true` (enabled).
   *
   *
   * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and your
   * account is charged a fee. When you disable detailed monitoring, CloudWatch generates metrics every
   * 5 minutes. For more information, see [Configure Monitoring for Auto Scaling
   * Instances](https://docs.aws.amazon.com/autoscaling/latest/userguide/enable-as-instance-metrics.html)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-instancemonitoring)
   */
  public fun instanceMonitoring(): Any? = unwrap(this).getInstanceMonitoring()

  /**
   * Specifies the instance type of the EC2 instance.
   *
   * For information about available instance types, see [Available instance
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes)
   * in the *Amazon EC2 User Guide for Linux Instances* .
   *
   * If you specify `InstanceId` , an `InstanceType` is not required.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-instancetype)
   */
  public fun instanceType(): String

  /**
   * The ID of the kernel associated with the AMI.
   *
   *
   * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
   * [User provided
   * kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html) in the
   * *Amazon EC2 User Guide for Linux Instances* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-kernelid)
   */
  public fun kernelId(): String? = unwrap(this).getKernelId()

  /**
   * The name of the key pair.
   *
   * For more information, see [Amazon EC2 key pairs and Linux
   * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html) in the *Amazon
   * EC2 User Guide for Linux Instances* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-keyname)
   */
  public fun keyName(): String? = unwrap(this).getKeyName()

  /**
   * The name of the launch configuration.
   *
   * This name must be unique per Region per account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-launchconfigurationname)
   */
  public fun launchConfigurationName(): String? = unwrap(this).getLaunchConfigurationName()

  /**
   * The metadata options for the instances.
   *
   * For more information, see [Configuring the Instance Metadata
   * Options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-metadataoptions)
   */
  public fun metadataOptions(): Any? = unwrap(this).getMetadataOptions()

  /**
   * The tenancy of the instance, either `default` or `dedicated` .
   *
   * An instance with `dedicated` tenancy runs on isolated, single-tenant hardware and can only be
   * launched into a VPC. To launch dedicated instances into a shared tenancy VPC (a VPC with the
   * instance placement tenancy attribute set to `default` ), you must set the value of this property
   * to `dedicated` . For more information, see [Configuring instance tenancy with Amazon EC2 Auto
   * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/auto-scaling-dedicated-instances.html)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * If you specify `PlacementTenancy` , you must specify at least one subnet for
   * `VPCZoneIdentifier` when you create your group.
   *
   * Valid values: `default` | `dedicated`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-placementtenancy)
   */
  public fun placementTenancy(): String? = unwrap(this).getPlacementTenancy()

  /**
   * The ID of the RAM disk to select.
   *
   *
   * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
   * [User provided
   * kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html) in the
   * *Amazon EC2 User Guide for Linux Instances* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-ramdiskid)
   */
  public fun ramDiskId(): String? = unwrap(this).getRamDiskId()

  /**
   * A list that contains the security groups to assign to the instances in the Auto Scaling group.
   *
   * The list can contain both the IDs of existing security groups and references to
   * [SecurityGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
   * resources created in the template.
   *
   * For more information, see [Control traffic to resources using security
   * groups](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html) in the
   * *Amazon Virtual Private Cloud User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-securitygroups)
   */
  public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  /**
   * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request.
   *
   * Spot Instances are launched when the price you specify exceeds the current Spot price. For more
   * information, see [Request Spot Instances for fault-tolerant and flexible
   * applications](https://docs.aws.amazon.com/autoscaling/ec2/userguide/launch-template-spot-instances.html)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * Valid Range: Minimum value of 0.001
   *
   *
   * When you change your maximum price by creating a new launch configuration, running instances
   * will continue to run as long as the maximum price for those running instances is higher than the
   * current Spot price.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-spotprice)
   */
  public fun spotPrice(): String? = unwrap(this).getSpotPrice()

  /**
   * The Base64-encoded user data to make available to the launched EC2 instances.
   *
   * For more information, see [Instance metadata and user
   * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
   * *Amazon EC2 User Guide for Linux Instances* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-userdata)
   */
  public fun userData(): String? = unwrap(this).getUserData()

  /**
   * A builder for [CfnLaunchConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param associatePublicIpAddress Specifies whether to assign a public IPv4 address to the
     * group's instances.
     * If the instance is launched into a default subnet, the default is to assign a public IPv4
     * address, unless you disabled the option to assign a public IPv4 address on the subnet. If the
     * instance is launched into a nondefault subnet, the default is not to assign a public IPv4
     * address, unless you enabled the option to assign a public IPv4 address on the subnet.
     *
     * If you specify `true` , each instance in the Auto Scaling group receives a unique public IPv4
     * address. For more information, see [Launching Auto Scaling instances in a
     * VPC](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html) in the *Amazon EC2
     * Auto Scaling User Guide* .
     *
     * If you specify this property, you must specify at least one subnet for `VPCZoneIdentifier`
     * when you create your group.
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

    /**
     * @param associatePublicIpAddress Specifies whether to assign a public IPv4 address to the
     * group's instances.
     * If the instance is launched into a default subnet, the default is to assign a public IPv4
     * address, unless you disabled the option to assign a public IPv4 address on the subnet. If the
     * instance is launched into a nondefault subnet, the default is not to assign a public IPv4
     * address, unless you enabled the option to assign a public IPv4 address on the subnet.
     *
     * If you specify `true` , each instance in the Auto Scaling group receives a unique public IPv4
     * address. For more information, see [Launching Auto Scaling instances in a
     * VPC](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html) in the *Amazon EC2
     * Auto Scaling User Guide* .
     *
     * If you specify this property, you must specify at least one subnet for `VPCZoneIdentifier`
     * when you create your group.
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable)

    /**
     * @param blockDeviceMappings The block device mapping entries that define the block devices to
     * attach to the instances at launch.
     * By default, the block devices specified in the block device mapping for the AMI are used. For
     * more information, see [Block device
     * mappings](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     */
    public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

    /**
     * @param blockDeviceMappings The block device mapping entries that define the block devices to
     * attach to the instances at launch.
     * By default, the block devices specified in the block device mapping for the AMI are used. For
     * more information, see [Block device
     * mappings](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     */
    public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

    /**
     * @param blockDeviceMappings The block device mapping entries that define the block devices to
     * attach to the instances at launch.
     * By default, the block devices specified in the block device mapping for the AMI are used. For
     * more information, see [Block device
     * mappings](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     */
    public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

    /**
     * @param classicLinkVpcId Available for backward compatibility.
     */
    public fun classicLinkVpcId(classicLinkVpcId: String)

    /**
     * @param classicLinkVpcSecurityGroups Available for backward compatibility.
     */
    public fun classicLinkVpcSecurityGroups(classicLinkVpcSecurityGroups: List<String>)

    /**
     * @param classicLinkVpcSecurityGroups Available for backward compatibility.
     */
    public fun classicLinkVpcSecurityGroups(vararg classicLinkVpcSecurityGroups: String)

    /**
     * @param ebsOptimized Specifies whether the launch configuration is optimized for EBS I/O (
     * `true` ) or not ( `false` ).
     * The optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization is not available with all instance
     * types. Additional fees are incurred when you enable EBS optimization for an instance type that
     * is not EBS-optimized by default. For more information, see [Amazon EBS-optimized
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) in the *Amazon
     * EC2 User Guide for Linux Instances* .
     *
     * The default value is `false` .
     */
    public fun ebsOptimized(ebsOptimized: Boolean)

    /**
     * @param ebsOptimized Specifies whether the launch configuration is optimized for EBS I/O (
     * `true` ) or not ( `false` ).
     * The optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization is not available with all instance
     * types. Additional fees are incurred when you enable EBS optimization for an instance type that
     * is not EBS-optimized by default. For more information, see [Amazon EBS-optimized
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) in the *Amazon
     * EC2 User Guide for Linux Instances* .
     *
     * The default value is `false` .
     */
    public fun ebsOptimized(ebsOptimized: IResolvable)

    /**
     * @param iamInstanceProfile The name or the Amazon Resource Name (ARN) of the instance profile
     * associated with the IAM role for the instance.
     * The instance profile contains the IAM role. For more information, see [IAM role for
     * applications that run on Amazon EC2
     * instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/us-iam-role.html) in the
     * *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun iamInstanceProfile(iamInstanceProfile: String)

    /**
     * @param imageId The ID of the Amazon Machine Image (AMI) that was assigned during
     * registration. 
     * For more information, see [Finding a Linux
     * AMI](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html) in the *Amazon EC2
     * User Guide for Linux Instances* .
     *
     * If you specify `InstanceId` , an `ImageId` is not required.
     */
    public fun imageId(imageId: String)

    /**
     * @param instanceId The ID of the Amazon EC2 instance to use to create the launch
     * configuration.
     * When you use an instance to create a launch configuration, all properties are derived from
     * the instance with the exception of `BlockDeviceMapping` and `AssociatePublicIpAddress` . You can
     * override any properties from the instance by specifying them in the launch configuration.
     */
    public fun instanceId(instanceId: String)

    /**
     * @param instanceMonitoring Controls whether instances in this group are launched with detailed
     * ( `true` ) or basic ( `false` ) monitoring.
     * The default value is `true` (enabled).
     *
     *
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and
     * your account is charged a fee. When you disable detailed monitoring, CloudWatch generates
     * metrics every 5 minutes. For more information, see [Configure Monitoring for Auto Scaling
     * Instances](https://docs.aws.amazon.com/autoscaling/latest/userguide/enable-as-instance-metrics.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun instanceMonitoring(instanceMonitoring: Boolean)

    /**
     * @param instanceMonitoring Controls whether instances in this group are launched with detailed
     * ( `true` ) or basic ( `false` ) monitoring.
     * The default value is `true` (enabled).
     *
     *
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and
     * your account is charged a fee. When you disable detailed monitoring, CloudWatch generates
     * metrics every 5 minutes. For more information, see [Configure Monitoring for Auto Scaling
     * Instances](https://docs.aws.amazon.com/autoscaling/latest/userguide/enable-as-instance-metrics.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun instanceMonitoring(instanceMonitoring: IResolvable)

    /**
     * @param instanceType Specifies the instance type of the EC2 instance. 
     * For information about available instance types, see [Available instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * If you specify `InstanceId` , an `InstanceType` is not required.
     */
    public fun instanceType(instanceType: String)

    /**
     * @param kernelId The ID of the kernel associated with the AMI.
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [User provided
     * kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     */
    public fun kernelId(kernelId: String)

    /**
     * @param keyName The name of the key pair.
     * For more information, see [Amazon EC2 key pairs and Linux
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     */
    public fun keyName(keyName: String)

    /**
     * @param launchConfigurationName The name of the launch configuration.
     * This name must be unique per Region per account.
     */
    public fun launchConfigurationName(launchConfigurationName: String)

    /**
     * @param metadataOptions The metadata options for the instances.
     * For more information, see [Configuring the Instance Metadata
     * Options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun metadataOptions(metadataOptions: IResolvable)

    /**
     * @param metadataOptions The metadata options for the instances.
     * For more information, see [Configuring the Instance Metadata
     * Options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun metadataOptions(metadataOptions: CfnLaunchConfiguration.MetadataOptionsProperty)

    /**
     * @param metadataOptions The metadata options for the instances.
     * For more information, see [Configuring the Instance Metadata
     * Options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34b9df370b044535b0e084cf6b6fddaf0b677a1320ec03d6e35877db81fe5d67")
    public
        fun metadataOptions(metadataOptions: CfnLaunchConfiguration.MetadataOptionsProperty.Builder.() -> Unit)

    /**
     * @param placementTenancy The tenancy of the instance, either `default` or `dedicated` .
     * An instance with `dedicated` tenancy runs on isolated, single-tenant hardware and can only be
     * launched into a VPC. To launch dedicated instances into a shared tenancy VPC (a VPC with the
     * instance placement tenancy attribute set to `default` ), you must set the value of this property
     * to `dedicated` . For more information, see [Configuring instance tenancy with Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/auto-scaling-dedicated-instances.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you specify `PlacementTenancy` , you must specify at least one subnet for
     * `VPCZoneIdentifier` when you create your group.
     *
     * Valid values: `default` | `dedicated`
     */
    public fun placementTenancy(placementTenancy: String)

    /**
     * @param ramDiskId The ID of the RAM disk to select.
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [User provided
     * kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     */
    public fun ramDiskId(ramDiskId: String)

    /**
     * @param securityGroups A list that contains the security groups to assign to the instances in
     * the Auto Scaling group.
     * The list can contain both the IDs of existing security groups and references to
     * [SecurityGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
     * resources created in the template.
     *
     * For more information, see [Control traffic to resources using security
     * groups](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html) in the
     * *Amazon Virtual Private Cloud User Guide* .
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * @param securityGroups A list that contains the security groups to assign to the instances in
     * the Auto Scaling group.
     * The list can contain both the IDs of existing security groups and references to
     * [SecurityGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
     * resources created in the template.
     *
     * For more information, see [Control traffic to resources using security
     * groups](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html) in the
     * *Amazon Virtual Private Cloud User Guide* .
     */
    public fun securityGroups(vararg securityGroups: String)

    /**
     * @param spotPrice The maximum hourly price to be paid for any Spot Instance launched to
     * fulfill the request.
     * Spot Instances are launched when the price you specify exceeds the current Spot price. For
     * more information, see [Request Spot Instances for fault-tolerant and flexible
     * applications](https://docs.aws.amazon.com/autoscaling/ec2/userguide/launch-template-spot-instances.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid Range: Minimum value of 0.001
     *
     *
     * When you change your maximum price by creating a new launch configuration, running instances
     * will continue to run as long as the maximum price for those running instances is higher than the
     * current Spot price.
     */
    public fun spotPrice(spotPrice: String)

    /**
     * @param userData The Base64-encoded user data to make available to the launched EC2 instances.
     * For more information, see [Instance metadata and user
     * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     */
    public fun userData(userData: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder =
        software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.builder()

    /**
     * @param associatePublicIpAddress Specifies whether to assign a public IPv4 address to the
     * group's instances.
     * If the instance is launched into a default subnet, the default is to assign a public IPv4
     * address, unless you disabled the option to assign a public IPv4 address on the subnet. If the
     * instance is launched into a nondefault subnet, the default is not to assign a public IPv4
     * address, unless you enabled the option to assign a public IPv4 address on the subnet.
     *
     * If you specify `true` , each instance in the Auto Scaling group receives a unique public IPv4
     * address. For more information, see [Launching Auto Scaling instances in a
     * VPC](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html) in the *Amazon EC2
     * Auto Scaling User Guide* .
     *
     * If you specify this property, you must specify at least one subnet for `VPCZoneIdentifier`
     * when you create your group.
     */
    override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    /**
     * @param associatePublicIpAddress Specifies whether to assign a public IPv4 address to the
     * group's instances.
     * If the instance is launched into a default subnet, the default is to assign a public IPv4
     * address, unless you disabled the option to assign a public IPv4 address on the subnet. If the
     * instance is launched into a nondefault subnet, the default is not to assign a public IPv4
     * address, unless you enabled the option to assign a public IPv4 address on the subnet.
     *
     * If you specify `true` , each instance in the Auto Scaling group receives a unique public IPv4
     * address. For more information, see [Launching Auto Scaling instances in a
     * VPC](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html) in the *Amazon EC2
     * Auto Scaling User Guide* .
     *
     * If you specify this property, you must specify at least one subnet for `VPCZoneIdentifier`
     * when you create your group.
     */
    override fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress.let(IResolvable::unwrap))
    }

    /**
     * @param blockDeviceMappings The block device mapping entries that define the block devices to
     * attach to the instances at launch.
     * By default, the block devices specified in the block device mapping for the AMI are used. For
     * more information, see [Block device
     * mappings](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     */
    override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable::unwrap))
    }

    /**
     * @param blockDeviceMappings The block device mapping entries that define the block devices to
     * attach to the instances at launch.
     * By default, the block devices specified in the block device mapping for the AMI are used. For
     * more information, see [Block device
     * mappings](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     */
    override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    /**
     * @param blockDeviceMappings The block device mapping entries that define the block devices to
     * attach to the instances at launch.
     * By default, the block devices specified in the block device mapping for the AMI are used. For
     * more information, see [Block device
     * mappings](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     */
    override fun blockDeviceMappings(vararg blockDeviceMappings: Any): Unit =
        blockDeviceMappings(blockDeviceMappings.toList())

    /**
     * @param classicLinkVpcId Available for backward compatibility.
     */
    override fun classicLinkVpcId(classicLinkVpcId: String) {
      cdkBuilder.classicLinkVpcId(classicLinkVpcId)
    }

    /**
     * @param classicLinkVpcSecurityGroups Available for backward compatibility.
     */
    override fun classicLinkVpcSecurityGroups(classicLinkVpcSecurityGroups: List<String>) {
      cdkBuilder.classicLinkVpcSecurityGroups(classicLinkVpcSecurityGroups)
    }

    /**
     * @param classicLinkVpcSecurityGroups Available for backward compatibility.
     */
    override fun classicLinkVpcSecurityGroups(vararg classicLinkVpcSecurityGroups: String): Unit =
        classicLinkVpcSecurityGroups(classicLinkVpcSecurityGroups.toList())

    /**
     * @param ebsOptimized Specifies whether the launch configuration is optimized for EBS I/O (
     * `true` ) or not ( `false` ).
     * The optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization is not available with all instance
     * types. Additional fees are incurred when you enable EBS optimization for an instance type that
     * is not EBS-optimized by default. For more information, see [Amazon EBS-optimized
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) in the *Amazon
     * EC2 User Guide for Linux Instances* .
     *
     * The default value is `false` .
     */
    override fun ebsOptimized(ebsOptimized: Boolean) {
      cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /**
     * @param ebsOptimized Specifies whether the launch configuration is optimized for EBS I/O (
     * `true` ) or not ( `false` ).
     * The optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization is not available with all instance
     * types. Additional fees are incurred when you enable EBS optimization for an instance type that
     * is not EBS-optimized by default. For more information, see [Amazon EBS-optimized
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) in the *Amazon
     * EC2 User Guide for Linux Instances* .
     *
     * The default value is `false` .
     */
    override fun ebsOptimized(ebsOptimized: IResolvable) {
      cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
    }

    /**
     * @param iamInstanceProfile The name or the Amazon Resource Name (ARN) of the instance profile
     * associated with the IAM role for the instance.
     * The instance profile contains the IAM role. For more information, see [IAM role for
     * applications that run on Amazon EC2
     * instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/us-iam-role.html) in the
     * *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun iamInstanceProfile(iamInstanceProfile: String) {
      cdkBuilder.iamInstanceProfile(iamInstanceProfile)
    }

    /**
     * @param imageId The ID of the Amazon Machine Image (AMI) that was assigned during
     * registration. 
     * For more information, see [Finding a Linux
     * AMI](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html) in the *Amazon EC2
     * User Guide for Linux Instances* .
     *
     * If you specify `InstanceId` , an `ImageId` is not required.
     */
    override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    /**
     * @param instanceId The ID of the Amazon EC2 instance to use to create the launch
     * configuration.
     * When you use an instance to create a launch configuration, all properties are derived from
     * the instance with the exception of `BlockDeviceMapping` and `AssociatePublicIpAddress` . You can
     * override any properties from the instance by specifying them in the launch configuration.
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * @param instanceMonitoring Controls whether instances in this group are launched with detailed
     * ( `true` ) or basic ( `false` ) monitoring.
     * The default value is `true` (enabled).
     *
     *
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and
     * your account is charged a fee. When you disable detailed monitoring, CloudWatch generates
     * metrics every 5 minutes. For more information, see [Configure Monitoring for Auto Scaling
     * Instances](https://docs.aws.amazon.com/autoscaling/latest/userguide/enable-as-instance-metrics.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun instanceMonitoring(instanceMonitoring: Boolean) {
      cdkBuilder.instanceMonitoring(instanceMonitoring)
    }

    /**
     * @param instanceMonitoring Controls whether instances in this group are launched with detailed
     * ( `true` ) or basic ( `false` ) monitoring.
     * The default value is `true` (enabled).
     *
     *
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and
     * your account is charged a fee. When you disable detailed monitoring, CloudWatch generates
     * metrics every 5 minutes. For more information, see [Configure Monitoring for Auto Scaling
     * Instances](https://docs.aws.amazon.com/autoscaling/latest/userguide/enable-as-instance-metrics.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun instanceMonitoring(instanceMonitoring: IResolvable) {
      cdkBuilder.instanceMonitoring(instanceMonitoring.let(IResolvable::unwrap))
    }

    /**
     * @param instanceType Specifies the instance type of the EC2 instance. 
     * For information about available instance types, see [Available instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * If you specify `InstanceId` , an `InstanceType` is not required.
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param kernelId The ID of the kernel associated with the AMI.
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [User provided
     * kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     */
    override fun kernelId(kernelId: String) {
      cdkBuilder.kernelId(kernelId)
    }

    /**
     * @param keyName The name of the key pair.
     * For more information, see [Amazon EC2 key pairs and Linux
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     */
    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    /**
     * @param launchConfigurationName The name of the launch configuration.
     * This name must be unique per Region per account.
     */
    override fun launchConfigurationName(launchConfigurationName: String) {
      cdkBuilder.launchConfigurationName(launchConfigurationName)
    }

    /**
     * @param metadataOptions The metadata options for the instances.
     * For more information, see [Configuring the Instance Metadata
     * Options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun metadataOptions(metadataOptions: IResolvable) {
      cdkBuilder.metadataOptions(metadataOptions.let(IResolvable::unwrap))
    }

    /**
     * @param metadataOptions The metadata options for the instances.
     * For more information, see [Configuring the Instance Metadata
     * Options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun metadataOptions(metadataOptions: CfnLaunchConfiguration.MetadataOptionsProperty) {
      cdkBuilder.metadataOptions(metadataOptions.let(CfnLaunchConfiguration.MetadataOptionsProperty::unwrap))
    }

    /**
     * @param metadataOptions The metadata options for the instances.
     * For more information, see [Configuring the Instance Metadata
     * Options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34b9df370b044535b0e084cf6b6fddaf0b677a1320ec03d6e35877db81fe5d67")
    override
        fun metadataOptions(metadataOptions: CfnLaunchConfiguration.MetadataOptionsProperty.Builder.() -> Unit):
        Unit = metadataOptions(CfnLaunchConfiguration.MetadataOptionsProperty(metadataOptions))

    /**
     * @param placementTenancy The tenancy of the instance, either `default` or `dedicated` .
     * An instance with `dedicated` tenancy runs on isolated, single-tenant hardware and can only be
     * launched into a VPC. To launch dedicated instances into a shared tenancy VPC (a VPC with the
     * instance placement tenancy attribute set to `default` ), you must set the value of this property
     * to `dedicated` . For more information, see [Configuring instance tenancy with Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/auto-scaling-dedicated-instances.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you specify `PlacementTenancy` , you must specify at least one subnet for
     * `VPCZoneIdentifier` when you create your group.
     *
     * Valid values: `default` | `dedicated`
     */
    override fun placementTenancy(placementTenancy: String) {
      cdkBuilder.placementTenancy(placementTenancy)
    }

    /**
     * @param ramDiskId The ID of the RAM disk to select.
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [User provided
     * kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     */
    override fun ramDiskId(ramDiskId: String) {
      cdkBuilder.ramDiskId(ramDiskId)
    }

    /**
     * @param securityGroups A list that contains the security groups to assign to the instances in
     * the Auto Scaling group.
     * The list can contain both the IDs of existing security groups and references to
     * [SecurityGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
     * resources created in the template.
     *
     * For more information, see [Control traffic to resources using security
     * groups](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html) in the
     * *Amazon Virtual Private Cloud User Guide* .
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * @param securityGroups A list that contains the security groups to assign to the instances in
     * the Auto Scaling group.
     * The list can contain both the IDs of existing security groups and references to
     * [SecurityGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
     * resources created in the template.
     *
     * For more information, see [Control traffic to resources using security
     * groups](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html) in the
     * *Amazon Virtual Private Cloud User Guide* .
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param spotPrice The maximum hourly price to be paid for any Spot Instance launched to
     * fulfill the request.
     * Spot Instances are launched when the price you specify exceeds the current Spot price. For
     * more information, see [Request Spot Instances for fault-tolerant and flexible
     * applications](https://docs.aws.amazon.com/autoscaling/ec2/userguide/launch-template-spot-instances.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid Range: Minimum value of 0.001
     *
     *
     * When you change your maximum price by creating a new launch configuration, running instances
     * will continue to run as long as the maximum price for those running instances is higher than the
     * current Spot price.
     */
    override fun spotPrice(spotPrice: String) {
      cdkBuilder.spotPrice(spotPrice)
    }

    /**
     * @param userData The Base64-encoded user data to make available to the launched EC2 instances.
     * For more information, see [Instance metadata and user
     * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     */
    override fun userData(userData: String) {
      cdkBuilder.userData(userData)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps,
  ) : CdkObject(cdkObject), CfnLaunchConfigurationProps {
    /**
     * Specifies whether to assign a public IPv4 address to the group's instances.
     *
     * If the instance is launched into a default subnet, the default is to assign a public IPv4
     * address, unless you disabled the option to assign a public IPv4 address on the subnet. If the
     * instance is launched into a nondefault subnet, the default is not to assign a public IPv4
     * address, unless you enabled the option to assign a public IPv4 address on the subnet.
     *
     * If you specify `true` , each instance in the Auto Scaling group receives a unique public IPv4
     * address. For more information, see [Launching Auto Scaling instances in a
     * VPC](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html) in the *Amazon EC2
     * Auto Scaling User Guide* .
     *
     * If you specify this property, you must specify at least one subnet for `VPCZoneIdentifier`
     * when you create your group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-associatepublicipaddress)
     */
    override fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

    /**
     * The block device mapping entries that define the block devices to attach to the instances at
     * launch.
     *
     * By default, the block devices specified in the block device mapping for the AMI are used. For
     * more information, see [Block device
     * mappings](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-blockdevicemappings)
     */
    override fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

    /**
     * Available for backward compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-classiclinkvpcid)
     */
    override fun classicLinkVpcId(): String? = unwrap(this).getClassicLinkVpcId()

    /**
     * Available for backward compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-classiclinkvpcsecuritygroups)
     */
    override fun classicLinkVpcSecurityGroups(): List<String> =
        unwrap(this).getClassicLinkVpcSecurityGroups() ?: emptyList()

    /**
     * Specifies whether the launch configuration is optimized for EBS I/O ( `true` ) or not (
     * `false` ).
     *
     * The optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal I/O performance. This optimization is not available with all instance
     * types. Additional fees are incurred when you enable EBS optimization for an instance type that
     * is not EBS-optimized by default. For more information, see [Amazon EBS-optimized
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) in the *Amazon
     * EC2 User Guide for Linux Instances* .
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-ebsoptimized)
     */
    override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    /**
     * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM
     * role for the instance.
     *
     * The instance profile contains the IAM role. For more information, see [IAM role for
     * applications that run on Amazon EC2
     * instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/us-iam-role.html) in the
     * *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-iaminstanceprofile)
     */
    override fun iamInstanceProfile(): String? = unwrap(this).getIamInstanceProfile()

    /**
     * The ID of the Amazon Machine Image (AMI) that was assigned during registration.
     *
     * For more information, see [Finding a Linux
     * AMI](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html) in the *Amazon EC2
     * User Guide for Linux Instances* .
     *
     * If you specify `InstanceId` , an `ImageId` is not required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-imageid)
     */
    override fun imageId(): String = unwrap(this).getImageId()

    /**
     * The ID of the Amazon EC2 instance to use to create the launch configuration.
     *
     * When you use an instance to create a launch configuration, all properties are derived from
     * the instance with the exception of `BlockDeviceMapping` and `AssociatePublicIpAddress` . You can
     * override any properties from the instance by specifying them in the launch configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-instanceid)
     */
    override fun instanceId(): String? = unwrap(this).getInstanceId()

    /**
     * Controls whether instances in this group are launched with detailed ( `true` ) or basic (
     * `false` ) monitoring.
     *
     * The default value is `true` (enabled).
     *
     *
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics every minute and
     * your account is charged a fee. When you disable detailed monitoring, CloudWatch generates
     * metrics every 5 minutes. For more information, see [Configure Monitoring for Auto Scaling
     * Instances](https://docs.aws.amazon.com/autoscaling/latest/userguide/enable-as-instance-metrics.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-instancemonitoring)
     */
    override fun instanceMonitoring(): Any? = unwrap(this).getInstanceMonitoring()

    /**
     * Specifies the instance type of the EC2 instance.
     *
     * For information about available instance types, see [Available instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * If you specify `InstanceId` , an `InstanceType` is not required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-instancetype)
     */
    override fun instanceType(): String = unwrap(this).getInstanceType()

    /**
     * The ID of the kernel associated with the AMI.
     *
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [User provided
     * kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-kernelid)
     */
    override fun kernelId(): String? = unwrap(this).getKernelId()

    /**
     * The name of the key pair.
     *
     * For more information, see [Amazon EC2 key pairs and Linux
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-keyname)
     */
    override fun keyName(): String? = unwrap(this).getKeyName()

    /**
     * The name of the launch configuration.
     *
     * This name must be unique per Region per account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-launchconfigurationname)
     */
    override fun launchConfigurationName(): String? = unwrap(this).getLaunchConfigurationName()

    /**
     * The metadata options for the instances.
     *
     * For more information, see [Configuring the Instance Metadata
     * Options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-metadataoptions)
     */
    override fun metadataOptions(): Any? = unwrap(this).getMetadataOptions()

    /**
     * The tenancy of the instance, either `default` or `dedicated` .
     *
     * An instance with `dedicated` tenancy runs on isolated, single-tenant hardware and can only be
     * launched into a VPC. To launch dedicated instances into a shared tenancy VPC (a VPC with the
     * instance placement tenancy attribute set to `default` ), you must set the value of this property
     * to `dedicated` . For more information, see [Configuring instance tenancy with Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/auto-scaling-dedicated-instances.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you specify `PlacementTenancy` , you must specify at least one subnet for
     * `VPCZoneIdentifier` when you create your group.
     *
     * Valid values: `default` | `dedicated`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-placementtenancy)
     */
    override fun placementTenancy(): String? = unwrap(this).getPlacementTenancy()

    /**
     * The ID of the RAM disk to select.
     *
     *
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see
     * [User provided
     * kernels](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-ramdiskid)
     */
    override fun ramDiskId(): String? = unwrap(this).getRamDiskId()

    /**
     * A list that contains the security groups to assign to the instances in the Auto Scaling
     * group.
     *
     * The list can contain both the IDs of existing security groups and references to
     * [SecurityGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group.html)
     * resources created in the template.
     *
     * For more information, see [Control traffic to resources using security
     * groups](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html) in the
     * *Amazon Virtual Private Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-securitygroups)
     */
    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request.
     *
     * Spot Instances are launched when the price you specify exceeds the current Spot price. For
     * more information, see [Request Spot Instances for fault-tolerant and flexible
     * applications](https://docs.aws.amazon.com/autoscaling/ec2/userguide/launch-template-spot-instances.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid Range: Minimum value of 0.001
     *
     *
     * When you change your maximum price by creating a new launch configuration, running instances
     * will continue to run as long as the maximum price for those running instances is higher than the
     * current Spot price.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-spotprice)
     */
    override fun spotPrice(): String? = unwrap(this).getSpotPrice()

    /**
     * The Base64-encoded user data to make available to the launched EC2 instances.
     *
     * For more information, see [Instance metadata and user
     * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-userdata)
     */
    override fun userData(): String? = unwrap(this).getUserData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLaunchConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps):
        CfnLaunchConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnLaunchConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchConfigurationProps):
        software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps
  }
}
