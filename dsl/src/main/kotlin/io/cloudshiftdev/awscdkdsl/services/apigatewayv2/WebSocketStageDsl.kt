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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions
import software.amazon.awscdk.services.apigatewayv2.IWebSocketApi
import software.amazon.awscdk.services.apigatewayv2.ThrottleSettings
import software.amazon.awscdk.services.apigatewayv2.WebSocketStage
import software.constructs.Construct

/**
 * Represents a stage where an instance of the API is deployed.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
 * Function connectHandler;
 * Function disconnectHandler;
 * Function defaultHandler;
 * WebSocketApi webSocketApi = WebSocketApi.Builder.create(this, "mywsapi")
 * .connectRouteOptions(WebSocketRouteOptions.builder().integration(new
 * WebSocketLambdaIntegration("ConnectIntegration", connectHandler)).build())
 * .disconnectRouteOptions(WebSocketRouteOptions.builder().integration(new
 * WebSocketLambdaIntegration("DisconnectIntegration", disconnectHandler)).build())
 * .defaultRouteOptions(WebSocketRouteOptions.builder().integration(new
 * WebSocketLambdaIntegration("DefaultIntegration", defaultHandler)).build())
 * .build();
 * WebSocketStage.Builder.create(this, "mystage")
 * .webSocketApi(webSocketApi)
 * .stageName("dev")
 * .autoDeploy(true)
 * .build();
 * ```
 */
@CdkDslMarker
public class WebSocketStageDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: WebSocketStage.Builder = WebSocketStage.Builder.create(scope, id)

    /**
     * Whether updates to an API automatically trigger a new deployment.
     *
     * Default: false
     *
     * @param autoDeploy Whether updates to an API automatically trigger a new deployment.
     */
    public fun autoDeploy(autoDeploy: Boolean) {
        cdkBuilder.autoDeploy(autoDeploy)
    }

    /**
     * The options for custom domain and api mapping.
     *
     * Default: - no custom domain and api mapping configuration
     *
     * @param domainMapping The options for custom domain and api mapping.
     */
    public fun domainMapping(domainMapping: DomainMappingOptionsDsl.() -> Unit = {}) {
        val builder = DomainMappingOptionsDsl()
        builder.apply(domainMapping)
        cdkBuilder.domainMapping(builder.build())
    }

    /**
     * The options for custom domain and api mapping.
     *
     * Default: - no custom domain and api mapping configuration
     *
     * @param domainMapping The options for custom domain and api mapping.
     */
    public fun domainMapping(domainMapping: DomainMappingOptions) {
        cdkBuilder.domainMapping(domainMapping)
    }

    /**
     * The name of the stage.
     *
     * @param stageName The name of the stage.
     */
    public fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
    }

    /**
     * Throttle settings for the routes of this stage.
     *
     * Default: - no throttling configuration
     *
     * @param throttle Throttle settings for the routes of this stage.
     */
    public fun throttle(throttle: ThrottleSettingsDsl.() -> Unit = {}) {
        val builder = ThrottleSettingsDsl()
        builder.apply(throttle)
        cdkBuilder.throttle(builder.build())
    }

    /**
     * Throttle settings for the routes of this stage.
     *
     * Default: - no throttling configuration
     *
     * @param throttle Throttle settings for the routes of this stage.
     */
    public fun throttle(throttle: ThrottleSettings) {
        cdkBuilder.throttle(throttle)
    }

    /**
     * The WebSocket API to which this stage is associated.
     *
     * @param webSocketApi The WebSocket API to which this stage is associated.
     */
    public fun webSocketApi(webSocketApi: IWebSocketApi) {
        cdkBuilder.webSocketApi(webSocketApi)
    }

    public fun build(): WebSocketStage = cdkBuilder.build()
}
