@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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
 * The `AWS::AutoScaling::LaunchConfiguration` resource specifies the launch configuration that can
 * be used by an Auto Scaling group to configure Amazon EC2 instances.
 *
 * When you update the launch configuration for an Auto Scaling group, CloudFormation deletes that
 * resource and creates a new launch configuration with the updated properties and a new name. Existing
 * instances are not affected. To update existing instances when you update the
 * `AWS::AutoScaling::LaunchConfiguration` resource, you can specify an [UpdatePolicy
 * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html)
 * for the group. You can find sample update policies for rolling updates in [Configure Amazon EC2 Auto
 * Scaling
 * resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-ec2-auto-scaling.html)
 * .
 *
 *
 * Amazon EC2 Auto Scaling configures instances launched as part of an Auto Scaling group using
 * either a [launch
 * template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
 * or a launch configuration. We strongly recommend that you do not use launch configurations. For more
 * information, see [Launch
 * configurations](https://docs.aws.amazon.com/autoscaling/ec2/userguide/launch-configurations.html) in
 * the *Amazon EC2 Auto Scaling User Guide* .
 *
 * For help migrating from launch configurations to launch templates, see [Migrate AWS
 * CloudFormation stacks from launch configurations to launch
 * templates](https://docs.aws.amazon.com/autoscaling/ec2/userguide/migrate-launch-configurations-with-cloudformation.html)
 * in the *Amazon EC2 Auto Scaling User Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
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
public open class CfnLaunchConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Specifies whether to assign a public IPv4 address to the group's instances.
   */
  public open fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

  /**
   * Specifies whether to assign a public IPv4 address to the group's instances.
   */
  public open fun associatePublicIpAddress(`value`: Boolean) {
    unwrap(this).setAssociatePublicIpAddress(`value`)
  }

  /**
   * Specifies whether to assign a public IPv4 address to the group's instances.
   */
  public open fun associatePublicIpAddress(`value`: IResolvable) {
    unwrap(this).setAssociatePublicIpAddress(`value`.let(IResolvable::unwrap))
  }

  /**
   * The block device mapping entries that define the block devices to attach to the instances at
   * launch.
   */
  public open fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

  /**
   * The block device mapping entries that define the block devices to attach to the instances at
   * launch.
   */
  public open fun blockDeviceMappings(`value`: IResolvable) {
    unwrap(this).setBlockDeviceMappings(`value`.let(IResolvable::unwrap))
  }

  /**
   * The block device mapping entries that define the block devices to attach to the instances at
   * launch.
   */
  public open fun blockDeviceMappings(`value`: List<Any>) {
    unwrap(this).setBlockDeviceMappings(`value`)
  }

  /**
   * The block device mapping entries that define the block devices to attach to the instances at
   * launch.
   */
  public open fun blockDeviceMappings(vararg `value`: Any): Unit =
      blockDeviceMappings(`value`.toList())

  /**
   * Available for backward compatibility.
   */
  public open fun classicLinkVpcId(): String? = unwrap(this).getClassicLinkVpcId()

  /**
   * Available for backward compatibility.
   */
  public open fun classicLinkVpcId(`value`: String) {
    unwrap(this).setClassicLinkVpcId(`value`)
  }

  /**
   * Available for backward compatibility.
   */
  public open fun classicLinkVpcSecurityGroups(): List<String> =
      unwrap(this).getClassicLinkVpcSecurityGroups() ?: emptyList()

  /**
   * Available for backward compatibility.
   */
  public open fun classicLinkVpcSecurityGroups(`value`: List<String>) {
    unwrap(this).setClassicLinkVpcSecurityGroups(`value`)
  }

  /**
   * Available for backward compatibility.
   */
  public open fun classicLinkVpcSecurityGroups(vararg `value`: String): Unit =
      classicLinkVpcSecurityGroups(`value`.toList())

  /**
   * Specifies whether the launch configuration is optimized for EBS I/O ( `true` ) or not ( `false`
   * ).
   */
  public open fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

  /**
   * Specifies whether the launch configuration is optimized for EBS I/O ( `true` ) or not ( `false`
   * ).
   */
  public open fun ebsOptimized(`value`: Boolean) {
    unwrap(this).setEbsOptimized(`value`)
  }

  /**
   * Specifies whether the launch configuration is optimized for EBS I/O ( `true` ) or not ( `false`
   * ).
   */
  public open fun ebsOptimized(`value`: IResolvable) {
    unwrap(this).setEbsOptimized(`value`.let(IResolvable::unwrap))
  }

  /**
   * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role
   * for the instance.
   */
  public open fun iamInstanceProfile(): String? = unwrap(this).getIamInstanceProfile()

  /**
   * The name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role
   * for the instance.
   */
  public open fun iamInstanceProfile(`value`: String) {
    unwrap(this).setIamInstanceProfile(`value`)
  }

  /**
   * The ID of the Amazon Machine Image (AMI) that was assigned during registration.
   */
  public open fun imageId(): String = unwrap(this).getImageId()

  /**
   * The ID of the Amazon Machine Image (AMI) that was assigned during registration.
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
   * The ID of the Amazon EC2 instance to use to create the launch configuration.
   */
  public open fun instanceId(): String? = unwrap(this).getInstanceId()

  /**
   * The ID of the Amazon EC2 instance to use to create the launch configuration.
   */
  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  /**
   * Controls whether instances in this group are launched with detailed ( `true` ) or basic (
   * `false` ) monitoring.
   */
  public open fun instanceMonitoring(): Any? = unwrap(this).getInstanceMonitoring()

  /**
   * Controls whether instances in this group are launched with detailed ( `true` ) or basic (
   * `false` ) monitoring.
   */
  public open fun instanceMonitoring(`value`: Boolean) {
    unwrap(this).setInstanceMonitoring(`value`)
  }

  /**
   * Controls whether instances in this group are launched with detailed ( `true` ) or basic (
   * `false` ) monitoring.
   */
  public open fun instanceMonitoring(`value`: IResolvable) {
    unwrap(this).setInstanceMonitoring(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the instance type of the EC2 instance.
   */
  public open fun instanceType(): String = unwrap(this).getInstanceType()

  /**
   * Specifies the instance type of the EC2 instance.
   */
  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  /**
   * The ID of the kernel associated with the AMI.
   */
  public open fun kernelId(): String? = unwrap(this).getKernelId()

  /**
   * The ID of the kernel associated with the AMI.
   */
  public open fun kernelId(`value`: String) {
    unwrap(this).setKernelId(`value`)
  }

  /**
   * The name of the key pair.
   */
  public open fun keyName(): String? = unwrap(this).getKeyName()

  /**
   * The name of the key pair.
   */
  public open fun keyName(`value`: String) {
    unwrap(this).setKeyName(`value`)
  }

  /**
   * The name of the launch configuration.
   */
  public open fun launchConfigurationName(): String? = unwrap(this).getLaunchConfigurationName()

  /**
   * The name of the launch configuration.
   */
  public open fun launchConfigurationName(`value`: String) {
    unwrap(this).setLaunchConfigurationName(`value`)
  }

  /**
   * The metadata options for the instances.
   */
  public open fun metadataOptions(): Any? = unwrap(this).getMetadataOptions()

  /**
   * The metadata options for the instances.
   */
  public open fun metadataOptions(`value`: IResolvable) {
    unwrap(this).setMetadataOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The metadata options for the instances.
   */
  public open fun metadataOptions(`value`: MetadataOptionsProperty) {
    unwrap(this).setMetadataOptions(`value`.let(MetadataOptionsProperty::unwrap))
  }

  /**
   * The metadata options for the instances.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4003fe177379216a0b77445c3913079d56618147dad35f5793af427b200cd069")
  public open fun metadataOptions(`value`: MetadataOptionsProperty.Builder.() -> Unit): Unit =
      metadataOptions(MetadataOptionsProperty(`value`))

  /**
   * The tenancy of the instance, either `default` or `dedicated` .
   */
  public open fun placementTenancy(): String? = unwrap(this).getPlacementTenancy()

  /**
   * The tenancy of the instance, either `default` or `dedicated` .
   */
  public open fun placementTenancy(`value`: String) {
    unwrap(this).setPlacementTenancy(`value`)
  }

  /**
   * The ID of the RAM disk to select.
   */
  public open fun ramDiskId(): String? = unwrap(this).getRamDiskId()

  /**
   * The ID of the RAM disk to select.
   */
  public open fun ramDiskId(`value`: String) {
    unwrap(this).setRamDiskId(`value`)
  }

  /**
   * A list that contains the security groups to assign to the instances in the Auto Scaling group.
   */
  public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  /**
   * A list that contains the security groups to assign to the instances in the Auto Scaling group.
   */
  public open fun securityGroups(`value`: List<String>) {
    unwrap(this).setSecurityGroups(`value`)
  }

  /**
   * A list that contains the security groups to assign to the instances in the Auto Scaling group.
   */
  public open fun securityGroups(vararg `value`: String): Unit = securityGroups(`value`.toList())

  /**
   * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request.
   */
  public open fun spotPrice(): String? = unwrap(this).getSpotPrice()

  /**
   * The maximum hourly price to be paid for any Spot Instance launched to fulfill the request.
   */
  public open fun spotPrice(`value`: String) {
    unwrap(this).setSpotPrice(`value`)
  }

  /**
   * The Base64-encoded user data to make available to the launched EC2 instances.
   */
  public open fun userData(): String? = unwrap(this).getUserData()

  /**
   * The Base64-encoded user data to make available to the launched EC2 instances.
   */
  public open fun userData(`value`: String) {
    unwrap(this).setUserData(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.autoscaling.CfnLaunchConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param associatePublicIpAddress Specifies whether to assign a public IPv4 address to the
     * group's instances. 
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

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
     * @param associatePublicIpAddress Specifies whether to assign a public IPv4 address to the
     * group's instances. 
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable)

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
     * @param blockDeviceMappings The block device mapping entries that define the block devices to
     * attach to the instances at launch. 
     */
    public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

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
     * @param blockDeviceMappings The block device mapping entries that define the block devices to
     * attach to the instances at launch. 
     */
    public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

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
     * @param blockDeviceMappings The block device mapping entries that define the block devices to
     * attach to the instances at launch. 
     */
    public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

    /**
     * Available for backward compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-classiclinkvpcid)
     * @param classicLinkVpcId Available for backward compatibility. 
     */
    public fun classicLinkVpcId(classicLinkVpcId: String)

    /**
     * Available for backward compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-classiclinkvpcsecuritygroups)
     * @param classicLinkVpcSecurityGroups Available for backward compatibility. 
     */
    public fun classicLinkVpcSecurityGroups(classicLinkVpcSecurityGroups: List<String>)

    /**
     * Available for backward compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-classiclinkvpcsecuritygroups)
     * @param classicLinkVpcSecurityGroups Available for backward compatibility. 
     */
    public fun classicLinkVpcSecurityGroups(vararg classicLinkVpcSecurityGroups: String)

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
     * @param ebsOptimized Specifies whether the launch configuration is optimized for EBS I/O (
     * `true` ) or not ( `false` ). 
     */
    public fun ebsOptimized(ebsOptimized: Boolean)

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
     * @param ebsOptimized Specifies whether the launch configuration is optimized for EBS I/O (
     * `true` ) or not ( `false` ). 
     */
    public fun ebsOptimized(ebsOptimized: IResolvable)

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
     * @param iamInstanceProfile The name or the Amazon Resource Name (ARN) of the instance profile
     * associated with the IAM role for the instance. 
     */
    public fun iamInstanceProfile(iamInstanceProfile: String)

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
     * @param imageId The ID of the Amazon Machine Image (AMI) that was assigned during
     * registration. 
     */
    public fun imageId(imageId: String)

    /**
     * The ID of the Amazon EC2 instance to use to create the launch configuration.
     *
     * When you use an instance to create a launch configuration, all properties are derived from
     * the instance with the exception of `BlockDeviceMapping` and `AssociatePublicIpAddress` . You can
     * override any properties from the instance by specifying them in the launch configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-instanceid)
     * @param instanceId The ID of the Amazon EC2 instance to use to create the launch
     * configuration. 
     */
    public fun instanceId(instanceId: String)

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
     * @param instanceMonitoring Controls whether instances in this group are launched with detailed
     * ( `true` ) or basic ( `false` ) monitoring. 
     */
    public fun instanceMonitoring(instanceMonitoring: Boolean)

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
     * @param instanceMonitoring Controls whether instances in this group are launched with detailed
     * ( `true` ) or basic ( `false` ) monitoring. 
     */
    public fun instanceMonitoring(instanceMonitoring: IResolvable)

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
     * @param instanceType Specifies the instance type of the EC2 instance. 
     */
    public fun instanceType(instanceType: String)

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
     * @param kernelId The ID of the kernel associated with the AMI. 
     */
    public fun kernelId(kernelId: String)

    /**
     * The name of the key pair.
     *
     * For more information, see [Amazon EC2 key pairs and Linux
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-keyname)
     * @param keyName The name of the key pair. 
     */
    public fun keyName(keyName: String)

    /**
     * The name of the launch configuration.
     *
     * This name must be unique per Region per account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-launchconfigurationname)
     * @param launchConfigurationName The name of the launch configuration. 
     */
    public fun launchConfigurationName(launchConfigurationName: String)

    /**
     * The metadata options for the instances.
     *
     * For more information, see [Configuring the Instance Metadata
     * Options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-metadataoptions)
     * @param metadataOptions The metadata options for the instances. 
     */
    public fun metadataOptions(metadataOptions: IResolvable)

    /**
     * The metadata options for the instances.
     *
     * For more information, see [Configuring the Instance Metadata
     * Options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-metadataoptions)
     * @param metadataOptions The metadata options for the instances. 
     */
    public fun metadataOptions(metadataOptions: MetadataOptionsProperty)

    /**
     * The metadata options for the instances.
     *
     * For more information, see [Configuring the Instance Metadata
     * Options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-metadataoptions)
     * @param metadataOptions The metadata options for the instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("513551109ed8d0f72b2ca5220ce06aa5107153969a922074ef35f22729c3ff38")
    public fun metadataOptions(metadataOptions: MetadataOptionsProperty.Builder.() -> Unit)

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
     * @param placementTenancy The tenancy of the instance, either `default` or `dedicated` . 
     */
    public fun placementTenancy(placementTenancy: String)

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
     * @param ramDiskId The ID of the RAM disk to select. 
     */
    public fun ramDiskId(ramDiskId: String)

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
     * @param securityGroups A list that contains the security groups to assign to the instances in
     * the Auto Scaling group. 
     */
    public fun securityGroups(securityGroups: List<String>)

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
     * @param securityGroups A list that contains the security groups to assign to the instances in
     * the Auto Scaling group. 
     */
    public fun securityGroups(vararg securityGroups: String)

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
     * @param spotPrice The maximum hourly price to be paid for any Spot Instance launched to
     * fulfill the request. 
     */
    public fun spotPrice(spotPrice: String)

    /**
     * The Base64-encoded user data to make available to the launched EC2 instances.
     *
     * For more information, see [Instance metadata and user
     * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-userdata)
     * @param userData The Base64-encoded user data to make available to the launched EC2 instances.
     * 
     */
    public fun userData(userData: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.Builder =
        software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.Builder.create(scope, id)

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
     * @param associatePublicIpAddress Specifies whether to assign a public IPv4 address to the
     * group's instances. 
     */
    override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
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
     * address. For more information, see [Launching Auto Scaling instances in a
     * VPC](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-in-vpc.html) in the *Amazon EC2
     * Auto Scaling User Guide* .
     *
     * If you specify this property, you must specify at least one subnet for `VPCZoneIdentifier`
     * when you create your group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-associatepublicipaddress)
     * @param associatePublicIpAddress Specifies whether to assign a public IPv4 address to the
     * group's instances. 
     */
    override fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress.let(IResolvable::unwrap))
    }

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
     * @param blockDeviceMappings The block device mapping entries that define the block devices to
     * attach to the instances at launch. 
     */
    override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable::unwrap))
    }

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
     * @param blockDeviceMappings The block device mapping entries that define the block devices to
     * attach to the instances at launch. 
     */
    override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

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
     * @param blockDeviceMappings The block device mapping entries that define the block devices to
     * attach to the instances at launch. 
     */
    override fun blockDeviceMappings(vararg blockDeviceMappings: Any): Unit =
        blockDeviceMappings(blockDeviceMappings.toList())

    /**
     * Available for backward compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-classiclinkvpcid)
     * @param classicLinkVpcId Available for backward compatibility. 
     */
    override fun classicLinkVpcId(classicLinkVpcId: String) {
      cdkBuilder.classicLinkVpcId(classicLinkVpcId)
    }

    /**
     * Available for backward compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-classiclinkvpcsecuritygroups)
     * @param classicLinkVpcSecurityGroups Available for backward compatibility. 
     */
    override fun classicLinkVpcSecurityGroups(classicLinkVpcSecurityGroups: List<String>) {
      cdkBuilder.classicLinkVpcSecurityGroups(classicLinkVpcSecurityGroups)
    }

    /**
     * Available for backward compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-classiclinkvpcsecuritygroups)
     * @param classicLinkVpcSecurityGroups Available for backward compatibility. 
     */
    override fun classicLinkVpcSecurityGroups(vararg classicLinkVpcSecurityGroups: String): Unit =
        classicLinkVpcSecurityGroups(classicLinkVpcSecurityGroups.toList())

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
     * @param ebsOptimized Specifies whether the launch configuration is optimized for EBS I/O (
     * `true` ) or not ( `false` ). 
     */
    override fun ebsOptimized(ebsOptimized: Boolean) {
      cdkBuilder.ebsOptimized(ebsOptimized)
    }

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
     * @param ebsOptimized Specifies whether the launch configuration is optimized for EBS I/O (
     * `true` ) or not ( `false` ). 
     */
    override fun ebsOptimized(ebsOptimized: IResolvable) {
      cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
    }

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
     * @param iamInstanceProfile The name or the Amazon Resource Name (ARN) of the instance profile
     * associated with the IAM role for the instance. 
     */
    override fun iamInstanceProfile(iamInstanceProfile: String) {
      cdkBuilder.iamInstanceProfile(iamInstanceProfile)
    }

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
     * @param imageId The ID of the Amazon Machine Image (AMI) that was assigned during
     * registration. 
     */
    override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    /**
     * The ID of the Amazon EC2 instance to use to create the launch configuration.
     *
     * When you use an instance to create a launch configuration, all properties are derived from
     * the instance with the exception of `BlockDeviceMapping` and `AssociatePublicIpAddress` . You can
     * override any properties from the instance by specifying them in the launch configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-instanceid)
     * @param instanceId The ID of the Amazon EC2 instance to use to create the launch
     * configuration. 
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

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
     * @param instanceMonitoring Controls whether instances in this group are launched with detailed
     * ( `true` ) or basic ( `false` ) monitoring. 
     */
    override fun instanceMonitoring(instanceMonitoring: Boolean) {
      cdkBuilder.instanceMonitoring(instanceMonitoring)
    }

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
     * @param instanceMonitoring Controls whether instances in this group are launched with detailed
     * ( `true` ) or basic ( `false` ) monitoring. 
     */
    override fun instanceMonitoring(instanceMonitoring: IResolvable) {
      cdkBuilder.instanceMonitoring(instanceMonitoring.let(IResolvable::unwrap))
    }

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
     * @param instanceType Specifies the instance type of the EC2 instance. 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

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
     * @param kernelId The ID of the kernel associated with the AMI. 
     */
    override fun kernelId(kernelId: String) {
      cdkBuilder.kernelId(kernelId)
    }

    /**
     * The name of the key pair.
     *
     * For more information, see [Amazon EC2 key pairs and Linux
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-keyname)
     * @param keyName The name of the key pair. 
     */
    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    /**
     * The name of the launch configuration.
     *
     * This name must be unique per Region per account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-launchconfigurationname)
     * @param launchConfigurationName The name of the launch configuration. 
     */
    override fun launchConfigurationName(launchConfigurationName: String) {
      cdkBuilder.launchConfigurationName(launchConfigurationName)
    }

    /**
     * The metadata options for the instances.
     *
     * For more information, see [Configuring the Instance Metadata
     * Options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-metadataoptions)
     * @param metadataOptions The metadata options for the instances. 
     */
    override fun metadataOptions(metadataOptions: IResolvable) {
      cdkBuilder.metadataOptions(metadataOptions.let(IResolvable::unwrap))
    }

    /**
     * The metadata options for the instances.
     *
     * For more information, see [Configuring the Instance Metadata
     * Options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-metadataoptions)
     * @param metadataOptions The metadata options for the instances. 
     */
    override fun metadataOptions(metadataOptions: MetadataOptionsProperty) {
      cdkBuilder.metadataOptions(metadataOptions.let(MetadataOptionsProperty::unwrap))
    }

    /**
     * The metadata options for the instances.
     *
     * For more information, see [Configuring the Instance Metadata
     * Options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-metadataoptions)
     * @param metadataOptions The metadata options for the instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("513551109ed8d0f72b2ca5220ce06aa5107153969a922074ef35f22729c3ff38")
    override fun metadataOptions(metadataOptions: MetadataOptionsProperty.Builder.() -> Unit): Unit
        = metadataOptions(MetadataOptionsProperty(metadataOptions))

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
     * @param placementTenancy The tenancy of the instance, either `default` or `dedicated` . 
     */
    override fun placementTenancy(placementTenancy: String) {
      cdkBuilder.placementTenancy(placementTenancy)
    }

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
     * @param ramDiskId The ID of the RAM disk to select. 
     */
    override fun ramDiskId(ramDiskId: String) {
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
     * For more information, see [Control traffic to resources using security
     * groups](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html) in the
     * *Amazon Virtual Private Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-securitygroups)
     * @param securityGroups A list that contains the security groups to assign to the instances in
     * the Auto Scaling group. 
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

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
     * @param securityGroups A list that contains the security groups to assign to the instances in
     * the Auto Scaling group. 
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

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
     * @param spotPrice The maximum hourly price to be paid for any Spot Instance launched to
     * fulfill the request. 
     */
    override fun spotPrice(spotPrice: String) {
      cdkBuilder.spotPrice(spotPrice)
    }

    /**
     * The Base64-encoded user data to make available to the launched EC2 instances.
     *
     * For more information, see [Instance metadata and user
     * data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html#cfn-autoscaling-launchconfiguration-userdata)
     * @param userData The Base64-encoded user data to make available to the launched EC2 instances.
     * 
     */
    override fun userData(userData: String) {
      cdkBuilder.userData(userData)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLaunchConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLaunchConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration):
        CfnLaunchConfiguration = CfnLaunchConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchConfiguration):
        software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration = wrapped.cdkObject
  }

  /**
   * `BlockDevice` is a property of the `EBS` property of the [AWS::AutoScaling::LaunchConfiguration
   * BlockDeviceMapping](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevicemapping.html)
   * property type that describes an Amazon EBS volume.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.autoscaling.*;
   * BlockDeviceProperty blockDeviceProperty = BlockDeviceProperty.builder()
   * .deleteOnTermination(false)
   * .encrypted(false)
   * .iops(123)
   * .snapshotId("snapshotId")
   * .throughput(123)
   * .volumeSize(123)
   * .volumeType("volumeType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html)
   */
  public interface BlockDeviceProperty {
    /**
     * Indicates whether the volume is deleted on instance termination.
     *
     * For Amazon EC2 Auto Scaling, the default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html#cfn-autoscaling-launchconfiguration-blockdevice-deleteontermination)
     */
    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    /**
     * Specifies whether the volume should be encrypted.
     *
     * Encrypted EBS volumes can only be attached to instances that support Amazon EBS encryption.
     * For more information, see [Supported instance
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
     * . If your AMI uses encrypted volumes, you can also only launch it on supported instance types.
     *
     *
     * If you are creating a volume from a snapshot, you cannot create an unencrypted volume from an
     * encrypted snapshot. Also, you cannot specify a KMS key ID when using a launch configuration.
     *
     * If you enable encryption by default, the EBS volumes that you create are always encrypted,
     * either using the AWS managed KMS key or a customer-managed KMS key, regardless of whether the
     * snapshot was encrypted.
     *
     * For more information, see [Use AWS KMS keys to encrypt Amazon EBS
     * volumes](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-data-protection.html#encryption)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html#cfn-autoscaling-launchconfiguration-blockdevice-encrypted)
     */
    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    /**
     * The number of input/output (I/O) operations per second (IOPS) to provision for the volume.
     *
     * For `gp3` and `io1` volumes, this represents the number of IOPS that are provisioned for the
     * volume. For `gp2` volumes, this represents the baseline performance of the volume and the rate
     * at which the volume accumulates I/O credits for bursting.
     *
     * The following are the supported values for each volume type:
     *
     * * `gp3` : 3,000-16,000 IOPS
     * * `io1` : 100-64,000 IOPS
     *
     * For `io1` volumes, we guarantee 64,000 IOPS only for [Instances built on the Nitro
     * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
     * . Other instance families guarantee performance up to 32,000 IOPS.
     *
     * `Iops` is supported when the volume type is `gp3` or `io1` and required only when the volume
     * type is `io1` . (Not used with `standard` , `gp2` , `st1` , or `sc1` volumes.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html#cfn-autoscaling-launchconfiguration-blockdevice-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * The snapshot ID of the volume to use.
     *
     * You must specify either a `VolumeSize` or a `SnapshotId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html#cfn-autoscaling-launchconfiguration-blockdevice-snapshotid)
     */
    public fun snapshotId(): String? = unwrap(this).getSnapshotId()

    /**
     * The throughput (MiBps) to provision for a `gp3` volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html#cfn-autoscaling-launchconfiguration-blockdevice-throughput)
     */
    public fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * The volume size, in GiBs. The following are the supported volumes sizes for each volume
     * type:.
     *
     * * `gp2` and `gp3` : 1-16,384
     * * `io1` : 4-16,384
     * * `st1` and `sc1` : 125-16,384
     * * `standard` : 1-1,024
     *
     * You must specify either a `SnapshotId` or a `VolumeSize` . If you specify both `SnapshotId`
     * and `VolumeSize` , the volume size must be equal or greater than the size of the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html#cfn-autoscaling-launchconfiguration-blockdevice-volumesize)
     */
    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    /**
     * The volume type.
     *
     * For more information, see [Amazon EBS volume
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
     * EC2 User Guide for Linux Instances* .
     *
     * Valid values: `standard` | `io1` | `gp2` | `st1` | `sc1` | `gp3`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html#cfn-autoscaling-launchconfiguration-blockdevice-volumetype)
     */
    public fun volumeType(): String? = unwrap(this).getVolumeType()

    /**
     * A builder for [BlockDeviceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deleteOnTermination Indicates whether the volume is deleted on instance termination.
       * For Amazon EC2 Auto Scaling, the default value is `true` .
       */
      public fun deleteOnTermination(deleteOnTermination: Boolean)

      /**
       * @param deleteOnTermination Indicates whether the volume is deleted on instance termination.
       * For Amazon EC2 Auto Scaling, the default value is `true` .
       */
      public fun deleteOnTermination(deleteOnTermination: IResolvable)

      /**
       * @param encrypted Specifies whether the volume should be encrypted.
       * Encrypted EBS volumes can only be attached to instances that support Amazon EBS encryption.
       * For more information, see [Supported instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
       * . If your AMI uses encrypted volumes, you can also only launch it on supported instance types.
       *
       *
       * If you are creating a volume from a snapshot, you cannot create an unencrypted volume from
       * an encrypted snapshot. Also, you cannot specify a KMS key ID when using a launch
       * configuration.
       *
       * If you enable encryption by default, the EBS volumes that you create are always encrypted,
       * either using the AWS managed KMS key or a customer-managed KMS key, regardless of whether the
       * snapshot was encrypted.
       *
       * For more information, see [Use AWS KMS keys to encrypt Amazon EBS
       * volumes](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-data-protection.html#encryption)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       */
      public fun encrypted(encrypted: Boolean)

      /**
       * @param encrypted Specifies whether the volume should be encrypted.
       * Encrypted EBS volumes can only be attached to instances that support Amazon EBS encryption.
       * For more information, see [Supported instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
       * . If your AMI uses encrypted volumes, you can also only launch it on supported instance types.
       *
       *
       * If you are creating a volume from a snapshot, you cannot create an unencrypted volume from
       * an encrypted snapshot. Also, you cannot specify a KMS key ID when using a launch
       * configuration.
       *
       * If you enable encryption by default, the EBS volumes that you create are always encrypted,
       * either using the AWS managed KMS key or a customer-managed KMS key, regardless of whether the
       * snapshot was encrypted.
       *
       * For more information, see [Use AWS KMS keys to encrypt Amazon EBS
       * volumes](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-data-protection.html#encryption)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       */
      public fun encrypted(encrypted: IResolvable)

      /**
       * @param iops The number of input/output (I/O) operations per second (IOPS) to provision for
       * the volume.
       * For `gp3` and `io1` volumes, this represents the number of IOPS that are provisioned for
       * the volume. For `gp2` volumes, this represents the baseline performance of the volume and the
       * rate at which the volume accumulates I/O credits for bursting.
       *
       * The following are the supported values for each volume type:
       *
       * * `gp3` : 3,000-16,000 IOPS
       * * `io1` : 100-64,000 IOPS
       *
       * For `io1` volumes, we guarantee 64,000 IOPS only for [Instances built on the Nitro
       * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
       * . Other instance families guarantee performance up to 32,000 IOPS.
       *
       * `Iops` is supported when the volume type is `gp3` or `io1` and required only when the
       * volume type is `io1` . (Not used with `standard` , `gp2` , `st1` , or `sc1` volumes.)
       */
      public fun iops(iops: Number)

      /**
       * @param snapshotId The snapshot ID of the volume to use.
       * You must specify either a `VolumeSize` or a `SnapshotId` .
       */
      public fun snapshotId(snapshotId: String)

      /**
       * @param throughput The throughput (MiBps) to provision for a `gp3` volume.
       */
      public fun throughput(throughput: Number)

      /**
       * @param volumeSize The volume size, in GiBs. The following are the supported volumes sizes
       * for each volume type:.
       * * `gp2` and `gp3` : 1-16,384
       * * `io1` : 4-16,384
       * * `st1` and `sc1` : 125-16,384
       * * `standard` : 1-1,024
       *
       * You must specify either a `SnapshotId` or a `VolumeSize` . If you specify both `SnapshotId`
       * and `VolumeSize` , the volume size must be equal or greater than the size of the snapshot.
       */
      public fun volumeSize(volumeSize: Number)

      /**
       * @param volumeType The volume type.
       * For more information, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
       * EC2 User Guide for Linux Instances* .
       *
       * Valid values: `standard` | `io1` | `gp2` | `st1` | `sc1` | `gp3`
       */
      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.builder()

      /**
       * @param deleteOnTermination Indicates whether the volume is deleted on instance termination.
       * For Amazon EC2 Auto Scaling, the default value is `true` .
       */
      override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      /**
       * @param deleteOnTermination Indicates whether the volume is deleted on instance termination.
       * For Amazon EC2 Auto Scaling, the default value is `true` .
       */
      override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
      }

      /**
       * @param encrypted Specifies whether the volume should be encrypted.
       * Encrypted EBS volumes can only be attached to instances that support Amazon EBS encryption.
       * For more information, see [Supported instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
       * . If your AMI uses encrypted volumes, you can also only launch it on supported instance types.
       *
       *
       * If you are creating a volume from a snapshot, you cannot create an unencrypted volume from
       * an encrypted snapshot. Also, you cannot specify a KMS key ID when using a launch
       * configuration.
       *
       * If you enable encryption by default, the EBS volumes that you create are always encrypted,
       * either using the AWS managed KMS key or a customer-managed KMS key, regardless of whether the
       * snapshot was encrypted.
       *
       * For more information, see [Use AWS KMS keys to encrypt Amazon EBS
       * volumes](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-data-protection.html#encryption)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       */
      override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      /**
       * @param encrypted Specifies whether the volume should be encrypted.
       * Encrypted EBS volumes can only be attached to instances that support Amazon EBS encryption.
       * For more information, see [Supported instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
       * . If your AMI uses encrypted volumes, you can also only launch it on supported instance types.
       *
       *
       * If you are creating a volume from a snapshot, you cannot create an unencrypted volume from
       * an encrypted snapshot. Also, you cannot specify a KMS key ID when using a launch
       * configuration.
       *
       * If you enable encryption by default, the EBS volumes that you create are always encrypted,
       * either using the AWS managed KMS key or a customer-managed KMS key, regardless of whether the
       * snapshot was encrypted.
       *
       * For more information, see [Use AWS KMS keys to encrypt Amazon EBS
       * volumes](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-data-protection.html#encryption)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       */
      override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      /**
       * @param iops The number of input/output (I/O) operations per second (IOPS) to provision for
       * the volume.
       * For `gp3` and `io1` volumes, this represents the number of IOPS that are provisioned for
       * the volume. For `gp2` volumes, this represents the baseline performance of the volume and the
       * rate at which the volume accumulates I/O credits for bursting.
       *
       * The following are the supported values for each volume type:
       *
       * * `gp3` : 3,000-16,000 IOPS
       * * `io1` : 100-64,000 IOPS
       *
       * For `io1` volumes, we guarantee 64,000 IOPS only for [Instances built on the Nitro
       * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
       * . Other instance families guarantee performance up to 32,000 IOPS.
       *
       * `Iops` is supported when the volume type is `gp3` or `io1` and required only when the
       * volume type is `io1` . (Not used with `standard` , `gp2` , `st1` , or `sc1` volumes.)
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param snapshotId The snapshot ID of the volume to use.
       * You must specify either a `VolumeSize` or a `SnapshotId` .
       */
      override fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
      }

      /**
       * @param throughput The throughput (MiBps) to provision for a `gp3` volume.
       */
      override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      /**
       * @param volumeSize The volume size, in GiBs. The following are the supported volumes sizes
       * for each volume type:.
       * * `gp2` and `gp3` : 1-16,384
       * * `io1` : 4-16,384
       * * `st1` and `sc1` : 125-16,384
       * * `standard` : 1-1,024
       *
       * You must specify either a `SnapshotId` or a `VolumeSize` . If you specify both `SnapshotId`
       * and `VolumeSize` , the volume size must be equal or greater than the size of the snapshot.
       */
      override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      /**
       * @param volumeType The volume type.
       * For more information, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
       * EC2 User Guide for Linux Instances* .
       *
       * Valid values: `standard` | `io1` | `gp2` | `st1` | `sc1` | `gp3`
       */
      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty,
    ) : CdkObject(cdkObject), BlockDeviceProperty {
      /**
       * Indicates whether the volume is deleted on instance termination.
       *
       * For Amazon EC2 Auto Scaling, the default value is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html#cfn-autoscaling-launchconfiguration-blockdevice-deleteontermination)
       */
      override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      /**
       * Specifies whether the volume should be encrypted.
       *
       * Encrypted EBS volumes can only be attached to instances that support Amazon EBS encryption.
       * For more information, see [Supported instance
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
       * . If your AMI uses encrypted volumes, you can also only launch it on supported instance types.
       *
       *
       * If you are creating a volume from a snapshot, you cannot create an unencrypted volume from
       * an encrypted snapshot. Also, you cannot specify a KMS key ID when using a launch
       * configuration.
       *
       * If you enable encryption by default, the EBS volumes that you create are always encrypted,
       * either using the AWS managed KMS key or a customer-managed KMS key, regardless of whether the
       * snapshot was encrypted.
       *
       * For more information, see [Use AWS KMS keys to encrypt Amazon EBS
       * volumes](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-data-protection.html#encryption)
       * in the *Amazon EC2 Auto Scaling User Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html#cfn-autoscaling-launchconfiguration-blockdevice-encrypted)
       */
      override fun encrypted(): Any? = unwrap(this).getEncrypted()

      /**
       * The number of input/output (I/O) operations per second (IOPS) to provision for the volume.
       *
       * For `gp3` and `io1` volumes, this represents the number of IOPS that are provisioned for
       * the volume. For `gp2` volumes, this represents the baseline performance of the volume and the
       * rate at which the volume accumulates I/O credits for bursting.
       *
       * The following are the supported values for each volume type:
       *
       * * `gp3` : 3,000-16,000 IOPS
       * * `io1` : 100-64,000 IOPS
       *
       * For `io1` volumes, we guarantee 64,000 IOPS only for [Instances built on the Nitro
       * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
       * . Other instance families guarantee performance up to 32,000 IOPS.
       *
       * `Iops` is supported when the volume type is `gp3` or `io1` and required only when the
       * volume type is `io1` . (Not used with `standard` , `gp2` , `st1` , or `sc1` volumes.)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html#cfn-autoscaling-launchconfiguration-blockdevice-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * The snapshot ID of the volume to use.
       *
       * You must specify either a `VolumeSize` or a `SnapshotId` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html#cfn-autoscaling-launchconfiguration-blockdevice-snapshotid)
       */
      override fun snapshotId(): String? = unwrap(this).getSnapshotId()

      /**
       * The throughput (MiBps) to provision for a `gp3` volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html#cfn-autoscaling-launchconfiguration-blockdevice-throughput)
       */
      override fun throughput(): Number? = unwrap(this).getThroughput()

      /**
       * The volume size, in GiBs. The following are the supported volumes sizes for each volume
       * type:.
       *
       * * `gp2` and `gp3` : 1-16,384
       * * `io1` : 4-16,384
       * * `st1` and `sc1` : 125-16,384
       * * `standard` : 1-1,024
       *
       * You must specify either a `SnapshotId` or a `VolumeSize` . If you specify both `SnapshotId`
       * and `VolumeSize` , the volume size must be equal or greater than the size of the snapshot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html#cfn-autoscaling-launchconfiguration-blockdevice-volumesize)
       */
      override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      /**
       * The volume type.
       *
       * For more information, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
       * EC2 User Guide for Linux Instances* .
       *
       * Valid values: `standard` | `io1` | `gp2` | `st1` | `sc1` | `gp3`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevice.html#cfn-autoscaling-launchconfiguration-blockdevice-volumetype)
       */
      override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BlockDeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty):
          BlockDeviceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockDeviceProperty):
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty
    }
  }

  /**
   * `BlockDeviceMapping` specifies a block device mapping for the `BlockDeviceMappings` property of
   * the
   * [AWS::AutoScaling::LaunchConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html)
   * resource.
   *
   * Each instance that is launched has an associated root device volume, either an Amazon EBS
   * volume or an instance store volume. You can use block device mappings to specify additional EBS
   * volumes or instance store volumes to attach to an instance when it is launched.
   *
   * For more information, see [Example block device
   * mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#block-device-mapping-ex)
   * in the *Amazon EC2 User Guide for Linux Instances* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.autoscaling.*;
   * BlockDeviceMappingProperty blockDeviceMappingProperty = BlockDeviceMappingProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevicemapping.html)
   */
  public interface BlockDeviceMappingProperty {
    /**
     * The device name assigned to the volume (for example, `/dev/sdh` or `xvdh` ).
     *
     * For more information, see [Device naming on Linux
     * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html) in the
     * *Amazon EC2 User Guide for Linux Instances* .
     *
     *
     * To define a block device mapping, set the device name and exactly one of the following
     * properties: `Ebs` , `NoDevice` , or `VirtualName` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevicemapping.html#cfn-autoscaling-launchconfiguration-blockdevicemapping-devicename)
     */
    public fun deviceName(): String

    /**
     * Information to attach an EBS volume to an instance at launch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevicemapping.html#cfn-autoscaling-launchconfiguration-blockdevicemapping-ebs)
     */
    public fun ebs(): Any? = unwrap(this).getEbs()

    /**
     * Setting this value to `true` prevents a volume that is included in the block device mapping
     * of the AMI from being mapped to the specified device name at launch.
     *
     * If `NoDevice` is `true` for the root device, instances might fail the EC2 health check. In
     * that case, Amazon EC2 Auto Scaling launches replacement instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevicemapping.html#cfn-autoscaling-launchconfiguration-blockdevicemapping-nodevice)
     */
    public fun noDevice(): Any? = unwrap(this).getNoDevice()

    /**
     * The name of the instance store volume (virtual device) to attach to an instance at launch.
     *
     * The name must be in the form ephemeral *X* where *X* is a number starting from zero (0), for
     * example, `ephemeral0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevicemapping.html#cfn-autoscaling-launchconfiguration-blockdevicemapping-virtualname)
     */
    public fun virtualName(): String? = unwrap(this).getVirtualName()

    /**
     * A builder for [BlockDeviceMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deviceName The device name assigned to the volume (for example, `/dev/sdh` or `xvdh`
       * ). 
       * For more information, see [Device naming on Linux
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html) in the
       * *Amazon EC2 User Guide for Linux Instances* .
       *
       *
       * To define a block device mapping, set the device name and exactly one of the following
       * properties: `Ebs` , `NoDevice` , or `VirtualName` .
       */
      public fun deviceName(deviceName: String)

      /**
       * @param ebs Information to attach an EBS volume to an instance at launch.
       */
      public fun ebs(ebs: IResolvable)

      /**
       * @param ebs Information to attach an EBS volume to an instance at launch.
       */
      public fun ebs(ebs: BlockDeviceProperty)

      /**
       * @param ebs Information to attach an EBS volume to an instance at launch.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("498defb44b04ba985a3da13c5cac0272c5dcbe8289a5c5d25a4116cc88bcada7")
      public fun ebs(ebs: BlockDeviceProperty.Builder.() -> Unit)

      /**
       * @param noDevice Setting this value to `true` prevents a volume that is included in the
       * block device mapping of the AMI from being mapped to the specified device name at launch.
       * If `NoDevice` is `true` for the root device, instances might fail the EC2 health check. In
       * that case, Amazon EC2 Auto Scaling launches replacement instances.
       */
      public fun noDevice(noDevice: Boolean)

      /**
       * @param noDevice Setting this value to `true` prevents a volume that is included in the
       * block device mapping of the AMI from being mapped to the specified device name at launch.
       * If `NoDevice` is `true` for the root device, instances might fail the EC2 health check. In
       * that case, Amazon EC2 Auto Scaling launches replacement instances.
       */
      public fun noDevice(noDevice: IResolvable)

      /**
       * @param virtualName The name of the instance store volume (virtual device) to attach to an
       * instance at launch.
       * The name must be in the form ephemeral *X* where *X* is a number starting from zero (0),
       * for example, `ephemeral0` .
       */
      public fun virtualName(virtualName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty.builder()

      /**
       * @param deviceName The device name assigned to the volume (for example, `/dev/sdh` or `xvdh`
       * ). 
       * For more information, see [Device naming on Linux
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html) in the
       * *Amazon EC2 User Guide for Linux Instances* .
       *
       *
       * To define a block device mapping, set the device name and exactly one of the following
       * properties: `Ebs` , `NoDevice` , or `VirtualName` .
       */
      override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      /**
       * @param ebs Information to attach an EBS volume to an instance at launch.
       */
      override fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs.let(IResolvable::unwrap))
      }

      /**
       * @param ebs Information to attach an EBS volume to an instance at launch.
       */
      override fun ebs(ebs: BlockDeviceProperty) {
        cdkBuilder.ebs(ebs.let(BlockDeviceProperty::unwrap))
      }

      /**
       * @param ebs Information to attach an EBS volume to an instance at launch.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("498defb44b04ba985a3da13c5cac0272c5dcbe8289a5c5d25a4116cc88bcada7")
      override fun ebs(ebs: BlockDeviceProperty.Builder.() -> Unit): Unit =
          ebs(BlockDeviceProperty(ebs))

      /**
       * @param noDevice Setting this value to `true` prevents a volume that is included in the
       * block device mapping of the AMI from being mapped to the specified device name at launch.
       * If `NoDevice` is `true` for the root device, instances might fail the EC2 health check. In
       * that case, Amazon EC2 Auto Scaling launches replacement instances.
       */
      override fun noDevice(noDevice: Boolean) {
        cdkBuilder.noDevice(noDevice)
      }

      /**
       * @param noDevice Setting this value to `true` prevents a volume that is included in the
       * block device mapping of the AMI from being mapped to the specified device name at launch.
       * If `NoDevice` is `true` for the root device, instances might fail the EC2 health check. In
       * that case, Amazon EC2 Auto Scaling launches replacement instances.
       */
      override fun noDevice(noDevice: IResolvable) {
        cdkBuilder.noDevice(noDevice.let(IResolvable::unwrap))
      }

      /**
       * @param virtualName The name of the instance store volume (virtual device) to attach to an
       * instance at launch.
       * The name must be in the form ephemeral *X* where *X* is a number starting from zero (0),
       * for example, `ephemeral0` .
       */
      override fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty,
    ) : CdkObject(cdkObject), BlockDeviceMappingProperty {
      /**
       * The device name assigned to the volume (for example, `/dev/sdh` or `xvdh` ).
       *
       * For more information, see [Device naming on Linux
       * instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html) in the
       * *Amazon EC2 User Guide for Linux Instances* .
       *
       *
       * To define a block device mapping, set the device name and exactly one of the following
       * properties: `Ebs` , `NoDevice` , or `VirtualName` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevicemapping.html#cfn-autoscaling-launchconfiguration-blockdevicemapping-devicename)
       */
      override fun deviceName(): String = unwrap(this).getDeviceName()

      /**
       * Information to attach an EBS volume to an instance at launch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevicemapping.html#cfn-autoscaling-launchconfiguration-blockdevicemapping-ebs)
       */
      override fun ebs(): Any? = unwrap(this).getEbs()

      /**
       * Setting this value to `true` prevents a volume that is included in the block device mapping
       * of the AMI from being mapped to the specified device name at launch.
       *
       * If `NoDevice` is `true` for the root device, instances might fail the EC2 health check. In
       * that case, Amazon EC2 Auto Scaling launches replacement instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevicemapping.html#cfn-autoscaling-launchconfiguration-blockdevicemapping-nodevice)
       */
      override fun noDevice(): Any? = unwrap(this).getNoDevice()

      /**
       * The name of the instance store volume (virtual device) to attach to an instance at launch.
       *
       * The name must be in the form ephemeral *X* where *X* is a number starting from zero (0),
       * for example, `ephemeral0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-blockdevicemapping.html#cfn-autoscaling-launchconfiguration-blockdevicemapping-virtualname)
       */
      override fun virtualName(): String? = unwrap(this).getVirtualName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BlockDeviceMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty):
          BlockDeviceMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockDeviceMappingProperty):
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty
    }
  }

  /**
   * `MetadataOptions` is a property of
   * [AWS::AutoScaling::LaunchConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-launchconfiguration.html)
   * that describes metadata options for the instances.
   *
   * For more information, see [Configure the instance metadata
   * options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-config.html#launch-configurations-imds)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.autoscaling.*;
   * MetadataOptionsProperty metadataOptionsProperty = MetadataOptionsProperty.builder()
   * .httpEndpoint("httpEndpoint")
   * .httpPutResponseHopLimit(123)
   * .httpTokens("httpTokens")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-metadataoptions.html)
   */
  public interface MetadataOptionsProperty {
    /**
     * This parameter enables or disables the HTTP metadata endpoint on your instances.
     *
     * If the parameter is not specified, the default state is `enabled` .
     *
     *
     * If you specify a value of `disabled` , you will not be able to access your instance metadata.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-metadataoptions.html#cfn-autoscaling-launchconfiguration-metadataoptions-httpendpoint)
     */
    public fun httpEndpoint(): String? = unwrap(this).getHttpEndpoint()

    /**
     * The desired HTTP PUT response hop limit for instance metadata requests.
     *
     * The larger the number, the further instance metadata requests can travel.
     *
     * Default: 1
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-metadataoptions.html#cfn-autoscaling-launchconfiguration-metadataoptions-httpputresponsehoplimit)
     */
    public fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

    /**
     * The state of token usage for your instance metadata requests.
     *
     * If the parameter is not specified in the request, the default state is `optional` .
     *
     * If the state is `optional` , you can choose to retrieve instance metadata with or without a
     * signed token header on your request. If you retrieve the IAM role credentials without a token,
     * the version 1.0 role credentials are returned. If you retrieve the IAM role credentials using a
     * valid signed token, the version 2.0 role credentials are returned.
     *
     * If the state is `required` , you must send a signed token header with any instance metadata
     * retrieval requests. In this state, retrieving the IAM role credentials always returns the
     * version 2.0 credentials; the version 1.0 credentials are not available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-metadataoptions.html#cfn-autoscaling-launchconfiguration-metadataoptions-httptokens)
     */
    public fun httpTokens(): String? = unwrap(this).getHttpTokens()

    /**
     * A builder for [MetadataOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param httpEndpoint This parameter enables or disables the HTTP metadata endpoint on your
       * instances.
       * If the parameter is not specified, the default state is `enabled` .
       *
       *
       * If you specify a value of `disabled` , you will not be able to access your instance
       * metadata.
       */
      public fun httpEndpoint(httpEndpoint: String)

      /**
       * @param httpPutResponseHopLimit The desired HTTP PUT response hop limit for instance
       * metadata requests.
       * The larger the number, the further instance metadata requests can travel.
       *
       * Default: 1
       */
      public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number)

      /**
       * @param httpTokens The state of token usage for your instance metadata requests.
       * If the parameter is not specified in the request, the default state is `optional` .
       *
       * If the state is `optional` , you can choose to retrieve instance metadata with or without a
       * signed token header on your request. If you retrieve the IAM role credentials without a token,
       * the version 1.0 role credentials are returned. If you retrieve the IAM role credentials using
       * a valid signed token, the version 2.0 role credentials are returned.
       *
       * If the state is `required` , you must send a signed token header with any instance metadata
       * retrieval requests. In this state, retrieving the IAM role credentials always returns the
       * version 2.0 credentials; the version 1.0 credentials are not available.
       */
      public fun httpTokens(httpTokens: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty.builder()

      /**
       * @param httpEndpoint This parameter enables or disables the HTTP metadata endpoint on your
       * instances.
       * If the parameter is not specified, the default state is `enabled` .
       *
       *
       * If you specify a value of `disabled` , you will not be able to access your instance
       * metadata.
       */
      override fun httpEndpoint(httpEndpoint: String) {
        cdkBuilder.httpEndpoint(httpEndpoint)
      }

      /**
       * @param httpPutResponseHopLimit The desired HTTP PUT response hop limit for instance
       * metadata requests.
       * The larger the number, the further instance metadata requests can travel.
       *
       * Default: 1
       */
      override fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
        cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
      }

      /**
       * @param httpTokens The state of token usage for your instance metadata requests.
       * If the parameter is not specified in the request, the default state is `optional` .
       *
       * If the state is `optional` , you can choose to retrieve instance metadata with or without a
       * signed token header on your request. If you retrieve the IAM role credentials without a token,
       * the version 1.0 role credentials are returned. If you retrieve the IAM role credentials using
       * a valid signed token, the version 2.0 role credentials are returned.
       *
       * If the state is `required` , you must send a signed token header with any instance metadata
       * retrieval requests. In this state, retrieving the IAM role credentials always returns the
       * version 2.0 credentials; the version 1.0 credentials are not available.
       */
      override fun httpTokens(httpTokens: String) {
        cdkBuilder.httpTokens(httpTokens)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty,
    ) : CdkObject(cdkObject), MetadataOptionsProperty {
      /**
       * This parameter enables or disables the HTTP metadata endpoint on your instances.
       *
       * If the parameter is not specified, the default state is `enabled` .
       *
       *
       * If you specify a value of `disabled` , you will not be able to access your instance
       * metadata.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-metadataoptions.html#cfn-autoscaling-launchconfiguration-metadataoptions-httpendpoint)
       */
      override fun httpEndpoint(): String? = unwrap(this).getHttpEndpoint()

      /**
       * The desired HTTP PUT response hop limit for instance metadata requests.
       *
       * The larger the number, the further instance metadata requests can travel.
       *
       * Default: 1
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-metadataoptions.html#cfn-autoscaling-launchconfiguration-metadataoptions-httpputresponsehoplimit)
       */
      override fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

      /**
       * The state of token usage for your instance metadata requests.
       *
       * If the parameter is not specified in the request, the default state is `optional` .
       *
       * If the state is `optional` , you can choose to retrieve instance metadata with or without a
       * signed token header on your request. If you retrieve the IAM role credentials without a token,
       * the version 1.0 role credentials are returned. If you retrieve the IAM role credentials using
       * a valid signed token, the version 2.0 role credentials are returned.
       *
       * If the state is `required` , you must send a signed token header with any instance metadata
       * retrieval requests. In this state, retrieving the IAM role credentials always returns the
       * version 2.0 credentials; the version 1.0 credentials are not available.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-launchconfiguration-metadataoptions.html#cfn-autoscaling-launchconfiguration-metadataoptions-httptokens)
       */
      override fun httpTokens(): String? = unwrap(this).getHttpTokens()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetadataOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty):
          MetadataOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetadataOptionsProperty):
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty
    }
  }
}
