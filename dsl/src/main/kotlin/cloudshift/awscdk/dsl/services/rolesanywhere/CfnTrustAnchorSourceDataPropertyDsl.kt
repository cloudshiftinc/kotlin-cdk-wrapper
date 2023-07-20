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

package cloudshift.awscdk.dsl.services.rolesanywhere

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor
import kotlin.String

@CdkDslMarker
public class CfnTrustAnchorSourceDataPropertyDsl {
    private val cdkBuilder: CfnTrustAnchor.SourceDataProperty.Builder =
        CfnTrustAnchor.SourceDataProperty.builder()

    public fun acmPcaArn(acmPcaArn: String) {
        cdkBuilder.acmPcaArn(acmPcaArn)
    }

    public fun x509CertificateData(x509CertificateData: String) {
        cdkBuilder.x509CertificateData(x509CertificateData)
    }

    public fun build(): CfnTrustAnchor.SourceDataProperty = cdkBuilder.build()
}
