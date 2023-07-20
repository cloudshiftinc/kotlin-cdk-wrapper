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
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.events.IRuleTarget
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.events.Schedule
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class RuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Rule.Builder = Rule.Builder.create(scope, id)

    private val _targets: MutableList<IRuleTarget> = mutableListOf()

    public fun crossStackScope(crossStackScope: Construct) {
        cdkBuilder.crossStackScope(crossStackScope)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun eventBus(eventBus: IEventBus) {
        cdkBuilder.eventBus(eventBus)
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

    public fun schedule(schedule: Schedule) {
        cdkBuilder.schedule(schedule)
    }

    public fun targets(vararg targets: IRuleTarget) {
        _targets.addAll(listOf(*targets))
    }

    public fun targets(targets: Collection<IRuleTarget>) {
        _targets.addAll(targets)
    }

    public fun build(): Rule {
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
