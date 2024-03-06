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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig

/**
 * Results of binding an authorizer to an http route.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * HttpRouteAuthorizerConfig httpRouteAuthorizerConfig = HttpRouteAuthorizerConfig.builder()
 * .authorizationType("authorizationType")
 * // the properties below are optional
 * .authorizationScopes(List.of("authorizationScopes"))
 * .authorizerId("authorizerId")
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpRouteAuthorizerConfigDsl {
    private val cdkBuilder: HttpRouteAuthorizerConfig.Builder = HttpRouteAuthorizerConfig.builder()

    private val _authorizationScopes: MutableList<String> = mutableListOf()

    /** @param authorizationScopes The list of OIDC scopes to include in the authorization. */
    public fun authorizationScopes(vararg authorizationScopes: String) {
        _authorizationScopes.addAll(listOf(*authorizationScopes))
    }

    /** @param authorizationScopes The list of OIDC scopes to include in the authorization. */
    public fun authorizationScopes(authorizationScopes: Collection<String>) {
        _authorizationScopes.addAll(authorizationScopes)
    }

    /**
     * @param authorizationType The type of authorization. Possible values are:
     * * AWS_IAM - IAM Authorizer
     * * JWT - JSON Web Token Authorizer
     * * CUSTOM - Lambda Authorizer
     * * NONE - No Authorization
     */
    public fun authorizationType(authorizationType: String) {
        cdkBuilder.authorizationType(authorizationType)
    }

    /** @param authorizerId The authorizer id. */
    public fun authorizerId(authorizerId: String) {
        cdkBuilder.authorizerId(authorizerId)
    }

    public fun build(): HttpRouteAuthorizerConfig {
        if (_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
        return cdkBuilder.build()
    }
}
