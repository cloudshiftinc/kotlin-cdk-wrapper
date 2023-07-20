@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnIdentityProviderConfigOidcIdentityProviderConfigPropertyDsl {
    private val cdkBuilder: CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty.Builder =
        CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty.builder()

    private val _requiredClaims: MutableList<Any> = mutableListOf()

    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    public fun groupsClaim(groupsClaim: String) {
        cdkBuilder.groupsClaim(groupsClaim)
    }

    public fun groupsPrefix(groupsPrefix: String) {
        cdkBuilder.groupsPrefix(groupsPrefix)
    }

    public fun issuerUrl(issuerUrl: String) {
        cdkBuilder.issuerUrl(issuerUrl)
    }

    public fun requiredClaims(vararg requiredClaims: Any) {
        _requiredClaims.addAll(listOf(*requiredClaims))
    }

    public fun requiredClaims(requiredClaims: Collection<Any>) {
        _requiredClaims.addAll(requiredClaims)
    }

    public fun requiredClaims(requiredClaims: IResolvable) {
        cdkBuilder.requiredClaims(requiredClaims)
    }

    public fun usernameClaim(usernameClaim: String) {
        cdkBuilder.usernameClaim(usernameClaim)
    }

    public fun usernamePrefix(usernamePrefix: String) {
        cdkBuilder.usernamePrefix(usernamePrefix)
    }

    public fun build(): CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty {
        if (_requiredClaims.isNotEmpty()) cdkBuilder.requiredClaims(_requiredClaims)
        return cdkBuilder.build()
    }
}
