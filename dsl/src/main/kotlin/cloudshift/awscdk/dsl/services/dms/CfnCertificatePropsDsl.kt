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

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.dms.CfnCertificateProps
import kotlin.String

@CdkDslMarker
public class CfnCertificatePropsDsl {
    private val cdkBuilder: CfnCertificateProps.Builder = CfnCertificateProps.builder()

    public fun certificateIdentifier(certificateIdentifier: String) {
        cdkBuilder.certificateIdentifier(certificateIdentifier)
    }

    public fun certificatePem(certificatePem: String) {
        cdkBuilder.certificatePem(certificatePem)
    }

    public fun certificateWallet(certificateWallet: String) {
        cdkBuilder.certificateWallet(certificateWallet)
    }

    public fun build(): CfnCertificateProps = cdkBuilder.build()
}
