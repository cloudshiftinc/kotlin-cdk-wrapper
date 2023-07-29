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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Contains settings used by Amazon Lex to select a slot value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SlotValueSelectionSettingProperty slotValueSelectionSettingProperty =
 * SlotValueSelectionSettingProperty.builder()
 * .resolutionStrategy("resolutionStrategy")
 * // the properties below are optional
 * .advancedRecognitionSetting(AdvancedRecognitionSettingProperty.builder()
 * .audioRecognitionStrategy("audioRecognitionStrategy")
 * .build())
 * .regexFilter(SlotValueRegexFilterProperty.builder()
 * .pattern("pattern")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueselectionsetting.html)
 */
@CdkDslMarker
public class CfnBotSlotValueSelectionSettingPropertyDsl {
    private val cdkBuilder: CfnBot.SlotValueSelectionSettingProperty.Builder =
        CfnBot.SlotValueSelectionSettingProperty.builder()

    /**
     * @param advancedRecognitionSetting Provides settings that enable advanced recognition settings
     *   for slot values. You can use this to enable using slot values as a custom vocabulary for
     *   recognizing user utterances.
     */
    public fun advancedRecognitionSetting(advancedRecognitionSetting: IResolvable) {
        cdkBuilder.advancedRecognitionSetting(advancedRecognitionSetting)
    }

    /**
     * @param advancedRecognitionSetting Provides settings that enable advanced recognition settings
     *   for slot values. You can use this to enable using slot values as a custom vocabulary for
     *   recognizing user utterances.
     */
    public fun advancedRecognitionSetting(
        advancedRecognitionSetting: CfnBot.AdvancedRecognitionSettingProperty
    ) {
        cdkBuilder.advancedRecognitionSetting(advancedRecognitionSetting)
    }

    /** @param regexFilter A regular expression used to validate the value of a slot. */
    public fun regexFilter(regexFilter: IResolvable) {
        cdkBuilder.regexFilter(regexFilter)
    }

    /** @param regexFilter A regular expression used to validate the value of a slot. */
    public fun regexFilter(regexFilter: CfnBot.SlotValueRegexFilterProperty) {
        cdkBuilder.regexFilter(regexFilter)
    }

    /**
     * @param resolutionStrategy Determines the slot resolution strategy that Amazon Lex uses to
     *   return slot type values. The field can be set to one of the following values:
     * * `ORIGINAL_VALUE` - Returns the value entered by the user, if the user value is similar to
     *   the slot value.
     * * `TOP_RESOLUTION` - If there is a resolution list for the slot, return the first value in
     *   the resolution list as the slot type value. If there is no resolution list, null is
     *   returned.
     *
     * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
     */
    public fun resolutionStrategy(resolutionStrategy: String) {
        cdkBuilder.resolutionStrategy(resolutionStrategy)
    }

    public fun build(): CfnBot.SlotValueSelectionSettingProperty = cdkBuilder.build()
}
