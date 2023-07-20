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
public class CfnConnectorProfileVeevaConnectorProfileCredentialsPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty.Builder =
        CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty.builder()

    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty =
        cdkBuilder.build()
}
