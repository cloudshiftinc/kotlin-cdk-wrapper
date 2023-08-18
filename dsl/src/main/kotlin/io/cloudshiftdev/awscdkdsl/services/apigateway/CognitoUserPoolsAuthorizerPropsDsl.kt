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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps
import software.amazon.awscdk.services.cognito.IUserPool

/**
 * Properties for CognitoUserPoolsAuthorizer.
 *
 * Example:
 * ```
 * Resource books;
 * UserPool userPool = new UserPool(this, "UserPool");
 * CognitoUserPoolsAuthorizer auth = CognitoUserPoolsAuthorizer.Builder.create(this,
 * "booksAuthorizer")
 * .cognitoUserPools(List.of(userPool))
 * .build();
 * books.addMethod("GET", new HttpIntegration("http://amazon.com"), MethodOptions.builder()
 * .authorizer(auth)
 * .authorizationType(AuthorizationType.COGNITO)
 * .build());
 * ```
 */
@CdkDslMarker
public class CognitoUserPoolsAuthorizerPropsDsl {
    private val cdkBuilder: CognitoUserPoolsAuthorizerProps.Builder =
        CognitoUserPoolsAuthorizerProps.builder()

    private val _cognitoUserPools: MutableList<IUserPool> = mutableListOf()

    /**
     * @param authorizerName An optional human friendly name for the authorizer. Note that, this is
     *   not the primary identifier of the authorizer.
     */
    public fun authorizerName(authorizerName: String) {
        cdkBuilder.authorizerName(authorizerName)
    }

    /** @param cognitoUserPools The user pools to associate with this authorizer. */
    public fun cognitoUserPools(vararg cognitoUserPools: IUserPool) {
        _cognitoUserPools.addAll(listOf(*cognitoUserPools))
    }

    /** @param cognitoUserPools The user pools to associate with this authorizer. */
    public fun cognitoUserPools(cognitoUserPools: Collection<IUserPool>) {
        _cognitoUserPools.addAll(cognitoUserPools)
    }

    /**
     * @param identitySource The request header mapping expression for the bearer token. This is
     *   typically passed as part of the header, in which case this should be
     *   `method.request.header.Authorizer` where Authorizer is the header containing the bearer
     *   token.
     */
    public fun identitySource(identitySource: String) {
        cdkBuilder.identitySource(identitySource)
    }

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results. Max 1 hour. Disable
     *   caching by setting this to 0.
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration) {
        cdkBuilder.resultsCacheTtl(resultsCacheTtl)
    }

    public fun build(): CognitoUserPoolsAuthorizerProps {
        if (_cognitoUserPools.isNotEmpty()) cdkBuilder.cognitoUserPools(_cognitoUserPools)
        return cdkBuilder.build()
    }
}
