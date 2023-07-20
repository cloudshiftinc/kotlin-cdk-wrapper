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
import software.amazon.awscdk.services.dms.CfnCertificate
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnCertificateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCertificate.Builder = CfnCertificate.Builder.create(scope, id)

    public fun certificateIdentifier(certificateIdentifier: String) {
        cdkBuilder.certificateIdentifier(certificateIdentifier)
    }

    public fun certificatePem(certificatePem: String) {
        cdkBuilder.certificatePem(certificatePem)
    }

    public fun certificateWallet(certificateWallet: String) {
        cdkBuilder.certificateWallet(certificateWallet)
    }

    public fun build(): CfnCertificate = cdkBuilder.build()
}
