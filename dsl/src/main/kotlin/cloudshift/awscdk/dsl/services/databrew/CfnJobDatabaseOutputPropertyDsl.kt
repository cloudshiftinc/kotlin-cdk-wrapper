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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob
import kotlin.String

@CdkDslMarker
public class CfnJobDatabaseOutputPropertyDsl {
    private val cdkBuilder: CfnJob.DatabaseOutputProperty.Builder =
        CfnJob.DatabaseOutputProperty.builder()

    public fun databaseOptions(databaseOptions: IResolvable) {
        cdkBuilder.databaseOptions(databaseOptions)
    }

    public fun databaseOptions(databaseOptions: CfnJob.DatabaseTableOutputOptionsProperty) {
        cdkBuilder.databaseOptions(databaseOptions)
    }

    public fun databaseOutputMode(databaseOutputMode: String) {
        cdkBuilder.databaseOutputMode(databaseOutputMode)
    }

    public fun glueConnectionName(glueConnectionName: String) {
        cdkBuilder.glueConnectionName(glueConnectionName)
    }

    public fun build(): CfnJob.DatabaseOutputProperty = cdkBuilder.build()
}
