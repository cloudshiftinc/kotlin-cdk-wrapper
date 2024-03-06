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
import software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior
import software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationType
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig
import software.amazon.awscdk.services.iam.IRole

/**
 * Config returned back as a result of the bind.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * import software.amazon.awscdk.services.iam.*;
 * Role role;
 * WebSocketRouteIntegrationConfig webSocketRouteIntegrationConfig =
 * WebSocketRouteIntegrationConfig.builder()
 * .type(WebSocketIntegrationType.AWS_PROXY)
 * .uri("uri")
 * // the properties below are optional
 * .credentialsRole(role)
 * .method("method")
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
public class WebSocketRouteIntegrationConfigDsl {
    private val cdkBuilder: WebSocketRouteIntegrationConfig.Builder =
        WebSocketRouteIntegrationConfig.builder()

    /** @param credentialsRole Credentials role. */
    public fun credentialsRole(credentialsRole: IRole) {
        cdkBuilder.credentialsRole(credentialsRole)
    }

    /** @param method Integration method. */
    public fun method(method: String) {
        cdkBuilder.method(method)
    }

    /** @param passthroughBehavior Integration passthrough behaviors. */
    public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
        cdkBuilder.passthroughBehavior(passthroughBehavior)
    }

    /** @param requestParameters Request parameters. */
    public fun requestParameters(requestParameters: Map<String, String>) {
        cdkBuilder.requestParameters(requestParameters)
    }

    /** @param requestTemplates Request template. */
    public fun requestTemplates(requestTemplates: Map<String, String>) {
        cdkBuilder.requestTemplates(requestTemplates)
    }

    /** @param templateSelectionExpression Template selection expression. */
    public fun templateSelectionExpression(templateSelectionExpression: String) {
        cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    /** @param type Integration type. */
    public fun type(type: WebSocketIntegrationType) {
        cdkBuilder.type(type)
    }

    /** @param uri Integration URI. */
    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    public fun build(): WebSocketRouteIntegrationConfig = cdkBuilder.build()
}
