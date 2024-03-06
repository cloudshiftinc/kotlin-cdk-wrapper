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

package io.cloudshiftdev.awscdkdsl.services.inspectorv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration

/**
 * The schedule the CIS scan configuration runs on.
 *
 * Each CIS scan configuration has exactly one type of schedule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.inspectorv2.*;
 * Object oneTime;
 * ScheduleProperty scheduleProperty = ScheduleProperty.builder()
 * .daily(DailyScheduleProperty.builder()
 * .startTime(TimeProperty.builder()
 * .timeOfDay("timeOfDay")
 * .timeZone("timeZone")
 * .build())
 * .build())
 * .monthly(MonthlyScheduleProperty.builder()
 * .day("day")
 * .startTime(TimeProperty.builder()
 * .timeOfDay("timeOfDay")
 * .timeZone("timeZone")
 * .build())
 * .build())
 * .oneTime(oneTime)
 * .weekly(WeeklyScheduleProperty.builder()
 * .days(List.of("days"))
 * .startTime(TimeProperty.builder()
 * .timeOfDay("timeOfDay")
 * .timeZone("timeZone")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-schedule.html)
 */
@CdkDslMarker
public class CfnCisScanConfigurationSchedulePropertyDsl {
    private val cdkBuilder: CfnCisScanConfiguration.ScheduleProperty.Builder =
        CfnCisScanConfiguration.ScheduleProperty.builder()

    /** @param daily A daily schedule. */
    public fun daily(daily: IResolvable) {
        cdkBuilder.daily(daily)
    }

    /** @param daily A daily schedule. */
    public fun daily(daily: CfnCisScanConfiguration.DailyScheduleProperty) {
        cdkBuilder.daily(daily)
    }

    /** @param monthly A monthly schedule. */
    public fun monthly(monthly: IResolvable) {
        cdkBuilder.monthly(monthly)
    }

    /** @param monthly A monthly schedule. */
    public fun monthly(monthly: CfnCisScanConfiguration.MonthlyScheduleProperty) {
        cdkBuilder.monthly(monthly)
    }

    /** @param oneTime A one time schedule. */
    public fun oneTime(oneTime: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(oneTime)
        cdkBuilder.oneTime(builder.map)
    }

    /** @param oneTime A one time schedule. */
    public fun oneTime(oneTime: Any) {
        cdkBuilder.oneTime(oneTime)
    }

    /** @param weekly A weekly schedule. */
    public fun weekly(weekly: IResolvable) {
        cdkBuilder.weekly(weekly)
    }

    /** @param weekly A weekly schedule. */
    public fun weekly(weekly: CfnCisScanConfiguration.WeeklyScheduleProperty) {
        cdkBuilder.weekly(weekly)
    }

    public fun build(): CfnCisScanConfiguration.ScheduleProperty = cdkBuilder.build()
}
