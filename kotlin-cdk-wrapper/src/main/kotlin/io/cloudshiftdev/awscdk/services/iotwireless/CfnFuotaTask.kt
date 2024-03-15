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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFuotaTask internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnFuotaTask,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun associateMulticastGroup(): String? = unwrap(this).getAssociateMulticastGroup()

  public open fun associateMulticastGroup(`value`: String) {
    unwrap(this).setAssociateMulticastGroup(`value`)
  }

  public open fun associateWirelessDevice(): String? = unwrap(this).getAssociateWirelessDevice()

  public open fun associateWirelessDevice(`value`: String) {
    unwrap(this).setAssociateWirelessDevice(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrFuotaTaskStatus(): String = unwrap(this).getAttrFuotaTaskStatus()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLoRaWanStartTime(): String = unwrap(this).getAttrLoRaWanStartTime()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun disassociateMulticastGroup(): String? =
      unwrap(this).getDisassociateMulticastGroup()

  public open fun disassociateMulticastGroup(`value`: String) {
    unwrap(this).setDisassociateMulticastGroup(`value`)
  }

  public open fun disassociateWirelessDevice(): String? =
      unwrap(this).getDisassociateWirelessDevice()

  public open fun disassociateWirelessDevice(`value`: String) {
    unwrap(this).setDisassociateWirelessDevice(`value`)
  }

  public open fun firmwareUpdateImage(): String = unwrap(this).getFirmwareUpdateImage()

  public open fun firmwareUpdateImage(`value`: String) {
    unwrap(this).setFirmwareUpdateImage(`value`)
  }

  public open fun firmwareUpdateRole(): String = unwrap(this).getFirmwareUpdateRole()

  public open fun firmwareUpdateRole(`value`: String) {
    unwrap(this).setFirmwareUpdateRole(`value`)
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
  @JvmName("4a99e06309f086f4cd6781a2cb253828db431bd9066893acad4c92bd8426a230")
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
    public fun associateMulticastGroup(associateMulticastGroup: String)

    public fun associateWirelessDevice(associateWirelessDevice: String)

    public fun description(description: String)

    public fun disassociateMulticastGroup(disassociateMulticastGroup: String)

    public fun disassociateWirelessDevice(disassociateWirelessDevice: String)

    public fun firmwareUpdateImage(firmwareUpdateImage: String)

    public fun firmwareUpdateRole(firmwareUpdateRole: String)

    public fun loRaWan(loRaWan: IResolvable)

    public fun loRaWan(loRaWan: LoRaWANProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c48060063cf77fafc4ecbb90c1bb6c1b3396b527ab5f61f846c7acaf7fcccd7")
    public fun loRaWan(loRaWan: LoRaWANProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnFuotaTask.Builder =
        software.amazon.awscdk.services.iotwireless.CfnFuotaTask.Builder.create(scope, id)

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

    override fun loRaWan(loRaWan: LoRaWANProperty) {
      cdkBuilder.loRaWan(loRaWan.let(LoRaWANProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c48060063cf77fafc4ecbb90c1bb6c1b3396b527ab5f61f846c7acaf7fcccd7")
    override fun loRaWan(loRaWan: LoRaWANProperty.Builder.() -> Unit): Unit =
        loRaWan(LoRaWANProperty(loRaWan))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnFuotaTask =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotwireless.CfnFuotaTask.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFuotaTask {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFuotaTask(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnFuotaTask):
        CfnFuotaTask = CfnFuotaTask(cdkObject)

    internal fun unwrap(wrapped: CfnFuotaTask):
        software.amazon.awscdk.services.iotwireless.CfnFuotaTask = wrapped.cdkObject
  }

  public interface LoRaWANProperty {
    public fun rfRegion(): String

    public fun startTime(): String? = unwrap(this).getStartTime()

    @CdkDslMarker
    public interface Builder {
      public fun rfRegion(rfRegion: String)

      public fun startTime(startTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty.Builder =
          software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty.builder()

      override fun rfRegion(rfRegion: String) {
        cdkBuilder.rfRegion(rfRegion)
      }

      override fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
      }

      public fun build(): software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty,
    ) : CdkObject(cdkObject), LoRaWANProperty {
      override fun rfRegion(): String = unwrap(this).getRfRegion()

      override fun startTime(): String? = unwrap(this).getStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoRaWANProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty):
          LoRaWANProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANProperty):
          software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty
    }
  }
}
