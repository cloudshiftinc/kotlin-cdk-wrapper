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
import kotlin.String

@CdkDslMarker
public class CfnBotAliasBotAliasLocaleSettingsItemPropertyDsl {
    private val cdkBuilder: CfnBotAlias.BotAliasLocaleSettingsItemProperty.Builder =
        CfnBotAlias.BotAliasLocaleSettingsItemProperty.builder()

    public fun botAliasLocaleSetting(botAliasLocaleSetting: IResolvable) {
        cdkBuilder.botAliasLocaleSetting(botAliasLocaleSetting)
    }

    public fun botAliasLocaleSetting(botAliasLocaleSetting: CfnBotAlias.BotAliasLocaleSettingsProperty) {
        cdkBuilder.botAliasLocaleSetting(botAliasLocaleSetting)
    }

    public fun localeId(localeId: String) {
        cdkBuilder.localeId(localeId)
    }

    public fun build(): CfnBotAlias.BotAliasLocaleSettingsItemProperty = cdkBuilder.build()
}
