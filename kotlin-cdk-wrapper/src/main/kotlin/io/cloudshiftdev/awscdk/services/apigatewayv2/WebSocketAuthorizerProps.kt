@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties to initialize an instance of `WebSocketAuthorizer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * WebSocketApi webSocketApi;
 * WebSocketAuthorizerProps webSocketAuthorizerProps = WebSocketAuthorizerProps.builder()
 * .identitySource(List.of("identitySource"))
 * .type(WebSocketAuthorizerType.LAMBDA)
 * .webSocketApi(webSocketApi)
 * // the properties below are optional
 * .authorizerName("authorizerName")
 * .authorizerUri("authorizerUri")
 * .build();
 * ```
 */
public interface WebSocketAuthorizerProps {
  /**
   * Name of the authorizer.
   *
   * Default: - id of the WebSocketAuthorizer construct.
   */
  public fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  /**
   * The authorizer's Uniform Resource Identifier (URI).
   *
   * For REQUEST authorizers, this must be a well-formed Lambda function URI.
   *
   * Default: - required for Request authorizer types
   */
  public fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

  /**
   * The identity source for which authorization is requested.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
   */
  public fun identitySource(): List<String>

  /**
   * The type of authorizer.
   */
  public fun type(): WebSocketAuthorizerType

  /**
   * WebSocket Api to attach the authorizer to.
   */
  public fun webSocketApi(): IWebSocketApi

  /**
   * A builder for [WebSocketAuthorizerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizerName Name of the authorizer.
     */
    public fun authorizerName(authorizerName: String)

    /**
     * @param authorizerUri The authorizer's Uniform Resource Identifier (URI).
     * For REQUEST authorizers, this must be a well-formed Lambda function URI.
     */
    public fun authorizerUri(authorizerUri: String)

    /**
     * @param identitySource The identity source for which authorization is requested. 
     */
    public fun identitySource(identitySource: List<String>)

    /**
     * @param identitySource The identity source for which authorization is requested. 
     */
    public fun identitySource(vararg identitySource: String)

    /**
     * @param type The type of authorizer. 
     */
    public fun type(type: WebSocketAuthorizerType)

    /**
     * @param webSocketApi WebSocket Api to attach the authorizer to. 
     */
    public fun webSocketApi(webSocketApi: IWebSocketApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps.builder()

    /**
     * @param authorizerName Name of the authorizer.
     */
    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * @param authorizerUri The authorizer's Uniform Resource Identifier (URI).
     * For REQUEST authorizers, this must be a well-formed Lambda function URI.
     */
    override fun authorizerUri(authorizerUri: String) {
      cdkBuilder.authorizerUri(authorizerUri)
    }

    /**
     * @param identitySource The identity source for which authorization is requested. 
     */
    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    /**
     * @param identitySource The identity source for which authorization is requested. 
     */
    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    /**
     * @param type The type of authorizer. 
     */
    override fun type(type: WebSocketAuthorizerType) {
      cdkBuilder.type(type.let(WebSocketAuthorizerType.Companion::unwrap))
    }

    /**
     * @param webSocketApi WebSocket Api to attach the authorizer to. 
     */
    override fun webSocketApi(webSocketApi: IWebSocketApi) {
      cdkBuilder.webSocketApi(webSocketApi.let(IWebSocketApi.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps,
  ) : CdkObject(cdkObject), WebSocketAuthorizerProps {
    /**
     * Name of the authorizer.
     *
     * Default: - id of the WebSocketAuthorizer construct.
     */
    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    /**
     * The authorizer's Uniform Resource Identifier (URI).
     *
     * For REQUEST authorizers, this must be a well-formed Lambda function URI.
     *
     * Default: - required for Request authorizer types
     */
    override fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

    /**
     * The identity source for which authorization is requested.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
     */
    override fun identitySource(): List<String> = unwrap(this).getIdentitySource()

    /**
     * The type of authorizer.
     */
    override fun type(): WebSocketAuthorizerType =
        unwrap(this).getType().let(WebSocketAuthorizerType::wrap)

    /**
     * WebSocket Api to attach the authorizer to.
     */
    override fun webSocketApi(): IWebSocketApi =
        unwrap(this).getWebSocketApi().let(IWebSocketApi::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps):
        WebSocketAuthorizerProps = CdkObjectWrappers.wrap(cdkObject) as? WebSocketAuthorizerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketAuthorizerProps):
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps
  }
}
