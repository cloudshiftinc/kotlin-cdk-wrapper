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
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.IUserPoolClient

/**
 * Authorize Http Api routes on whether the requester is registered as part of an AWS Cognito user
 * pool.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.cognito.*;
 * import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer;
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration;
 * UserPool userPool = new UserPool(this, "UserPool");
 * HttpUserPoolAuthorizer authorizer = new HttpUserPoolAuthorizer("BooksAuthorizer", userPool);
 * HttpApi api = new HttpApi(this, "HttpApi");
 * api.addRoutes(AddRoutesOptions.builder()
 * .integration(new HttpUrlIntegration("BooksIntegration", "https://get-books-proxy.example.com"))
 * .path("/books")
 * .authorizer(authorizer)
 * .build());
 * ```
 */
@CdkDslMarker
public class HttpUserPoolAuthorizerDsl(
    id: String,
    pool: IUserPool,
) {
    private val cdkBuilder: HttpUserPoolAuthorizer.Builder =
        HttpUserPoolAuthorizer.Builder.create(id, pool)

    private val _identitySource: MutableList<String> = mutableListOf()

    private val _userPoolClients: MutableList<IUserPoolClient> = mutableListOf()

    /**
     * Friendly name of the authorizer.
     *
     * Default: - same value as `id` passed in the constructor
     *
     * @param authorizerName Friendly name of the authorizer.
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
     * The user pool clients that should be used to authorize requests with the user pool.
     *
     * Default: - a new client will be created for the given user pool
     *
     * @param userPoolClients The user pool clients that should be used to authorize requests with
     *   the user pool.
     */
    public fun userPoolClients(vararg userPoolClients: IUserPoolClient) {
        _userPoolClients.addAll(listOf(*userPoolClients))
    }

    /**
     * The user pool clients that should be used to authorize requests with the user pool.
     *
     * Default: - a new client will be created for the given user pool
     *
     * @param userPoolClients The user pool clients that should be used to authorize requests with
     *   the user pool.
     */
    public fun userPoolClients(userPoolClients: Collection<IUserPoolClient>) {
        _userPoolClients.addAll(userPoolClients)
    }

    /**
     * The AWS region in which the user pool is present.
     *
     * Default: - same region as the Route the authorizer is attached to.
     *
     * @param userPoolRegion The AWS region in which the user pool is present.
     */
    public fun userPoolRegion(userPoolRegion: String) {
        cdkBuilder.userPoolRegion(userPoolRegion)
    }

    public fun build(): HttpUserPoolAuthorizer {
        if (_identitySource.isNotEmpty()) cdkBuilder.identitySource(_identitySource)
        if (_userPoolClients.isNotEmpty()) cdkBuilder.userPoolClients(_userPoolClients)
        return cdkBuilder.build()
    }
}
