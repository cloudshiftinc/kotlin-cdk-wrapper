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

@CdkDslMarker
public class CfnPermissionsResourcePropertyDsl {
    private val cdkBuilder: CfnPermissions.ResourceProperty.Builder =
        CfnPermissions.ResourceProperty.builder()

    public fun dataLocationResource(dataLocationResource: IResolvable) {
        cdkBuilder.dataLocationResource(dataLocationResource)
    }

    public fun dataLocationResource(dataLocationResource: CfnPermissions.DataLocationResourceProperty) {
        cdkBuilder.dataLocationResource(dataLocationResource)
    }

    public fun databaseResource(databaseResource: IResolvable) {
        cdkBuilder.databaseResource(databaseResource)
    }

    public fun databaseResource(databaseResource: CfnPermissions.DatabaseResourceProperty) {
        cdkBuilder.databaseResource(databaseResource)
    }

    public fun tableResource(tableResource: IResolvable) {
        cdkBuilder.tableResource(tableResource)
    }

    public fun tableResource(tableResource: CfnPermissions.TableResourceProperty) {
        cdkBuilder.tableResource(tableResource)
    }

    public fun tableWithColumnsResource(tableWithColumnsResource: IResolvable) {
        cdkBuilder.tableWithColumnsResource(tableWithColumnsResource)
    }

    public fun tableWithColumnsResource(tableWithColumnsResource: CfnPermissions.TableWithColumnsResourceProperty) {
        cdkBuilder.tableWithColumnsResource(tableWithColumnsResource)
    }

    public fun build(): CfnPermissions.ResourceProperty = cdkBuilder.build()
}
