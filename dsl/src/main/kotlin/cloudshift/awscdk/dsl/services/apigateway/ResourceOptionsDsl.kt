@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.CorsOptions
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.MethodOptions
import software.amazon.awscdk.services.apigateway.ResourceOptions
import kotlin.Unit

@CdkDslMarker
public class ResourceOptionsDsl {
    private val cdkBuilder: ResourceOptions.Builder = ResourceOptions.builder()

    public fun defaultCorsPreflightOptions(block: CorsOptionsDsl.() -> Unit = {}) {
        val builder = CorsOptionsDsl()
        builder.apply(block)
        cdkBuilder.defaultCorsPreflightOptions(builder.build())
    }

    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
        cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions)
    }

    public fun defaultIntegration(block: IntegrationDsl.() -> Unit = {}) {
        val builder = IntegrationDsl()
        builder.apply(block)
        cdkBuilder.defaultIntegration(builder.build())
    }

    public fun defaultIntegration(defaultIntegration: Integration) {
        cdkBuilder.defaultIntegration(defaultIntegration)
    }

    public fun defaultMethodOptions(block: MethodOptionsDsl.() -> Unit = {}) {
        val builder = MethodOptionsDsl()
        builder.apply(block)
        cdkBuilder.defaultMethodOptions(builder.build())
    }

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
        cdkBuilder.defaultMethodOptions(defaultMethodOptions)
    }

    public fun build(): ResourceOptions = cdkBuilder.build()
}
