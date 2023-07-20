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
import software.amazon.awscdk.services.apigateway.ApiKeyOptions
import software.amazon.awscdk.services.apigateway.CorsOptions
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.MethodOptions
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class ApiKeyOptionsDsl {
    private val cdkBuilder: ApiKeyOptions.Builder = ApiKeyOptions.builder()

    public fun apiKeyName(apiKeyName: String) {
        cdkBuilder.apiKeyName(apiKeyName)
    }

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

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): ApiKeyOptions = cdkBuilder.build()
}
