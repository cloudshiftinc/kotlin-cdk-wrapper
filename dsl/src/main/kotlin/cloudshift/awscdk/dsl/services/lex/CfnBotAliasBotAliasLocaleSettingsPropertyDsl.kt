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
import software.amazon.awscdk.services.lex.CfnBotAlias

/**
 * Specifies settings that are unique to a locale.
 *
 * For example, you can use different Lambda function depending on the bot's locale.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * BotAliasLocaleSettingsProperty botAliasLocaleSettingsProperty =
 * BotAliasLocaleSettingsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .codeHookSpecification(CodeHookSpecificationProperty.builder()
 * .lambdaCodeHook(LambdaCodeHookProperty.builder()
 * .codeHookInterfaceVersion("codeHookInterfaceVersion")
 * .lambdaArn("lambdaArn")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-botalias-botaliaslocalesettings.html)
 */
@CdkDslMarker
public class CfnBotAliasBotAliasLocaleSettingsPropertyDsl {
    private val cdkBuilder: CfnBotAlias.BotAliasLocaleSettingsProperty.Builder =
        CfnBotAlias.BotAliasLocaleSettingsProperty.builder()

    /**
     * @param codeHookSpecification Specifies the Lambda function that should be used in the locale.
     */
    public fun codeHookSpecification(codeHookSpecification: IResolvable) {
        cdkBuilder.codeHookSpecification(codeHookSpecification)
    }

    /**
     * @param codeHookSpecification Specifies the Lambda function that should be used in the locale.
     */
    public fun codeHookSpecification(
        codeHookSpecification: CfnBotAlias.CodeHookSpecificationProperty
    ) {
        cdkBuilder.codeHookSpecification(codeHookSpecification)
    }

    /**
     * @param enabled Determines whether the locale is enabled for the bot. If the value is `false`
     *   , the locale isn't available for use.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Determines whether the locale is enabled for the bot. If the value is `false`
     *   , the locale isn't available for use.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnBotAlias.BotAliasLocaleSettingsProperty = cdkBuilder.build()
}
