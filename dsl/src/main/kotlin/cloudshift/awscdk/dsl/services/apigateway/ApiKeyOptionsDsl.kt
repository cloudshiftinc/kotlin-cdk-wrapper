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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ApiKeyOptions
import software.amazon.awscdk.services.apigateway.CorsOptions
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.MethodOptions

/**
 * The options for creating an API Key.
 *
 * Example:
 * ```
 * RestApi api;
 * IApiKey key = api.addApiKey("ApiKey", ApiKeyOptions.builder()
 * .apiKeyName("myApiKey1")
 * .value("MyApiKeyThatIsAtLeast20Characters")
 * .build());
 * ```
 */
@CdkDslMarker
public class ApiKeyOptionsDsl {
    private val cdkBuilder: ApiKeyOptions.Builder = ApiKeyOptions.builder()

    /**
     * @param apiKeyName A name for the API key. If you don't specify a name, AWS CloudFormation
     *   generates a unique physical ID and uses that ID for the API key name.
     */
    public fun apiKeyName(apiKeyName: String) {
        cdkBuilder.apiKeyName(apiKeyName)
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     *   all child resources. You can add CORS at the resource-level using `addCorsPreflight`.
     */
    public fun defaultCorsPreflightOptions(
        defaultCorsPreflightOptions: CorsOptionsDsl.() -> Unit = {}
    ) {
        val builder = CorsOptionsDsl()
        builder.apply(defaultCorsPreflightOptions)
        cdkBuilder.defaultCorsPreflightOptions(builder.build())
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     *   all child resources. You can add CORS at the resource-level using `addCorsPreflight`.
     */
    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
        cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions)
    }

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     *   this API unless an integration is specified.
     */
    public fun defaultIntegration(defaultIntegration: IntegrationDsl.() -> Unit = {}) {
        val builder = IntegrationDsl()
        builder.apply(defaultIntegration)
        cdkBuilder.defaultIntegration(builder.build())
    }

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     *   this API unless an integration is specified.
     */
    public fun defaultIntegration(defaultIntegration: Integration) {
        cdkBuilder.defaultIntegration(defaultIntegration)
    }

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     *   this API unless custom options are specified.
     */
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptionsDsl.() -> Unit = {}) {
        val builder = MethodOptionsDsl()
        builder.apply(defaultMethodOptions)
        cdkBuilder.defaultMethodOptions(builder.build())
    }

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     *   this API unless custom options are specified.
     */
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
        cdkBuilder.defaultMethodOptions(defaultMethodOptions)
    }

    /** @param description A description of the purpose of the API key. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param value The value of the API key. Must be at least 20 characters long. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): ApiKeyOptions = cdkBuilder.build()
}
