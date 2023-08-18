@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.ConnectionType
import software.amazon.awscdk.services.apigateway.ContentHandling
import software.amazon.awscdk.services.apigateway.IVpcLink
import software.amazon.awscdk.services.apigateway.IntegrationResponse
import software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions
import software.amazon.awscdk.services.apigateway.PassthroughBehavior
import software.amazon.awscdk.services.iam.IRole

/**
 * Example:
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
@CdkDslMarker
public class LambdaIntegrationOptionsDsl {
    private val cdkBuilder: LambdaIntegrationOptions.Builder = LambdaIntegrationOptions.builder()

    private val _cacheKeyParameters: MutableList<String> = mutableListOf()

    private val _integrationResponses: MutableList<IntegrationResponse> = mutableListOf()

    /**
     * @param allowTestInvoke Allow invoking method from AWS Console UI (for testing purposes). This
     *   will add another permission to the AWS Lambda resource policy which will allow the
     *   `test-invoke-stage` stage to invoke this handler. If this is set to `false`, the function
     *   will only be usable from the deployment endpoint.
     */
    public fun allowTestInvoke(allowTestInvoke: Boolean) {
        cdkBuilder.allowTestInvoke(allowTestInvoke)
    }

    /**
     * @param cacheKeyParameters A list of request parameters whose values are to be cached. It
     *   determines request parameters that will make it into the cache key.
     */
    public fun cacheKeyParameters(vararg cacheKeyParameters: String) {
        _cacheKeyParameters.addAll(listOf(*cacheKeyParameters))
    }

    /**
     * @param cacheKeyParameters A list of request parameters whose values are to be cached. It
     *   determines request parameters that will make it into the cache key.
     */
    public fun cacheKeyParameters(cacheKeyParameters: Collection<String>) {
        _cacheKeyParameters.addAll(cacheKeyParameters)
    }

    /** @param cacheNamespace An API-specific tag group of related cached parameters. */
    public fun cacheNamespace(cacheNamespace: String) {
        cdkBuilder.cacheNamespace(cacheNamespace)
    }

    /** @param connectionType The type of network connection to the integration endpoint. */
    public fun connectionType(connectionType: ConnectionType) {
        cdkBuilder.connectionType(connectionType)
    }

    /** @param contentHandling Specifies how to handle request payload content type conversions. */
    public fun contentHandling(contentHandling: ContentHandling) {
        cdkBuilder.contentHandling(contentHandling)
    }

    /**
     * @param credentialsPassthrough Requires that the caller's identity be passed through from the
     *   request.
     */
    public fun credentialsPassthrough(credentialsPassthrough: Boolean) {
        cdkBuilder.credentialsPassthrough(credentialsPassthrough)
    }

    /**
     * @param credentialsRole An IAM role that API Gateway assumes. Mutually exclusive with
     *   `credentialsPassThrough`.
     */
    public fun credentialsRole(credentialsRole: IRole) {
        cdkBuilder.credentialsRole(credentialsRole)
    }

    /**
     * @param integrationResponses The response that API Gateway provides after a method's backend
     *   completes processing a request. API Gateway intercepts the response from the backend so
     *   that you can control how API Gateway surfaces backend responses. For example, you can map
     *   the backend status codes to codes that you define.
     */
    public fun integrationResponses(integrationResponses: IntegrationResponseDsl.() -> Unit) {
        _integrationResponses.add(IntegrationResponseDsl().apply(integrationResponses).build())
    }

    /**
     * @param integrationResponses The response that API Gateway provides after a method's backend
     *   completes processing a request. API Gateway intercepts the response from the backend so
     *   that you can control how API Gateway surfaces backend responses. For example, you can map
     *   the backend status codes to codes that you define.
     */
    public fun integrationResponses(integrationResponses: Collection<IntegrationResponse>) {
        _integrationResponses.addAll(integrationResponses)
    }

    /**
     * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
     *   the Content-Type header in the request, and the available mapping templates specified as
     *   the requestTemplates property on the Integration resource. There are three valid values:
     *   WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER.
     */
    public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
        cdkBuilder.passthroughBehavior(passthroughBehavior)
    }

    /** @param proxy Use proxy integration or normal (request/response mapping) integration. */
    public fun proxy(proxy: Boolean) {
        cdkBuilder.proxy(proxy)
    }

    /**
     * @param requestParameters The request parameters that API Gateway sends with the backend
     *   request. Specify request parameters as key-value pairs (string-to-string mappings), with a
     *   destination as the key and a source as the value.
     *
     * Specify the destination by using the following pattern integration.request.location.name,
     * where location is querystring, path, or header, and name is a valid, unique parameter name.
     *
     * The source must be an existing method request parameter or a static value. You must enclose
     * static values in single quotation marks and pre-encode these values based on their
     * destination in the request.
     */
    public fun requestParameters(requestParameters: Map<String, String>) {
        cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * @param requestTemplates A map of Apache Velocity templates that are applied on the request
     *   payload. The template that API Gateway uses is based on the value of the Content-Type
     *   header that's sent by the client. The content type value is the key, and the template is
     *   the value (specified as a string), such as the following snippet:
     * ```
     * { "application/json": "{ \"statusCode\": 200 }" }
     * ```
     */
    public fun requestTemplates(requestTemplates: Map<String, String>) {
        cdkBuilder.requestTemplates(requestTemplates)
    }

    /**
     * @param timeout The maximum amount of time an integration will run before it returns without a
     *   response. Must be between 50 milliseconds and 29 seconds.
     */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param vpcLink The VpcLink used for the integration. Required if connectionType is VPC_LINK
     */
    public fun vpcLink(vpcLink: IVpcLink) {
        cdkBuilder.vpcLink(vpcLink)
    }

    public fun build(): LambdaIntegrationOptions {
        if (_cacheKeyParameters.isNotEmpty()) cdkBuilder.cacheKeyParameters(_cacheKeyParameters)
        if (_integrationResponses.isNotEmpty())
            cdkBuilder.integrationResponses(_integrationResponses)
        return cdkBuilder.build()
    }
}
