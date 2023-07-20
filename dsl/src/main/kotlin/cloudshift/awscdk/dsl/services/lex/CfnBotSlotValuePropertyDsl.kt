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
public class CfnBotSlotValuePropertyDsl {
    private val cdkBuilder: CfnBot.SlotValueProperty.Builder = CfnBot.SlotValueProperty.builder()

    public fun interpretedValue(interpretedValue: String) {
        cdkBuilder.interpretedValue(interpretedValue)
    }

    public fun build(): CfnBot.SlotValueProperty = cdkBuilder.build()
}
