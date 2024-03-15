@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class OAuthScope internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cognito.OAuthScope,
) : CdkObject(cdkObject) {
  public open fun scopeName(): String = unwrap(this).getScopeName()

  public companion object {
    public val COGNITO_ADMIN: OAuthScope =
        OAuthScope.wrap(software.amazon.awscdk.services.cognito.OAuthScope.COGNITO_ADMIN)

    public val EMAIL: OAuthScope =
        OAuthScope.wrap(software.amazon.awscdk.services.cognito.OAuthScope.EMAIL)

    public val OPENID: OAuthScope =
        OAuthScope.wrap(software.amazon.awscdk.services.cognito.OAuthScope.OPENID)

    public val PHONE: OAuthScope =
        OAuthScope.wrap(software.amazon.awscdk.services.cognito.OAuthScope.PHONE)

    public val PROFILE: OAuthScope =
        OAuthScope.wrap(software.amazon.awscdk.services.cognito.OAuthScope.PROFILE)

    public fun custom(name: String): OAuthScope =
        software.amazon.awscdk.services.cognito.OAuthScope.custom(name).let(OAuthScope::wrap)

    public fun resourceServer(server: IUserPoolResourceServer, scope: ResourceServerScope):
        OAuthScope =
        software.amazon.awscdk.services.cognito.OAuthScope.resourceServer(server.let(IUserPoolResourceServer::unwrap),
        scope.let(ResourceServerScope::unwrap)).let(OAuthScope::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2241fe1fc36b62c6e9f4841e3de3020478022df0a2d31740f2035d92b882fd4")
    public fun resourceServer(server: IUserPoolResourceServer,
        scope: ResourceServerScope.Builder.() -> Unit): OAuthScope = resourceServer(server,
        ResourceServerScope(scope))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.OAuthScope): OAuthScope =
        OAuthScope(cdkObject)

    internal fun unwrap(wrapped: OAuthScope): software.amazon.awscdk.services.cognito.OAuthScope =
        wrapped.cdkObject
  }
}