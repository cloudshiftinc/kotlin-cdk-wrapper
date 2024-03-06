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

package io.cloudshiftdev.awscdkdsl.services.workspacesthinclient

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment

/**
 * Describes the maintenance window for a thin client device.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesthinclient.*;
 * MaintenanceWindowProperty maintenanceWindowProperty = MaintenanceWindowProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .applyTimeOf("applyTimeOf")
 * .daysOfTheWeek(List.of("daysOfTheWeek"))
 * .endTimeHour(123)
 * .endTimeMinute(123)
 * .startTimeHour(123)
 * .startTimeMinute(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html)
 */
@CdkDslMarker
public class CfnEnvironmentMaintenanceWindowPropertyDsl {
    private val cdkBuilder: CfnEnvironment.MaintenanceWindowProperty.Builder =
        CfnEnvironment.MaintenanceWindowProperty.builder()

    private val _daysOfTheWeek: MutableList<String> = mutableListOf()

    /**
     * @param applyTimeOf The option to set the maintenance window during the device local time or
     *   Universal Coordinated Time (UTC).
     */
    public fun applyTimeOf(applyTimeOf: String) {
        cdkBuilder.applyTimeOf(applyTimeOf)
    }

    /** @param daysOfTheWeek The days of the week during which the maintenance window is open. */
    public fun daysOfTheWeek(vararg daysOfTheWeek: String) {
        _daysOfTheWeek.addAll(listOf(*daysOfTheWeek))
    }

    /** @param daysOfTheWeek The days of the week during which the maintenance window is open. */
    public fun daysOfTheWeek(daysOfTheWeek: Collection<String>) {
        _daysOfTheWeek.addAll(daysOfTheWeek)
    }

    /** @param endTimeHour The hour for the maintenance window end ( `00` - `23` ). */
    public fun endTimeHour(endTimeHour: Number) {
        cdkBuilder.endTimeHour(endTimeHour)
    }

    /** @param endTimeMinute The minutes for the maintenance window end ( `00` - `59` ). */
    public fun endTimeMinute(endTimeMinute: Number) {
        cdkBuilder.endTimeMinute(endTimeMinute)
    }

    /** @param startTimeHour The hour for the maintenance window start ( `00` - `23` ). */
    public fun startTimeHour(startTimeHour: Number) {
        cdkBuilder.startTimeHour(startTimeHour)
    }

    /**
     * @param startTimeMinute The minutes past the hour for the maintenance window start ( `00` -
     *   `59` ).
     */
    public fun startTimeMinute(startTimeMinute: Number) {
        cdkBuilder.startTimeMinute(startTimeMinute)
    }

    /** @param type An option to select the default or custom maintenance window. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnEnvironment.MaintenanceWindowProperty {
        if (_daysOfTheWeek.isNotEmpty()) cdkBuilder.daysOfTheWeek(_daysOfTheWeek)
        return cdkBuilder.build()
    }
}
