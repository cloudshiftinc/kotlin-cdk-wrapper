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

package io.cloudshiftdev.awscdkdsl.services.scheduler

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.scheduler.CfnSchedule

/**
 * Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.scheduler.*;
 * FlexibleTimeWindowProperty flexibleTimeWindowProperty = FlexibleTimeWindowProperty.builder()
 * .mode("mode")
 * // the properties below are optional
 * .maximumWindowInMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-flexibletimewindow.html)
 */
@CdkDslMarker
public class CfnScheduleFlexibleTimeWindowPropertyDsl {
    private val cdkBuilder: CfnSchedule.FlexibleTimeWindowProperty.Builder =
        CfnSchedule.FlexibleTimeWindowProperty.builder()

    /**
     * @param maximumWindowInMinutes The maximum time window during which a schedule can be invoked.
     *   *Minimum* : `1`
     *
     * *Maximum* : `1440`
     */
    public fun maximumWindowInMinutes(maximumWindowInMinutes: Number) {
        cdkBuilder.maximumWindowInMinutes(maximumWindowInMinutes)
    }

    /**
     * @param mode Determines whether the schedule is invoked within a flexible time window. You
     *   must use quotation marks when you specify this value in your JSON or YAML template.
     *
     * *Allowed Values* : `"OFF"` | `"FLEXIBLE"`
     */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun build(): CfnSchedule.FlexibleTimeWindowProperty = cdkBuilder.build()
}
