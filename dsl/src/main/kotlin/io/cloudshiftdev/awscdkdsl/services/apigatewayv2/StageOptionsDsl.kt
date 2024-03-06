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
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions
import software.amazon.awscdk.services.apigatewayv2.StageOptions
import software.amazon.awscdk.services.apigatewayv2.ThrottleSettings

/**
 * Options required to create a new stage.
 *
 * Options that are common between HTTP and Websocket APIs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * DomainName domainName;
 * StageOptions stageOptions = StageOptions.builder()
 * .autoDeploy(false)
 * .domainMapping(DomainMappingOptions.builder()
 * .domainName(domainName)
 * // the properties below are optional
 * .mappingKey("mappingKey")
 * .build())
 * .throttle(ThrottleSettings.builder()
 * .burstLimit(123)
 * .rateLimit(123)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class StageOptionsDsl {
    private val cdkBuilder: StageOptions.Builder = StageOptions.builder()

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

    public fun build(): StageOptions = cdkBuilder.build()
}
