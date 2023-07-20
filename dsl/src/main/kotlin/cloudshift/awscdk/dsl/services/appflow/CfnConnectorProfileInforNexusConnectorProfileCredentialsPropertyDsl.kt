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
public class CfnConnectorProfileInforNexusConnectorProfileCredentialsPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty.Builder =
        CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty.builder()

    public fun accessKeyId(accessKeyId: String) {
        cdkBuilder.accessKeyId(accessKeyId)
    }

    public fun datakey(datakey: String) {
        cdkBuilder.datakey(datakey)
    }

    public fun secretAccessKey(secretAccessKey: String) {
        cdkBuilder.secretAccessKey(secretAccessKey)
    }

    public fun userId(userId: String) {
        cdkBuilder.userId(userId)
    }

    public fun build(): CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty =
        cdkBuilder.build()
}
