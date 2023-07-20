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
public class CfnBotIntentOverridePropertyDsl {
    private val cdkBuilder: CfnBot.IntentOverrideProperty.Builder =
        CfnBot.IntentOverrideProperty.builder()

    private val _slots: MutableList<Any> = mutableListOf()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun slots(vararg slots: Any) {
        _slots.addAll(listOf(*slots))
    }

    public fun slots(slots: Collection<Any>) {
        _slots.addAll(slots)
    }

    public fun slots(slots: IResolvable) {
        cdkBuilder.slots(slots)
    }

    public fun build(): CfnBot.IntentOverrideProperty {
        if (_slots.isNotEmpty()) cdkBuilder.slots(_slots)
        return cdkBuilder.build()
    }
}
