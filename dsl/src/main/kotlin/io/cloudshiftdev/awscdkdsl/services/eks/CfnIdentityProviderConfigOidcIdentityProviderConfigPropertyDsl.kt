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

package io.cloudshiftdev.awscdkdsl.services.eks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig

/**
 * An object representing the configuration for an OpenID Connect (OIDC) identity provider.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * OidcIdentityProviderConfigProperty oidcIdentityProviderConfigProperty =
 * OidcIdentityProviderConfigProperty.builder()
 * .clientId("clientId")
 * .issuerUrl("issuerUrl")
 * // the properties below are optional
 * .groupsClaim("groupsClaim")
 * .groupsPrefix("groupsPrefix")
 * .requiredClaims(List.of(RequiredClaimProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .usernameClaim("usernameClaim")
 * .usernamePrefix("usernamePrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html)
 */
@CdkDslMarker
public class CfnIdentityProviderConfigOidcIdentityProviderConfigPropertyDsl {
    private val cdkBuilder: CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty.Builder =
        CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty.builder()

    private val _requiredClaims: MutableList<Any> = mutableListOf()

    /**
     * @param clientId This is also known as *audience* . The ID of the client application that
     *   makes authentication requests to the OIDC identity provider.
     */
    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    /**
     * @param groupsClaim The JSON web token (JWT) claim that the provider uses to return your
     *   groups.
     */
    public fun groupsClaim(groupsClaim: String) {
        cdkBuilder.groupsClaim(groupsClaim)
    }

    /**
     * @param groupsPrefix The prefix that is prepended to group claims to prevent clashes with
     *   existing names (such as `system:` groups). For example, the value `oidc:` creates group
     *   names like `oidc:engineering` and `oidc:infra` . The prefix can't contain `system:`
     */
    public fun groupsPrefix(groupsPrefix: String) {
        cdkBuilder.groupsPrefix(groupsPrefix)
    }

    /**
     * @param issuerUrl The URL of the OIDC identity provider that allows the API server to discover
     *   public signing keys for verifying tokens.
     */
    public fun issuerUrl(issuerUrl: String) {
        cdkBuilder.issuerUrl(issuerUrl)
    }

    /**
     * @param requiredClaims The key-value pairs that describe required claims in the identity
     *   token. If set, each claim is verified to be present in the token with a matching value.
     */
    public fun requiredClaims(vararg requiredClaims: Any) {
        _requiredClaims.addAll(listOf(*requiredClaims))
    }

    /**
     * @param requiredClaims The key-value pairs that describe required claims in the identity
     *   token. If set, each claim is verified to be present in the token with a matching value.
     */
    public fun requiredClaims(requiredClaims: Collection<Any>) {
        _requiredClaims.addAll(requiredClaims)
    }

    /**
     * @param requiredClaims The key-value pairs that describe required claims in the identity
     *   token. If set, each claim is verified to be present in the token with a matching value.
     */
    public fun requiredClaims(requiredClaims: IResolvable) {
        cdkBuilder.requiredClaims(requiredClaims)
    }

    /** @param usernameClaim The JSON Web token (JWT) claim that is used as the username. */
    public fun usernameClaim(usernameClaim: String) {
        cdkBuilder.usernameClaim(usernameClaim)
    }

    /**
     * @param usernamePrefix The prefix that is prepended to username claims to prevent clashes with
     *   existing names. The prefix can't contain `system:`
     */
    public fun usernamePrefix(usernamePrefix: String) {
        cdkBuilder.usernamePrefix(usernamePrefix)
    }

    public fun build(): CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty {
        if (_requiredClaims.isNotEmpty()) cdkBuilder.requiredClaims(_requiredClaims)
        return cdkBuilder.build()
    }
}
