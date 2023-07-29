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

package cloudshift.awscdk.dsl.services.rolesanywhere

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor

/**
 * The data field of the trust anchor depending on its type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rolesanywhere.*;
 * SourceDataProperty sourceDataProperty = SourceDataProperty.builder()
 * .acmPcaArn("acmPcaArn")
 * .x509CertificateData("x509CertificateData")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-sourcedata.html)
 */
@CdkDslMarker
public class CfnTrustAnchorSourceDataPropertyDsl {
    private val cdkBuilder: CfnTrustAnchor.SourceDataProperty.Builder =
        CfnTrustAnchor.SourceDataProperty.builder()

    /**
     * @param acmPcaArn The root certificate of the AWS Private Certificate Authority specified by
     *   this ARN is used in trust validation for temporary credential requests. Included for trust
     *   anchors of type `AWS_ACM_PCA` .
     *
     * This field is not supported in your region.
     */
    public fun acmPcaArn(acmPcaArn: String) {
        cdkBuilder.acmPcaArn(acmPcaArn)
    }

    /**
     * @param x509CertificateData The PEM-encoded data for the certificate anchor. Included for
     *   trust anchors of type `CERTIFICATE_BUNDLE` .
     */
    public fun x509CertificateData(x509CertificateData: String) {
        cdkBuilder.x509CertificateData(x509CertificateData)
    }

    public fun build(): CfnTrustAnchor.SourceDataProperty = cdkBuilder.build()
}
