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
import io.cloudshiftdev.awscdk.services.sagemaker.IEndpoint as CloudshiftdevAwscdkServicesSagemakerIEndpoint
import software.amazon.awscdk.services.sagemaker.IEndpoint as AmazonAwscdkServicesSagemakerIEndpoint

/**
 * Integrates an AWS Sagemaker Endpoint to an API Gateway method.
 *
 * Example:
 *
 * ```
 * Resource resource;
 * IEndpoint endpoint;
 * resource.addMethod("POST", new SagemakerIntegration(endpoint));
 * ```
 */
public open class SagemakerIntegration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.SagemakerIntegration,
) : AwsIntegration(cdkObject) {
  public constructor(endpoint: CloudshiftdevAwscdkServicesSagemakerIEndpoint) :
      this(software.amazon.awscdk.services.apigateway.SagemakerIntegration(endpoint.let(CloudshiftdevAwscdkServicesSagemakerIEndpoint::unwrap))
  )

  public constructor(endpoint: CloudshiftdevAwscdkServicesSagemakerIEndpoint,
      options: SagemakerIntegrationOptions) :
      this(software.amazon.awscdk.services.apigateway.SagemakerIntegration(endpoint.let(CloudshiftdevAwscdkServicesSagemakerIEndpoint::unwrap),
      options.let(SagemakerIntegrationOptions::unwrap))
  )

  public constructor(endpoint: CloudshiftdevAwscdkServicesSagemakerIEndpoint,
      options: SagemakerIntegrationOptions.Builder.() -> Unit) : this(endpoint,
      SagemakerIntegrationOptions(options)
  )

  /**
   * Can be overridden by subclasses to allow the integration to interact with the method being
   * integrated, access the REST API object, method ARNs, etc.
   *
   * @param method 
   */
  public override fun bind(method: Method): IntegrationConfig =
      unwrap(this).bind(method.let(Method::unwrap)).let(IntegrationConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.SagemakerIntegration].
   */
  @CdkDslMarker
  public interface Builder {
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
    endpoint: AmazonAwscdkServicesSagemakerIEndpoint,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.SagemakerIntegration.Builder
        = software.amazon.awscdk.services.apigateway.SagemakerIntegration.Builder.create(endpoint)

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
      cdkBuilder.connectionType(connectionType.let(ConnectionType::unwrap))
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
      cdkBuilder.contentHandling(contentHandling.let(ContentHandling::unwrap))
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
      cdkBuilder.credentialsRole(credentialsRole.let(IRole::unwrap))
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
      cdkBuilder.integrationResponses(integrationResponses.map(IntegrationResponse::unwrap))
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
      cdkBuilder.passthroughBehavior(passthroughBehavior.let(PassthroughBehavior::unwrap))
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
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * The VpcLink used for the integration.
     *
     * Required if connectionType is VPC_LINK
     *
     * @param vpcLink The VpcLink used for the integration. 
     */
    override fun vpcLink(vpcLink: IVpcLink) {
      cdkBuilder.vpcLink(vpcLink.let(IVpcLink::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.SagemakerIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(endpoint: CloudshiftdevAwscdkServicesSagemakerIEndpoint,
        block: Builder.() -> Unit = {}): SagemakerIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesSagemakerIEndpoint.unwrap(endpoint))
      return SagemakerIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.SagemakerIntegration):
        SagemakerIntegration = SagemakerIntegration(cdkObject)

    internal fun unwrap(wrapped: SagemakerIntegration):
        software.amazon.awscdk.services.apigateway.SagemakerIntegration = wrapped.cdkObject
  }
}
