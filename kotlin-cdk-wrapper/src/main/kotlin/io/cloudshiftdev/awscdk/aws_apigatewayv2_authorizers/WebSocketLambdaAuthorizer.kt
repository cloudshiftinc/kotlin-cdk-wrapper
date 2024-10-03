@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.lambda.IFunction as CloudshiftdevAwscdkServicesLambdaIFunction
import software.amazon.awscdk.services.lambda.IFunction as AmazonAwscdkServicesLambdaIFunction

/**
 * Authorize WebSocket Api routes via a lambda function.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
 * // This function handles your auth logic
 * Function authHandler;
 * // This function handles your WebSocket requests
 * Function handler;
 * WebSocketLambdaAuthorizer authorizer = new WebSocketLambdaAuthorizer("Authorizer", authHandler);
 * WebSocketLambdaIntegration integration = new WebSocketLambdaIntegration("Integration", handler);
 * WebSocketApi.Builder.create(this, "WebSocketApi")
 * .connectRouteOptions(WebSocketRouteOptions.builder()
 * .integration(integration)
 * .authorizer(authorizer)
 * .build())
 * .build();
 * ```
 */
public open class WebSocketLambdaAuthorizer(
  cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer,
) : CdkObject(cdkObject),
    IWebSocketRouteAuthorizer {
  public constructor(id: String, handler: CloudshiftdevAwscdkServicesLambdaIFunction) :
      this(software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer(id,
      handler.let(CloudshiftdevAwscdkServicesLambdaIFunction.Companion::unwrap))
  )

  public constructor(
    id: String,
    handler: CloudshiftdevAwscdkServicesLambdaIFunction,
    props: WebSocketLambdaAuthorizerProps,
  ) : this(software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer(id,
      handler.let(CloudshiftdevAwscdkServicesLambdaIFunction.Companion::unwrap),
      props.let(WebSocketLambdaAuthorizerProps.Companion::unwrap))
  )

  public constructor(
    id: String,
    handler: CloudshiftdevAwscdkServicesLambdaIFunction,
    props: WebSocketLambdaAuthorizerProps.Builder.() -> Unit,
  ) : this(id, handler, WebSocketLambdaAuthorizerProps(props)
  )

  /**
   * Bind this authorizer to a specified WebSocket route.
   *
   * @param options 
   */
  public override fun bind(options: WebSocketRouteAuthorizerBindOptions):
      WebSocketRouteAuthorizerConfig =
      unwrap(this).bind(options.let(WebSocketRouteAuthorizerBindOptions.Companion::unwrap)).let(WebSocketRouteAuthorizerConfig::wrap)

  /**
   * Bind this authorizer to a specified WebSocket route.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4748e6838372195e9aa1a18e6e678999d779e421141e36cb85387a0736bf08b7")
  public override fun bind(options: WebSocketRouteAuthorizerBindOptions.Builder.() -> Unit):
      WebSocketRouteAuthorizerConfig = bind(WebSocketRouteAuthorizerBindOptions(options))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the authorizer.
     *
     * Default: - same value as `id` passed in the constructor.
     *
     * @param authorizerName The name of the authorizer. 
     */
    public fun authorizerName(authorizerName: String)

    /**
     * The identity source for which authorization is requested.
     *
     * Request parameter match `'route.request.querystring|header.[a-zA-z0-9._-]+'`.
     * Staged variable match `'stageVariables.[a-zA-Z0-9._-]+'`.
     * Context parameter match `'context.[a-zA-Z0-9._-]+'`.
     *
     * Default: ['route.request.header.Authorization']
     *
     * @param identitySource The identity source for which authorization is requested. 
     */
    public fun identitySource(identitySource: List<String>)

    /**
     * The identity source for which authorization is requested.
     *
     * Request parameter match `'route.request.querystring|header.[a-zA-z0-9._-]+'`.
     * Staged variable match `'stageVariables.[a-zA-Z0-9._-]+'`.
     * Context parameter match `'context.[a-zA-Z0-9._-]+'`.
     *
     * Default: ['route.request.header.Authorization']
     *
     * @param identitySource The identity source for which authorization is requested. 
     */
    public fun identitySource(vararg identitySource: String)
  }

  private class BuilderImpl(
    id: String,
    handler: AmazonAwscdkServicesLambdaIFunction,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer.Builder =
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer.Builder.create(id,
        handler)

    /**
     * The name of the authorizer.
     *
     * Default: - same value as `id` passed in the constructor.
     *
     * @param authorizerName The name of the authorizer. 
     */
    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * The identity source for which authorization is requested.
     *
     * Request parameter match `'route.request.querystring|header.[a-zA-z0-9._-]+'`.
     * Staged variable match `'stageVariables.[a-zA-Z0-9._-]+'`.
     * Context parameter match `'context.[a-zA-Z0-9._-]+'`.
     *
     * Default: ['route.request.header.Authorization']
     *
     * @param identitySource The identity source for which authorization is requested. 
     */
    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    /**
     * The identity source for which authorization is requested.
     *
     * Request parameter match `'route.request.querystring|header.[a-zA-z0-9._-]+'`.
     * Staged variable match `'stageVariables.[a-zA-Z0-9._-]+'`.
     * Context parameter match `'context.[a-zA-Z0-9._-]+'`.
     *
     * Default: ['route.request.header.Authorization']
     *
     * @param identitySource The identity source for which authorization is requested. 
     */
    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      id: String,
      handler: CloudshiftdevAwscdkServicesLambdaIFunction,
      block: Builder.() -> Unit = {},
    ): WebSocketLambdaAuthorizer {
      val builderImpl = BuilderImpl(id, CloudshiftdevAwscdkServicesLambdaIFunction.unwrap(handler))
      return WebSocketLambdaAuthorizer(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer):
        WebSocketLambdaAuthorizer = WebSocketLambdaAuthorizer(cdkObject)

    internal fun unwrap(wrapped: WebSocketLambdaAuthorizer):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer =
        wrapped.cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer
  }
}
