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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration

/**
 * A monthly schedule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.inspectorv2.*;
 * MonthlyScheduleProperty monthlyScheduleProperty = MonthlyScheduleProperty.builder()
 * .day("day")
 * .startTime(TimeProperty.builder()
 * .timeOfDay("timeOfDay")
 * .timeZone("timeZone")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-monthlyschedule.html)
 */
@CdkDslMarker
public class CfnCisScanConfigurationMonthlySchedulePropertyDsl {
    private val cdkBuilder: CfnCisScanConfiguration.MonthlyScheduleProperty.Builder =
        CfnCisScanConfiguration.MonthlyScheduleProperty.builder()

    /** @param day The monthly schedule's day. */
    public fun day(day: String) {
        cdkBuilder.day(day)
    }

    /** @param startTime The monthly schedule's start time. */
    public fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime)
    }

    /** @param startTime The monthly schedule's start time. */
    public fun startTime(startTime: CfnCisScanConfiguration.TimeProperty) {
        cdkBuilder.startTime(startTime)
    }

    public fun build(): CfnCisScanConfiguration.MonthlyScheduleProperty = cdkBuilder.build()
}
