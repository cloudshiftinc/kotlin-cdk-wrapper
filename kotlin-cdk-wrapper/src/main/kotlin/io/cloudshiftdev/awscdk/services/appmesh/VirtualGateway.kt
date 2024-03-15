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

public open class VirtualGateway internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualGateway,
) : Resource(cdkObject), IVirtualGateway {
  public override fun addGatewayRoute(id: String, props: GatewayRouteBaseProps): GatewayRoute =
      unwrap(this).addGatewayRoute(id,
      props.let(GatewayRouteBaseProps::unwrap)).let(GatewayRoute::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("088adf02806882d057d24f01d7bde8e78aae6d65ce74dad71dfdd37cbc9bcf9c")
  public override fun addGatewayRoute(id: String, props: GatewayRouteBaseProps.Builder.() -> Unit):
      GatewayRoute = addGatewayRoute(id, GatewayRouteBaseProps(props))

  public override fun grantStreamAggregatedResources(identity: IGrantable): Grant =
      unwrap(this).grantStreamAggregatedResources(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

  public override fun virtualGatewayArn(): String = unwrap(this).getVirtualGatewayArn()

  public override fun virtualGatewayName(): String = unwrap(this).getVirtualGatewayName()

  @CdkDslMarker
  public interface Builder {
    public fun accessLog(accessLog: AccessLog)

    public fun backendDefaults(backendDefaults: BackendDefaults)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("380b63411b3329491321af5555bf8e3f9d8052786eea8a267f4b867656d3666d")
    public fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit)

    public fun listeners(listeners: List<VirtualGatewayListener>)

    public fun listeners(vararg listeners: VirtualGatewayListener)

    public fun mesh(mesh: IMesh)

    public fun virtualGatewayName(virtualGatewayName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualGateway.Builder =
        software.amazon.awscdk.services.appmesh.VirtualGateway.Builder.create(scope, id)

    override fun accessLog(accessLog: AccessLog) {
      cdkBuilder.accessLog(accessLog.let(AccessLog::unwrap))
    }

    override fun backendDefaults(backendDefaults: BackendDefaults) {
      cdkBuilder.backendDefaults(backendDefaults.let(BackendDefaults::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("380b63411b3329491321af5555bf8e3f9d8052786eea8a267f4b867656d3666d")
    override fun backendDefaults(backendDefaults: BackendDefaults.Builder.() -> Unit): Unit =
        backendDefaults(BackendDefaults(backendDefaults))

    override fun listeners(listeners: List<VirtualGatewayListener>) {
      cdkBuilder.listeners(listeners.map(VirtualGatewayListener::unwrap))
    }

    override fun listeners(vararg listeners: VirtualGatewayListener): Unit =
        listeners(listeners.toList())

    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    override fun virtualGatewayName(virtualGatewayName: String) {
      cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualGateway = cdkBuilder.build()
  }

  public companion object {
    public fun fromVirtualGatewayArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      virtualGatewayArn: String,
    ): IVirtualGateway =
        software.amazon.awscdk.services.appmesh.VirtualGateway.fromVirtualGatewayArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, virtualGatewayArn).let(IVirtualGateway::wrap)

    public fun fromVirtualGatewayAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VirtualGatewayAttributes,
    ): IVirtualGateway =
        software.amazon.awscdk.services.appmesh.VirtualGateway.fromVirtualGatewayAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(VirtualGatewayAttributes::unwrap)).let(IVirtualGateway::wrap)

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
        software.amazon.awscdk.services.appmesh.VirtualGateway = wrapped.cdkObject
  }
}
