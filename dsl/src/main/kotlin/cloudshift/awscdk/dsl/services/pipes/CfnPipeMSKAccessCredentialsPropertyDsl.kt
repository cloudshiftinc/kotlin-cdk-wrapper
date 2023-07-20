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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pipes.CfnPipe
import kotlin.String

@CdkDslMarker
public class CfnPipeMSKAccessCredentialsPropertyDsl {
    private val cdkBuilder: CfnPipe.MSKAccessCredentialsProperty.Builder =
        CfnPipe.MSKAccessCredentialsProperty.builder()

    public fun clientCertificateTlsAuth(clientCertificateTlsAuth: String) {
        cdkBuilder.clientCertificateTlsAuth(clientCertificateTlsAuth)
    }

    public fun saslScram512Auth(saslScram512Auth: String) {
        cdkBuilder.saslScram512Auth(saslScram512Auth)
    }

    public fun build(): CfnPipe.MSKAccessCredentialsProperty = cdkBuilder.build()
}
