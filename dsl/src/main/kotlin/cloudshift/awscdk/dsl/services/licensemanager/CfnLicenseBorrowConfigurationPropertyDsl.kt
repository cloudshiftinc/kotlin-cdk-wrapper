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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.licensemanager.CfnLicense
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class CfnLicenseBorrowConfigurationPropertyDsl {
    private val cdkBuilder: CfnLicense.BorrowConfigurationProperty.Builder =
        CfnLicense.BorrowConfigurationProperty.builder()

    public fun allowEarlyCheckIn(allowEarlyCheckIn: Boolean) {
        cdkBuilder.allowEarlyCheckIn(allowEarlyCheckIn)
    }

    public fun allowEarlyCheckIn(allowEarlyCheckIn: IResolvable) {
        cdkBuilder.allowEarlyCheckIn(allowEarlyCheckIn)
    }

    public fun maxTimeToLiveInMinutes(maxTimeToLiveInMinutes: Number) {
        cdkBuilder.maxTimeToLiveInMinutes(maxTimeToLiveInMinutes)
    }

    public fun build(): CfnLicense.BorrowConfigurationProperty = cdkBuilder.build()
}
