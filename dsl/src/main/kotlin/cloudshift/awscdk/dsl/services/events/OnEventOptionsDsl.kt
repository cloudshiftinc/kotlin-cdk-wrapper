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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.EventPattern
import software.amazon.awscdk.services.events.IRuleTarget
import software.amazon.awscdk.services.events.OnEventOptions
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class OnEventOptionsDsl {
    private val cdkBuilder: OnEventOptions.Builder = OnEventOptions.builder()

    public fun crossStackScope(crossStackScope: Construct) {
        cdkBuilder.crossStackScope(crossStackScope)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun eventPattern(block: EventPatternDsl.() -> Unit = {}) {
        val builder = EventPatternDsl()
        builder.apply(block)
        cdkBuilder.eventPattern(builder.build())
    }

    public fun eventPattern(eventPattern: EventPattern) {
        cdkBuilder.eventPattern(eventPattern)
    }

    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    public fun target(target: IRuleTarget) {
        cdkBuilder.target(target)
    }

    public fun build(): OnEventOptions = cdkBuilder.build()
}
