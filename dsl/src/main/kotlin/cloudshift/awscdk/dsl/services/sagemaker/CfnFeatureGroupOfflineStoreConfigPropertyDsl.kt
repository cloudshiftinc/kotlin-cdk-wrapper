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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnFeatureGroupOfflineStoreConfigPropertyDsl {
    private val cdkBuilder: CfnFeatureGroup.OfflineStoreConfigProperty.Builder =
        CfnFeatureGroup.OfflineStoreConfigProperty.builder()

    public fun dataCatalogConfig(dataCatalogConfig: IResolvable) {
        cdkBuilder.dataCatalogConfig(dataCatalogConfig)
    }

    public fun dataCatalogConfig(dataCatalogConfig: CfnFeatureGroup.DataCatalogConfigProperty) {
        cdkBuilder.dataCatalogConfig(dataCatalogConfig)
    }

    public fun disableGlueTableCreation(disableGlueTableCreation: Boolean) {
        cdkBuilder.disableGlueTableCreation(disableGlueTableCreation)
    }

    public fun disableGlueTableCreation(disableGlueTableCreation: IResolvable) {
        cdkBuilder.disableGlueTableCreation(disableGlueTableCreation)
    }

    public fun s3StorageConfig(s3StorageConfig: IResolvable) {
        cdkBuilder.s3StorageConfig(s3StorageConfig)
    }

    public fun s3StorageConfig(s3StorageConfig: CfnFeatureGroup.S3StorageConfigProperty) {
        cdkBuilder.s3StorageConfig(s3StorageConfig)
    }

    public fun tableFormat(tableFormat: String) {
        cdkBuilder.tableFormat(tableFormat)
    }

    public fun build(): CfnFeatureGroup.OfflineStoreConfigProperty = cdkBuilder.build()
}
