package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnListener internal constructor(
  private val cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnListener,
) : CfnResource(cdkObject), IInspectable {
  public open fun acceleratorArn(): String = unwrap(this).getAcceleratorArn()

  public open fun acceleratorArn(`value`: String) {
    unwrap(this).setAcceleratorArn(`value`)
  }

  public open fun attrListenerArn(): String = unwrap(this).getAttrListenerArn()

  public open fun clientAffinity(): String? = unwrap(this).getClientAffinity()

  public open fun clientAffinity(`value`: String) {
    unwrap(this).setClientAffinity(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun portRanges(): Any = unwrap(this).getPortRanges()

  public open fun portRanges(`value`: IResolvable) {
    unwrap(this).setPortRanges(`value`.let(IResolvable::unwrap))
  }

  public open fun portRanges(__idx_ac66f0: List<Any>) {
    unwrap(this).setPortRanges(__idx_ac66f0)
  }

  public open fun protocol(): String = unwrap(this).getProtocol()

  public open fun protocol(`value`: String) {
    unwrap(this).setProtocol(`value`)
  }

  public interface Builder {
    public fun acceleratorArn(acceleratorArn: String)

    public fun clientAffinity(clientAffinity: String)

    public fun portRanges(portRanges: IResolvable)

    public fun portRanges(portRanges: List<Any>)

    public fun protocol(protocol: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.CfnListener.Builder =
        software.amazon.awscdk.services.globalaccelerator.CfnListener.Builder.create(scope, id)

    override fun acceleratorArn(acceleratorArn: String) {
      cdkBuilder.acceleratorArn(acceleratorArn)
    }

    override fun clientAffinity(clientAffinity: String) {
      cdkBuilder.clientAffinity(clientAffinity)
    }

    override fun portRanges(portRanges: IResolvable) {
      cdkBuilder.portRanges(portRanges.let(IResolvable::unwrap))
    }

    override fun portRanges(portRanges: List<Any>) {
      cdkBuilder.portRanges(portRanges)
    }

    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.CfnListener =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnListener {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnListener(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnListener):
        CfnListener = CfnListener(cdkObject)

    internal fun unwrap(wrapped: CfnListener):
        software.amazon.awscdk.services.globalaccelerator.CfnListener = wrapped.cdkObject
  }

  public interface PortRangeProperty {
    public fun fromPort(): Number

    public fun toPort(): Number

    public interface Builder {
      public fun fromPort(fromPort: Number)

      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.globalaccelerator.CfnListener.PortRangeProperty.Builder =
          software.amazon.awscdk.services.globalaccelerator.CfnListener.PortRangeProperty.builder()

      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build():
          software.amazon.awscdk.services.globalaccelerator.CfnListener.PortRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.globalaccelerator.CfnListener.PortRangeProperty,
    ) : PortRangeProperty {
      override fun fromPort(): Number = unwrap(this).getFromPort()

      override fun toPort(): Number = unwrap(this).getToPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PortRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnListener.PortRangeProperty):
          PortRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortRangeProperty):
          software.amazon.awscdk.services.globalaccelerator.CfnListener.PortRangeProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
