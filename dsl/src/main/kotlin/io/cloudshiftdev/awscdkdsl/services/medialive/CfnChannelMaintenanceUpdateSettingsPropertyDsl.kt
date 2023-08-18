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
 * MaintenanceUpdateSettingsProperty maintenanceUpdateSettingsProperty =
 * MaintenanceUpdateSettingsProperty.builder()
 * .maintenanceDay("maintenanceDay")
 * .maintenanceScheduledDate("maintenanceScheduledDate")
 * .maintenanceStartTime("maintenanceStartTime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-maintenanceupdatesettings.html)
 */
@CdkDslMarker
public class CfnChannelMaintenanceUpdateSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.MaintenanceUpdateSettingsProperty.Builder =
        CfnChannel.MaintenanceUpdateSettingsProperty.builder()

    /** @param maintenanceDay the value to be set. */
    public fun maintenanceDay(maintenanceDay: String) {
        cdkBuilder.maintenanceDay(maintenanceDay)
    }

    /** @param maintenanceScheduledDate the value to be set. */
    public fun maintenanceScheduledDate(maintenanceScheduledDate: String) {
        cdkBuilder.maintenanceScheduledDate(maintenanceScheduledDate)
    }

    /** @param maintenanceStartTime the value to be set. */
    public fun maintenanceStartTime(maintenanceStartTime: String) {
        cdkBuilder.maintenanceStartTime(maintenanceStartTime)
    }

    public fun build(): CfnChannel.MaintenanceUpdateSettingsProperty = cdkBuilder.build()
}
