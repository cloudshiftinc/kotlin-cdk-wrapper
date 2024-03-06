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

package io.cloudshiftdev.awscdkdsl.services.opsworks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnInstance
import software.amazon.awscdk.services.opsworks.CfnInstanceProps

/**
 * Properties for defining a `CfnInstance`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * CfnInstanceProps cfnInstanceProps = CfnInstanceProps.builder()
 * .instanceType("instanceType")
 * .layerIds(List.of("layerIds"))
 * .stackId("stackId")
 * // the properties below are optional
 * .agentVersion("agentVersion")
 * .amiId("amiId")
 * .architecture("architecture")
 * .autoScalingType("autoScalingType")
 * .availabilityZone("availabilityZone")
 * .blockDeviceMappings(List.of(BlockDeviceMappingProperty.builder()
 * .deviceName("deviceName")
 * .ebs(EbsBlockDeviceProperty.builder()
 * .deleteOnTermination(false)
 * .iops(123)
 * .snapshotId("snapshotId")
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build())
 * .noDevice("noDevice")
 * .virtualName("virtualName")
 * .build()))
 * .ebsOptimized(false)
 * .elasticIps(List.of("elasticIps"))
 * .hostname("hostname")
 * .installUpdatesOnBoot(false)
 * .os("os")
 * .rootDeviceType("rootDeviceType")
 * .sshKeyName("sshKeyName")
 * .subnetId("subnetId")
 * .tenancy("tenancy")
 * .timeBasedAutoScaling(TimeBasedAutoScalingProperty.builder()
 * .friday(Map.of(
 * "fridayKey", "friday"))
 * .monday(Map.of(
 * "mondayKey", "monday"))
 * .saturday(Map.of(
 * "saturdayKey", "saturday"))
 * .sunday(Map.of(
 * "sundayKey", "sunday"))
 * .thursday(Map.of(
 * "thursdayKey", "thursday"))
 * .tuesday(Map.of(
 * "tuesdayKey", "tuesday"))
 * .wednesday(Map.of(
 * "wednesdayKey", "wednesday"))
 * .build())
 * .virtualizationType("virtualizationType")
 * .volumes(List.of("volumes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-instance.html)
 */
@CdkDslMarker
public class CfnInstancePropsDsl {
    private val cdkBuilder: CfnInstanceProps.Builder = CfnInstanceProps.builder()

    private val _blockDeviceMappings: MutableList<Any> = mutableListOf()

    private val _elasticIps: MutableList<String> = mutableListOf()

    private val _layerIds: MutableList<String> = mutableListOf()

    private val _volumes: MutableList<String> = mutableListOf()

    /**
     * @param agentVersion The default AWS OpsWorks Stacks agent version. You have the following
     *   options:.
     * * `INHERIT` - Use the stack's default agent version setting.
     * * *version_number* - Use the specified agent version. This value overrides the stack's
     *   default setting. To update the agent version, edit the instance configuration and specify a
     *   new version. AWS OpsWorks Stacks installs that version on the instance.
     *
     * The default setting is `INHERIT` . To specify an agent version, you must use the complete
     * version number, not the abbreviated number shown on the console. For a list of available
     * agent version numbers, call `DescribeAgentVersions` . AgentVersion cannot be set to Chef
     * 12.2.
     */
    public fun agentVersion(agentVersion: String) {
        cdkBuilder.agentVersion(agentVersion)
    }

    /**
     * @param amiId A custom AMI ID to be used to create the instance. The AMI should be based on
     *   one of the supported operating systems. For more information, see
     *   [Using Custom AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html)
     *   .
     *
     * If you specify a custom AMI, you must set `Os` to `Custom` .
     */
    public fun amiId(amiId: String) {
        cdkBuilder.amiId(amiId)
    }

    /**
     * @param architecture The instance architecture. The default option is `x86_64` . Instance
     *   types do not necessarily support both architectures. For a list of the architectures that
     *   are supported by the different instance types, see
     *   [Instance Families and Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html)
     *   .
     */
    public fun architecture(architecture: String) {
        cdkBuilder.architecture(architecture)
    }

    /**
     * @param autoScalingType For load-based or time-based instances, the type. Windows stacks can
     *   use only time-based instances.
     */
    public fun autoScalingType(autoScalingType: String) {
        cdkBuilder.autoScalingType(autoScalingType)
    }

    /**
     * @param availabilityZone The Availability Zone of the AWS OpsWorks instance, such as
     *   `us-east-2a` .
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param blockDeviceMappings An array of `BlockDeviceMapping` objects that specify the
     *   instance's block devices. For more information, see
     *   [Block Device Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     *   . Note that block device mappings are not supported for custom AMIs.
     */
    public fun blockDeviceMappings(vararg blockDeviceMappings: Any) {
        _blockDeviceMappings.addAll(listOf(*blockDeviceMappings))
    }

    /**
     * @param blockDeviceMappings An array of `BlockDeviceMapping` objects that specify the
     *   instance's block devices. For more information, see
     *   [Block Device Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     *   . Note that block device mappings are not supported for custom AMIs.
     */
    public fun blockDeviceMappings(blockDeviceMappings: Collection<Any>) {
        _blockDeviceMappings.addAll(blockDeviceMappings)
    }

    /**
     * @param blockDeviceMappings An array of `BlockDeviceMapping` objects that specify the
     *   instance's block devices. For more information, see
     *   [Block Device Mapping](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     *   . Note that block device mappings are not supported for custom AMIs.
     */
    public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    /** @param ebsOptimized Whether to create an Amazon EBS-optimized instance. */
    public fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /** @param ebsOptimized Whether to create an Amazon EBS-optimized instance. */
    public fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /** @param elasticIps A list of Elastic IP addresses to associate with the instance. */
    public fun elasticIps(vararg elasticIps: String) {
        _elasticIps.addAll(listOf(*elasticIps))
    }

    /** @param elasticIps A list of Elastic IP addresses to associate with the instance. */
    public fun elasticIps(elasticIps: Collection<String>) {
        _elasticIps.addAll(elasticIps)
    }

    /**
     * @param hostname The instance host name. The following are character limits for instance host
     *   names.
     * * Linux-based instances: 63 characters
     * * Windows-based instances: 15 characters
     */
    public fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
    }

    /**
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *   instance boots. The default value is `true` . To control when updates are installed, set
     *   this value to `false` . You must then update your instances manually by using
     *   `CreateDeployment` to run the `update_dependencies` stack command or by manually running
     *   `yum` (Amazon Linux) or `apt-get` (Ubuntu) on the instances.
     *
     * We strongly recommend using the default value of `true` to ensure that your instances have
     * the latest security updates.
     */
    public fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean) {
        cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
    }

    /**
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *   instance boots. The default value is `true` . To control when updates are installed, set
     *   this value to `false` . You must then update your instances manually by using
     *   `CreateDeployment` to run the `update_dependencies` stack command or by manually running
     *   `yum` (Amazon Linux) or `apt-get` (Ubuntu) on the instances.
     *
     * We strongly recommend using the default value of `true` to ensure that your instances have
     * the latest security updates.
     */
    public fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable) {
        cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
    }

    /**
     * @param instanceType The instance type, such as `t2.micro` . For a list of supported instance
     *   types, open the stack in the console, choose *Instances* , and choose *+ Instance* . The
     *   *Size* list contains the currently supported types. For more information, see
     *   [Instance Families and Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html)
     *   . The parameter values that you use to specify the various types are in the *API Name*
     *   column of the *Available Instance Types* table.
     */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /** @param layerIds An array that contains the instance's layer IDs. */
    public fun layerIds(vararg layerIds: String) {
        _layerIds.addAll(listOf(*layerIds))
    }

    /** @param layerIds An array that contains the instance's layer IDs. */
    public fun layerIds(layerIds: Collection<String>) {
        _layerIds.addAll(layerIds)
    }

    /**
     * @param os The instance's operating system, which must be set to one of the following.
     * * A supported Linux operating system: An Amazon Linux version, such as `Amazon Linux 2` ,
     *   `Amazon Linux 2018.03` , `Amazon Linux 2017.09` , `Amazon Linux 2017.03` , `Amazon Linux
     *   2016.09` , `Amazon Linux 2016.03` , `Amazon Linux 2015.09` , or `Amazon Linux 2015.03` .
     * * A supported Ubuntu operating system, such as `Ubuntu 18.04 LTS` , `Ubuntu 16.04 LTS` ,
     *   `Ubuntu 14.04 LTS` , or `Ubuntu 12.04 LTS` .
     * * `CentOS Linux 7`
     * * `Red Hat Enterprise Linux 7`
     * * A supported Windows operating system, such as `Microsoft Windows Server 2012 R2 Base` ,
     *   `Microsoft Windows Server 2012 R2 with SQL Server Express` , `Microsoft Windows Server 2012
     *   R2 with SQL Server Standard` , or `Microsoft Windows Server 2012 R2 with SQL Server Web` .
     * * A custom AMI: `Custom` .
     *
     * Not all operating systems are supported with all versions of Chef. For more information about
     * the supported operating systems, see
     * [AWS OpsWorks Stacks Operating Systems](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html)
     * .
     *
     * The default option is the current Amazon Linux version. If you set this parameter to `Custom`
     * , you must use the `CreateInstance` action's AmiId parameter to specify the custom AMI that
     * you want to use. Block device mappings are not supported if the value is `Custom` . For more
     * information about how to use custom AMIs with AWS OpsWorks Stacks, see
     * [Using Custom AMIs](https://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html)
     * .
     */
    public fun os(os: String) {
        cdkBuilder.os(os)
    }

    /**
     * @param rootDeviceType The instance root device type. For more information, see
     *   [Storage for the Root Device](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device)
     *   .
     */
    public fun rootDeviceType(rootDeviceType: String) {
        cdkBuilder.rootDeviceType(rootDeviceType)
    }

    /** @param sshKeyName The instance's Amazon EC2 key-pair name. */
    public fun sshKeyName(sshKeyName: String) {
        cdkBuilder.sshKeyName(sshKeyName)
    }

    /** @param stackId The stack ID. */
    public fun stackId(stackId: String) {
        cdkBuilder.stackId(stackId)
    }

    /**
     * @param subnetId The ID of the instance's subnet. If the stack is running in a VPC, you can
     *   use this parameter to override the stack's default subnet ID value and direct AWS OpsWorks
     *   Stacks to launch the instance in a different subnet.
     */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    /**
     * @param tenancy The instance's tenancy option. The default option is no tenancy, or if the
     *   instance is running in a VPC, inherit tenancy settings from the VPC. The following are
     *   valid values for this parameter: `dedicated` , `default` , or `host` . Because there are
     *   costs associated with changes in tenancy options, we recommend that you research tenancy
     *   options before choosing them for your instances. For more information about dedicated
     *   hosts, see [Dedicated Hosts Overview](https://docs.aws.amazon.com/ec2/dedicated-hosts/) and
     *   [Amazon EC2 Dedicated Hosts](https://docs.aws.amazon.com/ec2/dedicated-hosts/) . For more
     *   information about dedicated instances, see
     *   [Dedicated Instances](https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/dedicated-instance.html)
     *   and
     *   [Amazon EC2 Dedicated Instances](https://docs.aws.amazon.com/ec2/purchasing-options/dedicated-instances/)
     *   .
     */
    public fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
    }

    /** @param timeBasedAutoScaling The time-based scaling configuration for the instance. */
    public fun timeBasedAutoScaling(timeBasedAutoScaling: IResolvable) {
        cdkBuilder.timeBasedAutoScaling(timeBasedAutoScaling)
    }

    /** @param timeBasedAutoScaling The time-based scaling configuration for the instance. */
    public fun timeBasedAutoScaling(
        timeBasedAutoScaling: CfnInstance.TimeBasedAutoScalingProperty
    ) {
        cdkBuilder.timeBasedAutoScaling(timeBasedAutoScaling)
    }

    /** @param virtualizationType The instance's virtualization type, `paravirtual` or `hvm` . */
    public fun virtualizationType(virtualizationType: String) {
        cdkBuilder.virtualizationType(virtualizationType)
    }

    /**
     * @param volumes A list of AWS OpsWorks volume IDs to associate with the instance. For more
     *   information, see
     *   [`AWS::OpsWorks::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
     *   .
     */
    public fun volumes(vararg volumes: String) {
        _volumes.addAll(listOf(*volumes))
    }

    /**
     * @param volumes A list of AWS OpsWorks volume IDs to associate with the instance. For more
     *   information, see
     *   [`AWS::OpsWorks::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
     *   .
     */
    public fun volumes(volumes: Collection<String>) {
        _volumes.addAll(volumes)
    }

    public fun build(): CfnInstanceProps {
        if (_blockDeviceMappings.isNotEmpty()) cdkBuilder.blockDeviceMappings(_blockDeviceMappings)
        if (_elasticIps.isNotEmpty()) cdkBuilder.elasticIps(_elasticIps)
        if (_layerIds.isNotEmpty()) cdkBuilder.layerIds(_layerIds)
        if (_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
        return cdkBuilder.build()
    }
}
