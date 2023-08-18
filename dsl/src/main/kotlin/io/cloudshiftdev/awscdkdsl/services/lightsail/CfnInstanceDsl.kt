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

package io.cloudshiftdev.awscdkdsl.services.lightsail

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnInstance
import software.constructs.Construct

/**
 * The `AWS::Lightsail::Instance` resource specifies an Amazon Lightsail instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * CfnInstance cfnInstance = CfnInstance.Builder.create(this, "MyCfnInstance")
 * .blueprintId("blueprintId")
 * .bundleId("bundleId")
 * .instanceName("instanceName")
 * // the properties below are optional
 * .addOns(List.of(AddOnProperty.builder()
 * .addOnType("addOnType")
 * // the properties below are optional
 * .autoSnapshotAddOnRequest(AutoSnapshotAddOnProperty.builder()
 * .snapshotTimeOfDay("snapshotTimeOfDay")
 * .build())
 * .status("status")
 * .build()))
 * .availabilityZone("availabilityZone")
 * .hardware(HardwareProperty.builder()
 * .cpuCount(123)
 * .disks(List.of(DiskProperty.builder()
 * .diskName("diskName")
 * .path("path")
 * // the properties below are optional
 * .attachedTo("attachedTo")
 * .attachmentState("attachmentState")
 * .iops(123)
 * .isSystemDisk(false)
 * .sizeInGb("sizeInGb")
 * .build()))
 * .ramSizeInGb(123)
 * .build())
 * .keyPairName("keyPairName")
 * .location(LocationProperty.builder()
 * .availabilityZone("availabilityZone")
 * .regionName("regionName")
 * .build())
 * .networking(NetworkingProperty.builder()
 * .ports(List.of(PortProperty.builder()
 * .accessDirection("accessDirection")
 * .accessFrom("accessFrom")
 * .accessType("accessType")
 * .cidrListAliases(List.of("cidrListAliases"))
 * .cidrs(List.of("cidrs"))
 * .commonName("commonName")
 * .fromPort(123)
 * .ipv6Cidrs(List.of("ipv6Cidrs"))
 * .protocol("protocol")
 * .toPort(123)
 * .build()))
 * // the properties below are optional
 * .monthlyTransfer(123)
 * .build())
 * .state(StateProperty.builder()
 * .code(123)
 * .name("name")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userData("userData")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html)
 */
@CdkDslMarker
public class CfnInstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnInstance.Builder = CfnInstance.Builder.create(scope, id)

    private val _addOns: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * An array of add-ons for the instance.
     *
     * If the instance has an add-on enabled when performing a delete instance request, the add-on
     * is automatically disabled before the instance is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-addons)
     *
     * @param addOns An array of add-ons for the instance.
     */
    public fun addOns(vararg addOns: Any) {
        _addOns.addAll(listOf(*addOns))
    }

    /**
     * An array of add-ons for the instance.
     *
     * If the instance has an add-on enabled when performing a delete instance request, the add-on
     * is automatically disabled before the instance is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-addons)
     *
     * @param addOns An array of add-ons for the instance.
     */
    public fun addOns(addOns: Collection<Any>) {
        _addOns.addAll(addOns)
    }

    /**
     * An array of add-ons for the instance.
     *
     * If the instance has an add-on enabled when performing a delete instance request, the add-on
     * is automatically disabled before the instance is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-addons)
     *
     * @param addOns An array of add-ons for the instance.
     */
    public fun addOns(addOns: IResolvable) {
        cdkBuilder.addOns(addOns)
    }

    /**
     * The Availability Zone for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-availabilityzone)
     *
     * @param availabilityZone The Availability Zone for the instance.
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * The blueprint ID for the instance (for example, `os_amlinux_2016_03` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-blueprintid)
     *
     * @param blueprintId The blueprint ID for the instance (for example, `os_amlinux_2016_03` ).
     */
    public fun blueprintId(blueprintId: String) {
        cdkBuilder.blueprintId(blueprintId)
    }

    /**
     * The bundle ID for the instance (for example, `micro_1_0` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-bundleid)
     *
     * @param bundleId The bundle ID for the instance (for example, `micro_1_0` ).
     */
    public fun bundleId(bundleId: String) {
        cdkBuilder.bundleId(bundleId)
    }

    /**
     * The hardware properties for the instance, such as the vCPU count, attached disks, and amount
     * of RAM.
     *
     * The instance restarts when performing an attach disk or detach disk request. This resets the
     * public IP address of your instance if a static IP isn't attached to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-hardware)
     *
     * @param hardware The hardware properties for the instance, such as the vCPU count, attached
     *   disks, and amount of RAM.
     */
    public fun hardware(hardware: IResolvable) {
        cdkBuilder.hardware(hardware)
    }

    /**
     * The hardware properties for the instance, such as the vCPU count, attached disks, and amount
     * of RAM.
     *
     * The instance restarts when performing an attach disk or detach disk request. This resets the
     * public IP address of your instance if a static IP isn't attached to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-hardware)
     *
     * @param hardware The hardware properties for the instance, such as the vCPU count, attached
     *   disks, and amount of RAM.
     */
    public fun hardware(hardware: CfnInstance.HardwareProperty) {
        cdkBuilder.hardware(hardware)
    }

    /**
     * The name of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-instancename)
     *
     * @param instanceName The name of the instance.
     */
    public fun instanceName(instanceName: String) {
        cdkBuilder.instanceName(instanceName)
    }

    /**
     * The name of the key pair to use for the instance.
     *
     * If no key pair name is specified, the Regional Lightsail default key pair is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-keypairname)
     *
     * @param keyPairName The name of the key pair to use for the instance.
     */
    public fun keyPairName(keyPairName: String) {
        cdkBuilder.keyPairName(keyPairName)
    }

    /**
     * The location for the instance, such as the AWS Region and Availability Zone.
     *
     * The `Location` property is read-only and should not be specified in a create instance or
     * update instance request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-location)
     *
     * @param location The location for the instance, such as the AWS Region and Availability Zone.
     */
    public fun location(location: IResolvable) {
        cdkBuilder.location(location)
    }

    /**
     * The location for the instance, such as the AWS Region and Availability Zone.
     *
     * The `Location` property is read-only and should not be specified in a create instance or
     * update instance request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-location)
     *
     * @param location The location for the instance, such as the AWS Region and Availability Zone.
     */
    public fun location(location: CfnInstance.LocationProperty) {
        cdkBuilder.location(location)
    }

    /**
     * The public ports and the monthly amount of data transfer allocated for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-networking)
     *
     * @param networking The public ports and the monthly amount of data transfer allocated for the
     *   instance.
     */
    public fun networking(networking: IResolvable) {
        cdkBuilder.networking(networking)
    }

    /**
     * The public ports and the monthly amount of data transfer allocated for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-networking)
     *
     * @param networking The public ports and the monthly amount of data transfer allocated for the
     *   instance.
     */
    public fun networking(networking: CfnInstance.NetworkingProperty) {
        cdkBuilder.networking(networking)
    }

    /**
     * The status code and the state (for example, `running` ) of the instance.
     *
     * The `State` property is read-only and should not be specified in a create instance or update
     * instance request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-state)
     *
     * @param state The status code and the state (for example, `running` ) of the instance.
     */
    public fun state(state: IResolvable) {
        cdkBuilder.state(state)
    }

    /**
     * The status code and the state (for example, `running` ) of the instance.
     *
     * The `State` property is read-only and should not be specified in a create instance or update
     * instance request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-state)
     *
     * @param state The status code and the state (for example, `running` ) of the instance.
     */
    public fun state(state: CfnInstance.StateProperty) {
        cdkBuilder.state(state)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The optional launch script for the instance.
     *
     * Specify a launch script to configure an instance with additional user data. For example, you
     * might want to specify `apt-get -y update` as a launch script.
     *
     * Depending on the blueprint of your instance, the command to get software on your instance
     * varies. Amazon Linux and CentOS use `yum` , Debian and Ubuntu use `apt-get` , and FreeBSD
     * uses `pkg` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-userdata)
     *
     * @param userData The optional launch script for the instance.
     */
    public fun userData(userData: String) {
        cdkBuilder.userData(userData)
    }

    public fun build(): CfnInstance {
        if (_addOns.isNotEmpty()) cdkBuilder.addOns(_addOns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
