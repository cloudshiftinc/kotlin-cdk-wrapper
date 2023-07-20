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
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnJobDataCatalogOutputPropertyDsl {
    private val cdkBuilder: CfnJob.DataCatalogOutputProperty.Builder =
        CfnJob.DataCatalogOutputProperty.builder()

    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun databaseOptions(databaseOptions: IResolvable) {
        cdkBuilder.databaseOptions(databaseOptions)
    }

    public fun databaseOptions(databaseOptions: CfnJob.DatabaseTableOutputOptionsProperty) {
        cdkBuilder.databaseOptions(databaseOptions)
    }

    public fun overwrite(overwrite: Boolean) {
        cdkBuilder.overwrite(overwrite)
    }

    public fun overwrite(overwrite: IResolvable) {
        cdkBuilder.overwrite(overwrite)
    }

    public fun s3Options(s3Options: IResolvable) {
        cdkBuilder.s3Options(s3Options)
    }

    public fun s3Options(s3Options: CfnJob.S3TableOutputOptionsProperty) {
        cdkBuilder.s3Options(s3Options)
    }

    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun build(): CfnJob.DataCatalogOutputProperty = cdkBuilder.build()
}
