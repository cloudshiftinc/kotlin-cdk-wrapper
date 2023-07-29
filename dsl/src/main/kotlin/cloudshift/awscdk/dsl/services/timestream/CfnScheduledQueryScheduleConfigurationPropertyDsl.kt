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

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

/**
 * Configuration of the schedule of the query.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * ScheduleConfigurationProperty scheduleConfigurationProperty =
 * ScheduleConfigurationProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-scheduleconfiguration.html)
 */
@CdkDslMarker
public class CfnScheduledQueryScheduleConfigurationPropertyDsl {
    private val cdkBuilder: CfnScheduledQuery.ScheduleConfigurationProperty.Builder =
        CfnScheduledQuery.ScheduleConfigurationProperty.builder()

    /**
     * @param scheduleExpression An expression that denotes when to trigger the scheduled query run.
     *   This can be a cron expression or a rate expression.
     */
    public fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    public fun build(): CfnScheduledQuery.ScheduleConfigurationProperty = cdkBuilder.build()
}
