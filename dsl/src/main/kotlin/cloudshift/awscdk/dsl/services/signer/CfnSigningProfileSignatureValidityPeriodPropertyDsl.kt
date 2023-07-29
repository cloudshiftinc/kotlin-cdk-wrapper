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

package cloudshift.awscdk.dsl.services.signer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.signer.CfnSigningProfile

/**
 * The validity period for the signing job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.signer.*;
 * SignatureValidityPeriodProperty signatureValidityPeriodProperty =
 * SignatureValidityPeriodProperty.builder()
 * .type("type")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-signer-signingprofile-signaturevalidityperiod.html)
 */
@CdkDslMarker
public class CfnSigningProfileSignatureValidityPeriodPropertyDsl {
    private val cdkBuilder: CfnSigningProfile.SignatureValidityPeriodProperty.Builder =
        CfnSigningProfile.SignatureValidityPeriodProperty.builder()

    /** @param type The time unit for signature validity: DAYS | MONTHS | YEARS. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param value The numerical value of the time unit for signature validity. */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnSigningProfile.SignatureValidityPeriodProperty = cdkBuilder.build()
}
