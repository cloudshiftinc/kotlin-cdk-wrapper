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

public interface CfnWirelessGatewayProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun lastUplinkReceivedAt(): String? = unwrap(this).getLastUplinkReceivedAt()

  public fun loRaWan(): Any

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun thingArn(): String? = unwrap(this).getThingArn()

  public fun thingName(): String? = unwrap(this).getThingName()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun lastUplinkReceivedAt(lastUplinkReceivedAt: String)

    public fun loRaWan(loRaWan: IResolvable)

    public fun loRaWan(loRaWan: CfnWirelessGateway.LoRaWANGatewayProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06a04007c89f4bc1466b1a71e7fd8774f26b7682fade100b25af84b1d1c42a1d")
    public fun loRaWan(loRaWan: CfnWirelessGateway.LoRaWANGatewayProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun thingArn(thingArn: String)

    public fun thingName(thingName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun lastUplinkReceivedAt(lastUplinkReceivedAt: String) {
      cdkBuilder.lastUplinkReceivedAt(lastUplinkReceivedAt)
    }

    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    override fun loRaWan(loRaWan: CfnWirelessGateway.LoRaWANGatewayProperty) {
      cdkBuilder.loRaWan(loRaWan.let(CfnWirelessGateway.LoRaWANGatewayProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06a04007c89f4bc1466b1a71e7fd8774f26b7682fade100b25af84b1d1c42a1d")
    override fun loRaWan(loRaWan: CfnWirelessGateway.LoRaWANGatewayProperty.Builder.() -> Unit):
        Unit = loRaWan(CfnWirelessGateway.LoRaWANGatewayProperty(loRaWan))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun thingArn(thingArn: String) {
      cdkBuilder.thingArn(thingArn)
    }

    override fun thingName(thingName: String) {
      cdkBuilder.thingName(thingName)
    }

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps,
  ) : CdkObject(cdkObject), CfnWirelessGatewayProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun lastUplinkReceivedAt(): String? = unwrap(this).getLastUplinkReceivedAt()

    override fun loRaWan(): Any = unwrap(this).getLoRaWan()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun thingArn(): String? = unwrap(this).getThingArn()

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
