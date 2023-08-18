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
 * Sets the priority that Amazon Lex should use when eliciting slot values from a user.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SlotPriorityProperty slotPriorityProperty = SlotPriorityProperty.builder()
 * .priority(123)
 * .slotName("slotName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotpriority.html)
 */
@CdkDslMarker
public class CfnBotSlotPriorityPropertyDsl {
    private val cdkBuilder: CfnBot.SlotPriorityProperty.Builder =
        CfnBot.SlotPriorityProperty.builder()

    /** @param priority The priority that Amazon Lex should apply to the slot. */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /** @param slotName The name of the slot. */
    public fun slotName(slotName: String) {
        cdkBuilder.slotName(slotName)
    }

    public fun build(): CfnBot.SlotPriorityProperty = cdkBuilder.build()
}
