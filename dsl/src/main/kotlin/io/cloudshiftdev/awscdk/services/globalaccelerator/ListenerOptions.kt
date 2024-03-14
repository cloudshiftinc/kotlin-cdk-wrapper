package io.cloudshiftdev.awscdk.services.globalaccelerator

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ListenerOptions {
  public fun clientAffinity(): ClientAffinity? =
      unwrap(this).getClientAffinity()?.let(ClientAffinity::wrap)

  public fun listenerName(): String? = unwrap(this).getListenerName()

  public fun portRanges(): List<PortRange>

  public fun protocol(): ConnectionProtocol? =
      unwrap(this).getProtocol()?.let(ConnectionProtocol::wrap)

  public interface Builder {
    public fun clientAffinity(clientAffinity: ClientAffinity) {
    }

    public fun listenerName(listenerName: String) {
    }

    public fun portRanges(portRanges: List<PortRange>) {
    }

    public fun protocol(protocol: ConnectionProtocol) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.ListenerOptions.Builder =
        software.amazon.awscdk.services.globalaccelerator.ListenerOptions.builder()

    public override fun clientAffinity(clientAffinity: ClientAffinity) {
      cdkBuilder.clientAffinity(clientAffinity.let(ClientAffinity::unwrap))
    }

    public override fun listenerName(listenerName: String) {
      cdkBuilder.listenerName(listenerName)
    }

    public override fun portRanges(portRanges: List<PortRange>) {
      cdkBuilder.portRanges(portRanges.map(PortRange::unwrap))
    }

    public override fun protocol(protocol: ConnectionProtocol) {
      cdkBuilder.protocol(protocol.let(ConnectionProtocol::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.ListenerOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.globalaccelerator.ListenerOptions,
  ) : ListenerOptions {
    public override fun clientAffinity(): ClientAffinity? =
        unwrap(this).getClientAffinity()?.let(ClientAffinity::wrap)

    public override fun listenerName(): String? = unwrap(this).getListenerName()

    public override fun portRanges(): List<PortRange> =
        unwrap(this).getPortRanges().map(PortRange::wrap)

    public override fun protocol(): ConnectionProtocol? =
        unwrap(this).getProtocol()?.let(ConnectionProtocol::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ListenerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.ListenerOptions):
        ListenerOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ListenerOptions):
        software.amazon.awscdk.services.globalaccelerator.ListenerOptions = (wrapped as
        Wrapper).cdkObject
  }
}
