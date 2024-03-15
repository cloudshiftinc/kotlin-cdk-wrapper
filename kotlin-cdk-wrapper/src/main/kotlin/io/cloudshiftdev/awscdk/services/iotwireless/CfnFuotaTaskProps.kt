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

public interface CfnFuotaTaskProps {
  public fun associateMulticastGroup(): String? = unwrap(this).getAssociateMulticastGroup()

  public fun associateWirelessDevice(): String? = unwrap(this).getAssociateWirelessDevice()

  public fun description(): String? = unwrap(this).getDescription()

  public fun disassociateMulticastGroup(): String? = unwrap(this).getDisassociateMulticastGroup()

  public fun disassociateWirelessDevice(): String? = unwrap(this).getDisassociateWirelessDevice()

  public fun firmwareUpdateImage(): String

  public fun firmwareUpdateRole(): String

  public fun loRaWan(): Any

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun associateMulticastGroup(associateMulticastGroup: String)

    public fun associateWirelessDevice(associateWirelessDevice: String)

    public fun description(description: String)

    public fun disassociateMulticastGroup(disassociateMulticastGroup: String)

    public fun disassociateWirelessDevice(disassociateWirelessDevice: String)

    public fun firmwareUpdateImage(firmwareUpdateImage: String)

    public fun firmwareUpdateRole(firmwareUpdateRole: String)

    public fun loRaWan(loRaWan: IResolvable)

    public fun loRaWan(loRaWan: CfnFuotaTask.LoRaWANProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3671dd8d1ba30d7154ca30e9175b9be2df9bba82b1da0d7c86d54e3d1856eea3")
    public fun loRaWan(loRaWan: CfnFuotaTask.LoRaWANProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps.builder()

    override fun associateMulticastGroup(associateMulticastGroup: String) {
      cdkBuilder.associateMulticastGroup(associateMulticastGroup)
    }

    override fun associateWirelessDevice(associateWirelessDevice: String) {
      cdkBuilder.associateWirelessDevice(associateWirelessDevice)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun disassociateMulticastGroup(disassociateMulticastGroup: String) {
      cdkBuilder.disassociateMulticastGroup(disassociateMulticastGroup)
    }

    override fun disassociateWirelessDevice(disassociateWirelessDevice: String) {
      cdkBuilder.disassociateWirelessDevice(disassociateWirelessDevice)
    }

    override fun firmwareUpdateImage(firmwareUpdateImage: String) {
      cdkBuilder.firmwareUpdateImage(firmwareUpdateImage)
    }

    override fun firmwareUpdateRole(firmwareUpdateRole: String) {
      cdkBuilder.firmwareUpdateRole(firmwareUpdateRole)
    }

    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    override fun loRaWan(loRaWan: CfnFuotaTask.LoRaWANProperty) {
      cdkBuilder.loRaWan(loRaWan.let(CfnFuotaTask.LoRaWANProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3671dd8d1ba30d7154ca30e9175b9be2df9bba82b1da0d7c86d54e3d1856eea3")
    override fun loRaWan(loRaWan: CfnFuotaTask.LoRaWANProperty.Builder.() -> Unit): Unit =
        loRaWan(CfnFuotaTask.LoRaWANProperty(loRaWan))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps,
  ) : CdkObject(cdkObject), CfnFuotaTaskProps {
    override fun associateMulticastGroup(): String? = unwrap(this).getAssociateMulticastGroup()

    override fun associateWirelessDevice(): String? = unwrap(this).getAssociateWirelessDevice()

    override fun description(): String? = unwrap(this).getDescription()

    override fun disassociateMulticastGroup(): String? =
        unwrap(this).getDisassociateMulticastGroup()

    override fun disassociateWirelessDevice(): String? =
        unwrap(this).getDisassociateWirelessDevice()

    override fun firmwareUpdateImage(): String = unwrap(this).getFirmwareUpdateImage()

    override fun firmwareUpdateRole(): String = unwrap(this).getFirmwareUpdateRole()

    override fun loRaWan(): Any = unwrap(this).getLoRaWan()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFuotaTaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps):
        CfnFuotaTaskProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFuotaTaskProps):
        software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps
  }
}
