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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardResourcePermissionPropertyDsl {
    private val cdkBuilder: CfnDashboard.ResourcePermissionProperty.Builder =
        CfnDashboard.ResourcePermissionProperty.builder()

    private val _actions: MutableList<String> = mutableListOf()

    public fun actions(vararg actions: String) {
        _actions.addAll(listOf(*actions))
    }

    public fun actions(actions: Collection<String>) {
        _actions.addAll(actions)
    }

    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    public fun resource(resource: String) {
        cdkBuilder.resource(resource)
    }

    public fun build(): CfnDashboard.ResourcePermissionProperty {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        return cdkBuilder.build()
    }
}
