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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnCertificateProps
import kotlin.String

@CdkDslMarker
public class CfnCertificatePropsDsl {
    private val cdkBuilder: CfnCertificateProps.Builder = CfnCertificateProps.builder()

    public fun caCertificatePem(caCertificatePem: String) {
        cdkBuilder.caCertificatePem(caCertificatePem)
    }

    public fun certificateMode(certificateMode: String) {
        cdkBuilder.certificateMode(certificateMode)
    }

    public fun certificatePem(certificatePem: String) {
        cdkBuilder.certificatePem(certificatePem)
    }

    public fun certificateSigningRequest(certificateSigningRequest: String) {
        cdkBuilder.certificateSigningRequest(certificateSigningRequest)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnCertificateProps = cdkBuilder.build()
}
