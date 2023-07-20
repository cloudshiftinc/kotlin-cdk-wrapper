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

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPrincipalPermissionsPropsDsl {
    private val cdkBuilder: CfnPrincipalPermissionsProps.Builder =
        CfnPrincipalPermissionsProps.builder()

    private val _permissions: MutableList<String> = mutableListOf()

    private val _permissionsWithGrantOption: MutableList<String> = mutableListOf()

    public fun catalog(catalog: String) {
        cdkBuilder.catalog(catalog)
    }

    public fun permissions(vararg permissions: String) {
        _permissions.addAll(listOf(*permissions))
    }

    public fun permissions(permissions: Collection<String>) {
        _permissions.addAll(permissions)
    }

    public fun permissionsWithGrantOption(vararg permissionsWithGrantOption: String) {
        _permissionsWithGrantOption.addAll(listOf(*permissionsWithGrantOption))
    }

    public fun permissionsWithGrantOption(permissionsWithGrantOption: Collection<String>) {
        _permissionsWithGrantOption.addAll(permissionsWithGrantOption)
    }

    public fun principal(principal: IResolvable) {
        cdkBuilder.principal(principal)
    }

    public fun principal(principal: CfnPrincipalPermissions.DataLakePrincipalProperty) {
        cdkBuilder.principal(principal)
    }

    public fun resource(resource: IResolvable) {
        cdkBuilder.resource(resource)
    }

    public fun resource(resource: CfnPrincipalPermissions.ResourceProperty) {
        cdkBuilder.resource(resource)
    }

    public fun build(): CfnPrincipalPermissionsProps {
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        if (_permissionsWithGrantOption.isNotEmpty()) {
            cdkBuilder.permissionsWithGrantOption(_permissionsWithGrantOption)
        }
        return cdkBuilder.build()
    }
}
