@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Results of binding an authorizer to an WebSocket route.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * WebSocketRouteAuthorizerConfig webSocketRouteAuthorizerConfig =
 * WebSocketRouteAuthorizerConfig.builder()
 * .authorizationType("authorizationType")
 * // the properties below are optional
 * .authorizerId("authorizerId")
 * .build();
 * ```
 */
public interface WebSocketRouteAuthorizerConfig {
  /**
   * The type of authorization.
   *
   * Possible values are:
   *
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
   * A builder for [WebSocketRouteAuthorizerConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizationType The type of authorization. 
     * Possible values are:
     *
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
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig.builder()

    /**
     * @param authorizationType The type of authorization. 
     * Possible values are:
     *
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

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig,
  ) : CdkObject(cdkObject), WebSocketRouteAuthorizerConfig {
    /**
     * The type of authorization.
     *
     * Possible values are:
     *
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
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketRouteAuthorizerConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig):
        WebSocketRouteAuthorizerConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketRouteAuthorizerConfig):
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig
  }
}
