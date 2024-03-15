@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties to initialize an instance of `HttpAuthorizer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * HttpApi httpApi;
 * HttpAuthorizerProps httpAuthorizerProps = HttpAuthorizerProps.builder()
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
public interface HttpAuthorizerProps {
  /**
   * Name of the authorizer.
   *
   * Default: - id of the HttpAuthorizer construct.
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
   * Specifies whether a Lambda authorizer returns a response in a simple format.
   *
   * If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
   *
   * Default: - The lambda authorizer must return an IAM policy as its response
   */
  public fun enableSimpleResponses(): Boolean? = unwrap(this).getEnableSimpleResponses()

  /**
   * HTTP Api to attach the authorizer to.
   */
  public fun httpApi(): IHttpApi

  /**
   * The identity source for which authorization is requested.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
   */
  public fun identitySource(): List<String>

  /**
   * A list of the intended recipients of the JWT.
   *
   * A valid JWT must provide an aud that matches at least one entry in this list.
   *
   * Default: - required for JWT authorizer typess.
   */
  public fun jwtAudience(): List<String> = unwrap(this).getJwtAudience() ?: emptyList()

  /**
   * The base domain of the identity provider that issues JWT.
   *
   * Default: - required for JWT authorizer types.
   */
  public fun jwtIssuer(): String? = unwrap(this).getJwtIssuer()

  /**
   * Specifies the format of the payload sent to an HTTP API Lambda authorizer.
   *
   * Default: AuthorizerPayloadVersion.VERSION_2_0 if the authorizer type is
   * HttpAuthorizerType.LAMBDA
   */
  public fun payloadFormatVersion(): AuthorizerPayloadVersion? =
      unwrap(this).getPayloadFormatVersion()?.let(AuthorizerPayloadVersion::wrap)

  /**
   * How long APIGateway should cache the results.
   *
   * Max 1 hour.
   *
   * Default: - API Gateway will not cache authorizer responses
   */
  public fun resultsCacheTtl(): Duration? = unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)

  /**
   * The type of authorizer.
   */
  public fun type(): HttpAuthorizerType

  /**
   * A builder for [HttpAuthorizerProps]
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
     * @param enableSimpleResponses Specifies whether a Lambda authorizer returns a response in a
     * simple format.
     * If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
     */
    public fun enableSimpleResponses(enableSimpleResponses: Boolean)

    /**
     * @param httpApi HTTP Api to attach the authorizer to. 
     */
    public fun httpApi(httpApi: IHttpApi)

    /**
     * @param identitySource The identity source for which authorization is requested. 
     */
    public fun identitySource(identitySource: List<String>)

    /**
     * @param identitySource The identity source for which authorization is requested. 
     */
    public fun identitySource(vararg identitySource: String)

    /**
     * @param jwtAudience A list of the intended recipients of the JWT.
     * A valid JWT must provide an aud that matches at least one entry in this list.
     */
    public fun jwtAudience(jwtAudience: List<String>)

    /**
     * @param jwtAudience A list of the intended recipients of the JWT.
     * A valid JWT must provide an aud that matches at least one entry in this list.
     */
    public fun jwtAudience(vararg jwtAudience: String)

    /**
     * @param jwtIssuer The base domain of the identity provider that issues JWT.
     */
    public fun jwtIssuer(jwtIssuer: String)

    /**
     * @param payloadFormatVersion Specifies the format of the payload sent to an HTTP API Lambda
     * authorizer.
     */
    public fun payloadFormatVersion(payloadFormatVersion: AuthorizerPayloadVersion)

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results.
     * Max 1 hour.
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration)

    /**
     * @param type The type of authorizer. 
     */
    public fun type(type: HttpAuthorizerType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerProps.Builder
        = software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerProps.builder()

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
     * @param enableSimpleResponses Specifies whether a Lambda authorizer returns a response in a
     * simple format.
     * If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
     */
    override fun enableSimpleResponses(enableSimpleResponses: Boolean) {
      cdkBuilder.enableSimpleResponses(enableSimpleResponses)
    }

    /**
     * @param httpApi HTTP Api to attach the authorizer to. 
     */
    override fun httpApi(httpApi: IHttpApi) {
      cdkBuilder.httpApi(httpApi.let(IHttpApi::unwrap))
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
     * @param jwtAudience A list of the intended recipients of the JWT.
     * A valid JWT must provide an aud that matches at least one entry in this list.
     */
    override fun jwtAudience(jwtAudience: List<String>) {
      cdkBuilder.jwtAudience(jwtAudience)
    }

    /**
     * @param jwtAudience A list of the intended recipients of the JWT.
     * A valid JWT must provide an aud that matches at least one entry in this list.
     */
    override fun jwtAudience(vararg jwtAudience: String): Unit = jwtAudience(jwtAudience.toList())

    /**
     * @param jwtIssuer The base domain of the identity provider that issues JWT.
     */
    override fun jwtIssuer(jwtIssuer: String) {
      cdkBuilder.jwtIssuer(jwtIssuer)
    }

    /**
     * @param payloadFormatVersion Specifies the format of the payload sent to an HTTP API Lambda
     * authorizer.
     */
    override fun payloadFormatVersion(payloadFormatVersion: AuthorizerPayloadVersion) {
      cdkBuilder.payloadFormatVersion(payloadFormatVersion.let(AuthorizerPayloadVersion::unwrap))
    }

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results.
     * Max 1 hour.
     */
    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration::unwrap))
    }

    /**
     * @param type The type of authorizer. 
     */
    override fun type(type: HttpAuthorizerType) {
      cdkBuilder.type(type.let(HttpAuthorizerType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerProps,
  ) : CdkObject(cdkObject), HttpAuthorizerProps {
    /**
     * Name of the authorizer.
     *
     * Default: - id of the HttpAuthorizer construct.
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
     * Specifies whether a Lambda authorizer returns a response in a simple format.
     *
     * If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
     *
     * Default: - The lambda authorizer must return an IAM policy as its response
     */
    override fun enableSimpleResponses(): Boolean? = unwrap(this).getEnableSimpleResponses()

    /**
     * HTTP Api to attach the authorizer to.
     */
    override fun httpApi(): IHttpApi = unwrap(this).getHttpApi().let(IHttpApi::wrap)

    /**
     * The identity source for which authorization is requested.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html#cfn-apigatewayv2-authorizer-identitysource)
     */
    override fun identitySource(): List<String> = unwrap(this).getIdentitySource()

    /**
     * A list of the intended recipients of the JWT.
     *
     * A valid JWT must provide an aud that matches at least one entry in this list.
     *
     * Default: - required for JWT authorizer typess.
     */
    override fun jwtAudience(): List<String> = unwrap(this).getJwtAudience() ?: emptyList()

    /**
     * The base domain of the identity provider that issues JWT.
     *
     * Default: - required for JWT authorizer types.
     */
    override fun jwtIssuer(): String? = unwrap(this).getJwtIssuer()

    /**
     * Specifies the format of the payload sent to an HTTP API Lambda authorizer.
     *
     * Default: AuthorizerPayloadVersion.VERSION_2_0 if the authorizer type is
     * HttpAuthorizerType.LAMBDA
     */
    override fun payloadFormatVersion(): AuthorizerPayloadVersion? =
        unwrap(this).getPayloadFormatVersion()?.let(AuthorizerPayloadVersion::wrap)

    /**
     * How long APIGateway should cache the results.
     *
     * Max 1 hour.
     *
     * Default: - API Gateway will not cache authorizer responses
     */
    override fun resultsCacheTtl(): Duration? =
        unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)

    /**
     * The type of authorizer.
     */
    override fun type(): HttpAuthorizerType = unwrap(this).getType().let(HttpAuthorizerType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerProps):
        HttpAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpAuthorizerProps):
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerProps
  }
}
