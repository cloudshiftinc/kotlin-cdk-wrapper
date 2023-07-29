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
 * Specifies the elicitation setting details eliciting a slot.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueelicitationsetting.html)
 */
@CdkDslMarker
public class CfnBotSlotValueElicitationSettingPropertyDsl {
    private val cdkBuilder: CfnBot.SlotValueElicitationSettingProperty.Builder =
        CfnBot.SlotValueElicitationSettingProperty.builder()

    private val _sampleUtterances: MutableList<Any> = mutableListOf()

    /**
     * @param defaultValueSpecification A list of default values for a slot. Default values are used
     *   when Amazon Lex hasn't determined a value for a slot. You can specify default values from
     *   context variables, session attributes, and defined values.
     */
    public fun defaultValueSpecification(defaultValueSpecification: IResolvable) {
        cdkBuilder.defaultValueSpecification(defaultValueSpecification)
    }

    /**
     * @param defaultValueSpecification A list of default values for a slot. Default values are used
     *   when Amazon Lex hasn't determined a value for a slot. You can specify default values from
     *   context variables, session attributes, and defined values.
     */
    public fun defaultValueSpecification(
        defaultValueSpecification: CfnBot.SlotDefaultValueSpecificationProperty
    ) {
        cdkBuilder.defaultValueSpecification(defaultValueSpecification)
    }

    /**
     * @param promptSpecification The prompt that Amazon Lex uses to elicit the slot value from the
     *   user.
     */
    public fun promptSpecification(promptSpecification: IResolvable) {
        cdkBuilder.promptSpecification(promptSpecification)
    }

    /**
     * @param promptSpecification The prompt that Amazon Lex uses to elicit the slot value from the
     *   user.
     */
    public fun promptSpecification(promptSpecification: CfnBot.PromptSpecificationProperty) {
        cdkBuilder.promptSpecification(promptSpecification)
    }

    /**
     * @param sampleUtterances If you know a specific pattern that users might respond to an Amazon
     *   Lex request for a slot value, you can provide those utterances to improve accuracy. This is
     *   optional. In most cases, Amazon Lex is capable of understanding user utterances.
     */
    public fun sampleUtterances(vararg sampleUtterances: Any) {
        _sampleUtterances.addAll(listOf(*sampleUtterances))
    }

    /**
     * @param sampleUtterances If you know a specific pattern that users might respond to an Amazon
     *   Lex request for a slot value, you can provide those utterances to improve accuracy. This is
     *   optional. In most cases, Amazon Lex is capable of understanding user utterances.
     */
    public fun sampleUtterances(sampleUtterances: Collection<Any>) {
        _sampleUtterances.addAll(sampleUtterances)
    }

    /**
     * @param sampleUtterances If you know a specific pattern that users might respond to an Amazon
     *   Lex request for a slot value, you can provide those utterances to improve accuracy. This is
     *   optional. In most cases, Amazon Lex is capable of understanding user utterances.
     */
    public fun sampleUtterances(sampleUtterances: IResolvable) {
        cdkBuilder.sampleUtterances(sampleUtterances)
    }

    /**
     * @param slotCaptureSetting Specifies the settings that Amazon Lex uses when a slot value is
     *   successfully entered by a user.
     */
    public fun slotCaptureSetting(slotCaptureSetting: IResolvable) {
        cdkBuilder.slotCaptureSetting(slotCaptureSetting)
    }

    /**
     * @param slotCaptureSetting Specifies the settings that Amazon Lex uses when a slot value is
     *   successfully entered by a user.
     */
    public fun slotCaptureSetting(slotCaptureSetting: CfnBot.SlotCaptureSettingProperty) {
        cdkBuilder.slotCaptureSetting(slotCaptureSetting)
    }

    /** @param slotConstraint Specifies whether the slot is required or optional. */
    public fun slotConstraint(slotConstraint: String) {
        cdkBuilder.slotConstraint(slotConstraint)
    }

    /**
     * @param waitAndContinueSpecification Specifies the prompts that Amazon Lex uses while a bot is
     *   waiting for customer input.
     */
    public fun waitAndContinueSpecification(waitAndContinueSpecification: IResolvable) {
        cdkBuilder.waitAndContinueSpecification(waitAndContinueSpecification)
    }

    /**
     * @param waitAndContinueSpecification Specifies the prompts that Amazon Lex uses while a bot is
     *   waiting for customer input.
     */
    public fun waitAndContinueSpecification(
        waitAndContinueSpecification: CfnBot.WaitAndContinueSpecificationProperty
    ) {
        cdkBuilder.waitAndContinueSpecification(waitAndContinueSpecification)
    }

    public fun build(): CfnBot.SlotValueElicitationSettingProperty {
        if (_sampleUtterances.isNotEmpty()) cdkBuilder.sampleUtterances(_sampleUtterances)
        return cdkBuilder.build()
    }
}
