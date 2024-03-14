package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class VirtualNode internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.VirtualNode,
) : Resource(cdkObject), IVirtualNode {
  public open fun addBackend(backend: Backend) {
    unwrap(this).addBackend(backend.let(Backend::unwrap))
  }

  public open fun addListener(listener: VirtualNodeListener) {
    unwrap(this).addListener(listener.let(VirtualNodeListener::unwrap))
  }

  public override fun grantStreamAggregatedResources(identity: IGrantable): Grant =
      unwrap(this).grantStreamAggregatedResources(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

  public override fun virtualNodeArn(): String = unwrap(this).getVirtualNodeArn()

  public override fun virtualNodeName(): String = unwrap(this).getVirtualNodeName()

  public interface Builder {
    public fun accessLog(accessLog: AccessLog)

    public fun backendDefaults(backendDefaults: BackendDefaults)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("611c7d1b6de43cbe9646eb36c8cc8eef6c7be5d834d01954f4dd347a95c5c67a")
    public fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit)

    public fun backends(backends: List<Backend>)

    public fun backends(vararg backends: Backend)

    public fun listeners(listeners: List<VirtualNodeListener>)

    public fun listeners(vararg listeners: VirtualNodeListener)

    public fun mesh(mesh: IMesh)

    public fun serviceDiscovery(serviceDiscovery: ServiceDiscovery)

    public fun virtualNodeName(virtualNodeName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualNode.Builder =
        software.amazon.awscdk.services.appmesh.VirtualNode.Builder.create(scope, id)

    override fun accessLog(accessLog: AccessLog) {
      cdkBuilder.accessLog(accessLog.let(AccessLog::unwrap))
    }

    override fun backendDefaults(backendDefaults: BackendDefaults) {
      cdkBuilder.backendDefaults(backendDefaults.let(BackendDefaults::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("611c7d1b6de43cbe9646eb36c8cc8eef6c7be5d834d01954f4dd347a95c5c67a")
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

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualNode = cdkBuilder.build()
  }

  public companion object {
    public open fun fromVirtualNodeArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      virtualNodeArn: String,
    ): IVirtualNode =
        software.amazon.awscdk.services.appmesh.VirtualNode.fromVirtualNodeArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, virtualNodeArn).let(IVirtualNode::wrap)

    public open fun fromVirtualNodeAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VirtualNodeAttributes,
    ): IVirtualNode =
        software.amazon.awscdk.services.appmesh.VirtualNode.fromVirtualNodeAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(VirtualNodeAttributes::unwrap)).let(IVirtualNode::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5adc84a99eeca204975739e5ce0c1737f3e15ef875462044fbf2550f756149d4")
    public open fun fromVirtualNodeAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VirtualNodeAttributes.Builder.() -> Unit,
    ): IVirtualNode = fromVirtualNodeAttributes(scope, id, VirtualNodeAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VirtualNode {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VirtualNode(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualNode): VirtualNode =
        VirtualNode(cdkObject)

    internal fun unwrap(wrapped: VirtualNode): software.amazon.awscdk.services.appmesh.VirtualNode =
        wrapped.cdkObject
  }
}
