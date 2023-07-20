@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBotAlias
import kotlin.Boolean

@CdkDslMarker
public class CfnBotAliasBotAliasLocaleSettingsPropertyDsl {
    private val cdkBuilder: CfnBotAlias.BotAliasLocaleSettingsProperty.Builder =
        CfnBotAlias.BotAliasLocaleSettingsProperty.builder()

    public fun codeHookSpecification(codeHookSpecification: IResolvable) {
        cdkBuilder.codeHookSpecification(codeHookSpecification)
    }

    public fun codeHookSpecification(codeHookSpecification: CfnBotAlias.CodeHookSpecificationProperty) {
        cdkBuilder.codeHookSpecification(codeHookSpecification)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnBotAlias.BotAliasLocaleSettingsProperty = cdkBuilder.build()
}
