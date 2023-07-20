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

@CdkDslMarker
public class CfnConnectorProfileApiKeyCredentialsPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.ApiKeyCredentialsProperty.Builder =
        CfnConnectorProfile.ApiKeyCredentialsProperty.builder()

    public fun apiKey(apiKey: String) {
        cdkBuilder.apiKey(apiKey)
    }

    public fun apiSecretKey(apiSecretKey: String) {
        cdkBuilder.apiSecretKey(apiSecretKey)
    }

    public fun build(): CfnConnectorProfile.ApiKeyCredentialsProperty = cdkBuilder.build()
}
