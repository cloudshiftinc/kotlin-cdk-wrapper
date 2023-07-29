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
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Settings that determine the Lambda function that Amazon Lex uses for processing user responses.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * DialogCodeHookSettingProperty dialogCodeHookSettingProperty =
 * DialogCodeHookSettingProperty.builder()
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-dialogcodehooksetting.html)
 */
@CdkDslMarker
public class CfnBotDialogCodeHookSettingPropertyDsl {
    private val cdkBuilder: CfnBot.DialogCodeHookSettingProperty.Builder =
        CfnBot.DialogCodeHookSettingProperty.builder()

    /** @param enabled Enables the dialog code hook so that it processes user requests. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Enables the dialog code hook so that it processes user requests. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnBot.DialogCodeHookSettingProperty = cdkBuilder.build()
}
