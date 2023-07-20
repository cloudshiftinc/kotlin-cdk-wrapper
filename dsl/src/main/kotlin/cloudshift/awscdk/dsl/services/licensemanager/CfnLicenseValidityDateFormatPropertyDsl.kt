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

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.licensemanager.CfnLicense
import kotlin.String

@CdkDslMarker
public class CfnLicenseValidityDateFormatPropertyDsl {
    private val cdkBuilder: CfnLicense.ValidityDateFormatProperty.Builder =
        CfnLicense.ValidityDateFormatProperty.builder()

    public fun begin(begin: String) {
        cdkBuilder.begin(begin)
    }

    public fun end(end: String) {
        cdkBuilder.end(end)
    }

    public fun build(): CfnLicense.ValidityDateFormatProperty = cdkBuilder.build()
}
