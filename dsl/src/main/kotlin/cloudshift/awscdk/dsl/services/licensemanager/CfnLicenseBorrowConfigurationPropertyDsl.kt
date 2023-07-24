@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.licensemanager.CfnLicense
import kotlin.Boolean
import kotlin.Number

/**
 * Details about a borrow configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.licensemanager.*;
 * BorrowConfigurationProperty borrowConfigurationProperty = BorrowConfigurationProperty.builder()
 * .allowEarlyCheckIn(false)
 * .maxTimeToLiveInMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-borrowconfiguration.html)
 */
@CdkDslMarker
public class CfnLicenseBorrowConfigurationPropertyDsl {
    private val cdkBuilder: CfnLicense.BorrowConfigurationProperty.Builder =
        CfnLicense.BorrowConfigurationProperty.builder()

    /**
     * @param allowEarlyCheckIn Indicates whether early check-ins are allowed.
     */
    public fun allowEarlyCheckIn(allowEarlyCheckIn: Boolean) {
        cdkBuilder.allowEarlyCheckIn(allowEarlyCheckIn)
    }

    /**
     * @param allowEarlyCheckIn Indicates whether early check-ins are allowed.
     */
    public fun allowEarlyCheckIn(allowEarlyCheckIn: IResolvable) {
        cdkBuilder.allowEarlyCheckIn(allowEarlyCheckIn)
    }

    /**
     * @param maxTimeToLiveInMinutes Maximum time for the borrow configuration, in minutes.
     */
    public fun maxTimeToLiveInMinutes(maxTimeToLiveInMinutes: Number) {
        cdkBuilder.maxTimeToLiveInMinutes(maxTimeToLiveInMinutes)
    }

    public fun build(): CfnLicense.BorrowConfigurationProperty = cdkBuilder.build()
}
