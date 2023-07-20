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
import kotlin.String

@CdkDslMarker
public class CognitoDomainOptionsDsl {
    private val cdkBuilder: CognitoDomainOptions.Builder = CognitoDomainOptions.builder()

    public fun domainPrefix(domainPrefix: String) {
        cdkBuilder.domainPrefix(domainPrefix)
    }

    public fun build(): CognitoDomainOptions = cdkBuilder.build()
}
