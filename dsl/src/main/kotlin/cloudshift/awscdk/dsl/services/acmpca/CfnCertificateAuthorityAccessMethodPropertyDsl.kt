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

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority
import kotlin.String

@CdkDslMarker
public class CfnCertificateAuthorityAccessMethodPropertyDsl {
    private val cdkBuilder: CfnCertificateAuthority.AccessMethodProperty.Builder =
        CfnCertificateAuthority.AccessMethodProperty.builder()

    public fun accessMethodType(accessMethodType: String) {
        cdkBuilder.accessMethodType(accessMethodType)
    }

    public fun customObjectIdentifier(customObjectIdentifier: String) {
        cdkBuilder.customObjectIdentifier(customObjectIdentifier)
    }

    public fun build(): CfnCertificateAuthority.AccessMethodProperty = cdkBuilder.build()
}
