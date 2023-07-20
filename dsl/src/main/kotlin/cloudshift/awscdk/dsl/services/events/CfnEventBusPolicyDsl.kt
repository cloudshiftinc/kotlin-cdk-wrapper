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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnEventBusPolicy
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnEventBusPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEventBusPolicy.Builder = CfnEventBusPolicy.Builder.create(scope, id)

    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    public fun condition(condition: IResolvable) {
        cdkBuilder.condition(condition)
    }

    public fun condition(condition: CfnEventBusPolicy.ConditionProperty) {
        cdkBuilder.condition(condition)
    }

    public fun eventBusName(eventBusName: String) {
        cdkBuilder.eventBusName(eventBusName)
    }

    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    public fun statement(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.statement(builder.map)
    }

    public fun statement(statement: Any) {
        cdkBuilder.statement(statement)
    }

    public fun statementId(statementId: String) {
        cdkBuilder.statementId(statementId)
    }

    public fun build(): CfnEventBusPolicy = cdkBuilder.build()
}
