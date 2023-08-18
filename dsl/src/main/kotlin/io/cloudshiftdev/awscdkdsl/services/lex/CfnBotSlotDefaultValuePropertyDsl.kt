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
 * Specifies the default value to use when a user doesn't provide a value for a slot.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SlotDefaultValueProperty slotDefaultValueProperty = SlotDefaultValueProperty.builder()
 * .defaultValue("defaultValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotdefaultvalue.html)
 */
@CdkDslMarker
public class CfnBotSlotDefaultValuePropertyDsl {
    private val cdkBuilder: CfnBot.SlotDefaultValueProperty.Builder =
        CfnBot.SlotDefaultValueProperty.builder()

    /**
     * @param defaultValue The default value to use when a user doesn't provide a value for a slot.
     */
    public fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
    }

    public fun build(): CfnBot.SlotDefaultValueProperty = cdkBuilder.build()
}
