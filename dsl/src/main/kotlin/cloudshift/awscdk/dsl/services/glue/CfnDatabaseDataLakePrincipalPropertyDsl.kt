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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.glue.CfnDatabase
import kotlin.String

@CdkDslMarker
public class CfnDatabaseDataLakePrincipalPropertyDsl {
    private val cdkBuilder: CfnDatabase.DataLakePrincipalProperty.Builder =
        CfnDatabase.DataLakePrincipalProperty.builder()

    public fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
        cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
    }

    public fun build(): CfnDatabase.DataLakePrincipalProperty = cdkBuilder.build()
}
