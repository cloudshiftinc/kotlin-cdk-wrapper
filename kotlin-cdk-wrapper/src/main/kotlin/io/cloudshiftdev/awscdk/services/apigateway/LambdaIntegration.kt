@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.lambda.IFunction as CloudshiftdevAwscdkServicesLambdaIFunction
import software.amazon.awscdk.services.lambda.IFunction as AmazonAwscdkServicesLambdaIFunction

/**
 * Integrates an AWS Lambda function to an API Gateway method.
 *
 * Example:
 *
 * ```
 * Resource resource;
 * Function handler;
 * resource.addMethod("GET", new LambdaIntegration(handler));
 * ```
 */
public open class LambdaIntegration(
  cdkObject: software.amazon.awscdk.services.apigateway.LambdaIntegration,
) : AwsIntegration(cdkObject) {
  public constructor(handler: CloudshiftdevAwscdkServicesLambdaIFunction) :
      this(software.amazon.awscdk.services.apigateway.LambdaIntegration(handler.let(CloudshiftdevAwscdkServicesLambdaIFunction.Companion::unwrap))
  )

  public constructor(handler: CloudshiftdevAwscdkServicesLambdaIFunction,
      options: LambdaIntegrationOptions) :
      this(software.amazon.awscdk.services.apigateway.LambdaIntegration(handler.let(CloudshiftdevAwscdkServicesLambdaIFunction.Companion::unwrap),
      options.let(LambdaIntegrationOptions.Companion::unwrap))
  )

  public constructor(handler: CloudshiftdevAwscdkServicesLambdaIFunction,
      options: LambdaIntegrationOptions.Builder.() -> Unit) : this(handler,
      LambdaIntegrationOptions(options)
  )

  /**
   * Can be overridden by subclasses to allow the integration to interact with the method being
   * integrated, access the REST API object, method ARNs, etc.
   *
   * @param method 
   */
  public override fun bind(method: Method): IntegrationConfig =
      unwrap(this).bind(method.let(Method.Companion::unwrap)).let(IntegrationConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.LambdaIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Allow invoking method from AWS Console UI (for testing purposes).
     *
     * This will add another permission to the AWS Lambda resource policy which
     * will allow the `test-invoke-stage` stage to invoke this handler. If this
     * is set to `false`, the function will only be usable from the deployment
     * endpoint.
     *
     * Default: true
     *
     * @param allowTestInvoke Allow invoking method from AWS Console UI (for testing purposes). 
     */
    public fun allowTestInvoke(allowTestInvoke: Boolean)

    /**
     * A list of request parameters whose values are to be cached.
     *
     * It determines
     * request parameters that will make it into the cache key.
     *
     * @param cacheKeyParameters A list of request parameters whose values are to be cached. 
     */
    public fun cacheKeyParameters(cacheKeyParameters: List<String>)

    /**
     * A list of request parameters whose values are to be cached.
     *
     * It determines
     * request parameters that will make it into the cache key.
     *
     * @param cacheKeyParameters A list of request parameters whose values are to be cached. 
     */
    public fun cacheKeyParameters(vararg cacheKeyParameters: String)

    /**
     * An API-specific tag group of related cached parameters.
     *
     * @param cacheNamespace An API-specific tag group of related cached parameters. 
     */
    public fun cacheNamespace(cacheNamespace: String)

    /**
     * The type of network connection to the integration endpoint.
     *
     * Default: - ConnectionType.VPC_LINK if `vpcLink` property is configured;
     * ConnectionType.Internet otherwise.
     *
     * @param connectionType The type of network connection to the integration endpoint. 
     */
    public fun connectionType(connectionType: ConnectionType)

    /**
     * Specifies how to handle request payload content type conversions.
     *
     * Default: none if this property isn't defined, the request payload is passed
     * through from the method request to the integration request without
     * modification, provided that the `passthroughBehaviors` property is
     * configured to support payload pass-through.
     *
     * @param contentHandling Specifies how to handle request payload content type conversions. 
     */
    public fun contentHandling(contentHandling: ContentHandling)

    /**
     * Requires that the caller's identity be passed through from the request.
     *
     * Default: Caller identity is not passed through
     *
     * @param credentialsPassthrough Requires that the caller's identity be passed through from the
     * request. 
     */
    public fun credentialsPassthrough(credentialsPassthrough: Boolean)

    /**
     * An IAM role that API Gateway assumes.
     *
     * Mutually exclusive with `credentialsPassThrough`.
     *
     * Default: A role is not assumed
     *
     * @param credentialsRole An IAM role that API Gateway assumes. 
     */
    public fun credentialsRole(credentialsRole: IRole)

    /**
     * The response that API Gateway provides after a method's backend completes processing a
     * request.
     *
     * API Gateway intercepts the response from the
     * backend so that you can control how API Gateway surfaces backend
     * responses. For example, you can map the backend status codes to codes
     * that you define.
     *
     * @param integrationResponses The response that API Gateway provides after a method's backend
     * completes processing a request. 
     */
    public fun integrationResponses(integrationResponses: List<IntegrationResponse>)

    /**
     * The response that API Gateway provides after a method's backend completes processing a
     * request.
     *
     * API Gateway intercepts the response from the
     * backend so that you can control how API Gateway surfaces backend
     * responses. For example, you can map the backend status codes to codes
     * that you define.
     *
     * @param integrationResponses The response that API Gateway provides after a method's backend
     * completes processing a request. 
     */
    public fun integrationResponses(vararg integrationResponses: IntegrationResponse)

    /**
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in
     * the request, and the available mapping templates specified as the requestTemplates property on
     * the Integration resource.
     *
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER.
     *
     * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
     * the Content-Type header in the request, and the available mapping templates specified as the
     * requestTemplates property on the Integration resource. 
     */
    public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior)

    /**
     * Use proxy integration or normal (request/response mapping) integration.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-lambda-proxy-integrations.html#api-gateway-simple-proxy-for-lambda-output-format)
     * @param proxy Use proxy integration or normal (request/response mapping) integration. 
     */
    public fun proxy(proxy: Boolean)

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
     *
     * @param requestParameters The request parameters that API Gateway sends with the backend
     * request. 
     */
    public fun requestParameters(requestParameters: Map<String, String>)

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
     * @param requestTemplates A map of Apache Velocity templates that are applied on the request
     * payload. 
     */
    public fun requestTemplates(requestTemplates: Map<String, String>)

    /**
     * The maximum amount of time an integration will run before it returns without a response.
     *
     * Must be between 50 milliseconds and 29 seconds.
     *
     * Default: Duration.seconds(29)
     *
     * @param timeout The maximum amount of time an integration will run before it returns without a
     * response. 
     */
    public fun timeout(timeout: Duration)

    /**
     * The VpcLink used for the integration.
     *
     * Required if connectionType is VPC_LINK
     *
     * @param vpcLink The VpcLink used for the integration. 
     */
    public fun vpcLink(vpcLink: IVpcLink)
  }

  private class BuilderImpl(
    handler: AmazonAwscdkServicesLambdaIFunction,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.LambdaIntegration.Builder =
        software.amazon.awscdk.services.apigateway.LambdaIntegration.Builder.create(handler)

    /**
     * Allow invoking method from AWS Console UI (for testing purposes).
     *
     * This will add another permission to the AWS Lambda resource policy which
     * will allow the `test-invoke-stage` stage to invoke this handler. If this
     * is set to `false`, the function will only be usable from the deployment
     * endpoint.
     *
     * Default: true
     *
     * @param allowTestInvoke Allow invoking method from AWS Console UI (for testing purposes). 
     */
    override fun allowTestInvoke(allowTestInvoke: Boolean) {
      cdkBuilder.allowTestInvoke(allowTestInvoke)
    }

    /**
     * A list of request parameters whose values are to be cached.
     *
     * It determines
     * request parameters that will make it into the cache key.
     *
     * @param cacheKeyParameters A list of request parameters whose values are to be cached. 
     */
    override fun cacheKeyParameters(cacheKeyParameters: List<String>) {
      cdkBuilder.cacheKeyParameters(cacheKeyParameters)
    }

    /**
     * A list of request parameters whose values are to be cached.
     *
     * It determines
     * request parameters that will make it into the cache key.
     *
     * @param cacheKeyParameters A list of request parameters whose values are to be cached. 
     */
    override fun cacheKeyParameters(vararg cacheKeyParameters: String): Unit =
        cacheKeyParameters(cacheKeyParameters.toList())

    /**
     * An API-specific tag group of related cached parameters.
     *
     * @param cacheNamespace An API-specific tag group of related cached parameters. 
     */
    override fun cacheNamespace(cacheNamespace: String) {
      cdkBuilder.cacheNamespace(cacheNamespace)
    }

    /**
     * The type of network connection to the integration endpoint.
     *
     * Default: - ConnectionType.VPC_LINK if `vpcLink` property is configured;
     * ConnectionType.Internet otherwise.
     *
     * @param connectionType The type of network connection to the integration endpoint. 
     */
    override fun connectionType(connectionType: ConnectionType) {
      cdkBuilder.connectionType(connectionType.let(ConnectionType.Companion::unwrap))
    }

    /**
     * Specifies how to handle request payload content type conversions.
     *
     * Default: none if this property isn't defined, the request payload is passed
     * through from the method request to the integration request without
     * modification, provided that the `passthroughBehaviors` property is
     * configured to support payload pass-through.
     *
     * @param contentHandling Specifies how to handle request payload content type conversions. 
     */
    override fun contentHandling(contentHandling: ContentHandling) {
      cdkBuilder.contentHandling(contentHandling.let(ContentHandling.Companion::unwrap))
    }

    /**
     * Requires that the caller's identity be passed through from the request.
     *
     * Default: Caller identity is not passed through
     *
     * @param credentialsPassthrough Requires that the caller's identity be passed through from the
     * request. 
     */
    override fun credentialsPassthrough(credentialsPassthrough: Boolean) {
      cdkBuilder.credentialsPassthrough(credentialsPassthrough)
    }

    /**
     * An IAM role that API Gateway assumes.
     *
     * Mutually exclusive with `credentialsPassThrough`.
     *
     * Default: A role is not assumed
     *
     * @param credentialsRole An IAM role that API Gateway assumes. 
     */
    override fun credentialsRole(credentialsRole: IRole) {
      cdkBuilder.credentialsRole(credentialsRole.let(IRole.Companion::unwrap))
    }

    /**
     * The response that API Gateway provides after a method's backend completes processing a
     * request.
     *
     * API Gateway intercepts the response from the
     * backend so that you can control how API Gateway surfaces backend
     * responses. For example, you can map the backend status codes to codes
     * that you define.
     *
     * @param integrationResponses The response that API Gateway provides after a method's backend
     * completes processing a request. 
     */
    override fun integrationResponses(integrationResponses: List<IntegrationResponse>) {
      cdkBuilder.integrationResponses(integrationResponses.map(IntegrationResponse.Companion::unwrap))
    }

    /**
     * The response that API Gateway provides after a method's backend completes processing a
     * request.
     *
     * API Gateway intercepts the response from the
     * backend so that you can control how API Gateway surfaces backend
     * responses. For example, you can map the backend status codes to codes
     * that you define.
     *
     * @param integrationResponses The response that API Gateway provides after a method's backend
     * completes processing a request. 
     */
    override fun integrationResponses(vararg integrationResponses: IntegrationResponse): Unit =
        integrationResponses(integrationResponses.toList())

    /**
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in
     * the request, and the available mapping templates specified as the requestTemplates property on
     * the Integration resource.
     *
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER.
     *
     * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
     * the Content-Type header in the request, and the available mapping templates specified as the
     * requestTemplates property on the Integration resource. 
     */
    override fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
      cdkBuilder.passthroughBehavior(passthroughBehavior.let(PassthroughBehavior.Companion::unwrap))
    }

    /**
     * Use proxy integration or normal (request/response mapping) integration.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-lambda-proxy-integrations.html#api-gateway-simple-proxy-for-lambda-output-format)
     * @param proxy Use proxy integration or normal (request/response mapping) integration. 
     */
    override fun proxy(proxy: Boolean) {
      cdkBuilder.proxy(proxy)
    }

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
     *
     * @param requestParameters The request parameters that API Gateway sends with the backend
     * request. 
     */
    override fun requestParameters(requestParameters: Map<String, String>) {
      cdkBuilder.requestParameters(requestParameters)
    }

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
     * @param requestTemplates A map of Apache Velocity templates that are applied on the request
     * payload. 
     */
    override fun requestTemplates(requestTemplates: Map<String, String>) {
      cdkBuilder.requestTemplates(requestTemplates)
    }

    /**
     * The maximum amount of time an integration will run before it returns without a response.
     *
     * Must be between 50 milliseconds and 29 seconds.
     *
     * Default: Duration.seconds(29)
     *
     * @param timeout The maximum amount of time an integration will run before it returns without a
     * response. 
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * The VpcLink used for the integration.
     *
     * Required if connectionType is VPC_LINK
     *
     * @param vpcLink The VpcLink used for the integration. 
     */
    override fun vpcLink(vpcLink: IVpcLink) {
      cdkBuilder.vpcLink(vpcLink.let(IVpcLink.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.LambdaIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(handler: CloudshiftdevAwscdkServicesLambdaIFunction,
        block: Builder.() -> Unit = {}): LambdaIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesLambdaIFunction.unwrap(handler))
      return LambdaIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.LambdaIntegration):
        LambdaIntegration = LambdaIntegration(cdkObject)

    internal fun unwrap(wrapped: LambdaIntegration):
        software.amazon.awscdk.services.apigateway.LambdaIntegration = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.LambdaIntegration
  }
}
