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
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizerProps
import software.amazon.awscdk.services.cognito.IUserPoolClient

/**
 * Properties to initialize HttpUserPoolAuthorizer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.aws_apigatewayv2_authorizers.*;
 * import software.amazon.awscdk.services.cognito.*;
 * UserPoolClient userPoolClient;
 * HttpUserPoolAuthorizerProps httpUserPoolAuthorizerProps = HttpUserPoolAuthorizerProps.builder()
 * .authorizerName("authorizerName")
 * .identitySource(List.of("identitySource"))
 * .userPoolClients(List.of(userPoolClient))
 * .userPoolRegion("userPoolRegion")
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpUserPoolAuthorizerPropsDsl {
    private val cdkBuilder: HttpUserPoolAuthorizerProps.Builder =
        HttpUserPoolAuthorizerProps.builder()

    private val _identitySource: MutableList<String> = mutableListOf()

    private val _userPoolClients: MutableList<IUserPoolClient> = mutableListOf()

    /** @param authorizerName Friendly name of the authorizer. */
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
     * @param userPoolClients The user pool clients that should be used to authorize requests with
     *   the user pool.
     */
    public fun userPoolClients(vararg userPoolClients: IUserPoolClient) {
        _userPoolClients.addAll(listOf(*userPoolClients))
    }

    /**
     * @param userPoolClients The user pool clients that should be used to authorize requests with
     *   the user pool.
     */
    public fun userPoolClients(userPoolClients: Collection<IUserPoolClient>) {
        _userPoolClients.addAll(userPoolClients)
    }

    /** @param userPoolRegion The AWS region in which the user pool is present. */
    public fun userPoolRegion(userPoolRegion: String) {
        cdkBuilder.userPoolRegion(userPoolRegion)
    }

    public fun build(): HttpUserPoolAuthorizerProps {
        if (_identitySource.isNotEmpty()) cdkBuilder.identitySource(_identitySource)
        if (_userPoolClients.isNotEmpty()) cdkBuilder.userPoolClients(_userPoolClients)
        return cdkBuilder.build()
    }
}
