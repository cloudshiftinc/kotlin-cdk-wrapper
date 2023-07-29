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
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CorsOptions
import software.amazon.awscdk.services.apigateway.IResource
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.MethodOptions
import software.amazon.awscdk.services.apigateway.ProxyResource
import software.constructs.Construct

/**
 * Defines a {proxy+} greedy resource and an ANY method on a route.
 *
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
 *
 * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-set-up-simple-proxy.html)
 */
@CdkDslMarker
public class ProxyResourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ProxyResource.Builder = ProxyResource.Builder.create(scope, id)

    /**
     * Adds an "ANY" method to this resource.
     *
     * If set to `false`, you will have to explicitly add methods to this resource after it's
     * created.
     *
     * Default: true
     *
     * @param anyMethod Adds an "ANY" method to this resource.
     */
    public fun anyMethod(anyMethod: Boolean) {
        cdkBuilder.anyMethod(anyMethod)
    }

    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     *
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     *   all child resources.
     */
    public fun defaultCorsPreflightOptions(
        defaultCorsPreflightOptions: CorsOptionsDsl.() -> Unit = {}
    ) {
        val builder = CorsOptionsDsl()
        builder.apply(defaultCorsPreflightOptions)
        cdkBuilder.defaultCorsPreflightOptions(builder.build())
    }

    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     *
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     *   all child resources.
     */
    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
        cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions)
    }

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultIntegration An integration to use as a default for all methods created within
     *   this API unless an integration is specified.
     */
    public fun defaultIntegration(defaultIntegration: IntegrationDsl.() -> Unit = {}) {
        val builder = IntegrationDsl()
        builder.apply(defaultIntegration)
        cdkBuilder.defaultIntegration(builder.build())
    }

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultIntegration An integration to use as a default for all methods created within
     *   this API unless an integration is specified.
     */
    public fun defaultIntegration(defaultIntegration: Integration) {
        cdkBuilder.defaultIntegration(defaultIntegration)
    }

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     *   this API unless custom options are specified.
     */
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptionsDsl.() -> Unit = {}) {
        val builder = MethodOptionsDsl()
        builder.apply(defaultMethodOptions)
        cdkBuilder.defaultMethodOptions(builder.build())
    }

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     *
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     *   this API unless custom options are specified.
     */
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
        cdkBuilder.defaultMethodOptions(defaultMethodOptions)
    }

    /**
     * The parent resource of this resource.
     *
     * You can either pass another `Resource` object or a `RestApi` object here.
     *
     * @param parent The parent resource of this resource.
     */
    public fun parent(parent: IResource) {
        cdkBuilder.parent(parent)
    }

    public fun build(): ProxyResource = cdkBuilder.build()
}
