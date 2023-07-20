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
import kotlin.String

@CdkDslMarker
public class CfnPermissionsTableResourcePropertyDsl {
    private val cdkBuilder: CfnPermissions.TableResourceProperty.Builder =
        CfnPermissions.TableResourceProperty.builder()

    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tableWildcard(tableWildcard: IResolvable) {
        cdkBuilder.tableWildcard(tableWildcard)
    }

    public fun tableWildcard(tableWildcard: CfnPermissions.TableWildcardProperty) {
        cdkBuilder.tableWildcard(tableWildcard)
    }

    public fun build(): CfnPermissions.TableResourceProperty = cdkBuilder.build()
}
