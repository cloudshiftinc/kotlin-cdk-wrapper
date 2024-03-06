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

package io.cloudshiftdev.awscdkdsl.services.pcaconnectorad

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate

/**
 * Information describing the end of the validity period of the certificate.
 *
 * This parameter sets the “Not After” date for the certificate. Certificate validity is the period
 * of time during which a certificate is valid. Validity can be expressed as an explicit date and
 * time when the certificate expires, or as a span of time after issuance, stated in days, months,
 * or years. For more information, see Validity in RFC 5280. This value is unaffected when
 * ValidityNotBefore is also specified. For example, if Validity is set to 20 days in the future,
 * the certificate will expire 20 days from issuance time regardless of the ValidityNotBefore value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * CertificateValidityProperty certificateValidityProperty = CertificateValidityProperty.builder()
 * .renewalPeriod(ValidityPeriodProperty.builder()
 * .period(123)
 * .periodType("periodType")
 * .build())
 * .validityPeriod(ValidityPeriodProperty.builder()
 * .period(123)
 * .periodType("periodType")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-certificatevalidity.html)
 */
@CdkDslMarker
public class CfnTemplateCertificateValidityPropertyDsl {
    private val cdkBuilder: CfnTemplate.CertificateValidityProperty.Builder =
        CfnTemplate.CertificateValidityProperty.builder()

    /**
     * @param renewalPeriod Renewal period is the period of time before certificate expiration when
     *   a new certificate will be requested.
     */
    public fun renewalPeriod(renewalPeriod: IResolvable) {
        cdkBuilder.renewalPeriod(renewalPeriod)
    }

    /**
     * @param renewalPeriod Renewal period is the period of time before certificate expiration when
     *   a new certificate will be requested.
     */
    public fun renewalPeriod(renewalPeriod: CfnTemplate.ValidityPeriodProperty) {
        cdkBuilder.renewalPeriod(renewalPeriod)
    }

    /**
     * @param validityPeriod Information describing the end of the validity period of the
     *   certificate.
     *
     * This parameter sets the “Not After” date for the certificate. Certificate validity is the
     * period of time during which a certificate is valid. Validity can be expressed as an explicit
     * date and time when the certificate expires, or as a span of time after issuance, stated in
     * days, months, or years. For more information, see Validity in RFC 5280. This value is
     * unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20
     * days in the future, the certificate will expire 20 days from issuance time regardless of the
     * ValidityNotBefore value.
     */
    public fun validityPeriod(validityPeriod: IResolvable) {
        cdkBuilder.validityPeriod(validityPeriod)
    }

    /**
     * @param validityPeriod Information describing the end of the validity period of the
     *   certificate.
     *
     * This parameter sets the “Not After” date for the certificate. Certificate validity is the
     * period of time during which a certificate is valid. Validity can be expressed as an explicit
     * date and time when the certificate expires, or as a span of time after issuance, stated in
     * days, months, or years. For more information, see Validity in RFC 5280. This value is
     * unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20
     * days in the future, the certificate will expire 20 days from issuance time regardless of the
     * ValidityNotBefore value.
     */
    public fun validityPeriod(validityPeriod: CfnTemplate.ValidityPeriodProperty) {
        cdkBuilder.validityPeriod(validityPeriod)
    }

    public fun build(): CfnTemplate.CertificateValidityProperty = cdkBuilder.build()
}
