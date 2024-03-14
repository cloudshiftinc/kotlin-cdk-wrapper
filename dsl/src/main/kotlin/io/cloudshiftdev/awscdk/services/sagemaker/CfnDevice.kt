package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDevice internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnDevice,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun device(): Any? = unwrap(this).getDevice()

  public open fun device(`value`: IResolvable) {
    unwrap(this).setDevice(`value`.let(IResolvable::unwrap))
  }

  public open fun device(`value`: DeviceProperty) {
    unwrap(this).setDevice(`value`.let(DeviceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5dc42cc2f36fb4751c3405dc6520f75e5415ededd8012c92c62e372483e96b8")
  public open fun device(`value`: DeviceProperty.Builder.() -> Unit): Unit =
      device(DeviceProperty(`value`))

  public open fun deviceFleetName(): String = unwrap(this).getDeviceFleetName()

  public open fun deviceFleetName(`value`: String) {
    unwrap(this).setDeviceFleetName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun device(device: IResolvable) {
    }

    public fun device(device: DeviceProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b4e7a7e3cbe04285da0f7a5e0957f8dec55dd96ae1f2aa55cb43fe225fccb36")
    public fun device(device: DeviceProperty.Builder.() -> Unit) {
    }

    public fun deviceFleetName(deviceFleetName: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnDevice.Builder =
        software.amazon.awscdk.services.sagemaker.CfnDevice.Builder.create(scope, id)

    public override fun device(device: IResolvable) {
      cdkBuilder.device(device.let(IResolvable::unwrap))
    }

    public override fun device(device: DeviceProperty) {
      cdkBuilder.device(device.let(DeviceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b4e7a7e3cbe04285da0f7a5e0957f8dec55dd96ae1f2aa55cb43fe225fccb36")
    public override fun device(device: DeviceProperty.Builder.() -> Unit): Unit =
        device(DeviceProperty(device))

    public override fun deviceFleetName(deviceFleetName: String) {
      cdkBuilder.deviceFleetName(deviceFleetName)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnDevice = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDevice {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDevice(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDevice): CfnDevice =
        CfnDevice(cdkObject)

    internal fun unwrap(wrapped: CfnDevice): software.amazon.awscdk.services.sagemaker.CfnDevice =
        wrapped.cdkObject
  }

  public interface DeviceProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun deviceName(): String

    public fun iotThingName(): String? = unwrap(this).getIotThingName()

    public interface Builder {
      public fun description(description: String) {
      }

      public fun deviceName(deviceName: String) {
      }

      public fun iotThingName(iotThingName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      public override fun iotThingName(iotThingName: String) {
        cdkBuilder.iotThingName(iotThingName)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty,
    ) : DeviceProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun deviceName(): String = unwrap(this).getDeviceName()

      public override fun iotThingName(): String? = unwrap(this).getIotThingName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty):
          DeviceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceProperty):
          software.amazon.awscdk.services.sagemaker.CfnDevice.DeviceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
