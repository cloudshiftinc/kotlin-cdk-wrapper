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
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Specifies the settings on a prompt attempt.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * PromptAttemptSpecificationProperty promptAttemptSpecificationProperty =
 * PromptAttemptSpecificationProperty.builder()
 * .allowedInputTypes(AllowedInputTypesProperty.builder()
 * .allowAudioInput(false)
 * .allowDtmfInput(false)
 * .build())
 * // the properties below are optional
 * .allowInterrupt(false)
 * .audioAndDtmfInputSpecification(AudioAndDTMFInputSpecificationProperty.builder()
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
 * .build())
 * .textInputSpecification(TextInputSpecificationProperty.builder()
 * .startTimeoutMs(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-promptattemptspecification.html)
 */
@CdkDslMarker
public class CfnBotPromptAttemptSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.PromptAttemptSpecificationProperty.Builder =
        CfnBot.PromptAttemptSpecificationProperty.builder()

    /**
     * @param allowInterrupt Indicates whether the user can interrupt a speech prompt attempt from
     *   the bot.
     */
    public fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
    }

    /**
     * @param allowInterrupt Indicates whether the user can interrupt a speech prompt attempt from
     *   the bot.
     */
    public fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt)
    }

    /** @param allowedInputTypes Indicates the allowed input types of the prompt attempt. */
    public fun allowedInputTypes(allowedInputTypes: IResolvable) {
        cdkBuilder.allowedInputTypes(allowedInputTypes)
    }

    /** @param allowedInputTypes Indicates the allowed input types of the prompt attempt. */
    public fun allowedInputTypes(allowedInputTypes: CfnBot.AllowedInputTypesProperty) {
        cdkBuilder.allowedInputTypes(allowedInputTypes)
    }

    /** @param audioAndDtmfInputSpecification Specifies the settings on audio and DTMF input. */
    public fun audioAndDtmfInputSpecification(audioAndDtmfInputSpecification: IResolvable) {
        cdkBuilder.audioAndDtmfInputSpecification(audioAndDtmfInputSpecification)
    }

    /** @param audioAndDtmfInputSpecification Specifies the settings on audio and DTMF input. */
    public fun audioAndDtmfInputSpecification(
        audioAndDtmfInputSpecification: CfnBot.AudioAndDTMFInputSpecificationProperty
    ) {
        cdkBuilder.audioAndDtmfInputSpecification(audioAndDtmfInputSpecification)
    }

    /** @param textInputSpecification Specifies the settings on text input. */
    public fun textInputSpecification(textInputSpecification: IResolvable) {
        cdkBuilder.textInputSpecification(textInputSpecification)
    }

    /** @param textInputSpecification Specifies the settings on text input. */
    public fun textInputSpecification(
        textInputSpecification: CfnBot.TextInputSpecificationProperty
    ) {
        cdkBuilder.textInputSpecification(textInputSpecification)
    }

    public fun build(): CfnBot.PromptAttemptSpecificationProperty = cdkBuilder.build()
}
