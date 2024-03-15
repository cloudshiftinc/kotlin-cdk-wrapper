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
 * Properties for defining a `CfnWirelessGateway`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * CfnWirelessGatewayProps cfnWirelessGatewayProps = CfnWirelessGatewayProps.builder()
 * .loRaWan(LoRaWANGatewayProperty.builder()
 * .gatewayEui("gatewayEui")
 * .rfRegion("rfRegion")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .lastUplinkReceivedAt("lastUplinkReceivedAt")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .thingArn("thingArn")
 * .thingName("thingName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html)
 */
public interface CfnWirelessGatewayProps {
  /**
   * The description of the new resource.
   *
   * The maximum length is 2048 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The date and time when the most recent uplink was received.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-lastuplinkreceivedat)
   */
  public fun lastUplinkReceivedAt(): String? = unwrap(this).getLastUplinkReceivedAt()

  /**
   * The gateway configuration information to use to create the wireless gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-lorawan)
   */
  public fun loRaWan(): Any

  /**
   * The name of the new resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   *
   * Tags can have a minimum of 0 and a maximum of 50 items.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ARN of the thing to associate with the wireless gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-thingarn)
   */
  public fun thingArn(): String? = unwrap(this).getThingArn()

  /**
   * The name of the thing associated with the wireless gateway.
   *
   * The value is empty if a thing isn't associated with the gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-thingname)
   */
  public fun thingName(): String? = unwrap(this).getThingName()

  /**
   * A builder for [CfnWirelessGatewayProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the new resource.
     * The maximum length is 2048 characters.
     */
    public fun description(description: String)

    /**
     * @param lastUplinkReceivedAt The date and time when the most recent uplink was received.
     */
    public fun lastUplinkReceivedAt(lastUplinkReceivedAt: String)

    /**
     * @param loRaWan The gateway configuration information to use to create the wireless gateway. 
     */
    public fun loRaWan(loRaWan: IResolvable)

    /**
     * @param loRaWan The gateway configuration information to use to create the wireless gateway. 
     */
    public fun loRaWan(loRaWan: CfnWirelessGateway.LoRaWANGatewayProperty)

    /**
     * @param loRaWan The gateway configuration information to use to create the wireless gateway. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06a04007c89f4bc1466b1a71e7fd8774f26b7682fade100b25af84b1d1c42a1d")
    public fun loRaWan(loRaWan: CfnWirelessGateway.LoRaWANGatewayProperty.Builder.() -> Unit)

    /**
     * @param name The name of the new resource.
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

    /**
     * @param thingArn The ARN of the thing to associate with the wireless gateway.
     */
    public fun thingArn(thingArn: String)

    /**
     * @param thingName The name of the thing associated with the wireless gateway.
     * The value is empty if a thing isn't associated with the gateway.
     */
    public fun thingName(thingName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps.builder()

    /**
     * @param description The description of the new resource.
     * The maximum length is 2048 characters.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param lastUplinkReceivedAt The date and time when the most recent uplink was received.
     */
    override fun lastUplinkReceivedAt(lastUplinkReceivedAt: String) {
      cdkBuilder.lastUplinkReceivedAt(lastUplinkReceivedAt)
    }

    /**
     * @param loRaWan The gateway configuration information to use to create the wireless gateway. 
     */
    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    /**
     * @param loRaWan The gateway configuration information to use to create the wireless gateway. 
     */
    override fun loRaWan(loRaWan: CfnWirelessGateway.LoRaWANGatewayProperty) {
      cdkBuilder.loRaWan(loRaWan.let(CfnWirelessGateway.LoRaWANGatewayProperty::unwrap))
    }

    /**
     * @param loRaWan The gateway configuration information to use to create the wireless gateway. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06a04007c89f4bc1466b1a71e7fd8774f26b7682fade100b25af84b1d1c42a1d")
    override fun loRaWan(loRaWan: CfnWirelessGateway.LoRaWANGatewayProperty.Builder.() -> Unit):
        Unit = loRaWan(CfnWirelessGateway.LoRaWANGatewayProperty(loRaWan))

    /**
     * @param name The name of the new resource.
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

    /**
     * @param thingArn The ARN of the thing to associate with the wireless gateway.
     */
    override fun thingArn(thingArn: String) {
      cdkBuilder.thingArn(thingArn)
    }

    /**
     * @param thingName The name of the thing associated with the wireless gateway.
     * The value is empty if a thing isn't associated with the gateway.
     */
    override fun thingName(thingName: String) {
      cdkBuilder.thingName(thingName)
    }

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps,
  ) : CdkObject(cdkObject), CfnWirelessGatewayProps {
    /**
     * The description of the new resource.
     *
     * The maximum length is 2048 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The date and time when the most recent uplink was received.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-lastuplinkreceivedat)
     */
    override fun lastUplinkReceivedAt(): String? = unwrap(this).getLastUplinkReceivedAt()

    /**
     * The gateway configuration information to use to create the wireless gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-lorawan)
     */
    override fun loRaWan(): Any = unwrap(this).getLoRaWan()

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ARN of the thing to associate with the wireless gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-thingarn)
     */
    override fun thingArn(): String? = unwrap(this).getThingArn()

    /**
     * The name of the thing associated with the wireless gateway.
     *
     * The value is empty if a thing isn't associated with the gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessgateway.html#cfn-iotwireless-wirelessgateway-thingname)
     */
    override fun thingName(): String? = unwrap(this).getThingName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWirelessGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps):
        CfnWirelessGatewayProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWirelessGatewayProps):
        software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps
  }
}
