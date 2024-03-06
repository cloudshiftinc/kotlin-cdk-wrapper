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

package io.cloudshiftdev.awscdkdsl.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegrationProps
import software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior
import software.amazon.awscdk.services.iam.IRole

/**
 * Props for AWS type integration for an HTTP Api.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration;
 * import software.amazon.awscdk.services.dynamodb.*;
 * import software.amazon.awscdk.services.iam.*;
 * Role apiRole;
 * Table table;
 * WebSocketApi webSocketApi = new WebSocketApi(this, "mywsapi");
 * WebSocketStage.Builder.create(this, "mystage")
 * .webSocketApi(webSocketApi)
 * .stageName("dev")
 * .autoDeploy(true)
 * .build();
 * webSocketApi.addRoute("$connect", WebSocketRouteOptions.builder()
 * .integration(WebSocketAwsIntegration.Builder.create("DynamodbPutItem")
 * .integrationUri(String.format("arn:aws:apigateway:%s:dynamodb:action/PutItem", this.region))
 * .integrationMethod(HttpMethod.POST)
 * .credentialsRole(apiRole)
 * .requestTemplates(Map.of(
 * "application/json", JSON.stringify(Map.of(
 * "TableName", table.getTableName(),
 * "Item", Map.of(
 * "id", Map.of(
 * "S", "$context.requestId"))))))
 * .build())
 * .build());
 * ```
 */
@CdkDslMarker
public class WebSocketAwsIntegrationPropsDsl {
    private val cdkBuilder: WebSocketAwsIntegrationProps.Builder =
        WebSocketAwsIntegrationProps.builder()

    /** @param credentialsRole Specifies the credentials role required for the integration. */
    public fun credentialsRole(credentialsRole: IRole) {
        cdkBuilder.credentialsRole(credentialsRole)
    }

    /** @param integrationMethod Specifies the integration's HTTP method type. */
    public fun integrationMethod(integrationMethod: String) {
        cdkBuilder.integrationMethod(integrationMethod)
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

    public fun build(): WebSocketAwsIntegrationProps = cdkBuilder.build()
}
