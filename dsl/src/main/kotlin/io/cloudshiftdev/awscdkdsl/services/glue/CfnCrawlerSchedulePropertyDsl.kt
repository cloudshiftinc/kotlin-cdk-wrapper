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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnCrawler

/**
 * A scheduling object using a `cron` statement to schedule an event.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * ScheduleProperty scheduleProperty = ScheduleProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html)
 */
@CdkDslMarker
public class CfnCrawlerSchedulePropertyDsl {
    private val cdkBuilder: CfnCrawler.ScheduleProperty.Builder =
        CfnCrawler.ScheduleProperty.builder()

    /**
     * @param scheduleExpression A `cron` expression used to specify the schedule. For more
     *   information, see
     *   [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html)
     *   . For example, to run something every day at 12:15 UTC, specify `cron(15 12 * * ? *)` .
     */
    public fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    public fun build(): CfnCrawler.ScheduleProperty = cdkBuilder.build()
}
