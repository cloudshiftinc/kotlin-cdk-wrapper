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
public class CfnLicenseIssuerDataPropertyDsl {
    private val cdkBuilder: CfnLicense.IssuerDataProperty.Builder =
        CfnLicense.IssuerDataProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun signKey(signKey: String) {
        cdkBuilder.signKey(signKey)
    }

    public fun build(): CfnLicense.IssuerDataProperty = cdkBuilder.build()
}
