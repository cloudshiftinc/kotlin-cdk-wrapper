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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appflow.CfnConnectorProfile
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnConnectorProfileOAuthPropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.OAuthPropertiesProperty.Builder =
        CfnConnectorProfile.OAuthPropertiesProperty.builder()

    private val _oAuthScopes: MutableList<String> = mutableListOf()

    public fun authCodeUrl(authCodeUrl: String) {
        cdkBuilder.authCodeUrl(authCodeUrl)
    }

    public fun oAuthScopes(vararg oAuthScopes: String) {
        _oAuthScopes.addAll(listOf(*oAuthScopes))
    }

    public fun oAuthScopes(oAuthScopes: Collection<String>) {
        _oAuthScopes.addAll(oAuthScopes)
    }

    public fun tokenUrl(tokenUrl: String) {
        cdkBuilder.tokenUrl(tokenUrl)
    }

    public fun build(): CfnConnectorProfile.OAuthPropertiesProperty {
        if (_oAuthScopes.isNotEmpty()) cdkBuilder.oAuthScopes(_oAuthScopes)
        return cdkBuilder.build()
    }
}
