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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.licensemanager.CfnLicense

/**
 * Details about a consumption configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.licensemanager.*;
 * ConsumptionConfigurationProperty consumptionConfigurationProperty =
 * ConsumptionConfigurationProperty.builder()
 * .borrowConfiguration(BorrowConfigurationProperty.builder()
 * .allowEarlyCheckIn(false)
 * .maxTimeToLiveInMinutes(123)
 * .build())
 * .provisionalConfiguration(ProvisionalConfigurationProperty.builder()
 * .maxTimeToLiveInMinutes(123)
 * .build())
 * .renewType("renewType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-consumptionconfiguration.html)
 */
@CdkDslMarker
public class CfnLicenseConsumptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnLicense.ConsumptionConfigurationProperty.Builder =
        CfnLicense.ConsumptionConfigurationProperty.builder()

    /** @param borrowConfiguration Details about a borrow configuration. */
    public fun borrowConfiguration(borrowConfiguration: IResolvable) {
        cdkBuilder.borrowConfiguration(borrowConfiguration)
    }

    /** @param borrowConfiguration Details about a borrow configuration. */
    public fun borrowConfiguration(borrowConfiguration: CfnLicense.BorrowConfigurationProperty) {
        cdkBuilder.borrowConfiguration(borrowConfiguration)
    }

    /** @param provisionalConfiguration Details about a provisional configuration. */
    public fun provisionalConfiguration(provisionalConfiguration: IResolvable) {
        cdkBuilder.provisionalConfiguration(provisionalConfiguration)
    }

    /** @param provisionalConfiguration Details about a provisional configuration. */
    public fun provisionalConfiguration(
        provisionalConfiguration: CfnLicense.ProvisionalConfigurationProperty
    ) {
        cdkBuilder.provisionalConfiguration(provisionalConfiguration)
    }

    /** @param renewType Renewal frequency. */
    public fun renewType(renewType: String) {
        cdkBuilder.renewType(renewType)
    }

    public fun build(): CfnLicense.ConsumptionConfigurationProperty = cdkBuilder.build()
}
