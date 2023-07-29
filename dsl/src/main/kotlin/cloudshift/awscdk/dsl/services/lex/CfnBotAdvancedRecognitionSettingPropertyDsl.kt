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
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Provides settings that enable advanced recognition settings for slot values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * AdvancedRecognitionSettingProperty advancedRecognitionSettingProperty =
 * AdvancedRecognitionSettingProperty.builder()
 * .audioRecognitionStrategy("audioRecognitionStrategy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-advancedrecognitionsetting.html)
 */
@CdkDslMarker
public class CfnBotAdvancedRecognitionSettingPropertyDsl {
    private val cdkBuilder: CfnBot.AdvancedRecognitionSettingProperty.Builder =
        CfnBot.AdvancedRecognitionSettingProperty.builder()

    /**
     * @param audioRecognitionStrategy Enables using the slot values as a custom vocabulary for
     *   recognizing user utterances.
     */
    public fun audioRecognitionStrategy(audioRecognitionStrategy: String) {
        cdkBuilder.audioRecognitionStrategy(audioRecognitionStrategy)
    }

    public fun build(): CfnBot.AdvancedRecognitionSettingProperty = cdkBuilder.build()
}
