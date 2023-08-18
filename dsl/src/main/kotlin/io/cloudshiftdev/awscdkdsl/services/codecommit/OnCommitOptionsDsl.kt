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

package io.cloudshiftdev.awscdkdsl.services.codecommit

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.events.EventPatternDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codecommit.OnCommitOptions
import software.amazon.awscdk.services.events.EventPattern
import software.amazon.awscdk.services.events.IRuleTarget
import software.constructs.Construct

/**
 * Options for the onCommit() method.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.codecommit.*;
 * import software.amazon.awscdk.services.events.targets.*;
 * Repository repo;
 * Topic myTopic = new Topic(this, "Topic");
 * repo.onCommit("OnCommit", OnCommitOptions.builder()
 * .target(new SnsTopic(myTopic))
 * .build());
 * ```
 */
@CdkDslMarker
public class OnCommitOptionsDsl {
    private val cdkBuilder: OnCommitOptions.Builder = OnCommitOptions.builder()

    private val _branches: MutableList<String> = mutableListOf()

    /** @param branches The branch to monitor. */
    public fun branches(vararg branches: String) {
        _branches.addAll(listOf(*branches))
    }

    /** @param branches The branch to monitor. */
    public fun branches(branches: Collection<String>) {
        _branches.addAll(branches)
    }

    /**
     * @param crossStackScope The scope to use if the source of the rule and its target are in
     *   different Stacks (but in the same account &amp; region). This helps dealing with cycles
     *   that often arise in these situations.
     */
    public fun crossStackScope(crossStackScope: Construct) {
        cdkBuilder.crossStackScope(crossStackScope)
    }

    /** @param description A description of the rule's purpose. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param eventPattern Additional restrictions for the event to route to the specified target.
     *   The method that generates the rule probably imposes some type of event filtering. The
     *   filtering implied by what you pass here is added on top of that filtering.
     */
    public fun eventPattern(eventPattern: EventPatternDsl.() -> Unit = {}) {
        val builder = EventPatternDsl()
        builder.apply(eventPattern)
        cdkBuilder.eventPattern(builder.build())
    }

    /**
     * @param eventPattern Additional restrictions for the event to route to the specified target.
     *   The method that generates the rule probably imposes some type of event filtering. The
     *   filtering implied by what you pass here is added on top of that filtering.
     */
    public fun eventPattern(eventPattern: EventPattern) {
        cdkBuilder.eventPattern(eventPattern)
    }

    /** @param ruleName A name for the rule. */
    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    /** @param target The target to register for the event. */
    public fun target(target: IRuleTarget) {
        cdkBuilder.target(target)
    }

    public fun build(): OnCommitOptions {
        if (_branches.isNotEmpty()) cdkBuilder.branches(_branches)
        return cdkBuilder.build()
    }
}
