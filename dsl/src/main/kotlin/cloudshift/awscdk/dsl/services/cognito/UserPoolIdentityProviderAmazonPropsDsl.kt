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
import software.amazon.awscdk.services.cognito.AttributeMapping
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class UserPoolIdentityProviderAmazonPropsDsl {
    private val cdkBuilder: UserPoolIdentityProviderAmazonProps.Builder =
        UserPoolIdentityProviderAmazonProps.builder()

    private val _scopes: MutableList<String> = mutableListOf()

    public fun attributeMapping(block: AttributeMappingDsl.() -> Unit = {}) {
        val builder = AttributeMappingDsl()
        builder.apply(block)
        cdkBuilder.attributeMapping(builder.build())
    }

    public fun attributeMapping(attributeMapping: AttributeMapping) {
        cdkBuilder.attributeMapping(attributeMapping)
    }

    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    public fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
    }

    public fun scopes(vararg scopes: String) {
        _scopes.addAll(listOf(*scopes))
    }

    public fun scopes(scopes: Collection<String>) {
        _scopes.addAll(scopes)
    }

    public fun userPool(userPool: IUserPool) {
        cdkBuilder.userPool(userPool)
    }

    public fun build(): UserPoolIdentityProviderAmazonProps {
        if (_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
        return cdkBuilder.build()
    }
}
