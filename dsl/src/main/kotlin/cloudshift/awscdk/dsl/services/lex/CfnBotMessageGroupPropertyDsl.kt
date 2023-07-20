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
public class CfnBotMessageGroupPropertyDsl {
    private val cdkBuilder: CfnBot.MessageGroupProperty.Builder =
        CfnBot.MessageGroupProperty.builder()

    private val _variations: MutableList<Any> = mutableListOf()

    public fun message(message: IResolvable) {
        cdkBuilder.message(message)
    }

    public fun message(message: CfnBot.MessageProperty) {
        cdkBuilder.message(message)
    }

    public fun variations(vararg variations: Any) {
        _variations.addAll(listOf(*variations))
    }

    public fun variations(variations: Collection<Any>) {
        _variations.addAll(variations)
    }

    public fun variations(variations: IResolvable) {
        cdkBuilder.variations(variations)
    }

    public fun build(): CfnBot.MessageGroupProperty {
        if (_variations.isNotEmpty()) cdkBuilder.variations(_variations)
        return cdkBuilder.build()
    }
}
