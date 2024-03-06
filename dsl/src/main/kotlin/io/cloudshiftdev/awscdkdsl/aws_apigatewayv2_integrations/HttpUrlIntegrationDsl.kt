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
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration
import software.amazon.awscdk.services.apigatewayv2.HttpMethod
import software.amazon.awscdk.services.apigatewayv2.ParameterMapping

/**
 * The HTTP Proxy integration resource for HTTP API.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizer;
 * import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaResponseType;
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration;
 * // This function handles your auth logic
 * Function authHandler;
 * HttpLambdaAuthorizer authorizer = HttpLambdaAuthorizer.Builder.create("BooksAuthorizer",
 * authHandler)
 * .responseTypes(List.of(HttpLambdaResponseType.SIMPLE))
 * .build();
 * HttpApi api = new HttpApi(this, "HttpApi");
 * api.addRoutes(AddRoutesOptions.builder()
 * .integration(new HttpUrlIntegration("BooksIntegration", "https://get-books-proxy.example.com"))
 * .path("/books")
 * .authorizer(authorizer)
 * .build());
 * ```
 */
@CdkDslMarker
public class HttpUrlIntegrationDsl(
    id: String,
    url: String,
) {
    private val cdkBuilder: HttpUrlIntegration.Builder = HttpUrlIntegration.Builder.create(id, url)

    /**
     * The HTTP method that must be used to invoke the underlying HTTP proxy.
     *
     * Default: HttpMethod.ANY
     *
     * @param method The HTTP method that must be used to invoke the underlying HTTP proxy.
     */
    public fun method(method: HttpMethod) {
        cdkBuilder.method(method)
    }

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

    public fun build(): HttpUrlIntegration = cdkBuilder.build()
}
