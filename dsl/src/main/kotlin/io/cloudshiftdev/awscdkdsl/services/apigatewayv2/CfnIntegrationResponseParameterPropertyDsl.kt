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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration

/**
 * Supported only for HTTP APIs.
 *
 * You use response parameters to transform the HTTP response from a backend integration before
 * returning the response to clients. Specify a key-value map from a selection key to response
 * parameters. The selection key must be a valid HTTP status code within the range of 200-599.
 * Response parameters are a key-value map. The key must match the pattern
 * `&lt;action&gt;:&lt;header&gt;.&lt;location&gt;` or `overwrite.statuscode` . The action can be
 * `append` , `overwrite` or `remove` . The value can be a static value, or map to response data,
 * stage variables, or context variables that are evaluated at runtime. To learn more, see
 * [Transforming API requests and responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * ResponseParameterProperty responseParameterProperty = ResponseParameterProperty.builder()
 * .destination("destination")
 * .source("source")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameter.html)
 */
@CdkDslMarker
public class CfnIntegrationResponseParameterPropertyDsl {
    private val cdkBuilder: CfnIntegration.ResponseParameterProperty.Builder =
        CfnIntegration.ResponseParameterProperty.builder()

    /**
     * @param destination Specifies the location of the response to modify, and how to modify it. To
     *   learn more, see
     *   [Transforming API requests and responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     *   .
     */
    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    /**
     * @param source Specifies the data to update the parameter with. To learn more, see
     *   [Transforming API requests and responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     *   .
     */
    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    public fun build(): CfnIntegration.ResponseParameterProperty = cdkBuilder.build()
}
