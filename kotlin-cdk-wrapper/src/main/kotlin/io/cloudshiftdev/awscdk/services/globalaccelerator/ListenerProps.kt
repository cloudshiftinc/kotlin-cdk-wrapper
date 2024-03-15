@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ListenerProps : ListenerOptions {
  public fun accelerator(): IAccelerator

  @CdkDslMarker
  public interface Builder {
    public fun accelerator(accelerator: IAccelerator)

    public fun clientAffinity(clientAffinity: ClientAffinity)

    public fun listenerName(listenerName: String)

    public fun portRanges(portRanges: List<PortRange>)

    public fun portRanges(vararg portRanges: PortRange)

    public fun protocol(protocol: ConnectionProtocol)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.ListenerProps.Builder
        = software.amazon.awscdk.services.globalaccelerator.ListenerProps.builder()

    override fun accelerator(accelerator: IAccelerator) {
      cdkBuilder.accelerator(accelerator.let(IAccelerator::unwrap))
    }

    override fun clientAffinity(clientAffinity: ClientAffinity) {
      cdkBuilder.clientAffinity(clientAffinity.let(ClientAffinity::unwrap))
    }

    override fun listenerName(listenerName: String) {
      cdkBuilder.listenerName(listenerName)
    }

    override fun portRanges(portRanges: List<PortRange>) {
      cdkBuilder.portRanges(portRanges.map(PortRange::unwrap))
    }

    override fun portRanges(vararg portRanges: PortRange): Unit = portRanges(portRanges.toList())

    override fun protocol(protocol: ConnectionProtocol) {
      cdkBuilder.protocol(protocol.let(ConnectionProtocol::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.ListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.globalaccelerator.ListenerProps,
  ) : CdkObject(cdkObject), ListenerProps {
    override fun accelerator(): IAccelerator = unwrap(this).getAccelerator().let(IAccelerator::wrap)

    override fun clientAffinity(): ClientAffinity? =
        unwrap(this).getClientAffinity()?.let(ClientAffinity::wrap)

    override fun listenerName(): String? = unwrap(this).getListenerName()

    override fun portRanges(): List<PortRange> = unwrap(this).getPortRanges().map(PortRange::wrap)

    override fun protocol(): ConnectionProtocol? =
        unwrap(this).getProtocol()?.let(ConnectionProtocol::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.ListenerProps):
        ListenerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ListenerProps):
        software.amazon.awscdk.services.globalaccelerator.ListenerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.ListenerProps
  }
}
