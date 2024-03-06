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
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration
import software.amazon.awscdk.services.apigatewayv2.ParameterMapping
import software.amazon.awscdk.services.apigatewayv2.PayloadFormatVersion
import software.amazon.awscdk.services.lambda.IFunction

/**
 * The Lambda Proxy integration resource for HTTP API.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration;
 * Function booksDefaultFn;
 * HttpLambdaIntegration booksIntegration = new HttpLambdaIntegration("BooksIntegration",
 * booksDefaultFn);
 * HttpApi httpApi = new HttpApi(this, "HttpApi");
 * httpApi.addRoutes(AddRoutesOptions.builder()
 * .path("/books")
 * .methods(List.of(HttpMethod.GET))
 * .integration(booksIntegration)
 * .build());
 * ```
 */
@CdkDslMarker
public class HttpLambdaIntegrationDsl(
    id: String,
    handler: IFunction,
) {
    private val cdkBuilder: HttpLambdaIntegration.Builder =
        HttpLambdaIntegration.Builder.create(id, handler)

    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * Default: undefined requests are sent to the backend unmodified
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     *
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     *   backend.
     */
    public fun parameterMapping(parameterMapping: ParameterMapping) {
        cdkBuilder.parameterMapping(parameterMapping)
    }

    /**
     * Version of the payload sent to the lambda handler.
     *
     * Default: PayloadFormatVersion.VERSION_2_0
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
     *
     * @param payloadFormatVersion Version of the payload sent to the lambda handler.
     */
    public fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion) {
        cdkBuilder.payloadFormatVersion(payloadFormatVersion)
    }

    public fun build(): HttpLambdaIntegration = cdkBuilder.build()
}
