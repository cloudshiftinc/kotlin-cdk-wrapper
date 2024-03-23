@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * OAuth scopes that are allowed with this client.
 *
 * Example:
 *
 * ```
 * UserPool pool = new UserPool(this, "Pool");
 * ResourceServerScope readOnlyScope =
 * ResourceServerScope.Builder.create().scopeName("read").scopeDescription("Read-only access").build();
 * ResourceServerScope fullAccessScope =
 * ResourceServerScope.Builder.create().scopeName("*").scopeDescription("Full access").build();
 * UserPoolResourceServer userServer = pool.addResourceServer("ResourceServer",
 * UserPoolResourceServerOptions.builder()
 * .identifier("users")
 * .scopes(List.of(readOnlyScope, fullAccessScope))
 * .build());
 * UserPoolClient readOnlyClient = pool.addClient("read-only-client",
 * UserPoolClientOptions.builder()
 * // ...
 * .oAuth(OAuthSettings.builder()
 * // ...
 * .scopes(List.of(OAuthScope.resourceServer(userServer, readOnlyScope)))
 * .build())
 * .build());
 * UserPoolClient fullAccessClient = pool.addClient("full-access-client",
 * UserPoolClientOptions.builder()
 * // ...
 * .oAuth(OAuthSettings.builder()
 * // ...
 * .scopes(List.of(OAuthScope.resourceServer(userServer, fullAccessScope)))
 * .build())
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-app-idp-settings.html)
 */
public open class OAuthScope(
  cdkObject: software.amazon.awscdk.services.cognito.OAuthScope,
) : CdkObject(cdkObject) {
  /**
   * The name of this scope as recognized by CloudFormation.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html#cfn-cognito-userpoolclient-allowedoauthscopes)
   */
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
        wrapped.cdkObject as software.amazon.awscdk.services.cognito.OAuthScope
  }
}
