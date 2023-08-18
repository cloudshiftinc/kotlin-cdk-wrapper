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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Specifies the definition of a slot.
 *
 * Amazon Lex elicits slot values from uses to fulfill the user's intent.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slot.html)
 */
@CdkDslMarker
public class CfnBotSlotPropertyDsl {
    private val cdkBuilder: CfnBot.SlotProperty.Builder = CfnBot.SlotProperty.builder()

    /** @param description The description of the slot. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param multipleValuesSetting Indicates whether a slot can return multiple values. */
    public fun multipleValuesSetting(multipleValuesSetting: IResolvable) {
        cdkBuilder.multipleValuesSetting(multipleValuesSetting)
    }

    /** @param multipleValuesSetting Indicates whether a slot can return multiple values. */
    public fun multipleValuesSetting(multipleValuesSetting: CfnBot.MultipleValuesSettingProperty) {
        cdkBuilder.multipleValuesSetting(multipleValuesSetting)
    }

    /** @param name The name given to the slot. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param obfuscationSetting Determines whether the contents of the slot are obfuscated in
     *   Amazon CloudWatch Logs logs. Use obfuscated slots to protect information such as personally
     *   identifiable information (PII) in logs.
     */
    public fun obfuscationSetting(obfuscationSetting: IResolvable) {
        cdkBuilder.obfuscationSetting(obfuscationSetting)
    }

    /**
     * @param obfuscationSetting Determines whether the contents of the slot are obfuscated in
     *   Amazon CloudWatch Logs logs. Use obfuscated slots to protect information such as personally
     *   identifiable information (PII) in logs.
     */
    public fun obfuscationSetting(obfuscationSetting: CfnBot.ObfuscationSettingProperty) {
        cdkBuilder.obfuscationSetting(obfuscationSetting)
    }

    /**
     * @param slotTypeName The name of the slot type that this slot is based on. The slot type
     *   defines the acceptable values for the slot.
     */
    public fun slotTypeName(slotTypeName: String) {
        cdkBuilder.slotTypeName(slotTypeName)
    }

    /**
     * @param valueElicitationSetting Determines the slot resolution strategy that Amazon Lex uses
     *   to return slot type values. The field can be set to one of the following values:
     * * ORIGINAL_VALUE - Returns the value entered by the user, if the user value is similar to a
     *   slot value.
     * * TOP_RESOLUTION - If there is a resolution list for the slot, return the first value in the
     *   resolution list as the slot type value. If there is no resolution list, null is returned.
     *
     * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
     */
    public fun valueElicitationSetting(valueElicitationSetting: IResolvable) {
        cdkBuilder.valueElicitationSetting(valueElicitationSetting)
    }

    /**
     * @param valueElicitationSetting Determines the slot resolution strategy that Amazon Lex uses
     *   to return slot type values. The field can be set to one of the following values:
     * * ORIGINAL_VALUE - Returns the value entered by the user, if the user value is similar to a
     *   slot value.
     * * TOP_RESOLUTION - If there is a resolution list for the slot, return the first value in the
     *   resolution list as the slot type value. If there is no resolution list, null is returned.
     *
     * If you don't specify the `valueSelectionStrategy` , the default is `ORIGINAL_VALUE` .
     */
    public fun valueElicitationSetting(
        valueElicitationSetting: CfnBot.SlotValueElicitationSettingProperty
    ) {
        cdkBuilder.valueElicitationSetting(valueElicitationSetting)
    }

    public fun build(): CfnBot.SlotProperty = cdkBuilder.build()
}
