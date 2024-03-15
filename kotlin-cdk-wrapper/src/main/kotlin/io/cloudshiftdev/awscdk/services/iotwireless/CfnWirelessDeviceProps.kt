@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnWirelessDevice`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * CfnWirelessDeviceProps cfnWirelessDeviceProps = CfnWirelessDeviceProps.builder()
 * .destinationName("destinationName")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .lastUplinkReceivedAt("lastUplinkReceivedAt")
 * .loRaWan(LoRaWANDeviceProperty.builder()
 * .abpV10X(AbpV10xProperty.builder()
 * .devAddr("devAddr")
 * .sessionKeys(SessionKeysAbpV10xProperty.builder()
 * .appSKey("appSKey")
 * .nwkSKey("nwkSKey")
 * .build())
 * .build())
 * .abpV11(AbpV11Property.builder()
 * .devAddr("devAddr")
 * .sessionKeys(SessionKeysAbpV11Property.builder()
 * .appSKey("appSKey")
 * .fNwkSIntKey("fNwkSIntKey")
 * .nwkSEncKey("nwkSEncKey")
 * .sNwkSIntKey("sNwkSIntKey")
 * .build())
 * .build())
 * .devEui("devEui")
 * .deviceProfileId("deviceProfileId")
 * .otaaV10X(OtaaV10xProperty.builder()
 * .appEui("appEui")
 * .appKey("appKey")
 * .build())
 * .otaaV11(OtaaV11Property.builder()
 * .appKey("appKey")
 * .joinEui("joinEui")
 * .nwkKey("nwkKey")
 * .build())
 * .serviceProfileId("serviceProfileId")
 * .build())
 * .name("name")
 * .positioning("positioning")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .thingArn("thingArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html)
 */
public interface CfnWirelessDeviceProps {
  /**
   * The description of the new resource.
   *
   * Maximum length is 2048.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the destination to assign to the new wireless device.
   *
   * Can have only have alphanumeric, - (hyphen) and _ (underscore) characters and it can't have any
   * spaces.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-destinationname)
   */
  public fun destinationName(): String

  /**
   * The date and time when the most recent uplink was received.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-lastuplinkreceivedat)
   */
  public fun lastUplinkReceivedAt(): String? = unwrap(this).getLastUplinkReceivedAt()

  /**
   * The device configuration information to use to create the wireless device.
   *
   * Must be at least one of OtaaV10x, OtaaV11, AbpV11, or AbpV10x.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-lorawan)
   */
  public fun loRaWan(): Any? = unwrap(this).getLoRaWan()

  /**
   * The name of the new resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * FPort values for the GNSS, stream, and ClockSync functions of the positioning information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-positioning)
   */
  public fun positioning(): String? = unwrap(this).getPositioning()

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   *
   * Tags can have a minimum of 0 and a maximum of 50 items.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ARN of the thing to associate with the wireless device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-thingarn)
   */
  public fun thingArn(): String? = unwrap(this).getThingArn()

  /**
   * The wireless device type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnWirelessDeviceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the new resource.
     * Maximum length is 2048.
     */
    public fun description(description: String)

    /**
     * @param destinationName The name of the destination to assign to the new wireless device. 
     * Can have only have alphanumeric, - (hyphen) and _ (underscore) characters and it can't have
     * any spaces.
     */
    public fun destinationName(destinationName: String)

    /**
     * @param lastUplinkReceivedAt The date and time when the most recent uplink was received.
     */
    public fun lastUplinkReceivedAt(lastUplinkReceivedAt: String)

    /**
     * @param loRaWan The device configuration information to use to create the wireless device.
     * Must be at least one of OtaaV10x, OtaaV11, AbpV11, or AbpV10x.
     */
    public fun loRaWan(loRaWan: IResolvable)

    /**
     * @param loRaWan The device configuration information to use to create the wireless device.
     * Must be at least one of OtaaV10x, OtaaV11, AbpV11, or AbpV10x.
     */
    public fun loRaWan(loRaWan: CfnWirelessDevice.LoRaWANDeviceProperty)

    /**
     * @param loRaWan The device configuration information to use to create the wireless device.
     * Must be at least one of OtaaV10x, OtaaV11, AbpV11, or AbpV10x.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fbe9be76a65045fa3db34dfaff55ba1861f64b5d7e617a2b00f60689ce1ec77f")
    public fun loRaWan(loRaWan: CfnWirelessDevice.LoRaWANDeviceProperty.Builder.() -> Unit)

    /**
     * @param name The name of the new resource.
     */
    public fun name(name: String)

    /**
     * @param positioning FPort values for the GNSS, stream, and ClockSync functions of the
     * positioning information.
     */
    public fun positioning(positioning: String)

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

    /**
     * @param thingArn The ARN of the thing to associate with the wireless device.
     */
    public fun thingArn(thingArn: String)

    /**
     * @param type The wireless device type. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceProps.builder()

    /**
     * @param description The description of the new resource.
     * Maximum length is 2048.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param destinationName The name of the destination to assign to the new wireless device. 
     * Can have only have alphanumeric, - (hyphen) and _ (underscore) characters and it can't have
     * any spaces.
     */
    override fun destinationName(destinationName: String) {
      cdkBuilder.destinationName(destinationName)
    }

    /**
     * @param lastUplinkReceivedAt The date and time when the most recent uplink was received.
     */
    override fun lastUplinkReceivedAt(lastUplinkReceivedAt: String) {
      cdkBuilder.lastUplinkReceivedAt(lastUplinkReceivedAt)
    }

    /**
     * @param loRaWan The device configuration information to use to create the wireless device.
     * Must be at least one of OtaaV10x, OtaaV11, AbpV11, or AbpV10x.
     */
    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    /**
     * @param loRaWan The device configuration information to use to create the wireless device.
     * Must be at least one of OtaaV10x, OtaaV11, AbpV11, or AbpV10x.
     */
    override fun loRaWan(loRaWan: CfnWirelessDevice.LoRaWANDeviceProperty) {
      cdkBuilder.loRaWan(loRaWan.let(CfnWirelessDevice.LoRaWANDeviceProperty::unwrap))
    }

    /**
     * @param loRaWan The device configuration information to use to create the wireless device.
     * Must be at least one of OtaaV10x, OtaaV11, AbpV11, or AbpV10x.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fbe9be76a65045fa3db34dfaff55ba1861f64b5d7e617a2b00f60689ce1ec77f")
    override fun loRaWan(loRaWan: CfnWirelessDevice.LoRaWANDeviceProperty.Builder.() -> Unit): Unit
        = loRaWan(CfnWirelessDevice.LoRaWANDeviceProperty(loRaWan))

    /**
     * @param name The name of the new resource.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param positioning FPort values for the GNSS, stream, and ClockSync functions of the
     * positioning information.
     */
    override fun positioning(positioning: String) {
      cdkBuilder.positioning(positioning)
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

    /**
     * @param thingArn The ARN of the thing to associate with the wireless device.
     */
    override fun thingArn(thingArn: String) {
      cdkBuilder.thingArn(thingArn)
    }

    /**
     * @param type The wireless device type. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceProps,
  ) : CdkObject(cdkObject), CfnWirelessDeviceProps {
    /**
     * The description of the new resource.
     *
     * Maximum length is 2048.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the destination to assign to the new wireless device.
     *
     * Can have only have alphanumeric, - (hyphen) and _ (underscore) characters and it can't have
     * any spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-destinationname)
     */
    override fun destinationName(): String = unwrap(this).getDestinationName()

    /**
     * The date and time when the most recent uplink was received.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-lastuplinkreceivedat)
     */
    override fun lastUplinkReceivedAt(): String? = unwrap(this).getLastUplinkReceivedAt()

    /**
     * The device configuration information to use to create the wireless device.
     *
     * Must be at least one of OtaaV10x, OtaaV11, AbpV11, or AbpV10x.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-lorawan)
     */
    override fun loRaWan(): Any? = unwrap(this).getLoRaWan()

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * FPort values for the GNSS, stream, and ClockSync functions of the positioning information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-positioning)
     */
    override fun positioning(): String? = unwrap(this).getPositioning()

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ARN of the thing to associate with the wireless device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-thingarn)
     */
    override fun thingArn(): String? = unwrap(this).getThingArn()

    /**
     * The wireless device type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdevice.html#cfn-iotwireless-wirelessdevice-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWirelessDeviceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceProps):
        CfnWirelessDeviceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWirelessDeviceProps):
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceProps
  }
}
