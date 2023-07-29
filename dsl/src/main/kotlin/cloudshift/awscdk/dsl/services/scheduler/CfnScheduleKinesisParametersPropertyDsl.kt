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
 * The templated target type for the Amazon Kinesis
 * [`PutRecord`](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecord.html) API
 * operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.scheduler.*;
 * KinesisParametersProperty kinesisParametersProperty = KinesisParametersProperty.builder()
 * .partitionKey("partitionKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-kinesisparameters.html)
 */
@CdkDslMarker
public class CfnScheduleKinesisParametersPropertyDsl {
    private val cdkBuilder: CfnSchedule.KinesisParametersProperty.Builder =
        CfnSchedule.KinesisParametersProperty.builder()

    /**
     * @param partitionKey Specifies the shard to which EventBridge Scheduler sends the event. For
     *   more information, see
     *   [Amazon Kinesis Data Streams terminology and concepts](https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html)
     *   in the *Amazon Kinesis Streams Developer Guide* .
     */
    public fun partitionKey(partitionKey: String) {
        cdkBuilder.partitionKey(partitionKey)
    }

    public fun build(): CfnSchedule.KinesisParametersProperty = cdkBuilder.build()
}
