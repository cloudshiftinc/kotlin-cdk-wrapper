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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnHoursOfOperation

/**
 * Contains information about the hours of operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * HoursOfOperationConfigProperty hoursOfOperationConfigProperty =
 * HoursOfOperationConfigProperty.builder()
 * .day("day")
 * .endTime(HoursOfOperationTimeSliceProperty.builder()
 * .hours(123)
 * .minutes(123)
 * .build())
 * .startTime(HoursOfOperationTimeSliceProperty.builder()
 * .hours(123)
 * .minutes(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationconfig.html)
 */
@CdkDslMarker
public class CfnHoursOfOperationHoursOfOperationConfigPropertyDsl {
    private val cdkBuilder: CfnHoursOfOperation.HoursOfOperationConfigProperty.Builder =
        CfnHoursOfOperation.HoursOfOperationConfigProperty.builder()

    /** @param day The day that the hours of operation applies to. */
    public fun day(day: String) {
        cdkBuilder.day(day)
    }

    /** @param endTime The end time that your contact center closes. */
    public fun endTime(endTime: IResolvable) {
        cdkBuilder.endTime(endTime)
    }

    /** @param endTime The end time that your contact center closes. */
    public fun endTime(endTime: CfnHoursOfOperation.HoursOfOperationTimeSliceProperty) {
        cdkBuilder.endTime(endTime)
    }

    /** @param startTime The start time that your contact center opens. */
    public fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime)
    }

    /** @param startTime The start time that your contact center opens. */
    public fun startTime(startTime: CfnHoursOfOperation.HoursOfOperationTimeSliceProperty) {
        cdkBuilder.startTime(startTime)
    }

    public fun build(): CfnHoursOfOperation.HoursOfOperationConfigProperty = cdkBuilder.build()
}
