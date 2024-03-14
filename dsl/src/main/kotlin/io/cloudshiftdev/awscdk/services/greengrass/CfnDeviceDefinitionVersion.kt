package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDeviceDefinitionVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun deviceDefinitionId(): String = unwrap(this).getDeviceDefinitionId()

  public open fun deviceDefinitionId(`value`: String) {
    unwrap(this).setDeviceDefinitionId(`value`)
  }

  public open fun devices(): Any = unwrap(this).getDevices()

  public open fun devices(`value`: IResolvable) {
    unwrap(this).setDevices(`value`.let(IResolvable::unwrap))
  }

  public open fun devices(__idx_ac66f0: List<Any>) {
    unwrap(this).setDevices(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun deviceDefinitionId(deviceDefinitionId: String)

    public fun devices(devices: IResolvable)

    public fun devices(devices: List<Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.Builder.create(scope,
        id)

    override fun deviceDefinitionId(deviceDefinitionId: String) {
      cdkBuilder.deviceDefinitionId(deviceDefinitionId)
    }

    override fun devices(devices: IResolvable) {
      cdkBuilder.devices(devices.let(IResolvable::unwrap))
    }

    override fun devices(devices: List<Any>) {
      cdkBuilder.devices(devices)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeviceDefinitionVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeviceDefinitionVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion):
        CfnDeviceDefinitionVersion = CfnDeviceDefinitionVersion(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceDefinitionVersion):
        software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion = wrapped.cdkObject
  }

  public interface DeviceProperty {
    public fun certificateArn(): String

    public fun id(): String

    public fun syncShadow(): Any? = unwrap(this).getSyncShadow()

    public fun thingArn(): String

    public interface Builder {
      public fun certificateArn(certificateArn: String)

      public fun id(id: String)

      public fun syncShadow(syncShadow: Boolean)

      public fun syncShadow(syncShadow: IResolvable)

      public fun thingArn(thingArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.DeviceProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.DeviceProperty.builder()

      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun syncShadow(syncShadow: Boolean) {
        cdkBuilder.syncShadow(syncShadow)
      }

      override fun syncShadow(syncShadow: IResolvable) {
        cdkBuilder.syncShadow(syncShadow.let(IResolvable::unwrap))
      }

      override fun thingArn(thingArn: String) {
        cdkBuilder.thingArn(thingArn)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.DeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.DeviceProperty,
    ) : DeviceProperty {
      override fun certificateArn(): String = unwrap(this).getCertificateArn()

      override fun id(): String = unwrap(this).getId()

      override fun syncShadow(): Any? = unwrap(this).getSyncShadow()

      override fun thingArn(): String = unwrap(this).getThingArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.DeviceProperty):
          DeviceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceProperty):
          software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion.DeviceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
