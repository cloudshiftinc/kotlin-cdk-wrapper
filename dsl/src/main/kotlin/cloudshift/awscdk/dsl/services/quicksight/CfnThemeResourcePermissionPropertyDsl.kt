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
import software.amazon.awscdk.services.quicksight.CfnTheme
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnThemeResourcePermissionPropertyDsl {
    private val cdkBuilder: CfnTheme.ResourcePermissionProperty.Builder =
        CfnTheme.ResourcePermissionProperty.builder()

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

    public fun build(): CfnTheme.ResourcePermissionProperty {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        return cdkBuilder.build()
    }
}
