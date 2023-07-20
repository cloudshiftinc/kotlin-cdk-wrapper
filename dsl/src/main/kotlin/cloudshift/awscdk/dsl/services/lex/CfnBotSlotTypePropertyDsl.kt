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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBotSlotTypePropertyDsl {
    private val cdkBuilder: CfnBot.SlotTypeProperty.Builder = CfnBot.SlotTypeProperty.builder()

    private val _slotTypeValues: MutableList<Any> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun externalSourceSetting(externalSourceSetting: IResolvable) {
        cdkBuilder.externalSourceSetting(externalSourceSetting)
    }

    public fun externalSourceSetting(externalSourceSetting: CfnBot.ExternalSourceSettingProperty) {
        cdkBuilder.externalSourceSetting(externalSourceSetting)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun parentSlotTypeSignature(parentSlotTypeSignature: String) {
        cdkBuilder.parentSlotTypeSignature(parentSlotTypeSignature)
    }

    public fun slotTypeValues(vararg slotTypeValues: Any) {
        _slotTypeValues.addAll(listOf(*slotTypeValues))
    }

    public fun slotTypeValues(slotTypeValues: Collection<Any>) {
        _slotTypeValues.addAll(slotTypeValues)
    }

    public fun slotTypeValues(slotTypeValues: IResolvable) {
        cdkBuilder.slotTypeValues(slotTypeValues)
    }

    public fun valueSelectionSetting(valueSelectionSetting: IResolvable) {
        cdkBuilder.valueSelectionSetting(valueSelectionSetting)
    }

    public fun valueSelectionSetting(valueSelectionSetting: CfnBot.SlotValueSelectionSettingProperty) {
        cdkBuilder.valueSelectionSetting(valueSelectionSetting)
    }

    public fun build(): CfnBot.SlotTypeProperty {
        if (_slotTypeValues.isNotEmpty()) cdkBuilder.slotTypeValues(_slotTypeValues)
        return cdkBuilder.build()
    }
}
