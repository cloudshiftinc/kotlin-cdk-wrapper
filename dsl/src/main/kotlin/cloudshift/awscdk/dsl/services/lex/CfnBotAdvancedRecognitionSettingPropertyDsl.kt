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
import software.amazon.awscdk.services.lex.CfnBot
import kotlin.String

@CdkDslMarker
public class CfnBotAdvancedRecognitionSettingPropertyDsl {
    private val cdkBuilder: CfnBot.AdvancedRecognitionSettingProperty.Builder =
        CfnBot.AdvancedRecognitionSettingProperty.builder()

    public fun audioRecognitionStrategy(audioRecognitionStrategy: String) {
        cdkBuilder.audioRecognitionStrategy(audioRecognitionStrategy)
    }

    public fun build(): CfnBot.AdvancedRecognitionSettingProperty = cdkBuilder.build()
}
