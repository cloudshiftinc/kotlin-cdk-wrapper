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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MaintenanceCreateSettingsProperty maintenanceCreateSettingsProperty =
 * MaintenanceCreateSettingsProperty.builder()
 * .maintenanceDay("maintenanceDay")
 * .maintenanceStartTime("maintenanceStartTime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-maintenancecreatesettings.html)
 */
@CdkDslMarker
public class CfnChannelMaintenanceCreateSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.MaintenanceCreateSettingsProperty.Builder =
        CfnChannel.MaintenanceCreateSettingsProperty.builder()

    /** @param maintenanceDay the value to be set. */
    public fun maintenanceDay(maintenanceDay: String) {
        cdkBuilder.maintenanceDay(maintenanceDay)
    }

    /** @param maintenanceStartTime the value to be set. */
    public fun maintenanceStartTime(maintenanceStartTime: String) {
        cdkBuilder.maintenanceStartTime(maintenanceStartTime)
    }

    public fun build(): CfnChannel.MaintenanceCreateSettingsProperty = cdkBuilder.build()
}
