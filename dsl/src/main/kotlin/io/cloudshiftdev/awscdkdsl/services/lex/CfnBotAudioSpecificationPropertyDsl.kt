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

package io.cloudshiftdev.awscdkdsl.services.lex

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Specifies the audio input specifications.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * AudioSpecificationProperty audioSpecificationProperty = AudioSpecificationProperty.builder()
 * .endTimeoutMs(123)
 * .maxLengthMs(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audiospecification.html)
 */
@CdkDslMarker
public class CfnBotAudioSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.AudioSpecificationProperty.Builder =
        CfnBot.AudioSpecificationProperty.builder()

    /**
     * @param endTimeoutMs Time for which a bot waits after the customer stops speaking to assume
     *   the utterance is finished.
     */
    public fun endTimeoutMs(endTimeoutMs: Number) {
        cdkBuilder.endTimeoutMs(endTimeoutMs)
    }

    /**
     * @param maxLengthMs Time for how long Amazon Lex waits before speech input is truncated and
     *   the speech is returned to application.
     */
    public fun maxLengthMs(maxLengthMs: Number) {
        cdkBuilder.maxLengthMs(maxLengthMs)
    }

    public fun build(): CfnBot.AudioSpecificationProperty = cdkBuilder.build()
}
