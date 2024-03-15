@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun clientAffinity(clientAffinity: ClientAffinity)

    public fun listenerName(listenerName: String)

    public fun portRanges(portRanges: List<PortRange>)

    public fun portRanges(vararg portRanges: PortRange)

    public fun protocol(protocol: ConnectionProtocol)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.ListenerOptions.Builder =
        software.amazon.awscdk.services.globalaccelerator.ListenerOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.globalaccelerator.ListenerOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.globalaccelerator.ListenerOptions,
  ) : CdkObject(cdkObject), ListenerOptions {
    override fun clientAffinity(): ClientAffinity? =
        unwrap(this).getClientAffinity()?.let(ClientAffinity::wrap)

    override fun listenerName(): String? = unwrap(this).getListenerName()

    override fun portRanges(): List<PortRange> = unwrap(this).getPortRanges().map(PortRange::wrap)

    override fun protocol(): ConnectionProtocol? =
        unwrap(this).getProtocol()?.let(ConnectionProtocol::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ListenerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.ListenerOptions):
        ListenerOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ListenerOptions):
        software.amazon.awscdk.services.globalaccelerator.ListenerOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.ListenerOptions
  }
}
