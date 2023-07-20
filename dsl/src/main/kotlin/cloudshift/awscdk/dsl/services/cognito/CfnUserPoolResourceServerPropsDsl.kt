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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnUserPoolResourceServerPropsDsl {
    private val cdkBuilder: CfnUserPoolResourceServerProps.Builder =
        CfnUserPoolResourceServerProps.builder()

    private val _scopes: MutableList<Any> = mutableListOf()

    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun scopes(vararg scopes: Any) {
        _scopes.addAll(listOf(*scopes))
    }

    public fun scopes(scopes: Collection<Any>) {
        _scopes.addAll(scopes)
    }

    public fun scopes(scopes: IResolvable) {
        cdkBuilder.scopes(scopes)
    }

    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnUserPoolResourceServerProps {
        if (_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
        return cdkBuilder.build()
    }
}
