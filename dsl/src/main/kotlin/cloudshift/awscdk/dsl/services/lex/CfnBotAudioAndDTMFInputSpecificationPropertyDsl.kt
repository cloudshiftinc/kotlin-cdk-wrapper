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

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Specifies the audio and DTMF input specification.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * AudioAndDTMFInputSpecificationProperty audioAndDTMFInputSpecificationProperty =
 * AudioAndDTMFInputSpecificationProperty.builder()
 * .startTimeoutMs(123)
 * // the properties below are optional
 * .audioSpecification(AudioSpecificationProperty.builder()
 * .endTimeoutMs(123)
 * .maxLengthMs(123)
 * .build())
 * .dtmfSpecification(DTMFSpecificationProperty.builder()
 * .deletionCharacter("deletionCharacter")
 * .endCharacter("endCharacter")
 * .endTimeoutMs(123)
 * .maxLength(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-audioanddtmfinputspecification.html)
 */
@CdkDslMarker
public class CfnBotAudioAndDTMFInputSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.AudioAndDTMFInputSpecificationProperty.Builder =
        CfnBot.AudioAndDTMFInputSpecificationProperty.builder()

    /** @param audioSpecification Specifies the settings on audio input. */
    public fun audioSpecification(audioSpecification: IResolvable) {
        cdkBuilder.audioSpecification(audioSpecification)
    }

    /** @param audioSpecification Specifies the settings on audio input. */
    public fun audioSpecification(audioSpecification: CfnBot.AudioSpecificationProperty) {
        cdkBuilder.audioSpecification(audioSpecification)
    }

    /** @param dtmfSpecification Specifies the settings on DTMF input. */
    public fun dtmfSpecification(dtmfSpecification: IResolvable) {
        cdkBuilder.dtmfSpecification(dtmfSpecification)
    }

    /** @param dtmfSpecification Specifies the settings on DTMF input. */
    public fun dtmfSpecification(dtmfSpecification: CfnBot.DTMFSpecificationProperty) {
        cdkBuilder.dtmfSpecification(dtmfSpecification)
    }

    /**
     * @param startTimeoutMs Time for which a bot waits before assuming that the customer isn't
     *   going to speak or press a key. This timeout is shared between Audio and DTMF inputs.
     */
    public fun startTimeoutMs(startTimeoutMs: Number) {
        cdkBuilder.startTimeoutMs(startTimeoutMs)
    }

    public fun build(): CfnBot.AudioAndDTMFInputSpecificationProperty = cdkBuilder.build()
}
