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
import kotlin.String
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegrationProps
import software.amazon.awscdk.services.apigatewayv2.HttpMethod
import software.amazon.awscdk.services.apigatewayv2.IVpcLink
import software.amazon.awscdk.services.apigatewayv2.ParameterMapping

/**
 * Properties to initialize `HttpNlbIntegration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.*;
 * ParameterMapping parameterMapping;
 * VpcLink vpcLink;
 * HttpNlbIntegrationProps httpNlbIntegrationProps = HttpNlbIntegrationProps.builder()
 * .method(HttpMethod.ANY)
 * .parameterMapping(parameterMapping)
 * .secureServerName("secureServerName")
 * .vpcLink(vpcLink)
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpNlbIntegrationPropsDsl {
    private val cdkBuilder: HttpNlbIntegrationProps.Builder = HttpNlbIntegrationProps.builder()

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

    /**
     * @param secureServerName Specifies the server name to verified by HTTPS when calling the
     *   backend integration.
     */
    public fun secureServerName(secureServerName: String) {
        cdkBuilder.secureServerName(secureServerName)
    }

    /** @param vpcLink The vpc link to be used for the private integration. */
    public fun vpcLink(vpcLink: IVpcLink) {
        cdkBuilder.vpcLink(vpcLink)
    }

    public fun build(): HttpNlbIntegrationProps = cdkBuilder.build()
}
