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
import kotlin.Boolean
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CorsOptions
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.MethodOptions
import software.amazon.awscdk.services.apigateway.ProxyResourceOptions

/**
 * Example:
 * ```
 * Resource resource;
 * Function handler;
 * ProxyResource proxy = resource.addProxy(ProxyResourceOptions.builder()
 * .defaultIntegration(new LambdaIntegration(handler))
 * // "false" will require explicitly adding methods on the `proxy` resource
 * .anyMethod(true)
 * .build());
 * ```
 */
@CdkDslMarker
public class ProxyResourceOptionsDsl {
    private val cdkBuilder: ProxyResourceOptions.Builder = ProxyResourceOptions.builder()

    /**
     * @param anyMethod Adds an "ANY" method to this resource. If set to `false`, you will have to
     *   explicitly add methods to this resource after it's created.
     */
    public fun anyMethod(anyMethod: Boolean) {
        cdkBuilder.anyMethod(anyMethod)
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

    public fun build(): ProxyResourceOptions = cdkBuilder.build()
}
