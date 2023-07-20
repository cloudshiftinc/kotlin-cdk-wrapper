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
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBotSlotTypeValuePropertyDsl {
    private val cdkBuilder: CfnBot.SlotTypeValueProperty.Builder =
        CfnBot.SlotTypeValueProperty.builder()

    private val _synonyms: MutableList<Any> = mutableListOf()

    public fun sampleValue(sampleValue: IResolvable) {
        cdkBuilder.sampleValue(sampleValue)
    }

    public fun sampleValue(sampleValue: CfnBot.SampleValueProperty) {
        cdkBuilder.sampleValue(sampleValue)
    }

    public fun synonyms(vararg synonyms: Any) {
        _synonyms.addAll(listOf(*synonyms))
    }

    public fun synonyms(synonyms: Collection<Any>) {
        _synonyms.addAll(synonyms)
    }

    public fun synonyms(synonyms: IResolvable) {
        cdkBuilder.synonyms(synonyms)
    }

    public fun build(): CfnBot.SlotTypeValueProperty {
        if (_synonyms.isNotEmpty()) cdkBuilder.synonyms(_synonyms)
        return cdkBuilder.build()
    }
}
