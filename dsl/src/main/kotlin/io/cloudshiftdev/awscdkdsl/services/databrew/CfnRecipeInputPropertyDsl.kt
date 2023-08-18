@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRecipe

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * InputProperty inputProperty = InputProperty.builder()
 * .dataCatalogInputDefinition(DataCatalogInputDefinitionProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .tempDirectory(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .key("key")
 * .build())
 * .build())
 * .s3InputDefinition(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .key("key")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-input.html)
 */
@CdkDslMarker
public class CfnRecipeInputPropertyDsl {
    private val cdkBuilder: CfnRecipe.InputProperty.Builder = CfnRecipe.InputProperty.builder()

    /** @param dataCatalogInputDefinition the value to be set. */
    public fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition)
    }

    /** @param dataCatalogInputDefinition the value to be set. */
    public fun dataCatalogInputDefinition(
        dataCatalogInputDefinition: CfnRecipe.DataCatalogInputDefinitionProperty
    ) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition)
    }

    /** @param s3InputDefinition the value to be set. */
    public fun s3InputDefinition(s3InputDefinition: IResolvable) {
        cdkBuilder.s3InputDefinition(s3InputDefinition)
    }

    /** @param s3InputDefinition the value to be set. */
    public fun s3InputDefinition(s3InputDefinition: CfnRecipe.S3LocationProperty) {
        cdkBuilder.s3InputDefinition(s3InputDefinition)
    }

    public fun build(): CfnRecipe.InputProperty = cdkBuilder.build()
}
