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

package io.cloudshiftdev.awscdkdsl.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizerProps
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaResponseType

/**
 * Properties to initialize HttpTokenAuthorizer.
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
public class HttpLambdaAuthorizerPropsDsl {
    private val cdkBuilder: HttpLambdaAuthorizerProps.Builder = HttpLambdaAuthorizerProps.builder()

    private val _identitySource: MutableList<String> = mutableListOf()

    private val _responseTypes: MutableList<HttpLambdaResponseType> = mutableListOf()

    /** @param authorizerName Friendly authorizer name. */
    public fun authorizerName(authorizerName: String) {
        cdkBuilder.authorizerName(authorizerName)
    }

    /** @param identitySource The identity source for which authorization is requested. */
    public fun identitySource(vararg identitySource: String) {
        _identitySource.addAll(listOf(*identitySource))
    }

    /** @param identitySource The identity source for which authorization is requested. */
    public fun identitySource(identitySource: Collection<String>) {
        _identitySource.addAll(identitySource)
    }

    /**
     * @param responseTypes The types of responses the lambda can return. If
     *   HttpLambdaResponseType.SIMPLE is included then response format 2.0 will be used.
     */
    public fun responseTypes(vararg responseTypes: HttpLambdaResponseType) {
        _responseTypes.addAll(listOf(*responseTypes))
    }

    /**
     * @param responseTypes The types of responses the lambda can return. If
     *   HttpLambdaResponseType.SIMPLE is included then response format 2.0 will be used.
     */
    public fun responseTypes(responseTypes: Collection<HttpLambdaResponseType>) {
        _responseTypes.addAll(responseTypes)
    }

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results. Max 1 hour. Disable
     *   caching by setting this to `Duration.seconds(0)`.
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration) {
        cdkBuilder.resultsCacheTtl(resultsCacheTtl)
    }

    public fun build(): HttpLambdaAuthorizerProps {
        if (_identitySource.isNotEmpty()) cdkBuilder.identitySource(_identitySource)
        if (_responseTypes.isNotEmpty()) cdkBuilder.responseTypes(_responseTypes)
        return cdkBuilder.build()
    }
}
