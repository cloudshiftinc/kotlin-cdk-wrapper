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
 * Specifies the allowed input types.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * AllowedInputTypesProperty allowedInputTypesProperty = AllowedInputTypesProperty.builder()
 * .allowAudioInput(false)
 * .allowDtmfInput(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-allowedinputtypes.html)
 */
@CdkDslMarker
public class CfnBotAllowedInputTypesPropertyDsl {
    private val cdkBuilder: CfnBot.AllowedInputTypesProperty.Builder =
        CfnBot.AllowedInputTypesProperty.builder()

    /** @param allowAudioInput Indicates whether audio input is allowed. */
    public fun allowAudioInput(allowAudioInput: Boolean) {
        cdkBuilder.allowAudioInput(allowAudioInput)
    }

    /** @param allowAudioInput Indicates whether audio input is allowed. */
    public fun allowAudioInput(allowAudioInput: IResolvable) {
        cdkBuilder.allowAudioInput(allowAudioInput)
    }

    /** @param allowDtmfInput Indicates whether DTMF input is allowed. */
    public fun allowDtmfInput(allowDtmfInput: Boolean) {
        cdkBuilder.allowDtmfInput(allowDtmfInput)
    }

    /** @param allowDtmfInput Indicates whether DTMF input is allowed. */
    public fun allowDtmfInput(allowDtmfInput: IResolvable) {
        cdkBuilder.allowDtmfInput(allowDtmfInput)
    }

    public fun build(): CfnBot.AllowedInputTypesProperty = cdkBuilder.build()
}
