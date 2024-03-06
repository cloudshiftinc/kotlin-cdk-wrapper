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
import software.amazon.awscdk.services.apigatewayv2.HttpStage
import software.amazon.awscdk.services.apigatewayv2.IHttpApi
import software.amazon.awscdk.services.apigatewayv2.ThrottleSettings
import software.constructs.Construct

/**
 * Represents a stage where an instance of the API is deployed.
 *
 * Example:
 * ```
 * HttpApi api;
 * HttpStage.Builder.create(this, "Stage")
 * .httpApi(api)
 * .stageName("beta")
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpStageDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: HttpStage.Builder = HttpStage.Builder.create(scope, id)

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
     * The HTTP API to which this stage is associated.
     *
     * @param httpApi The HTTP API to which this stage is associated.
     */
    public fun httpApi(httpApi: IHttpApi) {
        cdkBuilder.httpApi(httpApi)
    }

    /**
     * The name of the stage.
     *
     * See `StageName` class for more details.
     *
     * Default: '$default' the default stage of the API. This stage will have the URL at the root of
     * the API endpoint.
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

    public fun build(): HttpStage = cdkBuilder.build()
}
