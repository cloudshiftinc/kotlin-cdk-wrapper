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
public class CfnBotSlotValueRegexFilterPropertyDsl {
    private val cdkBuilder: CfnBot.SlotValueRegexFilterProperty.Builder =
        CfnBot.SlotValueRegexFilterProperty.builder()

    public fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
    }

    public fun build(): CfnBot.SlotValueRegexFilterProperty = cdkBuilder.build()
}
