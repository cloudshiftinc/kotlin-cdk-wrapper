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

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.scheduler.CfnSchedule

/**
 * The templated target type for the Amazon SQS
 * [`SendMessage`](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html)
 * API operation. Contains the message group ID to use when the target is a FIFO queue. If you
 * specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication
 * enabled. For more information, see
 * [Using the Amazon SQS message deduplication ID](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html)
 * in the *Amazon SQS Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.scheduler.*;
 * SqsParametersProperty sqsParametersProperty = SqsParametersProperty.builder()
 * .messageGroupId("messageGroupId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sqsparameters.html)
 */
@CdkDslMarker
public class CfnScheduleSqsParametersPropertyDsl {
    private val cdkBuilder: CfnSchedule.SqsParametersProperty.Builder =
        CfnSchedule.SqsParametersProperty.builder()

    /** @param messageGroupId The FIFO message group ID to use as the target. */
    public fun messageGroupId(messageGroupId: String) {
        cdkBuilder.messageGroupId(messageGroupId)
    }

    public fun build(): CfnSchedule.SqsParametersProperty = cdkBuilder.build()
}
