@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Example:
 *
 * ```
 * Function backend;
 * LambdaRestApi api = LambdaRestApi.Builder.create(this, "myapi")
 * .handler(backend)
 * .integrationOptions(LambdaIntegrationOptions.builder()
 * .allowTestInvoke(false)
 * .timeout(Duration.seconds(1))
 * .build())
 * .build();
 * ```
 */
public interface LambdaIntegrationOptions : IntegrationOptions {
  /**
   * Allow invoking method from AWS Console UI (for testing purposes).
   *
   * This will add another permission to the AWS Lambda resource policy which
   * will allow the `test-invoke-stage` stage to invoke this handler. If this
   * is set to `false`, the function will only be usable from the deployment
   * endpoint.
   *
   * Default: true
   */
  public fun allowTestInvoke(): Boolean? = unwrap(this).getAllowTestInvoke()

  /**
   * Use proxy integration or normal (request/response mapping) integration.
   *
   * Default: true
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-lambda-proxy-integrations.html#api-gateway-simple-proxy-for-lambda-output-format)
   */
  public fun proxy(): Boolean? = unwrap(this).getProxy()

  /**
   * A builder for [LambdaIntegrationOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowTestInvoke Allow invoking method from AWS Console UI (for testing purposes).
     * This will add another permission to the AWS Lambda resource policy which
     * will allow the `test-invoke-stage` stage to invoke this handler. If this
     * is set to `false`, the function will only be usable from the deployment
     * endpoint.
     */
    public fun allowTestInvoke(allowTestInvoke: Boolean)

    /**
     * @param cacheKeyParameters A list of request parameters whose values are to be cached.
     * It determines
     * request parameters that will make it into the cache key.
     */
    public fun cacheKeyParameters(cacheKeyParameters: List<String>)

    /**
     * @param cacheKeyParameters A list of request parameters whose values are to be cached.
     * It determines
     * request parameters that will make it into the cache key.
     */
    public fun cacheKeyParameters(vararg cacheKeyParameters: String)

    /**
     * @param cacheNamespace An API-specific tag group of related cached parameters.
     */
    public fun cacheNamespace(cacheNamespace: String)

    /**
     * @param connectionType The type of network connection to the integration endpoint.
     */
    public fun connectionType(connectionType: ConnectionType)

    /**
     * @param contentHandling Specifies how to handle request payload content type conversions.
     */
    public fun contentHandling(contentHandling: ContentHandling)

    /**
     * @param credentialsPassthrough Requires that the caller's identity be passed through from the
     * request.
     */
    public fun credentialsPassthrough(credentialsPassthrough: Boolean)

    /**
     * @param credentialsRole An IAM role that API Gateway assumes.
     * Mutually exclusive with `credentialsPassThrough`.
     */
    public fun credentialsRole(credentialsRole: IRole)

    /**
     * @param integrationResponses The response that API Gateway provides after a method's backend
     * completes processing a request.
     * API Gateway intercepts the response from the
     * backend so that you can control how API Gateway surfaces backend
     * responses. For example, you can map the backend status codes to codes
     * that you define.
     */
    public fun integrationResponses(integrationResponses: List<IntegrationResponse>)

    /**
     * @param integrationResponses The response that API Gateway provides after a method's backend
     * completes processing a request.
     * API Gateway intercepts the response from the
     * backend so that you can control how API Gateway surfaces backend
     * responses. For example, you can map the backend status codes to codes
     * that you define.
     */
    public fun integrationResponses(vararg integrationResponses: IntegrationResponse)

    /**
     * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
     * the Content-Type header in the request, and the available mapping templates specified as the
     * requestTemplates property on the Integration resource.
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER.
     */
    public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior)

    /**
     * @param proxy Use proxy integration or normal (request/response mapping) integration.
     */
    public fun proxy(proxy: Boolean)

    /**
     * @param requestParameters The request parameters that API Gateway sends with the backend
     * request.
     * Specify request parameters as key-value pairs (string-to-string
     * mappings), with a destination as the key and a source as the value.
     *
     * Specify the destination by using the following pattern
     * integration.request.location.name, where location is querystring, path,
     * or header, and name is a valid, unique parameter name.
     *
     * The source must be an existing method request parameter or a static
     * value. You must enclose static values in single quotation marks and
     * pre-encode these values based on their destination in the request.
     */
    public fun requestParameters(requestParameters: Map<String, String>)

    /**
     * @param requestTemplates A map of Apache Velocity templates that are applied on the request
     * payload.
     * The template that API Gateway uses is based on the value of the
     * Content-Type header that's sent by the client. The content type value is
     * the key, and the template is the value (specified as a string), such as
     * the following snippet:
     *
     * ```
     * { "application/json": "{ \"statusCode\": 200 }" }
     * ```
     */
    public fun requestTemplates(requestTemplates: Map<String, String>)

    /**
     * @param timeout The maximum amount of time an integration will run before it returns without a
     * response.
     * By default, the value must be between 50 milliseconds and 29 seconds.
     * The upper bound can be increased for regional and private Rest APIs only,
     * via a quota increase request for your acccount.
     * This increase might require a reduction in your account-level throttle quota limit.
     * *
     * See [https://docs.aws.amazon.com/apigateway/latest/developerguide/limits.html Amazon API
     * Gateway quotas] for more details.
     */
    public fun timeout(timeout: Duration)

    /**
     * @param vpcLink The VpcLink used for the integration.
     * Required if connectionType is VPC_LINK
     */
    public fun vpcLink(vpcLink: IVpcLink)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions.Builder =
        software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions.builder()

    /**
     * @param allowTestInvoke Allow invoking method from AWS Console UI (for testing purposes).
     * This will add another permission to the AWS Lambda resource policy which
     * will allow the `test-invoke-stage` stage to invoke this handler. If this
     * is set to `false`, the function will only be usable from the deployment
     * endpoint.
     */
    override fun allowTestInvoke(allowTestInvoke: Boolean) {
      cdkBuilder.allowTestInvoke(allowTestInvoke)
    }

    /**
     * @param cacheKeyParameters A list of request parameters whose values are to be cached.
     * It determines
     * request parameters that will make it into the cache key.
     */
    override fun cacheKeyParameters(cacheKeyParameters: List<String>) {
      cdkBuilder.cacheKeyParameters(cacheKeyParameters)
    }

    /**
     * @param cacheKeyParameters A list of request parameters whose values are to be cached.
     * It determines
     * request parameters that will make it into the cache key.
     */
    override fun cacheKeyParameters(vararg cacheKeyParameters: String): Unit =
        cacheKeyParameters(cacheKeyParameters.toList())

    /**
     * @param cacheNamespace An API-specific tag group of related cached parameters.
     */
    override fun cacheNamespace(cacheNamespace: String) {
      cdkBuilder.cacheNamespace(cacheNamespace)
    }

    /**
     * @param connectionType The type of network connection to the integration endpoint.
     */
    override fun connectionType(connectionType: ConnectionType) {
      cdkBuilder.connectionType(connectionType.let(ConnectionType.Companion::unwrap))
    }

    /**
     * @param contentHandling Specifies how to handle request payload content type conversions.
     */
    override fun contentHandling(contentHandling: ContentHandling) {
      cdkBuilder.contentHandling(contentHandling.let(ContentHandling.Companion::unwrap))
    }

    /**
     * @param credentialsPassthrough Requires that the caller's identity be passed through from the
     * request.
     */
    override fun credentialsPassthrough(credentialsPassthrough: Boolean) {
      cdkBuilder.credentialsPassthrough(credentialsPassthrough)
    }

    /**
     * @param credentialsRole An IAM role that API Gateway assumes.
     * Mutually exclusive with `credentialsPassThrough`.
     */
    override fun credentialsRole(credentialsRole: IRole) {
      cdkBuilder.credentialsRole(credentialsRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param integrationResponses The response that API Gateway provides after a method's backend
     * completes processing a request.
     * API Gateway intercepts the response from the
     * backend so that you can control how API Gateway surfaces backend
     * responses. For example, you can map the backend status codes to codes
     * that you define.
     */
    override fun integrationResponses(integrationResponses: List<IntegrationResponse>) {
      cdkBuilder.integrationResponses(integrationResponses.map(IntegrationResponse.Companion::unwrap))
    }

    /**
     * @param integrationResponses The response that API Gateway provides after a method's backend
     * completes processing a request.
     * API Gateway intercepts the response from the
     * backend so that you can control how API Gateway surfaces backend
     * responses. For example, you can map the backend status codes to codes
     * that you define.
     */
    override fun integrationResponses(vararg integrationResponses: IntegrationResponse): Unit =
        integrationResponses(integrationResponses.toList())

    /**
     * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
     * the Content-Type header in the request, and the available mapping templates specified as the
     * requestTemplates property on the Integration resource.
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER.
     */
    override fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
      cdkBuilder.passthroughBehavior(passthroughBehavior.let(PassthroughBehavior.Companion::unwrap))
    }

    /**
     * @param proxy Use proxy integration or normal (request/response mapping) integration.
     */
    override fun proxy(proxy: Boolean) {
      cdkBuilder.proxy(proxy)
    }

    /**
     * @param requestParameters The request parameters that API Gateway sends with the backend
     * request.
     * Specify request parameters as key-value pairs (string-to-string
     * mappings), with a destination as the key and a source as the value.
     *
     * Specify the destination by using the following pattern
     * integration.request.location.name, where location is querystring, path,
     * or header, and name is a valid, unique parameter name.
     *
     * The source must be an existing method request parameter or a static
     * value. You must enclose static values in single quotation marks and
     * pre-encode these values based on their destination in the request.
     */
    override fun requestParameters(requestParameters: Map<String, String>) {
      cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * @param requestTemplates A map of Apache Velocity templates that are applied on the request
     * payload.
     * The template that API Gateway uses is based on the value of the
     * Content-Type header that's sent by the client. The content type value is
     * the key, and the template is the value (specified as a string), such as
     * the following snippet:
     *
     * ```
     * { "application/json": "{ \"statusCode\": 200 }" }
     * ```
     */
    override fun requestTemplates(requestTemplates: Map<String, String>) {
      cdkBuilder.requestTemplates(requestTemplates)
    }

    /**
     * @param timeout The maximum amount of time an integration will run before it returns without a
     * response.
     * By default, the value must be between 50 milliseconds and 29 seconds.
     * The upper bound can be increased for regional and private Rest APIs only,
     * via a quota increase request for your acccount.
     * This increase might require a reduction in your account-level throttle quota limit.
     * *
     * See [https://docs.aws.amazon.com/apigateway/latest/developerguide/limits.html Amazon API
     * Gateway quotas] for more details.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param vpcLink The VpcLink used for the integration.
     * Required if connectionType is VPC_LINK
     */
    override fun vpcLink(vpcLink: IVpcLink) {
      cdkBuilder.vpcLink(vpcLink.let(IVpcLink.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions,
  ) : CdkObject(cdkObject),
      LambdaIntegrationOptions {
    /**
     * Allow invoking method from AWS Console UI (for testing purposes).
     *
     * This will add another permission to the AWS Lambda resource policy which
     * will allow the `test-invoke-stage` stage to invoke this handler. If this
     * is set to `false`, the function will only be usable from the deployment
     * endpoint.
     *
     * Default: true
     */
    override fun allowTestInvoke(): Boolean? = unwrap(this).getAllowTestInvoke()

    /**
     * A list of request parameters whose values are to be cached.
     *
     * It determines
     * request parameters that will make it into the cache key.
     */
    override fun cacheKeyParameters(): List<String> = unwrap(this).getCacheKeyParameters() ?:
        emptyList()

    /**
     * An API-specific tag group of related cached parameters.
     */
    override fun cacheNamespace(): String? = unwrap(this).getCacheNamespace()

    /**
     * The type of network connection to the integration endpoint.
     *
     * Default: - ConnectionType.VPC_LINK if `vpcLink` property is configured;
     * ConnectionType.Internet otherwise.
     */
    override fun connectionType(): ConnectionType? =
        unwrap(this).getConnectionType()?.let(ConnectionType::wrap)

    /**
     * Specifies how to handle request payload content type conversions.
     *
     * Default: none if this property isn't defined, the request payload is passed
     * through from the method request to the integration request without
     * modification, provided that the `passthroughBehaviors` property is
     * configured to support payload pass-through.
     */
    override fun contentHandling(): ContentHandling? =
        unwrap(this).getContentHandling()?.let(ContentHandling::wrap)

    /**
     * Requires that the caller's identity be passed through from the request.
     *
     * Default: Caller identity is not passed through
     */
    override fun credentialsPassthrough(): Boolean? = unwrap(this).getCredentialsPassthrough()

    /**
     * An IAM role that API Gateway assumes.
     *
     * Mutually exclusive with `credentialsPassThrough`.
     *
     * Default: A role is not assumed
     */
    override fun credentialsRole(): IRole? = unwrap(this).getCredentialsRole()?.let(IRole::wrap)

    /**
     * The response that API Gateway provides after a method's backend completes processing a
     * request.
     *
     * API Gateway intercepts the response from the
     * backend so that you can control how API Gateway surfaces backend
     * responses. For example, you can map the backend status codes to codes
     * that you define.
     */
    override fun integrationResponses(): List<IntegrationResponse> =
        unwrap(this).getIntegrationResponses()?.map(IntegrationResponse::wrap) ?: emptyList()

    /**
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in
     * the request, and the available mapping templates specified as the requestTemplates property on
     * the Integration resource.
     *
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER.
     */
    override fun passthroughBehavior(): PassthroughBehavior? =
        unwrap(this).getPassthroughBehavior()?.let(PassthroughBehavior::wrap)

    /**
     * Use proxy integration or normal (request/response mapping) integration.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-lambda-proxy-integrations.html#api-gateway-simple-proxy-for-lambda-output-format)
     */
    override fun proxy(): Boolean? = unwrap(this).getProxy()

    /**
     * The request parameters that API Gateway sends with the backend request.
     *
     * Specify request parameters as key-value pairs (string-to-string
     * mappings), with a destination as the key and a source as the value.
     *
     * Specify the destination by using the following pattern
     * integration.request.location.name, where location is querystring, path,
     * or header, and name is a valid, unique parameter name.
     *
     * The source must be an existing method request parameter or a static
     * value. You must enclose static values in single quotation marks and
     * pre-encode these values based on their destination in the request.
     */
    override fun requestParameters(): Map<String, String> = unwrap(this).getRequestParameters() ?:
        emptyMap()

    /**
     * A map of Apache Velocity templates that are applied on the request payload.
     *
     * The template that API Gateway uses is based on the value of the
     * Content-Type header that's sent by the client. The content type value is
     * the key, and the template is the value (specified as a string), such as
     * the following snippet:
     *
     * ```
     * { "application/json": "{ \"statusCode\": 200 }" }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html)
     */
    override fun requestTemplates(): Map<String, String> = unwrap(this).getRequestTemplates() ?:
        emptyMap()

    /**
     * The maximum amount of time an integration will run before it returns without a response.
     *
     * By default, the value must be between 50 milliseconds and 29 seconds.
     * The upper bound can be increased for regional and private Rest APIs only,
     * via a quota increase request for your acccount.
     * This increase might require a reduction in your account-level throttle quota limit.
     * See [https://docs.aws.amazon.com/apigateway/latest/developerguide/limits.html Amazon API
     * Gateway quotas] for more details.
     *
     * Default: Duration.seconds(29)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * The VpcLink used for the integration.
     *
     * Required if connectionType is VPC_LINK
     */
    override fun vpcLink(): IVpcLink? = unwrap(this).getVpcLink()?.let(IVpcLink::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaIntegrationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions):
        LambdaIntegrationOptions = CdkObjectWrappers.wrap(cdkObject) as? LambdaIntegrationOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaIntegrationOptions):
        software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions
  }
}
