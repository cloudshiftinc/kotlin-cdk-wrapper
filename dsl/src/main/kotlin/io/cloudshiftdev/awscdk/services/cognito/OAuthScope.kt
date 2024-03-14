package io.cloudshiftdev.awscdk.services.cognito

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class OAuthScope internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.OAuthScope,
) {
  public open fun scopeName(): String = unwrap(this).getScopeName()

  public companion object {
    public open fun custom(name: String): OAuthScope =
        software.amazon.awscdk.services.cognito.OAuthScope.custom(name).let(OAuthScope::wrap)

    public open fun resourceServer(server: IUserPoolResourceServer, scope: ResourceServerScope):
        OAuthScope =
        software.amazon.awscdk.services.cognito.OAuthScope.resourceServer(server.let(IUserPoolResourceServer::unwrap),
        scope.let(ResourceServerScope::unwrap)).let(OAuthScope::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2241fe1fc36b62c6e9f4841e3de3020478022df0a2d31740f2035d92b882fd4")
    public open fun resourceServer(server: IUserPoolResourceServer,
        scope: ResourceServerScope.Builder.() -> Unit): OAuthScope = resourceServer(server,
        ResourceServerScope(scope))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.OAuthScope): OAuthScope =
        OAuthScope(cdkObject)

    internal fun unwrap(wrapped: OAuthScope): software.amazon.awscdk.services.cognito.OAuthScope =
        wrapped.cdkObject
  }
}
