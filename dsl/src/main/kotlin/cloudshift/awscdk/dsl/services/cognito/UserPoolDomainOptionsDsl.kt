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
import software.amazon.awscdk.services.cognito.CognitoDomainOptions
import software.amazon.awscdk.services.cognito.CustomDomainOptions
import software.amazon.awscdk.services.cognito.UserPoolDomainOptions
import kotlin.Unit

@CdkDslMarker
public class UserPoolDomainOptionsDsl {
    private val cdkBuilder: UserPoolDomainOptions.Builder = UserPoolDomainOptions.builder()

    public fun cognitoDomain(block: CognitoDomainOptionsDsl.() -> Unit = {}) {
        val builder = CognitoDomainOptionsDsl()
        builder.apply(block)
        cdkBuilder.cognitoDomain(builder.build())
    }

    public fun cognitoDomain(cognitoDomain: CognitoDomainOptions) {
        cdkBuilder.cognitoDomain(cognitoDomain)
    }

    public fun customDomain(block: CustomDomainOptionsDsl.() -> Unit = {}) {
        val builder = CustomDomainOptionsDsl()
        builder.apply(block)
        cdkBuilder.customDomain(builder.build())
    }

    public fun customDomain(customDomain: CustomDomainOptions) {
        cdkBuilder.customDomain(customDomain)
    }

    public fun build(): UserPoolDomainOptions = cdkBuilder.build()
}
