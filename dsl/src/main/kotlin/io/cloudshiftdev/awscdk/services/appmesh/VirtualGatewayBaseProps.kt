package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface VirtualGatewayBaseProps {
  public fun accessLog(): AccessLog? = unwrap(this).getAccessLog()?.let(AccessLog::wrap)

  public fun backendDefaults(): BackendDefaults? =
      unwrap(this).getBackendDefaults()?.let(BackendDefaults::wrap)

  public fun listeners(): List<VirtualGatewayListener> =
      unwrap(this).getListeners()?.map(VirtualGatewayListener::wrap) ?: emptyList()

  public fun virtualGatewayName(): String? = unwrap(this).getVirtualGatewayName()

  public interface Builder {
    public fun accessLog(accessLog: AccessLog)

    public fun backendDefaults(backendDefaults: BackendDefaults)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52834de467ff95484baeb289c6957eb35ad65d3eba7a50c12091f65cbaf6f3a1")
    public fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit)

    public fun listeners(listeners: List<VirtualGatewayListener>)

    public fun listeners(vararg listeners: VirtualGatewayListener)

    public fun virtualGatewayName(virtualGatewayName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps.Builder
        = software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps.builder()

    override fun accessLog(accessLog: AccessLog) {
      cdkBuilder.accessLog(accessLog.let(AccessLog::unwrap))
    }

    override fun backendDefaults(backendDefaults: BackendDefaults) {
      cdkBuilder.backendDefaults(backendDefaults.let(BackendDefaults::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52834de467ff95484baeb289c6957eb35ad65d3eba7a50c12091f65cbaf6f3a1")
    override fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit): Unit =
        backendDefaults(BackendDefaults(backendDefaults))

    override fun listeners(listeners: List<VirtualGatewayListener>) {
      cdkBuilder.listeners(listeners.map(VirtualGatewayListener::unwrap))
    }

    override fun listeners(vararg listeners: VirtualGatewayListener): Unit =
        listeners(listeners.toList())

    override fun virtualGatewayName(virtualGatewayName: String) {
      cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps,
  ) : VirtualGatewayBaseProps {
    override fun accessLog(): AccessLog? = unwrap(this).getAccessLog()?.let(AccessLog::wrap)

    override fun backendDefaults(): BackendDefaults? =
        unwrap(this).getBackendDefaults()?.let(BackendDefaults::wrap)

    override fun listeners(): List<VirtualGatewayListener> =
        unwrap(this).getListeners()?.map(VirtualGatewayListener::wrap) ?: emptyList()

    override fun virtualGatewayName(): String? = unwrap(this).getVirtualGatewayName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualGatewayBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps):
        VirtualGatewayBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualGatewayBaseProps):
        software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps = (wrapped as
        Wrapper).cdkObject
  }
}
