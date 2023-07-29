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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.OidcEndpoints

/**
 * OpenID Connect endpoints.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * OidcEndpoints oidcEndpoints = OidcEndpoints.builder()
 * .authorization("authorization")
 * .jwksUri("jwksUri")
 * .token("token")
 * .userInfo("userInfo")
 * .build();
 * ```
 */
@CdkDslMarker
public class OidcEndpointsDsl {
    private val cdkBuilder: OidcEndpoints.Builder = OidcEndpoints.builder()

    /** @param authorization Authorization endpoint. */
    public fun authorization(authorization: String) {
        cdkBuilder.authorization(authorization)
    }

    /** @param jwksUri Jwks_uri endpoint. */
    public fun jwksUri(jwksUri: String) {
        cdkBuilder.jwksUri(jwksUri)
    }

    /** @param token Token endpoint. */
    public fun token(token: String) {
        cdkBuilder.token(token)
    }

    /** @param userInfo UserInfo endpoint. */
    public fun userInfo(userInfo: String) {
        cdkBuilder.userInfo(userInfo)
    }

    public fun build(): OidcEndpoints = cdkBuilder.build()
}
