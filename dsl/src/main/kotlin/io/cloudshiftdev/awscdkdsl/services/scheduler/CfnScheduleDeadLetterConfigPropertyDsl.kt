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
import kotlin.String
import software.amazon.awscdk.services.scheduler.CfnSchedule

/**
 * An object that contains information about an Amazon SQS queue that EventBridge Scheduler uses as
 * a dead-letter queue for your schedule.
 *
 * If specified, EventBridge Scheduler delivers failed events that could not be successfully
 * delivered to a target to the queue.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.scheduler.*;
 * DeadLetterConfigProperty deadLetterConfigProperty = DeadLetterConfigProperty.builder()
 * .arn("arn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-deadletterconfig.html)
 */
@CdkDslMarker
public class CfnScheduleDeadLetterConfigPropertyDsl {
    private val cdkBuilder: CfnSchedule.DeadLetterConfigProperty.Builder =
        CfnSchedule.DeadLetterConfigProperty.builder()

    /**
     * @param arn The Amazon Resource Name (ARN) of the SQS queue specified as the destination for
     *   the dead-letter queue.
     */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnSchedule.DeadLetterConfigProperty = cdkBuilder.build()
}
