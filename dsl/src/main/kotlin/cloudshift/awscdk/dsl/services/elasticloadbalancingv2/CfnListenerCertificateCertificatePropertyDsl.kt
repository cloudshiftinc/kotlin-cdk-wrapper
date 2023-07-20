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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate
import kotlin.String

@CdkDslMarker
public class CfnListenerCertificateCertificatePropertyDsl {
    private val cdkBuilder: CfnListenerCertificate.CertificateProperty.Builder =
        CfnListenerCertificate.CertificateProperty.builder()

    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    public fun build(): CfnListenerCertificate.CertificateProperty = cdkBuilder.build()
}
