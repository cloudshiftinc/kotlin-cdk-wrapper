@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties to initialize WebSocketTokenAuthorizer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers.*;
 * WebSocketLambdaAuthorizerProps webSocketLambdaAuthorizerProps =
 * WebSocketLambdaAuthorizerProps.builder()
 * .authorizerName("authorizerName")
 * .identitySource(List.of("identitySource"))
 * .build();
 * ```
 */
public interface WebSocketLambdaAuthorizerProps {
  /**
   * The name of the authorizer.
   *
   * Default: - same value as `id` passed in the constructor.
   */
  public fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  /**
   * The identity source for which authorization is requested.
   *
   * Request parameter match `'route.request.querystring|header.[a-zA-z0-9._-]+'`.
   * Staged variable match `'stageVariables.[a-zA-Z0-9._-]+'`.
   * Context parameter match `'context.[a-zA-Z0-9._-]+'`.
   *
   * Default: ['route.request.header.Authorization']
   */
  public fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

  /**
   * A builder for [WebSocketLambdaAuthorizerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizerName The name of the authorizer.
     */
    public fun authorizerName(authorizerName: String)

    /**
     * @param identitySource The identity source for which authorization is requested.
     * Request parameter match `'route.request.querystring|header.[a-zA-z0-9._-]+'`.
     * Staged variable match `'stageVariables.[a-zA-Z0-9._-]+'`.
     * Context parameter match `'context.[a-zA-Z0-9._-]+'`.
     */
    public fun identitySource(identitySource: List<String>)

    /**
     * @param identitySource The identity source for which authorization is requested.
     * Request parameter match `'route.request.querystring|header.[a-zA-z0-9._-]+'`.
     * Staged variable match `'stageVariables.[a-zA-Z0-9._-]+'`.
     * Context parameter match `'context.[a-zA-Z0-9._-]+'`.
     */
    public fun identitySource(vararg identitySource: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizerProps.Builder =
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizerProps.builder()

    /**
     * @param authorizerName The name of the authorizer.
     */
    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * @param identitySource The identity source for which authorization is requested.
     * Request parameter match `'route.request.querystring|header.[a-zA-z0-9._-]+'`.
     * Staged variable match `'stageVariables.[a-zA-Z0-9._-]+'`.
     * Context parameter match `'context.[a-zA-Z0-9._-]+'`.
     */
    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    /**
     * @param identitySource The identity source for which authorization is requested.
     * Request parameter match `'route.request.querystring|header.[a-zA-z0-9._-]+'`.
     * Staged variable match `'stageVariables.[a-zA-Z0-9._-]+'`.
     * Context parameter match `'context.[a-zA-Z0-9._-]+'`.
     */
    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizerProps,
  ) : CdkObject(cdkObject), WebSocketLambdaAuthorizerProps {
    /**
     * The name of the authorizer.
     *
     * Default: - same value as `id` passed in the constructor.
     */
    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    /**
     * The identity source for which authorization is requested.
     *
     * Request parameter match `'route.request.querystring|header.[a-zA-z0-9._-]+'`.
     * Staged variable match `'stageVariables.[a-zA-Z0-9._-]+'`.
     * Context parameter match `'context.[a-zA-Z0-9._-]+'`.
     *
     * Default: ['route.request.header.Authorization']
     */
    override fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketLambdaAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizerProps):
        WebSocketLambdaAuthorizerProps = CdkObjectWrappers.wrap(cdkObject) as?
        WebSocketLambdaAuthorizerProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketLambdaAuthorizerProps):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizerProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizerProps
  }
}
