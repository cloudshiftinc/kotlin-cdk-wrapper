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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDatabase
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnDatabaseDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDatabase.Builder = CfnDatabase.Builder.create(scope, id)

    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    public fun databaseInput(databaseInput: IResolvable) {
        cdkBuilder.databaseInput(databaseInput)
    }

    public fun databaseInput(databaseInput: CfnDatabase.DatabaseInputProperty) {
        cdkBuilder.databaseInput(databaseInput)
    }

    public fun build(): CfnDatabase = cdkBuilder.build()
}
