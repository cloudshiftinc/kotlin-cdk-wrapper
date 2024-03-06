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
import software.amazon.awscdk.services.apigatewayv2.HttpStageProps
import software.amazon.awscdk.services.apigatewayv2.IHttpApi
import software.amazon.awscdk.services.apigatewayv2.ThrottleSettings

/**
 * Properties to initialize an instance of `HttpStage`.
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
public class HttpStagePropsDsl {
    private val cdkBuilder: HttpStageProps.Builder = HttpStageProps.builder()

    /** @param autoDeploy Whether updates to an API automatically trigger a new deployment. */
    public fun autoDeploy(autoDeploy: Boolean) {
        cdkBuilder.autoDeploy(autoDeploy)
    }

    /** @param domainMapping The options for custom domain and api mapping. */
    public fun domainMapping(domainMapping: DomainMappingOptionsDsl.() -> Unit = {}) {
        val builder = DomainMappingOptionsDsl()
        builder.apply(domainMapping)
        cdkBuilder.domainMapping(builder.build())
    }

    /** @param domainMapping The options for custom domain and api mapping. */
    public fun domainMapping(domainMapping: DomainMappingOptions) {
        cdkBuilder.domainMapping(domainMapping)
    }

    /** @param httpApi The HTTP API to which this stage is associated. */
    public fun httpApi(httpApi: IHttpApi) {
        cdkBuilder.httpApi(httpApi)
    }

    /** @param stageName The name of the stage. See `StageName` class for more details. */
    public fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
    }

    /** @param throttle Throttle settings for the routes of this stage. */
    public fun throttle(throttle: ThrottleSettingsDsl.() -> Unit = {}) {
        val builder = ThrottleSettingsDsl()
        builder.apply(throttle)
        cdkBuilder.throttle(builder.build())
    }

    /** @param throttle Throttle settings for the routes of this stage. */
    public fun throttle(throttle: ThrottleSettings) {
        cdkBuilder.throttle(throttle)
    }

    public fun build(): HttpStageProps = cdkBuilder.build()
}
