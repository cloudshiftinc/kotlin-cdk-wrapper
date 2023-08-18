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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IResource
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.Method
import software.amazon.awscdk.services.apigateway.MethodOptions
import software.constructs.Construct

/**
 * Example:
 * ```
 * LambdaIntegration integration;
 * RestApi api = new RestApi(this, "hello-api");
 * Resource v1 = api.root.addResource("v1");
 * Resource echo = v1.addResource("echo");
 * Method echoMethod = echo.addMethod("GET", integration,
 * MethodOptions.builder().apiKeyRequired(true).build());
 * UsagePlan plan = api.addUsagePlan("UsagePlan", UsagePlanProps.builder()
 * .name("Easy")
 * .throttle(ThrottleSettings.builder()
 * .rateLimit(10)
 * .burstLimit(2)
 * .build())
 * .build());
 * IApiKey key = api.addApiKey("ApiKey");
 * plan.addApiKey(key);
 * ```
 */
@CdkDslMarker
public class MethodDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Method.Builder = Method.Builder.create(scope, id)

    /**
     * The HTTP method ("GET", "POST", "PUT", ...) that clients use to call this method.
     *
     * @param httpMethod The HTTP method ("GET", "POST", "PUT", ...) that clients use to call this
     *   method.
     */
    public fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * The backend system that the method calls when it receives a request.
     *
     * Default: - a new `MockIntegration`.
     *
     * @param integration The backend system that the method calls when it receives a request.
     */
    public fun integration(integration: IntegrationDsl.() -> Unit = {}) {
        val builder = IntegrationDsl()
        builder.apply(integration)
        cdkBuilder.integration(builder.build())
    }

    /**
     * The backend system that the method calls when it receives a request.
     *
     * Default: - a new `MockIntegration`.
     *
     * @param integration The backend system that the method calls when it receives a request.
     */
    public fun integration(integration: Integration) {
        cdkBuilder.integration(integration)
    }

    /**
     * Method options.
     *
     * Default: - No options.
     *
     * @param options Method options.
     */
    public fun options(options: MethodOptionsDsl.() -> Unit = {}) {
        val builder = MethodOptionsDsl()
        builder.apply(options)
        cdkBuilder.options(builder.build())
    }

    /**
     * Method options.
     *
     * Default: - No options.
     *
     * @param options Method options.
     */
    public fun options(options: MethodOptions) {
        cdkBuilder.options(options)
    }

    /**
     * The resource this method is associated with.
     *
     * For root resource methods, specify the `RestApi` object.
     *
     * @param resource The resource this method is associated with.
     */
    public fun resource(resource: IResource) {
        cdkBuilder.resource(resource)
    }

    public fun build(): Method = cdkBuilder.build()
}
