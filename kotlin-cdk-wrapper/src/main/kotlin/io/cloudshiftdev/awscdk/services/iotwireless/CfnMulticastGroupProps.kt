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

public interface CfnMulticastGroupProps {
  public fun associateWirelessDevice(): String? = unwrap(this).getAssociateWirelessDevice()

  public fun description(): String? = unwrap(this).getDescription()

  public fun disassociateWirelessDevice(): String? = unwrap(this).getDisassociateWirelessDevice()

  public fun loRaWan(): Any

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun associateWirelessDevice(associateWirelessDevice: String)

    public fun description(description: String)

    public fun disassociateWirelessDevice(disassociateWirelessDevice: String)

    public fun loRaWan(loRaWan: IResolvable)

    public fun loRaWan(loRaWan: CfnMulticastGroup.LoRaWANProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2e1d6fd439dfad4f325deaf4e1ed19fde6946a8f75ba4c49c5c0f14bb996cbb")
    public fun loRaWan(loRaWan: CfnMulticastGroup.LoRaWANProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps.builder()

    override fun associateWirelessDevice(associateWirelessDevice: String) {
      cdkBuilder.associateWirelessDevice(associateWirelessDevice)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun disassociateWirelessDevice(disassociateWirelessDevice: String) {
      cdkBuilder.disassociateWirelessDevice(disassociateWirelessDevice)
    }

    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    override fun loRaWan(loRaWan: CfnMulticastGroup.LoRaWANProperty) {
      cdkBuilder.loRaWan(loRaWan.let(CfnMulticastGroup.LoRaWANProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2e1d6fd439dfad4f325deaf4e1ed19fde6946a8f75ba4c49c5c0f14bb996cbb")
    override fun loRaWan(loRaWan: CfnMulticastGroup.LoRaWANProperty.Builder.() -> Unit): Unit =
        loRaWan(CfnMulticastGroup.LoRaWANProperty(loRaWan))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps,
  ) : CdkObject(cdkObject), CfnMulticastGroupProps {
    override fun associateWirelessDevice(): String? = unwrap(this).getAssociateWirelessDevice()

    override fun description(): String? = unwrap(this).getDescription()

    override fun disassociateWirelessDevice(): String? =
        unwrap(this).getDisassociateWirelessDevice()

    override fun loRaWan(): Any = unwrap(this).getLoRaWan()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMulticastGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps):
        CfnMulticastGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMulticastGroupProps):
        software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps
  }
}
