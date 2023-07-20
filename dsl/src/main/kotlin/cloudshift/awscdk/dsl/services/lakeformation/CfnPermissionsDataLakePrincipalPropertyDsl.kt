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
import software.amazon.awscdk.services.lakeformation.CfnPermissions
import kotlin.String

@CdkDslMarker
public class CfnPermissionsDataLakePrincipalPropertyDsl {
    private val cdkBuilder: CfnPermissions.DataLakePrincipalProperty.Builder =
        CfnPermissions.DataLakePrincipalProperty.builder()

    public fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
        cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
    }

    public fun build(): CfnPermissions.DataLakePrincipalProperty = cdkBuilder.build()
}
