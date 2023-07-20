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
public class CfnBotObfuscationSettingPropertyDsl {
    private val cdkBuilder: CfnBot.ObfuscationSettingProperty.Builder =
        CfnBot.ObfuscationSettingProperty.builder()

    public fun obfuscationSettingType(obfuscationSettingType: String) {
        cdkBuilder.obfuscationSettingType(obfuscationSettingType)
    }

    public fun build(): CfnBot.ObfuscationSettingProperty = cdkBuilder.build()
}
