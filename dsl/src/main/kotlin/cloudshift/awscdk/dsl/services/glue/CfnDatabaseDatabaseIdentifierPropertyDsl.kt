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
public class CfnDatabaseDatabaseIdentifierPropertyDsl {
    private val cdkBuilder: CfnDatabase.DatabaseIdentifierProperty.Builder =
        CfnDatabase.DatabaseIdentifierProperty.builder()

    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun build(): CfnDatabase.DatabaseIdentifierProperty = cdkBuilder.build()
}
