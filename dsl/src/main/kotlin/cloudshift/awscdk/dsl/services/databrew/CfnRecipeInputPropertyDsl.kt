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
import software.amazon.awscdk.services.databrew.CfnRecipe

@CdkDslMarker
public class CfnRecipeInputPropertyDsl {
    private val cdkBuilder: CfnRecipe.InputProperty.Builder = CfnRecipe.InputProperty.builder()

    public fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition)
    }

    public fun dataCatalogInputDefinition(dataCatalogInputDefinition: CfnRecipe.DataCatalogInputDefinitionProperty) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition)
    }

    public fun s3InputDefinition(s3InputDefinition: IResolvable) {
        cdkBuilder.s3InputDefinition(s3InputDefinition)
    }

    public fun s3InputDefinition(s3InputDefinition: CfnRecipe.S3LocationProperty) {
        cdkBuilder.s3InputDefinition(s3InputDefinition)
    }

    public fun build(): CfnRecipe.InputProperty = cdkBuilder.build()
}
