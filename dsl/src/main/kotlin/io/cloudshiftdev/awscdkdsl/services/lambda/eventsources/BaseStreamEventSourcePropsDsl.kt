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

package io.cloudshiftdev.awscdkdsl.services.lambda.eventsources

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.StartingPosition
import software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps

/**
 * The set of properties for streaming event sources shared by Dynamo, Kinesis and Kafka.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.lambda.*;
 * import software.amazon.awscdk.services.lambda.eventsources.*;
 * BaseStreamEventSourceProps baseStreamEventSourceProps = BaseStreamEventSourceProps.builder()
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * // the properties below are optional
 * .batchSize(123)
 * .enabled(false)
 * .maxBatchingWindow(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class BaseStreamEventSourcePropsDsl {
    private val cdkBuilder: BaseStreamEventSourceProps.Builder =
        BaseStreamEventSourceProps.builder()

    /**
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     *   source at the time of invoking your function. Your function receives an event with all the
     *   retrieved records.
     *
     * Valid Range:
     * * Minimum value of 1
     * * Maximum value of:
     * * 1000 for `DynamoEventSource`
     * * 10000 for `KinesisEventSource`, `ManagedKafkaEventSource` and `SelfManagedKafkaEventSource`
     */
    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    /** @param enabled If the stream event source mapping should be enabled. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     *   function. Maximum of Duration.minutes(5).
     */
    public fun maxBatchingWindow(maxBatchingWindow: Duration) {
        cdkBuilder.maxBatchingWindow(maxBatchingWindow)
    }

    /** @param startingPosition Where to begin consuming the stream. */
    public fun startingPosition(startingPosition: StartingPosition) {
        cdkBuilder.startingPosition(startingPosition)
    }

    public fun build(): BaseStreamEventSourceProps = cdkBuilder.build()
}
