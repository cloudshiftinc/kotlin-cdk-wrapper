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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate

/**
 * Information describing the end of the validity period of the certificate.
 *
 * This parameter sets the “Not After” date for the certificate. Certificate validity is the period
 * of time during which a certificate is valid. Validity can be expressed as an explicit date and
 * time when the certificate expires, or as a span of time after issuance, stated in hours, days,
 * months, or years. For more information, see Validity in RFC 5280. This value is unaffected when
 * ValidityNotBefore is also specified. For example, if Validity is set to 20 days in the future,
 * the certificate will expire 20 days from issuance time regardless of the ValidityNotBefore value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * ValidityPeriodProperty validityPeriodProperty = ValidityPeriodProperty.builder()
 * .period(123)
 * .periodType("periodType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-validityperiod.html)
 */
@CdkDslMarker
public class CfnTemplateValidityPeriodPropertyDsl {
    private val cdkBuilder: CfnTemplate.ValidityPeriodProperty.Builder =
        CfnTemplate.ValidityPeriodProperty.builder()

    /** @param period The numeric value for the validity period. */
    public fun period(period: Number) {
        cdkBuilder.period(period)
    }

    /** @param periodType The unit of time. You can select hours, days, weeks, months, and years. */
    public fun periodType(periodType: String) {
        cdkBuilder.periodType(periodType)
    }

    public fun build(): CfnTemplate.ValidityPeriodProperty = cdkBuilder.build()
}
