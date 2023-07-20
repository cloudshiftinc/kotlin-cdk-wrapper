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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBotAliasConversationLogSettingsPropertyDsl {
    private val cdkBuilder: CfnBotAlias.ConversationLogSettingsProperty.Builder =
        CfnBotAlias.ConversationLogSettingsProperty.builder()

    private val _audioLogSettings: MutableList<Any> = mutableListOf()

    private val _textLogSettings: MutableList<Any> = mutableListOf()

    public fun audioLogSettings(vararg audioLogSettings: Any) {
        _audioLogSettings.addAll(listOf(*audioLogSettings))
    }

    public fun audioLogSettings(audioLogSettings: Collection<Any>) {
        _audioLogSettings.addAll(audioLogSettings)
    }

    public fun audioLogSettings(audioLogSettings: IResolvable) {
        cdkBuilder.audioLogSettings(audioLogSettings)
    }

    public fun textLogSettings(vararg textLogSettings: Any) {
        _textLogSettings.addAll(listOf(*textLogSettings))
    }

    public fun textLogSettings(textLogSettings: Collection<Any>) {
        _textLogSettings.addAll(textLogSettings)
    }

    public fun textLogSettings(textLogSettings: IResolvable) {
        cdkBuilder.textLogSettings(textLogSettings)
    }

    public fun build(): CfnBotAlias.ConversationLogSettingsProperty {
        if (_audioLogSettings.isNotEmpty()) cdkBuilder.audioLogSettings(_audioLogSettings)
        if (_textLogSettings.isNotEmpty()) cdkBuilder.textLogSettings(_textLogSettings)
        return cdkBuilder.build()
    }
}
