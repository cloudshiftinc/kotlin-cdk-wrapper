package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstance
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.opsworks.CfnInstance,
) : CfnResource(cdkObject), IInspectable {
    /**
     * The default AWS OpsWorks Stacks agent version.
     *
     * You have the following options:.
     */
    public open fun agentVersion(): String? = unwrap(this).getAgentVersion()

    /**
     * The default AWS OpsWorks Stacks agent version.
     *
     * You have the following options:.
     */
    public open fun agentVersion(`value`: String) {
        unwrap(this).setAgentVersion(`value`)
    }

    /** A custom AMI ID to be used to create the instance. */
    public open fun amiId(): String? = unwrap(this).getAmiId()

    /** A custom AMI ID to be used to create the instance. */
    public open fun amiId(`value`: String) {
        unwrap(this).setAmiId(`value`)
    }

    /** The instance architecture. */
    public open fun architecture(): String? = unwrap(this).getArchitecture()

    /** The instance architecture. */
    public open fun architecture(`value`: String) {
        unwrap(this).setArchitecture(`value`)
    }

    /** The Availability Zone of the AWS OpsWorks instance, such as `us-east-2a` . */
    public open fun attrAvailabilityZone(): String = unwrap(this).getAttrAvailabilityZone()

    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** The private DNS name of the AWS OpsWorks instance. */
    public open fun attrPrivateDnsName(): String = unwrap(this).getAttrPrivateDnsName()

    /** The private IP address of the AWS OpsWorks instance, such as `192.0.2.0` . */
    public open fun attrPrivateIp(): String = unwrap(this).getAttrPrivateIp()

    /** The public DNS name of the AWS OpsWorks instance. */
    public open fun attrPublicDnsName(): String = unwrap(this).getAttrPublicDnsName()

    /**
     * The public IP address of the AWS OpsWorks instance, such as `192.0.2.0` .
     *
     * Use this attribute only when the AWS OpsWorks instance is in an AWS OpsWorks layer that
     * auto-assigns public IP addresses.
     */
    public open fun attrPublicIp(): String = unwrap(this).getAttrPublicIp()

    /** For load-based or time-based instances, the type. */
    public open fun autoScalingType(): String? = unwrap(this).getAutoScalingType()

    /** For load-based or time-based instances, the type. */
    public open fun autoScalingType(`value`: String) {
        unwrap(this).setAutoScalingType(`value`)
    }

    /** The Availability Zone of the AWS OpsWorks instance, such as `us-east-2a` . */
    public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /** The Availability Zone of the AWS OpsWorks instance, such as `us-east-2a` . */
    public open fun availabilityZone(`value`: String) {
        unwrap(this).setAvailabilityZone(`value`)
    }

    /** An array of `BlockDeviceMapping` objects that specify the instance's block devices. */
    public open fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

    /** An array of `BlockDeviceMapping` objects that specify the instance's block devices. */
    public open fun blockDeviceMappings(`value`: IResolvable) {
        unwrap(this).setBlockDeviceMappings(`value`.let(IResolvable::unwrap))
    }

    /** An array of `BlockDeviceMapping` objects that specify the instance's block devices. */
    public open fun blockDeviceMappings(__idx_ac66f0: List<Any>) {
        unwrap(this).setBlockDeviceMappings(__idx_ac66f0)
    }

    /** An array of `BlockDeviceMapping` objects that specify the instance's block devices. */
    public open fun blockDeviceMappings(vararg __idx_ac66f0: Any): Unit =
        blockDeviceMappings(__idx_ac66f0.toList())

    /** Whether to create an Amazon EBS-optimized instance. */
    public open fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    /** Whether to create an Amazon EBS-optimized instance. */
    public open fun ebsOptimized(`value`: Boolean) {
        unwrap(this).setEbsOptimized(`value`)
    }

    /** Whether to create an Amazon EBS-optimized instance. */
    public open fun ebsOptimized(`value`: IResolvable) {
        unwrap(this).setEbsOptimized(`value`.let(IResolvable::unwrap))
    }

    /** A list of Elastic IP addresses to associate with the instance. */
    public open fun elasticIps(): List<String> = unwrap(this).getElasticIps() ?: emptyList()

    /** A list of Elastic IP addresses to associate with the instance. */
    public open fun elasticIps(`value`: List<String>) {
        unwrap(this).setElasticIps(`value`)
    }

    /** A list of Elastic IP addresses to associate with the instance. */
    public open fun elasticIps(vararg `value`: String): Unit = elasticIps(`value`.toList())

    /**
     * The instance host name.
     *
     * The following are character limits for instance host names.
     */
    public open fun hostname(): String? = unwrap(this).getHostname()

    /**
     * The instance host name.
     *
     * The following are character limits for instance host names.
     */
    public open fun hostname(`value`: String) {
        unwrap(this).setHostname(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** Whether to install operating system and package updates when the instance boots. */
    public open fun installUpdatesOnBoot(): Any? = unwrap(this).getInstallUpdatesOnBoot()

    /** Whether to install operating system and package updates when the instance boots. */
    public open fun installUpdatesOnBoot(`value`: Boolean) {
        unwrap(this).setInstallUpdatesOnBoot(`value`)
    }

    /** Whether to install operating system and package updates when the instance boots. */
    public open fun installUpdatesOnBoot(`value`: IResolvable) {
        unwrap(this).setInstallUpdatesOnBoot(`value`.let(IResolvable::unwrap))
    }

    /**
     * The instance type, such as `t2.micro` . For a list of supported instance types, open the
     * stack in the console, choose *Instances* , and choose *+ Instance* . The *Size* list contains
     * the currently supported types. For more information, see
     * [Instance Families and Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html)
     * . The parameter values that you use to specify the various types are in the *API Name* column
     * of the *Available Instance Types* table.
     */
    public open fun instanceType(): String = unwrap(this).getInstanceType()

    /**
     * The instance type, such as `t2.micro` . For a list of supported instance types, open the
     * stack in the console, choose *Instances* , and choose *+ Instance* . The *Size* list contains
     * the currently supported types. For more information, see
     * [Instance Families and Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html)
     * . The parameter values that you use to specify the various types are in the *API Name* column
     * of the *Available Instance Types* table.
     */
    public open fun instanceType(`value`: String) {
        unwrap(this).setInstanceType(`value`)
    }

    /** An array that contains the instance's layer IDs. */
    public open fun layerIds(): List<String> = unwrap(this).getLayerIds()

    /** An array that contains the instance's layer IDs. */
    public open fun layerIds(`value`: List<String>) {
        unwrap(this).setLayerIds(`value`)
    }

    /** An array that contains the instance's layer IDs. */
    public open fun layerIds(vararg `value`: String): Unit = layerIds(`value`.toList())

    /** The instance's operating system, which must be set to one of the following. */
    public open fun os(): String? = unwrap(this).getOs()

    /** The instance's operating system, which must be set to one of the following. */
    public open fun os(`value`: String) {
        unwrap(this).setOs(`value`)
    }

    /** The instance root device type. */
    public open fun rootDeviceType(): String? = unwrap(this).getRootDeviceType()

    /** The instance root device type. */
    public open fun rootDeviceType(`value`: String) {
        unwrap(this).setRootDeviceType(`value`)
    }

    /** The instance's Amazon EC2 key-pair name. */
    public open fun sshKeyName(): String? = unwrap(this).getSshKeyName()

    /** The instance's Amazon EC2 key-pair name. */
    public open fun sshKeyName(`value`: String) {
        unwrap(this).setSshKeyName(`value`)
    }

    /** The stack ID. */
    public open fun stackId(): String = unwrap(this).getStackId()

    /** The stack ID. */
    public open fun stackId(`value`: String) {
        unwrap(this).setStackId(`value`)
    }

    /** The ID of the instance's subnet. */
    public open fun subnetId(): String? = unwrap(this).getSubnetId()

    /** The ID of the instance's subnet. */
    public open fun subnetId(`value`: String) {
        unwrap(this).setSubnetId(`value`)
    }

    /** The instance's tenancy option. */
    public open fun tenancy(): String? = unwrap(this).getTenancy()

    /** The instance's tenancy option. */
    public open fun tenancy(`value`: String) {
        unwrap(this).setTenancy(`value`)
    }

    /** The time-based scaling configuration for the instance. */
    public open fun timeBasedAutoScaling(): Any? = unwrap(this).getTimeBasedAutoScaling()

    /** The time-based scaling configuration for the instance. */
    public open fun timeBasedAutoScaling(`value`: IResolvable) {
        unwrap(this).setTimeBasedAutoScaling(`value`.let(IResolvable::unwrap))
    }

    /** The time-based scaling configuration for the instance. */
    public open fun timeBasedAutoScaling(`value`: TimeBasedAutoScalingProperty) {
        unwrap(this).setTimeBasedAutoScaling(`value`.let(TimeBasedAutoScalingProperty::unwrap))
    }

    /** The time-based scaling configuration for the instance. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f521e5bdafa2648c29e002efc36f16affce3d77183cfea885aa91c3070deecb6")
    public open fun timeBasedAutoScaling(
        `value`: TimeBasedAutoScalingProperty.Builder.() -> Unit
    ): Unit = timeBasedAutoScaling(TimeBasedAutoScalingProperty(`value`))

    /** The instance's virtualization type, `paravirtual` or `hvm` . */
    public open fun virtualizationType(): String? = unwrap(this).getVirtualizationType()

    /** The instance's virtualization type, `paravirtual` or `hvm` . */
    public open fun virtualizationType(`value`: String) {
        unwrap(this).setVirtualizationType(`value`)
    }

    /** A list of AWS OpsWorks volume IDs to associate with the instance. */
    public open fun volumes(): List<String> = unwrap(this).getVolumes() ?: emptyList()

    /** A list of AWS OpsWorks volume IDs to associate with the instance. */
    public open fun volumes(`value`: List<String>) {
        unwrap(this).setVolumes(`value`)
    }

    /** A list of AWS OpsWorks volume IDs to associate with the instance. */
    public open fun volumes(vararg `value`: String): Unit = volumes(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.opsworks.CfnInstance]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The default AWS OpsWorks Stacks agent version. You have the following options:.
         * * `INHERIT` - Use the stack's default agent version setting.
         * * *version_number* - Use the specified agent version. This value overrides the stack's
         *   default setting. To update the agent version, edit the instance configuration and
         *   specify a new version. AWS OpsWorks Stacks installs that version on the instance.
         *
         * The default setting is `INHERIT` . To specify an agent version, you must use the complete
         * version number, not the abbreviated number shown on the console. For a list of available
         * agent version numbers, call `DescribeAgentVersions` . AgentVersion cannot be set to Chef
         * 12.2.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-agentversion)
         *
         * @param agentVersion The default AWS OpsWorks Stacks agent version. You have the following
         *   options:.
         */
        public fun agentVersion(agentVersion: String)

        /**
         * A custom AMI ID to be used to create the instance.
         *
         * The AMI should be based on one of the supported operating systems. For more information,
         * see
         * [Using Custom AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html)
         * .
         *
         * If you specify a custom AMI, you must set `Os` to `Custom` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-amiid)
         *
         * @param amiId A custom AMI ID to be used to create the instance.
         */
        public fun amiId(amiId: String)

        /**
         * The instance architecture.
         *
         * The default option is `x86_64` . Instance types do not necessarily support both
         * architectures. For a list of the architectures that are supported by the different
         * instance types, see
         * [Instance Families and Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-architecture)
         *
         * @param architecture The instance architecture.
         */
        public fun architecture(architecture: String)

        /**
         * For load-based or time-based instances, the type.
         *
         * Windows stacks can use only time-based instances.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-autoscalingtype)
         *
         * @param autoScalingType For load-based or time-based instances, the type.
         */
        public fun autoScalingType(autoScalingType: String)

        /**
         * The Availability Zone of the AWS OpsWorks instance, such as `us-east-2a` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-availabilityzone)
         *
         * @param availabilityZone The Availability Zone of the AWS OpsWorks instance, such as
         *   `us-east-2a` .
         */
        public fun availabilityZone(availabilityZone: String)

        /**
         * An array of `BlockDeviceMapping` objects that specify the instance's block devices.
         *
         * For more information, see
         * [Block Device Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
         * . Note that block device mappings are not supported for custom AMIs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings)
         *
         * @param blockDeviceMappings An array of `BlockDeviceMapping` objects that specify the
         *   instance's block devices.
         */
        public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

        /**
         * An array of `BlockDeviceMapping` objects that specify the instance's block devices.
         *
         * For more information, see
         * [Block Device Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
         * . Note that block device mappings are not supported for custom AMIs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings)
         *
         * @param blockDeviceMappings An array of `BlockDeviceMapping` objects that specify the
         *   instance's block devices.
         */
        public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

        /**
         * An array of `BlockDeviceMapping` objects that specify the instance's block devices.
         *
         * For more information, see
         * [Block Device Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
         * . Note that block device mappings are not supported for custom AMIs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings)
         *
         * @param blockDeviceMappings An array of `BlockDeviceMapping` objects that specify the
         *   instance's block devices.
         */
        public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

        /**
         * Whether to create an Amazon EBS-optimized instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-ebsoptimized)
         *
         * @param ebsOptimized Whether to create an Amazon EBS-optimized instance.
         */
        public fun ebsOptimized(ebsOptimized: Boolean)

        /**
         * Whether to create an Amazon EBS-optimized instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-ebsoptimized)
         *
         * @param ebsOptimized Whether to create an Amazon EBS-optimized instance.
         */
        public fun ebsOptimized(ebsOptimized: IResolvable)

        /**
         * A list of Elastic IP addresses to associate with the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-elasticips)
         *
         * @param elasticIps A list of Elastic IP addresses to associate with the instance.
         */
        public fun elasticIps(elasticIps: List<String>)

        /**
         * A list of Elastic IP addresses to associate with the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-elasticips)
         *
         * @param elasticIps A list of Elastic IP addresses to associate with the instance.
         */
        public fun elasticIps(vararg elasticIps: String)

        /**
         * The instance host name. The following are character limits for instance host names.
         * * Linux-based instances: 63 characters
         * * Windows-based instances: 15 characters
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-hostname)
         *
         * @param hostname The instance host name. The following are character limits for instance
         *   host names.
         */
        public fun hostname(hostname: String)

        /**
         * Whether to install operating system and package updates when the instance boots.
         *
         * The default value is `true` . To control when updates are installed, set this value to
         * `false` . You must then update your instances manually by using `CreateDeployment` to run
         * the `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or
         * `apt-get` (Ubuntu) on the instances.
         *
         * We strongly recommend using the default value of `true` to ensure that your instances
         * have the latest security updates.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-installupdatesonboot)
         *
         * @param installUpdatesOnBoot Whether to install operating system and package updates when
         *   the instance boots.
         */
        public fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean)

        /**
         * Whether to install operating system and package updates when the instance boots.
         *
         * The default value is `true` . To control when updates are installed, set this value to
         * `false` . You must then update your instances manually by using `CreateDeployment` to run
         * the `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or
         * `apt-get` (Ubuntu) on the instances.
         *
         * We strongly recommend using the default value of `true` to ensure that your instances
         * have the latest security updates.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-installupdatesonboot)
         *
         * @param installUpdatesOnBoot Whether to install operating system and package updates when
         *   the instance boots.
         */
        public fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable)

        /**
         * The instance type, such as `t2.micro` . For a list of supported instance types, open the
         * stack in the console, choose *Instances* , and choose *+ Instance* . The *Size* list
         * contains the currently supported types. For more information, see
         * [Instance Families and Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html)
         * . The parameter values that you use to specify the various types are in the *API Name*
         * column of the *Available Instance Types* table.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-instancetype)
         *
         * @param instanceType The instance type, such as `t2.micro` . For a list of supported
         *   instance types, open the stack in the console, choose *Instances* , and choose *+
         *   Instance* . The *Size* list contains the currently supported types. For more
         *   information, see
         *   [Instance Families and Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html)
         *   . The parameter values that you use to specify the various types are in the *API Name*
         *   column of the *Available Instance Types* table.
         */
        public fun instanceType(instanceType: String)

        /**
         * An array that contains the instance's layer IDs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids)
         *
         * @param layerIds An array that contains the instance's layer IDs.
         */
        public fun layerIds(layerIds: List<String>)

        /**
         * An array that contains the instance's layer IDs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids)
         *
         * @param layerIds An array that contains the instance's layer IDs.
         */
        public fun layerIds(vararg layerIds: String)

        /**
         * The instance's operating system, which must be set to one of the following.
         * * A supported Linux operating system: An Amazon Linux version, such as `Amazon Linux 2` ,
         *   `Amazon Linux 2018.03` , `Amazon Linux 2017.09` , `Amazon Linux 2017.03` , `Amazon
         *   Linux 2016.09` , `Amazon Linux 2016.03` , `Amazon Linux 2015.09` , or `Amazon Linux
         *   2015.03` .
         * * A supported Ubuntu operating system, such as `Ubuntu 18.04 LTS` , `Ubuntu 16.04 LTS` ,
         *   `Ubuntu 14.04 LTS` , or `Ubuntu 12.04 LTS` .
         * * `CentOS Linux 7`
         * * `Red Hat Enterprise Linux 7`
         * * A supported Windows operating system, such as `Microsoft Windows Server 2012 R2 Base` ,
         *   `Microsoft Windows Server 2012 R2 with SQL Server Express` , `Microsoft Windows Server
         *   2012 R2 with SQL Server Standard` , or `Microsoft Windows Server 2012 R2 with SQL
         *   Server Web` .
         * * A custom AMI: `Custom` .
         *
         * Not all operating systems are supported with all versions of Chef. For more information
         * about the supported operating systems, see
         * [AWS OpsWorks Stacks Operating Systems](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html)
         * .
         *
         * The default option is the current Amazon Linux version. If you set this parameter to
         * `Custom` , you must use the `CreateInstance` action's AmiId parameter to specify the
         * custom AMI that you want to use. Block device mappings are not supported if the value is
         * `Custom` . For more information about how to use custom AMIs with AWS OpsWorks Stacks,
         * see
         * [Using Custom AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-os)
         *
         * @param os The instance's operating system, which must be set to one of the following.
         */
        public fun os(os: String)

        /**
         * The instance root device type.
         *
         * For more information, see
         * [Storage for the Root Device](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-rootdevicetype)
         *
         * @param rootDeviceType The instance root device type.
         */
        public fun rootDeviceType(rootDeviceType: String)

        /**
         * The instance's Amazon EC2 key-pair name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-sshkeyname)
         *
         * @param sshKeyName The instance's Amazon EC2 key-pair name.
         */
        public fun sshKeyName(sshKeyName: String)

        /**
         * The stack ID.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-stackid)
         *
         * @param stackId The stack ID.
         */
        public fun stackId(stackId: String)

        /**
         * The ID of the instance's subnet.
         *
         * If the stack is running in a VPC, you can use this parameter to override the stack's
         * default subnet ID value and direct AWS OpsWorks Stacks to launch the instance in a
         * different subnet.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-subnetid)
         *
         * @param subnetId The ID of the instance's subnet.
         */
        public fun subnetId(subnetId: String)

        /**
         * The instance's tenancy option.
         *
         * The default option is no tenancy, or if the instance is running in a VPC, inherit tenancy
         * settings from the VPC. The following are valid values for this parameter: `dedicated` ,
         * `default` , or `host` . Because there are costs associated with changes in tenancy
         * options, we recommend that you research tenancy options before choosing them for your
         * instances. For more information about dedicated hosts, see
         * [Dedicated Hosts Overview](https://docs.aws.amazon.com/ec2/dedicated-hosts/) and
         * [Amazon EC2 Dedicated Hosts](https://docs.aws.amazon.com/ec2/dedicated-hosts/) . For more
         * information about dedicated instances, see
         * [Dedicated Instances](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/dedicated-instance.html)
         * and
         * [Amazon EC2 Dedicated Instances](https://docs.aws.amazon.com/ec2/purchasing-options/dedicated-instances/)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-tenancy)
         *
         * @param tenancy The instance's tenancy option.
         */
        public fun tenancy(tenancy: String)

        /**
         * The time-based scaling configuration for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-timebasedautoscaling)
         *
         * @param timeBasedAutoScaling The time-based scaling configuration for the instance.
         */
        public fun timeBasedAutoScaling(timeBasedAutoScaling: IResolvable)

        /**
         * The time-based scaling configuration for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-timebasedautoscaling)
         *
         * @param timeBasedAutoScaling The time-based scaling configuration for the instance.
         */
        public fun timeBasedAutoScaling(timeBasedAutoScaling: TimeBasedAutoScalingProperty)

        /**
         * The time-based scaling configuration for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-timebasedautoscaling)
         *
         * @param timeBasedAutoScaling The time-based scaling configuration for the instance.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("6d0f4085d8c13f8af5e1920e12319b76161cac1bdcdc6e741f66421e1ad2eb89")
        public fun timeBasedAutoScaling(
            timeBasedAutoScaling: TimeBasedAutoScalingProperty.Builder.() -> Unit
        )

        /**
         * The instance's virtualization type, `paravirtual` or `hvm` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-virtualizationtype)
         *
         * @param virtualizationType The instance's virtualization type, `paravirtual` or `hvm` .
         */
        public fun virtualizationType(virtualizationType: String)

        /**
         * A list of AWS OpsWorks volume IDs to associate with the instance.
         *
         * For more information, see
         * [`AWS::OpsWorks::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes)
         *
         * @param volumes A list of AWS OpsWorks volume IDs to associate with the instance.
         */
        public fun volumes(volumes: List<String>)

        /**
         * A list of AWS OpsWorks volume IDs to associate with the instance.
         *
         * For more information, see
         * [`AWS::OpsWorks::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes)
         *
         * @param volumes A list of AWS OpsWorks volume IDs to associate with the instance.
         */
        public fun volumes(vararg volumes: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnInstance.Builder =
            software.amazon.awscdk.services.opsworks.CfnInstance.Builder.create(scope, id)

        /**
         * The default AWS OpsWorks Stacks agent version. You have the following options:.
         * * `INHERIT` - Use the stack's default agent version setting.
         * * *version_number* - Use the specified agent version. This value overrides the stack's
         *   default setting. To update the agent version, edit the instance configuration and
         *   specify a new version. AWS OpsWorks Stacks installs that version on the instance.
         *
         * The default setting is `INHERIT` . To specify an agent version, you must use the complete
         * version number, not the abbreviated number shown on the console. For a list of available
         * agent version numbers, call `DescribeAgentVersions` . AgentVersion cannot be set to Chef
         * 12.2.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-agentversion)
         *
         * @param agentVersion The default AWS OpsWorks Stacks agent version. You have the following
         *   options:.
         */
        override fun agentVersion(agentVersion: String) {
            cdkBuilder.agentVersion(agentVersion)
        }

        /**
         * A custom AMI ID to be used to create the instance.
         *
         * The AMI should be based on one of the supported operating systems. For more information,
         * see
         * [Using Custom AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html)
         * .
         *
         * If you specify a custom AMI, you must set `Os` to `Custom` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-amiid)
         *
         * @param amiId A custom AMI ID to be used to create the instance.
         */
        override fun amiId(amiId: String) {
            cdkBuilder.amiId(amiId)
        }

        /**
         * The instance architecture.
         *
         * The default option is `x86_64` . Instance types do not necessarily support both
         * architectures. For a list of the architectures that are supported by the different
         * instance types, see
         * [Instance Families and Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-architecture)
         *
         * @param architecture The instance architecture.
         */
        override fun architecture(architecture: String) {
            cdkBuilder.architecture(architecture)
        }

        /**
         * For load-based or time-based instances, the type.
         *
         * Windows stacks can use only time-based instances.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-autoscalingtype)
         *
         * @param autoScalingType For load-based or time-based instances, the type.
         */
        override fun autoScalingType(autoScalingType: String) {
            cdkBuilder.autoScalingType(autoScalingType)
        }

        /**
         * The Availability Zone of the AWS OpsWorks instance, such as `us-east-2a` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-availabilityzone)
         *
         * @param availabilityZone The Availability Zone of the AWS OpsWorks instance, such as
         *   `us-east-2a` .
         */
        override fun availabilityZone(availabilityZone: String) {
            cdkBuilder.availabilityZone(availabilityZone)
        }

        /**
         * An array of `BlockDeviceMapping` objects that specify the instance's block devices.
         *
         * For more information, see
         * [Block Device Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
         * . Note that block device mappings are not supported for custom AMIs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings)
         *
         * @param blockDeviceMappings An array of `BlockDeviceMapping` objects that specify the
         *   instance's block devices.
         */
        override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
            cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable::unwrap))
        }

        /**
         * An array of `BlockDeviceMapping` objects that specify the instance's block devices.
         *
         * For more information, see
         * [Block Device Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
         * . Note that block device mappings are not supported for custom AMIs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings)
         *
         * @param blockDeviceMappings An array of `BlockDeviceMapping` objects that specify the
         *   instance's block devices.
         */
        override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
            cdkBuilder.blockDeviceMappings(blockDeviceMappings)
        }

        /**
         * An array of `BlockDeviceMapping` objects that specify the instance's block devices.
         *
         * For more information, see
         * [Block Device Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
         * . Note that block device mappings are not supported for custom AMIs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-blockdevicemappings)
         *
         * @param blockDeviceMappings An array of `BlockDeviceMapping` objects that specify the
         *   instance's block devices.
         */
        override fun blockDeviceMappings(vararg blockDeviceMappings: Any): Unit =
            blockDeviceMappings(blockDeviceMappings.toList())

        /**
         * Whether to create an Amazon EBS-optimized instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-ebsoptimized)
         *
         * @param ebsOptimized Whether to create an Amazon EBS-optimized instance.
         */
        override fun ebsOptimized(ebsOptimized: Boolean) {
            cdkBuilder.ebsOptimized(ebsOptimized)
        }

        /**
         * Whether to create an Amazon EBS-optimized instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-ebsoptimized)
         *
         * @param ebsOptimized Whether to create an Amazon EBS-optimized instance.
         */
        override fun ebsOptimized(ebsOptimized: IResolvable) {
            cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
        }

        /**
         * A list of Elastic IP addresses to associate with the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-elasticips)
         *
         * @param elasticIps A list of Elastic IP addresses to associate with the instance.
         */
        override fun elasticIps(elasticIps: List<String>) {
            cdkBuilder.elasticIps(elasticIps)
        }

        /**
         * A list of Elastic IP addresses to associate with the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-elasticips)
         *
         * @param elasticIps A list of Elastic IP addresses to associate with the instance.
         */
        override fun elasticIps(vararg elasticIps: String): Unit = elasticIps(elasticIps.toList())

        /**
         * The instance host name. The following are character limits for instance host names.
         * * Linux-based instances: 63 characters
         * * Windows-based instances: 15 characters
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-hostname)
         *
         * @param hostname The instance host name. The following are character limits for instance
         *   host names.
         */
        override fun hostname(hostname: String) {
            cdkBuilder.hostname(hostname)
        }

        /**
         * Whether to install operating system and package updates when the instance boots.
         *
         * The default value is `true` . To control when updates are installed, set this value to
         * `false` . You must then update your instances manually by using `CreateDeployment` to run
         * the `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or
         * `apt-get` (Ubuntu) on the instances.
         *
         * We strongly recommend using the default value of `true` to ensure that your instances
         * have the latest security updates.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-installupdatesonboot)
         *
         * @param installUpdatesOnBoot Whether to install operating system and package updates when
         *   the instance boots.
         */
        override fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean) {
            cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
        }

        /**
         * Whether to install operating system and package updates when the instance boots.
         *
         * The default value is `true` . To control when updates are installed, set this value to
         * `false` . You must then update your instances manually by using `CreateDeployment` to run
         * the `update_dependencies` stack command or by manually running `yum` (Amazon Linux) or
         * `apt-get` (Ubuntu) on the instances.
         *
         * We strongly recommend using the default value of `true` to ensure that your instances
         * have the latest security updates.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-installupdatesonboot)
         *
         * @param installUpdatesOnBoot Whether to install operating system and package updates when
         *   the instance boots.
         */
        override fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable) {
            cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot.let(IResolvable::unwrap))
        }

        /**
         * The instance type, such as `t2.micro` . For a list of supported instance types, open the
         * stack in the console, choose *Instances* , and choose *+ Instance* . The *Size* list
         * contains the currently supported types. For more information, see
         * [Instance Families and Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html)
         * . The parameter values that you use to specify the various types are in the *API Name*
         * column of the *Available Instance Types* table.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-instancetype)
         *
         * @param instanceType The instance type, such as `t2.micro` . For a list of supported
         *   instance types, open the stack in the console, choose *Instances* , and choose *+
         *   Instance* . The *Size* list contains the currently supported types. For more
         *   information, see
         *   [Instance Families and Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html)
         *   . The parameter values that you use to specify the various types are in the *API Name*
         *   column of the *Available Instance Types* table.
         */
        override fun instanceType(instanceType: String) {
            cdkBuilder.instanceType(instanceType)
        }

        /**
         * An array that contains the instance's layer IDs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids)
         *
         * @param layerIds An array that contains the instance's layer IDs.
         */
        override fun layerIds(layerIds: List<String>) {
            cdkBuilder.layerIds(layerIds)
        }

        /**
         * An array that contains the instance's layer IDs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-layerids)
         *
         * @param layerIds An array that contains the instance's layer IDs.
         */
        override fun layerIds(vararg layerIds: String): Unit = layerIds(layerIds.toList())

        /**
         * The instance's operating system, which must be set to one of the following.
         * * A supported Linux operating system: An Amazon Linux version, such as `Amazon Linux 2` ,
         *   `Amazon Linux 2018.03` , `Amazon Linux 2017.09` , `Amazon Linux 2017.03` , `Amazon
         *   Linux 2016.09` , `Amazon Linux 2016.03` , `Amazon Linux 2015.09` , or `Amazon Linux
         *   2015.03` .
         * * A supported Ubuntu operating system, such as `Ubuntu 18.04 LTS` , `Ubuntu 16.04 LTS` ,
         *   `Ubuntu 14.04 LTS` , or `Ubuntu 12.04 LTS` .
         * * `CentOS Linux 7`
         * * `Red Hat Enterprise Linux 7`
         * * A supported Windows operating system, such as `Microsoft Windows Server 2012 R2 Base` ,
         *   `Microsoft Windows Server 2012 R2 with SQL Server Express` , `Microsoft Windows Server
         *   2012 R2 with SQL Server Standard` , or `Microsoft Windows Server 2012 R2 with SQL
         *   Server Web` .
         * * A custom AMI: `Custom` .
         *
         * Not all operating systems are supported with all versions of Chef. For more information
         * about the supported operating systems, see
         * [AWS OpsWorks Stacks Operating Systems](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html)
         * .
         *
         * The default option is the current Amazon Linux version. If you set this parameter to
         * `Custom` , you must use the `CreateInstance` action's AmiId parameter to specify the
         * custom AMI that you want to use. Block device mappings are not supported if the value is
         * `Custom` . For more information about how to use custom AMIs with AWS OpsWorks Stacks,
         * see
         * [Using Custom AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-os)
         *
         * @param os The instance's operating system, which must be set to one of the following.
         */
        override fun os(os: String) {
            cdkBuilder.os(os)
        }

        /**
         * The instance root device type.
         *
         * For more information, see
         * [Storage for the Root Device](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-rootdevicetype)
         *
         * @param rootDeviceType The instance root device type.
         */
        override fun rootDeviceType(rootDeviceType: String) {
            cdkBuilder.rootDeviceType(rootDeviceType)
        }

        /**
         * The instance's Amazon EC2 key-pair name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-sshkeyname)
         *
         * @param sshKeyName The instance's Amazon EC2 key-pair name.
         */
        override fun sshKeyName(sshKeyName: String) {
            cdkBuilder.sshKeyName(sshKeyName)
        }

        /**
         * The stack ID.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-stackid)
         *
         * @param stackId The stack ID.
         */
        override fun stackId(stackId: String) {
            cdkBuilder.stackId(stackId)
        }

        /**
         * The ID of the instance's subnet.
         *
         * If the stack is running in a VPC, you can use this parameter to override the stack's
         * default subnet ID value and direct AWS OpsWorks Stacks to launch the instance in a
         * different subnet.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-subnetid)
         *
         * @param subnetId The ID of the instance's subnet.
         */
        override fun subnetId(subnetId: String) {
            cdkBuilder.subnetId(subnetId)
        }

        /**
         * The instance's tenancy option.
         *
         * The default option is no tenancy, or if the instance is running in a VPC, inherit tenancy
         * settings from the VPC. The following are valid values for this parameter: `dedicated` ,
         * `default` , or `host` . Because there are costs associated with changes in tenancy
         * options, we recommend that you research tenancy options before choosing them for your
         * instances. For more information about dedicated hosts, see
         * [Dedicated Hosts Overview](https://docs.aws.amazon.com/ec2/dedicated-hosts/) and
         * [Amazon EC2 Dedicated Hosts](https://docs.aws.amazon.com/ec2/dedicated-hosts/) . For more
         * information about dedicated instances, see
         * [Dedicated Instances](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/dedicated-instance.html)
         * and
         * [Amazon EC2 Dedicated Instances](https://docs.aws.amazon.com/ec2/purchasing-options/dedicated-instances/)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-tenancy)
         *
         * @param tenancy The instance's tenancy option.
         */
        override fun tenancy(tenancy: String) {
            cdkBuilder.tenancy(tenancy)
        }

        /**
         * The time-based scaling configuration for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-timebasedautoscaling)
         *
         * @param timeBasedAutoScaling The time-based scaling configuration for the instance.
         */
        override fun timeBasedAutoScaling(timeBasedAutoScaling: IResolvable) {
            cdkBuilder.timeBasedAutoScaling(timeBasedAutoScaling.let(IResolvable::unwrap))
        }

        /**
         * The time-based scaling configuration for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-timebasedautoscaling)
         *
         * @param timeBasedAutoScaling The time-based scaling configuration for the instance.
         */
        override fun timeBasedAutoScaling(timeBasedAutoScaling: TimeBasedAutoScalingProperty) {
            cdkBuilder.timeBasedAutoScaling(
                timeBasedAutoScaling.let(TimeBasedAutoScalingProperty::unwrap)
            )
        }

        /**
         * The time-based scaling configuration for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-timebasedautoscaling)
         *
         * @param timeBasedAutoScaling The time-based scaling configuration for the instance.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("6d0f4085d8c13f8af5e1920e12319b76161cac1bdcdc6e741f66421e1ad2eb89")
        override fun timeBasedAutoScaling(
            timeBasedAutoScaling: TimeBasedAutoScalingProperty.Builder.() -> Unit
        ): Unit = timeBasedAutoScaling(TimeBasedAutoScalingProperty(timeBasedAutoScaling))

        /**
         * The instance's virtualization type, `paravirtual` or `hvm` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-virtualizationtype)
         *
         * @param virtualizationType The instance's virtualization type, `paravirtual` or `hvm` .
         */
        override fun virtualizationType(virtualizationType: String) {
            cdkBuilder.virtualizationType(virtualizationType)
        }

        /**
         * A list of AWS OpsWorks volume IDs to associate with the instance.
         *
         * For more information, see
         * [`AWS::OpsWorks::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes)
         *
         * @param volumes A list of AWS OpsWorks volume IDs to associate with the instance.
         */
        override fun volumes(volumes: List<String>) {
            cdkBuilder.volumes(volumes)
        }

        /**
         * A list of AWS OpsWorks volume IDs to associate with the instance.
         *
         * For more information, see
         * [`AWS::OpsWorks::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html#cfn-opsworks-instance-volumes)
         *
         * @param volumes A list of AWS OpsWorks volume IDs to associate with the instance.
         */
        override fun volumes(vararg volumes: String): Unit = volumes(volumes.toList())

        public fun build(): software.amazon.awscdk.services.opsworks.CfnInstance =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnInstance {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnInstance(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.opsworks.CfnInstance
        ): CfnInstance = CfnInstance(cdkObject)

        internal fun unwrap(
            wrapped: CfnInstance
        ): software.amazon.awscdk.services.opsworks.CfnInstance = wrapped.cdkObject
    }

    public interface TimeBasedAutoScalingProperty {
        /**
         * The schedule for Friday.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-friday)
         */
        public fun friday(): Any? = unwrap(this).getFriday()

        /**
         * The schedule for Monday.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-monday)
         */
        public fun monday(): Any? = unwrap(this).getMonday()

        /**
         * The schedule for Saturday.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-saturday)
         */
        public fun saturday(): Any? = unwrap(this).getSaturday()

        /**
         * The schedule for Sunday.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-sunday)
         */
        public fun sunday(): Any? = unwrap(this).getSunday()

        /**
         * The schedule for Thursday.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-thursday)
         */
        public fun thursday(): Any? = unwrap(this).getThursday()

        /**
         * The schedule for Tuesday.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-tuesday)
         */
        public fun tuesday(): Any? = unwrap(this).getTuesday()

        /**
         * The schedule for Wednesday.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-wednesday)
         */
        public fun wednesday(): Any? = unwrap(this).getWednesday()

        /** A builder for [TimeBasedAutoScalingProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param friday The schedule for Friday. */
            public fun friday(friday: IResolvable)

            /** @param friday The schedule for Friday. */
            public fun friday(friday: Map<String, String>)

            /** @param monday The schedule for Monday. */
            public fun monday(monday: IResolvable)

            /** @param monday The schedule for Monday. */
            public fun monday(monday: Map<String, String>)

            /** @param saturday The schedule for Saturday. */
            public fun saturday(saturday: IResolvable)

            /** @param saturday The schedule for Saturday. */
            public fun saturday(saturday: Map<String, String>)

            /** @param sunday The schedule for Sunday. */
            public fun sunday(sunday: IResolvable)

            /** @param sunday The schedule for Sunday. */
            public fun sunday(sunday: Map<String, String>)

            /** @param thursday The schedule for Thursday. */
            public fun thursday(thursday: IResolvable)

            /** @param thursday The schedule for Thursday. */
            public fun thursday(thursday: Map<String, String>)

            /** @param tuesday The schedule for Tuesday. */
            public fun tuesday(tuesday: IResolvable)

            /** @param tuesday The schedule for Tuesday. */
            public fun tuesday(tuesday: Map<String, String>)

            /** @param wednesday The schedule for Wednesday. */
            public fun wednesday(wednesday: IResolvable)

            /** @param wednesday The schedule for Wednesday. */
            public fun wednesday(wednesday: Map<String, String>)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder =
                software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty
                    .builder()

            /** @param friday The schedule for Friday. */
            override fun friday(friday: IResolvable) {
                cdkBuilder.friday(friday.let(IResolvable::unwrap))
            }

            /** @param friday The schedule for Friday. */
            override fun friday(friday: Map<String, String>) {
                cdkBuilder.friday(friday)
            }

            /** @param monday The schedule for Monday. */
            override fun monday(monday: IResolvable) {
                cdkBuilder.monday(monday.let(IResolvable::unwrap))
            }

            /** @param monday The schedule for Monday. */
            override fun monday(monday: Map<String, String>) {
                cdkBuilder.monday(monday)
            }

            /** @param saturday The schedule for Saturday. */
            override fun saturday(saturday: IResolvable) {
                cdkBuilder.saturday(saturday.let(IResolvable::unwrap))
            }

            /** @param saturday The schedule for Saturday. */
            override fun saturday(saturday: Map<String, String>) {
                cdkBuilder.saturday(saturday)
            }

            /** @param sunday The schedule for Sunday. */
            override fun sunday(sunday: IResolvable) {
                cdkBuilder.sunday(sunday.let(IResolvable::unwrap))
            }

            /** @param sunday The schedule for Sunday. */
            override fun sunday(sunday: Map<String, String>) {
                cdkBuilder.sunday(sunday)
            }

            /** @param thursday The schedule for Thursday. */
            override fun thursday(thursday: IResolvable) {
                cdkBuilder.thursday(thursday.let(IResolvable::unwrap))
            }

            /** @param thursday The schedule for Thursday. */
            override fun thursday(thursday: Map<String, String>) {
                cdkBuilder.thursday(thursday)
            }

            /** @param tuesday The schedule for Tuesday. */
            override fun tuesday(tuesday: IResolvable) {
                cdkBuilder.tuesday(tuesday.let(IResolvable::unwrap))
            }

            /** @param tuesday The schedule for Tuesday. */
            override fun tuesday(tuesday: Map<String, String>) {
                cdkBuilder.tuesday(tuesday)
            }

            /** @param wednesday The schedule for Wednesday. */
            override fun wednesday(wednesday: IResolvable) {
                cdkBuilder.wednesday(wednesday.let(IResolvable::unwrap))
            }

            /** @param wednesday The schedule for Wednesday. */
            override fun wednesday(wednesday: Map<String, String>) {
                cdkBuilder.wednesday(wednesday)
            }

            public fun build():
                software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty,
        ) : TimeBasedAutoScalingProperty {
            /**
             * The schedule for Friday.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-friday)
             */
            override fun friday(): Any? = unwrap(this).getFriday()

            /**
             * The schedule for Monday.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-monday)
             */
            override fun monday(): Any? = unwrap(this).getMonday()

            /**
             * The schedule for Saturday.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-saturday)
             */
            override fun saturday(): Any? = unwrap(this).getSaturday()

            /**
             * The schedule for Sunday.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-sunday)
             */
            override fun sunday(): Any? = unwrap(this).getSunday()

            /**
             * The schedule for Thursday.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-thursday)
             */
            override fun thursday(): Any? = unwrap(this).getThursday()

            /**
             * The schedule for Tuesday.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-tuesday)
             */
            override fun tuesday(): Any? = unwrap(this).getTuesday()

            /**
             * The schedule for Wednesday.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-timebasedautoscaling.html#cfn-opsworks-instance-timebasedautoscaling-wednesday)
             */
            override fun wednesday(): Any? = unwrap(this).getWednesday()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): TimeBasedAutoScalingProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty
            ): TimeBasedAutoScalingProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: TimeBasedAutoScalingProperty
            ): software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface EbsBlockDeviceProperty {
        /**
         * Whether the volume is deleted on instance termination.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-deleteontermination)
         */
        public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

        /**
         * The number of I/O operations per second (IOPS) that the volume supports.
         *
         * For more information, see
         * [EbsBlockDevice](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-iops)
         */
        public fun iops(): Number? = unwrap(this).getIops()

        /**
         * The snapshot ID.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-snapshotid)
         */
        public fun snapshotId(): String? = unwrap(this).getSnapshotId()

        /**
         * The volume size, in GiB.
         *
         * For more information, see
         * [EbsBlockDevice](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumesize)
         */
        public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

        /**
         * The volume type.
         *
         * `gp2` for General Purpose (SSD) volumes, `io1` for Provisioned IOPS (SSD) volumes, `st1`
         * for Throughput Optimized hard disk drives (HDD), `sc1` for Cold HDD,and `standard` for
         * Magnetic volumes.
         *
         * If you specify the `io1` volume type, you must also specify a value for the `Iops`
         * attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is
         * 50:1. AWS uses the default volume size (in GiB) specified in the AMI attributes to set
         * IOPS to 50 x (volume size).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumetype)
         */
        public fun volumeType(): String? = unwrap(this).getVolumeType()

        /** A builder for [EbsBlockDeviceProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param deleteOnTermination Whether the volume is deleted on instance termination. */
            public fun deleteOnTermination(deleteOnTermination: Boolean)

            /** @param deleteOnTermination Whether the volume is deleted on instance termination. */
            public fun deleteOnTermination(deleteOnTermination: IResolvable)

            /**
             * @param iops The number of I/O operations per second (IOPS) that the volume supports.
             *   For more information, see
             *   [EbsBlockDevice](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html)
             *   .
             */
            public fun iops(iops: Number)

            /** @param snapshotId The snapshot ID. */
            public fun snapshotId(snapshotId: String)

            /**
             * @param volumeSize The volume size, in GiB. For more information, see
             *   [EbsBlockDevice](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html)
             *   .
             */
            public fun volumeSize(volumeSize: Number)

            /**
             * @param volumeType The volume type. `gp2` for General Purpose (SSD) volumes, `io1` for
             *   Provisioned IOPS (SSD) volumes, `st1` for Throughput Optimized hard disk drives
             *   (HDD), `sc1` for Cold HDD,and `standard` for Magnetic volumes.
             *
             * If you specify the `io1` volume type, you must also specify a value for the `Iops`
             * attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is
             * 50:1. AWS uses the default volume size (in GiB) specified in the AMI attributes to
             * set IOPS to 50 x (volume size).
             */
            public fun volumeType(volumeType: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty.Builder =
                software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty
                    .builder()

            /** @param deleteOnTermination Whether the volume is deleted on instance termination. */
            override fun deleteOnTermination(deleteOnTermination: Boolean) {
                cdkBuilder.deleteOnTermination(deleteOnTermination)
            }

            /** @param deleteOnTermination Whether the volume is deleted on instance termination. */
            override fun deleteOnTermination(deleteOnTermination: IResolvable) {
                cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
            }

            /**
             * @param iops The number of I/O operations per second (IOPS) that the volume supports.
             *   For more information, see
             *   [EbsBlockDevice](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html)
             *   .
             */
            override fun iops(iops: Number) {
                cdkBuilder.iops(iops)
            }

            /** @param snapshotId The snapshot ID. */
            override fun snapshotId(snapshotId: String) {
                cdkBuilder.snapshotId(snapshotId)
            }

            /**
             * @param volumeSize The volume size, in GiB. For more information, see
             *   [EbsBlockDevice](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html)
             *   .
             */
            override fun volumeSize(volumeSize: Number) {
                cdkBuilder.volumeSize(volumeSize)
            }

            /**
             * @param volumeType The volume type. `gp2` for General Purpose (SSD) volumes, `io1` for
             *   Provisioned IOPS (SSD) volumes, `st1` for Throughput Optimized hard disk drives
             *   (HDD), `sc1` for Cold HDD,and `standard` for Magnetic volumes.
             *
             * If you specify the `io1` volume type, you must also specify a value for the `Iops`
             * attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is
             * 50:1. AWS uses the default volume size (in GiB) specified in the AMI attributes to
             * set IOPS to 50 x (volume size).
             */
            override fun volumeType(volumeType: String) {
                cdkBuilder.volumeType(volumeType)
            }

            public fun build():
                software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty,
        ) : EbsBlockDeviceProperty {
            /**
             * Whether the volume is deleted on instance termination.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-deleteontermination)
             */
            override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

            /**
             * The number of I/O operations per second (IOPS) that the volume supports.
             *
             * For more information, see
             * [EbsBlockDevice](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-iops)
             */
            override fun iops(): Number? = unwrap(this).getIops()

            /**
             * The snapshot ID.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-snapshotid)
             */
            override fun snapshotId(): String? = unwrap(this).getSnapshotId()

            /**
             * The volume size, in GiB.
             *
             * For more information, see
             * [EbsBlockDevice](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumesize)
             */
            override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

            /**
             * The volume type.
             *
             * `gp2` for General Purpose (SSD) volumes, `io1` for Provisioned IOPS (SSD) volumes,
             * `st1` for Throughput Optimized hard disk drives (HDD), `sc1` for Cold HDD,and
             * `standard` for Magnetic volumes.
             *
             * If you specify the `io1` volume type, you must also specify a value for the `Iops`
             * attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is
             * 50:1. AWS uses the default volume size (in GiB) specified in the AMI attributes to
             * set IOPS to 50 x (volume size).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html#cfn-opsworks-instance-ebsblockdevice-volumetype)
             */
            override fun volumeType(): String? = unwrap(this).getVolumeType()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): EbsBlockDeviceProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty
            ): EbsBlockDeviceProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: EbsBlockDeviceProperty
            ): software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface BlockDeviceMappingProperty {
        /**
         * The device name that is exposed to the instance, such as `/dev/sdh` .
         *
         * For the root device, you can use the explicit device name or you can set this parameter
         * to `ROOT_DEVICE` and AWS OpsWorks Stacks will provide the correct device name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-devicename)
         */
        public fun deviceName(): String? = unwrap(this).getDeviceName()

        /**
         * An `EBSBlockDevice` that defines how to configure an Amazon EBS volume when the instance
         * is launched.
         *
         * You can specify either the `VirtualName` or `Ebs` , but not both.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-ebs)
         */
        public fun ebs(): Any? = unwrap(this).getEbs()

        /**
         * Suppresses the specified device included in the AMI's block device mapping.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-nodevice)
         */
        public fun noDevice(): String? = unwrap(this).getNoDevice()

        /**
         * The virtual device name.
         *
         * For more information, see
         * [BlockDeviceMapping](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html)
         * . You can specify either the `VirtualName` or `Ebs` , but not both.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-virtualname)
         */
        public fun virtualName(): String? = unwrap(this).getVirtualName()

        /** A builder for [BlockDeviceMappingProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param deviceName The device name that is exposed to the instance, such as `/dev/sdh`
             *   . For the root device, you can use the explicit device name or you can set this
             *   parameter to `ROOT_DEVICE` and AWS OpsWorks Stacks will provide the correct device
             *   name.
             */
            public fun deviceName(deviceName: String)

            /**
             * @param ebs An `EBSBlockDevice` that defines how to configure an Amazon EBS volume
             *   when the instance is launched. You can specify either the `VirtualName` or `Ebs` ,
             *   but not both.
             */
            public fun ebs(ebs: IResolvable)

            /**
             * @param ebs An `EBSBlockDevice` that defines how to configure an Amazon EBS volume
             *   when the instance is launched. You can specify either the `VirtualName` or `Ebs` ,
             *   but not both.
             */
            public fun ebs(ebs: EbsBlockDeviceProperty)

            /**
             * @param ebs An `EBSBlockDevice` that defines how to configure an Amazon EBS volume
             *   when the instance is launched. You can specify either the `VirtualName` or `Ebs` ,
             *   but not both.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2db9fbc79bd708ea3ad6349cce8c96ac5bda7031f43285f108268ea1eec10429")
            public fun ebs(ebs: EbsBlockDeviceProperty.Builder.() -> Unit)

            /**
             * @param noDevice Suppresses the specified device included in the AMI's block device
             *   mapping.
             */
            public fun noDevice(noDevice: String)

            /**
             * @param virtualName The virtual device name. For more information, see
             *   [BlockDeviceMapping](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html)
             *   . You can specify either the `VirtualName` or `Ebs` , but not both.
             */
            public fun virtualName(virtualName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty.Builder =
                software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty
                    .builder()

            /**
             * @param deviceName The device name that is exposed to the instance, such as `/dev/sdh`
             *   . For the root device, you can use the explicit device name or you can set this
             *   parameter to `ROOT_DEVICE` and AWS OpsWorks Stacks will provide the correct device
             *   name.
             */
            override fun deviceName(deviceName: String) {
                cdkBuilder.deviceName(deviceName)
            }

            /**
             * @param ebs An `EBSBlockDevice` that defines how to configure an Amazon EBS volume
             *   when the instance is launched. You can specify either the `VirtualName` or `Ebs` ,
             *   but not both.
             */
            override fun ebs(ebs: IResolvable) {
                cdkBuilder.ebs(ebs.let(IResolvable::unwrap))
            }

            /**
             * @param ebs An `EBSBlockDevice` that defines how to configure an Amazon EBS volume
             *   when the instance is launched. You can specify either the `VirtualName` or `Ebs` ,
             *   but not both.
             */
            override fun ebs(ebs: EbsBlockDeviceProperty) {
                cdkBuilder.ebs(ebs.let(EbsBlockDeviceProperty::unwrap))
            }

            /**
             * @param ebs An `EBSBlockDevice` that defines how to configure an Amazon EBS volume
             *   when the instance is launched. You can specify either the `VirtualName` or `Ebs` ,
             *   but not both.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2db9fbc79bd708ea3ad6349cce8c96ac5bda7031f43285f108268ea1eec10429")
            override fun ebs(ebs: EbsBlockDeviceProperty.Builder.() -> Unit): Unit =
                ebs(EbsBlockDeviceProperty(ebs))

            /**
             * @param noDevice Suppresses the specified device included in the AMI's block device
             *   mapping.
             */
            override fun noDevice(noDevice: String) {
                cdkBuilder.noDevice(noDevice)
            }

            /**
             * @param virtualName The virtual device name. For more information, see
             *   [BlockDeviceMapping](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html)
             *   . You can specify either the `VirtualName` or `Ebs` , but not both.
             */
            override fun virtualName(virtualName: String) {
                cdkBuilder.virtualName(virtualName)
            }

            public fun build():
                software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty,
        ) : BlockDeviceMappingProperty {
            /**
             * The device name that is exposed to the instance, such as `/dev/sdh` .
             *
             * For the root device, you can use the explicit device name or you can set this
             * parameter to `ROOT_DEVICE` and AWS OpsWorks Stacks will provide the correct device
             * name.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-devicename)
             */
            override fun deviceName(): String? = unwrap(this).getDeviceName()

            /**
             * An `EBSBlockDevice` that defines how to configure an Amazon EBS volume when the
             * instance is launched.
             *
             * You can specify either the `VirtualName` or `Ebs` , but not both.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-ebs)
             */
            override fun ebs(): Any? = unwrap(this).getEbs()

            /**
             * Suppresses the specified device included in the AMI's block device mapping.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-nodevice)
             */
            override fun noDevice(): String? = unwrap(this).getNoDevice()

            /**
             * The virtual device name.
             *
             * For more information, see
             * [BlockDeviceMapping](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_BlockDeviceMapping.html)
             * . You can specify either the `VirtualName` or `Ebs` , but not both.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-blockdevicemapping.html#cfn-opsworks-instance-blockdevicemapping-virtualname)
             */
            override fun virtualName(): String? = unwrap(this).getVirtualName()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): BlockDeviceMappingProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty
            ): BlockDeviceMappingProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: BlockDeviceMappingProperty
            ): software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
