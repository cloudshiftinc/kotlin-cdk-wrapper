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
public class CfnDatabaseFederatedDatabasePropertyDsl {
    private val cdkBuilder: CfnDatabase.FederatedDatabaseProperty.Builder =
        CfnDatabase.FederatedDatabaseProperty.builder()

    public fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
    }

    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    public fun build(): CfnDatabase.FederatedDatabaseProperty = cdkBuilder.build()
}
