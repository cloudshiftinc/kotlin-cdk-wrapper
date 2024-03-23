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
 * Options for SageMakerIntegration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Role role;
 * VpcLink vpcLink;
 * SagemakerIntegrationOptions sagemakerIntegrationOptions = SagemakerIntegrationOptions.builder()
 * .cacheKeyParameters(List.of("cacheKeyParameters"))
 * .cacheNamespace("cacheNamespace")
 * .connectionType(ConnectionType.INTERNET)
 * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
 * .credentialsPassthrough(false)
 * .credentialsRole(role)
 * .integrationResponses(List.of(IntegrationResponse.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
 * .responseParameters(Map.of(
 * "responseParametersKey", "responseParameters"))
 * .responseTemplates(Map.of(
 * "responseTemplatesKey", "responseTemplates"))
 * .selectionPattern("selectionPattern")
 * .build()))
 * .passthroughBehavior(PassthroughBehavior.WHEN_NO_MATCH)
 * .requestParameters(Map.of(
 * "requestParametersKey", "requestParameters"))
 * .requestTemplates(Map.of(
 * "requestTemplatesKey", "requestTemplates"))
 * .timeout(Duration.minutes(30))
 * .vpcLink(vpcLink)
 * .build();
 * ```
 */
public interface SagemakerIntegrationOptions : IntegrationOptions {
  /**
   * A builder for [SagemakerIntegrationOptions]
   */
  @CdkDslMarker
  public interface Builder {
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
     * Must be between 50 milliseconds and 29 seconds.
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
        software.amazon.awscdk.services.apigateway.SagemakerIntegrationOptions.Builder =
        software.amazon.awscdk.services.apigateway.SagemakerIntegrationOptions.builder()

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
      cdkBuilder.connectionType(connectionType.let(ConnectionType::unwrap))
    }

    /**
     * @param contentHandling Specifies how to handle request payload content type conversions.
     */
    override fun contentHandling(contentHandling: ContentHandling) {
      cdkBuilder.contentHandling(contentHandling.let(ContentHandling::unwrap))
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
      cdkBuilder.credentialsRole(credentialsRole.let(IRole::unwrap))
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
      cdkBuilder.integrationResponses(integrationResponses.map(IntegrationResponse::unwrap))
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
      cdkBuilder.passthroughBehavior(passthroughBehavior.let(PassthroughBehavior::unwrap))
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
     * Must be between 50 milliseconds and 29 seconds.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * @param vpcLink The VpcLink used for the integration.
     * Required if connectionType is VPC_LINK
     */
    override fun vpcLink(vpcLink: IVpcLink) {
      cdkBuilder.vpcLink(vpcLink.let(IVpcLink::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.SagemakerIntegrationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.SagemakerIntegrationOptions,
  ) : CdkObject(cdkObject), SagemakerIntegrationOptions {
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
     * Must be between 50 milliseconds and 29 seconds.
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
    public operator fun invoke(block: Builder.() -> Unit = {}): SagemakerIntegrationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.SagemakerIntegrationOptions):
        SagemakerIntegrationOptions = CdkObjectWrappers.wrap(cdkObject) as?
        SagemakerIntegrationOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SagemakerIntegrationOptions):
        software.amazon.awscdk.services.apigateway.SagemakerIntegrationOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.SagemakerIntegrationOptions
  }
}
