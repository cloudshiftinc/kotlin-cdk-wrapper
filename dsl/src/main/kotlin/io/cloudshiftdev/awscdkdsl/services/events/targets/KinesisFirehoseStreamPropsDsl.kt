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

package io.cloudshiftdev.awscdkdsl.services.events.targets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps

/**
 * Customize the Firehose Stream Event Target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * import software.amazon.awscdk.services.events.targets.*;
 * RuleTargetInput ruleTargetInput;
 * KinesisFirehoseStreamProps kinesisFirehoseStreamProps = KinesisFirehoseStreamProps.builder()
 * .message(ruleTargetInput)
 * .build();
 * ```
 */
@CdkDslMarker
public class KinesisFirehoseStreamPropsDsl {
    private val cdkBuilder: KinesisFirehoseStreamProps.Builder =
        KinesisFirehoseStreamProps.builder()

    /**
     * @param message The message to send to the stream. Must be a valid JSON text passed to the
     *   target stream.
     */
    public fun message(message: RuleTargetInput) {
        cdkBuilder.message(message)
    }

    public fun build(): KinesisFirehoseStreamProps = cdkBuilder.build()
}
