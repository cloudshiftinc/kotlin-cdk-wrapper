@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class VirtualRouter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouter,
) : Resource(cdkObject), IVirtualRouter {
  public override fun addRoute(id: String, props: RouteBaseProps): Route = unwrap(this).addRoute(id,
      props.let(RouteBaseProps::unwrap)).let(Route::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("26d15a55ebceab0f13f1422d758ccb5af6cd5a843b834697e7f3e7e5194e110e")
  public override fun addRoute(id: String, props: RouteBaseProps.Builder.() -> Unit): Route =
      addRoute(id, RouteBaseProps(props))

  public override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

  public override fun virtualRouterArn(): String = unwrap(this).getVirtualRouterArn()

  public override fun virtualRouterName(): String = unwrap(this).getVirtualRouterName()

  @CdkDslMarker
  public interface Builder {
    public fun listeners(listeners: List<VirtualRouterListener>)

    public fun listeners(vararg listeners: VirtualRouterListener)

    public fun mesh(mesh: IMesh)

    public fun virtualRouterName(virtualRouterName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualRouter.Builder =
        software.amazon.awscdk.services.appmesh.VirtualRouter.Builder.create(scope, id)

    override fun listeners(listeners: List<VirtualRouterListener>) {
      cdkBuilder.listeners(listeners.map(VirtualRouterListener::unwrap))
    }

    override fun listeners(vararg listeners: VirtualRouterListener): Unit =
        listeners(listeners.toList())

    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    override fun virtualRouterName(virtualRouterName: String) {
      cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualRouter = cdkBuilder.build()
  }

  public companion object {
    public fun fromVirtualRouterArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      virtualRouterArn: String,
    ): IVirtualRouter =
        software.amazon.awscdk.services.appmesh.VirtualRouter.fromVirtualRouterArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, virtualRouterArn).let(IVirtualRouter::wrap)

    public fun fromVirtualRouterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VirtualRouterAttributes,
    ): IVirtualRouter =
        software.amazon.awscdk.services.appmesh.VirtualRouter.fromVirtualRouterAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(VirtualRouterAttributes::unwrap)).let(IVirtualRouter::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b0ffc42719cfeee629cfc702d5a9516d44a89a160dbb40ee3f6edb4dba5c1fa")
    public fun fromVirtualRouterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VirtualRouterAttributes.Builder.() -> Unit,
    ): IVirtualRouter = fromVirtualRouterAttributes(scope, id, VirtualRouterAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VirtualRouter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VirtualRouter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouter):
        VirtualRouter = VirtualRouter(cdkObject)

    internal fun unwrap(wrapped: VirtualRouter):
        software.amazon.awscdk.services.appmesh.VirtualRouter = wrapped.cdkObject
  }
}
