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
 * Describes a button to use on a response card used to gather slot values from a user.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * ButtonProperty buttonProperty = ButtonProperty.builder()
 * .text("text")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-button.html)
 */
@CdkDslMarker
public class CfnBotButtonPropertyDsl {
    private val cdkBuilder: CfnBot.ButtonProperty.Builder = CfnBot.ButtonProperty.builder()

    /**
     * @param text The text that appears on the button. Use this to tell the user what value is
     *   returned when they choose this button.
     */
    public fun text(text: String) {
        cdkBuilder.text(text)
    }

    /**
     * @param value The value returned to Amazon Lex when the user chooses this button. This must be
     *   one of the slot values configured for the slot.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnBot.ButtonProperty = cdkBuilder.build()
}
