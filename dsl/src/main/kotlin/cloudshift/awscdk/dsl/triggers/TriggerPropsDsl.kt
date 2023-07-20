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

package cloudshift.awscdk.dsl.triggers

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.triggers.InvocationType
import software.amazon.awscdk.triggers.TriggerProps
import software.constructs.Construct
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class TriggerPropsDsl {
    private val cdkBuilder: TriggerProps.Builder = TriggerProps.builder()

    private val _executeAfter: MutableList<Construct> = mutableListOf()

    private val _executeBefore: MutableList<Construct> = mutableListOf()

    public fun executeAfter(vararg executeAfter: Construct) {
        _executeAfter.addAll(listOf(*executeAfter))
    }

    public fun executeAfter(executeAfter: Collection<Construct>) {
        _executeAfter.addAll(executeAfter)
    }

    public fun executeBefore(vararg executeBefore: Construct) {
        _executeBefore.addAll(listOf(*executeBefore))
    }

    public fun executeBefore(executeBefore: Collection<Construct>) {
        _executeBefore.addAll(executeBefore)
    }

    public fun executeOnHandlerChange(executeOnHandlerChange: Boolean) {
        cdkBuilder.executeOnHandlerChange(executeOnHandlerChange)
    }

    public fun handler(handler: Function) {
        cdkBuilder.handler(handler)
    }

    public fun invocationType(invocationType: InvocationType) {
        cdkBuilder.invocationType(invocationType)
    }

    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): TriggerProps {
        if (_executeAfter.isNotEmpty()) cdkBuilder.executeAfter(_executeAfter)
        if (_executeBefore.isNotEmpty()) cdkBuilder.executeBefore(_executeBefore)
        return cdkBuilder.build()
    }
}
