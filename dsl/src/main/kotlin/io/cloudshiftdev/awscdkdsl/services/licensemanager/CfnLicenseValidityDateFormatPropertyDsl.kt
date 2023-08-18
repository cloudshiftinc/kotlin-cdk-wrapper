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

package io.cloudshiftdev.awscdkdsl.services.licensemanager

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.licensemanager.CfnLicense

/**
 * Date and time range during which the license is valid, in ISO8601-UTC format.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.licensemanager.*;
 * ValidityDateFormatProperty validityDateFormatProperty = ValidityDateFormatProperty.builder()
 * .begin("begin")
 * .end("end")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-validitydateformat.html)
 */
@CdkDslMarker
public class CfnLicenseValidityDateFormatPropertyDsl {
    private val cdkBuilder: CfnLicense.ValidityDateFormatProperty.Builder =
        CfnLicense.ValidityDateFormatProperty.builder()

    /** @param begin Start of the time range. */
    public fun begin(begin: String) {
        cdkBuilder.begin(begin)
    }

    /** @param end End of the time range. */
    public fun end(end: String) {
        cdkBuilder.end(end)
    }

    public fun build(): CfnLicense.ValidityDateFormatProperty = cdkBuilder.build()
}
