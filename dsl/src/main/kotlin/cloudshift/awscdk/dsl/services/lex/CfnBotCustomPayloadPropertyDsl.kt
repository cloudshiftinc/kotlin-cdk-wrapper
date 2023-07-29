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
 * A custom response string that Amazon Lex sends to your application.
 *
 * You define the content and structure the string.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * CustomPayloadProperty customPayloadProperty = CustomPayloadProperty.builder()
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-custompayload.html)
 */
@CdkDslMarker
public class CfnBotCustomPayloadPropertyDsl {
    private val cdkBuilder: CfnBot.CustomPayloadProperty.Builder =
        CfnBot.CustomPayloadProperty.builder()

    /** @param value The string that is sent to your application. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnBot.CustomPayloadProperty = cdkBuilder.build()
}
