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
import software.amazon.awscdk.services.lakeformation.CfnPermissions
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPermissionsDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPermissions.Builder = CfnPermissions.Builder.create(scope, id)

    private val _permissions: MutableList<String> = mutableListOf()

    private val _permissionsWithGrantOption: MutableList<String> = mutableListOf()

    public fun dataLakePrincipal(dataLakePrincipal: IResolvable) {
        cdkBuilder.dataLakePrincipal(dataLakePrincipal)
    }

    public fun dataLakePrincipal(dataLakePrincipal: CfnPermissions.DataLakePrincipalProperty) {
        cdkBuilder.dataLakePrincipal(dataLakePrincipal)
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

    public fun resource(resource: IResolvable) {
        cdkBuilder.resource(resource)
    }

    public fun resource(resource: CfnPermissions.ResourceProperty) {
        cdkBuilder.resource(resource)
    }

    public fun build(): CfnPermissions {
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        if (_permissionsWithGrantOption.isNotEmpty()) {
            cdkBuilder.permissionsWithGrantOption(_permissionsWithGrantOption)
        }
        return cdkBuilder.build()
    }
}
