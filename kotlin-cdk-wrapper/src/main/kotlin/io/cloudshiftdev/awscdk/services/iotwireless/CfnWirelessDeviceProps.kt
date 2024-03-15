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

public interface CfnWirelessDeviceProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun destinationName(): String

  public fun lastUplinkReceivedAt(): String? = unwrap(this).getLastUplinkReceivedAt()

  public fun loRaWan(): Any? = unwrap(this).getLoRaWan()

  public fun name(): String? = unwrap(this).getName()

  public fun positioning(): String? = unwrap(this).getPositioning()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun thingArn(): String? = unwrap(this).getThingArn()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun destinationName(destinationName: String)

    public fun lastUplinkReceivedAt(lastUplinkReceivedAt: String)

    public fun loRaWan(loRaWan: IResolvable)

    public fun loRaWan(loRaWan: CfnWirelessDevice.LoRaWANDeviceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fbe9be76a65045fa3db34dfaff55ba1861f64b5d7e617a2b00f60689ce1ec77f")
    public fun loRaWan(loRaWan: CfnWirelessDevice.LoRaWANDeviceProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun positioning(positioning: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun thingArn(thingArn: String)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun destinationName(destinationName: String) {
      cdkBuilder.destinationName(destinationName)
    }

    override fun lastUplinkReceivedAt(lastUplinkReceivedAt: String) {
      cdkBuilder.lastUplinkReceivedAt(lastUplinkReceivedAt)
    }

    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    override fun loRaWan(loRaWan: CfnWirelessDevice.LoRaWANDeviceProperty) {
      cdkBuilder.loRaWan(loRaWan.let(CfnWirelessDevice.LoRaWANDeviceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fbe9be76a65045fa3db34dfaff55ba1861f64b5d7e617a2b00f60689ce1ec77f")
    override fun loRaWan(loRaWan: CfnWirelessDevice.LoRaWANDeviceProperty.Builder.() -> Unit): Unit
        = loRaWan(CfnWirelessDevice.LoRaWANDeviceProperty(loRaWan))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun positioning(positioning: String) {
      cdkBuilder.positioning(positioning)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun thingArn(thingArn: String) {
      cdkBuilder.thingArn(thingArn)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceProps,
  ) : CdkObject(cdkObject), CfnWirelessDeviceProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun destinationName(): String = unwrap(this).getDestinationName()

    override fun lastUplinkReceivedAt(): String? = unwrap(this).getLastUplinkReceivedAt()

    override fun loRaWan(): Any? = unwrap(this).getLoRaWan()

    override fun name(): String? = unwrap(this).getName()

    override fun positioning(): String? = unwrap(this).getPositioning()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun thingArn(): String? = unwrap(this).getThingArn()

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
