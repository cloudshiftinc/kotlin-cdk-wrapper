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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener

/**
 * Specifies an SSL server certificate to use as the default certificate for a secure listener.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-certificate.html)
 */
@CdkDslMarker
public class CfnListenerCertificatePropertyDsl {
    private val cdkBuilder: CfnListener.CertificateProperty.Builder =
        CfnListener.CertificateProperty.builder()

    /** @param certificateArn The Amazon Resource Name (ARN) of the certificate. */
    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    public fun build(): CfnListener.CertificateProperty = cdkBuilder.build()
}
