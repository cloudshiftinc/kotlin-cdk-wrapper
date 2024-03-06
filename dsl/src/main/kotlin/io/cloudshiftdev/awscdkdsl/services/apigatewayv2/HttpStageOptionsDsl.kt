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
import software.amazon.awscdk.services.apigatewayv2.HttpStageOptions
import software.amazon.awscdk.services.apigatewayv2.ThrottleSettings

/**
 * The options to create a new Stage for an HTTP API.
 *
 * Example:
 * ```
 * HttpApi api;
 * DomainName dn;
 * api.addStage("beta", HttpStageOptions.builder()
 * .stageName("beta")
 * .autoDeploy(true)
 * // https://${dn.domainName}/bar goes to the beta stage
 * .domainMapping(DomainMappingOptions.builder()
 * .domainName(dn)
 * .mappingKey("bar")
 * .build())
 * .build());
 * ```
 */
@CdkDslMarker
public class HttpStageOptionsDsl {
    private val cdkBuilder: HttpStageOptions.Builder = HttpStageOptions.builder()

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

    public fun build(): HttpStageOptions = cdkBuilder.build()
}
