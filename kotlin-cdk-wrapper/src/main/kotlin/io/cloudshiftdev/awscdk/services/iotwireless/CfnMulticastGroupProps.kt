@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

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
 * Properties for defining a `CfnMulticastGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * CfnMulticastGroupProps cfnMulticastGroupProps = CfnMulticastGroupProps.builder()
 * .loRaWan(LoRaWANProperty.builder()
 * .dlClass("dlClass")
 * .rfRegion("rfRegion")
 * // the properties below are optional
 * .numberOfDevicesInGroup(123)
 * .numberOfDevicesRequested(123)
 * .build())
 * // the properties below are optional
 * .associateWirelessDevice("associateWirelessDevice")
 * .description("description")
 * .disassociateWirelessDevice("disassociateWirelessDevice")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-multicastgroup.html)
 */
public interface CfnMulticastGroupProps {
  /**
   * The ID of the wireless device to associate with a multicast group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-multicastgroup.html#cfn-iotwireless-multicastgroup-associatewirelessdevice)
   */
  public fun associateWirelessDevice(): String? = unwrap(this).getAssociateWirelessDevice()

  /**
   * The description of the multicast group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-multicastgroup.html#cfn-iotwireless-multicastgroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the wireless device to disassociate from a multicast group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-multicastgroup.html#cfn-iotwireless-multicastgroup-disassociatewirelessdevice)
   */
  public fun disassociateWirelessDevice(): String? = unwrap(this).getDisassociateWirelessDevice()

  /**
   * The LoRaWAN information that is to be used with the multicast group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-multicastgroup.html#cfn-iotwireless-multicastgroup-lorawan)
   */
  public fun loRaWan(): Any

  /**
   * The name of the multicast group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-multicastgroup.html#cfn-iotwireless-multicastgroup-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   *
   * Tags can have a minimum of 0 and a maximum of 50 items.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-multicastgroup.html#cfn-iotwireless-multicastgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMulticastGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param associateWirelessDevice The ID of the wireless device to associate with a multicast
     * group.
     */
    public fun associateWirelessDevice(associateWirelessDevice: String)

    /**
     * @param description The description of the multicast group.
     */
    public fun description(description: String)

    /**
     * @param disassociateWirelessDevice The ID of the wireless device to disassociate from a
     * multicast group.
     */
    public fun disassociateWirelessDevice(disassociateWirelessDevice: String)

    /**
     * @param loRaWan The LoRaWAN information that is to be used with the multicast group. 
     */
    public fun loRaWan(loRaWan: IResolvable)

    /**
     * @param loRaWan The LoRaWAN information that is to be used with the multicast group. 
     */
    public fun loRaWan(loRaWan: CfnMulticastGroup.LoRaWANProperty)

    /**
     * @param loRaWan The LoRaWAN information that is to be used with the multicast group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2e1d6fd439dfad4f325deaf4e1ed19fde6946a8f75ba4c49c5c0f14bb996cbb")
    public fun loRaWan(loRaWan: CfnMulticastGroup.LoRaWANProperty.Builder.() -> Unit)

    /**
     * @param name The name of the multicast group.
     */
    public fun name(name: String)

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps.builder()

    /**
     * @param associateWirelessDevice The ID of the wireless device to associate with a multicast
     * group.
     */
    override fun associateWirelessDevice(associateWirelessDevice: String) {
      cdkBuilder.associateWirelessDevice(associateWirelessDevice)
    }

    /**
     * @param description The description of the multicast group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param disassociateWirelessDevice The ID of the wireless device to disassociate from a
     * multicast group.
     */
    override fun disassociateWirelessDevice(disassociateWirelessDevice: String) {
      cdkBuilder.disassociateWirelessDevice(disassociateWirelessDevice)
    }

    /**
     * @param loRaWan The LoRaWAN information that is to be used with the multicast group. 
     */
    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    /**
     * @param loRaWan The LoRaWAN information that is to be used with the multicast group. 
     */
    override fun loRaWan(loRaWan: CfnMulticastGroup.LoRaWANProperty) {
      cdkBuilder.loRaWan(loRaWan.let(CfnMulticastGroup.LoRaWANProperty::unwrap))
    }

    /**
     * @param loRaWan The LoRaWAN information that is to be used with the multicast group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2e1d6fd439dfad4f325deaf4e1ed19fde6946a8f75ba4c49c5c0f14bb996cbb")
    override fun loRaWan(loRaWan: CfnMulticastGroup.LoRaWANProperty.Builder.() -> Unit): Unit =
        loRaWan(CfnMulticastGroup.LoRaWANProperty(loRaWan))

    /**
     * @param name The name of the multicast group.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps,
  ) : CdkObject(cdkObject), CfnMulticastGroupProps {
    /**
     * The ID of the wireless device to associate with a multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-multicastgroup.html#cfn-iotwireless-multicastgroup-associatewirelessdevice)
     */
    override fun associateWirelessDevice(): String? = unwrap(this).getAssociateWirelessDevice()

    /**
     * The description of the multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-multicastgroup.html#cfn-iotwireless-multicastgroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the wireless device to disassociate from a multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-multicastgroup.html#cfn-iotwireless-multicastgroup-disassociatewirelessdevice)
     */
    override fun disassociateWirelessDevice(): String? =
        unwrap(this).getDisassociateWirelessDevice()

    /**
     * The LoRaWAN information that is to be used with the multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-multicastgroup.html#cfn-iotwireless-multicastgroup-lorawan)
     */
    override fun loRaWan(): Any = unwrap(this).getLoRaWan()

    /**
     * The name of the multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-multicastgroup.html#cfn-iotwireless-multicastgroup-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-multicastgroup.html#cfn-iotwireless-multicastgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMulticastGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps):
        CfnMulticastGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnMulticastGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMulticastGroupProps):
        software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps
  }
}
