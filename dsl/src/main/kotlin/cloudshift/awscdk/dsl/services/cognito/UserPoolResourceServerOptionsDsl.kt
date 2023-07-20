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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.ResourceServerScope
import software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class UserPoolResourceServerOptionsDsl {
    private val cdkBuilder: UserPoolResourceServerOptions.Builder =
        UserPoolResourceServerOptions.builder()

    private val _scopes: MutableList<ResourceServerScope> = mutableListOf()

    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    public fun scopes(scopes: ResourceServerScopeDsl.() -> Unit) {
        _scopes.add(ResourceServerScopeDsl().apply(scopes).build())
    }

    public fun scopes(scopes: Collection<ResourceServerScope>) {
        _scopes.addAll(scopes)
    }

    public fun userPoolResourceServerName(userPoolResourceServerName: String) {
        cdkBuilder.userPoolResourceServerName(userPoolResourceServerName)
    }

    public fun build(): UserPoolResourceServerOptions {
        if (_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
        return cdkBuilder.build()
    }
}
