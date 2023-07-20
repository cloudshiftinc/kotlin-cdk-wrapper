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
public class CfnBotSlotDefaultValuePropertyDsl {
    private val cdkBuilder: CfnBot.SlotDefaultValueProperty.Builder =
        CfnBot.SlotDefaultValueProperty.builder()

    public fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
    }

    public fun build(): CfnBot.SlotDefaultValueProperty = cdkBuilder.build()
}
