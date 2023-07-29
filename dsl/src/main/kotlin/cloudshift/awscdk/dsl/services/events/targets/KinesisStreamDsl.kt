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

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.KinesisStream
import software.amazon.awscdk.services.kinesis.IStream

/**
 * Use a Kinesis Stream as a target for AWS CloudWatch event rules.
 *
 * Example:
 * ```
 * // put to a Kinesis stream every time code is committed
 * // to a CodeCommit repository
 * repository.onCommit("onCommit", OnCommitOptions.builder().target(new
 * KinesisStream(stream)).build());
 * ```
 */
@CdkDslMarker
public class KinesisStreamDsl(
    stream: IStream,
) {
    private val cdkBuilder: KinesisStream.Builder = KinesisStream.Builder.create(stream)

    /**
     * The message to send to the stream.
     *
     * Must be a valid JSON text passed to the target stream.
     *
     * Default: - the entire CloudWatch event
     *
     * @param message The message to send to the stream.
     */
    public fun message(message: RuleTargetInput) {
        cdkBuilder.message(message)
    }

    /**
     * Partition Key Path for records sent to this stream.
     *
     * Default: - eventId as the partition key
     *
     * @param partitionKeyPath Partition Key Path for records sent to this stream.
     */
    public fun partitionKeyPath(partitionKeyPath: String) {
        cdkBuilder.partitionKeyPath(partitionKeyPath)
    }

    public fun build(): KinesisStream = cdkBuilder.build()
}
