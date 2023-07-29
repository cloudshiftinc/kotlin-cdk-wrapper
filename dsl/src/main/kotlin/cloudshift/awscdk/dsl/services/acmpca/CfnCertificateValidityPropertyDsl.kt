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

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificate

/**
 * Length of time for which the certificate issued by your private certificate authority (CA), or by
 * the private CA itself, is valid in days, months, or years.
 *
 * You can issue a certificate by calling the `IssueCertificate` operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * ValidityProperty validityProperty = ValidityProperty.builder()
 * .type("type")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-validity.html)
 */
@CdkDslMarker
public class CfnCertificateValidityPropertyDsl {
    private val cdkBuilder: CfnCertificate.ValidityProperty.Builder =
        CfnCertificate.ValidityProperty.builder()

    /** @param type Specifies whether the `Value` parameter represents days, months, or years. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param value A long integer interpreted according to the value of `Type` , below. */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnCertificate.ValidityProperty = cdkBuilder.build()
}
