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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

/**
 * Configuration details about the monitoring schedule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ScheduleConfigProperty scheduleConfigProperty = ScheduleConfigProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-monitoringschedule-scheduleconfig.html)
 */
@CdkDslMarker
public class CfnMonitoringScheduleScheduleConfigPropertyDsl {
    private val cdkBuilder: CfnMonitoringSchedule.ScheduleConfigProperty.Builder =
        CfnMonitoringSchedule.ScheduleConfigProperty.builder()

    /**
     * @param scheduleExpression A cron expression that describes details about the monitoring
     *   schedule. Currently the only supported cron expressions are:
     * * If you want to set the job to start every hour, please use the following:
     *
     * `Hourly: cron(0 * ? * * *)`
     * * If you want to start the job daily:
     *
     * `cron(0 [00-23] ? * * *)`
     *
     * For example, the following are valid cron expressions:
     * * Daily at noon UTC: `cron(0 12 ? * * *)`
     * * Daily at midnight UTC: `cron(0 0 ? * * *)`
     *
     * To support running every 6, 12 hours, the following are also supported:
     *
     * `cron(0 [00-23]/[01-24] ? * * *)`
     *
     * For example, the following are valid cron expressions:
     * * Every 12 hours, starting at 5pm UTC: `cron(0 17/12 ? * * *)`
     * * Every two hours starting at midnight: `cron(0 0/2 ? * * *)`
     * * Even though the cron expression is set to start at 5PM UTC, note that there could be a
     *   delay of 0-20 minutes from the actual requested time to run the execution.
     * * We recommend that if you would like a daily schedule, you do not provide this parameter.
     *   Amazon SageMaker will pick a time for running every day.
     */
    public fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    public fun build(): CfnMonitoringSchedule.ScheduleConfigProperty = cdkBuilder.build()
}
