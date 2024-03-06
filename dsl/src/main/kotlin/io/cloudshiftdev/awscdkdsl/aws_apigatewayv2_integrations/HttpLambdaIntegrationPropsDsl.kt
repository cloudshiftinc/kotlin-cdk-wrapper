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
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegrationProps
import software.amazon.awscdk.services.apigatewayv2.ParameterMapping
import software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion

/**
 * Lambda Proxy integration properties.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.*;
 * ParameterMapping parameterMapping;
 * PayloadFormatVersion payloadFormatVersion;
 * HttpLambdaIntegrationProps httpLambdaIntegrationProps = HttpLambdaIntegrationProps.builder()
 * .parameterMapping(parameterMapping)
 * .payloadFormatVersion(payloadFormatVersion)
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpLambdaIntegrationPropsDsl {
    private val cdkBuilder: HttpLambdaIntegrationProps.Builder =
        HttpLambdaIntegrationProps.builder()

    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     *   backend.
     */
    public fun parameterMapping(parameterMapping: ParameterMapping) {
        cdkBuilder.parameterMapping(parameterMapping)
    }

    /** @param payloadFormatVersion Version of the payload sent to the lambda handler. */
    public fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion) {
        cdkBuilder.payloadFormatVersion(payloadFormatVersion)
    }

    public fun build(): HttpLambdaIntegrationProps = cdkBuilder.build()
}
