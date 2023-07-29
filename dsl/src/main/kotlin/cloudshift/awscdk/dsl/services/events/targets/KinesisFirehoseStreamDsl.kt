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
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.KinesisFirehoseStream
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Customize the Firehose Stream Event Target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * import software.amazon.awscdk.services.events.targets.*;
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * CfnDeliveryStream cfnDeliveryStream;
 * RuleTargetInput ruleTargetInput;
 * KinesisFirehoseStream kinesisFirehoseStream =
 * KinesisFirehoseStream.Builder.create(cfnDeliveryStream)
 * .message(ruleTargetInput)
 * .build();
 * ```
 */
@CdkDslMarker
public class KinesisFirehoseStreamDsl(
    stream: CfnDeliveryStream,
) {
    private val cdkBuilder: KinesisFirehoseStream.Builder =
        KinesisFirehoseStream.Builder.create(stream)

    /**
     * The message to send to the stream.
     *
     * Must be a valid JSON text passed to the target stream.
     *
     * Default: - the entire Event Bridge event
     *
     * @param message The message to send to the stream.
     */
    public fun message(message: RuleTargetInput) {
        cdkBuilder.message(message)
    }

    public fun build(): KinesisFirehoseStream = cdkBuilder.build()
}
