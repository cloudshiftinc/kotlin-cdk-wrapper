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
import software.amazon.awscdk.services.lex.CfnBot

/**
 * The value to set in a slot.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SlotValueProperty slotValueProperty = SlotValueProperty.builder()
 * .interpretedValue("interpretedValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalue.html)
 */
@CdkDslMarker
public class CfnBotSlotValuePropertyDsl {
    private val cdkBuilder: CfnBot.SlotValueProperty.Builder = CfnBot.SlotValueProperty.builder()

    /**
     * @param interpretedValue The value that Amazon Lex determines for the slot. The actual value
     *   depends on the setting of the value selection strategy for the bot. You can choose to use
     *   the value entered by the user, or you can have Amazon Lex choose the first value in the
     *   `resolvedValues` list.
     */
    public fun interpretedValue(interpretedValue: String) {
        cdkBuilder.interpretedValue(interpretedValue)
    }

    public fun build(): CfnBot.SlotValueProperty = cdkBuilder.build()
}
