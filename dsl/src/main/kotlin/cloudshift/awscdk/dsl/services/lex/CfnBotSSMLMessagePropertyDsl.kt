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
 * Defines a Speech Synthesis Markup Language (SSML) prompt.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SSMLMessageProperty sSMLMessageProperty = SSMLMessageProperty.builder()
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-ssmlmessage.html)
 */
@CdkDslMarker
public class CfnBotSSMLMessagePropertyDsl {
    private val cdkBuilder: CfnBot.SSMLMessageProperty.Builder =
        CfnBot.SSMLMessageProperty.builder()

    /** @param value The SSML text that defines the prompt. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnBot.SSMLMessageProperty = cdkBuilder.build()
}
