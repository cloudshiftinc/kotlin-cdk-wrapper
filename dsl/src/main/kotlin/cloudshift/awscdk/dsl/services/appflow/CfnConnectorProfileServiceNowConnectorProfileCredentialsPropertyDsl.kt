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
public class CfnConnectorProfileServiceNowConnectorProfileCredentialsPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty.Builder =
        CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty.builder()

    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty =
        cdkBuilder.build()
}
