@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.triggers

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.triggers.TriggerOptions
import software.constructs.Construct
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Options for `Trigger`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.triggers.*;
 * import software.constructs.*;
 * Construct construct;
 * TriggerOptions triggerOptions = TriggerOptions.builder()
 * .executeAfter(List.of(construct))
 * .executeBefore(List.of(construct))
 * .executeOnHandlerChange(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class TriggerOptionsDsl {
    private val cdkBuilder: TriggerOptions.Builder = TriggerOptions.builder()

    private val _executeAfter: MutableList<Construct> = mutableListOf()

    private val _executeBefore: MutableList<Construct> = mutableListOf()

    /**
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these construct
     * scopes have been provisioned.
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     */
    public fun executeAfter(vararg executeAfter: Construct) {
        _executeAfter.addAll(listOf(*executeAfter))
    }

    /**
     * @param executeAfter Adds trigger dependencies. Execute this trigger only after these construct
     * scopes have been provisioned.
     * You can also use `trigger.executeAfter()` to add additional dependencies.
     */
    public fun executeAfter(executeAfter: Collection<Construct>) {
        _executeAfter.addAll(executeAfter)
    }

    /**
     * @param executeBefore Adds this trigger as a dependency on other constructs.
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     */
    public fun executeBefore(vararg executeBefore: Construct) {
        _executeBefore.addAll(listOf(*executeBefore))
    }

    /**
     * @param executeBefore Adds this trigger as a dependency on other constructs.
     * This means that this
     * trigger will get executed *before* the given construct(s).
     *
     * You can also use `trigger.executeBefore()` to add additional dependants.
     */
    public fun executeBefore(executeBefore: Collection<Construct>) {
        _executeBefore.addAll(executeBefore)
    }

    /**
     * @param executeOnHandlerChange Re-executes the trigger every time the handler changes.
     * This implies that the trigger is associated with the `currentVersion` of
     * the handler, which gets recreated every time the handler or its
     * configuration is updated.
     */
    public fun executeOnHandlerChange(executeOnHandlerChange: Boolean) {
        cdkBuilder.executeOnHandlerChange(executeOnHandlerChange)
    }

    public fun build(): TriggerOptions {
        if (_executeAfter.isNotEmpty()) cdkBuilder.executeAfter(_executeAfter)
        if (_executeBefore.isNotEmpty()) cdkBuilder.executeBefore(_executeBefore)
        return cdkBuilder.build()
    }
}
