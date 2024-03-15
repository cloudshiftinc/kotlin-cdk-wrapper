@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface VirtualNodeProps : VirtualNodeBaseProps {
  public fun mesh(): IMesh

  @CdkDslMarker
  public interface Builder {
    public fun accessLog(accessLog: AccessLog)

    public fun backendDefaults(backendDefaults: BackendDefaults)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("565009054dc561f2646063fe7ba557fc12a3a37533c59e25a95e06664490d9a7")
    public fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit)

    public fun backends(backends: List<Backend>)

    public fun backends(vararg backends: Backend)

    public fun listeners(listeners: List<VirtualNodeListener>)

    public fun listeners(vararg listeners: VirtualNodeListener)

    public fun mesh(mesh: IMesh)

    public fun serviceDiscovery(serviceDiscovery: ServiceDiscovery)

    public fun virtualNodeName(virtualNodeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualNodeProps.Builder =
        software.amazon.awscdk.services.appmesh.VirtualNodeProps.builder()

    override fun accessLog(accessLog: AccessLog) {
      cdkBuilder.accessLog(accessLog.let(AccessLog::unwrap))
    }

    override fun backendDefaults(backendDefaults: BackendDefaults) {
      cdkBuilder.backendDefaults(backendDefaults.let(BackendDefaults::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("565009054dc561f2646063fe7ba557fc12a3a37533c59e25a95e06664490d9a7")
    override fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit): Unit =
        backendDefaults(BackendDefaults(backendDefaults))

    override fun backends(backends: List<Backend>) {
      cdkBuilder.backends(backends.map(Backend::unwrap))
    }

    override fun backends(vararg backends: Backend): Unit = backends(backends.toList())

    override fun listeners(listeners: List<VirtualNodeListener>) {
      cdkBuilder.listeners(listeners.map(VirtualNodeListener::unwrap))
    }

    override fun listeners(vararg listeners: VirtualNodeListener): Unit =
        listeners(listeners.toList())

    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    override fun serviceDiscovery(serviceDiscovery: ServiceDiscovery) {
      cdkBuilder.serviceDiscovery(serviceDiscovery.let(ServiceDiscovery::unwrap))
    }

    override fun virtualNodeName(virtualNodeName: String) {
      cdkBuilder.virtualNodeName(virtualNodeName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualNodeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeProps,
  ) : CdkObject(cdkObject), VirtualNodeProps {
    override fun accessLog(): AccessLog? = unwrap(this).getAccessLog()?.let(AccessLog::wrap)

    override fun backendDefaults(): BackendDefaults? =
        unwrap(this).getBackendDefaults()?.let(BackendDefaults::wrap)

    override fun backends(): List<Backend> = unwrap(this).getBackends()?.map(Backend::wrap) ?:
        emptyList()

    override fun listeners(): List<VirtualNodeListener> =
        unwrap(this).getListeners()?.map(VirtualNodeListener::wrap) ?: emptyList()

    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    override fun serviceDiscovery(): ServiceDiscovery? =
        unwrap(this).getServiceDiscovery()?.let(ServiceDiscovery::wrap)

    override fun virtualNodeName(): String? = unwrap(this).getVirtualNodeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualNodeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeProps):
        VirtualNodeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualNodeProps):
        software.amazon.awscdk.services.appmesh.VirtualNodeProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.VirtualNodeProps
  }
}
