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
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions
import kotlin.String

@CdkDslMarker
public class CfnPrincipalPermissionsDatabaseResourcePropertyDsl {
    private val cdkBuilder: CfnPrincipalPermissions.DatabaseResourceProperty.Builder =
        CfnPrincipalPermissions.DatabaseResourceProperty.builder()

    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnPrincipalPermissions.DatabaseResourceProperty = cdkBuilder.build()
}
