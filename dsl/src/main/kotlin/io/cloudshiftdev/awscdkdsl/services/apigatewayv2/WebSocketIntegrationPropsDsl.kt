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
import software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationProps
import software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationType
import software.amazon.awscdk.services.iam.IRole

/**
 * The integration properties.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * import software.amazon.awscdk.services.iam.*;
 * Role role;
 * WebSocketApi webSocketApi;
 * WebSocketIntegrationProps webSocketIntegrationProps = WebSocketIntegrationProps.builder()
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
public class WebSocketIntegrationPropsDsl {
    private val cdkBuilder: WebSocketIntegrationProps.Builder = WebSocketIntegrationProps.builder()

    /** @param credentialsRole Specifies the IAM role required for the integration. */
    public fun credentialsRole(credentialsRole: IRole) {
        cdkBuilder.credentialsRole(credentialsRole)
    }

    /** @param integrationMethod Specifies the integration's HTTP method type. */
    public fun integrationMethod(integrationMethod: String) {
        cdkBuilder.integrationMethod(integrationMethod)
    }

    /** @param integrationType Integration type. */
    public fun integrationType(integrationType: WebSocketIntegrationType) {
        cdkBuilder.integrationType(integrationType)
    }

    /** @param integrationUri Integration URI. */
    public fun integrationUri(integrationUri: String) {
        cdkBuilder.integrationUri(integrationUri)
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

    /**
     * @param requestParameters The request parameters that API Gateway sends with the backend
     *   request. Specify request parameters as key-value pairs (string-to-string mappings), with a
     *   destination as the key and a source as the value.
     */
    public fun requestParameters(requestParameters: Map<String, String>) {
        cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * @param requestTemplates A map of Apache Velocity templates that are applied on the request
     *   payload.
     *
     * ```
     * { "application/json": "{ \"statusCode\": 200 }" }
     * ```
     */
    public fun requestTemplates(requestTemplates: Map<String, String>) {
        cdkBuilder.requestTemplates(requestTemplates)
    }

    /** @param templateSelectionExpression The template selection expression for the integration. */
    public fun templateSelectionExpression(templateSelectionExpression: String) {
        cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    /** @param webSocketApi The WebSocket API to which this integration should be bound. */
    public fun webSocketApi(webSocketApi: IWebSocketApi) {
        cdkBuilder.webSocketApi(webSocketApi)
    }

    public fun build(): WebSocketIntegrationProps = cdkBuilder.build()
}
