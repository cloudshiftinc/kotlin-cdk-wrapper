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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnDomain

/**
 * The day and time when do you want to start the Identity Resolution Job every week.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * JobScheduleProperty jobScheduleProperty = JobScheduleProperty.builder()
 * .dayOfTheWeek("dayOfTheWeek")
 * .time("time")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-jobschedule.html)
 */
@CdkDslMarker
public class CfnDomainJobSchedulePropertyDsl {
    private val cdkBuilder: CfnDomain.JobScheduleProperty.Builder =
        CfnDomain.JobScheduleProperty.builder()

    /** @param dayOfTheWeek The day when the Identity Resolution Job should run every week. */
    public fun dayOfTheWeek(dayOfTheWeek: String) {
        cdkBuilder.dayOfTheWeek(dayOfTheWeek)
    }

    /** @param time The time when the Identity Resolution Job should run every week. */
    public fun time(time: String) {
        cdkBuilder.time(time)
    }

    public fun build(): CfnDomain.JobScheduleProperty = cdkBuilder.build()
}
