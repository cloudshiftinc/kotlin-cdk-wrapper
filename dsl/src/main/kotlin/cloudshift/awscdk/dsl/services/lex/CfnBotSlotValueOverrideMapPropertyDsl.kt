@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Maps a slot name to the
 * [SlotValueOverride](https://docs.aws.amazon.com/lexv2/latest/APIReference/API_SlotValueOverride.html)
 * object.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SlotValueOverrideProperty slotValueOverrideProperty_;
 * SlotValueOverrideMapProperty slotValueOverrideMapProperty =
 * SlotValueOverrideMapProperty.builder()
 * .slotName("slotName")
 * .slotValueOverride(SlotValueOverrideProperty.builder()
 * .shape("shape")
 * .value(SlotValueProperty.builder()
 * .interpretedValue("interpretedValue")
 * .build())
 * .values(List.of(slotValueOverrideProperty_))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-slotvalueoverridemap.html)
 */
@CdkDslMarker
public class CfnBotSlotValueOverrideMapPropertyDsl {
    private val cdkBuilder: CfnBot.SlotValueOverrideMapProperty.Builder =
        CfnBot.SlotValueOverrideMapProperty.builder()

    /** @param slotName The name of the slot. */
    public fun slotName(slotName: String) {
        cdkBuilder.slotName(slotName)
    }

    /**
     * @param slotValueOverride The SlotValueOverride object to which the slot name will be mapped.
     */
    public fun slotValueOverride(slotValueOverride: IResolvable) {
        cdkBuilder.slotValueOverride(slotValueOverride)
    }

    /**
     * @param slotValueOverride The SlotValueOverride object to which the slot name will be mapped.
     */
    public fun slotValueOverride(slotValueOverride: CfnBot.SlotValueOverrideProperty) {
        cdkBuilder.slotValueOverride(slotValueOverride)
    }

    public fun build(): CfnBot.SlotValueOverrideMapProperty = cdkBuilder.build()
}
