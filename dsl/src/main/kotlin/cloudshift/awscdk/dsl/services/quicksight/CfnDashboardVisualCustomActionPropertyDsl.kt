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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardVisualCustomActionPropertyDsl {
    private val cdkBuilder: CfnDashboard.VisualCustomActionProperty.Builder =
        CfnDashboard.VisualCustomActionProperty.builder()

    private val _actionOperations: MutableList<Any> = mutableListOf()

    public fun actionOperations(vararg actionOperations: Any) {
        _actionOperations.addAll(listOf(*actionOperations))
    }

    public fun actionOperations(actionOperations: Collection<Any>) {
        _actionOperations.addAll(actionOperations)
    }

    public fun actionOperations(actionOperations: IResolvable) {
        cdkBuilder.actionOperations(actionOperations)
    }

    public fun customActionId(customActionId: String) {
        cdkBuilder.customActionId(customActionId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun trigger(trigger: String) {
        cdkBuilder.trigger(trigger)
    }

    public fun build(): CfnDashboard.VisualCustomActionProperty {
        if (_actionOperations.isNotEmpty()) cdkBuilder.actionOperations(_actionOperations)
        return cdkBuilder.build()
    }
}
