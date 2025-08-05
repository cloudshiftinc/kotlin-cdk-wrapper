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
 * VirtualGateway represents a newly defined App Mesh Virtual Gateway.
 *
 * A virtual gateway allows resources that are outside of your mesh to communicate to resources that
 * are inside of your mesh.
 *
 * Example:
 *
 * ```
 * // A Virtual Node with a gRPC listener with a connection pool set
 * Mesh mesh;
 * VirtualNode node = VirtualNode.Builder.create(this, "node")
 * .mesh(mesh)
 * // DNS service discovery can optionally specify the DNS response type as either LOAD_BALANCER or
 * ENDPOINTS.
 * // LOAD_BALANCER means that the DNS resolver returns a loadbalanced set of endpoints,
 * // whereas ENDPOINTS means that the DNS resolver is returning all the endpoints.
 * // By default, the response type is assumed to be LOAD_BALANCER
 * .serviceDiscovery(ServiceDiscovery.dns("node", DnsResponseType.ENDPOINTS))
 * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
 * .port(80)
 * .connectionPool(HttpConnectionPool.builder()
 * .maxConnections(100)
 * .maxPendingRequests(10)
 * .build())
 * .build())))
 * .build();
 * // A Virtual Gateway with a gRPC listener with a connection pool set
 * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
 * .mesh(mesh)
 * .listeners(List.of(VirtualGatewayListener.grpc(GrpcGatewayListenerOptions.builder()
 * .port(8080)
 * .connectionPool(GrpcConnectionPool.builder()
 * .maxRequests(10)
 * .build())
 * .build())))
 * .virtualGatewayName("gateway")
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_gateways.html)
 */
public open class VirtualGateway(
  cdkObject: software.amazon.awscdk.services.appmesh.VirtualGateway,
) : Resource(cdkObject),
    IVirtualGateway {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VirtualGatewayProps,
  ) :
      this(software.amazon.awscdk.services.appmesh.VirtualGateway(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(VirtualGatewayProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VirtualGatewayProps.Builder.() -> Unit,
  ) : this(scope, id, VirtualGatewayProps(props)
  )

  /**
   * Utility method to add a new GatewayRoute to the VirtualGateway.
   *
   * @param id 
   * @param props 
   */
  public override fun addGatewayRoute(id: String, props: GatewayRouteBaseProps): GatewayRoute =
      unwrap(this).addGatewayRoute(id,
      props.let(GatewayRouteBaseProps.Companion::unwrap)).let(GatewayRoute::wrap)

  /**
   * Utility method to add a new GatewayRoute to the VirtualGateway.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("088adf02806882d057d24f01d7bde8e78aae6d65ce74dad71dfdd37cbc9bcf9c")
  public override fun addGatewayRoute(id: String, props: GatewayRouteBaseProps.Builder.() -> Unit):
      GatewayRoute = addGatewayRoute(id, GatewayRouteBaseProps(props))

  /**
   * Grants the given entity `appmesh:StreamAggregatedResources`.
   *
   * @param identity 
   */
  public override fun grantStreamAggregatedResources(identity: IGrantable): Grant =
      unwrap(this).grantStreamAggregatedResources(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * The Mesh that the VirtualGateway belongs to.
   */
  public override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

  /**
   * The Amazon Resource Name (ARN) for the VirtualGateway.
   */
  public override fun virtualGatewayArn(): String = unwrap(this).getVirtualGatewayArn()

  /**
   * The name of the VirtualGateway.
   */
  public override fun virtualGatewayName(): String = unwrap(this).getVirtualGatewayName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appmesh.VirtualGateway].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Access Logging Configuration for the VirtualGateway.
     *
     * Default: - no access logging
     *
     * @param accessLog Access Logging Configuration for the VirtualGateway. 
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
    @JvmName("380b63411b3329491321af5555bf8e3f9d8052786eea8a267f4b867656d3666d")
    public fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit)

    /**
     * Listeners for the VirtualGateway.
     *
     * Only one is supported.
     *
     * Default: - Single HTTP listener on port 8080
     *
     * @param listeners Listeners for the VirtualGateway. 
     */
    public fun listeners(listeners: List<VirtualGatewayListener>)

    /**
     * Listeners for the VirtualGateway.
     *
     * Only one is supported.
     *
     * Default: - Single HTTP listener on port 8080
     *
     * @param listeners Listeners for the VirtualGateway. 
     */
    public fun listeners(vararg listeners: VirtualGatewayListener)

    /**
     * The Mesh which the VirtualGateway belongs to.
     *
     * @param mesh The Mesh which the VirtualGateway belongs to. 
     */
    public fun mesh(mesh: IMesh)

    /**
     * Name of the VirtualGateway.
     *
     * Default: - A name is automatically determined
     *
     * @param virtualGatewayName Name of the VirtualGateway. 
     */
    public fun virtualGatewayName(virtualGatewayName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualGateway.Builder =
        software.amazon.awscdk.services.appmesh.VirtualGateway.Builder.create(scope, id)

    /**
     * Access Logging Configuration for the VirtualGateway.
     *
     * Default: - no access logging
     *
     * @param accessLog Access Logging Configuration for the VirtualGateway. 
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
    @JvmName("380b63411b3329491321af5555bf8e3f9d8052786eea8a267f4b867656d3666d")
    override fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit): Unit =
        backendDefaults(BackendDefaults(backendDefaults))

    /**
     * Listeners for the VirtualGateway.
     *
     * Only one is supported.
     *
     * Default: - Single HTTP listener on port 8080
     *
     * @param listeners Listeners for the VirtualGateway. 
     */
    override fun listeners(listeners: List<VirtualGatewayListener>) {
      cdkBuilder.listeners(listeners.map(VirtualGatewayListener.Companion::unwrap))
    }

    /**
     * Listeners for the VirtualGateway.
     *
     * Only one is supported.
     *
     * Default: - Single HTTP listener on port 8080
     *
     * @param listeners Listeners for the VirtualGateway. 
     */
    override fun listeners(vararg listeners: VirtualGatewayListener): Unit =
        listeners(listeners.toList())

    /**
     * The Mesh which the VirtualGateway belongs to.
     *
     * @param mesh The Mesh which the VirtualGateway belongs to. 
     */
    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh.Companion::unwrap))
    }

    /**
     * Name of the VirtualGateway.
     *
     * Default: - A name is automatically determined
     *
     * @param virtualGatewayName Name of the VirtualGateway. 
     */
    override fun virtualGatewayName(virtualGatewayName: String) {
      cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualGateway = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.appmesh.VirtualGateway.PROPERTY_INJECTION_ID

    public fun fromVirtualGatewayArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      virtualGatewayArn: String,
    ): IVirtualGateway =
        software.amazon.awscdk.services.appmesh.VirtualGateway.fromVirtualGatewayArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, virtualGatewayArn).let(IVirtualGateway::wrap)

    public fun fromVirtualGatewayAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VirtualGatewayAttributes,
    ): IVirtualGateway =
        software.amazon.awscdk.services.appmesh.VirtualGateway.fromVirtualGatewayAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(VirtualGatewayAttributes.Companion::unwrap)).let(IVirtualGateway::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9d9e9ae33c84cde6a971a8ce03c125e996430a025d7b52cf600b06241f9384f")
    public fun fromVirtualGatewayAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VirtualGatewayAttributes.Builder.() -> Unit,
    ): IVirtualGateway = fromVirtualGatewayAttributes(scope, id, VirtualGatewayAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VirtualGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VirtualGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualGateway):
        VirtualGateway = VirtualGateway(cdkObject)

    internal fun unwrap(wrapped: VirtualGateway):
        software.amazon.awscdk.services.appmesh.VirtualGateway = wrapped.cdkObject as
        software.amazon.awscdk.services.appmesh.VirtualGateway
  }
}
