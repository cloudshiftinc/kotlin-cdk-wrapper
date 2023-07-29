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

package cloudshift.awscdk.dsl.services.autoscaling.common

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.common.Alarms

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.common.*;
 * Alarms alarms = Alarms.builder()
 * .lowerAlarmIntervalIndex(123)
 * .upperAlarmIntervalIndex(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class AlarmsDsl {
    private val cdkBuilder: Alarms.Builder = Alarms.builder()

    /** @param lowerAlarmIntervalIndex the value to be set. */
    public fun lowerAlarmIntervalIndex(lowerAlarmIntervalIndex: Number) {
        cdkBuilder.lowerAlarmIntervalIndex(lowerAlarmIntervalIndex)
    }

    /** @param upperAlarmIntervalIndex the value to be set. */
    public fun upperAlarmIntervalIndex(upperAlarmIntervalIndex: Number) {
        cdkBuilder.upperAlarmIntervalIndex(upperAlarmIntervalIndex)
    }

    public fun build(): Alarms = cdkBuilder.build()
}
