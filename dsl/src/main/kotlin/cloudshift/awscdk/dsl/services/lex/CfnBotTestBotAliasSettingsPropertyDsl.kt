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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBotTestBotAliasSettingsPropertyDsl {
    private val cdkBuilder: CfnBot.TestBotAliasSettingsProperty.Builder =
        CfnBot.TestBotAliasSettingsProperty.builder()

    private val _botAliasLocaleSettings: MutableList<Any> = mutableListOf()

    public fun botAliasLocaleSettings(vararg botAliasLocaleSettings: Any) {
        _botAliasLocaleSettings.addAll(listOf(*botAliasLocaleSettings))
    }

    public fun botAliasLocaleSettings(botAliasLocaleSettings: Collection<Any>) {
        _botAliasLocaleSettings.addAll(botAliasLocaleSettings)
    }

    public fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable) {
        cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings)
    }

    public fun conversationLogSettings(conversationLogSettings: IResolvable) {
        cdkBuilder.conversationLogSettings(conversationLogSettings)
    }

    public fun conversationLogSettings(conversationLogSettings: CfnBot.ConversationLogSettingsProperty) {
        cdkBuilder.conversationLogSettings(conversationLogSettings)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun sentimentAnalysisSettings(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.sentimentAnalysisSettings(builder.map)
    }

    public fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any) {
        cdkBuilder.sentimentAnalysisSettings(sentimentAnalysisSettings)
    }

    public fun build(): CfnBot.TestBotAliasSettingsProperty {
        if (_botAliasLocaleSettings.isNotEmpty()) {
            cdkBuilder.botAliasLocaleSettings(_botAliasLocaleSettings)
        }
        return cdkBuilder.build()
    }
}
