@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An authorizer for WebSocket Apis.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * WebSocketApi webSocketApi;
 * WebSocketAuthorizer webSocketAuthorizer = WebSocketAuthorizer.Builder.create(this,
 * "MyWebSocketAuthorizer")
 * .identitySource(List.of("identitySource"))
 * .type(WebSocketAuthorizerType.LAMBDA)
 * .webSocketApi(webSocketApi)
 * // the properties below are optional
 * .authorizerName("authorizerName")
 * .authorizerUri("authorizerUri")
 * .build();
 * ```
 */
public open class WebSocketAuthorizer(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer,
) : Resource(cdkObject),
    IWebSocketAuthorizer {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: WebSocketAuthorizerProps,
  ) :
      this(software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(WebSocketAuthorizerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: WebSocketAuthorizerProps.Builder.() -> Unit,
  ) : this(scope, id, WebSocketAuthorizerProps(props)
  )

  /**
   * Id of the Authorizer.
   */
  public override fun authorizerId(): String = unwrap(this).getAuthorizerId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketAuthorizer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Name of the authorizer.
     *
     * Default: - id of the WebSocketAuthorizer construct.
     *
     * @param authorizerName Name of the authorizer. 
     */
    public fun authorizerName(authorizerName: String)

    /**
     * The authorizer's Uniform Resource Identifier (URI).
     *
     * For REQUEST authorizers, this must be a well-formed Lambda function URI.
     *
     * Default: - required for Request authorizer types
     *
     * @param authorizerUri The authorizer's Uniform Resource Identifier (URI). 
     */
    public fun authorizerUri(authorizerUri: String)

    /**
     * The identity source for which authorization is requested.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
     * @param identitySource The identity source for which authorization is requested. 
     */
    public fun identitySource(identitySource: List<String>)

    /**
     * The identity source for which authorization is requested.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
     * @param identitySource The identity source for which authorization is requested. 
     */
    public fun identitySource(vararg identitySource: String)

    /**
     * The type of authorizer.
     *
     * @param type The type of authorizer. 
     */
    public fun type(type: WebSocketAuthorizerType)

    /**
     * WebSocket Api to attach the authorizer to.
     *
     * @param webSocketApi WebSocket Api to attach the authorizer to. 
     */
    public fun webSocketApi(webSocketApi: IWebSocketApi)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer.Builder
        = software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer.Builder.create(scope, id)

    /**
     * Name of the authorizer.
     *
     * Default: - id of the WebSocketAuthorizer construct.
     *
     * @param authorizerName Name of the authorizer. 
     */
    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * The authorizer's Uniform Resource Identifier (URI).
     *
     * For REQUEST authorizers, this must be a well-formed Lambda function URI.
     *
     * Default: - required for Request authorizer types
     *
     * @param authorizerUri The authorizer's Uniform Resource Identifier (URI). 
     */
    override fun authorizerUri(authorizerUri: String) {
      cdkBuilder.authorizerUri(authorizerUri)
    }

    /**
     * The identity source for which authorization is requested.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
     * @param identitySource The identity source for which authorization is requested. 
     */
    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    /**
     * The identity source for which authorization is requested.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
     * @param identitySource The identity source for which authorization is requested. 
     */
    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    /**
     * The type of authorizer.
     *
     * @param type The type of authorizer. 
     */
    override fun type(type: WebSocketAuthorizerType) {
      cdkBuilder.type(type.let(WebSocketAuthorizerType.Companion::unwrap))
    }

    /**
     * WebSocket Api to attach the authorizer to.
     *
     * @param webSocketApi WebSocket Api to attach the authorizer to. 
     */
    override fun webSocketApi(webSocketApi: IWebSocketApi) {
      cdkBuilder.webSocketApi(webSocketApi.let(IWebSocketApi.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromWebSocketAuthorizerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: WebSocketAuthorizerAttributes,
    ): IWebSocketRouteAuthorizer =
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer.fromWebSocketAuthorizerAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id,
        attrs.let(WebSocketAuthorizerAttributes.Companion::unwrap)).let(IWebSocketRouteAuthorizer::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1ef7641b7e24d5299874ba34280a6013ee58585e0c382e2bd0a1c5bd8550955")
    public fun fromWebSocketAuthorizerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: WebSocketAuthorizerAttributes.Builder.() -> Unit,
    ): IWebSocketRouteAuthorizer = fromWebSocketAuthorizerAttributes(scope, id,
        WebSocketAuthorizerAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): WebSocketAuthorizer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return WebSocketAuthorizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer):
        WebSocketAuthorizer = WebSocketAuthorizer(cdkObject)

    internal fun unwrap(wrapped: WebSocketAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer = wrapped.cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer
  }
}
