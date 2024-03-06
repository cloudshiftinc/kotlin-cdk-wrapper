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

package io.cloudshiftdev.awscdkdsl.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegrationProps
import software.amazon.awscdk.services.apigatewayv2.HttpMethod
import software.amazon.awscdk.services.apigatewayv2.ParameterMapping

/**
 * Properties to initialize a new `HttpProxyIntegration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.*;
 * ParameterMapping parameterMapping;
 * HttpUrlIntegrationProps httpUrlIntegrationProps = HttpUrlIntegrationProps.builder()
 * .method(HttpMethod.ANY)
 * .parameterMapping(parameterMapping)
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpUrlIntegrationPropsDsl {
    private val cdkBuilder: HttpUrlIntegrationProps.Builder = HttpUrlIntegrationProps.builder()

    /** @param method The HTTP method that must be used to invoke the underlying HTTP proxy. */
    public fun method(method: HttpMethod) {
        cdkBuilder.method(method)
    }

    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     *   backend.
     */
    public fun parameterMapping(parameterMapping: ParameterMapping) {
        cdkBuilder.parameterMapping(parameterMapping)
    }

    public fun build(): HttpUrlIntegrationProps = cdkBuilder.build()
}
