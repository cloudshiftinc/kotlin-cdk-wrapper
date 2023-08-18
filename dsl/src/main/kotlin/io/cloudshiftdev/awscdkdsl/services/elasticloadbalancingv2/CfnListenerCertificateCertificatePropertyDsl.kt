@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate

/**
 * Specifies an SSL server certificate for the certificate list of a secure listener.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * CertificateProperty certificateProperty = CertificateProperty.builder()
 * .certificateArn("certificateArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenercertificate-certificate.html)
 */
@CdkDslMarker
public class CfnListenerCertificateCertificatePropertyDsl {
    private val cdkBuilder: CfnListenerCertificate.CertificateProperty.Builder =
        CfnListenerCertificate.CertificateProperty.builder()

    /** @param certificateArn The Amazon Resource Name (ARN) of the certificate. */
    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    public fun build(): CfnListenerCertificate.CertificateProperty = cdkBuilder.build()
}
