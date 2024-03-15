@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMulticastGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnMulticastGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun associateWirelessDevice(): String? = unwrap(this).getAssociateWirelessDevice()

  public open fun associateWirelessDevice(`value`: String) {
    unwrap(this).setAssociateWirelessDevice(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLoRaWanNumberOfDevicesInGroup(): Number =
      unwrap(this).getAttrLoRaWanNumberOfDevicesInGroup()

  public open fun attrLoRaWanNumberOfDevicesRequested(): Number =
      unwrap(this).getAttrLoRaWanNumberOfDevicesRequested()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun disassociateWirelessDevice(): String? =
      unwrap(this).getDisassociateWirelessDevice()

  public open fun disassociateWirelessDevice(`value`: String) {
    unwrap(this).setDisassociateWirelessDevice(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loRaWan(): Any = unwrap(this).getLoRaWan()

  public open fun loRaWan(`value`: IResolvable) {
    unwrap(this).setLoRaWan(`value`.let(IResolvable::unwrap))
  }

  public open fun loRaWan(`value`: LoRaWANProperty) {
    unwrap(this).setLoRaWan(`value`.let(LoRaWANProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ca632aeb7f2eeef983633b1b61a2bd08b2e8ff57e2a7f825712dc93ed3b1198b")
  public open fun loRaWan(`value`: LoRaWANProperty.Builder.() -> Unit): Unit =
      loRaWan(LoRaWANProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun associateWirelessDevice(associateWirelessDevice: String)

    public fun description(description: String)

    public fun disassociateWirelessDevice(disassociateWirelessDevice: String)

    public fun loRaWan(loRaWan: IResolvable)

    public fun loRaWan(loRaWan: LoRaWANProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28e81466f9f53e95dc3ea306e87391160bd8fd845ac2861cffba3f0c6e021678")
    public fun loRaWan(loRaWan: LoRaWANProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.Builder =
        software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.Builder.create(scope, id)

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

    override fun loRaWan(loRaWan: LoRaWANProperty) {
      cdkBuilder.loRaWan(loRaWan.let(LoRaWANProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28e81466f9f53e95dc3ea306e87391160bd8fd845ac2861cffba3f0c6e021678")
    override fun loRaWan(loRaWan: LoRaWANProperty.Builder.() -> Unit): Unit =
        loRaWan(LoRaWANProperty(loRaWan))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnMulticastGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMulticastGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMulticastGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnMulticastGroup):
        CfnMulticastGroup = CfnMulticastGroup(cdkObject)

    internal fun unwrap(wrapped: CfnMulticastGroup):
        software.amazon.awscdk.services.iotwireless.CfnMulticastGroup = wrapped.cdkObject
  }

  public interface LoRaWANProperty {
    public fun dlClass(): String

    public fun numberOfDevicesInGroup(): Number? = unwrap(this).getNumberOfDevicesInGroup()

    public fun numberOfDevicesRequested(): Number? = unwrap(this).getNumberOfDevicesRequested()

    public fun rfRegion(): String

    @CdkDslMarker
    public interface Builder {
      public fun dlClass(dlClass: String)

      public fun numberOfDevicesInGroup(numberOfDevicesInGroup: Number)

      public fun numberOfDevicesRequested(numberOfDevicesRequested: Number)

      public fun rfRegion(rfRegion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.LoRaWANProperty.Builder =
          software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.LoRaWANProperty.builder()

      override fun dlClass(dlClass: String) {
        cdkBuilder.dlClass(dlClass)
      }

      override fun numberOfDevicesInGroup(numberOfDevicesInGroup: Number) {
        cdkBuilder.numberOfDevicesInGroup(numberOfDevicesInGroup)
      }

      override fun numberOfDevicesRequested(numberOfDevicesRequested: Number) {
        cdkBuilder.numberOfDevicesRequested(numberOfDevicesRequested)
      }

      override fun rfRegion(rfRegion: String) {
        cdkBuilder.rfRegion(rfRegion)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.LoRaWANProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.LoRaWANProperty,
    ) : CdkObject(cdkObject), LoRaWANProperty {
      override fun dlClass(): String = unwrap(this).getDlClass()

      override fun numberOfDevicesInGroup(): Number? = unwrap(this).getNumberOfDevicesInGroup()

      override fun numberOfDevicesRequested(): Number? = unwrap(this).getNumberOfDevicesRequested()

      override fun rfRegion(): String = unwrap(this).getRfRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoRaWANProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.LoRaWANProperty):
          LoRaWANProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANProperty):
          software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.LoRaWANProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.LoRaWANProperty
    }
  }
}
