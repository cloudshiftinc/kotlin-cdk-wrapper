package io.cloudshiftdev.awscdk.services.iot1click

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDevice internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot1click.CfnDevice,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrDeviceId(): String = unwrap(this).getAttrDeviceId()

  public open fun attrEnabled(): IResolvable = unwrap(this).getAttrEnabled().let(IResolvable::wrap)

  public open fun deviceId(): String = unwrap(this).getDeviceId()

  public open fun deviceId(`value`: String) {
    unwrap(this).setDeviceId(`value`)
  }

  public open fun enabled(): Any = unwrap(this).getEnabled()

  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun deviceId(deviceId: String) {
    }

    public fun enabled(enabled: Boolean) {
    }

    public fun enabled(enabled: IResolvable) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot1click.CfnDevice.Builder =
        software.amazon.awscdk.services.iot1click.CfnDevice.Builder.create(scope, id)

    public override fun deviceId(deviceId: String) {
      cdkBuilder.deviceId(deviceId)
    }

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iot1click.CfnDevice = cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot1click.CfnDevice): CfnDevice =
        CfnDevice(cdkObject)

    internal fun unwrap(wrapped: CfnDevice): software.amazon.awscdk.services.iot1click.CfnDevice =
        wrapped.cdkObject
  }
}
