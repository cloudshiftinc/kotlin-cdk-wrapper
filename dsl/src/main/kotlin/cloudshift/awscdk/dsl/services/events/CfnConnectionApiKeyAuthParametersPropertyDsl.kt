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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.CfnConnection
import kotlin.String

@CdkDslMarker
public class CfnConnectionApiKeyAuthParametersPropertyDsl {
    private val cdkBuilder: CfnConnection.ApiKeyAuthParametersProperty.Builder =
        CfnConnection.ApiKeyAuthParametersProperty.builder()

    public fun apiKeyName(apiKeyName: String) {
        cdkBuilder.apiKeyName(apiKeyName)
    }

    public fun apiKeyValue(apiKeyValue: String) {
        cdkBuilder.apiKeyValue(apiKeyValue)
    }

    public fun build(): CfnConnection.ApiKeyAuthParametersProperty = cdkBuilder.build()
}
