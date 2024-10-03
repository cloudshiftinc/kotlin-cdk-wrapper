@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * VirtualNode represents a newly defined AppMesh VirtualNode.
 *
 * Any inbound traffic that your virtual node expects should be specified as a
 * listener. Any outbound traffic that your virtual node expects to reach
 * should be specified as a backend.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * // Cloud Map service discovery is currently required for host ejection by outlier detection
 * Vpc vpc = new Vpc(this, "vpc");
 * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "test-namespace")
 * .vpc(vpc)
 * .name("domain.local")
 * .build();
 * Service service = namespace.createService("Svc");
 * VirtualNode node = mesh.addVirtualNode("virtual-node", VirtualNodeBaseProps.builder()
 * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
 * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
 * .outlierDetection(OutlierDetection.builder()
 * .baseEjectionDuration(Duration.seconds(10))
 * .interval(Duration.seconds(30))
 * .maxEjectionPercent(50)
 * .maxServerErrors(5)
 * .build())
 * .build())))
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_nodes.html)
 */
public open class VirtualNode(
  cdkObject: software.amazon.awscdk.services.appmesh.VirtualNode,
) : Resource(cdkObject),
    IVirtualNode {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VirtualNodeProps,
  ) :
      this(software.amazon.awscdk.services.appmesh.VirtualNode(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(VirtualNodeProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VirtualNodeProps.Builder.() -> Unit,
  ) : this(scope, id, VirtualNodeProps(props)
  )

  /**
   * Add a Virtual Services that this node is expected to send outbound traffic to.
   *
   * @param backend 
   */
  public open fun addBackend(backend: Backend) {
    unwrap(this).addBackend(backend.let(Backend.Companion::unwrap))
  }

  /**
   * Utility method to add an inbound listener for this VirtualNode.
   *
   * Note: At this time, Virtual Nodes support at most one listener. Adding
   * more than one will result in a failure to deploy the CloudFormation stack.
   * However, the App Mesh team has plans to add support for multiple listeners
   * on Virtual Nodes and Virtual Routers.
   *
   * [Documentation](https://github.com/aws/aws-app-mesh-roadmap/issues/120)
   * @param listener 
   */
  public open fun addListener(listener: VirtualNodeListener) {
    unwrap(this).addListener(listener.let(VirtualNodeListener.Companion::unwrap))
  }

  /**
   * Grants the given entity `appmesh:StreamAggregatedResources`.
   *
   * @param identity 
   */
  public override fun grantStreamAggregatedResources(identity: IGrantable): Grant =
      unwrap(this).grantStreamAggregatedResources(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * The Mesh which the VirtualNode belongs to.
   */
  public override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

  /**
   * The Amazon Resource Name belonging to the VirtualNode.
   */
  public override fun virtualNodeArn(): String = unwrap(this).getVirtualNodeArn()

  /**
   * The name of the VirtualNode.
   */
  public override fun virtualNodeName(): String = unwrap(this).getVirtualNodeName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appmesh.VirtualNode].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Access Logging Configuration for the virtual node.
     *
     * Default: - No access logging
     *
     * @param accessLog Access Logging Configuration for the virtual node. 
     */
    public fun accessLog(accessLog: AccessLog)

    /**
     * Default Configuration Virtual Node uses to communicate with Virtual Service.
     *
     * Default: - No Config
     *
     * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
     * Service. 
     */
    public fun backendDefaults(backendDefaults: BackendDefaults)

    /**
     * Default Configuration Virtual Node uses to communicate with Virtual Service.
     *
     * Default: - No Config
     *
     * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
     * Service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("611c7d1b6de43cbe9646eb36c8cc8eef6c7be5d834d01954f4dd347a95c5c67a")
    public fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit)

    /**
     * Virtual Services that this is node expected to send outbound traffic to.
     *
     * Default: - No backends
     *
     * @param backends Virtual Services that this is node expected to send outbound traffic to. 
     */
    public fun backends(backends: List<Backend>)

    /**
     * Virtual Services that this is node expected to send outbound traffic to.
     *
     * Default: - No backends
     *
     * @param backends Virtual Services that this is node expected to send outbound traffic to. 
     */
    public fun backends(vararg backends: Backend)

    /**
     * Initial listener for the virtual node.
     *
     * Default: - No listeners
     *
     * @param listeners Initial listener for the virtual node. 
     */
    public fun listeners(listeners: List<VirtualNodeListener>)

    /**
     * Initial listener for the virtual node.
     *
     * Default: - No listeners
     *
     * @param listeners Initial listener for the virtual node. 
     */
    public fun listeners(vararg listeners: VirtualNodeListener)

    /**
     * The Mesh which the VirtualNode belongs to.
     *
     * @param mesh The Mesh which the VirtualNode belongs to. 
     */
    public fun mesh(mesh: IMesh)

    /**
     * Defines how upstream clients will discover this VirtualNode.
     *
     * Default: - No Service Discovery
     *
     * @param serviceDiscovery Defines how upstream clients will discover this VirtualNode. 
     */
    public fun serviceDiscovery(serviceDiscovery: ServiceDiscovery)

    /**
     * The name of the VirtualNode.
     *
     * Default: - A name is automatically determined
     *
     * @param virtualNodeName The name of the VirtualNode. 
     */
    public fun virtualNodeName(virtualNodeName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualNode.Builder =
        software.amazon.awscdk.services.appmesh.VirtualNode.Builder.create(scope, id)

    /**
     * Access Logging Configuration for the virtual node.
     *
     * Default: - No access logging
     *
     * @param accessLog Access Logging Configuration for the virtual node. 
     */
    override fun accessLog(accessLog: AccessLog) {
      cdkBuilder.accessLog(accessLog.let(AccessLog.Companion::unwrap))
    }

    /**
     * Default Configuration Virtual Node uses to communicate with Virtual Service.
     *
     * Default: - No Config
     *
     * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
     * Service. 
     */
    override fun backendDefaults(backendDefaults: BackendDefaults) {
      cdkBuilder.backendDefaults(backendDefaults.let(BackendDefaults.Companion::unwrap))
    }

    /**
     * Default Configuration Virtual Node uses to communicate with Virtual Service.
     *
     * Default: - No Config
     *
     * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
     * Service. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("611c7d1b6de43cbe9646eb36c8cc8eef6c7be5d834d01954f4dd347a95c5c67a")
    override fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit): Unit =
        backendDefaults(BackendDefaults(backendDefaults))

    /**
     * Virtual Services that this is node expected to send outbound traffic to.
     *
     * Default: - No backends
     *
     * @param backends Virtual Services that this is node expected to send outbound traffic to. 
     */
    override fun backends(backends: List<Backend>) {
      cdkBuilder.backends(backends.map(Backend.Companion::unwrap))
    }

    /**
     * Virtual Services that this is node expected to send outbound traffic to.
     *
     * Default: - No backends
     *
     * @param backends Virtual Services that this is node expected to send outbound traffic to. 
     */
    override fun backends(vararg backends: Backend): Unit = backends(backends.toList())

    /**
     * Initial listener for the virtual node.
     *
     * Default: - No listeners
     *
     * @param listeners Initial listener for the virtual node. 
     */
    override fun listeners(listeners: List<VirtualNodeListener>) {
      cdkBuilder.listeners(listeners.map(VirtualNodeListener.Companion::unwrap))
    }

    /**
     * Initial listener for the virtual node.
     *
     * Default: - No listeners
     *
     * @param listeners Initial listener for the virtual node. 
     */
    override fun listeners(vararg listeners: VirtualNodeListener): Unit =
        listeners(listeners.toList())

    /**
     * The Mesh which the VirtualNode belongs to.
     *
     * @param mesh The Mesh which the VirtualNode belongs to. 
     */
    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh.Companion::unwrap))
    }

    /**
     * Defines how upstream clients will discover this VirtualNode.
     *
     * Default: - No Service Discovery
     *
     * @param serviceDiscovery Defines how upstream clients will discover this VirtualNode. 
     */
    override fun serviceDiscovery(serviceDiscovery: ServiceDiscovery) {
      cdkBuilder.serviceDiscovery(serviceDiscovery.let(ServiceDiscovery.Companion::unwrap))
    }

    /**
     * The name of the VirtualNode.
     *
     * Default: - A name is automatically determined
     *
     * @param virtualNodeName The name of the VirtualNode. 
     */
    override fun virtualNodeName(virtualNodeName: String) {
      cdkBuilder.virtualNodeName(virtualNodeName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualNode = cdkBuilder.build()
  }

  public companion object {
    public fun fromVirtualNodeArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      virtualNodeArn: String,
    ): IVirtualNode =
        software.amazon.awscdk.services.appmesh.VirtualNode.fromVirtualNodeArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, virtualNodeArn).let(IVirtualNode::wrap)

    public fun fromVirtualNodeAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VirtualNodeAttributes,
    ): IVirtualNode =
        software.amazon.awscdk.services.appmesh.VirtualNode.fromVirtualNodeAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(VirtualNodeAttributes.Companion::unwrap)).let(IVirtualNode::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5adc84a99eeca204975739e5ce0c1737f3e15ef875462044fbf2550f756149d4")
    public fun fromVirtualNodeAttributes(
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
        wrapped.cdkObject as software.amazon.awscdk.services.appmesh.VirtualNode
  }
}
