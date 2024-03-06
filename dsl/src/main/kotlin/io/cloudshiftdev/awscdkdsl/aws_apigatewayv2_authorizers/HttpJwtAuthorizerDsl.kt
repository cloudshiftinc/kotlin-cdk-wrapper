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
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer

/**
 * Authorize Http Api routes on whether the requester is registered as part of an AWS Cognito user
 * pool.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer;
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration;
 * String issuer = "https://test.us.auth0.com";
 * HttpJwtAuthorizer authorizer = HttpJwtAuthorizer.Builder.create("BooksAuthorizer", issuer)
 * .jwtAudience(List.of("3131231"))
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
public class HttpJwtAuthorizerDsl(
    id: String,
    jwtIssuer: String,
) {
    private val cdkBuilder: HttpJwtAuthorizer.Builder =
        HttpJwtAuthorizer.Builder.create(id, jwtIssuer)

    private val _identitySource: MutableList<String> = mutableListOf()

    private val _jwtAudience: MutableList<String> = mutableListOf()

    /**
     * The name of the authorizer.
     *
     * Default: - same value as `id` passed in the constructor
     *
     * @param authorizerName The name of the authorizer.
     */
    public fun authorizerName(authorizerName: String) {
        cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * The identity source for which authorization is requested.
     *
     * Default: ['$request.header.Authorization']
     *
     * @param identitySource The identity source for which authorization is requested.
     */
    public fun identitySource(vararg identitySource: String) {
        _identitySource.addAll(listOf(*identitySource))
    }

    /**
     * The identity source for which authorization is requested.
     *
     * Default: ['$request.header.Authorization']
     *
     * @param identitySource The identity source for which authorization is requested.
     */
    public fun identitySource(identitySource: Collection<String>) {
        _identitySource.addAll(identitySource)
    }

    /**
     * A list of the intended recipients of the JWT.
     *
     * A valid JWT must provide an aud that matches at least one entry in this list.
     *
     * @param jwtAudience A list of the intended recipients of the JWT.
     */
    public fun jwtAudience(vararg jwtAudience: String) {
        _jwtAudience.addAll(listOf(*jwtAudience))
    }

    /**
     * A list of the intended recipients of the JWT.
     *
     * A valid JWT must provide an aud that matches at least one entry in this list.
     *
     * @param jwtAudience A list of the intended recipients of the JWT.
     */
    public fun jwtAudience(jwtAudience: Collection<String>) {
        _jwtAudience.addAll(jwtAudience)
    }

    public fun build(): HttpJwtAuthorizer {
        if (_identitySource.isNotEmpty()) cdkBuilder.identitySource(_identitySource)
        if (_jwtAudience.isNotEmpty()) cdkBuilder.jwtAudience(_jwtAudience)
        return cdkBuilder.build()
    }
}
