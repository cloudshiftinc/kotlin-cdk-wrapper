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
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Specifies the DTMF input specifications.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * DTMFSpecificationProperty dTMFSpecificationProperty = DTMFSpecificationProperty.builder()
 * .deletionCharacter("deletionCharacter")
 * .endCharacter("endCharacter")
 * .endTimeoutMs(123)
 * .maxLength(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dtmfspecification.html)
 */
@CdkDslMarker
public class CfnBotDTMFSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.DTMFSpecificationProperty.Builder =
        CfnBot.DTMFSpecificationProperty.builder()

    /**
     * @param deletionCharacter The DTMF character that clears the accumulated DTMF digits and
     *   immediately ends the input.
     */
    public fun deletionCharacter(deletionCharacter: String) {
        cdkBuilder.deletionCharacter(deletionCharacter)
    }

    /**
     * @param endCharacter The DTMF character that immediately ends input. If the user does not
     *   press this character, the input ends after the end timeout.
     */
    public fun endCharacter(endCharacter: String) {
        cdkBuilder.endCharacter(endCharacter)
    }

    /**
     * @param endTimeoutMs How long the bot should wait after the last DTMF character input before
     *   assuming that the input has concluded.
     */
    public fun endTimeoutMs(endTimeoutMs: Number) {
        cdkBuilder.endTimeoutMs(endTimeoutMs)
    }

    /** @param maxLength The maximum number of DTMF digits allowed in an utterance. */
    public fun maxLength(maxLength: Number) {
        cdkBuilder.maxLength(maxLength)
    }

    public fun build(): CfnBot.DTMFSpecificationProperty = cdkBuilder.build()
}
