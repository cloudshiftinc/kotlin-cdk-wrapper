package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnInstanceProps {
  /**
   * The default AWS OpsWorks Stacks agent version. You have the following options:.
   *
   * * `INHERIT` - Use the stack's default agent version setting.
   * * *version_number* - Use the specified agent version. This value overrides the stack's default
   * setting. To update the agent version, edit the instance configuration and specify a new version.
   * AWS OpsWorks Stacks installs that version on the instance.
   *
   * The default setting is `INHERIT` . To specify an agent version, you must use the complete
   * version number, not the abbreviated number shown on the console. For a list of available agent
   * version numbers, call `DescribeAgentVersions` . AgentVersion cannot be set to Chef 12.2.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-agentversion)
   */
  public fun agentVersion(): String? = unwrap(this).getAgentVersion()

  /**
   * A custom AMI ID to be used to create the instance.
   *
   * The AMI should be based on one of the supported operating systems. For more information, see
   * [Using Custom
   * AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html) .
   *
   *
   * If you specify a custom AMI, you must set `Os` to `Custom` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-amiid)
   */
  public fun amiId(): String? = unwrap(this).getAmiId()

  /**
   * The instance architecture.
   *
   * The default option is `x86_64` . Instance types do not necessarily support both architectures.
   * For a list of the architectures that are supported by the different instance types, see [Instance
   * Families and Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-architecture)
   */
  public fun architecture(): String? = unwrap(this).getArchitecture()

  /**
   * For load-based or time-based instances, the type.
   *
   * Windows stacks can use only time-based instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-autoscalingtype)
   */
  public fun autoScalingType(): String? = unwrap(this).getAutoScalingType()

  /**
   * The Availability Zone of the AWS OpsWorks instance, such as `us-east-2a` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-availabilityzone)
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * An array of `BlockDeviceMapping` objects that specify the instance's block devices.
   *
   * For more information, see [Block Device
   * Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html) .
   * Note that block device mappings are not supported for custom AMIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings)
   */
  public fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

  /**
   * Whether to create an Amazon EBS-optimized instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-ebsoptimized)
   */
  public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

  /**
   * A list of Elastic IP addresses to associate with the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-elasticips)
   */
  public fun elasticIps(): List<String> = unwrap(this).getElasticIps() ?: emptyList()

  /**
   * The instance host name. The following are character limits for instance host names.
   *
   * * Linux-based instances: 63 characters
   * * Windows-based instances: 15 characters
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-hostname)
   */
  public fun hostname(): String? = unwrap(this).getHostname()

  /**
   * Whether to install operating system and package updates when the instance boots.
   *
   * The default value is `true` . To control when updates are installed, set this value to `false`
   * . You must then update your instances manually by using `CreateDeployment` to run the
   * `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or `apt-get`
   * (Ubuntu) on the instances.
   *
   *
   * We strongly recommend using the default value of `true` to ensure that your instances have the
   * latest security updates.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-installupdatesonboot)
   */
  public fun installUpdatesOnBoot(): Any? = unwrap(this).getInstallUpdatesOnBoot()

  /**
   * The instance type, such as `t2.micro` . For a list of supported instance types, open the stack
   * in the console, choose *Instances* , and choose *+ Instance* . The *Size* list contains the
   * currently supported types. For more information, see [Instance Families and
   * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) . The parameter
   * values that you use to specify the various types are in the *API Name* column of the *Available
   * Instance Types* table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-instancetype)
   */
  public fun instanceType(): String

  /**
   * An array that contains the instance's layer IDs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids)
   */
  public fun layerIds(): List<String>

  /**
   * The instance's operating system, which must be set to one of the following.
   *
   * * A supported Linux operating system: An Amazon Linux version, such as `Amazon Linux 2` ,
   * `Amazon Linux 2018.03` , `Amazon Linux 2017.09` , `Amazon Linux 2017.03` , `Amazon Linux 2016.09`
   * , `Amazon Linux 2016.03` , `Amazon Linux 2015.09` , or `Amazon Linux 2015.03` .
   * * A supported Ubuntu operating system, such as `Ubuntu 18.04 LTS` , `Ubuntu 16.04 LTS` ,
   * `Ubuntu 14.04 LTS` , or `Ubuntu 12.04 LTS` .
   * * `CentOS Linux 7`
   * * `Red Hat Enterprise Linux 7`
   * * A supported Windows operating system, such as `Microsoft Windows Server 2012 R2 Base` ,
   * `Microsoft Windows Server 2012 R2 with SQL Server Express` , `Microsoft Windows Server 2012 R2
   * with SQL Server Standard` , or `Microsoft Windows Server 2012 R2 with SQL Server Web` .
   * * A custom AMI: `Custom` .
   *
   * Not all operating systems are supported with all versions of Chef. For more information about
   * the supported operating systems, see [AWS OpsWorks Stacks Operating
   * Systems](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html) .
   *
   * The default option is the current Amazon Linux version. If you set this parameter to `Custom` ,
   * you must use the `CreateInstance` action's AmiId parameter to specify the custom AMI that you want
   * to use. Block device mappings are not supported if the value is `Custom` . For more information
   * about how to use custom AMIs with AWS OpsWorks Stacks, see [Using Custom
   * AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-os)
   */
  public fun os(): String? = unwrap(this).getOs()

  /**
   * The instance root device type.
   *
   * For more information, see [Storage for the Root
   * Device](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-rootdevicetype)
   */
  public fun rootDeviceType(): String? = unwrap(this).getRootDeviceType()

  /**
   * The instance's Amazon EC2 key-pair name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-sshkeyname)
   */
  public fun sshKeyName(): String? = unwrap(this).getSshKeyName()

  /**
   * The stack ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-stackid)
   */
  public fun stackId(): String

  /**
   * The ID of the instance's subnet.
   *
   * If the stack is running in a VPC, you can use this parameter to override the stack's default
   * subnet ID value and direct AWS OpsWorks Stacks to launch the instance in a different subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-subnetid)
   */
  public fun subnetId(): String? = unwrap(this).getSubnetId()

  /**
   * The instance's tenancy option.
   *
   * The default option is no tenancy, or if the instance is running in a VPC, inherit tenancy
   * settings from the VPC. The following are valid values for this parameter: `dedicated` , `default`
   * , or `host` . Because there are costs associated with changes in tenancy options, we recommend
   * that you research tenancy options before choosing them for your instances. For more information
   * about dedicated hosts, see [Dedicated Hosts
   * Overview](https://docs.aws.amazon.com/ec2/dedicated-hosts/) and [Amazon EC2 Dedicated
   * Hosts](https://docs.aws.amazon.com/ec2/dedicated-hosts/) . For more information about dedicated
   * instances, see [Dedicated
   * Instances](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/dedicated-instance.html) and
   * [Amazon EC2 Dedicated
   * Instances](https://docs.aws.amazon.com/ec2/purchasing-options/dedicated-instances/) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-tenancy)
   */
  public fun tenancy(): String? = unwrap(this).getTenancy()

  /**
   * The time-based scaling configuration for the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-timebasedautoscaling)
   */
  public fun timeBasedAutoScaling(): Any? = unwrap(this).getTimeBasedAutoScaling()

  /**
   * The instance's virtualization type, `paravirtual` or `hvm` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-virtualizationtype)
   */
  public fun virtualizationType(): String? = unwrap(this).getVirtualizationType()

  /**
   * A list of AWS OpsWorks volume IDs to associate with the instance.
   *
   * For more information, see
   * [`AWS::OpsWorks::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes)
   */
  public fun volumes(): List<String> = unwrap(this).getVolumes() ?: emptyList()

  /**
   * A builder for [CfnInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param agentVersion The default AWS OpsWorks Stacks agent version. You have the following
     * options:.
     * * `INHERIT` - Use the stack's default agent version setting.
     * * *version_number* - Use the specified agent version. This value overrides the stack's
     * default setting. To update the agent version, edit the instance configuration and specify a new
     * version. AWS OpsWorks Stacks installs that version on the instance.
     *
     * The default setting is `INHERIT` . To specify an agent version, you must use the complete
     * version number, not the abbreviated number shown on the console. For a list of available agent
     * version numbers, call `DescribeAgentVersions` . AgentVersion cannot be set to Chef 12.2.
     */
    public fun agentVersion(agentVersion: String)

    /**
     * @param amiId A custom AMI ID to be used to create the instance.
     * The AMI should be based on one of the supported operating systems. For more information, see
     * [Using Custom
     * AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html) .
     *
     *
     * If you specify a custom AMI, you must set `Os` to `Custom` .
     */
    public fun amiId(amiId: String)

    /**
     * @param architecture The instance architecture.
     * The default option is `x86_64` . Instance types do not necessarily support both
     * architectures. For a list of the architectures that are supported by the different instance
     * types, see [Instance Families and
     * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) .
     */
    public fun architecture(architecture: String)

    /**
     * @param autoScalingType For load-based or time-based instances, the type.
     * Windows stacks can use only time-based instances.
     */
    public fun autoScalingType(autoScalingType: String)

    /**
     * @param availabilityZone The Availability Zone of the AWS OpsWorks instance, such as
     * `us-east-2a` .
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param blockDeviceMappings An array of `BlockDeviceMapping` objects that specify the
     * instance's block devices.
     * For more information, see [Block Device
     * Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * . Note that block device mappings are not supported for custom AMIs.
     */
    public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

    /**
     * @param blockDeviceMappings An array of `BlockDeviceMapping` objects that specify the
     * instance's block devices.
     * For more information, see [Block Device
     * Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * . Note that block device mappings are not supported for custom AMIs.
     */
    public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

    /**
     * @param blockDeviceMappings An array of `BlockDeviceMapping` objects that specify the
     * instance's block devices.
     * For more information, see [Block Device
     * Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * . Note that block device mappings are not supported for custom AMIs.
     */
    public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

    /**
     * @param ebsOptimized Whether to create an Amazon EBS-optimized instance.
     */
    public fun ebsOptimized(ebsOptimized: Boolean)

    /**
     * @param ebsOptimized Whether to create an Amazon EBS-optimized instance.
     */
    public fun ebsOptimized(ebsOptimized: IResolvable)

    /**
     * @param elasticIps A list of Elastic IP addresses to associate with the instance.
     */
    public fun elasticIps(elasticIps: List<String>)

    /**
     * @param elasticIps A list of Elastic IP addresses to associate with the instance.
     */
    public fun elasticIps(vararg elasticIps: String)

    /**
     * @param hostname The instance host name. The following are character limits for instance host
     * names.
     * * Linux-based instances: 63 characters
     * * Windows-based instances: 15 characters
     */
    public fun hostname(hostname: String)

    /**
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     * instance boots.
     * The default value is `true` . To control when updates are installed, set this value to
     * `false` . You must then update your instances manually by using `CreateDeployment` to run the
     * `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or `apt-get`
     * (Ubuntu) on the instances.
     *
     *
     * We strongly recommend using the default value of `true` to ensure that your instances have
     * the latest security updates.
     */
    public fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean)

    /**
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     * instance boots.
     * The default value is `true` . To control when updates are installed, set this value to
     * `false` . You must then update your instances manually by using `CreateDeployment` to run the
     * `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or `apt-get`
     * (Ubuntu) on the instances.
     *
     *
     * We strongly recommend using the default value of `true` to ensure that your instances have
     * the latest security updates.
     */
    public fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable)

    /**
     * @param instanceType The instance type, such as `t2.micro` . For a list of supported instance
     * types, open the stack in the console, choose *Instances* , and choose *+ Instance* . The *Size*
     * list contains the currently supported types. For more information, see [Instance Families and
     * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) . The parameter
     * values that you use to specify the various types are in the *API Name* column of the *Available
     * Instance Types* table. 
     */
    public fun instanceType(instanceType: String)

    /**
     * @param layerIds An array that contains the instance's layer IDs. 
     */
    public fun layerIds(layerIds: List<String>)

    /**
     * @param layerIds An array that contains the instance's layer IDs. 
     */
    public fun layerIds(vararg layerIds: String)

    /**
     * @param os The instance's operating system, which must be set to one of the following.
     * * A supported Linux operating system: An Amazon Linux version, such as `Amazon Linux 2` ,
     * `Amazon Linux 2018.03` , `Amazon Linux 2017.09` , `Amazon Linux 2017.03` , `Amazon Linux
     * 2016.09` , `Amazon Linux 2016.03` , `Amazon Linux 2015.09` , or `Amazon Linux 2015.03` .
     * * A supported Ubuntu operating system, such as `Ubuntu 18.04 LTS` , `Ubuntu 16.04 LTS` ,
     * `Ubuntu 14.04 LTS` , or `Ubuntu 12.04 LTS` .
     * * `CentOS Linux 7`
     * * `Red Hat Enterprise Linux 7`
     * * A supported Windows operating system, such as `Microsoft Windows Server 2012 R2 Base` ,
     * `Microsoft Windows Server 2012 R2 with SQL Server Express` , `Microsoft Windows Server 2012 R2
     * with SQL Server Standard` , or `Microsoft Windows Server 2012 R2 with SQL Server Web` .
     * * A custom AMI: `Custom` .
     *
     * Not all operating systems are supported with all versions of Chef. For more information about
     * the supported operating systems, see [AWS OpsWorks Stacks Operating
     * Systems](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html) .
     *
     * The default option is the current Amazon Linux version. If you set this parameter to `Custom`
     * , you must use the `CreateInstance` action's AmiId parameter to specify the custom AMI that you
     * want to use. Block device mappings are not supported if the value is `Custom` . For more
     * information about how to use custom AMIs with AWS OpsWorks Stacks, see [Using Custom
     * AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html) .
     */
    public fun os(os: String)

    /**
     * @param rootDeviceType The instance root device type.
     * For more information, see [Storage for the Root
     * Device](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device)
     * .
     */
    public fun rootDeviceType(rootDeviceType: String)

    /**
     * @param sshKeyName The instance's Amazon EC2 key-pair name.
     */
    public fun sshKeyName(sshKeyName: String)

    /**
     * @param stackId The stack ID. 
     */
    public fun stackId(stackId: String)

    /**
     * @param subnetId The ID of the instance's subnet.
     * If the stack is running in a VPC, you can use this parameter to override the stack's default
     * subnet ID value and direct AWS OpsWorks Stacks to launch the instance in a different subnet.
     */
    public fun subnetId(subnetId: String)

    /**
     * @param tenancy The instance's tenancy option.
     * The default option is no tenancy, or if the instance is running in a VPC, inherit tenancy
     * settings from the VPC. The following are valid values for this parameter: `dedicated` ,
     * `default` , or `host` . Because there are costs associated with changes in tenancy options, we
     * recommend that you research tenancy options before choosing them for your instances. For more
     * information about dedicated hosts, see [Dedicated Hosts
     * Overview](https://docs.aws.amazon.com/ec2/dedicated-hosts/) and [Amazon EC2 Dedicated
     * Hosts](https://docs.aws.amazon.com/ec2/dedicated-hosts/) . For more information about dedicated
     * instances, see [Dedicated
     * Instances](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/dedicated-instance.html) and
     * [Amazon EC2 Dedicated
     * Instances](https://docs.aws.amazon.com/ec2/purchasing-options/dedicated-instances/) .
     */
    public fun tenancy(tenancy: String)

    /**
     * @param timeBasedAutoScaling The time-based scaling configuration for the instance.
     */
    public fun timeBasedAutoScaling(timeBasedAutoScaling: IResolvable)

    /**
     * @param timeBasedAutoScaling The time-based scaling configuration for the instance.
     */
    public fun timeBasedAutoScaling(timeBasedAutoScaling: CfnInstance.TimeBasedAutoScalingProperty)

    /**
     * @param timeBasedAutoScaling The time-based scaling configuration for the instance.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78908fc3d57a2e5b331db7422ac4c6ad1a3ef857a2616c89131eb06385e3790d")
    public
        fun timeBasedAutoScaling(timeBasedAutoScaling: CfnInstance.TimeBasedAutoScalingProperty.Builder.() -> Unit)

    /**
     * @param virtualizationType The instance's virtualization type, `paravirtual` or `hvm` .
     */
    public fun virtualizationType(virtualizationType: String)

    /**
     * @param volumes A list of AWS OpsWorks volume IDs to associate with the instance.
     * For more information, see
     * [`AWS::OpsWorks::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
     * .
     */
    public fun volumes(volumes: List<String>)

    /**
     * @param volumes A list of AWS OpsWorks volume IDs to associate with the instance.
     * For more information, see
     * [`AWS::OpsWorks::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
     * .
     */
    public fun volumes(vararg volumes: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder =
        software.amazon.awscdk.services.opsworks.CfnInstanceProps.builder()

    /**
     * @param agentVersion The default AWS OpsWorks Stacks agent version. You have the following
     * options:.
     * * `INHERIT` - Use the stack's default agent version setting.
     * * *version_number* - Use the specified agent version. This value overrides the stack's
     * default setting. To update the agent version, edit the instance configuration and specify a new
     * version. AWS OpsWorks Stacks installs that version on the instance.
     *
     * The default setting is `INHERIT` . To specify an agent version, you must use the complete
     * version number, not the abbreviated number shown on the console. For a list of available agent
     * version numbers, call `DescribeAgentVersions` . AgentVersion cannot be set to Chef 12.2.
     */
    override fun agentVersion(agentVersion: String) {
      cdkBuilder.agentVersion(agentVersion)
    }

    /**
     * @param amiId A custom AMI ID to be used to create the instance.
     * The AMI should be based on one of the supported operating systems. For more information, see
     * [Using Custom
     * AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html) .
     *
     *
     * If you specify a custom AMI, you must set `Os` to `Custom` .
     */
    override fun amiId(amiId: String) {
      cdkBuilder.amiId(amiId)
    }

    /**
     * @param architecture The instance architecture.
     * The default option is `x86_64` . Instance types do not necessarily support both
     * architectures. For a list of the architectures that are supported by the different instance
     * types, see [Instance Families and
     * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) .
     */
    override fun architecture(architecture: String) {
      cdkBuilder.architecture(architecture)
    }

    /**
     * @param autoScalingType For load-based or time-based instances, the type.
     * Windows stacks can use only time-based instances.
     */
    override fun autoScalingType(autoScalingType: String) {
      cdkBuilder.autoScalingType(autoScalingType)
    }

    /**
     * @param availabilityZone The Availability Zone of the AWS OpsWorks instance, such as
     * `us-east-2a` .
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param blockDeviceMappings An array of `BlockDeviceMapping` objects that specify the
     * instance's block devices.
     * For more information, see [Block Device
     * Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * . Note that block device mappings are not supported for custom AMIs.
     */
    override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable::unwrap))
    }

    /**
     * @param blockDeviceMappings An array of `BlockDeviceMapping` objects that specify the
     * instance's block devices.
     * For more information, see [Block Device
     * Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * . Note that block device mappings are not supported for custom AMIs.
     */
    override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    /**
     * @param blockDeviceMappings An array of `BlockDeviceMapping` objects that specify the
     * instance's block devices.
     * For more information, see [Block Device
     * Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * . Note that block device mappings are not supported for custom AMIs.
     */
    override fun blockDeviceMappings(vararg blockDeviceMappings: Any): Unit =
        blockDeviceMappings(blockDeviceMappings.toList())

    /**
     * @param ebsOptimized Whether to create an Amazon EBS-optimized instance.
     */
    override fun ebsOptimized(ebsOptimized: Boolean) {
      cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /**
     * @param ebsOptimized Whether to create an Amazon EBS-optimized instance.
     */
    override fun ebsOptimized(ebsOptimized: IResolvable) {
      cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
    }

    /**
     * @param elasticIps A list of Elastic IP addresses to associate with the instance.
     */
    override fun elasticIps(elasticIps: List<String>) {
      cdkBuilder.elasticIps(elasticIps)
    }

    /**
     * @param elasticIps A list of Elastic IP addresses to associate with the instance.
     */
    override fun elasticIps(vararg elasticIps: String): Unit = elasticIps(elasticIps.toList())

    /**
     * @param hostname The instance host name. The following are character limits for instance host
     * names.
     * * Linux-based instances: 63 characters
     * * Windows-based instances: 15 characters
     */
    override fun hostname(hostname: String) {
      cdkBuilder.hostname(hostname)
    }

    /**
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     * instance boots.
     * The default value is `true` . To control when updates are installed, set this value to
     * `false` . You must then update your instances manually by using `CreateDeployment` to run the
     * `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or `apt-get`
     * (Ubuntu) on the instances.
     *
     *
     * We strongly recommend using the default value of `true` to ensure that your instances have
     * the latest security updates.
     */
    override fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean) {
      cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
    }

    /**
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     * instance boots.
     * The default value is `true` . To control when updates are installed, set this value to
     * `false` . You must then update your instances manually by using `CreateDeployment` to run the
     * `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or `apt-get`
     * (Ubuntu) on the instances.
     *
     *
     * We strongly recommend using the default value of `true` to ensure that your instances have
     * the latest security updates.
     */
    override fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable) {
      cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot.let(IResolvable::unwrap))
    }

    /**
     * @param instanceType The instance type, such as `t2.micro` . For a list of supported instance
     * types, open the stack in the console, choose *Instances* , and choose *+ Instance* . The *Size*
     * list contains the currently supported types. For more information, see [Instance Families and
     * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) . The parameter
     * values that you use to specify the various types are in the *API Name* column of the *Available
     * Instance Types* table. 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param layerIds An array that contains the instance's layer IDs. 
     */
    override fun layerIds(layerIds: List<String>) {
      cdkBuilder.layerIds(layerIds)
    }

    /**
     * @param layerIds An array that contains the instance's layer IDs. 
     */
    override fun layerIds(vararg layerIds: String): Unit = layerIds(layerIds.toList())

    /**
     * @param os The instance's operating system, which must be set to one of the following.
     * * A supported Linux operating system: An Amazon Linux version, such as `Amazon Linux 2` ,
     * `Amazon Linux 2018.03` , `Amazon Linux 2017.09` , `Amazon Linux 2017.03` , `Amazon Linux
     * 2016.09` , `Amazon Linux 2016.03` , `Amazon Linux 2015.09` , or `Amazon Linux 2015.03` .
     * * A supported Ubuntu operating system, such as `Ubuntu 18.04 LTS` , `Ubuntu 16.04 LTS` ,
     * `Ubuntu 14.04 LTS` , or `Ubuntu 12.04 LTS` .
     * * `CentOS Linux 7`
     * * `Red Hat Enterprise Linux 7`
     * * A supported Windows operating system, such as `Microsoft Windows Server 2012 R2 Base` ,
     * `Microsoft Windows Server 2012 R2 with SQL Server Express` , `Microsoft Windows Server 2012 R2
     * with SQL Server Standard` , or `Microsoft Windows Server 2012 R2 with SQL Server Web` .
     * * A custom AMI: `Custom` .
     *
     * Not all operating systems are supported with all versions of Chef. For more information about
     * the supported operating systems, see [AWS OpsWorks Stacks Operating
     * Systems](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html) .
     *
     * The default option is the current Amazon Linux version. If you set this parameter to `Custom`
     * , you must use the `CreateInstance` action's AmiId parameter to specify the custom AMI that you
     * want to use. Block device mappings are not supported if the value is `Custom` . For more
     * information about how to use custom AMIs with AWS OpsWorks Stacks, see [Using Custom
     * AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html) .
     */
    override fun os(os: String) {
      cdkBuilder.os(os)
    }

    /**
     * @param rootDeviceType The instance root device type.
     * For more information, see [Storage for the Root
     * Device](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device)
     * .
     */
    override fun rootDeviceType(rootDeviceType: String) {
      cdkBuilder.rootDeviceType(rootDeviceType)
    }

    /**
     * @param sshKeyName The instance's Amazon EC2 key-pair name.
     */
    override fun sshKeyName(sshKeyName: String) {
      cdkBuilder.sshKeyName(sshKeyName)
    }

    /**
     * @param stackId The stack ID. 
     */
    override fun stackId(stackId: String) {
      cdkBuilder.stackId(stackId)
    }

    /**
     * @param subnetId The ID of the instance's subnet.
     * If the stack is running in a VPC, you can use this parameter to override the stack's default
     * subnet ID value and direct AWS OpsWorks Stacks to launch the instance in a different subnet.
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * @param tenancy The instance's tenancy option.
     * The default option is no tenancy, or if the instance is running in a VPC, inherit tenancy
     * settings from the VPC. The following are valid values for this parameter: `dedicated` ,
     * `default` , or `host` . Because there are costs associated with changes in tenancy options, we
     * recommend that you research tenancy options before choosing them for your instances. For more
     * information about dedicated hosts, see [Dedicated Hosts
     * Overview](https://docs.aws.amazon.com/ec2/dedicated-hosts/) and [Amazon EC2 Dedicated
     * Hosts](https://docs.aws.amazon.com/ec2/dedicated-hosts/) . For more information about dedicated
     * instances, see [Dedicated
     * Instances](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/dedicated-instance.html) and
     * [Amazon EC2 Dedicated
     * Instances](https://docs.aws.amazon.com/ec2/purchasing-options/dedicated-instances/) .
     */
    override fun tenancy(tenancy: String) {
      cdkBuilder.tenancy(tenancy)
    }

    /**
     * @param timeBasedAutoScaling The time-based scaling configuration for the instance.
     */
    override fun timeBasedAutoScaling(timeBasedAutoScaling: IResolvable) {
      cdkBuilder.timeBasedAutoScaling(timeBasedAutoScaling.let(IResolvable::unwrap))
    }

    /**
     * @param timeBasedAutoScaling The time-based scaling configuration for the instance.
     */
    override
        fun timeBasedAutoScaling(timeBasedAutoScaling: CfnInstance.TimeBasedAutoScalingProperty) {
      cdkBuilder.timeBasedAutoScaling(timeBasedAutoScaling.let(CfnInstance.TimeBasedAutoScalingProperty::unwrap))
    }

    /**
     * @param timeBasedAutoScaling The time-based scaling configuration for the instance.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78908fc3d57a2e5b331db7422ac4c6ad1a3ef857a2616c89131eb06385e3790d")
    override
        fun timeBasedAutoScaling(timeBasedAutoScaling: CfnInstance.TimeBasedAutoScalingProperty.Builder.() -> Unit):
        Unit = timeBasedAutoScaling(CfnInstance.TimeBasedAutoScalingProperty(timeBasedAutoScaling))

    /**
     * @param virtualizationType The instance's virtualization type, `paravirtual` or `hvm` .
     */
    override fun virtualizationType(virtualizationType: String) {
      cdkBuilder.virtualizationType(virtualizationType)
    }

    /**
     * @param volumes A list of AWS OpsWorks volume IDs to associate with the instance.
     * For more information, see
     * [`AWS::OpsWorks::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
     * .
     */
    override fun volumes(volumes: List<String>) {
      cdkBuilder.volumes(volumes)
    }

    /**
     * @param volumes A list of AWS OpsWorks volume IDs to associate with the instance.
     * For more information, see
     * [`AWS::OpsWorks::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
     * .
     */
    override fun volumes(vararg volumes: String): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.opsworks.CfnInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opsworks.CfnInstanceProps,
  ) : CdkObject(cdkObject), CfnInstanceProps {
    /**
     * The default AWS OpsWorks Stacks agent version. You have the following options:.
     *
     * * `INHERIT` - Use the stack's default agent version setting.
     * * *version_number* - Use the specified agent version. This value overrides the stack's
     * default setting. To update the agent version, edit the instance configuration and specify a new
     * version. AWS OpsWorks Stacks installs that version on the instance.
     *
     * The default setting is `INHERIT` . To specify an agent version, you must use the complete
     * version number, not the abbreviated number shown on the console. For a list of available agent
     * version numbers, call `DescribeAgentVersions` . AgentVersion cannot be set to Chef 12.2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-agentversion)
     */
    override fun agentVersion(): String? = unwrap(this).getAgentVersion()

    /**
     * A custom AMI ID to be used to create the instance.
     *
     * The AMI should be based on one of the supported operating systems. For more information, see
     * [Using Custom
     * AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html) .
     *
     *
     * If you specify a custom AMI, you must set `Os` to `Custom` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-amiid)
     */
    override fun amiId(): String? = unwrap(this).getAmiId()

    /**
     * The instance architecture.
     *
     * The default option is `x86_64` . Instance types do not necessarily support both
     * architectures. For a list of the architectures that are supported by the different instance
     * types, see [Instance Families and
     * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-architecture)
     */
    override fun architecture(): String? = unwrap(this).getArchitecture()

    /**
     * For load-based or time-based instances, the type.
     *
     * Windows stacks can use only time-based instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-autoscalingtype)
     */
    override fun autoScalingType(): String? = unwrap(this).getAutoScalingType()

    /**
     * The Availability Zone of the AWS OpsWorks instance, such as `us-east-2a` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-availabilityzone)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * An array of `BlockDeviceMapping` objects that specify the instance's block devices.
     *
     * For more information, see [Block Device
     * Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     * . Note that block device mappings are not supported for custom AMIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings)
     */
    override fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

    /**
     * Whether to create an Amazon EBS-optimized instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-ebsoptimized)
     */
    override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    /**
     * A list of Elastic IP addresses to associate with the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-elasticips)
     */
    override fun elasticIps(): List<String> = unwrap(this).getElasticIps() ?: emptyList()

    /**
     * The instance host name. The following are character limits for instance host names.
     *
     * * Linux-based instances: 63 characters
     * * Windows-based instances: 15 characters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-hostname)
     */
    override fun hostname(): String? = unwrap(this).getHostname()

    /**
     * Whether to install operating system and package updates when the instance boots.
     *
     * The default value is `true` . To control when updates are installed, set this value to
     * `false` . You must then update your instances manually by using `CreateDeployment` to run the
     * `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or `apt-get`
     * (Ubuntu) on the instances.
     *
     *
     * We strongly recommend using the default value of `true` to ensure that your instances have
     * the latest security updates.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-installupdatesonboot)
     */
    override fun installUpdatesOnBoot(): Any? = unwrap(this).getInstallUpdatesOnBoot()

    /**
     * The instance type, such as `t2.micro` . For a list of supported instance types, open the
     * stack in the console, choose *Instances* , and choose *+ Instance* . The *Size* list contains
     * the currently supported types. For more information, see [Instance Families and
     * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html) . The parameter
     * values that you use to specify the various types are in the *API Name* column of the *Available
     * Instance Types* table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-instancetype)
     */
    override fun instanceType(): String = unwrap(this).getInstanceType()

    /**
     * An array that contains the instance's layer IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids)
     */
    override fun layerIds(): List<String> = unwrap(this).getLayerIds()

    /**
     * The instance's operating system, which must be set to one of the following.
     *
     * * A supported Linux operating system: An Amazon Linux version, such as `Amazon Linux 2` ,
     * `Amazon Linux 2018.03` , `Amazon Linux 2017.09` , `Amazon Linux 2017.03` , `Amazon Linux
     * 2016.09` , `Amazon Linux 2016.03` , `Amazon Linux 2015.09` , or `Amazon Linux 2015.03` .
     * * A supported Ubuntu operating system, such as `Ubuntu 18.04 LTS` , `Ubuntu 16.04 LTS` ,
     * `Ubuntu 14.04 LTS` , or `Ubuntu 12.04 LTS` .
     * * `CentOS Linux 7`
     * * `Red Hat Enterprise Linux 7`
     * * A supported Windows operating system, such as `Microsoft Windows Server 2012 R2 Base` ,
     * `Microsoft Windows Server 2012 R2 with SQL Server Express` , `Microsoft Windows Server 2012 R2
     * with SQL Server Standard` , or `Microsoft Windows Server 2012 R2 with SQL Server Web` .
     * * A custom AMI: `Custom` .
     *
     * Not all operating systems are supported with all versions of Chef. For more information about
     * the supported operating systems, see [AWS OpsWorks Stacks Operating
     * Systems](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html) .
     *
     * The default option is the current Amazon Linux version. If you set this parameter to `Custom`
     * , you must use the `CreateInstance` action's AmiId parameter to specify the custom AMI that you
     * want to use. Block device mappings are not supported if the value is `Custom` . For more
     * information about how to use custom AMIs with AWS OpsWorks Stacks, see [Using Custom
     * AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-os)
     */
    override fun os(): String? = unwrap(this).getOs()

    /**
     * The instance root device type.
     *
     * For more information, see [Storage for the Root
     * Device](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-rootdevicetype)
     */
    override fun rootDeviceType(): String? = unwrap(this).getRootDeviceType()

    /**
     * The instance's Amazon EC2 key-pair name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-sshkeyname)
     */
    override fun sshKeyName(): String? = unwrap(this).getSshKeyName()

    /**
     * The stack ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-stackid)
     */
    override fun stackId(): String = unwrap(this).getStackId()

    /**
     * The ID of the instance's subnet.
     *
     * If the stack is running in a VPC, you can use this parameter to override the stack's default
     * subnet ID value and direct AWS OpsWorks Stacks to launch the instance in a different subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-subnetid)
     */
    override fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * The instance's tenancy option.
     *
     * The default option is no tenancy, or if the instance is running in a VPC, inherit tenancy
     * settings from the VPC. The following are valid values for this parameter: `dedicated` ,
     * `default` , or `host` . Because there are costs associated with changes in tenancy options, we
     * recommend that you research tenancy options before choosing them for your instances. For more
     * information about dedicated hosts, see [Dedicated Hosts
     * Overview](https://docs.aws.amazon.com/ec2/dedicated-hosts/) and [Amazon EC2 Dedicated
     * Hosts](https://docs.aws.amazon.com/ec2/dedicated-hosts/) . For more information about dedicated
     * instances, see [Dedicated
     * Instances](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/dedicated-instance.html) and
     * [Amazon EC2 Dedicated
     * Instances](https://docs.aws.amazon.com/ec2/purchasing-options/dedicated-instances/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-tenancy)
     */
    override fun tenancy(): String? = unwrap(this).getTenancy()

    /**
     * The time-based scaling configuration for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-timebasedautoscaling)
     */
    override fun timeBasedAutoScaling(): Any? = unwrap(this).getTimeBasedAutoScaling()

    /**
     * The instance's virtualization type, `paravirtual` or `hvm` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-virtualizationtype)
     */
    override fun virtualizationType(): String? = unwrap(this).getVirtualizationType()

    /**
     * A list of AWS OpsWorks volume IDs to associate with the instance.
     *
     * For more information, see
     * [`AWS::OpsWorks::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes)
     */
    override fun volumes(): List<String> = unwrap(this).getVolumes() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnInstanceProps):
        CfnInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProps):
        software.amazon.awscdk.services.opsworks.CfnInstanceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.opsworks.CfnInstanceProps
  }
}
