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
import kotlin.Number

@CdkDslMarker
public class CfnLicenseProvisionalConfigurationPropertyDsl {
    private val cdkBuilder: CfnLicense.ProvisionalConfigurationProperty.Builder =
        CfnLicense.ProvisionalConfigurationProperty.builder()

    public fun maxTimeToLiveInMinutes(maxTimeToLiveInMinutes: Number) {
        cdkBuilder.maxTimeToLiveInMinutes(maxTimeToLiveInMinutes)
    }

    public fun build(): CfnLicense.ProvisionalConfigurationProperty = cdkBuilder.build()
}
