@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
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
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
 * CfnInstanceProps cfnInstanceProps = CfnInstanceProps.builder()
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
 * .monthlyTransfer(MonthlyTransferProperty.builder()
 * .gbPerMonthAllocated("gbPerMonthAllocated")
 * .build())
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
public interface CfnInstanceProps {
  /**
   * An array of add-ons for the instance.
   *
   *
   * If the instance has an add-on enabled when performing a delete instance request, the add-on is
   * automatically disabled before the instance is deleted.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-addons)
   */
  public fun addOns(): Any? = unwrap(this).getAddOns()

  /**
   * The Availability Zone for the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-availabilityzone)
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The blueprint ID for the instance (for example, `os_amlinux_2016_03` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-blueprintid)
   */
  public fun blueprintId(): String

  /**
   * The bundle ID for the instance (for example, `micro_1_0` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-bundleid)
   */
  public fun bundleId(): String

  /**
   * The hardware properties for the instance, such as the vCPU count, attached disks, and amount of
   * RAM.
   *
   *
   * The instance restarts when performing an attach disk or detach disk request. This resets the
   * public IP address of your instance if a static IP isn't attached to it.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-hardware)
   */
  public fun hardware(): Any? = unwrap(this).getHardware()

  /**
   * The name of the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-instancename)
   */
  public fun instanceName(): String

  /**
   * The name of the key pair to use for the instance.
   *
   * If no key pair name is specified, the Regional Lightsail default key pair is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-keypairname)
   */
  public fun keyPairName(): String? = unwrap(this).getKeyPairName()

  /**
   * The location for the instance, such as the AWS Region and Availability Zone.
   *
   *
   * The `Location` property is read-only and should not be specified in a create instance or update
   * instance request.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-location)
   */
  public fun location(): Any? = unwrap(this).getLocation()

  /**
   * The public ports and the monthly amount of data transfer allocated for the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-networking)
   */
  public fun networking(): Any? = unwrap(this).getNetworking()

  /**
   * The status code and the state (for example, `running` ) of the instance.
   *
   *
   * The `State` property is read-only and should not be specified in a create instance or update
   * instance request.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-state)
   */
  public fun state(): Any? = unwrap(this).getState()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *AWS CloudFormation User Guide* .
   *
   *
   * The `Value` of `Tags` is optional for Lightsail resources.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The optional launch script for the instance.
   *
   * Specify a launch script to configure an instance with additional user data. For example, you
   * might want to specify `apt-get -y update` as a launch script.
   *
   *
   * Depending on the blueprint of your instance, the command to get software on your instance
   * varies. Amazon Linux and CentOS use `yum` , Debian and Ubuntu use `apt-get` , and FreeBSD uses
   * `pkg` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-userdata)
   */
  public fun userData(): String? = unwrap(this).getUserData()

  /**
   * A builder for [CfnInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addOns An array of add-ons for the instance.
     *
     * If the instance has an add-on enabled when performing a delete instance request, the add-on
     * is automatically disabled before the instance is deleted.
     */
    public fun addOns(addOns: IResolvable)

    /**
     * @param addOns An array of add-ons for the instance.
     *
     * If the instance has an add-on enabled when performing a delete instance request, the add-on
     * is automatically disabled before the instance is deleted.
     */
    public fun addOns(addOns: List<Any>)

    /**
     * @param addOns An array of add-ons for the instance.
     *
     * If the instance has an add-on enabled when performing a delete instance request, the add-on
     * is automatically disabled before the instance is deleted.
     */
    public fun addOns(vararg addOns: Any)

    /**
     * @param availabilityZone The Availability Zone for the instance.
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param blueprintId The blueprint ID for the instance (for example, `os_amlinux_2016_03` ). 
     */
    public fun blueprintId(blueprintId: String)

    /**
     * @param bundleId The bundle ID for the instance (for example, `micro_1_0` ). 
     */
    public fun bundleId(bundleId: String)

    /**
     * @param hardware The hardware properties for the instance, such as the vCPU count, attached
     * disks, and amount of RAM.
     *
     * The instance restarts when performing an attach disk or detach disk request. This resets the
     * public IP address of your instance if a static IP isn't attached to it.
     */
    public fun hardware(hardware: IResolvable)

    /**
     * @param hardware The hardware properties for the instance, such as the vCPU count, attached
     * disks, and amount of RAM.
     *
     * The instance restarts when performing an attach disk or detach disk request. This resets the
     * public IP address of your instance if a static IP isn't attached to it.
     */
    public fun hardware(hardware: CfnInstance.HardwareProperty)

    /**
     * @param hardware The hardware properties for the instance, such as the vCPU count, attached
     * disks, and amount of RAM.
     *
     * The instance restarts when performing an attach disk or detach disk request. This resets the
     * public IP address of your instance if a static IP isn't attached to it.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53764cfbdcef1b3bf24d253e23c907a685ce56955266b940e4a04835e2523fa4")
    public fun hardware(hardware: CfnInstance.HardwareProperty.Builder.() -> Unit)

    /**
     * @param instanceName The name of the instance. 
     */
    public fun instanceName(instanceName: String)

    /**
     * @param keyPairName The name of the key pair to use for the instance.
     * If no key pair name is specified, the Regional Lightsail default key pair is used.
     */
    public fun keyPairName(keyPairName: String)

    /**
     * @param location The location for the instance, such as the AWS Region and Availability Zone.
     *
     * The `Location` property is read-only and should not be specified in a create instance or
     * update instance request.
     */
    public fun location(location: IResolvable)

    /**
     * @param location The location for the instance, such as the AWS Region and Availability Zone.
     *
     * The `Location` property is read-only and should not be specified in a create instance or
     * update instance request.
     */
    public fun location(location: CfnInstance.LocationProperty)

    /**
     * @param location The location for the instance, such as the AWS Region and Availability Zone.
     *
     * The `Location` property is read-only and should not be specified in a create instance or
     * update instance request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d4dced965c5f90881a8d1fac148b93491120c7663f84190cd34162493f499413")
    public fun location(location: CfnInstance.LocationProperty.Builder.() -> Unit)

    /**
     * @param networking The public ports and the monthly amount of data transfer allocated for the
     * instance.
     */
    public fun networking(networking: IResolvable)

    /**
     * @param networking The public ports and the monthly amount of data transfer allocated for the
     * instance.
     */
    public fun networking(networking: CfnInstance.NetworkingProperty)

    /**
     * @param networking The public ports and the monthly amount of data transfer allocated for the
     * instance.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18aec6aa9f7b234006fe1cb1adcf0e2e729120477cd845051b65b16fccdfc5c1")
    public fun networking(networking: CfnInstance.NetworkingProperty.Builder.() -> Unit)

    /**
     * @param state The status code and the state (for example, `running` ) of the instance.
     *
     * The `State` property is read-only and should not be specified in a create instance or update
     * instance request.
     */
    public fun state(state: IResolvable)

    /**
     * @param state The status code and the state (for example, `running` ) of the instance.
     *
     * The `State` property is read-only and should not be specified in a create instance or update
     * instance request.
     */
    public fun state(state: CfnInstance.StateProperty)

    /**
     * @param state The status code and the state (for example, `running` ) of the instance.
     *
     * The `State` property is read-only and should not be specified in a create instance or update
     * instance request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7963b88a8c56834294d35803a5d74d17fdcee203cf342ad2f0c45eef0df2da58")
    public fun state(state: CfnInstance.StateProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param userData The optional launch script for the instance.
     * Specify a launch script to configure an instance with additional user data. For example, you
     * might want to specify `apt-get -y update` as a launch script.
     *
     *
     * Depending on the blueprint of your instance, the command to get software on your instance
     * varies. Amazon Linux and CentOS use `yum` , Debian and Ubuntu use `apt-get` , and FreeBSD uses
     * `pkg` .
     */
    public fun userData(userData: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnInstanceProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnInstanceProps.builder()

    /**
     * @param addOns An array of add-ons for the instance.
     *
     * If the instance has an add-on enabled when performing a delete instance request, the add-on
     * is automatically disabled before the instance is deleted.
     */
    override fun addOns(addOns: IResolvable) {
      cdkBuilder.addOns(addOns.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param addOns An array of add-ons for the instance.
     *
     * If the instance has an add-on enabled when performing a delete instance request, the add-on
     * is automatically disabled before the instance is deleted.
     */
    override fun addOns(addOns: List<Any>) {
      cdkBuilder.addOns(addOns.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param addOns An array of add-ons for the instance.
     *
     * If the instance has an add-on enabled when performing a delete instance request, the add-on
     * is automatically disabled before the instance is deleted.
     */
    override fun addOns(vararg addOns: Any): Unit = addOns(addOns.toList())

    /**
     * @param availabilityZone The Availability Zone for the instance.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param blueprintId The blueprint ID for the instance (for example, `os_amlinux_2016_03` ). 
     */
    override fun blueprintId(blueprintId: String) {
      cdkBuilder.blueprintId(blueprintId)
    }

    /**
     * @param bundleId The bundle ID for the instance (for example, `micro_1_0` ). 
     */
    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    /**
     * @param hardware The hardware properties for the instance, such as the vCPU count, attached
     * disks, and amount of RAM.
     *
     * The instance restarts when performing an attach disk or detach disk request. This resets the
     * public IP address of your instance if a static IP isn't attached to it.
     */
    override fun hardware(hardware: IResolvable) {
      cdkBuilder.hardware(hardware.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param hardware The hardware properties for the instance, such as the vCPU count, attached
     * disks, and amount of RAM.
     *
     * The instance restarts when performing an attach disk or detach disk request. This resets the
     * public IP address of your instance if a static IP isn't attached to it.
     */
    override fun hardware(hardware: CfnInstance.HardwareProperty) {
      cdkBuilder.hardware(hardware.let(CfnInstance.HardwareProperty.Companion::unwrap))
    }

    /**
     * @param hardware The hardware properties for the instance, such as the vCPU count, attached
     * disks, and amount of RAM.
     *
     * The instance restarts when performing an attach disk or detach disk request. This resets the
     * public IP address of your instance if a static IP isn't attached to it.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53764cfbdcef1b3bf24d253e23c907a685ce56955266b940e4a04835e2523fa4")
    override fun hardware(hardware: CfnInstance.HardwareProperty.Builder.() -> Unit): Unit =
        hardware(CfnInstance.HardwareProperty(hardware))

    /**
     * @param instanceName The name of the instance. 
     */
    override fun instanceName(instanceName: String) {
      cdkBuilder.instanceName(instanceName)
    }

    /**
     * @param keyPairName The name of the key pair to use for the instance.
     * If no key pair name is specified, the Regional Lightsail default key pair is used.
     */
    override fun keyPairName(keyPairName: String) {
      cdkBuilder.keyPairName(keyPairName)
    }

    /**
     * @param location The location for the instance, such as the AWS Region and Availability Zone.
     *
     * The `Location` property is read-only and should not be specified in a create instance or
     * update instance request.
     */
    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param location The location for the instance, such as the AWS Region and Availability Zone.
     *
     * The `Location` property is read-only and should not be specified in a create instance or
     * update instance request.
     */
    override fun location(location: CfnInstance.LocationProperty) {
      cdkBuilder.location(location.let(CfnInstance.LocationProperty.Companion::unwrap))
    }

    /**
     * @param location The location for the instance, such as the AWS Region and Availability Zone.
     *
     * The `Location` property is read-only and should not be specified in a create instance or
     * update instance request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d4dced965c5f90881a8d1fac148b93491120c7663f84190cd34162493f499413")
    override fun location(location: CfnInstance.LocationProperty.Builder.() -> Unit): Unit =
        location(CfnInstance.LocationProperty(location))

    /**
     * @param networking The public ports and the monthly amount of data transfer allocated for the
     * instance.
     */
    override fun networking(networking: IResolvable) {
      cdkBuilder.networking(networking.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param networking The public ports and the monthly amount of data transfer allocated for the
     * instance.
     */
    override fun networking(networking: CfnInstance.NetworkingProperty) {
      cdkBuilder.networking(networking.let(CfnInstance.NetworkingProperty.Companion::unwrap))
    }

    /**
     * @param networking The public ports and the monthly amount of data transfer allocated for the
     * instance.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18aec6aa9f7b234006fe1cb1adcf0e2e729120477cd845051b65b16fccdfc5c1")
    override fun networking(networking: CfnInstance.NetworkingProperty.Builder.() -> Unit): Unit =
        networking(CfnInstance.NetworkingProperty(networking))

    /**
     * @param state The status code and the state (for example, `running` ) of the instance.
     *
     * The `State` property is read-only and should not be specified in a create instance or update
     * instance request.
     */
    override fun state(state: IResolvable) {
      cdkBuilder.state(state.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param state The status code and the state (for example, `running` ) of the instance.
     *
     * The `State` property is read-only and should not be specified in a create instance or update
     * instance request.
     */
    override fun state(state: CfnInstance.StateProperty) {
      cdkBuilder.state(state.let(CfnInstance.StateProperty.Companion::unwrap))
    }

    /**
     * @param state The status code and the state (for example, `running` ) of the instance.
     *
     * The `State` property is read-only and should not be specified in a create instance or update
     * instance request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7963b88a8c56834294d35803a5d74d17fdcee203cf342ad2f0c45eef0df2da58")
    override fun state(state: CfnInstance.StateProperty.Builder.() -> Unit): Unit =
        state(CfnInstance.StateProperty(state))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param userData The optional launch script for the instance.
     * Specify a launch script to configure an instance with additional user data. For example, you
     * might want to specify `apt-get -y update` as a launch script.
     *
     *
     * Depending on the blueprint of your instance, the command to get software on your instance
     * varies. Amazon Linux and CentOS use `yum` , Debian and Ubuntu use `apt-get` , and FreeBSD uses
     * `pkg` .
     */
    override fun userData(userData: String) {
      cdkBuilder.userData(userData)
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lightsail.CfnInstanceProps,
  ) : CdkObject(cdkObject), CfnInstanceProps {
    /**
     * An array of add-ons for the instance.
     *
     *
     * If the instance has an add-on enabled when performing a delete instance request, the add-on
     * is automatically disabled before the instance is deleted.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-addons)
     */
    override fun addOns(): Any? = unwrap(this).getAddOns()

    /**
     * The Availability Zone for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-availabilityzone)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The blueprint ID for the instance (for example, `os_amlinux_2016_03` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-blueprintid)
     */
    override fun blueprintId(): String = unwrap(this).getBlueprintId()

    /**
     * The bundle ID for the instance (for example, `micro_1_0` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-bundleid)
     */
    override fun bundleId(): String = unwrap(this).getBundleId()

    /**
     * The hardware properties for the instance, such as the vCPU count, attached disks, and amount
     * of RAM.
     *
     *
     * The instance restarts when performing an attach disk or detach disk request. This resets the
     * public IP address of your instance if a static IP isn't attached to it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-hardware)
     */
    override fun hardware(): Any? = unwrap(this).getHardware()

    /**
     * The name of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-instancename)
     */
    override fun instanceName(): String = unwrap(this).getInstanceName()

    /**
     * The name of the key pair to use for the instance.
     *
     * If no key pair name is specified, the Regional Lightsail default key pair is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-keypairname)
     */
    override fun keyPairName(): String? = unwrap(this).getKeyPairName()

    /**
     * The location for the instance, such as the AWS Region and Availability Zone.
     *
     *
     * The `Location` property is read-only and should not be specified in a create instance or
     * update instance request.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-location)
     */
    override fun location(): Any? = unwrap(this).getLocation()

    /**
     * The public ports and the monthly amount of data transfer allocated for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-networking)
     */
    override fun networking(): Any? = unwrap(this).getNetworking()

    /**
     * The status code and the state (for example, `running` ) of the instance.
     *
     *
     * The `State` property is read-only and should not be specified in a create instance or update
     * instance request.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-state)
     */
    override fun state(): Any? = unwrap(this).getState()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The optional launch script for the instance.
     *
     * Specify a launch script to configure an instance with additional user data. For example, you
     * might want to specify `apt-get -y update` as a launch script.
     *
     *
     * Depending on the blueprint of your instance, the command to get software on your instance
     * varies. Amazon Linux and CentOS use `yum` , Debian and Ubuntu use `apt-get` , and FreeBSD uses
     * `pkg` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-userdata)
     */
    override fun userData(): String? = unwrap(this).getUserData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnInstanceProps):
        CfnInstanceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnInstanceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProps):
        software.amazon.awscdk.services.lightsail.CfnInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lightsail.CfnInstanceProps
  }
}
