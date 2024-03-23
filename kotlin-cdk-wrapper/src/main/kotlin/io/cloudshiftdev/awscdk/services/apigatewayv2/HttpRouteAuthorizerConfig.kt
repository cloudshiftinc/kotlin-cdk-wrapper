@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Results of binding an authorizer to an http route.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * HttpRouteAuthorizerConfig httpRouteAuthorizerConfig = HttpRouteAuthorizerConfig.builder()
 * .authorizationType("authorizationType")
 * // the properties below are optional
 * .authorizationScopes(List.of("authorizationScopes"))
 * .authorizerId("authorizerId")
 * .build();
 * ```
 */
public interface HttpRouteAuthorizerConfig {
  /**
   * The list of OIDC scopes to include in the authorization.
   *
   * Default: - no authorization scopes
   */
  public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
      emptyList()

  /**
   * The type of authorization.
   *
   * Possible values are:
   *
   * * AWS_IAM - IAM Authorizer
   * * JWT - JSON Web Token Authorizer
   * * CUSTOM - Lambda Authorizer
   * * NONE - No Authorization
   */
  public fun authorizationType(): String

  /**
   * The authorizer id.
   *
   * Default: - No authorizer id (useful for AWS_IAM route authorizer)
   */
  public fun authorizerId(): String? = unwrap(this).getAuthorizerId()

  /**
   * A builder for [HttpRouteAuthorizerConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizationScopes The list of OIDC scopes to include in the authorization.
     */
    public fun authorizationScopes(authorizationScopes: List<String>)

    /**
     * @param authorizationScopes The list of OIDC scopes to include in the authorization.
     */
    public fun authorizationScopes(vararg authorizationScopes: String)

    /**
     * @param authorizationType The type of authorization. 
     * Possible values are:
     *
     * * AWS_IAM - IAM Authorizer
     * * JWT - JSON Web Token Authorizer
     * * CUSTOM - Lambda Authorizer
     * * NONE - No Authorization
     */
    public fun authorizationType(authorizationType: String)

    /**
     * @param authorizerId The authorizer id.
     */
    public fun authorizerId(authorizerId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig.builder()

    /**
     * @param authorizationScopes The list of OIDC scopes to include in the authorization.
     */
    override fun authorizationScopes(authorizationScopes: List<String>) {
      cdkBuilder.authorizationScopes(authorizationScopes)
    }

    /**
     * @param authorizationScopes The list of OIDC scopes to include in the authorization.
     */
    override fun authorizationScopes(vararg authorizationScopes: String): Unit =
        authorizationScopes(authorizationScopes.toList())

    /**
     * @param authorizationType The type of authorization. 
     * Possible values are:
     *
     * * AWS_IAM - IAM Authorizer
     * * JWT - JSON Web Token Authorizer
     * * CUSTOM - Lambda Authorizer
     * * NONE - No Authorization
     */
    override fun authorizationType(authorizationType: String) {
      cdkBuilder.authorizationType(authorizationType)
    }

    /**
     * @param authorizerId The authorizer id.
     */
    override fun authorizerId(authorizerId: String) {
      cdkBuilder.authorizerId(authorizerId)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig,
  ) : CdkObject(cdkObject), HttpRouteAuthorizerConfig {
    /**
     * The list of OIDC scopes to include in the authorization.
     *
     * Default: - no authorization scopes
     */
    override fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
        emptyList()

    /**
     * The type of authorization.
     *
     * Possible values are:
     *
     * * AWS_IAM - IAM Authorizer
     * * JWT - JSON Web Token Authorizer
     * * CUSTOM - Lambda Authorizer
     * * NONE - No Authorization
     */
    override fun authorizationType(): String = unwrap(this).getAuthorizationType()

    /**
     * The authorizer id.
     *
     * Default: - No authorizer id (useful for AWS_IAM route authorizer)
     */
    override fun authorizerId(): String? = unwrap(this).getAuthorizerId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteAuthorizerConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig):
        HttpRouteAuthorizerConfig = CdkObjectWrappers.wrap(cdkObject) as? HttpRouteAuthorizerConfig
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteAuthorizerConfig):
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig
  }
}
