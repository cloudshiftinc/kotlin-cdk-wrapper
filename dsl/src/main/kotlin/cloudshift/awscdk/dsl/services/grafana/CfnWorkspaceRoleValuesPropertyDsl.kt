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

package cloudshift.awscdk.dsl.services.grafana

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.grafana.CfnWorkspace
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWorkspaceRoleValuesPropertyDsl {
    private val cdkBuilder: CfnWorkspace.RoleValuesProperty.Builder =
        CfnWorkspace.RoleValuesProperty.builder()

    private val _admin: MutableList<String> = mutableListOf()

    private val _editor: MutableList<String> = mutableListOf()

    public fun admin(vararg admin: String) {
        _admin.addAll(listOf(*admin))
    }

    public fun admin(admin: Collection<String>) {
        _admin.addAll(admin)
    }

    public fun editor(vararg editor: String) {
        _editor.addAll(listOf(*editor))
    }

    public fun editor(editor: Collection<String>) {
        _editor.addAll(editor)
    }

    public fun build(): CfnWorkspace.RoleValuesProperty {
        if (_admin.isNotEmpty()) cdkBuilder.admin(_admin)
        if (_editor.isNotEmpty()) cdkBuilder.editor(_editor)
        return cdkBuilder.build()
    }
}
