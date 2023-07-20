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
import kotlin.String

@CdkDslMarker
public class CfnBotSlotValueOverrideMapPropertyDsl {
    private val cdkBuilder: CfnBot.SlotValueOverrideMapProperty.Builder =
        CfnBot.SlotValueOverrideMapProperty.builder()

    public fun slotName(slotName: String) {
        cdkBuilder.slotName(slotName)
    }

    public fun slotValueOverride(slotValueOverride: IResolvable) {
        cdkBuilder.slotValueOverride(slotValueOverride)
    }

    public fun slotValueOverride(slotValueOverride: CfnBot.SlotValueOverrideProperty) {
        cdkBuilder.slotValueOverride(slotValueOverride)
    }

    public fun build(): CfnBot.SlotValueOverrideMapProperty = cdkBuilder.build()
}
