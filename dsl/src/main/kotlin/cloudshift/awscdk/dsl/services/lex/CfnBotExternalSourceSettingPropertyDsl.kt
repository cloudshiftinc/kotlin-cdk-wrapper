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
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotExternalSourceSettingPropertyDsl {
    private val cdkBuilder: CfnBot.ExternalSourceSettingProperty.Builder =
        CfnBot.ExternalSourceSettingProperty.builder()

    public fun grammarSlotTypeSetting(grammarSlotTypeSetting: IResolvable) {
        cdkBuilder.grammarSlotTypeSetting(grammarSlotTypeSetting)
    }

    public fun grammarSlotTypeSetting(grammarSlotTypeSetting: CfnBot.GrammarSlotTypeSettingProperty) {
        cdkBuilder.grammarSlotTypeSetting(grammarSlotTypeSetting)
    }

    public fun build(): CfnBot.ExternalSourceSettingProperty = cdkBuilder.build()
}
