package io.cloudshiftdev.awscdk.services.apigatewayv2

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

public open class HttpRoute internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRoute,
) : Resource(cdkObject), IHttpRoute {
  public override fun grantInvoke(grantee: IGrantable): Grant =
      unwrap(this).grantInvoke(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantInvoke(grantee: IGrantable, options: GrantInvokeOptions): Grant =
      unwrap(this).grantInvoke(grantee.let(IGrantable::unwrap),
      options.let(GrantInvokeOptions::unwrap)).let(Grant::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("412779fe515aba89b3c88de8dca006d0a8d413686405d41ff168250ac6c8b73c")
  public override fun grantInvoke(grantee: IGrantable,
      options: GrantInvokeOptions.Builder.() -> Unit): Grant = grantInvoke(grantee,
      GrantInvokeOptions(options))

  public override fun httpApi(): IHttpApi = unwrap(this).getHttpApi().let(IHttpApi::wrap)

  public override fun path(): String? = unwrap(this).getPath()

  public override fun routeArn(): String = unwrap(this).getRouteArn()

  public override fun routeId(): String = unwrap(this).getRouteId()

  public interface Builder {
    public fun authorizationScopes(authorizationScopes: List<String>) {
    }

    public fun authorizer(authorizer: IHttpRouteAuthorizer) {
    }

    public fun httpApi(httpApi: IHttpApi) {
    }

    public fun integration(integration: HttpRouteIntegration) {
    }

    public fun routeKey(routeKey: HttpRouteKey) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpRoute.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpRoute.Builder.create(scope, id)

    public override fun authorizationScopes(authorizationScopes: List<String>) {
      cdkBuilder.authorizationScopes(authorizationScopes)
    }

    public override fun authorizer(authorizer: IHttpRouteAuthorizer) {
      cdkBuilder.authorizer(authorizer.let(IHttpRouteAuthorizer::unwrap))
    }

    public override fun httpApi(httpApi: IHttpApi) {
      cdkBuilder.httpApi(httpApi.let(IHttpApi::unwrap))
    }

    public override fun integration(integration: HttpRouteIntegration) {
      cdkBuilder.integration(integration.let(HttpRouteIntegration::unwrap))
    }

    public override fun routeKey(routeKey: HttpRouteKey) {
      cdkBuilder.routeKey(routeKey.let(HttpRouteKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpRoute = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HttpRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HttpRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRoute): HttpRoute
        = HttpRoute(cdkObject)

    internal fun unwrap(wrapped: HttpRoute): software.amazon.awscdk.services.apigatewayv2.HttpRoute
        = wrapped.cdkObject
  }
}
