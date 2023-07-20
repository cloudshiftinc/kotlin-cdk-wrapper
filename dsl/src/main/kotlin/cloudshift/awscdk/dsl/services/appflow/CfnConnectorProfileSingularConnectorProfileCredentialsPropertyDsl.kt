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
public class CfnConnectorProfileSingularConnectorProfileCredentialsPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.SingularConnectorProfileCredentialsProperty.Builder =
        CfnConnectorProfile.SingularConnectorProfileCredentialsProperty.builder()

    public fun apiKey(apiKey: String) {
        cdkBuilder.apiKey(apiKey)
    }

    public fun build(): CfnConnectorProfile.SingularConnectorProfileCredentialsProperty =
        cdkBuilder.build()
}
