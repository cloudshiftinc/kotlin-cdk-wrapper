@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Route internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.Route,
) : Resource(cdkObject), IRoute {
  public override fun routeArn(): String = unwrap(this).getRouteArn()

  public override fun routeName(): String = unwrap(this).getRouteName()

  public override fun virtualRouter(): IVirtualRouter =
      unwrap(this).getVirtualRouter().let(IVirtualRouter::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun mesh(mesh: IMesh)

    public fun routeName(routeName: String)

    public fun routeSpec(routeSpec: RouteSpec)

    public fun virtualRouter(virtualRouter: IVirtualRouter)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.Route.Builder =
        software.amazon.awscdk.services.appmesh.Route.Builder.create(scope, id)

    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    override fun routeName(routeName: String) {
      cdkBuilder.routeName(routeName)
    }

    override fun routeSpec(routeSpec: RouteSpec) {
      cdkBuilder.routeSpec(routeSpec.let(RouteSpec::unwrap))
    }

    override fun virtualRouter(virtualRouter: IVirtualRouter) {
      cdkBuilder.virtualRouter(virtualRouter.let(IVirtualRouter::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.Route = cdkBuilder.build()
  }

  public companion object {
    public fun fromRouteArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      routeArn: String,
    ): IRoute =
        software.amazon.awscdk.services.appmesh.Route.fromRouteArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, routeArn).let(IRoute::wrap)

    public fun fromRouteAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: RouteAttributes,
    ): IRoute =
        software.amazon.awscdk.services.appmesh.Route.fromRouteAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(RouteAttributes::unwrap)).let(IRoute::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2190a84fefcc7733f8e8d4df66b3b93fcad4f580dbc174940b6d79b14de1022")
    public fun fromRouteAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: RouteAttributes.Builder.() -> Unit,
    ): IRoute = fromRouteAttributes(scope, id, RouteAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Route {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Route(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.Route): Route =
        Route(cdkObject)

    internal fun unwrap(wrapped: Route): software.amazon.awscdk.services.appmesh.Route =
        wrapped.cdkObject
  }
}
