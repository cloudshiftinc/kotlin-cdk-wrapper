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

@CdkDslMarker
public class CfnDatasetInputPropertyDsl {
    private val cdkBuilder: CfnDataset.InputProperty.Builder = CfnDataset.InputProperty.builder()

    public fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition)
    }

    public fun dataCatalogInputDefinition(dataCatalogInputDefinition: CfnDataset.DataCatalogInputDefinitionProperty) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition)
    }

    public fun databaseInputDefinition(databaseInputDefinition: IResolvable) {
        cdkBuilder.databaseInputDefinition(databaseInputDefinition)
    }

    public fun databaseInputDefinition(databaseInputDefinition: CfnDataset.DatabaseInputDefinitionProperty) {
        cdkBuilder.databaseInputDefinition(databaseInputDefinition)
    }

    public fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata)
    }

    public fun metadata(metadata: CfnDataset.MetadataProperty) {
        cdkBuilder.metadata(metadata)
    }

    public fun s3InputDefinition(s3InputDefinition: IResolvable) {
        cdkBuilder.s3InputDefinition(s3InputDefinition)
    }

    public fun s3InputDefinition(s3InputDefinition: CfnDataset.S3LocationProperty) {
        cdkBuilder.s3InputDefinition(s3InputDefinition)
    }

    public fun build(): CfnDataset.InputProperty = cdkBuilder.build()
}
