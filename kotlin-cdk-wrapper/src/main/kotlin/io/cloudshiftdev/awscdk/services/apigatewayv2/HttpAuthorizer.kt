@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An authorizer for Http Apis.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * HttpApi httpApi;
 * HttpAuthorizer httpAuthorizer = HttpAuthorizer.Builder.create(this, "MyHttpAuthorizer")
 * .httpApi(httpApi)
 * .identitySource(List.of("identitySource"))
 * .type(HttpAuthorizerType.IAM)
 * // the properties below are optional
 * .authorizerName("authorizerName")
 * .authorizerUri("authorizerUri")
 * .enableSimpleResponses(false)
 * .jwtAudience(List.of("jwtAudience"))
 * .jwtIssuer("jwtIssuer")
 * .payloadFormatVersion(AuthorizerPayloadVersion.VERSION_1_0)
 * .resultsCacheTtl(Duration.minutes(30))
 * .build();
 * ```
 */
public open class HttpAuthorizer(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer,
) : Resource(cdkObject),
    IHttpAuthorizer {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: HttpAuthorizerProps,
  ) :
      this(software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(HttpAuthorizerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: HttpAuthorizerProps.Builder.() -> Unit,
  ) : this(scope, id, HttpAuthorizerProps(props)
  )

  /**
   * Id of the Authorizer.
   */
  public override fun authorizerId(): String = unwrap(this).getAuthorizerId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.HttpAuthorizer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Name of the authorizer.
     *
     * Default: - id of the HttpAuthorizer construct.
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
     * Specifies whether a Lambda authorizer returns a response in a simple format.
     *
     * If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
     *
     * Default: - The lambda authorizer must return an IAM policy as its response
     *
     * @param enableSimpleResponses Specifies whether a Lambda authorizer returns a response in a
     * simple format. 
     */
    public fun enableSimpleResponses(enableSimpleResponses: Boolean)

    /**
     * HTTP Api to attach the authorizer to.
     *
     * @param httpApi HTTP Api to attach the authorizer to. 
     */
    public fun httpApi(httpApi: IHttpApi)

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
     * A list of the intended recipients of the JWT.
     *
     * A valid JWT must provide an aud that matches at least one entry in this list.
     *
     * Default: - required for JWT authorizer typess.
     *
     * @param jwtAudience A list of the intended recipients of the JWT. 
     */
    public fun jwtAudience(jwtAudience: List<String>)

    /**
     * A list of the intended recipients of the JWT.
     *
     * A valid JWT must provide an aud that matches at least one entry in this list.
     *
     * Default: - required for JWT authorizer typess.
     *
     * @param jwtAudience A list of the intended recipients of the JWT. 
     */
    public fun jwtAudience(vararg jwtAudience: String)

    /**
     * The base domain of the identity provider that issues JWT.
     *
     * Default: - required for JWT authorizer types.
     *
     * @param jwtIssuer The base domain of the identity provider that issues JWT. 
     */
    public fun jwtIssuer(jwtIssuer: String)

    /**
     * Specifies the format of the payload sent to an HTTP API Lambda authorizer.
     *
     * Default: AuthorizerPayloadVersion.VERSION_2_0 if the authorizer type is
     * HttpAuthorizerType.LAMBDA
     *
     * @param payloadFormatVersion Specifies the format of the payload sent to an HTTP API Lambda
     * authorizer. 
     */
    public fun payloadFormatVersion(payloadFormatVersion: AuthorizerPayloadVersion)

    /**
     * How long APIGateway should cache the results.
     *
     * Max 1 hour.
     *
     * Default: - API Gateway will not cache authorizer responses
     *
     * @param resultsCacheTtl How long APIGateway should cache the results. 
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration)

    /**
     * The type of authorizer.
     *
     * @param type The type of authorizer. 
     */
    public fun type(type: HttpAuthorizerType)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer.Builder.create(scope, id)

    /**
     * Name of the authorizer.
     *
     * Default: - id of the HttpAuthorizer construct.
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
     * Specifies whether a Lambda authorizer returns a response in a simple format.
     *
     * If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
     *
     * Default: - The lambda authorizer must return an IAM policy as its response
     *
     * @param enableSimpleResponses Specifies whether a Lambda authorizer returns a response in a
     * simple format. 
     */
    override fun enableSimpleResponses(enableSimpleResponses: Boolean) {
      cdkBuilder.enableSimpleResponses(enableSimpleResponses)
    }

    /**
     * HTTP Api to attach the authorizer to.
     *
     * @param httpApi HTTP Api to attach the authorizer to. 
     */
    override fun httpApi(httpApi: IHttpApi) {
      cdkBuilder.httpApi(httpApi.let(IHttpApi.Companion::unwrap))
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
     * A list of the intended recipients of the JWT.
     *
     * A valid JWT must provide an aud that matches at least one entry in this list.
     *
     * Default: - required for JWT authorizer typess.
     *
     * @param jwtAudience A list of the intended recipients of the JWT. 
     */
    override fun jwtAudience(jwtAudience: List<String>) {
      cdkBuilder.jwtAudience(jwtAudience)
    }

    /**
     * A list of the intended recipients of the JWT.
     *
     * A valid JWT must provide an aud that matches at least one entry in this list.
     *
     * Default: - required for JWT authorizer typess.
     *
     * @param jwtAudience A list of the intended recipients of the JWT. 
     */
    override fun jwtAudience(vararg jwtAudience: String): Unit = jwtAudience(jwtAudience.toList())

    /**
     * The base domain of the identity provider that issues JWT.
     *
     * Default: - required for JWT authorizer types.
     *
     * @param jwtIssuer The base domain of the identity provider that issues JWT. 
     */
    override fun jwtIssuer(jwtIssuer: String) {
      cdkBuilder.jwtIssuer(jwtIssuer)
    }

    /**
     * Specifies the format of the payload sent to an HTTP API Lambda authorizer.
     *
     * Default: AuthorizerPayloadVersion.VERSION_2_0 if the authorizer type is
     * HttpAuthorizerType.LAMBDA
     *
     * @param payloadFormatVersion Specifies the format of the payload sent to an HTTP API Lambda
     * authorizer. 
     */
    override fun payloadFormatVersion(payloadFormatVersion: AuthorizerPayloadVersion) {
      cdkBuilder.payloadFormatVersion(payloadFormatVersion.let(AuthorizerPayloadVersion.Companion::unwrap))
    }

    /**
     * How long APIGateway should cache the results.
     *
     * Max 1 hour.
     *
     * Default: - API Gateway will not cache authorizer responses
     *
     * @param resultsCacheTtl How long APIGateway should cache the results. 
     */
    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration.Companion::unwrap))
    }

    /**
     * The type of authorizer.
     *
     * @param type The type of authorizer. 
     */
    override fun type(type: HttpAuthorizerType) {
      cdkBuilder.type(type.let(HttpAuthorizerType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer.PROPERTY_INJECTION_ID

    public fun fromHttpAuthorizerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: HttpAuthorizerAttributes,
    ): IHttpRouteAuthorizer =
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer.fromHttpAuthorizerAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(HttpAuthorizerAttributes.Companion::unwrap)).let(IHttpRouteAuthorizer::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf1a033791ee074ae395c0f1b6787e8eba84915efec33220ef959a38f976984f")
    public fun fromHttpAuthorizerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: HttpAuthorizerAttributes.Builder.() -> Unit,
    ): IHttpRouteAuthorizer = fromHttpAuthorizerAttributes(scope, id,
        HttpAuthorizerAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HttpAuthorizer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HttpAuthorizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer):
        HttpAuthorizer = HttpAuthorizer(cdkObject)

    internal fun unwrap(wrapped: HttpAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer = wrapped.cdkObject as
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer
  }
}
