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
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps
import kotlin.Unit

@CdkDslMarker
public class UserPoolIdentityProviderPropsDsl {
    private val cdkBuilder: UserPoolIdentityProviderProps.Builder =
        UserPoolIdentityProviderProps.builder()

    public fun attributeMapping(block: AttributeMappingDsl.() -> Unit = {}) {
        val builder = AttributeMappingDsl()
        builder.apply(block)
        cdkBuilder.attributeMapping(builder.build())
    }

    public fun attributeMapping(attributeMapping: AttributeMapping) {
        cdkBuilder.attributeMapping(attributeMapping)
    }

    public fun userPool(userPool: IUserPool) {
        cdkBuilder.userPool(userPool)
    }

    public fun build(): UserPoolIdentityProviderProps = cdkBuilder.build()
}
