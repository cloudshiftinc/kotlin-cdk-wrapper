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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.apigatewayv2.IWebSocketApi
import software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior
import software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration
import software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationType
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

/**
 * The integration for an API route.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * import software.amazon.awscdk.services.iam.*;
 * Role role;
 * WebSocketApi webSocketApi;
 * WebSocketIntegration webSocketIntegration = WebSocketIntegration.Builder.create(this,
 * "MyWebSocketIntegration")
 * .integrationType(WebSocketIntegrationType.AWS_PROXY)
 * .integrationUri("integrationUri")
 * .webSocketApi(webSocketApi)
 * // the properties below are optional
 * .credentialsRole(role)
 * .integrationMethod("integrationMethod")
 * .passthroughBehavior(PassthroughBehavior.WHEN_NO_MATCH)
 * .requestParameters(Map.of(
 * "requestParametersKey", "requestParameters"))
 * .requestTemplates(Map.of(
 * "requestTemplatesKey", "requestTemplates"))
 * .templateSelectionExpression("templateSelectionExpression")
 * .build();
 * ```
 */
@CdkDslMarker
public class WebSocketIntegrationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: WebSocketIntegration.Builder =
        WebSocketIntegration.Builder.create(scope, id)

    /**
     * Specifies the IAM role required for the integration.
     *
     * Default: - No IAM role required.
     *
     * @param credentialsRole Specifies the IAM role required for the integration.
     */
    public fun credentialsRole(credentialsRole: IRole) {
        cdkBuilder.credentialsRole(credentialsRole)
    }

    /**
     * Specifies the integration's HTTP method type.
     *
     * Default: - No HTTP method required.
     *
     * @param integrationMethod Specifies the integration's HTTP method type.
     */
    public fun integrationMethod(integrationMethod: String) {
        cdkBuilder.integrationMethod(integrationMethod)
    }

    /**
     * Integration type.
     *
     * @param integrationType Integration type.
     */
    public fun integrationType(integrationType: WebSocketIntegrationType) {
        cdkBuilder.integrationType(integrationType)
    }

    /**
     * Integration URI.
     *
     * @param integrationUri Integration URI.
     */
    public fun integrationUri(integrationUri: String) {
        cdkBuilder.integrationUri(integrationUri)
    }

    /**
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in
     * the request, and the available mapping templates specified as the requestTemplates property
     * on the Integration resource.
     *
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER.
     *
     * Default: - No passthrough behavior required.
     *
     * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
     *   the Content-Type header in the request, and the available mapping templates specified as
     *   the requestTemplates property on the Integration resource.
     */
    public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
        cdkBuilder.passthroughBehavior(passthroughBehavior)
    }

    /**
     * The request parameters that API Gateway sends with the backend request.
     *
     * Specify request parameters as key-value pairs (string-to-string mappings), with a destination
     * as the key and a source as the value.
     *
     * Default: - No request parameters required.
     *
     * @param requestParameters The request parameters that API Gateway sends with the backend
     *   request.
     */
    public fun requestParameters(requestParameters: Map<String, String>) {
        cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * A map of Apache Velocity templates that are applied on the request payload.
     *
     * ```
     * { "application/json": "{ \"statusCode\": 200 }" }
     * ```
     *
     * Default: - No request templates required.
     *
     * @param requestTemplates A map of Apache Velocity templates that are applied on the request
     *   payload.
     */
    public fun requestTemplates(requestTemplates: Map<String, String>) {
        cdkBuilder.requestTemplates(requestTemplates)
    }

    /**
     * The template selection expression for the integration.
     *
     * Default: - No template selection expression required.
     *
     * @param templateSelectionExpression The template selection expression for the integration.
     */
    public fun templateSelectionExpression(templateSelectionExpression: String) {
        cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    /**
     * The WebSocket API to which this integration should be bound.
     *
     * @param webSocketApi The WebSocket API to which this integration should be bound.
     */
    public fun webSocketApi(webSocketApi: IWebSocketApi) {
        cdkBuilder.webSocketApi(webSocketApi)
    }

    public fun build(): WebSocketIntegration = cdkBuilder.build()
}
