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
import software.amazon.awscdk.services.acmpca.CfnCertificate
import kotlin.String

@CdkDslMarker
public class CfnCertificateEdiPartyNamePropertyDsl {
    private val cdkBuilder: CfnCertificate.EdiPartyNameProperty.Builder =
        CfnCertificate.EdiPartyNameProperty.builder()

    public fun nameAssigner(nameAssigner: String) {
        cdkBuilder.nameAssigner(nameAssigner)
    }

    public fun partyName(partyName: String) {
        cdkBuilder.partyName(partyName)
    }

    public fun build(): CfnCertificate.EdiPartyNameProperty = cdkBuilder.build()
}
