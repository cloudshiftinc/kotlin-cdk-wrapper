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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.apigateway.AwsIntegrationProps
import software.amazon.awscdk.services.apigateway.IntegrationOptions

/**
 * Example:
 * ```
 * AwsIntegration getMessageIntegration = AwsIntegration.Builder.create()
 * .service("sqs")
 * .path("queueName")
 * .region("eu-west-1")
 * .build();
 * ```
 */
@CdkDslMarker
public class AwsIntegrationPropsDsl {
    private val cdkBuilder: AwsIntegrationProps.Builder = AwsIntegrationProps.builder()

    /**
     * @param action The AWS action to perform in the integration. Use `actionParams` to specify
     *   key-value params for the action.
     *
     * Mutually exclusive with `path`.
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * @param actionParameters Parameters for the action. `action` must be set, and `path` must be
     *   undefined. The action params will be URL encoded.
     */
    public fun actionParameters(actionParameters: Map<String, String>) {
        cdkBuilder.actionParameters(actionParameters)
    }

    /** @param integrationHttpMethod The integration's HTTP method type. */
    public fun integrationHttpMethod(integrationHttpMethod: String) {
        cdkBuilder.integrationHttpMethod(integrationHttpMethod)
    }

    /**
     * @param options Integration options, such as content handling, request/response mapping, etc.
     */
    public fun options(options: IntegrationOptionsDsl.() -> Unit = {}) {
        val builder = IntegrationOptionsDsl()
        builder.apply(options)
        cdkBuilder.options(builder.build())
    }

    /**
     * @param options Integration options, such as content handling, request/response mapping, etc.
     */
    public fun options(options: IntegrationOptions) {
        cdkBuilder.options(options)
    }

    /**
     * @param path The path to use for path-base APIs. For example, for S3 GET, you can set path to
     *   `bucket/key`. For lambda, you can set path to
     *   `2015-03-31/functions/${function-arn}/invocations`
     *
     * Mutually exclusive with the `action` options.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /** @param proxy Use AWS_PROXY integration. */
    public fun proxy(proxy: Boolean) {
        cdkBuilder.proxy(proxy)
    }

    /** @param region The region of the integrated AWS service. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /** @param service The name of the integrated AWS service (e.g. `s3`). */
    public fun service(service: String) {
        cdkBuilder.service(service)
    }

    /**
     * @param subdomain A designated subdomain supported by certain AWS service for fast host-name
     *   lookup.
     */
    public fun subdomain(subdomain: String) {
        cdkBuilder.subdomain(subdomain)
    }

    public fun build(): AwsIntegrationProps = cdkBuilder.build()
}
