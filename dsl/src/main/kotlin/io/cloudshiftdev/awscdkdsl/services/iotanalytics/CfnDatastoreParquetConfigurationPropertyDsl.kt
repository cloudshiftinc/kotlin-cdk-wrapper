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

package io.cloudshiftdev.awscdkdsl.services.iotanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

/**
 * Contains the configuration information of the Parquet format.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * ParquetConfigurationProperty parquetConfigurationProperty =
 * ParquetConfigurationProperty.builder()
 * .schemaDefinition(SchemaDefinitionProperty.builder()
 * .columns(List.of(ColumnProperty.builder()
 * .name("name")
 * .type("type")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-parquetconfiguration.html)
 */
@CdkDslMarker
public class CfnDatastoreParquetConfigurationPropertyDsl {
    private val cdkBuilder: CfnDatastore.ParquetConfigurationProperty.Builder =
        CfnDatastore.ParquetConfigurationProperty.builder()

    /** @param schemaDefinition Information needed to define a schema. */
    public fun schemaDefinition(schemaDefinition: IResolvable) {
        cdkBuilder.schemaDefinition(schemaDefinition)
    }

    /** @param schemaDefinition Information needed to define a schema. */
    public fun schemaDefinition(schemaDefinition: CfnDatastore.SchemaDefinitionProperty) {
        cdkBuilder.schemaDefinition(schemaDefinition)
    }

    public fun build(): CfnDatastore.ParquetConfigurationProperty = cdkBuilder.build()
}
