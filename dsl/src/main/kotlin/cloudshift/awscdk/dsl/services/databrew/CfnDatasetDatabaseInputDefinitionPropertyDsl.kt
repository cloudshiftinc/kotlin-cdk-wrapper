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
import software.amazon.awscdk.services.databrew.CfnDataset
import kotlin.String

@CdkDslMarker
public class CfnDatasetDatabaseInputDefinitionPropertyDsl {
    private val cdkBuilder: CfnDataset.DatabaseInputDefinitionProperty.Builder =
        CfnDataset.DatabaseInputDefinitionProperty.builder()

    public fun databaseTableName(databaseTableName: String) {
        cdkBuilder.databaseTableName(databaseTableName)
    }

    public fun glueConnectionName(glueConnectionName: String) {
        cdkBuilder.glueConnectionName(glueConnectionName)
    }

    public fun queryString(queryString: String) {
        cdkBuilder.queryString(queryString)
    }

    public fun tempDirectory(tempDirectory: IResolvable) {
        cdkBuilder.tempDirectory(tempDirectory)
    }

    public fun tempDirectory(tempDirectory: CfnDataset.S3LocationProperty) {
        cdkBuilder.tempDirectory(tempDirectory)
    }

    public fun build(): CfnDataset.DatabaseInputDefinitionProperty = cdkBuilder.build()
}
