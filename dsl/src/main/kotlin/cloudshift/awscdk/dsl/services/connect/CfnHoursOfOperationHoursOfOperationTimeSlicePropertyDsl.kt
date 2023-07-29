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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.connect.CfnHoursOfOperation

/**
 * The start time or end time for an hours of operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * HoursOfOperationTimeSliceProperty hoursOfOperationTimeSliceProperty =
 * HoursOfOperationTimeSliceProperty.builder()
 * .hours(123)
 * .minutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationtimeslice.html)
 */
@CdkDslMarker
public class CfnHoursOfOperationHoursOfOperationTimeSlicePropertyDsl {
    private val cdkBuilder: CfnHoursOfOperation.HoursOfOperationTimeSliceProperty.Builder =
        CfnHoursOfOperation.HoursOfOperationTimeSliceProperty.builder()

    /** @param hours The hours. */
    public fun hours(hours: Number) {
        cdkBuilder.hours(hours)
    }

    /** @param minutes The minutes. */
    public fun minutes(minutes: Number) {
        cdkBuilder.minutes(minutes)
    }

    public fun build(): CfnHoursOfOperation.HoursOfOperationTimeSliceProperty = cdkBuilder.build()
}
