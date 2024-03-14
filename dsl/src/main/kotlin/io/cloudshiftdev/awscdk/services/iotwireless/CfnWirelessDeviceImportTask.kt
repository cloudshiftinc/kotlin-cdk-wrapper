package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWirelessDeviceImportTask internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationDate(): String = unwrap(this).getAttrCreationDate()

  public open fun attrFailedImportedDevicesCount(): Number =
      unwrap(this).getAttrFailedImportedDevicesCount()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrInitializedImportedDevicesCount(): Number =
      unwrap(this).getAttrInitializedImportedDevicesCount()

  public open fun attrOnboardedImportedDevicesCount(): Number =
      unwrap(this).getAttrOnboardedImportedDevicesCount()

  public open fun attrPendingImportedDevicesCount(): Number =
      unwrap(this).getAttrPendingImportedDevicesCount()

  public open fun attrSidewalkDeviceCreationFileList(): List<String> =
      unwrap(this).getAttrSidewalkDeviceCreationFileList() ?: emptyList()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrStatusReason(): String = unwrap(this).getAttrStatusReason()

  public open fun destinationName(): String = unwrap(this).getDestinationName()

  public open fun destinationName(`value`: String) {
    unwrap(this).setDestinationName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun sidewalk(): Any = unwrap(this).getSidewalk()

  public open fun sidewalk(`value`: IResolvable) {
    unwrap(this).setSidewalk(`value`.let(IResolvable::unwrap))
  }

  public open fun sidewalk(`value`: SidewalkProperty) {
    unwrap(this).setSidewalk(`value`.let(SidewalkProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f795bf524d146d57223cf1813dcf96f73cd0d35b8be75b71a849a32ac93efcc6")
  public open fun sidewalk(`value`: SidewalkProperty.Builder.() -> Unit): Unit =
      sidewalk(SidewalkProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun destinationName(destinationName: String)

    public fun sidewalk(sidewalk: IResolvable)

    public fun sidewalk(sidewalk: SidewalkProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("618b8fa4fb0220c54e94bd1ed512f164f5fbddbea8503e502a125a9aab7252d8")
    public fun sidewalk(sidewalk: SidewalkProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.Builder =
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.Builder.create(scope,
        id)

    override fun destinationName(destinationName: String) {
      cdkBuilder.destinationName(destinationName)
    }

    override fun sidewalk(sidewalk: IResolvable) {
      cdkBuilder.sidewalk(sidewalk.let(IResolvable::unwrap))
    }

    override fun sidewalk(sidewalk: SidewalkProperty) {
      cdkBuilder.sidewalk(sidewalk.let(SidewalkProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("618b8fa4fb0220c54e94bd1ed512f164f5fbddbea8503e502a125a9aab7252d8")
    override fun sidewalk(sidewalk: SidewalkProperty.Builder.() -> Unit): Unit =
        sidewalk(SidewalkProperty(sidewalk))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWirelessDeviceImportTask {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWirelessDeviceImportTask(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask):
        CfnWirelessDeviceImportTask = CfnWirelessDeviceImportTask(cdkObject)

    internal fun unwrap(wrapped: CfnWirelessDeviceImportTask):
        software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask = wrapped.cdkObject
  }

  public interface SidewalkProperty {
    public fun deviceCreationFile(): String? = unwrap(this).getDeviceCreationFile()

    public fun deviceCreationFileList(): List<String> = unwrap(this).getDeviceCreationFileList() ?:
        emptyList()

    public fun role(): String? = unwrap(this).getRole()

    public fun sidewalkManufacturingSn(): String? = unwrap(this).getSidewalkManufacturingSn()

    public interface Builder {
      public fun deviceCreationFile(deviceCreationFile: String)

      public fun deviceCreationFileList(deviceCreationFileList: List<String>)

      public fun role(role: String)

      public fun sidewalkManufacturingSn(sidewalkManufacturingSn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.SidewalkProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.SidewalkProperty.builder()

      override fun deviceCreationFile(deviceCreationFile: String) {
        cdkBuilder.deviceCreationFile(deviceCreationFile)
      }

      override fun deviceCreationFileList(deviceCreationFileList: List<String>) {
        cdkBuilder.deviceCreationFileList(deviceCreationFileList)
      }

      override fun role(role: String) {
        cdkBuilder.role(role)
      }

      override fun sidewalkManufacturingSn(sidewalkManufacturingSn: String) {
        cdkBuilder.sidewalkManufacturingSn(sidewalkManufacturingSn)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.SidewalkProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.SidewalkProperty,
    ) : SidewalkProperty {
      override fun deviceCreationFile(): String? = unwrap(this).getDeviceCreationFile()

      override fun deviceCreationFileList(): List<String> = unwrap(this).getDeviceCreationFileList()
          ?: emptyList()

      override fun role(): String? = unwrap(this).getRole()

      override fun sidewalkManufacturingSn(): String? = unwrap(this).getSidewalkManufacturingSn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SidewalkProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.SidewalkProperty):
          SidewalkProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SidewalkProperty):
          software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask.SidewalkProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
