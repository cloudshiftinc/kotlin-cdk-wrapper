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

package cloudshift.awscdk.dsl.services.grafana

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.grafana.CfnWorkspace

/**
 * This structure defines which groups defined in the SAML assertion attribute are to be mapped to
 * the Grafana `Admin` and `Editor` roles in the workspace.
 *
 * SAML authenticated users not part of `Admin` or `Editor` role groups have `Viewer` permission
 * over the workspace.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.grafana.*;
 * RoleValuesProperty roleValuesProperty = RoleValuesProperty.builder()
 * .admin(List.of("admin"))
 * .editor(List.of("editor"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-grafana-workspace-rolevalues.html)
 */
@CdkDslMarker
public class CfnWorkspaceRoleValuesPropertyDsl {
    private val cdkBuilder: CfnWorkspace.RoleValuesProperty.Builder =
        CfnWorkspace.RoleValuesProperty.builder()

    private val _admin: MutableList<String> = mutableListOf()

    private val _editor: MutableList<String> = mutableListOf()

    /**
     * @param admin A list of groups from the SAML assertion attribute to grant the Grafana `Admin`
     *   role to.
     */
    public fun admin(vararg admin: String) {
        _admin.addAll(listOf(*admin))
    }

    /**
     * @param admin A list of groups from the SAML assertion attribute to grant the Grafana `Admin`
     *   role to.
     */
    public fun admin(admin: Collection<String>) {
        _admin.addAll(admin)
    }

    /**
     * @param editor A list of groups from the SAML assertion attribute to grant the Grafana
     *   `Editor` role to.
     */
    public fun editor(vararg editor: String) {
        _editor.addAll(listOf(*editor))
    }

    /**
     * @param editor A list of groups from the SAML assertion attribute to grant the Grafana
     *   `Editor` role to.
     */
    public fun editor(editor: Collection<String>) {
        _editor.addAll(editor)
    }

    public fun build(): CfnWorkspace.RoleValuesProperty {
        if (_admin.isNotEmpty()) cdkBuilder.admin(_admin)
        if (_editor.isNotEmpty()) cdkBuilder.editor(_editor)
        return cdkBuilder.build()
    }
}
