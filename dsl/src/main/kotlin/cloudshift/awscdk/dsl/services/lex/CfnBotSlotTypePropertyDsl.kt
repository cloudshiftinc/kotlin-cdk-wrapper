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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Describes a slot type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SlotTypeProperty slotTypeProperty = SlotTypeProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .externalSourceSetting(ExternalSourceSettingProperty.builder()
 * .grammarSlotTypeSetting(GrammarSlotTypeSettingProperty.builder()
 * .source(GrammarSlotTypeSourceProperty.builder()
 * .s3BucketName("s3BucketName")
 * .s3ObjectKey("s3ObjectKey")
 * // the properties below are optional
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .build())
 * .build())
 * .parentSlotTypeSignature("parentSlotTypeSignature")
 * .slotTypeValues(List.of(SlotTypeValueProperty.builder()
 * .sampleValue(SampleValueProperty.builder()
 * .value("value")
 * .build())
 * // the properties below are optional
 * .synonyms(List.of(SampleValueProperty.builder()
 * .value("value")
 * .build()))
 * .build()))
 * .valueSelectionSetting(SlotValueSelectionSettingProperty.builder()
 * .resolutionStrategy("resolutionStrategy")
 * // the properties below are optional
 * .advancedRecognitionSetting(AdvancedRecognitionSettingProperty.builder()
 * .audioRecognitionStrategy("audioRecognitionStrategy")
 * .build())
 * .regexFilter(SlotValueRegexFilterProperty.builder()
 * .pattern("pattern")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slottype.html)
 */
@CdkDslMarker
public class CfnBotSlotTypePropertyDsl {
    private val cdkBuilder: CfnBot.SlotTypeProperty.Builder = CfnBot.SlotTypeProperty.builder()

    private val _slotTypeValues: MutableList<Any> = mutableListOf()

    /**
     * @param description A description of the slot type. Use the description to help identify the
     *   slot type in lists.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param externalSourceSetting Sets the type of external information used to create the slot
     *   type.
     */
    public fun externalSourceSetting(externalSourceSetting: IResolvable) {
        cdkBuilder.externalSourceSetting(externalSourceSetting)
    }

    /**
     * @param externalSourceSetting Sets the type of external information used to create the slot
     *   type.
     */
    public fun externalSourceSetting(externalSourceSetting: CfnBot.ExternalSourceSettingProperty) {
        cdkBuilder.externalSourceSetting(externalSourceSetting)
    }

    /**
     * @param name The name of the slot type. A slot type name must be unique withing the account.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param parentSlotTypeSignature The built-in slot type used as a parent of this slot type.
     *   When you define a parent slot type, the new slot type has the configuration of the parent
     *   lot type.
     *
     * Only `AMAZON.AlphaNumeric` is supported.
     */
    public fun parentSlotTypeSignature(parentSlotTypeSignature: String) {
        cdkBuilder.parentSlotTypeSignature(parentSlotTypeSignature)
    }

    /**
     * @param slotTypeValues A list of SlotTypeValue objects that defines the values that the slot
     *   type can take. Each value can have a list of synonyms, additional values that help train
     *   the machine learning model about the values that it resolves for the slot.
     */
    public fun slotTypeValues(vararg slotTypeValues: Any) {
        _slotTypeValues.addAll(listOf(*slotTypeValues))
    }

    /**
     * @param slotTypeValues A list of SlotTypeValue objects that defines the values that the slot
     *   type can take. Each value can have a list of synonyms, additional values that help train
     *   the machine learning model about the values that it resolves for the slot.
     */
    public fun slotTypeValues(slotTypeValues: Collection<Any>) {
        _slotTypeValues.addAll(slotTypeValues)
    }

    /**
     * @param slotTypeValues A list of SlotTypeValue objects that defines the values that the slot
     *   type can take. Each value can have a list of synonyms, additional values that help train
     *   the machine learning model about the values that it resolves for the slot.
     */
    public fun slotTypeValues(slotTypeValues: IResolvable) {
        cdkBuilder.slotTypeValues(slotTypeValues)
    }

    /**
     * @param valueSelectionSetting Determines the slot resolution strategy that Amazon Lex uses to
     *   return slot type values. The field can be set to one of the following values:
     * * `ORIGINAL_VALUE` - Returns the value entered by the user, if the user value is similar to
     *   the slot value.
     * * `TOP_RESOLUTION` - If there is a resolution list for the slot, return the first value in
     *   the resolution list as the slot type value. If there is no resolution list, null is
     *   returned.
     *
     * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
     */
    public fun valueSelectionSetting(valueSelectionSetting: IResolvable) {
        cdkBuilder.valueSelectionSetting(valueSelectionSetting)
    }

    /**
     * @param valueSelectionSetting Determines the slot resolution strategy that Amazon Lex uses to
     *   return slot type values. The field can be set to one of the following values:
     * * `ORIGINAL_VALUE` - Returns the value entered by the user, if the user value is similar to
     *   the slot value.
     * * `TOP_RESOLUTION` - If there is a resolution list for the slot, return the first value in
     *   the resolution list as the slot type value. If there is no resolution list, null is
     *   returned.
     *
     * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
     */
    public fun valueSelectionSetting(
        valueSelectionSetting: CfnBot.SlotValueSelectionSettingProperty
    ) {
        cdkBuilder.valueSelectionSetting(valueSelectionSetting)
    }

    public fun build(): CfnBot.SlotTypeProperty {
        if (_slotTypeValues.isNotEmpty()) cdkBuilder.slotTypeValues(_slotTypeValues)
        return cdkBuilder.build()
    }
}
